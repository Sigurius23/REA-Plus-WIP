package j12;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatus;
import com.whoop.data.onboarding.OnboardingStatusDao;
import com.whoop.onboarding.overlay.domain.GetOnboardingOverlays;
import com.whoop.onboarding.overlay.model.FeatureOnboardingOverlayModel;
import com.whoop.onboarding.overlay.model.FeatureOnboardingOverlayModelKt;
import com.whoop.onboarding.overlay.model.OnboardingStep;
import com.whoop.onboarding.story.domain.network.C9615a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.C21462d0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import k12.AbstractC22125a;
import k12.C22126b;
import l83.C23454a0;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import wb3.AbstractC37056f;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: j12.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001:\u0001*BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0018H\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m65681d2 = {"Lj12/b;", "", "Ltr2/n;", "logger", "Lnm0/e;", "cachedApiSource", "Lbc3/c0;", "externalScope", "Lcom/whoop/onboarding/story/domain/network/a;", "onboardingStoryRepository", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "onboardingStatusDao", "Lfi0/a;", "baseAnalytics", "Lu92/d;", "prefsStore", "<init>", "(Ltr2/n;Lnm0/e;Lbc3/c0;Lcom/whoop/onboarding/story/domain/network/a;Lcom/whoop/data/onboarding/OnboardingStatusDao;Lfi0/a;Lu92/d;)V", "Lk12/b;", "domainResult", "m", "(Lk12/b;)Lk12/b;", "", "educationKey", "Lec3/l;", "", "i", "(Ljava/lang/String;)Lec3/l;", "", "lastStep", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "featureOnboardingOverlayModel", "k", "(ILcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)Lk12/b;", "featureEducationId", "Ll83/a0;", "l", "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)V", "Lk12/a;", "upstream", "j", "(Lec3/l;)Lec3/l;", "a", "Ltr2/n;", "b", "Lnm0/e;", "c", "Lbc3/c0;", "d", "Lcom/whoop/onboarding/story/domain/network/a;", "e", "Lcom/whoop/data/onboarding/OnboardingStatusDao;", "f", "Lfi0/a;", "g", "Lu92/d;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21217b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC2994c0 externalScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9615a onboardingStoryRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final OnboardingStatusDao onboardingStatusDao;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: j12.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m65681d2 = {"Lj12/b$a;", "", "<init>", "()V", "c", "b", "a", "Lj12/b$a$a;", "Lj12/b$a$b;", "Lj12/b$a$c;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: j12.b$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj12/b$a$a;", "Lj12/b$a;", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "overlay", "<init>", "(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "()Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41816a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final FeatureOnboardingOverlayModel overlay;

            public C41816a(FeatureOnboardingOverlayModel featureOnboardingOverlayModel) {
                super(null);
                this.overlay = featureOnboardingOverlayModel;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final FeatureOnboardingOverlayModel getOverlay() {
                return this.overlay;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41816a) && AbstractC22676k.m65745e(this.overlay, ((C41816a) other).overlay);
            }

            public int hashCode() {
                FeatureOnboardingOverlayModel featureOnboardingOverlayModel = this.overlay;
                if (featureOnboardingOverlayModel == null) {
                    return 0;
                }
                return featureOnboardingOverlayModel.hashCode();
            }

            public String toString() {
                return "Display(overlay=" + this.overlay + ")";
            }
        }

        /* JADX INFO: renamed from: j12.b$a$b */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj12/b$a$b;", "Lj12/b$a;", "<init>", "()V", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f80925a = new b();

            private b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: j12.b$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lj12/b$a$c;", "Lj12/b$a;", "<init>", "()V", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f80926a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: j12.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f80927w;

        /* JADX INFO: renamed from: j12.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f80928w;

            /* JADX INFO: renamed from: j12.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$alreadyCompletedFlow$$inlined$map$1$2", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41817a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f80929E;

                /* JADX INFO: renamed from: F */
                Object f80930F;

                /* JADX INFO: renamed from: G */
                Object f80931G;

                /* JADX INFO: renamed from: H */
                int f80932H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f80933w;

                /* JADX INFO: renamed from: x */
                int f80934x;

                /* JADX INFO: renamed from: y */
                Object f80935y;

                public C41817a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f80933w = obj;
                    this.f80934x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f80928w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41817a c41817a;
                if (interfaceC30057d instanceof C41817a) {
                    c41817a = (C41817a) interfaceC30057d;
                    int i13 = c41817a.f80934x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41817a.f80934x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41817a = new C41817a(interfaceC30057d);
                    }
                } else {
                    c41817a = new C41817a(interfaceC30057d);
                }
                Object obj2 = c41817a.f80933w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41817a.f80934x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f80928w;
                    Boolean boolValueOf = Boolean.valueOf(AbstractC22676k.m65745e((Boolean) obj, Boolean.TRUE));
                    c41817a.f80935y = null;
                    c41817a.f80929E = null;
                    c41817a.f80930F = null;
                    c41817a.f80931G = null;
                    c41817a.f80932H = 0;
                    c41817a.f80934x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c41817a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC13058l interfaceC13058l) {
            this.f80927w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f80927w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j12.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$alreadyCompletedFlow$2", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {101}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "", "", "e", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ FeatureEducationType f80937E;

        /* JADX INFO: renamed from: w */
        int f80938w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f80939x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f80940y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FeatureEducationType featureEducationType, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f80937E = featureEducationType;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = C21217b.this.new c(this.f80937E, interfaceC30057d);
            cVar.f80939x = interfaceC13062m;
            cVar.f80940y = th3;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f80939x;
            Throwable th3 = (Throwable) this.f80940y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80938w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21217b.this.logger.mo85230v("failed to check local completion state of " + this.f80937E, th3, new AbstractC30556a.a[0]);
                Boolean bool = Boolean.FALSE;
                this.f80939x = null;
                this.f80940y = null;
                this.f80938w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: j12.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$$inlined$flatMapLatest$1", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f80942w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f80943x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f80944y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21217b f80945z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C21217b c21217b) {
            super(3, interfaceC30057d);
            this.f80945z = c21217b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC22125a abstractC22125a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f80945z);
            dVar.f80943x = interfaceC13062m;
            dVar.f80944y = abstractC22125a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM36590P;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80942w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f80943x;
                AbstractC22125a abstractC22125a = (AbstractC22125a) this.f80944y;
                if (AbstractC22676k.m65745e(abstractC22125a, AbstractC22125a.c.f85844a)) {
                    interfaceC13058lM36590P = new C0456u(a.c.f80926a, 1);
                } else if (AbstractC22676k.m65745e(abstractC22125a, AbstractC22125a.a.f85842a)) {
                    interfaceC13058lM36590P = new C0456u(a.b.f80925a, 1);
                } else {
                    if (!(abstractC22125a instanceof AbstractC22125a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM36590P = AbstractC13091v.m36590P(this.f80945z.m59526i(((AbstractC22125a.b) abstractC22125a).getEducationKey()), new f(null, this.f80945z, abstractC22125a));
                }
                this.f80943x = null;
                this.f80944y = null;
                this.f80942w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM36590P, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC22125a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: j12.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$2", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lk12/b;", "domainResult", "Lj12/b$a;", "action", "<anonymous>", "(Lk12/b;Lj12/b$a;)Lk12/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f80946w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f80947x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f80948y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C22126b c22126b, a aVar, InterfaceC30057d<? super C22126b> interfaceC30057d) {
            e eVar = C21217b.this.new e(interfaceC30057d);
            eVar.f80947x = c22126b;
            eVar.f80948y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22126b c22126b = (C22126b) this.f80947x;
            a aVar = (a) this.f80948y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f80946w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.C41816a) {
                return new C22126b(((a.C41816a) aVar).getOverlay(), 0, 2, null);
            }
            if (AbstractC22676k.m65745e(aVar, a.b.f80925a)) {
                return C21217b.this.m59529m(c22126b);
            }
            if (AbstractC22676k.m65745e(aVar, a.c.f80926a)) {
                return new C22126b(null, 0, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: j12.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$lambda$0$$inlined$flatMapLatest$1", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC22125a f80950E;

        /* JADX INFO: renamed from: w */
        int f80951w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f80952x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f80953y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21217b f80954z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, C21217b c21217b, AbstractC22125a abstractC22125a) {
            super(3, interfaceC30057d);
            this.f80954z = c21217b;
            this.f80950E = abstractC22125a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f80954z, this.f80950E);
            fVar.f80952x = interfaceC13062m;
            fVar.f80953y = bool;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80951w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f80952x;
                InterfaceC13058l c0456u = ((Boolean) this.f80953y).booleanValue() ? new C0456u(new a.C41816a(null), 1) : new h(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(GetOnboardingOverlays.INSTANCE, 1), null, null, 3, null), new g(null, this.f80954z.cachedApiSource)), this.f80950E);
                this.f80952x = null;
                this.f80953y = null;
                this.f80951w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: j12.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$lambda$0$0$$inlined$cacheAPI$1", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f80955w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f80956x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f80957y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f80958z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f80958z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f80958z);
            gVar.f80956x = interfaceC13062m;
            gVar.f80957y = c26832c;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80955w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f80956x;
                C26832c c26832c = (C26832c) this.f80957y;
                InterfaceC26834e interfaceC26834e = this.f80958z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                C21462d0 c21462d0 = C21462d0.f82423c;
                InterfaceC21456a0 interfaceC21456a0M65690c = AbstractC22671h0.m65690c(AbstractC37978j.m121626I(AbstractC22671h0.m65691d(String.class)), AbstractC37978j.m121626I(AbstractC22671h0.m65691d(FeatureOnboardingOverlayModel.class)));
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(Map.class), interfaceC21456a0M65690c, AbstractC21478l0.m60396B(interfaceC21456a0M65690c)));
                this.f80956x = null;
                this.f80957y = null;
                this.f80955w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lMo80083a, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C26832c<C23454a0>) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: j12.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f80959w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC22125a f80960x;

        /* JADX INFO: renamed from: j12.b$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f80961w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ AbstractC22125a f80962x;

            /* JADX INFO: renamed from: j12.b$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$lambda$0$0$$inlined$map$1$2", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41818a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f80963E;

                /* JADX INFO: renamed from: F */
                Object f80964F;

                /* JADX INFO: renamed from: G */
                Object f80965G;

                /* JADX INFO: renamed from: H */
                int f80966H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f80967w;

                /* JADX INFO: renamed from: x */
                int f80968x;

                /* JADX INFO: renamed from: y */
                Object f80969y;

                public C41818a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f80967w = obj;
                    this.f80968x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, AbstractC22125a abstractC22125a) {
                this.f80961w = interfaceC13062m;
                this.f80962x = abstractC22125a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41818a c41818a;
                a.C41816a c41816a;
                if (interfaceC30057d instanceof C41818a) {
                    c41818a = (C41818a) interfaceC30057d;
                    int i13 = c41818a.f80968x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41818a.f80968x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41818a = new C41818a(interfaceC30057d);
                    }
                } else {
                    c41818a = new C41818a(interfaceC30057d);
                }
                Object obj2 = c41818a.f80967w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41818a.f80968x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f80961w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a) {
                        c41816a = new a.C41816a(FeatureOnboardingOverlayModelKt.modelForKey((Map) ((InterfaceC29354a.a) interfaceC29354a).getData(), ((AbstractC22125a.b) this.f80962x).getEducationKey()));
                    } else {
                        c41816a = interfaceC29354a instanceof InterfaceC29354a.d ? new a.C41816a(FeatureOnboardingOverlayModelKt.modelForKey((Map) ((InterfaceC29354a.d) interfaceC29354a).getData(), ((AbstractC22125a.b) this.f80962x).getEducationKey())) : new a.C41816a(null);
                    }
                    c41818a.f80969y = null;
                    c41818a.f80963E = null;
                    c41818a.f80964F = null;
                    c41818a.f80965G = null;
                    c41818a.f80966H = 0;
                    c41818a.f80968x = 1;
                    if (interfaceC13062m.emit(c41816a, c41818a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public h(InterfaceC13058l interfaceC13058l, AbstractC22125a abstractC22125a) {
            this.f80959w = interfaceC13058l;
            this.f80960x = abstractC22125a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f80959w.collect(new a(interfaceC13062m, this.f80960x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j12.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$markCompleted$1", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {119}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f80971w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ FeatureOnboardingOverlayModel f80972x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21217b f80973y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FeatureOnboardingOverlayModel featureOnboardingOverlayModel, C21217b c21217b, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f80972x = featureOnboardingOverlayModel;
            this.f80973y = c21217b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f80972x, this.f80973y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80971w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (FeatureOnboardingOverlayModelKt.getFeatureEducationType(this.f80972x) == FeatureEducationType.INTRADAY_JOURNAL_ONBOARDING || FeatureOnboardingOverlayModelKt.getFeatureEducationType(this.f80972x) == FeatureEducationType.INTRADAY_JOURNAL_ONBOARDING_WITH_YESTERDAY) {
                    this.f80973y.baseAnalytics.mo41424f("Recording Data", "Complete", null, "Journal - Intraday Onboarding");
                }
                this.f80973y.m59528l(this.f80972x);
                C9615a c9615a = this.f80973y.onboardingStoryRepository;
                int featureId = (int) this.f80972x.getFeatureId();
                this.f80971w = 1;
                if (c9615a.m23157f(featureId, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: j12.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$markCompleted$2", m100430f = "OnboardingOverlayInteractor.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C21217b f80974E;

        /* JADX INFO: renamed from: w */
        Object f80975w;

        /* JADX INFO: renamed from: x */
        Object f80976x;

        /* JADX INFO: renamed from: y */
        int f80977y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ FeatureOnboardingOverlayModel f80978z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(FeatureOnboardingOverlayModel featureOnboardingOverlayModel, C21217b c21217b, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f80978z = featureOnboardingOverlayModel;
            this.f80974E = c21217b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f80978z, this.f80974E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            FeatureEducationType featureEducationType;
            Exception e5;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80977y;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                FeatureEducationType featureEducationType2 = FeatureOnboardingOverlayModelKt.getFeatureEducationType(this.f80978z);
                if (featureEducationType2 == null) {
                    this.f80974E.logger.mo85222m(AbstractC11266d.m30461o("completed unknown feature education ", this.f80978z.getFeatureEducationName()), new AbstractC30556a.a[0]);
                    return c23454a0;
                }
                OnboardingStatus onboardingStatus = new OnboardingStatus(featureEducationType2, true);
                try {
                    OnboardingStatusDao onboardingStatusDao = this.f80974E.onboardingStatusDao;
                    this.f80975w = featureEducationType2;
                    this.f80976x = null;
                    this.f80977y = 1;
                    if (onboardingStatusDao.updateTable(onboardingStatus, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } catch (Exception e13) {
                    featureEducationType = featureEducationType2;
                    e5 = e13;
                    this.f80974E.logger.mo85230v("Failed to insert new value for " + featureEducationType, e5, new AbstractC30556a.a[0]);
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                featureEducationType = (FeatureEducationType) this.f80975w;
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Exception e14) {
                    e5 = e14;
                    this.f80974E.logger.mo85230v("Failed to insert new value for " + featureEducationType, e5, new AbstractC30556a.a[0]);
                }
            }
            return c23454a0;
        }
    }

    public C21217b(InterfaceC34116n logger, InterfaceC26834e cachedApiSource, InterfaceC2994c0 externalScope, C9615a onboardingStoryRepository, OnboardingStatusDao onboardingStatusDao, InterfaceC14515a baseAnalytics, C34660d prefsStore) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(externalScope, "externalScope");
        AbstractC22676k.m65750j(onboardingStoryRepository, "onboardingStoryRepository");
        AbstractC22676k.m65750j(onboardingStatusDao, "onboardingStatusDao");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        this.logger = logger;
        this.cachedApiSource = cachedApiSource;
        this.externalScope = externalScope;
        this.onboardingStoryRepository = onboardingStoryRepository;
        this.onboardingStatusDao = onboardingStatusDao;
        this.baseAnalytics = baseAnalytics;
        this.prefsStore = prefsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX INFO: renamed from: i */
    public final InterfaceC13058l m59526i(String educationKey) {
        for (FeatureEducationType featureEducationType : FeatureEducationType.values()) {
            if (AbstractC22676k.m65745e(featureEducationType.name(), educationKey)) {
                return featureEducationType == null ? new C0456u(Boolean.FALSE, 1) : AbstractC13091v.m36610t(new C13015a0(new b(this.onboardingStatusDao.isCompletedFlow(featureEducationType)), new c(featureEducationType, null)));
            }
        }
        featureEducationType = null;
        if (featureEducationType == null) {
        }
    }

    /* JADX INFO: renamed from: k */
    private final C22126b m59527k(int lastStep, FeatureOnboardingOverlayModel featureOnboardingOverlayModel) {
        AbstractC3006f0.m8732z(this.externalScope, null, null, new i(featureOnboardingOverlayModel, this, null), 3);
        AbstractC3006f0.m8732z(this.externalScope, null, null, new j(featureOnboardingOverlayModel, this, null), 3);
        return new C22126b(null, lastStep);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final void m59528l(FeatureOnboardingOverlayModel featureEducationId) {
        if (AbstractC22676k.m65745e(featureEducationId.getFeatureEducationName(), "COACH_ONBOARDING")) {
            this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_COACH_COMPLETED, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C22126b m59529m(C22126b domainResult) {
        List<OnboardingStep> steps;
        FeatureOnboardingOverlayModel overlay = domainResult.getOverlay();
        Integer numValueOf = (overlay == null || (steps = overlay.getSteps()) == null) ? null : Integer.valueOf(AbstractC37056f.m118951C(steps));
        return (numValueOf != null && numValueOf.intValue() == domainResult.getLastStepCompleted() + 1) ? m59527k(numValueOf.intValue(), overlay) : C22126b.m63364b(domainResult, null, domainResult.getLastStepCompleted() + 1, 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC13058l m59530j(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new C22126b(null, 0, 3, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new e(null));
    }

    public /* synthetic */ C21217b(InterfaceC34116n interfaceC34116n, InterfaceC26834e interfaceC26834e, InterfaceC2994c0 interfaceC2994c0, C9615a c9615a, OnboardingStatusDao onboardingStatusDao, InterfaceC14515a interfaceC14515a, C34660d c34660d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OnboardingOverlayInteractor") : interfaceC34116n, interfaceC26834e, interfaceC2994c0, c9615a, onboardingStatusDao, interfaceC14515a, c34660d);
    }
}
