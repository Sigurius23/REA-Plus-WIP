package tl1;

import androidx.core.app.NotificationCompat;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.home.domain.HomeApi;
import com.whoop.home.domain.dayOneTransition.TransitionOverlayCompleteBody;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import gl1.C15967b;
import il1.AbstractC18626c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;

/* JADX INFO: renamed from: tl1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Ltl1/c;", "Lod1/g;", "Lil1/c;", "Ltl1/a;", "Lu92/d;", "prefsStore", "Lcom/whoop/home/domain/HomeApi;", "homeApi", "Ltr2/n;", "logger", "Lgl1/b;", "homeAnalyticsHelper", "<init>", "(Lu92/d;Lcom/whoop/home/domain/HomeApi;Ltr2/n;Lgl1/b;)V", "", "featureId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ltl1/a;ILq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lu92/d;", "b", "Lcom/whoop/home/domain/HomeApi;", "c", "Ltr2/n;", "d", "Lgl1/b;", "e", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33919c implements InterfaceC27844g<AbstractC18626c, C33917a> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f142107f = 8;

    /* JADX INFO: renamed from: g */
    private static final InterfaceC13075p1 f142108g;

    /* JADX INFO: renamed from: h */
    private static final InterfaceC13037f2 f142109h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final HomeApi homeApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C15967b homeAnalyticsHelper;

    /* JADX INFO: renamed from: tl1.c$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Ltl1/c$a;", "", "<init>", "()V", "Ltl1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Ltl1/b;)V", "Lec3/f2;", "dayOneTransitionFlow", "Lec3/f2;", "a", "()Lec3/f2;", "Lec3/p1;", "_dayOneTransitionState", "Lec3/p1;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC13037f2 m107296a() {
            return C33919c.f142109h;
        }

        /* JADX INFO: renamed from: b */
        public final void m107297b(AbstractC33918b event) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC33918b.c cVar = AbstractC33918b.c.f142104a;
            if (event.equals(cVar)) {
                ((C13045h2) C33919c.f142108g).m36570j(cVar);
                return;
            }
            AbstractC33918b.d dVar = AbstractC33918b.d.f142105a;
            if (event.equals(dVar)) {
                ((C13045h2) C33919c.f142108g).m36570j(dVar);
                return;
            }
            AbstractC33918b.b bVar = AbstractC33918b.b.f142103a;
            if (event.equals(bVar)) {
                ((C13045h2) C33919c.f142108g).m36570j(bVar);
                return;
            }
            AbstractC33918b.a aVar = AbstractC33918b.a.f142102a;
            if (!event.equals(aVar)) {
                throw new NoWhenBranchMatchedException();
            }
            ((C13045h2) C33919c.f142108g).m36570j(aVar);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: tl1.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dayOneTransition.DayOneTransitionInteractor$interact$1", m100430f = "DayOneTransitionInteractor.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ltl1/a;", "currentState", "Lil1/c;", "currentAction", "<anonymous>", "(Ltl1/a;Lil1/c;)Ltl1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f142114w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f142115x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f142116y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C33917a c33917a, AbstractC18626c abstractC18626c, InterfaceC30057d<? super C33917a> interfaceC30057d) {
            b bVar = C33919c.this.new b(interfaceC30057d);
            bVar.f142115x = c33917a;
            bVar.f142116y = abstractC18626c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C33917a c33917a = (C33917a) this.f142115x;
            AbstractC18626c abstractC18626c = (AbstractC18626c) this.f142116y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f142114w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (abstractC18626c instanceof AbstractC18626c.c) {
                    return C33917a.m107287b(c33917a, ((AbstractC18626c.c) abstractC18626c).getShow(), false, 2, null);
                }
                if (!(abstractC18626c instanceof AbstractC18626c.b)) {
                    if (!(abstractC18626c instanceof AbstractC18626c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (AbstractC22676k.m65745e(((AbstractC18626c.a) abstractC18626c).m53905a(), "WHOOP_COACH_ONBOARDING")) {
                        C33919c.this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_COMPLETED, true);
                    }
                    return c33917a;
                }
                C33919c c33919c = C33919c.this;
                int featureId = ((AbstractC18626c.b) abstractC18626c).getFeatureId();
                this.f142115x = null;
                this.f142116y = null;
                this.f142114w = 1;
                obj = c33919c.m107295h(c33917a, featureId, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return (C33917a) obj;
        }
    }

    /* JADX INFO: renamed from: tl1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dayOneTransition.DayOneTransitionInteractor", m100430f = "DayOneTransitionInteractor.kt", m100431l = {68}, m100432m = "postAnimationComplete", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f142118E;

        /* JADX INFO: renamed from: w */
        Object f142119w;

        /* JADX INFO: renamed from: x */
        int f142120x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f142121y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f142121y = obj;
            this.f142118E |= Integer.MIN_VALUE;
            return C33919c.this.m107295h(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: tl1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.dayOneTransition.DayOneTransitionInteractor$postAnimationComplete$2", m100430f = "DayOneTransitionInteractor.kt", m100431l = {69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f142123w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f142125y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f142125y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C33919c.this.new d(this.f142125y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f142123w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeApi homeApi = C33919c.this.homeApi;
            TransitionOverlayCompleteBody transitionOverlayCompleteBody = new TransitionOverlayCompleteBody(this.f142125y, true);
            this.f142123w = 1;
            Object objCompleteFeatureEducation = homeApi.completeFeatureEducation(transitionOverlayCompleteBody, this);
            return objCompleteFeatureEducation == enumC31071a ? enumC31071a : objCompleteFeatureEducation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    static {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        f142108g = c13045h2M36593c;
        f142109h = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    public C33919c(C34660d prefsStore, HomeApi homeApi, InterfaceC34116n logger, C15967b homeAnalyticsHelper) {
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(homeApi, "homeApi");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(homeAnalyticsHelper, "homeAnalyticsHelper");
        this.prefsStore = prefsStore;
        this.homeApi = homeApi;
        this.logger = logger;
        this.homeAnalyticsHelper = homeAnalyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: h */
    public final Object m107295h(C33917a c33917a, int i13, InterfaceC30057d<? super C33917a> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f142118E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f142118E = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f142121y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = cVar2.f142118E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            this.prefsStore.m109538q(SharedPreferenceConstants.HAS_SEEN_TRANSITION_OVERLAY, true);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(i13, null);
            cVar2.f142119w = c33917a;
            cVar2.f142120x = i13;
            cVar2.f142118E = 1;
            if (InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to POST transition overlay complete", dVar, cVar2, 2, null) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33917a = (C33917a) cVar2.f142119w;
            AbstractC34132o.m107864I(obj);
        }
        this.homeAnalyticsHelper.m45059K();
        return C33917a.m107287b(c33917a, false, true, 1, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C33917a(false, false, 3, null), upstream, new b(null));
    }
}
