package com.whoop.design.showcase.menu.view.fragment;

import android.os.Bundle;
import android.os.Parcelable;
import com.whoop.design.showcase.navigation.DesignShowcaseAtomicType;
import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import java.io.Serializable;
import java.util.HashMap;
import p114eb.C12938a;
import p114eb.InterfaceC12981p0;
import xc1.AbstractC38188b;

/* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.a */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC8686a {

    /* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.a$a */
    public static class a implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f25880a;

        public /* synthetic */ a(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38188b.f163506a;
        }

        /* JADX INFO: renamed from: b */
        public DesignShowcaseAtomicType m21246b() {
            return (DesignShowcaseAtomicType) this.f25880a.get("atomicType");
        }

        /* JADX INFO: renamed from: c */
        public a m21247c(DesignShowcaseAtomicType designShowcaseAtomicType) {
            if (designShowcaseAtomicType == null) {
                throw new IllegalArgumentException("Argument \"atomicType\" is marked as non-null but was passed a null value.");
            }
            this.f25880a.put("atomicType", designShowcaseAtomicType);
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
            if (this.f25880a.containsKey("atomicType") != aVar.f25880a.containsKey("atomicType")) {
                return false;
            }
            if (m21246b() == null ? aVar.m21246b() == null : m21246b().equals(aVar.m21246b())) {
                return mo19186a() == aVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (!this.f25880a.containsKey("atomicType")) {
                bundle.putSerializable("atomicType", DesignShowcaseAtomicType.NAVIGATION_BAR);
                return bundle;
            }
            DesignShowcaseAtomicType designShowcaseAtomicType = (DesignShowcaseAtomicType) this.f25880a.get("atomicType");
            if (Parcelable.class.isAssignableFrom(DesignShowcaseAtomicType.class) || designShowcaseAtomicType == null) {
                bundle.putParcelable("atomicType", (Parcelable) Parcelable.class.cast(designShowcaseAtomicType));
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(DesignShowcaseAtomicType.class)) {
                throw new UnsupportedOperationException(DesignShowcaseAtomicType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("atomicType", (Serializable) Serializable.class.cast(designShowcaseAtomicType));
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m21246b() != null ? m21246b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionDesignShowcaseMenuToAtomicGallery(actionId=" + mo19186a() + "){atomicType=" + m21246b() + "}";
        }

        private a() {
            this.f25880a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.a$b */
    public static class b implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f25881a;

        public /* synthetic */ b(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38188b.f163507b;
        }

        /* JADX INFO: renamed from: b */
        public DesignShowcaseGalleryType m21248b() {
            return (DesignShowcaseGalleryType) this.f25881a.get("galleryType");
        }

        /* JADX INFO: renamed from: c */
        public b m21249c(DesignShowcaseGalleryType designShowcaseGalleryType) {
            if (designShowcaseGalleryType == null) {
                throw new IllegalArgumentException("Argument \"galleryType\" is marked as non-null but was passed a null value.");
            }
            this.f25881a.put("galleryType", designShowcaseGalleryType);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25881a.containsKey("galleryType") != bVar.f25881a.containsKey("galleryType")) {
                return false;
            }
            if (m21248b() == null ? bVar.m21248b() == null : m21248b().equals(bVar.m21248b())) {
                return mo19186a() == bVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (!this.f25881a.containsKey("galleryType")) {
                bundle.putSerializable("galleryType", DesignShowcaseGalleryType.PARTICLE_COLOR);
                return bundle;
            }
            DesignShowcaseGalleryType designShowcaseGalleryType = (DesignShowcaseGalleryType) this.f25881a.get("galleryType");
            if (Parcelable.class.isAssignableFrom(DesignShowcaseGalleryType.class) || designShowcaseGalleryType == null) {
                bundle.putParcelable("galleryType", (Parcelable) Parcelable.class.cast(designShowcaseGalleryType));
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(DesignShowcaseGalleryType.class)) {
                throw new UnsupportedOperationException(DesignShowcaseGalleryType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("galleryType", (Serializable) Serializable.class.cast(designShowcaseGalleryType));
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m21248b() != null ? m21248b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionDesignShowcaseMenuToGallery(actionId=" + mo19186a() + "){galleryType=" + m21248b() + "}";
        }

        private b() {
            this.f25881a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.menu.view.fragment.a$c */
    public static class c implements InterfaceC12981p0 {

        /* JADX INFO: renamed from: a */
        private final HashMap f25882a;

        public /* synthetic */ c(int i13) {
            this();
        }

        @Override // p114eb.InterfaceC12981p0
        /* JADX INFO: renamed from: a */
        public int mo19186a() {
            return AbstractC38188b.f163509d;
        }

        /* JADX INFO: renamed from: b */
        public DesignShowcaseMenuType m21250b() {
            return (DesignShowcaseMenuType) this.f25882a.get("menuType");
        }

        /* JADX INFO: renamed from: c */
        public c m21251c(DesignShowcaseMenuType designShowcaseMenuType) {
            if (designShowcaseMenuType == null) {
                throw new IllegalArgumentException("Argument \"menuType\" is marked as non-null but was passed a null value.");
            }
            this.f25882a.put("menuType", designShowcaseMenuType);
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f25882a.containsKey("menuType") != cVar.f25882a.containsKey("menuType")) {
                return false;
            }
            if (m21250b() == null ? cVar.m21250b() == null : m21250b().equals(cVar.m21250b())) {
                return mo19186a() == cVar.mo19186a();
            }
            return false;
        }

        @Override // p114eb.InterfaceC12981p0
        public Bundle getArguments() {
            Bundle bundle = new Bundle();
            if (!this.f25882a.containsKey("menuType")) {
                bundle.putSerializable("menuType", DesignShowcaseMenuType.ROOT);
                return bundle;
            }
            DesignShowcaseMenuType designShowcaseMenuType = (DesignShowcaseMenuType) this.f25882a.get("menuType");
            if (Parcelable.class.isAssignableFrom(DesignShowcaseMenuType.class) || designShowcaseMenuType == null) {
                bundle.putParcelable("menuType", (Parcelable) Parcelable.class.cast(designShowcaseMenuType));
                return bundle;
            }
            if (!Serializable.class.isAssignableFrom(DesignShowcaseMenuType.class)) {
                throw new UnsupportedOperationException(DesignShowcaseMenuType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("menuType", (Serializable) Serializable.class.cast(designShowcaseMenuType));
            return bundle;
        }

        public int hashCode() {
            return mo19186a() + (((m21250b() != null ? m21250b().hashCode() : 0) + 31) * 31);
        }

        public String toString() {
            return "ActionDesignShowcaseMenuToMenu(actionId=" + mo19186a() + "){menuType=" + m21250b() + "}";
        }

        private c() {
            this.f25882a = new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static a m21242a() {
        return new a(0);
    }

    /* JADX INFO: renamed from: b */
    public static b m21243b() {
        return new b(0);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC12981p0 m21244c() {
        return new C12938a(AbstractC38188b.f163508c);
    }

    /* JADX INFO: renamed from: d */
    public static c m21245d() {
        return new c(0);
    }
}
