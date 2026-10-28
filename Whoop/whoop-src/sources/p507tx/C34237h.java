package p507tx;

import b30.C2570m;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5585p;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.EnumC5595z;
import com.squareup.wire.ProtoAdapter$EnumConstantNotFoundException;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ne3.C26616h;
import ne3.C26624l;
import p249jc.AbstractC21598x;
import p450r5.C30929c;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: tx.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C34237h extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final C2570m f143615a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21461d f143616b;

    /* JADX INFO: renamed from: c */
    public final Map f143617c;

    /* JADX INFO: renamed from: d */
    public final AbstractC34232c[] f143618d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C34237h(C2570m c2570m) {
        InterfaceC21461d interfaceC21461d = (InterfaceC21461d) c2570m.f9987x;
        super(EnumC5573d.LENGTH_DELIMITED, interfaceC21461d, (String) c2570m.f9984E, (EnumC5593x) c2570m.f9985F);
        this.f143615a = c2570m;
        this.f143616b = interfaceC21461d;
        Map map = (Map) c2570m.f9989z;
        this.f143617c = map;
        AbstractC34232c[] abstractC34232cArr = (AbstractC34232c[]) map.values().toArray(new AbstractC34232c[0]);
        this.f143618d = abstractC34232cArr;
        ArrayList arrayList = new ArrayList(abstractC34232cArr.length);
        for (AbstractC34232c abstractC34232c : abstractC34232cArr) {
            arrayList.add(m108241a(abstractC34232c));
        }
        AbstractC34232c[] abstractC34232cArr2 = this.f143618d;
        ArrayList arrayList2 = new ArrayList(abstractC34232cArr2.length);
        for (AbstractC34232c abstractC34232c2 : abstractC34232cArr2) {
            arrayList2.add(m108241a(abstractC34232c2));
        }
        AbstractC34232c[] abstractC34232cArr3 = this.f143618d;
        ArrayList arrayList3 = new ArrayList(abstractC34232cArr3.length);
        for (AbstractC34232c abstractC34232c3 : abstractC34232cArr3) {
            String strM108241a = m108241a(abstractC34232c3);
            C34231b c34231b = (C34231b) abstractC34232c3;
            String string = c34231b.f143602e;
            String string2 = c34231b.f143604g;
            if (!AbstractC22676k.m65745e(strM108241a, string2)) {
                string = string2;
            } else if (AbstractC22676k.m65745e(m108241a(abstractC34232c3), string)) {
                AbstractC22676k.m65750j(string2, "string");
                StringBuilder sb4 = new StringBuilder(string2.length());
                int iCharCount = 0;
                boolean z4 = false;
                while (iCharCount < string2.length()) {
                    int iCodePointAt = string2.codePointAt(iCharCount);
                    iCharCount += Character.charCount(iCodePointAt);
                    if (iCodePointAt == 95) {
                        z4 = true;
                    } else {
                        if (z4 && 97 <= iCodePointAt && iCodePointAt < 123) {
                            iCodePointAt -= 32;
                        }
                        sb4.appendCodePoint(iCodePointAt);
                        z4 = false;
                    }
                }
                string = sb4.toString();
                AbstractC22676k.m65749i(string, "StringBuilder(capacity).…builderAction).toString()");
                if (AbstractC22676k.m65745e(m108241a(abstractC34232c3), string) || arrayList2.contains(string)) {
                    string = null;
                }
            }
            arrayList3.add(string);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m108241a(AbstractC34232c abstractC34232c) {
        AbstractC22676k.m65750j(abstractC34232c, "<this>");
        C34231b c34231b = (C34231b) abstractC34232c;
        String str = c34231b.f143603f;
        return str.length() == 0 ? c34231b.f143604g : str;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) throws IOException {
        AbstractC5586q abstractC5586qM16803b;
        AbstractC22676k.m65750j(reader, "reader");
        AbstractC5579j abstractC5579j = (AbstractC5579j) ((C30929c) this.f143615a.f9988y).invoke();
        long jM16807d = reader.m16807d();
        while (true) {
            int iM16810g = reader.m16810g();
            if (iM16810g == -1) {
                reader.m16808e(jM16807d);
                return abstractC5579j.mo16740a();
            }
            AbstractC34232c abstractC34232c = (AbstractC34232c) this.f143617c.get(Integer.valueOf(iM16810g));
            if (abstractC34232c != null) {
                try {
                    if (((C34231b) abstractC34232c).f143606i.length() > 0) {
                        abstractC5586qM16803b = (AbstractC5586q) abstractC34232c.f143612a.getValue();
                    } else {
                        C34231b c34231b = (C34231b) abstractC34232c;
                        C5585p c5585p = AbstractC5586q.Companion;
                        String str = c34231b.f143607j;
                        ClassLoader classLoader = c34231b.f143600c;
                        c5585p.getClass();
                        abstractC5586qM16803b = C5585p.m16803b(str, classLoader);
                    }
                    Object objDecode = abstractC5586qM16803b.decode(reader);
                    AbstractC22676k.m65747g(objDecode);
                    abstractC34232c.mo108194b(abstractC5579j, objDecode);
                } catch (ProtoAdapter$EnumConstantNotFoundException e5) {
                    C2570m.m7473o(abstractC5579j, iM16810g, EnumC5573d.VARINT, Long.valueOf(e5.f22081w));
                }
            } else {
                EnumC5573d enumC5573d = reader.f22113h;
                AbstractC22676k.m65747g(enumC5573d);
                C2570m.m7473o(abstractC5579j, iM16810g, enumC5573d, enumC5573d.m16739a().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object value) throws IOException {
        AbstractC22676k.m65750j(value, "value");
        for (AbstractC34232c abstractC34232c : this.f143617c.values()) {
            Object objMo108193a = abstractC34232c.mo108193a(value);
            if (objMo108193a != null) {
                ((AbstractC5586q) abstractC34232c.f143612a.getValue()).encodeWithTag(c5588s, ((C34231b) abstractC34232c).f143605h, objMo108193a);
            }
        }
        this.f143615a.getClass();
        c5588s.m16818a(((AbstractC5581l) value).unknownFields());
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object value) {
        AbstractC22676k.m65750j(value, "value");
        this.f143615a.getClass();
        AbstractC5581l abstractC5581l = (AbstractC5581l) value;
        int cachedSerializedSize$wire_runtime = abstractC5581l.getCachedSerializedSize$wire_runtime();
        if (cachedSerializedSize$wire_runtime != 0) {
            return cachedSerializedSize$wire_runtime;
        }
        int iEncodedSizeWithTag = 0;
        for (AbstractC34232c abstractC34232c : this.f143617c.values()) {
            Object objMo108193a = abstractC34232c.mo108193a(value);
            if (objMo108193a != null) {
                iEncodedSizeWithTag += ((AbstractC5586q) abstractC34232c.f143612a.getValue()).encodedSizeWithTag(((C34231b) abstractC34232c).f143605h, objMo108193a);
            }
        }
        int iMo79253d = abstractC5581l.unknownFields().mo79253d() + iEncodedSizeWithTag;
        abstractC5581l.setCachedSerializedSize$wire_runtime(iMo79253d);
        return iMo79253d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C34237h) && AbstractC22676k.m65745e(((C34237h) obj).f143616b, this.f143616b);
    }

    public final int hashCode() {
        return this.f143616b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [c93.m, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [c93.m, kotlin.jvm.internal.m] */
    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object value) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC5579j abstractC5579j = (AbstractC5579j) ((C30929c) this.f143615a.f9988y).invoke();
        Iterator it = this.f143617c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC5579j.f22100a = C26624l.f105881E;
                C26616h c26616h = abstractC5579j.f22101b;
                if (c26616h != null) {
                    c26616h.m79200b();
                    abstractC5579j.f22101b = null;
                }
                abstractC5579j.f22102c = null;
                return abstractC5579j.mo16740a();
            }
            AbstractC34232c abstractC34232c = (AbstractC34232c) it.next();
            C34231b c34231b = (C34231b) abstractC34232c;
            if (c34231b.f143608k && c34231b.f143601d == EnumC5595z.f22134w) {
                throw new UnsupportedOperationException("Field '" + c34231b.f143602e + "' in " + getType() + " is required and cannot be redacted.");
            }
            EnumC5595z enumC5595z = c34231b.f143601d;
            C5585p c5585p = AbstractC5586q.Companion;
            String str = c34231b.f143607j;
            ClassLoader classLoader = c34231b.f143600c;
            c5585p.getClass();
            InterfaceC21461d type = C5585p.m16803b(str, classLoader).getType();
            boolean zIsAssignableFrom = AbstractC5581l.class.isAssignableFrom(type != null ? AbstractC21598x.m60664T(type) : null);
            if (c34231b.f143608k || (zIsAssignableFrom && !enumC5595z.m16831a())) {
                Object objM108195c = c34231b.m108195c(abstractC5579j);
                if (objM108195c != null) {
                    ((C34231b) abstractC34232c).f143609l.invoke(abstractC5579j, ((AbstractC5586q) abstractC34232c.f143612a.getValue()).redact(objM108195c));
                }
            } else if (zIsAssignableFrom && enumC5595z.m16831a()) {
                Object objM108195c2 = c34231b.m108195c(abstractC5579j);
                AbstractC22676k.m65748h(objM108195c2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                c34231b.getClass();
                String str2 = c34231b.f143607j;
                ClassLoader classLoader2 = c34231b.f143600c;
                c5585p.getClass();
                ((C34231b) abstractC34232c).f143609l.invoke(abstractC5579j, AbstractC32103e.m99879a((List) objM108195c2, C5585p.m16803b(str2, classLoader2)));
            }
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final String toString(Object value) {
        AbstractC22676k.m65750j(value, "value");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f143616b.getSimpleName());
        sb4.append('{');
        boolean z4 = true;
        for (AbstractC34232c abstractC34232c : this.f143617c.values()) {
            Object objMo108193a = abstractC34232c.mo108193a(value);
            if (objMo108193a != null) {
                if (!z4) {
                    sb4.append(", ");
                }
                C34231b c34231b = (C34231b) abstractC34232c;
                sb4.append(c34231b.f143602e);
                sb4.append('=');
                if (c34231b.f143608k) {
                    objMo108193a = "██";
                }
                sb4.append(objMo108193a);
                z4 = false;
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object value) throws IOException {
        AbstractC22676k.m65750j(value, "value");
        this.f143615a.getClass();
        c5591v.m16825d(((AbstractC5581l) value).unknownFields());
        AbstractC34232c[] abstractC34232cArr = this.f143618d;
        int length = abstractC34232cArr.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            }
            AbstractC34232c abstractC34232c = abstractC34232cArr[length];
            Object objMo108193a = abstractC34232c.mo108193a(value);
            if (objMo108193a != null) {
                ((AbstractC5586q) abstractC34232c.f143612a.getValue()).encodeWithTag(c5591v, ((C34231b) abstractC34232c).f143605h, objMo108193a);
            }
        }
    }
}
