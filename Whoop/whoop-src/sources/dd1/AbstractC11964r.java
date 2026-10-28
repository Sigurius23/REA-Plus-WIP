package dd1;

import c93.InterfaceC4351m;
import com.whoop.design.showcase.navigation.DesignShowcaseAtomicType;
import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import com.whoop.design.showcase.navigation.DesignShowcaseNavigationEvent;
import ed1.C13113b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dd1.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"", "text", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;", "navigationEvent", "Lkotlin/Function0;", "Ll83/a0;", "preview", "Led1/b;", "a", "(Ljava/lang/String;Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent;Lc93/m;)Led1/b;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "menuType", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;", "f", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentMenu;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;", "galleryType", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;", "d", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseGalleryType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;", "e", "()Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentLegacyGallery;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;", "atomicType", "Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;", "c", "(Lcom/whoop/design/showcase/navigation/DesignShowcaseAtomicType;)Lcom/whoop/design/showcase/navigation/DesignShowcaseNavigationEvent$PresentAtomicGallery;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11964r {
    /* JADX INFO: renamed from: a */
    public static final C13113b m32942a(String text, DesignShowcaseNavigationEvent navigationEvent, InterfaceC4351m interfaceC4351m) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(navigationEvent, "navigationEvent");
        return new C13113b(text, navigationEvent, null, "", false, interfaceC4351m, 20, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13113b m32943b(String str, DesignShowcaseNavigationEvent designShowcaseNavigationEvent, InterfaceC4351m interfaceC4351m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        if ((i13 & 2) != 0) {
            designShowcaseNavigationEvent = new DesignShowcaseNavigationEvent.PresentGallery(null, 1, null);
        }
        if ((i13 & 4) != 0) {
            interfaceC4351m = null;
        }
        return m32942a(str, designShowcaseNavigationEvent, interfaceC4351m);
    }

    /* JADX INFO: renamed from: c */
    public static final DesignShowcaseNavigationEvent.PresentAtomicGallery m32944c(DesignShowcaseAtomicType atomicType) {
        AbstractC22676k.m65750j(atomicType, "atomicType");
        return new DesignShowcaseNavigationEvent.PresentAtomicGallery(atomicType);
    }

    /* JADX INFO: renamed from: d */
    public static final DesignShowcaseNavigationEvent.PresentGallery m32945d(DesignShowcaseGalleryType galleryType) {
        AbstractC22676k.m65750j(galleryType, "galleryType");
        return new DesignShowcaseNavigationEvent.PresentGallery(galleryType);
    }

    /* JADX INFO: renamed from: e */
    public static final DesignShowcaseNavigationEvent.PresentLegacyGallery m32946e() {
        return DesignShowcaseNavigationEvent.PresentLegacyGallery.f25885a;
    }

    /* JADX INFO: renamed from: f */
    public static final DesignShowcaseNavigationEvent.PresentMenu m32947f(DesignShowcaseMenuType menuType) {
        AbstractC22676k.m65750j(menuType, "menuType");
        return new DesignShowcaseNavigationEvent.PresentMenu(menuType);
    }
}
