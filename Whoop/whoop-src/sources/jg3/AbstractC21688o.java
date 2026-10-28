package jg3;

import com.mapbox.maps.MapboxMap;
import com.squareup.wire.AbstractC5583n;
import ih0.AbstractC18489d0;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import og3.AbstractC27929h;
import og3.C27928g;
import org.threeten.p379bp.DateTimeException;

/* JADX INFO: renamed from: jg3.o */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21688o implements Serializable {

    /* JADX INFO: renamed from: w */
    public static final Map f83276w;

    static {
        HashMap map = new HashMap();
        map.put("ACT", "Australia/Darwin");
        map.put("AET", "Australia/Sydney");
        map.put("AGT", "America/Argentina/Buenos_Aires");
        map.put("ART", "Africa/Cairo");
        map.put("AST", "America/Anchorage");
        map.put("BET", "America/Sao_Paulo");
        map.put("BST", "Asia/Dhaka");
        map.put("CAT", "Africa/Harare");
        map.put("CNT", "America/St_Johns");
        map.put("CST", "America/Chicago");
        map.put("CTT", "Asia/Shanghai");
        map.put("EAT", "Africa/Addis_Ababa");
        map.put("ECT", "Europe/Paris");
        map.put("IET", "America/Indiana/Indianapolis");
        map.put("IST", "Asia/Kolkata");
        map.put("JST", "Asia/Tokyo");
        map.put("MIT", "Pacific/Apia");
        map.put("NET", "Asia/Yerevan");
        map.put("NST", "Pacific/Auckland");
        map.put("PLT", "Asia/Karachi");
        map.put("PNT", "America/Phoenix");
        map.put("PRT", "America/Puerto_Rico");
        map.put("PST", "America/Los_Angeles");
        map.put("SST", "Pacific/Guadalcanal");
        map.put("VST", "Asia/Ho_Chi_Minh");
        map.put("EST", "-05:00");
        map.put("MST", "-07:00");
        map.put("HST", "-10:00");
        f83276w = Collections.unmodifiableMap(map);
    }

    public AbstractC21688o() {
        if (getClass() != C21689p.class && getClass() != C21690q.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC21688o m61069l(String str) {
        AbstractC5583n.m16762V(str, "zoneId");
        if (str.equals("Z")) {
            return C21689p.f83278F;
        }
        if (str.length() == 1) {
            throw new DateTimeException("Invalid zone: ".concat(str));
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            return C21689p.m61074p(str);
        }
        if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            C21689p c21689p = C21689p.f83278F;
            c21689p.getClass();
            return new C21690q(str, new C27928g(c21689p));
        }
        if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
            C21689p c21689pM61074p = C21689p.m61074p(str.substring(3));
            if (c21689pM61074p.f83282x == 0) {
                return new C21690q(str.substring(0, 3), new C27928g(c21689pM61074p));
            }
            return new C21690q(str.substring(0, 3) + c21689pM61074p.f83283y, new C27928g(c21689pM61074p));
        }
        if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
            return C21690q.m61080o(str, true);
        }
        C21689p c21689pM61074p2 = C21689p.m61074p(str.substring(2));
        if (c21689pM61074p2.f83282x == 0) {
            return new C21690q("UT", new C27928g(c21689pM61074p2));
        }
        return new C21690q("UT" + c21689pM61074p2.f83283y, new C27928g(c21689pM61074p2));
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC21688o m61070m(String str, C21689p c21689p) {
        AbstractC5583n.m16762V(str, "prefix");
        AbstractC5583n.m16762V(c21689p, MapboxMap.QFE_OFFSET);
        if (str.length() == 0) {
            return c21689p;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("Invalid prefix, must be GMT, UTC or UT: ".concat(str));
        }
        if (c21689p.f83282x == 0) {
            return new C21690q(str, new C27928g(c21689p));
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(c21689p.f83283y);
        return new C21690q(sbM53374o.toString(), new C27928g(c21689p));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC21688o) {
            return getId().equals(((AbstractC21688o) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public int hashCode() {
        return getId().hashCode();
    }

    /* JADX INFO: renamed from: k */
    public abstract AbstractC27929h mo61071k();

    /* JADX INFO: renamed from: n */
    public abstract void mo61072n(ObjectOutput objectOutput);

    public String toString() {
        return getId();
    }
}
