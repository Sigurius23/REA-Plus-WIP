package ct0;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: ct0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lct0/b;", "", "", "input", "", "flag", "", "a", "(Ljava/lang/String;I)[B", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC11107b {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ byte[] m30037b(InterfaceC11107b interfaceC11107b, String str, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i14 & 2) != 0) {
            i13 = 2;
        }
        return interfaceC11107b.mo30036a(str, i13);
    }

    /* JADX INFO: renamed from: a */
    byte[] mo30036a(String input, int flag);
}
