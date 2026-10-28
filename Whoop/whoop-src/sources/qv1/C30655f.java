package qv1;

import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderStyle;
import com.whoop.design.models.items.ItemVisibilityStateEnum;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.comunityraf.CommunityRafModel;
import com.whoop.membership.comunityraf.RafItem;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import jb1.AbstractC21537c;
import n83.C26460c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: qv1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lqv1/f;", "", "<init>", "()V", "Lcom/whoop/membership/comunityraf/CommunityRafModel;", "Lqv1/h;", "b", "(Lcom/whoop/membership/comunityraf/CommunityRafModel;)Lqv1/h;", "Lqv1/c;", "result", "a", "(Lqv1/c;)Lqv1/h;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30655f {

    /* JADX INFO: renamed from: qv1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f126101a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f126102b;

        static {
            int[] iArr = new int[EnumC30658i.values().length];
            try {
                iArr[EnumC30658i.SUB_SECTION_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f126101a = iArr;
            int[] iArr2 = new int[EnumC30659j.values().length];
            try {
                iArr2[EnumC30659j.HIGHLIGHTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f126102b = iArr2;
        }
    }

    /* JADX INFO: renamed from: b */
    private final InterfaceC30657h m94221b(CommunityRafModel communityRafModel) {
        EnumC30658i enumC30658i;
        EnumC30659j enumC30659j;
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        String headerStyle = communityRafModel.getHeaderStyle();
        if (headerStyle == null) {
            headerStyle = "";
        }
        EnumC30658i enumC30658i2 = EnumC30658i.SECTION_HEADER;
        EnumC30658i[] enumC30658iArrValues = EnumC30658i.values();
        int length = enumC30658iArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC30658i = null;
                break;
            }
            enumC30658i = enumC30658iArrValues[i13];
            if (AbstractC22676k.m65745e(enumC30658i.name(), headerStyle)) {
                break;
            }
            i13++;
        }
        if (enumC30658i != null) {
            enumC30658i2 = enumC30658i;
        }
        if (a.f126101a[enumC30658i2.ordinal()] == 1) {
            c26460cM119000x.add(AbstractC21537c.m60555e(null, 1, null).m60541h(new HeaderModel("RafCommunityHeaderId", AbstractC8693b.m21278l(communityRafModel.getHeader()), (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, HeaderStyle.NONE, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32508, (DefaultConstructorMarker) null)));
        } else {
            c26460cM119000x.add(AbstractC21537c.m60555e(null, 1, null).m60541h(new HeaderModel("RafCommunityHeaderId", AbstractC8693b.m21278l(communityRafModel.getHeader()), (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, HeaderStyle.LARGE, "T1", (String) null, (String) null, false, (C9598e) null, (TextResource) null, 31996, (DefaultConstructorMarker) null)));
        }
        for (RafItem rafItem : communityRafModel.getItems()) {
            String menuItemStyle = rafItem.getMenuItemStyle();
            if (menuItemStyle == null) {
                menuItemStyle = "";
            }
            EnumC30659j enumC30659j2 = EnumC30659j.STANDARD;
            EnumC30659j[] enumC30659jArrValues = EnumC30659j.values();
            int length2 = enumC30659jArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC30659j = null;
                    break;
                }
                enumC30659j = enumC30659jArrValues[i14];
                if (AbstractC22676k.m65745e(enumC30659j.name(), menuItemStyle)) {
                    break;
                }
                i14++;
            }
            if (enumC30659j != null) {
                enumC30659j2 = enumC30659j;
            }
            c26460cM119000x.add(AbstractC21537c.m60555e(null, 1, null).m60541h(new MenuItemModel(rafItem.getTitle(), rafItem.getSubtitle(), (String) null, (String) null, rafItem.getIcon(), (String) null, (String) null, a.f126102b[enumC30659j2.ordinal()] == 1 ? "RAF_MENU_ITEM" : "OUTLINED", rafItem.getDestination(), (ItemVisibilityStateEnum) null, (GenericInteraction) null, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, (DefaultConstructorMarker) null)));
        }
        return new InterfaceC30657h.b(new C30656g(AbstractC37056f.m118988k(c26460cM119000x)));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC30657h m94222a(InterfaceC30652c result) {
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof InterfaceC30652c.b) {
            return m94221b(((InterfaceC30652c.b) result).getData());
        }
        if (result instanceof InterfaceC30652c.a) {
            return InterfaceC30657h.a.f126105a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
