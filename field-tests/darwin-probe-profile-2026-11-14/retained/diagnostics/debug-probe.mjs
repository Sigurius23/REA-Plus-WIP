import { runOwnedCommand } from '../../dist/process/OwnedCommand.js';
import { randomUUID } from 'node:crypto';
import { resolve } from 'node:path';
import { mkdtemp, writeFile } from 'node:fs/promises';
import { tmpdir } from 'node:os';
const root=resolve('.cache/darwin-stack-probe-increment-2026-11-14');
const project=await mkdtemp(resolve(tmpdir(),'rea-probe-diagnostic-'));
const reply=await runOwnedCommand({
  command:'/opt/homebrew/Cellar/ghidra/12.1.4/libexec/support/analyzeHeadless',
  arguments:[project,'probe-debug','-import',resolve(root,'native-first/probe-got/libReaSwiftRelativeSwitch.dylib'),'-scriptPath',resolve(root,'diagnostic'),'-postScript','ProbeBindingDebug.java','-deleteProject'],
  cwd:process.cwd(),runId:'rea-probe-diagnostic-'+randomUUID(),expectedCommand:null,
  env:{...process.env,JAVA_HOME:'/opt/homebrew/Cellar/openjdk/27/libexec/openjdk.jdk/Contents/Home'}
},{timeoutMs:120000,diagnosticBytes:2097152});
await writeFile(resolve(root,'diagnostic-result.json'),JSON.stringify(reply,null,2)+'\n');
process.stdout.write(JSON.stringify(reply,null,2)+'\n');
