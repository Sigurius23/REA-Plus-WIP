package ad3;

import bd3.AbstractC3129j0;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C0776s extends JsonPrimitive {

    /* JADX INFO: renamed from: w */
    public final boolean f2809w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39443g f2810x;

    /* JADX INFO: renamed from: y */
    public final String f2811y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0776s(Object body, boolean z4, InterfaceC39443g interfaceC39443g) {
        super(null);
        AbstractC22676k.m65750j(body, "body");
        this.f2809w = z4;
        this.f2810x = interfaceC39443g;
        this.f2811y = body.toString();
        if (interfaceC39443g != null && !interfaceC39443g.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0776s.class != obj.getClass()) {
            return false;
        }
        C0776s c0776s = (C0776s) obj;
        return this.f2809w == c0776s.f2809w && AbstractC22676k.m65745e(this.f2811y, c0776s.f2811y);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.f2811y;
    }

    public final int hashCode() {
        return this.f2811y.hashCode() + (Boolean.hashCode(this.f2809w) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final boolean isString() {
        return this.f2809w;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z4 = this.f2809w;
        String str = this.f2811y;
        if (!z4) {
            return str;
        }
        StringBuilder sb4 = new StringBuilder();
        AbstractC3129j0.m8988a(sb4, str);
        return sb4.toString();
    }
}
