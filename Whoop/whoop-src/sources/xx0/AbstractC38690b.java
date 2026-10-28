package xx0;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xx0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u0013\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\r\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"", "g", "(Ljava/lang/String;)Ljava/lang/String;", "f", "d", "c", "e", "Lfi0/a;", "source", "Ll83/a0;", "b", "(Lfi0/a;Ljava/lang/String;)V", "label", "a", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V", "deep-dive_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38690b {
    /* JADX INFO: renamed from: a */
    public static final void m124089a(InterfaceC14515a interfaceC14515a, String source, String label) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(label, "label");
        interfaceC14515a.mo41428k("Navigation", ProfileAnalyticsKt.OPEN, label, "Deep Dive", AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: b */
    public static final void m124090b(InterfaceC14515a interfaceC14515a, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, ProfileAnalyticsKt.SCROLLED_TO_BOTTOM, source, "Deep Dive", null, null, 49, null);
    }

    /* JADX INFO: renamed from: c */
    public static final String m124091c(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -1838664331) {
            return str.equals("STRAIN") ? "Strain" : "";
        }
        if (iHashCode != -16486507) {
            return (iHashCode == 78984887 && str.equals("SLEEP")) ? "Sleep" : "";
        }
        return !str.equals("RECOVERY") ? "" : "Recovery";
    }

    /* JADX INFO: renamed from: d */
    public static final String m124092d(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -1838664331) {
            return str.equals("STRAIN") ? "Strain Deep Dive" : "";
        }
        if (iHashCode != -16486507) {
            return (iHashCode == 78984887 && str.equals("SLEEP")) ? "Sleep Deep Dive" : "";
        }
        return !str.equals("RECOVERY") ? "" : "Recovery Deep Dive";
    }

    /* JADX INFO: renamed from: e */
    public static final String m124093e(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -1838664331) {
            return str.equals("STRAIN") ? "strain_deep_dive" : "";
        }
        if (iHashCode != -16486507) {
            return (iHashCode == 78984887 && str.equals("SLEEP")) ? "sleep_deep_dive" : "";
        }
        return !str.equals("RECOVERY") ? "" : "recovery_deep_dive";
    }

    /* JADX INFO: renamed from: f */
    public static final String m124094f(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -1838664331) {
            return str.equals("STRAIN") ? "Strain Deep Dive – Trend" : "";
        }
        if (iHashCode != -16486507) {
            return (iHashCode == 78984887 && str.equals("SLEEP")) ? "Sleep Deep Dive – Trend" : "";
        }
        return !str.equals("RECOVERY") ? "" : "Recovery Deep Dive – Trend";
    }

    /* JADX INFO: renamed from: g */
    public static final String m124095g(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == -1838664331) {
            return str.equals("STRAIN") ? "Strain Deep Dive – Key Stat" : "";
        }
        if (iHashCode != -16486507) {
            return (iHashCode == 78984887 && str.equals("SLEEP")) ? "Sleep Deep Dive – Key Stat" : "";
        }
        return !str.equals("RECOVERY") ? "" : "Recovery Deep Dive – Key Stat";
    }
}
