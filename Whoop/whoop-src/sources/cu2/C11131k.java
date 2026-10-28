package cu2;

import android.os.Bundle;
import hc3.AbstractC17176i;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: cu2.k */
/* JADX INFO: loaded from: classes11.dex */
public class C11131k implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f35532a = new HashMap();

    private C11131k() {
    }

    public static C11131k fromBundle(Bundle bundle) {
        C11131k c11131k = new C11131k();
        if (AbstractC17176i.m48518t(bundle, C11131k.class, "source")) {
            String string = bundle.getString("source");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
            }
            c11131k.f35532a.put("source", string);
        } else {
            c11131k.f35532a.put("source", "");
        }
        if (bundle.containsKey("entryPoint")) {
            c11131k.f35532a.put("entryPoint", bundle.getString("entryPoint"));
        } else {
            c11131k.f35532a.put("entryPoint", null);
        }
        if (bundle.containsKey("sharedWorkoutId")) {
            c11131k.f35532a.put("sharedWorkoutId", bundle.getString("sharedWorkoutId"));
        } else {
            c11131k.f35532a.put("sharedWorkoutId", null);
        }
        if (bundle.containsKey("destination")) {
            c11131k.f35532a.put("destination", bundle.getString("destination"));
        } else {
            c11131k.f35532a.put("destination", null);
        }
        if (bundle.containsKey("activityId")) {
            c11131k.f35532a.put("activityId", bundle.getString("activityId"));
        } else {
            c11131k.f35532a.put("activityId", null);
        }
        if (bundle.containsKey("endWorkout")) {
            c11131k.f35532a.put("endWorkout", Boolean.valueOf(bundle.getBoolean("endWorkout")));
        } else {
            c11131k.f35532a.put("endWorkout", Boolean.FALSE);
        }
        if (bundle.containsKey("exerciseId")) {
            c11131k.f35532a.put("exerciseId", bundle.getString("exerciseId"));
        } else {
            c11131k.f35532a.put("exerciseId", null);
        }
        if (bundle.containsKey("showCTA")) {
            c11131k.f35532a.put("showCTA", Boolean.valueOf(bundle.getBoolean("showCTA")));
        } else {
            c11131k.f35532a.put("showCTA", Boolean.FALSE);
        }
        if (bundle.containsKey("entryPointType")) {
            c11131k.f35532a.put("entryPointType", bundle.getString("entryPointType"));
        } else {
            c11131k.f35532a.put("entryPointType", null);
        }
        if (bundle.containsKey("templateId")) {
            c11131k.f35532a.put("templateId", Long.valueOf(bundle.getLong("templateId")));
        } else {
            c11131k.f35532a.put("templateId", -1L);
        }
        if (bundle.containsKey("isFromWhoopCoach")) {
            c11131k.f35532a.put("isFromWhoopCoach", Boolean.valueOf(bundle.getBoolean("isFromWhoopCoach")));
        } else {
            c11131k.f35532a.put("isFromWhoopCoach", Boolean.FALSE);
        }
        if (bundle.containsKey("isExerciseDetailsV2ExperimentEnabled")) {
            c11131k.f35532a.put("isExerciseDetailsV2ExperimentEnabled", Boolean.valueOf(bundle.getBoolean("isExerciseDetailsV2ExperimentEnabled")));
        } else {
            c11131k.f35532a.put("isExerciseDetailsV2ExperimentEnabled", Boolean.FALSE);
        }
        if (!bundle.containsKey("openTab")) {
            c11131k.f35532a.put("openTab", null);
            return c11131k;
        }
        c11131k.f35532a.put("openTab", bundle.getString("openTab"));
        return c11131k;
    }

    /* JADX INFO: renamed from: a */
    public String m30089a() {
        return (String) this.f35532a.get("activityId");
    }

    /* JADX INFO: renamed from: b */
    public String m30090b() {
        return (String) this.f35532a.get("destination");
    }

    /* JADX INFO: renamed from: c */
    public boolean m30091c() {
        return ((Boolean) this.f35532a.get("endWorkout")).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public String m30092d() {
        return (String) this.f35532a.get("entryPoint");
    }

    /* JADX INFO: renamed from: e */
    public String m30093e() {
        return (String) this.f35532a.get("entryPointType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11131k c11131k = (C11131k) obj;
        if (this.f35532a.containsKey("source") != c11131k.f35532a.containsKey("source")) {
            return false;
        }
        if (m30100l() == null ? c11131k.m30100l() != null : !m30100l().equals(c11131k.m30100l())) {
            return false;
        }
        if (this.f35532a.containsKey("entryPoint") != c11131k.f35532a.containsKey("entryPoint")) {
            return false;
        }
        if (m30092d() == null ? c11131k.m30092d() != null : !m30092d().equals(c11131k.m30092d())) {
            return false;
        }
        if (this.f35532a.containsKey("sharedWorkoutId") != c11131k.f35532a.containsKey("sharedWorkoutId")) {
            return false;
        }
        if (m30098j() == null ? c11131k.m30098j() != null : !m30098j().equals(c11131k.m30098j())) {
            return false;
        }
        if (this.f35532a.containsKey("destination") != c11131k.f35532a.containsKey("destination")) {
            return false;
        }
        if (m30090b() == null ? c11131k.m30090b() != null : !m30090b().equals(c11131k.m30090b())) {
            return false;
        }
        if (this.f35532a.containsKey("activityId") != c11131k.f35532a.containsKey("activityId")) {
            return false;
        }
        if (m30089a() == null ? c11131k.m30089a() != null : !m30089a().equals(c11131k.m30089a())) {
            return false;
        }
        if (this.f35532a.containsKey("endWorkout") != c11131k.f35532a.containsKey("endWorkout") || m30091c() != c11131k.m30091c() || this.f35532a.containsKey("exerciseId") != c11131k.f35532a.containsKey("exerciseId")) {
            return false;
        }
        if (m30094f() == null ? c11131k.m30094f() != null : !m30094f().equals(c11131k.m30094f())) {
            return false;
        }
        if (this.f35532a.containsKey("showCTA") != c11131k.f35532a.containsKey("showCTA") || m30099k() != c11131k.m30099k() || this.f35532a.containsKey("entryPointType") != c11131k.f35532a.containsKey("entryPointType")) {
            return false;
        }
        if (m30093e() == null ? c11131k.m30093e() != null : !m30093e().equals(c11131k.m30093e())) {
            return false;
        }
        if (this.f35532a.containsKey("templateId") == c11131k.f35532a.containsKey("templateId") && m30101m() == c11131k.m30101m() && this.f35532a.containsKey("isFromWhoopCoach") == c11131k.f35532a.containsKey("isFromWhoopCoach") && m30096h() == c11131k.m30096h() && this.f35532a.containsKey("isExerciseDetailsV2ExperimentEnabled") == c11131k.f35532a.containsKey("isExerciseDetailsV2ExperimentEnabled") && m30095g() == c11131k.m30095g() && this.f35532a.containsKey("openTab") == c11131k.f35532a.containsKey("openTab")) {
            return m30097i() == null ? c11131k.m30097i() == null : m30097i().equals(c11131k.m30097i());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String m30094f() {
        return (String) this.f35532a.get("exerciseId");
    }

    /* JADX INFO: renamed from: g */
    public boolean m30095g() {
        return ((Boolean) this.f35532a.get("isExerciseDetailsV2ExperimentEnabled")).booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public boolean m30096h() {
        return ((Boolean) this.f35532a.get("isFromWhoopCoach")).booleanValue();
    }

    public int hashCode() {
        return (((m30095g() ? 1 : 0) + (((m30096h() ? 1 : 0) + (((((((m30099k() ? 1 : 0) + (((((m30091c() ? 1 : 0) + (((((((((((m30100l() != null ? m30100l().hashCode() : 0) + 31) * 31) + (m30092d() != null ? m30092d().hashCode() : 0)) * 31) + (m30098j() != null ? m30098j().hashCode() : 0)) * 31) + (m30090b() != null ? m30090b().hashCode() : 0)) * 31) + (m30089a() != null ? m30089a().hashCode() : 0)) * 31)) * 31) + (m30094f() != null ? m30094f().hashCode() : 0)) * 31)) * 31) + (m30093e() != null ? m30093e().hashCode() : 0)) * 31) + ((int) (m30101m() ^ (m30101m() >>> 32)))) * 31)) * 31)) * 31) + (m30097i() != null ? m30097i().hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public String m30097i() {
        return (String) this.f35532a.get("openTab");
    }

    /* JADX INFO: renamed from: j */
    public String m30098j() {
        return (String) this.f35532a.get("sharedWorkoutId");
    }

    /* JADX INFO: renamed from: k */
    public boolean m30099k() {
        return ((Boolean) this.f35532a.get("showCTA")).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public String m30100l() {
        return (String) this.f35532a.get("source");
    }

    /* JADX INFO: renamed from: m */
    public long m30101m() {
        return ((Long) this.f35532a.get("templateId")).longValue();
    }

    public String toString() {
        return "StrengthTrainerFragmentArgs{source=" + m30100l() + ", entryPoint=" + m30092d() + ", sharedWorkoutId=" + m30098j() + ", destination=" + m30090b() + ", activityId=" + m30089a() + ", endWorkout=" + m30091c() + ", exerciseId=" + m30094f() + ", showCTA=" + m30099k() + ", entryPointType=" + m30093e() + ", templateId=" + m30101m() + ", isFromWhoopCoach=" + m30096h() + ", isExerciseDetailsV2ExperimentEnabled=" + m30095g() + ", openTab=" + m30097i() + "}";
    }
}
