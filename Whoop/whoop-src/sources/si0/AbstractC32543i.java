package si0;

import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FixedHeaderAlignment;
import com.whoop.design.models.items.GlowModel;
import com.whoop.design.models.items.NavigationBarFixedHeader;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarStyle;
import com.whoop.design.models.items.NavigationButtonModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.DismissEventModel;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import j02.AbstractC21170u;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.C31447f;
import ri0.C31450i;
import ri0.C31451j;
import ri0.InterfaceC31449h;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: si0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/models/items/NavigationBarModel;", "", "manualRefresh", "displayRefreshingSpinner", "Ljb1/a;", "reducer", "Lri0/f;", "a", "(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;)Lri0/f;", "Lcom/whoop/design/models/items/NavigationButtonModel;", "Lri0/h;", "c", "(Lcom/whoop/design/models/items/NavigationButtonModel;)Lri0/h;", "arch-v2_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32543i {
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX INFO: renamed from: a */
    public static final C31447f m101572a(NavigationBarModel navigationBarModel, boolean z4, boolean z13, C21535a reducer) {
        List<DesignSystemModel> fixedHeader;
        FixedHeaderAlignment alignment;
        AbstractC22676k.m65750j(navigationBarModel, "<this>");
        AbstractC22676k.m65750j(reducer, "reducer");
        String title = navigationBarModel.getTitle();
        if (title == null) {
            title = "";
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(title);
        String subtitle = navigationBarModel.getSubtitle();
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        EnumC16313m0 icon = navigationBarModel.getIcon();
        boolean z14 = !z4 && z13;
        NavigationButtonModel leftButton = navigationBarModel.getLeftButton();
        InterfaceC31449h interfaceC31449hM101574c = leftButton != null ? m101574c(leftButton) : null;
        NavigationButtonModel rightButton = navigationBarModel.getRightButton();
        InterfaceC31449h interfaceC31449hM101574c2 = rightButton != null ? m101574c(rightButton) : null;
        NavigationBarStyle style = navigationBarModel.getStyle();
        if (style == null) {
            style = NavigationBarStyle.NONE;
        }
        NavigationBarStyle navigationBarStyle = style;
        NavigationBarFixedHeader header = navigationBarModel.getHeader();
        if (header == null || (fixedHeader = header.getItems()) == null) {
            fixedHeader = navigationBarModel.getFixedHeader();
        } else {
            if (fixedHeader.isEmpty()) {
                fixedHeader = null;
            }
            if (fixedHeader == null) {
                fixedHeader = navigationBarModel.getFixedHeader();
            }
        }
        List listM60536k = fixedHeader != null ? C21535a.m60536k(reducer, fixedHeader, null, 2, null) : null;
        if (listM60536k == null) {
            listM60536k = C25271y.f99162w;
        }
        List list = listM60536k;
        NavigationBarFixedHeader header2 = navigationBarModel.getHeader();
        if (header2 == null || (alignment = header2.getAlignment()) == null) {
            alignment = FixedHeaderAlignment.LEADING;
        }
        return new C31447f(textResourceM21278l, textResourceM21278l2, icon, interfaceC31449hM101574c, interfaceC31449hM101574c2, z14, navigationBarStyle, list, alignment, navigationBarModel.getTag());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C31447f m101573b(NavigationBarModel navigationBarModel, boolean z4, boolean z13, C21535a c21535a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            c21535a = AbstractC32540f.m101561b();
        }
        return m101572a(navigationBarModel, z4, z13, c21535a);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC31449h m101574c(NavigationButtonModel navigationButtonModel) {
        AbstractC22676k.m65750j(navigationButtonModel, "<this>");
        String text = navigationButtonModel.getText();
        if (text != null && !AbstractC39414r.m125890i0(text)) {
            TextResource.C8691e c8691eM21279m = AbstractC8693b.m21279m(navigationButtonModel.getText());
            C9598e destination = navigationButtonModel.getDestination();
            Action action = navigationButtonModel.getAction();
            DismissEventModel dismissEvent = navigationButtonModel.getDismissEvent();
            return new C31451j(c8691eM21279m, destination, action, dismissEvent != null ? AbstractC21170u.m59413a(dismissEvent) : null, navigationButtonModel.getDismissModal(), navigationButtonModel.getAnalyticEvent());
        }
        EnumC16313m0 icon = navigationButtonModel.getIcon();
        String iconUrl = navigationButtonModel.getIconUrl();
        AbstractC22403o.c cVar = iconUrl != null ? new AbstractC22403o.c(iconUrl, navigationButtonModel.getIcon().toWhoopIcon(), navigationButtonModel.getIcon().toWhoopIcon(), 0, 8, null) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(navigationButtonModel.getContentDescription());
        GlowModel glow = navigationButtonModel.getGlow();
        GlowStyle style = glow != null ? glow.getStyle() : null;
        GlowModel glow2 = navigationButtonModel.getGlow();
        boolean doesPulse = glow2 != null ? glow2.getDoesPulse() : false;
        C9598e destination2 = navigationButtonModel.getDestination();
        Action action2 = navigationButtonModel.getAction();
        DismissEventModel dismissEvent2 = navigationButtonModel.getDismissEvent();
        return new C31450i(icon, cVar, textResourceM21278l, style, doesPulse, destination2, action2, dismissEvent2 != null ? AbstractC21170u.m59413a(dismissEvent2) : null, navigationButtonModel.getDismissModal(), navigationButtonModel.getAnalyticEvent());
    }
}
