package mp0;

import android.content.ComponentCallbacks;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import c93.InterfaceC4339a;
import ge3.AbstractC15751g;
import hj0.AbstractC17354m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.connection.degredation.C24117a;
import or2.C28205u0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mp0.k0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, m65681d2 = {"Lmp0/k0;", "Lhj0/m;", "<init>", "()V", "Lmp0/b1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "F", "()Lmp0/b1;", "conductorViewModel", "", "x", "Z", "getShowBottomNavigationBar", "()Z", "showBottomNavigationBar", "Lor2/u0;", "y", "G", "()Lor2/u0;", "localizedDateTimeFormatter", "H", "isUsing24HourFormat", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25837k0 extends AbstractC17354m {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final boolean showBottomNavigationBar;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h conductorViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(this, null, new b(this), null));

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter = AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(this, null, new C24117a(this, 14)));

    /* JADX INFO: renamed from: mp0.k0$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f101770w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101771x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101772y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f101770w = componentCallbacks;
            this.f101771x = interfaceC35951a;
            this.f101772y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f101770w;
            InterfaceC35951a interfaceC35951a = this.f101771x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f101772y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: mp0.k0$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101773w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f101773w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.f101773w.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity()");
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.f101773w.requireActivity();
            C1579e2 viewModelStore = abstractActivityC1340r0RequireActivity.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, abstractActivityC1340r0RequireActivity2);
        }
    }

    /* JADX INFO: renamed from: mp0.k0$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f101774w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f101775x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f101776y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f101777z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f101774w = abstractComponentCallbacksC1320m0;
            this.f101775x = interfaceC35951a;
            this.f101776y = interfaceC4339a;
            this.f101777z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, mp0.b1] */
        @Override // c93.InterfaceC4339a
        public final C25819b1 invoke() {
            return AbstractC37056f.m118952D(this.f101774w, this.f101775x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25819b1.class), this.f101776y, this.f101777z);
        }
    }

    /* JADX INFO: renamed from: G */
    private final C28205u0 m76280G() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m76281I(AbstractC25837k0 abstractC25837k0) {
        return AbstractC15751g.m44431K(abstractC25837k0.requireContext());
    }

    /* JADX INFO: renamed from: F */
    public final C25819b1 m76282F() {
        return (C25819b1) this.conductorViewModel.getValue();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m76283H() {
        return m76280G().m85383l();
    }

    @Override // hj0.AbstractC17354m
    public boolean getShowBottomNavigationBar() {
        return this.showBottomNavigationBar;
    }
}
