package w90;

import am0.C0998b;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.presentation.edit.C9723b;
import d42.C11690f;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t80.C33592b;
import vq2.C36287d;
import w01.C36680e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w90.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018²\u0006\u000e\u0010\u0014\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"}, m65681d2 = {"Lw90/c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "s", "(Lw90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lc31/k;", "progressButtonState", "", "isVisible", "j", "(Lc31/k;ZLandroidx/compose/runtime/Composer;I)V", "", "text", "", "delayPerCharacter", "n", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V", "iconVisible", "buttonVisible", "", "alpha", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36952b {

    /* JADX INFO: renamed from: w90.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.welcometransition.WelcomeTransitionScreenKt$AnimatedTextFadeIn$1$1$1$1", m100430f = "WelcomeTransitionScreen.kt", m100431l = {182}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158108w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f158109x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f158110y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f158111z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158109x = i13;
            this.f158110y = i14;
            this.f158111z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f158109x, this.f158110y, this.f158111z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158108w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = ((long) this.f158109x) * ((long) this.f158110y);
                this.f158108w = 1;
                if (AbstractC3034m0.m8782b(j7 + ((long) 100), this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC36952b.m118659p(this.f158111z, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: w90.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.welcometransition.WelcomeTransitionScreenKt$WelcomeTransitionScreenView$2$1", m100430f = "WelcomeTransitionScreen.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f158112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f158113x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f158114y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f158115z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f158113x = function1;
            this.f158114y = interfaceC28601c1;
            this.f158115z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f158113x, this.f158114y, this.f158115z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f158112w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f158113x.invoke(EnumC3921e.HIDE);
                AbstractC36952b.m118665v(this.f158114y, true);
                AbstractC36952b.m118667x(this.f158115z, true);
                this.f158112w = 1;
                if (AbstractC3034m0.m8782b(3500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f158113x.invoke(EnumC3921e.SHOW);
            AbstractC36952b.m118667x(this.f158115z, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m118639A(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51550E(c17920x0.getDensity() * 2 * 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m118640B(C36953c c36953c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118662s(c36953c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m118653j(C3927k c3927k, boolean z4, Composer composer, int i13) {
        int i14;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-551865760);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c3927k) : c28655q.m87157i(c3927k) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(800, 2700, null, 4);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C36680e(22);
                c28655q.m87172p0(objM87133R);
            }
            z13 = z4;
            AbstractC1090b.m3351f(z13, null, AbstractC3788w0.m11587o(c11347e2M30574v, (Function1) objM87133R).m11562a(AbstractC3788w0.m11577e(AbstractC11348f.m30574v(200, 0, null, 6), 2)), AbstractC3788w0.m11578f(AbstractC11348f.m30574v(10, 0, null, 6), 2), null, AbstractC37817c.m121344e(-472264392, c28655q, new C36287d(c3927k, 2)), c28655q, ((i14 >> 3) & 14) | 200064, 18);
        } else {
            z13 = z4;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0998b(c3927k, z13, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final int m118654k(int i13) {
        return 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m118655l(C3927k c3927k, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC3926j.m11931e(c3927k, null, composer, C3927k.f16020r, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m118656m(C3927k c3927k, boolean z4, int i13, Composer composer, int i14) {
        m118653j(c3927k, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: n */
    private static final void m118657n(String str, int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q;
        Object obj;
        String str2 = str;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2007052231);
        if ((i14 & 6) == 0) {
            i15 = (c28655q2.m87153g(str2) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i16 = 32;
        if ((i14 & 48) == 0) {
            i15 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        int i17 = i15;
        char c3 = 18;
        int i18 = 1;
        int i19 = 0;
        if (c28655q2.m87135U(i17 & 1, (i17 & 19) != 18)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(847952488);
            int i24 = 0;
            int i25 = 0;
            C28655q c28655q3 = c28655q2;
            while (i25 < str2.length()) {
                char cCharAt = str2.charAt(i25);
                int i26 = i24 + 1;
                Object objM87133R = c28655q3.m87133R();
                Object obj2 = C28635l.f115821a;
                if (objM87133R == obj2) {
                    obj = objM87133R;
                    Object objM87272z = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87272z);
                    obj = objM87272z;
                }
                obj = objM87133R;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj;
                int i27 = ((i17 & 112) == i16 ? i18 : i19) | (c28655q3.m87149e(i24) ? 1 : 0);
                Object objM87133R2 = c28655q3.m87133R();
                Object obj3 = objM87133R2;
                if (i27 != 0 || objM87133R2 == obj2) {
                    Object aVar = new a(i13, i24, interfaceC28601c1, null);
                    c28655q3.m87172p0(aVar);
                    obj3 = aVar;
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) obj3, C23454a0.f92919a);
                int i28 = i24;
                InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m118658o(interfaceC28601c1) ? 1.0f : 0.0f, AbstractC11348f.m30574v(500, i19, null, 6), "", null, c28655q3, 3120, 20);
                String strValueOf = String.valueOf(cCharAt);
                Modifier modifierM107879c = AbstractC34132o.m107879c(m118660q(interfaceC28670t2M30588b), AbstractC1136a.m3599a(c2314t, "AnimatedCharacter" + i28 + cCharAt));
                C38072d c38072d = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C28655q c28655q4 = c28655q3;
                AbstractC30795n.m94707h(strValueOf, modifierM107879c, c38072d.m121949b(c28655q3, i29).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getT2(), null, c28655q4, 0, C2886a.f11498d << 18, 196600);
                c28655q3 = c28655q4;
                i25++;
                i18 = 1;
                i19 = i19;
                i24 = i26;
                c3 = c3;
                i16 = 32;
                c2314t = c2314t;
                str2 = str;
            }
            c28655q3.m87173q(i19);
            c28655q3.m87173q(true);
            c28655q = c28655q3;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9723b(str, i13, i14, 6);
        }
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m118658o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m118659p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: q */
    private static final float m118660q(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m118661r(String str, int i13, int i14, Composer composer, int i15) {
        m118657n(str, i13, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0325  */
    /* JADX WARN: Code duplicated, block: B:105:0x032f  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x0238  */
    /* JADX WARN: Code duplicated, block: B:82:0x0244  */
    /* JADX WARN: Code duplicated, block: B:85:0x0281  */
    /* JADX WARN: Code duplicated, block: B:86:0x028d  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x0307  */
    /* JADX INFO: renamed from: s */
    public static final void m118662s(C36953c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z13;
        Object objM87133R3;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int iHashCode2;
        C23016z c23016z;
        int iHashCode3;
        String strM118675g;
        boolean z14;
        C3927k c3927kM118674f;
        Object objM87133R4;
        int iHashCode4;
        boolean z15;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1303055226);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
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
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C36680e(23);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    objM87133R3 = new b(function4, interfaceC28601c1, interfaceC28601c2, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
                Function1 function5 = function4;
                c28655q = c28655q;
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3407d2, null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                C2305k c2305k = C2299e.f9111N;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c23016z = C23016z.f90757a;
                Modifier modifierM66779c = c23016z.m66779c(c2314t, true, 1.0f);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66779c);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                m118657n(viewState.getTitle(), 800 / viewState.getTitle().length(), c28655q, 0);
                AbstractC1090b.m3350e(c23016z, m118664u(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(800, 1000, null, 4), 2), null, null, AbstractC37817c.m121344e(703711568, c28655q, new C36287d(viewState, 3)), c28655q, 1575942, 26);
                strM118675g = viewState.getSubtitle();
                if (strM118675g == null) {
                    c28655q.m87150e0(-1734601449);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1734601448);
                    AbstractC1090b.m3350e(c23016z, m118664u(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(800, 1800, null, 4), 2), null, null, AbstractC37817c.m121344e(-1405584862, c28655q, new C11690f(strM118675g, 5)), c28655q, 1575942, 26);
                    z14 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c3927kM118674f = viewState.getProgressButtonState();
                if (c3927kM118674f == null) {
                    c28655q.m87150e0(554538484);
                    c28655q.m87173q(z14);
                    z15 = true;
                } else {
                    c28655q.m87150e0(554538485);
                    float f13 = 4 * 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), f13, 0.0f, f13, 0.0f, 10);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36680e(24);
                        c28655q.m87172p0(objM87133R4);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3398t, (Function1) objM87133R4);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3486a);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    m118653j(c3927kM118674f, m118666w(interfaceC28601c2), c28655q, C3927k.f16020r);
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(viewState, i13, function3, i14, 26);
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
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C36680e(23);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = c28655q.m87133R();
            if (z13) {
                objM87133R3 = new b(function4, interfaceC28601c1, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(function4, interfaceC28601c1, interfaceC28601c2, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
            Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(viewState.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            Function1 function6 = function4;
            c28655q = c28655q;
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, modifierM3407d5, null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
            Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
            C2305k c2305k2 = C2299e.f9111N;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
            c23016z = C23016z.f90757a;
            Modifier modifierM66779c2 = c23016z.m66779c(c2314t, true, 1.0f);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k2, c28655q, 54);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66779c2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
            m118657n(viewState.getTitle(), 800 / viewState.getTitle().length(), c28655q, 0);
            AbstractC1090b.m3350e(c23016z, m118664u(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(800, 1000, null, 4), 2), null, null, AbstractC37817c.m121344e(703711568, c28655q, new C36287d(viewState, 3)), c28655q, 1575942, 26);
            strM118675g = viewState.getSubtitle();
            if (strM118675g == null) {
                c28655q.m87150e0(-1734601449);
                z14 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1734601448);
                AbstractC1090b.m3350e(c23016z, m118664u(interfaceC28601c1), null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(800, 1800, null, 4), 2), null, null, AbstractC37817c.m121344e(-1405584862, c28655q, new C11690f(strM118675g, 5)), c28655q, 1575942, 26);
                z14 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c3927kM118674f = viewState.getProgressButtonState();
            if (c3927kM118674f == null) {
                c28655q.m87150e0(554538484);
                c28655q.m87173q(z14);
                z15 = true;
            } else {
                c28655q.m87150e0(554538485);
                float f14 = 4 * 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9106I), f14, 0.0f, f14, 0.0f, 10);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C36680e(24);
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3398t2, (Function1) objM87133R4);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3486a2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                m118653j(c3927kM118674f, m118666w(interfaceC28601c2), c28655q, C3927k.f16020r);
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            function3 = function6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, function3, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m118663t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m118664u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m118665v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: w */
    private static final boolean m118666w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m118667x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m118668y(C36953c c36953c, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC29125c.m88522c(AbstractC22404p.m64500i(c36953c.getLogoImage(), null, null, composer, AbstractC22403o.f87638a, 3), null, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * 8, 0.0f, 0.0f, 13), null, C39102j.f168199a, 0.0f, null, composer, 25008, 104);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m118669z(String str, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 2 * 8, 0.0f, 0.0f, 13), "WelcomeTransitionSubtitle");
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        AbstractC30795n.m94707h(str, modifierM3599a, c38072d.m121949b(composer, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i14).getH3(), null, composer, 48, C2886a.f11498d << 18, 196600);
        return C23454a0.f92919a;
    }
}
