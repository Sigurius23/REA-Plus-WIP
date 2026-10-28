package com.whoop.settings.strap;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.viewpager2.widget.ViewPager2;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c33.C3936c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cn2.C4852a;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.google.android.material.tabs.TabLayout;
import com.squareup.wire.AbstractC5583n;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.AbstractC10531a;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.settings.strap.StrapSettingsFragment;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import hi0.AbstractC17305c;
import hi0.AbstractC17306d;
import hi0.AbstractC17312j;
import hj0.AbstractC17354m;
import hj0.AbstractC17357p;
import ii0.AbstractC18565u;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m12.AbstractC24936d;
import m32.EnumC25009e;
import m32.InterfaceC25007c;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import or2.AbstractC28163g0;
import p027b3.C2384h2;
import p098dt.AbstractC12350b;
import p114eb.AbstractC12939a0;
import p114eb.C12966j0;
import p114eb.C12969k0;
import p114eb.C12972l0;
import p114eb.C12977n0;
import p114eb.C12985r0;
import p114eb.C12992v;
import p114eb.InterfaceC12981p0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p236j.InterfaceC21063b;
import p377or.C28134h;
import p390p1.C28635l;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.AbstractC32376o;
import sc2.C32366e;
import sc2.C32370i;
import sc2.C32371j;
import sc2.C32372k;
import sc2.C32373l;
import sc2.C32375n;
import sc2.C32377p;
import sc2.C32380s;
import sc2.C32383v;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import xb3.AbstractC38176k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001MB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J)\u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003R\u001a\u00101\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\"\u0010=\u001a\u0010\u0012\f\u0012\n :*\u0004\u0018\u00010909088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R+\u0010F\u001a\u00020>2\u0006\u0010?\u001a\u00020>8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010J¨\u0006N"}, m65681d2 = {"Lcom/whoop/settings/strap/StrapSettingsFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "Leb/p0;", "o0", "()Leb/p0;", "A0", "E0", "a0", "i0", "p0", "G0", "", "strapDisconnected", "Lsc2/e;", "lastSyncViewState", "", "strapName", "I0", "(ZLsc2/e;Ljava/lang/String;)V", "y0", "", "cloudIcon", "m0", "(I)V", "x0", "n0", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lsc2/s;", "x", "Ll83/h;", "h0", "()Lsc2/s;", "viewModel", "Lj/d;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "y", "Lj/d;", "editDeviceNameActivityLauncher", "Lii0/u;", "<set-?>", "z", "Lcom/whoop/ui/b;", "f0", "()Lii0/u;", "z0", "(Lii0/u;)V", "binding", "Lm32/c;", "E", "g0", "()Lm32/c;", "bluetoothPermissionHelper", "F", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StrapSettingsFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h bluetoothPermissionHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "StrapSettingsFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final AbstractC21065d editDeviceNameActivityLauncher;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10462b binding;

    /* JADX INFO: renamed from: G */
    static final /* synthetic */ InterfaceC21493z[] f30716G = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(StrapSettingsFragment.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentStrapSettingsLandingBinding;", 0))};

    /* JADX INFO: renamed from: F */
    private static final C10156a f30715F = new C10156a(null);

    /* JADX INFO: renamed from: H */
    public static final int f30717H = 8;

    /* JADX INFO: renamed from: com.whoop.settings.strap.StrapSettingsFragment$a */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/settings/strap/StrapSettingsFragment$a;", "", "<init>", "()V", "", "TAB_SPACING_DP", "I", "", "HIDE_BOTTOM_NAVIGATION_DELAY_MILLIS", "J", "", "FEATURE_CHARGE_EDUCATION", "Ljava/lang/String;", "STRAP_SETTINGS", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10156a {
        public /* synthetic */ C10156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10156a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.StrapSettingsFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsFragment$requestBluetoothPermissions$1", m100430f = "StrapSettingsFragment.kt", m100431l = {264}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10157b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f30723w;

        /* JADX INFO: renamed from: x */
        int f30724x;

        public C10157b(InterfaceC30057d<? super C10157b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StrapSettingsFragment.this.new C10157b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10157b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32380s c32380s;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30724x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C32380s c32380sM25777h0 = StrapSettingsFragment.this.m25777h0();
                InterfaceC25007c interfaceC25007cM25776g0 = StrapSettingsFragment.this.m25776g0();
                this.f30723w = c32380sM25777h0;
                this.f30724x = 1;
                Object objM73347s = InterfaceC25007c.m73347s(interfaceC25007cM25776g0, false, this, 1, null);
                if (objM73347s == enumC31071a) {
                    return enumC31071a;
                }
                c32380s = c32380sM25777h0;
                obj = objM73347s;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c32380s = (C32380s) this.f30723w;
                AbstractC34132o.m107864I(obj);
            }
            c32380s.m100895c1((EnumC25009e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.StrapSettingsFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10158c implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f30726w;

        public C10158c(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f30726w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f30726w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30726w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.StrapSettingsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10159d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30727w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30728x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30729y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10159d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30727w = componentCallbacks;
            this.f30728x = interfaceC35951a;
            this.f30729y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f30727w;
            InterfaceC35951a interfaceC35951a = this.f30728x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30729y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.StrapSettingsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10160e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f30730w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10160e(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f30730w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f30730w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f30730w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.strap.StrapSettingsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10161f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f30731w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30732x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30733y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30734z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10161f(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30731w = abstractComponentCallbacksC1320m0;
            this.f30732x = interfaceC35951a;
            this.f30733y = interfaceC4339a;
            this.f30734z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, sc2.s] */
        @Override // c93.InterfaceC4339a
        public final C32380s invoke() {
            return AbstractC37056f.m118952D(this.f30731w, this.f30732x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32380s.class), this.f30733y, this.f30734z);
        }
    }

    public StrapSettingsFragment() {
        C32372k c32372k = new C32372k(this, 4);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10161f(this, null, new C10160e(this), c32372k));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new InterfaceC21063b() { // from class: sc2.m
            @Override // p236j.InterfaceC21063b
            /* JADX INFO: renamed from: a */
            public final void mo364a(Object obj) {
                StrapSettingsFragment.m25774e0(this.f133990w, (C21062a) obj);
            }
        });
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.editDeviceNameActivityLauncher = abstractC21065dRegisterForActivityResult;
        this.binding = AbstractC10463c.m26725b(this, new C32375n(0));
        this.bluetoothPermissionHelper = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10159d(this, null, new C32372k(this, 5)));
    }

    /* JADX INFO: renamed from: A0 */
    private final void m25738A0() {
        ComposeView composeView = m25775f0().f72514b;
        composeView.setViewCompositionStrategy(C2384h2.f9434x);
        composeView.setContent(new C37816b(new C32370i(this, 0), true, 1938041443));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m25739B0(StrapSettingsFragment strapSettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-902570872, c28655q, new C32370i(strapSettingsFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m25740C0(StrapSettingsFragment strapSettingsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(strapSettingsFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C32373l(strapSettingsFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC24936d.m73080z("OVERLAY_DEVICE_SETTINGS_CHARGE_EDUCATION", null, false, (Function1) objM87133R, null, null, null, c28655q, 0, 118);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m25741D0(StrapSettingsFragment strapSettingsFragment, boolean z4) {
        if (z4) {
            strapSettingsFragment.m25775f0().f72524l.setGlowingIconEffect(true);
        } else {
            strapSettingsFragment.m25775f0().f72524l.setGlowingIconEffect(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E0 */
    private final void m25743E0() {
        m25775f0().f72524l.setBackArrowResource(AbstractC16272a.f62031Y);
        m25775f0().f72524l.setOptionItemImageDrawable(AbstractC17306d.f66533d);
        m25775f0().f72524l.m26689r(new C32372k(this, 6));
        m25775f0().f72524l.m26686l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m25745F0(StrapSettingsFragment strapSettingsFragment) {
        AbstractC5583n.m16799z(strapSettingsFragment).m36407v(strapSettingsFragment.m25795o0());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m25747G0() {
        m25775f0().f72517e.setAdapter(new C32377p(this));
        new C3936c(m25775f0().f72518f, m25775f0().f72517e, new C32371j(this)).m11985b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final void m25749H0(StrapSettingsFragment strapSettingsFragment, C28134h tab, int i13) {
        AbstractC22676k.m65750j(tab, "tab");
        if (i13 == 0) {
            tab.f113782g.setPadding(0, 0, 0, 0);
            int i14 = AbstractC17312j.f67001l1;
            TabLayout tabLayout = tab.f113781f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tab.m85123a(tabLayout.getResources().getText(i14));
            return;
        }
        if (i13 != 1) {
            return;
        }
        C4852a c4852a = C4852a.f20172a;
        Context contextRequireContext = strapSettingsFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        int iM15491b = c4852a.m15491b(32, contextRequireContext);
        tab.f113782g.setPadding(iM15491b, 0, iM15491b, 0);
        int i15 = AbstractC17312j.f66998k1;
        TabLayout tabLayout2 = tab.f113781f;
        if (tabLayout2 == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tab.m85123a(tabLayout2.getResources().getText(i15));
    }

    /* JADX INFO: renamed from: I0 */
    private final void m25751I0(boolean strapDisconnected, C32366e lastSyncViewState, String strapName) {
        m25775f0().f72520h.setText(getString(lastSyncViewState.getLastSyncText()));
        m25775f0().f72520h.setTextColor(AbstractC17357p.m49142b(this, lastSyncViewState.getTextViewColor()));
        m25775f0().f72522j.setText((CharSequence) lastSyncViewState.getLastSyncTimeStampPair().f92937w);
        m25775f0().f72522j.setTextColor(AbstractC17357p.m49142b(this, lastSyncViewState.getTextViewColor()));
        m25782m0(lastSyncViewState.getCloudIcon());
        if (!strapDisconnected) {
            m25775f0().f72516d.setText(getString(AbstractC17312j.f66989h1));
            m25775f0().f72516d.setTextColor(AbstractC17357p.m49142b(this, AbstractC17305c.f66527h));
            TextView textView = m25775f0().f72515c;
            if (strapName == null) {
                strapName = "";
            }
            textView.setText(strapName);
            return;
        }
        m25775f0().f72516d.setText(getString(AbstractC17312j.f66995j1));
        m25775f0().f72516d.setTextColor(AbstractC17357p.m49142b(this, AbstractC17305c.f66528i));
        TextView textView2 = m25775f0().f72515c;
        if (strapName == null) {
            strapName = getString(AbstractC17312j.f67027u0);
            AbstractC22676k.m65749i(strapName, "getString(...)");
        }
        textView2.setText(strapName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C34911a m25753J0(StrapSettingsFragment strapSettingsFragment) {
        return AbstractC15751g.m44431K(strapSettingsFragment.requireContext());
    }

    /* JADX INFO: renamed from: a0 */
    private final void m25770a0() {
        C32371j c32371j = new C32371j(this);
        View root = m25775f0().getRoot();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c32371j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C16905q1 m25771b0(StrapSettingsFragment strapSettingsFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        WhoopNewToolbar toolBar = strapSettingsFragment.m25775f0().f72524l;
        AbstractC22676k.m65749i(toolBar, "toolBar");
        ViewGroup.LayoutParams layoutParams = toolBar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = c35643bMo47530g.f151450b;
        toolBar.setLayoutParams(marginLayoutParams);
        ViewPager2 strapSettingsContent = strapSettingsFragment.m25775f0().f72517e;
        AbstractC22676k.m65749i(strapSettingsContent, "strapSettingsContent");
        ViewGroup.LayoutParams layoutParams2 = strapSettingsContent.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = c35643bMo47530g.f151452d;
        strapSettingsContent.setLayoutParams(marginLayoutParams2);
        return C16905q1.f64863b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m25772c0(AbstractC18565u it) {
        AbstractC22676k.m65750j(it, "it");
        it.f72517e.setAdapter(null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C34911a m25773d0(StrapSettingsFragment strapSettingsFragment) {
        return AbstractC15751g.m44431K(strapSettingsFragment.requireActivity().getActivityResultRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m25774e0(StrapSettingsFragment strapSettingsFragment, C21062a it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.f79915w == -1) {
            C32380s c32380sM25777h0 = strapSettingsFragment.m25777h0();
            Intent intent = it.f79916x;
            c32380sM25777h0.m100897e1(intent != null ? intent.getStringExtra("deviceNameExtra") : null);
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final AbstractC18565u m25775f0() {
        return (AbstractC18565u) this.binding.getValue(this, f30716G[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC25007c m25776g0() {
        return (InterfaceC25007c) this.bluetoothPermissionHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public final C32380s m25777h0() {
        return (C32380s) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final void m25778i0() {
        m25775f0().f72524l.m26687n(new C32375n(1));
        TextView strapSettingsConnectedDeviceName = m25775f0().f72515c;
        AbstractC22676k.m65749i(strapSettingsConnectedDeviceName, "strapSettingsConnectedDeviceName");
        AbstractC1953c.m5963a(strapSettingsConnectedDeviceName, new C32373l(this, 3));
        ImageView strapSettingsEditIcon = m25775f0().f72519g;
        AbstractC22676k.m65749i(strapSettingsEditIcon, "strapSettingsEditIcon");
        AbstractC1953c.m5963a(strapSettingsEditIcon, new C32373l(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m25779j0(View it) {
        Intent intent;
        AbstractC22676k.m65750j(it, "it");
        AbstractC12939a0 abstractC12939a0M34598s = AbstractC12350b.m34598s(it);
        Activity activity = abstractC12939a0M34598s.f44681b;
        if (abstractC12939a0M34598s.m36395j() == 1) {
            Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
            if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
                C12977n0 c12977n0M36394i = abstractC12939a0M34598s.m36394i();
                AbstractC22676k.m65747g(c12977n0M36394i);
                int i13 = c12977n0M36394i.f44819H;
                for (C12985r0 c12985r0 = c12977n0M36394i.f44823x; c12985r0 != null; c12985r0 = c12985r0.f44823x) {
                    if (c12985r0.f44856M != i13) {
                        Bundle bundle = new Bundle();
                        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                            C12985r0 c12985r0M36399n = abstractC12939a0M34598s.m36399n(abstractC12939a0M34598s.f44686g);
                            Intent intent2 = activity.getIntent();
                            AbstractC22676k.m65749i(intent2, "activity!!.intent");
                            C12972l0 c12972l0M36487t = c12985r0M36399n.m36487t(new C12969k0(intent2), true, c12985r0M36399n);
                            if ((c12972l0M36487t != null ? c12972l0M36487t.f44805x : null) != null) {
                                bundle.putAll(c12972l0M36487t.f44804w.m36464c(c12972l0M36487t.f44805x));
                            }
                        }
                        C12966j0 c12966j0 = new C12966j0(abstractC12939a0M34598s);
                        C12966j0.m36442f(c12966j0, c12985r0.f44819H);
                        c12966j0.m36447e(bundle);
                        c12966j0.m36445c().startActivities();
                        if (activity == null) {
                            break;
                        }
                        activity.finish();
                        break;
                    }
                    i13 = c12985r0.f44819H;
                }
            } else if (abstractC12939a0M34598s.f44685f) {
                AbstractC22676k.m65747g(activity);
                Intent intent3 = activity.getIntent();
                Bundle extras2 = intent3.getExtras();
                AbstractC22676k.m65747g(extras2);
                int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
                AbstractC22676k.m65747g(intArray);
                ArrayList arrayListM74053Y0 = AbstractC25260n.m74053Y0(intArray);
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                int iIntValue = ((Number) AbstractC25265s.m74134l1(arrayListM74053Y0)).intValue();
                if (parcelableArrayList != null) {
                }
                if (!arrayListM74053Y0.isEmpty()) {
                    int i14 = 0;
                    C12977n0 c12977n0M36373f = AbstractC12939a0.m36373f(iIntValue, abstractC12939a0M34598s.m36396k(), null, false);
                    if (c12977n0M36373f instanceof C12985r0) {
                        int i15 = C12985r0.f44854P;
                        iIntValue = ((C12977n0) AbstractC38176k.m122290z(AbstractC38176k.m122288x((C12985r0) c12977n0M36373f, C12992v.f44876F))).f44819H;
                    }
                    C12977n0 c12977n0M36394i2 = abstractC12939a0M34598s.m36394i();
                    if (c12977n0M36394i2 != null && iIntValue == c12977n0M36394i2.f44819H) {
                        C12966j0 c12966j1 = new C12966j0(abstractC12939a0M34598s);
                        Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k("android-support-nav:controller:deepLinkIntent", intent3));
                        Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                        if (bundle2 != null) {
                            bundleM36273g.putAll(bundle2);
                        }
                        c12966j1.m36447e(bundleM36273g);
                        for (Object obj : arrayListM74053Y0) {
                            int i16 = i14 + 1;
                            if (i14 < 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            c12966j1.m36443a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i14) : null);
                            i14 = i16;
                        }
                        c12966j1.m36445c().startActivities();
                        activity.finish();
                    }
                }
            }
        } else {
            abstractC12939a0M34598s.m36410z();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m25780k0(StrapSettingsFragment strapSettingsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        strapSettingsFragment.m25777h0().m100896d1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m25781l0(StrapSettingsFragment strapSettingsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        strapSettingsFragment.m25777h0().m100896d1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m25782m0(int cloudIcon) {
        ComponentCallbacks2C4960b.m15529e(requireContext()).m15548l(Integer.valueOf(cloudIcon)).m15537y(m25775f0().f72521i);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m25783n0() {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", requireActivity().getPackageName(), null));
        AbstractC22676k.m65749i(data, "setData(...)");
        startActivity(data);
    }

    /* JADX INFO: renamed from: p0 */
    private final void m25784p0() {
        observe(m25777h0().getRequestBluetoothPermissionsAndroid12AndAbove(), new C32372k(this, 0));
        observe(m25777h0().getNavigateToAppInfoAction(), new C32372k(this, 1));
        observe(m25777h0().getViewStateLiveData(), new C10158c(new C32373l(this, 0)));
        observe(m25777h0().getGoToEditDeviceNameLiveData(), new C32372k(this, 2));
        observe(m25777h0().getGoToPairStrapBle(), new C32372k(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m25785q0(StrapSettingsFragment strapSettingsFragment) {
        strapSettingsFragment.m25792x0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m25786r0(StrapSettingsFragment strapSettingsFragment) {
        strapSettingsFragment.m25783n0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m25787s0(StrapSettingsFragment strapSettingsFragment, C32383v it) {
        AbstractC22676k.m65750j(it, "it");
        strapSettingsFragment.m25775f0().f72513a.getRoot().setVisibility(it.getBluetoothVisibility());
        strapSettingsFragment.m25775f0().f72523k.setVisibility(it.getStrapSettingsView());
        strapSettingsFragment.m25751I0(it.getStrapDisconnected(), it.getLastSyncViewState(), it.getConnectedDeviceName());
        ImageView strapSettingsEditIcon = strapSettingsFragment.m25775f0().f72519g;
        AbstractC22676k.m65749i(strapSettingsEditIcon, "strapSettingsEditIcon");
        strapSettingsEditIcon.setVisibility(it.getShowEditStrapNameIcon() ? 0 : 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m25788t0(StrapSettingsFragment strapSettingsFragment) {
        strapSettingsFragment.editDeviceNameActivityLauncher.mo4052a(new Intent(strapSettingsFragment.requireContext(), (Class<?>) EditDeviceNameActivity.class), null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m25789u0(StrapSettingsFragment strapSettingsFragment) {
        Context contextRequireContext = strapSettingsFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        AbstractC10531a.m27136a(contextRequireContext).m93405s().m49147d().m49154m();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m25790v0(StrapSettingsFragment strapSettingsFragment) {
        strapSettingsFragment.getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m25791w0(StrapSettingsFragment strapSettingsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        strapSettingsFragment.m25793y0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x0 */
    private final void m25792x0() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10157b(null), 3);
    }

    /* JADX INFO: renamed from: y0 */
    private final void m25793y0() {
        startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
    }

    /* JADX INFO: renamed from: z0 */
    private final void m25794z0(AbstractC18565u abstractC18565u) {
        this.binding.setValue(this, f30716G[0], abstractC18565u);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final InterfaceC12981p0 m25795o0() {
        InterfaceC12981p0 interfaceC12981p0M100814a = AbstractC32376o.m100814a();
        AbstractC22676k.m65749i(interfaceC12981p0M100814a, "actionStrapSettingsToEducation(...)");
        interfaceC12981p0M100814a.getArguments().putString("path", "CHARGE_EDUCATION");
        interfaceC12981p0M100814a.getArguments().putString("screenName", "Charging Education");
        interfaceC12981p0M100814a.getArguments().putString("entryPoint", "strapSettings");
        return interfaceC12981p0M100814a;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18565u abstractC18565uM53777c = AbstractC18565u.m53777c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC18565uM53777c, "inflate(...)");
        m25794z0(abstractC18565uM53777c);
        getLifecycle().mo4986a(m25776g0());
        View root = m25775f0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: sc2.h
            @Override // java.lang.Runnable
            public final void run() {
                StrapSettingsFragment.m25790v0(this.f133982w);
            }
        }, 100L);
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        C32380s.m100874i1(m25777h0(), null, 1, null);
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StrokedPillButton enableBluetoothButtonNew = m25775f0().f72513a.f72261b;
        AbstractC22676k.m65749i(enableBluetoothButtonNew, "enableBluetoothButtonNew");
        AbstractC1953c.m5963a(enableBluetoothButtonNew, new C32373l(this, 2));
        m25747G0();
        m25743E0();
        m25770a0();
        m25778i0();
        m25784p0();
        if (m25777h0().m100894E0()) {
            m25738A0();
        }
    }
}
