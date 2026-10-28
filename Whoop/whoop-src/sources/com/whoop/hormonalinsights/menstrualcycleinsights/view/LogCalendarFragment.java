package com.whoop.hormonalinsights.menstrualcycleinsights.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import so1.AbstractC32832p;
import so1.C32830o;
import to1.AbstractC34008a;
import tx0.C34238a;
import uo1.C35141b;
import vf3.InterfaceC35951a;
import vo1.AbstractC36229d;
import vo1.C36227b;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0006R\u001d\u0010 \u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0006R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/LogCalendarFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "G", "()Ljava/lang/String;", "I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lzr2/a;", "dateAndTimeProvider", "x", "E", HttpHeaders.DATE, "y", "H", "source", "Lso1/o;", "z", "J", "()Lso1/o;", "viewModel", "Lso1/p;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class LogCalendarFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C8907a(this, null, null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h date = AbstractC30060g.m92088H(new C36227b(this, 0));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h source = AbstractC30060g.m92088H(new C36227b(this, 1));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8909c(this, null, new C8908b(this), null));

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8907a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26631x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26632y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8907a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f26630w = componentCallbacks;
            this.f26631x = interfaceC35951a;
            this.f26632y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f26630w;
            InterfaceC35951a interfaceC35951a = this.f26631x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f26632y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8908b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26633w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8908b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f26633w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f26633w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8909c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f26634w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f26635x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f26636y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f26637z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8909c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f26634w = componentCallbacks;
            this.f26635x = interfaceC35951a;
            this.f26636y = interfaceC4339a;
            this.f26637z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, so1.o] */
        @Override // c93.InterfaceC4339a
        public final C32830o invoke() {
            return AbstractC34132o.m107857B(this.f26634w, this.f26635x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32830o.class), this.f26636y, this.f26637z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m21985D(LogCalendarFragment logCalendarFragment) {
        return logCalendarFragment.m21988G();
    }

    /* JADX INFO: renamed from: E */
    private final String m21986E() {
        return (String) this.date.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final InterfaceC41070a m21987F() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final String m21988G() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(HttpHeaders.DATE) : null;
        return (string == null || string.length() == 0) ? m21987F().mo133365d().toString("yyyy-MM-dd") : string;
    }

    /* JADX INFO: renamed from: H */
    private final String m21989H() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final String m21990I() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("source")) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    /* JADX INFO: renamed from: J */
    private final C32830o m21991J() {
        return (C32830o) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m21992K(LogCalendarFragment logCalendarFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(logCalendarFragment.m21991J().getViewState(), AbstractC32832p.b.f136795b, null, c28655q, 48, 2);
            AbstractC28163g0.m85256l(logCalendarFragment);
            AbstractC32832p abstractC32832pM21993L = m21993L(interfaceC28601c1M87260n);
            boolean zM87157i = c28655q.m87157i(logCalendarFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C35141b(logCalendarFragment, 11);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(logCalendarFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C36227b(logCalendarFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC36229d.m115421u(abstractC32832pM21993L, function1, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final AbstractC32832p m21993L(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC32832p) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m21994M(LogCalendarFragment logCalendarFragment, AbstractC34008a it) {
        AbstractC22676k.m65750j(it, "it");
        logCalendarFragment.m21991J().m103023n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m21995N(LogCalendarFragment logCalendarFragment) {
        AbstractC5583n.m16799z(logCalendarFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m21996O(LogCalendarFragment logCalendarFragment) {
        return logCalendarFragment.m21990I();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 21), true, -813356685));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        m21991J().m103023n(new AbstractC34008a.a(m21986E(), m21989H()));
    }
}
