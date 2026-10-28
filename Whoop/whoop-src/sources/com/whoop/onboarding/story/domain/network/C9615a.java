package com.whoop.onboarding.story.domain.network;

import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.educationModels.CompleteFeatureEducationBody;
import com.whoop.service.network.JournalApi;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import js0.AbstractC21907a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import p218ic.AbstractC18377p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import u92.C34660d;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u00061/+-!)BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b!\u0010\"J(\u0010'\u001a\u00020&2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00160#j\b\u0012\u0004\u0012\u00020\u0016`$H\u0086@¢\u0006\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00103¨\u00064"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a;", "Lhj0/n;", "Ltr2/n;", "logger", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "api", "Lcom/whoop/service/network/JournalApi;", "journalApi", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lic/p0;", "workManager", "Lu92/d;", "prefsStore", "Ljs0/c;", "configurationRepository", "<init>", "(Ltr2/n;Lrr2/c;Lin2/d;Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;Lcom/whoop/service/network/JournalApi;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lic/p0;Lu92/d;Ljs0/c;)V", "", "featureEducationId", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(I)V", "", "type", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/educationModels/FeatureEducationDto;", "g", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "f", "(ILq83/d;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "listOfSelectedJournals", "", "i", "(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "b", "Lcom/whoop/service/network/JournalApi;", "c", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "d", "Lic/p0;", "e", "Lu92/d;", "Ljs0/c;", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9615a extends AbstractC17355n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureEducationApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JournalApi journalApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final OnboardingStatusChecker onboardingStatusChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a$a;", "Ljs0/a;", "", "<init>", "()V", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final a f28185a = new a();

        private a() {
            super("ADVANCED_LABS_EARLY_ACCESS_FEATURE_EDUCATION_ID", 77585);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a$b;", "Ljs0/a;", "", "<init>", "()V", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final b f28186a = new b();

        private b() {
            super("COMMUNITY_ONBOARDING", 76931);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a$c;", "Ljs0/a;", "", "<init>", "()V", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final c f28187a = new c();

        private c() {
            super("CUSTOMIZE_JOURNAL", 28);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a$d;", "Ljs0/a;", "", "<init>", "()V", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final d f28188a = new d();

        private d() {
            super("LABRADOR_FEATURE_EDUCATION_ID", 252);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a$e;", "Ljs0/a;", "", "<init>", "()V", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final e f28189a = new e();

        private e() {
            super("SHEPHERD_FEATURE_EDUCATION_ID", 11867);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/a$f;", "Ljs0/a;", "", "<init>", "()V", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC21907a<Integer> {

        /* JADX INFO: renamed from: a */
        public static final f f28190a = new f();

        private f() {
            super("WIDGET_ONBOARDING_ANDROID", 77563);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.domain.network.OnboardingStoryRepository", m100430f = "OnboardingStoryRepository.kt", m100431l = {81}, m100432m = "completeFeatureEducation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28191E;

        /* JADX INFO: renamed from: w */
        int f28192w;

        /* JADX INFO: renamed from: x */
        Object f28193x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28194y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28194y = obj;
            this.f28191E |= Integer.MIN_VALUE;
            return C9615a.this.m23157f(0, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.domain.network.OnboardingStoryRepository", m100430f = "OnboardingStoryRepository.kt", m100431l = {40, 42}, m100432m = "getStory", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f28196w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f28197x;

        /* JADX INFO: renamed from: z */
        int f28199z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28197x = obj;
            this.f28199z |= Integer.MIN_VALUE;
            return C9615a.this.m23158g(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.domain.network.OnboardingStoryRepository", m100430f = "OnboardingStoryRepository.kt", m100431l = {95}, m100432m = "updateUserSelectedJournalList", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f28200w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f28201x;

        /* JADX INFO: renamed from: z */
        int f28203z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28201x = obj;
            this.f28203z |= Integer.MIN_VALUE;
            return C9615a.this.m23159i(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.a$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.domain.network.OnboardingStoryRepository$updateUserSelectedJournalList$response$1", m100430f = "OnboardingStoryRepository.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f28204w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ArrayList<Integer> f28206y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ArrayList<Integer> arrayList, InterfaceC30057d<? super j> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f28206y = arrayList;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C9615a.this.new j(this.f28206y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28204w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            JournalApi journalApi = C9615a.this.journalApi;
            ArrayList<Integer> arrayList = this.f28206y;
            this.f28204w = 1;
            Object objUpdateUserSelectedJournalBehaviors = journalApi.updateUserSelectedJournalBehaviors(arrayList, this);
            return objUpdateUserSelectedJournalBehaviors == enumC31071a ? enumC31071a : objUpdateUserSelectedJournalBehaviors;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((j) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9615a(InterfaceC34116n logger, InterfaceC31766c crashReporter, InterfaceC18732d dispatcherFactory, FeatureEducationApi api, JournalApi journalApi, OnboardingStatusChecker onboardingStatusChecker, AbstractC18377p0 workManager, C34660d prefsStore, AbstractC21909c configurationRepository) {
        super(logger, crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(journalApi, "journalApi");
        AbstractC22676k.m65750j(onboardingStatusChecker, "onboardingStatusChecker");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        this.api = api;
        this.journalApi = journalApi;
        this.onboardingStatusChecker = onboardingStatusChecker;
        this.workManager = workManager;
        this.prefsStore = prefsStore;
        this.configurationRepository = configurationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0247  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:178:0x039f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0040  */
    /* JADX INFO: renamed from: h */
    private final void m23156h(int featureEducationId) {
        Object objM125868N0;
        Object objM125868N1;
        Object obj;
        Object objM125868N2;
        Object obj2;
        Object objM125868N3;
        Object obj3;
        Object objM125868N4;
        Object obj4;
        Object objM125868N5;
        AbstractC21909c abstractC21909c = this.configurationRepository;
        e eVar = e.f28189a;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = eVar.getName();
        Object defaultValue = eVar.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Class cls = Integer.TYPE;
        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        if (zM65745e) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            } else {
                objM125868N0 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            } else {
                objM125868N0 = null;
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue = ((Integer) defaultValue).intValue();
        AbstractC21909c abstractC21909c2 = this.configurationRepository;
        d dVar = d.f28188a;
        C21908b configurations2 = abstractC21909c2.getConfigurations();
        String name2 = dVar.getName();
        Integer defaultValue2 = dVar.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N1 = AbstractC39421y.m125932Q(str6);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N1 = AbstractC39421y.m125933R(str7);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N1 = AbstractC39420x.m125915y(str8);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N1 = AbstractC39420x.m125914x(str9);
            } else {
                objM125868N1 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N1 = AbstractC39414r.m125868N0(str10);
            } else {
                objM125868N1 = null;
            }
        } else {
            objM125868N1 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        if (objM125868N1 != null) {
            obj = objM125868N1;
        }
        if (obj == null) {
            obj = defaultValue2;
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue2 = ((Integer) obj).intValue();
        AbstractC21909c abstractC21909c3 = this.configurationRepository;
        c cVar = c.f28187a;
        C21908b configurations3 = abstractC21909c3.getConfigurations();
        String name3 = cVar.getName();
        Integer defaultValue3 = cVar.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass3 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls))) {
            String str11 = (String) configurations3.get(name3);
            if (str11 != null) {
                objM125868N2 = AbstractC39421y.m125932Q(str11);
            } else {
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                objM125868N2 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str12 = (String) configurations3.get(name3);
            if (str12 != null) {
                objM125868N2 = AbstractC39421y.m125933R(str12);
            } else {
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                objM125868N2 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str13 = (String) configurations3.get(name3);
            if (str13 != null) {
                objM125868N2 = AbstractC39420x.m125915y(str13);
            } else {
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                objM125868N2 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str14 = (String) configurations3.get(name3);
            if (str14 != null) {
                objM125868N2 = AbstractC39420x.m125914x(str14);
            } else {
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                objM125868N2 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str15 = (String) configurations3.get(name3);
            if (str15 != null) {
                objM125868N2 = AbstractC39414r.m125868N0(str15);
            } else {
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                obj = defaultValue2;
                objM125868N2 = null;
            }
        } else {
            objM125868N2 = AbstractC22676k.m65745e(orCreateKotlinClass3, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations3.get(name3) : defaultValue3;
        }
        if (objM125868N2 == null) {
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
        } else {
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj = defaultValue2;
            obj2 = objM125868N2;
        }
        if (obj2 == null) {
            obj = defaultValue2;
            obj = defaultValue2;
            obj2 = defaultValue3;
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        obj = defaultValue2;
        int iIntValue3 = ((Integer) obj2).intValue();
        AbstractC21909c abstractC21909c4 = this.configurationRepository;
        b bVar = b.f28186a;
        C21908b configurations4 = abstractC21909c4.getConfigurations();
        String name4 = bVar.getName();
        Integer defaultValue4 = bVar.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass4 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls))) {
            String str16 = (String) configurations4.get(name4);
            if (str16 != null) {
                objM125868N3 = AbstractC39421y.m125932Q(str16);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                objM125868N3 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str17 = (String) configurations4.get(name4);
            if (str17 != null) {
                objM125868N3 = AbstractC39421y.m125933R(str17);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                objM125868N3 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str18 = (String) configurations4.get(name4);
            if (str18 != null) {
                objM125868N3 = AbstractC39420x.m125915y(str18);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                objM125868N3 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str19 = (String) configurations4.get(name4);
            if (str19 != null) {
                objM125868N3 = AbstractC39420x.m125914x(str19);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                objM125868N3 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str20 = (String) configurations4.get(name4);
            if (str20 != null) {
                objM125868N3 = AbstractC39414r.m125868N0(str20);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj = defaultValue2;
                obj2 = defaultValue3;
                objM125868N3 = null;
            }
        } else {
            objM125868N3 = AbstractC22676k.m65745e(orCreateKotlinClass4, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations4.get(name4) : defaultValue4;
        }
        if (objM125868N3 == null) {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
        } else {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = objM125868N3;
        }
        if (obj3 == null) {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        obj = defaultValue2;
        obj2 = defaultValue3;
        int iIntValue4 = ((Integer) obj3).intValue();
        AbstractC21909c abstractC21909c5 = this.configurationRepository;
        f fVar = f.f28190a;
        C21908b configurations5 = abstractC21909c5.getConfigurations();
        String name5 = fVar.getName();
        Integer defaultValue5 = fVar.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass5 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i0.getOrCreateKotlinClass(cls))) {
            String str21 = (String) configurations5.get(name5);
            if (str21 != null) {
                objM125868N4 = AbstractC39421y.m125932Q(str21);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                objM125868N4 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str22 = (String) configurations5.get(name5);
            if (str22 != null) {
                objM125868N4 = AbstractC39421y.m125933R(str22);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                objM125868N4 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str23 = (String) configurations5.get(name5);
            if (str23 != null) {
                objM125868N4 = AbstractC39420x.m125915y(str23);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                objM125868N4 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str24 = (String) configurations5.get(name5);
            if (str24 != null) {
                objM125868N4 = AbstractC39420x.m125914x(str24);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                objM125868N4 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str25 = (String) configurations5.get(name5);
            if (str25 != null) {
                objM125868N4 = AbstractC39414r.m125868N0(str25);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                objM125868N4 = null;
            }
        } else {
            objM125868N4 = AbstractC22676k.m65745e(orCreateKotlinClass5, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations5.get(name5) : defaultValue5;
        }
        if (objM125868N4 == null) {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
        } else {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = objM125868N4;
        }
        if (obj4 == null) {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        obj = defaultValue2;
        obj2 = defaultValue3;
        obj3 = defaultValue4;
        int iIntValue5 = ((Integer) obj4).intValue();
        AbstractC21909c abstractC21909c6 = this.configurationRepository;
        a aVar = a.f28185a;
        C21908b configurations6 = abstractC21909c6.getConfigurations();
        String name6 = aVar.getName();
        Object defaultValue6 = aVar.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass6 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i0.getOrCreateKotlinClass(cls))) {
            String str26 = (String) configurations6.get(name6);
            if (str26 != null) {
                objM125868N5 = AbstractC39421y.m125932Q(str26);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                objM125868N5 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str27 = (String) configurations6.get(name6);
            if (str27 != null) {
                objM125868N5 = AbstractC39421y.m125933R(str27);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                objM125868N5 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str28 = (String) configurations6.get(name6);
            if (str28 != null) {
                objM125868N5 = AbstractC39420x.m125915y(str28);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                objM125868N5 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str29 = (String) configurations6.get(name6);
            if (str29 != null) {
                objM125868N5 = AbstractC39420x.m125914x(str29);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                objM125868N5 = null;
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str30 = (String) configurations6.get(name6);
            if (str30 != null) {
                objM125868N5 = AbstractC39414r.m125868N0(str30);
            } else {
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                obj = defaultValue2;
                obj2 = defaultValue3;
                obj3 = defaultValue4;
                obj4 = defaultValue5;
                objM125868N5 = null;
            }
        } else {
            objM125868N5 = AbstractC22676k.m65745e(orCreateKotlinClass6, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations6.get(name6) : defaultValue6;
        }
        if (objM125868N5 != null) {
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            obj = defaultValue2;
            obj2 = defaultValue3;
            obj3 = defaultValue4;
            obj4 = defaultValue5;
            defaultValue6 = objM125868N5;
        }
        if (defaultValue6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        int iIntValue6 = ((Integer) defaultValue6).intValue();
        if (featureEducationId == iIntValue || featureEducationId == iIntValue2) {
            this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ARRHYTHMIA_COMPLETED, true);
            return;
        }
        if (featureEducationId == iIntValue3) {
            this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_JOURNAL_COMPLETED, true);
            return;
        }
        if (featureEducationId == iIntValue4) {
            this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COMMUNITY_COMPLETED, true);
        } else if (featureEducationId == iIntValue5) {
            this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_WIDGET_COMPLETED, true);
        } else if (featureEducationId == iIntValue6) {
            this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ADVANCE_LABS_COMPLETED, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m23157f(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i14 = gVar.f28191E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f28191E = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objCompleteFeatureEducation = gVar.f28194y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = gVar.f28191E;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objCompleteFeatureEducation);
                m23156h(i13);
                CompleteFeatureEducationBody completeFeatureEducationBody = new CompleteFeatureEducationBody(i13, true);
                FeatureEducationApi featureEducationApi = this.api;
                gVar.f28193x = null;
                gVar.f28192w = i13;
                gVar.f28191E = 1;
                objCompleteFeatureEducation = featureEducationApi.completeFeatureEducation(completeFeatureEducationBody, gVar);
                if (objCompleteFeatureEducation == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = gVar.f28192w;
                AbstractC34132o.m107864I(objCompleteFeatureEducation);
            }
            if (((C29218v0) objCompleteFeatureEducation).f118269a.f146788Q) {
                this.onboardingStatusChecker.retriggerOnboardingFetch();
            }
        } catch (Exception e5) {
            logRetrofitSuspendException(e5, "Failed to complete feature education for ID: " + i13);
            PostOnboardingCompleteFeatureEducationWorker.INSTANCE.m23154b(this.workManager, i13);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (r11 == r2) goto L31;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m23158g(java.lang.String r10, q83.InterfaceC30057d<? super com.whoop.data.remote.commons.Resource<com.whoop.educationModels.FeatureEducationDto>> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "Feature Education type: "
            boolean r1 = r11 instanceof com.whoop.onboarding.story.domain.network.C9615a.h
            if (r1 == 0) goto L15
            r1 = r11
            com.whoop.onboarding.story.domain.network.a$h r1 = (com.whoop.onboarding.story.domain.network.C9615a.h) r1
            int r2 = r1.f28199z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f28199z = r2
            goto L1a
        L15:
            com.whoop.onboarding.story.domain.network.a$h r1 = new com.whoop.onboarding.story.domain.network.a$h
            r1.<init>(r11)
        L1a:
            java.lang.Object r11 = r1.f28197x
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r1.f28199z
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L43
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r10 = r1.f28196w
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Exception -> L30
            goto L6b
        L30:
            r0 = move-exception
            r11 = r0
            goto L8a
        L33:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3b:
            java.lang.Object r10 = r1.f28196w
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)     // Catch: java.lang.Exception -> L30
            goto L5b
        L43:
            p505ts.AbstractC34132o.m107864I(r11)
            java.lang.String r11 = "DEVICE_SETUP_STORY"
            boolean r11 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r11)     // Catch: java.lang.Exception -> L30
            if (r11 == 0) goto L5e
            com.whoop.onboarding.story.domain.network.FeatureEducationApi r11 = r9.api     // Catch: java.lang.Exception -> L30
            r1.f28196w = r10     // Catch: java.lang.Exception -> L30
            r1.f28199z = r5     // Catch: java.lang.Exception -> L30
            java.lang.Object r11 = r11.getFeatureEducationOnboarding(r10, r1)     // Catch: java.lang.Exception -> L30
            if (r11 != r2) goto L5b
            goto L6a
        L5b:
            com.whoop.educationModels.FeatureEducationDto r11 = (com.whoop.educationModels.FeatureEducationDto) r11     // Catch: java.lang.Exception -> L30
            goto L6d
        L5e:
            com.whoop.onboarding.story.domain.network.FeatureEducationApi r11 = r9.api     // Catch: java.lang.Exception -> L30
            r1.f28196w = r10     // Catch: java.lang.Exception -> L30
            r1.f28199z = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r11 = r11.getFeatureEducation(r10, r1)     // Catch: java.lang.Exception -> L30
            if (r11 != r2) goto L6b
        L6a:
            return r2
        L6b:
            com.whoop.educationModels.FeatureEducationDto r11 = (com.whoop.educationModels.FeatureEducationDto) r11     // Catch: java.lang.Exception -> L30
        L6d:
            tr2.n r1 = r9.getLogger()     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r2.<init>(r0)     // Catch: java.lang.Exception -> L30
            r2.append(r10)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L30
            r2 = 0
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r2]     // Catch: java.lang.Exception -> L30
            r1.mo85228t(r0, r2)     // Catch: java.lang.Exception -> L30
            com.whoop.data.remote.commons.Resource$Companion r0 = com.whoop.data.remote.commons.Resource.INSTANCE     // Catch: java.lang.Exception -> L30
            com.whoop.data.remote.commons.Resource r10 = r0.success(r11)     // Catch: java.lang.Exception -> L30
            return r10
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to fetch feature education for "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r3 = r0.toString()
            r9.logRetrofitSuspendException(r11, r3)
            com.whoop.data.remote.commons.Resource$Companion r2 = com.whoop.data.remote.commons.Resource.INSTANCE
            com.whoop.network.exception.DomainException$a r10 = com.whoop.network.exception.DomainException.INSTANCE
            com.whoop.network.exception.DomainException r6 = r10.m23148a(r11)
            r7 = 6
            r8 = 0
            r4 = 0
            r5 = 0
            com.whoop.data.remote.commons.Resource r10 = com.whoop.data.remote.commons.Resource.Companion.error$default(r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.onboarding.story.domain.network.C9615a.m23158g(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m23159i(ArrayList<Integer> arrayList, InterfaceC30057d<? super Boolean> interfaceC30057d) throws Exception {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f28203z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f28203z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM108730a = iVar2.f28201x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar2.f28203z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108730a);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n logger = getLogger();
            InterfaceC31766c crashReporter = getCrashReporter();
            j jVar = new j(arrayList, null);
            iVar2.f28200w = null;
            iVar2.f28203z = 1;
            objM108730a = companion.m108730a(logger, crashReporter, "Error updating selected journal behaviors", jVar, iVar2);
            if (objM108730a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108730a);
        }
        return Boolean.valueOf(((InterfaceC34385a) objM108730a) instanceof InterfaceC34385a.c);
    }
}
