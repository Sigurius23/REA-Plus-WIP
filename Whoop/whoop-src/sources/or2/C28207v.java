package or2;

import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z83.AbstractC40198a;

/* JADX INFO: renamed from: or2.v */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lor2/v;", "Lor2/b0;", "<init>", "()V", "Ljava/nio/file/Path;", "directory", "", "prefix", "suffix", "", "Ljava/nio/file/attribute/FileAttribute;", "attributes", "b", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/file/Path;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28207v implements InterfaceC28148b0 {
    @Override // or2.InterfaceC28148b0
    /* JADX INFO: renamed from: b */
    public Path mo85176b(Path directory, String prefix, String suffix, FileAttribute<?>... attributes) {
        AbstractC22676k.m65750j(attributes, "attributes");
        return AbstractC40198a.m129083y(directory, prefix, suffix, (FileAttribute[]) Arrays.copyOf(attributes, attributes.length));
    }
}
