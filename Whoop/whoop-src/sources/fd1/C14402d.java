package fd1;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: fd1.d */
/* JADX INFO: loaded from: classes8.dex */
public class C14402d implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f52553a = new HashMap();

    private C14402d() {
    }

    public static C14402d fromBundle(Bundle bundle) {
        C14402d c14402d = new C14402d();
        if (!AbstractC17176i.m48518t(bundle, C14402d.class, "menuType")) {
            c14402d.f52553a.put("menuType", DesignShowcaseMenuType.ROOT);
            return c14402d;
        }
        if (!Parcelable.class.isAssignableFrom(DesignShowcaseMenuType.class) && !Serializable.class.isAssignableFrom(DesignShowcaseMenuType.class)) {
            throw new UnsupportedOperationException(DesignShowcaseMenuType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DesignShowcaseMenuType designShowcaseMenuType = (DesignShowcaseMenuType) bundle.get("menuType");
        if (designShowcaseMenuType == null) {
            throw new IllegalArgumentException("Argument \"menuType\" is marked as non-null but was passed a null value.");
        }
        c14402d.f52553a.put("menuType", designShowcaseMenuType);
        return c14402d;
    }

    /* JADX INFO: renamed from: a */
    public DesignShowcaseMenuType m41046a() {
        return (DesignShowcaseMenuType) this.f52553a.get("menuType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C14402d c14402d = (C14402d) obj;
        if (this.f52553a.containsKey("menuType") != c14402d.f52553a.containsKey("menuType")) {
            return false;
        }
        return m41046a() == null ? c14402d.m41046a() == null : m41046a().equals(c14402d.m41046a());
    }

    public int hashCode() {
        return 31 + (m41046a() != null ? m41046a().hashCode() : 0);
    }

    public String toString() {
        return "DesignShowcaseMenuFragmentArgs{menuType=" + m41046a() + "}";
    }
}
