package com.whoop.settings;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.settings.GiftWhoopFragment;
import ii0.AbstractC18559o;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import or2.C28216y;
import p031b9.AbstractC2875y;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import vf3.InterfaceC35951a;
import xp0.AbstractC38505d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R+\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lcom/whoop/settings/GiftWhoopFragment;", "Lcom/whoop/settings/i;", "<init>", "()V", "Ll83/a0;", "L", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "x", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "logTag", "Lcom/whoop/settings/m;", "y", "Ll83/h;", "K", "()Lcom/whoop/settings/m;", "viewModel", "Lor2/y;", "z", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lii0/o;", "<set-?>", "E", "Lcom/whoop/ui/b;", "J", "()Lii0/o;", "P", "(Lii0/o;)V", "binding", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GiftWhoopFragment extends AbstractC10105i {

    /* JADX INFO: renamed from: F */
    static final /* synthetic */ InterfaceC21493z[] f30120F = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(GiftWhoopFragment.class, "binding", "getBinding()Lcom/whoop/android/databinding/FragmentGiftWhoopLandingBinding;", 0))};

    /* JADX INFO: renamed from: G */
    public static final int f30121G = 8;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final String logTag = "GiftWhoopFragment";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10036c(this, null, new C10035b(this), null));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10034a(this, null, null));

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: com.whoop.settings.GiftWhoopFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10034a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30126w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30127x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30128y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10034a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30126w = componentCallbacks;
            this.f30127x = interfaceC35951a;
            this.f30128y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f30126w;
            InterfaceC35951a interfaceC35951a = this.f30127x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30128y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.GiftWhoopFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10035b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30129w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10035b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30129w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30129w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.GiftWhoopFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10036c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30131x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30132y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30133z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10036c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30130w = componentCallbacks;
            this.f30131x = interfaceC35951a;
            this.f30132y = interfaceC4339a;
            this.f30133z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.settings.m] */
        @Override // c93.InterfaceC4339a
        public final C10124m invoke() {
            return AbstractC34132o.m107857B(this.f30130w, this.f30131x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10124m.class), this.f30132y, this.f30133z);
        }
    }

    /* JADX INFO: renamed from: J */
    private final AbstractC18559o m25054J() {
        return (AbstractC18559o) this.binding.getValue(this, f30120F[0]);
    }

    /* JADX INFO: renamed from: K */
    private final C10124m m25055K() {
        return (C10124m) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final void m25056L() {
        TextView shareYourCode = m25054J().f72359h;
        AbstractC22676k.m65749i(shareYourCode, "shareYourCode");
        final int i13 = 0;
        AbstractC1953c.m5963a(shareYourCode, new Function1(this) { // from class: ea2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GiftWhoopFragment f44422x;

            {
                this.f44422x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return GiftWhoopFragment.m25057M(this.f44422x, (View) obj);
                    case 1:
                        return GiftWhoopFragment.m25058N(this.f44422x, (View) obj);
                    default:
                        return GiftWhoopFragment.m25059O(this.f44422x, (View) obj);
                }
            }
        });
        StrokedPillButton btnGiftWhoop = m25054J().f72352a;
        AbstractC22676k.m65749i(btnGiftWhoop, "btnGiftWhoop");
        final int i14 = 1;
        AbstractC1953c.m5963a(btnGiftWhoop, new Function1(this) { // from class: ea2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GiftWhoopFragment f44422x;

            {
                this.f44422x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return GiftWhoopFragment.m25057M(this.f44422x, (View) obj);
                    case 1:
                        return GiftWhoopFragment.m25058N(this.f44422x, (View) obj);
                    default:
                        return GiftWhoopFragment.m25059O(this.f44422x, (View) obj);
                }
            }
        });
        ImageView giftWhoopBack = m25054J().f72353b;
        AbstractC22676k.m65749i(giftWhoopBack, "giftWhoopBack");
        final int i15 = 2;
        AbstractC1953c.m5963a(giftWhoopBack, new Function1(this) { // from class: ea2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GiftWhoopFragment f44422x;

            {
                this.f44422x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i15) {
                    case 0:
                        return GiftWhoopFragment.m25057M(this.f44422x, (View) obj);
                    case 1:
                        return GiftWhoopFragment.m25058N(this.f44422x, (View) obj);
                    default:
                        return GiftWhoopFragment.m25059O(this.f44422x, (View) obj);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m25057M(GiftWhoopFragment giftWhoopFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        if (giftWhoopFragment.m25055K().m25543S().length() <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        giftWhoopFragment.getEventDispatcher().m129014S0();
        String strM8299l = AbstractC2875y.m8299l(giftWhoopFragment.m25055K().m25543S(), "?source=gift-page");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", strM8299l);
        intent.setType(MimeType.MIME_TYPE_TXT);
        giftWhoopFragment.startActivity(Intent.createChooser(intent, giftWhoopFragment.getResources().getString(AbstractC38505d0.f165668g2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m25058N(GiftWhoopFragment giftWhoopFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        giftWhoopFragment.getEventDispatcher().m128994I0("Click to webview", AbstractC25247g0.m73989X(new C23465k(HMSTrackSource.SCREEN, "In App Gift Page")));
        C28216y externalLinkNavigator = giftWhoopFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = giftWhoopFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85423l(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m25059O(GiftWhoopFragment giftWhoopFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(giftWhoopFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private final void m25060P(AbstractC18559o abstractC18559o) {
        this.binding.setValue(this, f30120F[0], abstractC18559o);
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    @Override // hj0.AbstractC17354m
    public String getLogTag() {
        return this.logTag;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC18559o abstractC18559oM53771c = AbstractC18559o.m53771c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC18559oM53771c, "inflate(...)");
        m25060P(abstractC18559oM53771c);
        View root = m25054J().getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17354m, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m25056L();
        getEventDispatcher().m128994I0("Load", AbstractC25247g0.m73989X(new C23465k(HMSTrackSource.SCREEN, "In App Gift Page")));
    }
}
