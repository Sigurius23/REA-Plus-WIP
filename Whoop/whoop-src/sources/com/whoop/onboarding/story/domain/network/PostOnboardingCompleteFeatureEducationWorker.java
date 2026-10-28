package com.whoop.onboarding.story.domain.network;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.educationModels.CompleteFeatureEducationBody;
import com.whoop.metrics.worker.BaseReportingWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import of3.InterfaceC27903a;
import p031b9.AbstractC2875y;
import p218ic.AbstractC18377p0;
import p218ic.AbstractC18386u;
import p218ic.C18347a0;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18380r;
import p218ic.C18382s;
import p218ic.C18392z;
import p218ic.EnumC18346a;
import p218ic.EnumC18368l;
import p218ic.EnumC18390x;
import p218ic.InterfaceC18355e0;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import w02.AbstractC36685b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "z", "Ll83/h;", "k", "()Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;", "api", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "E", "m", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lrr2/c;", "F", "l", "()Lrr2/c;", "crashReporter", "G", "a", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PostOnboardingCompleteFeatureEducationWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h api;

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.PostOnboardingCompleteFeatureEducationWorker$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;", "", "<init>", "()V", "", "featureId", "Lic/a0;", "a", "(I)Lic/a0;", "Lic/p0;", "workManager", "Lic/e0;", "b", "(Lic/p0;I)Lic/e0;", "", "TAG", "Ljava/lang/String;", "KEY_ID", "onboarding-story-domain_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final C18347a0 m23153a(int featureId) {
            EnumC18390x enumC18390x = EnumC18390x.f71560w;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            EnumC18390x enumC18390x2 = EnumC18390x.f71561x;
            C31222e c31222e = new C31222e(null);
            TimeUnit timeUnit = TimeUnit.HOURS;
            AbstractC22676k.m65750j(timeUnit, "timeUnit");
            C18354e c18354e = new C18354e(c31222e, enumC18390x2, false, false, false, false, -1L, timeUnit.toMillis(1L), AbstractC25265s.m74103I1(linkedHashSet));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("featureId", Integer.valueOf(featureId));
            C18358g c18358g = new C18358g(linkedHashMap);
            AbstractC29125c.m88515X(c18358g);
            return (C18347a0) ((C18392z) ((C18392z) ((C18392z) new C18392z(PostOnboardingCompleteFeatureEducationWorker.class).m52882h(c18358g)).m52880f(c18354e)).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC18355e0 m23154b(AbstractC18377p0 workManager, int featureId) {
            AbstractC22676k.m65750j(workManager, "workManager");
            return workManager.m52876e("post-onboarding-complete-feature-education-work", EnumC18368l.f71503w, m23153a(featureId));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.PostOnboardingCompleteFeatureEducationWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9611b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28165w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28166x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28167y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9611b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28165w = interfaceC27903a;
            this.f28166x = interfaceC35951a;
            this.f28167y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.onboarding.story.domain.network.FeatureEducationApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureEducationApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f28165w;
            InterfaceC35951a interfaceC35951a = this.f28166x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28167y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureEducationApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.PostOnboardingCompleteFeatureEducationWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9612c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28168w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28169x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28170y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9612c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28168w = interfaceC27903a;
            this.f28169x = interfaceC35951a;
            this.f28170y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f28168w;
            InterfaceC35951a interfaceC35951a = this.f28169x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28170y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.PostOnboardingCompleteFeatureEducationWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9613d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28171w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28172x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28173y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9613d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28171w = interfaceC27903a;
            this.f28172x = interfaceC35951a;
            this.f28173y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            InterfaceC27903a interfaceC27903a = this.f28171w;
            InterfaceC35951a interfaceC35951a = this.f28172x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28173y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.onboarding.story.domain.network.PostOnboardingCompleteFeatureEducationWorker$e */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.domain.network.PostOnboardingCompleteFeatureEducationWorker", m100430f = "PostOnboardingCompleteFeatureEducationWorker.kt", m100431l = {37}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9614e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28174E;

        /* JADX INFO: renamed from: w */
        int f28175w;

        /* JADX INFO: renamed from: x */
        Object f28176x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28177y;

        public C9614e(InterfaceC30057d<? super C9614e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28177y = obj;
            this.f28174E |= Integer.MIN_VALUE;
            return PostOnboardingCompleteFeatureEducationWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostOnboardingCompleteFeatureEducationWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PostOnboardingCompleteFeatureEducationWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.api = AbstractC30060g.m92087G(enumC23463i, new C9611b(this, null, null));
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C9612c(this, null, null));
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C9613d(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final FeatureEducationApi m23150k() {
        return (FeatureEducationApi) this.api.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC31766c m23151l() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final OnboardingStatusChecker m23152m() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public Object mo18568j(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        C9614e c9614e;
        int i13;
        if (interfaceC30057d instanceof C9614e) {
            c9614e = (C9614e) interfaceC30057d;
            int i14 = c9614e.f28174E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c9614e.f28174E = i14 - Integer.MIN_VALUE;
            } else {
                c9614e = new C9614e(interfaceC30057d);
            }
        } else {
            c9614e = new C9614e(interfaceC30057d);
        }
        Object obj = c9614e.f28177y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c9614e.f28174E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            Object obj2 = getInputData().f71480a.get("featureId");
            int iIntValue = ((Number) (obj2 instanceof Integer ? obj2 : -1)).intValue();
            if (iIntValue == -1) {
                return new C18380r();
            }
            CompleteFeatureEducationBody completeFeatureEducationBody = new CompleteFeatureEducationBody(iIntValue, true);
            FeatureEducationApi featureEducationApiM23150k = m23150k();
            c9614e.f28176x = null;
            c9614e.f28175w = iIntValue;
            c9614e.f28174E = 1;
            Object objCompleteFeatureEducation = featureEducationApiM23150k.completeFeatureEducation(completeFeatureEducationBody, c9614e);
            if (objCompleteFeatureEducation == enumC31071a) {
                return enumC31071a;
            }
            i13 = iIntValue;
            obj = objCompleteFeatureEducation;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = c9614e.f28175w;
            AbstractC34132o.m107864I(obj);
        }
        try {
            if (((C29218v0) obj).f118269a.f146788Q) {
                m23152m().retriggerOnboardingFetch();
            }
            return AbstractC18386u.m52885b();
        } catch (Exception e5) {
            AbstractC36685b.m117759a(e5, AbstractC2875y.m8295h(i13, "Failed to post feature education update for id "), m22895c(), m23151l());
            return new C18382s();
        }
    }
}
