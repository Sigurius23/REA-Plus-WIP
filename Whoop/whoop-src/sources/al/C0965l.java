package al;

import android.graphics.Bitmap;
import com.google.crypto.tink.internal.C5101l0;
import ih0.AbstractC18489d0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: al.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0965l {

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config[] f3566d;

    /* JADX INFO: renamed from: e */
    public static final Bitmap.Config[] f3567e;

    /* JADX INFO: renamed from: f */
    public static final Bitmap.Config[] f3568f;

    /* JADX INFO: renamed from: g */
    public static final Bitmap.Config[] f3569g;

    /* JADX INFO: renamed from: h */
    public static final Bitmap.Config[] f3570h;

    /* JADX INFO: renamed from: a */
    public final C0959f f3571a = new C0959f(1);

    /* JADX INFO: renamed from: b */
    public final C5101l0 f3572b = new C5101l0(3);

    /* JADX INFO: renamed from: c */
    public final HashMap f3573c = new HashMap();

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f3566d = configArr;
        f3567e = configArr;
        f3568f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3569g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3570h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: c */
    public static String m2453c(int i13, Bitmap.Config config) {
        return "[" + i13 + "](" + config + ")";
    }

    /* JADX INFO: renamed from: a */
    public final void m2454a(Bitmap bitmap, Integer num) {
        NavigableMap navigableMapM2456d = m2456d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM2456d.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM2456d.remove(num);
                return;
            } else {
                navigableMapM2456d.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + m2453c(AbstractC33913l.m107268c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m2455b(int i13, int i14, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iM107267b = AbstractC33913l.m107267b(i13, i14, config);
        C0959f c0959f = this.f3571a;
        InterfaceC0962i interfaceC0962iM2441H0 = (InterfaceC0962i) ((ArrayDeque) c0959f.f3536x).poll();
        if (interfaceC0962iM2441H0 == null) {
            interfaceC0962iM2441H0 = c0959f.m2441H0();
        }
        C0964k c0964k = (C0964k) interfaceC0962iM2441H0;
        c0964k.m2452b(iM107267b, config);
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = f3567e;
        } else {
            int i15 = AbstractC0963j.f3562a[config.ordinal()];
            if (i15 == 1) {
                configArr = f3566d;
            } else if (i15 == 2) {
                configArr = f3568f;
            } else if (i15 != 3) {
                configArr = i15 != 4 ? new Bitmap.Config[]{config} : f3570h;
            } else {
                configArr = f3569g;
            }
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) m2456d(config2).ceilingKey(Integer.valueOf(iM107267b));
            if (num != null && num.intValue() <= iM107267b * 8) {
                if (num.intValue() == iM107267b && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                c0959f.m2413A0(c0964k);
                int iIntValue = num.intValue();
                InterfaceC0962i interfaceC0962iM2441H1 = (InterfaceC0962i) ((ArrayDeque) c0959f.f3536x).poll();
                if (interfaceC0962iM2441H1 == null) {
                    interfaceC0962iM2441H1 = c0959f.m2441H0();
                }
                c0964k = (C0964k) interfaceC0962iM2441H1;
                c0964k.m2452b(iIntValue, config2);
                break;
            }
        }
        Bitmap bitmap = (Bitmap) this.f3572b.m16034M(c0964k);
        if (bitmap != null) {
            m2454a(bitmap, Integer.valueOf(c0964k.f3564b));
            bitmap.reconfigure(i13, i14, config);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public final NavigableMap m2456d(Bitmap.Config config) {
        HashMap map = this.f3573c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: e */
    public final void m2457e(Bitmap bitmap) {
        int iM107268c = AbstractC33913l.m107268c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C0959f c0959f = this.f3571a;
        InterfaceC0962i interfaceC0962iM2441H0 = (InterfaceC0962i) ((ArrayDeque) c0959f.f3536x).poll();
        if (interfaceC0962iM2441H0 == null) {
            interfaceC0962iM2441H0 = c0959f.m2441H0();
        }
        C0964k c0964k = (C0964k) interfaceC0962iM2441H0;
        c0964k.m2452b(iM107268c, config);
        this.f3572b.m16049b0(c0964k, bitmap);
        NavigableMap navigableMapM2456d = m2456d(bitmap.getConfig());
        Integer num = (Integer) navigableMapM2456d.get(Integer.valueOf(c0964k.f3564b));
        navigableMapM2456d.put(Integer.valueOf(c0964k.f3564b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SizeConfigStrategy{groupedMap=");
        sbM53374o.append(this.f3572b);
        sbM53374o.append(", sortedSizes=(");
        HashMap map = this.f3573c;
        for (Map.Entry entry : map.entrySet()) {
            sbM53374o.append(entry.getKey());
            sbM53374o.append('[');
            sbM53374o.append(entry.getValue());
            sbM53374o.append("], ");
        }
        if (!map.isEmpty()) {
            sbM53374o.replace(sbM53374o.length() - 2, sbM53374o.length(), "");
        }
        sbM53374o.append(")}");
        return sbM53374o.toString();
    }
}
