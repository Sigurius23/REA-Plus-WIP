package xp0;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.Team;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: xp0.f */
/* JADX INFO: loaded from: classes7.dex */
public class C38508f implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f165742a;

    /* JADX INFO: renamed from: xp0.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final HashMap f165743a;

        public a(int i13, String str) {
            HashMap map = new HashMap();
            this.f165743a = map;
            map.put("pillarType", Integer.valueOf(i13));
            if (str == null) {
                throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
            }
            map.put("timePeriod", str);
        }

        /* JADX INFO: renamed from: a */
        public C38508f m123411a() {
            return new C38508f(this.f165743a, 0);
        }

        /* JADX INFO: renamed from: b */
        public a m123412b(String str) {
            this.f165743a.put("parentMessageId", str);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m123413c(String str) {
            this.f165743a.put("sourceId", str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m123414d(Team team) {
            this.f165743a.put("team", team);
            return this;
        }
    }

    public /* synthetic */ C38508f(HashMap map, int i13) {
        this(map);
    }

    public static C38508f fromBundle(Bundle bundle) {
        C38508f c38508f = new C38508f();
        if (AbstractC17176i.m48518t(bundle, C38508f.class, "sortBy")) {
            c38508f.f165742a.put("sortBy", Integer.valueOf(bundle.getInt("sortBy")));
        } else {
            c38508f.f165742a.put("sortBy", 0);
        }
        if (!bundle.containsKey("team")) {
            c38508f.f165742a.put("team", null);
        } else {
            if (!Parcelable.class.isAssignableFrom(Team.class) && !Serializable.class.isAssignableFrom(Team.class)) {
                throw new UnsupportedOperationException(Team.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            c38508f.f165742a.put("team", (Team) bundle.get("team"));
        }
        if (bundle.containsKey("startOnLeaderboards")) {
            c38508f.f165742a.put("startOnLeaderboards", Boolean.valueOf(bundle.getBoolean("startOnLeaderboards")));
        } else {
            c38508f.f165742a.put("startOnLeaderboards", Boolean.FALSE);
        }
        if (!bundle.containsKey("pillarType")) {
            throw new IllegalArgumentException("Required argument \"pillarType\" is missing and does not have an android:defaultValue");
        }
        c38508f.f165742a.put("pillarType", Integer.valueOf(bundle.getInt("pillarType")));
        if (!bundle.containsKey("timePeriod")) {
            throw new IllegalArgumentException("Required argument \"timePeriod\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("timePeriod");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"timePeriod\" is marked as non-null but was passed a null value.");
        }
        c38508f.f165742a.put("timePeriod", string);
        if (bundle.containsKey("parentMessageId")) {
            c38508f.f165742a.put("parentMessageId", bundle.getString("parentMessageId"));
        } else {
            c38508f.f165742a.put("parentMessageId", null);
        }
        if (bundle.containsKey("teamString")) {
            c38508f.f165742a.put("teamString", bundle.getString("teamString"));
        } else {
            c38508f.f165742a.put("teamString", null);
        }
        if (bundle.containsKey("widgetUrl")) {
            c38508f.f165742a.put("widgetUrl", bundle.getString("widgetUrl"));
        } else {
            c38508f.f165742a.put("widgetUrl", null);
        }
        if (!bundle.containsKey("sourceId")) {
            c38508f.f165742a.put("sourceId", null);
            return c38508f;
        }
        c38508f.f165742a.put("sourceId", bundle.getString("sourceId"));
        return c38508f;
    }

    /* JADX INFO: renamed from: a */
    public String m123401a() {
        return (String) this.f165742a.get("parentMessageId");
    }

    /* JADX INFO: renamed from: b */
    public int m123402b() {
        return ((Integer) this.f165742a.get("pillarType")).intValue();
    }

    /* JADX INFO: renamed from: c */
    public int m123403c() {
        return ((Integer) this.f165742a.get("sortBy")).intValue();
    }

    /* JADX INFO: renamed from: d */
    public String m123404d() {
        return (String) this.f165742a.get("sourceId");
    }

    /* JADX INFO: renamed from: e */
    public boolean m123405e() {
        return ((Boolean) this.f165742a.get("startOnLeaderboards")).booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C38508f c38508f = (C38508f) obj;
        if (this.f165742a.containsKey("sortBy") != c38508f.f165742a.containsKey("sortBy") || m123403c() != c38508f.m123403c() || this.f165742a.containsKey("team") != c38508f.f165742a.containsKey("team")) {
            return false;
        }
        if (m123406f() == null ? c38508f.m123406f() != null : !m123406f().equals(c38508f.m123406f())) {
            return false;
        }
        if (this.f165742a.containsKey("startOnLeaderboards") != c38508f.f165742a.containsKey("startOnLeaderboards") || m123405e() != c38508f.m123405e() || this.f165742a.containsKey("pillarType") != c38508f.f165742a.containsKey("pillarType") || m123402b() != c38508f.m123402b() || this.f165742a.containsKey("timePeriod") != c38508f.f165742a.containsKey("timePeriod")) {
            return false;
        }
        if (m123408h() == null ? c38508f.m123408h() != null : !m123408h().equals(c38508f.m123408h())) {
            return false;
        }
        if (this.f165742a.containsKey("parentMessageId") != c38508f.f165742a.containsKey("parentMessageId")) {
            return false;
        }
        if (m123401a() == null ? c38508f.m123401a() != null : !m123401a().equals(c38508f.m123401a())) {
            return false;
        }
        if (this.f165742a.containsKey("teamString") != c38508f.f165742a.containsKey("teamString")) {
            return false;
        }
        if (m123407g() == null ? c38508f.m123407g() != null : !m123407g().equals(c38508f.m123407g())) {
            return false;
        }
        if (this.f165742a.containsKey("widgetUrl") != c38508f.f165742a.containsKey("widgetUrl")) {
            return false;
        }
        if (m123409i() == null ? c38508f.m123409i() != null : !m123409i().equals(c38508f.m123409i())) {
            return false;
        }
        if (this.f165742a.containsKey("sourceId") != c38508f.f165742a.containsKey("sourceId")) {
            return false;
        }
        return m123404d() == null ? c38508f.m123404d() == null : m123404d().equals(c38508f.m123404d());
    }

    /* JADX INFO: renamed from: f */
    public Team m123406f() {
        return (Team) this.f165742a.get("team");
    }

    /* JADX INFO: renamed from: g */
    public String m123407g() {
        return (String) this.f165742a.get("teamString");
    }

    /* JADX INFO: renamed from: h */
    public String m123408h() {
        return (String) this.f165742a.get("timePeriod");
    }

    public int hashCode() {
        return ((((((((((m123402b() + (((m123405e() ? 1 : 0) + ((((m123403c() + 31) * 31) + (m123406f() != null ? m123406f().hashCode() : 0)) * 31)) * 31)) * 31) + (m123408h() != null ? m123408h().hashCode() : 0)) * 31) + (m123401a() != null ? m123401a().hashCode() : 0)) * 31) + (m123407g() != null ? m123407g().hashCode() : 0)) * 31) + (m123409i() != null ? m123409i().hashCode() : 0)) * 31) + (m123404d() != null ? m123404d().hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public String m123409i() {
        return (String) this.f165742a.get("widgetUrl");
    }

    /* JADX INFO: renamed from: j */
    public Bundle m123410j() {
        Bundle bundle = new Bundle();
        if (this.f165742a.containsKey("sortBy")) {
            bundle.putInt("sortBy", ((Integer) this.f165742a.get("sortBy")).intValue());
        } else {
            bundle.putInt("sortBy", 0);
        }
        if (this.f165742a.containsKey("team")) {
            Team team = (Team) this.f165742a.get("team");
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
        if (this.f165742a.containsKey("startOnLeaderboards")) {
            bundle.putBoolean("startOnLeaderboards", ((Boolean) this.f165742a.get("startOnLeaderboards")).booleanValue());
        } else {
            bundle.putBoolean("startOnLeaderboards", false);
        }
        if (this.f165742a.containsKey("pillarType")) {
            bundle.putInt("pillarType", ((Integer) this.f165742a.get("pillarType")).intValue());
        }
        if (this.f165742a.containsKey("timePeriod")) {
            bundle.putString("timePeriod", (String) this.f165742a.get("timePeriod"));
        }
        if (this.f165742a.containsKey("parentMessageId")) {
            bundle.putString("parentMessageId", (String) this.f165742a.get("parentMessageId"));
        } else {
            bundle.putString("parentMessageId", null);
        }
        if (this.f165742a.containsKey("teamString")) {
            bundle.putString("teamString", (String) this.f165742a.get("teamString"));
        } else {
            bundle.putString("teamString", null);
        }
        if (this.f165742a.containsKey("widgetUrl")) {
            bundle.putString("widgetUrl", (String) this.f165742a.get("widgetUrl"));
        } else {
            bundle.putString("widgetUrl", null);
        }
        if (this.f165742a.containsKey("sourceId")) {
            bundle.putString("sourceId", (String) this.f165742a.get("sourceId"));
            return bundle;
        }
        bundle.putString("sourceId", null);
        return bundle;
    }

    public String toString() {
        return "CommunityFragmentArgs{sortBy=" + m123403c() + ", team=" + m123406f() + ", startOnLeaderboards=" + m123405e() + ", pillarType=" + m123402b() + ", timePeriod=" + m123408h() + ", parentMessageId=" + m123401a() + ", teamString=" + m123407g() + ", widgetUrl=" + m123409i() + ", sourceId=" + m123404d() + "}";
    }

    private C38508f() {
        this.f165742a = new HashMap();
    }

    private C38508f(HashMap map) {
        HashMap map2 = new HashMap();
        this.f165742a = map2;
        map2.putAll(map);
    }
}
