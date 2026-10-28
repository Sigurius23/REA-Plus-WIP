package as1;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: as1.k */
/* JADX INFO: loaded from: classes9.dex */
public class C1950k implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f7750a = new HashMap();

    private C1950k() {
    }

    public static C1950k fromBundle(Bundle bundle) {
        C1950k c1950k = new C1950k();
        if (!AbstractC17176i.m48518t(bundle, C1950k.class, "cycleId")) {
            throw new IllegalArgumentException("Required argument \"cycleId\" is missing and does not have an android:defaultValue");
        }
        c1950k.f7750a.put("cycleId", Long.valueOf(bundle.getLong("cycleId")));
        if (!bundle.containsKey("previousCycleStartTime")) {
            throw new IllegalArgumentException("Required argument \"previousCycleStartTime\" is missing and does not have an android:defaultValue");
        }
        c1950k.f7750a.put("previousCycleStartTime", Long.valueOf(bundle.getLong("previousCycleStartTime")));
        if (!bundle.containsKey("previousCycleEndTIme")) {
            throw new IllegalArgumentException("Required argument \"previousCycleEndTIme\" is missing and does not have an android:defaultValue");
        }
        c1950k.f7750a.put("previousCycleEndTIme", Long.valueOf(bundle.getLong("previousCycleEndTIme")));
        if (bundle.containsKey("isFromJournalIntro")) {
            c1950k.f7750a.put("isFromJournalIntro", Boolean.valueOf(bundle.getBoolean("isFromJournalIntro")));
        } else {
            c1950k.f7750a.put("isFromJournalIntro", Boolean.FALSE);
        }
        if (bundle.containsKey("showCustomize")) {
            c1950k.f7750a.put("showCustomize", Boolean.valueOf(bundle.getBoolean("showCustomize")));
        } else {
            c1950k.f7750a.put("showCustomize", Boolean.FALSE);
        }
        if (bundle.containsKey("isAutoPop")) {
            c1950k.f7750a.put("isAutoPop", Boolean.valueOf(bundle.getBoolean("isAutoPop")));
        } else {
            c1950k.f7750a.put("isAutoPop", Boolean.FALSE);
        }
        if (bundle.containsKey("todayCycleStartTime")) {
            c1950k.f7750a.put("todayCycleStartTime", Long.valueOf(bundle.getLong("todayCycleStartTime")));
        } else {
            c1950k.f7750a.put("todayCycleStartTime", -1L);
        }
        if (bundle.containsKey("todayCycleEndTime")) {
            c1950k.f7750a.put("todayCycleEndTime", Long.valueOf(bundle.getLong("todayCycleEndTime")));
        } else {
            c1950k.f7750a.put("todayCycleEndTime", -1L);
        }
        if (bundle.containsKey("fromSettings")) {
            c1950k.f7750a.put("fromSettings", Boolean.valueOf(bundle.getBoolean("fromSettings")));
        } else {
            c1950k.f7750a.put("fromSettings", Boolean.FALSE);
        }
        if (bundle.containsKey("source")) {
            c1950k.f7750a.put("source", bundle.getString("source"));
        } else {
            c1950k.f7750a.put("source", null);
        }
        if (bundle.containsKey("newHome")) {
            c1950k.f7750a.put("newHome", Boolean.valueOf(bundle.getBoolean("newHome")));
        } else {
            c1950k.f7750a.put("newHome", Boolean.FALSE);
        }
        if (bundle.containsKey("fromFab")) {
            c1950k.f7750a.put("fromFab", Boolean.valueOf(bundle.getBoolean("fromFab")));
        } else {
            c1950k.f7750a.put("fromFab", Boolean.FALSE);
        }
        if (bundle.containsKey("requestDate")) {
            String string = bundle.getString("requestDate");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"requestDate\" is marked as non-null but was passed a null value.");
            }
            c1950k.f7750a.put("requestDate", string);
        } else {
            c1950k.f7750a.put("requestDate", "");
        }
        if (!bundle.containsKey("label")) {
            c1950k.f7750a.put("label", null);
            return c1950k;
        }
        c1950k.f7750a.put("label", bundle.getString("label"));
        return c1950k;
    }

    /* JADX INFO: renamed from: a */
    public long m5947a() {
        return ((Long) this.f7750a.get("cycleId")).longValue();
    }

    /* JADX INFO: renamed from: b */
    public boolean m5948b() {
        return ((Boolean) this.f7750a.get("fromFab")).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m5949c() {
        return ((Boolean) this.f7750a.get("fromSettings")).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m5950d() {
        return ((Boolean) this.f7750a.get("isAutoPop")).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public boolean m5951e() {
        return ((Boolean) this.f7750a.get("isFromJournalIntro")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1950k c1950k = (C1950k) obj;
        if (this.f7750a.containsKey("cycleId") != c1950k.f7750a.containsKey("cycleId") || m5947a() != c1950k.m5947a() || this.f7750a.containsKey("previousCycleStartTime") != c1950k.f7750a.containsKey("previousCycleStartTime") || m5955i() != c1950k.m5955i() || this.f7750a.containsKey("previousCycleEndTIme") != c1950k.f7750a.containsKey("previousCycleEndTIme") || m5954h() != c1950k.m5954h() || this.f7750a.containsKey("isFromJournalIntro") != c1950k.f7750a.containsKey("isFromJournalIntro") || m5951e() != c1950k.m5951e() || this.f7750a.containsKey("showCustomize") != c1950k.f7750a.containsKey("showCustomize") || m5957k() != c1950k.m5957k() || this.f7750a.containsKey("isAutoPop") != c1950k.f7750a.containsKey("isAutoPop") || m5950d() != c1950k.m5950d() || this.f7750a.containsKey("todayCycleStartTime") != c1950k.f7750a.containsKey("todayCycleStartTime") || m5960n() != c1950k.m5960n() || this.f7750a.containsKey("todayCycleEndTime") != c1950k.f7750a.containsKey("todayCycleEndTime") || m5959m() != c1950k.m5959m() || this.f7750a.containsKey("fromSettings") != c1950k.f7750a.containsKey("fromSettings") || m5949c() != c1950k.m5949c() || this.f7750a.containsKey("source") != c1950k.f7750a.containsKey("source")) {
            return false;
        }
        if (m5958l() == null ? c1950k.m5958l() != null : !m5958l().equals(c1950k.m5958l())) {
            return false;
        }
        if (this.f7750a.containsKey("newHome") != c1950k.f7750a.containsKey("newHome") || m5953g() != c1950k.m5953g() || this.f7750a.containsKey("fromFab") != c1950k.f7750a.containsKey("fromFab") || m5948b() != c1950k.m5948b() || this.f7750a.containsKey("requestDate") != c1950k.f7750a.containsKey("requestDate")) {
            return false;
        }
        if (m5956j() == null ? c1950k.m5956j() != null : !m5956j().equals(c1950k.m5956j())) {
            return false;
        }
        if (this.f7750a.containsKey("label") != c1950k.f7750a.containsKey("label")) {
            return false;
        }
        return m5952f() == null ? c1950k.m5952f() == null : m5952f().equals(c1950k.m5952f());
    }

    /* JADX INFO: renamed from: f */
    public String m5952f() {
        return (String) this.f7750a.get("label");
    }

    /* JADX INFO: renamed from: g */
    public boolean m5953g() {
        return ((Boolean) this.f7750a.get("newHome")).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public long m5954h() {
        return ((Long) this.f7750a.get("previousCycleEndTIme")).longValue();
    }

    public int hashCode() {
        return (((((m5948b() ? 1 : 0) + (((m5953g() ? 1 : 0) + (((((m5949c() ? 1 : 0) + (((((((m5950d() ? 1 : 0) + (((m5957k() ? 1 : 0) + (((m5951e() ? 1 : 0) + ((((((((int) (m5947a() ^ (m5947a() >>> 32))) + 31) * 31) + ((int) (m5955i() ^ (m5955i() >>> 32)))) * 31) + ((int) (m5954h() ^ (m5954h() >>> 32)))) * 31)) * 31)) * 31)) * 31) + ((int) (m5960n() ^ (m5960n() >>> 32)))) * 31) + ((int) ((m5959m() >>> 32) ^ m5959m()))) * 31)) * 31) + (m5958l() != null ? m5958l().hashCode() : 0)) * 31)) * 31)) * 31) + (m5956j() != null ? m5956j().hashCode() : 0)) * 31) + (m5952f() != null ? m5952f().hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public long m5955i() {
        return ((Long) this.f7750a.get("previousCycleStartTime")).longValue();
    }

    /* JADX INFO: renamed from: j */
    public String m5956j() {
        return (String) this.f7750a.get("requestDate");
    }

    /* JADX INFO: renamed from: k */
    public boolean m5957k() {
        return ((Boolean) this.f7750a.get("showCustomize")).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public String m5958l() {
        return (String) this.f7750a.get("source");
    }

    /* JADX INFO: renamed from: m */
    public long m5959m() {
        return ((Long) this.f7750a.get("todayCycleEndTime")).longValue();
    }

    /* JADX INFO: renamed from: n */
    public long m5960n() {
        return ((Long) this.f7750a.get("todayCycleStartTime")).longValue();
    }

    public String toString() {
        return "JournalSurveyAnswerFragmentArgs{cycleId=" + m5947a() + ", previousCycleStartTime=" + m5955i() + ", previousCycleEndTIme=" + m5954h() + ", isFromJournalIntro=" + m5951e() + ", showCustomize=" + m5957k() + ", isAutoPop=" + m5950d() + ", todayCycleStartTime=" + m5960n() + ", todayCycleEndTime=" + m5959m() + ", fromSettings=" + m5949c() + ", source=" + m5958l() + ", newHome=" + m5953g() + ", fromFab=" + m5948b() + ", requestDate=" + m5956j() + ", label=" + m5952f() + "}";
    }
}
