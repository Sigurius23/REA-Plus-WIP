package com.whoop.settings;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.p069ui.AbstractC10537e;
import com.whoop.p069ui.C10464d;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gc2.EnumC15710a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p078d1.C11456i;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p705ea2.AbstractC12920q;
import p705ea2.AbstractC12921r;
import p705ea2.C12903e0;
import p705ea2.C12905f0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b/\u00100R\u001b\u00103\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b2\u00100R\u001b\u00105\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b4\u00100¨\u00066"}, m65681d2 = {"Lcom/whoop/settings/TutorialsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "initViews", "Lgc2/a;", "tile", "Landroid/view/View;", "M", "(Lgc2/a;)Landroid/view/View;", "J", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Ltr2/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "log", "Lea2/f0;", "x", "Ll83/h;", "G", "()Lea2/f0;", "viewModel", "Lj02/o0;", "y", "getNavigator", "()Lj02/o0;", "navigator", "Lcom/whoop/ui/WhoopNewToolbar;", "z", "Lcom/whoop/ui/d;", "F", "()Lcom/whoop/ui/WhoopNewToolbar;", "tutorialToolbar", "E", "()Landroid/view/ViewGroup;", "tutorialRootContainer", "C", "strapTutorialsMavHowToLayout", "D", "strapTutorialsMavPairLayout", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TutorialsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: H */
    static final /* synthetic */ InterfaceC21493z[] f30301H;

    /* JADX INFO: renamed from: I */
    public static final int f30302I;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n log = InterfaceC34116n.INSTANCE.m107848a("TutorialsFragment");

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10085d(this, null, new C10084c(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C10083b(this, null, new C11456i(this, 14)));

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C10464d tutorialToolbar = AbstractC10537e.m27174c(this, AbstractC12920q.f44543u0, null, 2, null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C10464d tutorialRootContainer = AbstractC10537e.m27174c(this, AbstractC12920q.f44541t0, null, 2, null);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C10464d strapTutorialsMavHowToLayout = AbstractC10537e.m27174c(this, AbstractC12920q.f44531o0, null, 2, null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C10464d strapTutorialsMavPairLayout = AbstractC10537e.m27174c(this, AbstractC12920q.f44533p0, null, 2, null);

    /* JADX INFO: renamed from: com.whoop.settings.TutorialsFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10082a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30310a;

        static {
            int[] iArr = new int[EnumC15710a.values().length];
            try {
                iArr[EnumC15710a.HOW_TO_WEAR_YOUR_WHOOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC15710a.PAIRING_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30310a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.TutorialsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10083b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30311w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30312x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30313y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10083b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30311w = componentCallbacks;
            this.f30312x = interfaceC35951a;
            this.f30313y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30311w;
            InterfaceC35951a interfaceC35951a = this.f30312x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30313y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.TutorialsFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10084c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30314w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10084c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30314w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30314w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.TutorialsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10085d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30315w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30316x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30317y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30318z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10085d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30315w = componentCallbacks;
            this.f30316x = interfaceC35951a;
            this.f30317y = interfaceC4339a;
            this.f30318z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ea2.f0] */
        @Override // c93.InterfaceC4339a
        public final C12905f0 invoke() {
            return AbstractC34132o.m107857B(this.f30315w, this.f30316x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12905f0.class), this.f30317y, this.f30318z);
        }
    }

    static {
        C22693x c22693x = new C22693x(TutorialsFragment.class, "tutorialToolbar", "getTutorialToolbar()Lcom/whoop/ui/WhoopNewToolbar;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f30301H = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(TutorialsFragment.class, "tutorialRootContainer", "getTutorialRootContainer()Landroid/view/ViewGroup;", 0, c22673i0), AbstractC31061c.m95632h(TutorialsFragment.class, "strapTutorialsMavHowToLayout", "getStrapTutorialsMavHowToLayout()Landroid/view/ViewGroup;", 0, c22673i0), AbstractC31061c.m95632h(TutorialsFragment.class, "strapTutorialsMavPairLayout", "getStrapTutorialsMavPairLayout()Landroid/view/ViewGroup;", 0, c22673i0)};
        f30302I = 8;
    }

    /* JADX INFO: renamed from: C */
    private final ViewGroup m25287C() {
        return (ViewGroup) this.strapTutorialsMavHowToLayout.getValue(this, f30301H[2]);
    }

    /* JADX INFO: renamed from: D */
    private final ViewGroup m25288D() {
        return (ViewGroup) this.strapTutorialsMavPairLayout.getValue(this, f30301H[3]);
    }

    /* JADX INFO: renamed from: E */
    private final ViewGroup m25289E() {
        return (ViewGroup) this.tutorialRootContainer.getValue(this, f30301H[1]);
    }

    /* JADX INFO: renamed from: F */
    private final WhoopNewToolbar m25290F() {
        return (WhoopNewToolbar) this.tutorialToolbar.getValue(this, f30301H[0]);
    }

    /* JADX INFO: renamed from: G */
    private final C12905f0 m25291G() {
        return (C12905f0) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m25292H(TutorialsFragment tutorialsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(tutorialsFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m25293I(TutorialsFragment tutorialsFragment) {
        return AbstractC15751g.m44431K(tutorialsFragment.requireActivity());
    }

    /* JADX INFO: renamed from: J */
    private final void m25294J() {
        AbstractC1953c.m5963a(m25287C(), new C12903e0(this, 1));
        AbstractC1953c.m5963a(m25288D(), new C12903e0(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m25295K(TutorialsFragment tutorialsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        tutorialsFragment.m25291G().m36308l("HOW_TO_WEAR_EDUCATION", tutorialsFragment.getNavigator());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m25296L(TutorialsFragment tutorialsFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        tutorialsFragment.m25291G().m36308l("PAIRING_MODE_EDUCATION", tutorialsFragment.getNavigator());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private final View m25297M(EnumC15710a tile) {
        int i13 = C10082a.f30310a[tile.ordinal()];
        if (i13 == 1) {
            return m25287C();
        }
        if (i13 != 2) {
            return null;
        }
        return m25288D();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    private final void initViews() {
        m25290F().m26687n(new C12903e0(this, 0));
        m25294J();
        for (EnumC15710a enumC15710a : EnumC15710a.getEntries()) {
            View viewM25297M = m25297M(enumC15710a);
            if (viewM25297M != null) {
                viewM25297M.setVisibility(m25291G().m36307j(enumC15710a) ? 0 : 8);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        View viewInflate = inflater.inflate(AbstractC12921r.f44551c, container, false);
        AbstractC22676k.m65749i(viewInflate, "inflate(...)");
        return viewInflate;
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
        AbstractC28163g0.m85252h(this, view, AbstractC37056f.m118958J(m25290F()), AbstractC37056f.m118958J(m25289E()), 0, 0, 24, null);
        initViews();
    }
}
