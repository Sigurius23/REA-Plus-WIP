package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import com.whoop.domain.model.teams.Team;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.e */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6326e {

    /* JADX INFO: renamed from: com.whoop.community.e$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24946a;

        public /* synthetic */ a(int i13, int i14, String str) {
            this(i13, str);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165274e;
        }

        /* JADX INFO: renamed from: b */
        public String m19214b() {
            return (String) this.f24946a.get("parentMessageId");
        }

        /* JADX INFO: renamed from: c */
        public int m19215c() {
            return ((Integer) this.f24946a.get("pillarType")).intValue();
        }

        /* JADX INFO: renamed from: d */
        public int m19216d() {
            return ((Integer) this.f24946a.get("sortBy")).intValue();
        }

        /* JADX INFO: renamed from: e */
        public String m19217e() {
            return (String) this.f24946a.get("sourceId");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24946a.containsKey("sortBy") != aVar.f24946a.containsKey("sortBy") || m19216d() != aVar.m19216d() || this.f24946a.containsKey("team") != aVar.f24946a.containsKey("team")) {
                return false;
            }
            if (m19219g() == null ? aVar.m19219g() != null : !m19219g().equals(aVar.m19219g())) {
                return false;
            }
            if (this.f24946a.containsKey("startOnLeaderboards") != aVar.f24946a.containsKey("startOnLeaderboards") || m19218f() != aVar.m19218f() || this.f24946a.containsKey("pillarType") != aVar.f24946a.containsKey("pillarType") || m19215c() != aVar.m19215c() || this.f24946a.containsKey("timePeriod") != aVar.f24946a.containsKey("timePeriod")) {
                return false;
            }
            if (m19221i() == null ? aVar.m19221i() != null : !m19221i().equals(aVar.m19221i())) {
                return false;
            }
            if (this.f24946a.containsKey("parentMessageId") != aVar.f24946a.containsKey("parentMessageId")) {
                return false;
            }
            if (m19214b() == null ? aVar.m19214b() != null : !m19214b().equals(aVar.m19214b())) {
                return false;
            }
            if (this.f24946a.containsKey("teamString") != aVar.f24946a.containsKey("teamString")) {
                return false;
            }
            if (m19220h() == null ? aVar.m19220h() != null : !m19220h().equals(aVar.m19220h())) {
                return false;
            }
            if (this.f24946a.containsKey("widgetUrl") != aVar.f24946a.containsKey("widgetUrl")) {
                return false;
            }
            if (m19222j() == null ? aVar.m19222j() != null : !m19222j().equals(aVar.m19222j())) {
                return false;
            }
            if (this.f24946a.containsKey("sourceId") != aVar.f24946a.containsKey("sourceId")) {
                return false;
            }
            if (m19217e() == null ? aVar.m19217e() == null : m19217e().equals(aVar.m19217e())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m19218f() {
            return ((Boolean) this.f24946a.get("startOnLeaderboards")).booleanValue();
        }

        /* JADX INFO: renamed from: g */
        public Team m19219g() {
            return (Team) this.f24946a.get("team");
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24946a.containsKey("sortBy")) {
                bundle.putInt("sortBy", ((Integer) this.f24946a.get("sortBy")).intValue());
            } else {
                bundle.putInt("sortBy", 0);
            }
            if (this.f24946a.containsKey("team")) {
                Team team = (Team) this.f24946a.get("team");
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
            if (this.f24946a.containsKey("startOnLeaderboards")) {
                bundle.putBoolean("startOnLeaderboards", ((Boolean) this.f24946a.get("startOnLeaderboards")).booleanValue());
            } else {
                bundle.putBoolean("startOnLeaderboards", false);
            }
            if (this.f24946a.containsKey("pillarType")) {
                bundle.putInt("pillarType", ((Integer) this.f24946a.get("pillarType")).intValue());
            }
            if (this.f24946a.containsKey("timePeriod")) {
                bundle.putString("timePeriod", (String) this.f24946a.get("timePeriod"));
            }
            if (this.f24946a.containsKey("parentMessageId")) {
                bundle.putString("parentMessageId", (String) this.f24946a.get("parentMessageId"));
            } else {
                bundle.putString("parentMessageId", null);
            }
            if (this.f24946a.containsKey("teamString")) {
                bundle.putString("teamString", (String) this.f24946a.get("teamString"));
            } else {
                bundle.putString("teamString", null);
            }
            if (this.f24946a.containsKey("widgetUrl")) {
                bundle.putString("widgetUrl", (String) this.f24946a.get("widgetUrl"));
            } else {
                bundle.putString("widgetUrl", null);
            }
            if (this.f24946a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24946a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        /* JADX INFO: renamed from: h */
        public String m19220h() {
            return (String) this.f24946a.get("teamString");
        }

        public int hashCode() {
            return mo19186a() + ((((((((((((m19215c() + (((m19218f() ? 1 : 0) + ((((m19216d() + 31) * 31) + (m19219g() != null ? m19219g().hashCode() : 0)) * 31)) * 31)) * 31) + (m19221i() != null ? m19221i().hashCode() : 0)) * 31) + (m19214b() != null ? m19214b().hashCode() : 0)) * 31) + (m19220h() != null ? m19220h().hashCode() : 0)) * 31) + (m19222j() != null ? m19222j().hashCode() : 0)) * 31) + (m19217e() != null ? m19217e().hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public String m19221i() {
            return (String) this.f24946a.get("timePeriod");
        }

        /* JADX INFO: renamed from: j */
        public String m19222j() {
            return (String) this.f24946a.get("widgetUrl");
        }

        /* JADX INFO: renamed from: k */
        public a m19223k(String str) {
            this.f24946a.put("parentMessageId", str);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public a m19224l(Team team) {
            this.f24946a.put("team", team);
            return this;
        }

        public String toString() {
            return "ActionCommunityLandingFragmentToCommunityFragment(actionId=" + mo19186a() + "){sortBy=" + m19216d() + ", team=" + m19219g() + ", startOnLeaderboards=" + m19218f() + ", pillarType=" + m19215c() + ", timePeriod=" + m19221i() + ", parentMessageId=" + m19214b() + ", teamString=" + m19220h() + ", widgetUrl=" + m19222j() + ", sourceId=" + m19217e() + "}";
        }

        private a(int i13, String str) {
            HashMap map = new HashMap();
            this.f24946a = map;
            map.put("pillarType", Integer.valueOf(i13));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
            }
            map.put("timePeriod", str);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.e$b */
    public static class b implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24947a;

        public /* synthetic */ b(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165292g;
        }

        /* JADX INFO: renamed from: b */
        public DrawerDisplayInvite m19225b() {
            return (DrawerDisplayInvite) this.f24947a.get("invitePojo");
        }

        /* JADX INFO: renamed from: c */
        public DrawerDisplayInvite m19226c() {
            return (DrawerDisplayInvite) this.f24947a.get("invitePojoCode");
        }

        /* JADX INFO: renamed from: d */
        public String m19227d() {
            return (String) this.f24947a.get("sourceId");
        }

        /* JADX INFO: renamed from: e */
        public b m19228e(DrawerDisplayInvite drawerDisplayInvite) {
            this.f24947a.put("invitePojo", drawerDisplayInvite);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f24947a.containsKey("invitePojoCode") != bVar.f24947a.containsKey("invitePojoCode")) {
                return false;
            }
            if (m19226c() == null ? bVar.m19226c() != null : !m19226c().equals(bVar.m19226c())) {
                return false;
            }
            if (this.f24947a.containsKey("invitePojo") != bVar.f24947a.containsKey("invitePojo")) {
                return false;
            }
            if (m19225b() == null ? bVar.m19225b() != null : !m19225b().equals(bVar.m19225b())) {
                return false;
            }
            if (this.f24947a.containsKey("sourceId") != bVar.f24947a.containsKey("sourceId")) {
                return false;
            }
            if (m19227d() == null ? bVar.m19227d() == null : m19227d().equals(bVar.m19227d())) {
                return mo19186a() == bVar.mo19186a();
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public b m19229f(DrawerDisplayInvite drawerDisplayInvite) {
            this.f24947a.put("invitePojoCode", drawerDisplayInvite);
            return this;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24947a.containsKey("invitePojoCode")) {
                DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) this.f24947a.get("invitePojoCode");
                if (Parcelable.class.isAssignableFrom(DrawerDisplayInvite.class) || drawerDisplayInvite == null) {
                    bundle.putParcelable("invitePojoCode", (Parcelable) Parcelable.class.cast(drawerDisplayInvite));
                } else {
                    if (!Serializable.class.isAssignableFrom(DrawerDisplayInvite.class)) {
                        throw new UnsupportedOperationException(DrawerDisplayInvite.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putSerializable("invitePojoCode", (Serializable) Serializable.class.cast(drawerDisplayInvite));
                }
            } else {
                bundle.putSerializable("invitePojoCode", null);
            }
            if (this.f24947a.containsKey("invitePojo")) {
                DrawerDisplayInvite drawerDisplayInvite2 = (DrawerDisplayInvite) this.f24947a.get("invitePojo");
                if (Parcelable.class.isAssignableFrom(DrawerDisplayInvite.class) || drawerDisplayInvite2 == null) {
                    bundle.putParcelable("invitePojo", (Parcelable) Parcelable.class.cast(drawerDisplayInvite2));
                } else {
                    if (!Serializable.class.isAssignableFrom(DrawerDisplayInvite.class)) {
                        throw new UnsupportedOperationException(DrawerDisplayInvite.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putSerializable("invitePojo", (Serializable) Serializable.class.cast(drawerDisplayInvite2));
                }
            } else {
                bundle.putSerializable("invitePojo", null);
            }
            if (this.f24947a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24947a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((((m19226c() != null ? m19226c().hashCode() : 0) + 31) * 31) + (m19225b() != null ? m19225b().hashCode() : 0)) * 31) + (m19227d() != null ? m19227d().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionCommunityLandingFragmentToCommunityShowInviteFragment(actionId=" + mo19186a() + "){invitePojoCode=" + m19226c() + ", invitePojo=" + m19225b() + ", sourceId=" + m19227d() + "}";
        }

        private b() {
            this.f24947a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19212a(int i13, String str) {
        return new a(i13, 0, str);
    }

    /* JADX INFO: renamed from: b */
    public static b m19213b() {
        return new b(0);
    }
}
