package p027b3;

import android.content.Context;
import android.view.View;
import gb.C15648i;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p114eb.C12982q;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p291l0.C22944c2;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: b3.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2437s0 implements InterfaceC28620h0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9536a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9537b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9538c;

    public /* synthetic */ C2437s0(int i13, Object obj, Object obj2) {
        this.f9536a = i13;
        this.f9537b = obj;
        this.f9538c = obj2;
    }

    @Override // p390p1.InterfaceC28620h0
    public final void dispose() {
        int i13 = this.f9536a;
        Object obj = this.f9538c;
        Object obj2 = this.f9537b;
        switch (i13) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C2447u0) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C2452v0) obj);
                break;
            case 2:
                ((C11373l0) obj2).f36453a.m94893k((C11365j0) obj);
                break;
            case 3:
                ((C11421z1) obj2).f36639j.remove((C11421z1) obj);
                break;
            case 4:
                ((C11421z1) obj2).f36638i.remove((C11409v1) obj);
                break;
            case 5:
                Iterator it = ((List) ((InterfaceC28670t2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((C15648i) obj).m36435b().m36492b((C12982q) it.next());
                }
                break;
            default:
                C22944c2 c22944c2 = (C22944c2) obj2;
                View view = (View) obj;
                int i14 = c22944c2.f90573t - 1;
                c22944c2.f90573t = i14;
                if (i14 == 0) {
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    AbstractC16877h0.m47517l(view, null);
                    AbstractC16901p0.m47586q(view, null);
                    view.removeOnAttachStateChangeListener(c22944c2.f90574u);
                }
                break;
        }
    }
}
