package androidx.lifecycle;

import android.util.Log;
import bc3.InterfaceC3027k1;
import java.util.List;
import java.util.concurrent.CancellationException;
import p029b5.AbstractC2724c;
import p114eb.C12982q;
import p161g.AbstractActivityC14909l;
import p161g.C14923z;
import p189hb.C17070f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.lifecycle.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1641y implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6332w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f6333x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f6334y;

    public /* synthetic */ C1641y(int i13, Object obj, Object obj2) {
        this.f6332w = i13;
        this.f6333x = obj;
        this.f6334y = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 source, EnumC1632v event) {
        switch (this.f6332w) {
            case 0:
                C1644z c1644z = (C1644z) this.f6333x;
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) this.f6334y;
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(event, "<unused var>");
                if (source.getLifecycle().getCurrentState() == EnumC1635w.f6325w) {
                    interfaceC3027k1.cancel((CancellationException) null);
                    c1644z.m5047a();
                    return;
                }
                EnumC1635w currentState = source.getLifecycle().getCurrentState();
                EnumC1635w enumC1635w = c1644z.f6347b;
                C1608n c1608n = c1644z.f6348c;
                if (currentState.compareTo(enumC1635w) < 0) {
                    c1608n.f6281a = true;
                    return;
                } else {
                    if (c1608n.f6281a) {
                        if (c1608n.f6282b) {
                            throw new IllegalStateException("Cannot resume a finished dispatcher");
                        }
                        c1608n.f6281a = false;
                        c1608n.m5007a();
                        return;
                    }
                    return;
                }
            case 1:
                C14923z c14923z = (C14923z) this.f6333x;
                AbstractActivityC14909l abstractActivityC14909l = (AbstractActivityC14909l) this.f6334y;
                AbstractC22676k.m65750j(source, "<anonymous parameter 0>");
                AbstractC22676k.m65750j(event, "event");
                if (event == EnumC1632v.ON_CREATE) {
                    c14923z.f55618e = AbstractC2724c.m7689a(abstractActivityC14909l);
                    c14923z.m43019e(c14923z.f55620g);
                    return;
                }
                return;
            default:
                C17070f c17070f = (C17070f) this.f6333x;
                C12982q entry = (C12982q) this.f6334y;
                AbstractC22676k.m65750j(entry, "$entry");
                AbstractC22676k.m65750j(source, "owner");
                AbstractC22676k.m65750j(event, "event");
                if (event == EnumC1632v.ON_RESUME && ((List) c17070f.m36435b().f44870e.f45200w.getValue()).contains(entry)) {
                    if (C17070f.m48194n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + source + " view lifecycle reaching RESUMED");
                    }
                    c17070f.m36435b().m36492b(entry);
                }
                if (event == EnumC1632v.ON_DESTROY) {
                    if (C17070f.m48194n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + source + " view lifecycle reaching DESTROYED");
                    }
                    c17070f.m36435b().m36492b(entry);
                    return;
                }
                return;
        }
    }
}
