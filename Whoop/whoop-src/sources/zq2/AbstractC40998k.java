package zq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import er2.EnumC13585g;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13821r1;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p635y2.InterfaceC39127r0;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p748zc1.C40317e8;
import p748zc1.C40392l6;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qq2.AbstractC30553b;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rq2.AbstractC31752t0;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import zm1.C40893d;

/* JADX INFO: renamed from: zq2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\u0014²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzq2/f;", "viewState", "", "isCurrentStep", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lzq2/a;", "userSelectedAnswer", "isQuestionAnimationFinished", "isResponseAnimationFinished", "", "animatedWhoopCoachQuestionText", "animatedWhoopCoachResponseText", "animatedWhoopCoachAnswerText", "Ly3/l;", "screenSize", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40998k {

    /* JADX INFO: renamed from: zq2.k$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.quiz.QuizStepViewV2Kt$QuizStepViewV2$1$1", m100430f = "QuizStepViewV2.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176940w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f176941x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13821r1 c13821r1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176941x = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f176941x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176940w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f176941x;
                int iM87024x = c13821r1.f49321d.m87024x();
                this.f176940w = 1;
                if (c13821r1.m39185g(iM87024x, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zq2.k$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f176942w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f176943x;

        public b(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            this.f176942w = function1;
            this.f176943x = interfaceC28601c1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m133198b(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C16617b c16617b) {
            if (AbstractC40996i.m133134K(c16617b.f63937a, (int) (AbstractC40998k.m133191u(interfaceC28601c1) >> 32))) {
                function1.invoke(AbstractC31752t0.a.f131481a);
            } else {
                function1.invoke(AbstractC31752t0.b.f131482a);
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C40997j(this.f176942w, this.f176943x, 1), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m133163A(InterfaceC28601c1 interfaceC28601c1) {
        m133169G(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m133164B(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133187q(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m133165C(C40993f c40993f, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m133180j(c40993f, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m133166D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m133167E(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: F */
    private static final boolean m133168F(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: G */
    private static final void m133169G(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:111:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:117:0x0333  */
    /* JADX WARN: Code duplicated, block: B:120:0x034a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0357  */
    /* JADX WARN: Code duplicated, block: B:124:0x0361  */
    /* JADX WARN: Code duplicated, block: B:125:0x0370  */
    /* JADX WARN: Code duplicated, block: B:128:0x03af  */
    /* JADX WARN: Code duplicated, block: B:130:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:137:0x0458  */
    /* JADX WARN: Code duplicated, block: B:82:0x021c  */
    /* JADX WARN: Code duplicated, block: B:83:0x021e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0227  */
    /* JADX WARN: Code duplicated, block: B:90:0x025b  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:96:0x027a  */
    /* JADX WARN: Code duplicated, block: B:99:0x02a7  */
    /* JADX INFO: renamed from: j */
    public static final void m133180j(C40993f viewState, boolean z4, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        float f14;
        int i15;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C23016z c23016z;
        boolean z14;
        C40988a c40988aM133181k;
        TextResource textResourceM133219a;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z15;
        Object objM87133R4;
        boolean z16;
        boolean zM87157i;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-589959337);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (z4) {
            c28655q.m87150e0(-472110995);
            Object objM87133R6 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R6;
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R7);
            }
            InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R7;
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R8;
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R9;
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R10);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R10;
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = AbstractC28683x.m87272z("");
                c28655q.m87172p0(objM87133R11);
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R11;
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            Boolean boolValueOf = Boolean.valueOf(c13821r1M92099U.mo39183d());
            boolean zM87153g = c28655q.m87153g(c13821r1M92099U);
            Object objM87133R12 = c28655q.m87133R();
            if (zM87153g || objM87133R12 == c28676v0) {
                objM87133R12 = new a(c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R12);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, boolValueOf);
            TextResource textResourceM133123n = viewState.getWhoopCoachQuestion();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM133123n, c28655q, i16);
            long jM133119j = viewState.getTypingAnimationDelayTimeMillis();
            Object objM87133R13 = c28655q.m87133R();
            if (objM87133R13 == c28676v0) {
                objM87133R13 = new C40317e8(17, interfaceC28601c8);
                c28655q.m87172p0(objM87133R13);
            }
            Function1 function1 = (Function1) objM87133R13;
            Object objM87133R14 = c28655q.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = new C40392l6(18, interfaceC28601c6);
                c28655q.m87172p0(objM87133R14);
            }
            AbstractC30553b.m93699l(strM21274h, jM133119j, function1, (InterfaceC4339a) objM87133R14, c28655q, 3456, 0);
            Object objM87133R15 = c28655q.m87133R();
            if (objM87133R15 == c28676v0) {
                objM87133R15 = AbstractC28683x.m87272z(new C39180l(0L));
                c28655q.m87172p0(objM87133R15);
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) objM87133R15;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            Object objM87133R16 = c28655q.m87133R();
            if (objM87133R16 == c28676v0) {
                objM87133R16 = new C40893d(5);
                c28655q.m87172p0(objM87133R16);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R16);
            Object objM87133R17 = c28655q.m87133R();
            if (objM87133R17 == c28676v0) {
                objM87133R17 = new C40317e8(18, interfaceC28601c11);
                c28655q.m87172p0(objM87133R17);
            }
            Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3480c, (Function1) objM87133R17);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3502b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                interfaceC28601c1 = interfaceC28601c5;
            } else {
                interfaceC28601c1 = interfaceC28601c5;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                f13 = 8;
                f14 = 2 * f13;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
                i15 = i14 & 896;
                if (i15 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new b(onViewEvent, interfaceC28601c11);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC34452c0.m108903b(modifierM3396r, C23454a0.f92919a, (PointerInputEventHandler) objM87133R), c13821r1M92099U, 12);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c23016z = C23016z.f90757a;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3413j(c23016z.m66779c(c2314t, true, 1.0f), 0.0f, ((float) 40.5d) * f13, 1));
                AbstractC41001n.m133210b(m133182l(interfaceC28601c8), c28655q, 0);
                if (m133166D(interfaceC28601c6)) {
                    c28655q.m87150e0(-1028908855);
                    if (m133181k(interfaceC28601c1) == null) {
                        c28655q.m87150e0(-1028935825);
                        List<C40988a> listM133114e = viewState.m133114e();
                        if (i15 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87157i = c28655q.m87157i(viewState) | z16;
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i || objM87133R5 == c28676v0) {
                            objM87133R5 = new C40995h(onViewEvent, viewState, interfaceC28601c1, 1);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC40991d.m133104d(listM133114e, (Function1) objM87133R5, c28655q, 0);
                        c28655q.m87173q(false);
                        z14 = false;
                    } else {
                        InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c1;
                        c28655q.m87150e0(-1028372214);
                        float f15 = 4 * f13;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                        AbstractC22403o abstractC22403oM133115f = viewState.getAvatar();
                        EnumC13585g enumC13585gM133116g = viewState.getChatType();
                        C40988a c40988aM133181k2 = m133181k(interfaceC28601c12);
                        int i17 = AbstractC22403o.f87638a << 3;
                        AbstractC41000m.m133207b(c23016z, abstractC22403oM133115f, enumC13585gM133116g, c40988aM133181k2, c28655q, 6 | i17 | (i16 << 9));
                        c40988aM133181k = m133181k(interfaceC28601c12);
                        if (c40988aM133181k == null && c40988aM133181k.getIsCorrect()) {
                            textResourceM133219a = viewState.getWhoopCoachCorrectResponse().getText();
                        } else {
                            textResourceM133219a = viewState.getWhoopCoachIncorrectResponse().getText();
                        }
                        String strM21274h2 = AbstractC8693b.m21274h(textResourceM133219a, c28655q, i16);
                        long jM133119j2 = viewState.getTypingAnimationDelayTimeMillis();
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            interfaceC28601c2 = interfaceC28601c9;
                            objM87133R2 = new C40317e8(19, interfaceC28601c2);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            interfaceC28601c2 = interfaceC28601c9;
                        }
                        Function1 function2 = (Function1) objM87133R2;
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            interfaceC28601c3 = interfaceC28601c7;
                            objM87133R3 = new C40392l6(19, interfaceC28601c3);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            interfaceC28601c3 = interfaceC28601c7;
                        }
                        AbstractC30553b.m93699l(strM21274h2, jM133119j2, function2, (InterfaceC4339a) objM87133R3, c28655q, 3456, 0);
                        AbstractC41002o.m133215d(m133181k(interfaceC28601c12), viewState.getCorrectResponseIcon(), m133184n(interfaceC28601c2), viewState.getWhoopCoachCorrectResponse().getTextColor(), viewState.getWhoopCoachIncorrectResponse().getTextColor(), viewState.getLottieWrapper(), c28655q, i16 | i17);
                        if (m133168F(interfaceC28601c3)) {
                            c28655q.m87150e0(-1026800111);
                            String strM21274h3 = AbstractC8693b.m21274h(viewState.getWhoopCoachAnswerStatement(), c28655q, i16);
                            long jM133119j3 = viewState.getTypingAnimationDelayTimeMillis();
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                interfaceC28601c4 = interfaceC28601c10;
                                objM87133R4 = new C40317e8(20, interfaceC28601c4);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                interfaceC28601c4 = interfaceC28601c10;
                            }
                            AbstractC30553b.m93699l(strM21274h3, jM133119j3, (Function1) objM87133R4, null, c28655q, 384, 8);
                            z15 = false;
                            c28655q.m87173q(false);
                        } else {
                            interfaceC28601c4 = interfaceC28601c10;
                            z15 = false;
                            c28655q.m87150e0(-1026445502);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, f15, f14, ((float) 6.5d) * f13, 0.0f, 8), "Quiz whoop coach answer text");
                        String strM133186p = m133186p(interfaceC28601c4);
                        C38072d c38072d = C38072d.f163053a;
                        int i18 = C38072d.f163054b;
                        z14 = z15;
                        AbstractC30795n.m94707h(strM133186p, modifierM3599a, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(z14);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-1025932638);
                    c28655q.m87173q(false);
                }
                AbstractC25012a.m73392y(c28655q, true, true, z14);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            f13 = 8;
            f14 = 2 * f13;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
            i15 = i14 & 896;
            if (i15 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new b(onViewEvent, interfaceC28601c11);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new b(onViewEvent, interfaceC28601c11);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC34452c0.m108903b(modifierM3396r2, C23454a0.f92919a, (PointerInputEventHandler) objM87133R), c13821r1M92099U, 12);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            c23016z = C23016z.f90757a;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3413j(c23016z.m66779c(c2314t, true, 1.0f), 0.0f, ((float) 40.5d) * f13, 1));
            AbstractC41001n.m133210b(m133182l(interfaceC28601c8), c28655q, 0);
            if (m133166D(interfaceC28601c6)) {
                c28655q.m87150e0(-1028908855);
                if (m133181k(interfaceC28601c1) == null) {
                    c28655q.m87150e0(-1028935825);
                    List<C40988a> listM133114e2 = viewState.m133114e();
                    if (i15 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = c28655q.m87157i(viewState) | z16;
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i) {
                        objM87133R5 = new C40995h(onViewEvent, viewState, interfaceC28601c1, 1);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C40995h(onViewEvent, viewState, interfaceC28601c1, 1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC40991d.m133104d(listM133114e2, (Function1) objM87133R5, c28655q, 0);
                    c28655q.m87173q(false);
                    z14 = false;
                } else {
                    InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c1;
                    c28655q.m87150e0(-1028372214);
                    float f16 = 4 * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                    AbstractC22403o abstractC22403oM133115f2 = viewState.getAvatar();
                    EnumC13585g enumC13585gM133116g2 = viewState.getChatType();
                    C40988a c40988aM133181k3 = m133181k(interfaceC28601c13);
                    int i19 = AbstractC22403o.f87638a << 3;
                    AbstractC41000m.m133207b(c23016z, abstractC22403oM133115f2, enumC13585gM133116g2, c40988aM133181k3, c28655q, 6 | i19 | (i16 << 9));
                    c40988aM133181k = m133181k(interfaceC28601c13);
                    if (c40988aM133181k == null) {
                        textResourceM133219a = viewState.getWhoopCoachIncorrectResponse().getText();
                    } else {
                        textResourceM133219a = viewState.getWhoopCoachIncorrectResponse().getText();
                    }
                    String strM21274h4 = AbstractC8693b.m21274h(textResourceM133219a, c28655q, i16);
                    long jM133119j4 = viewState.getTypingAnimationDelayTimeMillis();
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        interfaceC28601c2 = interfaceC28601c9;
                        objM87133R2 = new C40317e8(19, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c9;
                    }
                    Function1 function3 = (Function1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c7;
                        objM87133R3 = new C40392l6(19, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c3 = interfaceC28601c7;
                    }
                    AbstractC30553b.m93699l(strM21274h4, jM133119j4, function3, (InterfaceC4339a) objM87133R3, c28655q, 3456, 0);
                    AbstractC41002o.m133215d(m133181k(interfaceC28601c13), viewState.getCorrectResponseIcon(), m133184n(interfaceC28601c2), viewState.getWhoopCoachCorrectResponse().getTextColor(), viewState.getWhoopCoachIncorrectResponse().getTextColor(), viewState.getLottieWrapper(), c28655q, i16 | i19);
                    if (m133168F(interfaceC28601c3)) {
                        c28655q.m87150e0(-1026800111);
                        String strM21274h5 = AbstractC8693b.m21274h(viewState.getWhoopCoachAnswerStatement(), c28655q, i16);
                        long jM133119j5 = viewState.getTypingAnimationDelayTimeMillis();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c10;
                            objM87133R4 = new C40317e8(20, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            interfaceC28601c4 = interfaceC28601c10;
                        }
                        AbstractC30553b.m93699l(strM21274h5, jM133119j5, (Function1) objM87133R4, null, c28655q, 384, 8);
                        z15 = false;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC28601c4 = interfaceC28601c10;
                        z15 = false;
                        c28655q.m87150e0(-1026445502);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, f16, f14, ((float) 6.5d) * f13, 0.0f, 8), "Quiz whoop coach answer text");
                    String strM133186p2 = m133186p(interfaceC28601c4);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i110 = C38072d.f163054b;
                    z14 = z15;
                    AbstractC30795n.m94707h(strM133186p2, modifierM3599a2, c38072d2.m121949b(c28655q, i110).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i110).getT3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z14);
            } else {
                z14 = false;
                c28655q.m87150e0(-1025932638);
                c28655q.m87173q(false);
            }
            AbstractC25012a.m73392y(c28655q, true, true, z14);
        } else {
            c28655q.m87150e0(-466300789);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40994g(viewState, z4, onViewEvent, i13, 1);
        }
    }

    /* JADX INFO: renamed from: k */
    private static final C40988a m133181k(InterfaceC28601c1 interfaceC28601c1) {
        return (C40988a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: l */
    private static final String m133182l(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m133183m(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: n */
    private static final String m133184n(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m133185o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: p */
    private static final String m133186p(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m133187q(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m133188r(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133183m(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m133189s(InterfaceC28601c1 interfaceC28601c1, C40988a c40988a) {
        interfaceC28601c1.setValue(c40988a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133190t(InterfaceC28601c1 interfaceC28601c1) {
        m133167E(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final long m133191u(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39180l) interfaceC28601c1.getValue()).f168422a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m133192v(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C39180l(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m133193w(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.1f), new C17919x(C17919x.f69636m)), new C23465k(Float.valueOf(0.25f), new C17919x(C17919x.f69625b))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m133194x(InterfaceC28601c1 interfaceC28601c1, C39180l c39180l) {
        m133192v(interfaceC28601c1, c39180l.f168422a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m133195y(Function1 function1, C40993f c40993f, InterfaceC28601c1 interfaceC28601c1, C40988a it) {
        AbstractC22676k.m65750j(it, "it");
        m133189s(interfaceC28601c1, it);
        function1.invoke(new AbstractC31752t0.d(it.getIsCorrect(), c40993f.getUserJourneyStepName()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m133196z(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133185o(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }
}
