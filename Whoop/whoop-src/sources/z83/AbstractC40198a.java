package z83;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z83.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC40198a extends AbstractC32004s {
    /* JADX INFO: renamed from: y */
    public static Path m129083y(Path path, String str, String str2, FileAttribute... attributes) throws IOException {
        AbstractC22676k.m65750j(attributes, "attributes");
        if (path != null) {
            Path pathCreateTempFile = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
            AbstractC22676k.m65749i(pathCreateTempFile, "createTempFile(...)");
            return pathCreateTempFile;
        }
        Path pathCreateTempFile2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
        AbstractC22676k.m65749i(pathCreateTempFile2, "createTempFile(...)");
        return pathCreateTempFile2;
    }

    /* JADX INFO: renamed from: z */
    public static String m129084z(Path path) {
        AbstractC22676k.m65750j(path, "<this>");
        Path fileName = path.getFileName();
        String string = fileName != null ? fileName.toString() : null;
        return string == null ? "" : string;
    }
}
