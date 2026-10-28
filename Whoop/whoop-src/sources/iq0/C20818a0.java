package iq0;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: iq0.a0 */
/* JADX INFO: loaded from: classes7.dex */
public class C20818a0 implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f78157a = new HashMap();

    private C20818a0() {
    }

    public static C20818a0 fromBundle(Bundle bundle) {
        C20818a0 c20818a0 = new C20818a0();
        if (!AbstractC17176i.m48518t(bundle, C20818a0.class, "team")) {
            throw new IllegalArgumentException("Required argument \"team\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(Team.class) && !Serializable.class.isAssignableFrom(Team.class)) {
            throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        Team team = (Team) bundle.get("team");
        if (team == null) {
            throw new IllegalArgumentException("Argument \"team\" is marked as non-null but was passed a null value.");
        }
        c20818a0.f78157a.put("team", team);
        return c20818a0;
    }

    /* JADX INFO: renamed from: a */
    public Team m57406a() {
        return (Team) this.f78157a.get("team");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C20818a0 c20818a0 = (C20818a0) obj;
        if (this.f78157a.containsKey("team") != c20818a0.f78157a.containsKey("team")) {
            return false;
        }
        return m57406a() == null ? c20818a0.m57406a() == null : m57406a().equals(c20818a0.m57406a());
    }

    public int hashCode() {
        return 31 + (m57406a() != null ? m57406a().hashCode() : 0);
    }

    public String toString() {
        return "NotificationSettingsFragmentArgs{team=" + m57406a() + "}";
    }
}
