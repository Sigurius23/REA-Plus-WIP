package eg2;

import a01.C0086f;
import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1934e;
import b01.C2192m;
import bc3.InterfaceC2994c0;
import bg2.AbstractC3235h;
import bm2.C3433d0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cg2.AbstractC4574a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9813i;
import com.whoop.sms.setup.view.SmsSetupDestination;
import d30.C11558r;
import dg2.C12009a;
import dg2.C12010b;
import e81.C12824e;
import eb1.C13005a;
import ec3.InterfaceC13087t1;
import fg2.AbstractC14464f;
import fg2.AbstractC14466h;
import fg2.AbstractC14468j;
import fg2.AbstractC14471m;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.C3756l0;
import p040c0.C3789x;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
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
import p704dk2.C12122i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf2.AbstractC35950b;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: eg2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a_\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Ldg2/a;", "viewModel", "Lkotlin/Function1;", "Lcg2/a;", "Ll83/a0;", "onNavigationEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ldg2/b;", "viewState", "Lcom/whoop/sms/setup/view/SmsSetupDestination;", "initialDestination", "Lbg2/h;", "onViewEvent", "Lkotlin/Function0;", "onSuccessComplete", "x", "(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "currentDestination", "Lp1/c1;", "", "currentRoute", "W", "(Lcom/whoop/sms/setup/view/SmsSetupDestination;Lc93/a;Lp1/c1;)V", "sms_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13176i {

    /* JADX INFO: renamed from: eg2.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements Function1 {
        public a(Object obj) {
            super(1, 0, C12009a.class, obj, "onViewEvent", "onViewEvent(Lcom/whoop/sms/setup/domain/SmsSetupViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m36992a(AbstractC3235h p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C12009a) this.receiver).m33127p(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m36992a((AbstractC3235h) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eg2.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.view.SmsSetupScreenKt$SmsSetupScreen$8$4$4$1", m100430f = "SmsSetupScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45669w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12010b f45670x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f45671y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f45672z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C12010b c12010b, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45670x = c12010b;
            this.f45671y = interfaceC4339a;
            this.f45672z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f45670x, this.f45671y, this.f45672z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45669w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f45670x.getPhoneSubmitSuccess()) {
                AbstractC13176i.m36965W(SmsSetupDestination.INPUT, this.f45671y, this.f45672z);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: eg2.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.sms.setup.view.SmsSetupScreenKt$SmsSetupScreen$8$4$6$1", m100430f = "SmsSetupScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45673w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12010b f45674x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f45675y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f45676z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C12010b c12010b, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45674x = c12010b;
            this.f45675y = interfaceC4339a;
            this.f45676z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f45674x, this.f45675y, this.f45676z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45673w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f45674x.getCodeVerified()) {
                AbstractC13176i.m36965W(SmsSetupDestination.ENTER_CODE, this.f45675y, this.f45676z);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m36943A(C12010b c12010b, SmsSetupDestination smsSetupDestination, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m36989x(c12010b, smsSetupDestination, function1, interfaceC4339a, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m36944B(Function1 function1) {
        function1.invoke(AbstractC4574a.b.f18425a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m36945C(C12009a c12009a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m36988w(c12009a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m36946D(AbstractC3235h it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m36947E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m36948F(AbstractC4574a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m36949G(boolean z4, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        if (z4) {
            interfaceC28601c1.setValue("INTRO");
        } else {
            function1.invoke(AbstractC4574a.a.f18424a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m36950H(Function1 function1) {
        function1.invoke(AbstractC4574a.c.f18426a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C3756l0 m36951I(InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return AbstractC22676k.m65745e(((C3789x) AnimatedContent).mo11595b(), "INTRO") ? AbstractC1089a.m3345c(AbstractC3788w0.m11585m(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(10)), AbstractC3788w0.m11589q(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(11))) : AbstractC1089a.m3345c(AbstractC3788w0.m11585m(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(12)), AbstractC3788w0.m11589q(AbstractC11348f.m30574v(300, 0, null, 6), new C12824e(13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final int m36952J(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final int m36953K(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final int m36954L(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final int m36955M(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0189 A[PHI: r12
      0x0189: PHI (r12v18 p1.q) = (r12v2 p1.q), (r12v5 p1.q), (r12v8 p1.q), (r12v11 p1.q), (r12v19 p1.q) binds: [B:53:0x0187, B:41:0x0117, B:30:0x00c0, B:26:0x00a3, B:16:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m36956N(Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, C12010b c12010b, InterfaceC28601c1 interfaceC28601c1, InterfaceC3764o AnimatedContent, String route, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(route, "route");
        C28655q c28655q2 = (C28655q) composer;
        boolean zM87153g = ((((i13 & 112) ^ 48) > 32 && ((C28655q) composer).m87153g(route)) || (i13 & 48) == 32) | c28655q2.m87153g(function1);
        Object objM87133R = c28655q2.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C1934e(route, interfaceC28601c1, function1);
            c28655q2.m87172p0(objM87133R);
        }
        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q2, 0, 1);
        int iHashCode = route.hashCode();
        C2314t c2314t = C2314t.f9131w;
        switch (iHashCode) {
            case -304233708:
                c28655q = c28655q2;
                if (!route.equals("ENTER_CODE")) {
                    c28655q.m87150e0(1317037001);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1315713890);
                    Boolean boolValueOf = Boolean.valueOf(c12010b.getCodeVerified());
                    boolean zM87157i = c28655q.m87157i(c12010b) | c28655q.m87153g(interfaceC4339a);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v0) {
                        objM87133R2 = new c(c12010b, interfaceC4339a, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    String strM33133e = c12010b.getMaskedPhoneNumber();
                    boolean zM33136h = c12010b.getIsCodeSubmitting();
                    TextResource textResourceM33130b = c12010b.getCodeErrorMessage();
                    boolean zM87153g2 = c28655q.m87153g(function2) | c28655q.m87157i(c12010b);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C13173f(function2, c12010b);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    boolean zM87153g3 = c28655q.m87153g(function2);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C12122i(function2, 6);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC14466h.m41251i(modifierM3407d, strM33133e, zM33136h, textResourceM33130b, interfaceC4339a2, (Function1) objM87133R4, c28655q, (TextResource.$stable << 9) | 6, 0);
                    c28655q.m87173q(false);
                }
                break;
            case 69820330:
                c28655q = c28655q2;
                if (!route.equals("INPUT")) {
                    c28655q.m87150e0(1317037001);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1314939355);
                    Boolean boolValueOf2 = Boolean.valueOf(c12010b.getPhoneSubmitSuccess());
                    boolean zM87157i2 = c28655q.m87157i(c12010b) | c28655q.m87153g(interfaceC4339a);
                    Object objM87133R5 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R5 == c28676v0) {
                        objM87133R5 = new b(c12010b, interfaceC4339a, interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf2);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                    boolean zM33140l = c12010b.getIsPhoneSubmitting();
                    boolean zM33138j = c12010b.getIsPhoneInputError();
                    boolean zM87153g4 = c28655q.m87153g(function2);
                    Object objM87133R6 = c28655q.m87133R();
                    if (zM87153g4 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C12122i(function2, 5);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC14468j.m41270g(modifierM3407d2, zM33140l, zM33138j, (Function1) objM87133R6, c28655q, 6, 0);
                    c28655q.m87173q(false);
                }
                break;
            case 69824076:
                c28655q = c28655q2;
                if (!route.equals("INTRO")) {
                    c28655q.m87150e0(1317037001);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1314142376);
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                    boolean zM87153g5 = c28655q.m87153g(function2) | c28655q.m87153g(interfaceC4339a);
                    Object objM87133R7 = c28655q.m87133R();
                    if (zM87153g5 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C11558r(function2, interfaceC4339a, interfaceC28601c1, 5);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R7;
                    Object objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C2192m(24, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC14471m.m41287g(modifierM3407d3, interfaceC4339a3, (InterfaceC4339a) objM87133R8, c28655q, 390, 0);
                    c28655q.m87173q(false);
                }
                break;
            case 753543685:
                c28655q = c28655q2;
                if (!route.equals("TERMS_OF_SERVICE")) {
                    c28655q.m87150e0(1317037001);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1314731965);
                    AbstractC13181n.m37055i(AbstractC1102d.m3407d(1.0f, c2314t), c28655q, 6, 0);
                    c28655q.m87173q(false);
                }
                break;
            case 1383663147:
                if (route.equals("COMPLETED")) {
                    c28655q2.m87150e0(1316678114);
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                    String strM33129a = c12010b.getCoachPhoneNumber();
                    boolean zM87153g6 = c28655q2.m87153g(function2);
                    Object objM87133R9 = c28655q2.m87133R();
                    if (zM87153g6 || objM87133R9 == c28676v0) {
                        objM87133R9 = new C9813i(function2, 18);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    AbstractC14464f.m41225d(modifierM3407d4, strM33129a, (InterfaceC4339a) objM87133R9, c28655q2, 6, 0);
                    c28655q2.m87173q(false);
                    break;
                }
            default:
                c28655q = c28655q2;
                c28655q.m87150e0(1317037001);
                c28655q.m87173q(false);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m36957O(String str, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
        if (AbstractC22676k.m65745e(str, "TERMS_OF_SERVICE")) {
            interfaceC28601c1.setValue("INTRO");
        } else {
            function1.invoke(AbstractC4574a.a.f18424a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m36958P(Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(AbstractC3235h.c.f12696a);
        m36965W(SmsSetupDestination.INTRO, interfaceC4339a, interfaceC28601c1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m36959Q(InterfaceC28601c1 interfaceC28601c1) {
        interfaceC28601c1.setValue("TERMS_OF_SERVICE");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m36960R(Function1 function1, String phoneNumber) {
        AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
        function1.invoke(new AbstractC3235h.d("+1".concat(phoneNumber)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m36961S(Function1 function1, C12010b c12010b) {
        function1.invoke(new AbstractC3235h.d(c12010b.getPhoneNumber()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m36962T(Function1 function1, String code) {
        AbstractC22676k.m65750j(code, "code");
        function1.invoke(new AbstractC3235h.a(code));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m36963U(Function1 function1) {
        function1.invoke(AbstractC3235h.f.f12699a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final void m36965W(SmsSetupDestination smsSetupDestination, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        SmsSetupDestination nextStep = smsSetupDestination.getNextStep();
        if (nextStep != null) {
            interfaceC28601c1.setValue(nextStep.name());
        } else {
            interfaceC4339a.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static final void m36988w(C12009a viewModel, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        boolean z13;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1889529688);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewModel) ? 4 : 2);
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
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12824e(9);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                InterfaceC13087t1 interfaceC13087t1M33126o = viewModel.getViewState();
                C12010b c12010b = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                int i17 = TextResource.$stable;
                C12010b c12010bM36991z = m36991z(AbstractC28683x.m87260n(interfaceC13087t1M33126o, c12010b, null, c28655q, i17 << 3, 2));
                zM87157i = c28655q.m87157i(viewModel);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new a(viewModel);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function5 = (Function1) ((InterfaceC21467g) objM87133R);
                z13 = (i15 & 112) == 32;
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C9813i(function4, 17);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function6 = function4;
                m36989x(c12010bM36991z, null, function5, (InterfaceC4339a) objM87133R2, function6, c28655q, i17 | ((i15 << 9) & 57344), 2);
                c28655q = c28655q;
                function3 = function6;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13174g(viewModel, function3, i13, i14, 0);
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
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C12824e(9);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            InterfaceC13087t1 interfaceC13087t1M33126o2 = viewModel.getViewState();
            C12010b c12010b2 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
            int i18 = TextResource.$stable;
            C12010b c12010bM36991z2 = m36991z(AbstractC28683x.m87260n(interfaceC13087t1M33126o2, c12010b2, null, c28655q, i18 << 3, 2));
            zM87157i = c28655q.m87157i(viewModel);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new a(viewModel);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new a(viewModel);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function7 = (Function1) ((InterfaceC21467g) objM87133R);
            if ((i15 & 112) == 32) {
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C9813i(function4, 17);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C9813i(function4, 17);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function8 = function4;
            m36989x(c12010bM36991z2, null, function7, (InterfaceC4339a) objM87133R2, function8, c28655q, i18 | ((i15 << 9) & 57344), 2);
            c28655q = c28655q;
            function3 = function8;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13174g(viewModel, function3, i13, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014e  */
    /* JADX WARN: Code duplicated, block: B:103:0x015d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0176  */
    /* JADX WARN: Code duplicated, block: B:108:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0210  */
    /* JADX WARN: Code duplicated, block: B:122:0x0219  */
    /* JADX WARN: Code duplicated, block: B:125:0x0263  */
    /* JADX WARN: Code duplicated, block: B:126:0x0265  */
    /* JADX WARN: Code duplicated, block: B:129:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:130:0x026f  */
    /* JADX WARN: Code duplicated, block: B:133:0x027e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0280  */
    /* JADX WARN: Code duplicated, block: B:137:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0289  */
    /* JADX WARN: Code duplicated, block: B:141:0x02af  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:146:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0110  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x0135  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static final void m36989x(C12010b c12010b, SmsSetupDestination smsSetupDestination, Function1 function1, InterfaceC4339a interfaceC4339a, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        SmsSetupDestination smsSetupDestination2;
        C12010b c12010b2;
        Function1 function5;
        InterfaceC4339a interfaceC4339a3;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        C12010b c12010b3;
        SmsSetupDestination smsSetupDestination3;
        Function1 function7;
        Function1 function8;
        C12010b c12010b4;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM65745e;
        C39274g c39274g;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource.C8688b c8688bM21277k;
        int i25;
        boolean z13;
        boolean z14;
        Object objM87133R5;
        boolean z15;
        Object objM87133R6;
        Object objM87133R7;
        int i26;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1728717639);
        int i27 = 2;
        if ((i13 & 6) == 0) {
            if ((i14 & 1) != 0) {
                i26 = 2;
            } else {
                if ((i13 & 8) == 0 ? c28655q.m87153g(c12010b) : c28655q.m87157i(c12010b)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
            }
            i15 = i26 | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(smsSetupDestination == null ? -1 : smsSetupDestination.ordinal()) ? 32 : 16;
        }
        int i29 = i14 & 4;
        if (i29 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        function4 = function2;
                        if (c28655q.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28655q.m87140Z();
                        i24 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0 || c28655q.m87118C()) {
                            if ((i14 & 1) != 0) {
                                c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                                i15 &= -15;
                            } else {
                                c12010b3 = c12010b;
                            }
                            if (i28 != 0) {
                                smsSetupDestination3 = SmsSetupDestination.INTRO;
                            } else {
                                smsSetupDestination3 = smsSetupDestination;
                            }
                            if (i29 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C12824e(14);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function7 = (Function1) objM87133R3;
                            } else {
                                function7 = function3;
                            }
                            if (i16 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C13005a(24);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            }
                            if (i18 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C12824e(15);
                                    c28655q.m87172p0(objM87133R);
                                }
                                function8 = (Function1) objM87133R;
                            } else {
                                function8 = function4;
                            }
                            c12010b4 = c12010b3;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 1) != 0) {
                                i15 &= -15;
                            }
                            c12010b4 = c12010b;
                            function7 = function3;
                            interfaceC4339a2 = interfaceC4339a2;
                            function8 = function4;
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        c28655q.m87175r();
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                            c28655q.m87172p0(objM87133R4);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                        zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                        if (zM65745e) {
                            c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                        } else {
                            c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                        }
                        C39274g c39274g2 = c39274g;
                        Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                        C22957g c22957g = AbstractC22977m.f90652c;
                        C2305k c2305k = C2299e.f9111N;
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 54);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c2305k);
                        if (zM65745e) {
                            c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                        } else {
                            c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                        }
                        AbstractC6721d.a aVar = new AbstractC6721d.a(c8688bM21277k, null, c39274g2, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        boolean zM87155h = c28655q.m87155h(zM65745e);
                        i25 = i15 & 57344;
                        if (i25 == 16384) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87155h | z13;
                        objM87133R5 = c28655q.m87133R();
                        if (z14 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                            c28655q.m87172p0(objM87133R5);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
                        if (i25 == 16384) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R6 = c28655q.m87133R();
                        if (z15 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C9813i(function8, 19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC6719b.m20143d(horizontalAlignElement, aVar, null, interfaceC4339a4, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                        Object value = interfaceC28601c1.getValue();
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12824e(16);
                            c28655q.m87172p0(objM87133R7);
                        }
                        Function1 function9 = function8;
                        AbstractC1089a.m3344b(value, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function9, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        smsSetupDestination2 = smsSetupDestination3;
                        function6 = function9;
                        function5 = function7;
                        interfaceC4339a3 = interfaceC4339a2;
                        c12010b2 = c12010b4;
                    } else {
                        c28655q.m87138X();
                        smsSetupDestination2 = smsSetupDestination;
                        c12010b2 = c12010b;
                        function5 = function3;
                        interfaceC4339a3 = interfaceC4339a2;
                        function6 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
                    }
                }
                i15 |= 24576;
                function4 = function2;
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 1) != 0) {
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            i15 &= -15;
                        } else {
                            c12010b3 = c12010b;
                        }
                        if (i28 != 0) {
                            smsSetupDestination3 = SmsSetupDestination.INTRO;
                        } else {
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        if (i29 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(15);
                                c28655q.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        c12010b4 = c12010b3;
                    } else {
                        if ((i14 & 1) != 0) {
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            i15 &= -15;
                        } else {
                            c12010b3 = c12010b;
                        }
                        if (i28 != 0) {
                            smsSetupDestination3 = SmsSetupDestination.INTRO;
                        } else {
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        if (i29 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(15);
                                c28655q.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        c12010b4 = c12010b3;
                    }
                    c28655q.m87175r();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                    if (zM65745e) {
                        c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                    } else {
                        c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    }
                    C39274g c39274g3 = c39274g;
                    Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                    C22957g c22957g2 = AbstractC22977m.f90652c;
                    C2305k c2305k2 = C2299e.f9111N;
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    HorizontalAlignElement horizontalAlignElement2 = new HorizontalAlignElement(c2305k2);
                    if (zM65745e) {
                        c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                    } else {
                        c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                    }
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(c8688bM21277k, null, c39274g3, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    boolean zM87155h2 = c28655q.m87155h(zM65745e);
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87155h2 | z13;
                    objM87133R5 = c28655q.m87133R();
                    if (z14) {
                        objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                    if (i25 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z15) {
                        objM87133R6 = new C9813i(function8, 19);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9813i(function8, 19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC6719b.m20143d(horizontalAlignElement2, aVar2, null, interfaceC4339a5, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                    Object value2 = interfaceC28601c1.getValue();
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12824e(16);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function10 = function8;
                    AbstractC1089a.m3344b(value2, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function10, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    smsSetupDestination2 = smsSetupDestination3;
                    function6 = function10;
                    function5 = function7;
                    interfaceC4339a3 = interfaceC4339a2;
                    c12010b2 = c12010b4;
                } else {
                    c28655q.m87138X();
                    smsSetupDestination2 = smsSetupDestination;
                    c12010b2 = c12010b;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 1) != 0) {
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            i15 &= -15;
                        } else {
                            c12010b3 = c12010b;
                        }
                        if (i28 != 0) {
                            smsSetupDestination3 = SmsSetupDestination.INTRO;
                        } else {
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        if (i29 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(15);
                                c28655q.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        c12010b4 = c12010b3;
                    } else {
                        if ((i14 & 1) != 0) {
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            i15 &= -15;
                        } else {
                            c12010b3 = c12010b;
                        }
                        if (i28 != 0) {
                            smsSetupDestination3 = SmsSetupDestination.INTRO;
                        } else {
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        if (i29 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(15);
                                c28655q.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        c12010b4 = c12010b3;
                    }
                    c28655q.m87175r();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                    if (zM65745e) {
                        c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                    } else {
                        c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    }
                    C39274g c39274g4 = c39274g;
                    Modifier modifierM66720i3 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                    C22957g c22957g3 = AbstractC22977m.f90652c;
                    C2305k c2305k3 = C2299e.f9111N;
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66720i3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    HorizontalAlignElement horizontalAlignElement3 = new HorizontalAlignElement(c2305k3);
                    if (zM65745e) {
                        c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                    } else {
                        c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                    }
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(c8688bM21277k, null, c39274g4, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    boolean zM87155h3 = c28655q.m87155h(zM65745e);
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87155h3 | z13;
                    objM87133R5 = c28655q.m87133R();
                    if (z14) {
                        objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R5;
                    if (i25 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z15) {
                        objM87133R6 = new C9813i(function8, 19);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9813i(function8, 19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC6719b.m20143d(horizontalAlignElement3, aVar3, null, interfaceC4339a6, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                    Object value3 = interfaceC28601c1.getValue();
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12824e(16);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function11 = function8;
                    AbstractC1089a.m3344b(value3, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function11, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    smsSetupDestination2 = smsSetupDestination3;
                    function6 = function11;
                    function5 = function7;
                    interfaceC4339a3 = interfaceC4339a2;
                    c12010b2 = c12010b4;
                } else {
                    c28655q.m87138X();
                    smsSetupDestination2 = smsSetupDestination;
                    c12010b2 = c12010b;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 1) != 0) {
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        i15 &= -15;
                    } else {
                        c12010b3 = c12010b;
                    }
                    if (i28 != 0) {
                        smsSetupDestination3 = SmsSetupDestination.INTRO;
                    } else {
                        smsSetupDestination3 = smsSetupDestination;
                    }
                    if (i29 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    c12010b4 = c12010b3;
                } else {
                    if ((i14 & 1) != 0) {
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        i15 &= -15;
                    } else {
                        c12010b3 = c12010b;
                    }
                    if (i28 != 0) {
                        smsSetupDestination3 = SmsSetupDestination.INTRO;
                    } else {
                        smsSetupDestination3 = smsSetupDestination;
                    }
                    if (i29 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    c12010b4 = c12010b3;
                }
                c28655q.m87175r();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                if (zM65745e) {
                    c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                } else {
                    c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                }
                C39274g c39274g5 = c39274g;
                Modifier modifierM66720i4 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                C22957g c22957g4 = AbstractC22977m.f90652c;
                C2305k c2305k4 = C2299e.f9111N;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66720i4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                HorizontalAlignElement horizontalAlignElement4 = new HorizontalAlignElement(c2305k4);
                if (zM65745e) {
                    c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                } else {
                    c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                }
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(c8688bM21277k, null, c39274g5, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                boolean zM87155h4 = c28655q.m87155h(zM65745e);
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87155h4 | z13;
                objM87133R5 = c28655q.m87133R();
                if (z14) {
                    objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                if (i25 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    objM87133R6 = new C9813i(function8, 19);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9813i(function8, 19);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC6719b.m20143d(horizontalAlignElement4, aVar4, null, interfaceC4339a7, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                Object value4 = interfaceC28601c1.getValue();
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C12824e(16);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function12 = function8;
                AbstractC1089a.m3344b(value4, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function12, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                c28655q = c28655q;
                c28655q.m87173q(true);
                smsSetupDestination2 = smsSetupDestination3;
                function6 = function12;
                function5 = function7;
                interfaceC4339a3 = interfaceC4339a2;
                c12010b2 = c12010b4;
            } else {
                c28655q.m87138X();
                smsSetupDestination2 = smsSetupDestination;
                c12010b2 = c12010b;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28655q.m87140Z();
                    i24 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        if ((i14 & 1) != 0) {
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            i15 &= -15;
                        } else {
                            c12010b3 = c12010b;
                        }
                        if (i28 != 0) {
                            smsSetupDestination3 = SmsSetupDestination.INTRO;
                        } else {
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        if (i29 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(15);
                                c28655q.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        c12010b4 = c12010b3;
                    } else {
                        if ((i14 & 1) != 0) {
                            c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                            i15 &= -15;
                        } else {
                            c12010b3 = c12010b;
                        }
                        if (i28 != 0) {
                            smsSetupDestination3 = SmsSetupDestination.INTRO;
                        } else {
                            smsSetupDestination3 = smsSetupDestination;
                        }
                        if (i29 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C12824e(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function7 = (Function1) objM87133R3;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C13005a(24);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i18 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C12824e(15);
                                c28655q.m87172p0(objM87133R);
                            }
                            function8 = (Function1) objM87133R;
                        } else {
                            function8 = function4;
                        }
                        c12010b4 = c12010b3;
                    }
                    c28655q.m87175r();
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                    zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                    if (zM65745e) {
                        c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                    } else {
                        c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    }
                    C39274g c39274g6 = c39274g;
                    Modifier modifierM66720i5 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                    C22957g c22957g5 = AbstractC22977m.f90652c;
                    C2305k c2305k5 = C2299e.f9111N;
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66720i5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    HorizontalAlignElement horizontalAlignElement5 = new HorizontalAlignElement(c2305k5);
                    if (zM65745e) {
                        c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                    } else {
                        c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                    }
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(c8688bM21277k, null, c39274g6, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    boolean zM87155h5 = c28655q.m87155h(zM65745e);
                    i25 = i15 & 57344;
                    if (i25 == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87155h5 | z13;
                    objM87133R5 = c28655q.m87133R();
                    if (z14) {
                        objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                        c28655q.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R5;
                    if (i25 == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z15) {
                        objM87133R6 = new C9813i(function8, 19);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C9813i(function8, 19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC6719b.m20143d(horizontalAlignElement5, aVar5, null, interfaceC4339a8, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                    Object value5 = interfaceC28601c1.getValue();
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12824e(16);
                        c28655q.m87172p0(objM87133R7);
                    }
                    Function1 function13 = function8;
                    AbstractC1089a.m3344b(value5, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function13, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    smsSetupDestination2 = smsSetupDestination3;
                    function6 = function13;
                    function5 = function7;
                    interfaceC4339a3 = interfaceC4339a2;
                    c12010b2 = c12010b4;
                } else {
                    c28655q.m87138X();
                    smsSetupDestination2 = smsSetupDestination;
                    c12010b2 = c12010b;
                    function5 = function3;
                    interfaceC4339a3 = interfaceC4339a2;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
                }
            }
            i15 |= 24576;
            function4 = function2;
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 1) != 0) {
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        i15 &= -15;
                    } else {
                        c12010b3 = c12010b;
                    }
                    if (i28 != 0) {
                        smsSetupDestination3 = SmsSetupDestination.INTRO;
                    } else {
                        smsSetupDestination3 = smsSetupDestination;
                    }
                    if (i29 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    c12010b4 = c12010b3;
                } else {
                    if ((i14 & 1) != 0) {
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        i15 &= -15;
                    } else {
                        c12010b3 = c12010b;
                    }
                    if (i28 != 0) {
                        smsSetupDestination3 = SmsSetupDestination.INTRO;
                    } else {
                        smsSetupDestination3 = smsSetupDestination;
                    }
                    if (i29 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    c12010b4 = c12010b3;
                }
                c28655q.m87175r();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                if (zM65745e) {
                    c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                } else {
                    c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                }
                C39274g c39274g7 = c39274g;
                Modifier modifierM66720i6 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                C22957g c22957g6 = AbstractC22977m.f90652c;
                C2305k c2305k6 = C2299e.f9111N;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66720i6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                HorizontalAlignElement horizontalAlignElement6 = new HorizontalAlignElement(c2305k6);
                if (zM65745e) {
                    c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                } else {
                    c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                }
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(c8688bM21277k, null, c39274g7, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                boolean zM87155h6 = c28655q.m87155h(zM65745e);
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87155h6 | z13;
                objM87133R5 = c28655q.m87133R();
                if (z14) {
                    objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R5;
                if (i25 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    objM87133R6 = new C9813i(function8, 19);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9813i(function8, 19);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC6719b.m20143d(horizontalAlignElement6, aVar6, null, interfaceC4339a9, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                Object value6 = interfaceC28601c1.getValue();
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C12824e(16);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function14 = function8;
                AbstractC1089a.m3344b(value6, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function14, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                c28655q = c28655q;
                c28655q.m87173q(true);
                smsSetupDestination2 = smsSetupDestination3;
                function6 = function14;
                function5 = function7;
                interfaceC4339a3 = interfaceC4339a2;
                c12010b2 = c12010b4;
            } else {
                c28655q.m87138X();
                smsSetupDestination2 = smsSetupDestination;
                c12010b2 = c12010b;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28655q.m87140Z();
                i24 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    if ((i14 & 1) != 0) {
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        i15 &= -15;
                    } else {
                        c12010b3 = c12010b;
                    }
                    if (i28 != 0) {
                        smsSetupDestination3 = SmsSetupDestination.INTRO;
                    } else {
                        smsSetupDestination3 = smsSetupDestination;
                    }
                    if (i29 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    c12010b4 = c12010b3;
                } else {
                    if ((i14 & 1) != 0) {
                        c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                        i15 &= -15;
                    } else {
                        c12010b3 = c12010b;
                    }
                    if (i28 != 0) {
                        smsSetupDestination3 = SmsSetupDestination.INTRO;
                    } else {
                        smsSetupDestination3 = smsSetupDestination;
                    }
                    if (i29 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C12824e(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C13005a(24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i18 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C12824e(15);
                            c28655q.m87172p0(objM87133R);
                        }
                        function8 = (Function1) objM87133R;
                    } else {
                        function8 = function4;
                    }
                    c12010b4 = c12010b3;
                }
                c28655q.m87175r();
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
                zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
                if (zM65745e) {
                    c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
                } else {
                    c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                }
                C39274g c39274g8 = c39274g;
                Modifier modifierM66720i7 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
                C22957g c22957g7 = AbstractC22977m.f90652c;
                C2305k c2305k7 = C2299e.f9111N;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66720i7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                HorizontalAlignElement horizontalAlignElement7 = new HorizontalAlignElement(c2305k7);
                if (zM65745e) {
                    c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
                } else {
                    c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
                }
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(c8688bM21277k, null, c39274g8, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                boolean zM87155h7 = c28655q.m87155h(zM65745e);
                i25 = i15 & 57344;
                if (i25 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87155h7 | z13;
                objM87133R5 = c28655q.m87133R();
                if (z14) {
                    objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R5;
                if (i25 == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    objM87133R6 = new C9813i(function8, 19);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C9813i(function8, 19);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC6719b.m20143d(horizontalAlignElement7, aVar7, null, interfaceC4339a10, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
                Object value7 = interfaceC28601c1.getValue();
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C12824e(16);
                    c28655q.m87172p0(objM87133R7);
                }
                Function1 function15 = function8;
                AbstractC1089a.m3344b(value7, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function15, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
                c28655q = c28655q;
                c28655q.m87173q(true);
                smsSetupDestination2 = smsSetupDestination3;
                function6 = function15;
                function5 = function7;
                interfaceC4339a3 = interfaceC4339a2;
                c12010b2 = c12010b4;
            } else {
                c28655q.m87138X();
                smsSetupDestination2 = smsSetupDestination;
                c12010b2 = c12010b;
                function5 = function3;
                interfaceC4339a3 = interfaceC4339a2;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
            }
        }
        i15 |= 24576;
        function4 = function2;
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28655q.m87140Z();
            i24 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                if ((i14 & 1) != 0) {
                    c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    i15 &= -15;
                } else {
                    c12010b3 = c12010b;
                }
                if (i28 != 0) {
                    smsSetupDestination3 = SmsSetupDestination.INTRO;
                } else {
                    smsSetupDestination3 = smsSetupDestination;
                }
                if (i29 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12824e(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12824e(15);
                        c28655q.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                c12010b4 = c12010b3;
            } else {
                if ((i14 & 1) != 0) {
                    c12010b3 = new C12010b(null, null, false, false, false, false, false, null, null, false, false, null, false, false, 16383, null);
                    i15 &= -15;
                } else {
                    c12010b3 = c12010b;
                }
                if (i28 != 0) {
                    smsSetupDestination3 = SmsSetupDestination.INTRO;
                } else {
                    smsSetupDestination3 = smsSetupDestination;
                }
                if (i29 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C12824e(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13005a(24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C12824e(15);
                        c28655q.m87172p0(objM87133R);
                    }
                    function8 = (Function1) objM87133R;
                } else {
                    function8 = function4;
                }
                c12010b4 = c12010b3;
            }
            c28655q.m87175r();
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(smsSetupDestination3.name());
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            zM65745e = AbstractC22676k.m65745e(interfaceC28601c1.getValue(), "TERMS_OF_SERVICE");
            if (zM65745e) {
                c39274g = new C39274g(EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62229E));
            } else {
                c39274g = new C39274g(EnumC16313m0.CROSS.toWhoopIcon(), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
            }
            C39274g c39274g9 = c39274g;
            Modifier modifierM66720i8 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, C2314t.f9131w)))));
            C22957g c22957g8 = AbstractC22977m.f90652c;
            C2305k c2305k8 = C2299e.f9111N;
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66720i8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            HorizontalAlignElement horizontalAlignElement8 = new HorizontalAlignElement(c2305k8);
            if (zM65745e) {
                c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153059D);
            } else {
                c8688bM21277k = AbstractC8693b.m21277k(AbstractC35950b.f153080Y);
            }
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(c8688bM21277k, null, c39274g9, new C39274g(C38072d.f163053a.m121951d().getGrowth().getMxmSupport(), null, i27, 0 == true ? 1 : 0), null, null, false, null, null, null, null, null, null, null, null, 32754, null);
            boolean zM87155h8 = c28655q.m87155h(zM65745e);
            i25 = i15 & 57344;
            if (i25 == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87155h8 | z13;
            objM87133R5 = c28655q.m87133R();
            if (z14) {
                objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C3433d0(function8, interfaceC28601c1, zM65745e);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R5;
            if (i25 == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z15) {
                objM87133R6 = new C9813i(function8, 19);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C9813i(function8, 19);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC6719b.m20143d(horizontalAlignElement8, aVar8, null, interfaceC4339a11, (InterfaceC4339a) objM87133R6, null, c28655q, AbstractC6721d.a.f25641r << 3, 36);
            Object value8 = interfaceC28601c1.getValue();
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C12824e(16);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function16 = function8;
            AbstractC1089a.m3344b(value8, null, (Function1) objM87133R7, null, "SmsSetupNavigation", null, AbstractC37817c.m121344e(-30664103, c28655q, new C13175h(function16, function7, interfaceC4339a2, c12010b4, interfaceC28601c1, 0)), c28655q, 1597824, 42);
            c28655q = c28655q;
            c28655q.m87173q(true);
            smsSetupDestination2 = smsSetupDestination3;
            function6 = function16;
            function5 = function7;
            interfaceC4339a3 = interfaceC4339a2;
            c12010b2 = c12010b4;
        } else {
            c28655q.m87138X();
            smsSetupDestination2 = smsSetupDestination;
            c12010b2 = c12010b;
            function5 = function3;
            interfaceC4339a3 = interfaceC4339a2;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0086f((Object) c12010b2, (Object) smsSetupDestination2, function5, (Object) interfaceC4339a3, (Object) function6, i13, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m36990y(AbstractC4574a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final C12010b m36991z(InterfaceC28670t2 interfaceC28670t2) {
        return (C12010b) interfaceC28670t2.getValue();
    }
}
