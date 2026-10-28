package com.whoop.p069ui.debug;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.debug.DebugIterablesFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hj0.AbstractC17354m;
import ii0.AbstractC18557m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n92.C26480b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lcom/whoop/ui/debug/DebugIterablesFragment;", "Lhj0/m;", "<init>", "()V", "Ll83/a0;", "K", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Ln92/b;", "x", "Ll83/h;", "J", "()Ln92/b;", "handler", "Lii0/m;", "<set-?>", "y", "Lcom/whoop/ui/b;", "I", "()Lii0/m;", "P", "(Lii0/m;)V", "binding", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DebugIterablesFragment extends AbstractC17354m {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String logTag = "DebugIterablesFragment";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h handler = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10465a(this, null, null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: z */
    static final /* synthetic */ InterfaceC21493z[] f31655z = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(DebugIterablesFragment.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentDebugIterableBinding;", 0))};

    /* JADX INFO: renamed from: E */
    public static final int f31654E = 8;

    /* JADX INFO: renamed from: com.whoop.ui.debug.DebugIterablesFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10465a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31659w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31660x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31661y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10465a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31659w = componentCallbacks;
            this.f31660x = interfaceC35951a;
            this.f31661y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, n92.b] */
        @Override // c93.InterfaceC4339a
        public final C26480b invoke() {
            ComponentCallbacks componentCallbacks = this.f31659w;
            InterfaceC35951a interfaceC35951a = this.f31660x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31661y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26480b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: I */
    private final AbstractC18557m m26740I() {
        return (AbstractC18557m) this.binding.getValue(this, f31655z[0]);
    }

    /* JADX INFO: renamed from: J */
    private final C26480b m26741J() {
        return (C26480b) this.handler.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final void m26742K() {
        AbstractC18557m abstractC18557mM26740I = m26740I();
        ConstraintLayout healthMonitorIterable = abstractC18557mM26740I.f72342e;
        AbstractC22676k.m65749i(healthMonitorIterable, "healthMonitorIterable");
        final int i13 = 0;
        AbstractC1953c.m5963a(healthMonitorIterable, new Function1(this) { // from class: mm2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugIterablesFragment f101201x;

            {
                this.f101201x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return DebugIterablesFragment.m26743L(this.f101201x, (View) obj);
                    case 1:
                        return DebugIterablesFragment.m26744M(this.f101201x, (View) obj);
                    case 2:
                        return DebugIterablesFragment.m26745N(this.f101201x, (View) obj);
                    default:
                        return DebugIterablesFragment.m26746O(this.f101201x, (View) obj);
                }
            }
        });
        ImageView backIcon = abstractC18557mM26740I.f72338a;
        AbstractC22676k.m65749i(backIcon, "backIcon");
        final int i14 = 1;
        AbstractC1953c.m5963a(backIcon, new Function1(this) { // from class: mm2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugIterablesFragment f101201x;

            {
                this.f101201x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return DebugIterablesFragment.m26743L(this.f101201x, (View) obj);
                    case 1:
                        return DebugIterablesFragment.m26744M(this.f101201x, (View) obj);
                    case 2:
                        return DebugIterablesFragment.m26745N(this.f101201x, (View) obj);
                    default:
                        return DebugIterablesFragment.m26746O(this.f101201x, (View) obj);
                }
            }
        });
        ConstraintLayout coachingLandingIterable = abstractC18557mM26740I.f72340c;
        AbstractC22676k.m65749i(coachingLandingIterable, "coachingLandingIterable");
        final int i15 = 2;
        AbstractC1953c.m5963a(coachingLandingIterable, new Function1(this) { // from class: mm2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugIterablesFragment f101201x;

            {
                this.f101201x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return DebugIterablesFragment.m26743L(this.f101201x, (View) obj);
                    case 1:
                        return DebugIterablesFragment.m26744M(this.f101201x, (View) obj);
                    case 2:
                        return DebugIterablesFragment.m26745N(this.f101201x, (View) obj);
                    default:
                        return DebugIterablesFragment.m26746O(this.f101201x, (View) obj);
                }
            }
        });
        ConstraintLayout strengthTrainerIterable = abstractC18557mM26740I.f72347j;
        AbstractC22676k.m65749i(strengthTrainerIterable, "strengthTrainerIterable");
        final int i16 = 3;
        AbstractC1953c.m5963a(strengthTrainerIterable, new Function1(this) { // from class: mm2.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DebugIterablesFragment f101201x;

            {
                this.f101201x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i16) {
                    case 0:
                        return DebugIterablesFragment.m26743L(this.f101201x, (View) obj);
                    case 1:
                        return DebugIterablesFragment.m26744M(this.f101201x, (View) obj);
                    case 2:
                        return DebugIterablesFragment.m26745N(this.f101201x, (View) obj);
                    default:
                        return DebugIterablesFragment.m26746O(this.f101201x, (View) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m26743L(DebugIterablesFragment debugIterablesFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C26480b.m78504u(debugIterablesFragment.m26741J(), "HealthMonitor", false, null, 6, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m26744M(DebugIterablesFragment debugIterablesFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(debugIterablesFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m26745N(DebugIterablesFragment debugIterablesFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C26480b.m78504u(debugIterablesFragment.m26741J(), "Coaching", false, null, 6, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m26746O(DebugIterablesFragment debugIterablesFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C26480b.m78504u(debugIterablesFragment.m26741J(), "StrengthTrainer", false, null, 6, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private final void m26747P(AbstractC18557m abstractC18557m) {
        this.binding.setValue(this, f31655z[0], abstractC18557m);
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18557m abstractC18557mM53769c = AbstractC18557m.m53769c(getLayoutInflater(), container, false);
        AbstractC22676k.m65749i(abstractC18557mM53769c, "inflate(...)");
        m26747P(abstractC18557mM53769c);
        View root = m26740I().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m26742K();
    }
}
