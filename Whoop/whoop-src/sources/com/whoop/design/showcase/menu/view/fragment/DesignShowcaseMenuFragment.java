package com.whoop.design.showcase.menu.view.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.showcase.menu.view.fragment.DesignShowcaseMenuFragment;
import com.whoop.design.showcase.navigation.DesignShowcaseAtomicType;
import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import com.whoop.design.showcase.navigation.DesignShowcaseNavigationEvent;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f91.C14287e;
import fd1.C14399a;
import fd1.C14400b;
import fd1.C14402d;
import fy1.C14873i;
import ge3.AbstractC15751g;
import hd1.AbstractC17198b;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import id1.AbstractC18411b;
import id1.C18412c;
import id1.C18414e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.C2384h2;
import p114eb.C12962i;
import p114eb.InterfaceC12981p0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import uf3.C34911a;
import uv0.AbstractC35283c;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import xc1.AbstractC38187a;
import y71.C39274g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R!\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b.\u0010,¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/design/showcase/menu/view/fragment/DesignShowcaseMenuFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lcom/whoop/design/atomic/organism/toolbar/d;", "S", "()Lcom/whoop/design/atomic/organism/toolbar/d;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "galleryType", "Ll83/a0;", "I", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)V", "J", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "menuType", "K", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)V", "Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;", "atomicType", "L", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lfd1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leb/i;", "E", "()Lfd1/d;", "args", "Lid1/c;", "x", "Ll83/h;", "G", "()Lid1/c;", "viewModel", "", "F", "()Z", "dedicatedApp", "H", "isRoot", "Lid1/e;", "state", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignShowcaseMenuFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14402d.class), new C8683a(this));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.DesignShowcaseMenuFragment$a */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8683a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f25874w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8683a(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f25874w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f25874w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f25874w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.DesignShowcaseMenuFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8684b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25875w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8684b(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25875w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25875w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.DesignShowcaseMenuFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8685c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25876w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25877x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25878y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25879z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8685c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25876w = componentCallbacks;
            this.f25877x = interfaceC35951a;
            this.f25878y = interfaceC4339a;
            this.f25879z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, id1.c<com.whoop.design.showcase.navigation.DesignShowcaseMenuType>] */
        @Override // c93.InterfaceC4339a
        public final C18412c<DesignShowcaseMenuType> invoke() {
            return AbstractC34132o.m107857B(this.f25876w, this.f25877x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18412c.class), this.f25878y, this.f25879z);
        }
    }

    public DesignShowcaseMenuFragment() {
        C35953c c35953cM40816e = C14287e.f52149a.m40816e();
        C14399a c14399a = new C14399a(this, 0);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8685c(this, c35953cM40816e, new C8684b(this), c14399a));
    }

    /* JADX INFO: renamed from: E */
    private final C14402d m21224E() {
        return (C14402d) this.args.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final C18412c<DesignShowcaseMenuType> m21225G() {
        return (C18412c) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final void m21226I(DesignShowcaseGalleryType galleryType) {
        AbstractC8686a.b bVarM21243b = AbstractC8686a.m21243b();
        bVarM21243b.m21249c(galleryType);
        AbstractC28163g0.m85259o(this).m85340f(bVarM21243b);
    }

    /* JADX INFO: renamed from: J */
    private final void m21227J() {
        InterfaceC12981p0 interfaceC12981p0M21244c = AbstractC8686a.m21244c();
        AbstractC22676k.m65749i(interfaceC12981p0M21244c, "actionDesignShowcaseMenuToLegacyGallery(...)");
        AbstractC28163g0.m85259o(this).m85340f(interfaceC12981p0M21244c);
    }

    /* JADX INFO: renamed from: K */
    private final void m21228K(DesignShowcaseMenuType menuType) {
        AbstractC8686a.c cVarM21245d = AbstractC8686a.m21245d();
        cVarM21245d.m21251c(menuType);
        AbstractC28163g0.m85259o(this).m85340f(cVarM21245d);
    }

    /* JADX INFO: renamed from: L */
    private final void m21229L(DesignShowcaseAtomicType atomicType) {
        AbstractC8686a.a aVarM21242a = AbstractC8686a.m21242a();
        aVarM21242a.m21247c(atomicType);
        AbstractC28163g0.m85259o(this).m85340f(aVarM21242a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m21230M(DesignShowcaseMenuFragment designShowcaseMenuFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, C14873i.f55508a, null, null, AbstractC37817c.m121344e(-574308838, c28655q, new C14400b(designShowcaseMenuFragment, 1)), c28655q, (C14873i.f55509b << 3) | 24576, 13);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m21231N(final DesignShowcaseMenuFragment designShowcaseMenuFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(designShowcaseMenuFragment.m21225G().getViewState(), c28655q, 0);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            AbstractC6721d abstractC6721dM21236S = designShowcaseMenuFragment.m21236S();
            boolean zM87157i = c28655q.m87157i(designShowcaseMenuFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C14399a(designShowcaseMenuFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, abstractC6721dM21236S, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.f25640b << 3, 53);
            Modifier modifierM3394p = AbstractC1099a.m3394p(8, c2314t);
            TextResource textResourceM52997c = m21232O(interfaceC28601c1M87261o).getSearchQuery();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Search Components");
            boolean zM87157i2 = c28655q.m87157i(designShowcaseMenuFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(designShowcaseMenuFragment) { // from class: fd1.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ DesignShowcaseMenuFragment f52552x;

                    {
                        this.f52552x = designShowcaseMenuFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return DesignShowcaseMenuFragment.m21234Q(this.f52552x, obj);
                            default:
                                return DesignShowcaseMenuFragment.m21235R(this.f52552x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            int i15 = TextResource.$stable;
            AbstractC17795v0.m51127j(modifierM3394p, textResourceM52997c, textResourceM21278l, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R2, c28655q, (i15 << 3) | 6 | (i15 << 6), 0, 16376);
            C18414e c18414eM21232O = m21232O(interfaceC28601c1M87261o);
            boolean zM87157i3 = c28655q.m87157i(designShowcaseMenuFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i16 = 1;
                objM87133R3 = new Function1(designShowcaseMenuFragment) { // from class: fd1.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ DesignShowcaseMenuFragment f52552x;

                    {
                        this.f52552x = designShowcaseMenuFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return DesignShowcaseMenuFragment.m21234Q(this.f52552x, obj);
                            default:
                                return DesignShowcaseMenuFragment.m21235R(this.f52552x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC17198b.m48557e(c18414eM21232O, (Function1) objM87133R3, c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    private static final C18414e m21232O(InterfaceC28670t2 interfaceC28670t2) {
        return (C18414e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m21233P(DesignShowcaseMenuFragment designShowcaseMenuFragment) {
        AbstractC28163g0.m85259o(designShowcaseMenuFragment).m85343i();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m21234Q(DesignShowcaseMenuFragment designShowcaseMenuFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            designShowcaseMenuFragment.m21225G().m52993l(new AbstractC18411b.b(""));
        } else if (event instanceof AbstractC17801x0.c) {
            designShowcaseMenuFragment.m21225G().m52993l(new AbstractC18411b.b(((AbstractC17801x0.c) event).getNewText()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m21235R(DesignShowcaseMenuFragment designShowcaseMenuFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof DesignShowcaseNavigationEvent.PresentGallery) {
            designShowcaseMenuFragment.m21226I(((DesignShowcaseNavigationEvent.PresentGallery) event).getType());
        } else if (event instanceof DesignShowcaseNavigationEvent.PresentLegacyGallery) {
            designShowcaseMenuFragment.m21227J();
        } else if (event instanceof DesignShowcaseNavigationEvent.PresentMenu) {
            designShowcaseMenuFragment.m21228K(((DesignShowcaseNavigationEvent.PresentMenu) event).getType());
        } else if (event instanceof DesignShowcaseNavigationEvent.PresentAtomicGallery) {
            designShowcaseMenuFragment.m21229L(((DesignShowcaseNavigationEvent.PresentAtomicGallery) event).getType());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    private final AbstractC6721d m21236S() {
        C39274g c39274g = (m21240F() && m21241H()) ? null : new C39274g(C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward(), AbstractC8693b.m21277k(AbstractC35283c.f150167E));
        AbstractC6721d.a aVarM20173a = AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(m21224E().m41046a().getTitle()));
        return aVarM20173a.m20156a((32763 & 1) != 0 ? aVarM20173a.title : null, (32763 & 2) != 0 ? aVarM20173a.subtitle : null, (32763 & 4) != 0 ? aVarM20173a.leftIcon : c39274g, (32763 & 8) != 0 ? aVarM20173a.rightIcon : null, (32763 & 16) != 0 ? aVarM20173a.leftIconButtonType : null, (32763 & 32) != 0 ? aVarM20173a.rightIconButtonType : null, (32763 & 64) != 0 ? aVarM20173a.shouldKeepOriginalIconColor : false, (32763 & 128) != 0 ? aVarM20173a.rightIconView : null, (32763 & 256) != 0 ? aVarM20173a.rightIconColor : null, (32763 & 512) != 0 ? aVarM20173a.leftIconColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVarM20173a.titleColor : null, (32763 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVarM20173a.subtitleColor : null, (32763 & 4096) != 0 ? aVarM20173a.tag : null, (32763 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVarM20173a.titleAutomationTag : null, (32763 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? aVarM20173a.leftIconAutomationTag : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C34911a m21237T(DesignShowcaseMenuFragment designShowcaseMenuFragment) {
        return AbstractC15751g.m44431K(designShowcaseMenuFragment.m21224E().m41046a());
    }

    /* JADX INFO: renamed from: F */
    public final boolean m21240F() {
        return getResources().getBoolean(AbstractC38187a.f163505a);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m21241H() {
        return m21224E().m41046a() == DesignShowcaseMenuType.ROOT;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        Context contextRequireContext = requireContext();
        AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setViewCompositionStrategy(C2384h2.f9434x);
        composeView.setContent(new C37816b(new C14400b(this, 0), true, 825188447));
        return composeView;
    }
}
