package dd1;

import com.whoop.design.showcase.navigation.DesignShowcaseAtomicType;
import com.whoop.design.showcase.navigation.DesignShowcaseGalleryType;
import com.whoop.design.showcase.navigation.DesignShowcaseNavigationEvent;
import ed1.C13113b;
import java.util.List;
import n91.AbstractC26477b;
import p715kotlin.Metadata;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: dd1.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "Lm91/u;", "a", "()Ljava/util/List;", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11948b {
    /* JADX INFO: renamed from: a */
    public static final List<InterfaceC25312u> m32279a() {
        C13113b c13113bM32943b = AbstractC11964r.m32943b("Alternative", AbstractC11964r.m32944c(DesignShowcaseAtomicType.ALTERNATIVE_BUTTON), null, 4, null);
        C13113b c13113bM32943b2 = AbstractC11964r.m32943b("Card", AbstractC11964r.m32944c(DesignShowcaseAtomicType.CARD_BUTTON), null, 4, null);
        DesignShowcaseNavigationEvent.PresentAtomicGallery presentAtomicGalleryM32944c = AbstractC11964r.m32944c(DesignShowcaseAtomicType.CARD_ICON_BUTTON);
        C11952f c11952f = C11952f.f39154a;
        return AbstractC26477b.m78414b(c13113bM32943b, c13113bM32943b2, AbstractC11964r.m32942a("Card Icon", presentAtomicGalleryM32944c, c11952f.m32461c()), AbstractC11964r.m32943b("Icon", AbstractC11964r.m32945d(DesignShowcaseGalleryType.ATOM_BUTTON_ICON), null, 4, null), AbstractC11964r.m32943b("Icon Toggle", AbstractC11964r.m32944c(DesignShowcaseAtomicType.ICON_TOGGLE_BUTTON), null, 4, null), AbstractC11964r.m32942a("Multiple Button Container", AbstractC11964r.m32944c(DesignShowcaseAtomicType.MULTIPLE_BUTTON_CONTAINER), c11952f.m32462d()), AbstractC11964r.m32943b("Primary", AbstractC11964r.m32944c(DesignShowcaseAtomicType.PRIMARY_BUTTON), null, 4, null), AbstractC11964r.m32943b("Radio", AbstractC11964r.m32944c(DesignShowcaseAtomicType.RADIO_BUTTON), null, 4, null), AbstractC11964r.m32943b("Secondary", AbstractC11964r.m32944c(DesignShowcaseAtomicType.SECONDARY_BUTTON), null, 4, null), AbstractC11964r.m32943b("Share", AbstractC11964r.m32944c(DesignShowcaseAtomicType.SHARE_BUTTON), null, 4, null), AbstractC11964r.m32943b("State", AbstractC11964r.m32944c(DesignShowcaseAtomicType.STATE_BUTTON), null, 4, null), AbstractC11964r.m32943b("Toggle", AbstractC11964r.m32944c(DesignShowcaseAtomicType.TOGGLE_BUTTON), null, 4, null)).mo78412a();
    }
}
