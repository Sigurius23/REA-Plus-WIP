package ct0;

import android.util.Base64;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ct0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lct0/a;", "Lct0/b;", "<init>", "()V", "", "input", "", "flag", "", "a", "(Ljava/lang/String;I)[B", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11106a implements InterfaceC11107b {
    @Override // ct0.InterfaceC11107b
    /* JADX INFO: renamed from: a */
    public byte[] mo30036a(String input, int flag) {
        AbstractC22676k.m65750j(input, "input");
        byte[] bArrDecode = Base64.decode(input, flag);
        AbstractC22676k.m65749i(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
