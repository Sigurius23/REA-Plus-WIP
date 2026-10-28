package cd1;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import hc3.AbstractC17176i;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.InterfaceC12959h;

/* JADX INFO: renamed from: cd1.i */
/* JADX INFO: loaded from: classes8.dex */
public class C4445i implements InterfaceC12959h {

    /* JADX INFO: renamed from: a */
    private final HashMap f17931a = new HashMap();

    private C4445i() {
    }

    public static C4445i fromBundle(Bundle bundle) {
        C4445i c4445i = new C4445i();
        if (!AbstractC17176i.m48518t(bundle, C4445i.class, "galleryType")) {
            c4445i.f17931a.put("galleryType", DesignShowcaseGalleryType.PARTICLE_COLOR);
            return c4445i;
        }
        if (!Parcelable.class.isAssignableFrom(DesignShowcaseGalleryType.class) && !Serializable.class.isAssignableFrom(DesignShowcaseGalleryType.class)) {
            throw new UnsupportedOperationException(DesignShowcaseGalleryType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DesignShowcaseGalleryType designShowcaseGalleryType = (DesignShowcaseGalleryType) bundle.get("galleryType");
        if (designShowcaseGalleryType == null) {
            throw new IllegalArgumentException("Argument \"galleryType\" is marked as non-null but was passed a null value.");
        }
        c4445i.f17931a.put("galleryType", designShowcaseGalleryType);
        return c4445i;
    }

    /* JADX INFO: renamed from: a */
    public DesignShowcaseGalleryType m13892a() {
        return (DesignShowcaseGalleryType) this.f17931a.get("galleryType");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4445i c4445i = (C4445i) obj;
        if (this.f17931a.containsKey("galleryType") != c4445i.f17931a.containsKey("galleryType")) {
            return false;
        }
        return m13892a() == null ? c4445i.m13892a() == null : m13892a().equals(c4445i.m13892a());
    }

    public int hashCode() {
        return 31 + (m13892a() != null ? m13892a().hashCode() : 0);
    }

    public String toString() {
        return "DesignShowcaseGalleryFragmentArgs{galleryType=" + m13892a() + "}";
    }
}
