package od1;

import com.whoop.addactivity.network.model.ScoreType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ha0.C17051d;
import ha0.C17055h;
import ia0.C18292a;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import n82.EnumC26455a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: od1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lod1/n;", "Lod1/g;", "Lod1/l;", "Lod1/m;", "Lia0/a;", "activityTypesRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lia0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Ln82/a;", "selectedScreenType", "", "isStartActivityRevamp", "Lec3/l;", "Lod1/i$a;", "g", "(Ln82/a;ZLq83/d;)Ljava/lang/Object;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lia0/a;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "Lod1/a;", "c", "Ljava/util/List;", "mostRecentActivityListAux", "select-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27851n implements InterfaceC27844g<InterfaceC27849l, C27850m> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private List<C27836a> mostRecentActivityListAux;

    /* JADX INFO: renamed from: od1.n$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.SelectActivityTypeInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SelectActivityTypeInteractor.kt", m100431l = {191, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f112181E;

        /* JADX INFO: renamed from: F */
        Object f112182F;

        /* JADX INFO: renamed from: G */
        Object f112183G;

        /* JADX INFO: renamed from: H */
        int f112184H;

        /* JADX INFO: renamed from: w */
        int f112185w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f112186x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112187y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C27851n f112188z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C27851n c27851n) {
            super(3, interfaceC30057d);
            this.f112188z = c27851n;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC27849l interfaceC27849l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f112188z);
            aVar.f112186x = interfaceC13062m;
            aVar.f112187y = interfaceC27849l;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
        
            if (r12 == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, r12, r11) == r0) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r11.f112185w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L32
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r11.f112186x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r12)
                goto L96
            L16:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1e:
                java.lang.Object r1 = r11.f112183G
                od1.l r1 = (od1.InterfaceC27849l) r1
                java.lang.Object r1 = r11.f112182F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r11.f112181E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r11.f112186x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r12)
                goto L64
            L32:
                p505ts.AbstractC34132o.m107864I(r12)
                java.lang.Object r12 = r11.f112186x
                r1 = r12
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r12 = r11.f112187y
                od1.l r12 = (od1.InterfaceC27849l) r12
                boolean r5 = r12 instanceof od1.InterfaceC27849l.a
                if (r5 == 0) goto L67
                od1.n r5 = r11.f112188z
                od1.l$a r12 = (od1.InterfaceC27849l.a) r12
                n82.a r6 = r12.getPageType()
                boolean r12 = r12.getIsStartActivityRevamp()
                r11.f112186x = r4
                r11.f112187y = r4
                r11.f112181E = r1
                r11.f112182F = r4
                r11.f112183G = r4
                r7 = 0
                r11.f112184H = r7
                r11.f112185w = r3
                java.lang.Object r12 = od1.C27851n.m83977e(r5, r6, r12, r11)
                if (r12 != r0) goto L64
                goto L95
            L64:
                ec3.l r12 = (ec3.InterfaceC13058l) r12
                goto L83
            L67:
                boolean r3 = r12 instanceof od1.InterfaceC27849l.b
                if (r3 == 0) goto L99
                od1.i$b r5 = new od1.i$b
                od1.l$b r12 = (od1.InterfaceC27849l.b) r12
                java.lang.String r6 = r12.getCom.mapbox.common.MapboxServices.SEARCH java.lang.String()
                n82.a r7 = r12.getScreenType()
                r9 = 4
                r10 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                a6.u r12 = new a6.u
                r3 = 1
                r12.<init>(r5, r3)
            L83:
                r11.f112186x = r4
                r11.f112187y = r4
                r11.f112181E = r4
                r11.f112182F = r4
                r11.f112183G = r4
                r11.f112185w = r2
                java.lang.Object r12 = ec3.AbstractC13091v.m36613w(r1, r12, r11)
                if (r12 != r0) goto L96
            L95:
                return r0
            L96:
                l83.a0 r12 = l83.C23454a0.f92919a
                return r12
            L99:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: od1.C27851n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (InterfaceC27849l) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: od1.n$b */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.SelectActivityTypeInteractor$interact$2", m100430f = "SelectActivityTypeInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lod1/m;", "previousState", "Lod1/i;", "internalAction", "<anonymous>", "(Lod1/m;Lod1/i;)Lod1/m;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f112189w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112190x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112191y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C27850m c27850m, InterfaceC27846i interfaceC27846i, InterfaceC30057d<? super C27850m> interfaceC30057d) {
            b bVar = C27851n.this.new b(interfaceC30057d);
            bVar.f112190x = c27850m;
            bVar.f112191y = interfaceC27846i;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27850m c27850m = (C27850m) this.f112190x;
            InterfaceC27846i interfaceC27846i = (InterfaceC27846i) this.f112191y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f112189w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (interfaceC27846i instanceof InterfaceC27846i.a) {
                InterfaceC27846i.a aVar = (InterfaceC27846i.a) interfaceC27846i;
                List<C27836a> listM83946a = aVar.m83946a();
                EnumC26455a selectedScreenType = aVar.getSelectedScreenType();
                if (selectedScreenType == null) {
                    selectedScreenType = EnumC26455a.ALL;
                }
                List listM83987f = AbstractC27852o.m83987f(listM83946a, selectedScreenType);
                List<C27836a> listM83946a2 = aVar.m83946a();
                EnumC26455a pageType = aVar.getPageType();
                if (pageType == null) {
                    pageType = EnumC26455a.ALL;
                }
                EnumC26455a enumC26455a = pageType;
                EnumC26455a selectedScreenType2 = aVar.getSelectedScreenType();
                if (selectedScreenType2 == null) {
                    selectedScreenType2 = EnumC26455a.ALL;
                }
                return C27850m.m83967b(c27850m, null, listM83987f, listM83946a2, aVar.m83947b(), enumC26455a, selectedScreenType2, 1, null);
            }
            if (!(interfaceC27846i instanceof InterfaceC27846i.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC27846i.b bVar = (InterfaceC27846i.b) interfaceC27846i;
            String searchQuery = bVar.getSearchQuery();
            EnumC26455a screenType = bVar.getScreenType();
            if (screenType == null) {
                screenType = EnumC26455a.ALL;
            }
            EnumC26455a enumC26455a2 = screenType;
            List list = C27851n.this.mostRecentActivityListAux;
            EnumC26455a screenType2 = bVar.getScreenType();
            if (screenType2 == null) {
                screenType2 = EnumC26455a.ALL;
            }
            List listM83989h = AbstractC27852o.m83989h(list, screenType2);
            List<C27836a> listM83969c = c27850m.m83969c();
            String searchQuery2 = bVar.getSearchQuery();
            EnumC26455a screenType3 = bVar.getScreenType();
            if (screenType3 == null) {
                screenType3 = EnumC26455a.ALL;
            }
            return C27850m.m83967b(c27850m, searchQuery, AbstractC27852o.m83992k(listM83969c, searchQuery2, screenType3, C27851n.this.featureFlagChecker), null, listM83989h, null, enumC26455a2, 20, null);
        }
    }

    /* JADX INFO: renamed from: od1.n$c */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.SelectActivityTypeInteractor", m100430f = "SelectActivityTypeInteractor.kt", m100431l = {69, 70}, m100432m = "loadActivities", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f112193E;

        /* JADX INFO: renamed from: G */
        int f112195G;

        /* JADX INFO: renamed from: w */
        Object f112196w;

        /* JADX INFO: renamed from: x */
        Object f112197x;

        /* JADX INFO: renamed from: y */
        boolean f112198y;

        /* JADX INFO: renamed from: z */
        int f112199z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112193E = obj;
            this.f112195G |= Integer.MIN_VALUE;
            return C27851n.this.m83979g(null, false, this);
        }
    }

    /* JADX INFO: renamed from: od1.n$d */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.domain.SelectActivityTypeInteractor$loadActivities$2", m100430f = "SelectActivityTypeInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"", "Lha0/d;", "allActivities", "Lha0/h;", "recentActivitiesList", "Lod1/i$a;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Lod1/i$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ EnumC26455a f112200E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f112201F;

        /* JADX INFO: renamed from: w */
        int f112202w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112203x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112204y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumC26455a enumC26455a, boolean z4, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f112200E = enumC26455a;
            this.f112201F = z4;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<C17051d> list, List<C17055h> list2, InterfaceC30057d<? super InterfaceC27846i.a> interfaceC30057d) {
            d dVar = C27851n.this.new d(this.f112200E, this.f112201F, interfaceC30057d);
            dVar.f112203x = list;
            dVar.f112204y = list2;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.f112203x;
            List list2 = (List) this.f112204y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f112202w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            ArrayList<C17051d> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((C17051d) obj2).getScoreType() != ScoreType.WEIGHTLIFTING_MSK) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            for (C17051d c17051d : arrayList) {
                arrayList2.add(new C27836a(c17051d.getInternalName(), c17051d.getDisplayName(), c17051d.getIconUrl(), c17051d.getScoreType()));
            }
            boolean z4 = this.f112201F;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (!AbstractC27852o.m83993l((C27836a) obj3, z4)) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList<C17055h> arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                C17055h c17055h = (C17055h) obj4;
                if (c17055h.getScoreType() != ScoreType.WEIGHTLIFTING_MSK && !AbstractC22676k.m65745e(c17055h.getInternalName(), "increase_alertness") && !AbstractC22676k.m65745e(c17055h.getInternalName(), "increase_relaxation")) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
            for (C17055h c17055h2 : arrayList4) {
                arrayList5.add(new C27836a(c17055h2.getInternalName(), c17055h2.getDisplayName(), c17055h2.getIconUrl(), c17055h2.getScoreType()));
            }
            C27851n.this.mostRecentActivityListAux = AbstractC27852o.m83990i(arrayList5, this.f112200E);
            return new InterfaceC27846i.a(arrayList3, AbstractC27852o.m83990i(arrayList5, this.f112200E), null, this.f112200E, 4, null);
        }
    }

    public C27851n(C18292a activityTypesRepository, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.activityTypesRepository = activityTypesRepository;
        this.featureFlagChecker = featureFlagChecker;
        this.mostRecentActivityListAux = C25271y.f99162w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m83979g(EnumC26455a enumC26455a, boolean z4, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        c cVar;
        int i13;
        Object objM52660e;
        EnumC26455a enumC26455a2;
        int i14;
        InterfaceC13058l interfaceC13058l;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i15 = cVar.f112195G;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cVar.f112195G = i15 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f112193E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = cVar.f112195G;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            i13 = (z4 && this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP)) ? 1 : 0;
            C18292a c18292a = this.activityTypesRepository;
            cVar.f112196w = enumC26455a;
            cVar.f112198y = z4;
            cVar.f112199z = i13;
            cVar.f112195G = 1;
            objM52660e = c18292a.m52660e(cVar);
            if (objM52660e != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i16 == 1) {
            int i17 = cVar.f112199z;
            z4 = cVar.f112198y;
            EnumC26455a enumC26455a3 = (EnumC26455a) cVar.f112196w;
            AbstractC34132o.m107864I(obj);
            i13 = i17;
            enumC26455a = enumC26455a3;
            objM52660e = obj;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = cVar.f112199z;
            interfaceC13058l = (InterfaceC13058l) cVar.f112197x;
            enumC26455a2 = (EnumC26455a) cVar.f112196w;
            AbstractC34132o.m107864I(obj);
        }
        return new C13060l1(interfaceC13058l, (InterfaceC13058l) obj, new d(enumC26455a2, i14 != 0, null), 1);
        InterfaceC13058l interfaceC13058l2 = (InterfaceC13058l) objM52660e;
        C18292a c18292a2 = this.activityTypesRepository;
        cVar.f112196w = enumC26455a;
        cVar.f112197x = interfaceC13058l2;
        cVar.f112198y = z4;
        cVar.f112199z = i13;
        cVar.f112195G = 2;
        Object objM52662g = c18292a2.m52662g(cVar);
        if (objM52662g != enumC31071a) {
            enumC26455a2 = enumC26455a;
            i14 = i13;
            obj = objM52662g;
            interfaceC13058l = interfaceC13058l2;
            return new C13060l1(interfaceC13058l, (InterfaceC13058l) obj, new d(enumC26455a2, i14 != 0, null), 1);
        }
        return enumC31071a;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new C13060l1(new C27850m(null, null, null, null, null, null, 63, null), AbstractC13091v.m36590P(upstream, new a(null, this)), new b(null)));
    }
}
