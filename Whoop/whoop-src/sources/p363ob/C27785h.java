package p363ob;

import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import java.util.Locale;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: ob.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C27785h {

    /* JADX INFO: renamed from: a */
    public final String f112020a;

    /* JADX INFO: renamed from: b */
    public final String f112021b;

    /* JADX INFO: renamed from: c */
    public final boolean f112022c;

    /* JADX INFO: renamed from: d */
    public final int f112023d;

    /* JADX INFO: renamed from: e */
    public final String f112024e;

    /* JADX INFO: renamed from: f */
    public final int f112025f;

    /* JADX INFO: renamed from: g */
    public final int f112026g;

    public C27785h(int i13, int i14, String name, String type, String str, boolean z4) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        this.f112020a = name;
        this.f112021b = type;
        this.f112022c = z4;
        this.f112023d = i13;
        this.f112024e = str;
        this.f112025f = i14;
        String upperCase = type.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        this.f112026g = AbstractC39414r.m125876U(upperCase, "INT", false) ? 3 : (AbstractC39414r.m125876U(upperCase, "CHAR", false) || AbstractC39414r.m125876U(upperCase, "CLOB", false) || AbstractC39414r.m125876U(upperCase, ShippingAddressField.TEXT_FIELD_TYPE, false)) ? 2 : AbstractC39414r.m125876U(upperCase, "BLOB", false) ? 5 : (AbstractC39414r.m125876U(upperCase, "REAL", false) || AbstractC39414r.m125876U(upperCase, "FLOA", false) || AbstractC39414r.m125876U(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27785h) {
                boolean z4 = this.f112023d > 0;
                C27785h c27785h = (C27785h) obj;
                int i13 = c27785h.f112025f;
                if (z4 == (c27785h.f112023d > 0) && AbstractC22676k.m65745e(this.f112020a, c27785h.f112020a) && this.f112022c == c27785h.f112022c) {
                    String str = c27785h.f112024e;
                    int i14 = this.f112025f;
                    String str2 = this.f112024e;
                    if ((i14 != 1 || i13 != 2 || str2 == null || AbstractC34235f.m108200F(str2, str)) && ((i14 != 2 || i13 != 1 || str == null || AbstractC34235f.m108200F(str, str2)) && ((i14 == 0 || i14 != i13 || (str2 == null ? str == null : AbstractC34235f.m108200F(str2, str))) && this.f112026g == c27785h.f112026g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f112020a.hashCode() * 31) + this.f112026g) * 31) + (this.f112022c ? 1231 : 1237)) * 31) + this.f112023d;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb4.append(this.f112020a);
        sb4.append("',\n            |   type = '");
        sb4.append(this.f112021b);
        sb4.append("',\n            |   affinity = '");
        sb4.append(this.f112026g);
        sb4.append("',\n            |   notNull = '");
        sb4.append(this.f112022c);
        sb4.append("',\n            |   primaryKeyPosition = '");
        sb4.append(this.f112023d);
        sb4.append("',\n            |   defaultValue = '");
        String str = this.f112024e;
        if (str == null) {
            str = "undefined";
        }
        sb4.append(str);
        sb4.append("'\n            |}\n        ");
        return AbstractC39415s.m125908r(AbstractC39415s.m125910t(sb4.toString()), "    ");
    }
}
