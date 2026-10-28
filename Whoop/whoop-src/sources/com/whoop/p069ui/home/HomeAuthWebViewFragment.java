package com.whoop.p069ui.home;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.C21148j;
import j02.InterfaceC21159o0;
import jp1.C21859k;
import kd1.AbstractC22387b0;
import kd1.AbstractC22390d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o02.InterfaceC27353d;
import od1.C27858u;
import or2.AbstractC28188o1;
import or2.C28159f;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p114eb.C12962i;
import p161g.C14923z;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import sm2.C32717b;
import sm2.C32718c;
import sm2.C32719d;
import sr2.AbstractC32943y;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import y92.C39352a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0011\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b-\u00102R\u001b\u00108\u001a\u0002048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b6\u00107¨\u00069"}, m65681d2 = {"Lcom/whoop/ui/home/HomeAuthWebViewFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Ll83/a0;", "J", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lzr2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "E", "()Lzr2/a;", "dateProvider", "Lod1/u;", "x", "I", "()Lod1/u;", "userContext", "Ly92/a;", "y", "C", "()Ly92/a;", "authManager", "Lsr2/y;", "z", "H", "()Lsr2/y;", "urlProvider", "Lor2/f;", "D", "()Lor2/f;", "authenticatedWebViewHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "F", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/o0;", "G", "getNavigator", "()Lj02/o0;", "navigator", "Lo02/d;", "()Lo02/d;", "navigationReducer", "Lsm2/d;", "Leb/i;", "B", "()Lsm2/d;", "args", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class HomeAuthWebViewFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h authenticatedWebViewHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h navigationReducer;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h dateProvider;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h userContext;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h authManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h urlProvider;

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10541a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31999w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32000x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32001y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10541a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31999w = componentCallbacks;
            this.f32000x = interfaceC35951a;
            this.f32001y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f31999w;
            InterfaceC35951a interfaceC35951a = this.f32000x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32001y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10542b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32002w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32003x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32004y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10542b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32002w = componentCallbacks;
            this.f32003x = interfaceC35951a;
            this.f32004y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.u] */
        @Override // c93.InterfaceC4339a
        public final C27858u invoke() {
            ComponentCallbacks componentCallbacks = this.f32002w;
            InterfaceC35951a interfaceC35951a = this.f32003x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32004y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27858u.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10543c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32005w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32006x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32007y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10543c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32005w = componentCallbacks;
            this.f32006x = interfaceC35951a;
            this.f32007y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, y92.a] */
        @Override // c93.InterfaceC4339a
        public final C39352a invoke() {
            ComponentCallbacks componentCallbacks = this.f32005w;
            InterfaceC35951a interfaceC35951a = this.f32006x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32007y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39352a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10544d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32008w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32009x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32010y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10544d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32008w = componentCallbacks;
            this.f32009x = interfaceC35951a;
            this.f32010y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, sr2.y] */
        @Override // c93.InterfaceC4339a
        public final AbstractC32943y invoke() {
            ComponentCallbacks componentCallbacks = this.f32008w;
            InterfaceC35951a interfaceC35951a = this.f32009x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32010y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC32943y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10545e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32011w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32012x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32013y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10545e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32011w = componentCallbacks;
            this.f32012x = interfaceC35951a;
            this.f32013y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.f] */
        @Override // c93.InterfaceC4339a
        public final C28159f invoke() {
            ComponentCallbacks componentCallbacks = this.f32011w;
            InterfaceC35951a interfaceC35951a = this.f32012x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32013y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28159f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10546f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32014w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32015x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32016y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10546f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32014w = componentCallbacks;
            this.f32015x = interfaceC35951a;
            this.f32016y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32014w;
            InterfaceC35951a interfaceC35951a = this.f32015x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32016y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10547g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32017w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32018x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32019y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10547g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32017w = componentCallbacks;
            this.f32018x = interfaceC35951a;
            this.f32019y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32017w;
            InterfaceC35951a interfaceC35951a = this.f32018x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32019y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10548h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32020w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32021x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32022y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10548h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32020w = componentCallbacks;
            this.f32021x = interfaceC35951a;
            this.f32022y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            ComponentCallbacks componentCallbacks = this.f32020w;
            InterfaceC35951a interfaceC35951a = this.f32021x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32022y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.HomeAuthWebViewFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10549i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f32023w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10549i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f32023w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f32023w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f32023w, " has null arguments"));
        }
    }

    public HomeAuthWebViewFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateProvider = AbstractC30060g.m92087G(enumC23463i, new C10541a(this, null, null));
        this.userContext = AbstractC30060g.m92087G(enumC23463i, new C10542b(this, new C35953c("userContext"), null));
        this.authManager = AbstractC30060g.m92087G(enumC23463i, new C10543c(this, null, null));
        this.urlProvider = AbstractC30060g.m92087G(enumC23463i, new C10544d(this, null, null));
        this.authenticatedWebViewHelper = AbstractC30060g.m92087G(enumC23463i, new C10545e(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10546f(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10547g(this, null, new C32718c(this, 0)));
        this.navigationReducer = AbstractC30060g.m92087G(enumC23463i, new C10548h(this, null, null));
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32719d.class), new C10549i(this));
    }

    /* JADX INFO: renamed from: C */
    private final C39352a m27219C() {
        return (C39352a) this.authManager.getValue();
    }

    /* JADX INFO: renamed from: D */
    private final C28159f m27220D() {
        return (C28159f) this.authenticatedWebViewHelper.getValue();
    }

    /* JADX INFO: renamed from: E */
    private final InterfaceC41070a m27221E() {
        return (InterfaceC41070a) this.dateProvider.getValue();
    }

    /* JADX INFO: renamed from: F */
    private final FeatureFlagChecker m27222F() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC27353d m27223G() {
        return (InterfaceC27353d) this.navigationReducer.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final AbstractC32943y m27224H() {
        return (AbstractC32943y) this.urlProvider.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C27858u m27225I() {
        return (C27858u) this.userContext.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final void m27226J() {
        C14923z onBackPressedDispatcher;
        AbstractC21155m0 abstractC21155m0M102675d = C32717b.f136014a.m102675d(m27232B().m102680e(), m27223G());
        if (abstractC21155m0M102675d != null) {
            getNavigator().mo59393b(abstractC21155m0M102675d);
            return;
        }
        AbstractActivityC1340r0 activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.m43018d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C34911a m27227K(HomeAuthWebViewFragment homeAuthWebViewFragment) {
        return AbstractC15751g.m44431K(homeAuthWebViewFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m27228L(String str, HomeAuthWebViewFragment homeAuthWebViewFragment, C21148j c21148j, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(str);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = homeAuthWebViewFragment.m27220D().m85210a(str);
                c28655q.m87172p0(objM87133R);
            }
            String str2 = (String) objM87133R;
            InterfaceC41070a interfaceC41070aM27221E = homeAuthWebViewFragment.m27221E();
            C27858u c27858uM27225I = homeAuthWebViewFragment.m27225I();
            C39352a c39352aM27219C = homeAuthWebViewFragment.m27219C();
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62253K, c28655q, 0);
            boolean zM87157i = c28655q.m87157i(homeAuthWebViewFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C32718c(homeAuthWebViewFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22390d.m64426r(interfaceC41070aM27221E, c27858uM27225I, c39352aM27219C, null, str2, strM21273g, c21148j, (InterfaceC4339a) objM87133R2, c28655q, C21148j.f80231e << 18, 8);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m27229M(HomeAuthWebViewFragment homeAuthWebViewFragment) {
        homeAuthWebViewFragment.m27226J();
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: B */
    public final C32719d m27232B() {
        return (C32719d) this.args.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) throws Exception {
        String strValueOf;
        AbstractC22676k.m65750j(inflater, "inflater");
        if (AbstractC22676k.m65745e(m27232B().m102682g(), "checkout") && m27222F().isFeatureEnabled(FeatureFlagRepositoryKt.AUTH_WEB_VIEW_UPGRADE_SUPPORT)) {
            strValueOf = m27224H().getCheckoutBaseUrl();
        } else if (AbstractC28188o1.m85314d(m27232B().m102681f())) {
            strValueOf = AbstractC2875y.m8299l(m27224H().getWebBaseUrl(), m27232B().m102681f());
        } else {
            if (!AbstractC28188o1.m85314d(m27232B().m102682g())) {
                throw new Exception("AuthWebView is missing pathUrl and url params");
            }
            strValueOf = String.valueOf(m27232B().m102682g());
        }
        String strM102679d = m27232B().m102679d();
        String strM102678c = m27232B().m102678c();
        String strM102676a = m27232B().m102676a();
        String strM102677b = m27232B().m102677b();
        return AbstractC22387b0.m64387c(this, new C37816b(new C21859k(strValueOf, this, (strM102679d == null || strM102678c == null || strM102676a == null || strM102677b == null) ? null : new C21148j(strM102679d, strM102678c, strM102676a, strM102677b), 21), true, 1294111012));
    }
}
