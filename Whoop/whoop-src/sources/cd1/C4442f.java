package cd1;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.design.showcase.navigation.DesignShowcaseAtomicType;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: cd1.f */
/* JADX INFO: loaded from: classes8.dex */
public class C4442f implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f17925a = new HashMap();

    private C4442f() {
    }

    public static C4442f fromBundle(Bundle bundle) {
        C4442f c4442f = new C4442f();
        if (!AbstractC17176i.m48518t(bundle, C4442f.class, "atomicType")) {
            c4442f.f17925a.put("atomicType", DesignShowcaseAtomicType.NAVIGATION_BAR);
            return c4442f;
        }
        if (!Parcelable.class.isAssignableFrom(DesignShowcaseAtomicType.class) && !Serializable.class.isAssignableFrom(DesignShowcaseAtomicType.class)) {
            throw new UnsupportedOperationException(DesignShowcaseAtomicType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DesignShowcaseAtomicType designShowcaseAtomicType = (DesignShowcaseAtomicType) bundle.get("atomicType");
        if (designShowcaseAtomicType == null) {
            throw new IllegalArgumentException("Argument \"atomicType\" is marked as non-null but was passed a null value.");
        }
        c4442f.f17925a.put("atomicType", designShowcaseAtomicType);
        return c4442f;
    }

    /* JADX INFO: renamed from: a */
    public DesignShowcaseAtomicType m13885a() {
        return (DesignShowcaseAtomicType) this.f17925a.get("atomicType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4442f c4442f = (C4442f) obj;
        if (this.f17925a.containsKey("atomicType") != c4442f.f17925a.containsKey("atomicType")) {
            return false;
        }
        return m13885a() == null ? c4442f.m13885a() == null : m13885a().equals(c4442f.m13885a());
    }

    public int hashCode() {
        return 31 + (m13885a() != null ? m13885a().hashCode() : 0);
    }

    public String toString() {
        return "AtomicGalleryFragmentArgs{atomicType=" + m13885a() + "}";
    }
}
