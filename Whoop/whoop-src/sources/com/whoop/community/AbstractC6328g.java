package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.g */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6328g {

    /* JADX INFO: renamed from: com.whoop.community.g$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24949a;

        public /* synthetic */ a(int i13, int i14, String str) {
            this(i13, str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165319j;
        }

        /* JADX INFO: renamed from: b */
        public String m19232b() {
            return (String) this.f24949a.get("parentMessageId");
        }

        /* JADX INFO: renamed from: c */
        public int m19233c() {
            return ((Integer) this.f24949a.get("pillarType")).intValue();
        }

        /* JADX INFO: renamed from: d */
        public int m19234d() {
            return ((Integer) this.f24949a.get("sortBy")).intValue();
        }

        /* JADX INFO: renamed from: e */
        public String m19235e() {
            return (String) this.f24949a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24949a.containsKey("sortBy") != aVar.f24949a.containsKey("sortBy") || m19234d() != aVar.m19234d() || this.f24949a.containsKey("team") != aVar.f24949a.containsKey("team")) {
                return false;
            }
            if (m19237g() == null ? aVar.m19237g() != null : !m19237g().equals(aVar.m19237g())) {
                return false;
            }
            if (this.f24949a.containsKey("startOnLeaderboards") != aVar.f24949a.containsKey("startOnLeaderboards") || m19236f() != aVar.m19236f() || this.f24949a.containsKey("pillarType") != aVar.f24949a.containsKey("pillarType") || m19233c() != aVar.m19233c() || this.f24949a.containsKey("timePeriod") != aVar.f24949a.containsKey("timePeriod")) {
                return false;
            }
            if (m19239i() == null ? aVar.m19239i() != null : !m19239i().equals(aVar.m19239i())) {
                return false;
            }
            if (this.f24949a.containsKey("parentMessageId") != aVar.f24949a.containsKey("parentMessageId")) {
                return false;
            }
            if (m19232b() == null ? aVar.m19232b() != null : !m19232b().equals(aVar.m19232b())) {
                return false;
            }
            if (this.f24949a.containsKey("teamString") != aVar.f24949a.containsKey("teamString")) {
                return false;
            }
            if (m19238h() == null ? aVar.m19238h() != null : !m19238h().equals(aVar.m19238h())) {
                return false;
            }
            if (this.f24949a.containsKey("widgetUrl") != aVar.f24949a.containsKey("widgetUrl")) {
                return false;
            }
            if (m19240j() == null ? aVar.m19240j() != null : !m19240j().equals(aVar.m19240j())) {
                return false;
            }
            if (this.f24949a.containsKey("sourceId") != aVar.f24949a.containsKey("sourceId")) {
                return false;
            }
            if (m19235e() == null ? aVar.m19235e() == null : m19235e().equals(aVar.m19235e())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m19236f() {
            return ((Boolean) this.f24949a.get("startOnLeaderboards")).booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public Team m19237g() {
            return (Team) this.f24949a.get("team");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24949a.containsKey("sortBy")) {
                bundle.putInt("sortBy", ((Integer) this.f24949a.get("sortBy")).intValue());
            } else {
                bundle.putInt("sortBy", 0);
            }
            if (this.f24949a.containsKey("team")) {
                Team team = (Team) this.f24949a.get("team");
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
            if (this.f24949a.containsKey("startOnLeaderboards")) {
                bundle.putBoolean("startOnLeaderboards", ((Boolean) this.f24949a.get("startOnLeaderboards")).booleanValue());
            } else {
                bundle.putBoolean("startOnLeaderboards", false);
            }
            if (this.f24949a.containsKey("pillarType")) {
                bundle.putInt("pillarType", ((Integer) this.f24949a.get("pillarType")).intValue());
            }
            if (this.f24949a.containsKey("timePeriod")) {
                bundle.putString("timePeriod", (String) this.f24949a.get("timePeriod"));
            }
            if (this.f24949a.containsKey("parentMessageId")) {
                bundle.putString("parentMessageId", (String) this.f24949a.get("parentMessageId"));
            } else {
                bundle.putString("parentMessageId", null);
            }
            if (this.f24949a.containsKey("teamString")) {
                bundle.putString("teamString", (String) this.f24949a.get("teamString"));
            } else {
                bundle.putString("teamString", null);
            }
            if (this.f24949a.containsKey("widgetUrl")) {
                bundle.putString("widgetUrl", (String) this.f24949a.get("widgetUrl"));
            } else {
                bundle.putString("widgetUrl", null);
            }
            if (this.f24949a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24949a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public String m19238h() {
            return (String) this.f24949a.get("teamString");
        }

        public int hashCode() {
            return mo19186a() + ((((((((((((m19233c() + (((m19236f() ? 1 : 0) + ((((m19234d() + 31) * 31) + (m19237g() != null ? m19237g().hashCode() : 0)) * 31)) * 31)) * 31) + (m19239i() != null ? m19239i().hashCode() : 0)) * 31) + (m19232b() != null ? m19232b().hashCode() : 0)) * 31) + (m19238h() != null ? m19238h().hashCode() : 0)) * 31) + (m19240j() != null ? m19240j().hashCode() : 0)) * 31) + (m19235e() != null ? m19235e().hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public String m19239i() {
            return (String) this.f24949a.get("timePeriod");
        }

        /* JADX INFO: renamed from: j */
        public String m19240j() {
            return (String) this.f24949a.get("widgetUrl");
        }

        /* JADX INFO: renamed from: k */
        public a m19241k(Team team) {
            this.f24949a.put("team", team);
            return this;
        }

        public String toString() {
            return "ActionCommunityManageTeamFragmentToCommunityFragment(actionId=" + mo19186a() + "){sortBy=" + m19234d() + ", team=" + m19237g() + ", startOnLeaderboards=" + m19236f() + ", pillarType=" + m19233c() + ", timePeriod=" + m19239i() + ", parentMessageId=" + m19232b() + ", teamString=" + m19238h() + ", widgetUrl=" + m19240j() + ", sourceId=" + m19235e() + "}";
        }

        private a(int i13, String str) {
            HashMap map = new HashMap();
            this.f24949a = map;
            map.put("pillarType", Integer.valueOf(i13));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
            }
            map.put("timePeriod", str);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.g$b */
    public static class b implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24950a;

        public /* synthetic */ b(boolean z4, Team team, int i13) {
            this(z4, team);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165337l;
        }

        /* JADX INFO: renamed from: b */
        public boolean m19242b() {
            return ((Boolean) this.f24950a.get("isTransfer")).booleanValue();
        }

        /* JADX INFO: renamed from: c */
        public Team m19243c() {
            return (Team) this.f24950a.get("teamid");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24950a.containsKey("isTransfer") != bVar.f24950a.containsKey("isTransfer") || m19242b() != bVar.m19242b() || this.f24950a.containsKey("teamid") != bVar.f24950a.containsKey("teamid")) {
                return false;
            }
            if (m19243c() == null ? bVar.m19243c() == null : m19243c().equals(bVar.m19243c())) {
                return mo19186a() == bVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24950a.containsKey("isTransfer")) {
                bundle.putBoolean("isTransfer", ((Boolean) this.f24950a.get("isTransfer")).booleanValue());
            }
            if (this.f24950a.containsKey("teamid")) {
                Team team = (Team) this.f24950a.get("teamid");
                if (!Parcelable.class.isAssignableFrom(Team.class) && team != null) {
                    if (!Serializable.class.isAssignableFrom(Team.class)) {
                        throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putSerializable("teamid", (Serializable) Serializable.class.cast(team));
                    return bundle;
                }
                bundle.putParcelable("teamid", (Parcelable) Parcelable.class.cast(team));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((m19242b() ? 1 : 0) + 31) * 31) + (m19243c() != null ? m19243c().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionCommunityManageTeamFragmentToCommunityRemoveMembersFragment(actionId=" + mo19186a() + "){isTransfer=" + m19242b() + ", teamid=" + m19243c() + "}";
        }

        private b(boolean z4, Team team) {
            HashMap map = new HashMap();
            this.f24950a = map;
            map.put("isTransfer", Boolean.valueOf(z4));
            if (team == null) {
                throw new IllegalArgumentException("Argument \"teamid\" is marked as non-null but was passed a null value.");
            }
            map.put("teamid", team);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19230a(int i13, String str) {
        return new a(i13, 0, str);
    }

    /* JADX INFO: renamed from: b */
    public static b m19231b(boolean z4, Team team) {
        return new b(z4, team, 0);
    }
}
