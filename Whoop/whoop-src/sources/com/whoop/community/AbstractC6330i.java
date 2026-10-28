package com.whoop.community;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.domain.model.teams.DrawerDisplayInvite;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12981p0;
import xp0.AbstractC38499a0;

/* JADX INFO: renamed from: com.whoop.community.i */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC6330i {

    /* JADX INFO: renamed from: com.whoop.community.i$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f24952a;

        public /* synthetic */ a(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38499a0.f165355n;
        }

        /* JADX INFO: renamed from: b */
        public DrawerDisplayInvite m19245b() {
            return (DrawerDisplayInvite) this.f24952a.get("invitePojo");
        }

        /* JADX INFO: renamed from: c */
        public DrawerDisplayInvite m19246c() {
            return (DrawerDisplayInvite) this.f24952a.get("invitePojoCode");
        }

        /* JADX INFO: renamed from: d */
        public String m19247d() {
            return (String) this.f24952a.get("sourceId");
        }

        /* JADX INFO: renamed from: e */
        public a m19248e(DrawerDisplayInvite drawerDisplayInvite) {
            this.f24952a.put("invitePojo", drawerDisplayInvite);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f24952a.containsKey("invitePojoCode") != aVar.f24952a.containsKey("invitePojoCode")) {
                return false;
            }
            if (m19246c() == null ? aVar.m19246c() != null : !m19246c().equals(aVar.m19246c())) {
                return false;
            }
            if (this.f24952a.containsKey("invitePojo") != aVar.f24952a.containsKey("invitePojo")) {
                return false;
            }
            if (m19245b() == null ? aVar.m19245b() != null : !m19245b().equals(aVar.m19245b())) {
                return false;
            }
            if (this.f24952a.containsKey("sourceId") != aVar.f24952a.containsKey("sourceId")) {
                return false;
            }
            if (m19247d() == null ? aVar.m19247d() == null : m19247d().equals(aVar.m19247d())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (this.f24952a.containsKey("invitePojoCode")) {
                DrawerDisplayInvite drawerDisplayInvite = (DrawerDisplayInvite) this.f24952a.get("invitePojoCode");
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
            if (this.f24952a.containsKey("invitePojo")) {
                DrawerDisplayInvite drawerDisplayInvite2 = (DrawerDisplayInvite) this.f24952a.get("invitePojo");
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
            if (this.f24952a.containsKey("sourceId")) {
                bundle.putString("sourceId", (String) this.f24952a.get("sourceId"));
                return bundle;
            }
            bundle.putString("sourceId", null);
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((((((m19246c() != null ? m19246c().hashCode() : 0) + 31) * 31) + (m19245b() != null ? m19245b().hashCode() : 0)) * 31) + (m19247d() != null ? m19247d().hashCode() : 0)) * 31);
        }

        public String toString() {
            return "ActionCommunityPendingFragmentToCommunityShowInviteFragment(actionId=" + mo19186a() + "){invitePojoCode=" + m19246c() + ", invitePojo=" + m19245b() + ", sourceId=" + m19247d() + "}";
        }

        private a() {
            this.f24952a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m19244a() {
        return new a(0);
    }
}
