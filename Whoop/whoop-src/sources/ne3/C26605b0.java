package ne3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p249jc.C21567b;
import p333n4.C26250f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26605b0 extends C26603a0 {
    /* JADX INFO: renamed from: F0 */
    public static Long m79169F0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // ne3.C26603a0, ne3.AbstractC26632p
    /* JADX INFO: renamed from: a0 */
    public final C26250f mo79148a0(C26611e0 path) {
        C26611e0 c26611e0M60606o;
        AbstractC22676k.m65750j(path, "path");
        Path pathM79177f = path.m79177f();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathM79177f, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathM79177f) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C26611e0.f105848x;
                c26611e0M60606o = C21567b.m60606o(symbolicLink.toString(), false);
            } else {
                c26611e0M60606o = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM79169F0 = fileTimeCreationTime != null ? m79169F0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM79169F1 = fileTimeLastModifiedTime != null ? m79169F0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C26250f(zIsRegularFile, zIsDirectory, c26611e0M60606o, lValueOf, lM79169F0, lM79169F1, fileTimeLastAccessTime != null ? m79169F0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // ne3.C26603a0, ne3.AbstractC26632p
    /* JADX INFO: renamed from: h */
    public final void mo79151h(C26611e0 source, C26611e0 target) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(target, "target");
        try {
            Files.move(source.m79177f(), target.m79177f(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e5) {
            throw new FileNotFoundException(e5.getMessage());
        }
    }

    @Override // ne3.C26603a0
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
