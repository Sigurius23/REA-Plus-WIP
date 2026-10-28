package op0;

import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto;
import hj0.AbstractC17356o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.C28180m;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import z82.C40191e;

/* JADX INFO: renamed from: op0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u00013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u0013J%\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010)\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0*8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b,\u0010-R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020/0*8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b0\u0010-¨\u00064"}, m65681d2 = {"Lop0/e;", "Lhj0/o;", "Lop0/d;", "sleepCoachOnBoardingRepository", "Lz82/e;", "eventDispatcher", "Lbc3/c0;", "coroutineScope", "<init>", "(Lop0/d;Lz82/e;Lbc3/c0;)V", "Lop0/a;", "sleepNeedTip", "Ll83/a0;", "D", "(Lop0/a;)V", "", "E", "()Z", "z", "()V", "F", "", "screenPosition", "", "title", "objectAction", "I", "(ILjava/lang/String;Ljava/lang/String;)V", "G", "position", "label", "H", "Lop0/d;", "C", "()Lop0/d;", "Lz82/e;", "getEventDispatcher", "()Lz82/e;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/u0;", "Landroidx/lifecycle/u0;", "A", "()Landroidx/lifecycle/u0;", "onboardingStateLiveData", "Lop0/h;", "B", "sleepAdviceOnBoardingLiveData", "J", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28087e extends AbstractC17356o {

    /* JADX INFO: renamed from: K */
    public static final int f113599K = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C28086d sleepCoachOnBoardingRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C1630u0 onboardingStateLiveData;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C1630u0 sleepAdviceOnBoardingLiveData;

    /* JADX INFO: renamed from: op0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingToolTipViewModel$fetchSleepCoachOnboardingState$1", m100430f = "SleepCoachOnBoardingToolTipViewModel.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113605w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28087e.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113605w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28086d sleepCoachOnBoardingRepository = C28087e.this.getSleepCoachOnBoardingRepository();
                this.f113605w = 1;
                obj = sleepCoachOnBoardingRepository.m84856g(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            String str = (String) obj;
            C28087e.this.m49136n().mo85228t(AbstractC11266d.m30461o("got the sleepCoachOnboardingResponse: ", str), new AbstractC30556a.a[0]);
            if (AbstractC22676k.m65745e(str, "SLEEP_COACH")) {
                C28087e c28087e = C28087e.this;
                c28087e.m49138t(c28087e.getSleepAdviceOnBoardingLiveData(), C28088f.f113609b);
            } else if (AbstractC22676k.m65745e(str, "COMPLETE")) {
                C28087e c28087e2 = C28087e.this;
                c28087e2.m49138t(c28087e2.getSleepAdviceOnBoardingLiveData(), C28089g.f113610b);
            } else {
                C28087e c28087e3 = C28087e.this;
                c28087e3.m49138t(c28087e3.getSleepAdviceOnBoardingLiveData(), C28084b.f113572b);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: op0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingToolTipViewModel$postSleepCoachOnboradingCompleteStatus$1", m100430f = "SleepCoachOnBoardingToolTipViewModel.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f113607w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28087e.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113607w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28086d sleepCoachOnBoardingRepository = C28087e.this.getSleepCoachOnBoardingRepository();
                SleepCoachOnBoardingRequestDto sleepCoachOnBoardingRequestDto = new SleepCoachOnBoardingRequestDto("SLEEP_COACH", "COMPLETE");
                this.f113607w = 1;
                if (sleepCoachOnBoardingRepository.m84858j(sleepCoachOnBoardingRequestDto, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C28087e c28087e = C28087e.this;
            c28087e.m49138t(c28087e.getSleepAdviceOnBoardingLiveData(), C28089g.f113610b);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28087e(C28086d sleepCoachOnBoardingRepository, C40191e eventDispatcher, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(sleepCoachOnBoardingRepository, "sleepCoachOnBoardingRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.sleepCoachOnBoardingRepository = sleepCoachOnBoardingRepository;
        this.eventDispatcher = eventDispatcher;
        this.logTag = "SleepCoachOnBoardingToolTipViewModel";
        this.onboardingStateLiveData = new C1630u0();
        this.sleepAdviceOnBoardingLiveData = new C1630u0();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final C1630u0 getOnboardingStateLiveData() {
        return this.onboardingStateLiveData;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final C1630u0 getSleepAdviceOnBoardingLiveData() {
        return this.sleepAdviceOnBoardingLiveData;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final C28086d getSleepCoachOnBoardingRepository() {
        return this.sleepCoachOnBoardingRepository;
    }

    /* JADX INFO: renamed from: D */
    public final void m84865D(EnumC28083a sleepNeedTip) {
        AbstractC22676k.m65750j(sleepNeedTip, "sleepNeedTip");
        m49138t(this.onboardingStateLiveData, sleepNeedTip);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m84866E() {
        return this.onboardingStateLiveData.getValue() == null || this.onboardingStateLiveData.getValue() == EnumC28083a.END_ON_BOARDING;
    }

    /* JADX INFO: renamed from: F */
    public final void m84867F() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: G */
    public final void m84868G() {
        this.eventDispatcher.m129043l0("Close", "Sleep Coach - Close Onboarding", "X", AbstractC31061c.m95645u("object", "Onboarding"));
    }

    /* JADX INFO: renamed from: H */
    public final void m84869H(int position, String label, String objectAction) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(objectAction, "objectAction");
        this.eventDispatcher.m129043l0("Press", "Sleep Coach - Press ".concat(objectAction), label, AbstractC25247g0.m73990Y(new C23465k("object", objectAction), new C23465k("step", Integer.valueOf(position))));
    }

    /* JADX INFO: renamed from: I */
    public final void m84870I(int screenPosition, String title, String objectAction) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(objectAction, "objectAction");
        this.eventDispatcher.m129043l0("View", "Sleep Coach - View ".concat(objectAction), "", AbstractC25247g0.m73990Y(new C23465k("object", objectAction), new C23465k("step", Integer.valueOf(screenPosition)), new C23465k("title", title)));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: z */
    public final void m84871z() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    public /* synthetic */ C28087e(C28086d c28086d, C40191e c40191e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28086d, c40191e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
