package m40;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import h20.C16670i0;
import j43.C21323g;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23468n;
import la.C23548b;
import lu.C24741c;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p014aj.C0926a;
import p442qy.C30765d;
import p442qy.C30766e;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m40.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C25046w {

    /* JADX INFO: renamed from: a */
    public final C30765d f98132a;

    /* JADX INFO: renamed from: b */
    public final C23548b f98133b;

    /* JADX INFO: renamed from: c */
    public final C25034k f98134c;

    /* JADX INFO: renamed from: d */
    public final C21323g f98135d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f98136e;

    public C25046w(Context context, int i13) {
        C30765d c30765d = (context.getApplicationInfo().flags & 2) != 0 ? C30766e.f126696a : C30766e.f126697b;
        C23548b c23548b = new C23548b(4, (byte) 0);
        C25034k c25034k = new C25034k();
        C21323g c21323g = (i13 & 16) != 0 ? new C21323g(context) : null;
        AbstractC22676k.m65750j(context, "context");
        this.f98132a = c30765d;
        this.f98133b = c23548b;
        this.f98134c = c25034k;
        this.f98135d = c21323g;
        this.f98136e = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    /* JADX INFO: renamed from: a */
    public static final C23468n m73481a(C25046w c25046w, String key) throws Throwable {
        C25032i c25032i;
        C0926a c0926a;
        C21323g c21323g = c25046w.f98135d;
        C0926a c0926a2 = null;
        if (c21323g != null) {
            AbstractC22676k.m65750j(key, "key");
            String strValueOf = String.valueOf(key.hashCode());
            try {
                C24741c c24741c = (C24741c) c21323g.f81534b.getValue();
                C0926a c0926aM72444k = c24741c != null ? c24741c.m72444k(strValueOf) : null;
                if (c0926aM72444k == null) {
                    c25032i = null;
                } else {
                    try {
                        InputStream inputStream = ((InputStream[]) c0926aM72444k.f3414x)[0];
                        AbstractC22676k.m65749i(inputStream, "getInputStream(...)");
                        String strM2287k = c0926aM72444k.m2287k();
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new BufferedInputStream(inputStream, DfuBaseService.ERROR_REMOTE_MASK));
                        AbstractC22676k.m65747g(strM2287k);
                        AbstractC22676k.m65747g(bitmapDecodeStream);
                        c25032i = new C25032i(strM2287k, bitmapDecodeStream);
                        c0926aM72444k.close();
                    } catch (IOException e5) {
                        c0926a = c0926aM72444k;
                        e = e5;
                        try {
                            Log.e("stripe_image_disk_cache", "error getting bitmap from cache", e);
                            if (c0926a != null) {
                                c0926a.close();
                            }
                            c25032i = null;
                        } catch (Throwable th3) {
                            th = th3;
                            c0926a2 = c0926a;
                            if (c0926a2 != null) {
                                c0926a2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c0926a2 = c0926aM72444k;
                        if (c0926a2 != null) {
                            c0926a2.close();
                        }
                        throw th;
                    }
                }
            } catch (IOException e13) {
                e = e13;
                c0926a = null;
            } catch (Throwable th5) {
                th = th5;
            }
        } else {
            c25032i = null;
        }
        if (c25032i != null) {
            c25046w.m73486f("Image loaded from disk cache");
        } else {
            c25046w.m73486f("Image not found on disk cache");
        }
        if (c25032i == null) {
            return null;
        }
        C23548b c23548b = c25046w.f98133b;
        if (c23548b != null) {
            c23548b.m68163E(key, c25032i);
        }
        return new C23468n(c25032i.f98053b);
    }

    /* JADX INFO: renamed from: b */
    public static final C23468n m73482b(C25046w c25046w, String key) {
        C25032i c25032i;
        C23548b c23548b = c25046w.f98133b;
        if (c23548b != null) {
            AbstractC22676k.m65750j(key, "key");
            synchronized (c23548b) {
                c25032i = (C25032i) ((C25027d) c23548b.f93280x).get(String.valueOf(key.hashCode()));
            }
        } else {
            c25032i = null;
        }
        if (c25032i != null) {
            c25046w.m73486f("Image loaded from memory cache");
        } else {
            c25046w.m73486f("Image not found on memory cache");
        }
        if (c25032i == null) {
            return null;
        }
        C21323g c21323g = c25046w.f98135d;
        if (c21323g != null) {
            c21323g.m59855e(key, c25032i);
        }
        return new C23468n(c25032i.f98053b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public static final Object m73483c(C25046w c25046w, String str, int i13, int i14, AbstractC32269c abstractC32269c) {
        C25043t c25043t;
        Object objM107888l;
        if (abstractC32269c instanceof C25043t) {
            c25043t = (C25043t) abstractC32269c;
            int i15 = c25043t.f98115E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c25043t.f98115E = i15 - Integer.MIN_VALUE;
            } else {
                c25043t = new C25043t(c25046w, abstractC32269c);
            }
        } else {
            c25043t = new C25043t(c25046w, abstractC32269c);
        }
        Object objM73480a = c25043t.f98118y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c25043t.f98115E;
        try {
            if (i16 == 0) {
                AbstractC34132o.m107864I(objM73480a);
                c25046w.m73486f("Image " + str + " loading from internet (" + i13 + " x " + i14 + ")");
                C25034k c25034k = c25046w.f98134c;
                URL url = new URL(str);
                c25043t.f98116w = c25046w;
                c25043t.f98117x = str;
                c25043t.f98115E = 1;
                objM73480a = c25034k.m73480a(url, i13, i14, c25043t);
                if (objM73480a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c25043t.f98117x;
                c25046w = c25043t.f98116w;
                AbstractC34132o.m107864I(objM73480a);
            }
            C25032i c25032i = (C25032i) objM73480a;
            if (c25032i != null) {
                C21323g c21323g = c25046w.f98135d;
                if (c21323g != null) {
                    c21323g.m59855e(str, c25032i);
                }
                C23548b c23548b = c25046w.f98133b;
                if (c23548b != null) {
                    c23548b.m68163E(str, c25032i);
                }
                objM107888l = c25032i.f98053b;
            } else {
                objM107888l = null;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c25046w.f98132a.m94512b("StripeImageLoader: Could not load image from network", thM68037a);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: d */
    public static final Object m73484d(C25046w c25046w, String str, AbstractC32269c abstractC32269c) {
        C25044u c25044u;
        Object objM107888l;
        if (abstractC32269c instanceof C25044u) {
            c25044u = (C25044u) abstractC32269c;
            int i13 = c25044u.f98120E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25044u.f98120E = i13 - Integer.MIN_VALUE;
            } else {
                c25044u = new C25044u(c25046w, abstractC32269c);
            }
        } else {
            c25044u = new C25044u(c25046w, abstractC32269c);
        }
        Object objM73479b = c25044u.f98123y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25044u.f98120E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM73479b);
                c25046w.m73486f("Image " + str + " loading from internet");
                C25034k c25034k = c25046w.f98134c;
                URL url = new URL(str);
                c25044u.f98121w = c25046w;
                c25044u.f98122x = str;
                c25044u.f98120E = 1;
                c25034k.getClass();
                objM73479b = C25034k.m73479b(new BitmapFactory.Options(), url, c25044u);
                if (objM73479b != enumC31071a) {
                    objM73479b = (C25032i) objM73479b;
                }
                if (objM73479b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c25044u.f98122x;
                c25046w = c25044u.f98121w;
                AbstractC34132o.m107864I(objM73479b);
            }
            C25032i c25032i = (C25032i) objM73479b;
            if (c25032i != null) {
                C21323g c21323g = c25046w.f98135d;
                if (c21323g != null) {
                    c21323g.m59855e(str, c25032i);
                }
                C23548b c23548b = c25046w.f98133b;
                if (c23548b != null) {
                    c23548b.m68163E(str, c25032i);
                }
                objM107888l = c25032i.f98053b;
            } else {
                objM107888l = null;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c25046w.f98132a.m94512b("StripeImageLoader: Could not load image from network", thM68037a);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m73485e(C25046w c25046w, String str, Function1 function1, AbstractC32269c abstractC32269c) throws Throwable {
        C25045v c25045v;
        InterfaceC25435a interfaceC25435a;
        Object objPutIfAbsent;
        InterfaceC25435a interfaceC25435a2;
        C25046w c25046w2;
        if (abstractC32269c instanceof C25045v) {
            c25045v = (C25045v) abstractC32269c;
            int i13 = c25045v.f98127G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25045v.f98127G = i13 - Integer.MIN_VALUE;
            } else {
                c25045v = new C25045v(c25046w, abstractC32269c);
            }
        } else {
            c25045v = new C25045v(c25046w, abstractC32269c);
        }
        Object objInvoke = c25045v.f98125E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25045v.f98127G;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                ConcurrentHashMap concurrentHashMap = c25046w.f98136e;
                Object objM74669a = concurrentHashMap.get(str);
                if (objM74669a == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (objM74669a = AbstractC25438d.m74669a()))) != null) {
                    objM74669a = objPutIfAbsent;
                }
                interfaceC25435a = (InterfaceC25435a) objM74669a;
                c25045v.f98128w = c25046w;
                c25045v.f98129x = str;
                c25045v.f98130y = function1;
                c25045v.f98131z = interfaceC25435a;
                c25045v.f98127G = 1;
                if (interfaceC25435a.mo68211b(c25045v) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c25045v.f98130y;
                str = c25045v.f98129x;
                c25046w2 = c25045v.f98128w;
                try {
                    AbstractC34132o.m107864I(objInvoke);
                    interfaceC25435a2.mo68214i(null);
                    c25046w2.f98136e.remove(str);
                    return objInvoke;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
            }
            InterfaceC25435a interfaceC25435a3 = c25045v.f98131z;
            function1 = (Function1) c25045v.f98130y;
            str = c25045v.f98129x;
            C25046w c25046w3 = c25045v.f98128w;
            AbstractC34132o.m107864I(objInvoke);
            interfaceC25435a = interfaceC25435a3;
            c25046w = c25046w3;
            c25045v.f98128w = c25046w;
            c25045v.f98129x = str;
            c25045v.f98130y = interfaceC25435a;
            c25045v.f98131z = null;
            c25045v.f98127G = 2;
            objInvoke = function1.invoke(c25045v);
            if (objInvoke != enumC31071a) {
                c25046w2 = c25046w;
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                c25046w2.f98136e.remove(str);
                return objInvoke;
            }
            return enumC31071a;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m73486f(String str) {
        this.f98132a.m94511a("StripeImageLoader: " + str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m73487g(String str, int i13, int i14, AbstractC32269c abstractC32269c) throws Throwable {
        C25039p c25039p;
        if (abstractC32269c instanceof C25039p) {
            c25039p = (C25039p) abstractC32269c;
            int i15 = c25039p.f98100y;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c25039p.f98100y = i15 - Integer.MIN_VALUE;
            } else {
                c25039p = new C25039p(this, abstractC32269c);
            }
        } else {
            c25039p = new C25039p(this, abstractC32269c);
        }
        Object objM8705K = c25039p.f98098w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c25039p.f98100y;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            C25041r c25041r = new C25041r(this, str, i13, i14, null);
            c25039p.f98100y = 1;
            objM8705K = AbstractC3006f0.m8705K(executorC22364d, c25041r, c25039p);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m73488h(String str, AbstractC32269c abstractC32269c) throws Throwable {
        C25042s c25042s;
        if (abstractC32269c instanceof C25042s) {
            c25042s = (C25042s) abstractC32269c;
            int i13 = c25042s.f98114y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c25042s.f98114y = i13 - Integer.MIN_VALUE;
            } else {
                c25042s = new C25042s(this, abstractC32269c);
            }
        } else {
            c25042s = new C25042s(this, abstractC32269c);
        }
        Object objM8705K = c25042s.f98112w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c25042s.f98114y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            C16670i0 c16670i0 = new C16670i0(this, str, (InterfaceC30057d) null, 25);
            c25042s.f98114y = 1;
            objM8705K = AbstractC3006f0.m8705K(executorC22364d, c16670i0, c25042s);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }
}
