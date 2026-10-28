package ze1;

import lh3.C24081d;
import lh3.C24084g;
import lh3.C24085h;
import lh3.C24086i;
import lh3.C24087j;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ze1.d */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class C40588d<T> extends C24087j {

    /* JADX INFO: renamed from: E */
    private static final InterfaceC34116n f174858E = InterfaceC34116n.m107846d("SerializedReplaySubject");

    /* JADX INFO: renamed from: z */
    private final C24086i f174859z;

    public C40588d(C24086i c24086i) {
        super(c24086i);
        this.f174859z = c24086i;
    }

    /* JADX INFO: renamed from: Y */
    public static <T> C40588d<T> m131622Y() {
        return new C40588d<>(new C24086i(new C24081d(new C24085h(1))));
    }

    /* JADX INFO: renamed from: Z */
    public T m131623Z() {
        try {
            C24084g c24084g = ((C24085h) this.f174859z.f95150x.f95136x).f95144b;
            while (true) {
                C24084g c24084g2 = (C24084g) c24084g.get();
                if (c24084g2 == null) {
                    return (T) c24084g.f95142w;
                }
                c24084g = c24084g2;
            }
        } catch (Exception e5) {
            f174858E.mo85230v("Failed to retrieve value from ReplaySubject", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }
}
