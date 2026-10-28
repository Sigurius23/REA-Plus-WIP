package p579wc;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import be.C3154g;
import be.InterfaceC3160m;
import l83.C23470p;
import l83.InterfaceC23462h;
import mc3.AbstractC25438d;
import mc3.C25437c;
import o73.C27648a;
import p326mf.C25500t;
import p368og.EnumC27905b;
import p484s9.AbstractC32281f;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ug.C34912a;
import ug.C34913b;
import ve.C35920e;
import ve.InterfaceC35918c;
import vg.InterfaceC35965l;
import vg.InterfaceC35967n;
import w91.C36965l;

/* JADX INFO: renamed from: wc.s */
/* JADX INFO: loaded from: classes.dex */
public final class C37116s implements InterfaceC35918c {

    /* JADX INFO: renamed from: E */
    public C34913b f158787E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC23462h f158789w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35965l f158790x;

    /* JADX INFO: renamed from: z */
    public C35920e f158792z;

    /* JADX INFO: renamed from: y */
    public final C34912a f158791y = C34912a.f147012a;

    /* JADX INFO: renamed from: F */
    public final C25437c f158788F = AbstractC25438d.m74669a();

    public C37116s(C23470p c23470p, InterfaceC35967n interfaceC35967n) {
        this.f158789w = c23470p;
        this.f158790x = interfaceC35967n;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #3 {all -> 0x00be, blocks: (B:32:0x009a, B:34:0x009e, B:36:0x00a2, B:41:0x00b5), top: B:112:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2 A[Catch: Exception -> 0x006b, PHI: r0
      0x00d2: PHI (r0v28 java.lang.Object) = (r0v24 java.lang.Object), (r0v3 java.lang.Object) binds: [B:48:0x00ce, B:21:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x006b, blocks: (B:21:0x0066, B:50:0x00d2, B:47:0x00c5), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7 A[Catch: Exception -> 0x0059, PHI: r0
      0x00f7: PHI (r0v32 java.lang.Object) = (r0v31 java.lang.Object), (r0v3 java.lang.Object) binds: [B:52:0x00f3, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x0059, blocks: (B:16:0x0054, B:54:0x00f7, B:51:0x00d4), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:85:0x0202  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0213, code lost:
    
        if (r0 == r1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022c, code lost:
    
        if (r0 == r1) goto L97;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:81:0x01b5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x01de, please report this as an issue */
    @Override // p613xf.InterfaceC38257c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo79294b(gf.InterfaceC15761b r13, s83.AbstractC32269c r14) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p579wc.C37116s.mo79294b(gf.b, s83.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC23462h interfaceC23462h = this.f158789w;
        if (interfaceC23462h.mo5046b()) {
            ((C3154g) ((InterfaceC3160m) interfaceC23462h.getValue())).close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m119031h(AbstractC32269c abstractC32269c) {
        C37110p c37110p;
        if (abstractC32269c instanceof C37110p) {
            c37110p = (C37110p) abstractC32269c;
            int i13 = c37110p.f158754y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37110p.f158754y = i13 - Integer.MIN_VALUE;
            } else {
                c37110p = new C37110p(this, abstractC32269c);
            }
        } else {
            c37110p = new C37110p(this, abstractC32269c);
        }
        Object objM9054b = c37110p.f158752w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37110p.f158754y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM9054b);
                InterfaceC3160m interfaceC3160m = (InterfaceC3160m) this.f158789w.getValue();
                c37110p.f158754y = 1;
                objM9054b = ((C3154g) interfaceC3160m).m9054b("/latest/meta-data/iam/security-credentials/", c37110p);
                if (objM9054b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM9054b);
            }
            return (String) objM9054b;
        } catch (EC2MetadataError e5) {
            C25500t c25500t = C25500t.f99849c;
            if (AbstractC22676k.m65745e(e5.f8397z, C27648a.m83560K())) {
                InterfaceC30063j context = c37110p.getContext();
                C36965l c36965l = new C36965l(16);
                EnumC27905b enumC27905b = EnumC27905b.f112506y;
                String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37116s.class).getQualifiedName();
                if (qualifiedName == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object");
                }
                AbstractC35903f.m113983A(context, enumC27905b, qualifiedName, null, c36965l);
            }
            throw e5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (p715kotlin.jvm.internal.AbstractC22676k.m65745e(r6, o73.C27648a.m83555F()) != false) goto L22;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m119032i(java.lang.Exception r6, s83.AbstractC32269c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p579wc.C37114r
            if (r0 == 0) goto L13
            r0 = r7
            wc.r r0 = (p579wc.C37114r) r0
            int r1 = r0.f158784z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158784z = r1
            goto L18
        L13:
            wc.r r0 = new wc.r
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f158782x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f158784z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            mc3.c r6 = r0.f158781w
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            p505ts.AbstractC34132o.m107864I(r7)
            boolean r7 = r6 instanceof java.io.IOException
            if (r7 != 0) goto L4f
            boolean r7 = r6 instanceof aws.sdk.kotlin.runtime.config.imds.EC2MetadataError
            if (r7 == 0) goto L4e
            aws.sdk.kotlin.runtime.config.imds.EC2MetadataError r6 = (aws.sdk.kotlin.runtime.config.imds.EC2MetadataError) r6
            mf.t r6 = r6.f8397z
            mf.t r7 = p326mf.C25500t.f99849c
            mf.t r7 = o73.C27648a.m83555F()
            boolean r6 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r6, r7)
            if (r6 == 0) goto L4e
            goto L4f
        L4e:
            return r4
        L4f:
            mc3.c r6 = r5.f158788F
            r0.f158781w = r6
            r0.f158784z = r3
            java.lang.Object r7 = r6.mo68211b(r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            ve.e r7 = r5.f158792z     // Catch: java.lang.Throwable -> L7c
            if (r7 == 0) goto L7e
            ug.a r0 = r5.f158791y     // Catch: java.lang.Throwable -> L7c
            r0.getClass()     // Catch: java.lang.Throwable -> L7c
            t9.p r0 = ug.C34913b.f147015x     // Catch: java.lang.Throwable -> L7c
            ug.b r0 = p499t9.C33647p.m106274t()     // Catch: java.lang.Throwable -> L7c
            kotlin.time.Duration$Companion r1 = p715kotlin.time.Duration.INSTANCE     // Catch: java.lang.Throwable -> L7c
            kotlin.time.DurationUnit r1 = p715kotlin.time.DurationUnit.SECONDS     // Catch: java.lang.Throwable -> L7c
            r2 = 900(0x384, float:1.261E-42)
            long r1 = p715kotlin.time.DurationKt.toDuration(r2, r1)     // Catch: java.lang.Throwable -> L7c
            ug.b r0 = r0.m110115d(r1)     // Catch: java.lang.Throwable -> L7c
            r5.f158787E = r0     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r7 = move-exception
            goto L83
        L7e:
            r7 = r4
        L7f:
            r6.mo68214i(r4)
            return r7
        L83:
            r6.mo68214i(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p579wc.C37116s.m119032i(java.lang.Exception, s83.c):java.lang.Object");
    }

    public final String toString() {
        return AbstractC32281f.m100455w(this);
    }
}
