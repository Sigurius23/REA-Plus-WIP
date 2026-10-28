package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.k */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6332k {

    /* JADX INFO: renamed from: com.whoop.community.k$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24954a;

        public /* synthetic */ a(int i13, int i14, String str) {
            this(i13, str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165373p;
        }

        /* JADX INFO: renamed from: b */
        public String m19261b() {
            return (String) this.f24954a.get("parentMessageId");
        }

        /* JADX INFO: renamed from: c */
        public int m19262c() {
            return ((Integer) this.f24954a.get("pillarType")).intValue();
        }

        /* JADX INFO: renamed from: d */
        public int m19263d() {
            return ((Integer) this.f24954a.get("sortBy")).intValue();
        }

        /* JADX INFO: renamed from: e */
        public String m19264e() {
            return (String) this.f24954a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24954a.containsKey("sortBy") != aVar.f24954a.containsKey("sortBy") || m19263d() != aVar.m19263d() || this.f24954a.containsKey("team") != aVar.f24954a.containsKey("team")) {
                return false;
            }
            if (m19266g() == null ? aVar.m19266g() != null : !m19266g().equals(aVar.m19266g())) {
                return false;
            }
            if (this.f24954a.containsKey("startOnLeaderboards") != aVar.f24954a.containsKey("startOnLeaderboards") || m19265f() != aVar.m19265f() || this.f24954a.containsKey("pillarType") != aVar.f24954a.containsKey("pillarType") || m19262c() != aVar.m19262c() || this.f24954a.containsKey("timePeriod") != aVar.f24954a.containsKey("timePeriod")) {
                return false;
            }
            if (m19268i() == null ? aVar.m19268i() != null : !m19268i().equals(aVar.m19268i())) {
                return false;
            }
            if (this.f24954a.containsKey("parentMessageId") != aVar.f24954a.containsKey("parentMessageId")) {
                return false;
            }
            if (m19261b() == null ? aVar.m19261b() != null : !m19261b().equals(aVar.m19261b())) {
                return false;
            }
            if (this.f24954a.containsKey("teamString") != aVar.f24954a.containsKey("teamString")) {
                return false;
            }
            if (m19267h() == null ? aVar.m19267h() != null : !m19267h().equals(aVar.m19267h())) {
                return false;
            }
            if (this.f24954a.containsKey("widgetUrl") != aVar.f24954a.containsKey("widgetUrl")) {
                return false;
            }
            if (m19269j() == null ? aVar.m19269j() != null : !m19269j().equals(aVar.m19269j())) {
                return false;
            }
            if (this.f24954a.containsKey("sourceId") != aVar.f24954a.containsKey("sourceId")) {
                return false;
            }
            if (m19264e() == null ? aVar.m19264e() == null : m19264e().equals(aVar.m19264e())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m19265f() {
            return ((Boolean) this.f24954a.get("startOnLeaderboards")).booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public Team m19266g() {
            return (Team) this.f24954a.get("team");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24954a.containsKey("sortBy")) {
                bundle.putInt("sortBy", ((Integer) this.f24954a.get("sortBy")).intValue());
            } else {
                bundle.putInt("sortBy", 0);
            }
            if (this.f24954a.containsKey("team")) {
                Team team = (Team) this.f24954a.get("team");
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
            if (this.f24954a.containsKey("startOnLeaderboards")) {
                bundle.putBoolean("startOnLeaderboards", ((Boolean) this.f24954a.get("startOnLeaderboards")).booleanValue());
            } else {
                bundle.putBoolean("startOnLeaderboards", false);
            }
            if (this.f24954a.containsKey("pillarType")) {
                bundle.putInt("pillarType", ((Integer) this.f24954a.get("pillarType")).intValue());
            }
            if (this.f24954a.containsKey("timePeriod")) {
                bundle.putString("timePeriod", (String) this.f24954a.get("timePeriod"));
            }
            if (this.f24954a.containsKey("parentMessageId")) {
                bundle.putString("parentMessageId", (String) this.f24954a.get("parentMessageId"));
            } else {
                bundle.putString("parentMessageId", null);
            }
            if (this.f24954a.containsKey("teamString")) {
                bundle.putString("teamString", (String) this.f24954a.get("teamString"));
            } else {
                bundle.putString("teamString", null);
            }
            if (this.f24954a.containsKey("widgetUrl")) {
                bundle.putString("widgetUrl", (String) this.f24954a.get("widgetUrl"));
            } else {
                bundle.putString("widgetUrl", null);
            }
            if (this.f24954a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24954a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public String m19267h() {
            return (String) this.f24954a.get("teamString");
        }

        public int hashCode() {
            return mo19186a() + ((((((((((((m19262c() + (((m19265f() ? 1 : 0) + ((((m19263d() + 31) * 31) + (m19266g() != null ? m19266g().hashCode() : 0)) * 31)) * 31)) * 31) + (m19268i() != null ? m19268i().hashCode() : 0)) * 31) + (m19261b() != null ? m19261b().hashCode() : 0)) * 31) + (m19267h() != null ? m19267h().hashCode() : 0)) * 31) + (m19269j() != null ? m19269j().hashCode() : 0)) * 31) + (m19264e() != null ? m19264e().hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public String m19268i() {
            return (String) this.f24954a.get("timePeriod");
        }

        /* JADX INFO: renamed from: j */
        public String m19269j() {
            return (String) this.f24954a.get("widgetUrl");
        }

        /* JADX INFO: renamed from: k */
        public a m19270k(Team team) {
            this.f24954a.put("team", team);
            return this;
        }

        public String toString() {
            return "ActionCommunityShowInviteFragmentToCommunityFragment(actionId=" + mo19186a() + "){sortBy=" + m19263d() + ", team=" + m19266g() + ", startOnLeaderboards=" + m19265f() + ", pillarType=" + m19262c() + ", timePeriod=" + m19268i() + ", parentMessageId=" + m19261b() + ", teamString=" + m19267h() + ", widgetUrl=" + m19269j() + ", sourceId=" + m19264e() + "}";
        }

        private a(int i13, String str) {
            HashMap map = new HashMap();
            this.f24954a = map;
            map.put("pillarType", Integer.valueOf(i13));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
            }
            map.put("timePeriod", str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19260a(int i13, String str) {
        return new a(i13, 0, str);
    }
}
