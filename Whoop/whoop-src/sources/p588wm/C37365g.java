package p588wm;

import bn.C3491d;
import cn.C4842d;
import gn.C16002c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import p016an.C1050a;
import p094dn.C12190j;
import p094dn.C12193m;
import p123en.C13357d;
import p151fn.C14613a;
import p151fn.C14615c;
import p151fn.C14616d;
import p151fn.C14618f;
import p151fn.C14632t;
import p151fn.C14636x;
import p309lo.C24566x;
import p412q3.C29875i;
import p620xm.C38456a;
import p653ym.C39647b;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import zm.C40882b;

/* JADX INFO: renamed from: wm.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C37365g {

    /* JADX INFO: renamed from: a */
    public static final int[] f159853a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* JADX INFO: renamed from: b */
    public static final C29875i f159854b;

    static {
        C29875i c29875i = new C29875i();
        c29875i.f122095w = new AtomicBoolean(false);
        f159854b = c29875i;
    }

    /* JADX INFO: renamed from: a */
    public static void m119652a(ArrayList arrayList, int i13) {
        Constructor constructor;
        InterfaceC37367i interfaceC37367i = null;
        int i14 = 0;
        switch (i13) {
            case 0:
                arrayList.add(new C14613a());
                return;
            case 1:
                arrayList.add(new C14615c());
                return;
            case 2:
                arrayList.add(new C14616d(0));
                return;
            case 3:
                arrayList.add(new C38456a());
                return;
            case 4:
                C29875i c29875i = f159854b;
                synchronized (((AtomicBoolean) c29875i.f122095w)) {
                    if (((AtomicBoolean) c29875i.f122095w).get()) {
                        constructor = (Constructor) c29875i.f122096x;
                    } else {
                        try {
                            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                                c29875i.f122096x = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(InterfaceC37367i.class).getConstructor(Integer.TYPE);
                            }
                            break;
                        } catch (ClassNotFoundException unused) {
                        } catch (Exception e5) {
                            throw new RuntimeException("Error instantiating FLAC extension", e5);
                        }
                        ((AtomicBoolean) c29875i.f122095w).set(true);
                        constructor = (Constructor) c29875i.f122096x;
                    }
                }
                if (constructor != null) {
                    try {
                        interfaceC37367i = (InterfaceC37367i) constructor.newInstance(0);
                    } catch (Exception e13) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e13);
                    }
                }
                if (interfaceC37367i != null) {
                    arrayList.add(interfaceC37367i);
                    return;
                } else {
                    arrayList.add(new C39647b());
                    return;
                }
            case 5:
                arrayList.add(new C40882b());
                return;
            case 6:
                arrayList.add(new C3491d());
                return;
            case 7:
                arrayList.add(new C4842d(0));
                return;
            case 8:
                arrayList.add(new C12190j(0, null, Collections.EMPTY_LIST));
                arrayList.add(new C12193m(0));
                return;
            case 9:
                arrayList.add(new C13357d());
                return;
            case 10:
                arrayList.add(new C14632t());
                return;
            case 11:
                C24566x c24566x = new C24566x(0L);
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                arrayList.add(new C14636x(1, c24566x, new C14618f(i14, C41060w0.f177067E)));
                return;
            case 12:
                C16002c c16002c = new C16002c();
                c16002c.f60571c = 0;
                c16002c.f60572d = -1L;
                c16002c.f60574f = -1;
                c16002c.f60575g = -1L;
                arrayList.add(c16002c);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new C1050a());
                return;
        }
    }
}
