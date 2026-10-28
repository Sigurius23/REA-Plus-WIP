package v80;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import b30.C2564l1;
import bc3.InterfaceC2994c0;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C10965i;
import d42.C11690f;
import d70.C11751e;
import gz0.AbstractC16319p0;
import h80.InterfaceC17002b;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j80.InterfaceC21413a;
import j93.InterfaceC21493z;
import kd1.AbstractC22403o;
import l80.AbstractC23438o;
import l83.C23454a0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p042c2.C3862g;
import p042c2.C3870o;
import p042c2.InterfaceC3871p;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p40.C28827b;
import p412q3.C29871f0;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p505ts.AbstractC34132o;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p706eo0.AbstractC13372c;
import p714k80.AbstractC22273b;
import p714k80.AbstractC22288q;
import p714k80.AbstractC22290s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import p745y81.C39336i;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t80.C33592b;
import te0.AbstractC33745d;
import uf0.C34904e;
import v01.C35509k;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;

/* JADX INFO: renamed from: v80.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\f\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u0013²\u0006\u000e\u0010\u000e\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0011\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lv80/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Lv80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onClick", "", "buttonText", "C", "(Lc93/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "passwordValue", "", "hidePassword", "isKeyboardOpen", "textFieldFocusedAtLeastOnce", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35794b {

    /* JADX INFO: renamed from: v80.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.createpassword.CreatePasswordScreenKt$CreatePasswordScreenView$2$1", m100430f = "CreatePasswordScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152244w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f152245x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C35795c f152246y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C35795c c35795c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152245x = function1;
            this.f152246y = c35795c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f152245x, this.f152246y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152244w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f152245x.invoke(this.f152246y.getIsButtonEnabled() ? EnumC3921e.ENABLE : EnumC3921e.DISABLE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v80.b$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f152247w = new b();

        /* JADX INFO: renamed from: a */
        public final long m113482a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m113482a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: v80.b$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f152248w = new c();

        /* JADX INFO: renamed from: a */
        public final long m113483a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m113483a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: A */
    private static final boolean m113451A(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: B */
    private static final boolean m113452B(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m113453C(InterfaceC4339a interfaceC4339a, String str, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-924826373);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            interfaceC4339a2 = interfaceC4339a;
            AbstractC12350b.m34583d(interfaceC4339a2, null, false, null, null, null, null, AbstractC37817c.m121344e(-1310103010, c28655q, new C11690f(str, 4)), c28655q, (i14 & 14) | 805306368, 510);
        } else {
            interfaceC4339a2 = interfaceC4339a;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10965i(i13, str, interfaceC4339a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m113454D(String str, InterfaceC22997s1 TextButton, Composer composer, int i13) {
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b(str, null, 0L, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, C23285v0.m67363a(C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getBtS().getStyle(), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4278227943L)), new C17919x(AbstractC17918w0.m51517e(4283210713L)), new C17919x(AbstractC17918w0.m51517e(4284923135L))), 0L, 0L, 14), 0L, null, null, 0L, 33554430), c28655q, 0, 0, 65022);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m113455E(InterfaceC4339a interfaceC4339a, String str, int i13, Composer composer, int i14) {
        m113453C(interfaceC4339a, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:113:0x031b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0325  */
    /* JADX WARN: Code duplicated, block: B:124:0x037e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0384  */
    /* JADX WARN: Code duplicated, block: B:130:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:146:0x043c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0451  */
    /* JADX WARN: Code duplicated, block: B:150:0x0467  */
    /* JADX WARN: Code duplicated, block: B:167:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:170:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:171:0x05be  */
    /* JADX WARN: Code duplicated, block: B:174:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:180:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:183:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code duplicated, block: B:64:0x018d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x0203  */
    /* JADX WARN: Code duplicated, block: B:82:0x0226  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Code duplicated, block: B:89:0x0242  */
    /* JADX WARN: Code duplicated, block: B:92:0x0249  */
    /* JADX WARN: Code duplicated, block: B:93:0x026a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0279  */
    /* JADX WARN: Code duplicated, block: B:99:0x0290  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r20v0, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r2v43, types: [iz0.l] */
    /* JADX WARN: Type inference failed for: r4v25, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v17, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r5v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public static final void m113467l(C35795c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        ?? r10;
        C28677v1 c28677v1M87180u;
        int i16;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28670t2 interfaceC28670t2M64044h;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC15237i interfaceC15237i;
        int i17;
        boolean z13;
        boolean zM87157i;
        Object objM87133R4;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        Function1 function4;
        C0209i c0209i;
        C28676v0 c28676v1;
        float f13;
        int iHashCode2;
        InterfaceC28601c1 interfaceC28601c3;
        C28655q c28655q;
        boolean zIsEmpty;
        long jM125392f;
        boolean z14;
        Object objM87133R5;
        char c3;
        Object objM87133R6;
        Object objM87133R7;
        InterfaceC29873g0 c29885s;
        AbstractC30784c.a aVar;
        AbstractC30784c.a aVar2;
        boolean zM87157i2;
        Object objM87133R8;
        boolean z15;
        boolean zM87157i3;
        Object objM87133R9;
        boolean z16;
        Object objM87133R10;
        ?? r24;
        Object obj;
        float f14;
        ?? r14;
        C35795c c35795c;
        int i18;
        Function1 function5;
        Object obj2;
        Function1 function6;
        int i19;
        boolean z17;
        Function1 function7;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object objM87133R11;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(834946804);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                i16 = 21;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35509k(i16);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    function3 = (Function1) objM87133R11;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(viewState.getPasswordPrefill().getValue());
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
                interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q2, 0);
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
                Boolean boolValueOf = Boolean.valueOf(viewState.getIsButtonEnabled());
                i17 = i15 & 112;
                if (i17 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(viewState);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new a(function3, viewState, null);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf);
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                function4 = function3;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    float f15 = 8;
                    f13 = 2 * f15;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f13, 7 * f15, f13, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    if (m113451A(interfaceC28670t2M64044h)) {
                        interfaceC28601c3 = interfaceC28601c2;
                        c28655q = c28655q2;
                        c28655q.m87150e0(747475698);
                        c28655q.m87173q(false);
                    } else {
                        c28655q2.m87150e0(747282537);
                        interfaceC28601c3 = interfaceC28601c2;
                        c28655q = c28655q2;
                        AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                        c28655q.m87173q(false);
                    }
                    zIsEmpty = viewState.m113495m().isEmpty();
                    if (zIsEmpty || !m113452B(interfaceC28601c3) || viewState.getIsButtonEnabled()) {
                        c28655q.m87150e0(747833345);
                        c28655q.m87173q(false);
                        jM125392f = C17919x.f69636m;
                    } else {
                        c28655q.m87150e0(747759565);
                        jM125392f = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentNegativeTrend();
                        c28655q.m87173q(false);
                    }
                    if (zIsEmpty || !m113452B(interfaceC28601c3) || viewState.getIsButtonEnabled()) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v1) {
                        c3 = '\f';
                        objM87133R5 = new TextResource.C8688b(AbstractC38022b.f162876Q, new TextResource.AbstractC8690d.b(12));
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        c3 = '\f';
                    }
                    TextResource.C8688b c8688b = (TextResource.C8688b) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v1) {
                        objM87133R6 = new C35509k(22);
                        c28655q.m87172p0(objM87133R6);
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R6);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v1) {
                        objM87133R7 = new C29802c(21, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Modifier modifierM3484c = AbstractC1126a.m3484c(modifierM51775c, (Function1) objM87133R7);
                    float f16 = 4;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3484c, 0.0f, f16 * f15, 0.0f, 0.0f, 13);
                    TextResource textResourceM113490h = viewState.getHint();
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(m113478w(r24));
                    if (m113480y(r21)) {
                        c29885s = new C29885s();
                    } else {
                        c29885s = C29871f0.f122092w;
                    }
                    if (m113478w(r24).length() > 0 || !m113480y(interfaceC28601c4)) {
                        if (m113478w(r24).length() > 0 || m113480y(r21)) {
                            c28655q.m87150e0(749433037);
                            c28655q.m87173q(false);
                            aVar = null;
                        } else {
                            c28655q.m87150e0(855452057);
                            int iM46334f0 = C38072d.f163053a.m121951d().getVarious().getStealthMode();
                            C39174f c39174f = new C39174f(f16 * f16);
                            Object objM87133R12 = c28655q.m87133R();
                            if (objM87133R12 == c28676v1) {
                                objM87133R12 = c.f152248w;
                                c28655q.m87172p0(objM87133R12);
                            }
                            aVar2 = new AbstractC30784c.a(iM46334f0, c39174f, p745y81.Function1.m125323a((Function1) objM87133R12), null, 8, null);
                            c28655q.m87173q(false);
                        }
                        zM87157i2 = c28655q.m87157i(interfaceC15237i);
                        objM87133R8 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R8 == c28676v1) {
                            objM87133R8 = new C2564l1(interfaceC15237i, 19);
                            c28655q.m87172p0(objM87133R8);
                        }
                        Function1 function8 = (Function1) objM87133R8;
                        C34348q0 c34348q0 = new C34348q0(function8, function8, function8, function8, function8, function8);
                        if (i17 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zM87157i3 = z15 | c28655q.m87157i(viewState);
                        objM87133R9 = c28655q.m87133R();
                        if (zM87157i3 || objM87133R9 == c28676v1) {
                            objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                            c28655q.m87172p0(objM87133R9);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R9;
                        if (i17 == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        objM87133R10 = c28655q.m87133R();
                        if (z16 || objM87133R10 == c28676v1) {
                            objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                            c28655q.m87172p0(objM87133R10);
                        }
                        int i25 = TextResource.$stable;
                        r24 = c28655q;
                        obj = c28676v1;
                        AbstractC22273b.m63999c(modifierM3398t, textResourceM113490h, textResourceM21278l, 7, c29885s, aVar, c8688b, false, z14, false, "password_field_tag", jM125392f, null, c34348q0, 7, interfaceC4339a, (Function1) objM87133R10, r24, (i25 << 6) | (i25 << 3) | 3072 | (AbstractC30784c.a.f126785f << 15) | (TextResource.C8688b.f25889c << 18), 24582, 4736);
                        if (viewState.m113495m().isEmpty()) {
                            f14 = f13;
                            r14 = 0;
                            r24.m87150e0(750772114);
                            r24.m87173q(false);
                        } else {
                            f14 = f13;
                            AbstractC33745d.m106667z(r24, 750570304, c2314t, f14, r24);
                            r14 = 0;
                            AbstractC13372c.m37677h(viewState.m113495m(), null, r24, 0, 2);
                            r24.m87173q(false);
                        }
                        if (viewState.getCtaText().length() > 0 || !viewState.getCtaDestinations().getShouldPopulateCta()) {
                            c35795c = viewState;
                            i18 = i17;
                            function5 = function4;
                            obj2 = obj;
                            r24.m87150e0(751581586);
                            r24.m87173q(r14);
                        } else {
                            r24.m87150e0(750890627);
                            i18 = i17;
                            c35795c = viewState;
                            int i26 = (r24.m87157i(c35795c) ? 1 : 0) | (i18 == 32 ? 1 : r14);
                            Object objM87133R13 = r24.m87133R();
                            if (i26 == 0) {
                                obj7 = obj;
                                if (objM87133R13 != obj7) {
                                    obj4 = obj7;
                                    function5 = function4;
                                    obj6 = obj7;
                                    obj5 = objM87133R13;
                                }
                                m113453C((InterfaceC4339a) obj5, c35795c.getCtaText(), r24, r14);
                                r24.m87173q(r14);
                                obj2 = obj6;
                            } else {
                                obj4 = obj;
                            }
                            obj4 = obj7;
                            function5 = function4;
                            C35015q c35015q = new C35015q(12, function5, c35795c);
                            r24.m87172p0(c35015q);
                            obj6 = obj4;
                            obj5 = c35015q;
                            m113453C((InterfaceC4339a) obj5, c35795c.getCtaText(), r24, r14);
                            r24.m87173q(r14);
                            obj2 = obj6;
                        }
                        float f17 = 6 * f15;
                        float f18 = f14;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f17, f18, f17, 0.0f, 8);
                        String strM113487e = c35795c.getBottomMarkup();
                        ?? r15 = C21053l.f79834a;
                        ?? r16 = C38072d.f163053a;
                        int i27 = C38072d.f163054b;
                        function6 = function5;
                        Object obj8 = obj2;
                        i19 = i18;
                        AbstractC21048g.m58807M(strM113487e, modifierM3398t2, false, r15.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(r16, r24, i27), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), r16.m121949b(r24, i27).getWhite50(), r16.m121949b(r24, i27).getWhite50(), 0L, null, r16.m121949b(r24, i27).getWhite50(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r24, 0, C21053l.f79835b << 15, 32728), null, 0, 0, 0, false, r24, C21054m.f79836p << 9, 500);
                        AbstractC22953f.m66715b(r24, AbstractC1102d.m3411h(13 * f15, c2314t));
                        r24.m87173q(true);
                        C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                        Modifier modifierM3394p = AbstractC1099a.m3394p(f18, C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y));
                        String strM21273g = AbstractC8693b.m21273g(AbstractC38022b.f162866G, r24, 0);
                        if (i19 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        Object objM87133R14 = r24.m87133R();
                        if (!z17 || objM87133R14 == obj8) {
                            function7 = function6;
                            C34904e c34904e = new C34904e(function7, 11);
                            r24.m87172p0(c34904e);
                            obj3 = c34904e;
                        } else {
                            function7 = function6;
                            obj3 = objM87133R14;
                        }
                        AbstractC27242b1.m82092d(c27270o, strM21273g, modifierM3394p, null, (InterfaceC4339a) obj3, r24, C27270o.f109105k, 8);
                        ?? r17 = r24;
                        r17.m87173q(true);
                        function2 = function7;
                        r10 = r17;
                    } else {
                        c28655q.m87150e0(855443189);
                        int iM46322Z = C38072d.f163053a.m121951d().getVarious().getPrivacy();
                        C39174f c39174f2 = new C39174f(f16 * f16);
                        Object objM87133R15 = c28655q.m87133R();
                        if (objM87133R15 == c28676v1) {
                            objM87133R15 = b.f152247w;
                            c28655q.m87172p0(objM87133R15);
                        }
                        aVar2 = new AbstractC30784c.a(iM46322Z, c39174f2, p745y81.Function1.m125323a((Function1) objM87133R15), null, 8, null);
                        c28655q.m87173q(false);
                    }
                    aVar = aVar2;
                    zM87157i2 = c28655q.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q.m87133R();
                    if (zM87157i2) {
                        objM87133R8 = new C2564l1(interfaceC15237i, 19);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C2564l1(interfaceC15237i, 19);
                        c28655q.m87172p0(objM87133R8);
                    }
                    Function1 function9 = (Function1) objM87133R8;
                    C34348q0 c34348q1 = new C34348q0(function9, function9, function9, function9, function9, function9);
                    if (i17 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87157i3 = z15 | c28655q.m87157i(viewState);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87157i3) {
                        objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                        c28655q.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                        c28655q.m87172p0(objM87133R9);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R9;
                    if (i17 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objM87133R10 = c28655q.m87133R();
                    if (z16) {
                        objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                        c28655q.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                        c28655q.m87172p0(objM87133R10);
                    }
                    int i28 = TextResource.$stable;
                    r24 = c28655q;
                    obj = c28676v1;
                    AbstractC22273b.m63999c(modifierM3398t, textResourceM113490h, textResourceM21278l, 7, c29885s, aVar, c8688b, false, z14, false, "password_field_tag", jM125392f, null, c34348q1, 7, interfaceC4339a2, (Function1) objM87133R10, r24, (i28 << 6) | (i28 << 3) | 3072 | (AbstractC30784c.a.f126785f << 15) | (TextResource.C8688b.f25889c << 18), 24582, 4736);
                    if (viewState.m113495m().isEmpty()) {
                        f14 = f13;
                        AbstractC33745d.m106667z(r24, 750570304, c2314t, f14, r24);
                        r14 = 0;
                        AbstractC13372c.m37677h(viewState.m113495m(), null, r24, 0, 2);
                        r24.m87173q(false);
                    } else {
                        f14 = f13;
                        r14 = 0;
                        r24.m87150e0(750772114);
                        r24.m87173q(false);
                    }
                    if (viewState.getCtaText().length() > 0) {
                        c35795c = viewState;
                        i18 = i17;
                        function5 = function4;
                        obj2 = obj;
                        r24.m87150e0(751581586);
                        r24.m87173q(r14);
                    } else {
                        c35795c = viewState;
                        i18 = i17;
                        function5 = function4;
                        obj2 = obj;
                        r24.m87150e0(751581586);
                        r24.m87173q(r14);
                    }
                    float f19 = 6 * f15;
                    float f110 = f14;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, f19, f110, f19, 0.0f, 8);
                    String strM113487e2 = c35795c.getBottomMarkup();
                    ?? r18 = C21053l.f79834a;
                    ?? r19 = C38072d.f163053a;
                    int i29 = C38072d.f163054b;
                    function6 = function5;
                    Object obj9 = obj2;
                    i19 = i18;
                    AbstractC21048g.m58807M(strM113487e2, modifierM3398t3, false, r18.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(r19, r24, i29), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), r19.m121949b(r24, i29).getWhite50(), r19.m121949b(r24, i29).getWhite50(), 0L, null, r19.m121949b(r24, i29).getWhite50(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r24, 0, C21053l.f79835b << 15, 32728), null, 0, 0, 0, false, r24, C21054m.f79836p << 9, 500);
                    AbstractC22953f.m66715b(r24, AbstractC1102d.m3411h(13 * f15, c2314t));
                    r24.m87173q(true);
                    C27270o c27270o2 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                    Modifier modifierM3394p2 = AbstractC1099a.m3394p(f110, C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y));
                    String strM21273g2 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, r24, 0);
                    if (i19 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    Object objM87133R16 = r24.m87133R();
                    if (z17) {
                        function7 = function6;
                        C34904e c34904e2 = new C34904e(function7, 11);
                        r24.m87172p0(c34904e2);
                        obj3 = c34904e2;
                    } else {
                        function7 = function6;
                        C34904e c34904e3 = new C34904e(function7, 11);
                        r24.m87172p0(c34904e3);
                        obj3 = c34904e3;
                    }
                    AbstractC27242b1.m82092d(c27270o2, strM21273g2, modifierM3394p2, null, (InterfaceC4339a) obj3, r24, C27270o.f109105k, 8);
                    ?? r110 = r24;
                    r110.m87173q(true);
                    function2 = function7;
                    r10 = r110;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                float f111 = 8;
                f13 = 2 * f111;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f13, 7 * f111, f13, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                if (m113451A(interfaceC28670t2M64044h)) {
                    c28655q2.m87150e0(747282537);
                    interfaceC28601c3 = interfaceC28601c2;
                    c28655q = c28655q2;
                    AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                    c28655q.m87173q(false);
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    c28655q = c28655q2;
                    c28655q.m87150e0(747475698);
                    c28655q.m87173q(false);
                }
                zIsEmpty = viewState.m113495m().isEmpty();
                if (zIsEmpty) {
                    c28655q.m87150e0(747833345);
                    c28655q.m87173q(false);
                    jM125392f = C17919x.f69636m;
                } else {
                    c28655q.m87150e0(747833345);
                    c28655q.m87173q(false);
                    jM125392f = C17919x.f69636m;
                }
                if (zIsEmpty) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v1) {
                    c3 = '\f';
                    objM87133R5 = new TextResource.C8688b(AbstractC38022b.f162876Q, new TextResource.AbstractC8690d.b(12));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    c3 = '\f';
                }
                TextResource.C8688b c8688b2 = (TextResource.C8688b) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v1) {
                    objM87133R6 = new C35509k(22);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM51775c2 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R6);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v1) {
                    objM87133R7 = new C29802c(21, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R7);
                }
                Modifier modifierM3484c2 = AbstractC1126a.m3484c(modifierM51775c2, (Function1) objM87133R7);
                float f112 = 4;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(modifierM3484c2, 0.0f, f112 * f111, 0.0f, 0.0f, 13);
                TextResource textResourceM113490h2 = viewState.getHint();
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m113478w(r24));
                if (m113480y(r21)) {
                    c29885s = new C29885s();
                } else {
                    c29885s = C29871f0.f122092w;
                }
                if (m113478w(r24).length() > 0) {
                    if (m113478w(r24).length() > 0) {
                    }
                    c28655q.m87150e0(749433037);
                    c28655q.m87173q(false);
                    aVar = null;
                } else {
                    if (m113478w(r24).length() > 0) {
                    }
                    c28655q.m87150e0(749433037);
                    c28655q.m87173q(false);
                    aVar = null;
                }
                zM87157i2 = c28655q.m87157i(interfaceC15237i);
                objM87133R8 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new C2564l1(interfaceC15237i, 19);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C2564l1(interfaceC15237i, 19);
                    c28655q.m87172p0(objM87133R8);
                }
                Function1 function10 = (Function1) objM87133R8;
                C34348q0 c34348q2 = new C34348q0(function10, function10, function10, function10, function10, function10);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q.m87157i(viewState);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R9;
                if (i17 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z16) {
                    objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                    c28655q.m87172p0(objM87133R10);
                }
                int i210 = TextResource.$stable;
                r24 = c28655q;
                obj = c28676v1;
                AbstractC22273b.m63999c(modifierM3398t4, textResourceM113490h2, textResourceM21278l2, 7, c29885s, aVar, c8688b2, false, z14, false, "password_field_tag", jM125392f, null, c34348q2, 7, interfaceC4339a3, (Function1) objM87133R10, r24, (i210 << 6) | (i210 << 3) | 3072 | (AbstractC30784c.a.f126785f << 15) | (TextResource.C8688b.f25889c << 18), 24582, 4736);
                if (viewState.m113495m().isEmpty()) {
                    f14 = f13;
                    AbstractC33745d.m106667z(r24, 750570304, c2314t, f14, r24);
                    r14 = 0;
                    AbstractC13372c.m37677h(viewState.m113495m(), null, r24, 0, 2);
                    r24.m87173q(false);
                } else {
                    f14 = f13;
                    r14 = 0;
                    r24.m87150e0(750772114);
                    r24.m87173q(false);
                }
                if (viewState.getCtaText().length() > 0) {
                    c35795c = viewState;
                    i18 = i17;
                    function5 = function4;
                    obj2 = obj;
                    r24.m87150e0(751581586);
                    r24.m87173q(r14);
                } else {
                    c35795c = viewState;
                    i18 = i17;
                    function5 = function4;
                    obj2 = obj;
                    r24.m87150e0(751581586);
                    r24.m87173q(r14);
                }
                float f113 = 6 * f111;
                float f114 = f14;
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, f113, f114, f113, 0.0f, 8);
                String strM113487e3 = c35795c.getBottomMarkup();
                ?? r111 = C21053l.f79834a;
                ?? r112 = C38072d.f163053a;
                int i211 = C38072d.f163054b;
                function6 = function5;
                Object obj10 = obj2;
                i19 = i18;
                AbstractC21048g.m58807M(strM113487e3, modifierM3398t5, false, r111.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(r112, r24, i211), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), r112.m121949b(r24, i211).getWhite50(), r112.m121949b(r24, i211).getWhite50(), 0L, null, r112.m121949b(r24, i211).getWhite50(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r24, 0, C21053l.f79835b << 15, 32728), null, 0, 0, 0, false, r24, C21054m.f79836p << 9, 500);
                AbstractC22953f.m66715b(r24, AbstractC1102d.m3411h(13 * f111, c2314t));
                r24.m87173q(true);
                C27270o c27270o3 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierM3394p3 = AbstractC1099a.m3394p(f114, C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y));
                String strM21273g3 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, r24, 0);
                if (i19 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                Object objM87133R17 = r24.m87133R();
                if (z17) {
                    function7 = function6;
                    C34904e c34904e4 = new C34904e(function7, 11);
                    r24.m87172p0(c34904e4);
                    obj3 = c34904e4;
                } else {
                    function7 = function6;
                    C34904e c34904e5 = new C34904e(function7, 11);
                    r24.m87172p0(c34904e5);
                    obj3 = c34904e5;
                }
                AbstractC27242b1.m82092d(c27270o3, strM21273g3, modifierM3394p3, null, (InterfaceC4339a) obj3, r24, C27270o.f109105k, 8);
                ?? r113 = r24;
                r113.m87173q(true);
                function2 = function7;
                r10 = r113;
            } else {
                C28655q c28655q3 = c28655q2;
                c28655q3.m87138X();
                r10 = c28655q3;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(viewState, i13, function2, i14, 13);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            i16 = 21;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C35509k(i16);
                    c28655q2.m87172p0(objM87133R11);
                }
                function3 = (Function1) objM87133R11;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(viewState.getPasswordPrefill().getValue());
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R2;
            interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q2, 0);
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
            interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            Boolean boolValueOf2 = Boolean.valueOf(viewState.getIsButtonEnabled());
            i17 = i15 & 112;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q2.m87157i(viewState);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R4 = new a(function3, viewState, null);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(function3, viewState, null);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, boolValueOf2);
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            function4 = function3;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                c28676v1 = c28676v0;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                float f115 = 8;
                f13 = 2 * f115;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f13, 7 * f115, f13, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM92116f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                if (m113451A(interfaceC28670t2M64044h)) {
                    c28655q2.m87150e0(747282537);
                    interfaceC28601c3 = interfaceC28601c2;
                    c28655q = c28655q2;
                    AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                    c28655q.m87173q(false);
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    c28655q = c28655q2;
                    c28655q.m87150e0(747475698);
                    c28655q.m87173q(false);
                }
                zIsEmpty = viewState.m113495m().isEmpty();
                if (zIsEmpty) {
                    c28655q.m87150e0(747833345);
                    c28655q.m87173q(false);
                    jM125392f = C17919x.f69636m;
                } else {
                    c28655q.m87150e0(747833345);
                    c28655q.m87173q(false);
                    jM125392f = C17919x.f69636m;
                }
                if (zIsEmpty) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v1) {
                    c3 = '\f';
                    objM87133R5 = new TextResource.C8688b(AbstractC38022b.f162876Q, new TextResource.AbstractC8690d.b(12));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    c3 = '\f';
                }
                TextResource.C8688b c8688b3 = (TextResource.C8688b) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v1) {
                    objM87133R6 = new C35509k(22);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifierM51775c3 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R6);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v1) {
                    objM87133R7 = new C29802c(21, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R7);
                }
                Modifier modifierM3484c3 = AbstractC1126a.m3484c(modifierM51775c3, (Function1) objM87133R7);
                float f116 = 4;
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(modifierM3484c3, 0.0f, f116 * f115, 0.0f, 0.0f, 13);
                TextResource textResourceM113490h3 = viewState.getHint();
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m113478w(r24));
                if (m113480y(r21)) {
                    c29885s = new C29885s();
                } else {
                    c29885s = C29871f0.f122092w;
                }
                if (m113478w(r24).length() > 0) {
                    if (m113478w(r24).length() > 0) {
                    }
                    c28655q.m87150e0(749433037);
                    c28655q.m87173q(false);
                    aVar = null;
                } else {
                    if (m113478w(r24).length() > 0) {
                    }
                    c28655q.m87150e0(749433037);
                    c28655q.m87173q(false);
                    aVar = null;
                }
                zM87157i2 = c28655q.m87157i(interfaceC15237i);
                objM87133R8 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R8 = new C2564l1(interfaceC15237i, 19);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C2564l1(interfaceC15237i, 19);
                    c28655q.m87172p0(objM87133R8);
                }
                Function1 function11 = (Function1) objM87133R8;
                C34348q0 c34348q3 = new C34348q0(function11, function11, function11, function11, function11, function11);
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = z15 | c28655q.m87157i(viewState);
                objM87133R9 = c28655q.m87133R();
                if (zM87157i3) {
                    objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                    c28655q.m87172p0(objM87133R9);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
                if (i17 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objM87133R10 = c28655q.m87133R();
                if (z16) {
                    objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                    c28655q.m87172p0(objM87133R10);
                }
                int i212 = TextResource.$stable;
                r24 = c28655q;
                obj = c28676v1;
                AbstractC22273b.m63999c(modifierM3398t6, textResourceM113490h3, textResourceM21278l3, 7, c29885s, aVar, c8688b3, false, z14, false, "password_field_tag", jM125392f, null, c34348q3, 7, interfaceC4339a4, (Function1) objM87133R10, r24, (i212 << 6) | (i212 << 3) | 3072 | (AbstractC30784c.a.f126785f << 15) | (TextResource.C8688b.f25889c << 18), 24582, 4736);
                if (viewState.m113495m().isEmpty()) {
                    f14 = f13;
                    AbstractC33745d.m106667z(r24, 750570304, c2314t, f14, r24);
                    r14 = 0;
                    AbstractC13372c.m37677h(viewState.m113495m(), null, r24, 0, 2);
                    r24.m87173q(false);
                } else {
                    f14 = f13;
                    r14 = 0;
                    r24.m87150e0(750772114);
                    r24.m87173q(false);
                }
                if (viewState.getCtaText().length() > 0) {
                    c35795c = viewState;
                    i18 = i17;
                    function5 = function4;
                    obj2 = obj;
                    r24.m87150e0(751581586);
                    r24.m87173q(r14);
                } else {
                    c35795c = viewState;
                    i18 = i17;
                    function5 = function4;
                    obj2 = obj;
                    r24.m87150e0(751581586);
                    r24.m87173q(r14);
                }
                float f117 = 6 * f115;
                float f118 = f14;
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t, f117, f118, f117, 0.0f, 8);
                String strM113487e4 = c35795c.getBottomMarkup();
                ?? r114 = C21053l.f79834a;
                ?? r115 = C38072d.f163053a;
                int i213 = C38072d.f163054b;
                function6 = function5;
                Object obj11 = obj2;
                i19 = i18;
                AbstractC21048g.m58807M(strM113487e4, modifierM3398t7, false, r114.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(r115, r24, i213), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), r115.m121949b(r24, i213).getWhite50(), r115.m121949b(r24, i213).getWhite50(), 0L, null, r115.m121949b(r24, i213).getWhite50(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r24, 0, C21053l.f79835b << 15, 32728), null, 0, 0, 0, false, r24, C21054m.f79836p << 9, 500);
                AbstractC22953f.m66715b(r24, AbstractC1102d.m3411h(13 * f115, c2314t));
                r24.m87173q(true);
                C27270o c27270o4 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                Modifier modifierM3394p4 = AbstractC1099a.m3394p(f118, C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y));
                String strM21273g4 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, r24, 0);
                if (i19 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                Object objM87133R18 = r24.m87133R();
                if (z17) {
                    function7 = function6;
                    C34904e c34904e6 = new C34904e(function7, 11);
                    r24.m87172p0(c34904e6);
                    obj3 = c34904e6;
                } else {
                    function7 = function6;
                    C34904e c34904e7 = new C34904e(function7, 11);
                    r24.m87172p0(c34904e7);
                    obj3 = c34904e7;
                }
                AbstractC27242b1.m82092d(c27270o4, strM21273g4, modifierM3394p4, null, (InterfaceC4339a) obj3, r24, C27270o.f109105k, 8);
                ?? r116 = r24;
                r116.m87173q(true);
                function2 = function7;
                r10 = r116;
            } else {
                c28676v1 = c28676v0;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
            float f119 = 8;
            f13 = 2 * f119;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f13, 7 * f119, f13, 0.0f, 8), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM92116f3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            if (m113451A(interfaceC28670t2M64044h)) {
                c28655q2.m87150e0(747282537);
                interfaceC28601c3 = interfaceC28601c2;
                c28655q = c28655q2;
                AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), c28655q, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                c28655q.m87173q(false);
            } else {
                interfaceC28601c3 = interfaceC28601c2;
                c28655q = c28655q2;
                c28655q.m87150e0(747475698);
                c28655q.m87173q(false);
            }
            zIsEmpty = viewState.m113495m().isEmpty();
            if (zIsEmpty) {
                c28655q.m87150e0(747833345);
                c28655q.m87173q(false);
                jM125392f = C17919x.f69636m;
            } else {
                c28655q.m87150e0(747833345);
                c28655q.m87173q(false);
                jM125392f = C17919x.f69636m;
            }
            if (zIsEmpty) {
                z14 = false;
            } else {
                z14 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v1) {
                c3 = '\f';
                objM87133R5 = new TextResource.C8688b(AbstractC38022b.f162876Q, new TextResource.AbstractC8690d.b(12));
                c28655q.m87172p0(objM87133R5);
            } else {
                c3 = '\f';
            }
            TextResource.C8688b c8688b4 = (TextResource.C8688b) objM87133R5;
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v1) {
                objM87133R6 = new C35509k(22);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifierM51775c4 = AbstractC18032n.m51775c(c2314t, false, (Function1) objM87133R6);
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v1) {
                objM87133R7 = new C29802c(21, interfaceC28601c3);
                c28655q.m87172p0(objM87133R7);
            }
            Modifier modifierM3484c4 = AbstractC1126a.m3484c(modifierM51775c4, (Function1) objM87133R7);
            float f1110 = 4;
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(modifierM3484c4, 0.0f, f1110 * f119, 0.0f, 0.0f, 13);
            TextResource textResourceM113490h4 = viewState.getHint();
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(m113478w(r24));
            if (m113480y(r21)) {
                c29885s = new C29885s();
            } else {
                c29885s = C29871f0.f122092w;
            }
            if (m113478w(r24).length() > 0) {
                if (m113478w(r24).length() > 0) {
                }
                c28655q.m87150e0(749433037);
                c28655q.m87173q(false);
                aVar = null;
            } else {
                if (m113478w(r24).length() > 0) {
                }
                c28655q.m87150e0(749433037);
                c28655q.m87173q(false);
                aVar = null;
            }
            zM87157i2 = c28655q.m87157i(interfaceC15237i);
            objM87133R8 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R8 = new C2564l1(interfaceC15237i, 19);
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C2564l1(interfaceC15237i, 19);
                c28655q.m87172p0(objM87133R8);
            }
            Function1 function12 = (Function1) objM87133R8;
            C34348q0 c34348q4 = new C34348q0(function12, function12, function12, function12, function12, function12);
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i3 = z15 | c28655q.m87157i(viewState);
            objM87133R9 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new C31324k(function4, viewState, (Object) r21, 14);
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R9;
            if (i17 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objM87133R10 = c28655q.m87133R();
            if (z16) {
                objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                c28655q.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new C28827b(function4, interfaceC28601c1, 10);
                c28655q.m87172p0(objM87133R10);
            }
            int i214 = TextResource.$stable;
            r24 = c28655q;
            obj = c28676v1;
            AbstractC22273b.m63999c(modifierM3398t8, textResourceM113490h4, textResourceM21278l4, 7, c29885s, aVar, c8688b4, false, z14, false, "password_field_tag", jM125392f, null, c34348q4, 7, interfaceC4339a5, (Function1) objM87133R10, r24, (i214 << 6) | (i214 << 3) | 3072 | (AbstractC30784c.a.f126785f << 15) | (TextResource.C8688b.f25889c << 18), 24582, 4736);
            if (viewState.m113495m().isEmpty()) {
                f14 = f13;
                AbstractC33745d.m106667z(r24, 750570304, c2314t, f14, r24);
                r14 = 0;
                AbstractC13372c.m37677h(viewState.m113495m(), null, r24, 0, 2);
                r24.m87173q(false);
            } else {
                f14 = f13;
                r14 = 0;
                r24.m87150e0(750772114);
                r24.m87173q(false);
            }
            if (viewState.getCtaText().length() > 0) {
                c35795c = viewState;
                i18 = i17;
                function5 = function4;
                obj2 = obj;
                r24.m87150e0(751581586);
                r24.m87173q(r14);
            } else {
                c35795c = viewState;
                i18 = i17;
                function5 = function4;
                obj2 = obj;
                r24.m87150e0(751581586);
                r24.m87173q(r14);
            }
            float f1111 = 6 * f119;
            float f1112 = f14;
            Modifier modifierM3398t9 = AbstractC1099a.m3398t(c2314t, f1111, f1112, f1111, 0.0f, 8);
            String strM113487e5 = c35795c.getBottomMarkup();
            ?? r117 = C21053l.f79834a;
            ?? r118 = C38072d.f163053a;
            int i215 = C38072d.f163054b;
            function6 = function5;
            Object obj12 = obj2;
            i19 = i18;
            AbstractC21048g.m58807M(strM113487e5, modifierM3398t9, false, r117.m58880a(C23285v0.m67364b(AbstractC18489d0.m53377r(r118, r24, i215), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), r118.m121949b(r24, i215).getWhite50(), r118.m121949b(r24, i215).getWhite50(), 0L, null, r118.m121949b(r24, i215).getWhite50(), 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r24, 0, C21053l.f79835b << 15, 32728), null, 0, 0, 0, false, r24, C21054m.f79836p << 9, 500);
            AbstractC22953f.m66715b(r24, AbstractC1102d.m3411h(13 * f119, c2314t));
            r24.m87173q(true);
            C27270o c27270o5 = new C27270o(AbstractC27274q.a.f109136f, AbstractC16319p0.m46430a().getVarious().getHelpCenter(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            Modifier modifierM3394p5 = AbstractC1099a.m3394p(f1112, C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y));
            String strM21273g5 = AbstractC8693b.m21273g(AbstractC38022b.f162866G, r24, 0);
            if (i19 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            Object objM87133R19 = r24.m87133R();
            if (z17) {
                function7 = function6;
                C34904e c34904e8 = new C34904e(function7, 11);
                r24.m87172p0(c34904e8);
                obj3 = c34904e8;
            } else {
                function7 = function6;
                C34904e c34904e9 = new C34904e(function7, 11);
                r24.m87172p0(c34904e9);
                obj3 = c34904e9;
            }
            AbstractC27242b1.m82092d(c27270o5, strM21273g5, modifierM3394p5, null, (InterfaceC4339a) obj3, r24, C27270o.f109105k, 8);
            ?? r119 = r24;
            r119.m87173q(true);
            function2 = function7;
            r10 = r119;
        } else {
            C28655q c28655q4 = c28655q2;
            c28655q4.m87138X();
            r10 = c28655q4;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, function2, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m113468m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m113469n(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m113470o(InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        InterfaceC3871p.f15846a.getClass();
        C3862g c3862g = C3870o.f15845d;
        InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
        C18043y c18043y = AbstractC18039u.f70050q;
        InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[8];
        c18043y.m51817a(semantics, c3862g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m113471p(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        m113469n(interfaceC28601c1, m113452B(interfaceC28601c1) || ((EnumC15251w) it).m43354b());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m113472q(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m113473r(Function1 function1, C35795c c35795c, InterfaceC28601c1 interfaceC28601c1) {
        m113481z(interfaceC28601c1, !m113480y(interfaceC28601c1));
        function1.invoke(new InterfaceC17002b.i(c35795c.getAnalyticsName(), null, "icon", "eye", "account_creation", null, 34, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m113474s(Function1 function1, InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m113479x(interfaceC28601c1, it);
        function1.invoke(new InterfaceC21413a.u0(new C11751e(it), false, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m113475t(Function1 function1, C35795c c35795c) {
        function1.invoke(new AbstractC23438o.h(c35795c.getCtaDestinations()));
        function1.invoke(new InterfaceC17002b.i(c35795c.getAnalyticsName(), null, null, "entered_wrong_email", null, null, 54, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m113476u(Function1 function1) {
        function1.invoke(AbstractC23438o.d.f92874a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m113477v(C35795c c35795c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m113467l(c35795c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final String m113478w(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m113479x(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m113480y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m113481z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}
