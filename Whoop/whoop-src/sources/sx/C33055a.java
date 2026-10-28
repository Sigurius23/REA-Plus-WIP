package sx;

import com.squareup.moshi.JsonAdapter;
import j93.InterfaceC21484q;
import j93.InterfaceC21490w;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C33055a {

    /* JADX INFO: renamed from: a */
    public final String f137844a;

    /* JADX INFO: renamed from: b */
    public final JsonAdapter f137845b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21490w f137846c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC21484q f137847d;

    /* JADX INFO: renamed from: e */
    public final int f137848e;

    public C33055a(String jsonName, JsonAdapter jsonAdapter, InterfaceC21490w interfaceC21490w, InterfaceC21484q interfaceC21484q, int i13) {
        AbstractC22676k.m65750j(jsonName, "jsonName");
        this.f137844a = jsonName;
        this.f137845b = jsonAdapter;
        this.f137846c = interfaceC21490w;
        this.f137847d = interfaceC21484q;
        this.f137848e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33055a)) {
            return false;
        }
        C33055a c33055a = (C33055a) obj;
        return AbstractC22676k.m65745e(this.f137844a, c33055a.f137844a) && AbstractC22676k.m65745e(this.f137845b, c33055a.f137845b) && AbstractC22676k.m65745e(this.f137846c, c33055a.f137846c) && AbstractC22676k.m65745e(this.f137847d, c33055a.f137847d) && this.f137848e == c33055a.f137848e;
    }

    public final int hashCode() {
        int iHashCode = (this.f137846c.hashCode() + ((this.f137845b.hashCode() + (this.f137844a.hashCode() * 31)) * 31)) * 31;
        InterfaceC21484q interfaceC21484q = this.f137847d;
        return Integer.hashCode(this.f137848e) + ((iHashCode + (interfaceC21484q == null ? 0 : interfaceC21484q.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Binding(jsonName=");
        sb4.append(this.f137844a);
        sb4.append(", adapter=");
        sb4.append(this.f137845b);
        sb4.append(", property=");
        sb4.append(this.f137846c);
        sb4.append(", parameter=");
        sb4.append(this.f137847d);
        sb4.append(", propertyIndex=");
        return AbstractC11895b.m31999r(sb4, this.f137848e, ')');
    }
}
