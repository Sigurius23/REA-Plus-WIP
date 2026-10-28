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
import p040c0.InterfaceC3747i0;
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
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39180l;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
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

/* JADX INFO: renamed from: zq2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\r\u001a\u00020\u0002*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0019²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzq2/f;", "viewState", "", "isCurrentStep", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Lzq2/f;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lh2/b;", "", "screenWidth", "K", "(JI)Z", "Lzq2/a;", "userSelectedAnswer", "isQuestionAnimationFinished", "isResponseAnimationFinished", "", "animatedWhoopCoachQuestionText", "animatedWhoopCoachResponseText", "animatedWhoopCoachAnswerText", "Ly3/l;", "screenSize", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40996i {

    /* JADX INFO: renamed from: zq2.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.quiz.QuizStepViewKt$QuizStepView$1$1$1", m100430f = "QuizStepView.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176933w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f176934x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13821r1 c13821r1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176934x = c13821r1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f176934x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176933w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f176934x;
                int iM87024x = c13821r1.f49321d.m87024x();
                this.f176933w = 1;
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

    /* JADX INFO: renamed from: zq2.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f176935w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f176936x;

        public b(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            this.f176935w = function1;
            this.f176936x = interfaceC28601c1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m133162b(Function1 function1, InterfaceC28601c1 interfaceC28601c1, C16617b c16617b) {
            if (AbstractC40996i.m133134K(c16617b.f63937a, (int) (AbstractC40996i.m133157w(interfaceC28601c1) >> 32))) {
                function1.invoke(AbstractC31752t0.a.f131481a);
            } else {
                function1.invoke(AbstractC31752t0.b.f131482a);
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C40997j(this.f176935w, this.f176936x, 0), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m133124A(Function1 function1, C40993f c40993f, InterfaceC28601c1 interfaceC28601c1, C40988a it) {
        AbstractC22676k.m65750j(it, "it");
        m133155u(interfaceC28601c1, it);
        function1.invoke(new AbstractC31752t0.d(it.getIsCorrect(), c40993f.getUserJourneyStepName()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m133125B(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133151q(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m133126C(InterfaceC28601c1 interfaceC28601c1) {
        m133131H(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m133127D(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133153s(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final boolean m133128E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m133129F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: G */
    private static final boolean m133130G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m133131H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m133132I(C40993f c40993f, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m133145k(c40993f, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m133134K(long j7, int i13) {
        return ((double) Float.intBitsToFloat((int) (j7 >> 32))) <= ((double) i13) * 0.3d;
    }

    /* JADX INFO: renamed from: k */
    public static final void m133145k(C40993f viewState, boolean z4, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1235365673);
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
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-1776694131, c28655q, new C40989b(viewState, onViewEvent, 1)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40994g(viewState, z4, onViewEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0400  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x020b  */
    /* JADX WARN: Code duplicated, block: B:59:0x020f  */
    /* JADX WARN: Code duplicated, block: B:64:0x022a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0257  */
    /* JADX WARN: Code duplicated, block: B:69:0x0263  */
    /* JADX WARN: Code duplicated, block: B:73:0x0280  */
    /* JADX WARN: Code duplicated, block: B:75:0x0298  */
    /* JADX WARN: Code duplicated, block: B:85:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x0306  */
    /* JADX WARN: Code duplicated, block: B:89:0x0310  */
    /* JADX WARN: Code duplicated, block: B:90:0x031f  */
    /* JADX WARN: Code duplicated, block: B:93:0x035b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0373  */
    /* JADX WARN: Code duplicated, block: B:96:0x0380  */
    /* JADX WARN: Code duplicated, block: B:98:0x0392  */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m133146l(C40993f c40993f, Function1 function1, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        float f13;
        float f14;
        boolean zM87153g;
        Object objM87133R;
        C23454a0 c23454a0;
        int iHashCode;
        C23016z c23016z;
        boolean z4;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z13;
        boolean z14;
        Object objM87133R4;
        boolean zM87153g2;
        Object objM87133R5;
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C28655q c28655q = (C28655q) composer;
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
        boolean zM87153g3 = c28655q.m87153g(c13821r1M92099U);
        Object objM87133R12 = c28655q.m87133R();
        if (zM87153g3 || objM87133R12 == c28676v0) {
            objM87133R12 = new a(c13821r1M92099U, null);
            c28655q.m87172p0(objM87133R12);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R12, boolValueOf);
        TextResource textResourceM133123n = c40993f.getWhoopCoachQuestion();
        int i14 = TextResource.$stable;
        String strM21274h = AbstractC8693b.m21274h(textResourceM133123n, c28655q, i14);
        long jM133119j = c40993f.getTypingAnimationDelayTimeMillis();
        Object objM87133R13 = c28655q.m87133R();
        if (objM87133R13 == c28676v0) {
            objM87133R13 = new C40317e8(13, interfaceC28601c8);
            c28655q.m87172p0(objM87133R13);
        }
        Function1 function2 = (Function1) objM87133R13;
        Object objM87133R14 = c28655q.m87133R();
        if (objM87133R14 == c28676v0) {
            objM87133R14 = new C40392l6(16, interfaceC28601c6);
            c28655q.m87172p0(objM87133R14);
        }
        AbstractC30553b.m93699l(strM21274h, jM133119j, function2, (InterfaceC4339a) objM87133R14, c28655q, 3456, 0);
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
            objM87133R16 = new C40893d(4);
            c28655q.m87172p0(objM87133R16);
        }
        Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R16);
        Object objM87133R17 = c28655q.m87133R();
        if (objM87133R17 == c28676v0) {
            objM87133R17 = new C40317e8(14, interfaceC28601c11);
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
        if (!c28655q.f115903S) {
            interfaceC28601c1 = interfaceC28601c9;
            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            f13 = 8;
            f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
            zM87153g = c28655q.m87153g(function1);
            objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new b(function1, interfaceC28601c11);
                c28655q.m87172p0(objM87133R);
            }
            C23454a0 c23454a1 = C23454a0.f92919a;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC34452c0.m108903b(modifierM3396r, c23454a1, (PointerInputEventHandler) objM87133R), c13821r1M92099U, 12);
            c23454a0 = c23454a1;
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
            AbstractC41001n.m133210b(m133148n(interfaceC28601c8), c28655q, 0);
            if (m133128E(interfaceC28601c6)) {
                c28655q.m87150e0(1627410112);
                if (m133147m(interfaceC28601c5) == null) {
                    c28655q.m87150e0(1627383142);
                    List<C40988a> listM133114e = c40993f.m133114e();
                    zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(c40993f);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C40995h(function1, c40993f, interfaceC28601c5, 0);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC40991d.m133104d(listM133114e, (Function1) objM87133R5, c28655q, 0);
                    c28655q.m87173q(false);
                    z14 = false;
                    z4 = true;
                } else {
                    c28655q.m87150e0(1627946753);
                    float f15 = 4 * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                    AbstractC22403o abstractC22403oM133115f = c40993f.getAvatar();
                    EnumC13585g enumC13585gM133116g = c40993f.getChatType();
                    C40988a c40988aM133147m = m133147m(interfaceC28601c5);
                    int i15 = AbstractC22403o.f87638a << 3;
                    AbstractC41000m.m133207b(c23016z, abstractC22403oM133115f, enumC13585gM133116g, c40988aM133147m, c28655q, 6 | i15 | (i14 << 9));
                    C40988a c40988aM133147m2 = m133147m(interfaceC28601c5);
                    String strM21274h2 = AbstractC8693b.m21274h((c40988aM133147m2 == null && c40988aM133147m2.getIsCorrect()) ? c40993f.getWhoopCoachCorrectResponse().getText() : c40993f.getWhoopCoachIncorrectResponse().getText(), c28655q, i14);
                    long jM133119j2 = c40993f.getTypingAnimationDelayTimeMillis();
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        interfaceC28601c2 = interfaceC28601c1;
                        objM87133R2 = new C40317e8(15, interfaceC28601c2);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                    }
                    Function1 function3 = (Function1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        interfaceC28601c3 = interfaceC28601c7;
                        objM87133R3 = new C40392l6(17, interfaceC28601c3);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        interfaceC28601c3 = interfaceC28601c7;
                    }
                    AbstractC30553b.m93699l(strM21274h2, jM133119j2, function3, (InterfaceC4339a) objM87133R3, c28655q, 3456, 0);
                    AbstractC41002o.m133215d(m133147m(interfaceC28601c5), c40993f.getCorrectResponseIcon(), m133150p(interfaceC28601c2), c40993f.getWhoopCoachCorrectResponse().getTextColor(), c40993f.getWhoopCoachIncorrectResponse().getTextColor(), c40993f.getLottieWrapper(), c28655q, i14 | i15);
                    if (m133130G(interfaceC28601c3)) {
                        c28655q.m87150e0(1629518856);
                        String strM21274h3 = AbstractC8693b.m21274h(c40993f.getWhoopCoachAnswerStatement(), c28655q, i14);
                        long jM133119j3 = c40993f.getTypingAnimationDelayTimeMillis();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            interfaceC28601c4 = interfaceC28601c10;
                            objM87133R4 = new C40317e8(16, interfaceC28601c4);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            interfaceC28601c4 = interfaceC28601c10;
                        }
                        AbstractC30553b.m93699l(strM21274h3, jM133119j3, (Function1) objM87133R4, null, c28655q, 384, 8);
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC28601c4 = interfaceC28601c10;
                        z13 = false;
                        c28655q.m87150e0(1629873465);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, f15, f14, f13 * ((float) 6.5d), 0.0f, 8), "Quiz whoop coach answer text");
                    String strM133152r = m133152r(interfaceC28601c4);
                    C38072d c38072d = C38072d.f163053a;
                    int i16 = C38072d.f163054b;
                    C2886a c2886aM8418P = c38072d.m121952e(c28655q, i16).getT3();
                    z14 = z13;
                    z4 = true;
                    AbstractC30795n.m94707h(strM133152r, modifierM3599a, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 48, C2886a.f11498d << 18, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z14);
            } else {
                c23454a0 = c23454a0;
                z4 = true;
                c28655q.m87150e0(1630386329);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            c28655q.m87173q(z4);
            return c23454a0;
        }
        interfaceC28601c1 = interfaceC28601c9;
        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
        f13 = 8;
        f14 = 2 * f13;
        Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), f14, 0.0f, 2);
        zM87153g = c28655q.m87153g(function1);
        objM87133R = c28655q.m87133R();
        if (zM87153g) {
            objM87133R = new b(function1, interfaceC28601c11);
            c28655q.m87172p0(objM87133R);
        } else {
            objM87133R = new b(function1, interfaceC28601c11);
            c28655q.m87172p0(objM87133R);
        }
        C23454a0 c23454a2 = C23454a0.f92919a;
        Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC34452c0.m108903b(modifierM3396r2, c23454a2, (PointerInputEventHandler) objM87133R), c13821r1M92099U, 12);
        c23454a0 = c23454a2;
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
        AbstractC41001n.m133210b(m133148n(interfaceC28601c8), c28655q, 0);
        if (m133128E(interfaceC28601c6)) {
            c28655q.m87150e0(1627410112);
            if (m133147m(interfaceC28601c5) == null) {
                c28655q.m87150e0(1627383142);
                List<C40988a> listM133114e2 = c40993f.m133114e();
                zM87153g2 = c28655q.m87153g(function1) | c28655q.m87157i(c40993f);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R5 = new C40995h(function1, c40993f, interfaceC28601c5, 0);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C40995h(function1, c40993f, interfaceC28601c5, 0);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC40991d.m133104d(listM133114e2, (Function1) objM87133R5, c28655q, 0);
                c28655q.m87173q(false);
                z14 = false;
                z4 = true;
            } else {
                c28655q.m87150e0(1627946753);
                float f16 = 4 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                AbstractC22403o abstractC22403oM133115f2 = c40993f.getAvatar();
                EnumC13585g enumC13585gM133116g2 = c40993f.getChatType();
                C40988a c40988aM133147m3 = m133147m(interfaceC28601c5);
                int i17 = AbstractC22403o.f87638a << 3;
                AbstractC41000m.m133207b(c23016z, abstractC22403oM133115f2, enumC13585gM133116g2, c40988aM133147m3, c28655q, 6 | i17 | (i14 << 9));
                C40988a c40988aM133147m4 = m133147m(interfaceC28601c5);
                String strM21274h4 = AbstractC8693b.m21274h((c40988aM133147m4 == null && c40988aM133147m4.getIsCorrect()) ? c40993f.getWhoopCoachCorrectResponse().getText() : c40993f.getWhoopCoachIncorrectResponse().getText(), c28655q, i14);
                long jM133119j4 = c40993f.getTypingAnimationDelayTimeMillis();
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R2 = new C40317e8(15, interfaceC28601c2);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                Function1 function4 = (Function1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    interfaceC28601c3 = interfaceC28601c7;
                    objM87133R3 = new C40392l6(17, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c3 = interfaceC28601c7;
                }
                AbstractC30553b.m93699l(strM21274h4, jM133119j4, function4, (InterfaceC4339a) objM87133R3, c28655q, 3456, 0);
                AbstractC41002o.m133215d(m133147m(interfaceC28601c5), c40993f.getCorrectResponseIcon(), m133150p(interfaceC28601c2), c40993f.getWhoopCoachCorrectResponse().getTextColor(), c40993f.getWhoopCoachIncorrectResponse().getTextColor(), c40993f.getLottieWrapper(), c28655q, i14 | i17);
                if (m133130G(interfaceC28601c3)) {
                    c28655q.m87150e0(1629518856);
                    String strM21274h5 = AbstractC8693b.m21274h(c40993f.getWhoopCoachAnswerStatement(), c28655q, i14);
                    long jM133119j5 = c40993f.getTypingAnimationDelayTimeMillis();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        interfaceC28601c4 = interfaceC28601c10;
                        objM87133R4 = new C40317e8(16, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        interfaceC28601c4 = interfaceC28601c10;
                    }
                    AbstractC30553b.m93699l(strM21274h5, jM133119j5, (Function1) objM87133R4, null, c28655q, 384, 8);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    interfaceC28601c4 = interfaceC28601c10;
                    z13 = false;
                    c28655q.m87150e0(1629873465);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, f16, f14, f13 * ((float) 6.5d), 0.0f, 8), "Quiz whoop coach answer text");
                String strM133152r2 = m133152r(interfaceC28601c4);
                C38072d c38072d2 = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q, i18).getT3();
                z14 = z13;
                z4 = true;
                AbstractC30795n.m94707h(strM133152r2, modifierM3599a2, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z14);
        } else {
            c23454a0 = c23454a0;
            z4 = true;
            c28655q.m87150e0(1630386329);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(z4);
        c28655q.m87173q(z4);
        return c23454a0;
    }

    /* JADX INFO: renamed from: m */
    private static final C40988a m133147m(InterfaceC28601c1 interfaceC28601c1) {
        return (C40988a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final String m133148n(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: o */
    private static final void m133149o(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: p */
    private static final String m133150p(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final void m133151q(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: r */
    private static final String m133152r(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m133153s(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m133154t(InterfaceC28601c1 interfaceC28601c1, String it) {
        AbstractC22676k.m65750j(it, "it");
        m133149o(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m133155u(InterfaceC28601c1 interfaceC28601c1, C40988a c40988a) {
        interfaceC28601c1.setValue(c40988a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m133156v(InterfaceC28601c1 interfaceC28601c1) {
        m133129F(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final long m133157w(InterfaceC28601c1 interfaceC28601c1) {
        return ((C39180l) interfaceC28601c1.getValue()).f168422a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m133158x(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(new C39180l(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m133159y(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51494l(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.1f), new C17919x(C17919x.f69636m)), new C23465k(Float.valueOf(0.25f), new C17919x(C17919x.f69625b))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m133160z(InterfaceC28601c1 interfaceC28601c1, C39180l c39180l) {
        m133158x(interfaceC28601c1, c39180l.f168422a);
        return C23454a0.f92919a;
    }
}
