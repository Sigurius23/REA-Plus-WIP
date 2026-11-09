import assert from 'node:assert/strict';
import {execFile} from 'node:child_process';
import {createHash} from 'node:crypto';
import {createRequire} from 'node:module';
import fs from 'node:fs/promises';
import path from 'node:path';
import {fileURLToPath, pathToFileURL} from 'node:url';

const output=path.dirname(fileURLToPath(import.meta.url));
const root=path.resolve(output,'../..');
const pkg=path.join(root,'rea-local');
const require=createRequire(path.join(pkg,'package.json'));
const {Client}=await import(pathToFileURL(require.resolve('@modelcontextprotocol/client')));
const {StdioClientTransport}=await import(pathToFileURL(require.resolve('@modelcontextprotocol/client/stdio')));
const {Ajv2020}=await import(pathToFileURL(require.resolve('ajv/dist/2020.js')));
const {toolContract}=await import(pathToFileURL(path.join(pkg,'dist/contracts/toolContracts.js')));
const {analysisCliErrorEnvelopeSchema,analysisErrorProjectionSchema}=await import(pathToFileURL(path.join(pkg,'dist/contracts/errorSchemas.js')));
const {createVerifierRun,completeVerifierRun}=await import(pathToFileURL(path.join(pkg,'scripts/lib/verifier-run.mjs')));
const fixture=JSON.parse(await fs.readFile(path.join(output,'owned-fixture.json'),'utf8'));
const save=(name,value)=>fs.writeFile(path.join(output,name),JSON.stringify(value,null,2)+'\n');
const digest=async target=>createHash('sha256').update(await fs.readFile(target)).digest('hex');
const cases=[
  {label:'owned-missing',target:fixture.binary,seed:fixture.selected_missing_seed,sha256:fixture.binary_sha256,expected:'ENOENT'},
  {label:'owned-directory',target:fixture.binary,seed:fixture.owned_root,sha256:fixture.binary_sha256,expected:'regular file'},
  {label:'arc-missing',target:'/tmp/rea-extracted-6e261ab1-e59f-429d-aace-fd76dc4aa364/Arc-arm64',seed:fixture.selected_missing_seed,sha256:'6056139d78d9be98d2da8e64b2e7aab7c2946a130df392fa19af39a77963d578',expected:'ENOENT'},
];
const checks=[];
let retainedCatalog;

function canonicalCli(value){
  const projection=analysisErrorProjectionSchema.safeParse(value);
  if(projection.success)return projection.data;
  const envelope=analysisCliErrorEnvelopeSchema.parse(value);
  const {error: _label,...rest}=envelope;
  return analysisErrorProjectionSchema.parse(rest);
}
function verifyError(error,scenario){
  assert.equal(error.code,'configuration_invalid');
  assert.equal(error.retryable,false);
  assert.equal(error.details.settings.length,1);
  assert.equal(error.details.settings[0].setting,'REA_GHIDRA_SEED_FILE');
  assert.ok(error.details.settings[0].constraint.includes(scenario.seed));
  assert.ok(error.message.includes(scenario.expected));
  assert.ok(error.remediation.action.includes('Correct REA_GHIDRA_SEED_FILE'));
  assert.ok(!error.remediation.action.includes('Retry once'));
}

