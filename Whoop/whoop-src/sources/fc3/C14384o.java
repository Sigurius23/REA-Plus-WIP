package fc3;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.InterfaceC11927l;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: fc3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C14384o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f52513E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f52514F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC13058l[] f52515G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4339a f52516H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ AbstractC32275i f52517I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC13062m f52518J;

    /* JADX INFO: renamed from: w */
    public InterfaceC11927l f52519w;

    /* JADX INFO: renamed from: x */
    public byte[] f52520x;

    /* JADX INFO: renamed from: y */
    public int f52521y;

    /* JADX INFO: renamed from: z */
    public int f52522z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14384o(InterfaceC4339a interfaceC4339a, InterfaceC13062m interfaceC13062m, Function3 function3, InterfaceC30057d interfaceC30057d, InterfaceC13058l[] interfaceC13058lArr) {
        super(2, interfaceC30057d);
        this.f52515G = interfaceC13058lArr;
        this.f52516H = interfaceC4339a;
        this.f52517I = (AbstractC32275i) function3;
        this.f52518J = interfaceC13062m;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        ?? r10 = this.f52517I;
        C14384o c14384o = new C14384o(this.f52516H, this.f52518J, r10, interfaceC30057d, this.f52515G);
        c14384o.f52514F = obj;
        return c14384o;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C14384o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2 A[DONT_INVERT, EDGE_INSN: B:33:0x00c2->B:19:0x0083 BREAK  A[LOOP:0: B:26:0x00a3->B:44:?]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:26:0x00a3->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v4, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fa -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x00d2
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // s83.AbstractC32267a
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc3.C14384o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
