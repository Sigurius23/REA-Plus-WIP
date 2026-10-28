package com.whoop.user.journey.view;

import android.content.ClipData;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.user.journey.view.UserJourneyFragment;
import eq2.AbstractC13565c;
import eq2.C13564b;
import eq2.C13566d;
import eq2.C13567e;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j02.C21133b1;
import j02.InterfaceC21159o0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import jp1.C21859k;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import kq2.C22775a;
import kq2.C22777c;
import kq2.C22779e;
import kq2.C22781g;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lr2.InterfaceC24703d;
import mq2.AbstractC25890c;
import mq2.C25889b;
import or2.AbstractC28163g0;
import or2.C28216y;
import p000.AbstractC11266d;
import p114eb.C12962i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p717lq2.AbstractC24686r;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import rq2.AbstractC31752t0;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import xq2.AbstractC38559e0;
import xq2.EnumC38591t;
import yb3.AbstractC39414r;
import yp2.AbstractC39706c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 g2\u00020\u0001:\u0001hB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J5\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000600H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b4\u0010 J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003J)\u0010;\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u001d2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010A\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010A\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010A\u001a\u0004\b\\\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010A\u001a\u0004\bd\u0010e¨\u0006i²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/user/journey/view/UserJourneyFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", NotificationCompat.CATEGORY_EVENT, "S", "(Ljava/lang/Object;)V", "Lrq2/t0$g;", "W", "(Lrq2/t0$g;)V", "r0", "", QueryParams.URL, "P", "(Ljava/lang/String;)V", "", "isError", "O", "(Z)V", "t0", "Leq2/c;", "viewEvent", "p0", "(Leq2/c;)V", "Lmq2/b;", "coordinator", "Leq2/e;", "viewState", "Lxq2/t;", "direction", "Lkotlin/Function0;", "onComplete", "V", "(Lmq2/b;Leq2/e;Lxq2/t;Lc93/a;)V", "X", "q0", "message", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "imageBmp", "u0", "(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Bitmap;)V", "s0", "(Leq2/e;)V", "Leq2/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "T", "()Leq2/d;", "viewModel", "Lkq2/g;", "x", "Leb/i;", "R", "()Lkq2/g;", "args", "Lor2/y;", "y", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lkq2/a;", "z", "Q", "()Lkq2/a;", "analyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "getFeatureFlagChecker", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/o0;", "F", "getNavigator", "()Lj02/o0;", "navigator", "G", "Ljava/lang/String;", "currentStepAnalyticName", "Lj02/b1;", "H", "U", "()Lj02/b1;", "yirCoordinator", "I", "a", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UserJourneyFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: J */
    public static final int f32582J = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private String currentStepAnalyticName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h yirCoordinator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10690i(this, null, new C10689h(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22781g.class), new C10688g(this));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10683b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32591w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32592x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32593y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10683b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32591w = componentCallbacks;
            this.f32592x = interfaceC35951a;
            this.f32593y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f32591w;
            InterfaceC35951a interfaceC35951a = this.f32592x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32593y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10684c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32594w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32595x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32596y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10684c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32594w = componentCallbacks;
            this.f32595x = interfaceC35951a;
            this.f32596y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kq2.a] */
        @Override // c93.InterfaceC4339a
        public final C22775a invoke() {
            ComponentCallbacks componentCallbacks = this.f32594w;
            InterfaceC35951a interfaceC35951a = this.f32595x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32596y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C22775a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10685d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32597w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32598x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32599y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10685d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32597w = componentCallbacks;
            this.f32598x = interfaceC35951a;
            this.f32599y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32597w;
            InterfaceC35951a interfaceC35951a = this.f32598x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32599y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10686e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32600w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32601x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32602y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10686e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32600w = componentCallbacks;
            this.f32601x = interfaceC35951a;
            this.f32602y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32600w;
            InterfaceC35951a interfaceC35951a = this.f32601x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32602y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10687f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32603w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32604x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32605y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10687f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32603w = componentCallbacks;
            this.f32604x = interfaceC35951a;
            this.f32605y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.b1, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21133b1 invoke() {
            ComponentCallbacks componentCallbacks = this.f32603w;
            InterfaceC35951a interfaceC35951a = this.f32604x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32605y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21133b1.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10688g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f32606w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10688g(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f32606w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f32606w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f32606w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10689h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32607w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10689h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32607w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32607w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.view.UserJourneyFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10690i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32608w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32609x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32610y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32611z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10690i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32608w = componentCallbacks;
            this.f32609x = interfaceC35951a;
            this.f32610y = interfaceC4339a;
            this.f32611z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, eq2.d] */
        @Override // c93.InterfaceC4339a
        public final C13566d invoke() {
            return AbstractC34132o.m107857B(this.f32608w, this.f32609x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13566d.class), this.f32610y, this.f32611z);
        }
    }

    public UserJourneyFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10683b(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10684c(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10685d(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10686e(this, null, new C22777c(this, 0)));
        this.yirCoordinator = AbstractC30060g.m92087G(enumC23463i, new C10687f(this, null, null));
    }

    /* JADX INFO: renamed from: O */
    private final void m27763O(boolean isError) {
        C22775a.m65983e(m27765Q(), "Exit", null, 2, null);
        m27794t0(isError);
        AbstractC5583n.m16799z(this).m36410z();
    }

    /* JADX INFO: renamed from: P */
    private final void m27764P(String url) {
        m27772X(url);
    }

    /* JADX INFO: renamed from: Q */
    private final C22775a m27765Q() {
        return (C22775a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final C22781g m27766R() {
        return (C22781g) this.args.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final void m27767S(Object event) throws IOException {
        if ((event instanceof AbstractC31752t0 ? (AbstractC31752t0) event : null) != null) {
            AbstractC31752t0 abstractC31752t0 = (AbstractC31752t0) event;
            if (AbstractC22676k.m65745e(abstractC31752t0, AbstractC31752t0.e.f131487a)) {
                m27792r0();
                return;
            }
            if (abstractC31752t0 instanceof AbstractC31752t0.f) {
                AbstractC31752t0.f fVar = (AbstractC31752t0.f) event;
                String strM98551b = fVar.getMessage();
                Context contextRequireContext = requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                m27795u0(strM98551b, contextRequireContext, fVar.getImageBmp());
                return;
            }
            if (AbstractC22676k.m65745e(abstractC31752t0, AbstractC31752t0.b.f131482a)) {
                m27790p0(new AbstractC13565c.b(m27766R().m65992a()));
                return;
            }
            if (AbstractC22676k.m65745e(abstractC31752t0, AbstractC31752t0.a.f131481a)) {
                m27790p0(new AbstractC13565c.a(m27766R().m65992a()));
                return;
            }
            if (abstractC31752t0 instanceof AbstractC31752t0.d) {
                AbstractC31752t0.d dVar = (AbstractC31752t0.d) event;
                C22775a.m65982b(m27765Q(), dVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), "Tap", null, 4, null);
                m27765Q().m65986a(dVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), "Answer", Boolean.valueOf(dVar.getIsCorrect()));
            } else if (abstractC31752t0 instanceof AbstractC31752t0.c) {
                getNavigator().mo59392a(((AbstractC31752t0.c) event).getNavigationAction());
            } else {
                if (!(abstractC31752t0 instanceof AbstractC31752t0.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                m27771W((AbstractC31752t0.g) event);
            }
        }
    }

    /* JADX INFO: renamed from: T */
    private final C13566d m27768T() {
        return (C13566d) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final C21133b1 m27769U() {
        return (C21133b1) this.yirCoordinator.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final void m27770V(C25889b coordinator, C13567e viewState, EnumC38591t direction, InterfaceC4339a onComplete) {
        C13564b c13564bM38310a = viewState.getReadyState();
        InterfaceC24703d interfaceC24703dM38290a = c13564bM38310a != null ? c13564bM38310a.m38290a() : null;
        coordinator.m76550h(direction, interfaceC24703dM38290a != null ? interfaceC24703dM38290a.getAnimatableComponentCount() : 0, onComplete);
    }

    /* JADX INFO: renamed from: W */
    private final void m27771W(AbstractC31752t0.g event) {
        if (AbstractC39414r.m125890i0(event.getText())) {
            return;
        }
        m27790p0(new AbstractC13565c.f(m27766R().m65992a(), event.getText()));
        m27790p0(new AbstractC13565c.b(m27766R().m65992a()));
    }

    /* JADX INFO: renamed from: X */
    private final void m27772X(String url) {
        C28216y externalLinkNavigator = getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        C28216y.m85414y(externalLinkNavigator, abstractActivityC1340r0RequireActivity, url, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C34911a m27773Y(UserJourneyFragment userJourneyFragment) {
        return AbstractC15751g.m44431K(userJourneyFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m27774Z(UserJourneyFragment userJourneyFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(userJourneyFragment.m27768T().getViewState(), new C13567e(false, false, null, 7, null), null, c28655q, 0, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C25889b(null, null, 3, null);
                c28655q.m87172p0(objM87133R);
            }
            C25889b c25889b = (C25889b) objM87133R;
            boolean zM87157i = c28655q.m87157i(userJourneyFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C22779e(userJourneyFragment, interfaceC28601c1M87260n, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87257k((InterfaceC4339a) objM87133R2, c28655q);
            boolean zM87157i2 = c28655q.m87157i(userJourneyFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C22779e(userJourneyFragment, interfaceC28601c1M87260n, 1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC25890c.m76553c().mo86977a(c25889b), AbstractC38559e0.m123627f().mo86977a(Integer.valueOf(userJourneyFragment.m27766R().m65992a()))}, AbstractC37817c.m121344e(623872889, c28655q, new C21859k(interfaceC28601c1M87260n, userJourneyFragment, c25889b, 2)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private static final C13567e m27775a0(InterfaceC28670t2 interfaceC28670t2) {
        return (C13567e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m27776b0(UserJourneyFragment userJourneyFragment, InterfaceC28670t2 interfaceC28670t2) {
        userJourneyFragment.m27793s0(m27775a0(interfaceC28670t2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m27777c0(UserJourneyFragment userJourneyFragment, InterfaceC28670t2 interfaceC28670t2) {
        userJourneyFragment.m27763O(m27775a0(interfaceC28670t2).getIsError());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m27778d0(final InterfaceC28670t2 interfaceC28670t2, final UserJourneyFragment userJourneyFragment, final C25889b c25889b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C13567e c13567eM27775a0 = m27775a0(interfaceC28670t2);
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | c28655q.m87157i(userJourneyFragment) | c28655q.m87157i(c25889b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                final int i14 = 0;
                objM87133R = new InterfaceC4339a(userJourneyFragment) { // from class: kq2.f

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ UserJourneyFragment f89701x;

                    {
                        this.f89701x = userJourneyFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return UserJourneyFragment.m27779e0(this.f89701x, c25889b, interfaceC28670t2);
                            case 1:
                                return UserJourneyFragment.m27781g0(this.f89701x, c25889b, interfaceC28670t2);
                            default:
                                return UserJourneyFragment.m27783i0(this.f89701x, c25889b, interfaceC28670t2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i = c28655q.m87157i(userJourneyFragment) | c28655q.m87157i(c25889b) | c28655q.m87153g(interfaceC28670t2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i15 = 1;
                objM87133R2 = new InterfaceC4339a(userJourneyFragment) { // from class: kq2.f

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ UserJourneyFragment f89701x;

                    {
                        this.f89701x = userJourneyFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return UserJourneyFragment.m27779e0(this.f89701x, c25889b, interfaceC28670t2);
                            case 1:
                                return UserJourneyFragment.m27781g0(this.f89701x, c25889b, interfaceC28670t2);
                            default:
                                return UserJourneyFragment.m27783i0(this.f89701x, c25889b, interfaceC28670t2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(userJourneyFragment) | c28655q.m87157i(c25889b) | c28655q.m87153g(interfaceC28670t2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                final int i16 = 2;
                objM87133R3 = new InterfaceC4339a(userJourneyFragment) { // from class: kq2.f

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ UserJourneyFragment f89701x;

                    {
                        this.f89701x = userJourneyFragment;
                    }

                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return UserJourneyFragment.m27779e0(this.f89701x, c25889b, interfaceC28670t2);
                            case 1:
                                return UserJourneyFragment.m27781g0(this.f89701x, c25889b, interfaceC28670t2);
                            default:
                                return UserJourneyFragment.m27783i0(this.f89701x, c25889b, interfaceC28670t2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(userJourneyFragment) | c28655q.m87153g(interfaceC28670t2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C22779e(userJourneyFragment, interfaceC28670t2, 2);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(userJourneyFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C22777c(userJourneyFragment, 5);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
            boolean zM87157i5 = c28655q.m87157i(userJourneyFragment);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i5 || objM87133R6 == c28676v0) {
                objM87133R6 = new C22777c(userJourneyFragment, 1);
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R6;
            boolean zM87157i6 = c28655q.m87157i(userJourneyFragment);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i6 || objM87133R7 == c28676v0) {
                final int i17 = 0;
                objM87133R7 = new Function1(userJourneyFragment) { // from class: kq2.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ UserJourneyFragment f89696x;

                    {
                        this.f89696x = userJourneyFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                return UserJourneyFragment.m27788n0(this.f89696x, (String) obj);
                            default:
                                return UserJourneyFragment.m27789o0(this.f89696x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function1 = (Function1) objM87133R7;
            boolean zM87157i7 = c28655q.m87157i(userJourneyFragment);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i7 || objM87133R8 == c28676v0) {
                final int i18 = 1;
                objM87133R8 = new Function1(userJourneyFragment) { // from class: kq2.d

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ UserJourneyFragment f89696x;

                    {
                        this.f89696x = userJourneyFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                return UserJourneyFragment.m27788n0(this.f89696x, (String) obj);
                            default:
                                return UserJourneyFragment.m27789o0(this.f89696x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC24686r.m72229m0(c13567eM27775a0, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, interfaceC4339a4, interfaceC4339a5, interfaceC4339a6, function1, (Function1) objM87133R8, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m27779e0(UserJourneyFragment userJourneyFragment, C25889b c25889b, InterfaceC28670t2 interfaceC28670t2) {
        C13564b c13564bM38310a = m27775a0(interfaceC28670t2).getReadyState();
        if (c13564bM38310a == null || !c13564bM38310a.m38297h()) {
            userJourneyFragment.m27770V(c25889b, m27775a0(interfaceC28670t2), EnumC38591t.FORWARD, new C22777c(userJourneyFragment, 2));
        } else {
            userJourneyFragment.m27763O(m27775a0(interfaceC28670t2).getIsError());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m27780f0(UserJourneyFragment userJourneyFragment) {
        userJourneyFragment.m27790p0(new AbstractC13565c.b(userJourneyFragment.m27766R().m65992a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m27781g0(UserJourneyFragment userJourneyFragment, C25889b c25889b, InterfaceC28670t2 interfaceC28670t2) {
        userJourneyFragment.m27770V(c25889b, m27775a0(interfaceC28670t2), EnumC38591t.BACKWARD, new C22777c(userJourneyFragment, 3));
        return C23454a0.f92919a;
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m27782h0(UserJourneyFragment userJourneyFragment) {
        userJourneyFragment.m27790p0(new AbstractC13565c.a(userJourneyFragment.m27766R().m65992a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m27783i0(UserJourneyFragment userJourneyFragment, C25889b c25889b, InterfaceC28670t2 interfaceC28670t2) {
        userJourneyFragment.m27770V(c25889b, m27775a0(interfaceC28670t2), EnumC38591t.FORWARD, new C22777c(userJourneyFragment, 4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m27784j0(UserJourneyFragment userJourneyFragment) {
        userJourneyFragment.m27790p0(new AbstractC13565c.b(userJourneyFragment.m27766R().m65992a()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m27785k0(UserJourneyFragment userJourneyFragment, InterfaceC28670t2 interfaceC28670t2) {
        userJourneyFragment.m27763O(m27775a0(interfaceC28670t2).getIsError());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m27786l0(UserJourneyFragment userJourneyFragment) {
        userJourneyFragment.m27791q0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m27787m0(UserJourneyFragment userJourneyFragment) {
        userJourneyFragment.m27792r0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m27788n0(UserJourneyFragment userJourneyFragment, String it) {
        AbstractC22676k.m65750j(it, "it");
        userJourneyFragment.m27764P(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m27789o0(UserJourneyFragment userJourneyFragment, Object it) throws IOException {
        AbstractC22676k.m65750j(it, "it");
        userJourneyFragment.m27767S(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p0 */
    private final void m27790p0(AbstractC13565c viewEvent) {
        m27768T().m38309o(viewEvent);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m27791q0() {
        m27768T().m38309o(AbstractC13565c.d.f47872a);
        m27768T().m38309o(new AbstractC13565c.e(m27766R().m65992a()));
    }

    /* JADX INFO: renamed from: r0 */
    private final void m27792r0() {
        C22775a.m65983e(m27765Q(), "Restart", null, 2, null);
        m27791q0();
    }

    /* JADX INFO: renamed from: s0 */
    private final void m27793s0(C13567e viewState) {
        InterfaceC24703d interfaceC24703dM38290a;
        C13564b c13564bM38310a = viewState.getReadyState();
        String strMo5921d = (c13564bM38310a == null || (interfaceC24703dM38290a = c13564bM38310a.m38290a()) == null) ? null : interfaceC24703dM38290a.getUserJourneyStepName();
        this.currentStepAnalyticName = strMo5921d;
        if (strMo5921d != null) {
            m27765Q().m65988d("View", strMo5921d);
        }
        C13564b c13564bM38310a2 = viewState.getReadyState();
        if (c13564bM38310a2 != null && c13564bM38310a2.m38297h()) {
            C22775a.m65983e(m27765Q(), "Completed", null, 2, null);
        }
        if (viewState.getIsError()) {
            C22775a.m65983e(m27765Q(), "Error", null, 2, null);
        }
    }

    /* JADX INFO: renamed from: t0 */
    private final void m27794t0(boolean isError) {
        if (m27766R().m65992a() == -1 || isError) {
            return;
        }
        m27769U().m58970c(true);
    }

    /* JADX INFO: renamed from: u0 */
    private final void m27795u0(String message, Context context, Bitmap imageBmp) throws IOException {
        Object next;
        if (imageBmp != null) {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), context.getString(AbstractC39706c.f170928u));
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            imageBmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", message);
            intent.putExtra("android.intent.extra.STREAM", uriForFile);
            intent.setType("image/*");
            Intent intentCreateChooser = Intent.createChooser(intent, context.getString(AbstractC39706c.f170907E));
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intentCreateChooser, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
            AbstractC22676k.m65749i(listQueryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it = listQueryIntentActivities.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((ResolveInfo) next).activityInfo.packageName, "android"));
            ResolveInfo resolveInfo = (ResolveInfo) next;
            if (resolveInfo != null) {
                context.grantUriPermission(resolveInfo.activityInfo.packageName, uriForFile, 3);
                intentCreateChooser.setClipData(new ClipData(ClipData.newRawUri("", uriForFile)));
            }
            AbstractC32122c.startActivity(context, intentCreateChooser, null);
        }
        C22775a.m65983e(m27765Q(), "Invoked Share", null, 2, null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        Boolean bool = (Boolean) m27768T().getHasInitialLoadBeenSent().getValue();
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        m27768T().m38309o(new AbstractC13565c.c(m27766R().m65992a()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        m27765Q().m65987c(m27766R().m65992a());
        C22775a.m65983e(m27765Q(), "Enter", null, 2, null);
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 2), true, 935262265));
    }
}
