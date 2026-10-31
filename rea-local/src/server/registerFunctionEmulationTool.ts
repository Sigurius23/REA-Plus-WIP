import type { EvidenceMcpServer } from "./EvidenceMcpServer.js";
import type { FunctionEmulationService } from "../application/binaryDiagnostics/FunctionEmulationService.js";
import type { EvidenceWriter } from "../application/investigation/InvestigationRecordPort.js";
import { toolContract } from "../contracts/toolContracts.js";
import type { Logger } from "pino";
import { createEvidenceToolHandler } from "./contractToolHandler.js";
import type { WithAdmittedAnalysis } from "./analysisAdmission.js";
import { toolRegistrationOptions } from "./toolRegistrationOptions.js";

/** Retain conditional emulation Evidence under the canonical target-free contract. */
export const registerFunctionEmulationTool = (
  server: EvidenceMcpServer,
  service: FunctionEmulationService,
  logger: Logger,
  recordEvidence?: EvidenceWriter["recordEvidence"],
  withAdmittedAnalysis?: WithAdmittedAnalysis,
): void => {
  const contract = toolContract("emulate_function");
  const handler = createEvidenceToolHandler(
    server,
    (input, options) => service.emulate(input, options),
    logger,
    recordEvidence,
    withAdmittedAnalysis,
  );
  server.registerTool(
    contract.name,
    toolRegistrationOptions(contract),
    handler(contract),
  );
};
