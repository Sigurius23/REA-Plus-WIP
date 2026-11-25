import {
  uImageMetadataSchema,
  uImageEntryMetadataSchema,
} from "./uimageMetadata.js";
import { fitMetadataSchema, fitImageMetadataSchema } from "./fitMetadata.js";
import {
  espImageMetadataSchema,
  espImageSegmentMetadataSchema,
  espImageSignatureBlockMetadataSchema,
} from "./espMetadata.js";
import { z } from "zod";
import {
  hexRecordsMetadataSchema,
  hexRecordRegionMetadataSchema,
} from "./hexRecordMetadata.js";
import { uf2MetadataSchema, uf2RegionMetadataSchema } from "./uf2Metadata.js";
import {
  dfuSeMetadataSchema,
  dfuSeElementMetadataSchema,
} from "./dfuseMetadata.js";
export const firmwareFormatMetadataSchema = z.discriminatedUnion("kind", [
  hexRecordsMetadataSchema,
  hexRecordRegionMetadataSchema,
  uImageMetadataSchema,
  uImageEntryMetadataSchema,
  fitMetadataSchema,
  fitImageMetadataSchema,
  espImageMetadataSchema,
  espImageSegmentMetadataSchema,
  espImageSignatureBlockMetadataSchema,
  uf2MetadataSchema,
  uf2RegionMetadataSchema,
  dfuSeMetadataSchema,
  dfuSeElementMetadataSchema,
]);
export type FirmwareFormatMetadata = z.infer<
  typeof firmwareFormatMetadataSchema
>;
