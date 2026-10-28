package com.whoop.healthmonitor.view;

import ak1.AbstractC0949b;
import ak1.C0950c;
import ak1.C0951d;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import ci0.C4726a;
import ck1.AbstractC4783f;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.healthmonitor.view.ComposableHealthMonitorFragment;
import com.whoop.hrZones.network.ZoneID;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33205o0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vj1.AbstractC36068a;
import vj1.C36069b;
import yg2.AbstractC39529d;
import zj1.AbstractC40770a;
import zj1.C40771b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010\u0003R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R\u001d\u00103\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\tR\u001d\u00106\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010\u0006R\u001d\u00109\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u0010\f¨\u0006<²\u0006\f\u0010;\u001a\u00020:8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lcom/whoop/hrZones/network/ZoneID;", "O", "()Lcom/whoop/hrZones/network/ZoneID;", "", "H", "()Ljava/lang/Integer;", "", "M", "()Ljava/lang/String;", "Lyg2/d;", "J", "()Lyg2/d;", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lak1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "N", "()Lak1/c;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lvj1/b;", "y", "G", "()Lvj1/b;", "analyticHelper", "z", "I", "initialHr", "E", "K", "initialZone", "F", "L", "navigationSource", "Lak1/d;", "viewState", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ComposableHealthMonitorFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h initialZone;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h navigationSource;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8792d(this, null, new C8791c(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h initialHr;

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthMonitorFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8789a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26213w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26214x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26215y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8789a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26213w = componentCallbacks;
            this.f26214x = interfaceC35951a;
            this.f26215y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f26213w;
            InterfaceC35951a interfaceC35951a = this.f26214x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26215y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthMonitorFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8790b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26216w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26217x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26218y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8790b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26216w = componentCallbacks;
            this.f26217x = interfaceC35951a;
            this.f26218y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vj1.b] */
        @Override // c93.InterfaceC4339a
        public final C36069b invoke() {
            ComponentCallbacks componentCallbacks = this.f26216w;
            InterfaceC35951a interfaceC35951a = this.f26217x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26218y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36069b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthMonitorFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8791c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26219w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8791c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26219w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26219w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.healthmonitor.view.ComposableHealthMonitorFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8792d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26220w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26221x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26222y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26223z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8792d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26220w = componentCallbacks;
            this.f26221x = interfaceC35951a;
            this.f26222y = interfaceC4339a;
            this.f26223z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ak1.c, androidx.lifecycle.w1] */
        @Override // c93.InterfaceC4339a
        public final C0950c invoke() {
            return AbstractC34132o.m107857B(this.f26220w, this.f26221x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C0950c.class), this.f26222y, this.f26223z);
        }
    }

    public ComposableHealthMonitorFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: ck1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ComposableHealthMonitorFragment f19679x;

            {
                this.f19679x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ComposableHealthMonitorFragment.m21584S(this.f19679x);
                    case 1:
                        return ComposableHealthMonitorFragment.m21581P(this.f19679x);
                    case 2:
                        return ComposableHealthMonitorFragment.m21582Q(this.f19679x);
                    default:
                        return ComposableHealthMonitorFragment.m21583R(this.f19679x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8789a(this, null, interfaceC4339a));
        this.analyticHelper = AbstractC30060g.m92087G(enumC23463i, new C8790b(this, null, null));
        final int i14 = 1;
        this.initialHr = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ck1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ComposableHealthMonitorFragment f19679x;

            {
                this.f19679x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ComposableHealthMonitorFragment.m21584S(this.f19679x);
                    case 1:
                        return ComposableHealthMonitorFragment.m21581P(this.f19679x);
                    case 2:
                        return ComposableHealthMonitorFragment.m21582Q(this.f19679x);
                    default:
                        return ComposableHealthMonitorFragment.m21583R(this.f19679x);
                }
            }
        });
        final int i15 = 2;
        this.initialZone = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ck1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ComposableHealthMonitorFragment f19679x;

            {
                this.f19679x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ComposableHealthMonitorFragment.m21584S(this.f19679x);
                    case 1:
                        return ComposableHealthMonitorFragment.m21581P(this.f19679x);
                    case 2:
                        return ComposableHealthMonitorFragment.m21582Q(this.f19679x);
                    default:
                        return ComposableHealthMonitorFragment.m21583R(this.f19679x);
                }
            }
        });
        final int i16 = 3;
        this.navigationSource = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ck1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ComposableHealthMonitorFragment f19679x;

            {
                this.f19679x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ComposableHealthMonitorFragment.m21584S(this.f19679x);
                    case 1:
                        return ComposableHealthMonitorFragment.m21581P(this.f19679x);
                    case 2:
                        return ComposableHealthMonitorFragment.m21582Q(this.f19679x);
                    default:
                        return ComposableHealthMonitorFragment.m21583R(this.f19679x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: G */
    private final C36069b m21572G() {
        return (C36069b) this.analyticHelper.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final Integer m21573H() {
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt("initialHr")) : null;
        if (numValueOf == null || numValueOf.intValue() <= 0) {
            return null;
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: I */
    private final Integer m21574I() {
        return (Integer) this.initialHr.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final AbstractC39529d m21575J() {
        Integer numM21574I = m21574I();
        if (numM21574I == null) {
            return null;
        }
        int iIntValue = numM21574I.intValue();
        ZoneID zoneIDM21576K = m21576K();
        if (zoneIDM21576K != null) {
            return new AbstractC39529d.a(iIntValue, zoneIDM21576K);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    private final ZoneID m21576K() {
        return (ZoneID) this.initialZone.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m21577L() {
        return (String) this.navigationSource.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final String m21578M() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    private final C0950c m21579N() {
        return (C0950c) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final ZoneID m21580O() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("initialHrZone") : null;
        for (ZoneID zoneID : ZoneID.values()) {
            if (AbstractC22676k.m65745e(zoneID.name(), string)) {
                return zoneID;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Integer m21581P(ComposableHealthMonitorFragment composableHealthMonitorFragment) {
        return composableHealthMonitorFragment.m21573H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final ZoneID m21582Q(ComposableHealthMonitorFragment composableHealthMonitorFragment) {
        return composableHealthMonitorFragment.m21580O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final String m21583R(ComposableHealthMonitorFragment composableHealthMonitorFragment) {
        return composableHealthMonitorFragment.m21578M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34911a m21584S(ComposableHealthMonitorFragment composableHealthMonitorFragment) {
        return AbstractC15751g.m44431K(composableHealthMonitorFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m21585T(final ComposableHealthMonitorFragment composableHealthMonitorFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40771b(AbstractC5583n.m16799z(composableHealthMonitorFragment), composableHealthMonitorFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C40771b c40771b = (C40771b) objM87133R;
            DefaultConstructorMarker defaultConstructorMarker = null;
            C0951d c0951dM21586U = m21586U(AbstractC28683x.m87260n(composableHealthMonitorFragment.m21579N().getViewState(), new C0951d(null, new C0951d.a(C33205o0.f138451a.m105288b(), null, null, 6, defaultConstructorMarker), 0 == true ? 1 : 0, 5, defaultConstructorMarker), null, c28655q, 0, 2));
            String strM21577L = composableHealthMonitorFragment.m21577L();
            boolean zM87157i = c28655q.m87157i(composableHealthMonitorFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(composableHealthMonitorFragment) { // from class: ck1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ComposableHealthMonitorFragment f19681x;

                    {
                        this.f19681x = composableHealthMonitorFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return ComposableHealthMonitorFragment.m21587V(this.f19681x, (AbstractC0949b) obj);
                            default:
                                return ComposableHealthMonitorFragment.m21589X(this.f19681x, (AbstractC36068a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i2 = c28655q.m87157i(c40771b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4780c(c40771b, 0);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(composableHealthMonitorFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i15 = 1;
                objM87133R4 = new Function1(composableHealthMonitorFragment) { // from class: ck1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ComposableHealthMonitorFragment f19681x;

                    {
                        this.f19681x = composableHealthMonitorFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return ComposableHealthMonitorFragment.m21587V(this.f19681x, (AbstractC0949b) obj);
                            default:
                                return ComposableHealthMonitorFragment.m21589X(this.f19681x, (AbstractC36068a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC4783f.m15064l(c0951dM21586U, strM21577L, function1, function2, (Function1) objM87133R4, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    private static final C0951d m21586U(InterfaceC28670t2 interfaceC28670t2) {
        return (C0951d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m21587V(ComposableHealthMonitorFragment composableHealthMonitorFragment, AbstractC0949b it) {
        AbstractC22676k.m65750j(it, "it");
        composableHealthMonitorFragment.m21579N().m2397q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m21588W(C40771b c40771b, AbstractC40770a it) {
        AbstractC22676k.m65750j(it, "it");
        c40771b.m132261a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m21589X(ComposableHealthMonitorFragment composableHealthMonitorFragment, AbstractC36068a it) {
        AbstractC22676k.m65750j(it, "it");
        composableHealthMonitorFragment.m21572G().m114549a(it);
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroyView() {
        m21572G().m114549a(AbstractC36068a.b.f154033b);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        m21579N().m2397q(AbstractC0949b.f.f3457a);
        AbstractC39529d abstractC39529dM21575J = m21575J();
        if (abstractC39529dM21575J != null) {
            m21579N().m2397q(new AbstractC0949b.d(abstractC39529dM21575J));
        }
        getViewLifecycleOwner().getLifecycle().mo4986a(m21579N());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 1), true, 1235702018));
    }
}
