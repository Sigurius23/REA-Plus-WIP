package xp0;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: xp0.v */
/* JADX INFO: loaded from: classes7.dex */
public class C38525v implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f165798a = new HashMap();

    private C38525v() {
    }

    public static C38525v fromBundle(Bundle bundle) {
        C38525v c38525v = new C38525v();
        if (!AbstractC17176i.m48518t(bundle, C38525v.class, "isTransfer")) {
            throw new IllegalArgumentException("Required argument \"isTransfer\" is missing and does not have an android:defaultValue");
        }
        c38525v.f165798a.put("isTransfer", Boolean.valueOf(bundle.getBoolean("isTransfer")));
        if (!bundle.containsKey("teamid")) {
            throw new IllegalArgumentException("Required argument \"teamid\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Team.class) && !Serializable.class.isAssignableFrom(Team.class)) {
            throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Team team = (Team) bundle.get("teamid");
        if (team == null) {
            throw new IllegalArgumentException("Argument \"teamid\" is marked as non-null but was passed a null value.");
        }
        c38525v.f165798a.put("teamid", team);
        return c38525v;
    }

    /* JADX INFO: renamed from: a */
    public boolean m123420a() {
        return ((Boolean) this.f165798a.get("isTransfer")).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public Team m123421b() {
        return (Team) this.f165798a.get("teamid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C38525v c38525v = (C38525v) obj;
        if (this.f165798a.containsKey("isTransfer") == c38525v.f165798a.containsKey("isTransfer") && m123420a() == c38525v.m123420a() && this.f165798a.containsKey("teamid") == c38525v.f165798a.containsKey("teamid")) {
            return m123421b() == null ? c38525v.m123421b() == null : m123421b().equals(c38525v.m123421b());
        }
        return false;
    }

    public int hashCode() {
        return (((m123420a() ? 1 : 0) + 31) * 31) + (m123421b() != null ? m123421b().hashCode() : 0);
    }

    public String toString() {
        return "CommunityRemoveMembersFragmentArgs{isTransfer=" + m123420a() + ", teamid=" + m123421b() + "}";
    }
}
