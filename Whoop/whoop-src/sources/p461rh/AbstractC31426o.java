package p461rh;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import bc3.C2996c2;
import bc3.C3022j0;
import e10.C12554k0;
import f93.C14289a;
import fi.C14503i;
import fi.C14509o;
import fi.C14512r;
import fi.InterfaceC14497c;
import fi.ViewOnAttachStateChangeListenerC14514t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import ki.AbstractC22500l;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26611e0;
import p196hi.C17302a;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: rh.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31426o {

    /* JADX INFO: renamed from: a */
    public static final C14289a f129297a = new C14289a(Boolean.TRUE, 3);

    /* JADX INFO: renamed from: a */
    public static C31436y m96737a(String str) {
        String str2 = C26611e0.f105848x;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("file");
        sb4.append(':');
        if (str != null) {
            sb4.append(str);
        }
        return new C31436y(sb4.toString(), str2, "file", null, str);
    }

    /* JADX INFO: renamed from: b */
    public static final Drawable m96738b(InterfaceC31421j interfaceC31421j, Resources resources) {
        if (interfaceC31421j instanceof C31416e) {
            return ((C31416e) interfaceC31421j).f129282a;
        }
        return interfaceC31421j instanceof C31412a ? new BitmapDrawable(resources, ((C31412a) interfaceC31421j).f129270a) : new C31422k(interfaceC31421j, 0);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC31421j m96739c(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C31412a(((BitmapDrawable) drawable).getBitmap()) : new C31416e(drawable);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC14497c m96740d(C14503i c14503i, C3022j0 c3022j0) {
        C17302a c17302a = c14503i.f52970c;
        if (!(c17302a instanceof C17302a)) {
            return new C12554k0(c3022j0, 14);
        }
        ViewOnAttachStateChangeListenerC14514t viewOnAttachStateChangeListenerC14514tM113379B = AbstractC35785b.m113379B(c17302a.f66506x);
        synchronized (viewOnAttachStateChangeListenerC14514tM113379B) {
            C14512r c14512r = viewOnAttachStateChangeListenerC14514tM113379B.f53029x;
            if (c14512r != null) {
                Bitmap.Config[] configArr = AbstractC22500l.f88199a;
                if (AbstractC22676k.m65745e(Looper.myLooper(), Looper.getMainLooper()) && viewOnAttachStateChangeListenerC14514tM113379B.f53027E) {
                    viewOnAttachStateChangeListenerC14514tM113379B.f53027E = false;
                    c14512r.f53021x = c3022j0;
                    return c14512r;
                }
            }
            C2996c2 c2996c2 = viewOnAttachStateChangeListenerC14514tM113379B.f53030y;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            viewOnAttachStateChangeListenerC14514tM113379B.f53030y = null;
            C14512r c14512r2 = new C14512r(viewOnAttachStateChangeListenerC14514tM113379B.f53028w, c3022j0);
            viewOnAttachStateChangeListenerC14514tM113379B.f53029x = c14512r2;
            return c14512r2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final Object m96741e(C14503i c14503i, C14289a c14289a) {
        Object obj = c14503i.f52986s.f129287a.get(c14289a);
        if (obj != null) {
            return obj;
        }
        Object obj2 = c14503i.f52988u.f52961n.f129287a.get(c14289a);
        return obj2 == null ? c14289a.f52186x : obj2;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m96742f(C14509o c14509o, C14289a c14289a) {
        Object obj = c14509o.f53012j.f129287a.get(c14289a);
        return obj == null ? c14289a.f52186x : obj;
    }

    /* JADX INFO: renamed from: g */
    public static final String m96743g(C31436y c31436y) {
        List listM96744h = m96744h(c31436y);
        String str = c31436y.f129328b;
        if (listM96744h.isEmpty()) {
            return null;
        }
        String str2 = c31436y.f129331e;
        AbstractC22676k.m65747g(str2);
        if (!AbstractC39421y.m125930O(str2, str, false)) {
            str = "";
        }
        return AbstractC25265s.m74110N0(listM96744h, c31436y.f129328b, str, null, null, 60);
    }

    /* JADX INFO: renamed from: h */
    public static final List m96744h(C31436y c31436y) {
        String str = c31436y.f129331e;
        if (str == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = -1;
        while (i13 < str.length()) {
            int i14 = i13 + 1;
            int iM125887f0 = AbstractC39414r.m125887f0(str, '/', i14, false, 4);
            if (iM125887f0 == -1) {
                iM125887f0 = str.length();
            }
            String strSubstring = str.substring(i14, iM125887f0);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i13 = iM125887f0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static final String m96745i(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= iMax) {
                if (i13 == i14) {
                    return str;
                }
                if (i13 >= length) {
                    return AbstractC39421y.m125918C(0, i14, 5, bArr);
                }
            } else if (str.charAt(i13) == '%') {
                int i15 = i13 + 3;
                try {
                    String strSubstring = str.substring(i13 + 1, i15);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    bArr[i14] = (byte) Integer.parseInt(strSubstring, 16);
                    i14++;
                    i13 = i15;
                } catch (NumberFormatException unused) {
                    bArr[i14] = (byte) str.charAt(i13);
                    i14++;
                    i13++;
                }
            }
            bArr[i14] = (byte) str.charAt(i13);
            i14++;
            i13++;
        }
    }

    /* JADX INFO: renamed from: j */
    public static C31436y m96746j(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        String str2 = C26611e0.f105848x;
        String strM125926K = !AbstractC22676k.m65745e(str2, "/") ? AbstractC39421y.m125926K(str, str2, "/", false) : str;
        boolean z4 = true;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        while (i13 < strM125926K.length()) {
            char cCharAt = strM125926K.charAt(i13);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i16 == -1 && i14 == -1) {
                            i16 = i13 + 1;
                        }
                    } else if (z4 && i16 == -1 && i14 == -1) {
                        int i19 = i13 + 2;
                        if (i19 < str.length() && str.charAt(i13 + 1) == '/' && str.charAt(i19) == '/') {
                            i17 = i13 + 3;
                            z4 = false;
                            i18 = i13;
                            i13 = i19;
                        } else if (strM125926K.equals(str)) {
                            i15 = i13 + 1;
                            i18 = i13;
                            i13 = i15;
                            i17 = i13;
                        }
                    }
                } else if (i15 == -1 && i16 == -1 && i14 == -1) {
                    i15 = i17 == -1 ? 0 : i13;
                    z4 = false;
                }
            } else if (i14 == -1) {
                i14 = i13 + 1;
            }
            i13++;
        }
        int iMin = Math.min(i14 == -1 ? Integer.MAX_VALUE : i14 - 1, strM125926K.length());
        int iMin2 = Math.min(i16 == -1 ? Integer.MAX_VALUE : i16 - 1, iMin);
        if (i17 != -1) {
            strSubstring2 = strM125926K.substring(0, i18);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            strSubstring = strM125926K.substring(i17, Math.min(i15 != -1 ? i15 : Integer.MAX_VALUE, iMin2));
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        if (i15 != -1) {
            strSubstring3 = strM125926K.substring(i15, iMin2);
            AbstractC22676k.m65749i(strSubstring3, "substring(...)");
        } else {
            strSubstring3 = null;
        }
        if (i16 != -1) {
            strSubstring4 = strM125926K.substring(i16, iMin);
            AbstractC22676k.m65749i(strSubstring4, "substring(...)");
        } else {
            strSubstring4 = null;
        }
        if (i14 != -1) {
            strSubstring5 = strM125926K.substring(i14, strM125926K.length());
            AbstractC22676k.m65749i(strSubstring5, "substring(...)");
        } else {
            strSubstring5 = null;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strM96745i = strSubstring2 != null ? m96745i(strSubstring2, bArr) : null;
        String strM96745i2 = strSubstring != null ? m96745i(strSubstring, bArr) : null;
        String strM96745i3 = strSubstring3 != null ? m96745i(strSubstring3, bArr) : null;
        if (str3 != null) {
            m96745i(str3, bArr);
        }
        if (strSubstring5 != null) {
            m96745i(strSubstring5, bArr);
        }
        return new C31436y(strM125926K, str2, strM96745i, strM96745i2, strM96745i3);
    }
}
