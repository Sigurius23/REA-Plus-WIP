package gc0;

import bm.C3383g;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.HormonalContextSaveRequest;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.GetHormonalContextRequest;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextResponse;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreen;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenId;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenSerializerKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import l83.C23454a0;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25265s;
import m83.C25271y;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pm0.AbstractC29355b;
import pm0.InterfaceC29354a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sm0.AbstractC32714a;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gc0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J \u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b*\u0010(J%\u0010/\u001a\u00020.2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b/\u00100J#\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030&2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, m65681d2 = {"Lgc0/d;", "Lod1/g;", "Lgc0/a;", "Lgc0/c;", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lnm0/e;Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lgc0/a$b;", "action", "previousState", "p", "(Lgc0/a$b;Lgc0/c;Lq83/d;)Ljava/lang/Object;", "o", "(Lgc0/c;)Lgc0/c;", "t", "(Lgc0/c;Lq83/d;)Ljava/lang/Object;", "u", "Lgc0/b;", "saveRequest", "Lgc0/e;", "progressResult", "s", "(Lgc0/b;Lgc0/e;Lq83/d;)Ljava/lang/Object;", "previousData", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "currentScreenId", "content", "l", "(Lgc0/b;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Lgc0/b;)Lgc0/b;", "", "testId", "Lec3/l;", "r", "(Ljava/lang/String;)Lec3/l;", "m", "n", "Lpm0/a$c;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;", "cacheResult", "Lgc0/c$a;", "q", "(Lpm0/a$c;Ljava/lang/String;)Lgc0/c$a;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lnm0/e;", "b", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15707d implements InterfaceC27844g<AbstractC15704a, AbstractC15706c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: gc0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lgc0/d$a;", "", "<init>", "()V", "a", "b", "Lgc0/d$a$a;", "Lgc0/d$a$b;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: gc0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgc0/d$a$a;", "Lgc0/d$a;", "Lgc0/c;", "result", "<init>", "(Lgc0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgc0/c;", "()Lgc0/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41633a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC15706c result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41633a(AbstractC15706c result) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC15706c getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C41633a) && AbstractC22676k.m65745e(this.result, ((C41633a) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "DataLoaded(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: gc0.d$a$b */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgc0/d$a$b;", "Lgc0/d$a;", "Lgc0/a;", "action", "<init>", "(Lgc0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgc0/a;", "()Lgc0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC15704a action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC15704a action) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC15704a getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && AbstractC22676k.m65745e(this.action, ((b) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "HandleDomainAction(action=" + this.action + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: gc0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59060a;

        static {
            int[] iArr = new int[HormonalContextScreenId.values().length];
            try {
                iArr[HormonalContextScreenId.LIFE_STAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalContextScreenId.CONTRACEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalContextScreenId.TEST_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalContextScreenId.LAST_PERIOD_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalContextScreenId.CALCULATED_CYCLE_PHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalContextScreenId.CHANGE_CYCLE_PHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalContextScreenId.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f59060a = iArr;
        }
    }

    /* JADX INFO: renamed from: gc0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$fetchCachedData$$inlined$cacheAPI$1", m100430f = "HormonalContextInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f59061w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f59062x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f59063y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f59064z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f59064z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f59064z);
            cVar.f59062x = interfaceC13062m;
            cVar.f59063y = c26832c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59061w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f59062x;
                C26832c c26832c = (C26832c) this.f59063y;
                InterfaceC26834e interfaceC26834e = this.f59064z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(HormonalContextResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(HormonalContextResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f59062x = null;
                this.f59063y = null;
                this.f59061w = 1;
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

    /* JADX INFO: renamed from: gc0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59065w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f59066x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15707d f59067y;

        /* JADX INFO: renamed from: gc0.d$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59068w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ String f59069x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C15707d f59070y;

            /* JADX INFO: renamed from: gc0.d$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$fetchCachedData$$inlined$map$1$2", m100430f = "HormonalContextInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41634a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59071E;

                /* JADX INFO: renamed from: F */
                Object f59072F;

                /* JADX INFO: renamed from: G */
                Object f59073G;

                /* JADX INFO: renamed from: H */
                int f59074H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59075w;

                /* JADX INFO: renamed from: x */
                int f59076x;

                /* JADX INFO: renamed from: y */
                Object f59077y;

                public C41634a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59075w = obj;
                    this.f59076x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, String str, C15707d c15707d) {
                this.f59068w = interfaceC13062m;
                this.f59069x = str;
                this.f59070y = c15707d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41634a c41634a;
                Object objM44218q;
                AbstractC15706c.f fVar;
                HormonalContextScreenId hormonalContextScreenId;
                String id4;
                HormonalContextScreenId hormonalContextScreenId2;
                String id5;
                HormonalContextScreenId hormonalContextScreenId3;
                String id6;
                if (interfaceC30057d instanceof C41634a) {
                    c41634a = (C41634a) interfaceC30057d;
                    int i13 = c41634a.f59076x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41634a.f59076x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41634a = new C41634a(interfaceC30057d);
                    }
                } else {
                    c41634a = new C41634a(interfaceC30057d);
                }
                Object obj2 = c41634a.f59075w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41634a.f59076x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59068w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.e) {
                        objM44218q = AbstractC15706c.b.f59044a;
                    } else {
                        if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                            InterfaceC29354a.a.b bVar = (InterfaceC29354a.a.b) interfaceC29354a;
                            HormonalContextResponse hormonalContextResponse = (HormonalContextResponse) bVar.getData();
                            HormonalContextScreen hormonalContextScreen = (HormonalContextScreen) AbstractC25265s.m74100H0(((HormonalContextResponse) bVar.getData()).getIntakeScreens());
                            if (hormonalContextScreen == null || (id6 = hormonalContextScreen.getId()) == null || (hormonalContextScreenId3 = HormonalContextScreenSerializerKt.toHormonalContextScreenId(id6)) == null) {
                                hormonalContextScreenId3 = HormonalContextScreenId.LIFE_STAGE;
                            }
                            fVar = new AbstractC15706c.f(hormonalContextResponse, new C15708e(hormonalContextScreenId3, null, 2, null), new C15705b(this.f59069x, null, null, null, null, null, 62, null), false, 8, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                            InterfaceC29354a.a.C42173a c42173a = (InterfaceC29354a.a.C42173a) interfaceC29354a;
                            HormonalContextResponse hormonalContextResponse2 = (HormonalContextResponse) c42173a.getData();
                            HormonalContextScreen hormonalContextScreen2 = (HormonalContextScreen) AbstractC25265s.m74100H0(((HormonalContextResponse) c42173a.getData()).getIntakeScreens());
                            if (hormonalContextScreen2 == null || (id5 = hormonalContextScreen2.getId()) == null || (hormonalContextScreenId2 = HormonalContextScreenSerializerKt.toHormonalContextScreenId(id5)) == null) {
                                hormonalContextScreenId2 = HormonalContextScreenId.LIFE_STAGE;
                            }
                            fVar = new AbstractC15706c.f(hormonalContextResponse2, new C15708e(hormonalContextScreenId2, null, 2, null), new C15705b(this.f59069x, null, null, null, null, null, 62, null), false, 8, null);
                        } else if (interfaceC29354a instanceof InterfaceC29354a.d) {
                            InterfaceC29354a.d dVar = (InterfaceC29354a.d) interfaceC29354a;
                            HormonalContextResponse hormonalContextResponse3 = (HormonalContextResponse) dVar.getData();
                            HormonalContextScreen hormonalContextScreen3 = (HormonalContextScreen) AbstractC25265s.m74100H0(((HormonalContextResponse) dVar.getData()).getIntakeScreens());
                            if (hormonalContextScreen3 == null || (id4 = hormonalContextScreen3.getId()) == null || (hormonalContextScreenId = HormonalContextScreenSerializerKt.toHormonalContextScreenId(id4)) == null) {
                                hormonalContextScreenId = HormonalContextScreenId.LIFE_STAGE;
                            }
                            fVar = new AbstractC15706c.f(hormonalContextResponse3, new C15708e(hormonalContextScreenId, null, 2, null), new C15705b(this.f59069x, null, null, null, null, null, 62, null), false, 8, null);
                        } else {
                            if (!(interfaceC29354a instanceof InterfaceC29354a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            objM44218q = this.f59070y.m44218q((InterfaceC29354a.c) interfaceC29354a, this.f59069x);
                        }
                        objM44218q = fVar;
                    }
                    c41634a.f59077y = null;
                    c41634a.f59071E = null;
                    c41634a.f59072F = null;
                    c41634a.f59073G = null;
                    c41634a.f59074H = 0;
                    c41634a.f59076x = 1;
                    if (interfaceC13062m.emit(objM44218q, c41634a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, String str, C15707d c15707d) {
            this.f59065w = interfaceC13058l;
            this.f59066x = str;
            this.f59067y = c15707d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59065w.collect(new a(interfaceC13062m, this.f59066x, this.f59067y), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gc0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59079w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15707d f59080x;

        /* JADX INFO: renamed from: gc0.d$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59081w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15707d f59082x;

            /* JADX INFO: renamed from: gc0.d$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$getHormonalContext$$inlined$map$1$2", m100430f = "HormonalContextInteractor.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41635a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59083E;

                /* JADX INFO: renamed from: F */
                Object f59084F;

                /* JADX INFO: renamed from: G */
                Object f59085G;

                /* JADX INFO: renamed from: H */
                Object f59086H;

                /* JADX INFO: renamed from: I */
                Object f59087I;

                /* JADX INFO: renamed from: J */
                Object f59088J;

                /* JADX INFO: renamed from: K */
                int f59089K;

                /* JADX INFO: renamed from: L */
                int f59090L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59091w;

                /* JADX INFO: renamed from: x */
                int f59092x;

                /* JADX INFO: renamed from: y */
                Object f59093y;

                public C41635a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59091w = obj;
                    this.f59092x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15707d c15707d) {
                this.f59081w = interfaceC13062m;
                this.f59082x = c15707d;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0018  */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0111, code lost:
            
                if (r5.emit(r4, r8) == r2) goto L36;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r23, q83.InterfaceC30057d r24) {
                /*
                    Method dump skipped, instruction units count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: gc0.C15707d.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public e(InterfaceC13058l interfaceC13058l, C15707d c15707d) {
            this.f59079w = interfaceC13058l;
            this.f59080x = c15707d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59079w.collect(new a(interfaceC13062m, this.f59080x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gc0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$getHormonalContext$1$response$1", m100430f = "HormonalContextInteractor.kt", m100431l = {313}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f59095w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f59097y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f59097y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15707d.this.new f(this.f59097y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59095w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C15707d.this.api;
            String str = this.f59097y;
            this.f59095w = 1;
            Object hormonalContext = advancedLabsApi.getHormonalContext(str, this);
            return hormonalContext == enumC31071a ? enumC31071a : hormonalContext;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HormonalContextResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: gc0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HormonalContextInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f59098w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f59099x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f59100y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C15707d f59101z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C15707d c15707d) {
            super(3, interfaceC30057d);
            this.f59101z = c15707d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC15704a abstractC15704a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f59101z);
            gVar.f59099x = interfaceC13062m;
            gVar.f59100y = abstractC15704a;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c3383g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59098w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f59099x;
                AbstractC15704a abstractC15704a = (AbstractC15704a) this.f59100y;
                if (abstractC15704a instanceof AbstractC15704a.c) {
                    c3383g = new i(this.f59101z.m44219r(((AbstractC15704a.c) abstractC15704a).getTestId()));
                } else if (abstractC15704a instanceof AbstractC15704a.e) {
                    c3383g = new C3383g(new a.b[]{new a.b(AbstractC15704a.f.f59036a), new a.b(abstractC15704a)}, 3);
                } else if ((abstractC15704a instanceof AbstractC15704a.b) && ((AbstractC15704a.b) abstractC15704a).getNextScreenId() == null) {
                    c3383g = new C3383g(new a.b[]{new a.b(AbstractC15704a.f.f59036a), new a.b(abstractC15704a)}, 3);
                } else {
                    C0456u c0456u = new C0456u(new a.b(abstractC15704a), 1);
                    c3383g = c0456u;
                }
                this.f59099x = null;
                this.f59100y = null;
                this.f59098w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c3383g, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC15704a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: gc0.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$interact$2", m100430f = "HormonalContextInteractor.kt", m100431l = {79, 81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lgc0/c;", "previousState", "Lgc0/d$a;", "internalAction", "<anonymous>", "(Lgc0/c;Lgc0/d$a;)Lgc0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        Object f59103w;

        /* JADX INFO: renamed from: x */
        int f59104x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f59105y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f59106z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC15706c abstractC15706c, a aVar, InterfaceC30057d<? super AbstractC15706c> interfaceC30057d) {
            h hVar = C15707d.this.new h(interfaceC30057d);
            hVar.f59105y = abstractC15706c;
            hVar.f59106z = aVar;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
        
            if (r10 == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
        
            if (r10 == r2) goto L37;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f59105y
                gc0.c r0 = (gc0.AbstractC15706c) r0
                java.lang.Object r1 = r9.f59106z
                gc0.d$a r1 = (gc0.C15707d.a) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r9.f59104x
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2d
                if (r3 == r5) goto L25
                if (r3 != r4) goto L1d
                java.lang.Object r0 = r9.f59103w
                gc0.a r0 = (gc0.AbstractC15704a) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto La5
            L1d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L25:
                java.lang.Object r0 = r9.f59103w
                gc0.a r0 = (gc0.AbstractC15704a) r0
                p505ts.AbstractC34132o.m107864I(r10)
                goto L7e
            L2d:
                p505ts.AbstractC34132o.m107864I(r10)
                boolean r10 = r1 instanceof gc0.C15707d.a.C41633a
                if (r10 == 0) goto L5c
                gc0.d$a$a r1 = (gc0.C15707d.a.C41633a) r1
                gc0.c r10 = r1.getResult()
                boolean r1 = r10 instanceof gc0.AbstractC15706c.f
                if (r1 == 0) goto L5b
                boolean r1 = r0 instanceof gc0.AbstractC15706c.f
                if (r1 == 0) goto L59
                r2 = r10
                gc0.c$f r2 = (gc0.AbstractC15706c.f) r2
                gc0.c$f r0 = (gc0.AbstractC15706c.f) r0
                gc0.e r4 = r0.getProgressResult()
                gc0.b r5 = r0.getSaveRequest()
                r7 = 9
                r8 = 0
                r3 = 0
                r6 = 0
                gc0.c$f r10 = gc0.AbstractC15706c.f.m44198b(r2, r3, r4, r5, r6, r7, r8)
                return r10
            L59:
                gc0.c$f r10 = (gc0.AbstractC15706c.f) r10
            L5b:
                return r10
            L5c:
                boolean r10 = r1 instanceof gc0.C15707d.a.b
                if (r10 == 0) goto Lbc
                gc0.d$a$b r1 = (gc0.C15707d.a.b) r1
                gc0.a r10 = r1.getAction()
                boolean r1 = r10 instanceof gc0.AbstractC15704a.b
                r3 = 0
                if (r1 == 0) goto L81
                gc0.d r1 = gc0.C15707d.this
                gc0.a$b r10 = (gc0.AbstractC15704a.b) r10
                r9.f59105y = r3
                r9.f59106z = r3
                r9.f59103w = r3
                r9.f59104x = r5
                java.lang.Object r10 = gc0.C15707d.m44207f(r1, r10, r0, r9)
                if (r10 != r2) goto L7e
                goto La4
            L7e:
                gc0.c r10 = (gc0.AbstractC15706c) r10
                return r10
            L81:
                boolean r1 = r10 instanceof gc0.AbstractC15704a.a
                if (r1 == 0) goto L8c
                gc0.d r10 = gc0.C15707d.this
                gc0.c r10 = gc0.C15707d.m44206e(r10, r0)
                return r10
            L8c:
                gc0.a$e r1 = gc0.AbstractC15704a.e.f59035a
                boolean r1 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r1)
                if (r1 == 0) goto La8
                gc0.d r10 = gc0.C15707d.this
                r9.f59105y = r3
                r9.f59106z = r3
                r9.f59103w = r3
                r9.f59104x = r4
                java.lang.Object r10 = gc0.C15707d.m44211j(r10, r0, r9)
                if (r10 != r2) goto La5
            La4:
                return r2
            La5:
                gc0.c r10 = (gc0.AbstractC15706c) r10
                return r10
            La8:
                gc0.a$f r1 = gc0.AbstractC15704a.f.f59036a
                boolean r1 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r1)
                if (r1 == 0) goto Lb7
                gc0.d r10 = gc0.C15707d.this
                gc0.c r10 = gc0.C15707d.m44212k(r10, r0)
                return r10
            Lb7:
                gc0.a$d r1 = gc0.AbstractC15704a.d.f59034a
                p715kotlin.jvm.internal.AbstractC22676k.m65745e(r10, r1)
            Lbc:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: gc0.C15707d.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: gc0.d$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f59107w;

        /* JADX INFO: renamed from: gc0.d$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f59108w;

            /* JADX INFO: renamed from: gc0.d$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$interact$lambda$0$$inlined$map$1$2", m100430f = "HormonalContextInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41636a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f59109E;

                /* JADX INFO: renamed from: F */
                Object f59110F;

                /* JADX INFO: renamed from: G */
                Object f59111G;

                /* JADX INFO: renamed from: H */
                int f59112H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f59113w;

                /* JADX INFO: renamed from: x */
                int f59114x;

                /* JADX INFO: renamed from: y */
                Object f59115y;

                public C41636a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f59113w = obj;
                    this.f59114x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f59108w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41636a c41636a;
                if (interfaceC30057d instanceof C41636a) {
                    c41636a = (C41636a) interfaceC30057d;
                    int i13 = c41636a.f59114x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41636a.f59114x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41636a = new C41636a(interfaceC30057d);
                    }
                } else {
                    c41636a = new C41636a(interfaceC30057d);
                }
                Object obj2 = c41636a.f59113w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41636a.f59114x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f59108w;
                    a.C41633a c41633a = new a.C41633a((AbstractC15706c) obj);
                    c41636a.f59115y = null;
                    c41636a.f59109E = null;
                    c41636a.f59110F = null;
                    c41636a.f59111G = null;
                    c41636a.f59112H = 0;
                    c41636a.f59114x = 1;
                    if (interfaceC13062m.emit(c41633a, c41636a) == enumC31071a) {
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

        public i(InterfaceC13058l interfaceC13058l) {
            this.f59107w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f59107w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: gc0.d$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor", m100430f = "HormonalContextInteractor.kt", m100431l = {229}, m100432m = "performSave", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f59118F;

        /* JADX INFO: renamed from: w */
        Object f59119w;

        /* JADX INFO: renamed from: x */
        Object f59120x;

        /* JADX INFO: renamed from: y */
        Object f59121y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f59122z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f59122z = obj;
            this.f59118F |= Integer.MIN_VALUE;
            return C15707d.this.m44220s(null, null, this);
        }
    }

    /* JADX INFO: renamed from: gc0.d$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextInteractor$performSave$response$1", m100430f = "HormonalContextInteractor.kt", m100431l = {230}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f59123w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ HormonalContextSaveRequest f59125y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HormonalContextSaveRequest hormonalContextSaveRequest, InterfaceC30057d<? super k> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f59125y = hormonalContextSaveRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C15707d.this.new k(this.f59125y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f59123w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = C15707d.this.api;
                HormonalContextSaveRequest hormonalContextSaveRequest = this.f59125y;
                this.f59123w = 1;
                if (advancedLabsApi.saveHormonalContext(hormonalContextSaveRequest, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C15707d(InterfaceC26834e cachedApiSource, AdvancedLabsApi api, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cachedApiSource = cachedApiSource;
        this.api = api;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: l */
    private final C15705b m44213l(C15705b previousData, HormonalContextScreenId currentScreenId, C15705b content) {
        switch (b.f59060a[currentScreenId.ordinal()]) {
            case 1:
                return C15705b.m44185b(previousData, null, null, content.getSelectedValue(), null, null, null, 59, null);
            case 2:
                return C15705b.m44185b(previousData, null, null, null, content.getSelectedValue(), null, null, 55, null);
            case 3:
                return C15705b.m44185b(previousData, null, null, null, null, null, null, 63, null);
            case 4:
                return C15705b.m44185b(previousData, null, null, null, null, null, null, 63, null);
            case 5:
                return C15705b.m44185b(previousData, null, null, null, null, content.getSelectedValue(), null, 47, null);
            case 6:
                return C15705b.m44185b(previousData, null, null, null, null, content.getSelectedValue(), null, 47, null);
            case 7:
                return previousData;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC13058l m44214m(String testId) {
        return new d(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new GetHormonalContextRequest(testId), 1), AbstractC12350b.m34570S("HORMONAL_CONTEXT_SCOPE"), null, 2, null), new c(null, this.cachedApiSource)), testId, this);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m44215n(String testId) {
        return new e(new C0456u(testId, 1), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC15706c m44216o(AbstractC15706c previousState) {
        if (!(previousState instanceof AbstractC15706c.f)) {
            return previousState;
        }
        AbstractC15706c.f fVar = (AbstractC15706c.f) previousState;
        if (fVar.getProgressResult().m44227b().isEmpty()) {
            return AbstractC15706c.f.m44198b(fVar, null, null, null, true, 7, null);
        }
        HormonalContextScreenId hormonalContextScreenId = (HormonalContextScreenId) AbstractC25265s.m74112P0(fVar.getProgressResult().m44227b());
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(fVar.getProgressResult().m44227b());
        arrayListM74097F1.remove(AbstractC37056f.m118951C(arrayListM74097F1));
        return AbstractC15706c.f.m44198b(fVar, null, new C15708e(hormonalContextScreenId, arrayListM74097F1), null, false, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final Object m44217p(AbstractC15704a.b bVar, AbstractC15706c abstractC15706c, InterfaceC30057d<? super AbstractC15706c> interfaceC30057d) {
        C23471q c23471q;
        boolean z4 = abstractC15706c instanceof AbstractC15706c.f;
        C25271y c25271y = C25271y.f99162w;
        if (z4) {
            AbstractC15706c.f fVar = (AbstractC15706c.f) abstractC15706c;
            c23471q = new C23471q(fVar.getProgressResult(), fVar.getSaveRequest(), fVar.getResponse());
        } else if (abstractC15706c instanceof AbstractC15706c.e) {
            AbstractC15706c.e eVar = (AbstractC15706c.e) abstractC15706c;
            c23471q = new C23471q(eVar.getProgressResult(), eVar.getSaveRequest(), null);
        } else {
            c23471q = new C23471q(new C15708e(HormonalContextScreenId.LIFE_STAGE, c25271y), new C15705b(bVar.getContent().getTestId(), null, null, null, null, null, 62, null), null);
        }
        C15708e c15708e = (C15708e) c23471q.f92947w;
        C15705b c15705b = (C15705b) c23471q.f92948x;
        HormonalContextResponse hormonalContextResponse = (HormonalContextResponse) c23471q.f92949y;
        HormonalContextScreenId currentScreenId = c15708e.getCurrentScreenId();
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(c15708e.m44227b());
        arrayListM74097F1.add(currentScreenId);
        C15705b c15705bM44213l = m44213l(c15705b, currentScreenId, bVar.getContent());
        if (bVar.getNextScreenId() == null) {
            return m44220s(c15705bM44213l, c15708e, interfaceC30057d);
        }
        if (z4) {
            return AbstractC15706c.f.m44198b((AbstractC15706c.f) abstractC15706c, null, new C15708e(bVar.getNextScreenId(), arrayListM74097F1), c15705bM44213l, false, 9, null);
        }
        if (hormonalContextResponse == null) {
            hormonalContextResponse = new HormonalContextResponse(c25271y, "");
        }
        return new AbstractC15706c.f(hormonalContextResponse, new C15708e(bVar.getNextScreenId(), arrayListM74097F1), c15705bM44213l, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC15706c.a m44218q(InterfaceC29354a.c<HormonalContextResponse> cacheResult, String testId) {
        return AbstractC29355b.m89462a(cacheResult) ? new AbstractC15706c.a(testId) : new AbstractC15706c.a(testId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m44219r(String testId) {
        return this.featureFlagChecker.isFeatureEnabled("advanced-labs-android-caching") ? m44214m(testId) : m44215n(testId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: s */
    public final Object m44220s(C15705b c15705b, C15708e c15708e, InterfaceC30057d<? super AbstractC15706c> interfaceC30057d) {
        j jVar;
        C15708e c15708e2;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f59118F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f59118F = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        j jVar2 = jVar;
        Object objM108729b = jVar2.f59122z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar2.f59118F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String testId = c15705b.getTestId();
            String hormonalMode = c15705b.getHormonalMode();
            if (hormonalMode == null) {
                hormonalMode = "";
            }
            HormonalContextSaveRequest hormonalContextSaveRequest = new HormonalContextSaveRequest(testId, hormonalMode, c15705b.getContraception(), c15705b.getCyclePhase(), c15705b.getSource());
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            k kVar = new k(hormonalContextSaveRequest, null);
            jVar2.f59119w = c15705b;
            c15708e2 = c15708e;
            jVar2.f59120x = c15708e2;
            jVar2.f59121y = null;
            jVar2.f59118F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, kVar, jVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C15708e c15708e3 = (C15708e) jVar2.f59120x;
            C15705b c15705b2 = (C15705b) jVar2.f59119w;
            AbstractC34132o.m107864I(objM108729b);
            c15708e2 = c15708e3;
            c15705b = c15705b2;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC15706c.d(c15708e2);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC15706c.c(c15708e2, c15705b);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final Object m44221t(AbstractC15706c abstractC15706c, InterfaceC30057d<? super AbstractC15706c> interfaceC30057d) {
        AbstractC22676k.m65748h(abstractC15706c, "null cannot be cast to non-null type com.whoop.advancedlabs.feature.hormonalcontext.domain.HormonalContextDomainResult.Saving");
        AbstractC15706c.e eVar = (AbstractC15706c.e) abstractC15706c;
        return m44220s(eVar.getSaveRequest(), eVar.getProgressResult(), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public final AbstractC15706c m44222u(AbstractC15706c previousState) {
        C23465k c23465k;
        if (previousState instanceof AbstractC15706c.f) {
            AbstractC15706c.f fVar = (AbstractC15706c.f) previousState;
            c23465k = new C23465k(fVar.getSaveRequest(), fVar.getProgressResult());
        } else if (previousState instanceof AbstractC15706c.c) {
            AbstractC15706c.c cVar = (AbstractC15706c.c) previousState;
            c23465k = new C23465k(cVar.getSaveRequest(), cVar.getProgressResult());
        } else {
            c23465k = new C23465k(new C15705b(null, null, null, null, null, null, 63, null), new C15708e(null, null, 3, null));
        }
        return new AbstractC15706c.e((C15708e) c23465k.f92938x, (C15705b) c23465k.f92937w);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC15706c.b.f59044a, AbstractC13091v.m36590P(upstream, new g(null, this)), new h(null));
    }

    public /* synthetic */ C15707d(InterfaceC26834e interfaceC26834e, AdvancedLabsApi advancedLabsApi, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC26834e, advancedLabsApi, featureFlagChecker, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HormonalContextInteractor") : interfaceC34116n);
    }
}
