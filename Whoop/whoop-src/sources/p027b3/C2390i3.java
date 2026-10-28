package p027b3;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import m83.AbstractC25265s;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p189hb.C17070f;
import p456rb.C31183a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b3.i3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2390i3 implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9444w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9445x;

    public /* synthetic */ C2390i3(Object obj, int i13) {
        this.f9444w = i13;
        this.f9445x = obj;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        switch (this.f9444w) {
            case 0:
                AbstractC2346a abstractC2346a = (AbstractC2346a) this.f9445x;
                if (event == EnumC1632v.ON_DESTROY) {
                    abstractC2346a.m7235d();
                }
                break;
            case 1:
                AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) this.f9445x;
                AbstractC22676k.m65750j(source, "<anonymous parameter 0>");
                AbstractC22676k.m65750j(event, "event");
                abstractC12939a0.f44698s = event.m5039a();
                if (abstractC12939a0.f44682c != null) {
                    for (C12982q c12982q : AbstractC25265s.m74097F1(abstractC12939a0.f44686g)) {
                        c12982q.getClass();
                        c12982q.f44846z = event.m5039a();
                        c12982q.m36482d();
                    }
                }
                break;
            case 2:
                C17070f c17070f = (C17070f) this.f9445x;
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "event");
                if (event == EnumC1632v.ON_DESTROY) {
                    AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) source;
                    Object obj = null;
                    for (Object obj2 : (Iterable) c17070f.m36435b().f44871f.f45200w.getValue()) {
                        if (AbstractC22676k.m65745e(((C12982q) obj2).f44835F, abstractComponentCallbacksC1320m0.getTag())) {
                            obj = obj2;
                        }
                    }
                    C12982q c12982q2 = (C12982q) obj;
                    if (c12982q2 != null) {
                        if (C17070f.m48194n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + c12982q2 + " due to fragment " + source + " lifecycle reaching DESTROYED");
                        }
                        c17070f.m36435b().m36492b(c12982q2);
                    }
                }
                break;
            default:
                C31183a c31183a = (C31183a) this.f9445x;
                AbstractC22676k.m65750j(source, "<unused var>");
                AbstractC22676k.m65750j(event, "event");
                if (event == EnumC1632v.ON_START) {
                    c31183a.f128502h = true;
                } else if (event == EnumC1632v.ON_STOP) {
                    c31183a.f128502h = false;
                }
                break;
        }
    }
}
