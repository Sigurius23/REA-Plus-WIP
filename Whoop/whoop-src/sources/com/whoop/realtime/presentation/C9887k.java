package com.whoop.realtime.presentation;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import bh3.InterfaceC3255b;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.IncreaseAlertnessId;
import com.whoop.data.repositories.IncreaseRelaxationId;
import com.whoop.design.util.TextResource;
import com.whoop.entitlements.Entitlement;
import com.whoop.p069ui.activities.realtime.SportCategory;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.SportList;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutKt;
import g83.C15578d;
import ge3.AbstractC15751g;
import hj0.AbstractC17356o;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import js0.AbstractC21909c;
import js0.C21908b;
import k52.AbstractC22210f;
import l73.AbstractC23412c;
import l83.C23454a0;
import live.hms.video.utils.HMSConstantsKt;
import lm2.C24515a;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26460c;
import o52.C27560j0;
import od1.C27856s;
import or2.C28180m;
import or2.C28199s0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import we1.InterfaceC37217a;
import xg3.InterfaceC38293t;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import z82.C40191e;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001|BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u0018J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010\u0018J\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b1\u00102J1\u00106\u001a\b\u0012\u0004\u0012\u0002050*2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190*2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00190*H\u0002¢\u0006\u0004\b6\u00107J#\u00108\u001a\b\u0012\u0004\u0012\u0002050*2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190*H\u0002¢\u0006\u0004\b8\u0010.J#\u00109\u001a\b\u0012\u0004\u0012\u0002050*2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190*H\u0002¢\u0006\u0004\b9\u0010.J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00190*2\u0006\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020:H\u0082@¢\u0006\u0004\b@\u0010?J'\u0010C\u001a\u00020\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190*2\b\u0010B\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010X\u001a\u00020T8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010U\u001a\u0004\bV\u0010WR)\u0010]\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050*0*0Y8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bE\u0010\\R\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00190Y8\u0006¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\bR\u0010\\R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u0002000Y8\u0006¢\u0006\f\n\u0004\bC\u0010[\u001a\u0004\b^\u0010\\R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u0002000a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001d0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010eR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020+0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010hR\u0018\u0010l\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010n\u001a\b\u0012\u0004\u0012\u00020m0g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010hR$\u0010p\u001a\u00020T2\u0006\u0010o\u001a\u00020T8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010U\u001a\u0004\bM\u0010WR\u0016\u0010r\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010qR\u0017\u0010u\u001a\b\u0012\u0004\u0012\u0002000s8F¢\u0006\u0006\u001a\u0004\bI\u0010tR(\u0010w\u001a\u0004\u0018\u00010$2\b\u0010o\u001a\u0004\u0018\u00010$8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010&\"\u0004\bq\u0010vR\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020m0*8F¢\u0006\u0006\u001a\u0004\bZ\u0010xR\u0014\u0010{\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010z¨\u0006}"}, m65681d2 = {"Lcom/whoop/realtime/presentation/k;", "Lhj0/o;", "Llm2/a;", "activityHistoryStore", "Lod1/s;", "sportMgr", "Lq83/j;", "ioDispatcher", "Lz82/e;", "eventDispatcher", "Landroidx/lifecycle/k1;", "savedStateHandle", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljs0/c;", "configRepository", "Lwe1/a;", "entitlementChecker", "Lbc3/c0;", "closeableCoroutineScope", "<init>", "(Llm2/a;Lod1/s;Lq83/j;Lz82/e;Landroidx/lifecycle/k1;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Lwe1/a;Lbc3/c0;)V", "Ll83/a0;", "W", "()V", "Lcom/whoop/realtime/presentation/c$a;", "activity", "S", "(Lcom/whoop/realtime/presentation/c$a;)V", "", "position", "X", "(I)V", "c0", "V", "U", "Llm2/b;", "M", "()Llm2/b;", "id", "b0", "(Ljava/lang/Integer;)V", "", "Lcom/whoop/service/network/model/Sport;", "sports", "D", "(Ljava/util/List;)Ljava/util/List;", "sport", "", "d0", "(Lcom/whoop/service/network/model/Sport;)Z", "addableActivities", "recentActivities", "Lcom/whoop/realtime/presentation/c;", "C", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "e0", "Y", "Lcom/whoop/service/network/model/SportList;", "sportList", "K", "(Lcom/whoop/service/network/model/SportList;Lq83/d;)Ljava/lang/Object;", "Q", "(Lq83/d;)Ljava/lang/Object;", "R", "recents", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "P", "(Ljava/util/List;Lcom/whoop/realtime/presentation/c$a;)V", "E", "Llm2/a;", "F", "Lod1/s;", "G", "Lq83/j;", "H", "Lz82/e;", "I", "Landroidx/lifecycle/k1;", "J", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lwe1/a;", "L", "Lbc3/c0;", "", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "N", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "activitiesLiveData", "O", "selectedActivityLiveData", "toggleListStateLiveData", "Lg83/d;", "Lg83/d;", "gpsStateSubject", "", "Ljava/util/Set;", "guidedBreathingIds", "", "Ljava/util/List;", "allSportList", "T", "Ljava/lang/Integer;", "preSelectedSportId", "Lo52/j0;", "_tabs", "value", "lastTabSelected", "Z", "animating", "Ll73/c;", "()Ll73/c;", "gpsStateObservable", "(Llm2/b;)V", "currentSelection", "()Ljava/util/List;", "tabs", "()Z", "guidedBreathingEnabledForUser", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9887k extends AbstractC17356o {

    /* JADX INFO: renamed from: Y */
    public static final int f28986Y = 8;

    /* JADX INFO: renamed from: Z */
    private static final List<AbstractC9879c.a> f28987Z = AbstractC37056f.m118959K(new AbstractC9879c.a(new C24517c(false), false, 2, null), new AbstractC9879c.a(new C24517c(true), false, 2, null));

    /* JADX INFO: renamed from: a0 */
    private static final Set<SportCategory> f28988a0 = AbstractC25260n.m74059b1(new SportCategory[]{SportCategory.CARDIOVASCULAR, SportCategory.MUSCULAR, SportCategory.NON_CARDIO});

    /* JADX INFO: renamed from: b0 */
    private static final AbstractC9879c.d f28989b0 = new AbstractC9879c.d(new TextResource.C8688b(AbstractC22210f.f86440Q, null, 2, null));

    /* JADX INFO: renamed from: c0 */
    private static final AbstractC9879c.c f28990c0 = new AbstractC9879c.c(new TextResource.C8688b(AbstractC22210f.f86438P, null, 2, null));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C24515a activityHistoryStore;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C27856s sportMgr;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC30063j ioDispatcher;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C1601k1 savedStateHandle;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC2994c0 closeableCoroutineScope;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final AbstractC1615p0 activitiesLiveData;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final AbstractC1615p0 selectedActivityLiveData;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final AbstractC1615p0 toggleListStateLiveData;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C15578d gpsStateSubject;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final Set<Integer> guidedBreathingIds;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final List<Sport> allSportList;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private Integer preSelectedSportId;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private List<C27560j0> _tabs;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private String lastTabSelected;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private boolean animating;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityViewModel", m100430f = "SelectActivityViewModel.kt", m100431l = {219}, m100432m = "getRecentActivities", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f29010w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f29011x;

        /* JADX INFO: renamed from: z */
        int f29013z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29011x = obj;
            this.f29013z |= Integer.MIN_VALUE;
            return C9887k.this.m24089K(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityViewModel$getRecentActivities$history$1", m100430f = "SelectActivityViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lbc3/c0;", "", "Llm2/b;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lbc3/c0;)Ljava/util/List;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29014w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ SportList f29016y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SportList sportList, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29016y = sportList;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9887k.this.new c(this.f29016y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super List<InterfaceC24516b>> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f29014w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C9887k.this.activityHistoryStore.m71411c(this.f29016y);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityViewModel", m100430f = "SelectActivityViewModel.kt", m100431l = {231, 240}, m100432m = "loadData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29017E;

        /* JADX INFO: renamed from: w */
        Object f29018w;

        /* JADX INFO: renamed from: x */
        Object f29019x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29020y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29020y = obj;
            this.f29017E |= Integer.MIN_VALUE;
            return C9887k.this.m24091Q(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityViewModel$obtainSports$2", m100430f = "SelectActivityViewModel.kt", m100431l = {297}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/service/network/model/SportList;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/service/network/model/SportList;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f29022w;

        /* JADX INFO: renamed from: x */
        int f29023x;

        /* JADX INFO: renamed from: y */
        int f29024y;

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC38293t f29026w;

            public a(InterfaceC38293t interfaceC38293t) {
                this.f29026w = interfaceC38293t;
            }

            /* JADX INFO: renamed from: a */
            public final void m24115a(Throwable th3) {
                this.f29026w.mo14750b();
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m24115a((Throwable) obj);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$e$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC3025k f29027w;

            public b(InterfaceC3025k interfaceC3025k) {
                this.f29027w = interfaceC3025k;
            }

            /* JADX INFO: renamed from: a */
            public final void m24116a(SportList sportList) {
                this.f29027w.resumeWith(sportList);
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m24116a((SportList) obj);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$e$c */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c<T> implements InterfaceC3255b {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC3025k f29028w;

            public c(InterfaceC3025k interfaceC3025k) {
                this.f29028w = interfaceC3025k;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void mo9472b(Throwable th3) {
                InterfaceC3025k interfaceC3025k = this.f29028w;
                AbstractC22676k.m65747g(th3);
                interfaceC3025k.resumeWith(AbstractC34132o.m107888l(th3));
            }
        }

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9887k.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super SportList> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29024y;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C9887k c9887k = C9887k.this;
            this.f29022w = c9887k;
            this.f29023x = 0;
            this.f29024y = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
            c3033m.m8774s();
            InterfaceC38293t interfaceC38293tM122662L = c9887k.sportMgr.m84016f().m122667R(1).m122662L(new AbstractC9888l.a(new b(c3033m)), new c(c3033m));
            c9887k.getSubscriptions().m75179c(interfaceC38293tM122662L);
            c3033m.m8776u(new a(interfaceC38293tM122662L));
            Object objM8773r = c3033m.m8773r();
            return objM8773r == enumC31071a ? enumC31071a : objM8773r;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.k$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.SelectActivityViewModel$onCreate$1", m100430f = "SelectActivityViewModel.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f29029w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C9887k.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f29029w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C9887k c9887k = C9887k.this;
                this.f29029w = 1;
                if (c9887k.m24091Q(this) == enumC31071a) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:7:0x009b  */
    public C9887k(C24515a activityHistoryStore, C27856s sportMgr, InterfaceC30063j ioDispatcher, C40191e eventDispatcher, C1601k1 savedStateHandle, FeatureFlagChecker featureFlagChecker, AbstractC21909c configRepository, InterfaceC37217a entitlementChecker, InterfaceC2994c0 closeableCoroutineScope) {
        Object objM125868N0;
        super(closeableCoroutineScope);
        AbstractC22676k.m65750j(activityHistoryStore, "activityHistoryStore");
        AbstractC22676k.m65750j(sportMgr, "sportMgr");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(configRepository, "configRepository");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(closeableCoroutineScope, "closeableCoroutineScope");
        this.activityHistoryStore = activityHistoryStore;
        this.sportMgr = sportMgr;
        this.ioDispatcher = ioDispatcher;
        this.eventDispatcher = eventDispatcher;
        this.savedStateHandle = savedStateHandle;
        this.featureFlagChecker = featureFlagChecker;
        this.entitlementChecker = entitlementChecker;
        this.closeableCoroutineScope = closeableCoroutineScope;
        this.logTag = "SelectActivityViewModel";
        this.activitiesLiveData = new C1630u0();
        this.selectedActivityLiveData = new C28199s0();
        this.toggleListStateLiveData = new C1630u0();
        this.gpsStateSubject = new C15578d();
        IncreaseRelaxationId increaseRelaxationId = IncreaseRelaxationId.INSTANCE;
        C21908b configurations = configRepository.getConfigurations();
        String name = increaseRelaxationId.getName();
        Object defaultValue = increaseRelaxationId.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Class cls = Integer.TYPE;
        boolean zM65745e = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(cls));
        Class cls2 = Boolean.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Object objM125868N1 = null;
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
        defaultValue = objM125868N0 != null ? objM125868N0 : defaultValue;
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        Integer num = (Integer) defaultValue;
        IncreaseAlertnessId increaseAlertnessId = IncreaseAlertnessId.INSTANCE;
        C21908b configurations2 = configRepository.getConfigurations();
        String name2 = increaseAlertnessId.getName();
        Object defaultValue2 = increaseAlertnessId.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass2 = c22673i0.getOrCreateKotlinClass(Integer.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls))) {
            String str6 = (String) configurations2.get(name2);
            if (str6 != null) {
                objM125868N1 = AbstractC39421y.m125932Q(str6);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls5))) {
            String str7 = (String) configurations2.get(name2);
            if (str7 != null) {
                objM125868N1 = AbstractC39421y.m125933R(str7);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls4))) {
            String str8 = (String) configurations2.get(name2);
            if (str8 != null) {
                objM125868N1 = AbstractC39420x.m125915y(str8);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls3))) {
            String str9 = (String) configurations2.get(name2);
            if (str9 != null) {
                objM125868N1 = AbstractC39420x.m125914x(str9);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(cls2))) {
            String str10 = (String) configurations2.get(name2);
            if (str10 != null) {
                objM125868N1 = AbstractC39414r.m125868N0(str10);
            }
        } else {
            objM125868N1 = AbstractC22676k.m65745e(orCreateKotlinClass2, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations2.get(name2) : defaultValue2;
        }
        defaultValue2 = objM125868N1 != null ? objM125868N1 : defaultValue2;
        if (defaultValue2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        this.guidedBreathingIds = AbstractC25260n.m74059b1(new Integer[]{num, (Integer) defaultValue2});
        this.allSportList = new ArrayList();
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(new C27560j0(AbstractC22210f.f86442R, "All"), new C27560j0(AbstractC22210f.f86448U, "Strain"), new C27560j0(AbstractC22210f.f86444S, "Recovery"), new C27560j0(AbstractC22210f.f86446T, "Sleep"));
        this._tabs = arrayListM118964P;
        this.lastTabSelected = ((C27560j0) arrayListM118964P.get(0)).getEventName();
    }

    /* JADX INFO: renamed from: C */
    private final List<AbstractC9879c> m24086C(List<AbstractC9879c.a> addableActivities, List<AbstractC9879c.a> recentActivities) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        List<AbstractC9879c.a> list = recentActivities;
        if (!list.isEmpty()) {
            c26460cM119000x.add(new AbstractC9879c.b(new TextResource.C8688b(AbstractC22210f.f86469d, null, 2, null)));
            c26460cM119000x.addAll(list);
        }
        c26460cM119000x.add(new AbstractC9879c.b(new TextResource.C8688b(AbstractC22210f.f86460a, null, 2, null)));
        c26460cM119000x.addAll(f28987Z);
        c26460cM119000x.addAll(addableActivities);
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: D */
    private final List<AbstractC9879c.a> m24087D(List<Sport> sports) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : sports) {
            if (m24095d0((Sport) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AbstractC9879c.a(new C24518d((Sport) it.next()), false, 2, null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: H */
    private final boolean m24088H() {
        return this.entitlementChecker.mo119272b(Entitlement.STRESS_MONITOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    public final Object m24089K(SportList sportList, InterfaceC30057d<? super List<AbstractC9879c.a>> interfaceC30057d) throws Throwable {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f29013z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f29013z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8705K = bVar.f29011x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f29013z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            InterfaceC30063j interfaceC30063j = this.ioDispatcher;
            c cVar = new c(sportList, null);
            bVar.f29010w = null;
            bVar.f29013z = 1;
            objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, cVar, bVar);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        List list = (List) objM8705K;
        AbstractC22676k.m65747g(list);
        ArrayList<InterfaceC24516b> arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC24516b interfaceC24516b = (InterfaceC24516b) obj;
            if (!(interfaceC24516b instanceof C24518d) || m24095d0(((C24518d) interfaceC24516b).m71421k())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (InterfaceC24516b interfaceC24516b2 : arrayList) {
            AbstractC22676k.m65747g(interfaceC24516b2);
            arrayList2.add(new AbstractC9879c.a(interfaceC24516b2, false, 2, null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: P */
    private final void m24090P(List<AbstractC9879c.a> recents, AbstractC9879c.a aVar) {
        if (!recents.isEmpty()) {
            m49138t(this.selectedActivityLiveData, recents.get(0));
        } else if (aVar != null) {
            m49138t(this.selectedActivityLiveData, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public final Object m24091Q(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        d dVar;
        SportList sportList;
        List<AbstractC9879c.a> list;
        List<AbstractC9879c.a> list2;
        InterfaceC24516b interfaceC24516bM24105M;
        Sport sportM24119b;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f29017E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f29017E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM24089K = dVar.f29020y;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f29017E;
        Object obj2 = null;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM24089K);
                dVar.f29017E = 1;
                objM24089K = m24092R(dVar);
                if (objM24089K == obj) {
                }
                return obj;
            }
            if (i14 == 1) {
                AbstractC34132o.m107864I(objM24089K);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) dVar.f29019x;
                AbstractC34132o.m107864I(objM24089K);
            }
            list2 = (List) objM24089K;
            m49138t(this.activitiesLiveData, AbstractC37056f.m118964P(m24086C(list, list2), m24096e0(list), m24093Y(list), f28987Z));
            interfaceC24516bM24105M = m24105M();
            if (interfaceC24516bM24105M == null) {
                interfaceC24516bM24105M = m24101F();
            }
            if (interfaceC24516bM24105M != null) {
                m49138t(this.selectedActivityLiveData, new AbstractC9879c.a(interfaceC24516bM24105M, false, 2, null));
            } else {
                for (Object obj3 : list) {
                    sportM24119b = AbstractC9888l.m24119b((AbstractC9879c.a) obj3);
                    if (sportM24119b == null && sportM24119b.getId() == 0) {
                        obj2 = obj3;
                        break;
                    }
                }
                m24090P(list2, (AbstractC9879c.a) obj2);
            }
            return C23454a0.f92919a;
            sportList = (SportList) objM24089K;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(dVar.getContext());
            m49136n().mo85230v("Failed to load sports", e5, new AbstractC30556a.a[0]);
            sportList = new SportList(C25271y.f99162w);
        }
        List<Sport> list3 = this.allSportList;
        List<Sport> currentSports = sportList.getCurrentSports();
        AbstractC22676k.m65749i(currentSports, "getCurrentSports(...)");
        list3.addAll(currentSports);
        List<Sport> currentSports2 = sportList.getCurrentSports();
        AbstractC22676k.m65749i(currentSports2, "getCurrentSports(...)");
        List<AbstractC9879c.a> listM24087D = m24087D(currentSports2);
        dVar.f29018w = null;
        dVar.f29019x = listM24087D;
        dVar.f29017E = 2;
        objM24089K = m24089K(sportList, dVar);
        if (objM24089K != obj) {
            list = listM24087D;
            list2 = (List) objM24089K;
            m49138t(this.activitiesLiveData, AbstractC37056f.m118964P(m24086C(list, list2), m24096e0(list), m24093Y(list), f28987Z));
            interfaceC24516bM24105M = m24105M();
            if (interfaceC24516bM24105M == null) {
                interfaceC24516bM24105M = m24101F();
            }
            if (interfaceC24516bM24105M != null) {
                m49138t(this.selectedActivityLiveData, new AbstractC9879c.a(interfaceC24516bM24105M, false, 2, null));
            } else {
                while (r0.hasNext()) {
                    sportM24119b = AbstractC9888l.m24119b((AbstractC9879c.a) obj3);
                    if (sportM24119b == null) {
                    }
                }
                m24090P(list2, (AbstractC9879c.a) obj2);
            }
            return C23454a0.f92919a;
        }
        return obj;
    }

    /* JADX INFO: renamed from: R */
    private final Object m24092R(InterfaceC30057d<? super SportList> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.ioDispatcher, new e(null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: Y */
    private final List<AbstractC9879c> m24093Y(List<AbstractC9879c.a> addableActivities) {
        ArrayList<AbstractC9879c.a> arrayList = new ArrayList();
        Iterator<T> it = addableActivities.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Sport sportM24119b = AbstractC9888l.m24119b((AbstractC9879c.a) next);
            if ((sportM24119b != null ? sportM24119b.getCategory() : null) == SportCategory.RESTORATIVE) {
                arrayList.add(next);
            }
        }
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            for (AbstractC9879c.a aVar : arrayList) {
                Set<Integer> set = this.guidedBreathingIds;
                Sport sportM24119b2 = AbstractC9888l.m24119b(aVar);
                if (AbstractC25265s.m74155w0(set, sportM24119b2 != null ? Integer.valueOf(sportM24119b2.getId()) : null)) {
                    z4 = true;
                    break;
                }
            }
        }
        if (!m24088H() || !z4) {
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add(f28989b0);
            c26460cM119000x.addAll(arrayList);
            c26460cM119000x.add(f28990c0);
            return AbstractC37056f.m118988k(c26460cM119000x);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            Set<Integer> set2 = this.guidedBreathingIds;
            Sport sportM24119b3 = AbstractC9888l.m24119b((AbstractC9879c.a) obj);
            if (AbstractC25265s.m74155w0(set2, sportM24119b3 != null ? Integer.valueOf(sportM24119b3.getId()) : null)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        C26460c c26460cM119000x2 = AbstractC37056f.m119000x();
        c26460cM119000x2.add(f28989b0);
        c26460cM119000x2.add(new AbstractC9879c.b(new TextResource.C8688b(AbstractC22210f.f86463b, null, 2, null)));
        c26460cM119000x2.addAll(arrayList2);
        c26460cM119000x2.add(new AbstractC9879c.b(new TextResource.C8688b(AbstractC22210f.f86466c, null, 2, null)));
        c26460cM119000x2.addAll(arrayList3);
        c26460cM119000x2.add(f28990c0);
        return AbstractC37056f.m118988k(c26460cM119000x2);
    }

    /* JADX INFO: renamed from: Z */
    private final void m24094Z(InterfaceC24516b interfaceC24516b) {
        this.savedStateHandle.m5004e(interfaceC24516b, "selected-activity");
    }

    /* JADX INFO: renamed from: d0 */
    private final boolean m24095d0(Sport sport) {
        if (sport == null) {
            return false;
        }
        return !AbstractC22676k.m65745e(sport.getActivityTypeInternalName(), WeightliftingWorkoutKt.WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE) && (m24088H() || !this.guidedBreathingIds.contains(Integer.valueOf(sport.getId())));
    }

    /* JADX INFO: renamed from: e0 */
    private final List<AbstractC9879c> m24096e0(List<AbstractC9879c.a> addableActivities) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : addableActivities) {
            Set<SportCategory> set = f28988a0;
            Sport sportM24119b = AbstractC9888l.m24119b((AbstractC9879c.a) obj);
            if (AbstractC25265s.m74155w0(set, sportM24119b != null ? sportM24119b.getCategory() : null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final AbstractC1615p0 getActivitiesLiveData() {
        return this.activitiesLiveData;
    }

    /* JADX INFO: renamed from: F */
    public final InterfaceC24516b m24101F() {
        return (InterfaceC24516b) this.savedStateHandle.m5001b("selected-activity");
    }

    /* JADX INFO: renamed from: G */
    public final AbstractC23412c m24102G() {
        return this.gpsStateSubject;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getLastTabSelected() {
        return this.lastTabSelected;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final AbstractC1615p0 getSelectedActivityLiveData() {
        return this.selectedActivityLiveData;
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC24516b m24105M() {
        Object next;
        if (this.preSelectedSportId != null && this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WTE_STRAIN_COACH_SPORT)) {
            Iterator<T> it = this.allSportList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int id4 = ((Sport) next).getId();
                Integer num = this.preSelectedSportId;
                if (num != null && id4 == num.intValue()) {
                    break;
                }
            }
            Sport sport = (Sport) next;
            if (sport != null) {
                C24518d c24518d = new C24518d(sport);
                m24094Z(c24518d);
                return c24518d;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final List<C27560j0> m24106N() {
        return AbstractC25265s.m74093D1(this._tabs);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final AbstractC1615p0 getToggleListStateLiveData() {
        return this.toggleListStateLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX INFO: renamed from: S */
    public final void m24108S(AbstractC9879c.a activity) {
        boolean z4;
        Sport sportM71421k;
        AbstractC22676k.m65750j(activity, "activity");
        m24094Z(activity.getActivity());
        C15578d c15578d = this.gpsStateSubject;
        if ((activity.getActivity() instanceof C24518d) && (sportM71421k = ((C24518d) activity.getActivity()).m71421k()) != null) {
            z4 = sportM71421k.getHasGps();
        }
        c15578d.onNext(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: U */
    public final void m24109U() {
        this.animating = false;
    }

    /* JADX INFO: renamed from: V */
    public final void m24110V() {
        this.animating = true;
    }

    /* JADX INFO: renamed from: W */
    public final void m24111W() {
        AbstractC3006f0.m8732z(this.closeableCoroutineScope, null, null, new f(null), 3);
    }

    /* JADX INFO: renamed from: X */
    public final void m24112X(int position) {
        if (this.toggleListStateLiveData.getValue() == null) {
            return;
        }
        String eventName = m24106N().get(position).getEventName();
        this.lastTabSelected = eventName;
        this.eventDispatcher.m129038j(eventName);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m24113b0(Integer id4) {
        this.preSelectedSportId = id4;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m24114c0() {
        if (this.animating) {
            return;
        }
        Boolean bool = (Boolean) this.toggleListStateLiveData.getValue();
        if (bool == null) {
            m49140v(this.toggleListStateLiveData, Boolean.TRUE);
        } else {
            m49140v(this.toggleListStateLiveData, Boolean.valueOf(!bool.booleanValue()));
        }
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C9887k(C24515a c24515a, C27856s c27856s, InterfaceC30063j interfaceC30063j, C40191e c40191e, C1601k1 c1601k1, FeatureFlagChecker featureFlagChecker, AbstractC21909c abstractC21909c, InterfaceC37217a interfaceC37217a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c24515a, c27856s, interfaceC30063j, c40191e, c1601k1, featureFlagChecker, abstractC21909c, interfaceC37217a, (i13 & 256) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
