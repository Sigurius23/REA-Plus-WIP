package p078d1;

import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import com.stripe.android.core.exception.GenericStripeException;
import com.whoop.changepassword.view.ChangePasswordV2Fragment;
import com.whoop.health.view.HealthTabFragment;
import com.whoop.settings.TutorialsFragment;
import com.whoop.settings.WakeUpAutopopHeightTesterFragment;
import d20.C11496l;
import d30.C11535h;
import d30.C11568w;
import d30.C11570x;
import d30.C11574z;
import d51.C11716d;
import d80.AbstractC11769e;
import d80.C11765a;
import dc3.C11930o;
import dc3.InterfaceC11927l;
import dd1.C11958l;
import e31.AbstractC12610b;
import e31.C12611c;
import e40.InterfaceC12689c;
import e81.AbstractC12836k;
import fc0.AbstractC14363g;
import fc0.C14364h;
import g20.C15261g;
import g32.AbstractC15311k;
import g40.AbstractC15387m;
import g40.C15392n;
import gk2.C15929d;
import h20.C16687l;
import h20.C16698m4;
import h20.C16704n4;
import h20.C16710o4;
import h20.C16716p4;
import h20.C16722q4;
import h20.InterfaceC16728r4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import org.joda.time.DateTime;
import p102dy.C12438g;
import p132f0.C13775c0;
import p147ff.InterfaceC14422a;
import p159fy.C14858c;
import p163g1.AbstractC15108p2;
import p163g1.C15118q2;
import p180h0.C16435p;
import p180h0.C16477x1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38940r2;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: d1.i */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11456i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36750w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f36751x;

    public /* synthetic */ C11456i(Object obj, int i13) {
        this.f36750w = i13;
        this.f36751x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean z4;
        boolean z13;
        switch (this.f36750w) {
            case 0:
                Object systemService = ((View) ((C11457j) this.f36751x).f36753x).getContext().getSystemService("input_method");
                AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 1:
                return new BaseInputConnection(((C11462o) this.f36751x).f36778a, false);
            case 2:
                return ((C11496l) this.f36751x).f36964H;
            case 3:
                ((C11535h) this.f36751x).m30991a(C11574z.f37352b);
                return C23454a0.f92919a;
            case 4:
                C11570x c11570x = (C11570x) this.f36751x;
                boolean z14 = false;
                if (!c11570x.f37343a.isEmpty()) {
                    List list = c11570x.f37343a;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        z13 = true;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C16687l c16687l = (C16687l) it.next();
                                InterfaceC16728r4 interfaceC16728r4 = c16687l.f64179c;
                                if (interfaceC16728r4 instanceof C16698m4) {
                                    z4 = !c16687l.f64178b.m124364f();
                                } else if (interfaceC16728r4 instanceof C16704n4) {
                                    z4 = ((C16704n4) interfaceC16728r4).f64231a instanceof C38940r2;
                                } else {
                                    if (!(interfaceC16728r4 instanceof C16710o4) && !(interfaceC16728r4 instanceof C16716p4) && !AbstractC22676k.m65745e(interfaceC16728r4, C16722q4.f64264a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                if (!z4) {
                                    z13 = false;
                                }
                            } else {
                                z13 = true;
                            }
                        }
                    }
                    if (z13) {
                        z14 = true;
                    }
                }
                return Boolean.valueOf(z14);
            case 5:
                ((C11568w) this.f36751x).f37340k.invoke();
                return C23454a0.f92919a;
            case 6:
                return C11716d.m31307b((C11716d) this.f36751x);
            case 7:
                return AbstractC11769e.m31526r((C11765a) this.f36751x);
            case 8:
                return Integer.valueOf(C11958l.m32741e1((DateTime) this.f36751x));
            case 9:
                return ChangePasswordV2Fragment.m18422K((ChangePasswordV2Fragment) this.f36751x);
            case 10:
                return ((PassiveChallengeActivity) this.f36751x).f22145w;
            case 11:
                return ((C12438g) this.f36751x).f42371x;
            case 12:
                return AbstractC12610b.m35352i((C12611c) this.f36751x);
            case 13:
                return Float.valueOf(AbstractC12836k.m35974G((InterfaceC28690z0) this.f36751x));
            case 14:
                return TutorialsFragment.m25293I((TutorialsFragment) this.f36751x);
            case 15:
                return WakeUpAutopopHeightTesterFragment.m25303D((WakeUpAutopopHeightTesterFragment) this.f36751x);
            case 16:
                return HealthTabFragment.m21515E((HealthTabFragment) this.f36751x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                InterfaceC4339a interfaceC4339a = ((C13775c0) this.f36751x).f49145k0;
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                }
                return Boolean.TRUE;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(AbstractC14363g.m40989i((C14364h) this.f36751x));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "failed to resolve region from " + ((InterfaceC14422a) this.f36751x);
            case 20:
                return ((PassiveChallengeWarmerActivity) this.f36751x).f22148w;
            case 21:
                return ((C14858c) this.f36751x).f55483x;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Float.valueOf(((C15118q2) this.f36751x).m43179a().mo743q0(AbstractC15108p2.f56603b));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                try {
                    byte[] bArrDecode = Base64.decode(((C15261g) this.f36751x).f57293E, 0);
                    AbstractC22676k.m65747g(bArrDecode);
                    List listM125906y0 = AbstractC39414r.m125906y0(new String(bArrDecode, AbstractC39397a.f169546a), new String[]{":"}, 6);
                    return listM125906y0.size() != 2 ? new C23468n(AbstractC34132o.m107888l(new GenericStripeException("invalidHashedValueIncorrectFormat", new IllegalArgumentException("Invalid hashed value! Please provided a hashed payment intent in the correct format!")))) : new C23468n(new C23465k(listM125906y0.get(0), listM125906y0.get(1)));
                } catch (IllegalArgumentException e5) {
                    return new C23468n(AbstractC34132o.m107888l(new GenericStripeException("invalidHashedValueNotBase64", new IllegalArgumentException("Invalid hashed value! Please provided a hashed payment intent in the correct format!", e5))));
                }
            case 24:
                return AbstractC15311k.m43494w((Window) this.f36751x);
            case 25:
                ((InterfaceC12689c) ((AbstractC15387m) this.f36751x)).mo35500h().invoke();
                return C23454a0.f92919a;
            case 26:
                InterfaceC4339a interfaceC4339a2 = ((C15392n) this.f36751x).f57837a;
                if (interfaceC4339a2 != null) {
                    interfaceC4339a2.invoke();
                }
                return C23454a0.f92919a;
            case 27:
                return C15929d.m44975r((C15929d) this.f36751x);
            case 28:
                return ((C16435p) this.f36751x).m46613c();
            default:
                return (C16477x1) C11930o.m32226a(((InterfaceC11927l) this.f36751x).mo32205f());
        }
    }
}
