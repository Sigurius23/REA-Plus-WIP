package p465rm;

import a20.C0168h;
import al0.C0971f;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IInterface;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bh3.InterfaceC3260g;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mapbox.common.location.GetLocationCallback;
import com.mapbox.common.location.Location;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.CameraState;
import com.stripe.android.view.CardNumberEditText;
import com.whoop.community.CommunityFragment;
import com.whoop.community.CommunityShowInviteFragment;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import in.C18715c;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.edit.internal.EditReactionsView;
import k83.InterfaceC22297a;
import mo.C25737r;
import p073cq.InterfaceC11035d;
import p073cq.InterfaceC11037f;
import p097ds.C12320w;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p309lo.AbstractC24567y;
import p309lo.C24548f;
import p309lo.InterfaceC24550h;
import p309lo.InterfaceC24551i;
import p377or.C28134h;
import p377or.InterfaceC28139m;
import p499t9.C33653v;
import p499t9.InterfaceC33626e;
import p537ux.C35331f0;
import p537ux.C35362x;
import p537ux.C35363y;
import p546v7.C35752b;
import p588wm.InterfaceC37360b;
import p607x8.AbstractC38065t;
import p627xv.C38666g;
import p658yr.InterfaceC39718e;
import p673z7.InterfaceC40139c;
import p692zt.AbstractC41122z;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.AbstractC31698u0;
import rq0.C31668g1;
import rq0.C31671h1;
import rq0.C31708z0;
import sg2.C32451b;
import sm.C32708a;
import sm.C32711d;
import so.C32784a;
import t23.C33413k3;
import t30.InterfaceC33524z;
import u93.C34671d0;
import va3.AbstractC35854l;
import xp0.C38519p;

