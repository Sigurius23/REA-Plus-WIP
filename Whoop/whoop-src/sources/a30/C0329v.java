package a30;

import b20.C2326f;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import bc3.C3022j0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import bz.C3702a;
import bz.C3705d;
import bz.C3706e;
import bz.C3707f;
import bz.EnumC3703b;
import bz.InterfaceC3704c;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import cz.C11194d;
import h20.C16624a2;
import h20.C16636c2;
import h20.C16756w2;
import h20.C16773z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C22136a;
import k20.C22147l;
import k20.C22149n;
import k20.C22150o;
import l83.C23454a0;
import l83.C23464j;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import my.C26027a;
import p000.C12473e;
import p203hy.C17714c;
import p234iy.AbstractC21025a;
import p479s4.AbstractC32123d;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p537ux.C35363y;
import p550vd.AbstractC35902e;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q20.AbstractC29840y;
import q20.C29823i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import se.AbstractC32411b;
import te0.AbstractC33745d;
import u00.C34378f;
import v00.C35459c0;
import v00.C35475k0;
import wb3.AbstractC37056f;
import y00.C38901n;
import y00.C38921p1;
import y00.C38957t1;
import y00.C38966u1;
import y00.EnumC38896m3;
import y00.EnumC38930q1;
import y00.EnumC38948s1;
import y00.EnumC38979v5;
import y00.InterfaceC38802c8;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: a30.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C0329v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f1146E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f1147F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C0313n0 f1148G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ AbstractC0326t0 f1149H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C0274a0 f1150I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C0328u0 f1151J;

    /* JADX INFO: renamed from: w */
    public Object f1152w;

    /* JADX INFO: renamed from: x */
    public Object f1153x;

    /* JADX INFO: renamed from: y */
    public Object f1154y;

    /* JADX INFO: renamed from: z */
    public Object f1155z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0329v(C0313n0 c0313n0, AbstractC0326t0 abstractC0326t0, C0274a0 c0274a0, C0328u0 c0328u0, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1148G = c0313n0;
        this.f1149H = abstractC0326t0;
        this.f1150I = c0274a0;
        this.f1151J = c0328u0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C0329v c0329v = new C0329v(this.f1148G, this.f1149H, this.f1150I, this.f1151J, interfaceC30057d);
        c0329v.f1147F = obj;
        return c0329v;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C0329v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0391  */
    /* JADX WARN: Code duplicated, block: B:105:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:114:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x040e  */
    /* JADX WARN: Code duplicated, block: B:118:0x041c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x042c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0430 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0474 A[LOOP:0: B:130:0x046e->B:132:0x0474, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0489  */
    /* JADX WARN: Code duplicated, block: B:137:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:139:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x016f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0172  */
    /* JADX WARN: Code duplicated, block: B:24:0x019f  */
    /* JADX WARN: Code duplicated, block: B:27:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:41:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:48:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:52:0x0201  */
    /* JADX WARN: Code duplicated, block: B:55:0x021f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0220  */
    /* JADX WARN: Code duplicated, block: B:58:0x0224  */
    /* JADX WARN: Code duplicated, block: B:59:0x022c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0242  */
    /* JADX WARN: Code duplicated, block: B:66:0x0271  */
    /* JADX WARN: Code duplicated, block: B:68:0x0275  */
    /* JADX WARN: Code duplicated, block: B:79:0x028c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0290  */
    /* JADX WARN: Code duplicated, block: B:83:0x0294  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:91:0x034e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0360  */
    /* JADX WARN: Code duplicated, block: B:98:0x037d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [q83.j] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [bc3.d0, q83.j, v00.c0] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9, types: [bc3.d0, java.util.Map, q83.d, q83.j] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, k20.a] */
    /* JADX WARN: Type inference failed for: r1v20, types: [k20.a] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [bz.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r8v13, types: [a30.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [a30.e1, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v7 */
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
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2994c0 interfaceC2994c0;
        C26027a c26027a;
        InterfaceC3018i0 interfaceC3018i0M8711e;
        InterfaceC3018i0 interfaceC3018i0M8711e2;
        Object objM813f;
        C29823i0 c29823i0;
        String str;
        InterfaceC3018i0 interfaceC3018i0;
        int i13;
        AbstractC0326t0 abstractC0326t0;
        C26027a c26027a2;
        InterfaceC2994c0 interfaceC2994c1;
        InterfaceC3018i0 interfaceC3018i1;
        ?? r14;
        Object objM811d;
        C26027a c26027a3;
        InterfaceC3018i0 interfaceC3018i2;
        InterfaceC3018i0 interfaceC3018i3;
        C38966u1 c38966u1;
        InterfaceC38802c8 interfaceC38802c8;
        C38957t1 c38957t1;
        C3705d c3705d;
        ?? r10;
        boolean z4;
        ?? r15;
        C16636c2 c16636c2;
        ?? r16;
        InterfaceC0303k c0300j;
        ?? r17;
        Object objM810c;
        InterfaceC3018i0 interfaceC3018i4;
        InterfaceC2994c0 interfaceC2994c2;
        C38966u1 c38966u2;
        ?? r18;
        C38921p1 c38921p1;
        IllegalStateException illegalStateException;
        ?? r19;
        C26027a c26027a4;
        boolean zBooleanValue;
        C38966u1 c38966u3;
        C3022j0 c3022j0M8711e;
        String str2;
        InterfaceC38802c8 interfaceC38802c9;
        boolean zMo124329X;
        AbstractC0326t0 initializationMode;
        EnumC38896m3 enumC38896m3;
        EnumC38979v5 enumC38979v5;
        List list;
        C0329v c0329v;
        C0328u0 c0328u0;
        int i14;
        C3022j0 c3022j0M8711e2;
        C3022j0 c3022j0M8711e3;
        Object objM8817m;
        EnumC31071a enumC31071a;
        InterfaceC3018i0 interfaceC3018i5;
        C38966u1 c38966u4;
        C26027a c26027a5;
        InterfaceC3018i0 interfaceC3018i6;
        InterfaceC38802c8 interfaceC38802c10;
        ?? r110;
        C35459c0 c35459c0;
        Object objAwait;
        InterfaceC3018i0 interfaceC3018i7;
        C26027a c26027a6;
        C38966u1 c38966u5;
        C35459c0 c35459c1;
        ?? r111;
        InterfaceC38802c8 interfaceC38802c11;
        C0273a c0273a;
        Object objAwait2;
        C0273a c0273a2;
        ?? r112;
        InterfaceC38802c8 interfaceC38802c12;
        C35459c0 c35459c2;
        Object objM107888l;
        Throwable thM68037a;
        ?? M101059C;
        C0330v0 c0330v0;
        Throwable th3;
        ?? r24;
        int i15;
        ArrayList arrayList;
        Iterator it;
        C0274a0 c0274a0 = this.f1150I;
        C22136a c22136a = c0274a0.f943g;
        EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
        int i16 = this.f1146E;
        int i17 = 4;
        int i18 = 3;
        C0328u0 c0328u1 = this.f1151J;
        AbstractC0326t0 abstractC0326t1 = this.f1149H;
        int i19 = 1;
        InterfaceC30057d interfaceC30057d = null;
        switch (i16) {
            case 0:
                AbstractC34132o.m107864I(obj);
                interfaceC2994c0 = (InterfaceC2994c0) this.f1147F;
                c26027a = this.f1148G.f1078b;
                abstractC0326t1.mo829f();
                c26027a.m77435b(c0274a0.f953q, !AbstractC39421y.m125930O(((C35363y) c0274a0.f952p.get()).f150633w, "pk_test", false));
                boolean z13 = c0328u1.f1145b;
                AbstractC35902e.m113963f0(c22136a.f85867e, EnumC3703b.f15151w);
                c22136a.m63389h(new C22147l(z13), null);
                c0274a0.f951o.getClass();
                interfaceC3018i0M8711e = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C0317p(c0274a0, interfaceC30057d, i19), 3);
                interfaceC3018i0M8711e2 = AbstractC3006f0.m8711e(interfaceC2994c0, null, new C12473e(c0274a0, c26027a, interfaceC30057d, i17), 3);
                this.f1147F = interfaceC2994c0;
                this.f1152w = c26027a;
                this.f1153x = interfaceC3018i0M8711e;
                this.f1154y = interfaceC3018i0M8711e2;
                this.f1146E = 1;
                objM813f = C0274a0.m813f(c0274a0, c26027a, this);
                if (objM813f != enumC31071a2) {
                    c29823i0 = (C29823i0) objM813f;
                    C16636c2 c16636c3 = c26027a.f102971x;
                    List list2 = c26027a.f102961P;
                    List list3 = c26027a.f102958M;
                    if (c29823i0 != null) {
                        str = c29823i0.f121904w;
                    } else {
                        str = null;
                    }
                    C16756w2 c16756w2 = c26027a.f102973z;
                    String str3 = c26027a.f102968W;
                    this.f1147F = interfaceC2994c0;
                    this.f1152w = c26027a;
                    this.f1153x = interfaceC3018i0M8711e;
                    this.f1154y = interfaceC3018i0M8711e2;
                    interfaceC3018i0 = interfaceC3018i0M8711e2;
                    this.f1146E = 2;
                    i13 = 0;
                    abstractC0326t0 = abstractC0326t1;
                    c26027a2 = c26027a;
                    interfaceC2994c1 = interfaceC2994c0;
                    interfaceC3018i1 = interfaceC3018i0M8711e;
                    String str4 = str;
                    r14 = 0;
                    objM811d = C0274a0.m811d(c0274a0, this.f1149H, c16636c3, list2, list3, str4, c16756w2, str3, this);
                    if (objM811d != enumC31071a2) {
                        c26027a3 = c26027a2;
                        interfaceC3018i2 = interfaceC3018i1;
                        interfaceC3018i3 = interfaceC3018i0;
                        AbstractC34132o.m107864I(objM811d);
                        c38966u1 = (C38966u1) objM811d;
                        interfaceC38802c8 = c38966u1.f167738z;
                        c38957t1 = c38966u1.f167735w;
                        if (!interfaceC38802c8.mo124338q0()) {
                            c3705d = C3705d.f15155a;
                            r10 = C3707f.f15157a;
                            if (r10.equals(c3705d)) {
                                r15 = i13;
                            } else if (!r10.equals(C3706e.f15156a)) {
                                if (!r10.equals(r10)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (c38957t1 != null) {
                                    z4 = c38957t1.f167682G;
                                    r15 = z4;
                                } else {
                                    r15 = i13;
                                }
                            }
                        } else if (c38957t1 != null) {
                            z4 = c38957t1.f167682G;
                            r15 = z4;
                        } else {
                            r15 = i13;
                        }
                        if (r15 != 0) {
                            r15 = i19;
                            AbstractC3006f0.m8732z(interfaceC2994c1, r14, r14, new C0317p(c0274a0, r14, i13), 3);
                        }
                        r15 = i19;
                        c16636c2 = c26027a3.f102971x;
                        if (c16636c2 != null) {
                            r16 = c16636c2.f63985y;
                        } else {
                            r16 = r14;
                        }
                        if (r16 instanceof C16773z1) {
                            c38921p1 = c38966u1.f167723H;
                            if (c38921p1 != null) {
                                c0300j = new C0297i(c38921p1, ((C16773z1) r16).f64473w);
                                r17 = c0300j;
                            } else {
                                illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
                                C2326f c2326f = c0274a0.f944h;
                                EnumC2325e enumC2325e = EnumC2325e.PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND;
                                int i24 = StripeException.f22154E;
                                AbstractC35903f.m113990H(c2326f, enumC2325e, AbstractC32123d.m100024d(illegalStateException), r14, 4);
                                if (!c38966u1.f167738z.mo124338q0()) {
                                    throw illegalStateException;
                                }
                                r17 = r14;
                            }
                        } else if (r16 instanceof C16624a2) {
                            c0300j = new C0300j(c16636c2, (C16624a2) r16);
                            r17 = c0300j;
                        } else {
                            r17 = r14;
                        }
                        this.f1147F = interfaceC2994c1;
                        this.f1152w = c26027a3;
                        this.f1153x = interfaceC3018i2;
                        this.f1154y = c38966u1;
                        this.f1155z = r17;
                        i18 = 3;
                        this.f1146E = 3;
                        objM810c = C0274a0.m810c(c0274a0, c26027a3, c38966u1, interfaceC3018i3, this);
                        if (objM810c != enumC31071a2) {
                            InterfaceC2994c0 interfaceC2994c3 = interfaceC2994c1;
                            interfaceC3018i4 = interfaceC3018i2;
                            interfaceC2994c2 = interfaceC2994c3;
                            c38966u2 = c38966u1;
                            r18 = r17;
                            r19 = r14;
                            c26027a4 = c26027a3;
                            zBooleanValue = ((Boolean) objM810c).booleanValue();
                            c38966u3 = c38966u2;
                            c3022j0M8711e = AbstractC3006f0.m8711e(interfaceC2994c2, r19, new C0327u(c0274a0, c26027a4, zBooleanValue, c38966u3, (InterfaceC30057d) null), i18);
                            str2 = c38966u3.f167732Q;
                            interfaceC38802c9 = c38966u3.f167738z;
                            zMo124329X = interfaceC38802c9.mo124329X();
                            initializationMode = abstractC0326t0;
                            AbstractC22676k.m65750j(initializationMode, "initializationMode");
                            if (!(initializationMode instanceof C0316o0)) {
                                throw new C23464j("An operation is not implemented: CheckoutSession attribution not yet supported.");
                            }
                            if (!(initializationMode instanceof C0318p0) || (initializationMode instanceof C0320q0)) {
                                enumC38896m3 = EnumC38896m3.Deferred;
                            } else {
                                if (!(initializationMode instanceof C0322r0) && !(initializationMode instanceof C0324s0)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                enumC38896m3 = EnumC38896m3.Standard;
                            }
                            if (zMo124329X) {
                                enumC38979v5 = EnumC38979v5.Automatic;
                            } else {
                                enumC38979v5 = EnumC38979v5.MerchantSpecified;
                            }
                            ?? r25 = r18;
                            C38901n c38901n = new C38901n(str2, enumC38896m3, enumC38979v5, "22.6.1");
                            C33647p c33647p = c0274a0.f956t;
                            if (AbstractC22676k.m65745e(c38966u3.f167721F.get(EnumC38948s1.ELEMENTS_MOBILE_CARD_FUND_FILTERING), Boolean.TRUE)) {
                                list = c26027a4.f102960O;
                            } else {
                                c26027a4.getClass();
                                list = AbstractC21025a.f79600j;
                            }
                            c33647p.getClass();
                            List params = list;
                            AbstractC22676k.m65750j(params, "params");
                            C35475k0 c35475k0 = new C35475k0(params);
                            InterfaceC2994c0 interfaceC2994c4 = interfaceC2994c2;
                            InterfaceC3018i0 interfaceC3018i8 = interfaceC3018i4;
                            c0329v = this;
                            c0328u0 = c0328u1;
                            i14 = 0;
                            C0325t c0325t = new C0325t(AbstractC3006f0.m8711e(interfaceC2994c4, r19, new C0323s(c0274a0, c38966u3, c26027a4, r25, this.f1149H, c38901n, null, 0), 3), interfaceC3018i8, c0274a0, this.f1148G, c38966u3, r25, zBooleanValue, this.f1149H, c38901n, null);
                            c0274a0 = c0274a0;
                            C3022j0 c3022j0M8711e4 = AbstractC3006f0.m8711e(interfaceC2994c4, r19, c0325t, 3);
                            c3022j0M8711e2 = AbstractC3006f0.m8711e(interfaceC2994c4, r19, new C0319q(c0274a0, r25, c3022j0M8711e4, c3022j0M8711e, c26027a4, c35475k0, null), 3);
                            c3022j0M8711e3 = AbstractC3006f0.m8711e(interfaceC2994c4, r19, new C0321r(c0274a0, c3022j0M8711e, c3022j0M8711e4, c3022j0M8711e2, zBooleanValue, c26027a4, null), 3);
                            c0329v.f1147F = c26027a4;
                            c0329v.f1152w = c38966u3;
                            c0329v.f1153x = c3022j0M8711e2;
                            c0329v.f1154y = c3022j0M8711e3;
                            c0329v.f1155z = interfaceC38802c9;
                            c0329v.f1146E = 4;
                            objM8817m = c3022j0M8711e4.m8817m(c0329v);
                            enumC31071a = enumC31071a2;
                            if (objM8817m == enumC31071a) {
                                return enumC31071a;
                            }
                            interfaceC3018i5 = c3022j0M8711e2;
                            c38966u4 = c38966u3;
                            c26027a5 = c26027a4;
                            interfaceC3018i6 = c3022j0M8711e3;
                            interfaceC38802c10 = interfaceC38802c9;
                            r110 = r19;
                            c35459c0 = (C35459c0) objM8817m;
                            if (!interfaceC38802c10.mo124332g0().isEmpty()) {
                                c0274a0.f942f.m94514d(AbstractC33745d.m106654m("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: ", ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method", interfaceC38802c10.mo124332g0()));
                            }
                            if (c35459c0.m112535S().isEmpty()) {
                                throw new C0275a1(AbstractC25265s.m74110N0(interfaceC38802c10.mo124336p(), ", ", null, null, null, 62));
                            }
                            c0329v.f1147F = c38966u4;
                            c0329v.f1152w = interfaceC3018i6;
                            c0329v.f1153x = interfaceC38802c10;
                            c0329v.f1154y = c35459c0;
                            c0329v.f1155z = c26027a5;
                            c0329v.f1146E = 5;
                            objAwait = interfaceC3018i5.await(c0329v);
                            if (objAwait == enumC31071a) {
                                return enumC31071a;
                            }
                            C38966u1 c38966u6 = c38966u4;
                            interfaceC3018i7 = interfaceC3018i6;
                            c26027a6 = c26027a5;
                            c38966u5 = c38966u6;
                            c35459c1 = c35459c0;
                            interfaceC38802c11 = interfaceC38802c10;
                            r111 = r110;
                            c0273a = (C0273a) objAwait;
                            c0329v.f1147F = c38966u5;
                            c0329v.f1152w = interfaceC38802c11;
                            c0329v.f1153x = c35459c1;
                            c0329v.f1154y = c26027a6;
                            c0329v.f1155z = c0273a;
                            c0329v.f1146E = 6;
                            objAwait2 = interfaceC3018i7.await(c0329v);
                            if (objAwait2 == enumC31071a) {
                                return enumC31071a;
                            }
                            c0273a2 = c0273a;
                            interfaceC38802c12 = interfaceC38802c11;
                            r112 = r111;
                            c35459c2 = c35459c1;
                            C26027a c26027a7 = c26027a6;
                            C38966u1 elementsSession = c38966u5;
                            AbstractC29840y abstractC29840y = (AbstractC29840y) objAwait2;
                            AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                            try {
                                AbstractC35148d.m111161L(interfaceC38802c12);
                                objM107888l = interfaceC38802c12;
                                break;
                            } catch (Throwable th4) {
                                objM107888l = AbstractC34132o.m107888l(th4);
                            }
                            thM68037a = C23468n.m68037a(objM107888l);
                            if (thM68037a != null) {
                                M101059C = AbstractC32411b.m101059C(thM68037a);
                            } else {
                                M101059C = r112;
                            }
                            c0330v0 = new C0330v0(c26027a7, c0273a2, abstractC29840y, M101059C, c35459c2);
                            C17714c c17714c = c0274a0.f947k;
                            List listM118959K = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                            c17714c.getClass();
                            AbstractC22676k.m65750j(elementsSession, "elementsSession");
                            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c.f68865d), r112, r112, new C11194d(c17714c, elementsSession, c0330v0, listM118959K, (InterfaceC30057d) null, 9), 3);
                            boolean z14 = c0328u0.f1144a;
                            th3 = elementsSession.f167728M;
                            if (th3 != null) {
                                c22136a.getClass();
                                C22149n c22149n = new C22149n(th3);
                                ?? r26 = c22136a;
                                r26.m63389h(c22149n, r112);
                                r24 = r26;
                            } else {
                                r24 = c22136a;
                            }
                            if (c35459c2.f150996w.mo124334j0() || z14) {
                                i15 = i19;
                            } else {
                                i15 = i14;
                            }
                            if (M101059C == 0 && i15 != 0) {
                                r24.getClass();
                                r24.m63389h(new C22149n(((C3702a) r24.f85867e).m11527a(EnumC3703b.f15151w), M101059C, 5), r112);
                                return c0330v0;
                            }
                            r24.getClass();
                            InterfaceC3704c interfaceC3704c = r24.f85867e;
                            AbstractC35902e.m113963f0(interfaceC3704c, EnumC3703b.f15152x);
                            Duration durationM11527a = ((C3702a) interfaceC3704c).m11527a(EnumC3703b.f15151w);
                            ArrayList arrayListM112532J = c35459c2.m112532J();
                            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J, 10));
                            it = arrayListM112532J.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((C34378f) it.next()).f144467a);
                            }
                            r24.m63389h(new C22150o(abstractC29840y, arrayList, durationM11527a), c35459c2);
                            return c0330v0;
                        }
                    }
                }
                return enumC31071a2;
            case 1:
                interfaceC3018i0M8711e2 = (InterfaceC3018i0) this.f1154y;
                interfaceC3018i0M8711e = (InterfaceC3018i0) this.f1153x;
                c26027a = (C26027a) this.f1152w;
                interfaceC2994c0 = (InterfaceC2994c0) this.f1147F;
                AbstractC34132o.m107864I(obj);
                objM813f = obj;
                c29823i0 = (C29823i0) objM813f;
                C16636c2 c16636c4 = c26027a.f102971x;
                List list4 = c26027a.f102961P;
                List list5 = c26027a.f102958M;
                if (c29823i0 != null) {
                    str = c29823i0.f121904w;
                } else {
                    str = null;
                }
                C16756w2 c16756w3 = c26027a.f102973z;
                String str5 = c26027a.f102968W;
                this.f1147F = interfaceC2994c0;
                this.f1152w = c26027a;
                this.f1153x = interfaceC3018i0M8711e;
                this.f1154y = interfaceC3018i0M8711e2;
                interfaceC3018i0 = interfaceC3018i0M8711e2;
                this.f1146E = 2;
                i13 = 0;
                abstractC0326t0 = abstractC0326t1;
                c26027a2 = c26027a;
                interfaceC2994c1 = interfaceC2994c0;
                interfaceC3018i1 = interfaceC3018i0M8711e;
                String str6 = str;
                r14 = 0;
                objM811d = C0274a0.m811d(c0274a0, this.f1149H, c16636c4, list4, list5, str6, c16756w3, str5, this);
                if (objM811d != enumC31071a2) {
                    c26027a3 = c26027a2;
                    interfaceC3018i2 = interfaceC3018i1;
                    interfaceC3018i3 = interfaceC3018i0;
                    AbstractC34132o.m107864I(objM811d);
                    c38966u1 = (C38966u1) objM811d;
                    interfaceC38802c8 = c38966u1.f167738z;
                    c38957t1 = c38966u1.f167735w;
                    if (!interfaceC38802c8.mo124338q0()) {
                        c3705d = C3705d.f15155a;
                        r10 = C3707f.f15157a;
                        if (r10.equals(c3705d)) {
                            r15 = i13;
                        } else if (!r10.equals(C3706e.f15156a)) {
                            if (!r10.equals(r10)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (c38957t1 != null) {
                                z4 = c38957t1.f167682G;
                                r15 = z4;
                            } else {
                                r15 = i13;
                            }
                        }
                    } else if (c38957t1 != null) {
                        z4 = c38957t1.f167682G;
                        r15 = z4;
                    } else {
                        r15 = i13;
                    }
                    if (r15 != 0) {
                        r15 = i19;
                        AbstractC3006f0.m8732z(interfaceC2994c1, r14, r14, new C0317p(c0274a0, r14, i13), 3);
                    }
                    r15 = i19;
                    c16636c2 = c26027a3.f102971x;
                    if (c16636c2 != null) {
                        r16 = c16636c2.f63985y;
                    } else {
                        r16 = r14;
                    }
                    if (r16 instanceof C16773z1) {
                        c38921p1 = c38966u1.f167723H;
                        if (c38921p1 != null) {
                            c0300j = new C0297i(c38921p1, ((C16773z1) r16).f64473w);
                            r17 = c0300j;
                        } else {
                            illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
                            C2326f c2326f2 = c0274a0.f944h;
                            EnumC2325e enumC2325e2 = EnumC2325e.PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND;
                            int i25 = StripeException.f22154E;
                            AbstractC35903f.m113990H(c2326f2, enumC2325e2, AbstractC32123d.m100024d(illegalStateException), r14, 4);
                            if (!c38966u1.f167738z.mo124338q0()) {
                                throw illegalStateException;
                            }
                            r17 = r14;
                        }
                    } else if (r16 instanceof C16624a2) {
                        c0300j = new C0300j(c16636c2, (C16624a2) r16);
                        r17 = c0300j;
                    } else {
                        r17 = r14;
                    }
                    this.f1147F = interfaceC2994c1;
                    this.f1152w = c26027a3;
                    this.f1153x = interfaceC3018i2;
                    this.f1154y = c38966u1;
                    this.f1155z = r17;
                    i18 = 3;
                    this.f1146E = 3;
                    objM810c = C0274a0.m810c(c0274a0, c26027a3, c38966u1, interfaceC3018i3, this);
                    if (objM810c != enumC31071a2) {
                        InterfaceC2994c0 interfaceC2994c5 = interfaceC2994c1;
                        interfaceC3018i4 = interfaceC3018i2;
                        interfaceC2994c2 = interfaceC2994c5;
                        c38966u2 = c38966u1;
                        r18 = r17;
                        r19 = r14;
                        c26027a4 = c26027a3;
                        zBooleanValue = ((Boolean) objM810c).booleanValue();
                        c38966u3 = c38966u2;
                        c3022j0M8711e = AbstractC3006f0.m8711e(interfaceC2994c2, r19, new C0327u(c0274a0, c26027a4, zBooleanValue, c38966u3, (InterfaceC30057d) null), i18);
                        str2 = c38966u3.f167732Q;
                        interfaceC38802c9 = c38966u3.f167738z;
                        zMo124329X = interfaceC38802c9.mo124329X();
                        initializationMode = abstractC0326t0;
                        AbstractC22676k.m65750j(initializationMode, "initializationMode");
                        if (!(initializationMode instanceof C0316o0)) {
                            throw new C23464j("An operation is not implemented: CheckoutSession attribution not yet supported.");
                        }
                        if (initializationMode instanceof C0318p0) {
                            enumC38896m3 = EnumC38896m3.Deferred;
                        } else {
                            enumC38896m3 = EnumC38896m3.Deferred;
                        }
                        if (zMo124329X) {
                            enumC38979v5 = EnumC38979v5.Automatic;
                        } else {
                            enumC38979v5 = EnumC38979v5.MerchantSpecified;
                        }
                        ?? r27 = r18;
                        C38901n c38901n2 = new C38901n(str2, enumC38896m3, enumC38979v5, "22.6.1");
                        C33647p c33647p2 = c0274a0.f956t;
                        if (AbstractC22676k.m65745e(c38966u3.f167721F.get(EnumC38948s1.ELEMENTS_MOBILE_CARD_FUND_FILTERING), Boolean.TRUE)) {
                            list = c26027a4.f102960O;
                        } else {
                            c26027a4.getClass();
                            list = AbstractC21025a.f79600j;
                        }
                        c33647p2.getClass();
                        List params2 = list;
                        AbstractC22676k.m65750j(params2, "params");
                        C35475k0 c35475k1 = new C35475k0(params2);
                        InterfaceC2994c0 interfaceC2994c6 = interfaceC2994c2;
                        InterfaceC3018i0 interfaceC3018i9 = interfaceC3018i4;
                        c0329v = this;
                        c0328u0 = c0328u1;
                        i14 = 0;
                        C0325t c0325t2 = new C0325t(AbstractC3006f0.m8711e(interfaceC2994c6, r19, new C0323s(c0274a0, c38966u3, c26027a4, r27, this.f1149H, c38901n2, null, 0), 3), interfaceC3018i9, c0274a0, this.f1148G, c38966u3, r27, zBooleanValue, this.f1149H, c38901n2, null);
                        c0274a0 = c0274a0;
                        C3022j0 c3022j0M8711e5 = AbstractC3006f0.m8711e(interfaceC2994c6, r19, c0325t2, 3);
                        c3022j0M8711e2 = AbstractC3006f0.m8711e(interfaceC2994c6, r19, new C0319q(c0274a0, r27, c3022j0M8711e5, c3022j0M8711e, c26027a4, c35475k1, null), 3);
                        c3022j0M8711e3 = AbstractC3006f0.m8711e(interfaceC2994c6, r19, new C0321r(c0274a0, c3022j0M8711e, c3022j0M8711e5, c3022j0M8711e2, zBooleanValue, c26027a4, null), 3);
                        c0329v.f1147F = c26027a4;
                        c0329v.f1152w = c38966u3;
                        c0329v.f1153x = c3022j0M8711e2;
                        c0329v.f1154y = c3022j0M8711e3;
                        c0329v.f1155z = interfaceC38802c9;
                        c0329v.f1146E = 4;
                        objM8817m = c3022j0M8711e5.m8817m(c0329v);
                        enumC31071a = enumC31071a2;
                        if (objM8817m == enumC31071a) {
                            return enumC31071a;
                        }
                        interfaceC3018i5 = c3022j0M8711e2;
                        c38966u4 = c38966u3;
                        c26027a5 = c26027a4;
                        interfaceC3018i6 = c3022j0M8711e3;
                        interfaceC38802c10 = interfaceC38802c9;
                        r110 = r19;
                        c35459c0 = (C35459c0) objM8817m;
                        if (!interfaceC38802c10.mo124332g0().isEmpty()) {
                            c0274a0.f942f.m94514d(AbstractC33745d.m106654m("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: ", ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method", interfaceC38802c10.mo124332g0()));
                        }
                        if (c35459c0.m112535S().isEmpty()) {
                            throw new C0275a1(AbstractC25265s.m74110N0(interfaceC38802c10.mo124336p(), ", ", null, null, null, 62));
                        }
                        c0329v.f1147F = c38966u4;
                        c0329v.f1152w = interfaceC3018i6;
                        c0329v.f1153x = interfaceC38802c10;
                        c0329v.f1154y = c35459c0;
                        c0329v.f1155z = c26027a5;
                        c0329v.f1146E = 5;
                        objAwait = interfaceC3018i5.await(c0329v);
                        if (objAwait == enumC31071a) {
                            return enumC31071a;
                        }
                        C38966u1 c38966u7 = c38966u4;
                        interfaceC3018i7 = interfaceC3018i6;
                        c26027a6 = c26027a5;
                        c38966u5 = c38966u7;
                        c35459c1 = c35459c0;
                        interfaceC38802c11 = interfaceC38802c10;
                        r111 = r110;
                        c0273a = (C0273a) objAwait;
                        c0329v.f1147F = c38966u5;
                        c0329v.f1152w = interfaceC38802c11;
                        c0329v.f1153x = c35459c1;
                        c0329v.f1154y = c26027a6;
                        c0329v.f1155z = c0273a;
                        c0329v.f1146E = 6;
                        objAwait2 = interfaceC3018i7.await(c0329v);
                        if (objAwait2 == enumC31071a) {
                            return enumC31071a;
                        }
                        c0273a2 = c0273a;
                        interfaceC38802c12 = interfaceC38802c11;
                        r112 = r111;
                        c35459c2 = c35459c1;
                        C26027a c26027a8 = c26027a6;
                        C38966u1 elementsSession2 = c38966u5;
                        AbstractC29840y abstractC29840y2 = (AbstractC29840y) objAwait2;
                        AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                        AbstractC35148d.m111161L(interfaceC38802c12);
                        objM107888l = interfaceC38802c12;
                        thM68037a = C23468n.m68037a(objM107888l);
                        if (thM68037a != null) {
                            M101059C = AbstractC32411b.m101059C(thM68037a);
                        } else {
                            M101059C = r112;
                        }
                        c0330v0 = new C0330v0(c26027a8, c0273a2, abstractC29840y2, M101059C, c35459c2);
                        C17714c c17714c2 = c0274a0.f947k;
                        List listM118959K2 = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                        c17714c2.getClass();
                        AbstractC22676k.m65750j(elementsSession2, "elementsSession");
                        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c2.f68865d), r112, r112, new C11194d(c17714c2, elementsSession2, c0330v0, listM118959K2, (InterfaceC30057d) null, 9), 3);
                        boolean z15 = c0328u0.f1144a;
                        th3 = elementsSession2.f167728M;
                        if (th3 != null) {
                            c22136a.getClass();
                            C22149n c22149n2 = new C22149n(th3);
                            ?? r28 = c22136a;
                            r28.m63389h(c22149n2, r112);
                            r24 = r28;
                        } else {
                            r24 = c22136a;
                        }
                        if (c35459c2.f150996w.mo124334j0()) {
                            i15 = i19;
                        } else {
                            i15 = i19;
                        }
                        if (M101059C == 0) {
                        }
                        r24.getClass();
                        InterfaceC3704c interfaceC3704c2 = r24.f85867e;
                        AbstractC35902e.m113963f0(interfaceC3704c2, EnumC3703b.f15152x);
                        Duration durationM11527a2 = ((C3702a) interfaceC3704c2).m11527a(EnumC3703b.f15151w);
                        ArrayList arrayListM112532J2 = c35459c2.m112532J();
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J2, 10));
                        it = arrayListM112532J2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C34378f) it.next()).f144467a);
                        }
                        r24.m63389h(new C22150o(abstractC29840y2, arrayList, durationM11527a2), c35459c2);
                        return c0330v0;
                    }
                }
                return enumC31071a2;
            case 2:
                interfaceC3018i3 = (InterfaceC3018i0) this.f1154y;
                InterfaceC3018i0 interfaceC3018i10 = (InterfaceC3018i0) this.f1153x;
                C26027a c26027a9 = (C26027a) this.f1152w;
                InterfaceC2994c0 interfaceC2994c7 = (InterfaceC2994c0) this.f1147F;
                AbstractC34132o.m107864I(obj);
                abstractC0326t0 = abstractC0326t1;
                interfaceC2994c1 = interfaceC2994c7;
                objM811d = ((C23468n) obj).f92940w;
                i13 = 0;
                r14 = 0;
                c26027a3 = c26027a9;
                interfaceC3018i2 = interfaceC3018i10;
                AbstractC34132o.m107864I(objM811d);
                c38966u1 = (C38966u1) objM811d;
                interfaceC38802c8 = c38966u1.f167738z;
                c38957t1 = c38966u1.f167735w;
                if (!interfaceC38802c8.mo124338q0()) {
                    c3705d = C3705d.f15155a;
                    r10 = C3707f.f15157a;
                    if (r10.equals(c3705d)) {
                        r15 = i13;
                    } else if (!r10.equals(C3706e.f15156a)) {
                        if (!r10.equals(r10)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (c38957t1 != null) {
                            z4 = c38957t1.f167682G;
                            r15 = z4;
                        } else {
                            r15 = i13;
                        }
                    }
                } else if (c38957t1 != null) {
                    z4 = c38957t1.f167682G;
                    r15 = z4;
                } else {
                    r15 = i13;
                }
                if (r15 != 0) {
                    r15 = i19;
                    AbstractC3006f0.m8732z(interfaceC2994c1, r14, r14, new C0317p(c0274a0, r14, i13), 3);
                }
                r15 = i19;
                c16636c2 = c26027a3.f102971x;
                if (c16636c2 != null) {
                    r16 = c16636c2.f63985y;
                } else {
                    r16 = r14;
                }
                if (r16 instanceof C16773z1) {
                    c38921p1 = c38966u1.f167723H;
                    if (c38921p1 != null) {
                        c0300j = new C0297i(c38921p1, ((C16773z1) r16).f64473w);
                        r17 = c0300j;
                    } else {
                        illegalStateException = new IllegalStateException("Excepted 'customer' attribute as part of 'elements_session' response!");
                        C2326f c2326f3 = c0274a0.f944h;
                        EnumC2325e enumC2325e3 = EnumC2325e.PAYMENT_SHEET_LOADER_ELEMENTS_SESSION_CUSTOMER_NOT_FOUND;
                        int i26 = StripeException.f22154E;
                        AbstractC35903f.m113990H(c2326f3, enumC2325e3, AbstractC32123d.m100024d(illegalStateException), r14, 4);
                        if (!c38966u1.f167738z.mo124338q0()) {
                            throw illegalStateException;
                        }
                        r17 = r14;
                    }
                } else if (r16 instanceof C16624a2) {
                    c0300j = new C0300j(c16636c2, (C16624a2) r16);
                    r17 = c0300j;
                } else {
                    r17 = r14;
                }
                this.f1147F = interfaceC2994c1;
                this.f1152w = c26027a3;
                this.f1153x = interfaceC3018i2;
                this.f1154y = c38966u1;
                this.f1155z = r17;
                i18 = 3;
                this.f1146E = 3;
                objM810c = C0274a0.m810c(c0274a0, c26027a3, c38966u1, interfaceC3018i3, this);
                if (objM810c != enumC31071a2) {
                    InterfaceC2994c0 interfaceC2994c8 = interfaceC2994c1;
                    interfaceC3018i4 = interfaceC3018i2;
                    interfaceC2994c2 = interfaceC2994c8;
                    c38966u2 = c38966u1;
                    r18 = r17;
                    r19 = r14;
                    c26027a4 = c26027a3;
                    zBooleanValue = ((Boolean) objM810c).booleanValue();
                    c38966u3 = c38966u2;
                    c3022j0M8711e = AbstractC3006f0.m8711e(interfaceC2994c2, r19, new C0327u(c0274a0, c26027a4, zBooleanValue, c38966u3, (InterfaceC30057d) null), i18);
                    str2 = c38966u3.f167732Q;
                    interfaceC38802c9 = c38966u3.f167738z;
                    zMo124329X = interfaceC38802c9.mo124329X();
                    initializationMode = abstractC0326t0;
                    AbstractC22676k.m65750j(initializationMode, "initializationMode");
                    if (!(initializationMode instanceof C0316o0)) {
                        throw new C23464j("An operation is not implemented: CheckoutSession attribution not yet supported.");
                    }
                    if (initializationMode instanceof C0318p0) {
                        enumC38896m3 = EnumC38896m3.Deferred;
                    } else {
                        enumC38896m3 = EnumC38896m3.Deferred;
                    }
                    if (zMo124329X) {
                        enumC38979v5 = EnumC38979v5.Automatic;
                    } else {
                        enumC38979v5 = EnumC38979v5.MerchantSpecified;
                    }
                    ?? r29 = r18;
                    C38901n c38901n3 = new C38901n(str2, enumC38896m3, enumC38979v5, "22.6.1");
                    C33647p c33647p3 = c0274a0.f956t;
                    if (AbstractC22676k.m65745e(c38966u3.f167721F.get(EnumC38948s1.ELEMENTS_MOBILE_CARD_FUND_FILTERING), Boolean.TRUE)) {
                        list = c26027a4.f102960O;
                    } else {
                        c26027a4.getClass();
                        list = AbstractC21025a.f79600j;
                    }
                    c33647p3.getClass();
                    List params3 = list;
                    AbstractC22676k.m65750j(params3, "params");
                    C35475k0 c35475k2 = new C35475k0(params3);
                    InterfaceC2994c0 interfaceC2994c9 = interfaceC2994c2;
                    InterfaceC3018i0 interfaceC3018i11 = interfaceC3018i4;
                    c0329v = this;
                    c0328u0 = c0328u1;
                    i14 = 0;
                    C0325t c0325t3 = new C0325t(AbstractC3006f0.m8711e(interfaceC2994c9, r19, new C0323s(c0274a0, c38966u3, c26027a4, r29, this.f1149H, c38901n3, null, 0), 3), interfaceC3018i11, c0274a0, this.f1148G, c38966u3, r29, zBooleanValue, this.f1149H, c38901n3, null);
                    c0274a0 = c0274a0;
                    C3022j0 c3022j0M8711e6 = AbstractC3006f0.m8711e(interfaceC2994c9, r19, c0325t3, 3);
                    c3022j0M8711e2 = AbstractC3006f0.m8711e(interfaceC2994c9, r19, new C0319q(c0274a0, r29, c3022j0M8711e6, c3022j0M8711e, c26027a4, c35475k2, null), 3);
                    c3022j0M8711e3 = AbstractC3006f0.m8711e(interfaceC2994c9, r19, new C0321r(c0274a0, c3022j0M8711e, c3022j0M8711e6, c3022j0M8711e2, zBooleanValue, c26027a4, null), 3);
                    c0329v.f1147F = c26027a4;
                    c0329v.f1152w = c38966u3;
                    c0329v.f1153x = c3022j0M8711e2;
                    c0329v.f1154y = c3022j0M8711e3;
                    c0329v.f1155z = interfaceC38802c9;
                    c0329v.f1146E = 4;
                    objM8817m = c3022j0M8711e6.m8817m(c0329v);
                    enumC31071a = enumC31071a2;
                    if (objM8817m == enumC31071a) {
                        return enumC31071a;
                    }
                    interfaceC3018i5 = c3022j0M8711e2;
                    c38966u4 = c38966u3;
                    c26027a5 = c26027a4;
                    interfaceC3018i6 = c3022j0M8711e3;
                    interfaceC38802c10 = interfaceC38802c9;
                    r110 = r19;
                    c35459c0 = (C35459c0) objM8817m;
                    if (!interfaceC38802c10.mo124332g0().isEmpty()) {
                        c0274a0.f942f.m94514d(AbstractC33745d.m106654m("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: ", ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method", interfaceC38802c10.mo124332g0()));
                    }
                    if (c35459c0.m112535S().isEmpty()) {
                        throw new C0275a1(AbstractC25265s.m74110N0(interfaceC38802c10.mo124336p(), ", ", null, null, null, 62));
                    }
                    c0329v.f1147F = c38966u4;
                    c0329v.f1152w = interfaceC3018i6;
                    c0329v.f1153x = interfaceC38802c10;
                    c0329v.f1154y = c35459c0;
                    c0329v.f1155z = c26027a5;
                    c0329v.f1146E = 5;
                    objAwait = interfaceC3018i5.await(c0329v);
                    if (objAwait == enumC31071a) {
                        return enumC31071a;
                    }
                    C38966u1 c38966u8 = c38966u4;
                    interfaceC3018i7 = interfaceC3018i6;
                    c26027a6 = c26027a5;
                    c38966u5 = c38966u8;
                    c35459c1 = c35459c0;
                    interfaceC38802c11 = interfaceC38802c10;
                    r111 = r110;
                    c0273a = (C0273a) objAwait;
                    c0329v.f1147F = c38966u5;
                    c0329v.f1152w = interfaceC38802c11;
                    c0329v.f1153x = c35459c1;
                    c0329v.f1154y = c26027a6;
                    c0329v.f1155z = c0273a;
                    c0329v.f1146E = 6;
                    objAwait2 = interfaceC3018i7.await(c0329v);
                    if (objAwait2 == enumC31071a) {
                        return enumC31071a;
                    }
                    c0273a2 = c0273a;
                    interfaceC38802c12 = interfaceC38802c11;
                    r112 = r111;
                    c35459c2 = c35459c1;
                    C26027a c26027a10 = c26027a6;
                    C38966u1 elementsSession3 = c38966u5;
                    AbstractC29840y abstractC29840y3 = (AbstractC29840y) objAwait2;
                    AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                    AbstractC35148d.m111161L(interfaceC38802c12);
                    objM107888l = interfaceC38802c12;
                    thM68037a = C23468n.m68037a(objM107888l);
                    if (thM68037a != null) {
                        M101059C = AbstractC32411b.m101059C(thM68037a);
                    } else {
                        M101059C = r112;
                    }
                    c0330v0 = new C0330v0(c26027a10, c0273a2, abstractC29840y3, M101059C, c35459c2);
                    C17714c c17714c3 = c0274a0.f947k;
                    List listM118959K3 = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                    c17714c3.getClass();
                    AbstractC22676k.m65750j(elementsSession3, "elementsSession");
                    AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c3.f68865d), r112, r112, new C11194d(c17714c3, elementsSession3, c0330v0, listM118959K3, (InterfaceC30057d) null, 9), 3);
                    boolean z16 = c0328u0.f1144a;
                    th3 = elementsSession3.f167728M;
                    if (th3 != null) {
                        c22136a.getClass();
                        C22149n c22149n3 = new C22149n(th3);
                        ?? r210 = c22136a;
                        r210.m63389h(c22149n3, r112);
                        r24 = r210;
                    } else {
                        r24 = c22136a;
                    }
                    if (c35459c2.f150996w.mo124334j0()) {
                        i15 = i19;
                    } else {
                        i15 = i19;
                    }
                    if (M101059C == 0) {
                    }
                    r24.getClass();
                    InterfaceC3704c interfaceC3704c3 = r24.f85867e;
                    AbstractC35902e.m113963f0(interfaceC3704c3, EnumC3703b.f15152x);
                    Duration durationM11527a3 = ((C3702a) interfaceC3704c3).m11527a(EnumC3703b.f15151w);
                    ArrayList arrayListM112532J3 = c35459c2.m112532J();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J3, 10));
                    it = arrayListM112532J3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C34378f) it.next()).f144467a);
                    }
                    r24.m63389h(new C22150o(abstractC29840y3, arrayList, durationM11527a3), c35459c2);
                    return c0330v0;
                }
                return enumC31071a2;
            case 3:
                InterfaceC0303k interfaceC0303k = (InterfaceC0303k) this.f1155z;
                C38966u1 c38966u9 = (C38966u1) this.f1154y;
                InterfaceC3018i0 interfaceC3018i12 = (InterfaceC3018i0) this.f1153x;
                c26027a3 = (C26027a) this.f1152w;
                InterfaceC2994c0 interfaceC2994c10 = (InterfaceC2994c0) this.f1147F;
                AbstractC34132o.m107864I(obj);
                abstractC0326t0 = abstractC0326t1;
                i19 = 1;
                c38966u2 = c38966u9;
                interfaceC3018i4 = interfaceC3018i12;
                c0328u1 = c0328u1;
                interfaceC2994c2 = interfaceC2994c10;
                r18 = interfaceC0303k;
                r19 = 0;
                objM810c = obj;
                c26027a4 = c26027a3;
                zBooleanValue = ((Boolean) objM810c).booleanValue();
                c38966u3 = c38966u2;
                c3022j0M8711e = AbstractC3006f0.m8711e(interfaceC2994c2, r19, new C0327u(c0274a0, c26027a4, zBooleanValue, c38966u3, (InterfaceC30057d) null), i18);
                str2 = c38966u3.f167732Q;
                interfaceC38802c9 = c38966u3.f167738z;
                zMo124329X = interfaceC38802c9.mo124329X();
                initializationMode = abstractC0326t0;
                AbstractC22676k.m65750j(initializationMode, "initializationMode");
                if (!(initializationMode instanceof C0316o0)) {
                    throw new C23464j("An operation is not implemented: CheckoutSession attribution not yet supported.");
                }
                if (initializationMode instanceof C0318p0) {
                    enumC38896m3 = EnumC38896m3.Deferred;
                } else {
                    enumC38896m3 = EnumC38896m3.Deferred;
                }
                if (zMo124329X) {
                    enumC38979v5 = EnumC38979v5.Automatic;
                } else {
                    enumC38979v5 = EnumC38979v5.MerchantSpecified;
                }
                ?? r211 = r18;
                C38901n c38901n4 = new C38901n(str2, enumC38896m3, enumC38979v5, "22.6.1");
                C33647p c33647p4 = c0274a0.f956t;
                if (AbstractC22676k.m65745e(c38966u3.f167721F.get(EnumC38948s1.ELEMENTS_MOBILE_CARD_FUND_FILTERING), Boolean.TRUE)) {
                    list = c26027a4.f102960O;
                } else {
                    c26027a4.getClass();
                    list = AbstractC21025a.f79600j;
                }
                c33647p4.getClass();
                List params4 = list;
                AbstractC22676k.m65750j(params4, "params");
                C35475k0 c35475k3 = new C35475k0(params4);
                InterfaceC2994c0 interfaceC2994c11 = interfaceC2994c2;
                InterfaceC3018i0 interfaceC3018i13 = interfaceC3018i4;
                c0329v = this;
                c0328u0 = c0328u1;
                i14 = 0;
                C0325t c0325t4 = new C0325t(AbstractC3006f0.m8711e(interfaceC2994c11, r19, new C0323s(c0274a0, c38966u3, c26027a4, r211, this.f1149H, c38901n4, null, 0), 3), interfaceC3018i13, c0274a0, this.f1148G, c38966u3, r211, zBooleanValue, this.f1149H, c38901n4, null);
                c0274a0 = c0274a0;
                C3022j0 c3022j0M8711e7 = AbstractC3006f0.m8711e(interfaceC2994c11, r19, c0325t4, 3);
                c3022j0M8711e2 = AbstractC3006f0.m8711e(interfaceC2994c11, r19, new C0319q(c0274a0, r211, c3022j0M8711e7, c3022j0M8711e, c26027a4, c35475k3, null), 3);
                c3022j0M8711e3 = AbstractC3006f0.m8711e(interfaceC2994c11, r19, new C0321r(c0274a0, c3022j0M8711e, c3022j0M8711e7, c3022j0M8711e2, zBooleanValue, c26027a4, null), 3);
                c0329v.f1147F = c26027a4;
                c0329v.f1152w = c38966u3;
                c0329v.f1153x = c3022j0M8711e2;
                c0329v.f1154y = c3022j0M8711e3;
                c0329v.f1155z = interfaceC38802c9;
                c0329v.f1146E = 4;
                objM8817m = c3022j0M8711e7.m8817m(c0329v);
                enumC31071a = enumC31071a2;
                if (objM8817m == enumC31071a) {
                    return enumC31071a;
                }
                interfaceC3018i5 = c3022j0M8711e2;
                c38966u4 = c38966u3;
                c26027a5 = c26027a4;
                interfaceC3018i6 = c3022j0M8711e3;
                interfaceC38802c10 = interfaceC38802c9;
                r110 = r19;
                c35459c0 = (C35459c0) objM8817m;
                if (!interfaceC38802c10.mo124332g0().isEmpty()) {
                    c0274a0.f942f.m94514d(AbstractC33745d.m106654m("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: ", ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method", interfaceC38802c10.mo124332g0()));
                }
                if (c35459c0.m112535S().isEmpty()) {
                    throw new C0275a1(AbstractC25265s.m74110N0(interfaceC38802c10.mo124336p(), ", ", null, null, null, 62));
                }
                c0329v.f1147F = c38966u4;
                c0329v.f1152w = interfaceC3018i6;
                c0329v.f1153x = interfaceC38802c10;
                c0329v.f1154y = c35459c0;
                c0329v.f1155z = c26027a5;
                c0329v.f1146E = 5;
                objAwait = interfaceC3018i5.await(c0329v);
                if (objAwait == enumC31071a) {
                    return enumC31071a;
                }
                C38966u1 c38966u10 = c38966u4;
                interfaceC3018i7 = interfaceC3018i6;
                c26027a6 = c26027a5;
                c38966u5 = c38966u10;
                c35459c1 = c35459c0;
                interfaceC38802c11 = interfaceC38802c10;
                r111 = r110;
                c0273a = (C0273a) objAwait;
                c0329v.f1147F = c38966u5;
                c0329v.f1152w = interfaceC38802c11;
                c0329v.f1153x = c35459c1;
                c0329v.f1154y = c26027a6;
                c0329v.f1155z = c0273a;
                c0329v.f1146E = 6;
                objAwait2 = interfaceC3018i7.await(c0329v);
                if (objAwait2 == enumC31071a) {
                    return enumC31071a;
                }
                c0273a2 = c0273a;
                interfaceC38802c12 = interfaceC38802c11;
                r112 = r111;
                c35459c2 = c35459c1;
                C26027a c26027a11 = c26027a6;
                C38966u1 elementsSession4 = c38966u5;
                AbstractC29840y abstractC29840y4 = (AbstractC29840y) objAwait2;
                AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                AbstractC35148d.m111161L(interfaceC38802c12);
                objM107888l = interfaceC38802c12;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    M101059C = AbstractC32411b.m101059C(thM68037a);
                } else {
                    M101059C = r112;
                }
                c0330v0 = new C0330v0(c26027a11, c0273a2, abstractC29840y4, M101059C, c35459c2);
                C17714c c17714c4 = c0274a0.f947k;
                List listM118959K4 = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                c17714c4.getClass();
                AbstractC22676k.m65750j(elementsSession4, "elementsSession");
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c4.f68865d), r112, r112, new C11194d(c17714c4, elementsSession4, c0330v0, listM118959K4, (InterfaceC30057d) null, 9), 3);
                boolean z17 = c0328u0.f1144a;
                th3 = elementsSession4.f167728M;
                if (th3 != null) {
                    c22136a.getClass();
                    C22149n c22149n4 = new C22149n(th3);
                    ?? r212 = c22136a;
                    r212.m63389h(c22149n4, r112);
                    r24 = r212;
                } else {
                    r24 = c22136a;
                }
                if (c35459c2.f150996w.mo124334j0()) {
                    i15 = i19;
                } else {
                    i15 = i19;
                }
                if (M101059C == 0) {
                }
                r24.getClass();
                InterfaceC3704c interfaceC3704c4 = r24.f85867e;
                AbstractC35902e.m113963f0(interfaceC3704c4, EnumC3703b.f15152x);
                Duration durationM11527a4 = ((C3702a) interfaceC3704c4).m11527a(EnumC3703b.f15151w);
                ArrayList arrayListM112532J4 = c35459c2.m112532J();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J4, 10));
                it = arrayListM112532J4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34378f) it.next()).f144467a);
                }
                r24.m63389h(new C22150o(abstractC29840y4, arrayList, durationM11527a4), c35459c2);
                return c0330v0;
            case 4:
                InterfaceC38802c8 interfaceC38802c13 = (InterfaceC38802c8) this.f1155z;
                interfaceC3018i6 = (InterfaceC3018i0) this.f1154y;
                interfaceC3018i5 = (InterfaceC3018i0) this.f1153x;
                c38966u4 = (C38966u1) this.f1152w;
                c26027a5 = (C26027a) this.f1147F;
                AbstractC34132o.m107864I(obj);
                i19 = 1;
                i14 = 0;
                r110 = 0;
                c0329v = this;
                c0328u0 = c0328u1;
                enumC31071a = enumC31071a2;
                objM8817m = obj;
                interfaceC38802c10 = interfaceC38802c13;
                c35459c0 = (C35459c0) objM8817m;
                if (!interfaceC38802c10.mo124332g0().isEmpty()) {
                    c0274a0.f942f.m94514d(AbstractC33745d.m106654m("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: ", ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method", interfaceC38802c10.mo124332g0()));
                }
                if (c35459c0.m112535S().isEmpty()) {
                    throw new C0275a1(AbstractC25265s.m74110N0(interfaceC38802c10.mo124336p(), ", ", null, null, null, 62));
                }
                c0329v.f1147F = c38966u4;
                c0329v.f1152w = interfaceC3018i6;
                c0329v.f1153x = interfaceC38802c10;
                c0329v.f1154y = c35459c0;
                c0329v.f1155z = c26027a5;
                c0329v.f1146E = 5;
                objAwait = interfaceC3018i5.await(c0329v);
                if (objAwait == enumC31071a) {
                    return enumC31071a;
                }
                C38966u1 c38966u11 = c38966u4;
                interfaceC3018i7 = interfaceC3018i6;
                c26027a6 = c26027a5;
                c38966u5 = c38966u11;
                c35459c1 = c35459c0;
                interfaceC38802c11 = interfaceC38802c10;
                r111 = r110;
                c0273a = (C0273a) objAwait;
                c0329v.f1147F = c38966u5;
                c0329v.f1152w = interfaceC38802c11;
                c0329v.f1153x = c35459c1;
                c0329v.f1154y = c26027a6;
                c0329v.f1155z = c0273a;
                c0329v.f1146E = 6;
                objAwait2 = interfaceC3018i7.await(c0329v);
                if (objAwait2 == enumC31071a) {
                    return enumC31071a;
                }
                c0273a2 = c0273a;
                interfaceC38802c12 = interfaceC38802c11;
                r112 = r111;
                c35459c2 = c35459c1;
                C26027a c26027a12 = c26027a6;
                C38966u1 elementsSession5 = c38966u5;
                AbstractC29840y abstractC29840y5 = (AbstractC29840y) objAwait2;
                AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                AbstractC35148d.m111161L(interfaceC38802c12);
                objM107888l = interfaceC38802c12;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    M101059C = AbstractC32411b.m101059C(thM68037a);
                } else {
                    M101059C = r112;
                }
                c0330v0 = new C0330v0(c26027a12, c0273a2, abstractC29840y5, M101059C, c35459c2);
                C17714c c17714c5 = c0274a0.f947k;
                List listM118959K5 = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                c17714c5.getClass();
                AbstractC22676k.m65750j(elementsSession5, "elementsSession");
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c5.f68865d), r112, r112, new C11194d(c17714c5, elementsSession5, c0330v0, listM118959K5, (InterfaceC30057d) null, 9), 3);
                boolean z18 = c0328u0.f1144a;
                th3 = elementsSession5.f167728M;
                if (th3 != null) {
                    c22136a.getClass();
                    C22149n c22149n5 = new C22149n(th3);
                    ?? r213 = c22136a;
                    r213.m63389h(c22149n5, r112);
                    r24 = r213;
                } else {
                    r24 = c22136a;
                }
                if (c35459c2.f150996w.mo124334j0()) {
                    i15 = i19;
                } else {
                    i15 = i19;
                }
                if (M101059C == 0) {
                }
                r24.getClass();
                InterfaceC3704c interfaceC3704c5 = r24.f85867e;
                AbstractC35902e.m113963f0(interfaceC3704c5, EnumC3703b.f15152x);
                Duration durationM11527a5 = ((C3702a) interfaceC3704c5).m11527a(EnumC3703b.f15151w);
                ArrayList arrayListM112532J5 = c35459c2.m112532J();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J5, 10));
                it = arrayListM112532J5.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34378f) it.next()).f144467a);
                }
                r24.m63389h(new C22150o(abstractC29840y5, arrayList, durationM11527a5), c35459c2);
                return c0330v0;
            case 5:
                C26027a c26027a13 = (C26027a) this.f1155z;
                C35459c0 c35459c3 = (C35459c0) this.f1154y;
                InterfaceC38802c8 interfaceC38802c14 = (InterfaceC38802c8) this.f1153x;
                interfaceC3018i7 = (InterfaceC3018i0) this.f1152w;
                c38966u5 = (C38966u1) this.f1147F;
                AbstractC34132o.m107864I(obj);
                c26027a6 = c26027a13;
                interfaceC38802c11 = interfaceC38802c14;
                c35459c1 = c35459c3;
                i19 = 1;
                i14 = 0;
                r111 = 0;
                c0329v = this;
                c0328u0 = c0328u1;
                c22136a = c22136a;
                enumC31071a = enumC31071a2;
                objAwait = obj;
                c0273a = (C0273a) objAwait;
                c0329v.f1147F = c38966u5;
                c0329v.f1152w = interfaceC38802c11;
                c0329v.f1153x = c35459c1;
                c0329v.f1154y = c26027a6;
                c0329v.f1155z = c0273a;
                c0329v.f1146E = 6;
                objAwait2 = interfaceC3018i7.await(c0329v);
                if (objAwait2 == enumC31071a) {
                    return enumC31071a;
                }
                c0273a2 = c0273a;
                interfaceC38802c12 = interfaceC38802c11;
                r112 = r111;
                c35459c2 = c35459c1;
                C26027a c26027a14 = c26027a6;
                C38966u1 elementsSession6 = c38966u5;
                AbstractC29840y abstractC29840y6 = (AbstractC29840y) objAwait2;
                AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                AbstractC35148d.m111161L(interfaceC38802c12);
                objM107888l = interfaceC38802c12;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    M101059C = AbstractC32411b.m101059C(thM68037a);
                } else {
                    M101059C = r112;
                }
                c0330v0 = new C0330v0(c26027a14, c0273a2, abstractC29840y6, M101059C, c35459c2);
                C17714c c17714c6 = c0274a0.f947k;
                List listM118959K6 = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                c17714c6.getClass();
                AbstractC22676k.m65750j(elementsSession6, "elementsSession");
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c6.f68865d), r112, r112, new C11194d(c17714c6, elementsSession6, c0330v0, listM118959K6, (InterfaceC30057d) null, 9), 3);
                boolean z19 = c0328u0.f1144a;
                th3 = elementsSession6.f167728M;
                if (th3 != null) {
                    c22136a.getClass();
                    C22149n c22149n6 = new C22149n(th3);
                    ?? r214 = c22136a;
                    r214.m63389h(c22149n6, r112);
                    r24 = r214;
                } else {
                    r24 = c22136a;
                }
                if (c35459c2.f150996w.mo124334j0()) {
                    i15 = i19;
                } else {
                    i15 = i19;
                }
                if (M101059C == 0) {
                }
                r24.getClass();
                InterfaceC3704c interfaceC3704c6 = r24.f85867e;
                AbstractC35902e.m113963f0(interfaceC3704c6, EnumC3703b.f15152x);
                Duration durationM11527a6 = ((C3702a) interfaceC3704c6).m11527a(EnumC3703b.f15151w);
                ArrayList arrayListM112532J6 = c35459c2.m112532J();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J6, 10));
                it = arrayListM112532J6.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34378f) it.next()).f144467a);
                }
                r24.m63389h(new C22150o(abstractC29840y6, arrayList, durationM11527a6), c35459c2);
                return c0330v0;
            case 6:
                C0273a c0273a3 = (C0273a) this.f1155z;
                c26027a6 = (C26027a) this.f1154y;
                c35459c1 = (C35459c0) this.f1153x;
                InterfaceC38802c8 interfaceC38802c15 = (InterfaceC38802c8) this.f1152w;
                c38966u5 = (C38966u1) this.f1147F;
                AbstractC34132o.m107864I(obj);
                c0273a2 = c0273a3;
                interfaceC38802c12 = interfaceC38802c15;
                i19 = 1;
                i14 = 0;
                r112 = 0;
                c0328u0 = c0328u1;
                c22136a = c22136a;
                objAwait2 = obj;
                c35459c2 = c35459c1;
                C26027a c26027a15 = c26027a6;
                C38966u1 elementsSession7 = c38966u5;
                AbstractC29840y abstractC29840y7 = (AbstractC29840y) objAwait2;
                AbstractC22676k.m65750j(interfaceC38802c12, "<this>");
                AbstractC35148d.m111161L(interfaceC38802c12);
                objM107888l = interfaceC38802c12;
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a != null) {
                    M101059C = AbstractC32411b.m101059C(thM68037a);
                } else {
                    M101059C = r112;
                }
                c0330v0 = new C0330v0(c26027a15, c0273a2, abstractC29840y7, M101059C, c35459c2);
                C17714c c17714c7 = c0274a0.f947k;
                List listM118959K7 = AbstractC37056f.m118959K(EnumC38930q1.LINK_GLOBAL_HOLD_BACK, EnumC38930q1.LINK_GLOBAL_HOLD_BACK_AA, EnumC38930q1.LINK_AB_TEST);
                c17714c7.getClass();
                AbstractC22676k.m65750j(elementsSession7, "elementsSession");
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c17714c7.f68865d), r112, r112, new C11194d(c17714c7, elementsSession7, c0330v0, listM118959K7, (InterfaceC30057d) null, 9), 3);
                boolean z110 = c0328u0.f1144a;
                th3 = elementsSession7.f167728M;
                if (th3 != null) {
                    c22136a.getClass();
                    C22149n c22149n7 = new C22149n(th3);
                    ?? r215 = c22136a;
                    r215.m63389h(c22149n7, r112);
                    r24 = r215;
                } else {
                    r24 = c22136a;
                }
                if (c35459c2.f150996w.mo124334j0()) {
                    i15 = i19;
                } else {
                    i15 = i19;
                }
                if (M101059C == 0) {
                }
                r24.getClass();
                InterfaceC3704c interfaceC3704c7 = r24.f85867e;
                AbstractC35902e.m113963f0(interfaceC3704c7, EnumC3703b.f15152x);
                Duration durationM11527a7 = ((C3702a) interfaceC3704c7).m11527a(EnumC3703b.f15151w);
                ArrayList arrayListM112532J7 = c35459c2.m112532J();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J7, 10));
                it = arrayListM112532J7.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C34378f) it.next()).f144467a);
                }
                r24.m63389h(new C22150o(abstractC29840y7, arrayList, durationM11527a7), c35459c2);
                return c0330v0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
