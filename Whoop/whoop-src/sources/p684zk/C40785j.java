package p684zk;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p167g5.InterfaceC15485d;
import p306ll.InterfaceC24498a;
import p474s.C31983m2;
import p586wk.C37330h;
import p586wk.InterfaceC37332j;
import p618xk.InterfaceC38416g;

/* JADX INFO: renamed from: zk.j */
/* JADX INFO: loaded from: classes.dex */
public final class C40785j {

    /* JADX INFO: renamed from: a */
    public final Class f175886a;

    /* JADX INFO: renamed from: b */
    public final List f175887b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC24498a f175888c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC15485d f175889d;

    /* JADX INFO: renamed from: e */
    public final String f175890e;

    public C40785j(Class cls, Class cls2, Class cls3, List list, InterfaceC24498a interfaceC24498a, C31983m2 c31983m2) {
        this.f175886a = cls;
        this.f175887b = list;
        this.f175888c = interfaceC24498a;
        this.f175889d = c31983m2;
        this.f175890e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC40801z m132285a(InterfaceC38416g interfaceC38416g, int i13, int i14, C37330h c37330h, List list) throws GlideException {
        List list2 = this.f175887b;
        int size = list2.size();
        InterfaceC40801z interfaceC40801zMo44989a = null;
        for (int i15 = 0; i15 < size; i15++) {
            InterfaceC37332j interfaceC37332j = (InterfaceC37332j) list2.get(i15);
            try {
                if (interfaceC37332j.mo44990b(interfaceC38416g.mo40834e(), c37330h)) {
                    interfaceC40801zMo44989a = interfaceC37332j.mo44989a(interfaceC38416g.mo40834e(), i13, i14, c37330h);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC37332j, e5);
                }
                list.add(e5);
            }
            if (interfaceC40801zMo44989a != null) {
                break;
            }
        }
        if (interfaceC40801zMo44989a != null) {
            return interfaceC40801zMo44989a;
        }
        throw new GlideException(this.f175890e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f175886a + ", decoders=" + this.f175887b + ", transcoder=" + this.f175888c + '}';
    }
}
