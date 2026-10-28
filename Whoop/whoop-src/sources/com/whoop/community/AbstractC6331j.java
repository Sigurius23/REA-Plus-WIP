package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.j */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6331j {

    /* JADX INFO: renamed from: com.whoop.community.j$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24953a;

        public /* synthetic */ a(int i13, int i14, String str) {
            this(i13, str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165364o;
        }

        /* JADX INFO: renamed from: b */
        public String m19250b() {
            return (String) this.f24953a.get("parentMessageId");
        }

        /* JADX INFO: renamed from: c */
        public int m19251c() {
            return ((Integer) this.f24953a.get("pillarType")).intValue();
        }

        /* JADX INFO: renamed from: d */
        public int m19252d() {
            return ((Integer) this.f24953a.get("sortBy")).intValue();
        }

        /* JADX INFO: renamed from: e */
        public String m19253e() {
            return (String) this.f24953a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24953a.containsKey("sortBy") != aVar.f24953a.containsKey("sortBy") || m19252d() != aVar.m19252d() || this.f24953a.containsKey("team") != aVar.f24953a.containsKey("team")) {
                return false;
            }
            if (m19255g() == null ? aVar.m19255g() != null : !m19255g().equals(aVar.m19255g())) {
                return false;
            }
            if (this.f24953a.containsKey("startOnLeaderboards") != aVar.f24953a.containsKey("startOnLeaderboards") || m19254f() != aVar.m19254f() || this.f24953a.containsKey("pillarType") != aVar.f24953a.containsKey("pillarType") || m19251c() != aVar.m19251c() || this.f24953a.containsKey("timePeriod") != aVar.f24953a.containsKey("timePeriod")) {
                return false;
            }
            if (m19257i() == null ? aVar.m19257i() != null : !m19257i().equals(aVar.m19257i())) {
                return false;
            }
            if (this.f24953a.containsKey("parentMessageId") != aVar.f24953a.containsKey("parentMessageId")) {
                return false;
            }
            if (m19250b() == null ? aVar.m19250b() != null : !m19250b().equals(aVar.m19250b())) {
                return false;
            }
            if (this.f24953a.containsKey("teamString") != aVar.f24953a.containsKey("teamString")) {
                return false;
            }
            if (m19256h() == null ? aVar.m19256h() != null : !m19256h().equals(aVar.m19256h())) {
                return false;
            }
            if (this.f24953a.containsKey("widgetUrl") != aVar.f24953a.containsKey("widgetUrl")) {
                return false;
            }
            if (m19258j() == null ? aVar.m19258j() != null : !m19258j().equals(aVar.m19258j())) {
                return false;
            }
            if (this.f24953a.containsKey("sourceId") != aVar.f24953a.containsKey("sourceId")) {
                return false;
            }
            if (m19253e() == null ? aVar.m19253e() == null : m19253e().equals(aVar.m19253e())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m19254f() {
            return ((Boolean) this.f24953a.get("startOnLeaderboards")).booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public Team m19255g() {
            return (Team) this.f24953a.get("team");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24953a.containsKey("sortBy")) {
                bundle.putInt("sortBy", ((Integer) this.f24953a.get("sortBy")).intValue());
            } else {
                bundle.putInt("sortBy", 0);
            }
            if (this.f24953a.containsKey("team")) {
                Team team = (Team) this.f24953a.get("team");
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
            if (this.f24953a.containsKey("startOnLeaderboards")) {
                bundle.putBoolean("startOnLeaderboards", ((Boolean) this.f24953a.get("startOnLeaderboards")).booleanValue());
            } else {
                bundle.putBoolean("startOnLeaderboards", false);
            }
            if (this.f24953a.containsKey("pillarType")) {
                bundle.putInt("pillarType", ((Integer) this.f24953a.get("pillarType")).intValue());
            }
            if (this.f24953a.containsKey("timePeriod")) {
                bundle.putString("timePeriod", (String) this.f24953a.get("timePeriod"));
            }
            if (this.f24953a.containsKey("parentMessageId")) {
                bundle.putString("parentMessageId", (String) this.f24953a.get("parentMessageId"));
            } else {
                bundle.putString("parentMessageId", null);
            }
            if (this.f24953a.containsKey("teamString")) {
                bundle.putString("teamString", (String) this.f24953a.get("teamString"));
            } else {
                bundle.putString("teamString", null);
            }
            if (this.f24953a.containsKey("widgetUrl")) {
                bundle.putString("widgetUrl", (String) this.f24953a.get("widgetUrl"));
            } else {
                bundle.putString("widgetUrl", null);
            }
            if (this.f24953a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24953a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public String m19256h() {
            return (String) this.f24953a.get("teamString");
        }

        public int hashCode() {
            return mo19186a() + ((((((((((((m19251c() + (((m19254f() ? 1 : 0) + ((((m19252d() + 31) * 31) + (m19255g() != null ? m19255g().hashCode() : 0)) * 31)) * 31)) * 31) + (m19257i() != null ? m19257i().hashCode() : 0)) * 31) + (m19250b() != null ? m19250b().hashCode() : 0)) * 31) + (m19256h() != null ? m19256h().hashCode() : 0)) * 31) + (m19258j() != null ? m19258j().hashCode() : 0)) * 31) + (m19253e() != null ? m19253e().hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public String m19257i() {
            return (String) this.f24953a.get("timePeriod");
        }

        /* JADX INFO: renamed from: j */
        public String m19258j() {
            return (String) this.f24953a.get("widgetUrl");
        }

        /* JADX INFO: renamed from: k */
        public a m19259k(Team team) {
            this.f24953a.put("team", team);
            return this;
        }

        public String toString() {
            return "ActionCommunityRemoveMembersFragmentToCommunityFragment(actionId=" + mo19186a() + "){sortBy=" + m19252d() + ", team=" + m19255g() + ", startOnLeaderboards=" + m19254f() + ", pillarType=" + m19251c() + ", timePeriod=" + m19257i() + ", parentMessageId=" + m19250b() + ", teamString=" + m19256h() + ", widgetUrl=" + m19258j() + ", sourceId=" + m19253e() + "}";
        }

        private a(int i13, String str) {
            HashMap map = new HashMap();
            this.f24953a = map;
            map.put("pillarType", Integer.valueOf(i13));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
            }
            map.put("timePeriod", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19249a(int i13, String str) {
        return new a(i13, 0, str);
    }
}
