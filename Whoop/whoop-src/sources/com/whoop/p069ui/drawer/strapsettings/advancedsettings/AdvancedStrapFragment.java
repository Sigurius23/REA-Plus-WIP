package com.whoop.p069ui.drawer.strapsettings.advancedsettings;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.profileinstaller.ProfileVerifier;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.AbstractC10531a;
import com.whoop.p069ui.views.AdvancedSettingsItemView;
import com.whoop.pairing.p066ui.view.PairingFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.settings.about.AbstractC10092a;
import d91.AbstractC11814b;
import fa2.C14300c;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import hj0.AbstractC17354m;
import ii0.AbstractC18553k;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j11.AbstractC21211n;
import j11.EnumC21213p;
import j93.InterfaceC21493z;
import jf3.C21647a;
import kn2.C22605g;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import os0.AbstractC28312h;
import p114eb.AbstractC12939a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import pm2.C29360a;
import pm2.C29361b;
import pm2.C29363d;
import pm2.C29365f;
import pm2.EnumC29366g;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import st0.EnumC32978v;
import td1.InterfaceC33704b;
import ur2.C35199a;
import vf3.InterfaceC35951a;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b%\u0010\u0003R\u001a\u0010+\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R+\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020,8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00107\u001a\u0004\bG\u0010H¨\u0006J"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/advancedsettings/AdvancedStrapFragment;", "Lhj0/m;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/content/Context;", "context", "Leb/a0;", "navController", "m0", "(Landroid/content/Context;Leb/a0;)V", "n0", "E0", "Q0", "Lcom/whoop/settings/about/a;", NotificationCompat.CATEGORY_EVENT, "B0", "(Lcom/whoop/settings/about/a;)V", "X0", "S0", "T0", "g0", "Y0", "R0", "Z0", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lii0/k;", "<set-?>", "x", "Lcom/whoop/ui/b;", "i0", "()Lii0/k;", "D0", "(Lii0/k;)V", "binding", "Lpm2/d;", "y", "Ll83/h;", "k0", "()Lpm2/d;", "viewModel", "Ltd1/b;", "z", "l0", "()Ltd1/b;", "whoopStrapProxy", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "E", "j0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lfa2/c;", "F", "h0", "()Lfa2/c;", "aboutNavigationRouter", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AdvancedStrapFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: G */
    static final /* synthetic */ InterfaceC21493z[] f31757G = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(AdvancedStrapFragment.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentAdvancedSettingsBinding;", 0))};

    /* JADX INFO: renamed from: H */
    public static final int f31758H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h aboutNavigationRouter;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "AdvancedStrapFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10505k(this, null, new C10504j(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapProxy;

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10495a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f31765a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f31766b;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f31765a = iArr;
            int[] iArr2 = new int[EnumC29366g.values().length];
            try {
                iArr2[EnumC29366g.FIRMWARE_SHOW_UPDATE_DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC29366g.FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC29366g.CHARGE_STRAP_PROMPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC29366g.NO_NETWORK_CONNECTED_PROMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC29366g.NO_STRAP_CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC29366g.FIRMWARE_HIDE_COMPOSE_DIALOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EnumC29366g.FIRMWARE_SHOW_TOAST_FIRMWARE_UPDATE_STARTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            f31766b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10496b implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f31767w;

        public C10496b(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f31767w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f31767w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31767w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10497c extends C22672i implements Function1 {
        public C10497c(Object obj) {
            super(1, 0, C29363d.class, obj, "onEraseStrapConfirmationAccepted", "onEraseStrapConfirmationAccepted(Z)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }

        public final void invoke(boolean z4) {
            ((C29363d) this.receiver).m89510e0(z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10498d extends C22672i implements Function1 {
        public C10498d(Object obj) {
            super(1, 0, C29363d.class, obj, "onPowerCycleConfirmationAccepted", "onPowerCycleConfirmationAccepted(Z)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }

        public final void invoke(boolean z4) {
            ((C29363d) this.receiver).m89516k0(z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10499e extends C22672i implements Function1 {
        public C10499e(Object obj) {
            super(1, 0, C29363d.class, obj, "onRebootConfirmationAccepted", "onRebootConfirmationAccepted(Z)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }

        public final void invoke(boolean z4) {
            ((C29363d) this.receiver).m89518m0(z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10500f extends C22672i implements Function1 {
        public C10500f(Object obj) {
            super(1, 0, C29363d.class, obj, "onUnpairStrapConfirmationAccepted", "onUnpairStrapConfirmationAccepted(Z)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return C23454a0.f92919a;
        }

        public final void invoke(boolean z4) {
            ((C29363d) this.receiver).m89522q0(z4);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10501g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31768w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31769x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31770y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10501g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31768w = componentCallbacks;
            this.f31769x = interfaceC35951a;
            this.f31770y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, td1.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC33704b invoke() {
            ComponentCallbacks componentCallbacks = this.f31768w;
            InterfaceC35951a interfaceC35951a = this.f31769x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31770y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC33704b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10502h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31771w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31772x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31773y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10502h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31771w = componentCallbacks;
            this.f31772x = interfaceC35951a;
            this.f31773y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f31771w;
            InterfaceC35951a interfaceC35951a = this.f31772x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31773y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10503i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31774w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31775x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10503i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31774w = componentCallbacks;
            this.f31775x = interfaceC35951a;
            this.f31776y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fa2.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14300c invoke() {
            ComponentCallbacks componentCallbacks = this.f31774w;
            InterfaceC35951a interfaceC35951a = this.f31775x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31776y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14300c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10504j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31777w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10504j(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31777w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31777w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10505k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31778w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31779x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31780y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31781z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10505k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31778w = componentCallbacks;
            this.f31779x = interfaceC35951a;
            this.f31780y = interfaceC4339a;
            this.f31781z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, pm2.d] */
        @Override // c93.InterfaceC4339a
        public final C29363d invoke() {
            return AbstractC34132o.m107857B(this.f31778w, this.f31779x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29363d.class), this.f31780y, this.f31781z);
        }
    }

    public AdvancedStrapFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.whoopStrapProxy = AbstractC30060g.m92087G(enumC23463i, new C10501g(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10502h(this, null, null));
        this.aboutNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10503i(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m26867A0(AdvancedStrapFragment advancedStrapFragment, boolean z4) {
        AdvancedSettingsItemView advancedSettingsEnableRawData = advancedStrapFragment.m26923i0().f72304f;
        AbstractC22676k.m65749i(advancedSettingsEnableRawData, "advancedSettingsEnableRawData");
        advancedSettingsEnableRawData.setVisibility(z4 ? 0 : 8);
        AdvancedSettingsItemView advancedSettingsDisableRawData = advancedStrapFragment.m26923i0().f72302d;
        AbstractC22676k.m65749i(advancedSettingsDisableRawData, "advancedSettingsDisableRawData");
        advancedSettingsDisableRawData.setVisibility(z4 ? 0 : 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B0 */
    private final void m26868B0(AbstractC10092a event) {
        C14300c c14300cM26922h0 = m26922h0();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        c14300cM26922h0.m40906a(event, abstractActivityC1340r0RequireActivity, "Device Settings", new C29360a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m26869C0(AdvancedStrapFragment advancedStrapFragment, String deepLink) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        AbstractC28163g0.m85259o(advancedStrapFragment).m85338d(Uri.parse(deepLink));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D0 */
    private final void m26870D0(AbstractC18553k abstractC18553k) {
        this.binding.setValue(this, f31757G[0], abstractC18553k);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m26872E0() {
        AdvancedSettingsItemView advancedSettingsPowerCycle = m26923i0().f72311m;
        AbstractC22676k.m65749i(advancedSettingsPowerCycle, "advancedSettingsPowerCycle");
        AbstractC1953c.m5963a(advancedSettingsPowerCycle, new C29360a(this, 0));
        AdvancedSettingsItemView advancedSettingsPairStrap = m26923i0().f72310l;
        AbstractC22676k.m65749i(advancedSettingsPairStrap, "advancedSettingsPairStrap");
        AbstractC1953c.m5963a(advancedSettingsPairStrap, new C29360a(this, 11));
        AdvancedSettingsItemView advancedSettingsUnpairStrap = m26923i0().f72316r;
        AbstractC22676k.m65749i(advancedSettingsUnpairStrap, "advancedSettingsUnpairStrap");
        AbstractC1953c.m5963a(advancedSettingsUnpairStrap, new C29360a(this, 12));
        AdvancedSettingsItemView advancedSettingsEmailDiagnosticData = m26923i0().f72303e;
        AbstractC22676k.m65749i(advancedSettingsEmailDiagnosticData, "advancedSettingsEmailDiagnosticData");
        AbstractC1953c.m5963a(advancedSettingsEmailDiagnosticData, new C29360a(this, 13));
        AdvancedSettingsItemView advancedSettingsRebootDevice = m26923i0().f72313o;
        AbstractC22676k.m65749i(advancedSettingsRebootDevice, "advancedSettingsRebootDevice");
        AbstractC1953c.m5963a(advancedSettingsRebootDevice, new C29360a(this, 14));
        AdvancedSettingsItemView advancedSettingsEraseStrapData = m26923i0().f72305g;
        AbstractC22676k.m65749i(advancedSettingsEraseStrapData, "advancedSettingsEraseStrapData");
        AbstractC1953c.m5963a(advancedSettingsEraseStrapData, new C29360a(this, 15));
        AdvancedSettingsItemView advancedSettingsFirmwareCheck = m26923i0().f72306h;
        AbstractC22676k.m65749i(advancedSettingsFirmwareCheck, "advancedSettingsFirmwareCheck");
        AbstractC1953c.m5963a(advancedSettingsFirmwareCheck, new C29360a(this, 16));
        AdvancedSettingsItemView advancedSettingsRegulatoryLabels = m26923i0().f72314p;
        AbstractC22676k.m65749i(advancedSettingsRegulatoryLabels, "advancedSettingsRegulatoryLabels");
        AbstractC1953c.m5963a(advancedSettingsRegulatoryLabels, new C29360a(this, 17));
        AdvancedSettingsItemView advancedSettingsSafetyRegulatory = m26923i0().f72315q;
        AbstractC22676k.m65749i(advancedSettingsSafetyRegulatory, "advancedSettingsSafetyRegulatory");
        AbstractC1953c.m5963a(advancedSettingsSafetyRegulatory, new C29360a(this, 18));
        AdvancedSettingsItemView advancedSettingsEnableRawData = m26923i0().f72304f;
        AbstractC22676k.m65749i(advancedSettingsEnableRawData, "advancedSettingsEnableRawData");
        AbstractC1953c.m5963a(advancedSettingsEnableRawData, new C29360a(this, 1));
        AdvancedSettingsItemView advancedSettingsDisableRawData = m26923i0().f72302d;
        AbstractC22676k.m65749i(advancedSettingsDisableRawData, "advancedSettingsDisableRawData");
        AbstractC1953c.m5963a(advancedSettingsDisableRawData, new C29360a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m26874F0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85216g("Pressed - Power Cycle", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26925k0().m89515j0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m26876G0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.m26925k0().m89514i0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m26878H0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85216g("Pressed - Disable R20/21 Raw Data", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26925k0().m89508c0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final C23454a0 m26880I0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.m26925k0().m89521p0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m26882J0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85228t("Pressed - Email Diagnostic data", new AbstractC30556a.a[0]);
        advancedStrapFragment.getEventDispatcher().m128987F(advancedStrapFragment.m26926l0().mo106491d().analyticsName(), "Device Settings");
        C35199a c35199a = (C35199a) AbstractC29125c.m88492A(advancedStrapFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35199a.class), null);
        Context contextRequireContext = advancedStrapFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        c35199a.m111535n(contextRequireContext);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m26884K0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85228t("Pressed - Reboot", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26925k0().m89517l0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m26886L0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85228t("Pressed - Erase Strap Data", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26925k0().m89511f0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m26888M0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85228t("Pressed - Firmware Check", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26925k0().m89512g0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m26890N0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85228t("Pressed - Regulatory Labels", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26868B0(AbstractC10092a.d.f30348a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m26892O0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85228t("Pressed - Safety & Regulatory", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26868B0(AbstractC10092a.e.f30349a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m26894P0(AdvancedStrapFragment advancedStrapFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.getLog().mo85216g("Pressed - Enable R20/21 Raw Data", new AbstractC30556a.a[0]);
        advancedStrapFragment.m26925k0().m89509d0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m26896Q0() {
        boolean zIsFeatureEnabled = m26924j0().isFeatureEnabled(FeatureFlagRepositoryKt.DEVICE_SETTINGS_REGULATORY_TILES);
        AdvancedSettingsItemView advancedSettingsRegulatoryLabels = m26923i0().f72314p;
        AbstractC22676k.m65749i(advancedSettingsRegulatoryLabels, "advancedSettingsRegulatoryLabels");
        advancedSettingsRegulatoryLabels.setVisibility(zIsFeatureEnabled ? 0 : 8);
        AdvancedSettingsItemView advancedSettingsSafetyRegulatory = m26923i0().f72315q;
        AbstractC22676k.m65749i(advancedSettingsSafetyRegulatory, "advancedSettingsSafetyRegulatory");
        advancedSettingsSafetyRegulatory.setVisibility(zIsFeatureEnabled ? 0 : 8);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m26898R0() {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C22605g c22605g = new C22605g(contextRequireContext, true, null, 4, null);
        String string = getString(AbstractC17312j.f67007n1);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC17312j.f66958W);
        AbstractC22676k.m65749i(string2, "getString(...)");
        C22605g.m65540j(c22605g, string, string2, null, getString(AbstractC17312j.f67033x), getString(AbstractC17312j.f66956V), new C10497c(m26925k0()), 4, null);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m26900S0() {
        getLog().mo85228t("In showFirmwareUpdateDialog", new AbstractC30556a.a[0]);
        m26902T0();
    }

    /* JADX INFO: renamed from: T0 */
    private final void m26902T0() {
        ComposeView composeDialogView = m26923i0().f72318t;
        AbstractC22676k.m65749i(composeDialogView, "composeDialogView");
        AbstractC11814b.m31673c(composeDialogView, new C37816b(new InterfaceC4351m() { // from class: pm2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return AdvancedStrapFragment.m26904U0(this.f119039w, (Composer) obj, iIntValue);
            }
        }, true, -340677517));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m26904U0(AdvancedStrapFragment advancedStrapFragment, Composer composer, int i13) {
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC28312h.f114152Q, null, i14, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC28312h.f114142G, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC28312h.f114143H, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC28312h.f114144I, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            int iM46232j = C38072d.f163053a.m121951d().getTinyIcons().getChip();
            EnumC21213p enumC21213p = EnumC21213p.CENTER_ICON;
            EnumC39333f enumC39333f = EnumC39333f.RECOVERY;
            Integer numValueOf = Integer.valueOf(iM46232j);
            boolean zM87157i = c28655q.m87157i(advancedStrapFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C29361b(advancedStrapFragment, 6);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(advancedStrapFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29361b(advancedStrapFragment, 7);
                c28655q.m87172p0(objM87133R2);
            }
            int i15 = TextResource.C8688b.f25889c;
            AbstractC21211n.m59497o(null, c8688b, c8688b2, c8688b3, false, enumC39333f, null, null, null, c8688b4, null, false, true, enumC21213p, null, false, 0, numValueOf, null, null, true, null, interfaceC4339a, null, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i15 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 << 6) | (i15 << 9) | (i15 << 27), 3456, 6, 246271441);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C23454a0 m26906V0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26921g0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C23454a0 m26908W0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26925k0().m89513h0(true);
        advancedStrapFragment.m26921g0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m26910X0() {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C22605g c22605g = new C22605g(contextRequireContext, true, null, 4, null);
        String string = getString(AbstractC17312j.f67007n1);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC17312j.f66945P0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        C22605g.m65540j(c22605g, string, string2, null, getString(AbstractC17312j.f67033x), getString(AbstractC17312j.f66943O0), new C10498d(m26925k0()), 4, null);
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m26912Y0() {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C22605g c22605g = new C22605g(contextRequireContext, true, null, 4, null);
        String string = getString(AbstractC17312j.f67007n1);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC17312j.f66945P0);
        AbstractC22676k.m65749i(string2, "getString(...)");
        C22605g.m65540j(c22605g, string, string2, null, getString(AbstractC17312j.f67033x), getString(AbstractC17312j.f66943O0), new C10499e(m26925k0()), 4, null);
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m26914Z0() {
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        C22605g c22605g = new C22605g(contextRequireContext, true, null, 4, null);
        String string = getString(AbstractC17312j.f67007n1);
        AbstractC22676k.m65749i(string, "getString(...)");
        String string2 = getString(AbstractC17312j.f67019r1);
        AbstractC22676k.m65749i(string2, "getString(...)");
        C22605g.m65540j(c22605g, string, string2, null, getString(AbstractC17312j.f67033x), getString(AbstractC17312j.f66914A), new C10500f(m26925k0()), 4, null);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m26921g0() {
        m26925k0().m89507b0();
    }

    /* JADX INFO: renamed from: h0 */
    private final C14300c m26922h0() {
        return (C14300c) this.aboutNavigationRouter.getValue();
    }

    /* JADX INFO: renamed from: i0 */
    private final AbstractC18553k m26923i0() {
        return (AbstractC18553k) this.binding.getValue(this, f31757G[0]);
    }

    /* JADX INFO: renamed from: j0 */
    private final FeatureFlagChecker m26924j0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: k0 */
    private final C29363d m26925k0() {
        return (C29363d) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: l0 */
    private final InterfaceC33704b m26926l0() {
        return (InterfaceC33704b) this.whoopStrapProxy.getValue();
    }

    /* JADX INFO: renamed from: n0 */
    private final void m26927n0() {
        observe(m26925k0().getDeviceInfo(), new C10496b(new C29360a(this, 2)));
        int i13 = 3;
        observe(m26925k0().getGoToPairStrapBle(), new C29361b(this, i13));
        observe(m26925k0().getPuffinFirmwareVersion(), new C10496b(new C29360a(this, i13)));
        observe(m26925k0().getStrapConnected(), new C10496b(new C29360a(this, 4)));
        observe(m26925k0().getCommandCapableStrapConnected(), new C10496b(new C29360a(this, 5)));
        observe(m26925k0().m89502V(), new C29360a(this, 6));
        observe(m26925k0().getActionShowRebootStrapConfirmation(), new C29361b(this, 4));
        observe(m26925k0().getActionEraseStrapDataConfirmation(), new C29361b(this, 5));
        observe(m26925k0().getAdvancedEmailDiagnosticButtonEnabled(), new C10496b(new C29360a(this, 8)));
        observe(m26925k0().getToggleRawDataButtonsEnabled(), new C10496b(new C29360a(this, 9)));
        observe(m26925k0().getClearStrapInfoUi(), new C29361b(this, 0));
        observe(m26925k0().getActionUnpairStrapConfirmation(), new C29361b(this, 1));
        observe(m26925k0().getActionShowPowerCycleConfirmation(), new C29361b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m26928o0(AdvancedStrapFragment advancedStrapFragment, WhoopStrapInfo it) {
        AbstractC22676k.m65750j(it, "it");
        advancedStrapFragment.m26923i0().f72301c.setText(it.getSerialNumber());
        switch (C10495a.f31765a[it.getWhoopDeviceType().ordinal()]) {
            case 1:
                String string = advancedStrapFragment.getString(AbstractC17312j.f66918C, it.getMaximVersion().mo84319a(), it.getBluetoothVersion().mo84319a());
                AbstractC22676k.m65749i(string, "getString(...)");
                advancedStrapFragment.m26923i0().f72309k.setText(string);
                advancedStrapFragment.m26923i0().f72312n.setVisibility(8);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                advancedStrapFragment.m26923i0().f72309k.setText(it.getMaximVersion().mo84319a());
                advancedStrapFragment.m26923i0().f72312n.setVisibility(0);
                break;
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m26929p0(AdvancedStrapFragment advancedStrapFragment) {
        Context contextRequireContext = advancedStrapFragment.requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        advancedStrapFragment.m26940m0(contextRequireContext, AbstractC5583n.m16799z(advancedStrapFragment));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m26930q0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26923i0().f72301c.setText("");
        advancedStrapFragment.m26923i0().f72309k.setText("");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m26931r0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26914Z0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m26932s0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26910X0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m26933t0(AdvancedStrapFragment advancedStrapFragment, String fwVersion) {
        AbstractC22676k.m65750j(fwVersion, "fwVersion");
        advancedStrapFragment.m26923i0().f72312n.setText(fwVersion);
        TextView advancedSettingsPuffinFirmwareVersionValue = advancedStrapFragment.m26923i0().f72312n;
        AbstractC22676k.m65749i(advancedSettingsPuffinFirmwareVersionValue, "advancedSettingsPuffinFirmwareVersionValue");
        advancedSettingsPuffinFirmwareVersionValue.setVisibility(fwVersion.length() > 0 ? 0 : 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final C23454a0 m26934u0(AdvancedStrapFragment advancedStrapFragment, boolean z4) {
        advancedStrapFragment.m26923i0().f72305g.setEnabled(z4);
        advancedStrapFragment.m26923i0().f72304f.setEnabled(z4);
        advancedStrapFragment.m26923i0().f72302d.setEnabled(z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m26935v0(AdvancedStrapFragment advancedStrapFragment, boolean z4) {
        advancedStrapFragment.m26923i0().f72313o.setEnabled(z4);
        advancedStrapFragment.m26923i0().f72306h.setEnabled(z4);
        advancedStrapFragment.m26923i0().f72316r.setEnabled(z4);
        advancedStrapFragment.m26923i0().f72314p.setEnabled(z4);
        advancedStrapFragment.m26923i0().f72311m.setVisibility((z4 && advancedStrapFragment.m26924j0().isFeatureEnabled(ConnectivityFeatureFlagsKt.ENABLE_ADVANCED_TROUBLESHOOTING)) ? 0 : 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m26936w0(AdvancedStrapFragment advancedStrapFragment, EnumC29366g it) {
        AbstractC22676k.m65750j(it, "it");
        switch (C10495a.f31766b[it.ordinal()]) {
            case 1:
                advancedStrapFragment.m26900S0();
                break;
            case 2:
                AbstractC18737i.m54478c(advancedStrapFragment.requireContext(), AbstractC17312j.f66961X0);
                break;
            case 3:
                AbstractC18737i.m54478c(advancedStrapFragment.requireContext(), AbstractC17312j.f66959W0);
                break;
            case 4:
                AbstractC18737i.m54478c(advancedStrapFragment.requireContext(), AbstractC17312j.f66962Y);
                break;
            case 5:
                AbstractC18737i.m54478c(advancedStrapFragment.requireContext(), AbstractC17312j.f66967a0);
                break;
            case 6:
                ComposeView composeDialogView = advancedStrapFragment.m26923i0().f72318t;
                AbstractC22676k.m65749i(composeDialogView, "composeDialogView");
                AbstractC11814b.m31673c(composeDialogView, C29365f.f119118a.m89532b());
                break;
            case 7:
                AbstractC18737i.m54478c(advancedStrapFragment.requireContext(), AbstractC28312h.f114149N);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m26937x0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26912Y0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m26938y0(AdvancedStrapFragment advancedStrapFragment) {
        advancedStrapFragment.m26898R0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m26939z0(AdvancedStrapFragment advancedStrapFragment, boolean z4) {
        AdvancedSettingsItemView advancedSettingsEmailDiagnosticData = advancedStrapFragment.m26923i0().f72303e;
        AbstractC22676k.m65749i(advancedSettingsEmailDiagnosticData, "advancedSettingsEmailDiagnosticData");
        advancedSettingsEmailDiagnosticData.setVisibility(z4 ? 0 : 8);
        return C23454a0.f92919a;
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m26940m0(Context context, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(navController, "navController");
        if (m26924j0().isFeatureEnabled("new-pairing-flow")) {
            navController.m36401p(AbstractC17307e.f66667V, PairingFragment.INSTANCE.m23220a(PairingFragment.EnumC9625b.SEARCHING_SCREEN), null);
        } else {
            AbstractC10531a.m27136a(context).m93405s().m49154m();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18553k abstractC18553kM53765c = AbstractC18553k.m53765c(getLayoutInflater(), container, false);
        AbstractC22676k.m65749i(abstractC18553kM53765c, "inflate(...)");
        m26870D0(abstractC18553kM53765c);
        View root = m26923i0().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m26925k0().m89519n0();
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireActivity();
        m26927n0();
        m26896Q0();
        m26872E0();
        m26925k0().m89520o0();
    }
}
