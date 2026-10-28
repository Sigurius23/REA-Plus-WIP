package com.whoop.p069ui.debug;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.app.NotificationCompat;
import androidx.health.platform.client.proto.C1533u;
import as2.AbstractC1953c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.debug.PushDebugFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.service.push.notifications.C10002n;
import com.whoop.service.push.notifications.C9989a;
import com.whoop.service.push.notifications.C9990b;
import com.whoop.service.push.notifications.C9991c;
import com.whoop.service.push.notifications.C9994f;
import com.whoop.service.push.notifications.C9995g;
import com.whoop.service.push.notifications.C9996h;
import com.whoop.service.push.notifications.C9997i;
import com.whoop.service.push.notifications.C9998j;
import dp0.InterfaceC12251g;
import hj0.AbstractC17354m;
import hj0.C17345d;
import ii0.AbstractC18561q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j93.InterfaceC21493z;
import java.util.UUID;
import java.util.WeakHashMap;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.C25272z;
import m92.C25323f;
import m92.InterfaceC25322e;
import mm.C25680d;
import o92.C27695c;
import o92.C27696c0;
import o92.C27704g0;
import o92.C27705h;
import o92.C27706h0;
import o92.C27708i0;
import o92.C27716n;
import o92.C27721s;
import o92.C27725w;
import o92.C27728z;
import or2.AbstractC28163g0;
import p088dc.AbstractC11895b;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import rr2.InterfaceC31766c;
import vf3.InterfaceC35951a;
import we1.C37223g;
import we1.InterfaceC37217a;
import wm0.C37378a;
import x82.C38082i;
import yp0.InterfaceC39700a;
import z82.C40197k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 |2\u00020\u0001:\u0001}B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003R\u001a\u0010'\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u00106R+\u0010@\u001a\u0002082\u0006\u00109\u001a\u0002088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010*\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010*\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010*\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010*\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010*\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010*\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010*\u001a\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010*\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010*\u001a\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010*\u001a\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010*\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006~"}, m65681d2 = {"Lcom/whoop/ui/debug/PushDebugFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "title", "body", "deeplink", "channelId", "channelName", "sourceId", "T0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lm92/f;", "data", "Lm92/e;", "push", "U0", "(Lm92/f;Lm92/e;)V", "e0", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lrr2/c;", "x", "Ll83/h;", "A", "()Lrr2/c;", "crashReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "y", "p0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/repositories/NotificationRepository;", "z", "s0", "()Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Lii0/q;", "<set-?>", "E", "Lcom/whoop/ui/b;", "k0", "()Lii0/q;", "V0", "(Lii0/q;)V", "binding", "Lwm0/a;", "F", "t0", "()Lwm0/a;", "scopeCoordinator", "Lo92/c0;", "G", "l0", "()Lo92/c0;", "bodyGetter", "Lz82/k;", "H", "g0", "()Lz82/k;", "analyticsManager", "Lx82/i;", "I", "j0", "()Lx82/i;", "batteryMonitor", "Lwe1/g;", "J", "o0", "()Lwe1/g;", "entitlementsRepository", "Lcom/whoop/data/remote/AppConfigurationRepository;", "K", "h0", "()Lcom/whoop/data/remote/AppConfigurationRepository;", "appConfigurationRepository", "Liy1/c;", "L", "r0", "()Liy1/c;", "metricWriter", "Ldp0/g;", "M", "q0", "()Ldp0/g;", "globalCoachManager", "Lhj0/d;", "N", "i0", "()Lhj0/d;", "appLifecycle", "Lwe1/a;", "O", "n0", "()Lwe1/a;", "entitlementChecker", "Lyp0/a;", "P", "m0", "()Lyp0/a;", "communityAccessChecker", "Lo92/s;", "Q", "Lo92/s;", "pushContext", "R", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PushDebugFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C10462b binding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h scopeCoordinator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h bodyGetter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h batteryMonitor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h entitlementsRepository;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h appConfigurationRepository;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h globalCoachManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC23462h appLifecycle;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h entitlementChecker;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h communityAccessChecker;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C27721s pushContext;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "PushDebugFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h notificationRepository;

    /* JADX INFO: renamed from: S */
    static final /* synthetic */ InterfaceC21493z[] f31677S = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(PushDebugFragment.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentPushDebugBinding;", 0))};

    /* JADX INFO: renamed from: T */
    public static final int f31678T = 8;

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10471b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31696w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31697x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31698y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10471b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31696w = componentCallbacks;
            this.f31697x = interfaceC35951a;
            this.f31698y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            ComponentCallbacks componentCallbacks = this.f31696w;
            InterfaceC35951a interfaceC35951a = this.f31697x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31698y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10472c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31699w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31700x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31701y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10472c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31699w = componentCallbacks;
            this.f31700x = interfaceC35951a;
            this.f31701y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dp0.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12251g invoke() {
            ComponentCallbacks componentCallbacks = this.f31699w;
            InterfaceC35951a interfaceC35951a = this.f31700x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31701y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10473d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31702w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31703x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31704y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10473d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31702w = componentCallbacks;
            this.f31703x = interfaceC35951a;
            this.f31704y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hj0.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17345d invoke() {
            ComponentCallbacks componentCallbacks = this.f31702w;
            InterfaceC35951a interfaceC35951a = this.f31703x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31704y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17345d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10474e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31705w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31706x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31707y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10474e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31705w = componentCallbacks;
            this.f31706x = interfaceC35951a;
            this.f31707y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, we1.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC37217a invoke() {
            ComponentCallbacks componentCallbacks = this.f31705w;
            InterfaceC35951a interfaceC35951a = this.f31706x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31707y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC37217a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10475f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31708w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31709x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31710y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10475f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31708w = componentCallbacks;
            this.f31709x = interfaceC35951a;
            this.f31710y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yp0.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC39700a invoke() {
            ComponentCallbacks componentCallbacks = this.f31708w;
            InterfaceC35951a interfaceC35951a = this.f31709x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31710y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC39700a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10476g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31711w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31712x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31713y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10476g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31711w = componentCallbacks;
            this.f31712x = interfaceC35951a;
            this.f31713y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            ComponentCallbacks componentCallbacks = this.f31711w;
            InterfaceC35951a interfaceC35951a = this.f31712x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31713y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10477h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31714w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31715x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31716y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10477h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31714w = componentCallbacks;
            this.f31715x = interfaceC35951a;
            this.f31716y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f31714w;
            InterfaceC35951a interfaceC35951a = this.f31715x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31716y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10478i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31717w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31718x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31719y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10478i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31717w = componentCallbacks;
            this.f31718x = interfaceC35951a;
            this.f31719y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.NotificationRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final NotificationRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31717w;
            InterfaceC35951a interfaceC35951a = this.f31718x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31719y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(NotificationRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10479j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31720w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31721x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31722y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10479j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31720w = componentCallbacks;
            this.f31721x = interfaceC35951a;
            this.f31722y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wm0.a] */
        @Override // c93.InterfaceC4339a
        public final C37378a invoke() {
            ComponentCallbacks componentCallbacks = this.f31720w;
            InterfaceC35951a interfaceC35951a = this.f31721x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31722y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37378a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10480k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31723w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31724x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31725y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10480k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31723w = componentCallbacks;
            this.f31724x = interfaceC35951a;
            this.f31725y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o92.c0] */
        @Override // c93.InterfaceC4339a
        public final C27696c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f31723w;
            InterfaceC35951a interfaceC35951a = this.f31724x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31725y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27696c0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10481l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31726w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31727x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31728y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10481l(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31726w = componentCallbacks;
            this.f31727x = interfaceC35951a;
            this.f31728y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, z82.k] */
        @Override // c93.InterfaceC4339a
        public final C40197k invoke() {
            ComponentCallbacks componentCallbacks = this.f31726w;
            InterfaceC35951a interfaceC35951a = this.f31727x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31728y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40197k.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$m */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10482m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31729w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31730x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31731y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10482m(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31729w = componentCallbacks;
            this.f31730x = interfaceC35951a;
            this.f31731y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x82.i] */
        @Override // c93.InterfaceC4339a
        public final C38082i invoke() {
            ComponentCallbacks componentCallbacks = this.f31729w;
            InterfaceC35951a interfaceC35951a = this.f31730x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31731y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38082i.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10483n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31732w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31733x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31734y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10483n(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31732w = componentCallbacks;
            this.f31733x = interfaceC35951a;
            this.f31734y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, we1.g] */
        @Override // c93.InterfaceC4339a
        public final C37223g invoke() {
            ComponentCallbacks componentCallbacks = this.f31732w;
            InterfaceC35951a interfaceC35951a = this.f31733x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31734y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37223g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.debug.PushDebugFragment$o */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10484o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31735w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31736x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31737y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10484o(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31735w = componentCallbacks;
            this.f31736x = interfaceC35951a;
            this.f31737y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.remote.AppConfigurationRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final AppConfigurationRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31735w;
            InterfaceC35951a interfaceC35951a = this.f31736x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31737y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AppConfigurationRepository.class), interfaceC35951a);
        }
    }

    public PushDebugFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C10476g(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10477h(this, null, null));
        this.notificationRepository = AbstractC30060g.m92087G(enumC23463i, new C10478i(this, null, null));
        this.binding = AbstractC10463c.m26726c(this, null, 1, null);
        this.scopeCoordinator = AbstractC30060g.m92087G(enumC23463i, new C10479j(this, null, null));
        this.bodyGetter = AbstractC30060g.m92087G(enumC23463i, new C10480k(this, null, null));
        this.analyticsManager = AbstractC30060g.m92087G(enumC23463i, new C10481l(this, null, null));
        this.batteryMonitor = AbstractC30060g.m92087G(enumC23463i, new C10482m(this, null, null));
        this.entitlementsRepository = AbstractC30060g.m92087G(enumC23463i, new C10483n(this, null, null));
        this.appConfigurationRepository = AbstractC30060g.m92087G(enumC23463i, new C10484o(this, null, null));
        this.metricWriter = AbstractC30060g.m92087G(enumC23463i, new C10471b(this, null, null));
        this.globalCoachManager = AbstractC30060g.m92087G(enumC23463i, new C10472c(this, null, null));
        this.appLifecycle = AbstractC30060g.m92087G(enumC23463i, new C10473d(this, null, null));
        this.entitlementChecker = AbstractC30060g.m92087G(enumC23463i, new C10474e(this, null, null));
        this.communityAccessChecker = AbstractC30060g.m92087G(enumC23463i, new C10475f(this, null, null));
        this.pushContext = new C27721s(m26763A(), m26823p0(), m26826s0(), (InterfaceC2994c0) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC31766c m26763A() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m26764A0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "whoop_labs"), new C23465k("title", "Whoop Labs"), new C23465k("body", "New campaign available!"), new C23465k("campaignId", "149"))), new C10002n(pushDebugFragment.pushContext));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m26765B0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "whoop_labs"), new C23465k("title", "Whoop Labs"), new C23465k("body", "New session available!"), new C23465k("campaignId", "149"), new C23465k("sessionId", "37"))), new C10002n(pushDebugFragment.pushContext));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m26766C0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        pushDebugFragment.m26799T0("CITL Home (Arch v2)", "Tap to land on the arch-v2 CITL Home screen", "https://app.whoop.com/navigation/mobile/v1/citl-home", "08000_DebugGenericChannelA", "Debug Generic Channel A", string);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m26767D0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        pushDebugFragment.m26799T0("CITL Intake Scheduled Ahead (Arch v1)", "Tap to land on the arch-v1 CITL intake screen", "https://app.whoop.com/navigation/mobile/v1/citl-intake-scheduled-ahead", "08000_DebugGenericChannelA", "Debug Generic Channel A", string);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m26769E0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26799T0(AbstractC11895b.m31994m(System.currentTimeMillis() % ((long) 1000), "Arch V2 — distinct id "), "Tap again — each push should appear separately in the tray", "https://app.whoop.com/navigation/mobile/v1/citl-home", "08000_DebugGenericChannelA", "Debug Generic Channel A", AbstractC11895b.m31995n("toString(...)"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m26771F0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26799T0(AbstractC11895b.m31994m(System.currentTimeMillis() % ((long) 1000), "Arch V2 — replace-in-place tap "), "Tap repeatedly — should update the existing notification, not stack", "https://app.whoop.com/navigation/mobile/v1/citl-home", "08000_DebugGenericChannelA", "Debug Generic Channel A", "debug-arch-v2-replace-in-place");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m26773G0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(C25272z.f99163w), new C27725w(pushDebugFragment.pushContext, pushDebugFragment.m26822o0(), pushDebugFragment.m26815h0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m26775H0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        pushDebugFragment.m26799T0("Arch V2 — Channel B", "Should register a new 'Channel B' visible in system notification settings", "https://app.whoop.com/navigation/mobile/v1/citl-home", "08100_DebugGenericChannelB", "Debug Generic Channel B", string);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m26777I0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        pushDebugFragment.m26799T0("Arch V2 — malformed deeplink", "Tap should open the app without crashing (graceful degradation)", "not-a-url", "08000_DebugGenericChannelA", "Debug Generic Channel A", string);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m26779J0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "FollowerInvite"), new C23465k("title", "New follower request"), new C23465k("body", "Someone wants to follow you"), new C23465k("invite_id", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), new C23465k("sending_user_id", "111"), new C23465k("receiving_user_id", "222"))), new C9995g(pushDebugFragment.pushContext, pushDebugFragment.m26821n0(), pushDebugFragment.m26820m0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m26781K0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "FollowerInviteAccepted"), new C23465k("title", "Follow request accepted"), new C23465k("body", "You're now following them"), new C23465k("sending_user_id", "111"), new C23465k("receiving_user_id", "222"))), new C9994f(pushDebugFragment.pushContext, pushDebugFragment.m26821n0(), pushDebugFragment.m26820m0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m26783L0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "JoinCommunity"), new C23465k("title", "Community invite"), new C23465k("body", "You've been invited to join a community"), new C23465k("community_id", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), new C23465k("invite_id", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), new C23465k("community_name", "Test Community"), new C23465k("community_icon_url", "https://cdn.whoop.com/test.png"), new C23465k("sender_id", "2"), new C23465k("sender_username", "tester"))), new C9997i(pushDebugFragment.pushContext, pushDebugFragment.m26821n0(), pushDebugFragment.m26820m0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m26785M0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(C25272z.f99163w), new C27728z(pushDebugFragment.pushContext, pushDebugFragment.m26827t0(), pushDebugFragment.m26825r0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m26787N0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "SleepCoachV2"), new C23465k("title", "Peak day tomorrow."), new C23465k("body", "Your Sleep Need is 8:26 hours of sleep. Spend time in bed from 10:55PM to 7:55PM."))), new C9998j(pushDebugFragment.pushContext, pushDebugFragment.m26817j0(), pushDebugFragment.m26814g0(), pushDebugFragment.m26819l0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m26789O0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "BloodworkImageUploadReview"), new C23465k("title", "Test Results Ready"), new C23465k("body", "Your blood work results are ready for review"), new C23465k(NotificationCompat.CATEGORY_NAVIGATION, "{\"screen\":\"ADVANCED_LABS_EDIT_BIOMARKERS\",\"parameters\":{\"test_id\":\"2cf2c1f6-cae7-47bf-b3b7-f7d343cf9b44\",\"is_ai_confirmation\":false}}"))), new C9989a(pushDebugFragment.pushContext));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m26791P0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "BloodworkImageUploadReview"), new C23465k("title", "Upload Failed"), new C23465k("body", "There was an issue processing your test. Please try uploading again."), new C23465k(NotificationCompat.CATEGORY_NAVIGATION, "{\"screen\":\"ADVANCED_LABS_UPLOAD_TEST\"}"))), new C9989a(pushDebugFragment.pushContext));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m26793Q0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "DataStreakRestorationAvailable"), new C23465k("title", "Restore your 60 day streak!"), new C23465k("body", "Wear your WHOOP Strap for 7 days straight, keep your streak going. You can do this!"))), new C27708i0(pushDebugFragment.pushContext, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public static final C23454a0 m26795R0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "DataStreakRestorationReminders"), new C23465k("title", "🥶 Your 14 day streak has been frozen"), new C23465k("body", "Wear WHOOP for 3 days straight to reclaim your impressive day streak."))), new C27706h0(pushDebugFragment.pushContext, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m26797S0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "DataStreakRestoration"), new C23465k("title", "🔥 Streak restore started"), new C23465k("body", "Wear your WHOOP for 3 days straight to restore your streak."))), new C27704g0(pushDebugFragment.pushContext, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m26799T0(String title, String body, String deeplink, String channelId, String channelName, String sourceId) {
        m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "GENERIC"), new C23465k("source_id", sourceId), new C23465k("title", title), new C23465k("body", body), new C23465k("deep_link", deeplink), new C23465k("channel_id", channelId), new C23465k("channel_name", channelName))), new C9991c(this.pushContext, m26825r0()));
    }

    /* JADX INFO: renamed from: U0 */
    private final void m26801U0(C25323f data, InterfaceC25322e push) {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        push.mo24524a(data, contextRequireContext);
    }

    /* JADX INFO: renamed from: V0 */
    private final void m26803V0(AbstractC18561q abstractC18561q) {
        this.binding.setValue(this, f31677S[0], abstractC18561q);
    }

    /* JADX INFO: renamed from: e0 */
    private final void m26812e0() {
        C25680d c25680d = new C25680d(this, 3);
        View root = m26818k0().getRoot();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c25680d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C16905q1 m26813f0(PushDebugFragment pushDebugFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        View root = pushDebugFragment.m26818k0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), c35643bMo47530g.f151450b, root.getPaddingRight(), c35643bMo47530g.f151452d);
        return C16905q1.f64863b;
    }

    /* JADX INFO: renamed from: g0 */
    private final C40197k m26814g0() {
        return (C40197k) this.analyticsManager.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private final AppConfigurationRepository m26815h0() {
        return (AppConfigurationRepository) this.appConfigurationRepository.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final C17345d m26816i0() {
        return (C17345d) this.appLifecycle.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    private final C38082i m26817j0() {
        return (C38082i) this.batteryMonitor.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final AbstractC18561q m26818k0() {
        return (AbstractC18561q) this.binding.getValue(this, f31677S[0]);
    }

    /* JADX INFO: renamed from: l0 */
    private final C27696c0 m26819l0() {
        return (C27696c0) this.bodyGetter.getValue();
    }

    /* JADX INFO: renamed from: m0 */
    private final InterfaceC39700a m26820m0() {
        return (InterfaceC39700a) this.communityAccessChecker.getValue();
    }

    /* JADX INFO: renamed from: n0 */
    private final InterfaceC37217a m26821n0() {
        return (InterfaceC37217a) this.entitlementChecker.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final C37223g m26822o0() {
        return (C37223g) this.entitlementsRepository.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    private final FeatureFlagChecker m26823p0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    private final InterfaceC12251g m26824q0() {
        return (InterfaceC12251g) this.globalCoachManager.getValue();
    }

    /* JADX INFO: renamed from: r0 */
    private final InterfaceC21030c m26825r0() {
        return (InterfaceC21030c) this.metricWriter.getValue();
    }

    /* JADX INFO: renamed from: s0 */
    private final NotificationRepository m26826s0() {
        return (NotificationRepository) this.notificationRepository.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private final C37378a m26827t0() {
        return (C37378a) this.scopeCoordinator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m26828u0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C25323f c25323f = new C25323f(C25272z.f99163w);
        C27721s c27721s = pushDebugFragment.pushContext;
        Context contextRequireContext = pushDebugFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        pushDebugFragment.m26801U0(c25323f, new C27705h(c27721s, contextRequireContext, pushDebugFragment.m26823p0(), null, 8, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m26829v0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(C25272z.f99163w), new C27716n(pushDebugFragment.pushContext, pushDebugFragment.m26827t0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m26830w0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "TimezoneChangeSleepInsight"), new C23465k("title", "Timezone Change Detected"), new C23465k("body", "Your sleep patterns may be affected by the timezone change"), new C23465k("meta_data", "{\"destination\":{\"screen\":\"HOME\",\"parameters\":{\"ai_action\":{\"screen_id\":\"HOME\",\"source\":\"TIMEZONE_CHANGE_GPS_INSIGHTS\",\"source_type\":\"CHAT_WITH_AGENT\",\"source_id\":\"new-agent-name\",\"conversation_seed_id\":\"test-conversation-seed-123\"}}}}"))), new C9996h(pushDebugFragment.pushContext));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m26831x0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "AI_AGENT_MESSAGE"), new C23465k("title", "You Got a Push - Aren't you cool?"), new C23465k("body", "AiAgentPush test push"), new C23465k("destination", "{\"screen\":\"HOME\",\"parameters\":{\"ai_action\":{\"screen_id\":\"HOME\",\"source\":\"WCE_HOME\",\"source_type\":\"CHAT_WITH_AGENT\",\"source_id\":\"wce-push-test-agent\",\"fingerprint\":\"RANDOM_UUID_FINGERPRINT_TEST_1000\",\"agent_id\":\"wce-push-test-agent\",\"should_open_full_size\":\"true\"}}}"))), new C9990b(pushDebugFragment.pushContext, pushDebugFragment.m26824q0(), pushDebugFragment.m26825r0(), pushDebugFragment.m26816i0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m26832y0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "CHAT_WITH_AGENT"), new C23465k("title", "Chat With Agent"), new C23465k("body", "This is a test notification with a longer body to verify BigTextStyle expansion. When the notification is collapsed, this text will be truncated. When expanded, you should be able to read the full message without any truncation."), new C23465k("source_id", "test-agent"), new C23465k("conversation_seed_id", "test-seed-123"))), new C27695c(pushDebugFragment.pushContext, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m26833z0(PushDebugFragment pushDebugFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        pushDebugFragment.m26801U0(new C25323f(AbstractC25247g0.m73990Y(new C23465k("notificationType", "whoop_labs"), new C23465k("title", "Whoop Labs"), new C23465k("body", "New studies available!"))), new C10002n(pushDebugFragment.pushContext));
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18561q abstractC18561qM53773c = AbstractC18561q.m53773c(getLayoutInflater(), container, false);
        AbstractC22676k.m65749i(abstractC18561qM53773c, "inflate(...)");
        m26803V0(abstractC18561qM53773c);
        View root = m26818k0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC18561q abstractC18561qM26818k0 = m26818k0();
        super.onViewCreated(view, savedInstanceState);
        m26812e0();
        Button sendDeadBattery = abstractC18561qM26818k0.f72374k;
        AbstractC22676k.m65749i(sendDeadBattery, "sendDeadBattery");
        final int i13 = 0;
        AbstractC1953c.m5963a(sendDeadBattery, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendMciOverviewSilentPush = abstractC18561qM26818k0.f72379p;
        AbstractC22676k.m65749i(sendMciOverviewSilentPush, "sendMciOverviewSilentPush");
        final int i14 = 2;
        AbstractC1953c.m5963a(sendMciOverviewSilentPush, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendRefreshEntitlementsSilentPush = abstractC18561qM26818k0.f72380q;
        AbstractC22676k.m65749i(sendRefreshEntitlementsSilentPush, "sendRefreshEntitlementsSilentPush");
        final int i15 = 8;
        AbstractC1953c.m5963a(sendRefreshEntitlementsSilentPush, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendRefreshPendingFollowerInvites = abstractC18561qM26818k0.f72381r;
        AbstractC22676k.m65749i(sendRefreshPendingFollowerInvites, "sendRefreshPendingFollowerInvites");
        final int i16 = 9;
        AbstractC1953c.m5963a(sendRefreshPendingFollowerInvites, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendSleepNeed = abstractC18561qM26818k0.f72382s;
        AbstractC22676k.m65749i(sendSleepNeed, "sendSleepNeed");
        final int i17 = 10;
        AbstractC1953c.m5963a(sendSleepNeed, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i17) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendAdvancedLabsUploadSuccess = abstractC18561qM26818k0.f72365b;
        AbstractC22676k.m65749i(sendAdvancedLabsUploadSuccess, "sendAdvancedLabsUploadSuccess");
        final int i18 = 12;
        AbstractC1953c.m5963a(sendAdvancedLabsUploadSuccess, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i18) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendAdvancedLabsUploadFailure = abstractC18561qM26818k0.f72364a;
        AbstractC22676k.m65749i(sendAdvancedLabsUploadFailure, "sendAdvancedLabsUploadFailure");
        final int i19 = 13;
        AbstractC1953c.m5963a(sendAdvancedLabsUploadFailure, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i19) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendStreakRestoreAvailable = abstractC18561qM26818k0.f72385v;
        AbstractC22676k.m65749i(sendStreakRestoreAvailable, "sendStreakRestoreAvailable");
        final int i24 = 14;
        AbstractC1953c.m5963a(sendStreakRestoreAvailable, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i24) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendStreakRestorationReminder = abstractC18561qM26818k0.f72384u;
        AbstractC22676k.m65749i(sendStreakRestorationReminder, "sendStreakRestorationReminder");
        final int i25 = 15;
        AbstractC1953c.m5963a(sendStreakRestorationReminder, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i25) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendStreakRestoration = abstractC18561qM26818k0.f72383t;
        AbstractC22676k.m65749i(sendStreakRestoration, "sendStreakRestoration");
        final int i26 = 16;
        AbstractC1953c.m5963a(sendStreakRestoration, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i26) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendGpsInsights = abstractC18561qM26818k0.f72377n;
        AbstractC22676k.m65749i(sendGpsInsights, "sendGpsInsights");
        final int i27 = 11;
        AbstractC1953c.m5963a(sendGpsInsights, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i27) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendCoachEverywhere = abstractC18561qM26818k0.f72373j;
        AbstractC22676k.m65749i(sendCoachEverywhere, "sendCoachEverywhere");
        final int i28 = 17;
        AbstractC1953c.m5963a(sendCoachEverywhere, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i28) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendChatWithAgent = abstractC18561qM26818k0.f72372i;
        AbstractC22676k.m65749i(sendChatWithAgent, "sendChatWithAgent");
        final int i29 = 18;
        AbstractC1953c.m5963a(sendChatWithAgent, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i29) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendWhoopLabs = abstractC18561qM26818k0.f72386w;
        AbstractC22676k.m65749i(sendWhoopLabs, "sendWhoopLabs");
        final int i34 = 19;
        AbstractC1953c.m5963a(sendWhoopLabs, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i34) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendWhoopLabsToCampaign = abstractC18561qM26818k0.f72387x;
        AbstractC22676k.m65749i(sendWhoopLabsToCampaign, "sendWhoopLabsToCampaign");
        final int i35 = 20;
        AbstractC1953c.m5963a(sendWhoopLabsToCampaign, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i35) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendWhoopLabsToSession = abstractC18561qM26818k0.f72388y;
        AbstractC22676k.m65749i(sendWhoopLabsToSession, "sendWhoopLabsToSession");
        final int i36 = 21;
        AbstractC1953c.m5963a(sendWhoopLabsToSession, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i36) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendArchV2GenericCitlHome = abstractC18561qM26818k0.f72367d;
        AbstractC22676k.m65749i(sendArchV2GenericCitlHome, "sendArchV2GenericCitlHome");
        final int i37 = 22;
        AbstractC1953c.m5963a(sendArchV2GenericCitlHome, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i37) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendArchV2GenericCitlIntake = abstractC18561qM26818k0.f72368e;
        AbstractC22676k.m65749i(sendArchV2GenericCitlIntake, "sendArchV2GenericCitlIntake");
        final int i38 = 23;
        AbstractC1953c.m5963a(sendArchV2GenericCitlIntake, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i38) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendArchV2GenericDistinctIds = abstractC18561qM26818k0.f72369f;
        AbstractC22676k.m65749i(sendArchV2GenericDistinctIds, "sendArchV2GenericDistinctIds");
        final int i39 = 24;
        AbstractC1953c.m5963a(sendArchV2GenericDistinctIds, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i39) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendArchV2GenericReplaceInPlace = abstractC18561qM26818k0.f72371h;
        AbstractC22676k.m65749i(sendArchV2GenericReplaceInPlace, "sendArchV2GenericReplaceInPlace");
        final int i44 = 1;
        AbstractC1953c.m5963a(sendArchV2GenericReplaceInPlace, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i44) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendArchV2GenericChannelB = abstractC18561qM26818k0.f72366c;
        AbstractC22676k.m65749i(sendArchV2GenericChannelB, "sendArchV2GenericChannelB");
        final int i45 = 3;
        AbstractC1953c.m5963a(sendArchV2GenericChannelB, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i45) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendArchV2GenericMalformedDeeplink = abstractC18561qM26818k0.f72370g;
        AbstractC22676k.m65749i(sendArchV2GenericMalformedDeeplink, "sendArchV2GenericMalformedDeeplink");
        final int i46 = 4;
        AbstractC1953c.m5963a(sendArchV2GenericMalformedDeeplink, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i46) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendFollowerInvite = abstractC18561qM26818k0.f72375l;
        AbstractC22676k.m65749i(sendFollowerInvite, "sendFollowerInvite");
        final int i47 = 5;
        AbstractC1953c.m5963a(sendFollowerInvite, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i47) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendFollowerInviteAccepted = abstractC18561qM26818k0.f72376m;
        AbstractC22676k.m65749i(sendFollowerInviteAccepted, "sendFollowerInviteAccepted");
        final int i48 = 6;
        AbstractC1953c.m5963a(sendFollowerInviteAccepted, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i48) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
        Button sendInviteToJoinCommunity = abstractC18561qM26818k0.f72378o;
        AbstractC22676k.m65749i(sendInviteToJoinCommunity, "sendInviteToJoinCommunity");
        final int i49 = 7;
        AbstractC1953c.m5963a(sendInviteToJoinCommunity, new Function1(this) { // from class: mm2.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ PushDebugFragment f101208x;

            {
                this.f101208x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i49) {
                    case 0:
                        return PushDebugFragment.m26828u0(this.f101208x, (View) obj);
                    case 1:
                        return PushDebugFragment.m26771F0(this.f101208x, (View) obj);
                    case 2:
                        return PushDebugFragment.m26829v0(this.f101208x, (View) obj);
                    case 3:
                        return PushDebugFragment.m26775H0(this.f101208x, (View) obj);
                    case 4:
                        return PushDebugFragment.m26777I0(this.f101208x, (View) obj);
                    case 5:
                        return PushDebugFragment.m26779J0(this.f101208x, (View) obj);
                    case 6:
                        return PushDebugFragment.m26781K0(this.f101208x, (View) obj);
                    case 7:
                        return PushDebugFragment.m26783L0(this.f101208x, (View) obj);
                    case 8:
                        return PushDebugFragment.m26773G0(this.f101208x, (View) obj);
                    case 9:
                        return PushDebugFragment.m26785M0(this.f101208x, (View) obj);
                    case 10:
                        return PushDebugFragment.m26787N0(this.f101208x, (View) obj);
                    case 11:
                        return PushDebugFragment.m26830w0(this.f101208x, (View) obj);
                    case 12:
                        return PushDebugFragment.m26789O0(this.f101208x, (View) obj);
                    case 13:
                        return PushDebugFragment.m26791P0(this.f101208x, (View) obj);
                    case 14:
                        return PushDebugFragment.m26793Q0(this.f101208x, (View) obj);
                    case 15:
                        return PushDebugFragment.m26795R0(this.f101208x, (View) obj);
                    case 16:
                        return PushDebugFragment.m26797S0(this.f101208x, (View) obj);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return PushDebugFragment.m26831x0(this.f101208x, (View) obj);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return PushDebugFragment.m26832y0(this.f101208x, (View) obj);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return PushDebugFragment.m26833z0(this.f101208x, (View) obj);
                    case 20:
                        return PushDebugFragment.m26764A0(this.f101208x, (View) obj);
                    case 21:
                        return PushDebugFragment.m26765B0(this.f101208x, (View) obj);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return PushDebugFragment.m26766C0(this.f101208x, (View) obj);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return PushDebugFragment.m26767D0(this.f101208x, (View) obj);
                    default:
                        return PushDebugFragment.m26769E0(this.f101208x, (View) obj);
                }
            }
        });
    }
}
