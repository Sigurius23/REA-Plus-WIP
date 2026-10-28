package xp0;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: xp0.d */
/* JADX INFO: loaded from: classes7.dex */
public class C38504d implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f165562a = new HashMap();

    private C38504d() {
    }

    public static C38504d fromBundle(Bundle bundle) {
        C38504d c38504d = new C38504d();
        if (!AbstractC17176i.m48518t(bundle, C38504d.class, "team")) {
            throw new IllegalArgumentException("Required argument \"team\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Team.class) && !Serializable.class.isAssignableFrom(Team.class)) {
            throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Team team = (Team) bundle.get("team");
        if (team == null) {
            throw new IllegalArgumentException("Argument \"team\" is marked as non-null but was passed a null value.");
        }
        c38504d.f165562a.put("team", team);
        return c38504d;
    }

    /* JADX INFO: renamed from: a */
    public Team m123400a() {
        return (Team) this.f165562a.get("team");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C38504d c38504d = (C38504d) obj;
        if (this.f165562a.containsKey("team") != c38504d.f165562a.containsKey("team")) {
            return false;
        }
        return m123400a() == null ? c38504d.m123400a() == null : m123400a().equals(c38504d.m123400a());
    }

    public int hashCode() {
        return 31 + (m123400a() != null ? m123400a().hashCode() : 0);
    }

    public String toString() {
        return "CommunityAddMemberFragmentArgs{team=" + m123400a() + "}";
    }
}
