package com.whoop.healthspan.domain;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.PaceOfAgingMeterModel;
import com.whoop.design.models.items.PaceOfAgingMeterTickModel;
import com.whoop.healthspan.domain.models.ContributorsContainerResponse;
import com.whoop.healthspan.domain.models.HealthspanResponse;
import com.whoop.healthspan.domain.models.LabsImpactCardModel;
import com.whoop.healthspan.domain.models.SingleContributorContainer;
import com.whoop.healthspan.domain.models.TileSectionModel;
import com.whoop.healthspan.domain.models.UnlockedContentResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fk1.C14553a;
import in2.InterfaceC18732d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u92.C34660d;
import wb3.AbstractC37056f;
import xm0.C38458b;

/* JADX INFO: renamed from: com.whoop.healthspan.domain.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b$\u0010\"J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010)\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, m65681d2 = {"Lcom/whoop/healthspan/domain/b;", "Lod1/g;", "Lcom/whoop/healthspan/domain/a;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "Lcom/whoop/healthspan/domain/HealthspanApi;", "api", "Ltr2/n;", "logger", "Lin2/d;", "dispatcher", "Lu92/d;", "sharedPreferences", "Lfk1/a;", "drawerIdProvider", "Lxm0/b;", "cacheUpdater", "<init>", "(Lcom/whoop/healthspan/domain/HealthspanApi;Ltr2/n;Lin2/d;Lu92/d;Lfk1/a;Lxm0/b;)V", "Lcom/whoop/healthspan/domain/models/HealthspanResponse;", "response", "", "isFromDateChange", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$Success;", "k", "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;ZLq83/d;)Ljava/lang/Object;", "", "", "n", "(Lcom/whoop/healthspan/domain/models/HealthspanResponse;)Ljava/util/Map;", HttpHeaders.DATE, "o", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/healthspan/domain/c$a;", "l", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/healthspan/domain/c$b;", "m", "id", "isExpanded", "Lcom/whoop/healthspan/domain/c$c;", "r", "q", "(Ljava/lang/String;)Z", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/healthspan/domain/HealthspanApi;", "b", "Ltr2/n;", "c", "Lin2/d;", "d", "Lu92/d;", "e", "Lfk1/a;", "f", "Lxm0/b;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C8803b implements InterfaceC27844g<AbstractC8802a, HealthspanDomainResult> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HealthspanApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C34660d sharedPreferences;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14553a drawerIdProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C38458b cacheUpdater;

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor", m100430f = "HealthspanInteractor.kt", m100431l = {112}, m100432m = "buildHealthspanDomainResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f26255E;

        /* JADX INFO: renamed from: G */
        int f26257G;

        /* JADX INFO: renamed from: w */
        Object f26258w;

        /* JADX INFO: renamed from: x */
        boolean f26259x;

        /* JADX INFO: renamed from: y */
        boolean f26260y;

        /* JADX INFO: renamed from: z */
        int f26261z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26255E = obj;
            this.f26257G |= Integer.MIN_VALUE;
            return C8803b.this.m21619k(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$buildHealthspanDomainResult$2$1", m100430f = "HealthspanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26262w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C8803b.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26262w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C8803b.this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor", m100430f = "HealthspanInteractor.kt", m100431l = {160}, m100432m = "dismissCalibration", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f26264w;

        /* JADX INFO: renamed from: y */
        int f26266y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26264w = obj;
            this.f26266y |= Integer.MIN_VALUE;
            return C8803b.this.m21620l(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$dismissCalibration$2", m100430f = "HealthspanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26267w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C8803b.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26267w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C8803b.this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor", m100430f = "HealthspanInteractor.kt", m100431l = {166}, m100432m = "dismissInfoCallout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f26269w;

        /* JADX INFO: renamed from: y */
        int f26271y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26269w = obj;
            this.f26271y |= Integer.MIN_VALUE;
            return C8803b.this.m21621m(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$f */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$dismissInfoCallout$2", m100430f = "HealthspanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26272w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C8803b.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26272w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C8803b.this.sharedPreferences.m109538q(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_INFO_CALLOUT, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$g */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor", m100430f = "HealthspanInteractor.kt", m100431l = {146, 151}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f26275F;

        /* JADX INFO: renamed from: w */
        Object f26276w;

        /* JADX INFO: renamed from: x */
        Object f26277x;

        /* JADX INFO: renamed from: y */
        boolean f26278y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f26279z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26279z = obj;
            this.f26275F |= Integer.MIN_VALUE;
            return C8803b.this.m21623o(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$fetchData$response$1", m100430f = "HealthspanInteractor.kt", m100431l = {147}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/healthspan/domain/models/HealthspanResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f26280w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f26282y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f26282y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C8803b.this.new h(this.f26282y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26280w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HealthspanApi healthspanApi = C8803b.this.api;
            String str = this.f26282y;
            this.f26280w = 1;
            Object healthspan = healthspanApi.getHealthspan(str, this);
            return healthspan == enumC31071a ? enumC31071a : healthspan;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HealthspanResponse> interfaceC30057d) {
            return ((h) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$$inlined$flatMapLatest$1", m100430f = "HealthspanInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f26283w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f26284x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f26285y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C8803b f26286z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC30057d interfaceC30057d, C8803b c8803b) {
            super(3, interfaceC30057d);
            this.f26286z = c8803b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC8802a abstractC8802a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i iVar = new i(interfaceC30057d, this.f26286z);
            iVar.f26284x = interfaceC13062m;
            iVar.f26285y = abstractC8802a;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13084s1 c13084s1;
            C13084s1 c13084s2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26283w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f26284x;
                AbstractC8802a abstractC8802a = (AbstractC8802a) this.f26285y;
                if (abstractC8802a instanceof AbstractC8802a.d) {
                    c13084s1 = new C13084s1(this.f26286z.new j(abstractC8802a, null));
                } else if (abstractC8802a instanceof AbstractC8802a.f) {
                    c13084s1 = new C13084s1(this.f26286z.new k(abstractC8802a, null));
                } else if (abstractC8802a instanceof AbstractC8802a.a) {
                    c13084s1 = new C13084s1(this.f26286z.new l(abstractC8802a, null));
                } else {
                    if (AbstractC22676k.m65745e(abstractC8802a, AbstractC8802a.b.f26242a)) {
                        c13084s2 = new C13084s1(this.f26286z.new m(null));
                    } else if (AbstractC22676k.m65745e(abstractC8802a, AbstractC8802a.c.f26243a)) {
                        c13084s2 = new C13084s1(this.f26286z.new n(null));
                    } else if (AbstractC22676k.m65745e(abstractC8802a, AbstractC8802a.e.f26245a)) {
                        c13084s2 = new C13084s1(new o(null));
                    } else {
                        if (!(abstractC8802a instanceof AbstractC8802a.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c13084s1 = new C13084s1(this.f26286z.new p(abstractC8802a, null));
                    }
                    c13084s1 = c13084s2;
                }
                this.f26284x = null;
                this.f26285y = null;
                this.f26283w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC8802a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$1", m100430f = "HealthspanInteractor.kt", m100431l = {33, 33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC8802a f26287E;

        /* JADX INFO: renamed from: w */
        Object f26288w;

        /* JADX INFO: renamed from: x */
        int f26289x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f26290y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AbstractC8802a abstractC8802a, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26287E = abstractC8802a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = C8803b.this.new j(this.f26287E, interfaceC30057d);
            jVar.f26290y = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f26290y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r12.f26289x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L27
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                p505ts.AbstractC34132o.m107864I(r13)
                r9 = r12
                goto L52
            L16:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1e:
                java.lang.Object r0 = r12.f26288w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r13)
                r9 = r12
                goto L45
            L27:
                p505ts.AbstractC34132o.m107864I(r13)
                com.whoop.healthspan.domain.b r6 = com.whoop.healthspan.domain.C8803b.this
                com.whoop.healthspan.domain.a r13 = r12.f26287E
                com.whoop.healthspan.domain.a$d r13 = (com.whoop.healthspan.domain.AbstractC8802a.d) r13
                java.lang.String r7 = r13.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()
                r12.f26290y = r5
                r12.f26288w = r0
                r12.f26289x = r4
                r8 = 0
                r10 = 2
                r11 = 0
                r9 = r12
                java.lang.Object r13 = com.whoop.healthspan.domain.C8803b.m21624p(r6, r7, r8, r9, r10, r11)
                if (r13 != r1) goto L45
                goto L51
            L45:
                r9.f26290y = r5
                r9.f26288w = r5
                r9.f26289x = r3
                java.lang.Object r13 = r0.emit(r13, r12)
                if (r13 != r1) goto L52
            L51:
                return r1
            L52:
                l83.a0 r13 = l83.C23454a0.f92919a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$2", m100430f = "HealthspanInteractor.kt", m100431l = {35, 36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26292w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f26293x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC8802a f26295z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC8802a abstractC8802a, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26295z = abstractC8802a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = C8803b.this.new k(this.f26295z, interfaceC30057d);
            kVar.f26293x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            if (r0.emit(r4, r10) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f26293x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r10.f26292w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r11)
                goto L53
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L36
            L20:
                p505ts.AbstractC34132o.m107864I(r11)
                com.whoop.healthspan.domain.b r11 = com.whoop.healthspan.domain.C8803b.this
                xm0.b r11 = com.whoop.healthspan.domain.C8803b.m21616h(r11)
                r10.f26293x = r0
                r10.f26292w = r4
                java.lang.String r2 = "HealthTabRefreshScope"
                java.lang.Object r11 = r11.m123247a(r2, r10)
                if (r11 != r1) goto L36
                goto L52
            L36:
                com.whoop.healthspan.domain.HealthspanDomainResult$OnboardingStepCompleted r4 = new com.whoop.healthspan.domain.HealthspanDomainResult$OnboardingStepCompleted
                com.whoop.healthspan.domain.a r11 = r10.f26295z
                com.whoop.healthspan.domain.a$f r11 = (com.whoop.healthspan.domain.AbstractC8802a.f) r11
                int r5 = r11.getStep()
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                r11 = 0
                r10.f26293x = r11
                r10.f26292w = r3
                java.lang.Object r11 = r0.emit(r4, r10)
                if (r11 != r1) goto L53
            L52:
                return r1
            L53:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$3", m100430f = "HealthspanInteractor.kt", m100431l = {38, 38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC8802a f26296E;

        /* JADX INFO: renamed from: w */
        Object f26297w;

        /* JADX INFO: renamed from: x */
        int f26298x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f26299y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(AbstractC8802a abstractC8802a, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26296E = abstractC8802a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = C8803b.this.new l(this.f26296E, interfaceC30057d);
            lVar.f26299y = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f26299y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f26298x
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L25
                if (r2 == r5) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4c
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f26297w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3f
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.healthspan.domain.b r7 = com.whoop.healthspan.domain.C8803b.this
                com.whoop.healthspan.domain.a r2 = r6.f26296E
                com.whoop.healthspan.domain.a$a r2 = (com.whoop.healthspan.domain.AbstractC8802a.a) r2
                java.lang.String r2 = r2.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()
                r6.f26299y = r4
                r6.f26297w = r0
                r6.f26298x = r5
                java.lang.Object r7 = com.whoop.healthspan.domain.C8803b.m21614f(r7, r2, r5, r6)
                if (r7 != r1) goto L3f
                goto L4b
            L3f:
                r6.f26299y = r4
                r6.f26297w = r4
                r6.f26298x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L4c
            L4b:
                return r1
            L4c:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$4", m100430f = "HealthspanInteractor.kt", m100431l = {40, 40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/c$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f26301w;

        /* JADX INFO: renamed from: x */
        int f26302x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f26303y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            m mVar = C8803b.this.new m(interfaceC30057d);
            mVar.f26303y = obj;
            return mVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f26303y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f26302x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f26301w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.healthspan.domain.b r7 = com.whoop.healthspan.domain.C8803b.this
                r6.f26303y = r5
                r6.f26301w = r0
                r6.f26302x = r4
                java.lang.Object r7 = com.whoop.healthspan.domain.C8803b.m21612d(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f26303y = r5
                r6.f26301w = r5
                r6.f26302x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$5", m100430f = "HealthspanInteractor.kt", m100431l = {43, 43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/c$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f26305w;

        /* JADX INFO: renamed from: x */
        int f26306x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f26307y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = C8803b.this.new n(interfaceC30057d);
            nVar.f26307y = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f26307y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f26306x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L44
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                java.lang.Object r0 = r6.f26305w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L37
            L25:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.healthspan.domain.b r7 = com.whoop.healthspan.domain.C8803b.this
                r6.f26307y = r5
                r6.f26305w = r0
                r6.f26306x = r4
                java.lang.Object r7 = com.whoop.healthspan.domain.C8803b.m21613e(r7, r6)
                if (r7 != r1) goto L37
                goto L43
            L37:
                r6.f26307y = r5
                r6.f26305w = r5
                r6.f26306x = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L44
            L43:
                return r1
            L44:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$6", m100430f = "HealthspanInteractor.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/HealthspanDomainResult$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26309w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f26310x;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o oVar = new o(interfaceC30057d);
            oVar.f26310x = obj;
            return oVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f26310x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f26309w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HealthspanDomainResult.C8800b c8800b = HealthspanDomainResult.C8800b.f26239a;
                this.f26310x = null;
                this.f26309w = 1;
                if (interfaceC13062m.emit(c8800b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$7", m100430f = "HealthspanInteractor.kt", m100431l = {49, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/healthspan/domain/c$c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC8802a f26311E;

        /* JADX INFO: renamed from: w */
        Object f26312w;

        /* JADX INFO: renamed from: x */
        int f26313x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f26314y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC8802a abstractC8802a, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26311E = abstractC8802a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            p pVar = C8803b.this.new p(this.f26311E, interfaceC30057d);
            pVar.f26314y = obj;
            return pVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f26314y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f26313x
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L25
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                p505ts.AbstractC34132o.m107864I(r8)
                goto L54
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r0 = r7.f26312w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L47
            L25:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.healthspan.domain.b r8 = com.whoop.healthspan.domain.C8803b.this
                com.whoop.healthspan.domain.a r2 = r7.f26311E
                com.whoop.healthspan.domain.a$g r2 = (com.whoop.healthspan.domain.AbstractC8802a.g) r2
                java.lang.String r2 = r2.getId()
                com.whoop.healthspan.domain.a r6 = r7.f26311E
                com.whoop.healthspan.domain.a$g r6 = (com.whoop.healthspan.domain.AbstractC8802a.g) r6
                boolean r6 = r6.getIsExpanded()
                r7.f26314y = r5
                r7.f26312w = r0
                r7.f26313x = r4
                java.lang.Object r8 = com.whoop.healthspan.domain.C8803b.m21618j(r8, r2, r6, r7)
                if (r8 != r1) goto L47
                goto L53
            L47:
                r7.f26314y = r5
                r7.f26312w = r5
                r7.f26313x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L54
            L53:
                return r1
            L54:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$q */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$2", m100430f = "HealthspanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/healthspan/domain/HealthspanDomainResult;", "previousState", "currentAction", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f26316w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f26317x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f26318y;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(HealthspanDomainResult healthspanDomainResult, Object obj, InterfaceC30057d<? super HealthspanDomainResult> interfaceC30057d) {
            q qVar = new q(interfaceC30057d);
            qVar.f26317x = healthspanDomainResult;
            qVar.f26318y = obj;
            return qVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:62:0x010e  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            List<DesignSystemModel> items;
            List<PaceOfAgingMeterTickModel> ticks;
            HealthspanDomainResult healthspanDomainResult = (HealthspanDomainResult) this.f26317x;
            Object obj2 = this.f26318y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26316w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (obj2 instanceof AbstractC8804c.a) {
                if (healthspanDomainResult instanceof HealthspanDomainResult.Success) {
                    return HealthspanDomainResult.Success.copy$default((HealthspanDomainResult.Success) healthspanDomainResult, null, true, false, false, null, null, 61, null);
                }
                if (healthspanDomainResult instanceof HealthspanDomainResult.OnboardingStepCompleted) {
                    return HealthspanDomainResult.OnboardingStepCompleted.copy$default((HealthspanDomainResult.OnboardingStepCompleted) healthspanDomainResult, 0, true, false, 5, null);
                }
            } else if (obj2 instanceof AbstractC8804c.b) {
                if (healthspanDomainResult instanceof HealthspanDomainResult.Success) {
                    return HealthspanDomainResult.Success.copy$default((HealthspanDomainResult.Success) healthspanDomainResult, null, false, true, false, null, null, 59, null);
                }
                if (healthspanDomainResult instanceof HealthspanDomainResult.OnboardingStepCompleted) {
                    return HealthspanDomainResult.OnboardingStepCompleted.copy$default((HealthspanDomainResult.OnboardingStepCompleted) healthspanDomainResult, 0, false, true, 3, null);
                }
            } else {
                if (!(obj2 instanceof AbstractC8804c.c)) {
                    if (!(healthspanDomainResult instanceof HealthspanDomainResult.Success) || !(obj2 instanceof HealthspanDomainResult.Success)) {
                        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type com.whoop.healthspan.domain.HealthspanDomainResult");
                        return (HealthspanDomainResult) obj2;
                    }
                    HealthspanDomainResult.Success success = (HealthspanDomainResult.Success) obj2;
                    if (!success.isFromDateChange()) {
                        return success;
                    }
                    UnlockedContentResponse unlockedContent = ((HealthspanDomainResult.Success) healthspanDomainResult).getResponse().getUnlockedContent();
                    if (unlockedContent == null || (items = unlockedContent.getItems()) == null) {
                        num = null;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : items) {
                            if (obj3 instanceof PaceOfAgingMeterModel) {
                                arrayList.add(obj3);
                            }
                        }
                        PaceOfAgingMeterModel paceOfAgingMeterModel = (PaceOfAgingMeterModel) AbstractC25265s.m74100H0(arrayList);
                        if (paceOfAgingMeterModel == null || (ticks = paceOfAgingMeterModel.getTicks()) == null) {
                            num = null;
                        } else {
                            Iterator<PaceOfAgingMeterTickModel> it = ticks.iterator();
                            int i13 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i13 = -1;
                                    break;
                                }
                                if (it.next().isCurrentValue()) {
                                    break;
                                }
                                i13++;
                            }
                            Integer num2 = new Integer(i13);
                            if (num2.intValue() != -1) {
                                num = num2;
                            } else {
                                num = null;
                            }
                        }
                    }
                    return HealthspanDomainResult.Success.copy$default(success, null, false, false, false, num, null, 47, null);
                }
                if (healthspanDomainResult instanceof HealthspanDomainResult.Success) {
                    HealthspanDomainResult.Success success2 = (HealthspanDomainResult.Success) healthspanDomainResult;
                    LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(success2.getDrawerExpandedStates());
                    AbstractC8804c.c cVar = (AbstractC8804c.c) obj2;
                    linkedHashMapM74003l0.put(cVar.getId(), Boolean.valueOf(cVar.getIsExpanded()));
                    return HealthspanDomainResult.Success.copy$default(success2, null, false, false, false, null, linkedHashMapM74003l0, 31, null);
                }
            }
            return healthspanDomainResult;
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$r */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor", m100430f = "HealthspanInteractor.kt", m100431l = {174}, m100432m = "toggleDrawer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f26320F;

        /* JADX INFO: renamed from: w */
        Object f26321w;

        /* JADX INFO: renamed from: x */
        Object f26322x;

        /* JADX INFO: renamed from: y */
        boolean f26323y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f26324z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f26324z = obj;
            this.f26320F |= Integer.MIN_VALUE;
            return C8803b.this.m21626r(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthspan.domain.b$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthspan.domain.HealthspanInteractor$toggleDrawer$2", m100430f = "HealthspanInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f26325w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f26327y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f26328z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, boolean z4, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f26327y = str;
            this.f26328z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C8803b.this.new s(this.f26327y, this.f26328z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f26325w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C8803b.this.sharedPreferences.m109538q(AbstractC11266d.m30461o(SharedPreferenceConstants.KEY_HEALTHSPAN_DRAWER_EXPANDED_PREFIX, this.f26327y), this.f26328z);
            return C23454a0.f92919a;
        }
    }

    public C8803b(HealthspanApi api, InterfaceC34116n logger, InterfaceC18732d dispatcher, C34660d sharedPreferences, C14553a drawerIdProvider, C38458b cacheUpdater) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(drawerIdProvider, "drawerIdProvider");
        AbstractC22676k.m65750j(cacheUpdater, "cacheUpdater");
        this.api = api;
        this.logger = logger;
        this.dispatcher = dispatcher;
        this.sharedPreferences = sharedPreferences;
        this.drawerIdProvider = drawerIdProvider;
        this.cacheUpdater = cacheUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public final Object m21619k(HealthspanResponse healthspanResponse, boolean z4, InterfaceC30057d<? super HealthspanDomainResult.Success> interfaceC30057d) {
        a aVar;
        HealthspanResponse healthspanResponse2;
        boolean z13;
        HealthspanResponse healthspanResponse3;
        boolean z14;
        HealthspanResponse healthspanResponse4;
        boolean z15;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f26257G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f26257G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f26255E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f26257G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            UnlockedContentResponse unlockedContent = healthspanResponse.getUnlockedContent();
            if (unlockedContent != null) {
                boolean zIsCalibrating = unlockedContent.isCalibrating();
                if (zIsCalibrating) {
                    healthspanResponse3 = healthspanResponse;
                    z14 = z4;
                } else {
                    InterfaceC30063j interfaceC30063jMo54465b = this.dispatcher.mo54465b();
                    b bVar = new b(null);
                    healthspanResponse3 = healthspanResponse;
                    aVar.f26258w = healthspanResponse3;
                    z14 = z4;
                    aVar.f26259x = z14;
                    aVar.f26260y = zIsCalibrating;
                    aVar.f26261z = 0;
                    aVar.f26257G = 1;
                    if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, bVar, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                healthspanResponse4 = healthspanResponse3;
                z15 = z14;
            } else {
                healthspanResponse2 = healthspanResponse;
                z13 = z4;
            }
            return new HealthspanDomainResult.Success(healthspanResponse2, this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, false), this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_INFO_CALLOUT, false), z13, (Integer) null, m21622n(healthspanResponse2), 16, (DefaultConstructorMarker) null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z15 = aVar.f26259x;
        healthspanResponse4 = (HealthspanResponse) aVar.f26258w;
        AbstractC34132o.m107864I(obj);
        healthspanResponse2 = healthspanResponse4;
        z13 = z15;
        return new HealthspanDomainResult.Success(healthspanResponse2, this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_CALIBRATION, false), this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_TORTOISE_HAS_CLOSED_INFO_CALLOUT, false), z13, (Integer) null, m21622n(healthspanResponse2), 16, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m21620l(InterfaceC30057d<? super AbstractC8804c.a> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f26266y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f26266y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f26264w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f26266y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC30063j interfaceC30063jMo54465b = this.dispatcher.mo54465b();
            d dVar = new d(null);
            cVar.f26266y = 1;
            if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, dVar, cVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return AbstractC8804c.a.f26329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m21621m(InterfaceC30057d<? super AbstractC8804c.b> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f26271y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f26271y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f26269w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f26271y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC30063j interfaceC30063jMo54465b = this.dispatcher.mo54465b();
            f fVar = new f(null);
            eVar.f26271y = 1;
            if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, fVar, eVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return AbstractC8804c.b.f26330a;
    }

    /* JADX INFO: renamed from: n */
    private final Map<String, Boolean> m21622n(HealthspanResponse response) {
        List<DesignSystemModel> items;
        List listM118958J;
        UnlockedContentResponse unlockedContent = response.getUnlockedContent();
        List list = C25271y.f99162w;
        if (unlockedContent != null && (items = unlockedContent.getItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof TileSectionModel) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                List<DesignSystemModel> items2 = ((TileSectionModel) it.next()).getItems();
                ArrayList arrayList3 = new ArrayList();
                for (DesignSystemModel designSystemModel : items2) {
                    if (designSystemModel instanceof LabsImpactCardModel) {
                        listM118958J = AbstractC37056f.m118958J(this.drawerIdProvider.m41573a(((LabsImpactCardModel) designSystemModel).getTitle()));
                    } else if (designSystemModel instanceof ContributorsContainerResponse) {
                        List<SingleContributorContainer> contributors = ((ContributorsContainerResponse) designSystemModel).getContributors();
                        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(contributors, 10));
                        Iterator<T> it3 = contributors.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(this.drawerIdProvider.m41573a(((SingleContributorContainer) it3.next()).getTitleDisplay()));
                        }
                        listM118958J = arrayList4;
                    } else {
                        listM118958J = list;
                    }
                    AbstractC25265s.m74141p0(arrayList3, listM118958J);
                }
                AbstractC25265s.m74141p0(arrayList2, arrayList3);
            }
            list = arrayList2;
        }
        List list2 = list;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj2 : list2) {
            linkedHashMap.put(obj2, Boolean.valueOf(m21625q((String) obj2)));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        if (r14 == r0) goto L24;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m21623o(java.lang.String r12, boolean r13, q83.InterfaceC30057d<? super com.whoop.healthspan.domain.HealthspanDomainResult> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.whoop.healthspan.domain.C8803b.g
            if (r0 == 0) goto L14
            r0 = r14
            com.whoop.healthspan.domain.b$g r0 = (com.whoop.healthspan.domain.C8803b.g) r0
            int r1 = r0.f26275F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f26275F = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.healthspan.domain.b$g r0 = new com.whoop.healthspan.domain.b$g
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f26279z
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f26275F
            r9 = 2
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L47
            if (r1 == r2) goto L3d
            if (r1 != r9) goto L35
            java.lang.Object r12 = r6.f26277x
            u02.a r12 = (u02.InterfaceC34385a) r12
            java.lang.Object r12 = r6.f26276w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r14)
            goto L82
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            boolean r13 = r6.f26278y
            java.lang.Object r12 = r6.f26276w
            java.lang.String r12 = (java.lang.String) r12
            p505ts.AbstractC34132o.m107864I(r14)
            goto L65
        L47:
            p505ts.AbstractC34132o.m107864I(r14)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r14 = r2
            tr2.n r2 = r11.logger
            com.whoop.healthspan.domain.b$h r5 = new com.whoop.healthspan.domain.b$h
            r5.<init>(r12, r10)
            r6.f26276w = r10
            r6.f26278y = r13
            r6.f26275F = r14
            r3 = 0
            r4 = 0
            r7 = 6
            r8 = 0
            java.lang.Object r14 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L65
            goto L81
        L65:
            u02.a r14 = (u02.InterfaceC34385a) r14
            boolean r12 = r14 instanceof u02.InterfaceC34385a.c
            if (r12 == 0) goto L85
            u02.a$c r14 = (u02.InterfaceC34385a.c) r14
            java.lang.Object r12 = r14.m108735a()
            com.whoop.healthspan.domain.models.HealthspanResponse r12 = (com.whoop.healthspan.domain.models.HealthspanResponse) r12
            r6.f26276w = r10
            r6.f26277x = r10
            r6.f26278y = r13
            r6.f26275F = r9
            java.lang.Object r14 = r11.m21619k(r12, r13, r6)
            if (r14 != r0) goto L82
        L81:
            return r0
        L82:
            com.whoop.healthspan.domain.HealthspanDomainResult r14 = (com.whoop.healthspan.domain.HealthspanDomainResult) r14
            return r14
        L85:
            boolean r12 = r14 instanceof u02.InterfaceC34385a.b
            if (r12 == 0) goto L8c
            com.whoop.healthspan.domain.HealthspanDomainResult$a r12 = com.whoop.healthspan.domain.HealthspanDomainResult.C8799a.f26238a
            return r12
        L8c:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.healthspan.domain.C8803b.m21623o(java.lang.String, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m21624p(C8803b c8803b, String str, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c8803b.m21623o(str, z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: q */
    private final boolean m21625q(String id4) {
        return this.sharedPreferences.m109528e(SharedPreferenceConstants.KEY_HEALTHSPAN_DRAWER_EXPANDED_PREFIX + id4, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m21626r(String str, boolean z4, InterfaceC30057d<? super AbstractC8804c.c> interfaceC30057d) {
        r rVar;
        String strM41573a;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i13 = rVar.f26320F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rVar.f26320F = i13 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        Object obj = rVar.f26324z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = rVar.f26320F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            strM41573a = this.drawerIdProvider.m41573a(str);
            InterfaceC30063j interfaceC30063jMo54465b = this.dispatcher.mo54465b();
            s sVar = new s(strM41573a, z4, null);
            rVar.f26321w = null;
            rVar.f26322x = strM41573a;
            rVar.f26323y = z4;
            rVar.f26320F = 1;
            if (AbstractC3006f0.m8705K(interfaceC30063jMo54465b, sVar, rVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = rVar.f26323y;
            strM41573a = (String) rVar.f26322x;
            AbstractC34132o.m107864I(obj);
        }
        return new AbstractC8804c.c(strM41573a, z4);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(HealthspanDomainResult.C8801c.f26240a, AbstractC13091v.m36590P(upstream, new i(null, this)), new q(null));
    }

    public /* synthetic */ C8803b(HealthspanApi healthspanApi, InterfaceC34116n interfaceC34116n, InterfaceC18732d interfaceC18732d, C34660d c34660d, C14553a c14553a, C38458b c38458b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(healthspanApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HealthspanInteractor") : interfaceC34116n, interfaceC18732d, c34660d, (i13 & 16) != 0 ? new C14553a() : c14553a, c38458b);
    }
}
