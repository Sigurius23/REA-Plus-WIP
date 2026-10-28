package or2;

import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: or2.b0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JM\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u001a\u0010\t\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\"\u0006\u0012\u0002\b\u00030\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lor2/b0;", "", "Ljava/nio/file/Path;", "directory", "", "prefix", "suffix", "", "Ljava/nio/file/attribute/FileAttribute;", "attributes", "b", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC28148b0 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Path m85175a(InterfaceC28148b0 interfaceC28148b0, Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createTempFile");
        }
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return interfaceC28148b0.mo85176b(path, str, str2, fileAttributeArr);
    }

    /* JADX INFO: renamed from: b */
    Path mo85176b(Path directory, String prefix, String suffix, FileAttribute<?>... attributes);
}
