package e33;

import java.io.Serializable;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e33.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C12631g extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C12645n f43134E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f43135F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ String f43136G;

    /* JADX INFO: renamed from: w */
    public Object f43137w;

    /* JADX INFO: renamed from: x */
    public Serializable f43138x;

    /* JADX INFO: renamed from: y */
    public C12645n f43139y;

    /* JADX INFO: renamed from: z */
    public int f43140z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12631g(C12645n c12645n, boolean z4, String str, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43134E = c12645n;
        this.f43135F = z4;
        this.f43136G = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12631g(this.f43134E, this.f43135F, this.f43136G, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C12631g) create((InterfaceC30057d) obj)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x016c A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0170 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x017e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4 A[Catch: Exception -> 0x002b, PHI: r6 r8 r9
      0x01b4: PHI (r6v23 e33.n) = (r6v22 e33.n), (r6v29 e33.n) binds: [B:66:0x01b0, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r8v27 stream.video.sfu.signal.SetPublisherRequest) = (r8v21 stream.video.sfu.signal.SetPublisherRequest), (r8v36 stream.video.sfu.signal.SetPublisherRequest) binds: [B:66:0x01b0, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r9v13 java.lang.Object) = (r9v10 java.lang.Object), (r9v17 java.lang.Object) binds: [B:66:0x01b0, B:17:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e3 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01f3 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0220  */
    /* JADX WARN: Code duplicated, block: B:81:0x0232 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0260 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:9:0x0023, B:88:0x027e, B:90:0x0284, B:92:0x0288, B:96:0x0299, B:97:0x029d, B:98:0x02a2, B:99:0x02a3, B:101:0x02a7, B:103:0x02bd, B:104:0x02c7, B:107:0x02cc, B:108:0x02d1, B:16:0x003e, B:68:0x01b4, B:70:0x01c6, B:71:0x01dd, B:73:0x01e3, B:75:0x01f3, B:76:0x0212, B:79:0x0221, B:81:0x0232, B:82:0x024d, B:84:0x0260, B:85:0x0265, B:19:0x0051, B:55:0x0166, B:57:0x016c, B:59:0x0170, B:62:0x017f, B:63:0x0183, B:64:0x0188, B:65:0x0189, B:52:0x0153), top: B:114:0x0015 }] */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x027b, code lost:
    
        if (r0 == r5) goto L87;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x01c6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:75:0x01f3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x0232, please report this as an issue */
    @Override // s83.AbstractC32267a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e33.C12631g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
