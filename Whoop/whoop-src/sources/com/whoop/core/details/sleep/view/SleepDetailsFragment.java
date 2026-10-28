package com.whoop.core.details.sleep.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bw0.AbstractC3680c;
import bw0.C3681d;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.core.details.sleep.view.SleepDetailsFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kw0.AbstractC22848a;
import kw0.C22849b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mw0.AbstractC25979g;
import mw0.AbstractC25981i;
import mw0.C25975c;
import mw0.C25980h;
import mw1.C25985a;
import no0.C26944e0;
import nw0.AbstractC27208o;
import or2.AbstractC28163g0;
import or2.C28205u0;
import p114eb.AbstractC12939a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001d\u00100\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b/\u0010\u001bR\u001b\u00103\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010!R\u001d\u00106\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010\u001bR\u001d\u00109\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010\u001bR\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010%\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010%\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010%\u001a\u0004\bK\u0010L¨\u0006N²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/core/details/sleep/view/SleepDetailsFragment;", "Lhj0/m;", "<init>", "()V", "Lmw0/i;", "viewState", "Ll83/a0;", "f0", "(Lmw0/i;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lmw0/h;", "y", "Ll83/h;", "W", "()Lmw0/h;", "viewModel", "Lmw0/c;", "z", "P", "()Lmw0/c;", "dialogViewModel", "E", "T", "sleepIdV2", "F", "R", "newHome", "G", "U", "source", "H", "V", "sourceId", "Lj02/o0;", "I", "getNavigator", "()Lj02/o0;", "navigator", "Lzr2/a;", "J", "O", "()Lzr2/a;", "dateAndTimeProvider", "Lbw0/d;", "K", "S", "()Lbw0/d;", "sleepDetailsAnalyticsHelper", "Lor2/u0;", "L", "Q", "()Lor2/u0;", "localizedDateTimeFormatter", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SleepDetailsFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h sleepIdV2;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h newHome;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h sourceId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h sleepDetailsAnalyticsHelper;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "SleepDetailsFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h dialogViewModel;

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6452a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25298w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25299x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25300y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6452a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25298w = componentCallbacks;
            this.f25299x = interfaceC35951a;
            this.f25300y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25298w;
            InterfaceC35951a interfaceC35951a = this.f25299x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25300y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6453b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25301w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25302x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25303y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6453b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25301w = componentCallbacks;
            this.f25302x = interfaceC35951a;
            this.f25303y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f25301w;
            InterfaceC35951a interfaceC35951a = this.f25302x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25303y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6454c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25304w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25305x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25306y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6454c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25304w = componentCallbacks;
            this.f25305x = interfaceC35951a;
            this.f25306y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bw0.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C3681d invoke() {
            ComponentCallbacks componentCallbacks = this.f25304w;
            InterfaceC35951a interfaceC35951a = this.f25305x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25306y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3681d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6455d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25307w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25308x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25309y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6455d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25307w = componentCallbacks;
            this.f25308x = interfaceC35951a;
            this.f25309y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25307w;
            InterfaceC35951a interfaceC35951a = this.f25308x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25309y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6456e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25310w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6456e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25310w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25310w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6457f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25311w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25312x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25313y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25314z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6457f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25311w = componentCallbacks;
            this.f25312x = interfaceC35951a;
            this.f25313y = interfaceC4339a;
            this.f25314z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mw0.h] */
        @Override // c93.InterfaceC4339a
        public final C25980h invoke() {
            return AbstractC34132o.m107857B(this.f25311w, this.f25312x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25980h.class), this.f25313y, this.f25314z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$g */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6458g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25315w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6458g(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25315w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25315w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.core.details.sleep.view.SleepDetailsFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6459h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25316w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25317x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25318y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25319z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6459h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25316w = componentCallbacks;
            this.f25317x = interfaceC35951a;
            this.f25318y = interfaceC4339a;
            this.f25319z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mw0.c] */
        @Override // c93.InterfaceC4339a
        public final C25975c invoke() {
            return AbstractC34132o.m107857B(this.f25316w, this.f25317x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25975c.class), this.f25318y, this.f25319z);
        }
    }

    public SleepDetailsFragment() {
        C6456e c6456e = new C6456e(this);
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.viewModel = AbstractC30060g.m92087G(enumC23463i, new C6457f(this, null, c6456e, null));
        this.dialogViewModel = AbstractC30060g.m92087G(enumC23463i, new C6459h(this, null, new C6458g(this), null));
        final int i13 = 0;
        this.sleepIdV2 = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: nw0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepDetailsFragment f108918x;

            {
                this.f108918x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return SleepDetailsFragment.m19748g0(this.f108918x);
                    case 1:
                        return Boolean.valueOf(SleepDetailsFragment.m19741Z(this.f108918x));
                    case 2:
                        return SleepDetailsFragment.m19750i0(this.f108918x);
                    case 3:
                        return SleepDetailsFragment.m19749h0(this.f108918x);
                    case 4:
                        return SleepDetailsFragment.m19740Y(this.f108918x);
                    default:
                        return SleepDetailsFragment.m19739X(this.f108918x);
                }
            }
        });
        final int i14 = 1;
        this.newHome = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: nw0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepDetailsFragment f108918x;

            {
                this.f108918x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return SleepDetailsFragment.m19748g0(this.f108918x);
                    case 1:
                        return Boolean.valueOf(SleepDetailsFragment.m19741Z(this.f108918x));
                    case 2:
                        return SleepDetailsFragment.m19750i0(this.f108918x);
                    case 3:
                        return SleepDetailsFragment.m19749h0(this.f108918x);
                    case 4:
                        return SleepDetailsFragment.m19740Y(this.f108918x);
                    default:
                        return SleepDetailsFragment.m19739X(this.f108918x);
                }
            }
        });
        final int i15 = 2;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: nw0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepDetailsFragment f108918x;

            {
                this.f108918x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return SleepDetailsFragment.m19748g0(this.f108918x);
                    case 1:
                        return Boolean.valueOf(SleepDetailsFragment.m19741Z(this.f108918x));
                    case 2:
                        return SleepDetailsFragment.m19750i0(this.f108918x);
                    case 3:
                        return SleepDetailsFragment.m19749h0(this.f108918x);
                    case 4:
                        return SleepDetailsFragment.m19740Y(this.f108918x);
                    default:
                        return SleepDetailsFragment.m19739X(this.f108918x);
                }
            }
        });
        final int i16 = 3;
        this.sourceId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: nw0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepDetailsFragment f108918x;

            {
                this.f108918x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return SleepDetailsFragment.m19748g0(this.f108918x);
                    case 1:
                        return Boolean.valueOf(SleepDetailsFragment.m19741Z(this.f108918x));
                    case 2:
                        return SleepDetailsFragment.m19750i0(this.f108918x);
                    case 3:
                        return SleepDetailsFragment.m19749h0(this.f108918x);
                    case 4:
                        return SleepDetailsFragment.m19740Y(this.f108918x);
                    default:
                        return SleepDetailsFragment.m19739X(this.f108918x);
                }
            }
        });
        final int i17 = 4;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: nw0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepDetailsFragment f108918x;

            {
                this.f108918x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return SleepDetailsFragment.m19748g0(this.f108918x);
                    case 1:
                        return Boolean.valueOf(SleepDetailsFragment.m19741Z(this.f108918x));
                    case 2:
                        return SleepDetailsFragment.m19750i0(this.f108918x);
                    case 3:
                        return SleepDetailsFragment.m19749h0(this.f108918x);
                    case 4:
                        return SleepDetailsFragment.m19740Y(this.f108918x);
                    default:
                        return SleepDetailsFragment.m19739X(this.f108918x);
                }
            }
        };
        EnumC23463i enumC23463i2 = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i2, new C6452a(this, null, interfaceC4339a));
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i2, new C6453b(this, null, null));
        this.sleepDetailsAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i2, new C6454c(this, null, null));
        final int i18 = 5;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i2, new C6455d(this, null, new InterfaceC4339a(this) { // from class: nw0.l

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SleepDetailsFragment f108918x;

            {
                this.f108918x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return SleepDetailsFragment.m19748g0(this.f108918x);
                    case 1:
                        return Boolean.valueOf(SleepDetailsFragment.m19741Z(this.f108918x));
                    case 2:
                        return SleepDetailsFragment.m19750i0(this.f108918x);
                    case 3:
                        return SleepDetailsFragment.m19749h0(this.f108918x);
                    case 4:
                        return SleepDetailsFragment.m19740Y(this.f108918x);
                    default:
                        return SleepDetailsFragment.m19739X(this.f108918x);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    private final InterfaceC41070a m19730O() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final C25975c m19731P() {
        return (C25975c) this.dialogViewModel.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final C28205u0 m19732Q() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final boolean m19733R() {
        return ((Boolean) this.newHome.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: S */
    private final C3681d m19734S() {
        return (C3681d) this.sleepDetailsAnalyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final String m19735T() {
        return (String) this.sleepIdV2.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final String m19736U() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final String m19737V() {
        return (String) this.sourceId.getValue();
    }

    /* JADX INFO: renamed from: W */
    private final C25980h m19738W() {
        return (C25980h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C34911a m19739X(SleepDetailsFragment sleepDetailsFragment) {
        return AbstractC15751g.m44431K(sleepDetailsFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C34911a m19740Y(SleepDetailsFragment sleepDetailsFragment) {
        return AbstractC15751g.m44431K(sleepDetailsFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final boolean m19741Z(SleepDetailsFragment sleepDetailsFragment) {
        return sleepDetailsFragment.requireArguments().getBoolean("newHome");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m19742a0(final SleepDetailsFragment sleepDetailsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(sleepDetailsFragment.m19738W().getViewState(), AbstractC25981i.d.f102677a, null, c28655q, 48, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(sleepDetailsFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                InterfaceC21159o0 navigator = sleepDetailsFragment.getNavigator();
                String strM19735T = sleepDetailsFragment.m19735T();
                if (strM19735T == null) {
                    strM19735T = "";
                }
                objM87133R2 = new C22849b(abstractC12939a0, navigator, strM19735T);
                c28655q.m87172p0(objM87133R2);
            }
            C22849b c22849b = (C22849b) objM87133R2;
            AbstractC25981i abstractC25981iM19743b0 = m19743b0(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(sleepDetailsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                final int i14 = 0;
                objM87133R3 = new Function1(sleepDetailsFragment) { // from class: nw0.m

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SleepDetailsFragment f108920x;

                    {
                        this.f108920x = sleepDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return SleepDetailsFragment.m19744c0(this.f108920x, (AbstractC25979g) obj);
                            default:
                                return SleepDetailsFragment.m19746e0(this.f108920x, (AbstractC3680c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i2 = c28655q.m87157i(c22849b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C26944e0(c22849b, 4);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            InterfaceC41070a interfaceC41070aM19730O = sleepDetailsFragment.m19730O();
            C25975c c25975cM19731P = sleepDetailsFragment.m19731P();
            boolean zM87157i3 = c28655q.m87157i(sleepDetailsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i3 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(sleepDetailsFragment) { // from class: nw0.m

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ SleepDetailsFragment f108920x;

                    {
                        this.f108920x = sleepDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return SleepDetailsFragment.m19744c0(this.f108920x, (AbstractC25979g) obj);
                            default:
                                return SleepDetailsFragment.m19746e0(this.f108920x, (AbstractC3680c) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC27208o.m81899K(abstractC25981iM19743b0, function1, function2, interfaceC41070aM19730O, c25975cM19731P, (Function1) objM87133R5, sleepDetailsFragment.m19732Q(), c28655q, C28205u0.f113964d << 18, 0);
            sleepDetailsFragment.m19747f0(m19743b0(interfaceC28601c1M87260n));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private static final AbstractC25981i m19743b0(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC25981i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m19744c0(SleepDetailsFragment sleepDetailsFragment, AbstractC25979g it) {
        AbstractC22676k.m65750j(it, "it");
        sleepDetailsFragment.m19738W().m77037B(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m19745d0(C22849b c22849b, AbstractC22848a it) {
        AbstractC22676k.m65750j(it, "it");
        c22849b.m66287a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m19746e0(SleepDetailsFragment sleepDetailsFragment, AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        sleepDetailsFragment.m19734S().m11434n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f0 */
    private final void m19747f0(AbstractC25981i viewState) {
        Boolean boolValueOf;
        if (viewState instanceof AbstractC25981i.a) {
            boolValueOf = Boolean.valueOf(((AbstractC25981i.a) viewState).getIsNap());
        } else if (viewState instanceof AbstractC25981i.b) {
            boolValueOf = null;
        } else if (viewState instanceof AbstractC25981i.c) {
            boolValueOf = Boolean.valueOf(((AbstractC25981i.c) viewState).getIsNap());
        } else {
            if (!AbstractC22676k.m65745e(viewState, AbstractC25981i.d.f102677a) && !AbstractC22676k.m65745e(viewState, AbstractC25981i.e.f102678a)) {
                throw new NoWhenBranchMatchedException();
            }
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            C3681d c3681dM19734S = m19734S();
            String strM19735T = m19735T();
            if (strM19735T == null) {
                strM19735T = "";
            }
            String str = zBooleanValue ? "Nap" : "Sleep";
            boolean zM19733R = m19733R();
            String strM19736U = m19736U();
            if (strM19736U == null) {
                strM19736U = "Overview";
            }
            c3681dM19734S.m11435o(new C3681d.a(strM19735T, "Sleep", str, zM19733R, strM19736U));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final String m19748g0(SleepDetailsFragment sleepDetailsFragment) {
        Bundle arguments = sleepDetailsFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("sleepIdV2");
        }
        return null;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final String m19749h0(SleepDetailsFragment sleepDetailsFragment) {
        Bundle arguments = sleepDetailsFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("sourceId");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final String m19750i0(SleepDetailsFragment sleepDetailsFragment) {
        return sleepDetailsFragment.requireArguments().getString("source");
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 20), true, 1683428594));
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C25980h c25980hM19738W = m19738W();
        String strM19737V = m19737V();
        String strM19735T = m19735T();
        if (strM19735T == null) {
            strM19735T = "";
        }
        c25980hM19738W.m77037B(new AbstractC25979g.c(strM19737V, strM19735T));
        getActivity();
        C25975c c25975cM19731P = m19731P();
        String strM19735T2 = m19735T();
        c25975cM19731P.m77000q(strM19735T2 != null ? strM19735T2 : "");
    }
}
