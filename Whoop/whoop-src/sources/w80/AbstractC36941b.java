package w80;

import am2.C1024j;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import b30.C2564l1;
import b90.C2883e;
import bc3.InterfaceC2994c0;
import bm2.C3482x;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d70.C11749c;
import d70.C11751e;
import f70.C14201q0;
import h80.InterfaceC17002b;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import j11.AbstractC21211n;
import j80.InterfaceC21413a;
import kd1.AbstractC22403o;
import l80.AbstractC23438o;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p412q3.C29871f0;
import p412q3.C29885s;
import p412q3.InterfaceC29873g0;
import p505ts.AbstractC34132o;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p714k80.AbstractC22273b;
import p714k80.AbstractC22288q;
import p714k80.AbstractC22290s;
import p714k80.C22285n;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31915d;
import p745y81.C39336i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t80.C33592b;
import uz1.C35429g;
import w01.C36680e;
import w01.C36681f;
import w70.C36870a;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;

/* JADX INFO: renamed from: w80.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0011²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lw80/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Lw80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "emailValue", "passwordValue", "", "hidePassword", "isEmailValid", "shouldValidateEmailOnInput", "isPasswordValid", "isKeyboardOpen", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36941b {

    /* JADX INFO: renamed from: w80.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.createyouraccount.CreateYourAccountScreenKt$CreateYourAccountScreenView$2$1", m100430f = "CreateYourAccountScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158081w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f158082x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36942c f158083y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f158084z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, C36942c c36942c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158082x = function1;
            this.f158083y = c36942c;
            this.f158084z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f158082x, this.f158083y, this.f158084z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f158081w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(AbstractC36941b.m118584o(this.f158084z), Boolean.FALSE)) {
                this.f158082x.invoke(new InterfaceC17002b.a(this.f158083y.getAnalyticsName(), "inline_error", "formatting", "account_creation"));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w80.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.createyouraccount.CreateYourAccountScreenKt$CreateYourAccountScreenView$3$1", m100430f = "CreateYourAccountScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158085w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f158086x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C36942c f158087y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f158088z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, C36942c c36942c, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158086x = function1;
            this.f158087y = c36942c;
            this.f158088z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f158086x, this.f158087y, this.f158088z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f158085w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(AbstractC36941b.m118588s(this.f158088z), Boolean.FALSE)) {
                this.f158086x.invoke(new InterfaceC17002b.a(this.f158087y.getAnalyticsName(), "inline_error", "formatting", "account_creation"));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w80.b$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.createyouraccount.CreateYourAccountScreenKt$CreateYourAccountScreenView$4$1", m100430f = "CreateYourAccountScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158089w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f158090x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f158091y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, boolean z4, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158090x = function1;
            this.f158091y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f158090x, this.f158091y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f158089w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f158090x.invoke(this.f158091y ? EnumC3921e.ENABLE : EnumC3921e.DISABLE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w80.b$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f158092w = new d();

        /* JADX INFO: renamed from: a */
        public final long m118596a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118596a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: w80.b$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f158093w = new e();

        /* JADX INFO: renamed from: a */
        public final long m118597a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m118597a((C39336i) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m118556A(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, String it) {
        AbstractC22676k.m65750j(it, "it");
        m118565J(interfaceC28601c1, it);
        boolean z4 = false;
        m118589t(interfaceC28601c2, Boolean.valueOf(m118564I(interfaceC28601c1).length() >= 12));
        function1.invoke(new InterfaceC21413a.u0(new C11751e(it), z4, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m118557B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m118558C(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, String it) {
        AbstractC22676k.m65750j(it, "it");
        m118563H(interfaceC28601c1, it);
        if (m118586q(interfaceC28601c2)) {
            m118585p(interfaceC28601c3, Boolean.valueOf(C22285n.f86963a.m64020a(m118591v(interfaceC28601c1))));
        }
        function1.invoke(new InterfaceC21413a.s0(new C11749c(it)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m118559D(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        if (!((EnumC15251w) it).m43353a() && m118564I(interfaceC28601c1).length() > 0) {
            m118589t(interfaceC28601c2, Boolean.valueOf(m118564I(interfaceC28601c1).length() >= 12));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m118560E(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m118561F(InterfaceC28601c1 interfaceC28601c1) {
        m118567L(interfaceC28601c1, !m118566K(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m118562G(C36942c c36942c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118582m(c36942c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m118563H(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: I */
    private static final String m118564I(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: J */
    private static final void m118565J(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: K */
    private static final boolean m118566K(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: L */
    private static final void m118567L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:136:0x0301  */
    /* JADX WARN: Code duplicated, block: B:139:0x0372  */
    /* JADX WARN: Code duplicated, block: B:141:0x037a  */
    /* JADX WARN: Code duplicated, block: B:144:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0398  */
    /* JADX WARN: Code duplicated, block: B:151:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:155:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:156:0x0406  */
    /* JADX WARN: Code duplicated, block: B:159:0x041f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0430  */
    /* JADX WARN: Code duplicated, block: B:168:0x043c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0447  */
    /* JADX WARN: Code duplicated, block: B:172:0x044d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0456  */
    /* JADX WARN: Code duplicated, block: B:175:0x045d  */
    /* JADX WARN: Code duplicated, block: B:179:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0474  */
    /* JADX WARN: Code duplicated, block: B:185:0x0499  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:189:0x04af  */
    /* JADX WARN: Code duplicated, block: B:192:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:198:0x0532  */
    /* JADX WARN: Code duplicated, block: B:201:0x055f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0565  */
    /* JADX WARN: Code duplicated, block: B:205:0x0571  */
    /* JADX WARN: Code duplicated, block: B:212:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:214:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:223:0x0613  */
    /* JADX WARN: Code duplicated, block: B:224:0x0622  */
    /* JADX WARN: Code duplicated, block: B:228:0x0643  */
    /* JADX WARN: Code duplicated, block: B:231:0x0652 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x0654  */
    /* JADX WARN: Code duplicated, block: B:235:0x0677  */
    /* JADX WARN: Code duplicated, block: B:238:0x068d  */
    /* JADX WARN: Code duplicated, block: B:239:0x068f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:242:0x0696 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x069c  */
    /* JADX WARN: Code duplicated, block: B:248:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:249:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:251:0x0799  */
    /* JADX WARN: Code duplicated, block: B:254:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:96:0x017e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r2v34, types: [iz0.l] */
    /* JADX WARN: Type inference failed for: r30v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r3v26, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r50v0 */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r50v4 */
    /* JADX WARN: Type inference failed for: r50v5 */
    /* JADX WARN: Type inference failed for: r50v6 */
    /* JADX WARN: Type inference failed for: r50v7 */
    /* JADX WARN: Type inference failed for: r5v24, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r8v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
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
    /* JADX INFO: renamed from: m */
    public static final void m118582m(C36942c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        ?? r14;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        String str;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        Object obj2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        Object obj3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        Object obj4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        Object obj5;
        InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R6;
        Object obj6;
        InterfaceC28601c1 interfaceC28601c6;
        Boolean boolM118584o;
        Boolean bool;
        boolean z13;
        InterfaceC28670t2 interfaceC28670t2M64044h;
        InterfaceC15237i interfaceC15237i;
        int i16;
        boolean z14;
        boolean zM87157i;
        Object obj7;
        boolean z15;
        boolean zM87157i2;
        Object obj8;
        boolean z16;
        boolean zM87155h;
        Object obj9;
        C2314t c2314t;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C2314t c2314t2;
        C0209i c0209i3;
        C14201q0 c14201q0M118605i;
        C0209i c0209i4;
        C0209i c0209i5;
        InterfaceC28601c1 interfaceC28601c7;
        C28676v0 c28676v1;
        InterfaceC28601c1 interfaceC28601c8;
        InterfaceC15237i interfaceC15237i2;
        InterfaceC28601c1 interfaceC28601c9;
        C0209i c0209i6;
        Function1 function6;
        InterfaceC28601c1 interfaceC28601c10;
        C0213j c0213j2;
        C2314t c2314t3;
        ?? r10;
        AbstractC30784c.a aVar;
        ?? r15;
        float f13;
        float f14;
        float f15;
        int iHashCode2;
        Object objM87133R7;
        C28676v0 c28676v2;
        InterfaceC28601c1 interfaceC28601c11;
        InterfaceC28601c1 interfaceC28601c12;
        InterfaceC28601c1 interfaceC28601c13;
        Object obj10;
        Boolean boolM118584o2;
        Boolean bool2;
        ?? r16;
        C14201q0 c14201q0M118605i2;
        ?? r52;
        TextResource textResourceM21267a;
        ?? r54;
        ?? r55;
        InterfaceC15237i interfaceC15237i3;
        boolean zM87157i3;
        Object obj11;
        Object objM87133R8;
        Object obj12;
        ?? r17;
        Object objM87133R9;
        float f16;
        ?? r33;
        Function1 function7;
        Object objM87133R10;
        Object obj13;
        TextResource textResourceM21267a2;
        InterfaceC29873g0 c29885s;
        AbstractC30784c.a aVar2;
        Object obj14;
        AbstractC30784c.a aVar3;
        Object objM87133R11;
        InterfaceC28601c1 interfaceC28601c14;
        InterfaceC28601c1 interfaceC28601c15;
        Object obj15;
        boolean zM87157i4;
        Object obj16;
        Object objM87133R12;
        Object obj17;
        boolean z17;
        Function1 function8;
        Object obj18;
        ?? r18;
        String strM118607k;
        C2314t c2314t4;
        ?? r19;
        Object obj19;
        C14201q0 c14201q0M118605i3;
        Function1 function9;
        Object obj20;
        int i17;
        Object obj21;
        C14201q0 c14201q0M118605i4;
        C11751e c11751eM40566s;
        String strM31441a;
        C14201q0 c14201q0M118605i5;
        String strM31439a;
        C11749c c11749cM40557j;
        Object objM87133R13;
        Object obj22;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(643787663);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        obj22 = objM87133R13;
                        C36680e c36680e = new C36680e(19);
                        c28655q.m87172p0(c36680e);
                        obj22 = c36680e;
                    }
                    obj22 = objM87133R13;
                    function4 = (Function1) obj22;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                str = "";
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    c14201q0M118605i5 = viewState.getMemberInfo();
                    if (c14201q0M118605i5 != null || (c11749cM40557j = c14201q0M118605i5.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String()) == null || (strM31439a = c11749cM40557j.getValue()) == null) {
                        strM31439a = "";
                    }
                    C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(strM31439a);
                    c28655q.m87172p0(c28633k1M87272z);
                    obj = c28633k1M87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                objM87133R2 = c28655q.m87133R();
                obj2 = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c14201q0M118605i4 = viewState.getMemberInfo();
                    if (c14201q0M118605i4 != null && (c11751eM40566s = c14201q0M118605i4.getPassword()) != null && (strM31441a = c11751eM40566s.getValue()) != null) {
                        str = strM31441a;
                    }
                    C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(str);
                    c28655q.m87172p0(c28633k1M87272z2);
                    obj2 = c28633k1M87272z2;
                }
                interfaceC28601c2 = (InterfaceC28601c1) obj2;
                objM87133R3 = c28655q.m87133R();
                obj3 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q.m87172p0(c28633k1M87272z3);
                    obj3 = c28633k1M87272z3;
                }
                interfaceC28601c3 = (InterfaceC28601c1) obj3;
                objM87133R4 = c28655q.m87133R();
                obj4 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28633k1 c28633k1M87272z4 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(c28633k1M87272z4);
                    obj4 = c28633k1M87272z4;
                }
                interfaceC28601c4 = (InterfaceC28601c1) obj4;
                objM87133R5 = c28655q.m87133R();
                obj5 = objM87133R5;
                if (objM87133R5 == c28676v0) {
                    C28633k1 c28633k1M87272z5 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(c28633k1M87272z5);
                    obj5 = c28633k1M87272z5;
                }
                interfaceC28601c5 = (InterfaceC28601c1) obj5;
                objM87133R6 = c28655q.m87133R();
                obj6 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C28633k1 c28633k1M87272z6 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(c28633k1M87272z6);
                    obj6 = c28633k1M87272z6;
                }
                interfaceC28601c6 = (InterfaceC28601c1) obj6;
                boolM118584o = m118584o(interfaceC28601c4);
                bool = Boolean.TRUE;
                if (AbstractC22676k.m65745e(boolM118584o, bool) || !AbstractC22676k.m65745e(m118588s(interfaceC28601c6), bool)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q, 0);
                interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
                Boolean boolM118584o3 = m118584o(interfaceC28601c4);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i = z14 | c28655q.m87157i(viewState);
                Object objM87133R14 = c28655q.m87133R();
                obj7 = objM87133R14;
                if (zM87157i || objM87133R14 == c28676v0) {
                    a aVar4 = new a(function4, viewState, interfaceC28601c4, null);
                    c28655q.m87172p0(aVar4);
                    obj7 = aVar4;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj7, boolM118584o3);
                Boolean boolM118588s = m118588s(interfaceC28601c6);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i2 = z15 | c28655q.m87157i(viewState);
                Object objM87133R15 = c28655q.m87133R();
                obj8 = objM87133R15;
                if (zM87157i2 || objM87133R15 == c28676v0) {
                    b bVar = new b(function4, viewState, interfaceC28601c6, null);
                    c28655q.m87172p0(bVar);
                    obj8 = bVar;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj8, boolM118588s);
                Boolean boolValueOf = Boolean.valueOf(z13);
                if (i16 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87155h = z16 | c28655q.m87155h(z13);
                Object objM87133R16 = c28655q.m87133R();
                obj9 = objM87133R16;
                if (zM87155h || objM87133R16 == c28676v0) {
                    c cVar = new c(function4, z13, null);
                    c28655q.m87172p0(cVar);
                    obj9 = cVar;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj9, boolValueOf);
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC39127r0M66763d);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c2314t2 = c2314t;
                } else {
                    c2314t2 = c2314t;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i3 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N);
                    c14201q0M118605i = viewState.getMemberInfo();
                    if (c14201q0M118605i == null && c14201q0M118605i.getEmailTaken() && viewState.getEnableLoginRedirectDialog()) {
                        c28655q.m87150e0(1511697259);
                        int i19 = 2;
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC38022b.f162902m, null, i19, false ? 1 : 0);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC38022b.f162901l, false ? 1 : 0, i19, false ? 1 : 0);
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC38022b.f162888b, false ? 1 : 0, i19, false ? 1 : 0);
                        boolean z18 = i16 == 32;
                        Object objM87133R17 = c28655q.m87133R();
                        if (z18 || objM87133R17 == c28676v0) {
                            function9 = function5;
                            C36681f c36681f = new C36681f(function9, 4);
                            c28655q.m87172p0(c36681f);
                            obj20 = c36681f;
                        } else {
                            function9 = function5;
                            obj20 = objM87133R17;
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj20;
                        boolean z19 = i16 == 32;
                        Object objM87133R18 = c28655q.m87133R();
                        if (z19 || objM87133R18 == c28676v0) {
                            i17 = 5;
                            C36681f c36681f2 = new C36681f(function9, i17);
                            c28655q.m87172p0(c36681f2);
                            obj21 = c36681f2;
                        } else {
                            i17 = 5;
                            obj21 = objM87133R18;
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj21;
                        int i24 = TextResource.C8688b.f25889c;
                        interfaceC28601c7 = interfaceC28601c2;
                        function6 = function9;
                        aVar = null;
                        c0209i4 = c0209i3;
                        interfaceC28601c8 = interfaceC28601c5;
                        interfaceC15237i2 = interfaceC15237i;
                        c0209i5 = c0209i2;
                        interfaceC28601c9 = interfaceC28601c4;
                        c0209i6 = c0209i;
                        c0213j2 = c0213j;
                        r10 = 0;
                        interfaceC28601c10 = interfaceC28601c6;
                        c2314t3 = c2314t2;
                        c28676v1 = c28676v0;
                        AbstractC21211n.m59497o(null, c8688b, c8688b2, c8688b3, false, null, null, null, null, null, null, false, true, null, null, false, 0, null, null, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q, (i24 << 3) | (i24 << 6) | (i24 << 9), 384, 0, 247459825);
                        C28655q c28655q2 = c28655q;
                        c28655q2.m87173q(false);
                        r15 = c28655q2;
                    } else {
                        c0209i4 = c0209i3;
                        c0209i5 = c0209i2;
                        interfaceC28601c7 = interfaceC28601c2;
                        c28676v1 = c28676v0;
                        interfaceC28601c8 = interfaceC28601c5;
                        interfaceC15237i2 = interfaceC15237i;
                        interfaceC28601c9 = interfaceC28601c4;
                        c0209i6 = c0209i;
                        function6 = function5;
                        interfaceC28601c10 = interfaceC28601c6;
                        c0213j2 = c0213j;
                        c2314t3 = c2314t2;
                        r10 = 0;
                        aVar = null;
                        c28655q.m87150e0(1512498733);
                        c28655q.m87173q(false);
                        r15 = c28655q;
                    }
                    f13 = 8;
                    float f17 = ((float) 2.5d) * f13;
                    f14 = 4;
                    f15 = f14 * f13;
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), f17, 0.0f, f17, f15, 2), AbstractC30060g.m92099U(r10, r15, 1), 14);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, r15, 6);
                    iHashCode2 = Long.hashCode(r15.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM92116f0);
                    r15.m87158i0();
                    if (r15.f115903S) {
                        r15.m87163l(c0213j2);
                    } else {
                        r15.m87178s0();
                    }
                    AbstractC28683x.m87239G(r15, c0209i7, c23010xM66775a);
                    AbstractC28683x.m87239G(r15, c0209i6, interfaceC28653p1M87165m2);
                    if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
                    }
                    AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N2);
                    if (m118590u(interfaceC28670t2M64044h)) {
                        r15.m87150e0(-126366736);
                        AbstractC25012a.m73388u((float) 3.5d, f13, c2314t3, r15, r10);
                    } else {
                        r15.m87150e0(-126571026);
                        AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), r15, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                        r15.m87173q(r10);
                    }
                    AbstractC22953f.m66715b(r15, AbstractC1102d.m3411h(3 * f13, c2314t3));
                    TextResource textResourceM118602f = viewState.getHintEmail();
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(m118591v(interfaceC28601c1));
                    objM87133R7 = r15.m87133R();
                    c28676v2 = c28676v1;
                    if (objM87133R7 == c28676v2) {
                        interfaceC28601c11 = interfaceC28601c1;
                        interfaceC28601c12 = interfaceC28601c9;
                        interfaceC28601c13 = interfaceC28601c8;
                        C3482x c3482x = new C3482x(interfaceC28601c11, interfaceC28601c12, interfaceC28601c13, 5);
                        r15.m87172p0(c3482x);
                        obj10 = c3482x;
                    } else {
                        interfaceC28601c11 = interfaceC28601c1;
                        interfaceC28601c12 = interfaceC28601c9;
                        interfaceC28601c13 = interfaceC28601c8;
                        obj10 = objM87133R7;
                    }
                    Modifier modifierM3484c = AbstractC1126a.m3484c(c2314t3, (Function1) obj10);
                    boolM118584o2 = m118584o(interfaceC28601c12);
                    bool2 = Boolean.FALSE;
                    if (!AbstractC22676k.m65745e(boolM118584o2, bool2) || ((c14201q0M118605i3 = viewState.getMemberInfo()) != null && c14201q0M118605i3.getEmailTaken())) {
                        r16 = 1;
                    } else {
                        r16 = r10;
                    }
                    if (AbstractC22676k.m65745e(m118584o(interfaceC28601c12), bool2)) {
                        textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162900k);
                        r55 = r10;
                    } else {
                        c14201q0M118605i2 = viewState.getMemberInfo();
                        if (c14201q0M118605i2 != null) {
                            r54 = r10;
                            if (c14201q0M118605i2.getEmailTaken()) {
                                r52 = r54;
                                textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162903n);
                                r55 = r54;
                            }
                        } else {
                            r52 = r10;
                        }
                        r52 = r54;
                        textResourceM21267a = AbstractC8693b.m21267a();
                        r55 = r52;
                    }
                    interfaceC15237i3 = interfaceC15237i2;
                    zM87157i3 = r15.m87157i(interfaceC15237i3);
                    Object objM87133R19 = r15.m87133R();
                    if (!zM87157i3 || objM87133R19 == c28676v2) {
                        C2564l1 c2564l1 = new C2564l1(interfaceC15237i3, 21);
                        r15.m87172p0(c2564l1);
                        obj11 = c2564l1;
                    } else {
                        obj11 = objM87133R19;
                    }
                    Function1 function10 = (Function1) obj11;
                    C34348q0 c34348q0 = new C34348q0(function10, function10, function10, function10, function10, function10);
                    objM87133R8 = r15.m87133R();
                    obj12 = objM87133R8;
                    if (objM87133R8 == c28676v2) {
                        C36870a c36870a = new C36870a(4);
                        r15.m87172p0(c36870a);
                        obj12 = c36870a;
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) obj12;
                    if (i16 == 32) {
                        r17 = 1;
                    } else {
                        r17 = r55;
                    }
                    objM87133R9 = r15.m87133R();
                    if (r17 == 0 || objM87133R9 == c28676v2) {
                        f16 = f14;
                        C31915d c31915d = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                        r15.m87172p0(c31915d);
                        objM87133R9 = c31915d;
                    } else {
                        f16 = f14;
                    }
                    Function1 function11 = (Function1) objM87133R9;
                    int i25 = TextResource.$stable;
                    int i26 = i25 << 3;
                    int i27 = i25 << 6;
                    int i28 = i25 << 18;
                    r33 = r15;
                    function7 = function6;
                    AbstractC22273b.m63999c(modifierM3484c, textResourceM118602f, textResourceM21278l, 6, null, null, textResourceM21267a, r16, false, false, "EMAIL_INPUT", 0L, null, c34348q0, 6, interfaceC4339a3, function11, r33, 199680 | i26 | i27 | i28, 221190, 6928);
                    float f18 = 2 * f16;
                    AbstractC22953f.m66715b(r33, AbstractC1102d.m3411h(f18, c2314t3));
                    objM87133R10 = r33.m87133R();
                    obj13 = objM87133R10;
                    if (objM87133R10 == c28676v2) {
                        int i29 = AbstractC38022b.f162876Q;
                        TextResource.AbstractC8690d[] abstractC8690dArr = new TextResource.AbstractC8690d[1];
                        abstractC8690dArr[r55] = new TextResource.AbstractC8690d.b(12);
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(i29, abstractC8690dArr);
                        r33.m87172p0(c8688b4);
                        obj13 = c8688b4;
                    }
                    textResourceM21267a2 = (TextResource.C8688b) obj13;
                    TextResource textResourceM118603g = viewState.getHintPassword();
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(m118564I(interfaceC28601c7));
                    if (m118566K(interfaceC28601c3)) {
                        c29885s = new C29885s();
                    } else {
                        c29885s = C29871f0.f122092w;
                    }
                    if (m118564I(interfaceC28601c7).length() > 0 || !m118566K(interfaceC28601c3)) {
                        if (m118564I(interfaceC28601c7).length() > 0 || m118566K(interfaceC28601c3)) {
                            r33.m87150e0(-123351150);
                            r33.m87173q(false);
                            aVar2 = aVar;
                        } else {
                            r33.m87150e0(411655732);
                            int iM46334f0 = C38072d.f163053a.m121951d().getVarious().getStealthMode();
                            C39174f c39174f = new C39174f(f16 * f16);
                            Object objM87133R20 = r33.m87133R();
                            if (objM87133R20 == c28676v2) {
                                obj14 = objM87133R20;
                                e eVar = e.f158093w;
                                r33.m87172p0(eVar);
                                obj14 = eVar;
                            }
                            obj14 = objM87133R20;
                            aVar3 = new AbstractC30784c.a(iM46334f0, c39174f, p745y81.Function1.m125323a((Function1) obj14), null, 8, null);
                            r33.m87173q(false);
                        }
                        objM87133R11 = r33.m87133R();
                        if (objM87133R11 == c28676v2) {
                            interfaceC28601c14 = interfaceC28601c7;
                            interfaceC28601c15 = interfaceC28601c10;
                            C1024j c1024j = new C1024j(10, interfaceC28601c14, interfaceC28601c15);
                            r33.m87172p0(c1024j);
                            obj15 = c1024j;
                        } else {
                            interfaceC28601c14 = interfaceC28601c7;
                            interfaceC28601c15 = interfaceC28601c10;
                            obj15 = objM87133R11;
                        }
                        Modifier modifierM3484c2 = AbstractC1126a.m3484c(c2314t3, (Function1) obj15);
                        boolean zM65745e = AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2);
                        if (!AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2)) {
                            textResourceM21267a2 = AbstractC8693b.m21267a();
                        }
                        zM87157i4 = r33.m87157i(interfaceC15237i3);
                        Object objM87133R21 = r33.m87133R();
                        obj16 = objM87133R21;
                        if (zM87157i4 || objM87133R21 == c28676v2) {
                            C2564l1 c2564l2 = new C2564l1(interfaceC15237i3, 20);
                            r33.m87172p0(c2564l2);
                            obj16 = c2564l2;
                        }
                        Function1 function12 = (Function1) obj16;
                        C34348q0 c34348q1 = new C34348q0(function12, function12, function12, function12, function12, function12);
                        objM87133R12 = r33.m87133R();
                        obj17 = objM87133R12;
                        if (objM87133R12 == c28676v2) {
                            C35429g c35429g = new C35429g(12, interfaceC28601c3);
                            r33.m87172p0(c35429g);
                            obj17 = c35429g;
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) obj17;
                        if (i16 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        Object objM87133R22 = r33.m87133R();
                        if (!z17 || objM87133R22 == c28676v2) {
                            function8 = function7;
                            C2883e c2883e = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                            r33.m87172p0(c2883e);
                            obj18 = c2883e;
                        } else {
                            function8 = function7;
                            obj18 = objM87133R22;
                        }
                        Function1 function13 = function8;
                        AbstractC22273b.m63999c(modifierM3484c2, textResourceM118603g, textResourceM21278l2, 7, c29885s, aVar2, textResourceM21267a2, zM65745e, false, false, "PASSWORD_INPUT", 0L, null, c34348q1, 7, interfaceC4339a4, (Function1) obj18, r33, i26 | 3072 | i27 | (AbstractC30784c.a.f126785f << 15) | i28, 221190, 6912);
                        r18 = r33;
                        AbstractC22953f.m66715b(r18, AbstractC1102d.m3411h(f18, c2314t3));
                        strM118607k = viewState.getTermsAndConditions();
                        if (strM118607k == null) {
                            r18.m87150e0(-122116668);
                            r18.m87173q(false);
                            c2314t4 = c2314t3;
                            r19 = r18;
                        } else {
                            r18.m87150e0(-122116667);
                            C2314t c2314t5 = c2314t3;
                            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t5, 0.0f, f15, 0.0f, 0.0f, 13);
                            ?? r24 = C21053l.f79834a;
                            ?? r25 = C38072d.f163053a;
                            int i34 = C38072d.f163054b;
                            c2314t4 = c2314t5;
                            C21054m c21054mM58880a = r24.m58880a(new C23285v0(0L, 0L, null, null, null, 0L, null, null, 3, 0L, 16744447), r25.m121949b(r18, i34).getWhite50(), r25.m121949b(r18, i34).getWhite50(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r18, 0, C21053l.f79835b << 15, 32760);
                            ?? r110 = r18;
                            AbstractC21048g.m58807M(strM118607k, modifierM3398t, false, c21054mM58880a, null, 0, 0, 0, false, r110, (C21054m.f79836p << 9) | 48, 500);
                            r110.m87173q(false);
                            r19 = r110;
                        }
                        AbstractC25012a.m73388u(13, f13, c2314t4, r19, true);
                        r19.m87173q(true);
                        function3 = function13;
                        r14 = r19;
                    } else {
                        r33.m87150e0(411646864);
                        int iM46322Z = C38072d.f163053a.m121951d().getVarious().getPrivacy();
                        C39174f c39174f2 = new C39174f(f16 * f16);
                        Object objM87133R23 = r33.m87133R();
                        if (objM87133R23 == c28676v2) {
                            obj19 = objM87133R23;
                            d dVar = d.f158092w;
                            r33.m87172p0(dVar);
                            obj19 = dVar;
                        }
                        obj19 = objM87133R23;
                        aVar3 = new AbstractC30784c.a(iM46322Z, c39174f2, p745y81.Function1.m125323a((Function1) obj19), null, 8, null);
                        r33.m87173q(r55);
                    }
                    aVar2 = aVar3;
                    objM87133R11 = r33.m87133R();
                    if (objM87133R11 == c28676v2) {
                        interfaceC28601c14 = interfaceC28601c7;
                        interfaceC28601c15 = interfaceC28601c10;
                        C1024j c1024j2 = new C1024j(10, interfaceC28601c14, interfaceC28601c15);
                        r33.m87172p0(c1024j2);
                        obj15 = c1024j2;
                    } else {
                        interfaceC28601c14 = interfaceC28601c7;
                        interfaceC28601c15 = interfaceC28601c10;
                        obj15 = objM87133R11;
                    }
                    Modifier modifierM3484c3 = AbstractC1126a.m3484c(c2314t3, (Function1) obj15);
                    boolean zM65745e2 = AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2);
                    if (!AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2)) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    zM87157i4 = r33.m87157i(interfaceC15237i3);
                    Object objM87133R24 = r33.m87133R();
                    obj16 = objM87133R24;
                    if (zM87157i4) {
                        C2564l1 c2564l3 = new C2564l1(interfaceC15237i3, 20);
                        r33.m87172p0(c2564l3);
                        obj16 = c2564l3;
                    } else {
                        C2564l1 c2564l4 = new C2564l1(interfaceC15237i3, 20);
                        r33.m87172p0(c2564l4);
                        obj16 = c2564l4;
                    }
                    Function1 function14 = (Function1) obj16;
                    C34348q0 c34348q2 = new C34348q0(function14, function14, function14, function14, function14, function14);
                    objM87133R12 = r33.m87133R();
                    obj17 = objM87133R12;
                    if (objM87133R12 == c28676v2) {
                        C35429g c35429g2 = new C35429g(12, interfaceC28601c3);
                        r33.m87172p0(c35429g2);
                        obj17 = c35429g2;
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) obj17;
                    if (i16 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    Object objM87133R25 = r33.m87133R();
                    if (z17) {
                        function8 = function7;
                        C2883e c2883e2 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                        r33.m87172p0(c2883e2);
                        obj18 = c2883e2;
                    } else {
                        function8 = function7;
                        C2883e c2883e3 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                        r33.m87172p0(c2883e3);
                        obj18 = c2883e3;
                    }
                    Function1 function15 = function8;
                    AbstractC22273b.m63999c(modifierM3484c3, textResourceM118603g, textResourceM21278l2, 7, c29885s, aVar2, textResourceM21267a2, zM65745e2, false, false, "PASSWORD_INPUT", 0L, null, c34348q2, 7, interfaceC4339a5, (Function1) obj18, r33, i26 | 3072 | i27 | (AbstractC30784c.a.f126785f << 15) | i28, 221190, 6912);
                    r18 = r33;
                    AbstractC22953f.m66715b(r18, AbstractC1102d.m3411h(f18, c2314t3));
                    strM118607k = viewState.getTermsAndConditions();
                    if (strM118607k == null) {
                        r18.m87150e0(-122116668);
                        r18.m87173q(false);
                        c2314t4 = c2314t3;
                        r19 = r18;
                    } else {
                        r18.m87150e0(-122116667);
                        C2314t c2314t6 = c2314t3;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t6, 0.0f, f15, 0.0f, 0.0f, 13);
                        ?? r26 = C21053l.f79834a;
                        ?? r27 = C38072d.f163053a;
                        int i35 = C38072d.f163054b;
                        c2314t4 = c2314t6;
                        C21054m c21054mM58880a2 = r26.m58880a(new C23285v0(0L, 0L, null, null, null, 0L, null, null, 3, 0L, 16744447), r27.m121949b(r18, i35).getWhite50(), r27.m121949b(r18, i35).getWhite50(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r18, 0, C21053l.f79835b << 15, 32760);
                        ?? r111 = r18;
                        AbstractC21048g.m58807M(strM118607k, modifierM3398t2, false, c21054mM58880a2, null, 0, 0, 0, false, r111, (C21054m.f79836p << 9) | 48, 500);
                        r111.m87173q(false);
                        r19 = r111;
                    }
                    AbstractC25012a.m73388u(13, f13, c2314t4, r19, true);
                    r19.m87173q(true);
                    function3 = function15;
                    r14 = r19;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N);
                c14201q0M118605i = viewState.getMemberInfo();
                if (c14201q0M118605i == null) {
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    interfaceC28601c7 = interfaceC28601c2;
                    c28676v1 = c28676v0;
                    interfaceC28601c8 = interfaceC28601c5;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c9 = interfaceC28601c4;
                    c0209i6 = c0209i;
                    function6 = function5;
                    interfaceC28601c10 = interfaceC28601c6;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t2;
                    r10 = 0;
                    aVar = null;
                    c28655q.m87150e0(1512498733);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                } else {
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    interfaceC28601c7 = interfaceC28601c2;
                    c28676v1 = c28676v0;
                    interfaceC28601c8 = interfaceC28601c5;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c9 = interfaceC28601c4;
                    c0209i6 = c0209i;
                    function6 = function5;
                    interfaceC28601c10 = interfaceC28601c6;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t2;
                    r10 = 0;
                    aVar = null;
                    c28655q.m87150e0(1512498733);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                f13 = 8;
                float f19 = ((float) 2.5d) * f13;
                f14 = 4;
                f15 = f14 * f13;
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), f19, 0.0f, f19, f15, 2), AbstractC30060g.m92099U(r10, r15, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, r15, 6);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r15.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r15, modifierM92116f1);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i7, c23010xM66775a2);
                AbstractC28683x.m87239G(r15, c0209i6, interfaceC28653p1M87165m3);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N3);
                if (m118590u(interfaceC28670t2M64044h)) {
                    r15.m87150e0(-126571026);
                    AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), r15, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                    r15.m87173q(r10);
                } else {
                    r15.m87150e0(-126366736);
                    AbstractC25012a.m73388u((float) 3.5d, f13, c2314t3, r15, r10);
                }
                AbstractC22953f.m66715b(r15, AbstractC1102d.m3411h(3 * f13, c2314t3));
                TextResource textResourceM118602f2 = viewState.getHintEmail();
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m118591v(interfaceC28601c1));
                objM87133R7 = r15.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R7 == c28676v2) {
                    interfaceC28601c11 = interfaceC28601c1;
                    interfaceC28601c12 = interfaceC28601c9;
                    interfaceC28601c13 = interfaceC28601c8;
                    C3482x c3482x2 = new C3482x(interfaceC28601c11, interfaceC28601c12, interfaceC28601c13, 5);
                    r15.m87172p0(c3482x2);
                    obj10 = c3482x2;
                } else {
                    interfaceC28601c11 = interfaceC28601c1;
                    interfaceC28601c12 = interfaceC28601c9;
                    interfaceC28601c13 = interfaceC28601c8;
                    obj10 = objM87133R7;
                }
                Modifier modifierM3484c4 = AbstractC1126a.m3484c(c2314t3, (Function1) obj10);
                boolM118584o2 = m118584o(interfaceC28601c12);
                bool2 = Boolean.FALSE;
                if (AbstractC22676k.m65745e(boolM118584o2, bool2)) {
                    r16 = 1;
                } else {
                    r16 = 1;
                }
                if (AbstractC22676k.m65745e(m118584o(interfaceC28601c12), bool2)) {
                    textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162900k);
                    r55 = r10;
                } else {
                    c14201q0M118605i2 = viewState.getMemberInfo();
                    if (c14201q0M118605i2 != null) {
                        r54 = r10;
                        if (c14201q0M118605i2.getEmailTaken()) {
                            r52 = r54;
                            textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162903n);
                            r55 = r54;
                        }
                    } else {
                        r52 = r10;
                    }
                    r52 = r54;
                    textResourceM21267a = AbstractC8693b.m21267a();
                    r55 = r52;
                }
                interfaceC15237i3 = interfaceC15237i2;
                zM87157i3 = r15.m87157i(interfaceC15237i3);
                Object objM87133R110 = r15.m87133R();
                if (zM87157i3) {
                    C2564l1 c2564l5 = new C2564l1(interfaceC15237i3, 21);
                    r15.m87172p0(c2564l5);
                    obj11 = c2564l5;
                } else {
                    C2564l1 c2564l6 = new C2564l1(interfaceC15237i3, 21);
                    r15.m87172p0(c2564l6);
                    obj11 = c2564l6;
                }
                Function1 function16 = (Function1) obj11;
                C34348q0 c34348q3 = new C34348q0(function16, function16, function16, function16, function16, function16);
                objM87133R8 = r15.m87133R();
                obj12 = objM87133R8;
                if (objM87133R8 == c28676v2) {
                    C36870a c36870a2 = new C36870a(4);
                    r15.m87172p0(c36870a2);
                    obj12 = c36870a2;
                }
                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) obj12;
                if (i16 == 32) {
                    r17 = 1;
                } else {
                    r17 = r55;
                }
                objM87133R9 = r15.m87133R();
                if (r17 == 0) {
                    f16 = f14;
                    C31915d c31915d2 = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                    r15.m87172p0(c31915d2);
                    objM87133R9 = c31915d2;
                } else {
                    f16 = f14;
                    C31915d c31915d3 = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                    r15.m87172p0(c31915d3);
                    objM87133R9 = c31915d3;
                }
                Function1 function17 = (Function1) objM87133R9;
                int i210 = TextResource.$stable;
                int i211 = i210 << 3;
                int i212 = i210 << 6;
                int i213 = i210 << 18;
                r33 = r15;
                function7 = function6;
                AbstractC22273b.m63999c(modifierM3484c4, textResourceM118602f2, textResourceM21278l3, 6, null, null, textResourceM21267a, r16, false, false, "EMAIL_INPUT", 0L, null, c34348q3, 6, interfaceC4339a6, function17, r33, 199680 | i211 | i212 | i213, 221190, 6928);
                float f110 = 2 * f16;
                AbstractC22953f.m66715b(r33, AbstractC1102d.m3411h(f110, c2314t3));
                objM87133R10 = r33.m87133R();
                obj13 = objM87133R10;
                if (objM87133R10 == c28676v2) {
                    int i214 = AbstractC38022b.f162876Q;
                    TextResource.AbstractC8690d[] abstractC8690dArr2 = new TextResource.AbstractC8690d[1];
                    abstractC8690dArr2[r55] = new TextResource.AbstractC8690d.b(12);
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(i214, abstractC8690dArr2);
                    r33.m87172p0(c8688b5);
                    obj13 = c8688b5;
                }
                textResourceM21267a2 = (TextResource.C8688b) obj13;
                TextResource textResourceM118603g2 = viewState.getHintPassword();
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(m118564I(interfaceC28601c7));
                if (m118566K(interfaceC28601c3)) {
                    c29885s = new C29885s();
                } else {
                    c29885s = C29871f0.f122092w;
                }
                if (m118564I(interfaceC28601c7).length() > 0) {
                    if (m118564I(interfaceC28601c7).length() > 0) {
                    }
                    r33.m87150e0(-123351150);
                    r33.m87173q(false);
                    aVar2 = aVar;
                } else {
                    if (m118564I(interfaceC28601c7).length() > 0) {
                    }
                    r33.m87150e0(-123351150);
                    r33.m87173q(false);
                    aVar2 = aVar;
                }
                objM87133R11 = r33.m87133R();
                if (objM87133R11 == c28676v2) {
                    interfaceC28601c14 = interfaceC28601c7;
                    interfaceC28601c15 = interfaceC28601c10;
                    C1024j c1024j3 = new C1024j(10, interfaceC28601c14, interfaceC28601c15);
                    r33.m87172p0(c1024j3);
                    obj15 = c1024j3;
                } else {
                    interfaceC28601c14 = interfaceC28601c7;
                    interfaceC28601c15 = interfaceC28601c10;
                    obj15 = objM87133R11;
                }
                Modifier modifierM3484c5 = AbstractC1126a.m3484c(c2314t3, (Function1) obj15);
                boolean zM65745e3 = AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2);
                if (!AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2)) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                zM87157i4 = r33.m87157i(interfaceC15237i3);
                Object objM87133R26 = r33.m87133R();
                obj16 = objM87133R26;
                if (zM87157i4) {
                    C2564l1 c2564l7 = new C2564l1(interfaceC15237i3, 20);
                    r33.m87172p0(c2564l7);
                    obj16 = c2564l7;
                } else {
                    C2564l1 c2564l8 = new C2564l1(interfaceC15237i3, 20);
                    r33.m87172p0(c2564l8);
                    obj16 = c2564l8;
                }
                Function1 function18 = (Function1) obj16;
                C34348q0 c34348q4 = new C34348q0(function18, function18, function18, function18, function18, function18);
                objM87133R12 = r33.m87133R();
                obj17 = objM87133R12;
                if (objM87133R12 == c28676v2) {
                    C35429g c35429g3 = new C35429g(12, interfaceC28601c3);
                    r33.m87172p0(c35429g3);
                    obj17 = c35429g3;
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) obj17;
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                Object objM87133R27 = r33.m87133R();
                if (z17) {
                    function8 = function7;
                    C2883e c2883e4 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                    r33.m87172p0(c2883e4);
                    obj18 = c2883e4;
                } else {
                    function8 = function7;
                    C2883e c2883e5 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                    r33.m87172p0(c2883e5);
                    obj18 = c2883e5;
                }
                Function1 function19 = function8;
                AbstractC22273b.m63999c(modifierM3484c5, textResourceM118603g2, textResourceM21278l4, 7, c29885s, aVar2, textResourceM21267a2, zM65745e3, false, false, "PASSWORD_INPUT", 0L, null, c34348q4, 7, interfaceC4339a7, (Function1) obj18, r33, i211 | 3072 | i212 | (AbstractC30784c.a.f126785f << 15) | i213, 221190, 6912);
                r18 = r33;
                AbstractC22953f.m66715b(r18, AbstractC1102d.m3411h(f110, c2314t3));
                strM118607k = viewState.getTermsAndConditions();
                if (strM118607k == null) {
                    r18.m87150e0(-122116668);
                    r18.m87173q(false);
                    c2314t4 = c2314t3;
                    r19 = r18;
                } else {
                    r18.m87150e0(-122116667);
                    C2314t c2314t7 = c2314t3;
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t7, 0.0f, f15, 0.0f, 0.0f, 13);
                    ?? r28 = C21053l.f79834a;
                    ?? r29 = C38072d.f163053a;
                    int i36 = C38072d.f163054b;
                    c2314t4 = c2314t7;
                    C21054m c21054mM58880a3 = r28.m58880a(new C23285v0(0L, 0L, null, null, null, 0L, null, null, 3, 0L, 16744447), r29.m121949b(r18, i36).getWhite50(), r29.m121949b(r18, i36).getWhite50(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r18, 0, C21053l.f79835b << 15, 32760);
                    ?? r112 = r18;
                    AbstractC21048g.m58807M(strM118607k, modifierM3398t3, false, c21054mM58880a3, null, 0, 0, 0, false, r112, (C21054m.f79836p << 9) | 48, 500);
                    r112.m87173q(false);
                    r19 = r112;
                }
                AbstractC25012a.m73388u(13, f13, c2314t4, r19, true);
                r19.m87173q(true);
                function3 = function19;
                r14 = r19;
            } else {
                c28655q.m87138X();
                function3 = function2;
                r14 = c28655q;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(viewState, i13, function3, i14, 25);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v0) {
                    obj22 = objM87133R13;
                    C36680e c36680e2 = new C36680e(19);
                    c28655q.m87172p0(c36680e2);
                    obj22 = c36680e2;
                }
                obj22 = objM87133R13;
                function4 = (Function1) obj22;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            str = "";
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                c14201q0M118605i5 = viewState.getMemberInfo();
                if (c14201q0M118605i5 != null) {
                    strM31439a = "";
                } else {
                    strM31439a = "";
                }
                C28633k1 c28633k1M87272z7 = AbstractC28683x.m87272z(strM31439a);
                c28655q.m87172p0(c28633k1M87272z7);
                obj = c28633k1M87272z7;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj;
            objM87133R2 = c28655q.m87133R();
            obj2 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                c14201q0M118605i4 = viewState.getMemberInfo();
                if (c14201q0M118605i4 != null) {
                    str = strM31441a;
                }
                C28633k1 c28633k1M87272z8 = AbstractC28683x.m87272z(str);
                c28655q.m87172p0(c28633k1M87272z8);
                obj2 = c28633k1M87272z8;
            }
            interfaceC28601c2 = (InterfaceC28601c1) obj2;
            objM87133R3 = c28655q.m87133R();
            obj3 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                C28633k1 c28633k1M87272z9 = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(c28633k1M87272z9);
                obj3 = c28633k1M87272z9;
            }
            interfaceC28601c3 = (InterfaceC28601c1) obj3;
            objM87133R4 = c28655q.m87133R();
            obj4 = objM87133R4;
            if (objM87133R4 == c28676v0) {
                C28633k1 c28633k1M87272z10 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(c28633k1M87272z10);
                obj4 = c28633k1M87272z10;
            }
            interfaceC28601c4 = (InterfaceC28601c1) obj4;
            objM87133R5 = c28655q.m87133R();
            obj5 = objM87133R5;
            if (objM87133R5 == c28676v0) {
                C28633k1 c28633k1M87272z11 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(c28633k1M87272z11);
                obj5 = c28633k1M87272z11;
            }
            interfaceC28601c5 = (InterfaceC28601c1) obj5;
            objM87133R6 = c28655q.m87133R();
            obj6 = objM87133R6;
            if (objM87133R6 == c28676v0) {
                C28633k1 c28633k1M87272z12 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(c28633k1M87272z12);
                obj6 = c28633k1M87272z12;
            }
            interfaceC28601c6 = (InterfaceC28601c1) obj6;
            boolM118584o = m118584o(interfaceC28601c4);
            bool = Boolean.TRUE;
            if (AbstractC22676k.m65745e(boolM118584o, bool)) {
                z13 = false;
            } else {
                z13 = false;
            }
            interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q, 0);
            interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            Boolean boolM118584o4 = m118584o(interfaceC28601c4);
            i16 = i15 & 112;
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i = z14 | c28655q.m87157i(viewState);
            Object objM87133R111 = c28655q.m87133R();
            obj7 = objM87133R111;
            if (zM87157i) {
                a aVar5 = new a(function4, viewState, interfaceC28601c4, null);
                c28655q.m87172p0(aVar5);
                obj7 = aVar5;
            } else {
                a aVar6 = new a(function4, viewState, interfaceC28601c4, null);
                c28655q.m87172p0(aVar6);
                obj7 = aVar6;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj7, boolM118584o4);
            Boolean boolM118588s2 = m118588s(interfaceC28601c6);
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i2 = z15 | c28655q.m87157i(viewState);
            Object objM87133R112 = c28655q.m87133R();
            obj8 = objM87133R112;
            if (zM87157i2) {
                b bVar2 = new b(function4, viewState, interfaceC28601c6, null);
                c28655q.m87172p0(bVar2);
                obj8 = bVar2;
            } else {
                b bVar3 = new b(function4, viewState, interfaceC28601c6, null);
                c28655q.m87172p0(bVar3);
                obj8 = bVar3;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj8, boolM118588s2);
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            if (i16 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87155h = z16 | c28655q.m87155h(z13);
            Object objM87133R113 = c28655q.m87133R();
            obj9 = objM87133R113;
            if (zM87155h) {
                c cVar2 = new c(function4, z13, null);
                c28655q.m87172p0(cVar2);
                obj9 = cVar2;
            } else {
                c cVar3 = new c(function4, z13, null);
                c28655q.m87172p0(cVar3);
                obj9 = cVar3;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj9, boolValueOf2);
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i8 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                c2314t2 = c2314t;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N4);
                c14201q0M118605i = viewState.getMemberInfo();
                if (c14201q0M118605i == null) {
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    interfaceC28601c7 = interfaceC28601c2;
                    c28676v1 = c28676v0;
                    interfaceC28601c8 = interfaceC28601c5;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c9 = interfaceC28601c4;
                    c0209i6 = c0209i;
                    function6 = function5;
                    interfaceC28601c10 = interfaceC28601c6;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t2;
                    r10 = 0;
                    aVar = null;
                    c28655q.m87150e0(1512498733);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                } else {
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    interfaceC28601c7 = interfaceC28601c2;
                    c28676v1 = c28676v0;
                    interfaceC28601c8 = interfaceC28601c5;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC28601c9 = interfaceC28601c4;
                    c0209i6 = c0209i;
                    function6 = function5;
                    interfaceC28601c10 = interfaceC28601c6;
                    c0213j2 = c0213j;
                    c2314t3 = c2314t2;
                    r10 = 0;
                    aVar = null;
                    c28655q.m87150e0(1512498733);
                    c28655q.m87173q(false);
                    r15 = c28655q;
                }
                f13 = 8;
                float f111 = ((float) 2.5d) * f13;
                f14 = 4;
                f15 = f14 * f13;
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), f111, 0.0f, f111, f15, 2), AbstractC30060g.m92099U(r10, r15, 1), 14);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, r15, 6);
                iHashCode2 = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r15.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r15, modifierM92116f2);
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j2);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, c0209i8, c23010xM66775a3);
                AbstractC28683x.m87239G(r15, c0209i6, interfaceC28653p1M87165m5);
                if (r15.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N5);
                if (m118590u(interfaceC28670t2M64044h)) {
                    r15.m87150e0(-126571026);
                    AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), r15, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                    r15.m87173q(r10);
                } else {
                    r15.m87150e0(-126366736);
                    AbstractC25012a.m73388u((float) 3.5d, f13, c2314t3, r15, r10);
                }
                AbstractC22953f.m66715b(r15, AbstractC1102d.m3411h(3 * f13, c2314t3));
                TextResource textResourceM118602f3 = viewState.getHintEmail();
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m118591v(interfaceC28601c1));
                objM87133R7 = r15.m87133R();
                c28676v2 = c28676v1;
                if (objM87133R7 == c28676v2) {
                    interfaceC28601c11 = interfaceC28601c1;
                    interfaceC28601c12 = interfaceC28601c9;
                    interfaceC28601c13 = interfaceC28601c8;
                    C3482x c3482x3 = new C3482x(interfaceC28601c11, interfaceC28601c12, interfaceC28601c13, 5);
                    r15.m87172p0(c3482x3);
                    obj10 = c3482x3;
                } else {
                    interfaceC28601c11 = interfaceC28601c1;
                    interfaceC28601c12 = interfaceC28601c9;
                    interfaceC28601c13 = interfaceC28601c8;
                    obj10 = objM87133R7;
                }
                Modifier modifierM3484c6 = AbstractC1126a.m3484c(c2314t3, (Function1) obj10);
                boolM118584o2 = m118584o(interfaceC28601c12);
                bool2 = Boolean.FALSE;
                if (AbstractC22676k.m65745e(boolM118584o2, bool2)) {
                    r16 = 1;
                } else {
                    r16 = 1;
                }
                if (AbstractC22676k.m65745e(m118584o(interfaceC28601c12), bool2)) {
                    textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162900k);
                    r55 = r10;
                } else {
                    c14201q0M118605i2 = viewState.getMemberInfo();
                    if (c14201q0M118605i2 != null) {
                        r54 = r10;
                        if (c14201q0M118605i2.getEmailTaken()) {
                            r52 = r54;
                            textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162903n);
                            r55 = r54;
                        }
                    } else {
                        r52 = r10;
                    }
                    r52 = r54;
                    textResourceM21267a = AbstractC8693b.m21267a();
                    r55 = r52;
                }
                interfaceC15237i3 = interfaceC15237i2;
                zM87157i3 = r15.m87157i(interfaceC15237i3);
                Object objM87133R114 = r15.m87133R();
                if (zM87157i3) {
                    C2564l1 c2564l9 = new C2564l1(interfaceC15237i3, 21);
                    r15.m87172p0(c2564l9);
                    obj11 = c2564l9;
                } else {
                    C2564l1 c2564l10 = new C2564l1(interfaceC15237i3, 21);
                    r15.m87172p0(c2564l10);
                    obj11 = c2564l10;
                }
                Function1 function110 = (Function1) obj11;
                C34348q0 c34348q5 = new C34348q0(function110, function110, function110, function110, function110, function110);
                objM87133R8 = r15.m87133R();
                obj12 = objM87133R8;
                if (objM87133R8 == c28676v2) {
                    C36870a c36870a3 = new C36870a(4);
                    r15.m87172p0(c36870a3);
                    obj12 = c36870a3;
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) obj12;
                if (i16 == 32) {
                    r17 = 1;
                } else {
                    r17 = r55;
                }
                objM87133R9 = r15.m87133R();
                if (r17 == 0) {
                    f16 = f14;
                    C31915d c31915d4 = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                    r15.m87172p0(c31915d4);
                    objM87133R9 = c31915d4;
                } else {
                    f16 = f14;
                    C31915d c31915d5 = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                    r15.m87172p0(c31915d5);
                    objM87133R9 = c31915d5;
                }
                Function1 function111 = (Function1) objM87133R9;
                int i215 = TextResource.$stable;
                int i216 = i215 << 3;
                int i217 = i215 << 6;
                int i218 = i215 << 18;
                r33 = r15;
                function7 = function6;
                AbstractC22273b.m63999c(modifierM3484c6, textResourceM118602f3, textResourceM21278l5, 6, null, null, textResourceM21267a, r16, false, false, "EMAIL_INPUT", 0L, null, c34348q5, 6, interfaceC4339a8, function111, r33, 199680 | i216 | i217 | i218, 221190, 6928);
                float f112 = 2 * f16;
                AbstractC22953f.m66715b(r33, AbstractC1102d.m3411h(f112, c2314t3));
                objM87133R10 = r33.m87133R();
                obj13 = objM87133R10;
                if (objM87133R10 == c28676v2) {
                    int i219 = AbstractC38022b.f162876Q;
                    TextResource.AbstractC8690d[] abstractC8690dArr3 = new TextResource.AbstractC8690d[1];
                    abstractC8690dArr3[r55] = new TextResource.AbstractC8690d.b(12);
                    TextResource.C8688b c8688b6 = new TextResource.C8688b(i219, abstractC8690dArr3);
                    r33.m87172p0(c8688b6);
                    obj13 = c8688b6;
                }
                textResourceM21267a2 = (TextResource.C8688b) obj13;
                TextResource textResourceM118603g3 = viewState.getHintPassword();
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(m118564I(interfaceC28601c7));
                if (m118566K(interfaceC28601c3)) {
                    c29885s = new C29885s();
                } else {
                    c29885s = C29871f0.f122092w;
                }
                if (m118564I(interfaceC28601c7).length() > 0) {
                    if (m118564I(interfaceC28601c7).length() > 0) {
                    }
                    r33.m87150e0(-123351150);
                    r33.m87173q(false);
                    aVar2 = aVar;
                } else {
                    if (m118564I(interfaceC28601c7).length() > 0) {
                    }
                    r33.m87150e0(-123351150);
                    r33.m87173q(false);
                    aVar2 = aVar;
                }
                objM87133R11 = r33.m87133R();
                if (objM87133R11 == c28676v2) {
                    interfaceC28601c14 = interfaceC28601c7;
                    interfaceC28601c15 = interfaceC28601c10;
                    C1024j c1024j4 = new C1024j(10, interfaceC28601c14, interfaceC28601c15);
                    r33.m87172p0(c1024j4);
                    obj15 = c1024j4;
                } else {
                    interfaceC28601c14 = interfaceC28601c7;
                    interfaceC28601c15 = interfaceC28601c10;
                    obj15 = objM87133R11;
                }
                Modifier modifierM3484c7 = AbstractC1126a.m3484c(c2314t3, (Function1) obj15);
                boolean zM65745e4 = AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2);
                if (!AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2)) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                zM87157i4 = r33.m87157i(interfaceC15237i3);
                Object objM87133R28 = r33.m87133R();
                obj16 = objM87133R28;
                if (zM87157i4) {
                    C2564l1 c2564l11 = new C2564l1(interfaceC15237i3, 20);
                    r33.m87172p0(c2564l11);
                    obj16 = c2564l11;
                } else {
                    C2564l1 c2564l12 = new C2564l1(interfaceC15237i3, 20);
                    r33.m87172p0(c2564l12);
                    obj16 = c2564l12;
                }
                Function1 function112 = (Function1) obj16;
                C34348q0 c34348q6 = new C34348q0(function112, function112, function112, function112, function112, function112);
                objM87133R12 = r33.m87133R();
                obj17 = objM87133R12;
                if (objM87133R12 == c28676v2) {
                    C35429g c35429g4 = new C35429g(12, interfaceC28601c3);
                    r33.m87172p0(c35429g4);
                    obj17 = c35429g4;
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) obj17;
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                Object objM87133R29 = r33.m87133R();
                if (z17) {
                    function8 = function7;
                    C2883e c2883e6 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                    r33.m87172p0(c2883e6);
                    obj18 = c2883e6;
                } else {
                    function8 = function7;
                    C2883e c2883e7 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                    r33.m87172p0(c2883e7);
                    obj18 = c2883e7;
                }
                Function1 function113 = function8;
                AbstractC22273b.m63999c(modifierM3484c7, textResourceM118603g3, textResourceM21278l6, 7, c29885s, aVar2, textResourceM21267a2, zM65745e4, false, false, "PASSWORD_INPUT", 0L, null, c34348q6, 7, interfaceC4339a9, (Function1) obj18, r33, i216 | 3072 | i217 | (AbstractC30784c.a.f126785f << 15) | i218, 221190, 6912);
                r18 = r33;
                AbstractC22953f.m66715b(r18, AbstractC1102d.m3411h(f112, c2314t3));
                strM118607k = viewState.getTermsAndConditions();
                if (strM118607k == null) {
                    r18.m87150e0(-122116668);
                    r18.m87173q(false);
                    c2314t4 = c2314t3;
                    r19 = r18;
                } else {
                    r18.m87150e0(-122116667);
                    C2314t c2314t8 = c2314t3;
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t8, 0.0f, f15, 0.0f, 0.0f, 13);
                    ?? r210 = C21053l.f79834a;
                    ?? r211 = C38072d.f163053a;
                    int i37 = C38072d.f163054b;
                    c2314t4 = c2314t8;
                    C21054m c21054mM58880a4 = r210.m58880a(new C23285v0(0L, 0L, null, null, null, 0L, null, null, 3, 0L, 16744447), r211.m121949b(r18, i37).getWhite50(), r211.m121949b(r18, i37).getWhite50(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r18, 0, C21053l.f79835b << 15, 32760);
                    ?? r113 = r18;
                    AbstractC21048g.m58807M(strM118607k, modifierM3398t4, false, c21054mM58880a4, null, 0, 0, 0, false, r113, (C21054m.f79836p << 9) | 48, 500);
                    r113.m87173q(false);
                    r19 = r113;
                }
                AbstractC25012a.m73388u(13, f13, c2314t4, r19, true);
                r19.m87173q(true);
                function3 = function113;
                r14 = r19;
            } else {
                c2314t2 = c2314t;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            c0209i3 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N4);
            c14201q0M118605i = viewState.getMemberInfo();
            if (c14201q0M118605i == null) {
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                interfaceC28601c7 = interfaceC28601c2;
                c28676v1 = c28676v0;
                interfaceC28601c8 = interfaceC28601c5;
                interfaceC15237i2 = interfaceC15237i;
                interfaceC28601c9 = interfaceC28601c4;
                c0209i6 = c0209i;
                function6 = function5;
                interfaceC28601c10 = interfaceC28601c6;
                c0213j2 = c0213j;
                c2314t3 = c2314t2;
                r10 = 0;
                aVar = null;
                c28655q.m87150e0(1512498733);
                c28655q.m87173q(false);
                r15 = c28655q;
            } else {
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                interfaceC28601c7 = interfaceC28601c2;
                c28676v1 = c28676v0;
                interfaceC28601c8 = interfaceC28601c5;
                interfaceC15237i2 = interfaceC15237i;
                interfaceC28601c9 = interfaceC28601c4;
                c0209i6 = c0209i;
                function6 = function5;
                interfaceC28601c10 = interfaceC28601c6;
                c0213j2 = c0213j;
                c2314t3 = c2314t2;
                r10 = 0;
                aVar = null;
                c28655q.m87150e0(1512498733);
                c28655q.m87173q(false);
                r15 = c28655q;
            }
            f13 = 8;
            float f113 = ((float) 2.5d) * f13;
            f14 = 4;
            f15 = f14 * f13;
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t3), f113, 0.0f, f113, f15, 2), AbstractC30060g.m92099U(r10, r15, 1), 14);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, r15, 6);
            iHashCode2 = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = r15.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(r15, modifierM92116f3);
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j2);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, c0209i8, c23010xM66775a4);
            AbstractC28683x.m87239G(r15, c0209i6, interfaceC28653p1M87165m6);
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r15, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(r15, c0209i4, modifierM118962N6);
            if (m118590u(interfaceC28670t2M64044h)) {
                r15.m87150e0(-126571026);
                AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubTitle(), r15, (TextResource.$stable << 3) | AbstractC22403o.f87638a, 0);
                r15.m87173q(r10);
            } else {
                r15.m87150e0(-126366736);
                AbstractC25012a.m73388u((float) 3.5d, f13, c2314t3, r15, r10);
            }
            AbstractC22953f.m66715b(r15, AbstractC1102d.m3411h(3 * f13, c2314t3));
            TextResource textResourceM118602f4 = viewState.getHintEmail();
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m118591v(interfaceC28601c1));
            objM87133R7 = r15.m87133R();
            c28676v2 = c28676v1;
            if (objM87133R7 == c28676v2) {
                interfaceC28601c11 = interfaceC28601c1;
                interfaceC28601c12 = interfaceC28601c9;
                interfaceC28601c13 = interfaceC28601c8;
                C3482x c3482x4 = new C3482x(interfaceC28601c11, interfaceC28601c12, interfaceC28601c13, 5);
                r15.m87172p0(c3482x4);
                obj10 = c3482x4;
            } else {
                interfaceC28601c11 = interfaceC28601c1;
                interfaceC28601c12 = interfaceC28601c9;
                interfaceC28601c13 = interfaceC28601c8;
                obj10 = objM87133R7;
            }
            Modifier modifierM3484c8 = AbstractC1126a.m3484c(c2314t3, (Function1) obj10);
            boolM118584o2 = m118584o(interfaceC28601c12);
            bool2 = Boolean.FALSE;
            if (AbstractC22676k.m65745e(boolM118584o2, bool2)) {
                r16 = 1;
            } else {
                r16 = 1;
            }
            if (AbstractC22676k.m65745e(m118584o(interfaceC28601c12), bool2)) {
                textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162900k);
                r55 = r10;
            } else {
                c14201q0M118605i2 = viewState.getMemberInfo();
                if (c14201q0M118605i2 != null) {
                    r54 = r10;
                    if (c14201q0M118605i2.getEmailTaken()) {
                        r52 = r54;
                        textResourceM21267a = AbstractC8693b.m21277k(AbstractC38022b.f162903n);
                        r55 = r54;
                    }
                } else {
                    r52 = r10;
                }
                r52 = r54;
                textResourceM21267a = AbstractC8693b.m21267a();
                r55 = r52;
            }
            interfaceC15237i3 = interfaceC15237i2;
            zM87157i3 = r15.m87157i(interfaceC15237i3);
            Object objM87133R115 = r15.m87133R();
            if (zM87157i3) {
                C2564l1 c2564l13 = new C2564l1(interfaceC15237i3, 21);
                r15.m87172p0(c2564l13);
                obj11 = c2564l13;
            } else {
                C2564l1 c2564l14 = new C2564l1(interfaceC15237i3, 21);
                r15.m87172p0(c2564l14);
                obj11 = c2564l14;
            }
            Function1 function114 = (Function1) obj11;
            C34348q0 c34348q7 = new C34348q0(function114, function114, function114, function114, function114, function114);
            objM87133R8 = r15.m87133R();
            obj12 = objM87133R8;
            if (objM87133R8 == c28676v2) {
                C36870a c36870a4 = new C36870a(4);
                r15.m87172p0(c36870a4);
                obj12 = c36870a4;
            }
            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) obj12;
            if (i16 == 32) {
                r17 = 1;
            } else {
                r17 = r55;
            }
            objM87133R9 = r15.m87133R();
            if (r17 == 0) {
                f16 = f14;
                C31915d c31915d6 = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                r15.m87172p0(c31915d6);
                objM87133R9 = c31915d6;
            } else {
                f16 = f14;
                C31915d c31915d7 = new C31915d(function6, (Object) interfaceC28601c11, (Object) interfaceC28601c13, (Object) interfaceC28601c12, 21);
                r15.m87172p0(c31915d7);
                objM87133R9 = c31915d7;
            }
            Function1 function115 = (Function1) objM87133R9;
            int i2110 = TextResource.$stable;
            int i2111 = i2110 << 3;
            int i2112 = i2110 << 6;
            int i2113 = i2110 << 18;
            r33 = r15;
            function7 = function6;
            AbstractC22273b.m63999c(modifierM3484c8, textResourceM118602f4, textResourceM21278l7, 6, null, null, textResourceM21267a, r16, false, false, "EMAIL_INPUT", 0L, null, c34348q7, 6, interfaceC4339a10, function115, r33, 199680 | i2111 | i2112 | i2113, 221190, 6928);
            float f114 = 2 * f16;
            AbstractC22953f.m66715b(r33, AbstractC1102d.m3411h(f114, c2314t3));
            objM87133R10 = r33.m87133R();
            obj13 = objM87133R10;
            if (objM87133R10 == c28676v2) {
                int i2114 = AbstractC38022b.f162876Q;
                TextResource.AbstractC8690d[] abstractC8690dArr4 = new TextResource.AbstractC8690d[1];
                abstractC8690dArr4[r55] = new TextResource.AbstractC8690d.b(12);
                TextResource.C8688b c8688b7 = new TextResource.C8688b(i2114, abstractC8690dArr4);
                r33.m87172p0(c8688b7);
                obj13 = c8688b7;
            }
            textResourceM21267a2 = (TextResource.C8688b) obj13;
            TextResource textResourceM118603g4 = viewState.getHintPassword();
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(m118564I(interfaceC28601c7));
            if (m118566K(interfaceC28601c3)) {
                c29885s = new C29885s();
            } else {
                c29885s = C29871f0.f122092w;
            }
            if (m118564I(interfaceC28601c7).length() > 0) {
                if (m118564I(interfaceC28601c7).length() > 0) {
                }
                r33.m87150e0(-123351150);
                r33.m87173q(false);
                aVar2 = aVar;
            } else {
                if (m118564I(interfaceC28601c7).length() > 0) {
                }
                r33.m87150e0(-123351150);
                r33.m87173q(false);
                aVar2 = aVar;
            }
            objM87133R11 = r33.m87133R();
            if (objM87133R11 == c28676v2) {
                interfaceC28601c14 = interfaceC28601c7;
                interfaceC28601c15 = interfaceC28601c10;
                C1024j c1024j5 = new C1024j(10, interfaceC28601c14, interfaceC28601c15);
                r33.m87172p0(c1024j5);
                obj15 = c1024j5;
            } else {
                interfaceC28601c14 = interfaceC28601c7;
                interfaceC28601c15 = interfaceC28601c10;
                obj15 = objM87133R11;
            }
            Modifier modifierM3484c9 = AbstractC1126a.m3484c(c2314t3, (Function1) obj15);
            boolean zM65745e5 = AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2);
            if (!AbstractC22676k.m65745e(m118588s(interfaceC28601c15), bool2)) {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            }
            zM87157i4 = r33.m87157i(interfaceC15237i3);
            Object objM87133R210 = r33.m87133R();
            obj16 = objM87133R210;
            if (zM87157i4) {
                C2564l1 c2564l15 = new C2564l1(interfaceC15237i3, 20);
                r33.m87172p0(c2564l15);
                obj16 = c2564l15;
            } else {
                C2564l1 c2564l16 = new C2564l1(interfaceC15237i3, 20);
                r33.m87172p0(c2564l16);
                obj16 = c2564l16;
            }
            Function1 function116 = (Function1) obj16;
            C34348q0 c34348q8 = new C34348q0(function116, function116, function116, function116, function116, function116);
            objM87133R12 = r33.m87133R();
            obj17 = objM87133R12;
            if (objM87133R12 == c28676v2) {
                C35429g c35429g5 = new C35429g(12, interfaceC28601c3);
                r33.m87172p0(c35429g5);
                obj17 = c35429g5;
            }
            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) obj17;
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            Object objM87133R211 = r33.m87133R();
            if (z17) {
                function8 = function7;
                C2883e c2883e8 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                r33.m87172p0(c2883e8);
                obj18 = c2883e8;
            } else {
                function8 = function7;
                C2883e c2883e9 = new C2883e(5, function8, interfaceC28601c14, interfaceC28601c15);
                r33.m87172p0(c2883e9);
                obj18 = c2883e9;
            }
            Function1 function117 = function8;
            AbstractC22273b.m63999c(modifierM3484c9, textResourceM118603g4, textResourceM21278l8, 7, c29885s, aVar2, textResourceM21267a2, zM65745e5, false, false, "PASSWORD_INPUT", 0L, null, c34348q8, 7, interfaceC4339a11, (Function1) obj18, r33, i2111 | 3072 | i2112 | (AbstractC30784c.a.f126785f << 15) | i2113, 221190, 6912);
            r18 = r33;
            AbstractC22953f.m66715b(r18, AbstractC1102d.m3411h(f114, c2314t3));
            strM118607k = viewState.getTermsAndConditions();
            if (strM118607k == null) {
                r18.m87150e0(-122116668);
                r18.m87173q(false);
                c2314t4 = c2314t3;
                r19 = r18;
            } else {
                r18.m87150e0(-122116667);
                C2314t c2314t9 = c2314t3;
                Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t9, 0.0f, f15, 0.0f, 0.0f, 13);
                ?? r212 = C21053l.f79834a;
                ?? r213 = C38072d.f163053a;
                int i38 = C38072d.f163054b;
                c2314t4 = c2314t9;
                C21054m c21054mM58880a5 = r212.m58880a(new C23285v0(0L, 0L, null, null, null, 0L, null, null, 3, 0L, 16744447), r213.m121949b(r18, i38).getWhite50(), r213.m121949b(r18, i38).getWhite50(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, r18, 0, C21053l.f79835b << 15, 32760);
                ?? r114 = r18;
                AbstractC21048g.m58807M(strM118607k, modifierM3398t5, false, c21054mM58880a5, null, 0, 0, 0, false, r114, (C21054m.f79836p << 9) | 48, 500);
                r114.m87173q(false);
                r19 = r114;
            }
            AbstractC25012a.m73388u(13, f13, c2314t4, r19, true);
            r19.m87173q(true);
            function3 = function117;
            r14 = r19;
        } else {
            c28655q.m87138X();
            function3 = function2;
            r14 = c28655q;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, function3, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m118583n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Boolean m118584o(InterfaceC28601c1 interfaceC28601c1) {
        return (Boolean) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m118585p(InterfaceC28601c1 interfaceC28601c1, Boolean bool) {
        interfaceC28601c1.setValue(bool);
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m118586q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    private static final void m118587r(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Boolean m118588s(InterfaceC28601c1 interfaceC28601c1) {
        return (Boolean) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m118589t(InterfaceC28601c1 interfaceC28601c1, Boolean bool) {
        interfaceC28601c1.setValue(bool);
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m118590u(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    private static final String m118591v(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m118592w(Function1 function1) {
        function1.invoke(InterfaceC21413a.f.f82107a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m118593x(Function1 function1) {
        function1.invoke(InterfaceC21413a.f.f82107a);
        function1.invoke(new AbstractC23438o.g(ActivationFlowDestination.ENTER_YOUR_EMAIL, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m118594y(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        if (!((EnumC15251w) it).m43353a() && m118591v(interfaceC28601c1).length() > 0) {
            m118585p(interfaceC28601c2, Boolean.valueOf(C22285n.f86963a.m64020a(m118591v(interfaceC28601c1))));
            m118587r(interfaceC28601c3, true);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m118595z(InterfaceC15237i interfaceC15237i, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        ((C15240l) interfaceC15237i).m43345h(1);
        return C23454a0.f92919a;
    }
}