/* JADX INFO: renamed from: rm.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C31559p implements InterfaceC24550h, InterfaceC16915u, InterfaceC3260g, GetLocationCallback, InterfaceC22297a, InterfaceC24551i, InterfaceC2339e, InterfaceC33524z, InterfaceC11037f, ReactionClickListener, InterfaceC28139m, CameraChangedCoalescedCallback, InterfaceC33626e, InterfaceC37360b, InterfaceC39718e, InterfaceC40139c, InterfaceC11035d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130336w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f130337x;

    public /* synthetic */ C31559p(Object obj, int i13) {
        this.f130336w = i13;
        this.f130337x = obj;
    }

    @Override // p309lo.InterfaceC24551i
    /* JADX INFO: renamed from: a */
    public void mo71596a(Object obj, C24548f c24548f) {
        SparseBooleanArray sparseBooleanArray = c24548f.f95817a;
        C32711d c32711d = (C32711d) this.f130337x;
        if (obj != null) {
            throw new ClassCastException();
        }
        SparseArray sparseArray = c32711d.f135986E;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            int iM71595a = c24548f.m71595a(i13);
            C32708a c32708a = (C32708a) sparseArray.get(iM71595a);
            c32708a.getClass();
            sparseArray2.append(iM71595a, c32708a);
        }
        throw null;
    }

    @Override // p658yr.InterfaceC39718e
    public Object apply(Object obj) {
        C35752b c35752b = (C35752b) this.f130337x;
        c35752b.getClass();
        c35752b.f152042e = ((Integer) obj).intValue();
        return Integer.valueOf(c35752b.f152042e);
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return C31671h1.m98007S((C31668g1) this.f130337x, obj);
    }

    @Override // p673z7.InterfaceC40139c
    /* JADX INFO: renamed from: c */
    public void mo93346c(IInterface iInterface, C12320w c12320w) {
        ((C35331f0) this.f130337x).getClass();
        c12320w.m34349l(C35331f0.m112187b(iInterface));
    }

    @Override // p499t9.InterfaceC33626e
    /* JADX INFO: renamed from: d */
    public long mo79414d(long j7) {
        switch (this.f130336w) {
            case 20:
                C33653v c33653v = (C33653v) this.f130337x;
                return AbstractC38065t.m121915h((j7 * ((long) c33653v.f140448f)) / 1000000, 0L, c33653v.f140453k - 1);
            default:
                C33653v c33653v2 = (C33653v) this.f130337x;
                return AbstractC24567y.m71678i((j7 * ((long) c33653v2.f140448f)) / 1000000, 0L, c33653v2.f140453k - 1);
        }
    }

    @Override // p377or.InterfaceC28139m
    /* JADX INFO: renamed from: f */
    public void mo71065f(C28134h c28134h, int i13) {
        CommunityFragment.m18891x0((C38519p) this.f130337x, c28134h, i13);
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        int i13 = this.f130336w;
        Object obj = this.f130337x;
        switch (i13) {
            case 8:
                int i14 = CardNumberEditText.f22507p0;
                return (String) ((C0971f) obj).invoke();
            default:
                Context context = (Context) ((C0168h) obj).f500b;
                AbstractC22676k.m65750j(context, "context");
                C35363y c35363y = C35363y.f150632y;
                if (c35363y == null) {
                    SharedPreferences sharedPreferences = new C35362x(context).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                }
                return c35363y;
        }
    }

    @Override // p309lo.InterfaceC24550h
    public void invoke(Object obj) {
        switch (this.f130336w) {
            case 0:
                ((InterfaceC31582z0) obj).mo97314s(((SurfaceHolderCallbackC31565r) this.f130337x).f130359w.f130425p0);
                break;
            case 1:
                ((InterfaceC31582z0) obj).mo97308i((C18715c) this.f130337x);
                break;
            case 2:
                ((InterfaceC31582z0) obj).mo97303b((C31538i) this.f130337x);
                break;
            default:
                ((InterfaceC31582z0) obj).mo61776q((C25737r) this.f130337x);
                break;
        }
    }

    @Override // b23.InterfaceC2339e
    public boolean isLoggable(EnumC2341g enumC2341g, String str) {
        C33413k3 c33413k3 = (C33413k3) this.f130337x;
        AbstractC22676k.m65750j(str, "<anonymous parameter 1>");
        return enumC2341g.f9267w >= c33413k3.f139502e.f10730a.f9267w;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        switch (this.f130336w) {
            case 4:
                return AbstractC31698u0.m98272d((View[]) this.f130337x, view, c16905q1);
            case 5:
                return C31708z0.m98345J((C31708z0) this.f130337x, view, c16905q1);
            case 16:
                return CommunityFragment.m18871d0((CommunityFragment) this.f130337x, view, c16905q1);
            default:
                return CommunityShowInviteFragment.m19164Q((CommunityShowInviteFragment) this.f130337x, view, c16905q1);
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener
    public void onReactionClick(String str) {
        EditReactionsView.applyStyle$lambda$2((EditReactionsView) this.f130337x, str);
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        int i13 = this.f130336w;
        Object obj2 = this.f130337x;
        switch (i13) {
            case 14:
                ((C32451b) obj2).invoke(obj);
                break;
            default:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                C32784a c32784a = (C32784a) obj;
                C34671d0 c34671d0 = FirebaseMessaging.f21612k;
                if (c32784a != null) {
                    AbstractC35854l.m113835o(c32784a.f136462w);
                    firebaseMessaging.m16389g();
                }
                break;
        }
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        AbstractC41122z.m133495b((Intent) this.f130337x);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced it) {
        C38666g this$0 = (C38666g) this.f130337x;
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(it, "it");
        CameraState cameraState = it.getCameraState();
        AbstractC22676k.m65749i(cameraState, "it.cameraState");
        this$0.m124000b(cameraState);
    }

    public /* synthetic */ C31559p(C32711d c32711d, InterfaceC31519b1 interfaceC31519b1) {
        this.f130336w = 10;
        this.f130337x = c32711d;
    }

    @Override // com.mapbox.common.location.GetLocationCallback
    public void run(Location location) {
        InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f130337x;
        if (location != null) {
            ((C11935t) interfaceC11936u).mo32218s(location);
        }
    }
}
