package xp0;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: xp0.x */
/* JADX INFO: loaded from: classes7.dex */
public class C38527x implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f165801a;

    /* JADX INFO: renamed from: xp0.x$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final HashMap f165802a = new HashMap();

        /* JADX INFO: renamed from: a */
        public C38527x m123426a() {
            return new C38527x(this.f165802a, 0);
        }

        /* JADX INFO: renamed from: b */
        public a m123427b(DrawerDisplayInvite drawerDisplayInvite) {
            this.f165802a.put("invitePojo", drawerDisplayInvite);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m123428c(String str) {
            this.f165802a.put("sourceId", str);
            return this;
        }
    }

    public /* synthetic */ C38527x(HashMap map, int i13) {
        this(map);
    }

    public static C38527x fromBundle(Bundle bundle) {
        C38527x c38527x = new C38527x();
        if (!AbstractC17176i.m48518t(bundle, C38527x.class, "invitePojoCode")) {
            c38527x.f165801a.put("invitePojoCode", null);
        } else {
            if (!Parcelable.class.isAssignableFrom(DrawerDisplayInvite.class) && !Serializable.class.isAssignableFrom(DrawerDisplayInvite.class)) {
                throw new UnsupportedOperationException(DrawerDisplayInvite.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            c38527x.f165801a.put("invitePojoCode", (DrawerDisplayInvite) bundle.get("invitePojoCode"));
        }
        if (!bundle.containsKey("invitePojo")) {
            c38527x.f165801a.put("invitePojo", null);
        } else {
            if (!Parcelable.class.isAssignableFrom(DrawerDisplayInvite.class) && !Serializable.class.isAssignableFrom(DrawerDisplayInvite.class)) {
                throw new UnsupportedOperationException(DrawerDisplayInvite.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            c38527x.f165801a.put("invitePojo", (DrawerDisplayInvite) bundle.get("invitePojo"));
        }
        if (!bundle.containsKey("sourceId")) {
            c38527x.f165801a.put("sourceId", null);
            return c38527x;
        }
        c38527x.f165801a.put("sourceId", bundle.getString("sourceId"));
        return c38527x;
    }

    /* JADX INFO: renamed from: a */
    public DrawerDisplayInvite m123422a() {
        return (DrawerDisplayInvite) this.f165801a.get("invitePojo");
    }

    /* JADX INFO: renamed from: b */
    public DrawerDisplayInvite m123423b() {
        return (DrawerDisplayInvite) this.f165801a.get("invitePojoCode");
    }

    /* JADX INFO: renamed from: c */
    public String m123424c() {
        return (String) this.f165801a.get("sourceId");
    }

    /* JADX INFO: renamed from: d */
    public Bundle m123425d() {
        Bundle bundle = new Bundle();
        if (this.f165801a.containsKey("invitePojoCode")) {
            DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) this.f165801a.get("invitePojoCode");
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
        if (this.f165801a.containsKey("invitePojo")) {
            DrawerDisplayInvite drawerDisplayInvite2 = (DrawerDisplayInvite) this.f165801a.get("invitePojo");
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
        if (this.f165801a.containsKey("sourceId")) {
            bundle.putString("sourceId", (String) this.f165801a.get("sourceId"));
            return bundle;
        }
        bundle.putString("sourceId", null);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C38527x c38527x = (C38527x) obj;
        if (this.f165801a.containsKey("invitePojoCode") != c38527x.f165801a.containsKey("invitePojoCode")) {
            return false;
        }
        if (m123423b() == null ? c38527x.m123423b() != null : !m123423b().equals(c38527x.m123423b())) {
            return false;
        }
        if (this.f165801a.containsKey("invitePojo") != c38527x.f165801a.containsKey("invitePojo")) {
            return false;
        }
        if (m123422a() == null ? c38527x.m123422a() != null : !m123422a().equals(c38527x.m123422a())) {
            return false;
        }
        if (this.f165801a.containsKey("sourceId") != c38527x.f165801a.containsKey("sourceId")) {
            return false;
        }
        return m123424c() == null ? c38527x.m123424c() == null : m123424c().equals(c38527x.m123424c());
    }

    public int hashCode() {
        return (((((m123423b() != null ? m123423b().hashCode() : 0) + 31) * 31) + (m123422a() != null ? m123422a().hashCode() : 0)) * 31) + (m123424c() != null ? m123424c().hashCode() : 0);
    }

    public String toString() {
        return "CommunityShowInviteFragmentArgs{invitePojoCode=" + m123423b() + ", invitePojo=" + m123422a() + ", sourceId=" + m123424c() + "}";
    }

    private C38527x() {
        this.f165801a = new HashMap();
    }

    private C38527x(HashMap map) {
        HashMap map2 = new HashMap();
        this.f165801a = map2;
        map2.putAll(map);
    }
}
