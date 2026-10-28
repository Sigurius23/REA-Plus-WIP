package bd3;

import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import bc3.AbstractC3034m0;
import dj.C12056a;
import gl.C15959x;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.AbstractC20582d;
import j43.C21317a;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kh.C22467a;
import kh.C22468b;
import kh.C22472f;
import l83.C23454a0;
import m83.AbstractC25265s;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import ne3.C26608d;
import no.nordicsemi.android.ble.AbstractC26903k0;
import p088dc.AbstractC11895b;
import p136f4.C14050b;
import p306ll.InterfaceC24498a;
import p343nk.C26789j;
import p505ts.AbstractC34132o;
import p511u1.C34408o;
import p586wk.C37330h;
import p684zk.InterfaceC40801z;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bd3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C3143v implements InterfaceC24498a, InterfaceC25459e, InterfaceC25457c, InterfaceC25458d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12309w;

    /* JADX INFO: renamed from: x */
    public int f12310x;

    /* JADX INFO: renamed from: y */
    public Object f12311y;

    public /* synthetic */ C3143v(int i13, char c3) {
        this.f12309w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public Object m9032a(C21317a c21317a, AbstractC32269c abstractC32269c) {
        C26789j c26789j;
        C3143v c3143v;
        AtomicInteger atomicInteger = (AtomicInteger) this.f12311y;
        if (abstractC32269c instanceof C26789j) {
            c26789j = (C26789j) abstractC32269c;
            int i13 = c26789j.f106704E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26789j.f106704E = i13 - Integer.MIN_VALUE;
            } else {
                c26789j = new C26789j(this, abstractC32269c);
            }
        } else {
            c26789j = new C26789j(this, abstractC32269c);
        }
        Object obj = c26789j.f106707y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26789j.f106704E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (atomicInteger.get() >= this.f12310x) {
                c21317a.invoke(Boolean.FALSE);
                return c23454a0;
            }
            double dPow = Math.pow(2.0d, atomicInteger.get());
            c26789j.f106705w = this;
            c26789j.f106706x = c21317a;
            c26789j.f106704E = 1;
            if (AbstractC3034m0.m8782b((long) (dPow * ((double) 1000)), c26789j) == enumC31071a) {
                return enumC31071a;
            }
            c3143v = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c21317a = c26789j.f106706x;
            c3143v = c26789j.f106705w;
            AbstractC34132o.m107864I(obj);
        }
        c21317a.invoke(Boolean.TRUE);
        ((AtomicInteger) c3143v.f12311y).incrementAndGet();
        return c23454a0;
    }

    @Override // md3.InterfaceC25458d
    /* JADX INFO: renamed from: b */
    public void mo9033b() {
        this.f12310x = -1000000;
        ((AbstractC26903k0) this.f12311y).f107384c.open();
    }

    @Override // md3.InterfaceC25457c
    /* JADX INFO: renamed from: c */
    public void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
        this.f12310x = i13;
        ((AbstractC26903k0) this.f12311y).f107384c.open();
    }

    @Override // md3.InterfaceC25459e
    /* JADX INFO: renamed from: d */
    public void mo9035d(BluetoothDevice bluetoothDevice) {
        ((AbstractC26903k0) this.f12311y).f107384c.open();
    }

    /* JADX INFO: renamed from: e */
    public void m9036e() {
        WeakReference weakReference;
        this.f12310x = 0;
        Iterator it = ((LinkedHashMap) this.f12311y).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                C22472f c22472f = (C22472f) AbstractC25265s.m74100H0(arrayList);
                if (((c22472f == null || (weakReference = c22472f.f88027b) == null) ? null : (Bitmap) weakReference.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    int i15 = i14 - i13;
                    if (((C22472f) arrayList.get(i15)).f88027b.get() == null) {
                        arrayList.remove(i15);
                        i13++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9037f(int i13, int i14) {
        int i15 = i14 + i13;
        char[] cArr = (char[]) this.f12311y;
        if (cArr.length <= i15) {
            int i16 = i13 * 2;
            if (i15 < i16) {
                i15 = i16;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i15);
            AbstractC22676k.m65749i(cArrCopyOf, "copyOf(...)");
            this.f12311y = cArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized C22468b m9038g(C22467a c22467a) {
        try {
            ArrayList arrayList = (ArrayList) ((LinkedHashMap) this.f12311y).get(c22467a);
            C22468b c22468b = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C22472f c22472f = (C22472f) arrayList.get(i13);
                Bitmap bitmap = (Bitmap) c22472f.f88027b.get();
                C22468b c22468b2 = bitmap != null ? new C22468b(bitmap, c22472f.f88028c) : null;
                if (c22468b2 != null) {
                    c22468b = c22468b2;
                    break;
                }
            }
            int i14 = this.f12310x;
            this.f12310x = i14 + 1;
            if (i14 >= 10) {
                m9036e();
            }
            return c22468b;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m9039h() {
        return ((C12056a) this.f12311y) != null;
    }

    /* JADX INFO: renamed from: i */
    public void m9040i(int i13, C26608d c26608d) {
        while (true) {
            int i14 = i13 >> 1;
            if (i14 == 0) {
                break;
            }
            C26608d c26608d2 = ((C26608d[]) this.f12311y)[i14];
            AbstractC22676k.m65747g(c26608d2);
            if (AbstractC22676k.m65752l(0L, c26608d.f105845g - c26608d2.f105845g) <= 0) {
                break;
            }
            c26608d2.f105844f = i13;
            ((C26608d[]) this.f12311y)[i13] = c26608d2;
            i13 = i14;
        }
        ((C26608d[]) this.f12311y)[i13] = c26608d;
        c26608d.f105844f = i13;
    }

    /* JADX INFO: renamed from: j */
    public HashMap m9041j(Map map, InterfaceC20602v0 interfaceC20602v0) {
        HashMap map2 = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                map2.put(obj.toString(), m9044m(interfaceC20602v0, obj2));
            } else {
                map2.put(obj.toString(), null);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: k */
    public void m9042k(C14050b c14050b) {
        int i13 = this.f12310x;
        Object[] objArr = (Object[]) this.f12311y;
        if (i13 < objArr.length) {
            objArr[i13] = c14050b;
            this.f12310x = i13 + 1;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m9043l(C26608d c26608d) {
        C26608d c26608d2;
        int i13 = c26608d.f105844f;
        if (i13 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i14 = this.f12310x;
        C26608d c26608d3 = ((C26608d[]) this.f12311y)[i14];
        AbstractC22676k.m65747g(c26608d3);
        c26608d.f105844f = -1;
        ((C26608d[]) this.f12311y)[i14] = null;
        this.f12310x = i14 - 1;
        if (c26608d == c26608d3) {
            return;
        }
        int iM65752l = AbstractC22676k.m65752l(0L, c26608d3.f105845g - c26608d.f105845g);
        if (iM65752l == 0) {
            ((C26608d[]) this.f12311y)[i13] = c26608d3;
            c26608d3.f105844f = i13;
            return;
        }
        if (iM65752l >= 0) {
            m9040i(i13, c26608d3);
            return;
        }
        while (true) {
            int i15 = i13 << 1;
            int i16 = i15 + 1;
            int i17 = this.f12310x;
            if (i16 > i17) {
                if (i15 > i17) {
                    break;
                }
                c26608d2 = ((C26608d[]) this.f12311y)[i15];
                AbstractC22676k.m65747g(c26608d2);
            } else {
                c26608d2 = ((C26608d[]) this.f12311y)[i15];
                AbstractC22676k.m65747g(c26608d2);
                C26608d c26608d4 = ((C26608d[]) this.f12311y)[i16];
                AbstractC22676k.m65747g(c26608d4);
                if (AbstractC22676k.m65752l(0L, c26608d4.f105845g - c26608d2.f105845g) >= 0) {
                    c26608d2 = c26608d4;
                }
            }
            if (AbstractC22676k.m65752l(0L, c26608d2.f105845g - c26608d3.f105845g) <= 0) {
                break;
            }
            int i18 = c26608d2.f105844f;
            c26608d2.f105844f = i13;
            ((C26608d[]) this.f12311y)[i13] = c26608d2;
            i13 = i18;
        }
        ((C26608d[]) this.f12311y)[i13] = c26608d3;
        c26608d3.f105844f = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: m */
    public Object m9044m(InterfaceC20602v0 interfaceC20602v0, Object obj) {
        Object objM9045n;
        HashSet hashSet = (HashSet) this.f12311y;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i13 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = AbstractC20582d.f77083a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            while (i13 < length) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i13)));
                i13++;
            }
            return arrayList;
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (!(obj instanceof URI) && !(obj instanceof InetAddress) && !(obj instanceof UUID) && !(obj instanceof Currency)) {
            if (obj instanceof Calendar) {
                return AbstractC20582d.m56713a((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (hashSet.contains(obj)) {
                interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            hashSet.add(obj);
            try {
                if (hashSet.size() > this.f12310x) {
                    hashSet.remove(obj);
                    interfaceC20602v0.mo16066m(EnumC20436n5.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        Object[] objArr = (Object[]) obj;
                        objM9045n = new ArrayList();
                        int length2 = objArr.length;
                        while (i13 < length2) {
                            objM9045n.add(m9044m(interfaceC20602v0, objArr[i13]));
                            i13++;
                        }
                    } else if (obj instanceof Collection) {
                        objM9045n = new ArrayList();
                        Iterator it = ((Collection) obj).iterator();
                        while (it.hasNext()) {
                            objM9045n.add(m9044m(interfaceC20602v0, it.next()));
                        }
                    } else if (obj instanceof Map) {
                        objM9045n = m9041j((Map) obj, interfaceC20602v0);
                    } else {
                        objM9045n = m9045n(interfaceC20602v0, obj);
                        if (objM9045n.isEmpty()) {
                            objM9045n = obj.toString();
                        }
                    }
                    return objM9045n;
                } catch (Exception e5) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.INFO, "Not serializing object due to throwing sub-path.", e5);
                    return null;
                }
            } finally {
                hashSet.remove(obj);
            }
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: n */
    public HashMap m9045n(InterfaceC20602v0 interfaceC20602v0, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap map = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    map.put(name, m9044m(interfaceC20602v0, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.INFO, AbstractC11895b.m31996o("Cannot access field ", name, "."), new Object[0]);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m9046o(C22467a c22467a, Bitmap bitmap, Map map, int i13) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f12311y;
            Object arrayList = linkedHashMap.get(c22467a);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c22467a, arrayList);
            }
            ArrayList arrayList2 = (ArrayList) arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            C22472f c22472f = new C22472f(iIdentityHashCode, new WeakReference(bitmap), map, i13);
            int size = arrayList2.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    arrayList2.add(c22472f);
                    break;
                }
                C22472f c22472f2 = (C22472f) arrayList2.get(i14);
                if (i13 >= c22472f2.f88029d) {
                    if (c22472f2.f88026a != iIdentityHashCode || c22472f2.f88027b.get() != bitmap) {
                        arrayList2.add(i14, c22472f);
                        break;
                    } else {
                        arrayList2.set(i14, c22472f);
                        break;
                    }
                }
                i14++;
            }
            int i15 = this.f12310x;
            this.f12310x = i15 + 1;
            if (i15 >= 10) {
                m9036e();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9047p(String text) {
        AbstractC22676k.m65750j(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m9037f(this.f12310x, length);
        text.getChars(0, text.length(), (char[]) this.f12311y, this.f12310x);
        this.f12310x += length;
    }

    @Override // p306ll.InterfaceC24498a
    /* JADX INFO: renamed from: t */
    public InterfaceC40801z mo714t(InterfaceC40801z interfaceC40801z, C37330h c37330h) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC40801z.get()).compress((Bitmap.CompressFormat) this.f12311y, this.f12310x, byteArrayOutputStream);
        interfaceC40801z.mo44996a();
        return new C15959x(byteArrayOutputStream.toByteArray());
    }

    public String toString() {
        switch (this.f12309w) {
            case 0:
                return new String((char[]) this.f12311y, 0, this.f12310x);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C3143v(Object obj, int i13) {
        this.f12309w = i13;
        this.f12310x = 0;
        this.f12311y = obj;
    }

    public C3143v(int i13, int i14) {
        this.f12309w = i14;
        switch (i14) {
            case 8:
                this.f12310x = i13;
                this.f12311y = new AtomicInteger(0);
                break;
            default:
                this.f12311y = new HashSet();
                this.f12310x = i13;
                break;
        }
    }

    public C3143v(C34408o c34408o, int i13) {
        this.f12309w = 10;
        this.f12311y = c34408o;
        this.f12310x = i13;
    }

    public C3143v(ArrayList arrayList) {
        this.f12309w = 11;
        this.f12311y = arrayList;
    }

    public C3143v(int i13, byte b) {
        this.f12309w = i13;
        switch (i13) {
            case 2:
                this.f12310x = 255;
                this.f12311y = null;
                break;
            case 3:
                this.f12311y = new Object[256];
                break;
            case 4:
            default:
                this.f12310x = 1;
                this.f12311y = Collections.singletonList(null);
                break;
            case 5:
                this.f12311y = new LinkedHashMap();
                break;
            case 6:
                this.f12311y = Bitmap.CompressFormat.JPEG;
                this.f12310x = 100;
                break;
        }
    }
}
