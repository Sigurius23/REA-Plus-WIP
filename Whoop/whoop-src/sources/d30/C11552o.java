package d30;

import android.view.textclassifier.TextClassifier;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import d33.C11602h1;
import dc3.InterfaceC11927l;
import e10.C12553k;
import e10.C12568r0;
import e10.InterfaceC12549i;
import e30.AbstractC12605c;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import f53.C14122j;
import fc3.AbstractC14376g;
import fc3.C14394y;
import g20.C15272r;
import h20.C16759x;
import h40.C16845k;
import io.getstream.android.video.generated.models.VideoEvent;
import l83.C23454a0;
import p027b3.InterfaceC2376g;
import p027b3.InterfaceC2433r1;
import p132f0.C13821r1;
import p163g1.C15072l6;
import p163g1.C15147t1;
import p163g1.C15208z2;
import p180h0.C16372c3;
import p180h0.C16398h2;
import p180h0.InterfaceC16427n1;
import p238j0.C21080f;
import p238j0.C21081g;
import p238j0.InterfaceC21082h;
import p238j0.InterfaceC21083i;
import p294l3.C23254g;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p599wz.C37718g0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import t23.AbstractC33441q1;
import v10.C35526b;
import x43.AbstractC37984p;

/* JADX INFO: renamed from: d30.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C11552o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37262w;

    /* JADX INFO: renamed from: x */
    public int f37263x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f37264y;

    /* JADX INFO: renamed from: z */
    public Object f37265z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11552o(TextClassifier textClassifier, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37262w = 11;
        this.f37265z = textClassifier;
        this.f37264y = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX INFO: renamed from: f */
    private final Object m30994f(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f37263x;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            if (((Function3) ((InterfaceC28601c1) this.f37264y).getValue()) != null) {
                C16845k c16845k = (C16845k) this.f37265z;
                this.f37263x = 1;
                if (c16845k.m47443c(this) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [kotlin.jvm.functions.Function1, s83.i] */
    /* JADX WARN: Type inference failed for: r1v23, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37262w) {
            case 0:
                return new C11552o((InterfaceC13037f2) this.f37265z, (C11564u) this.f37264y, interfaceC30057d, 0);
            case 1:
                return new C11552o((C11564u) this.f37264y, (AbstractC12605c) this.f37265z, interfaceC30057d);
            case 2:
                return new C11552o((InterfaceC13087t1) this.f37265z, (C11566v) this.f37264y, interfaceC30057d, 2);
            case 3:
                C11552o c11552o = new C11552o((C11530f0) this.f37264y, interfaceC30057d, 3);
                c11552o.f37265z = obj;
                return c11552o;
            case 4:
                return new C11552o((C11602h1) this.f37265z, (VideoEvent) this.f37264y, interfaceC30057d, 4);
            case 5:
                C11552o c11552o2 = new C11552o((C11602h1) this.f37264y, interfaceC30057d, 5);
                c11552o2.f37265z = obj;
                return c11552o2;
            case 6:
                return new C11552o((C12568r0) this.f37265z, (InterfaceC12549i) this.f37264y, interfaceC30057d, 6);
            case 7:
                return new C11552o((C12568r0) this.f37265z, (C12553k) this.f37264y, interfaceC30057d, 7);
            case 8:
                C11552o c11552o3 = new C11552o((C14394y) this.f37264y, interfaceC30057d, 8);
                c11552o3.f37265z = obj;
                return c11552o3;
            case 9:
                return new C11552o((InterfaceC21083i) this.f37265z, (C21080f) this.f37264y, interfaceC30057d, 9);
            case 10:
                return new C11552o((InterfaceC21083i) this.f37265z, (C21081g) this.f37264y, interfaceC30057d, 10);
            case 11:
                return new C11552o((TextClassifier) this.f37265z, (InterfaceC4351m) this.f37264y, interfaceC30057d);
            case 12:
                return new C11552o((InterfaceC2433r1) this.f37265z, (C23254g) this.f37264y, interfaceC30057d, 12);
            case 13:
                C11552o c11552o4 = new C11552o((C14122j) this.f37264y, interfaceC30057d, 13);
                c11552o4.f37265z = obj;
                return c11552o4;
            case 14:
                C11552o c11552o5 = new C11552o((AbstractC14376g) this.f37264y, interfaceC30057d, 14);
                c11552o5.f37265z = obj;
                return c11552o5;
            case 15:
                C11552o c11552o6 = new C11552o((InterfaceC13062m) this.f37264y, interfaceC30057d, 15);
                c11552o6.f37265z = obj;
                return c11552o6;
            case 16:
                return new C11552o((C15208z2) this.f37265z, (C15147t1) this.f37264y, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C11552o((C15208z2) this.f37265z, (InterfaceC21082h) this.f37264y, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C11552o((InterfaceC16427n1) this.f37265z, (InterfaceC28601c1) this.f37264y, interfaceC30057d, 18);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C11552o((C15072l6) this.f37265z, (InterfaceC2376g) this.f37264y, interfaceC30057d, 19);
            case 20:
                return new C11552o((C15272r) this.f37265z, (C35526b) this.f37264y, interfaceC30057d, 20);
            case 21:
                return new C11552o((AbstractC32275i) this.f37264y, interfaceC30057d);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C11552o((C13821r1) this.f37265z, (C22665e0) this.f37264y, interfaceC30057d, 22);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C11552o c11552o7 = new C11552o((InterfaceC11927l) this.f37264y, interfaceC30057d, 23);
                c11552o7.f37265z = obj;
                return c11552o7;
            case 24:
                C11552o c11552o8 = new C11552o((C11530f0) this.f37264y, interfaceC30057d, 24);
                c11552o8.f37265z = obj;
                return c11552o8;
            case 25:
                return new C11552o((C16372c3) this.f37265z, (InterfaceC4351m) this.f37264y, interfaceC30057d, 25);
            case 26:
                return new C11552o((InterfaceC3027k1) this.f37265z, (C16398h2) this.f37264y, interfaceC30057d, 26);
            case 27:
                return new C11552o((C16845k) this.f37265z, (InterfaceC28601c1) this.f37264y, interfaceC30057d, 27);
            case 28:
                return new C11552o((Function1) this.f37265z, (Function1) this.f37264y, interfaceC30057d, 28);
            default:
                return new C11552o((C16759x) this.f37265z, (C37718g0) this.f37264y, interfaceC30057d, 29);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37262w) {
            case 0:
                ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 1:
                ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 2:
                ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 3:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C11552o) create((String) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C11552o) create((AbstractC33441q1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                ((C11552o) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                return EnumC31071a.f128113w;
            case 9:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 10:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 11:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 12:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 13:
                return ((C11552o) create((AbstractC37984p) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 14:
                return ((C11552o) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 15:
                return ((C11552o) create(obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 16:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 20:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 21:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 24:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 25:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 26:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 27:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 28:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C11552o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0306  */
    /* JADX WARN: Code duplicated, block: B:499:0x0995  */
    /* JADX WARN: Code duplicated, block: B:592:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0118 A[Catch: all -> 0x00f4, TryCatch #0 {all -> 0x00f4, blocks: (B:60:0x00f0, B:71:0x010e, B:73:0x0118, B:76:0x0127, B:67:0x0100), top: B:563:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [bc3.d0, java.util.concurrent.CancellationException, q83.d, q83.j] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v102, types: [int] */
    /* JADX WARN: Type inference failed for: r1v103, types: [bc3.k1] */
    /* JADX WARN: Type inference failed for: r1v107, types: [bc3.k1] */
    /* JADX WARN: Type inference failed for: r1v133 */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r2v21, types: [bc3.c2, bc3.t1] */
    /* JADX WARN: Type inference failed for: r2v24, types: [bc3.c2, bc3.t1] */
    /* JADX WARN: Type inference failed for: r2v27, types: [bc3.c2, bc3.t1] */
    /* JADX WARN: Type inference failed for: r2v45, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r3v78, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x014c -> B:71:0x010e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 2882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d30.C11552o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11552o(C11564u c11564u, AbstractC12605c abstractC12605c, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37262w = 1;
        this.f37264y = c11564u;
        this.f37265z = abstractC12605c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11552o(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f37262w = i13;
        this.f37265z = obj;
        this.f37264y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11552o(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f37262w = i13;
        this.f37264y = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C11552o(Function1 function1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f37262w = 21;
        this.f37264y = (AbstractC32275i) function1;
    }
}
