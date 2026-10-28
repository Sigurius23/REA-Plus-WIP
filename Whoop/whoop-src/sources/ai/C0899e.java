package ai;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.InterfaceC1585g0;
import f93.C14289a;
import fi.AbstractC14504j;
import fi.AbstractC14505k;
import fi.C14503i;
import fi.C14509o;
import fi.EnumC14496b;
import gi.C15870a;
import gi.C15878i;
import gi.EnumC15873d;
import gi.EnumC15876g;
import gi.InterfaceC15872c;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ki.AbstractC22500l;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import p196hi.C17302a;
import p249jc.C21567b;
import p461rh.AbstractC31426o;
import p461rh.C31412a;
import p461rh.C31417f;
import p461rh.C31420i;
import p461rh.C31431t;
import p461rh.C31436y;
import p461rh.InterfaceC31421j;
import p648yh.C39534a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.AbstractC37926s0;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: ai.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C0899e {

    /* JADX INFO: renamed from: a */
    public final C31431t f3286a;

    public C0899e(C31431t c31431t, C0899e c0899e) {
        this.f3286a = c31431t;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1638x m2191a(C14503i c14503i) {
        C17302a c17302a = c14503i.f52970c;
        Object context = c17302a instanceof C17302a ? c17302a.f66506x.getContext() : c14503i.f52968a;
        while (!(context instanceof InterfaceC1585g0)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((InterfaceC1585g0) context).getLifecycle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2192c(C14503i c14503i, Bitmap.Config config) {
        if (!AbstractC37926s0.m121481u(config)) {
            return true;
        }
        if (!((Boolean) AbstractC31426o.m96741e(c14503i, AbstractC14505k.f52998f)).booleanValue()) {
            return false;
        }
        C17302a c17302a = c14503i.f52970c;
        if (!(c17302a instanceof C17302a)) {
            return true;
        }
        ImageView imageView = c17302a.f66506x;
        return !imageView.isAttachedToWindow() || imageView.isHardwareAccelerated();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0177  */
    /* JADX WARN: Code duplicated, block: B:109:0x017b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181  */
    /* JADX WARN: Code duplicated, block: B:112:0x0188  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
    /* JADX WARN: Code duplicated, block: B:117:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:90:0x013f  */
    /* JADX WARN: Code duplicated, block: B:93:0x014a  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0156  */
    /* JADX WARN: Code duplicated, block: B:98:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public C0897c m2193b(C14503i c14503i, C0896b c0896b, C15878i c15878i, EnumC15876g enumC15876g) {
        C0897c c0897c;
        C0897c c0897cMo2230k;
        boolean zM2192c;
        Boolean bool;
        int width;
        int height;
        C15878i c15878i2;
        InterfaceC15872c interfaceC15872c;
        int i13;
        InterfaceC15872c interfaceC15872c2;
        int i14;
        int iMin;
        InterfaceC15872c interfaceC15872c3;
        int i15;
        InterfaceC15872c interfaceC15872c4;
        int i16;
        int iMin2;
        double d3;
        double d14;
        EnumC15876g enumC15876g2;
        int iOrdinal;
        int iAbs;
        int iOrdinal2;
        Boolean bool2;
        C0897c c0897c2;
        EnumC14496b enumC14496b = c14503i.f52977j;
        EnumC15873d enumC15873d = c14503i.f52985r;
        if (!enumC14496b.f52928w) {
            return null;
        }
        InterfaceC0898d interfaceC0898d = (InterfaceC0898d) this.f3286a.f129319a.f129303c.getValue();
        if (interfaceC0898d != null) {
            C0900f c0900f = (C0900f) interfaceC0898d;
            synchronized (c0900f.f3289c) {
                try {
                    c0897cMo2230k = c0900f.f3287a.mo2230k(c0896b);
                    if (c0897cMo2230k == null) {
                        C0904j c0904j = c0900f.f3288b;
                        ArrayList arrayList = (ArrayList) ((LinkedHashMap) c0904j.f3302x).get(c0896b);
                        C0897c c0897c3 = null;
                        if (arrayList == null) {
                            c0897c = null;
                        } else {
                            int size = arrayList.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size) {
                                    c0897c = null;
                                    break;
                                }
                                C0903i c0903i = (C0903i) arrayList.get(i17);
                                InterfaceC31421j interfaceC31421j = (InterfaceC31421j) c0903i.f3298a.get();
                                if (interfaceC31421j != null) {
                                    c0897c = null;
                                    c0897c2 = new C0897c(interfaceC31421j, c0903i.f3299b);
                                } else {
                                    c0897c = null;
                                    c0897c2 = null;
                                }
                                if (c0897c2 != null) {
                                    c0897c3 = c0897c2;
                                    break;
                                }
                                i17++;
                            }
                            c0904j.m2220g();
                        }
                        c0897cMo2230k = c0897c3;
                    } else {
                        c0897c = null;
                    }
                    if (c0897cMo2230k != null && !c0897cMo2230k.f3284a.mo96729a()) {
                        synchronized (c0900f.f3289c) {
                            c0900f.f3287a.mo2232t(c0896b);
                            if (((LinkedHashMap) c0900f.f3288b.f3302x).remove(c0896b) != null) {
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            c0897c = null;
            c0897cMo2230k = null;
        }
        if (c0897cMo2230k == null) {
            return c0897c;
        }
        InterfaceC31421j interfaceC31421j2 = c0897cMo2230k.f3284a;
        C31412a c31412a = interfaceC31421j2 instanceof C31412a ? (C31412a) interfaceC31421j2 : c0897c;
        boolean z4 = true;
        if (c31412a == 0) {
            zM2192c = true;
        } else {
            Bitmap.Config config = c31412a.f129270a.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            zM2192c = m2192c(c14503i, config);
        }
        if (zM2192c) {
            String str = (String) c0896b.f3283b.get("coil#size");
            if (str == null) {
                Object obj = c0897cMo2230k.f3285b.get("coil#is_sampled");
                if (obj instanceof Boolean) {
                    bool2 = (Boolean) obj;
                } else {
                    bool = c0897c;
                }
                if (bool != 0 ? bool.booleanValue() : false) {
                    bool = bool2;
                    bool = bool2;
                    bool = bool2;
                    width = interfaceC31421j2.getWidth();
                    height = interfaceC31421j2.getHeight();
                    if (interfaceC31421j2 instanceof C31412a) {
                        c15878i2 = (C15878i) AbstractC31426o.m96741e(c14503i, AbstractC14504j.f52990b);
                    } else {
                        c15878i2 = C15878i.f59992c;
                    }
                    interfaceC15872c = c15878i.f59993a;
                    if (interfaceC15872c instanceof C15870a) {
                        i13 = ((C15870a) interfaceC15872c).f59978a;
                    } else {
                        i13 = Integer.MAX_VALUE;
                    }
                    interfaceC15872c2 = c15878i2.f59993a;
                    if (interfaceC15872c2 instanceof C15870a) {
                        i14 = ((C15870a) interfaceC15872c2).f59978a;
                    } else {
                        i14 = Integer.MAX_VALUE;
                    }
                    iMin = Math.min(i13, i14);
                    interfaceC15872c3 = c15878i.f59994b;
                    if (interfaceC15872c3 instanceof C15870a) {
                        i15 = ((C15870a) interfaceC15872c3).f59978a;
                    } else {
                        i15 = Integer.MAX_VALUE;
                    }
                    interfaceC15872c4 = c15878i2.f59994b;
                    if (interfaceC15872c4 instanceof C15870a) {
                        i16 = ((C15870a) interfaceC15872c4).f59978a;
                    } else {
                        i16 = Integer.MAX_VALUE;
                    }
                    iMin2 = Math.min(i15, i16);
                    d3 = ((double) iMin) / ((double) width);
                    d14 = ((double) iMin2) / ((double) height);
                    if (iMin != Integer.MAX_VALUE) {
                        enumC15876g2 = EnumC15876g.f59985x;
                    } else {
                        enumC15876g2 = EnumC15876g.f59985x;
                    }
                    iOrdinal = enumC15876g2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (d3 < d14) {
                            iAbs = Math.abs(iMin - width);
                        } else {
                            iAbs = Math.abs(iMin2 - height);
                            d3 = d14;
                        }
                    } else if (d3 > d14) {
                        iAbs = Math.abs(iMin - width);
                    } else {
                        iAbs = Math.abs(iMin2 - height);
                        d3 = d14;
                    }
                    if (iAbs > 1) {
                        iOrdinal2 = enumC15873d.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 == 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (d3 > 1.0d) {
                                z4 = false;
                            }
                        } else if (d3 != 1.0d) {
                            z4 = false;
                        }
                    }
                } else {
                    bool = bool2;
                    if (!AbstractC22676k.m65745e(c15878i, C15878i.f59992c) && enumC15873d != EnumC15873d.f59981x) {
                        bool = bool2;
                        bool = bool2;
                        bool = bool2;
                        width = interfaceC31421j2.getWidth();
                        height = interfaceC31421j2.getHeight();
                        if (interfaceC31421j2 instanceof C31412a) {
                            c15878i2 = (C15878i) AbstractC31426o.m96741e(c14503i, AbstractC14504j.f52990b);
                        } else {
                            c15878i2 = C15878i.f59992c;
                        }
                        interfaceC15872c = c15878i.f59993a;
                        if (interfaceC15872c instanceof C15870a) {
                            i13 = ((C15870a) interfaceC15872c).f59978a;
                        } else {
                            i13 = Integer.MAX_VALUE;
                        }
                        interfaceC15872c2 = c15878i2.f59993a;
                        if (interfaceC15872c2 instanceof C15870a) {
                            i14 = ((C15870a) interfaceC15872c2).f59978a;
                        } else {
                            i14 = Integer.MAX_VALUE;
                        }
                        iMin = Math.min(i13, i14);
                        interfaceC15872c3 = c15878i.f59994b;
                        if (interfaceC15872c3 instanceof C15870a) {
                            i15 = ((C15870a) interfaceC15872c3).f59978a;
                        } else {
                            i15 = Integer.MAX_VALUE;
                        }
                        interfaceC15872c4 = c15878i2.f59994b;
                        if (interfaceC15872c4 instanceof C15870a) {
                            i16 = ((C15870a) interfaceC15872c4).f59978a;
                        } else {
                            i16 = Integer.MAX_VALUE;
                        }
                        iMin2 = Math.min(i15, i16);
                        d3 = ((double) iMin) / ((double) width);
                        d14 = ((double) iMin2) / ((double) height);
                        if (iMin != Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) {
                            enumC15876g2 = EnumC15876g.f59985x;
                        } else {
                            enumC15876g2 = enumC15876g;
                        }
                        iOrdinal = enumC15876g2.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (d3 < d14) {
                                iAbs = Math.abs(iMin - width);
                            } else {
                                iAbs = Math.abs(iMin2 - height);
                                d3 = d14;
                            }
                        } else if (d3 > d14) {
                            iAbs = Math.abs(iMin - width);
                        } else {
                            iAbs = Math.abs(iMin2 - height);
                            d3 = d14;
                        }
                        if (iAbs > 1) {
                            iOrdinal2 = enumC15873d.ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 == 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (d3 > 1.0d) {
                                    z4 = false;
                                }
                            } else if (d3 != 1.0d) {
                                z4 = false;
                            }
                        }
                    }
                }
            } else if (!str.equals(c15878i.toString())) {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        return z4 ? c0897cMo2230k : c0897c;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX INFO: renamed from: d */
    public C0896b m2194d(C14503i c14503i, Object obj, C14509o c14509o, C31417f c31417f) {
        String string;
        String strM96743g;
        c14503i.getClass();
        Map map = c14503i.f52972e;
        List list = this.f3286a.f129322d.f129277c;
        int size = list.size();
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                C23465k c23465k = (C23465k) list.get(i13);
                C39534a c39534a = (C39534a) c23465k.f92937w;
                if (((InterfaceC21461d) c23465k.f92938x).isInstance(obj)) {
                    AbstractC22676k.m65748h(c39534a, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                    switch (c39534a.f170085a) {
                        case 0:
                            C31436y c31436y = (C31436y) obj;
                            if (!AbstractC22676k.m65745e(c31436y.f129329c, "android.resource")) {
                                string = null;
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(c31436y);
                                sb4.append(':');
                                Configuration configuration = c14509o.f53003a.getResources().getConfiguration();
                                Bitmap.Config[] configArr = AbstractC22500l.f88199a;
                                sb4.append(configuration.uiMode & 48);
                                string = sb4.toString();
                            }
                            break;
                        case 1:
                            C31436y c31436y2 = (C31436y) obj;
                            String str = c31436y2.f129329c;
                            if (!(str == null || str.equals("file")) || c31436y2.f129331e == null) {
                                string = null;
                            } else {
                                Bitmap.Config[] configArr2 = AbstractC22500l.f88199a;
                                if ((AbstractC22676k.m65745e(c31436y2.f129329c, "file") && AbstractC22676k.m65745e(AbstractC25265s.m74100H0(AbstractC31426o.m96744h(c31436y2)), "android_asset")) || !((Boolean) AbstractC31426o.m96742f(c14509o, AbstractC14504j.f52991c)).booleanValue() || (strM96743g = AbstractC31426o.m96743g(c31436y2)) == null) {
                                    string = null;
                                } else {
                                    AbstractC26632p abstractC26632p = c14509o.f53008f;
                                    String str2 = C26611e0.f105848x;
                                    Long l7 = (Long) abstractC26632p.m79271T(C21567b.m60606o(strM96743g, false)).f104377g;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(c31436y2);
                                    sb5.append('-');
                                    sb5.append(l7);
                                    string = sb5.toString();
                                }
                            }
                            break;
                        default:
                            string = ((C31436y) obj).f129327a;
                            break;
                    }
                    if (string != null) {
                    }
                }
                i13++;
            } else {
                string = null;
            }
        }
        if (string == null) {
            return null;
        }
        if (((List) AbstractC31426o.m96741e(c14503i, AbstractC14504j.f52989a)).isEmpty()) {
            return new C0896b(string, map);
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(map);
        linkedHashMapM74003l0.put("coil#size", c14509o.f53004b.toString());
        return new C0896b(string, linkedHashMapM74003l0);
    }

    /* JADX INFO: renamed from: e */
    public C14509o m2195e(C14503i c14503i, C15878i c15878i) {
        Context context = c14503i.f52968a;
        EnumC15876g enumC15876g = c14503i.f52984q;
        EnumC15873d enumC15873d = c14503i.f52985r;
        AbstractC26632p abstractC26632p = c14503i.f52973f;
        EnumC14496b enumC14496b = c14503i.f52977j;
        EnumC14496b enumC14496b2 = c14503i.f52978k;
        EnumC14496b enumC14496b3 = c14503i.f52979l;
        C14289a c14289a = AbstractC14505k.f52994b;
        Bitmap.Config config = (Bitmap.Config) AbstractC31426o.m96741e(c14503i, c14289a);
        C14289a c14289a2 = AbstractC14505k.f52999g;
        boolean zBooleanValue = ((Boolean) AbstractC31426o.m96741e(c14503i, c14289a2)).booleanValue();
        C14289a c14289a3 = AbstractC14504j.f52989a;
        boolean z4 = ((List) AbstractC31426o.m96741e(c14503i, c14289a3)).isEmpty() || AbstractC25260n.m74056a0(AbstractC22500l.f88199a, (Bitmap.Config) AbstractC31426o.m96741e(c14503i, c14289a));
        boolean z13 = !AbstractC37926s0.m121481u((Bitmap.Config) AbstractC31426o.m96741e(c14503i, c14289a)) || m2192c(c14503i, (Bitmap.Config) AbstractC31426o.m96741e(c14503i, c14289a));
        if (!z4 || !z13) {
            config = Bitmap.Config.ARGB_8888;
        }
        boolean z14 = zBooleanValue && ((List) AbstractC31426o.m96741e(c14503i, c14289a3)).isEmpty() && config != Bitmap.Config.ALPHA_8;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(AbstractC25247g0.m73995d0(c14503i.f52988u.f52961n.f129287a, c14503i.f52986s.f129287a));
        if (config != ((Bitmap.Config) AbstractC31426o.m96741e(c14503i, c14289a))) {
            if (config != null) {
                linkedHashMapM74003l0.put(c14289a, config);
            } else {
                linkedHashMapM74003l0.remove(c14289a);
            }
        }
        if (z14 != ((Boolean) AbstractC31426o.m96741e(c14503i, c14289a2)).booleanValue()) {
            linkedHashMapM74003l0.put(c14289a2, Boolean.valueOf(z14));
        }
        return new C14509o(context, c15878i, enumC15876g, enumC15873d, null, abstractC26632p, enumC14496b, enumC14496b2, enumC14496b3, new C31420i(AbstractC37978j.m121638W(linkedHashMapM74003l0)));
    }

    public C0899e(C31431t c31431t) {
        this.f3286a = c31431t;
    }
}
