import { basename, isAbsolute } from "node:path";
import { z } from "zod";

/** A caller-selected expanded project, never the live project opened by REA+. */
export const ghidraProjectPathSchema = z
  .string()
  .min(1)
  .refine(isAbsolute)
  .refine(
    (path) => path.endsWith(".gpr") && basename(path).length > 4,
    "Select an expanded .gpr project marker; restore .grez archives or import .gzf packed Programs into a project first",
  );
export const ghidraProgramNameSchema = z
  .string()
  .min(1)
  .refine(
    (name) =>
      name.trim().length > 0 &&
      !name.startsWith("-") &&
      !/[\\/\0*?]/u.test(name),
    "Select one exact root Program name, without paths, flags or wildcards",
  );
export interface GhidraProjectSelection {
  readonly path: string;
  readonly programName?: string;
}
