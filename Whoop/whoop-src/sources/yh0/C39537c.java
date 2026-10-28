package yh0;

import c51.C4237n;
import com.whoop.data.repositories.FeatureFlagChecker;
import d51.AbstractC11717e;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import or2.AbstractC28145a1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: yh0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lyh0/c;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lec3/l;", "Lyh0/a;", "upstream", "Lyh0/b;", "c", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39537c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static final int f170095c = 8;

    /* JADX INFO: renamed from: d */
    private static final float f170096d = 34.6f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: yh0.c$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lyh0/c$a;", "", "<init>", "()V", "", "yearsDifference", "Lyh0/d;", "b", "(F)Lyh0/d;", "debugChronologicalAge", "F", "a", "()F", "amoeba_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m126295a() {
            return C39537c.f170096d;
        }

        /* JADX INFO: renamed from: b */
        public final C39538d m126296b(float yearsDifference) {
            return new C39538d(AbstractC39414r.m125866L0(4, String.valueOf(m126295a() + yearsDifference)), "WHOOP AGE", AbstractC18489d0.m53370k(AbstractC39414r.m125866L0(4, String.valueOf(AbstractC28145a1.m85170f(Math.abs(yearsDifference), 0.1f))), " years ", yearsDifference > 0.0f ? "older" : "younger"));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: yh0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.amoeba.debug.domain.AmoebaDebugInteractor$interact$1", m100430f = "AmoebaDebugInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lyh0/b;", "accumulatedResult", "Lyh0/a;", "domainAction", "<anonymous>", "(Lyh0/b;Lyh0/a;)Lyh0/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f170098w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170099x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f170100y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC39536b abstractC39536b, AbstractC39535a abstractC39535a, InterfaceC30057d<? super AbstractC39536b> interfaceC30057d) {
            b bVar = C39537c.this.new b(interfaceC30057d);
            bVar.f170099x = abstractC39536b;
            bVar.f170100y = abstractC39535a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC39536b abstractC39536b = (AbstractC39536b) this.f170099x;
            AbstractC39535a abstractC39535a = (AbstractC39535a) this.f170100y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f170098w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC39535a instanceof AbstractC39535a.a) {
                return C39537c.this.featureFlagChecker.isFeatureEnabled("amoeba-debug-android") ? new AbstractC39536b.c(null, C39537c.INSTANCE.m126296b(0.0f), null, false, 13, null) : AbstractC39536b.a.f170088a;
            }
            if (abstractC39535a instanceof AbstractC39535a.e) {
                if (!(abstractC39536b instanceof AbstractC39536b.c)) {
                    AbstractC39535a.e eVar = (AbstractC39535a.e) abstractC39535a;
                    return new AbstractC39536b.c(new C39539e(0.0f, eVar.getYearsDifference(), false, 5, null), C39537c.INSTANCE.m126296b(eVar.getYearsDifference()), null, false, 12, null);
                }
                AbstractC39536b.c cVar = (AbstractC39536b.c) abstractC39536b;
                AbstractC39535a.e eVar2 = (AbstractC39535a.e) abstractC39535a;
                return new AbstractC39536b.c(C39539e.m126301b(cVar.getHealthspanState(), 0.0f, eVar2.getYearsDifference(), false, 5, null), C39537c.INSTANCE.m126296b(eVar2.getYearsDifference()), cVar.getHealthspanState(), false, 8, null);
            }
            if (abstractC39535a instanceof AbstractC39535a.c) {
                if (!(abstractC39536b instanceof AbstractC39536b.c)) {
                    return new AbstractC39536b.c(new C39539e(((AbstractC39535a.c) abstractC39535a).getPaceOfAging(), 0.0f, false, 6, null), C39537c.INSTANCE.m126296b(0.0f), null, false, 12, null);
                }
                AbstractC39536b.c cVar2 = (AbstractC39536b.c) abstractC39536b;
                return new AbstractC39536b.c(C39539e.m126301b(cVar2.getHealthspanState(), ((AbstractC39535a.c) abstractC39535a).getPaceOfAging(), 0.0f, false, 6, null), C39537c.INSTANCE.m126296b(cVar2.getHealthspanState().getYearsDifference()), cVar2.getHealthspanState(), false, 8, null);
            }
            if (!(abstractC39535a instanceof AbstractC39535a.b)) {
                if (abstractC39535a instanceof AbstractC39535a.d) {
                    return new AbstractC39536b.c(new C39539e(0.0f, 0.0f, true, 3, null), C39537c.INSTANCE.m126296b(0.0f), null, false, 12, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            C4237n.Companion companion = C4237n.INSTANCE;
            C39539e c39539e = new C39539e(AbstractC11717e.m31315d(companion.m13214b()), AbstractC11717e.m31315d(companion.m13213a()), false, 4, null);
            if (abstractC39536b instanceof AbstractC39536b.c) {
                return new AbstractC39536b.c(c39539e, C39537c.INSTANCE.m126296b(c39539e.getYearsDifference()), ((AbstractC39536b.c) abstractC39536b).getHealthspanState(), true);
            }
            return new AbstractC39536b.c(c39539e, C39537c.INSTANCE.m126296b(c39539e.getYearsDifference()), null, false, 12, null);
        }
    }

    public C39537c(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m126294c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC39536b.b.f170089a, upstream, new b(null));
    }
}
