package p199ho;

import ed3.C13117a;
import java.util.List;
import p621xn.AbstractC38467d;
import p686zn.C40902f;

/* JADX INFO: renamed from: ho.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17520a extends AbstractC38467d {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f67756m;

    /* JADX INFO: renamed from: n */
    public final Object f67757n;

    public C17520a(List list) {
        this.f67756m = 1;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f67757n = new C40902f(((bArr[0] & 255) << 8) | (bArr[1] & 255), (bArr[3] & 255) | ((bArr[2] & 255) << 8));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 ab.g, still in use, count: 2, list:
          (r3v9 ab.g) from 0x0284: PHI (r3v10 ab.g) = (r3v9 ab.g), (r3v15 ab.g) binds: [B:89:0x027c, B:130:0x03b9] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 ab.g) from 0x0243: MOVE (r26v7 ab.g) = (r3v9 ab.g)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // p621xn.AbstractC38467d
    /* JADX INFO: renamed from: f */
    public final p621xn.InterfaceC38468e mo5527f(int r47, boolean r48, byte[] r49) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p199ho.C17520a.mo5527f(int, boolean, byte[]):xn.e");
    }

    public C17520a() {
        this.f67756m = 0;
        this.f67757n = new C13117a();
    }
}
