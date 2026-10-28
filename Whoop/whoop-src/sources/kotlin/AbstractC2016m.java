package kotlin;

import a80.C0542f;
import a81.C0555f;
import androidx.compose.runtime.Composer;
import aq0.C1905p;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.ConfirmTarget;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import j02.AbstractC21130a1;
import ks2.AbstractC22822a;
import l83.C23454a0;
import ls2.AbstractC24716a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C29656q;
import p088dc.AbstractC11895b;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ws2.AbstractC37617i;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.m */
/* JADX INFO: loaded from: classes11.dex */
@p715kotlin.Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lys2/e;", "viewState", "Lkotlin/Function1;", "Lls2/a;", "Ll83/a0;", "onAnalyticsEvent", "Lws2/i;", "onViewEvent", "Lkotlin/Function0;", "onExit", "k0", "(Lys2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Leb/u0;", "navController", "", "onEvent", "L", "(Lys2/e;Leb/u0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2016m {

    /* JADX INFO: renamed from: at2.m$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.CustomizePlanScreenKt$CustomizePlanScreen$4$1", m100430f = "CustomizePlanScreen.kt", m100431l = {48}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7998w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f7999x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7999x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f7999x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7998w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f7998w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f7999x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.m$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.CustomizePlanScreenKt$CustomizePlanScreen$5$1", m100430f = "CustomizePlanScreen.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8000w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f8001x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8001x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f8001x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8000w;
            int i14 = 1;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f8000w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f8001x.invoke(new AbstractC37617i.j(false, i14, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.m$c */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.CustomizePlanScreenKt$CustomizePlanScreen$6$1", m100430f = "CustomizePlanScreen.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8002w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f8003x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8003x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f8003x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8002w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f8002w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f8003x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.m$d */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.CustomizePlanScreenKt$CustomizePlanScreen$7$1", m100430f = "CustomizePlanScreen.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8004w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f8005x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8005x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f8005x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f8004w;
            int i14 = 1;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f8004w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f8005x.invoke(new AbstractC37617i.j(false, i14, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.m$e */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8006a;

        static {
            int[] iArr = new int[TargetGoalType.values().length];
            try {
                iArr[TargetGoalType.HR_ZONES_ONE_TO_THREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetGoalType.HR_ZONES_FOUR_TO_FIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8006a = iArr;
        }
    }

    /* JADX INFO: renamed from: L */
    public static final void m6225L(AbstractC39758e viewState, C12991u0 c12991u0, Function1 onAnalyticsEvent, Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        C12991u0 c12991u0M58963a;
        C12991u0 c12991u1;
        String str;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1447537731);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c12991u0M58963a = c12991u0;
                int i16 = c28655q.m87157i(c12991u0M58963a) ? 32 : 16;
                i15 |= i16;
            } else {
                c12991u0M58963a = c12991u0;
            }
            i15 |= i16;
        } else {
            c12991u0M58963a = c12991u0;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onAnalyticsEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
            } else if ((i14 & 2) != 0) {
                c12991u0M58963a = AbstractC21130a1.m58963a("CustomizePlanNavHost", null, c28655q, 6, 2);
                i15 &= -113;
            }
            c28655q.m87175r();
            if (viewState instanceof AbstractC39758e.l) {
                str = "SLEEP";
            } else if (viewState instanceof AbstractC39758e.n) {
                str = "SLEEP_HOURS";
            } else if (viewState instanceof AbstractC39758e.p) {
                str = "STRAIN";
            } else if (viewState instanceof AbstractC39758e.i) {
                str = "ACTIVITY";
            } else if (viewState instanceof AbstractC39758e.j) {
                str = "BEHAVIOR";
            } else if (viewState instanceof AbstractC39758e.q) {
                str = "WEIGHT";
            } else if (viewState instanceof AbstractC39758e.o) {
                str = "STEPS";
            } else if (viewState instanceof AbstractC39758e.m) {
                str = "SLEEP_CONSISTENCY";
            } else if (viewState instanceof AbstractC39758e.k) {
                int i17 = e.f8006a[((AbstractC39758e.k) viewState).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().ordinal()];
                if (i17 != 1) {
                    str = i17 != 2 ? "STRENGTH_ACTIVITY_TIME" : "HR_ZONE_4_5";
                } else {
                    str = "HR_ZONE_1_3";
                }
            } else {
                str = "oops";
            }
            boolean z4 = ((i15 & 14) == 4) | ((i15 & 896) == 256) | ((i15 & 7168) == 2048);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C29656q((Object) viewState, onAnalyticsEvent, (Object) onEvent, 4);
                c28655q.m87172p0(objM87133R);
            }
            C12991u0 c12991u2 = c12991u0M58963a;
            AbstractC17269i.m48888e(c12991u2, str, null, (Function1) objM87133R, c28655q, (i15 >> 3) & 14);
            c12991u1 = c12991u2;
        } else {
            c28655q.m87138X();
            c12991u1 = c12991u0M58963a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) c12991u1, onAnalyticsEvent, (Object) onEvent, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m6226M(final AbstractC39758e abstractC39758e, Function1 function1, final Function1 function2, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "SLEEP", null, new C37816b(new C0542f((Object) abstractC39758e, function1, (Object) function2, 1), true, -803412542), 6);
        final int i13 = 1;
        AbstractC12889b.m36291u(NavHost, "SLEEP_CONSISTENCY", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -894048007), 6);
        final int i14 = 2;
        AbstractC12889b.m36291u(NavHost, "SLEEP_HOURS", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, 1641559418), 6);
        final int i15 = 3;
        AbstractC12889b.m36291u(NavHost, "STEPS", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i16 = i15;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i16) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -117800453), 6);
        final int i16 = 4;
        AbstractC12889b.m36291u(NavHost, "STRAIN", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i17 = i16;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i17) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -1877160324), 6);
        final int i17 = 5;
        AbstractC12889b.m36291u(NavHost, "ACTIVITY", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i18 = i17;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i18) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, 658447101), 6);
        final int i18 = 6;
        AbstractC12889b.m36291u(NavHost, "BEHAVIOR", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i19 = i18;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i19) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -1100912770), 6);
        final int i19 = 7;
        AbstractC12889b.m36291u(NavHost, "WEIGHT", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i110 = i19;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i110) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, 1434694655), 6);
        final int i24 = 8;
        AbstractC12889b.m36291u(NavHost, "HR_ZONE_1_3", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i110 = i24;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i110) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -324665216), 6);
        final int i25 = 9;
        AbstractC12889b.m36291u(NavHost, "HR_ZONE_4_5", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i110 = i25;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i110) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -2084025087), 6);
        final int i26 = 0;
        AbstractC12889b.m36291u(NavHost, "STRENGTH_ACTIVITY_TIME", null, new C37816b(new Function3() { // from class: at2.i
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i110 = i26;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i110) {
                    case 0:
                        return AbstractC2016m.m6231R(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 1:
                        return AbstractC2016m.m6229P(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 2:
                        return AbstractC2016m.m6233T(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 3:
                        return AbstractC2016m.m6235V(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 4:
                        return AbstractC2016m.m6237X(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 5:
                        return AbstractC2016m.m6239Z(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 6:
                        return AbstractC2016m.m6243b0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 7:
                        return AbstractC2016m.m6247d0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    case 8:
                        return AbstractC2016m.m6251f0(abstractC39758e, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC2016m.m6255h0(abstractC39758e, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, 463714815), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m6227N(AbstractC39758e abstractC39758e, Function1 function1, Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpSleep");
        AbstractC39758e.l lVar = (AbstractC39758e.l) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function2);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function2, 7);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2029s0.m6330m(lVar, function1, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m6228O(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m6229P(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpSleepConsistency");
        AbstractC39758e.m mVar = (AbstractC39758e.m) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 1);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2011j0.m6205i(mVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m6230Q(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m6231R(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpGoalTime");
        AbstractC39758e.k kVar = (AbstractC39758e.k) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 0);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2005g0.m6191u(kVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m6232S(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m6233T(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpSleepHours");
        AbstractC39758e.n nVar = (AbstractC39758e.n) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 10);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2021o0.m6303m(nVar, null, (Function1) objM87133R, c28655q, 0, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m6234U(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m6235V(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpSteps");
        AbstractC39758e.o oVar = (AbstractC39758e.o) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 4);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2035v0.m6352i(oVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m6236W(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m6237X(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpStrain");
        AbstractC39758e.p pVar = (AbstractC39758e.p) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 8);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2041y0.m6429i(pVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m6238Y(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m6239Z(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpActivities");
        AbstractC39758e.i iVar = (AbstractC39758e.i) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 5);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2036w.m6407z(iVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m6241a0(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m6243b0(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpBehaviors");
        AbstractC39758e.j jVar = (AbstractC39758e.j) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 3);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC1993c0.m6092w(jVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m6245c0(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m6247d0(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpWeight");
        AbstractC39758e.q qVar = (AbstractC39758e.q) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 2);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC1997d1.m6138m(qVar, null, (Function1) objM87133R, c28655q, 0, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m6249e0(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m6251f0(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpGoalTime");
        AbstractC39758e.k kVar = (AbstractC39758e.k) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 6);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2005g0.m6188r(kVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m6253g0(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m6255h0(AbstractC39758e abstractC39758e, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC22676k.m65748h(abstractC39758e, "null cannot be cast to non-null type com.whoop.weeklyplan.customizeplan.presentation.CustomizePlanViewState.SetUpGoalTime");
        AbstractC39758e.k kVar = (AbstractC39758e.k) abstractC39758e;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C2010j(function1, 9);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC2005g0.m6185o(kVar, (Function1) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m6257i0(Function1 function1, AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m6259j0(AbstractC39758e abstractC39758e, C12991u0 c12991u0, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m6225L(abstractC39758e, c12991u0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:103:0x0238  */
    /* JADX WARN: Code duplicated, block: B:105:0x0284  */
    /* JADX WARN: Code duplicated, block: B:108:0x0291  */
    /* JADX WARN: Code duplicated, block: B:111:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x029b  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:117:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:238:0x0462  */
    /* JADX WARN: Code duplicated, block: B:239:0x0465  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:243:0x046d  */
    /* JADX WARN: Code duplicated, block: B:246:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0479  */
    /* JADX WARN: Code duplicated, block: B:250:0x049c  */
    /* JADX WARN: Code duplicated, block: B:253:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f8  */
    /* JADX INFO: renamed from: k0 */
    public static final void m6261k0(final AbstractC39758e viewState, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a2;
        int i19;
        boolean z4;
        boolean z13;
        Function1 function5;
        Function1 function6;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        final Function1 function8;
        InterfaceC4339a interfaceC4339a4;
        boolean z14;
        boolean z15;
        Object objM87133R;
        boolean z16;
        Object objM87133R2;
        Object objM87133R3;
        boolean z17;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-376886039);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC4339a2 = interfaceC4339a;
                        if (c28655q.m87157i(interfaceC4339a2)) {
                            i19 = 2048;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    z4 = true;
                    if ((i15 & 1171) != 1170) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z13)) {
                        c28676v0 = C28635l.f115821a;
                        if (i24 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C1905p(4);
                                c28655q.m87172p0(objM87133R8);
                            }
                            function7 = (Function1) objM87133R8;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C1905p(5);
                                c28655q.m87172p0(objM87133R7);
                            }
                            function8 = (Function1) objM87133R7;
                        } else {
                            function8 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C2012k(0);
                                c28655q.m87172p0(objM87133R6);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a4 = interfaceC4339a2;
                        }
                        if (viewState instanceof AbstractC39758e.c) {
                            c28655q.m87150e0(-1410221402);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC39758e.h) {
                            c28655q.m87150e0(-1410214948);
                            AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC39758e.g) {
                            c28655q.m87150e0(-766814098);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            if (((AbstractC39758e.g) viewState).getExit()) {
                                c28655q.m87150e0(-766649643);
                                Boolean bool = Boolean.TRUE;
                                if ((i15 & 7168) != 2048) {
                                    c28655q = c28655q;
                                    z4 = false;
                                }
                                c28655q = c28655q;
                                objM87133R5 = c28655q.m87133R();
                                if (z4 || objM87133R5 == c28676v0) {
                                    objM87133R5 = new a(interfaceC4339a4, null);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool);
                                z17 = false;
                                c28655q.m87173q(false);
                            } else {
                                z17 = false;
                                c28655q.m87150e0(-766511693);
                                Boolean bool2 = Boolean.TRUE;
                                if ((i15 & 896) != 256) {
                                    c28655q = c28655q;
                                    z4 = false;
                                }
                                c28655q = c28655q;
                                objM87133R4 = c28655q.m87133R();
                                if (z4 || objM87133R4 == c28676v0) {
                                    objM87133R4 = new b(function8, null);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool2);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z17);
                        } else if (viewState instanceof AbstractC39758e.e) {
                            c28655q.m87150e0(-1410192386);
                            AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC39758e.d) {
                            c28655q.m87150e0(-766108662);
                            AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                            if (((AbstractC39758e.d) viewState).getExit()) {
                                c28655q.m87150e0(-765878859);
                                Boolean bool3 = Boolean.TRUE;
                                if ((i15 & 7168) != 2048) {
                                    c28655q = c28655q;
                                    z4 = false;
                                }
                                c28655q = c28655q;
                                objM87133R3 = c28655q.m87133R();
                                if (z4 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new c(interfaceC4339a4, null);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool3);
                                z16 = false;
                                c28655q.m87173q(false);
                            } else {
                                z16 = false;
                                c28655q.m87150e0(-765740909);
                                Boolean bool4 = Boolean.TRUE;
                                if ((i15 & 896) != 256) {
                                    c28655q = c28655q;
                                    z4 = false;
                                }
                                c28655q = c28655q;
                                objM87133R2 = c28655q.m87133R();
                                if (z4 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new d(function8, null);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool4);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z16);
                        } else if (!(viewState instanceof AbstractC39758e.l) || (viewState instanceof AbstractC39758e.m) || (viewState instanceof AbstractC39758e.n) || (viewState instanceof AbstractC39758e.o) || (viewState instanceof AbstractC39758e.p) || (viewState instanceof AbstractC39758e.i) || (viewState instanceof AbstractC39758e.j) || (viewState instanceof AbstractC39758e.q) || (viewState instanceof AbstractC39758e.k)) {
                            c28655q.m87150e0(-765161085);
                            if ((i15 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z14 | ((i15 & 896) == 256);
                            objM87133R = c28655q.m87133R();
                            if (z15 || objM87133R == c28676v0) {
                                objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a2 = interfaceC4339a4;
                            function5 = function7;
                            function4 = function8;
                            m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC39758e.b) {
                            c28655q.m87150e0(-1410140007);
                            boolean z18 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
                            Object objM87133R9 = c28655q.m87133R();
                            if (z18 || objM87133R9 == c28676v0) {
                                final int i25 = 3;
                                objM87133R9 = new InterfaceC4339a() { // from class: at2.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                return AbstractC2016m.m6271p0(function8, viewState);
                                            case 1:
                                                return AbstractC2016m.m6273q0(function8, viewState);
                                            case 2:
                                                return AbstractC2016m.m6277s0(function8, viewState);
                                            case 3:
                                                return AbstractC2016m.m6285w0(function8, viewState);
                                            default:
                                                return AbstractC2016m.m6267n0(function8, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R9);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R9;
                            z4 = (i15 & 7168) == 2048;
                            Object objM87133R10 = c28655q.m87133R();
                            if (z4 || objM87133R10 == c28676v0) {
                                objM87133R10 = new C1989b(interfaceC4339a4, 5);
                                c28655q.m87172p0(objM87133R10);
                            }
                            Function0.m6116h(interfaceC4339a5, (InterfaceC4339a) objM87133R10, null, c28655q, 0, 4);
                            c28655q.m87173q(false);
                        } else if (viewState instanceof AbstractC39758e.a) {
                            c28655q.m87150e0(-1410131985);
                            int i26 = i15 & 896;
                            int i27 = i15 & 14;
                            boolean z19 = (i27 == 4) | (i26 == 256);
                            Object objM87133R11 = c28655q.m87133R();
                            if (z19 || objM87133R11 == c28676v0) {
                                final int i28 = 4;
                                objM87133R11 = new InterfaceC4339a() { // from class: at2.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i28) {
                                            case 0:
                                                return AbstractC2016m.m6271p0(function8, viewState);
                                            case 1:
                                                return AbstractC2016m.m6273q0(function8, viewState);
                                            case 2:
                                                return AbstractC2016m.m6277s0(function8, viewState);
                                            case 3:
                                                return AbstractC2016m.m6285w0(function8, viewState);
                                            default:
                                                return AbstractC2016m.m6267n0(function8, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R11;
                            boolean z24 = (i15 & 7168) == 2048;
                            Object objM87133R12 = c28655q.m87133R();
                            if (z24 || objM87133R12 == c28676v0) {
                                objM87133R12 = new C1989b(interfaceC4339a4, 3);
                                c28655q.m87172p0(objM87133R12);
                            }
                            InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R12;
                            boolean z25 = (i26 == 256) | (i27 == 4);
                            Object objM87133R13 = c28655q.m87133R();
                            if (z25 || objM87133R13 == c28676v0) {
                                final int i29 = 0;
                                objM87133R13 = new InterfaceC4339a() { // from class: at2.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i29) {
                                            case 0:
                                                return AbstractC2016m.m6271p0(function8, viewState);
                                            case 1:
                                                return AbstractC2016m.m6273q0(function8, viewState);
                                            case 2:
                                                return AbstractC2016m.m6277s0(function8, viewState);
                                            case 3:
                                                return AbstractC2016m.m6285w0(function8, viewState);
                                            default:
                                                return AbstractC2016m.m6267n0(function8, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R13);
                            }
                            Function0.m6116h(interfaceC4339a6, interfaceC4339a7, (InterfaceC4339a) objM87133R13, c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (!(viewState instanceof AbstractC39758e.f)) {
                                throw AbstractC11895b.m32003v(-1410219334, c28655q, false);
                            }
                            c28655q.m87150e0(-1410117753);
                            int i34 = i15 & 896;
                            int i35 = i15 & 14;
                            boolean z26 = (i35 == 4) | (i34 == 256);
                            Object objM87133R14 = c28655q.m87133R();
                            if (z26 || objM87133R14 == c28676v0) {
                                final int i36 = 1;
                                objM87133R14 = new InterfaceC4339a() { // from class: at2.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i36) {
                                            case 0:
                                                return AbstractC2016m.m6271p0(function8, viewState);
                                            case 1:
                                                return AbstractC2016m.m6273q0(function8, viewState);
                                            case 2:
                                                return AbstractC2016m.m6277s0(function8, viewState);
                                            case 3:
                                                return AbstractC2016m.m6285w0(function8, viewState);
                                            default:
                                                return AbstractC2016m.m6267n0(function8, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R14);
                            }
                            InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R14;
                            boolean z27 = (i15 & 7168) == 2048;
                            Object objM87133R15 = c28655q.m87133R();
                            if (z27 || objM87133R15 == c28676v0) {
                                objM87133R15 = new C1989b(interfaceC4339a4, 4);
                                c28655q.m87172p0(objM87133R15);
                            }
                            InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R15;
                            boolean z28 = (i34 == 256) | (i35 == 4);
                            Object objM87133R16 = c28655q.m87133R();
                            if (z28 || objM87133R16 == c28676v0) {
                                final int i37 = 2;
                                objM87133R16 = new InterfaceC4339a() { // from class: at2.h
                                    @Override // c93.InterfaceC4339a
                                    public final Object invoke() {
                                        switch (i37) {
                                            case 0:
                                                return AbstractC2016m.m6271p0(function8, viewState);
                                            case 1:
                                                return AbstractC2016m.m6273q0(function8, viewState);
                                            case 2:
                                                return AbstractC2016m.m6277s0(function8, viewState);
                                            case 3:
                                                return AbstractC2016m.m6285w0(function8, viewState);
                                            default:
                                                return AbstractC2016m.m6267n0(function8, viewState);
                                        }
                                    }
                                };
                                c28655q.m87172p0(objM87133R16);
                            }
                            Function0.m6116h(interfaceC4339a8, interfaceC4339a9, (InterfaceC4339a) objM87133R16, c28655q, 0, 0);
                            c28655q.m87173q(false);
                        }
                        function5 = function7;
                        function4 = function8;
                        interfaceC4339a2 = interfaceC4339a4;
                    } else {
                        c28655q.m87138X();
                        function5 = function3;
                    }
                    function6 = function4;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
                    }
                }
                i15 |= 3072;
                interfaceC4339a2 = interfaceC4339a;
                z4 = true;
                if ((i15 & 1171) != 1170) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C1905p(4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(5);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C2012k(0);
                            c28655q.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (viewState instanceof AbstractC39758e.c) {
                        c28655q.m87150e0(-1410221402);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.h) {
                        c28655q.m87150e0(-1410214948);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.g) {
                        c28655q.m87150e0(-766814098);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        if (((AbstractC39758e.g) viewState).getExit()) {
                            c28655q.m87150e0(-766649643);
                            Boolean bool5 = Boolean.TRUE;
                            if ((i15 & 7168) != 2048) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R5 = c28655q.m87133R();
                            if (z4) {
                                objM87133R5 = new a(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new a(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool5);
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            c28655q.m87150e0(-766511693);
                            Boolean bool6 = Boolean.TRUE;
                            if ((i15 & 896) != 256) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R4 = c28655q.m87133R();
                            if (z4) {
                                objM87133R4 = new b(function8, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(function8, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z17);
                    } else if (viewState instanceof AbstractC39758e.e) {
                        c28655q.m87150e0(-1410192386);
                        AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.d) {
                        c28655q.m87150e0(-766108662);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        if (((AbstractC39758e.d) viewState).getExit()) {
                            c28655q.m87150e0(-765878859);
                            Boolean bool7 = Boolean.TRUE;
                            if ((i15 & 7168) != 2048) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R3 = c28655q.m87133R();
                            if (z4) {
                                objM87133R3 = new c(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new c(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool7);
                            z16 = false;
                            c28655q.m87173q(false);
                        } else {
                            z16 = false;
                            c28655q.m87150e0(-765740909);
                            Boolean bool8 = Boolean.TRUE;
                            if ((i15 & 896) != 256) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R2 = c28655q.m87133R();
                            if (z4) {
                                objM87133R2 = new d(function8, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new d(function8, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool8);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z16);
                    } else {
                        if (viewState instanceof AbstractC39758e.l) {
                        }
                        c28655q.m87150e0(-765161085);
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i15 & 896) == 256);
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = interfaceC4339a4;
                        function5 = function7;
                        function4 = function8;
                        m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                        c28655q.m87173q(false);
                    }
                    function5 = function7;
                    function4 = function8;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                }
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
                }
            }
            i15 |= 384;
            function4 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                z4 = true;
                if ((i15 & 1171) != 1170) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C1905p(4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(5);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C2012k(0);
                            c28655q.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (viewState instanceof AbstractC39758e.c) {
                        c28655q.m87150e0(-1410221402);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.h) {
                        c28655q.m87150e0(-1410214948);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.g) {
                        c28655q.m87150e0(-766814098);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        if (((AbstractC39758e.g) viewState).getExit()) {
                            c28655q.m87150e0(-766649643);
                            Boolean bool9 = Boolean.TRUE;
                            if ((i15 & 7168) != 2048) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R5 = c28655q.m87133R();
                            if (z4) {
                                objM87133R5 = new a(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new a(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool9);
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            c28655q.m87150e0(-766511693);
                            Boolean bool10 = Boolean.TRUE;
                            if ((i15 & 896) != 256) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R4 = c28655q.m87133R();
                            if (z4) {
                                objM87133R4 = new b(function8, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(function8, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool10);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z17);
                    } else if (viewState instanceof AbstractC39758e.e) {
                        c28655q.m87150e0(-1410192386);
                        AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.d) {
                        c28655q.m87150e0(-766108662);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        if (((AbstractC39758e.d) viewState).getExit()) {
                            c28655q.m87150e0(-765878859);
                            Boolean bool11 = Boolean.TRUE;
                            if ((i15 & 7168) != 2048) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R3 = c28655q.m87133R();
                            if (z4) {
                                objM87133R3 = new c(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new c(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool11);
                            z16 = false;
                            c28655q.m87173q(false);
                        } else {
                            z16 = false;
                            c28655q.m87150e0(-765740909);
                            Boolean bool12 = Boolean.TRUE;
                            if ((i15 & 896) != 256) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R2 = c28655q.m87133R();
                            if (z4) {
                                objM87133R2 = new d(function8, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new d(function8, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool12);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z16);
                    } else {
                        if (viewState instanceof AbstractC39758e.l) {
                        }
                        c28655q.m87150e0(-765161085);
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i15 & 896) == 256);
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = interfaceC4339a4;
                        function5 = function7;
                        function4 = function8;
                        m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                        c28655q.m87173q(false);
                    }
                    function5 = function7;
                    function4 = function8;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                }
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            z4 = true;
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C1905p(4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(5);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C2012k(0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState instanceof AbstractC39758e.c) {
                    c28655q.m87150e0(-1410221402);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.h) {
                    c28655q.m87150e0(-1410214948);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.g) {
                    c28655q.m87150e0(-766814098);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    if (((AbstractC39758e.g) viewState).getExit()) {
                        c28655q.m87150e0(-766649643);
                        Boolean bool13 = Boolean.TRUE;
                        if ((i15 & 7168) != 2048) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R5 = c28655q.m87133R();
                        if (z4) {
                            objM87133R5 = new a(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool13);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(-766511693);
                        Boolean bool14 = Boolean.TRUE;
                        if ((i15 & 896) != 256) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R4 = c28655q.m87133R();
                        if (z4) {
                            objM87133R4 = new b(function8, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(function8, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool14);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                } else if (viewState instanceof AbstractC39758e.e) {
                    c28655q.m87150e0(-1410192386);
                    AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.d) {
                    c28655q.m87150e0(-766108662);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    if (((AbstractC39758e.d) viewState).getExit()) {
                        c28655q.m87150e0(-765878859);
                        Boolean bool15 = Boolean.TRUE;
                        if ((i15 & 7168) != 2048) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R3 = c28655q.m87133R();
                        if (z4) {
                            objM87133R3 = new c(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new c(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool15);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        z16 = false;
                        c28655q.m87150e0(-765740909);
                        Boolean bool16 = Boolean.TRUE;
                        if ((i15 & 896) != 256) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R2 = c28655q.m87133R();
                        if (z4) {
                            objM87133R2 = new d(function8, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new d(function8, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool16);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z16);
                } else {
                    if (viewState instanceof AbstractC39758e.l) {
                    }
                    c28655q.m87150e0(-765161085);
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = interfaceC4339a4;
                    function5 = function7;
                    function4 = function8;
                    m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                    c28655q.m87173q(false);
                }
                function5 = function7;
                function4 = function8;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                function5 = function3;
            }
            function6 = function4;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i19 = 2048;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                z4 = true;
                if ((i15 & 1171) != 1170) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C1905p(4);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C1905p(5);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C2012k(0);
                            c28655q.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (viewState instanceof AbstractC39758e.c) {
                        c28655q.m87150e0(-1410221402);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.h) {
                        c28655q.m87150e0(-1410214948);
                        AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.g) {
                        c28655q.m87150e0(-766814098);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        if (((AbstractC39758e.g) viewState).getExit()) {
                            c28655q.m87150e0(-766649643);
                            Boolean bool17 = Boolean.TRUE;
                            if ((i15 & 7168) != 2048) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R5 = c28655q.m87133R();
                            if (z4) {
                                objM87133R5 = new a(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                objM87133R5 = new a(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool17);
                            z17 = false;
                            c28655q.m87173q(false);
                        } else {
                            z17 = false;
                            c28655q.m87150e0(-766511693);
                            Boolean bool18 = Boolean.TRUE;
                            if ((i15 & 896) != 256) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R4 = c28655q.m87133R();
                            if (z4) {
                                objM87133R4 = new b(function8, null);
                                c28655q.m87172p0(objM87133R4);
                            } else {
                                objM87133R4 = new b(function8, null);
                                c28655q.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool18);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z17);
                    } else if (viewState instanceof AbstractC39758e.e) {
                        c28655q.m87150e0(-1410192386);
                        AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else if (viewState instanceof AbstractC39758e.d) {
                        c28655q.m87150e0(-766108662);
                        AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                        if (((AbstractC39758e.d) viewState).getExit()) {
                            c28655q.m87150e0(-765878859);
                            Boolean bool19 = Boolean.TRUE;
                            if ((i15 & 7168) != 2048) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R3 = c28655q.m87133R();
                            if (z4) {
                                objM87133R3 = new c(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new c(interfaceC4339a4, null);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool19);
                            z16 = false;
                            c28655q.m87173q(false);
                        } else {
                            z16 = false;
                            c28655q.m87150e0(-765740909);
                            Boolean bool110 = Boolean.TRUE;
                            if ((i15 & 896) != 256) {
                                c28655q = c28655q;
                                z4 = false;
                            }
                            c28655q = c28655q;
                            objM87133R2 = c28655q.m87133R();
                            if (z4) {
                                objM87133R2 = new d(function8, null);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new d(function8, null);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool110);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z16);
                    } else {
                        if (viewState instanceof AbstractC39758e.l) {
                        }
                        c28655q.m87150e0(-765161085);
                        if ((i15 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z14 | ((i15 & 896) == 256);
                        objM87133R = c28655q.m87133R();
                        if (z15) {
                            objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a2 = interfaceC4339a4;
                        function5 = function7;
                        function4 = function8;
                        m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                        c28655q.m87173q(false);
                    }
                    function5 = function7;
                    function4 = function8;
                    interfaceC4339a2 = interfaceC4339a4;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                }
                function6 = function4;
                interfaceC4339a3 = interfaceC4339a2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            z4 = true;
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C1905p(4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(5);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C2012k(0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState instanceof AbstractC39758e.c) {
                    c28655q.m87150e0(-1410221402);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.h) {
                    c28655q.m87150e0(-1410214948);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.g) {
                    c28655q.m87150e0(-766814098);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    if (((AbstractC39758e.g) viewState).getExit()) {
                        c28655q.m87150e0(-766649643);
                        Boolean bool111 = Boolean.TRUE;
                        if ((i15 & 7168) != 2048) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R5 = c28655q.m87133R();
                        if (z4) {
                            objM87133R5 = new a(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool111);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(-766511693);
                        Boolean bool112 = Boolean.TRUE;
                        if ((i15 & 896) != 256) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R4 = c28655q.m87133R();
                        if (z4) {
                            objM87133R4 = new b(function8, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(function8, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                } else if (viewState instanceof AbstractC39758e.e) {
                    c28655q.m87150e0(-1410192386);
                    AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.d) {
                    c28655q.m87150e0(-766108662);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    if (((AbstractC39758e.d) viewState).getExit()) {
                        c28655q.m87150e0(-765878859);
                        Boolean bool113 = Boolean.TRUE;
                        if ((i15 & 7168) != 2048) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R3 = c28655q.m87133R();
                        if (z4) {
                            objM87133R3 = new c(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new c(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool113);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        z16 = false;
                        c28655q.m87150e0(-765740909);
                        Boolean bool114 = Boolean.TRUE;
                        if ((i15 & 896) != 256) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R2 = c28655q.m87133R();
                        if (z4) {
                            objM87133R2 = new d(function8, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new d(function8, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool114);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z16);
                } else {
                    if (viewState instanceof AbstractC39758e.l) {
                    }
                    c28655q.m87150e0(-765161085);
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = interfaceC4339a4;
                    function5 = function7;
                    function4 = function8;
                    m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                    c28655q.m87173q(false);
                }
                function5 = function7;
                function4 = function8;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                function5 = function3;
            }
            function6 = function4;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
            }
        }
        i15 |= 384;
        function4 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i19 = 2048;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            z4 = true;
            if ((i15 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C1905p(4);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(5);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C2012k(0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState instanceof AbstractC39758e.c) {
                    c28655q.m87150e0(-1410221402);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.h) {
                    c28655q.m87150e0(-1410214948);
                    AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.g) {
                    c28655q.m87150e0(-766814098);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    if (((AbstractC39758e.g) viewState).getExit()) {
                        c28655q.m87150e0(-766649643);
                        Boolean bool115 = Boolean.TRUE;
                        if ((i15 & 7168) != 2048) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R5 = c28655q.m87133R();
                        if (z4) {
                            objM87133R5 = new a(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new a(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool115);
                        z17 = false;
                        c28655q.m87173q(false);
                    } else {
                        z17 = false;
                        c28655q.m87150e0(-766511693);
                        Boolean bool116 = Boolean.TRUE;
                        if ((i15 & 896) != 256) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R4 = c28655q.m87133R();
                        if (z4) {
                            objM87133R4 = new b(function8, null);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new b(function8, null);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool116);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z17);
                } else if (viewState instanceof AbstractC39758e.e) {
                    c28655q.m87150e0(-1410192386);
                    AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC39758e.d) {
                    c28655q.m87150e0(-766108662);
                    AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                    if (((AbstractC39758e.d) viewState).getExit()) {
                        c28655q.m87150e0(-765878859);
                        Boolean bool117 = Boolean.TRUE;
                        if ((i15 & 7168) != 2048) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R3 = c28655q.m87133R();
                        if (z4) {
                            objM87133R3 = new c(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new c(interfaceC4339a4, null);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool117);
                        z16 = false;
                        c28655q.m87173q(false);
                    } else {
                        z16 = false;
                        c28655q.m87150e0(-765740909);
                        Boolean bool118 = Boolean.TRUE;
                        if ((i15 & 896) != 256) {
                            c28655q = c28655q;
                            z4 = false;
                        }
                        c28655q = c28655q;
                        objM87133R2 = c28655q.m87133R();
                        if (z4) {
                            objM87133R2 = new d(function8, null);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new d(function8, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool118);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z16);
                } else {
                    if (viewState instanceof AbstractC39758e.l) {
                    }
                    c28655q.m87150e0(-765161085);
                    if ((i15 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z14 | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (z15) {
                        objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a2 = interfaceC4339a4;
                    function5 = function7;
                    function4 = function8;
                    m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                    c28655q.m87173q(false);
                }
                function5 = function7;
                function4 = function8;
                interfaceC4339a2 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                function5 = function3;
            }
            function6 = function4;
            interfaceC4339a3 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        z4 = true;
        if ((i15 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C1905p(4);
                    c28655q.m87172p0(objM87133R8);
                }
                function7 = (Function1) objM87133R8;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C1905p(5);
                    c28655q.m87172p0(objM87133R7);
                }
                function8 = (Function1) objM87133R7;
            } else {
                function8 = function4;
            }
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C2012k(0);
                    c28655q.m87172p0(objM87133R6);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (viewState instanceof AbstractC39758e.c) {
                c28655q.m87150e0(-1410221402);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89942n)), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC39758e.h) {
                c28655q.m87150e0(-1410214948);
                AbstractC33199m0.m105214F(AbstractC33208p0.f.f138478e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.f.f138479f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC39758e.g) {
                c28655q.m87150e0(-766814098);
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, null, 7, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                if (((AbstractC39758e.g) viewState).getExit()) {
                    c28655q.m87150e0(-766649643);
                    Boolean bool119 = Boolean.TRUE;
                    if ((i15 & 7168) != 2048) {
                        c28655q = c28655q;
                        z4 = false;
                    }
                    c28655q = c28655q;
                    objM87133R5 = c28655q.m87133R();
                    if (z4) {
                        objM87133R5 = new a(interfaceC4339a4, null);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new a(interfaceC4339a4, null);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, bool119);
                    z17 = false;
                    c28655q.m87173q(false);
                } else {
                    z17 = false;
                    c28655q.m87150e0(-766511693);
                    Boolean bool1110 = Boolean.TRUE;
                    if ((i15 & 896) != 256) {
                        c28655q = c28655q;
                        z4 = false;
                    }
                    c28655q = c28655q;
                    objM87133R4 = c28655q.m87133R();
                    if (z4) {
                        objM87133R4 = new b(function8, null);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(function8, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, bool1110);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z17);
            } else if (viewState instanceof AbstractC39758e.e) {
                c28655q.m87150e0(-1410192386);
                AbstractC33199m0.m105214F(AbstractC33208p0.a.f138465e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.a.f138466f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC39758e.d) {
                c28655q.m87150e0(-766108662);
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89931c)), 0L, null, 6, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                if (((AbstractC39758e.d) viewState).getExit()) {
                    c28655q.m87150e0(-765878859);
                    Boolean bool1111 = Boolean.TRUE;
                    if ((i15 & 7168) != 2048) {
                        c28655q = c28655q;
                        z4 = false;
                    }
                    c28655q = c28655q;
                    objM87133R3 = c28655q.m87133R();
                    if (z4) {
                        objM87133R3 = new c(interfaceC4339a4, null);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new c(interfaceC4339a4, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool1111);
                    z16 = false;
                    c28655q.m87173q(false);
                } else {
                    z16 = false;
                    c28655q.m87150e0(-765740909);
                    Boolean bool1112 = Boolean.TRUE;
                    if ((i15 & 896) != 256) {
                        c28655q = c28655q;
                        z4 = false;
                    }
                    c28655q = c28655q;
                    objM87133R2 = c28655q.m87133R();
                    if (z4) {
                        objM87133R2 = new d(function8, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new d(function8, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, bool1112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z16);
            } else {
                if (viewState instanceof AbstractC39758e.l) {
                }
                c28655q.m87150e0(-765161085);
                if ((i15 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (z15) {
                    objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2014l(interfaceC4339a4, function8, 0);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a2 = interfaceC4339a4;
                function5 = function7;
                function4 = function8;
                m6225L(viewState, null, function5, (Function1) objM87133R, c28655q, ((i15 << 3) & 896) | (i15 & 14), 2);
                c28655q.m87173q(false);
            }
            function5 = function7;
            function4 = function8;
            interfaceC4339a2 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            function5 = function3;
        }
        function6 = function4;
        interfaceC4339a3 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) function5, (Object) function6, (Object) interfaceC4339a3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m6263l0(AbstractC24716a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m6265m0(AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m6267n0(Function1 function1, AbstractC39758e abstractC39758e) {
        AbstractC39758e.a aVar = (AbstractC39758e.a) abstractC39758e;
        function1.invoke(new AbstractC37617i.c(aVar.getId(), aVar.getTargetGoalType(), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m6269o0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m6271p0(Function1 function1, AbstractC39758e abstractC39758e) {
        function1.invoke(new AbstractC37617i.a(((AbstractC39758e.a) abstractC39758e).getCurPage() == 0, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m6273q0(Function1 function1, AbstractC39758e abstractC39758e) {
        Object hVar;
        AbstractC39758e.f fVar = (AbstractC39758e.f) abstractC39758e;
        ConfirmTarget confirmTargetM127185a = fVar.getConfirmTarget();
        if (confirmTargetM127185a instanceof ConfirmTarget.ConfirmMetricTarget) {
            hVar = new AbstractC37617i.i(fVar.getId(), ((ConfirmTarget.ConfirmMetricTarget) fVar.getConfirmTarget()).getType(), ((ConfirmTarget.ConfirmMetricTarget) fVar.getConfirmTarget()).getTarget(), false, null, 24, null);
        } else if (confirmTargetM127185a instanceof ConfirmTarget.ConfirmActivityTarget) {
            hVar = new AbstractC37617i.f(fVar.getId(), TargetGoalType.ACTIVITIES, ((ConfirmTarget.ConfirmActivityTarget) fVar.getConfirmTarget()).getActivityGoals(), null, 8, null);
        } else {
            if (!(confirmTargetM127185a instanceof ConfirmTarget.ConfirmBehaviorTarget)) {
                throw new p715kotlin.NoWhenBranchMatchedException();
            }
            hVar = new AbstractC37617i.h(fVar.getId(), TargetGoalType.BEHAVIORS, ((ConfirmTarget.ConfirmBehaviorTarget) fVar.getConfirmTarget()).getBehaviorGoals(), null, 8, null);
        }
        function1.invoke(hVar);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m6275r0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m6277s0(Function1 function1, AbstractC39758e abstractC39758e) {
        function1.invoke(new AbstractC37617i.a(((AbstractC39758e.f) abstractC39758e).getCurPage() == 0, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m6279t0(AbstractC39758e abstractC39758e, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m6261k0(abstractC39758e, function1, function2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m6281u0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m6283v0(InterfaceC4339a interfaceC4339a, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC37617i) {
            if (((it instanceof AbstractC37617i.j) && ((AbstractC37617i.j) it).getExit()) || ((it instanceof AbstractC37617i.a) && ((AbstractC37617i.a) it).getExit())) {
                interfaceC4339a.invoke();
            } else {
                function1.invoke(it);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m6285w0(Function1 function1, AbstractC39758e abstractC39758e) {
        function1.invoke(new AbstractC37617i.d(((AbstractC39758e.b) abstractC39758e).m127183a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m6287x0(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }
}
