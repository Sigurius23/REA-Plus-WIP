import type { EvidenceMcpServer } from "./EvidenceMcpServer.js";
import type { ChromiumResourceSearchService } from "../application/binaryDiagnostics/ChromiumResourceSearchService.js";
import type { EvidenceWriter } from "../application/investigation/InvestigationRecordPort.js";
import { toolContract } from "../contracts/toolContracts.js";
import type { Logger } from "pino";
import { createEvidenceToolHandler } from "./contractToolHandler.js";
import type { WithAdmittedAnalysis } from "./analysisAdmission.js";
import { toolRegistrationOptions } from "./toolRegistrationOptions.js";

/** Target-free DataPack inspection with the shared complete Evidence ledger. */
export const registerChromiumResourceSearchTool = (
  server: EvidenceMcpServer,
  service: ChromiumResourceSearchService,
  logger: Logger,
  recordEvidence?: EvidenceWriter["recordEvidence"],
  withAdmittedAnalysis?: WithAdmittedAnalysis,
): void => {
  const contract = toolContract("search_chromium_resources");
  const handler = createEvidenceToolHandler(
    server,
    (input, options) => service.search(input, options),
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
