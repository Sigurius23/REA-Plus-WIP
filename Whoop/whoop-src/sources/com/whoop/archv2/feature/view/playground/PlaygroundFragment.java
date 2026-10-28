package com.whoop.archv2.feature.view.playground;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.MetricEventModel;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.navigation.models.GenericInteraction;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21467g;
import java.util.List;
import java.util.Set;
import kd1.AbstractC22387b0;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import p114eb.C12997x0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wi0.AbstractC37313e;
import wi0.C37309a;
import wi0.C37310b;
import wi0.C37311c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "endpointPath", "", "isCacheEnabled", "Ll83/a0;", "D", "(Ljava/lang/String;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getNavigator", "()Lj02/o0;", "navigator", "Lwi0/c;", "x", "C", "()Lwi0/c;", "playgroundPreferences", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PlaygroundFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h playgroundPreferences;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.playground.PlaygroundFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6021a extends C22672i implements Function1 {
        public C6021a(Object obj) {
            super(1, 0, C37311c.class, obj, "deleteEndpoint", "deleteEndpoint(Ljava/lang/String;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m18083a(String p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C37311c) this.receiver).m119488b(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18083a((String) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.playground.PlaygroundFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6022b extends C22672i implements InterfaceC4339a {
        public C6022b(Object obj) {
            super(0, 0, C37311c.class, obj, "clearRecentEndpoints", "clearRecentEndpoints()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134150invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134150invoke() {
            ((C37311c) this.receiver).m119487a();
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.playground.PlaygroundFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6023c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24058w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24059x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24060y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6023c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24058w = componentCallbacks;
            this.f24059x = interfaceC35951a;
            this.f24060y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f24058w;
            InterfaceC35951a interfaceC35951a = this.f24059x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24060y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.playground.PlaygroundFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6024d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24063y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6024d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24061w = componentCallbacks;
            this.f24062x = interfaceC35951a;
            this.f24063y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wi0.c] */
        @Override // c93.InterfaceC4339a
        public final C37311c invoke() {
            ComponentCallbacks componentCallbacks = this.f24061w;
            InterfaceC35951a interfaceC35951a = this.f24062x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24063y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37311c.class), interfaceC35951a);
        }
    }

    public PlaygroundFragment() {
        C37310b c37310b = new C37310b(this, 0);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C6023c(this, null, c37310b));
        this.playgroundPreferences = AbstractC30060g.m92087G(enumC23463i, new C6024d(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final C37311c m18075C() {
        return (C37311c) this.playgroundPreferences.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    private final void m18076D(String endpointPath, boolean isCacheEnabled) {
        Object[] objArr = 0 == true ? 1 : 0;
        MetricEventModel metricEventModel = null;
        GenericInteraction genericInteraction = null;
        C12997x0 c12997x0 = null;
        List list = null;
        List list2 = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        getNavigator().mo59393b(new AbstractC21155m0.m1(new ApiRequest(endpointPath, GenericHttpMethod.GET, (JsonElement) null, 4, (DefaultConstructorMarker) null), new GenericCachePolicy(isCacheEnabled, (String) objArr, (Set) null, 6, (DefaultConstructorMarker) null), objArr2, objArr4, metricEventModel, objArr3, genericInteraction, c12997x0, list, list2, 1020, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C34911a m18077E(PlaygroundFragment playgroundFragment) {
        return AbstractC15751g.m44431K(playgroundFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m18078F(PlaygroundFragment playgroundFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            List<String> listM119489c = playgroundFragment.m18075C().m119489c();
            String str = (String) AbstractC25265s.m74100H0(listM119489c);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean zM87157i = c28655q.m87157i(playgroundFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C37309a(playgroundFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R;
            C37311c c37311cM18075C = playgroundFragment.m18075C();
            boolean zM87157i2 = c28655q.m87157i(c37311cM18075C);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C6021a(c37311cM18075C);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R2);
            C37311c c37311cM18075C2 = playgroundFragment.m18075C();
            boolean zM87157i3 = c28655q.m87157i(c37311cM18075C2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C6022b(c37311cM18075C2);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R3);
            boolean zM87157i4 = c28655q.m87157i(playgroundFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C37310b(playgroundFragment, 1);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC37313e.m119520p(str2, false, listM119489c, interfaceC4351m, function1, interfaceC4339a, (InterfaceC4339a) objM87133R4, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m18079G(PlaygroundFragment playgroundFragment, String endpointPath, boolean z4) {
        AbstractC22676k.m65750j(endpointPath, "endpointPath");
        playgroundFragment.m18075C().m119490e(endpointPath);
        playgroundFragment.m18076D(endpointPath, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m18080H(PlaygroundFragment playgroundFragment) {
        AbstractC5583n.m16799z(playgroundFragment).m36410z();
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C37309a(this, 0), true, -50141533));
    }
}
