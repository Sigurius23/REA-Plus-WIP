package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.a */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6309a {

    /* JADX INFO: renamed from: com.whoop.community.a$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24939a;

        public /* synthetic */ a(int i13, int i14, String str) {
            this(i13, str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165238a;
        }

        /* JADX INFO: renamed from: b */
        public String m19187b() {
            return (String) this.f24939a.get("parentMessageId");
        }

        /* JADX INFO: renamed from: c */
        public int m19188c() {
            return ((Integer) this.f24939a.get("pillarType")).intValue();
        }

        /* JADX INFO: renamed from: d */
        public int m19189d() {
            return ((Integer) this.f24939a.get("sortBy")).intValue();
        }

        /* JADX INFO: renamed from: e */
        public String m19190e() {
            return (String) this.f24939a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24939a.containsKey("sortBy") != aVar.f24939a.containsKey("sortBy") || m19189d() != aVar.m19189d() || this.f24939a.containsKey("team") != aVar.f24939a.containsKey("team")) {
                return false;
            }
            if (m19192g() == null ? aVar.m19192g() != null : !m19192g().equals(aVar.m19192g())) {
                return false;
            }
            if (this.f24939a.containsKey("startOnLeaderboards") != aVar.f24939a.containsKey("startOnLeaderboards") || m19191f() != aVar.m19191f() || this.f24939a.containsKey("pillarType") != aVar.f24939a.containsKey("pillarType") || m19188c() != aVar.m19188c() || this.f24939a.containsKey("timePeriod") != aVar.f24939a.containsKey("timePeriod")) {
                return false;
            }
            if (m19194i() == null ? aVar.m19194i() != null : !m19194i().equals(aVar.m19194i())) {
                return false;
            }
            if (this.f24939a.containsKey("parentMessageId") != aVar.f24939a.containsKey("parentMessageId")) {
                return false;
            }
            if (m19187b() == null ? aVar.m19187b() != null : !m19187b().equals(aVar.m19187b())) {
                return false;
            }
            if (this.f24939a.containsKey("teamString") != aVar.f24939a.containsKey("teamString")) {
                return false;
            }
            if (m19193h() == null ? aVar.m19193h() != null : !m19193h().equals(aVar.m19193h())) {
                return false;
            }
            if (this.f24939a.containsKey("widgetUrl") != aVar.f24939a.containsKey("widgetUrl")) {
                return false;
            }
            if (m19195j() == null ? aVar.m19195j() != null : !m19195j().equals(aVar.m19195j())) {
                return false;
            }
            if (this.f24939a.containsKey("sourceId") != aVar.f24939a.containsKey("sourceId")) {
                return false;
            }
            if (m19190e() == null ? aVar.m19190e() == null : m19190e().equals(aVar.m19190e())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m19191f() {
            return ((Boolean) this.f24939a.get("startOnLeaderboards")).booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public Team m19192g() {
            return (Team) this.f24939a.get("team");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24939a.containsKey("sortBy")) {
                bundle.putInt("sortBy", ((Integer) this.f24939a.get("sortBy")).intValue());
            } else {
                bundle.putInt("sortBy", 0);
            }
            if (this.f24939a.containsKey("team")) {
                Team team = (Team) this.f24939a.get("team");
                if (Parcelable.class.isAssignableFrom(Team.class) || team == null) {
                    bundle.putParcelable("team", (Parcelable) Parcelable.class.cast(team));
                } else {
                    if (!Serializable.class.isAssignableFrom(Team.class)) {
                        throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putSerializable("team", (Serializable) Serializable.class.cast(team));
                }
            } else {
                bundle.putSerializable("team", null);
            }
            if (this.f24939a.containsKey("startOnLeaderboards")) {
                bundle.putBoolean("startOnLeaderboards", ((Boolean) this.f24939a.get("startOnLeaderboards")).booleanValue());
            } else {
                bundle.putBoolean("startOnLeaderboards", false);
            }
            if (this.f24939a.containsKey("pillarType")) {
                bundle.putInt("pillarType", ((Integer) this.f24939a.get("pillarType")).intValue());
            }
            if (this.f24939a.containsKey("timePeriod")) {
                bundle.putString("timePeriod", (String) this.f24939a.get("timePeriod"));
            }
            if (this.f24939a.containsKey("parentMessageId")) {
                bundle.putString("parentMessageId", (String) this.f24939a.get("parentMessageId"));
            } else {
                bundle.putString("parentMessageId", null);
            }
            if (this.f24939a.containsKey("teamString")) {
                bundle.putString("teamString", (String) this.f24939a.get("teamString"));
            } else {
                bundle.putString("teamString", null);
            }
            if (this.f24939a.containsKey("widgetUrl")) {
                bundle.putString("widgetUrl", (String) this.f24939a.get("widgetUrl"));
            } else {
                bundle.putString("widgetUrl", null);
            }
            if (this.f24939a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24939a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public String m19193h() {
            return (String) this.f24939a.get("teamString");
        }

        public int hashCode() {
            return mo19186a() + ((((((((((((m19188c() + (((m19191f() ? 1 : 0) + ((((m19189d() + 31) * 31) + (m19192g() != null ? m19192g().hashCode() : 0)) * 31)) * 31)) * 31) + (m19194i() != null ? m19194i().hashCode() : 0)) * 31) + (m19187b() != null ? m19187b().hashCode() : 0)) * 31) + (m19193h() != null ? m19193h().hashCode() : 0)) * 31) + (m19195j() != null ? m19195j().hashCode() : 0)) * 31) + (m19190e() != null ? m19190e().hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public String m19194i() {
            return (String) this.f24939a.get("timePeriod");
        }

        /* JADX INFO: renamed from: j */
        public String m19195j() {
            return (String) this.f24939a.get("widgetUrl");
        }

        /* JADX INFO: renamed from: k */
        public a m19196k(Team team) {
            this.f24939a.put("team", team);
            return this;
        }

        public String toString() {
            return "ActionCommunityAddMemberFragmentToCommunityFragment(actionId=" + mo19186a() + "){sortBy=" + m19189d() + ", team=" + m19192g() + ", startOnLeaderboards=" + m19191f() + ", pillarType=" + m19188c() + ", timePeriod=" + m19194i() + ", parentMessageId=" + m19187b() + ", teamString=" + m19193h() + ", widgetUrl=" + m19195j() + ", sourceId=" + m19190e() + "}";
        }

        private a(int i13, String str) {
            HashMap map = new HashMap();
            this.f24939a = map;
            map.put("pillarType", Integer.valueOf(i13));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
            }
            map.put("timePeriod", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19185a(int i13, String str) {
        return new a(i13, 0, str);
    }
}
