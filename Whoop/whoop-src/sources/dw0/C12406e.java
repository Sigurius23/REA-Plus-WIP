package dw0;

import c93.InterfaceC4351m;
import com.whoop.core.details.network.api.CardioDetailsGetRequest;
import com.whoop.core.details.network.api.CoreDetailsApi;
import com.whoop.core.details.network.api.RecoveryDetailsGetRequest;
import com.whoop.core.details.network.api.ScoreTypeGetRequest;
import com.whoop.core.details.network.model.ActivityScoreTypeResponse;
import com.whoop.core.details.network.model.CoreDetailsModel;
import com.whoop.core.details.network.model.CoreDetailsModelState;
import com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel;
import com.whoop.service.network.HomeComponentDismissApi;
import com.whoop.service.network.model.DismissComponentRequestBody;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hw0.EnumC17696a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import java.lang.reflect.Type;
import l83.C23454a0;
import l83.C23465k;
import nm0.C26832c;
import nm0.InterfaceC26834e;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29218v0;
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
import xm0.C38458b;

/* JADX INFO: renamed from: dw0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 <2\u00020\u0001:\u00012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010!J\u001d\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J2\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020\u00120&2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b)\u0010*J,\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0+0'2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b-\u0010*J\u0018\u0010.\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b.\u0010/J\u0018\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b1\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m65681d2 = {"Ldw0/e;", "", "Lcom/whoop/core/details/network/api/CoreDetailsApi;", "coreDetailsApi", "Lnm0/e;", "cachedApiSource", "Lcom/whoop/service/network/HomeComponentDismissApi;", "componentDismissApi", "Lxm0/b;", "cacheUpdater", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/core/details/network/api/CoreDetailsApi;Lnm0/e;Lcom/whoop/service/network/HomeComponentDismissApi;Lxm0/b;Ltr2/n;)V", "Lcom/whoop/core/details/network/model/CoreDetailsModel;", "data", "", "activityId", "Lhw0/a;", "activityType", "", "newHome", "entryPoint", "Ldw0/k;", "j", "(Lcom/whoop/core/details/network/model/CoreDetailsModel;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Ldw0/k;", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "l", "(Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Ldw0/k;", "k", "(Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Ldw0/k;", "Lec3/l;", "n", "(Ljava/lang/String;Lhw0/a;ZLjava/lang/String;)Lec3/l;", "o", "Lcom/whoop/core/details/network/model/ActivityScoreTypeResponse;", "m", "(Ljava/lang/String;)Lec3/l;", "Ll83/k;", "Lu02/a;", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;", "i", "(Ljava/lang/String;Lhw0/a;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "g", "p", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "componentId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "Lcom/whoop/core/details/network/api/CoreDetailsApi;", "b", "Lnm0/e;", "c", "Lcom/whoop/service/network/HomeComponentDismissApi;", "d", "Lxm0/b;", "e", "Ltr2/n;", "f", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12406e {

    /* JADX INFO: renamed from: g */
    public static final int f42085g = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CoreDetailsApi coreDetailsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC26834e cachedApiSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final HomeComponentDismissApi componentDismissApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: dw0.e$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$deleteActivity$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {128, 129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f42091w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC17696a f42092x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12406e f42093y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f42094z;

        /* JADX INFO: renamed from: dw0.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f42095a;

            static {
                int[] iArr = new int[EnumC17696a.values().length];
                try {
                    iArr[EnumC17696a.CARDIO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17696a.RECOVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f42095a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC17696a enumC17696a, C12406e c12406e, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f42092x = enumC17696a;
            this.f42093y = c12406e;
            this.f42094z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f42092x, this.f42093y, this.f42094z, interfaceC30057d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (r5 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        
            if (r5 == r0) goto L22;
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
                int r1 = r4.f42091w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L3e
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L64
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                hw0.a r5 = r4.f42092x
                int[] r1 = dw0.C12406e.b.a.f42095a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 == r3) goto L53
                if (r5 != r2) goto L41
                dw0.e r5 = r4.f42093y
                com.whoop.core.details.network.api.CoreDetailsApi r5 = dw0.C12406e.m34893c(r5)
                java.lang.String r1 = r4.f42094z
                r4.f42091w = r2
                java.lang.Object r5 = r5.deleteRecoveryActivity(r1, r4)
                if (r5 != r0) goto L3e
                goto L63
            L3e:
                pg3.v0 r5 = (pg3.C29218v0) r5
                return r5
            L41:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                hw0.a r0 = r4.f42092x
                java.lang.String r0 = r0.name()
                java.lang.String r1 = "DeleteActivity network mapping not supported for "
                java.lang.String r0 = p000.AbstractC11266d.m30461o(r1, r0)
                r5.<init>(r0)
                throw r5
            L53:
                dw0.e r5 = r4.f42093y
                com.whoop.core.details.network.api.CoreDetailsApi r5 = dw0.C12406e.m34893c(r5)
                java.lang.String r1 = r4.f42094z
                r4.f42091w = r3
                java.lang.Object r5 = r5.deleteCardioActivity(r1, r4)
                if (r5 != r0) goto L64
            L63:
                return r0
            L64:
                pg3.v0 r5 = (pg3.C29218v0) r5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: dw0.C12406e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dw0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {151, 153}, m100432m = "dismissComponent", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f42096w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f42097x;

        /* JADX INFO: renamed from: z */
        int f42099z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42097x = obj;
            this.f42099z |= Integer.MIN_VALUE;
            return C12406e.this.m34901h(null, this);
        }
    }

    /* JADX INFO: renamed from: dw0.e$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$dismissComponent$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {152}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f42100w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f42102y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f42102y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12406e.this.new d(this.f42102y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42100w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HomeComponentDismissApi homeComponentDismissApi = C12406e.this.componentDismissApi;
            DismissComponentRequestBody dismissComponentRequestBody = new DismissComponentRequestBody(this.f42102y);
            this.f42100w = 1;
            Object objDismissComponent = homeComponentDismissApi.dismissComponent(dismissComponentRequestBody, this);
            return objDismissComponent == enumC31071a ? enumC31071a : objDismissComponent;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dw0.e$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$dismissComponent$3", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {154}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "it", "<anonymous>", "(Lpg3/v0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f42103w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12406e.this.new e(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42103w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C38458b c38458b = C12406e.this.cacheUpdater;
                this.f42103w = 1;
                if (c38458b.m123247a("core_details_activity", this) == enumC31071a) {
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

        @Override // c93.InterfaceC4351m
        public final Object invoke(C29218v0<C23454a0> c29218v0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c29218v0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dw0.e$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {104}, m100432m = "fetchActivityDetails", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f42106F;

        /* JADX INFO: renamed from: w */
        Object f42107w;

        /* JADX INFO: renamed from: x */
        Object f42108x;

        /* JADX INFO: renamed from: y */
        Object f42109y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f42110z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f42110z = obj;
            this.f42106F |= Integer.MIN_VALUE;
            return C12406e.this.m34902i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: dw0.e$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$fetchActivityDetails$response$1", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {107, 110, 112, 115}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/core/details/network/model/CoreDetailsModelState;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f42111E;

        /* JADX INFO: renamed from: w */
        int f42112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC17696a f42113x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C12406e f42114y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f42115z;

        /* JADX INFO: renamed from: dw0.e$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f42116a;

            static {
                int[] iArr = new int[EnumC17696a.values().length];
                try {
                    iArr[EnumC17696a.CARDIO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17696a.RECOVERY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f42116a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC17696a enumC17696a, C12406e c12406e, String str, C22669g0 c22669g0, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f42113x = enumC17696a;
            this.f42114y = c12406e;
            this.f42115z = str;
            this.f42111E = c22669g0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f42113x, this.f42114y, this.f42115z, this.f42111E, interfaceC30057d);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x007b  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        
            if (r7 == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            if (r7 == r0) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f42112w
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L27
                if (r1 == r4) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                p505ts.AbstractC34132o.m107864I(r7)
                goto L92
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L73
            L23:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4e
            L27:
                p505ts.AbstractC34132o.m107864I(r7)
                goto Lbd
            L2c:
                p505ts.AbstractC34132o.m107864I(r7)
                hw0.a r7 = r6.f42113x
                int[] r1 = dw0.C12406e.g.a.f42116a
                int r7 = r7.ordinal()
                r7 = r1[r7]
                if (r7 == r5) goto Lac
                if (r7 != r4) goto L9a
                dw0.e r7 = r6.f42114y
                com.whoop.core.details.network.api.CoreDetailsApi r7 = dw0.C12406e.m34893c(r7)
                java.lang.String r1 = r6.f42115z
                r6.f42112w = r4
                java.lang.Object r7 = r7.getActivityScore(r1, r6)
                if (r7 != r0) goto L4e
                goto Lbc
            L4e:
                com.whoop.core.details.network.model.ActivityScoreTypeResponse r7 = (com.whoop.core.details.network.model.ActivityScoreTypeResponse) r7
                java.lang.String r7 = r7.getScoreType()
                java.lang.String r1 = "CARDIO"
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r7, r1)
                if (r7 == 0) goto L7b
                kotlin.jvm.internal.g0 r7 = r6.f42111E
                hw0.a r1 = hw0.EnumC17696a.CARDIO
                r7.f89336w = r1
                dw0.e r7 = r6.f42114y
                com.whoop.core.details.network.api.CoreDetailsApi r7 = dw0.C12406e.m34893c(r7)
                java.lang.String r1 = r6.f42115z
                r6.f42112w = r3
                java.lang.Object r7 = r7.fetchCardioDetailsComponents(r1, r6)
                if (r7 != r0) goto L73
                goto Lbc
            L73:
                com.whoop.core.details.network.model.CoreDetailsModel r7 = (com.whoop.core.details.network.model.CoreDetailsModel) r7
                com.whoop.core.details.network.model.CoreDetailsModelState$CoreDetails r0 = new com.whoop.core.details.network.model.CoreDetailsModelState$CoreDetails
                r0.<init>(r7)
                return r0
            L7b:
                kotlin.jvm.internal.g0 r7 = r6.f42111E
                hw0.a r1 = hw0.EnumC17696a.RECOVERY
                r7.f89336w = r1
                dw0.e r7 = r6.f42114y
                com.whoop.core.details.network.api.CoreDetailsApi r7 = dw0.C12406e.m34893c(r7)
                java.lang.String r1 = r6.f42115z
                r6.f42112w = r2
                java.lang.Object r7 = r7.fetchRecoveryDetailsComponents(r1, r6)
                if (r7 != r0) goto L92
                goto Lbc
            L92:
                com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel r7 = (com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel) r7
                com.whoop.core.details.network.model.CoreDetailsModelState$RecoveryDetails r0 = new com.whoop.core.details.network.model.CoreDetailsModelState$RecoveryDetails
                r0.<init>(r7)
                return r0
            L9a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                hw0.a r0 = r6.f42113x
                java.lang.String r0 = r0.name()
                java.lang.String r1 = "FetchActivityDetails network mapping not supported for "
                java.lang.String r0 = p000.AbstractC11266d.m30461o(r1, r0)
                r7.<init>(r0)
                throw r7
            Lac:
                dw0.e r7 = r6.f42114y
                com.whoop.core.details.network.api.CoreDetailsApi r7 = dw0.C12406e.m34893c(r7)
                java.lang.String r1 = r6.f42115z
                r6.f42112w = r5
                java.lang.Object r7 = r7.fetchCardioDetailsComponents(r1, r6)
                if (r7 != r0) goto Lbd
            Lbc:
                return r0
            Lbd:
                com.whoop.core.details.network.model.CoreDetailsModel r7 = (com.whoop.core.details.network.model.CoreDetailsModel) r7
                com.whoop.core.details.network.model.CoreDetailsModelState$CoreDetails r0 = new com.whoop.core.details.network.model.CoreDetailsModelState$CoreDetails
                r0.<init>(r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dw0.C12406e.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super CoreDetailsModelState> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: dw0.e$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadCacheActivityScoreType$$inlined$cacheAPI$1", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f42117w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f42118x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42119y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f42120z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f42120z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f42120z);
            hVar.f42118x = interfaceC13062m;
            hVar.f42119y = c26832c;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42117w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f42118x;
                C26832c c26832c = (C26832c) this.f42119y;
                InterfaceC26834e interfaceC26834e = this.f42120z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(ActivityScoreTypeResponse.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(ActivityScoreTypeResponse.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f42118x = null;
                this.f42119y = null;
                this.f42117w = 1;
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

    /* JADX INFO: renamed from: dw0.e$i */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f42121w;

        /* JADX INFO: renamed from: dw0.e$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f42122w;

            /* JADX INFO: renamed from: dw0.e$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadCacheActivityScoreType$$inlined$filterNot$1$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41499a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f42124F;

                /* JADX INFO: renamed from: G */
                Object f42125G;

                /* JADX INFO: renamed from: H */
                int f42126H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f42127w;

                /* JADX INFO: renamed from: x */
                int f42128x;

                /* JADX INFO: renamed from: y */
                Object f42129y;

                /* JADX INFO: renamed from: z */
                Object f42130z;

                public C41499a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f42127w = obj;
                    this.f42128x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f42122w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41499a c41499a;
                if (interfaceC30057d instanceof C41499a) {
                    c41499a = (C41499a) interfaceC30057d;
                    int i13 = c41499a.f42128x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41499a.f42128x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41499a = new C41499a(interfaceC30057d);
                    }
                } else {
                    c41499a = new C41499a(interfaceC30057d);
                }
                Object obj2 = c41499a.f42127w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41499a.f42128x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f42122w;
                    if (!(((InterfaceC29354a) obj) instanceof InterfaceC29354a.e)) {
                        c41499a.f42129y = null;
                        c41499a.f42130z = null;
                        c41499a.f42124F = null;
                        c41499a.f42125G = null;
                        c41499a.f42126H = 0;
                        c41499a.f42128x = 1;
                        if (interfaceC13062m.emit(obj, c41499a) == enumC31071a) {
                            return enumC31071a;
                        }
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
            this.f42121w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f42121w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dw0.e$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f42131w;

        /* JADX INFO: renamed from: dw0.e$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f42132w;

            /* JADX INFO: renamed from: dw0.e$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadCacheActivityScoreType$$inlined$map$1$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41500a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f42133E;

                /* JADX INFO: renamed from: F */
                Object f42134F;

                /* JADX INFO: renamed from: G */
                Object f42135G;

                /* JADX INFO: renamed from: H */
                int f42136H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f42137w;

                /* JADX INFO: renamed from: x */
                int f42138x;

                /* JADX INFO: renamed from: y */
                Object f42139y;

                public C41500a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f42137w = obj;
                    this.f42138x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f42132w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41500a c41500a;
                if (interfaceC30057d instanceof C41500a) {
                    c41500a = (C41500a) interfaceC30057d;
                    int i13 = c41500a.f42138x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41500a.f42138x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41500a = new C41500a(interfaceC30057d);
                    }
                } else {
                    c41500a = new C41500a(interfaceC30057d);
                }
                Object obj2 = c41500a.f42137w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41500a.f42138x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f42132w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (!(interfaceC29354a instanceof InterfaceC29354a.a)) {
                        throw new IllegalStateException("FetchActivityDetails network mapping not supported for}");
                    }
                    ActivityScoreTypeResponse activityScoreTypeResponse = (ActivityScoreTypeResponse) ((InterfaceC29354a.a) interfaceC29354a).getData();
                    c41500a.f42139y = null;
                    c41500a.f42133E = null;
                    c41500a.f42134F = null;
                    c41500a.f42135G = null;
                    c41500a.f42136H = 0;
                    c41500a.f42138x = 1;
                    if (interfaceC13062m.emit(activityScoreTypeResponse, c41500a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l) {
            this.f42131w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f42131w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dw0.e$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadCardioDetails$$inlined$cacheAPI$1", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f42141w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f42142x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42143y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f42144z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f42144z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k kVar = new k(interfaceC30057d, this.f42144z);
            kVar.f42142x = interfaceC13062m;
            kVar.f42143y = c26832c;
            return kVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42141w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f42142x;
                C26832c c26832c = (C26832c) this.f42143y;
                InterfaceC26834e interfaceC26834e = this.f42144z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(CoreDetailsModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(CoreDetailsModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f42142x = null;
                this.f42143y = null;
                this.f42141w = 1;
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

    /* JADX INFO: renamed from: dw0.e$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f42145E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f42146F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f42147w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12406e f42148x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f42149y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC17696a f42150z;

        /* JADX INFO: renamed from: dw0.e$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f42151E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f42152F;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f42153w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12406e f42154x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f42155y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ EnumC17696a f42156z;

            /* JADX INFO: renamed from: dw0.e$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadCardioDetails$$inlined$map$1$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41501a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f42157E;

                /* JADX INFO: renamed from: F */
                Object f42158F;

                /* JADX INFO: renamed from: G */
                Object f42159G;

                /* JADX INFO: renamed from: H */
                int f42160H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f42161w;

                /* JADX INFO: renamed from: x */
                int f42162x;

                /* JADX INFO: renamed from: y */
                Object f42163y;

                public C41501a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f42161w = obj;
                    this.f42162x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12406e c12406e, String str, EnumC17696a enumC17696a, boolean z4, String str2) {
                this.f42153w = interfaceC13062m;
                this.f42154x = c12406e;
                this.f42155y = str;
                this.f42156z = enumC17696a;
                this.f42151E = z4;
                this.f42152F = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41501a c41501a;
                Object objM34898k;
                if (interfaceC30057d instanceof C41501a) {
                    c41501a = (C41501a) interfaceC30057d;
                    int i13 = c41501a.f42162x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41501a.f42162x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41501a = new C41501a(interfaceC30057d);
                    }
                } else {
                    c41501a = new C41501a(interfaceC30057d);
                }
                Object obj2 = c41501a.f42161w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41501a.f42162x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f42153w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        objM34898k = this.f42154x.m34897j((CoreDetailsModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), this.f42155y, this.f42156z, this.f42151E, this.f42152F);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        objM34898k = this.f42154x.m34897j((CoreDetailsModel) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f42155y, this.f42156z, this.f42151E, this.f42152F);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.d) || (interfaceC29354a instanceof InterfaceC29354a.c)) {
                        objM34898k = this.f42154x.m34898k(this.f42155y, this.f42156z, this.f42151E, this.f42152F);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM34898k = InterfaceC12412k.b.f42215a;
                    }
                    c41501a.f42163y = null;
                    c41501a.f42157E = null;
                    c41501a.f42158F = null;
                    c41501a.f42159G = null;
                    c41501a.f42160H = 0;
                    c41501a.f42162x = 1;
                    if (interfaceC13062m.emit(objM34898k, c41501a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l, C12406e c12406e, String str, EnumC17696a enumC17696a, boolean z4, String str2) {
            this.f42147w = interfaceC13058l;
            this.f42148x = c12406e;
            this.f42149y = str;
            this.f42150z = enumC17696a;
            this.f42145E = z4;
            this.f42146F = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f42147w.collect(new a(interfaceC13062m, this.f42148x, this.f42149y, this.f42150z, this.f42145E, this.f42146F), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dw0.e$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadRecoveryDetails$$inlined$cacheAPI$1", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f42165w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f42166x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f42167y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC26834e f42168z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC30057d interfaceC30057d, InterfaceC26834e interfaceC26834e) {
            super(3, interfaceC30057d);
            this.f42168z = interfaceC26834e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C26832c<C23454a0> c26832c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            m mVar = new m(interfaceC30057d, this.f42168z);
            mVar.f42166x = interfaceC13062m;
            mVar.f42167y = c26832c;
            return mVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42165w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f42166x;
                C26832c c26832c = (C26832c) this.f42167y;
                InterfaceC26834e interfaceC26834e = this.f42168z;
                InterfaceC21456a0 interfaceC21456a0M65689b = AbstractC22671h0.m65689b(C23454a0.class);
                Type typeM60396B = AbstractC21478l0.m60396B(interfaceC21456a0M65689b);
                C22673i0 c22673i0 = AbstractC22671h0.f89337a;
                C32236a c32236aM44445Y = AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(C23454a0.class), interfaceC21456a0M65689b, typeM60396B);
                InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(RecoveryDetailsModel.class);
                InterfaceC13058l interfaceC13058lMo80083a = interfaceC26834e.mo80083a(c26832c, c32236aM44445Y, AbstractC15751g.m44445Y(c22673i0.getOrCreateKotlinClass(RecoveryDetailsModel.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
                this.f42166x = null;
                this.f42167y = null;
                this.f42165w = 1;
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

    /* JADX INFO: renamed from: dw0.e$n */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f42169E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f42170F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f42171w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12406e f42172x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f42173y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ EnumC17696a f42174z;

        /* JADX INFO: renamed from: dw0.e$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f42175E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f42176F;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f42177w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12406e f42178x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f42179y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ EnumC17696a f42180z;

            /* JADX INFO: renamed from: dw0.e$n$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$loadRecoveryDetails$$inlined$map$1$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41502a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f42181E;

                /* JADX INFO: renamed from: F */
                Object f42182F;

                /* JADX INFO: renamed from: G */
                Object f42183G;

                /* JADX INFO: renamed from: H */
                int f42184H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f42185w;

                /* JADX INFO: renamed from: x */
                int f42186x;

                /* JADX INFO: renamed from: y */
                Object f42187y;

                public C41502a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f42185w = obj;
                    this.f42186x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12406e c12406e, String str, EnumC17696a enumC17696a, boolean z4, String str2) {
                this.f42177w = interfaceC13062m;
                this.f42178x = c12406e;
                this.f42179y = str;
                this.f42180z = enumC17696a;
                this.f42175E = z4;
                this.f42176F = str2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41502a c41502a;
                Object objM34898k;
                if (interfaceC30057d instanceof C41502a) {
                    c41502a = (C41502a) interfaceC30057d;
                    int i13 = c41502a.f42186x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41502a.f42186x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41502a = new C41502a(interfaceC30057d);
                    }
                } else {
                    c41502a = new C41502a(interfaceC30057d);
                }
                Object obj2 = c41502a.f42185w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41502a.f42186x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f42177w;
                    InterfaceC29354a interfaceC29354a = (InterfaceC29354a) obj;
                    if (interfaceC29354a instanceof InterfaceC29354a.a.C42173a) {
                        objM34898k = this.f42178x.m34899l((RecoveryDetailsModel) ((InterfaceC29354a.a.C42173a) interfaceC29354a).getData(), this.f42179y, this.f42180z, this.f42175E, this.f42176F);
                    } else if (interfaceC29354a instanceof InterfaceC29354a.a.b) {
                        objM34898k = this.f42178x.m34899l((RecoveryDetailsModel) ((InterfaceC29354a.a.b) interfaceC29354a).getData(), this.f42179y, this.f42180z, this.f42175E, this.f42176F);
                    } else if ((interfaceC29354a instanceof InterfaceC29354a.d) || (interfaceC29354a instanceof InterfaceC29354a.c)) {
                        objM34898k = this.f42178x.m34898k(this.f42179y, this.f42180z, this.f42175E, this.f42176F);
                    } else {
                        if (!(interfaceC29354a instanceof InterfaceC29354a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM34898k = InterfaceC12412k.b.f42215a;
                    }
                    c41502a.f42187y = null;
                    c41502a.f42181E = null;
                    c41502a.f42182F = null;
                    c41502a.f42183G = null;
                    c41502a.f42184H = 0;
                    c41502a.f42186x = 1;
                    if (interfaceC13062m.emit(objM34898k, c41502a) == enumC31071a) {
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

        public n(InterfaceC13058l interfaceC13058l, C12406e c12406e, String str, EnumC17696a enumC17696a, boolean z4, String str2) {
            this.f42171w = interfaceC13058l;
            this.f42172x = c12406e;
            this.f42173y = str;
            this.f42174z = enumC17696a;
            this.f42169E = z4;
            this.f42170F = str2;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f42171w.collect(new a(interfaceC13062m, this.f42172x, this.f42173y, this.f42174z, this.f42169E, this.f42170F), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dw0.e$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.domain.CoreDetailsNetworkMapper$upsertLinkWorkoutNotificationDismissalRecord$2", m100430f = "CoreDetailsNetworkMapper.kt", m100431l = {146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f42189w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f42191y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, InterfaceC30057d<? super o> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f42191y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C12406e.this.new o(this.f42191y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f42189w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CoreDetailsApi coreDetailsApi = C12406e.this.coreDetailsApi;
            String str = this.f42191y;
            this.f42189w = 1;
            Object objUpsertLinkWorkoutNotificationDismissalRecord = coreDetailsApi.upsertLinkWorkoutNotificationDismissalRecord(str, this);
            return objUpsertLinkWorkoutNotificationDismissalRecord == enumC31071a ? enumC31071a : objUpsertLinkWorkoutNotificationDismissalRecord;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((o) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C12406e(CoreDetailsApi coreDetailsApi, InterfaceC26834e cachedApiSource, HomeComponentDismissApi componentDismissApi, C38458b cacheUpdater, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(coreDetailsApi, "coreDetailsApi");
        AbstractC22676k.m65750j(cachedApiSource, "cachedApiSource");
        AbstractC22676k.m65750j(componentDismissApi, "componentDismissApi");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        AbstractC22676k.m65750j(logger, "logger");
        this.coreDetailsApi = coreDetailsApi;
        this.cachedApiSource = cachedApiSource;
        this.componentDismissApi = componentDismissApi;
        this.cacheUpdater = cacheUpdater;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final InterfaceC12412k m34897j(CoreDetailsModel data, String activityId, EnumC17696a activityType, boolean newHome, String entryPoint) {
        return new InterfaceC12412k.d(new CoreDetailsModelState.CoreDetails(data), new C12402a(newHome, entryPoint, activityId, activityType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC12412k m34898k(String activityId, EnumC17696a activityType, boolean newHome, String entryPoint) {
        return new InterfaceC12412k.a(new C12402a(newHome, entryPoint, activityId, activityType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC12412k m34899l(RecoveryDetailsModel data, String activityId, EnumC17696a activityType, boolean newHome, String entryPoint) {
        return new InterfaceC12412k.d(new CoreDetailsModelState.RecoveryDetails(data), new C12402a(newHome, entryPoint, activityId, activityType));
    }

    /* JADX INFO: renamed from: g */
    public final Object m34900g(String str, EnumC17696a enumC17696a, InterfaceC30057d<? super InterfaceC34385a<C29218v0<C23454a0>>> interfaceC30057d) {
        return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, AbstractC11895b.m31996o("Failed to delete ", enumC17696a.name(), " activity"), new b(enumC17696a, this, str, null), interfaceC30057d, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (u02.AbstractC34386b.m108742g((u02.InterfaceC34385a) r13, r12, r6) == r0) goto L22;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m34901h(java.lang.String r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof dw0.C12406e.c
            if (r0 == 0) goto L14
            r0 = r13
            dw0.e$c r0 = (dw0.C12406e.c) r0
            int r1 = r0.f42099z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f42099z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            dw0.e$c r0 = new dw0.e$c
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.f42097x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f42099z
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L41
            if (r1 == r2) goto L39
            if (r1 != r9) goto L31
            java.lang.Object r12 = r6.f42096w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            java.lang.Object r12 = r6.f42096w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r13)
            goto L62
        L41:
            p505ts.AbstractC34132o.m107864I(r13)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r13 = r2
            tr2.n r2 = r11.logger
            java.lang.String r3 = "Failed to dismiss component "
            java.lang.String r4 = p000.AbstractC11266d.m30461o(r3, r12)
            dw0.e$d r5 = new dw0.e$d
            r5.<init>(r12, r10)
            r6.f42096w = r10
            r6.f42099z = r13
            r3 = 0
            r7 = 2
            r8 = 0
            java.lang.Object r13 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L62
            goto L73
        L62:
            u02.a r13 = (u02.InterfaceC34385a) r13
            dw0.e$e r12 = new dw0.e$e
            r12.<init>(r10)
            r6.f42096w = r10
            r6.f42099z = r9
            java.lang.Object r12 = u02.AbstractC34386b.m108742g(r13, r12, r6)
            if (r12 != r0) goto L74
        L73:
            return r0
        L74:
            l83.a0 r12 = l83.C23454a0.f92919a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dw0.C12406e.m34901h(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: i */
    public final Object m34902i(String str, EnumC17696a enumC17696a, InterfaceC30057d<? super C23465k> interfaceC30057d) {
        f fVar;
        C22669g0 c22669g0;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f42106F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f42106F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f42110z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f42106F;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(objM108729b);
            c22669g0M32004w.f89336w = enumC17696a;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            String strM8300m = AbstractC2875y.m8300m("Failed to fetch ", enumC17696a.name(), " with ", str, " details");
            g gVar = new g(enumC17696a, this, str, c22669g0M32004w, null);
            c22669g0 = c22669g0M32004w;
            fVar2.f42107w = null;
            fVar2.f42108x = null;
            fVar2.f42109y = c22669g0;
            fVar2.f42106F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, strM8300m, gVar, fVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) fVar2.f42109y;
            AbstractC34132o.m107864I(objM108729b);
        }
        return new C23465k((InterfaceC34385a) objM108729b, c22669g0.f89336w);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m34903m(String activityId) {
        AbstractC22676k.m65750j(activityId, "activityId");
        return new j(new i(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new ScoreTypeGetRequest(activityId), 1), null, null, 3, null), new h(null, this.cachedApiSource))));
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m34904n(String activityId, EnumC17696a activityType, boolean newHome, String entryPoint) {
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        return new l(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new CardioDetailsGetRequest(activityId), 1), AbstractC12350b.m34570S("core_details_activity"), null, 2, null), new k(null, this.cachedApiSource)), this, activityId, activityType, newHome, entryPoint);
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m34905o(String activityId, EnumC17696a activityType, boolean newHome, String entryPoint) {
        AbstractC22676k.m65750j(activityId, "activityId");
        AbstractC22676k.m65750j(activityType, "activityType");
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        return new n(AbstractC13091v.m36590P(AbstractC32714a.m102670b(new C0456u(new RecoveryDetailsGetRequest(activityId), 1), AbstractC12350b.m34570S("core_details_activity"), null, 2, null), new m(null, this.cachedApiSource)), this, activityId, activityType, newHome, entryPoint);
    }

    /* JADX INFO: renamed from: p */
    public final Object m34906p(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM108729b = InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, AbstractC11266d.m30461o("Failed to upsertLinkWorkoutNotificationDismissalRecord with activityId ", str), new o(str, null), interfaceC30057d, 2, null);
        return objM108729b == EnumC31071a.f128113w ? objM108729b : C23454a0.f92919a;
    }
}
