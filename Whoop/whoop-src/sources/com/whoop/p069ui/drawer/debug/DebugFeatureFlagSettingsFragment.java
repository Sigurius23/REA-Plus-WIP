package com.whoop.p069ui.drawer.debug;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hi0.AbstractC17312j;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import in2.AbstractC18737i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import k71.C22252i;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lc0.C23821c;
import live.hms.video.connection.degredation.C24117a;
import lq0.C24656d;
import m83.AbstractC25267u;
import mw1.C25985a;
import mx1.C26003i;
import n72.C26439b;
import nm2.C26847c;
import nm2.C26848d;
import nm2.C26849e;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15133r7;
import p163g1.C15187x1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p571w3.C36775k;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 ²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/ui/drawer/debug/DebugFeatureFlagSettingsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lnm2/e;", "flag", "Ll83/a0;", "G", "(Lnm2/e;Landroidx/compose/runtime/Composer;I)V", "J", "(Landroidx/compose/runtime/Composer;I)V", "V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onStart", "Lnm2/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "O", "()Lnm2/c;", "viewModel", "x", "a", "Lnm2/d;", "viewState", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DebugFeatureFlagSettingsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: y */
    public static final int f31741y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10494i(this, null, new C10493h(this), null));

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10487b extends C22672i implements InterfaceC4339a {
        public C10487b(Object obj) {
            super(0, 0, DebugFeatureFlagSettingsFragment.class, obj, "onResetToDefaultsClicked", "onResetToDefaultsClicked()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134195invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134195invoke() {
            ((DebugFeatureFlagSettingsFragment) this.receiver).m26860V();
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10488c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final C10488c f31743w = new C10488c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C26849e c26849e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10489d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f31744w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f31745x;

        public C10489d(Function1 function1, List list) {
            this.f31744w = function1;
            this.f31745x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m26864a(int i13) {
            return this.f31744w.invoke(this.f31745x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26864a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10490e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f31746w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f31747x;

        public C10490e(Function1 function1, List list) {
            this.f31746w = function1;
            this.f31747x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m26865a(int i13) {
            return this.f31746w.invoke(this.f31747x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m26865a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10491f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f31748w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ DebugFeatureFlagSettingsFragment f31749x;

        public C10491f(List list, DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment) {
            this.f31748w = list;
            this.f31749x = debugFeatureFlagSettingsFragment;
        }

        /* JADX INFO: renamed from: a */
        public final void m26866a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C26849e c26849e = (C26849e) this.f31748w.get(i13);
            c28655q.m87150e0(1451205473);
            this.f31749x.m26845G(c26849e, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m26866a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$g */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$onResetToDefaultsClicked$1", m100430f = "DebugFeatureFlagSettingsFragment.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10492g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31750w;

        public C10492g(InterfaceC30057d<? super C10492g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DebugFeatureFlagSettingsFragment.this.new C10492g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10492g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31750w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C26847c c26847cM26853O = DebugFeatureFlagSettingsFragment.this.m26853O();
                this.f31750w = 1;
                obj = c26847cM26853O.m80148H(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                AbstractC18737i.m54477b(DebugFeatureFlagSettingsFragment.this, "Feature Flags Reset to defaults");
            } else {
                AbstractC18737i.m54477b(DebugFeatureFlagSettingsFragment.this, "Failed to Reset Feature Flags");
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10493h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31752w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10493h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31752w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31752w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.debug.DebugFeatureFlagSettingsFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10494i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31753w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31754x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31755y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31756z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10494i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31753w = componentCallbacks;
            this.f31754x = interfaceC35951a;
            this.f31755y = interfaceC4339a;
            this.f31756z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nm2.c] */
        @Override // c93.InterfaceC4339a
        public final C26847c invoke() {
            return AbstractC34132o.m107857B(this.f31753w, this.f31754x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26847c.class), this.f31755y, this.f31756z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public final void m26845G(C26849e c26849e, Composer composer, int i13) {
        int i14;
        C26849e c26849e2;
        DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment = this;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(672614662);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c26849e) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(debugFeatureFlagSettingsFragment) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125370W0 = c38072d.m121949b(c28655q, i15).getWhite10();
            float f13 = 4;
            float f14 = 1 * f13;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, jM125370W0, c33252iM105489e);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(3 * f13, c2314t));
            String strM80158d = c26849e.getFeatureName();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM80158d, new LayoutWeightElement(1.0f, true), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            boolean zM80159f = c26849e.getIsEnabled();
            C15187x1 c15187x1M108196A = AbstractC34235f.m108196A(c38072d.m121949b(c28655q, i15).getAccentAlert(), c38072d.m121949b(c28655q, i15).getAccentAlert(), 0.3f, c38072d.m121949b(c28655q, i15).getGreyL2(), 0L, 0.0f, 0L, 0L, 0L, 0L, c28655q, MessageListItemViewType.GIPHY);
            c28655q = c28655q;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 2 * 8, 0.0f, 0.0f, 0.0f, 14);
            debugFeatureFlagSettingsFragment = this;
            c26849e2 = c26849e;
            boolean zM87157i = c28655q.m87157i(debugFeatureFlagSettingsFragment) | c28655q.m87157i(c26849e2);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C24656d(26, debugFeatureFlagSettingsFragment, c26849e2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC15133r7.m43183a(zM80159f, (Function1) objM87133R, modifierM3398t, false, c15187x1M108196A, c28655q, 384, 24);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f14, c2314t));
            c28655q.m87173q(true);
        } else {
            c26849e2 = c26849e;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(debugFeatureFlagSettingsFragment, c26849e2, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m26846H(DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment, C26849e c26849e, boolean z4) {
        debugFeatureFlagSettingsFragment.m26853O().m80145A(c26849e.getFeatureName(), z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m26847I(DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment, C26849e c26849e, int i13, Composer composer, int i14) {
        debugFeatureFlagSettingsFragment.m26845G(c26849e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private final void m26848J(Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(215654028);
        int i14 = i13 & 1;
        if (c28655q2.m87135U(i14, i14 != 0)) {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC17312j.f66946Q);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM92103Y, AbstractC1099a.m3394p(1 * 8, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(C2314t.f9131w, c38072d.m121949b(c28655q2, i15).getAccentAlert(), AbstractC17918w0.f69621a))), c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(this, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m26849K(DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment, int i13, Composer composer, int i14) {
        debugFeatureFlagSettingsFragment.m26848J(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final C26847c m26853O() {
        return (C26847c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x022d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m26854P(DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment, Composer composer, int i13) {
        C28676v0 c28676v0;
        boolean zM87157i;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(debugFeatureFlagSettingsFragment.m26853O().getViewState(), new C26848d(null, false, null, 7, null), null, c28655q, 0, 2);
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            List<C26849e> listM80155c = m26855Q(interfaceC28601c1M87260n).m80155c();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM80155c, 10));
            Iterator<T> it = listM80155c.iterator();
            while (it.hasNext()) {
                arrayList.add(((C26849e) it.next()).getFeatureName());
            }
            AbstractC17795v0.m51138u(arrayList, c26068uM77569a, c28655q, 0);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (m26855Q(interfaceC28601c1M87260n).getOverridingDefaults()) {
                c28655q.m87150e0(-1534569475);
                debugFeatureFlagSettingsFragment.m26848J(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1534515659);
                c28655q.m87173q(false);
            }
            AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21277k(AbstractC17312j.f66973c0));
            boolean zM87157i2 = c28655q.m87157i(debugFeatureFlagSettingsFragment);
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i2 || objM87133R2 == c28676v1) {
                objM87133R2 = new C24117a(debugFeatureFlagSettingsFragment, 24);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC6719b.m20143d(null, aVarM20173a, null, (InterfaceC4339a) objM87133R2, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(m26855Q(interfaceC28601c1M87260n).getSearchQuery());
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC17312j.f66951S0);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2), 0.0f, 0.0f, 0.0f, f14, 7);
            boolean zM87157i3 = c28655q.m87157i(debugFeatureFlagSettingsFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v1) {
                objM87133R3 = new C23821c(debugFeatureFlagSettingsFragment, 26);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC17795v0.m51127j(modifierM3398t, textResourceM21278l, c8688bM21277k, null, 0L, 0, false, null, 0L, false, c26068uM77569a, false, false, null, (Function1) objM87133R3, c28655q, (TextResource.$stable << 3) | 6 | (TextResource.C8688b.f25889c << 6), 0, 15352);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f14, 0.0f, 2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f13);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | c28655q.m87157i(debugFeatureFlagSettingsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R4 == c28676v0) {
                }
                C28676v0 c28676v2 = c28676v0;
                AbstractC22674j.m65717c(modifierM3396r, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R4, c28655q, 24576, 492);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC17312j.f66949R0);
                long jM125380b = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAlert();
                zM87157i = c28655q.m87157i(debugFeatureFlagSettingsFragment);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v2) {
                    objM87133R = new C10487b(debugFeatureFlagSettingsFragment);
                    c28655q.m87172p0(objM87133R);
                }
                float f15 = 3 * f13;
                AbstractC27282u.m82292h(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2), 0.0f, f14, 0.0f, f15, 5), enumC27284v, strM92103Y, m26855Q(interfaceC28601c1M87260n).getOverridingDefaults(), jM125380b, null, false, (InterfaceC4339a) ((InterfaceC21467g) objM87133R), c28655q, 54, 96);
                c28655q.m87173q(true);
            }
            objM87133R4 = new C24656d(25, interfaceC28601c1M87260n, debugFeatureFlagSettingsFragment);
            c28655q.m87172p0(objM87133R4);
            C28676v0 c28676v3 = c28676v0;
            AbstractC22674j.m65717c(modifierM3396r, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R4, c28655q, 24576, 492);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC17312j.f66949R0);
            long jM125380b2 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAlert();
            zM87157i = c28655q.m87157i(debugFeatureFlagSettingsFragment);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C10487b(debugFeatureFlagSettingsFragment);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C10487b(debugFeatureFlagSettingsFragment);
                c28655q.m87172p0(objM87133R);
            }
            float f16 = 3 * f13;
            AbstractC27282u.m82292h(AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2), 0.0f, f14, 0.0f, f16, 5), enumC27284v2, strM92103Y2, m26855Q(interfaceC28601c1M87260n).getOverridingDefaults(), jM125380b2, null, false, (InterfaceC4339a) ((InterfaceC21467g) objM87133R), c28655q, 54, 96);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final C26848d m26855Q(InterfaceC28670t2 interfaceC28670t2) {
        return (C26848d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m26856R(DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment) {
        AbstractC5583n.m16799z(debugFeatureFlagSettingsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m26857S(DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC17801x0.c) {
            debugFeatureFlagSettingsFragment.m26853O().m80149K(((AbstractC17801x0.c) it).getNewText());
        } else if (it instanceof AbstractC17801x0.a) {
            debugFeatureFlagSettingsFragment.m26853O().m80150y();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m26858T(InterfaceC28670t2 interfaceC28670t2, DebugFeatureFlagSettingsFragment debugFeatureFlagSettingsFragment, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C26849e> listM80155c = m26855Q(interfaceC28670t2).m80155c();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM80155c.size(), new C10489d(new C26439b(11), listM80155c), new C10490e(C10488c.f31743w, listM80155c), new C37816b(new C10491f(listM80155c, debugFeatureFlagSettingsFragment), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final Object m26859U(C26849e it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getFeatureName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public final void m26860V() {
        InterfaceC1585g0 viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC1613o1.m5020j(viewLifecycleOwner).m4972a(new C10492g(null));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onStart() {
        super.onStart();
        m26853O().m80147G();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C25985a(this, 11), true, -41117981));
    }
}
