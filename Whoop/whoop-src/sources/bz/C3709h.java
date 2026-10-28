package bz;

import android.util.Log;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p002a0.C0030i1;
import t83.C33617b;

/* JADX INFO: renamed from: bz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C3709h {

    /* JADX INFO: renamed from: a */
    public static final String f15162a;

    static {
        Object next;
        C33617b c33617b = EnumC3708g.f15159z;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (true) {
            if (!c0030i1.hasNext()) {
                next = null;
                break;
            }
            next = c0030i1.next();
            String str = ((EnumC3708g) next).f15160w;
            try {
                Class.forName(str);
                break;
            } catch (ClassNotFoundException e5) {
                Log.d(StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, str + " not found: " + e5);
            }
        }
        EnumC3708g enumC3708g = (EnumC3708g) next;
        f15162a = enumC3708g != null ? enumC3708g.f15161x : null;
    }
}
