package jk1;

import c11.C3849p;
import c41.C4092p2;
import c51.C4242s;
import c51.EnumC4225b0;
import c51.EnumC4239p;
import c81.C4307g;
import c93.InterfaceC4351m;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.PaceOfAgingMeterModel;
import com.whoop.design.models.items.amoeba.AmoebaDomainResult;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoebaStyleValues;
import com.whoop.design.models.items.amoeba.reducers.AmoebaViewStateReducer;
import com.whoop.healthspan.domain.HealthspanDomainResult;
import com.whoop.healthspan.domain.models.AmoebaOnboardingStep;
import com.whoop.healthspan.domain.models.FeaturedHighlight;
import com.whoop.healthspan.domain.models.LockedContent;
import com.whoop.healthspan.domain.models.LockedContentButtonStyle;
import com.whoop.healthspan.domain.models.LockedContentViewState;
import com.whoop.healthspan.domain.models.MetaData;
import com.whoop.healthspan.domain.models.UnlockedContentResponse;
import d11.C11467b;
import d11.C11474i;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import fk1.C14553a;
import gb1.AbstractC15673b0;
import ik1.AbstractC18611h;
import ik1.C18604a;
import ik1.C18605b;
import ik1.C18606c;
import ik1.C18607d;
import ik1.C18608e;
import ik1.C18612i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import jb1.C21535a;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import nk1.C26798d;
import no.nordicsemi.android.dfu.DfuBaseService;
import ok1.C27994a;
import or2.AbstractC28145a1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23692p3;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r21.C30885c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jk1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001BB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0016\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001f0(2\u0006\u0010&\u001a\u00020%2\u0006\u0010\t\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J+\u00104\u001a\u0002002\u0006\u0010\u000f\u001a\u0002002\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a01H\u0002¢\u0006\u0004\b4\u00105J+\u00107\u001a\u0002062\u0006\u0010\u000f\u001a\u0002062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a01H\u0002¢\u0006\u0004\b7\u00108J+\u0010:\u001a\u0002092\u0006\u0010\u000f\u001a\u0002092\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u001a01H\u0002¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\bA\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, m65681d2 = {"Ljk1/c;", "", "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;", "amoebaViewStateReducer", "Lfk1/a;", "drawerIdProvider", "<init>", "(Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;Lfk1/a;)V", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "domainResult", "Ljk1/d;", "accumulation", "p", "(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Ljk1/d;)Ljk1/d;", "Lik1/h$c;", "viewState", "i", "(Lik1/h$c;)Lik1/h$c;", "Lec3/m;", "Lik1/h;", "previousState", "Ll83/a0;", "k", "(Lec3/m;Lik1/h$c;Lq83/d;)Ljava/lang/Object;", "q", "(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;Lik1/h$c;)Lik1/h$c;", "", "hasNavigatedToOnboarding", "animatePaceOfAging", "s", "(Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;ZZ)Lik1/h$c;", "Lm91/u;", "item", "hasClosedCalibration", "hasClosedInfoCallout", "r", "(Lm91/u;ZZ)Z", "Lik1/d;", "content", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;", "", "l", "(Lik1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;)Ljava/util/List;", "Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;", "unlockedContent", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "n", "(Lcom/whoop/healthspan/domain/models/UnlockedContentResponse;)Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "Lok1/a;", "", "", "drawerExpandedStates", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lok1/a;Ljava/util/Map;)Lok1/a;", "Lik1/e;", "g", "(Lik1/e;Ljava/util/Map;)Lik1/e;", "Lnk1/d;", "f", "(Lnk1/d;Ljava/util/Map;)Lnk1/d;", "Lec3/l;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "upstream", "o", "(Lec3/l;)Lec3/l;", "j", "a", "Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;", "m", "()Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;", "b", "Lfk1/a;", "Ljb1/a;", "c", "Ljb1/a;", "designSystemReducer", "d", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21758c {

    /* JADX INFO: renamed from: e */
    public static final int f83678e = C21535a.f82608c | AmoebaViewStateReducer.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AmoebaViewStateReducer amoebaViewStateReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14553a drawerIdProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a designSystemReducer;

    /* JADX INFO: renamed from: jk1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.presentation.reducers.HealthspanViewStateReducer", m100430f = "HealthspanViewStateReducer.kt", m100431l = {187, 188}, m100432m = "emitUnanimatedStateForCache", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83682E;

        /* JADX INFO: renamed from: w */
        Object f83683w;

        /* JADX INFO: renamed from: x */
        Object f83684x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83685y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83685y = obj;
            this.f83682E |= Integer.MIN_VALUE;
            return C21758c.this.m61434k(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jk1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.presentation.reducers.HealthspanViewStateReducer$reduce$$inlined$transform$1", m100430f = "HealthspanViewStateReducer.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83687w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f83688x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f83689y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21758c f83690z;

        /* JADX INFO: renamed from: jk1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f83691w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21758c f83692x;

            /* JADX INFO: renamed from: jk1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthspan.presentation.reducers.HealthspanViewStateReducer$reduce$$inlined$transform$1$1", m100430f = "HealthspanViewStateReducer.kt", m100431l = {49, 56, 59, 62}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41850a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f83693E;

                /* JADX INFO: renamed from: F */
                Object f83694F;

                /* JADX INFO: renamed from: G */
                Object f83695G;

                /* JADX INFO: renamed from: H */
                Object f83696H;

                /* JADX INFO: renamed from: I */
                int f83697I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f83698w;

                /* JADX INFO: renamed from: x */
                int f83699x;

                /* JADX INFO: renamed from: z */
                Object f83701z;

                public C41850a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f83698w = obj;
                    this.f83699x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21758c c21758c) {
                this.f83692x = c21758c;
                this.f83691w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:45:0x0142  */
            /* JADX WARN: Code duplicated, block: B:48:0x0148  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x015e, code lost:
            
                if (r27.f83692x.m61434k(r7, (ik1.AbstractC18611h.c) r6, r2) == r3) goto L50;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r28, q83.InterfaceC30057d<? super l83.C23454a0> r29) {
                /*
                    Method dump skipped, instruction units count: 356
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: jk1.C21758c.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C21758c c21758c) {
            super(2, interfaceC30057d);
            this.f83689y = interfaceC13058l;
            this.f83690z = c21758c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f83689y, interfaceC30057d, this.f83690z);
            cVar.f83688x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83687w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f83688x;
                InterfaceC13058l interfaceC13058l = this.f83689y;
                a aVar = new a(interfaceC13062m, this.f83690z);
                this.f83688x = null;
                this.f83687w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jk1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.presentation.reducers.HealthspanViewStateReducer$reduce$1", m100430f = "HealthspanViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljk1/d;", "accumulation", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "domainResult", "<anonymous>", "(Ljk1/d;Lcom/whoop/healthspan/domain/HealthspanDomainResult;)Ljk1/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f83702w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83703x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83704y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C21759d c21759d, HealthspanDomainResult healthspanDomainResult, InterfaceC30057d<? super C21759d> interfaceC30057d) {
            d dVar = C21758c.this.new d(interfaceC30057d);
            dVar.f83703x = c21759d;
            dVar.f83704y = healthspanDomainResult;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C4242s amoeba;
            C4242s amoeba2;
            C18606c amoebaOnboarding;
            List<C18605b> listM53838e;
            C21759d c21759d = (C21759d) this.f83703x;
            HealthspanDomainResult healthspanDomainResult = (HealthspanDomainResult) this.f83704y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83702w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (healthspanDomainResult instanceof HealthspanDomainResult.Success) {
                return c21759d.getHealthspanViewState() instanceof AbstractC18611h.c ? new C21759d(C21758c.this.m61438q((HealthspanDomainResult.Success) healthspanDomainResult, (AbstractC18611h.c) c21759d.getHealthspanViewState()), c21759d.getHasNavigatedToOnboarding(), null, 4, null) : C21758c.this.m61437p((HealthspanDomainResult.Success) healthspanDomainResult, c21759d);
            }
            if (healthspanDomainResult instanceof HealthspanDomainResult.C8801c) {
                return new C21759d(AbstractC18611h.b.f72766b, c21759d.getHasNavigatedToOnboarding(), null, 4, null);
            }
            if (healthspanDomainResult instanceof HealthspanDomainResult.C8799a) {
                return new C21759d(AbstractC18611h.a.f72765b, c21759d.getHasNavigatedToOnboarding(), null, 4, null);
            }
            if (healthspanDomainResult instanceof HealthspanDomainResult.C8800b) {
                AbstractC18611h healthspanViewState = c21759d.getHealthspanViewState();
                return healthspanViewState instanceof AbstractC18611h.c ? new C21759d(AbstractC18611h.c.m53861c((AbstractC18611h.c) healthspanViewState, null, null, null, true, null, 23, null), true, null, 4, null) : new C21759d(c21759d.getHealthspanViewState(), true, null, 4, null);
            }
            if (!(healthspanDomainResult instanceof HealthspanDomainResult.OnboardingStepCompleted)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC18611h healthspanViewState2 = c21759d.getHealthspanViewState();
            if (healthspanViewState2 instanceof AbstractC18611h.c) {
                AbstractC18611h.c cVar = (AbstractC18611h.c) healthspanViewState2;
                C18607d content = cVar.getContent();
                whoopAgeAmoeba = null;
                WhoopAgeAmoeba whoopAgeAmoeba = null;
                C18606c c18606cM53834b = null;
                C18605b c18605b = (content == null || (amoebaOnboarding = content.getAmoebaOnboarding()) == null || (listM53838e = amoebaOnboarding.m53838e()) == null) ? null : (C18605b) AbstractC25265s.m74102I0(((HealthspanDomainResult.OnboardingStepCompleted) healthspanDomainResult).getStep(), listM53838e);
                if (c18605b != null) {
                    HealthspanDomainResult.OnboardingStepCompleted onboardingStepCompleted = (HealthspanDomainResult.OnboardingStepCompleted) healthspanDomainResult;
                    if (onboardingStepCompleted.getStep() + 1 < cVar.getContent().getAmoebaOnboarding().m53838e().size()) {
                        if (c18605b.getButtonRevealsAmoeba()) {
                            AmoebaViewStateReducer amoebaViewStateReducer = C21758c.this.getAmoebaViewStateReducer();
                            WhoopAgeAmoeba whoopAgeAmoeba2 = C21758c.this.getAmoebaViewStateReducer().toWhoopAgeAmoeba(cVar.getContent().getAmoeba());
                            C18606c amoebaOnboarding2 = cVar.getContent().getAmoebaOnboarding();
                            if (amoebaOnboarding2 != null && (amoeba2 = amoebaOnboarding2.getAmoeba()) != null) {
                                whoopAgeAmoeba = C21758c.this.getAmoebaViewStateReducer().toWhoopAgeAmoeba(amoeba2);
                            }
                            amoeba = amoebaViewStateReducer.reduce(new AmoebaDomainResult.Result(whoopAgeAmoeba2, EnumC4239p.FADE_IN, whoopAgeAmoeba, false));
                        } else {
                            amoeba = cVar.getContent().getAmoebaOnboarding().getAmoeba();
                        }
                        c18606cM53834b = C18606c.m53834b(cVar.getContent().getAmoebaOnboarding(), amoeba, onboardingStepCompleted.getStep() + 1, null, 4, null);
                    }
                    return new C21759d(AbstractC18611h.c.m53861c(cVar, null, C18607d.m53839b(cVar.getContent(), null, false, null, null, C21758c.this.m61435l(cVar.getContent(), onboardingStepCompleted), null, false, false, c18606cM53834b, false, 751, null), null, false, null, 29, null), c21759d.getHasNavigatedToOnboarding(), null, 4, null);
                }
                if (c21759d.getHealthspanViewState() instanceof AbstractC18611h.c) {
                    AbstractC18611h.c cVar2 = (AbstractC18611h.c) c21759d.getHealthspanViewState();
                    C18607d content2 = ((AbstractC18611h.c) c21759d.getHealthspanViewState()).getContent();
                    return new C21759d(AbstractC18611h.c.m53861c(cVar2, null, content2 != null ? C18607d.m53839b(content2, null, false, null, null, C21758c.this.m61435l(((AbstractC18611h.c) c21759d.getHealthspanViewState()).getContent(), (HealthspanDomainResult.OnboardingStepCompleted) healthspanDomainResult), null, false, false, null, false, MessageListItemViewType.TYPING_INDICATOR, null) : null, null, false, null, 29, null), c21759d.getHasNavigatedToOnboarding(), null, 4, null);
                }
            }
            return c21759d;
        }
    }

    public C21758c(AmoebaViewStateReducer amoebaViewStateReducer, C14553a drawerIdProvider) {
        AbstractC22676k.m65750j(amoebaViewStateReducer, "amoebaViewStateReducer");
        AbstractC22676k.m65750j(drawerIdProvider, "drawerIdProvider");
        this.amoebaViewStateReducer = amoebaViewStateReducer;
        this.drawerIdProvider = drawerIdProvider;
        this.designSystemReducer = AbstractC21757b.m61413u(drawerIdProvider);
    }

    /* JADX INFO: renamed from: f */
    private final C26798d m61430f(C26798d viewState, Map<String, Boolean> drawerExpandedStates) {
        Boolean bool = drawerExpandedStates.get(viewState.getId());
        return bool != null ? C26798d.m79869b(viewState, null, null, null, null, null, null, bool.booleanValue(), null, 191, null) : viewState;
    }

    /* JADX INFO: renamed from: g */
    private final C18608e m61431g(C18608e viewState, Map<String, Boolean> drawerExpandedStates) {
        List<C3849p> listM53850c = viewState.m53850c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM53850c, 10));
        for (C3849p c3849pM11792b : listM53850c) {
            Boolean bool = drawerExpandedStates.get(c3849pM11792b.getId());
            if (bool != null) {
                c3849pM11792b = C3849p.m11792b(c3849pM11792b, null, null, false, null, bool.booleanValue(), 15, null);
            }
            arrayList.add(c3849pM11792b);
        }
        return C18608e.m53848b(viewState, arrayList, null, 2, null);
    }

    /* JADX INFO: renamed from: h */
    private final C27994a m61432h(C27994a viewState, Map<String, Boolean> drawerExpandedStates) {
        List<InterfaceC25312u> listM84429c = viewState.m84429c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM84429c, 10));
        for (Object objM61430f : listM84429c) {
            if (objM61430f instanceof C18608e) {
                objM61430f = m61431g((C18608e) objM61430f, drawerExpandedStates);
            } else if (objM61430f instanceof C26798d) {
                objM61430f = m61430f((C26798d) objM61430f, drawerExpandedStates);
            }
            arrayList.add(objM61430f);
        }
        return C27994a.m84427b(viewState, null, null, null, arrayList, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AbstractC18611h.c m61433i(AbstractC18611h.c viewState) {
        C18607d content = viewState.getContent();
        C18607d c18607dM53839b = null;
        DateSelectorModel dateSelectorModelCopy$default = null;
        if (content != null) {
            DateSelectorModel datePicker = viewState.getContent().getDatePicker();
            if (datePicker != null) {
                String upperCase = viewState.getContent().getDatePicker().getCurrentDateRange().toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                dateSelectorModelCopy$default = DateSelectorModel.copy$default(datePicker, null, null, upperCase, null, null, null, null, 123, null);
            }
            c18607dM53839b = C18607d.m53839b(content, dateSelectorModelCopy$default, false, null, null, null, null, false, false, null, false, 1022, null);
        }
        return AbstractC18611h.c.m53861c(viewState, null, c18607dM53839b, null, false, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m61434k(ec3.InterfaceC13062m r7, ik1.AbstractC18611h.c r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof jk1.C21758c.b
            if (r0 == 0) goto L13
            r0 = r9
            jk1.c$b r0 = (jk1.C21758c.b) r0
            int r1 = r0.f83682E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f83682E = r1
            goto L18
        L13:
            jk1.c$b r0 = new jk1.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f83685y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f83682E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f83684x
            ik1.h$c r7 = (ik1.AbstractC18611h.c) r7
            java.lang.Object r7 = r0.f83683w
            ec3.m r7 = (ec3.InterfaceC13062m) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6b
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.f83684x
            r8 = r7
            ik1.h$c r8 = (ik1.AbstractC18611h.c) r8
            java.lang.Object r7 = r0.f83683w
            ec3.m r7 = (ec3.InterfaceC13062m) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L59
        L47:
            p505ts.AbstractC34132o.m107864I(r9)
            r0.f83683w = r7
            r0.f83684x = r8
            r0.f83682E = r4
            r4 = 10
            java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r4, r0)
            if (r9 != r1) goto L59
            goto L6a
        L59:
            ik1.h$c r8 = r6.m61442j(r8)
            r9 = 0
            r0.f83683w = r9
            r0.f83684x = r9
            r0.f83682E = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jk1.C21758c.m61434k(ec3.m, ik1.h$c, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final List<InterfaceC25312u> m61435l(C18607d content, HealthspanDomainResult.OnboardingStepCompleted domainResult) {
        List<InterfaceC25312u> listM53847i = content.m53847i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM53847i) {
            if (m61439r((InterfaceC25312u) obj, domainResult.getHasClosedCalibration(), domainResult.getHasClosedInfoCallout())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private final WhoopAgeAmoeba m61436n(UnlockedContentResponse unlockedContent) {
        return new WhoopAgeAmoeba(WhoopAgeAmoebaStyleValues.copy$default(unlockedContent.getWhoopAgeAmoeba().getStyleValues(), 0.0d, 1.0d, 0.0d, 0.5d, 0.5d, 1, null), "", "", "", unlockedContent.getWhoopAgeAmoeba().getYearsDifferenceValueStyle(), "", unlockedContent.getWhoopAgeAmoeba().getYearsDifferenceValueStyle(), "", "", "", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C21759d m61437p(HealthspanDomainResult.Success domainResult, C21759d accumulation) {
        UnlockedContentResponse unlockedContent = domainResult.getResponse().getUnlockedContent();
        C4242s c4242sReduce = null;
        if (unlockedContent != null && !unlockedContent.getHasBeenSeenByUser() && domainResult.getResponse().getUnlockedContent().getPreviousWhoopAgeAmoeba() != null) {
            c4242sReduce = this.amoebaViewStateReducer.reduce(new AmoebaDomainResult.Result(domainResult.getResponse().getUnlockedContent().getPreviousWhoopAgeAmoeba(), null, null, false));
        }
        return new C21759d(m61440s(domainResult, accumulation.getHasNavigatedToOnboarding(), false), accumulation.getHasNavigatedToOnboarding(), c4242sReduce);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC18611h.c m61438q(HealthspanDomainResult.Success domainResult, AbstractC18611h.c accumulation) {
        InterfaceC25312u interfaceC25312u;
        List<InterfaceC25312u> listM53847i;
        AbstractC18611h.c cVarM61441t = m61441t(this, domainResult, accumulation.getHasNavigatedToOnboarding(), false, 4, null);
        C18607d content = cVarM61441t.getContent();
        C18607d c18607dM53839b = null;
        if (content != null) {
            List<InterfaceC25312u> listM53847i2 = cVarM61441t.getContent().m53847i();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM53847i2, 10));
            for (Object objM13579b : listM53847i2) {
                if (objM13579b instanceof C4307g) {
                    C18607d content2 = accumulation.getContent();
                    if (content2 == null || (listM53847i = content2.m53847i()) == null) {
                        interfaceC25312u = null;
                    } else {
                        Iterator<T> it = listM53847i.iterator();
                        do {
                            if (!it.hasNext()) {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            interfaceC25312u = (InterfaceC25312u) it.next();
                        } while (!(interfaceC25312u instanceof C4307g));
                    }
                    AbstractC22676k.m65748h(interfaceC25312u, "null cannot be cast to non-null type com.whoop.design.atomic.organism.paceofagingmeter.PaceOfAgingMeterViewState");
                    C4307g c4307g = (C4307g) objM13579b;
                    objM13579b = C4307g.m13579b(c4307g, null, null, null, null, null, null, AbstractC28145a1.m85167c(((C4307g) interfaceC25312u).getGradientProgression().f71134x, c4307g.getGradientProgression().f71134x), false, false, null, 959, null);
                }
                arrayList.add(objM13579b);
            }
            c18607dM53839b = C18607d.m53839b(content, null, false, null, null, arrayList, null, false, false, null, false, MessageListItemViewType.TYPING_INDICATOR, null);
        }
        return AbstractC18611h.c.m53861c(cVarM61441t, null, c18607dM53839b, null, false, null, 29, null);
    }

    /* JADX INFO: renamed from: r */
    private final boolean m61439r(InterfaceC25312u item, boolean hasClosedCalibration, boolean hasClosedInfoCallout) {
        if (item instanceof C30885c) {
            return !hasClosedCalibration;
        }
        return ((item instanceof C4092p2) && hasClosedInfoCallout) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: s */
    private final AbstractC18611h.c m61440s(HealthspanDomainResult.Success domainResult, boolean hasNavigatedToOnboarding, boolean animatePaceOfAging) {
        LockedContentViewState lockedContentViewState;
        C13404j c13404j;
        C18607d c18607d;
        AiContextMetadata aiContextMetadata;
        EnumC4225b0 enumC4225b0;
        InterfaceC25312u interfaceC25312uM60541h;
        LockedContentButtonStyle lockedContentButtonStyle;
        AbstractC17911t abstractC17911tM43972A;
        UnlockedContentResponse unlockedContent = domainResult.getResponse().getUnlockedContent();
        C13404j c13404j2 = null;
        EnumC4239p enumC4239p = ((unlockedContent == null || unlockedContent.getHasBeenSeenByUser()) && !domainResult.isFromDateChange()) ? null : EnumC4239p.PULSE_YEARS_DIFFERENCE;
        LockedContent lockedContent = domainResult.getResponse().getLockedContent();
        if (lockedContent != null) {
            String buttonStyle = lockedContent.getButtonStyle();
            LockedContentButtonStyle lockedContentButtonStyle2 = LockedContentButtonStyle.DEFAULT;
            LockedContentButtonStyle[] lockedContentButtonStyleArrValues = LockedContentButtonStyle.values();
            int length = lockedContentButtonStyleArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    lockedContentButtonStyle = null;
                    break;
                }
                lockedContentButtonStyle = lockedContentButtonStyleArrValues[i13];
                if (AbstractC22676k.m65745e(lockedContentButtonStyle.name(), buttonStyle)) {
                    break;
                }
                i13++;
            }
            if (lockedContentButtonStyle != null) {
                lockedContentButtonStyle2 = lockedContentButtonStyle;
            }
            if (lockedContentButtonStyle2 == LockedContentButtonStyle.DEFAULT) {
                C17909s c17909s = AbstractC17911t.f69612b;
                long j7 = C17919x.f69629f;
                abstractC17911tM43972A = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j7)), 0L, 0L, 14);
            } else {
                abstractC17911tM43972A = AbstractC15673b0.m43972A();
            }
            lockedContentViewState = new LockedContentViewState(AbstractC22404p.m64503l(lockedContent.getLockedIcon()), lockedContent.getHeaderTextDisplay(), lockedContent.getDescriptionDisplay(), abstractC17911tM43972A, lockedContent.getButtonTextDisplay(), lockedContent.getButtonDestination());
        } else {
            lockedContentViewState = null;
        }
        C18612i c18612i = new C18612i(domainResult.getResponse().getNavigationTitle(), domainResult.getResponse().getNavigationSubtitle(), domainResult.getResponse().getNavigationDestination());
        UnlockedContentResponse unlockedContent2 = domainResult.getResponse().getUnlockedContent();
        if (unlockedContent2 != null) {
            AmoebaDomainResult.Result result = new AmoebaDomainResult.Result(unlockedContent2.getWhoopAgeAmoeba(), enumC4239p, unlockedContent2.getPreviousWhoopAgeAmoeba(), false);
            DateSelectorModel datePicker = unlockedContent2.getDatePicker();
            boolean zIsCalibrating = unlockedContent2.isCalibrating();
            C4242s c4242sReduce = this.amoebaViewStateReducer.reduce(result);
            String yearsDifferenceValueDisplay = unlockedContent2.getWhoopAgeAmoeba().getYearsDifferenceValueDisplay();
            String yearsDifferenceValueStyle = unlockedContent2.getWhoopAgeAmoeba().getYearsDifferenceValueStyle();
            EnumC4225b0 enumC4225b1 = EnumC4225b0.NEUTRAL;
            EnumC4225b0[] enumC4225b0ArrValues = EnumC4225b0.values();
            int length2 = enumC4225b0ArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC4225b0 = null;
                    break;
                }
                enumC4225b0 = enumC4225b0ArrValues[i14];
                if (AbstractC22676k.m65745e(enumC4225b0.name(), yearsDifferenceValueStyle)) {
                    break;
                }
                i14++;
            }
            C18604a c18604a = new C18604a(yearsDifferenceValueDisplay, enumC4225b0 == null ? enumC4225b1 : enumC4225b0, unlockedContent2.getWhoopAgeAmoeba().getYearsDifferenceSubtitleDisplay(), this.amoebaViewStateReducer.amoebaTextStyleToWhoopColor(unlockedContent2.getWhoopAgeAmoeba().getYearsDifferenceValueStyle()), unlockedContent2.getWhoopAgeAmoeba().getPaceOfAgingDisplay(), unlockedContent2.getWhoopAgeAmoeba().getPaceOfAgingSubtitleDisplay());
            List<DesignSystemModel> items = unlockedContent2.getItems();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator it = items.iterator();
            while (true) {
                boolean z4 = true;
                if (!it.hasNext()) {
                    break;
                }
                DesignSystemModel designSystemModel = (DesignSystemModel) it.next();
                if (designSystemModel instanceof PaceOfAgingMeterModel) {
                    PaceOfAgingMeterModel paceOfAgingMeterModel = (PaceOfAgingMeterModel) designSystemModel;
                    if (enumC4239p != null && animatePaceOfAging) {
                        z4 = false;
                    }
                    interfaceC25312uM60541h = AbstractC23692p3.m69238g(paceOfAgingMeterModel, z4, domainResult.getPreviousPaceOfAgingValueIndex());
                } else {
                    interfaceC25312uM60541h = this.designSystemReducer.m60541h(designSystemModel);
                    if (interfaceC25312uM60541h instanceof C11474i) {
                        C11474i c11474i = (C11474i) interfaceC25312uM60541h;
                        C11467b ctaButtonInformation = c11474i.getCtaButtonInformation();
                        interfaceC25312uM60541h = C11474i.m30808f(c11474i, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, ctaButtonInformation != null ? C11467b.m30762b(ctaButtonInformation, null, EnumC39333f.RECOVERY, null, null, 5, null) : null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, Float.NaN, null, null, 469729279, null);
                    } else if (interfaceC25312uM60541h instanceof C4092p2) {
                        interfaceC25312uM60541h = C4092p2.m12552b((C4092p2) interfaceC25312uM60541h, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, 1040383, null);
                    } else if (interfaceC25312uM60541h instanceof C27994a) {
                        interfaceC25312uM60541h = m61432h((C27994a) interfaceC25312uM60541h, domainResult.getDrawerExpandedStates());
                    }
                }
                arrayList.add(interfaceC25312uM60541h);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (m61439r((InterfaceC25312u) obj, domainResult.getHasClosedCalibration(), domainResult.getHasClosedInfoCallout())) {
                    arrayList2.add(obj);
                }
            }
            List<FeaturedHighlight> featuredHighlights = unlockedContent2.getFeaturedHighlights();
            boolean hasBeenSeenByUser = unlockedContent2.getHasBeenSeenByUser();
            boolean hasOnboarded = unlockedContent2.getHasOnboarded();
            C4242s c4242sReduce2 = this.amoebaViewStateReducer.reduce(new AmoebaDomainResult.Result(m61436n(unlockedContent2), null, null, true));
            List<AmoebaOnboardingStep> amoebaOnboardingSteps = unlockedContent2.getAmoebaOnboardingSteps();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(amoebaOnboardingSteps, 10));
            int i15 = 0;
            for (Object obj2 : amoebaOnboardingSteps) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    ?? r28 = c13404j2;
                    AbstractC37056f.m118977d0();
                    throw r28;
                }
                AmoebaOnboardingStep amoebaOnboardingStep = (AmoebaOnboardingStep) obj2;
                C13404j c13404j3 = c13404j2;
                arrayList3.add(new C18605b(amoebaOnboardingStep.getTitleDisplay(), amoebaOnboardingStep.getSubtitleDisplay(), amoebaOnboardingStep.getButtonTextDisplay(), i15 == unlockedContent2.getAmoebaOnboardingSteps().size() + (-1) ? EnumC39333f.ACCENT_ACTION : EnumC39333f.BRAND_WHITE, amoebaOnboardingStep.getButtonRevealsAmoeba()));
                i15 = i16;
                c13404j2 = c13404j3;
            }
            c13404j = c13404j2;
            C18606c c18606c = new C18606c(c4242sReduce2, 0, arrayList3);
            Boolean healthspanLabsIntroEnabled = unlockedContent2.getHealthspanLabsIntroEnabled();
            c18607d = new C18607d(datePicker, zIsCalibrating, c4242sReduce, c18604a, arrayList2, featuredHighlights, hasBeenSeenByUser, hasOnboarded, c18606c, healthspanLabsIntroEnabled != null ? healthspanLabsIntroEnabled.booleanValue() : false);
        } else {
            c13404j = null;
            c18607d = null;
        }
        MetaData metadata = domainResult.getResponse().getMetadata();
        return new AbstractC18611h.c(c18612i, c18607d, lockedContentViewState, hasNavigatedToOnboarding, (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? c13404j : AbstractC6219a.m18523a(aiContextMetadata));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ AbstractC18611h.c m61441t(C21758c c21758c, HealthspanDomainResult.Success success, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        return c21758c.m61440s(success, z4, z13);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC18611h.c m61442j(AbstractC18611h.c previousState) {
        C18607d c18607dM53839b;
        AbstractC22676k.m65750j(previousState, "previousState");
        C18607d content = previousState.getContent();
        if (content != null) {
            List<InterfaceC25312u> listM53847i = previousState.getContent().m53847i();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM53847i, 10));
            for (Object objM13579b : listM53847i) {
                if (objM13579b instanceof C4307g) {
                    objM13579b = C4307g.m13579b((C4307g) objM13579b, null, null, null, null, null, null, null, true, false, null, 895, null);
                }
                arrayList.add(objM13579b);
            }
            C4242s amoeba = previousState.getContent().getAmoeba();
            c18607dM53839b = C18607d.m53839b(content, null, false, amoeba.m13236b((8191 & 1) != 0 ? amoeba.radius : 0.0f, (8191 & 2) != 0 ? amoeba.padding : 0.0f, (8191 & 4) != 0 ? amoeba.gradientPadding : 0.0f, (8191 & 8) != 0 ? amoeba.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? amoeba.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? amoeba.colors : null, (8191 & 64) != 0 ? amoeba.centerShadowBrush : null, (8191 & 128) != 0 ? amoeba.outline : null, (8191 & 256) != 0 ? amoeba.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? amoeba.edgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? amoeba.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? amoeba.particles : null, (8191 & 4096) != 0 ? amoeba.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? amoeba.text : null), null, arrayList, null, false, false, null, false, 1003, null);
        } else {
            c18607dM53839b = null;
        }
        return AbstractC18611h.c.m53861c(previousState, null, c18607dM53839b, null, false, null, 29, null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AmoebaViewStateReducer getAmoebaViewStateReducer() {
        return this.amoebaViewStateReducer;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m61444o(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13084s1(new c(new C13060l1(new C21759d(AbstractC18611h.b.f72766b, false, null, 4, null), upstream, new d(null)), null, this));
    }
}
