package f41;

import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22403o;
import l83.C23454a0;
import nj2.C26774u;
import nj2.C26775v;
import p208i2.AbstractC17918w0;
import p335n6.C26386c;
import p335n6.C26387d;
import p335n6.InterfaceC26388e;
import p335n6.InterfaceC26397n;
import p358o6.C27594b;
import p390p1.InterfaceC28601c1;
import p395p6.AbstractC28930x;
import p395p6.C28861a;
import p395p6.C28921u;
import p395p6.C28931x0;
import p395p6.C28932x1;
import p545v6.C35725n;
import p545v6.C35727p;
import p545v6.C35733v;
import p574w6.C36851b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22669g0;
import qj2.AbstractC30436a;
import tp1.C34070j;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: f41.n */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C14076n implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f50543E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f50544F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f50545G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f50546H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f50547I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f50548J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50549w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f50550x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f50551y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f50552z;

    public /* synthetic */ C14076n(AbstractC22403o abstractC22403o, TextResource textResource, String str, InterfaceC28601c1 interfaceC28601c1, InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c2, C14064b c14064b, Map map, InterfaceC28601c1 interfaceC28601c3) {
        this.f50550x = abstractC22403o;
        this.f50551y = textResource;
        this.f50552z = str;
        this.f50543E = interfaceC28601c1;
        this.f50546H = interfaceC4351m;
        this.f50544F = interfaceC28601c2;
        this.f50547I = c14064b;
        this.f50548J = map;
        this.f50545G = interfaceC28601c3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C35727p c35727p;
        switch (this.f50549w) {
            case 0:
                return AbstractC14078p.m40102w((AbstractC22403o) this.f50550x, (TextResource) this.f50551y, (String) this.f50552z, (InterfaceC28601c1) this.f50543E, (InterfaceC4351m) this.f50546H, (InterfaceC28601c1) this.f50544F, (C14064b) this.f50547I, (Map) this.f50548J, (InterfaceC28601c1) this.f50545G, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                C22669g0 c22669g0 = (C22669g0) this.f50550x;
                C22669g0 c22669g1 = (C22669g0) this.f50551y;
                C22669g0 c22669g2 = (C22669g0) this.f50552z;
                RemoteViews remoteViews = (RemoteViews) this.f50543E;
                C28931x0 c28931x0 = (C28931x0) this.f50544F;
                C22669g0 c22669g3 = (C22669g0) this.f50545G;
                C22669g0 c22669g4 = (C22669g0) this.f50546H;
                C22669g0 c22669g5 = (C22669g0) this.f50547I;
                C22669g0 c22669g6 = (C22669g0) this.f50548J;
                InterfaceC26397n interfaceC26397n = (InterfaceC26397n) obj2;
                if (interfaceC26397n instanceof C27594b) {
                    if (c22669g0.f89336w != null) {
                        Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                    }
                    c22669g0.f89336w = interfaceC26397n;
                } else if (interfaceC26397n instanceof C35733v) {
                    c22669g1.f89336w = interfaceC26397n;
                } else if (interfaceC26397n instanceof C35725n) {
                    c22669g2.f89336w = interfaceC26397n;
                } else if (interfaceC26397n instanceof InterfaceC26388e) {
                    InterfaceC26388e interfaceC26388e = (InterfaceC26388e) interfaceC26397n;
                    int i13 = c28931x0.f117046a;
                    if (interfaceC26388e instanceof C26387d) {
                        remoteViews.setInt(i13, "setBackgroundResource", ((C26387d) interfaceC26388e).f104836a.f104834a);
                    } else {
                        if (!(interfaceC26388e instanceof C26386c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        remoteViews.setInt(i13, "setBackgroundColor", AbstractC17918w0.m51506H(((C26386c) interfaceC26388e).f104835a.f1723a));
                    }
                } else if (interfaceC26397n instanceof C35727p) {
                    C35727p c35727p2 = (C35727p) c22669g3.f89336w;
                    if (c35727p2 != null) {
                        C35727p c35727p3 = (C35727p) interfaceC26397n;
                        c35727p = new C35727p(c35727p2.f151974a.m113189a(c35727p3.f151974a), c35727p2.f151975b.m113189a(c35727p3.f151975b), c35727p2.f151976c.m113189a(c35727p3.f151976c), c35727p2.f151977d.m113189a(c35727p3.f151977d), c35727p2.f151978e.m113189a(c35727p3.f151978e), c35727p2.f151979f.m113189a(c35727p3.f151979f));
                    } else {
                        c35727p = (C35727p) interfaceC26397n;
                    }
                    c22669g3.f89336w = c35727p;
                } else if (interfaceC26397n instanceof C28921u) {
                    c22669g4.f89336w = ((C28921u) interfaceC26397n).f117031a;
                } else if (!(interfaceC26397n instanceof C28861a)) {
                    if (interfaceC26397n instanceof AbstractC28930x) {
                        c22669g5.f89336w = interfaceC26397n;
                    } else if (interfaceC26397n instanceof C36851b) {
                        c22669g6.f89336w = interfaceC26397n;
                    } else {
                        Log.w("GlanceAppWidget", "Unknown modifier '" + interfaceC26397n + "', nothing done.");
                    }
                }
                return C23454a0.f92919a;
            case 2:
                return AbstractC30436a.m93093v((C26775v) this.f50550x, (TextResource) this.f50551y, (TextResource) this.f50552z, (List) this.f50543E, (List) this.f50544F, (List) this.f50545G, (TextResource) this.f50546H, (C26774u) this.f50547I, (Function1) this.f50548J, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC36272h.m115892x1((C34070j) this.f50550x, (Function1) this.f50551y, (Function1) this.f50552z, (InterfaceC4339a) this.f50546H, (Function1) this.f50547I, (InterfaceC28601c1) this.f50543E, (InterfaceC28601c1) this.f50544F, (InterfaceC28601c1) this.f50545G, (InterfaceC28601c1) this.f50548J, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C14076n(C22669g0 c22669g0, C22669g0 c22669g1, C22669g0 c22669g2, Context context, RemoteViews remoteViews, C28931x0 c28931x0, C22669g0 c22669g3, C22669g0 c22669g4, C22669g0 c22669g5, C28932x1 c28932x1, C22669g0 c22669g6, C22669g0 c22669g7, C22669g0 c22669g8) {
        this.f50550x = c22669g0;
        this.f50551y = c22669g1;
        this.f50552z = c22669g2;
        this.f50543E = remoteViews;
        this.f50544F = c28931x0;
        this.f50545G = c22669g3;
        this.f50546H = c22669g5;
        this.f50547I = c22669g7;
        this.f50548J = c22669g8;
    }

    public /* synthetic */ C14076n(C26775v c26775v, TextResource textResource, TextResource textResource2, List list, List list2, List list3, TextResource textResource3, C26774u c26774u, Function1 function1) {
        this.f50550x = c26775v;
        this.f50551y = textResource;
        this.f50552z = textResource2;
        this.f50543E = list;
        this.f50544F = list2;
        this.f50545G = list3;
        this.f50546H = textResource3;
        this.f50547I = c26774u;
        this.f50548J = function1;
    }

    public /* synthetic */ C14076n(C34070j c34070j, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4) {
        this.f50550x = c34070j;
        this.f50551y = function1;
        this.f50552z = function2;
        this.f50546H = interfaceC4339a;
        this.f50547I = function3;
        this.f50543E = interfaceC28601c1;
        this.f50544F = interfaceC28601c2;
        this.f50545G = interfaceC28601c3;
        this.f50548J = interfaceC28601c4;
    }
}