for(const scenario of cases){
  assert.equal(await digest(scenario.target),scenario.sha256);
  const run=createVerifierRun();
  let lineage;
  try{
  const environment={
    PATH:process.env.PATH??'/usr/bin:/bin',
    REA_LOG_LEVEL:'silent',
    REA_PROCESS_RUN_ID:run.run_id,
    GHIDRA_INSTALL_DIR:'/opt/homebrew/Cellar/ghidra/12.1.4/libexec',
    JAVA_HOME:'/opt/homebrew/Cellar/openjdk/27/libexec/openjdk.jdk/Contents/Home',
    REA_GHIDRA_SEED_FILE:scenario.seed,
  };
  const cli=await new Promise(resolve=>execFile(process.execPath,[path.join(pkg,'scripts/rea.mjs'),'inspect',scenario.target,'--provider','ghidra','--json'],{cwd:pkg,env:environment,maxBuffer:2*1024*1024,timeout:60000},(failure,stdout,stderr)=>resolve({exit_code:failure===null?0:failure.code,signal:failure?.signal??null,stdout,stderr})));
  await save(scenario.label+'.cli.json',cli);
  assert.equal(cli.exit_code,1);
  const cliError=canonicalCli(JSON.parse(cli.stdout));
  verifyError(cliError,scenario);
  const transport=new StdioClientTransport({command:process.execPath,args:[path.join(pkg,'scripts/rea.mjs'),'mcp'],env:environment,stderr:'pipe'});
  const mcp=new Client({name:'rea-owned-seed-diagnostics',version:'1'});
  let stderr='';transport.stderr?.on('data',chunk=>{stderr+=chunk.toString();});
  const ajv=new Ajv2020({strict:false,validateFormats:false});
  let mcpError;
  try{
    await mcp.connect(transport);
    const catalog=(await mcp.listTools()).tools;
    if(retainedCatalog===undefined){retainedCatalog=catalog;await save('catalog.json',catalog);}else assert.deepEqual(catalog,retainedCatalog);
    const invoke=async(name,args)=>{
      const advertised=catalog.find(tool=>tool.name===name);assert.ok(advertised);
      assert.ok(ajv.validateSchema(advertised.inputSchema));
      assert.ok(ajv.compile(advertised.inputSchema)(args));
      const reply=await mcp.callTool({name,arguments:args},{timeout:60000});
      await save(scenario.label+'.'+name+'.reply.json',reply);
      if(reply.isError!==true){
        assert.ok(ajv.validateSchema(advertised.outputSchema));
        assert.ok(ajv.compile(advertised.outputSchema)(reply.structuredContent));
        toolContract(name).outputSchema.parse(reply.structuredContent);
        assert.deepEqual(JSON.parse(reply.content.find(item=>item.type==='text').text),reply.structuredContent);
      }
      return reply;
    };
    const reply=await invoke('open_binary',{path:scenario.target,provider_id:'ghidra'});
    assert.equal(reply.isError,true);
    const blocks=reply.content.filter(item=>item.type==='text');assert.equal(blocks.length,1);
    mcpError=analysisErrorProjectionSchema.parse(JSON.parse(blocks[0].text).error);
    verifyError(mcpError,scenario);assert.deepEqual(mcpError,cliError);
    const closed=await invoke('close_binary',{});assert.notEqual(closed.isError,true);
  }finally{
    await mcp.close();await transport.close();
    await fs.writeFile(path.join(output,scenario.label+'.stderr.log'),stderr);
    lineage=await completeVerifierRun(run);
    await save(scenario.label+'.lineage.json',lineage);
  }
  assert.equal(lineage.process_lineage.status,'verified');
  assert.deepEqual(lineage.process_lineage.descendants,[]);
  assert.equal(await digest(scenario.target),scenario.sha256);
  checks.push({label:scenario.label,target:scenario.target,target_sha256:scenario.sha256,seed_path:scenario.seed,code:mcpError.code,retryable:mcpError.retryable,cli_mcp_equal:true,target_unchanged:true,owned_descendants:[],verifier_run_id:run.run_id});
  console.log(JSON.stringify({case:scenario.label,status:'passed',code:mcpError.code}));
  }finally{
    if(lineage===undefined){
      lineage=await completeVerifierRun(run);
      await save(scenario.label+'.lineage.json',lineage);
    }
  }
}
await save('public-verification.json',{status:'passed',authority:'actual compiled CLI and SDK stdio MCP against owned compiled fixture and fixed Arc artifact; error records, not fresh analysis Evidence',cases:checks,target_executed:false,host_capacity_or_permission_failure_induced:false});
