package androidx.lifecycle;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import bc3.InterfaceC2994c0;
import bh.C3240c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.C11923h;
import ec3.InterfaceC13062m;
import kh.C22467a;
import l83.C23454a0;
import mh.C25542j;
import mh.C25545m;
import p027b3.C2440s3;
import p132f0.C13776c1;
import p132f0.EnumC13840z0;
import p195hh.C17276g;
import p195hh.InterfaceC17277h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: androidx.lifecycle.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1586g1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public Object f6226E;

    /* JADX INFO: renamed from: F */
    public Object f6227F;

    /* JADX INFO: renamed from: G */
    public Object f6228G;

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f6229H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f6230I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6231w = 1;

    /* JADX INFO: renamed from: x */
    public int f6232x;

    /* JADX INFO: renamed from: y */
    public Object f6233y;

    /* JADX INFO: renamed from: z */
    public Object f6234z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586g1(ContentResolver contentResolver, Uri uri, C2440s3 c2440s3, C11923h c11923h, Context context, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6226E = contentResolver;
        this.f6227F = uri;
        this.f6228G = c2440s3;
        this.f6229H = c11923h;
        this.f6230I = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1, s83.i] */
    /* JADX WARN: Type inference failed for: r7v1, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f6231w) {
            case 0:
                return new C1586g1((AbstractC1638x) this.f6228G, (EnumC1635w) this.f6229H, (InterfaceC2994c0) this.f6227F, (AbstractC32275i) this.f6230I, interfaceC30057d);
            case 1:
                C1586g1 c1586g1 = new C1586g1((ContentResolver) this.f6226E, (Uri) this.f6227F, (C2440s3) this.f6228G, (C11923h) this.f6229H, (Context) this.f6230I, interfaceC30057d);
                c1586g1.f6234z = obj;
                return c1586g1;
            case 2:
                C1586g1 c1586g2 = new C1586g1((EnumC13840z0) this.f6228G, (C13776c1) this.f6229H, (AbstractC32275i) this.f6230I, interfaceC30057d);
                c1586g2.f6227F = obj;
                return c1586g2;
            case 3:
                return new C1586g1((C17276g) this.f6226E, (C22669g0) this.f6233y, (C22669g0) this.f6234z, (C25542j) this.f6227F, this.f6228G, (C22669g0) this.f6229H, (C3240c) this.f6230I, interfaceC30057d);
            case 4:
                return new C1586g1((C17276g) this.f6233y, (C25542j) this.f6234z, this.f6226E, (C25545m) this.f6227F, (C3240c) this.f6228G, (C22467a) this.f6229H, (InterfaceC17277h) this.f6230I, interfaceC30057d);
            default:
                C1586g1 c1586g3 = new C1586g1((InterfaceC4339a) this.f6230I, interfaceC30057d);
                c1586g3.f6229H = obj;
                return c1586g3;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f6231w) {
            case 0:
                return ((C1586g1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C1586g1) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C1586g1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C1586g1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C1586g1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                ((C1586g1) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:236:0x0464  */
    /* JADX WARN: Code duplicated, block: B:237:0x0465  */
    /* JADX WARN: Code duplicated, block: B:240:0x0472 A[Catch: all -> 0x0425, TRY_LEAVE, TryCatch #3 {all -> 0x0425, blocks: (B:223:0x041e, B:234:0x0457, B:238:0x046a, B:240:0x0472, B:230:0x0438, B:233:0x044e), top: B:288:0x040e }] */
    /* JADX WARN: Code duplicated, block: B:243:0x0498  */
    /* JADX WARN: Code duplicated, block: B:269:0x0532  */
    /* JADX WARN: Code duplicated, block: B:272:0x053b  */
    /* JADX WARN: Code duplicated, block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int, mc3.a] */
    /* JADX WARN: Type inference failed for: r4v28, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:243:0x0498 -> B:234:0x0457). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01b0 -> B:80:0x01b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01d0 -> B:80:0x01b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1586g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1586g1(AbstractC1638x abstractC1638x, EnumC1635w enumC1635w, InterfaceC2994c0 interfaceC2994c0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6228G = abstractC1638x;
        this.f6229H = enumC1635w;
        this.f6227F = interfaceC2994c0;
        this.f6230I = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586g1(InterfaceC4339a interfaceC4339a, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6230I = interfaceC4339a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1586g1(EnumC13840z0 enumC13840z0, C13776c1 c13776c1, Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6228G = enumC13840z0;
        this.f6229H = c13776c1;
        this.f6230I = (AbstractC32275i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586g1(C17276g c17276g, C22669g0 c22669g0, C22669g0 c22669g1, C25542j c25542j, Object obj, C22669g0 c22669g2, C3240c c3240c, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6226E = c17276g;
        this.f6233y = c22669g0;
        this.f6234z = c22669g1;
        this.f6227F = c25542j;
        this.f6228G = obj;
        this.f6229H = c22669g2;
        this.f6230I = c3240c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586g1(C17276g c17276g, C25542j c25542j, Object obj, C25545m c25545m, C3240c c3240c, C22467a c22467a, InterfaceC17277h interfaceC17277h, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f6233y = c17276g;
        this.f6234z = c25542j;
        this.f6226E = obj;
        this.f6227F = c25545m;
        this.f6228G = c3240c;
        this.f6229H = c22467a;
        this.f6230I = interfaceC17277h;
    }
}
