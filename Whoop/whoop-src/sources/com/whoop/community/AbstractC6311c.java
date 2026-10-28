package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6311c {

    /* JADX INFO: renamed from: com.whoop.community.c$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24942a;

        public /* synthetic */ a(Team team, int i13) {
            this(team);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165247b;
        }

        /* JADX INFO: renamed from: b */
        public Team m19200b() {
            return (Team) this.f24942a.get("team");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24942a.containsKey("team") != aVar.f24942a.containsKey("team")) {
                return false;
            }
            if (m19200b() == null ? aVar.m19200b() == null : m19200b().equals(aVar.m19200b())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24942a.containsKey("team")) {
                Team team = (Team) this.f24942a.get("team");
                if (!Parcelable.class.isAssignableFrom(Team.class) && team != null) {
                    if (!Serializable.class.isAssignableFrom(Team.class)) {
                        throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putSerializable("team", (Serializable) Serializable.class.cast(team));
                    return bundle;
                }
                bundle.putParcelable("team", (Parcelable) Parcelable.class.cast(team));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m19200b() != null ? m19200b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionCommunityFragmentToCommunityAddMemberFragment(actionId=" + mo19186a() + "){team=" + m19200b() + "}";
        }

        private a(Team team) {
            HashMap map = new HashMap();
            this.f24942a = map;
            if (team == null) {
                throw new IllegalArgumentException("Argument \"team\" is marked as non-null but was passed a null value.");
            }
            map.put("team", team);
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.c$b */
    public static class b implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24943a;

        public /* synthetic */ b(int i13, int i14) {
            this(i13);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165256c;
        }

        /* JADX INFO: renamed from: b */
        public int m19201b() {
            return ((Integer) this.f24943a.get("teamid")).intValue();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24943a.containsKey("teamid") == bVar.f24943a.containsKey("teamid") && m19201b() == bVar.m19201b() && mo19186a() == bVar.mo19186a();
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24943a.containsKey("teamid")) {
                bundle.putInt("teamid", ((Integer) this.f24943a.get("teamid")).intValue());
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + ((m19201b() + 31) * 31);
        }

        public String toString() {
            return "ActionCommunityFragmentToCommunityManageTeamFragment(actionId=" + mo19186a() + "){teamid=" + m19201b() + "}";
        }

        private b(int i13) {
            HashMap map = new HashMap();
            this.f24943a = map;
            map.put("teamid", Integer.valueOf(i13));
        }
    }

    /* JADX INFO: renamed from: com.whoop.community.c$c */
    public static class c implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24944a;

        public /* synthetic */ c(Team team, int i13) {
            this(team);
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165265d;
        }

        /* JADX INFO: renamed from: b */
        public Team m19202b() {
            return (Team) this.f24944a.get("team");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f24944a.containsKey("team") != cVar.f24944a.containsKey("team")) {
                return false;
            }
            if (m19202b() == null ? cVar.m19202b() == null : m19202b().equals(cVar.m19202b())) {
                return mo19186a() == cVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24944a.containsKey("team")) {
                Team team = (Team) this.f24944a.get("team");
                if (!Parcelable.class.isAssignableFrom(Team.class) && team != null) {
                    if (!Serializable.class.isAssignableFrom(Team.class)) {
                        throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    bundle.putSerializable("team", (Serializable) Serializable.class.cast(team));
                    return bundle;
                }
                bundle.putParcelable("team", (Parcelable) Parcelable.class.cast(team));
            }
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m19202b() != null ? m19202b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionCommunityFragmentToNotificationSettingsFragment(actionId=" + mo19186a() + "){team=" + m19202b() + "}";
        }

        private c(Team team) {
            HashMap map = new HashMap();
            this.f24944a = map;
            if (team == null) {
                throw new IllegalArgumentException("Argument \"team\" is marked as non-null but was passed a null value.");
            }
            map.put("team", team);
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19197a(Team team) {
        return new a(team, 0);
    }

    /* JADX INFO: renamed from: b */
    public static b m19198b(int i13) {
        return new b(i13, 0);
    }

    /* JADX INFO: renamed from: c */
    public static c m19199c(Team team) {
        return new c(team, 0);
    }
}
