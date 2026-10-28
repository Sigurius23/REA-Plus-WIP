package hi0;

import android.os.Bundle;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.HashMap;
import p114eb.C12938a;
import p114eb.InterfaceC12981p0;

/* JADX INFO: renamed from: hi0.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC17304b {

    /* JADX INFO: renamed from: hi0.b$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66509a;

        public /* synthetic */ a(String str, int i13) {
            this(str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66837u;
        }

        /* JADX INFO: renamed from: b */
        public int m49007b() {
            return ((Integer) this.f66509a.get("initialHr")).intValue();
        }

        /* JADX INFO: renamed from: c */
        public String m49008c() {
            return (String) this.f66509a.get("initialHrZone");
        }

        /* JADX INFO: renamed from: d */
        public String m49009d() {
            return (String) this.f66509a.get("source");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f66509a.containsKey("initialHr") != aVar.f66509a.containsKey("initialHr") || m49007b() != aVar.m49007b() || this.f66509a.containsKey("initialHrZone") != aVar.f66509a.containsKey("initialHrZone")) {
                return false;
            }
            if (m49008c() == null ? aVar.m49008c() != null : !m49008c().equals(aVar.m49008c())) {
                return false;
            }
            if (this.f66509a.containsKey("source") != aVar.f66509a.containsKey("source")) {
                return false;
            }
            if (m49009d() == null ? aVar.m49009d() == null : m49009d().equals(aVar.m49009d())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66509a.containsKey("initialHr")) {
                bundle.putInt("initialHr", ((Integer) this.f66509a.get("initialHr")).intValue());
            } else {
                bundle.putInt("initialHr", -1);
            }
            if (this.f66509a.containsKey("initialHrZone")) {
                bundle.putString("initialHrZone", (String) this.f66509a.get("initialHrZone"));
            }
            if (this.f66509a.containsKey("source")) {
                bundle.putString("source", (String) this.f66509a.get("source"));
                return bundle;
            }
            bundle.putString("source", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + ((((((m49007b() + 31) * 31) + (m49008c() != null ? m49008c().hashCode() : 0)) * 31) + (m49009d() != null ? m49009d().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionGlobalHealthMonitorFragment(actionId=" + mo19186a() + "){initialHr=" + m49007b() + ", initialHrZone=" + m49008c() + ", source=" + m49009d() + "}";
        }

        private a(String str) {
            HashMap map = new HashMap();
            this.f66509a = map;
            map.put("initialHrZone", str);
        }
    }

    /* JADX INFO: renamed from: hi0.b$b */
    public static class b implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66510a;

        public /* synthetic */ b(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66844v;
        }

        /* JADX INFO: renamed from: b */
        public String m49010b() {
            return (String) this.f66510a.get("destinationPillar");
        }

        /* JADX INFO: renamed from: c */
        public String m49011c() {
            return (String) this.f66510a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f66510a.containsKey("sourceId") != bVar.f66510a.containsKey("sourceId")) {
                return false;
            }
            if (m49011c() == null ? bVar.m49011c() != null : !m49011c().equals(bVar.m49011c())) {
                return false;
            }
            if (this.f66510a.containsKey("destinationPillar") != bVar.f66510a.containsKey("destinationPillar")) {
                return false;
            }
            if (m49010b() == null ? bVar.m49010b() == null : m49010b().equals(bVar.m49010b())) {
                return mo19186a() == bVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66510a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f66510a.get("sourceId"));
            } else {
                bundle.putString("sourceId", null);
            }
            if (this.f66510a.containsKey("destinationPillar")) {
                bundle.putString("destinationPillar", (String) this.f66510a.get("destinationPillar"));
                return bundle;
            }
            bundle.putString("destinationPillar", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((m49011c() != null ? m49011c().hashCode() : 0) + 31) * 31) + (m49010b() != null ? m49010b().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionGlobalHomeFragment(actionId=" + mo19186a() + "){sourceId=" + m49011c() + ", destinationPillar=" + m49010b() + "}";
        }

        private b() {
            this.f66510a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: hi0.b$c */
    public static class c implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66511a;

        public /* synthetic */ c(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66851w;
        }

        /* JADX INFO: renamed from: b */
        public String m49012b() {
            return (String) this.f66511a.get("code");
        }

        /* JADX INFO: renamed from: c */
        public String m49013c() {
            return (String) this.f66511a.get("scope");
        }

        /* JADX INFO: renamed from: d */
        public String m49014d() {
            return (String) this.f66511a.get("state");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f66511a.containsKey("code") != cVar.f66511a.containsKey("code")) {
                return false;
            }
            if (m49012b() == null ? cVar.m49012b() != null : !m49012b().equals(cVar.m49012b())) {
                return false;
            }
            if (this.f66511a.containsKey("scope") != cVar.f66511a.containsKey("scope")) {
                return false;
            }
            if (m49013c() == null ? cVar.m49013c() != null : !m49013c().equals(cVar.m49013c())) {
                return false;
            }
            if (this.f66511a.containsKey("state") != cVar.f66511a.containsKey("state")) {
                return false;
            }
            if (m49014d() == null ? cVar.m49014d() == null : m49014d().equals(cVar.m49014d())) {
                return mo19186a() == cVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66511a.containsKey("code")) {
                bundle.putString("code", (String) this.f66511a.get("code"));
            } else {
                bundle.putString("code", null);
            }
            if (this.f66511a.containsKey("scope")) {
                bundle.putString("scope", (String) this.f66511a.get("scope"));
            } else {
                bundle.putString("scope", null);
            }
            if (this.f66511a.containsKey("state")) {
                bundle.putString("state", (String) this.f66511a.get("state"));
                return bundle;
            }
            bundle.putString("state", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((((m49012b() != null ? m49012b().hashCode() : 0) + 31) * 31) + (m49013c() != null ? m49013c().hashCode() : 0)) * 31) + (m49014d() != null ? m49014d().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionGlobalNavigateToStravaRevamp(actionId=" + mo19186a() + "){code=" + m49012b() + ", scope=" + m49013c() + ", state=" + m49014d() + "}";
        }

        private c() {
            this.f66511a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: hi0.b$d */
    public static class d implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66512a;

        public /* synthetic */ d(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66872z;
        }

        /* JADX INFO: renamed from: b */
        public boolean m49015b() {
            return ((Boolean) this.f66512a.get("fromOnboarding")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f66512a.containsKey("fromOnboarding") == dVar.f66512a.containsKey("fromOnboarding") && m49015b() == dVar.m49015b() && mo19186a() == dVar.mo19186a();
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66512a.containsKey("fromOnboarding")) {
                bundle.putBoolean("fromOnboarding", ((Boolean) this.f66512a.get("fromOnboarding")).booleanValue());
                return bundle;
            }
            bundle.putBoolean("fromOnboarding", true);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m49015b() ? 1 : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionGlobalToSleepCoachWakeTimeScheduleListFragment(actionId=" + mo19186a() + "){fromOnboarding=" + m49015b() + "}";
        }

        private d() {
            this.f66512a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: hi0.b$e */
    public static class e implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66513a;

        public /* synthetic */ e(int i13, int i14) {
            this(i13);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66539A;
        }

        /* JADX INFO: renamed from: b */
        public int m49016b() {
            return ((Integer) this.f66513a.get("year")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f66513a.containsKey("year") == eVar.f66513a.containsKey("year") && m49016b() == eVar.m49016b() && mo19186a() == eVar.mo19186a();
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66513a.containsKey("year")) {
                bundle.putInt("year", ((Integer) this.f66513a.get("year")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + ((m49016b() + 31) * 31);
        }

        public String toString() {
            return "ActionGlobalUserJourneyFragment(actionId=" + mo19186a() + "){year=" + m49016b() + "}";
        }

        private e(int i13) {
            HashMap map = new HashMap();
            this.f66513a = map;
            map.put("year", Integer.valueOf(i13));
        }
    }

    /* JADX INFO: renamed from: hi0.b$f */
    public static class f implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66514a;

        public /* synthetic */ f(String str, int i13) {
            this(str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66546B;
        }

        /* JADX INFO: renamed from: b */
        public String m49017b() {
            return (String) this.f66514a.get("entryPoint");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (this.f66514a.containsKey("entryPoint") != fVar.f66514a.containsKey("entryPoint")) {
                return false;
            }
            if (m49017b() == null ? fVar.m49017b() == null : m49017b().equals(fVar.m49017b())) {
                return mo19186a() == fVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66514a.containsKey("entryPoint")) {
                bundle.putString("entryPoint", (String) this.f66514a.get("entryPoint"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m49017b() != null ? m49017b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionGlobalWizardOnboardingSleepCoachFragment(actionId=" + mo19186a() + "){entryPoint=" + m49017b() + "}";
        }

        private f(String str) {
            HashMap map = new HashMap();
            this.f66514a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
            }
            map.put("entryPoint", str);
        }
    }

    /* JADX INFO: renamed from: hi0.b$g */
    public static class g implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66515a;

        public /* synthetic */ g(String str, String str2, int i13) {
            this(str, str2);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66553C;
        }

        /* JADX INFO: renamed from: b */
        public String m49018b() {
            return (String) this.f66515a.get("clickType");
        }

        /* JADX INFO: renamed from: c */
        public String m49019c() {
            return (String) this.f66515a.get("entryPoint");
        }

        /* JADX INFO: renamed from: d */
        public boolean m49020d() {
            return ((Boolean) this.f66515a.get("isFromHome")).booleanValue();
        }

        /* JADX INFO: renamed from: e */
        public String m49021e() {
            return (String) this.f66515a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            g gVar = (g) obj;
            if (this.f66515a.containsKey("entryPoint") != gVar.f66515a.containsKey("entryPoint")) {
                return false;
            }
            if (m49019c() == null ? gVar.m49019c() != null : !m49019c().equals(gVar.m49019c())) {
                return false;
            }
            if (this.f66515a.containsKey("clickType") != gVar.f66515a.containsKey("clickType")) {
                return false;
            }
            if (m49018b() == null ? gVar.m49018b() != null : !m49018b().equals(gVar.m49018b())) {
                return false;
            }
            if (this.f66515a.containsKey("sourceId") != gVar.f66515a.containsKey("sourceId")) {
                return false;
            }
            if (m49021e() == null ? gVar.m49021e() != null : !m49021e().equals(gVar.m49021e())) {
                return false;
            }
            if (this.f66515a.containsKey("isFromHome") != gVar.f66515a.containsKey("isFromHome") || m49020d() != gVar.m49020d() || this.f66515a.containsKey("sourcePillar") != gVar.f66515a.containsKey("sourcePillar")) {
                return false;
            }
            if (m49022f() == null ? gVar.m49022f() == null : m49022f().equals(gVar.m49022f())) {
                return mo19186a() == gVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public String m49022f() {
            return (String) this.f66515a.get("sourcePillar");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66515a.containsKey("entryPoint")) {
                bundle.putString("entryPoint", (String) this.f66515a.get("entryPoint"));
            }
            if (this.f66515a.containsKey("clickType")) {
                bundle.putString("clickType", (String) this.f66515a.get("clickType"));
            }
            if (this.f66515a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f66515a.get("sourceId"));
            } else {
                bundle.putString("sourceId", null);
            }
            if (this.f66515a.containsKey("isFromHome")) {
                bundle.putBoolean("isFromHome", ((Boolean) this.f66515a.get("isFromHome")).booleanValue());
            } else {
                bundle.putBoolean("isFromHome", false);
            }
            if (this.f66515a.containsKey("sourcePillar")) {
                bundle.putString("sourcePillar", (String) this.f66515a.get("sourcePillar"));
                return bundle;
            }
            bundle.putString("sourcePillar", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((m49020d() ? 1 : 0) + (((((((m49019c() != null ? m49019c().hashCode() : 0) + 31) * 31) + (m49018b() != null ? m49018b().hashCode() : 0)) * 31) + (m49021e() != null ? m49021e().hashCode() : 0)) * 31)) * 31) + (m49022f() != null ? m49022f().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionGlobalWizardSleepCoachFragment(actionId=" + mo19186a() + "){entryPoint=" + m49019c() + ", clickType=" + m49018b() + ", sourceId=" + m49021e() + ", isFromHome=" + m49020d() + ", sourcePillar=" + m49022f() + "}";
        }

        private g(String str, String str2) {
            HashMap map = new HashMap();
            this.f66515a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
            }
            map.put("entryPoint", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"clickType\" is marked as non-null but was passed a null value.");
            }
            map.put("clickType", str2);
        }
    }

    /* JADX INFO: renamed from: hi0.b$h */
    public static class h implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66516a;

        public /* synthetic */ h(String str, String str2, boolean z4, String str3, int i13) {
            this(str, str2, z4, str3);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66559D;
        }

        /* JADX INFO: renamed from: b */
        public String m49023b() {
            return (String) this.f66516a.get("activityIdV2");
        }

        /* JADX INFO: renamed from: c */
        public String m49024c() {
            return (String) this.f66516a.get("activityType");
        }

        /* JADX INFO: renamed from: d */
        public String m49025d() {
            return (String) this.f66516a.get("entryPoint");
        }

        /* JADX INFO: renamed from: e */
        public boolean m49026e() {
            return ((Boolean) this.f66516a.get("newHome")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            h hVar = (h) obj;
            if (this.f66516a.containsKey("entryPoint") != hVar.f66516a.containsKey("entryPoint")) {
                return false;
            }
            if (m49025d() == null ? hVar.m49025d() != null : !m49025d().equals(hVar.m49025d())) {
                return false;
            }
            if (this.f66516a.containsKey("activityType") != hVar.f66516a.containsKey("activityType")) {
                return false;
            }
            if (m49024c() == null ? hVar.m49024c() != null : !m49024c().equals(hVar.m49024c())) {
                return false;
            }
            if (this.f66516a.containsKey("newHome") != hVar.f66516a.containsKey("newHome") || m49026e() != hVar.m49026e() || this.f66516a.containsKey("activityIdV2") != hVar.f66516a.containsKey("activityIdV2")) {
                return false;
            }
            if (m49023b() == null ? hVar.m49023b() == null : m49023b().equals(hVar.m49023b())) {
                return mo19186a() == hVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66516a.containsKey("entryPoint")) {
                bundle.putString("entryPoint", (String) this.f66516a.get("entryPoint"));
            }
            if (this.f66516a.containsKey("activityType")) {
                bundle.putString("activityType", (String) this.f66516a.get("activityType"));
            }
            if (this.f66516a.containsKey("newHome")) {
                bundle.putBoolean("newHome", ((Boolean) this.f66516a.get("newHome")).booleanValue());
            }
            if (this.f66516a.containsKey("activityIdV2")) {
                bundle.putString("activityIdV2", (String) this.f66516a.get("activityIdV2"));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((m49026e() ? 1 : 0) + (((((m49025d() != null ? m49025d().hashCode() : 0) + 31) * 31) + (m49024c() != null ? m49024c().hashCode() : 0)) * 31)) * 31) + (m49023b() != null ? m49023b().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionNavToCoreDetailsGraph(actionId=" + mo19186a() + "){entryPoint=" + m49025d() + ", activityType=" + m49024c() + ", newHome=" + m49026e() + ", activityIdV2=" + m49023b() + "}";
        }

        private h(String str, String str2, boolean z4, String str3) {
            HashMap map = new HashMap();
            this.f66516a = map;
            if (str == null) {
                throw new IllegalArgumentException("Argument \"entryPoint\" is marked as non-null but was passed a null value.");
            }
            map.put("entryPoint", str);
            if (str2 == null) {
                throw new IllegalArgumentException("Argument \"activityType\" is marked as non-null but was passed a null value.");
            }
            map.put("activityType", str2);
            map.put("newHome", Boolean.valueOf(z4));
            if (str3 == null) {
                throw new IllegalArgumentException("Argument \"activityIdV2\" is marked as non-null but was passed a null value.");
            }
            map.put("activityIdV2", str3);
        }
    }

    /* JADX INFO: renamed from: hi0.b$i */
    public static class i implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66517a;

        public /* synthetic */ i(String str, String str2, String str3, int i13, String str4, String str5, String str6, String str7) {
            this(str, str2, str3, str4, str5, str6, str7);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66571F;
        }

        /* JADX INFO: renamed from: b */
        public String m49027b() {
            return (String) this.f66517a.get("dismissContentCancelTitle");
        }

        /* JADX INFO: renamed from: c */
        public String m49028c() {
            return (String) this.f66517a.get("dismissContentConfirmTitle");
        }

        /* JADX INFO: renamed from: d */
        public String m49029d() {
            return (String) this.f66517a.get("dismissContentMessage");
        }

        /* JADX INFO: renamed from: e */
        public String m49030e() {
            return (String) this.f66517a.get("dismissContentTitle");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            i iVar = (i) obj;
            if (this.f66517a.containsKey("pathUrl") != iVar.f66517a.containsKey("pathUrl")) {
                return false;
            }
            if (m49032g() == null ? iVar.m49032g() != null : !m49032g().equals(iVar.m49032g())) {
                return false;
            }
            if (this.f66517a.containsKey(QueryParams.URL) != iVar.f66517a.containsKey(QueryParams.URL)) {
                return false;
            }
            if (m49033h() == null ? iVar.m49033h() != null : !m49033h().equals(iVar.m49033h())) {
                return false;
            }
            if (this.f66517a.containsKey("dismissContentTitle") != iVar.f66517a.containsKey("dismissContentTitle")) {
                return false;
            }
            if (m49030e() == null ? iVar.m49030e() != null : !m49030e().equals(iVar.m49030e())) {
                return false;
            }
            if (this.f66517a.containsKey("dismissContentMessage") != iVar.f66517a.containsKey("dismissContentMessage")) {
                return false;
            }
            if (m49029d() == null ? iVar.m49029d() != null : !m49029d().equals(iVar.m49029d())) {
                return false;
            }
            if (this.f66517a.containsKey("dismissContentCancelTitle") != iVar.f66517a.containsKey("dismissContentCancelTitle")) {
                return false;
            }
            if (m49027b() == null ? iVar.m49027b() != null : !m49027b().equals(iVar.m49027b())) {
                return false;
            }
            if (this.f66517a.containsKey("dismissContentConfirmTitle") != iVar.f66517a.containsKey("dismissContentConfirmTitle")) {
                return false;
            }
            if (m49028c() == null ? iVar.m49028c() != null : !m49028c().equals(iVar.m49028c())) {
                return false;
            }
            if (this.f66517a.containsKey("dismissDestination") != iVar.f66517a.containsKey("dismissDestination")) {
                return false;
            }
            if (m49031f() == null ? iVar.m49031f() == null : m49031f().equals(iVar.m49031f())) {
                return mo19186a() == iVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public String m49031f() {
            return (String) this.f66517a.get("dismissDestination");
        }

        /* JADX INFO: renamed from: g */
        public String m49032g() {
            return (String) this.f66517a.get("pathUrl");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66517a.containsKey("pathUrl")) {
                bundle.putString("pathUrl", (String) this.f66517a.get("pathUrl"));
            }
            if (this.f66517a.containsKey(QueryParams.URL)) {
                bundle.putString(QueryParams.URL, (String) this.f66517a.get(QueryParams.URL));
            }
            if (this.f66517a.containsKey("dismissContentTitle")) {
                bundle.putString("dismissContentTitle", (String) this.f66517a.get("dismissContentTitle"));
            }
            if (this.f66517a.containsKey("dismissContentMessage")) {
                bundle.putString("dismissContentMessage", (String) this.f66517a.get("dismissContentMessage"));
            }
            if (this.f66517a.containsKey("dismissContentCancelTitle")) {
                bundle.putString("dismissContentCancelTitle", (String) this.f66517a.get("dismissContentCancelTitle"));
            }
            if (this.f66517a.containsKey("dismissContentConfirmTitle")) {
                bundle.putString("dismissContentConfirmTitle", (String) this.f66517a.get("dismissContentConfirmTitle"));
            }
            if (this.f66517a.containsKey("dismissDestination")) {
                bundle.putString("dismissDestination", (String) this.f66517a.get("dismissDestination"));
            }
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public String m49033h() {
            return (String) this.f66517a.get(QueryParams.URL);
        }

        public int hashCode() {
            return mo19186a() + (((((((((((((((m49032g() != null ? m49032g().hashCode() : 0) + 31) * 31) + (m49033h() != null ? m49033h().hashCode() : 0)) * 31) + (m49030e() != null ? m49030e().hashCode() : 0)) * 31) + (m49029d() != null ? m49029d().hashCode() : 0)) * 31) + (m49027b() != null ? m49027b().hashCode() : 0)) * 31) + (m49028c() != null ? m49028c().hashCode() : 0)) * 31) + (m49031f() != null ? m49031f().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionNavToHomeAuthWebViewFragment(actionId=" + mo19186a() + "){pathUrl=" + m49032g() + ", url=" + m49033h() + ", dismissContentTitle=" + m49030e() + ", dismissContentMessage=" + m49029d() + ", dismissContentCancelTitle=" + m49027b() + ", dismissContentConfirmTitle=" + m49028c() + ", dismissDestination=" + m49031f() + "}";
        }

        private i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            HashMap map = new HashMap();
            this.f66517a = map;
            map.put("pathUrl", str);
            map.put(QueryParams.URL, str2);
            map.put("dismissContentTitle", str3);
            map.put("dismissContentMessage", str4);
            map.put("dismissContentCancelTitle", str5);
            map.put("dismissContentConfirmTitle", str6);
            map.put("dismissDestination", str7);
        }
    }

    /* JADX INFO: renamed from: hi0.b$j */
    public static class j implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66518a;

        public /* synthetic */ j(long j7, int i13) {
            this(j7);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66577G;
        }

        /* JADX INFO: renamed from: b */
        public long m49034b() {
            return ((Long) this.f66518a.get("cycleId")).longValue();
        }

        /* JADX INFO: renamed from: c */
        public boolean m49035c() {
            return ((Boolean) this.f66518a.get("fromFab")).booleanValue();
        }

        /* JADX INFO: renamed from: d */
        public boolean m49036d() {
            return ((Boolean) this.f66518a.get("isAutoPop")).booleanValue();
        }

        /* JADX INFO: renamed from: e */
        public boolean m49037e() {
            return ((Boolean) this.f66518a.get("isFromJournalIntro")).booleanValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            j jVar = (j) obj;
            if (this.f66518a.containsKey("cycleId") != jVar.f66518a.containsKey("cycleId") || m49034b() != jVar.m49034b() || this.f66518a.containsKey("previousCycleStartTime") != jVar.f66518a.containsKey("previousCycleStartTime") || m49041i() != jVar.m49041i() || this.f66518a.containsKey("previousCycleEndTIme") != jVar.f66518a.containsKey("previousCycleEndTIme") || m49040h() != jVar.m49040h() || this.f66518a.containsKey("isFromJournalIntro") != jVar.f66518a.containsKey("isFromJournalIntro") || m49037e() != jVar.m49037e() || this.f66518a.containsKey("isAutoPop") != jVar.f66518a.containsKey("isAutoPop") || m49036d() != jVar.m49036d() || this.f66518a.containsKey("todayCycleStartTime") != jVar.f66518a.containsKey("todayCycleStartTime") || m49045m() != jVar.m49045m() || this.f66518a.containsKey("todayCycleEndTime") != jVar.f66518a.containsKey("todayCycleEndTime") || m49044l() != jVar.m49044l() || this.f66518a.containsKey("source") != jVar.f66518a.containsKey("source")) {
                return false;
            }
            if (m49043k() == null ? jVar.m49043k() != null : !m49043k().equals(jVar.m49043k())) {
                return false;
            }
            if (this.f66518a.containsKey("label") != jVar.f66518a.containsKey("label")) {
                return false;
            }
            if (m49038f() == null ? jVar.m49038f() != null : !m49038f().equals(jVar.m49038f())) {
                return false;
            }
            if (this.f66518a.containsKey("newHome") != jVar.f66518a.containsKey("newHome") || m49039g() != jVar.m49039g() || this.f66518a.containsKey("fromFab") != jVar.f66518a.containsKey("fromFab") || m49035c() != jVar.m49035c() || this.f66518a.containsKey("requestDate") != jVar.f66518a.containsKey("requestDate")) {
                return false;
            }
            if (m49042j() == null ? jVar.m49042j() == null : m49042j().equals(jVar.m49042j())) {
                return mo19186a() == jVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public String m49038f() {
            return (String) this.f66518a.get("label");
        }

        /* JADX INFO: renamed from: g */
        public boolean m49039g() {
            return ((Boolean) this.f66518a.get("newHome")).booleanValue();
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66518a.containsKey("cycleId")) {
                bundle.putLong("cycleId", ((Long) this.f66518a.get("cycleId")).longValue());
            }
            if (this.f66518a.containsKey("previousCycleStartTime")) {
                bundle.putLong("previousCycleStartTime", ((Long) this.f66518a.get("previousCycleStartTime")).longValue());
            } else {
                bundle.putLong("previousCycleStartTime", -1L);
            }
            if (this.f66518a.containsKey("previousCycleEndTIme")) {
                bundle.putLong("previousCycleEndTIme", ((Long) this.f66518a.get("previousCycleEndTIme")).longValue());
            } else {
                bundle.putLong("previousCycleEndTIme", -1L);
            }
            if (this.f66518a.containsKey("isFromJournalIntro")) {
                bundle.putBoolean("isFromJournalIntro", ((Boolean) this.f66518a.get("isFromJournalIntro")).booleanValue());
            } else {
                bundle.putBoolean("isFromJournalIntro", false);
            }
            if (this.f66518a.containsKey("isAutoPop")) {
                bundle.putBoolean("isAutoPop", ((Boolean) this.f66518a.get("isAutoPop")).booleanValue());
            } else {
                bundle.putBoolean("isAutoPop", false);
            }
            if (this.f66518a.containsKey("todayCycleStartTime")) {
                bundle.putLong("todayCycleStartTime", ((Long) this.f66518a.get("todayCycleStartTime")).longValue());
            } else {
                bundle.putLong("todayCycleStartTime", -1L);
            }
            if (this.f66518a.containsKey("todayCycleEndTime")) {
                bundle.putLong("todayCycleEndTime", ((Long) this.f66518a.get("todayCycleEndTime")).longValue());
            } else {
                bundle.putLong("todayCycleEndTime", -1L);
            }
            if (this.f66518a.containsKey("source")) {
                bundle.putString("source", (String) this.f66518a.get("source"));
            } else {
                bundle.putString("source", null);
            }
            if (this.f66518a.containsKey("label")) {
                bundle.putString("label", (String) this.f66518a.get("label"));
            } else {
                bundle.putString("label", null);
            }
            if (this.f66518a.containsKey("newHome")) {
                bundle.putBoolean("newHome", ((Boolean) this.f66518a.get("newHome")).booleanValue());
            } else {
                bundle.putBoolean("newHome", false);
            }
            if (this.f66518a.containsKey("fromFab")) {
                bundle.putBoolean("fromFab", ((Boolean) this.f66518a.get("fromFab")).booleanValue());
            } else {
                bundle.putBoolean("fromFab", false);
            }
            if (this.f66518a.containsKey("requestDate")) {
                bundle.putString("requestDate", (String) this.f66518a.get("requestDate"));
                return bundle;
            }
            bundle.putString("requestDate", "");
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public long m49040h() {
            return ((Long) this.f66518a.get("previousCycleEndTIme")).longValue();
        }

        public int hashCode() {
            return mo19186a() + (((((m49035c() ? 1 : 0) + (((m49039g() ? 1 : 0) + (((((((((((m49036d() ? 1 : 0) + (((m49037e() ? 1 : 0) + ((((((((int) (m49034b() ^ (m49034b() >>> 32))) + 31) * 31) + ((int) (m49041i() ^ (m49041i() >>> 32)))) * 31) + ((int) (m49040h() ^ (m49040h() >>> 32)))) * 31)) * 31)) * 31) + ((int) (m49045m() ^ (m49045m() >>> 32)))) * 31) + ((int) (m49044l() ^ (m49044l() >>> 32)))) * 31) + (m49043k() != null ? m49043k().hashCode() : 0)) * 31) + (m49038f() != null ? m49038f().hashCode() : 0)) * 31)) * 31)) * 31) + (m49042j() != null ? m49042j().hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public long m49041i() {
            return ((Long) this.f66518a.get("previousCycleStartTime")).longValue();
        }

        /* JADX INFO: renamed from: j */
        public String m49042j() {
            return (String) this.f66518a.get("requestDate");
        }

        /* JADX INFO: renamed from: k */
        public String m49043k() {
            return (String) this.f66518a.get("source");
        }

        /* JADX INFO: renamed from: l */
        public long m49044l() {
            return ((Long) this.f66518a.get("todayCycleEndTime")).longValue();
        }

        /* JADX INFO: renamed from: m */
        public long m49045m() {
            return ((Long) this.f66518a.get("todayCycleStartTime")).longValue();
        }

        /* JADX INFO: renamed from: n */
        public j m49046n(boolean z4) {
            this.f66518a.put("fromFab", Boolean.valueOf(z4));
            return this;
        }

        /* JADX INFO: renamed from: o */
        public j m49047o(boolean z4) {
            this.f66518a.put("isAutoPop", Boolean.valueOf(z4));
            return this;
        }

        /* JADX INFO: renamed from: p */
        public j m49048p(boolean z4) {
            this.f66518a.put("isFromJournalIntro", Boolean.valueOf(z4));
            return this;
        }

        /* JADX INFO: renamed from: q */
        public j m49049q(String str) {
            this.f66518a.put("label", str);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public j m49050r(boolean z4) {
            this.f66518a.put("newHome", Boolean.valueOf(z4));
            return this;
        }

        /* JADX INFO: renamed from: s */
        public j m49051s(long j7) {
            this.f66518a.put("previousCycleEndTIme", Long.valueOf(j7));
            return this;
        }

        /* JADX INFO: renamed from: t */
        public j m49052t(long j7) {
            this.f66518a.put("previousCycleStartTime", Long.valueOf(j7));
            return this;
        }

        public String toString() {
            return "ActionNavToJournal(actionId=" + mo19186a() + "){cycleId=" + m49034b() + ", previousCycleStartTime=" + m49041i() + ", previousCycleEndTIme=" + m49040h() + ", isFromJournalIntro=" + m49037e() + ", isAutoPop=" + m49036d() + ", todayCycleStartTime=" + m49045m() + ", todayCycleEndTime=" + m49044l() + ", source=" + m49043k() + ", label=" + m49038f() + ", newHome=" + m49039g() + ", fromFab=" + m49035c() + ", requestDate=" + m49042j() + "}";
        }

        /* JADX INFO: renamed from: u */
        public j m49053u(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Argument \"requestDate\" is marked as non-null but was passed a null value.");
            }
            this.f66518a.put("requestDate", str);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public j m49054v(String str) {
            this.f66518a.put("source", str);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public j m49055w(long j7) {
            this.f66518a.put("todayCycleEndTime", Long.valueOf(j7));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public j m49056x(long j7) {
            this.f66518a.put("todayCycleStartTime", Long.valueOf(j7));
            return this;
        }

        private j(long j7) {
            HashMap map = new HashMap();
            this.f66518a = map;
            map.put("cycleId", Long.valueOf(j7));
        }
    }

    /* JADX INFO: renamed from: hi0.b$k */
    public static class k implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f66519a;

        public /* synthetic */ k(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC17307e.f66583H;
        }

        /* JADX INFO: renamed from: b */
        public String m49057b() {
            return (String) this.f66519a.get("openTab");
        }

        /* JADX INFO: renamed from: c */
        public String m49058c() {
            return (String) this.f66519a.get("source");
        }

        /* JADX INFO: renamed from: d */
        public k m49059d(String str) {
            this.f66519a.put("openTab", str);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            k kVar = (k) obj;
            if (this.f66519a.containsKey("source") != kVar.f66519a.containsKey("source")) {
                return false;
            }
            if (m49058c() == null ? kVar.m49058c() != null : !m49058c().equals(kVar.m49058c())) {
                return false;
            }
            if (this.f66519a.containsKey("openTab") != kVar.f66519a.containsKey("openTab")) {
                return false;
            }
            if (m49057b() == null ? kVar.m49057b() == null : m49057b().equals(kVar.m49057b())) {
                return mo19186a() == kVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f66519a.containsKey("source")) {
                bundle.putString("source", (String) this.f66519a.get("source"));
            } else {
                bundle.putString("source", "FAB");
            }
            if (this.f66519a.containsKey("openTab")) {
                bundle.putString("openTab", (String) this.f66519a.get("openTab"));
                return bundle;
            }
            bundle.putString("openTab", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((m49058c() != null ? m49058c().hashCode() : 0) + 31) * 31) + (m49057b() != null ? m49057b().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionNavToStrengthTrainer(actionId=" + mo19186a() + "){source=" + m49058c() + ", openTab=" + m49057b() + "}";
        }

        private k() {
            this.f66519a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC12981p0 m48990a() {
        return new C12938a(AbstractC17307e.f66823s);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC12981p0 m48991b() {
        return new C12938a(AbstractC17307e.f66830t);
    }

    /* JADX INFO: renamed from: c */
    public static a m48992c(String str) {
        return new a(str, 0);
    }

    /* JADX INFO: renamed from: d */
    public static b m48993d() {
        return new b(0);
    }

    /* JADX INFO: renamed from: e */
    public static c m48994e() {
        return new c(0);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC12981p0 m48995f() {
        return new C12938a(AbstractC17307e.f66858x);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC12981p0 m48996g() {
        return new C12938a(AbstractC17307e.f66865y);
    }

    /* JADX INFO: renamed from: h */
    public static d m48997h() {
        return new d(0);
    }

    /* JADX INFO: renamed from: i */
    public static e m48998i(int i13) {
        return new e(i13, 0);
    }

    /* JADX INFO: renamed from: j */
    public static f m48999j(String str) {
        return new f(str, 0);
    }

    /* JADX INFO: renamed from: k */
    public static g m49000k(String str, String str2) {
        return new g(str, str2, 0);
    }

    /* JADX INFO: renamed from: l */
    public static h m49001l(String str, String str2, boolean z4, String str3) {
        return new h(str, str2, z4, str3, 0);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC12981p0 m49002m() {
        return new C12938a(AbstractC17307e.f66565E);
    }

    /* JADX INFO: renamed from: n */
    public static i m49003n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new i(str, str2, str3, 0, str4, str5, str6, str7);
    }

    /* JADX INFO: renamed from: o */
    public static j m49004o(long j7) {
        return new j(j7, 0);
    }

    /* JADX INFO: renamed from: p */
    public static k m49005p() {
        return new k(0);
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC12981p0 m49006q() {
        return new C12938a(AbstractC17307e.f66849v4);
    }
}
