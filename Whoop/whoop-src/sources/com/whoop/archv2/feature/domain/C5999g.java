package com.whoop.archv2.feature.domain;

import ad3.AbstractC0757c;
import bm.C3383g;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.CoachModal;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.DialogModel;
import com.whoop.design.models.modal.FullScreenContentModal;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.models.modal.ToastModal;
import com.whoop.design.models.modal.UnknownModal;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.PollingAction;
import com.whoop.whoopaction.domain.models.ReloadAction;
import com.whoop.whoopaction.domain.models.ReloadMode;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13052j1;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import od1.InterfaceC27844g;
import oi0.C27948a;
import om0.C28026c;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pi0.C29249a;
import q83.InterfaceC30057d;
import qw2.AbstractC30694b;
import qw2.C30695c;
import qw2.C30698f;
import r83.EnumC31071a;
import ri0.InterfaceC31443b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wm0.C37378a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003b`dBS\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b \u0010\u001bJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\u001bJ\u001f\u0010%\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,JM\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00182\b\u0010-\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b6\u00107J%\u0010:\u001a\u0004\u0018\u00010.2\b\u00108\u001a\u0004\u0018\u00010.2\b\u00109\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\b:\u0010;J'\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010$\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b>\u0010?J'\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010$\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b@\u0010?JQ\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010$\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010)2\u0006\u0010A\u001a\u0002002 \u0010C\u001a\u001c\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00180BH\u0002¢\u0006\u0004\bD\u0010EJI\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010$\u001a\u00020F2\b\u0010=\u001a\u0004\u0018\u00010)2 \u0010C\u001a\u001c\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00180BH\u0002¢\u0006\u0004\bG\u0010HJI\u0010J\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010$\u001a\u00020I2\b\u0010=\u001a\u0004\u0018\u00010)2 \u0010C\u001a\u001c\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00180BH\u0002¢\u0006\u0004\bJ\u0010KJI\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00182\u0006\u0010L\u001a\u00020.2\b\u0010=\u001a\u0004\u0018\u00010)2 \u0010C\u001a\u001c\u0012\u0004\u0012\u00020<\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00180BH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u00032\u0006\u0010O\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001eH\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010S\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010U\u001a\u0004\u0018\u00010)2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u0004\u0018\u00010\u00142\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bW\u0010XJ\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00182\u0006\u0010Z\u001a\u00020YH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00030\u00182\u0006\u0010-\u001a\u00020)2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006r"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g;", "Lod1/g;", "Lcom/whoop/archv2/feature/domain/c;", "Lcom/whoop/archv2/feature/domain/f;", "Lcom/whoop/archv2/feature/domain/k;", "fetchInteractor", "Lqw2/c;", "actionInteractor", "Lom0/c;", "prefetcher", "Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;", "loadMoreInteractor", "Loi0/a;", "analytics", "Lad3/c;", "json", "Lwm0/a;", "scopeCoordinator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "screenCacheKey", "<init>", "(Lcom/whoop/archv2/feature/domain/k;Lqw2/c;Lom0/c;Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;Loi0/a;Lad3/c;Lwm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "y", "z", "Lcom/whoop/archv2/feature/domain/i;", "s", "t", "r", "Lcom/whoop/archv2/feature/domain/g$b;", "state", "action", "J", "(Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$b;", "q", "(Lcom/whoop/archv2/feature/domain/g$b;)Lec3/l;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "D", "(Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;", "apiRequest", "Lcom/whoop/navigation/models/GenericInteraction;", "callerOnStartInteraction", "", "manualRefresh", "cacheKey", "Lcom/whoop/archv2/feature/domain/a;", "topItems", "Lcom/whoop/archv2/feature/domain/i$m;", "A", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;Lcom/whoop/archv2/feature/domain/a;)Lec3/l;", "bff", "caller", "E", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/whoopaction/domain/models/Action;", "savedApiRequest", "H", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lec3/l;", "G", "clearDialogBeforeRefreshShowContent", "Lkotlin/Function2;", "performActionFn", "F", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;ZLc93/m;)Lec3/l;", "Lcom/whoop/archv2/feature/domain/c$g;", "x", "(Lcom/whoop/archv2/feature/domain/c$g;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;", "Lcom/whoop/archv2/feature/domain/c$f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/archv2/feature/domain/c$f;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;", "interaction", "v", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/ApiRequest;Lc93/m;)Lec3/l;", "domainState", "I", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i;)Lcom/whoop/archv2/feature/domain/f;", "previousState", "u", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/f;", "L", "(Lcom/whoop/archv2/feature/domain/g$b;)Lcom/whoop/navigation/models/ApiRequest;", "K", "(Lcom/whoop/archv2/feature/domain/g$b;)Ljava/lang/String;", "Lqw2/b$a;", "actionDomainState", "Lcom/whoop/archv2/feature/domain/i$o;", "M", "(Lqw2/b$a;)Lec3/l;", "B", "(Lcom/whoop/navigation/models/ApiRequest;ZLjava/lang/String;)Lec3/l;", "a", "Lcom/whoop/archv2/feature/domain/k;", "b", "Lqw2/c;", "c", "Lom0/c;", "d", "Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;", "e", "Loi0/a;", "f", "Lad3/c;", "g", "Lwm0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/FeatureFlagChecker;", "i", "Ljava/lang/String;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C5999g implements InterfaceC27844g<AbstractC5995c, C5998f> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C6003k fetchInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28026c prefetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final GenericLoadMoreInteractor loadMoreInteractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27948a analytics;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String screenCacheKey;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$a0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithSingleFlatMapLatest$2", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/f;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23749w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23750x;

        public a0(InterfaceC30057d<? super a0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a0 a0Var = C5999g.this.new a0(interfaceC30057d);
            a0Var.f23750x = obj;
            return a0Var;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C5998f c5998f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a0) create(c5998f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C5998f c5998f = (C5998f) this.f23750x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23749w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C28026c.m84524g(C5999g.this.prefetcher, c5998f.getPrefetchList(), false, 2, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$b0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithSingleFlatMapLatest$internalActions$1", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$b;", "state", "Lcom/whoop/archv2/feature/domain/c;", "action", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23758w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23759x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23760y;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, AbstractC5995c abstractC5995c, InterfaceC30057d<? super b> interfaceC30057d) {
            b0 b0Var = C5999g.this.new b0(interfaceC30057d);
            b0Var.f23759x = bVar;
            b0Var.f23760y = abstractC5995c;
            return b0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar = (b) this.f23759x;
            AbstractC5995c abstractC5995c = (AbstractC5995c) this.f23760y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23758w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C5999g.this.m17927J(bVar, abstractC5995c);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$c0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c0 extends C22672i implements InterfaceC4351m {
        public c0(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForFlat", "performActionForFlat(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17924G(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23764a;

        static {
            int[] iArr = new int[ReloadMode.values().length];
            try {
                iArr[ReloadMode.PERSISTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReloadMode.TRANSIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23764a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$d0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d0 extends C22672i implements InterfaceC4351m {
        public d0(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForFlat", "performActionForFlat(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17924G(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$buildFetchFlow$1", m100430f = "GenericInteractor.kt", m100431l = {266, 267}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23765w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23766x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f23767y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23767y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f23767y, interfaceC30057d);
            eVar.f23766x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f23766x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f23765w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3e
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.archv2.feature.domain.i$b r6 = com.whoop.archv2.feature.domain.AbstractC6001i.b.f23934a
                r5.f23766x = r0
                r5.f23765w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L3d
            L30:
                ec3.l r6 = r5.f23767y
                r2 = 0
                r5.f23766x = r2
                r5.f23765w = r3
                java.lang.Object r6 = ec3.AbstractC13091v.m36613w(r0, r6, r5)
                if (r6 != r1) goto L3e
            L3d:
                return r1
            L3e:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$e0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e0 extends C22672i implements InterfaceC4351m {
        public e0(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForFlat", "performActionForFlat(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17924G(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$buildFetchFlow$reloadFetchFlow$1", m100430f = "GenericInteractor.kt", m100431l = {261}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i$m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C5999g f23768E;

        /* JADX INFO: renamed from: w */
        Object f23769w;

        /* JADX INFO: renamed from: x */
        int f23770x;

        /* JADX INFO: renamed from: y */
        int f23771y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC5995c.n f23772z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC5995c.n nVar, C5999g c5999g, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23772z = nVar;
            this.f23768E = c5999g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f23772z, this.f23768E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String refreshScope;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23771y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC5995c.n nVar = this.f23772z;
                if (nVar != null && (refreshScope = nVar.getRefreshScope()) != null) {
                    if (AbstractC39414r.m125890i0(refreshScope)) {
                        refreshScope = null;
                    }
                    if (refreshScope != null) {
                        C37378a c37378a = this.f23768E.scopeCoordinator;
                        this.f23769w = null;
                        this.f23770x = 0;
                        this.f23771y = 1;
                        if (c37378a.m119657b(refreshScope, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
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

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$f0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f23773E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23774w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C5999g f23775x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ GenericInteraction f23776y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5993a f23777z;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$f0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ boolean f23778E;

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23779w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C5999g f23780x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ GenericInteraction f23781y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C5993a f23782z;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$f0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$loadDataIfRequestIsPresent$$inlined$map$1$2", m100430f = "GenericInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41372a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f23783E;

                /* JADX INFO: renamed from: F */
                Object f23784F;

                /* JADX INFO: renamed from: G */
                Object f23785G;

                /* JADX INFO: renamed from: H */
                int f23786H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23787w;

                /* JADX INFO: renamed from: x */
                int f23788x;

                /* JADX INFO: renamed from: y */
                Object f23789y;

                public C41372a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23787w = obj;
                    this.f23788x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C5999g c5999g, GenericInteraction genericInteraction, C5993a c5993a, boolean z4) {
                this.f23779w = interfaceC13062m;
                this.f23780x = c5999g;
                this.f23781y = genericInteraction;
                this.f23782z = c5993a;
                this.f23778E = z4;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41372a c41372a;
                if (interfaceC30057d instanceof C41372a) {
                    c41372a = (C41372a) interfaceC30057d;
                    int i13 = c41372a.f23788x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41372a.f23788x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41372a = new C41372a(interfaceC30057d);
                    }
                } else {
                    c41372a = new C41372a(interfaceC30057d);
                }
                Object obj2 = c41372a.f23787w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41372a.f23788x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23779w;
                    C5998f c5998f = (C5998f) obj;
                    GenericInteraction genericInteractionM17922E = c5998f.getIsStaleFromCache() ? null : this.f23780x.m17922E(c5998f.getOnStartInteraction(), this.f23781y);
                    C5993a topItems = this.f23782z;
                    if (topItems == null) {
                        topItems = c5998f.getTopItems();
                    }
                    AbstractC6001i.m mVar = new AbstractC6001i.m(C5998f.m17897b(c5998f, null, null, this.f23778E, false, false, null, null, null, genericInteractionM17922E, false, null, null, null, null, null, null, null, null, topItems, 261883, null));
                    c41372a.f23789y = null;
                    c41372a.f23783E = null;
                    c41372a.f23784F = null;
                    c41372a.f23785G = null;
                    c41372a.f23786H = 0;
                    c41372a.f23788x = 1;
                    if (interfaceC13062m.emit(mVar, c41372a) == enumC31071a) {
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

        public f0(InterfaceC13058l interfaceC13058l, C5999g c5999g, GenericInteraction genericInteraction, C5993a c5993a, boolean z4) {
            this.f23774w = interfaceC13058l;
            this.f23775x = c5999g;
            this.f23776y = genericInteraction;
            this.f23777z = c5993a;
            this.f23773E = z4;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23774w.collect(new a(interfaceC13062m, this.f23775x, this.f23776y, this.f23777z, this.f23773E), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$g */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23791w;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23792w;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createActionFlow$$inlined$filter$1$2", m100430f = "GenericInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41373a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f23794F;

                /* JADX INFO: renamed from: G */
                Object f23795G;

                /* JADX INFO: renamed from: H */
                int f23796H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23797w;

                /* JADX INFO: renamed from: x */
                int f23798x;

                /* JADX INFO: renamed from: y */
                Object f23799y;

                /* JADX INFO: renamed from: z */
                Object f23800z;

                public C41373a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23797w = obj;
                    this.f23798x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f23792w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41373a c41373a;
                if (interfaceC30057d instanceof C41373a) {
                    c41373a = (C41373a) interfaceC30057d;
                    int i13 = c41373a.f23798x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41373a.f23798x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41373a = new C41373a(interfaceC30057d);
                    }
                } else {
                    c41373a = new C41373a(interfaceC30057d);
                }
                Object obj2 = c41373a.f23797w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41373a.f23798x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23792w;
                    if (((a) obj).getAction() != null) {
                        c41373a.f23799y = null;
                        c41373a.f23800z = null;
                        c41373a.f23794F = null;
                        c41373a.f23795G = null;
                        c41373a.f23796H = 0;
                        c41373a.f23798x = 1;
                        if (interfaceC13062m.emit(obj, c41373a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l) {
            this.f23791w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23791w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$g0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$loadDataIfRequestIsPresent$1", m100430f = "GenericInteractor.kt", m100431l = {296}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i$m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23801w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23802x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f23803y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(boolean z4, InterfaceC30057d<? super g0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23803y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g0 g0Var = new g0(this.f23803y, interfaceC30057d);
            g0Var.f23802x = obj;
            return g0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23802x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23801w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC6001i.m mVar = new AbstractC6001i.m(new C5998f(new InterfaceC5994b.d(0, 1, null), null, this.f23803y, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524282, null));
                this.f23802x = null;
                this.f23801w = 1;
                if (interfaceC13062m.emit(mVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createActionFlow$$inlined$flatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23804w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23805x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23806y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5999g f23807z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC30057d interfaceC30057d, C5999g c5999g) {
            super(3, interfaceC30057d);
            this.f23807z = c5999g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, a aVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            h hVar = new h(interfaceC30057d, this.f23807z);
            hVar.f23805x = interfaceC13062m;
            hVar.f23806y = aVar;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23804w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23805x;
                a aVar = (a) this.f23806y;
                AbstractC5995c action = aVar.getAction();
                if (action instanceof AbstractC5995c.j) {
                    c0456u = this.f23807z.m17925H(((AbstractC5995c.j) action).getAction(), aVar.getSavedApiRequest());
                } else if (action instanceof AbstractC5995c.k) {
                    c0456u = this.f23807z.m17950v(((AbstractC5995c.k) action).getInteraction(), aVar.getSavedApiRequest(), new j(this.f23807z));
                } else if (action instanceof AbstractC5995c.g) {
                    c0456u = this.f23807z.m17952x((AbstractC5995c.g) action, aVar.getSavedApiRequest(), new k(this.f23807z));
                } else if (action instanceof AbstractC5995c.f) {
                    c0456u = this.f23807z.m17951w((AbstractC5995c.f) action, aVar.getSavedApiRequest(), new l(this.f23807z));
                } else {
                    AbstractC22676k.m65747g(action);
                    c0456u = new C0456u(new AbstractC6001i.c(action), 1);
                }
                this.f23805x = null;
                this.f23806y = null;
                this.f23804w = 1;
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
            return invoke((InterfaceC13062m) obj, (a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$h0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$loadMoreData$1", m100430f = "GenericInteractor.kt", m100431l = {275, 276, 278, 285}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ApiRequest f23808E;

        /* JADX INFO: renamed from: w */
        Object f23809w;

        /* JADX INFO: renamed from: x */
        int f23810x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f23811y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ApiRequest apiRequest, InterfaceC30057d<? super h0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23808E = apiRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h0 h0Var = C5999g.this.new h0(this.f23808E, interfaceC30057d);
            h0Var.f23811y = obj;
            return h0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX WARN: Code duplicated, block: B:24:0x006a  */
        /* JADX WARN: Code duplicated, block: B:27:0x0078  */
        /* JADX WARN: Code duplicated, block: B:28:0x007d  */
        /* JADX WARN: Code duplicated, block: B:32:0x008e  */
        /* JADX WARN: Code duplicated, block: B:34:0x0092  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L36;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f23811y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f23810x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L30
                if (r2 == r6) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r0 = r7.f23809w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto La1
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L53
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L40
            L30:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.archv2.feature.domain.i$f r8 = com.whoop.archv2.feature.domain.AbstractC6001i.f.f23938a
                r7.f23811y = r0
                r7.f23810x = r6
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L40
                goto La0
            L40:
                com.whoop.archv2.feature.domain.g r8 = com.whoop.archv2.feature.domain.C5999g.this
                com.whoop.archv2.feature.domain.GenericLoadMoreInteractor r8 = com.whoop.archv2.feature.domain.C5999g.m17932d(r8)
                com.whoop.navigation.models.ApiRequest r2 = r7.f23808E
                r7.f23811y = r0
                r7.f23810x = r5
                java.lang.Object r8 = r8.m17876c(r2, r7)
                if (r8 != r1) goto L53
                goto La0
            L53:
                u02.a r8 = (u02.InterfaceC34385a) r8
                boolean r2 = r8 instanceof u02.InterfaceC34385a.c
                r5 = 0
                if (r2 == 0) goto L8e
                com.whoop.archv2.feature.domain.i$a r2 = new com.whoop.archv2.feature.domain.i$a
                u02.a$c r8 = (u02.InterfaceC34385a.c) r8
                java.lang.Object r3 = r8.m108735a()
                com.whoop.archv2.model.template.PaginatedListResponse r3 = (com.whoop.archv2.model.template.PaginatedListResponse) r3
                java.util.List r3 = r3.getItems()
                if (r3 != 0) goto L6c
                m83.y r3 = m83.C25271y.f99162w
            L6c:
                java.lang.Object r8 = r8.m108735a()
                com.whoop.archv2.model.template.PaginatedListResponse r8 = (com.whoop.archv2.model.template.PaginatedListResponse) r8
                com.whoop.archv2.model.template.NextPagePagination r8 = r8.getPagination()
                if (r8 == 0) goto L7d
                com.whoop.navigation.models.ApiRequest r8 = r8.getNextPageRequest()
                goto L7e
            L7d:
                r8 = r5
            L7e:
                r2.<init>(r3, r8)
                r7.f23811y = r5
                r7.f23809w = r5
                r7.f23810x = r4
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto La1
                goto La0
            L8e:
                boolean r8 = r8 instanceof u02.InterfaceC34385a.b
                if (r8 == 0) goto La4
                com.whoop.archv2.feature.domain.i$e r8 = com.whoop.archv2.feature.domain.AbstractC6001i.e.f23937a
                r7.f23811y = r5
                r7.f23809w = r5
                r7.f23810x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto La1
            La0:
                return r1
            La1:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            La4:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createActionFlow$1", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$a;", "state", "Lcom/whoop/archv2/feature/domain/c;", "incoming", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/g$a;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23813w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23814x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23815y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC5995c abstractC5995c, InterfaceC30057d<? super a> interfaceC30057d) {
            i iVar = new i(interfaceC30057d);
            iVar.f23814x = aVar;
            iVar.f23815y = abstractC5995c;
            return iVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f23814x;
            AbstractC5995c abstractC5995c = (AbstractC5995c) this.f23815y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23813w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC5995c instanceof AbstractC5995c.d) {
                return aVar.m17956a(((AbstractC5995c.d) abstractC5995c).getApiRequest(), null);
            }
            return AbstractC5996d.m17896a(abstractC5995c) == EnumC5997e.Action ? a.m17955b(aVar, null, abstractC5995c, 1, null) : a.m17955b(aVar, null, null, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$i0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$$inlined$flatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C5999g f23816E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4351m f23817F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f23818G;

        /* JADX INFO: renamed from: w */
        int f23819w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23820x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23821y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ApiRequest f23822z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(InterfaceC30057d interfaceC30057d, ApiRequest apiRequest, C5999g c5999g, InterfaceC4351m interfaceC4351m, boolean z4) {
            super(3, interfaceC30057d);
            this.f23822z = apiRequest;
            this.f23816E = c5999g;
            this.f23817F = interfaceC4351m;
            this.f23818G = z4;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC30694b abstractC30694b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            i0 i0Var = new i0(interfaceC30057d, this.f23822z, this.f23816E, this.f23817F, this.f23818G);
            i0Var.f23820x = interfaceC13062m;
            i0Var.f23821y = abstractC30694b;
            return i0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c3383g;
            InterfaceC13058l c0456u;
            InterfaceC5994b.b bVar;
            InterfaceC13058l c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23819w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23820x;
                AbstractC30694b abstractC30694b = (AbstractC30694b) this.f23821y;
                if (abstractC30694b instanceof AbstractC30694b.f) {
                    ApiRequest apiRequest = this.f23822z;
                    if (apiRequest != null) {
                        c0456u = AbstractC13091v.m36590P(C5999g.m17920C(this.f23816E, apiRequest, false, null, 6, null), new o0(null, this.f23818G));
                    } else {
                        c3383g = new C0456u(new AbstractC6001i.o(new InterfaceC5994b.d(0, 1, null)), 1);
                        c0456u = c3383g;
                    }
                    c0456u2 = c0456u;
                } else {
                    if (abstractC30694b instanceof AbstractC30694b.g) {
                        Action action = ((AbstractC30694b.g) abstractC30694b).getAction();
                        ReloadAction reloadAction = action instanceof ReloadAction ? (ReloadAction) action : null;
                        if (reloadAction == null) {
                            c0456u2 = new C0456u(new AbstractC6001i.o(null), 1);
                        } else {
                            c0456u = new C0456u(new AbstractC6001i.l(reloadAction), 1);
                        }
                    } else if (abstractC30694b instanceof AbstractC30694b.c) {
                        AbstractC30694b.c cVar = (AbstractC30694b.c) abstractC30694b;
                        if (cVar.getTreatment() != null) {
                            bVar = new InterfaceC5994b.b(cVar.getTreatment());
                        } else {
                            bVar = cVar.getAction() instanceof PollingAction ? null : new InterfaceC5994b.b(null, 1, null);
                        }
                        c0456u = new C0456u(new AbstractC6001i.o(bVar), 1);
                    } else {
                        if (abstractC30694b instanceof AbstractC30694b.i) {
                            c3383g = new C0456u(new AbstractC6001i.o(new InterfaceC5994b.b(null, 1, null)), 1);
                        } else if (abstractC30694b instanceof AbstractC30694b.n) {
                            c3383g = new C0456u(new AbstractC6001i.o(InterfaceC5994b.e.f23692a), 1);
                        } else if (abstractC30694b instanceof AbstractC30694b.d) {
                            C21166s dismissEvent = ((AbstractC30694b.d) abstractC30694b).getDismissEvent();
                            if (dismissEvent != null) {
                                c3383g = new C13084s1(new k0(dismissEvent, null));
                            } else {
                                c0456u = new C13084s1(new l0(abstractC30694b, null));
                            }
                        } else if (abstractC30694b instanceof AbstractC30694b.b) {
                            c0456u = this.f23816E.m17950v(((AbstractC30694b.b) abstractC30694b).getInteraction(), this.f23822z, this.f23817F);
                        } else if (abstractC30694b instanceof AbstractC30694b.a) {
                            c0456u = this.f23816E.m17930M((AbstractC30694b.a) abstractC30694b);
                        } else if (abstractC30694b instanceof AbstractC30694b.m) {
                            AbstractC30694b.m mVar = (AbstractC30694b.m) abstractC30694b;
                            Action action2 = mVar.getAction();
                            StateUpdateAction stateUpdateAction = action2 instanceof StateUpdateAction ? (StateUpdateAction) action2 : null;
                            if (stateUpdateAction != null ? stateUpdateAction.getDismissModal() : false) {
                                c0456u = new C13084s1(new m0(abstractC30694b, null));
                            } else {
                                c3383g = new C0456u(new AbstractC6001i.n(mVar.m94333b()), 1);
                            }
                        } else if (abstractC30694b instanceof AbstractC30694b.l) {
                            c0456u = new C13084s1(new n0(abstractC30694b, null));
                        } else if (abstractC30694b instanceof AbstractC30694b.k) {
                            AbstractC30694b.k kVar = (AbstractC30694b.k) abstractC30694b;
                            c0456u = new C0456u(new AbstractC6001i.h(kVar.getKey(), kVar.getValue()), 1);
                        } else if (abstractC30694b instanceof AbstractC30694b.j) {
                            c0456u = new C0456u(new AbstractC6001i.g(((AbstractC30694b.j) abstractC30694b).getKey()), 1);
                        } else if (abstractC30694b instanceof AbstractC30694b.h) {
                            AbstractC30694b.h hVar = (AbstractC30694b.h) abstractC30694b;
                            c0456u = new C0456u(new AbstractC6001i.k(new C6011q(hVar.getPermission(), hVar.getOnSuccess())), 1);
                        } else {
                            if (!(abstractC30694b instanceof AbstractC30694b.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC30694b.e eVar = (AbstractC30694b.e) abstractC30694b;
                            c3383g = new C3383g(new AbstractC6001i[]{new AbstractC6001i.o(null), new AbstractC6001i.j(new C6010p(eVar.getStateKey(), eVar.getSource(), eVar.getOnSuccess(), eVar.getOnError()))}, 3);
                        }
                        c0456u = c3383g;
                    }
                    c0456u2 = c0456u;
                }
                this.f23820x = null;
                this.f23821y = null;
                this.f23819w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u2, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC30694b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class j extends C22672i implements InterfaceC4351m {
        public j(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForLanes", "performActionForLanes(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17925H(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$j0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$1$1$1", m100430f = "GenericInteractor.kt", m100431l = {361, 363}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23823w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23824x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f23825y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5998f f23826z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(boolean z4, C5998f c5998f, InterfaceC30057d<? super j0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23825y = z4;
            this.f23826z = c5998f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j0 j0Var = new j0(this.f23825y, this.f23826z, interfaceC30057d);
            j0Var.f23824x = obj;
            return j0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f23824x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f23823w
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4a
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L38
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r6.f23825y
                if (r7 == 0) goto L38
                com.whoop.archv2.feature.domain.i$o r7 = new com.whoop.archv2.feature.domain.i$o
                r7.<init>(r3)
                r6.f23824x = r0
                r6.f23823w = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L38
                goto L49
            L38:
                com.whoop.archv2.feature.domain.i$m r7 = new com.whoop.archv2.feature.domain.i$m
                com.whoop.archv2.feature.domain.f r2 = r6.f23826z
                r7.<init>(r2)
                r6.f23824x = r3
                r6.f23823w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L4a
            L49:
                return r1
            L4a:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.j0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$k */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class k extends C22672i implements InterfaceC4351m {
        public k(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForLanes", "performActionForLanes(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17925H(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$k0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$1$2", m100430f = "GenericInteractor.kt", m100431l = {390, 391, 392}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23827w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23828x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C21166s f23829y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(C21166s c21166s, InterfaceC30057d<? super k0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23829y = c21166s;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k0 k0Var = new k0(this.f23829y, interfaceC30057d);
            k0Var.f23828x = obj;
            return k0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f23828x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f23827w
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L27
                if (r2 == r5) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                p505ts.AbstractC34132o.m107864I(r7)
                goto L61
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L49
            L23:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3c
            L27:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.archv2.feature.domain.i$o r7 = new com.whoop.archv2.feature.domain.i$o
                com.whoop.archv2.feature.domain.b$e r2 = com.whoop.archv2.feature.domain.InterfaceC5994b.e.f23692a
                r7.<init>(r2)
                r6.f23828x = r0
                r6.f23827w = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3c
                goto L60
            L3c:
                r6.f23828x = r0
                r6.f23827w = r4
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                if (r7 != r1) goto L49
                goto L60
            L49:
                com.whoop.archv2.feature.domain.i$p r7 = new com.whoop.archv2.feature.domain.i$p
                ri0.b$h r2 = new ri0.b$h
                j02.s r4 = r6.f23829y
                r2.<init>(r4)
                r7.<init>(r2)
                r2 = 0
                r6.f23828x = r2
                r6.f23827w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L61
            L60:
                return r1
            L61:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.k0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class l extends C22672i implements InterfaceC4351m {
        public l(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForLanes", "performActionForLanes(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17925H(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$l0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$1$3", m100430f = "GenericInteractor.kt", m100431l = {396, 397}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23830w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23831x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30694b f23832y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(AbstractC30694b abstractC30694b, InterfaceC30057d<? super l0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23832y = abstractC30694b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l0 l0Var = new l0(this.f23832y, interfaceC30057d);
            l0Var.f23831x = obj;
            return l0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
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
                java.lang.Object r0 = r7.f23831x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f23830w
                r3 = 1
                r4 = 0
                r5 = 2
                if (r2 == 0) goto L21
                if (r2 == r3) goto L1d
                if (r2 != r5) goto L15
                p505ts.AbstractC34132o.m107864I(r8)
                goto L52
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L34
            L21:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.archv2.feature.domain.i$o r8 = new com.whoop.archv2.feature.domain.i$o
                r8.<init>(r4)
                r7.f23831x = r0
                r7.f23830w = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L34
                goto L51
            L34:
                com.whoop.archv2.feature.domain.i$p r8 = new com.whoop.archv2.feature.domain.i$p
                ri0.b$c r2 = new ri0.b$c
                qw2.b r3 = r7.f23832y
                qw2.b$d r3 = (qw2.AbstractC30694b.d) r3
                com.whoop.navigation.e r3 = r3.getDestination()
                r6 = 0
                r2.<init>(r3, r6, r5, r4)
                r8.<init>(r2)
                r7.f23831x = r4
                r7.f23830w = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L52
            L51:
                return r1
            L52:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.l0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$m */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23833w;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23834w;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createFetchFlow$$inlined$filter$1$2", m100430f = "GenericInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41374a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f23836F;

                /* JADX INFO: renamed from: G */
                Object f23837G;

                /* JADX INFO: renamed from: H */
                int f23838H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23839w;

                /* JADX INFO: renamed from: x */
                int f23840x;

                /* JADX INFO: renamed from: y */
                Object f23841y;

                /* JADX INFO: renamed from: z */
                Object f23842z;

                public C41374a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23839w = obj;
                    this.f23840x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f23834w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41374a c41374a;
                if (interfaceC30057d instanceof C41374a) {
                    c41374a = (C41374a) interfaceC30057d;
                    int i13 = c41374a.f23840x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41374a.f23840x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41374a = new C41374a(interfaceC30057d);
                    }
                } else {
                    c41374a = new C41374a(interfaceC30057d);
                }
                Object obj2 = c41374a.f23839w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41374a.f23840x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23834w;
                    if (AbstractC5996d.m17896a((AbstractC5995c) obj) == EnumC5997e.Fetch) {
                        c41374a.f23841y = null;
                        c41374a.f23842z = null;
                        c41374a.f23836F = null;
                        c41374a.f23837G = null;
                        c41374a.f23838H = 0;
                        c41374a.f23840x = 1;
                        if (interfaceC13062m.emit(obj, c41374a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f23833w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23833w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$m0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$1$4", m100430f = "GenericInteractor.kt", m100431l = {411, 412}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23843w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23844x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30694b f23845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(AbstractC30694b abstractC30694b, InterfaceC30057d<? super m0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23845y = abstractC30694b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            m0 m0Var = new m0(this.f23845y, interfaceC30057d);
            m0Var.f23844x = obj;
            return m0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r0.emit(r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f23844x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f23843w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4e
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L3b
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                com.whoop.archv2.feature.domain.i$n r6 = new com.whoop.archv2.feature.domain.i$n
                qw2.b r2 = r5.f23845y
                qw2.b$m r2 = (qw2.AbstractC30694b.m) r2
                java.util.Map r2 = r2.m94333b()
                r6.<init>(r2)
                r5.f23844x = r0
                r5.f23843w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L3b
                goto L4d
            L3b:
                com.whoop.archv2.feature.domain.i$c r6 = new com.whoop.archv2.feature.domain.i$c
                com.whoop.archv2.feature.domain.c$c r2 = com.whoop.archv2.feature.domain.AbstractC5995c.c.f23695a
                r6.<init>(r2)
                r2 = 0
                r5.f23844x = r2
                r5.f23843w = r3
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L4e
            L4d:
                return r1
            L4e:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.m0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$n */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23846w;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23847w;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$n$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createFetchFlow$$inlined$filter$2$2", m100430f = "GenericInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41375a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f23849F;

                /* JADX INFO: renamed from: G */
                Object f23850G;

                /* JADX INFO: renamed from: H */
                int f23851H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23852w;

                /* JADX INFO: renamed from: x */
                int f23853x;

                /* JADX INFO: renamed from: y */
                Object f23854y;

                /* JADX INFO: renamed from: z */
                Object f23855z;

                public C41375a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23852w = obj;
                    this.f23853x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f23847w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41375a c41375a;
                if (interfaceC30057d instanceof C41375a) {
                    c41375a = (C41375a) interfaceC30057d;
                    int i13 = c41375a.f23853x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41375a.f23853x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41375a = new C41375a(interfaceC30057d);
                    }
                } else {
                    c41375a = new C41375a(interfaceC30057d);
                }
                Object obj2 = c41375a.f23852w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41375a.f23853x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23847w;
                    AbstractC5995c action = ((b) obj).getAction();
                    if ((action != null ? AbstractC5996d.m17896a(action) : null) == EnumC5997e.Fetch) {
                        c41375a.f23854y = null;
                        c41375a.f23855z = null;
                        c41375a.f23849F = null;
                        c41375a.f23850G = null;
                        c41375a.f23851H = 0;
                        c41375a.f23853x = 1;
                        if (interfaceC13062m.emit(obj, c41375a) == enumC31071a) {
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

        public n(InterfaceC13058l interfaceC13058l) {
            this.f23846w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23846w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$n0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$1$5", m100430f = "GenericInteractor.kt", m100431l = {420, 423}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23856w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23857x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC30694b f23858y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(AbstractC30694b abstractC30694b, InterfaceC30057d<? super n0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23858y = abstractC30694b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n0 n0Var = new n0(this.f23858y, interfaceC30057d);
            n0Var.f23857x = obj;
            return n0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f23857x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f23856w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L66
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3b
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.archv2.feature.domain.i$i r7 = new com.whoop.archv2.feature.domain.i$i
                qw2.b r2 = r6.f23858y
                qw2.b$l r2 = (qw2.AbstractC30694b.l) r2
                java.util.Set r2 = r2.m94332b()
                r7.<init>(r2)
                r6.f23857x = r0
                r6.f23856w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3b
                goto L65
            L3b:
                qw2.b r7 = r6.f23858y
                qw2.b$l r7 = (qw2.AbstractC30694b.l) r7
                com.whoop.whoopaction.domain.models.Action r7 = r7.getAction()
                boolean r2 = r7 instanceof com.whoop.whoopaction.domain.models.StateClearAction
                r5 = 0
                if (r2 == 0) goto L4b
                com.whoop.whoopaction.domain.models.StateClearAction r7 = (com.whoop.whoopaction.domain.models.StateClearAction) r7
                goto L4c
            L4b:
                r7 = r5
            L4c:
                if (r7 == 0) goto L66
                boolean r7 = r7.getDismissModal()
                if (r7 != r4) goto L66
                com.whoop.archv2.feature.domain.i$c r7 = new com.whoop.archv2.feature.domain.i$c
                com.whoop.archv2.feature.domain.c$c r2 = com.whoop.archv2.feature.domain.AbstractC5995c.c.f23695a
                r7.<init>(r2)
                r6.f23857x = r5
                r6.f23856w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L66
            L65:
                return r1
            L66:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.n0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createFetchFlow$$inlined$flatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23859w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23860x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23861y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5999g f23862z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC30057d interfaceC30057d, C5999g c5999g) {
            super(3, interfaceC30057d);
            this.f23862z = c5999g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            o oVar = new o(interfaceC30057d, this.f23862z);
            oVar.f23860x = interfaceC13062m;
            oVar.f23861y = bVar;
            return oVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23859w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23860x;
                InterfaceC13058l interfaceC13058lM17945q = this.f23862z.m17945q((b) this.f23861y);
                this.f23860x = null;
                this.f23861y = null;
                this.f23859w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM17945q, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$o0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$performActionCore$lambda$0$$inlined$flatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23863w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23864x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23865y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f23866z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(InterfaceC30057d interfaceC30057d, boolean z4) {
            super(3, interfaceC30057d);
            this.f23866z = z4;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C5998f c5998f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            o0 o0Var = new o0(interfaceC30057d, this.f23866z);
            o0Var.f23864x = interfaceC13062m;
            o0Var.f23865y = c5998f;
            return o0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23863w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23864x;
                C13084s1 c13084s1 = new C13084s1(new j0(this.f23866z, (C5998f) this.f23865y, null));
                this.f23864x = null;
                this.f23865y = null;
                this.f23863w = 1;
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
            return invoke((InterfaceC13062m) obj, (C5998f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$p */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createFetchFlow$2", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$b;", "state", "Lcom/whoop/archv2/feature/domain/c;", "action", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/g$b;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23867w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23868x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23869y;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, AbstractC5995c abstractC5995c, InterfaceC30057d<? super b> interfaceC30057d) {
            p pVar = C5999g.this.new p(interfaceC30057d);
            pVar.f23868x = bVar;
            pVar.f23869y = abstractC5995c;
            return pVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar = (b) this.f23868x;
            AbstractC5995c abstractC5995c = (AbstractC5995c) this.f23869y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23867w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C5999g.this.m17927J(bVar, abstractC5995c);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$p0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class p0 extends C22672i implements InterfaceC4351m {
        public p0(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForFlat", "performActionForFlat(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17924G(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$q */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23871w;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$q$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23872w;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$q$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createPaginationFlow$$inlined$filter$1$2", m100430f = "GenericInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41376a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f23874F;

                /* JADX INFO: renamed from: G */
                Object f23875G;

                /* JADX INFO: renamed from: H */
                int f23876H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23877w;

                /* JADX INFO: renamed from: x */
                int f23878x;

                /* JADX INFO: renamed from: y */
                Object f23879y;

                /* JADX INFO: renamed from: z */
                Object f23880z;

                public C41376a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23877w = obj;
                    this.f23878x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f23872w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41376a c41376a;
                if (interfaceC30057d instanceof C41376a) {
                    c41376a = (C41376a) interfaceC30057d;
                    int i13 = c41376a.f23878x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41376a.f23878x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41376a = new C41376a(interfaceC30057d);
                    }
                } else {
                    c41376a = new C41376a(interfaceC30057d);
                }
                Object obj2 = c41376a.f23877w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41376a.f23878x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23872w;
                    if (AbstractC5996d.m17896a((AbstractC5995c) obj) == EnumC5997e.Pagination) {
                        c41376a.f23879y = null;
                        c41376a.f23880z = null;
                        c41376a.f23874F = null;
                        c41376a.f23875G = null;
                        c41376a.f23876H = 0;
                        c41376a.f23878x = 1;
                        if (interfaceC13062m.emit(obj, c41376a) == enumC31071a) {
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

        public q(InterfaceC13058l interfaceC13058l) {
            this.f23871w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23871w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$q0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class q0 extends C22672i implements InterfaceC4351m {
        public q0(Object obj) {
            super(2, 0, C5999g.class, obj, "performActionForLanes", "performActionForLanes(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/ApiRequest;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC13058l invoke(Action p13, ApiRequest apiRequest) {
            AbstractC22676k.m65750j(p13, "p0");
            return ((C5999g) this.receiver).m17925H(p13, apiRequest);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$createPaginationFlow$$inlined$flatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23881w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23882x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23883y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5999g f23884z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC30057d interfaceC30057d, C5999g c5999g) {
            super(3, interfaceC30057d);
            this.f23884z = c5999g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC5995c abstractC5995c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            r rVar = new r(interfaceC30057d, this.f23884z);
            rVar.f23882x = interfaceC13062m;
            rVar.f23883y = abstractC5995c;
            return rVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23881w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23882x;
                AbstractC5995c abstractC5995c = (AbstractC5995c) this.f23883y;
                C5999g c5999g = this.f23884z;
                AbstractC22676k.m65748h(abstractC5995c, "null cannot be cast to non-null type com.whoop.archv2.feature.domain.GenericDomainAction.LoadMore");
                InterfaceC13058l interfaceC13058lM17921D = c5999g.m17921D(((AbstractC5995c.e) abstractC5995c).getRequest());
                this.f23882x = null;
                this.f23883y = null;
                this.f23881w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM17921D, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC5995c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$s */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$handleInteraction$2", m100430f = "GenericInteractor.kt", m100431l = {499, 500}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ApiRequest f23885E;

        /* JADX INFO: renamed from: w */
        int f23886w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23887x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4351m f23888y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ DecodedGenericInteraction f23889z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC4351m interfaceC4351m, DecodedGenericInteraction decodedGenericInteraction, ApiRequest apiRequest, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23888y = interfaceC4351m;
            this.f23889z = decodedGenericInteraction;
            this.f23885E = apiRequest;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            s sVar = new s(this.f23888y, this.f23889z, this.f23885E, interfaceC30057d);
            sVar.f23887x = obj;
            return sVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f23887x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f23886w
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L15
                p505ts.AbstractC34132o.m107864I(r7)
                goto L52
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L34
            L21:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.archv2.feature.domain.i$o r7 = new com.whoop.archv2.feature.domain.i$o
                r7.<init>(r3)
                r6.f23887x = r0
                r6.f23886w = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L34
                goto L51
            L34:
                c93.m r7 = r6.f23888y
                com.whoop.design.models.modal.DecodedGenericInteraction r2 = r6.f23889z
                com.whoop.whoopaction.domain.models.Action r2 = r2.getAction()
                p715kotlin.jvm.internal.AbstractC22676k.m65747g(r2)
                com.whoop.navigation.models.ApiRequest r5 = r6.f23885E
                java.lang.Object r7 = r7.invoke(r2, r5)
                ec3.l r7 = (ec3.InterfaceC13058l) r7
                r6.f23887x = r3
                r6.f23886w = r4
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r1) goto L52
            L51:
                return r1
            L52:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$handleMediaPickFailed$1", m100430f = "GenericInteractor.kt", m100431l = {471, 474, 476}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C5999g f23890E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ ApiRequest f23891F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC4351m f23892G;

        /* JADX INFO: renamed from: w */
        Object f23893w;

        /* JADX INFO: renamed from: x */
        int f23894x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f23895y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC5995c.f f23896z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(AbstractC5995c.f fVar, C5999g c5999g, ApiRequest apiRequest, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23896z = fVar;
            this.f23890E = c5999g;
            this.f23891F = apiRequest;
            this.f23892G = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            t tVar = new t(this.f23896z, this.f23890E, this.f23891F, this.f23892G, interfaceC30057d);
            tVar.f23895y = obj;
            return tVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r8, r7) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f23895y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f23894x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L28
                if (r2 == r5) goto L24
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                java.lang.Object r0 = r7.f23893w
                com.whoop.navigation.models.GenericInteraction r0 = (com.whoop.navigation.models.GenericInteraction) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L79
            L24:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3d
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                com.whoop.archv2.feature.domain.i$c r8 = new com.whoop.archv2.feature.domain.i$c
                com.whoop.archv2.feature.domain.c$f r2 = r7.f23896z
                r8.<init>(r2)
                r7.f23895y = r0
                r7.f23894x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3d
                goto L78
            L3d:
                com.whoop.archv2.feature.domain.c$f r8 = r7.f23896z
                com.whoop.archv2.feature.domain.p r8 = r8.getPick()
                com.whoop.navigation.models.GenericInteraction r8 = r8.getOnError()
                r2 = 0
                if (r8 == 0) goto L61
                com.whoop.archv2.feature.domain.g r3 = r7.f23890E
                com.whoop.navigation.models.ApiRequest r5 = r7.f23891F
                c93.m r6 = r7.f23892G
                ec3.l r8 = com.whoop.archv2.feature.domain.C5999g.m17935g(r3, r8, r5, r6)
                r7.f23895y = r2
                r7.f23893w = r2
                r7.f23894x = r4
                java.lang.Object r8 = ec3.AbstractC13091v.m36613w(r0, r8, r7)
                if (r8 != r1) goto L79
                goto L78
            L61:
                com.whoop.archv2.feature.domain.i$o r8 = new com.whoop.archv2.feature.domain.i$o
                com.whoop.archv2.feature.domain.b$d r4 = new com.whoop.archv2.feature.domain.b$d
                r6 = 0
                r4.<init>(r6, r5, r2)
                r8.<init>(r4)
                r7.f23895y = r2
                r7.f23893w = r2
                r7.f23894x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L79
            L78:
                return r1
            L79:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$u */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$handleMediaPicked$1", m100430f = "GenericInteractor.kt", m100431l = {462, 463}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lcom/whoop/archv2/feature/domain/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC5995c.g f23897E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C5999g f23898F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ ApiRequest f23899G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC4351m f23900H;

        /* JADX INFO: renamed from: w */
        Object f23901w;

        /* JADX INFO: renamed from: x */
        int f23902x;

        /* JADX INFO: renamed from: y */
        int f23903y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f23904z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(AbstractC5995c.g gVar, C5999g c5999g, ApiRequest apiRequest, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23897E = gVar;
            this.f23898F = c5999g;
            this.f23899G = apiRequest;
            this.f23900H = interfaceC4351m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            u uVar = new u(this.f23897E, this.f23898F, this.f23899G, this.f23900H, interfaceC30057d);
            uVar.f23904z = obj;
            return uVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r7, r6) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f23904z
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f23903y
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                java.lang.Object r0 = r6.f23901w
                com.whoop.navigation.models.GenericInteraction r0 = (com.whoop.navigation.models.GenericInteraction) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L60
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L39
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                com.whoop.archv2.feature.domain.i$c r7 = new com.whoop.archv2.feature.domain.i$c
                com.whoop.archv2.feature.domain.c$g r2 = r6.f23897E
                r7.<init>(r2)
                r6.f23904z = r0
                r6.f23903y = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L39
                goto L5f
            L39:
                com.whoop.archv2.feature.domain.c$g r7 = r6.f23897E
                com.whoop.archv2.feature.domain.p r7 = r7.getPick()
                com.whoop.navigation.models.GenericInteraction r7 = r7.getOnSuccess()
                if (r7 == 0) goto L60
                com.whoop.archv2.feature.domain.g r2 = r6.f23898F
                com.whoop.navigation.models.ApiRequest r4 = r6.f23899G
                c93.m r5 = r6.f23900H
                ec3.l r7 = com.whoop.archv2.feature.domain.C5999g.m17935g(r2, r7, r4, r5)
                r2 = 0
                r6.f23904z = r2
                r6.f23901w = r2
                r2 = 0
                r6.f23902x = r2
                r6.f23903y = r3
                java.lang.Object r7 = ec3.AbstractC13091v.m36613w(r0, r7, r6)
                if (r7 != r1) goto L60
            L5f:
                return r1
            L60:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.archv2.feature.domain.C5999g.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$v */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f23905w;

        /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$v$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f23906w;

            /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$v$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithPerActionTypeLanes$$inlined$map$1$2", m100430f = "GenericInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41377a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f23907E;

                /* JADX INFO: renamed from: F */
                Object f23908F;

                /* JADX INFO: renamed from: G */
                Object f23909G;

                /* JADX INFO: renamed from: H */
                int f23910H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f23911w;

                /* JADX INFO: renamed from: x */
                int f23912x;

                /* JADX INFO: renamed from: y */
                Object f23913y;

                public C41377a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f23911w = obj;
                    this.f23912x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f23906w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41377a c41377a;
                if (interfaceC30057d instanceof C41377a) {
                    c41377a = (C41377a) interfaceC30057d;
                    int i13 = c41377a.f23912x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41377a.f23912x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41377a = new C41377a(interfaceC30057d);
                    }
                } else {
                    c41377a = new C41377a(interfaceC30057d);
                }
                Object obj2 = c41377a.f23911w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41377a.f23912x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f23906w;
                    C5998f domainState = ((c) obj).getDomainState();
                    c41377a.f23913y = null;
                    c41377a.f23907E = null;
                    c41377a.f23908F = null;
                    c41377a.f23909G = null;
                    c41377a.f23910H = 0;
                    c41377a.f23912x = 1;
                    if (interfaceC13062m.emit(domainState, c41377a) == enumC31071a) {
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

        public v(InterfaceC13058l interfaceC13058l) {
            this.f23905w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f23905w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$w */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithPerActionTypeLanes$1", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$c;", "reducerState", "Lcom/whoop/archv2/feature/domain/i;", "action", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/g$c;Lcom/whoop/archv2/feature/domain/i;)Lcom/whoop/archv2/feature/domain/g$c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C5999g f23915E;

        /* JADX INFO: renamed from: w */
        int f23916w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23917x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23918y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f23919z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z4, C5999g c5999g, InterfaceC30057d<? super w> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f23919z = z4;
            this.f23915E = c5999g;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, AbstractC6001i abstractC6001i, InterfaceC30057d<? super c> interfaceC30057d) {
            w wVar = new w(this.f23919z, this.f23915E, interfaceC30057d);
            wVar.f23917x = cVar;
            wVar.f23918y = abstractC6001i;
            return wVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.f23917x;
            AbstractC6001i abstractC6001i = (AbstractC6001i) this.f23918y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23916w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean activeActionDialog = false;
            if (!(abstractC6001i instanceof AbstractC6001i.m)) {
                if (!(abstractC6001i instanceof AbstractC6001i.o)) {
                    return c.m17969b(cVar, this.f23915E.m17926I(cVar.getDomainState(), abstractC6001i), false, 2, null);
                }
                AbstractC6001i.o oVar = (AbstractC6001i.o) abstractC6001i;
                return cVar.m17970a(C5998f.m17897b(cVar.getDomainState(), oVar.getDialogType(), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null), AbstractC6000h.m17995j(oVar.getDialogType()));
            }
            boolean activeActionDialog2 = cVar.getActiveActionDialog();
            AbstractC6001i.m mVar = (AbstractC6001i.m) abstractC6001i;
            C5998f c5998fM17994i = AbstractC6000h.m17994i(cVar.getDomainState(), mVar, activeActionDialog2, this.f23919z);
            boolean z4 = activeActionDialog2 && AbstractC6000h.m17995j(cVar.getDomainState().getCurrentDialogType()) && AbstractC22676k.m65745e(c5998fM17994i.getCurrentDialogType(), cVar.getDomainState().getCurrentDialogType());
            if (!(mVar.getDomainState().getCurrentDialogType() instanceof InterfaceC5994b.c) && !(mVar.getDomainState().getCurrentDialogType() instanceof InterfaceC5994b.d)) {
                if (z4) {
                    activeActionDialog = true;
                } else if (mVar.getDomainState().getCurrentDialogType() != null) {
                    activeActionDialog = cVar.getActiveActionDialog();
                }
            }
            return cVar.m17970a(c5998fM17994i, activeActionDialog);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$x */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithPerActionTypeLanes$3", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/f;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/f;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23920w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23921x;

        public x(InterfaceC30057d<? super x> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            x xVar = C5999g.this.new x(interfaceC30057d);
            xVar.f23921x = obj;
            return xVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C5998f c5998f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((x) create(c5998f, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C5998f c5998f = (C5998f) this.f23921x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23920w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C28026c.m84524g(C5999g.this.prefetcher, c5998f.getPrefetchList(), false, 2, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$y */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithSingleFlatMapLatest$$inlined$flatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f23923w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f23924x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23925y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C5999g f23926z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(InterfaceC30057d interfaceC30057d, C5999g c5999g) {
            super(3, interfaceC30057d);
            this.f23926z = c5999g;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            y yVar = new y(interfaceC30057d, this.f23926z);
            yVar.f23924x = interfaceC13062m;
            yVar.f23925y = bVar;
            return yVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM17945q;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23923w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f23924x;
                b bVar = (b) this.f23925y;
                AbstractC5995c action = bVar.getAction();
                if (action == null) {
                    interfaceC13058lM17945q = new C0456u(AbstractC6001i.d.f23936a, 1);
                } else if ((action instanceof AbstractC5995c.d) || (action instanceof AbstractC5995c.n)) {
                    interfaceC13058lM17945q = this.f23926z.m17945q(bVar);
                } else if (action instanceof AbstractC5995c.j) {
                    interfaceC13058lM17945q = this.f23926z.m17924G(((AbstractC5995c.j) bVar.getAction()).getAction(), bVar.getSavedApiRequest());
                } else if (action instanceof AbstractC5995c.k) {
                    interfaceC13058lM17945q = this.f23926z.m17950v(((AbstractC5995c.k) bVar.getAction()).getInteraction(), bVar.getSavedApiRequest(), new c0(this.f23926z));
                } else if (action instanceof AbstractC5995c.g) {
                    interfaceC13058lM17945q = this.f23926z.m17952x((AbstractC5995c.g) bVar.getAction(), bVar.getSavedApiRequest(), new d0(this.f23926z));
                } else if (action instanceof AbstractC5995c.f) {
                    interfaceC13058lM17945q = this.f23926z.m17951w((AbstractC5995c.f) bVar.getAction(), bVar.getSavedApiRequest(), new e0(this.f23926z));
                } else {
                    interfaceC13058lM17945q = action instanceof AbstractC5995c.e ? this.f23926z.m17921D(((AbstractC5995c.e) bVar.getAction()).getRequest()) : new C0456u(new AbstractC6001i.c(bVar.getAction()), 1);
                }
                this.f23924x = null;
                this.f23925y = null;
                this.f23923w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM17945q, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$z */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.archv2.feature.domain.GenericInteractor$interactWithSingleFlatMapLatest$1", m100430f = "GenericInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/f;", "domainState", "Lcom/whoop/archv2/feature/domain/i;", "action", "<anonymous>", "(Lcom/whoop/archv2/feature/domain/f;Lcom/whoop/archv2/feature/domain/i;)Lcom/whoop/archv2/feature/domain/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C5999g f23927E;

        /* JADX INFO: renamed from: w */
        int f23928w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f23929x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f23930y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f23931z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(boolean z4, C5999g c5999g, InterfaceC30057d<? super z> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f23931z = z4;
            this.f23927E = c5999g;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C5998f c5998f, AbstractC6001i abstractC6001i, InterfaceC30057d<? super C5998f> interfaceC30057d) {
            z zVar = new z(this.f23931z, this.f23927E, interfaceC30057d);
            zVar.f23929x = c5998f;
            zVar.f23930y = abstractC6001i;
            return zVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C5998f c5998f = (C5998f) this.f23929x;
            AbstractC6001i abstractC6001i = (AbstractC6001i) this.f23930y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23928w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC6001i instanceof AbstractC6001i.m) {
                return AbstractC6000h.m17994i(c5998f, (AbstractC6001i.m) abstractC6001i, false, this.f23931z);
            }
            return abstractC6001i instanceof AbstractC6001i.o ? C5998f.m17897b(c5998f, ((AbstractC6001i.o) abstractC6001i).getDialogType(), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null) : this.f23927E.m17926I(c5998f, abstractC6001i);
        }
    }

    public C5999g(C6003k fetchInteractor, C30695c actionInteractor, C28026c prefetcher, GenericLoadMoreInteractor loadMoreInteractor, C27948a analytics, AbstractC0757c json, C37378a scopeCoordinator, FeatureFlagChecker featureFlagChecker, String str) {
        AbstractC22676k.m65750j(fetchInteractor, "fetchInteractor");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(prefetcher, "prefetcher");
        AbstractC22676k.m65750j(loadMoreInteractor, "loadMoreInteractor");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.fetchInteractor = fetchInteractor;
        this.actionInteractor = actionInteractor;
        this.prefetcher = prefetcher;
        this.loadMoreInteractor = loadMoreInteractor;
        this.analytics = analytics;
        this.json = json;
        this.scopeCoordinator = scopeCoordinator;
        this.featureFlagChecker = featureFlagChecker;
        this.screenCacheKey = str;
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC13058l m17918A(ApiRequest apiRequest, GenericInteraction callerOnStartInteraction, boolean manualRefresh, String cacheKey, C5993a topItems) {
        return apiRequest == null ? new C13084s1(new g0(manualRefresh, null)) : new f0(m17919B(apiRequest, manualRefresh, cacheKey), this, callerOnStartInteraction, topItems, manualRefresh);
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC13058l m17919B(ApiRequest apiRequest, boolean manualRefresh, String cacheKey) {
        return this.fetchInteractor.interact(new C0456u(new C29249a(apiRequest, null, manualRefresh, cacheKey, 2, null), 1));
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ InterfaceC13058l m17920C(C5999g c5999g, ApiRequest apiRequest, boolean z4, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        if ((i13 & 4) != 0) {
            str = null;
        }
        return c5999g.m17919B(apiRequest, z4, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final InterfaceC13058l m17921D(ApiRequest request) {
        return new C13084s1(new h0(request, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final GenericInteraction m17922E(GenericInteraction bff, GenericInteraction caller) {
        if (bff == null) {
            return caller;
        }
        if (caller == null) {
            return bff;
        }
        JsonElement modal = caller.getModal();
        if (modal == null) {
            modal = bff.getModal();
        }
        JsonElement jsonElement = modal;
        JsonElement action = caller.getAction();
        if (action == null) {
            action = bff.getAction();
        }
        JsonElement jsonElement2 = action;
        JsonElement analyticEvent = caller.getAnalyticEvent();
        if (analyticEvent == null) {
            analyticEvent = bff.getAnalyticEvent();
        }
        JsonElement jsonElement3 = analyticEvent;
        JsonElement navigation = caller.getNavigation();
        if (navigation == null) {
            navigation = bff.getNavigation();
        }
        return new GenericInteraction(navigation, jsonElement, jsonElement2, (JsonElement) null, jsonElement3, 8, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: F */
    private final InterfaceC13058l m17923F(Action action, ApiRequest savedApiRequest, boolean clearDialogBeforeRefreshShowContent, InterfaceC4351m performActionFn) {
        return AbstractC13091v.m36590P(this.actionInteractor.interact(new C0456u(new C30698f(action), 1)), new i0(null, savedApiRequest, this, performActionFn, clearDialogBeforeRefreshShowContent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final InterfaceC13058l m17924G(Action action, ApiRequest savedApiRequest) {
        return m17923F(action, savedApiRequest, false, new p0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public final InterfaceC13058l m17925H(Action action, ApiRequest savedApiRequest) {
        return m17923F(action, savedApiRequest, true, new q0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final C5998f m17926I(C5998f domainState, AbstractC6001i action) {
        if (action instanceof AbstractC6001i.p) {
            return C5998f.m17897b(domainState, null, null, false, false, false, ((AbstractC6001i.p) action).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), null, null, null, false, null, null, null, null, null, null, null, null, null, 524255, null);
        }
        if (action instanceof AbstractC6001i.c) {
            return m17949u(domainState, ((AbstractC6001i.c) action).getDomainAction());
        }
        if (action instanceof AbstractC6001i.d) {
            return domainState;
        }
        if (action instanceof AbstractC6001i.n) {
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, AbstractC25247g0.m73995d0(domainState.m17899c(), ((AbstractC6001i.n) action).m18015a()), null, null, null, null, null, null, null, null, 523263, null);
        }
        if (action instanceof AbstractC6001i.i) {
            Map<String, Object> mapM17899c = domainState.m17899c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapM17899c.entrySet()) {
                if (!((AbstractC6001i.i) action).m18010a().contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, linkedHashMap, null, null, null, null, null, null, null, null, 523263, null);
        }
        if (action instanceof AbstractC6001i.h) {
            return AbstractC6000h.m17993h(domainState, (AbstractC6001i.h) action);
        }
        if (action instanceof AbstractC6001i.g) {
            return AbstractC6000h.m17992g(domainState, (AbstractC6001i.g) action);
        }
        if (action instanceof AbstractC6001i.f) {
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, null, null, null, EnumC6009o.LOADING, null, null, null, null, null, 516095, null);
        }
        if (action instanceof AbstractC6001i.e) {
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, null, null, null, EnumC6009o.ERROR, null, null, null, null, null, 516095, null);
        }
        if (action instanceof AbstractC6001i.a) {
            return AbstractC6000h.m17991f(domainState, (AbstractC6001i.a) action);
        }
        if (action instanceof AbstractC6001i.l) {
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, ((AbstractC6001i.l) action).getReloadAction(), null, null, null, 491519, null);
        }
        if (action instanceof AbstractC6001i.b) {
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 491519, null);
        }
        if (action instanceof AbstractC6001i.k) {
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, ((AbstractC6001i.k) action).getRequest(), null, null, 458751, null);
        }
        if (action instanceof AbstractC6001i.j) {
            C6010p pendingMediaPick = domainState.getPendingMediaPick();
            if (pendingMediaPick == null) {
                pendingMediaPick = ((AbstractC6001i.j) action).getPick();
            }
            return C5998f.m17897b(domainState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, pendingMediaPick, null, 393215, null);
        }
        if ((action instanceof AbstractC6001i.m) || (action instanceof AbstractC6001i.o)) {
            return domainState;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final b m17927J(b state, AbstractC5995c action) {
        if (action instanceof AbstractC5995c.d) {
            AbstractC5995c.d dVar = (AbstractC5995c.d) action;
            ApiRequest apiRequest = dVar.getApiRequest();
            ApiRequest apiRequest2 = dVar.getApiRequest();
            String str = this.screenCacheKey;
            ApiRequest apiRequest3 = dVar.getApiRequest();
            String strM18001p = AbstractC6000h.m18001p(str, apiRequest3 != null ? apiRequest3.getPath() : null);
            GenericInteraction callerOnStartInteraction = dVar.getCallerOnStartInteraction();
            C6005m genericTopItems = dVar.getGenericTopItems();
            return new b(action, apiRequest, apiRequest2, strM18001p, callerOnStartInteraction, genericTopItems != null ? AbstractC6008n.m18033b(genericTopItems, this.json) : null);
        }
        if (!(action instanceof AbstractC5995c.n)) {
            return b.m17960b(state, action, null, null, null, null, null, 62, null);
        }
        AbstractC5995c.n nVar = (AbstractC5995c.n) action;
        ReloadAction reloadAction = nVar.getReloadAction();
        ReloadMode reloadMode = reloadAction != null ? reloadAction.getReloadMode() : null;
        int i13 = reloadMode == null ? -1 : d.f23764a[reloadMode.ordinal()];
        if (i13 == -1) {
            return b.m17960b(state, action, null, null, null, null, null, 62, null);
        }
        if (i13 == 1) {
            ReloadAction reloadAction2 = nVar.getReloadAction();
            return b.m17960b(state, action, null, reloadAction2.getRequest(), AbstractC6000h.m17999n(reloadAction2), null, null, 50, null);
        }
        if (i13 == 2) {
            return b.m17960b(state, action, null, null, null, null, null, 62, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: K */
    private final String m17928K(b state) {
        ReloadAction reloadAction;
        AbstractC5995c action = state.getAction();
        AbstractC5995c.n nVar = action instanceof AbstractC5995c.n ? (AbstractC5995c.n) action : null;
        return (nVar == null || (reloadAction = nVar.getReloadAction()) == null) ? state.getEffectiveCacheKey() : AbstractC6000h.m17999n(reloadAction);
    }

    /* JADX INFO: renamed from: L */
    private final ApiRequest m17929L(b state) {
        ReloadAction reloadAction;
        ApiRequest request;
        AbstractC5995c action = state.getAction();
        AbstractC5995c.n nVar = action instanceof AbstractC5995c.n ? (AbstractC5995c.n) action : null;
        if (nVar != null && (reloadAction = nVar.getReloadAction()) != null && (request = reloadAction.getRequest()) != null) {
            return request;
        }
        ApiRequest effectiveApiRequest = state.getEffectiveApiRequest();
        return effectiveApiRequest == null ? state.getSavedApiRequest() : effectiveApiRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final InterfaceC13058l m17930M(AbstractC30694b.a actionDomainState) {
        return new C0456u(new AbstractC6001i.o(AbstractC39414r.m125876U(actionDomainState.getMessage(), "network", true) ? InterfaceC5994b.c.f23690a : new InterfaceC5994b.d(0, 1, null)), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m17945q(b state) {
        boolean z4 = state.getAction() instanceof AbstractC5995c.d;
        GenericInteraction callerOnStartInteraction = z4 ? state.getCallerOnStartInteraction() : null;
        AbstractC5995c action = state.getAction();
        AbstractC5995c.n nVar = action instanceof AbstractC5995c.n ? (AbstractC5995c.n) action : null;
        C13015a0 c13015a0 = new C13015a0(new f(nVar, this, null), m17918A(m17929L(state), callerOnStartInteraction, nVar != null ? nVar.getManualRefresh() : false, m17928K(state), z4 ? state.getTopItems() : null));
        return (nVar != null ? nVar.getReloadAction() : null) != null ? new C13084s1(new e(c13015a0, null)) : c13015a0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private final InterfaceC13058l m17946r(InterfaceC13058l upstream) {
        return AbstractC13091v.m36590P(new g(new C13060l1(new a(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), upstream, new i(null))), new h(null, this));
    }

    /* JADX INFO: renamed from: s */
    private final InterfaceC13058l m17947s(InterfaceC13058l upstream) {
        return AbstractC13091v.m36590P(new n(new C13060l1(new b(null, null, null, null, null, null, 63, null), new m(upstream), new p(null))), new o(null, this));
    }

    /* JADX INFO: renamed from: t */
    private final InterfaceC13058l m17948t(InterfaceC13058l upstream) {
        return AbstractC13091v.m36590P(new q(upstream), new r(null, this));
    }

    /* JADX INFO: renamed from: u */
    private final C5998f m17949u(C5998f previousState, AbstractC5995c action) {
        if (action instanceof AbstractC5995c.l) {
            return C5998f.m17897b(previousState, null, null, false, false, false, null, ((AbstractC5995c.l) action).getModal(), null, null, false, null, null, null, null, null, null, null, null, null, 524095, null);
        }
        if (action instanceof AbstractC5995c.m) {
            AbstractC5995c.m mVar = (AbstractC5995c.m) action;
            Modal modal = mVar.getModal().getModal();
            if ((modal instanceof DialogModel) || (modal instanceof BottomSheet) || (modal instanceof ToastModal) || (modal instanceof CoachModal)) {
                return C5998f.m17897b(previousState, null, null, false, false, false, null, null, mVar.getModal(), null, false, null, null, null, null, null, null, null, null, null, 524159, null);
            }
            if (modal instanceof FullScreenContentModal) {
                return C5998f.m17897b(previousState, null, null, false, false, false, null, mVar.getModal(), null, null, false, null, null, null, null, null, null, null, null, null, 524095, null);
            }
            if (!AbstractC22676k.m65745e(modal, UnknownModal.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (action instanceof AbstractC5995c.c) {
                return previousState.getNestedModal() != null ? C5998f.m17897b(previousState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524159, null) : C5998f.m17897b(previousState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524223, null);
            }
            if (action instanceof AbstractC5995c.b) {
                return C5998f.m17897b(previousState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524095, null);
            }
            if (action instanceof AbstractC5995c.a) {
                return C5998f.m17897b(previousState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 458751, null);
            }
            if (action instanceof AbstractC5995c.g) {
                AbstractC5995c.g gVar = (AbstractC5995c.g) action;
                return C5998f.m17897b(previousState, null, null, false, false, false, null, null, null, null, false, AbstractC25247g0.m73996e0(previousState.m17899c(), new C23465k(gVar.getPick().getStateKey(), gVar.getUri())), null, null, null, null, null, null, null, null, 392191, null);
            }
            if ((action instanceof AbstractC5995c.h) || (action instanceof AbstractC5995c.f)) {
                return C5998f.m17897b(previousState, null, null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 393215, null);
            }
        }
        return previousState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public final InterfaceC13058l m17950v(GenericInteraction interaction, ApiRequest savedApiRequest, InterfaceC4351m performActionFn) {
        DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction(interaction, this.json);
        if (decodedGenericInteraction == null) {
            return new C0456u(new AbstractC6001i.o(null), 1);
        }
        AnalyticEventModel analyticEvent = decodedGenericInteraction.getAnalyticEvent();
        if (analyticEvent != null) {
            this.analytics.m84382a(new InterfaceC31443b.g(analyticEvent));
        }
        if (decodedGenericInteraction.getModal() != null) {
            AbstractC6001i.o oVar = new AbstractC6001i.o(null);
            AnyModal modal = decodedGenericInteraction.getModal();
            AbstractC22676k.m65747g(modal);
            return new C3383g(new AbstractC6001i[]{oVar, new AbstractC6001i.c(new AbstractC5995c.l(modal))}, 3);
        }
        if (decodedGenericInteraction.getAction() != null) {
            return new C13084s1(new s(performActionFn, decodedGenericInteraction, savedApiRequest, null));
        }
        if (decodedGenericInteraction.getNavigation() != null) {
            AbstractC6001i.o oVar2 = new AbstractC6001i.o(null);
            C9598e navigation = decodedGenericInteraction.getNavigation();
            AbstractC22676k.m65747g(navigation);
            return new C3383g(new AbstractC6001i[]{oVar2, new AbstractC6001i.p(new InterfaceC31443b.c(navigation, false, 2, null))}, 3);
        }
        if (decodedGenericInteraction.getDismissEvent() == null) {
            return new C0456u(new AbstractC6001i.o(null), 1);
        }
        AbstractC6001i.o oVar3 = new AbstractC6001i.o(null);
        C21166s dismissEvent = decodedGenericInteraction.getDismissEvent();
        AbstractC22676k.m65747g(dismissEvent);
        return new C3383g(new AbstractC6001i[]{oVar3, new AbstractC6001i.p(new InterfaceC31443b.q(dismissEvent))}, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC13058l m17951w(AbstractC5995c.f action, ApiRequest savedApiRequest, InterfaceC4351m performActionFn) {
        return new C13084s1(new t(action, this, savedApiRequest, performActionFn, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final InterfaceC13058l m17952x(AbstractC5995c.g action, ApiRequest savedApiRequest, InterfaceC4351m performActionFn) {
        return new C13084s1(new u(action, this, savedApiRequest, performActionFn, null));
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC13058l m17953y(InterfaceC13058l upstream) {
        return new C13052j1(new v(new C13060l1(new c(new C5998f(new InterfaceC5994b.b(null, 1, null), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null), false, 2, null), AbstractC13091v.m36584J(new C0456u(AbstractC6001i.d.f23936a, 1), m17947s(upstream), m17948t(upstream), m17946r(upstream)), new w(this.featureFlagChecker.isFeatureEnabled("android-arch-v2-flow-step-reconcile"), this, null))), new x(null), 0);
    }

    /* JADX INFO: renamed from: z */
    private final InterfaceC13058l m17954z(InterfaceC13058l upstream) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("android-arch-v2-flow-step-reconcile");
        return new C13052j1(new C13060l1(new C5998f(new InterfaceC5994b.b(null, 1, null), null, false, false, false, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 524286, null), AbstractC13091v.m36590P(new C13060l1(new b(null, null, null, null, null, null, 63, null), upstream, new b0(null)), new y(null, this)), new z(zIsFeatureEnabled, this, null)), new a0(null), 0);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return this.featureFlagChecker.isFeatureEnabled("android-arch-v2-generic-interactor") ? m17953y(upstream) : m17954z(upstream);
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$a;", "", "Lcom/whoop/navigation/models/ApiRequest;", "savedApiRequest", "Lcom/whoop/archv2/feature/domain/c;", "action", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/c;)V", "a", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/archv2/feature/domain/c;)Lcom/whoop/archv2/feature/domain/g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/navigation/models/ApiRequest;", "d", "()Lcom/whoop/navigation/models/ApiRequest;", "b", "Lcom/whoop/archv2/feature/domain/c;", "c", "()Lcom/whoop/archv2/feature/domain/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ApiRequest savedApiRequest;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final AbstractC5995c action;

        public a(ApiRequest apiRequest, AbstractC5995c abstractC5995c) {
            this.savedApiRequest = apiRequest;
            this.action = abstractC5995c;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m17955b(a aVar, ApiRequest apiRequest, AbstractC5995c abstractC5995c, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                apiRequest = aVar.savedApiRequest;
            }
            if ((i13 & 2) != 0) {
                abstractC5995c = aVar.action;
            }
            return aVar.m17956a(apiRequest, abstractC5995c);
        }

        /* JADX INFO: renamed from: a */
        public final a m17956a(ApiRequest savedApiRequest, AbstractC5995c action) {
            return new a(savedApiRequest, action);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC5995c getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ApiRequest getSavedApiRequest() {
            return this.savedApiRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.savedApiRequest, aVar.savedApiRequest) && AbstractC22676k.m65745e(this.action, aVar.action);
        }

        public int hashCode() {
            ApiRequest apiRequest = this.savedApiRequest;
            int iHashCode = (apiRequest == null ? 0 : apiRequest.hashCode()) * 31;
            AbstractC5995c abstractC5995c = this.action;
            return iHashCode + (abstractC5995c != null ? abstractC5995c.hashCode() : 0);
        }

        public String toString() {
            return "ActionLaneState(savedApiRequest=" + this.savedApiRequest + ", action=" + this.action + ")";
        }

        public /* synthetic */ a(ApiRequest apiRequest, AbstractC5995c abstractC5995c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : apiRequest, (i13 & 2) != 0 ? null : abstractC5995c);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$c;", "", "Lcom/whoop/archv2/feature/domain/f;", "domainState", "", "activeActionDialog", "<init>", "(Lcom/whoop/archv2/feature/domain/f;Z)V", "a", "(Lcom/whoop/archv2/feature/domain/f;Z)Lcom/whoop/archv2/feature/domain/g$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/archv2/feature/domain/f;", "d", "()Lcom/whoop/archv2/feature/domain/f;", "b", "Z", "c", "()Z", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C5998f domainState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean activeActionDialog;

        public c(C5998f domainState, boolean z4) {
            AbstractC22676k.m65750j(domainState, "domainState");
            this.domainState = domainState;
            this.activeActionDialog = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m17969b(c cVar, C5998f c5998f, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c5998f = cVar.domainState;
            }
            if ((i13 & 2) != 0) {
                z4 = cVar.activeActionDialog;
            }
            return cVar.m17970a(c5998f, z4);
        }

        /* JADX INFO: renamed from: a */
        public final c m17970a(C5998f domainState, boolean activeActionDialog) {
            AbstractC22676k.m65750j(domainState, "domainState");
            return new c(domainState, activeActionDialog);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getActiveActionDialog() {
            return this.activeActionDialog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C5998f getDomainState() {
            return this.domainState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.domainState, cVar.domainState) && this.activeActionDialog == cVar.activeActionDialog;
        }

        public int hashCode() {
            return Boolean.hashCode(this.activeActionDialog) + (this.domainState.hashCode() * 31);
        }

        public String toString() {
            return "LanesReducerState(domainState=" + this.domainState + ", activeActionDialog=" + this.activeActionDialog + ")";
        }

        public /* synthetic */ c(C5998f c5998f, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c5998f, (i13 & 2) != 0 ? false : z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.g$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJX\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\"\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/g$b;", "", "Lcom/whoop/archv2/feature/domain/c;", "action", "Lcom/whoop/navigation/models/ApiRequest;", "savedApiRequest", "effectiveApiRequest", "", "effectiveCacheKey", "Lcom/whoop/navigation/models/GenericInteraction;", "callerOnStartInteraction", "Lcom/whoop/archv2/feature/domain/a;", "topItems", "<init>", "(Lcom/whoop/archv2/feature/domain/c;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/a;)V", "a", "(Lcom/whoop/archv2/feature/domain/c;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/a;)Lcom/whoop/archv2/feature/domain/g$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/archv2/feature/domain/c;", "c", "()Lcom/whoop/archv2/feature/domain/c;", "b", "Lcom/whoop/navigation/models/ApiRequest;", "g", "()Lcom/whoop/navigation/models/ApiRequest;", "e", "d", "Ljava/lang/String;", "f", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/archv2/feature/domain/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/archv2/feature/domain/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC5995c action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ApiRequest savedApiRequest;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final ApiRequest effectiveApiRequest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String effectiveCacheKey;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final GenericInteraction callerOnStartInteraction;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C5993a topItems;

        public b(AbstractC5995c abstractC5995c, ApiRequest apiRequest, ApiRequest apiRequest2, String str, GenericInteraction genericInteraction, C5993a c5993a) {
            this.action = abstractC5995c;
            this.savedApiRequest = apiRequest;
            this.effectiveApiRequest = apiRequest2;
            this.effectiveCacheKey = str;
            this.callerOnStartInteraction = genericInteraction;
            this.topItems = c5993a;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m17960b(b bVar, AbstractC5995c abstractC5995c, ApiRequest apiRequest, ApiRequest apiRequest2, String str, GenericInteraction genericInteraction, C5993a c5993a, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC5995c = bVar.action;
            }
            if ((i13 & 2) != 0) {
                apiRequest = bVar.savedApiRequest;
            }
            if ((i13 & 4) != 0) {
                apiRequest2 = bVar.effectiveApiRequest;
            }
            if ((i13 & 8) != 0) {
                str = bVar.effectiveCacheKey;
            }
            if ((i13 & 16) != 0) {
                genericInteraction = bVar.callerOnStartInteraction;
            }
            if ((i13 & 32) != 0) {
                c5993a = bVar.topItems;
            }
            GenericInteraction genericInteraction2 = genericInteraction;
            C5993a c5993a2 = c5993a;
            return bVar.m17961a(abstractC5995c, apiRequest, apiRequest2, str, genericInteraction2, c5993a2);
        }

        /* JADX INFO: renamed from: a */
        public final b m17961a(AbstractC5995c action, ApiRequest savedApiRequest, ApiRequest effectiveApiRequest, String effectiveCacheKey, GenericInteraction callerOnStartInteraction, C5993a topItems) {
            return new b(action, savedApiRequest, effectiveApiRequest, effectiveCacheKey, callerOnStartInteraction, topItems);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final AbstractC5995c getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final GenericInteraction getCallerOnStartInteraction() {
            return this.callerOnStartInteraction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ApiRequest getEffectiveApiRequest() {
            return this.effectiveApiRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.savedApiRequest, bVar.savedApiRequest) && AbstractC22676k.m65745e(this.effectiveApiRequest, bVar.effectiveApiRequest) && AbstractC22676k.m65745e(this.effectiveCacheKey, bVar.effectiveCacheKey) && AbstractC22676k.m65745e(this.callerOnStartInteraction, bVar.callerOnStartInteraction) && AbstractC22676k.m65745e(this.topItems, bVar.topItems);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getEffectiveCacheKey() {
            return this.effectiveCacheKey;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ApiRequest getSavedApiRequest() {
            return this.savedApiRequest;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C5993a getTopItems() {
            return this.topItems;
        }

        public int hashCode() {
            AbstractC5995c abstractC5995c = this.action;
            int iHashCode = (abstractC5995c == null ? 0 : abstractC5995c.hashCode()) * 31;
            ApiRequest apiRequest = this.savedApiRequest;
            int iHashCode2 = (iHashCode + (apiRequest == null ? 0 : apiRequest.hashCode())) * 31;
            ApiRequest apiRequest2 = this.effectiveApiRequest;
            int iHashCode3 = (iHashCode2 + (apiRequest2 == null ? 0 : apiRequest2.hashCode())) * 31;
            String str = this.effectiveCacheKey;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            GenericInteraction genericInteraction = this.callerOnStartInteraction;
            int iHashCode5 = (iHashCode4 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
            C5993a c5993a = this.topItems;
            return iHashCode5 + (c5993a != null ? c5993a.hashCode() : 0);
        }

        public String toString() {
            return "InteractorState(action=" + this.action + ", savedApiRequest=" + this.savedApiRequest + ", effectiveApiRequest=" + this.effectiveApiRequest + ", effectiveCacheKey=" + this.effectiveCacheKey + ", callerOnStartInteraction=" + this.callerOnStartInteraction + ", topItems=" + this.topItems + ")";
        }

        public /* synthetic */ b(AbstractC5995c abstractC5995c, ApiRequest apiRequest, ApiRequest apiRequest2, String str, GenericInteraction genericInteraction, C5993a c5993a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : abstractC5995c, (i13 & 2) != 0 ? null : apiRequest, (i13 & 4) != 0 ? null : apiRequest2, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : genericInteraction, (i13 & 32) != 0 ? null : c5993a);
        }
    }
}
