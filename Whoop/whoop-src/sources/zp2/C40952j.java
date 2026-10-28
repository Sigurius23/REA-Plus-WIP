package zp2;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.user.journey.sources.data.UserJourneyApi;
import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.List;
import kz0.C22920a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zp2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00152\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&¨\u0006'"}, m65681d2 = {"Lzp2/j;", "", "Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "userJourneyApi", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/user/journey/sources/data/UserJourneyApi;Lbc3/c0;Ltr2/n;)V", "Lzp2/k;", "prevState", "", "changeValue", "year", "f", "(Lzp2/k;II)Lzp2/k;", "", "Lkz0/a;", "sections", "stepIndex", "Ll83/k;", "c", "(Ljava/util/List;I)Ll83/k;", "Ll83/a0;", "g", "(I)V", "", "e", "(Lzp2/k;)Z", "Lzp2/h;", "action", "d", "(Lzp2/h;)Lzp2/k;", "a", "Lcom/whoop/user/journey/sources/data/UserJourneyApi;", "b", "Lbc3/c0;", "Ltr2/n;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40952j {

    /* JADX INFO: renamed from: e */
    public static final int f176719e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyApi userJourneyApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: zp2.j$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176723a;

        static {
            int[] iArr = new int[EnumC40951i.values().length];
            try {
                iArr[EnumC40951i.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC40951i.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f176723a = iArr;
        }
    }

    /* JADX INFO: renamed from: zp2.j$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyProgressInteractor$sendUserJourneySeen$1", m100430f = "UserJourneyProgressInteractor.kt", m100431l = {77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f176724w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f176726y;

        /* JADX INFO: renamed from: zp2.j$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyProgressInteractor$sendUserJourneySeen$1$1", m100430f = "UserJourneyProgressInteractor.kt", m100431l = {79, 81}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f176727w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ int f176728x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C40952j f176729y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i13, C40952j c40952j, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f176728x = i13;
                this.f176729y = c40952j;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f176728x, this.f176729y, interfaceC30057d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
            
                if (r5 == r0) goto L19;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f176727w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L47
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L18:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L33
                L1c:
                    p505ts.AbstractC34132o.m107864I(r5)
                    int r5 = r4.f176728x
                    r1 = -1
                    if (r5 != r1) goto L36
                    zp2.j r5 = r4.f176729y
                    com.whoop.user.journey.sources.data.UserJourneyApi r5 = zp2.C40952j.m132890b(r5)
                    r4.f176727w = r3
                    java.lang.Object r5 = r5.sendWirSeen(r4)
                    if (r5 != r0) goto L33
                    goto L46
                L33:
                    pg3.v0 r5 = (pg3.C29218v0) r5
                    return r5
                L36:
                    zp2.j r5 = r4.f176729y
                    com.whoop.user.journey.sources.data.UserJourneyApi r5 = zp2.C40952j.m132890b(r5)
                    int r1 = r4.f176728x
                    r4.f176727w = r2
                    java.lang.Object r5 = r5.sendYirSeen(r1, r4)
                    if (r5 != r0) goto L47
                L46:
                    return r0
                L47:
                    pg3.v0 r5 = (pg3.C29218v0) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: zp2.C40952j.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f176726y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C40952j.this.new c(this.f176726y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f176724w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C40952j.this.logger;
                a aVar = new a(this.f176726y, C40952j.this, null);
                this.f176724w = 1;
                if (InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to send User Journey seen event", aVar, this, 2, null) == enumC31071a) {
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

    public C40952j(UserJourneyApi userJourneyApi, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userJourneyApi, "userJourneyApi");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.userJourneyApi = userJourneyApi;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final C23465k m132891c(List<C22920a> sections, int stepIndex) {
        int i13 = 0;
        if (sections.isEmpty()) {
            return new C23465k(0, 0);
        }
        int totalSteps = 0;
        for (C22920a c22920a : sections) {
            int i14 = i13 + 1;
            if (stepIndex < c22920a.getTotalSteps() + totalSteps) {
                return new C23465k(Integer.valueOf(i13), Integer.valueOf(stepIndex - totalSteps));
            }
            totalSteps += c22920a.getTotalSteps();
            i13 = i14;
        }
        return new C23465k(Integer.valueOf(sections.size() - 1), Integer.valueOf(((C22920a) AbstractC25265s.m74112P0(sections)).getTotalSteps() - 1));
    }

    /* JADX INFO: renamed from: e */
    private final boolean m132892e(C40953k c40953k) {
        return c40953k.getCurrentStepIndex() == c40953k.getStepTotal() - 1;
    }

    /* JADX INFO: renamed from: f */
    private final C40953k m132893f(C40953k prevState, int changeValue, int year) {
        int iM36284n = AbstractC12889b.m36284n(prevState.getCurrentStepIndex() + changeValue, 0, prevState.getStepTotal() - 1);
        C40943a sectionProgress = prevState.getSectionProgress();
        C40943a c40943aM132857a = null;
        if (sectionProgress != null) {
            C23465k c23465kM132891c = m132891c(sectionProgress.m132859c(), iM36284n);
            int iIntValue = ((Number) c23465kM132891c.f92937w).intValue();
            int iIntValue2 = ((Number) c23465kM132891c.f92938x).intValue();
            List<C22920a> listM132859c = sectionProgress.m132859c();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM132859c, 10));
            int i13 = 0;
            for (Object obj : listM132859c) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C22920a c22920aM66640b = (C22920a) obj;
                if (i13 < iIntValue) {
                    c22920aM66640b = C22920a.m66640b(c22920aM66640b, 0, c22920aM66640b.getTotalSteps(), 1, null);
                } else if (i13 == iIntValue) {
                    c22920aM66640b = C22920a.m66640b(c22920aM66640b, 0, iIntValue2, 1, null);
                }
                arrayList.add(c22920aM66640b);
                i13 = i14;
            }
            c40943aM132857a = sectionProgress.m132857a(arrayList, iIntValue, iIntValue2);
        }
        C40953k c40953k = new C40953k(iM36284n, prevState.getStepTotal(), c40943aM132857a);
        if (m132892e(c40953k)) {
            m132894g(year);
        }
        return c40953k;
    }

    /* JADX INFO: renamed from: g */
    private final void m132894g(int year) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(year, null), 3);
    }

    /* JADX INFO: renamed from: d */
    public final C40953k m132895d(C40950h action) {
        AbstractC22676k.m65750j(action, "action");
        int i13 = b.f176723a[action.getType().ordinal()];
        if (i13 == 1) {
            return m132893f(action.getCurrentState(), 1, action.getYear());
        }
        if (i13 == 2) {
            return m132893f(action.getCurrentState(), -1, action.getYear());
        }
        throw new NoWhenBranchMatchedException();
    }
}
