package sa0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gz0.EnumC16313m0;
import hg3.AbstractC17269i;
import j21.AbstractC21243b;
import j93.AbstractC21478l0;
import kd0.InterfaceC22381a;
import kf0.AbstractC22431f;
import l83.C23454a0;
import n81.AbstractC26452e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p239j1.AbstractC21189g;
import p239j1.C21194l;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p736sz0.C33211q0;
import p736sz0.Function0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa0.AbstractC30111c;
import qa0.InterfaceC30109a;
import qn0.C30515j;
import r83.EnumC31071a;
import s32.C32112d;
import s51.C32205b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vw2.C36548c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: sa0.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u000f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lqa0/c;", "viewState", "Lkotlin/Function1;", "Lqa0/a;", "Ll83/a0;", "onEvent", "Lkd0/a$c;", "onAnalyticsEvent", "l", "(Lqa0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lqa0/c$b;", "r", "(Lqa0/c$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", NotificationCompat.CATEGORY_EVENT, "z", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32325b {

    /* JADX INFO: renamed from: sa0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.actionplan.view.ActionPlanScreenKt$ActionPlan$5$1", m100430f = "ActionPlanScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133776w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f133777x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30111c f133778y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AbstractC30111c abstractC30111c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133777x = function1;
            this.f133778y = abstractC30111c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f133777x, this.f133778y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f133776w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f133777x.invoke(new InterfaceC22381a.c0(((AbstractC30111c.b) this.f133778y).getAnalyticsData()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m100599l(final AbstractC30111c viewState, final Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        Function1 function4;
        Function1 function5;
        Function1 function6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1480580657);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32112d(18);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32112d(19);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            int i18 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_action_plan", c28655q, i18 | 48);
            if (viewState instanceof AbstractC30111c.a) {
                c28655q.m87150e0(-1335441408);
                C33211q0 c33211q0M92240b = ((AbstractC30111c.a) viewState).getModalState();
                int i19 = i15 & 112;
                boolean z4 = (i18 == 4) | (i19 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (z4 || objM87133R3 == c28676v0) {
                    final int i24 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: sa0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC32325b.m100602o(viewState, function1);
                                default:
                                    return AbstractC32325b.m100603p(viewState, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                boolean z13 = (i18 == 4) | (i19 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (z13 || objM87133R4 == c28676v0) {
                    final int i25 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: sa0.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i25) {
                                case 0:
                                    return AbstractC32325b.m100602o(viewState, function1);
                                default:
                                    return AbstractC32325b.m100603p(viewState, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                Function0.m105274p(c33211q0M92240b, interfaceC4339a, (InterfaceC4339a) objM87133R4, c28655q, C33211q0.f138501k, 0);
                c28655q.m87173q(false);
                function5 = function1;
                function6 = function2;
            } else {
                if (!(viewState instanceof AbstractC30111c.b)) {
                    throw AbstractC11895b.m32003v(1203845473, c28655q, false);
                }
                c28655q.m87150e0(-1335126200);
                boolean z14 = ((i15 & 896) == 256) | (i18 == 4);
                Object objM87133R5 = c28655q.m87133R();
                if (z14 || objM87133R5 == c28676v0) {
                    objM87133R5 = new a(function2, viewState, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, viewState);
                function5 = function1;
                function6 = function2;
                m100605r((AbstractC30111c.b) viewState, function6, function5, c28655q, i18 | ((i15 >> 3) & 112) | ((i15 << 3) & 896), 0);
                c28655q.m87173q(false);
            }
            function4 = function6;
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function1;
            function4 = function2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(i13, i14, 7, viewState, function4, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m100600m(InterfaceC30109a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m100601n(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m100602o(AbstractC30111c abstractC30111c, Function1 function1) {
        InterfaceC30109a interfaceC30109aM92241c = ((AbstractC30111c.a) abstractC30111c).getPrimaryClickEvent();
        if (interfaceC30109aM92241c != null) {
            function1.invoke(interfaceC30109aM92241c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m100603p(AbstractC30111c abstractC30111c, Function1 function1) {
        InterfaceC30109a interfaceC30109aM92242d = ((AbstractC30111c.a) abstractC30111c).getSecondaryClickEvent();
        if (interfaceC30109aM92242d != null) {
            function1.invoke(interfaceC30109aM92242d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m100604q(AbstractC30111c abstractC30111c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m100599l(abstractC30111c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026f  */
    /* JADX WARN: Code duplicated, block: B:102:0x027d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:109:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x02de  */
    /* JADX WARN: Code duplicated, block: B:115:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:119:0x030c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0310  */
    /* JADX WARN: Code duplicated, block: B:122:0x0312  */
    /* JADX WARN: Code duplicated, block: B:125:0x031a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0322  */
    /* JADX WARN: Code duplicated, block: B:131:0x036d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0378  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:73:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0202  */
    /* JADX WARN: Code duplicated, block: B:89:0x0211  */
    /* JADX WARN: Code duplicated, block: B:91:0x021f  */
    /* JADX WARN: Code duplicated, block: B:96:0x025e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0262  */
    /* JADX INFO: renamed from: r */
    public static final void m100605r(AbstractC30111c.b viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Function1 function3;
        int i15;
        Function1 function4;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        Function1 function7;
        int i17;
        boolean z13;
        Object objM87133R;
        Function1 function8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        boolean z14;
        Object objM87133R2;
        Function1 function9;
        int i19;
        Function1 function10;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        int iHashCode3;
        int iHashCode4;
        boolean z15;
        int i24;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        Function1 function11;
        Function1 function12;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1756320412);
        int i25 = (i13 & 6) == 0 ? (c28655q2.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i25 |= c28655q2.m87157i(function3) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i25 |= i16;
                }
                if ((i25 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i25 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C32112d(20);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function3;
                    }
                    if (i15 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32112d(21);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    } else {
                        function7 = function4;
                    }
                    Function1 function13 = function6;
                    boolean zM92244c = viewState.getDisplayRefreshingSpinner();
                    i17 = i25 & 896;
                    if (i17 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C30515j(function7, 24);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function8 = function7;
                    C21194l c21194lM60416V = AbstractC21478l0.m60416V(zM92244c, (InterfaceC4339a) objM87133R, 0.0f, c28655q2, 0, 12);
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t), c21194lM60416V))), "ActionPlanSuccessState");
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i3 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a);
                    C0209i c0209i4 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        i18 = i25;
                    } else {
                        i18 = i25;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i5 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                        if (i17 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C30515j(function8, 25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function9 = function8;
                        i19 = i17;
                        function10 = function13;
                        AbstractC6719b.m20143d(modifierM3409f, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c0213j2 = c0213j;
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m2);
                        if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            c0209i2 = c0209i;
                        } else {
                            c0209i2 = c0209i;
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                        Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                        iHashCode3 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m3);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                        float f13 = 8;
                        AbstractC11266d.m30469w(1, f13, c2314t, c28655q2);
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(4 * f13);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q2, 6);
                        iHashCode4 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j2);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m4);
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
                        c28655q2.m87150e0(1105219957);
                        for (InterfaceC25312u interfaceC25312u : viewState.m92246e()) {
                            if ((i18 & 112) == 32) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            i24 = i19;
                            if (i24 == 256) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | z15;
                            objM87133R3 = c28655q2.m87133R();
                            if (!z17 || objM87133R3 == c28676v0) {
                                function11 = function10;
                                function12 = function9;
                                objM87133R3 = new C2777c(function11, 16, function12);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                function11 = function10;
                                function12 = function9;
                            }
                            AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                            function9 = function12;
                            i19 = i24;
                            function10 = function11;
                        }
                        c28655q2.m87173q(false);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0L, 0L, c28655q, 64);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function3 = function10;
                        function5 = function9;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i6 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i17 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C30515j(function8, 25);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C30515j(function8, 25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function9 = function8;
                    i19 = i17;
                    function10 = function13;
                    AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m5);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N5);
                    Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m6);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N6);
                    float f14 = 8;
                    AbstractC11266d.m30469w(1, f14, c2314t, c28655q2);
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(4 * f14);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f14, 7);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m7);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N7);
                    c28655q2.m87150e0(1105219957);
                    while (r0.hasNext()) {
                        if ((i18 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i24 = i19;
                        if (i24 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z17) {
                            function11 = function10;
                            function12 = function9;
                            objM87133R3 = new C2777c(function11, 16, function12);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            function11 = function10;
                            function12 = function9;
                            objM87133R3 = new C2777c(function11, 16, function12);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                        function9 = function12;
                        i19 = i24;
                        function10 = function11;
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V, C1100b.f4583a.mo3400a(c2314t, C2299e.f9115x), 0L, 0L, c28655q, 64);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function10;
                    function5 = function9;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    function5 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32205b(i13, i14, 6, viewState, function5, function3);
                }
            }
            i25 |= 384;
            function4 = function2;
            if ((i25 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i25 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32112d(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32112d(21);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function4;
                }
                Function1 function14 = function6;
                boolean zM92244c2 = viewState.getDisplayRefreshingSpinner();
                i17 = i25 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C30515j(function7, 24);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C30515j(function7, 24);
                    c28655q2.m87172p0(objM87133R);
                }
                function8 = function7;
                C21194l c21194lM60416V2 = AbstractC21478l0.m60416V(zM92244c2, (InterfaceC4339a) objM87133R, 0.0f, c28655q2, 0, 12);
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t2), c21194lM60416V2))), "ActionPlanSuccessState");
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3599a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i7 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a6);
                C0209i c0209i8 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    i18 = i25;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N8);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    AbstractC6721d.a aVar3 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i17 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C30515j(function8, 25);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C30515j(function8, 25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function9 = function8;
                    i19 = i17;
                    function10 = function14;
                    AbstractC6719b.m20143d(modifierM3409f3, aVar3, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m9);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N9);
                    Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t2), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM92116f2);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m10);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N10);
                    float f15 = 8;
                    AbstractC11266d.m30469w(1, f15, c2314t2, c28655q2);
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(4 * f15);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 2 * f15, 7);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k2, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m11);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N11);
                    c28655q2.m87150e0(1105219957);
                    while (r0.hasNext()) {
                        if ((i18 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i24 = i19;
                        if (i24 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z17) {
                            function11 = function10;
                            function12 = function9;
                            objM87133R3 = new C2777c(function11, 16, function12);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            function11 = function10;
                            function12 = function9;
                            objM87133R3 = new C2777c(function11, 16, function12);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                        function9 = function12;
                        i19 = i24;
                        function10 = function11;
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V2, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9115x), 0L, 0L, c28655q, 64);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function10;
                    function5 = function9;
                } else {
                    i18 = i25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N8);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
                AbstractC6721d.a aVar4 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C30515j(function8, 25);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C30515j(function8, 25);
                    c28655q2.m87172p0(objM87133R2);
                }
                function9 = function8;
                i19 = i17;
                function10 = function14;
                AbstractC6719b.m20143d(modifierM3409f4, aVar4, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m12);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N12);
                Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t2), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM92116f3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m13);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N13);
                float f16 = 8;
                AbstractC11266d.m30469w(1, f16, c2314t2, c28655q2);
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(4 * f16);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 2 * f16, 7);
                C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k2, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3398t4);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a10);
                AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m14);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N14);
                c28655q2.m87150e0(1105219957);
                while (r0.hasNext()) {
                    if ((i18 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i24 = i19;
                    if (i24 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z17) {
                        function11 = function10;
                        function12 = function9;
                        objM87133R3 = new C2777c(function11, 16, function12);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        function11 = function10;
                        function12 = function9;
                        objM87133R3 = new C2777c(function11, 16, function12);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                    function9 = function12;
                    i19 = i24;
                    function10 = function11;
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V2, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9115x), 0L, 0L, c28655q, 64);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function10;
                function5 = function9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(i13, i14, 6, viewState, function5, function3);
            }
        }
        i25 |= 48;
        function3 = function1;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i25 |= i16;
            }
            if ((i25 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i25 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C32112d(20);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function3;
                }
                if (i15 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32112d(21);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function4;
                }
                Function1 function15 = function6;
                boolean zM92244c3 = viewState.getDisplayRefreshingSpinner();
                i17 = i25 & 896;
                if (i17 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13) {
                    objM87133R = new C30515j(function7, 24);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C30515j(function7, 24);
                    c28655q2.m87172p0(objM87133R);
                }
                function8 = function7;
                C21194l c21194lM60416V3 = AbstractC21478l0.m60416V(zM92244c3, (InterfaceC4339a) objM87133R, 0.0f, c28655q2, 0, 12);
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t3), c21194lM60416V3))), "ActionPlanSuccessState");
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3599a3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a11);
                C0209i c0209i12 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    i18 = i25;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i13 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N15);
                    Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t3);
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                    if (i17 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C30515j(function8, 25);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C30515j(function8, 25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function9 = function8;
                    i19 = i17;
                    function10 = function15;
                    AbstractC6719b.m20143d(modifierM3409f5, aVar5, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c0213j2 = c0213j;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m16);
                    if (c28655q2.f115903S) {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        c0209i2 = c0209i;
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N16);
                    Modifier modifierM92116f4 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t3), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM92116f4);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m17);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N17);
                    float f17 = 8;
                    AbstractC11266d.m30469w(1, f17, c2314t3, c28655q2);
                    C22971k c22971kM66746i5 = AbstractC22977m.m66746i(4 * f17);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 2 * f17, 7);
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22971kM66746i5, c2305k3, c28655q2, 6);
                    iHashCode4 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM3398t5);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m18);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N18);
                    c28655q2.m87150e0(1105219957);
                    while (r0.hasNext()) {
                        if ((i18 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        i24 = i19;
                        if (i24 == 256) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | z15;
                        objM87133R3 = c28655q2.m87133R();
                        if (z17) {
                            function11 = function10;
                            function12 = function9;
                            objM87133R3 = new C2777c(function11, 16, function12);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            function11 = function10;
                            function12 = function9;
                            objM87133R3 = new C2777c(function11, 16, function12);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                        function9 = function12;
                        i19 = i24;
                        function10 = function11;
                    }
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V3, C1100b.f4583a.mo3400a(c2314t3, C2299e.f9115x), 0L, 0L, c28655q, 64);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function3 = function10;
                    function5 = function9;
                } else {
                    i18 = i25;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i14 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N15);
                Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t3);
                AbstractC6721d.a aVar6 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C30515j(function8, 25);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C30515j(function8, 25);
                    c28655q2.m87172p0(objM87133R2);
                }
                function9 = function8;
                i19 = i17;
                function10 = function15;
                AbstractC6719b.m20143d(modifierM3409f6, aVar6, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m19);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N19);
                Modifier modifierM92116f5 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t3), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM92116f5);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m110);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N110);
                float f18 = 8;
                AbstractC11266d.m30469w(1, f18, c2314t3, c28655q2);
                C22971k c22971kM66746i6 = AbstractC22977m.m66746i(4 * f18);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 2 * f18, 7);
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22971kM66746i6, c2305k3, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM3398t6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m111);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i14, modifierM118962N111);
                c28655q2.m87150e0(1105219957);
                while (r0.hasNext()) {
                    if ((i18 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i24 = i19;
                    if (i24 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z17) {
                        function11 = function10;
                        function12 = function9;
                        objM87133R3 = new C2777c(function11, 16, function12);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        function11 = function10;
                        function12 = function9;
                        objM87133R3 = new C2777c(function11, 16, function12);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                    function9 = function12;
                    i19 = i24;
                    function10 = function11;
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V3, C1100b.f4583a.mo3400a(c2314t3, C2299e.f9115x), 0L, 0L, c28655q, 64);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function10;
                function5 = function9;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function5 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(i13, i14, 6, viewState, function5, function3);
            }
        }
        i25 |= 384;
        function4 = function2;
        if ((i25 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i25 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C32112d(20);
                    c28655q2.m87172p0(objM87133R5);
                }
                function6 = (Function1) objM87133R5;
            } else {
                function6 = function3;
            }
            if (i15 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32112d(21);
                    c28655q2.m87172p0(objM87133R4);
                }
                function7 = (Function1) objM87133R4;
            } else {
                function7 = function4;
            }
            Function1 function16 = function6;
            boolean zM92244c4 = viewState.getDisplayRefreshingSpinner();
            i17 = i25 & 896;
            if (i17 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C30515j(function7, 24);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C30515j(function7, 24);
                c28655q2.m87172p0(objM87133R);
            }
            function8 = function7;
            C21194l c21194lM60416V4 = AbstractC21478l0.m60416V(zM92244c4, (InterfaceC4339a) objM87133R, 0.0f, c28655q2, 0, 12);
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC17269i.m48893g0(AbstractC1102d.m3407d(1.0f, c2314t4), c21194lM60416V4))), "ActionPlanSuccessState");
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3599a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i15 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a16);
            C0209i c0209i16 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m112);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                i18 = i25;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i17 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N112);
                Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t4);
                AbstractC6721d.a aVar7 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C30515j(function8, 25);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C30515j(function8, 25);
                    c28655q2.m87172p0(objM87133R2);
                }
                function9 = function8;
                i19 = i17;
                function10 = function16;
                AbstractC6719b.m20143d(modifierM3409f7, aVar7, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c0213j2 = c0213j;
                    c28655q2.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m113);
                if (c28655q2.f115903S) {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N113);
                Modifier modifierM92116f6 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t4), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM92116f6);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a17);
                AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N114);
                float f19 = 8;
                AbstractC11266d.m30469w(1, f19, c2314t4, c28655q2);
                C22971k c22971kM66746i7 = AbstractC22977m.m66746i(4 * f19);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, 2 * f19, 7);
                C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22971kM66746i7, c2305k4, c28655q2, 6);
                iHashCode4 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3398t7);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j2);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a18);
                AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N115);
                c28655q2.m87150e0(1105219957);
                while (r0.hasNext()) {
                    if ((i18 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    i24 = i19;
                    if (i24 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | z15;
                    objM87133R3 = c28655q2.m87133R();
                    if (z17) {
                        function11 = function10;
                        function12 = function9;
                        objM87133R3 = new C2777c(function11, 16, function12);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        function11 = function10;
                        function12 = function9;
                        objM87133R3 = new C2777c(function11, 16, function12);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                    function9 = function12;
                    i19 = i24;
                    function10 = function11;
                }
                c28655q2.m87173q(false);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V4, C1100b.f4583a.mo3400a(c2314t4, C2299e.f9115x), 0L, 0L, c28655q, 64);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function10;
                function5 = function9;
            } else {
                i18 = i25;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i18 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N112);
            Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t4);
            AbstractC6721d.a aVar8 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C30515j(function8, 25);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C30515j(function8, 25);
                c28655q2.m87172p0(objM87133R2);
            }
            function9 = function8;
            i19 = i17;
            function10 = function16;
            AbstractC6719b.m20143d(modifierM3409f8, aVar8, null, (InterfaceC4339a) objM87133R2, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j2 = c0213j;
                c28655q2.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m116);
            if (c28655q2.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N116);
            Modifier modifierM92116f7 = AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC1102d.m3407d(1.0f, c2314t4), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q2, 0);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
            Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM92116f7);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a19);
            AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m117);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N117);
            float f110 = 8;
            AbstractC11266d.m30469w(1, f110, c2314t4, c28655q2);
            C22971k c22971kM66746i8 = AbstractC22977m.m66746i(4 * f110);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(c2314t4, 0.0f, 0.0f, 0.0f, 2 * f110, 7);
            C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22971kM66746i8, c2305k4, c28655q2, 6);
            iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
            Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3398t8);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i15, c23010xM66775a110);
            AbstractC28683x.m87239G(c28655q2, c0209i16, interfaceC28653p1M87165m118);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i18, modifierM118962N118);
            c28655q2.m87150e0(1105219957);
            while (r0.hasNext()) {
                if ((i18 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i24 = i19;
                if (i24 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | z15;
                objM87133R3 = c28655q2.m87133R();
                if (z17) {
                    function11 = function10;
                    function12 = function9;
                    objM87133R3 = new C2777c(function11, 16, function12);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    function11 = function10;
                    function12 = function9;
                    objM87133R3 = new C2777c(function11, 16, function12);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC22431f.m64641P(interfaceC25312u, (Function1) objM87133R3, c28655q2, 0, 0);
                function9 = function12;
                i19 = i24;
                function10 = function11;
            }
            c28655q2.m87173q(false);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            AbstractC21189g.m59424b(viewState.getDisplayRefreshingSpinner(), c21194lM60416V4, C1100b.f4583a.mo3400a(c2314t4, C2299e.f9115x), 0L, 0L, c28655q, 64);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function10;
            function5 = function9;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function5 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(i13, i14, 6, viewState, function5, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m100606s(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m100607t(InterfaceC30109a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m100608u(Function1 function1) {
        function1.invoke(InterfaceC30109a.f.f122861a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m100609v(Function1 function1) {
        function1.invoke(InterfaceC30109a.a.f122856a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m100610w(Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m100613z(function1, function2, event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m100611x(AbstractC30111c.b bVar, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m100605r(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final Object m100612y(Object obj) {
        return obj instanceof AbstractC26452e.a ? ((AbstractC26452e.a) obj).getAny() : obj;
    }

    /* JADX INFO: renamed from: z */
    public static final void m100613z(Function1 onAnalyticsEvent, Function1 onEvent, Object event) {
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(event, "event");
        Object objM100612y = m100612y(event);
        if (objM100612y instanceof C9598e) {
            onEvent.invoke(new InterfaceC30109a.c((C9598e) objM100612y));
            return;
        }
        if (objM100612y instanceof AbstractC21243b.b) {
            onEvent.invoke(new InterfaceC30109a.c(((AbstractC21243b.b) objM100612y).getDestination()));
            return;
        }
        if (!(objM100612y instanceof C27256h)) {
            if (objM100612y instanceof AbstractC26452e.b) {
                onAnalyticsEvent.invoke(InterfaceC22381a.a.f87385a);
            }
        } else {
            C27256h c27256h = (C27256h) objM100612y;
            Action action = c27256h.getAction();
            if (action != null) {
                onEvent.invoke(new InterfaceC30109a.b(new C36548c(action)));
            } else {
                onEvent.invoke(new InterfaceC30109a.c(c27256h.getDestination()));
            }
        }
    }
}
