package hh1;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.gifting.feature.gifted.domain.models.GiftedModels;
import com.whoop.gifting.feature.gifted.domain.models.GiftedSectionModel;
import com.whoop.gifting.feature.gifted.domain.models.GiftedSectionSpacingType;
import com.whoop.gifting.feature.gifted.domain.models.GiftedStickyModel;
import dh1.C12045c;
import dh1.InterfaceC12043a;
import gh1.C15854d;
import gh1.EnumC15851a;
import gh1.InterfaceC15852b;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22974l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33205o0;

/* JADX INFO: renamed from: hh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u0007*\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lhh1/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Ldh1/c;", "Lgh1/d;", "b", "(Ldh1/c;)Lgh1/d;", "Lgh1/d$c;", "dialog", "c", "(Ldh1/c;Lgh1/d$c;)Lgh1/d;", "domainResult", "a", "Ljb1/a;", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17288a {

    /* JADX INFO: renamed from: b */
    public static final int f66455b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C17288a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: b */
    private final C15854d m48964b(C12045c c12045c) {
        String giftCode = c12045c.getGiftCode();
        if (giftCode == null) {
            giftCode = "";
        }
        InterfaceC12043a currentDialogType = c12045c.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC12043a.b) {
            return new C15854d(null, new C15854d.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (currentDialogType instanceof InterfaceC12043a.c) {
            return new C15854d(null, new C15854d.b(C33205o0.f138451a.m105289c(), new InterfaceC15852b.i(giftCode), null, InterfaceC15852b.d.f59874a, 4, null), null, 5, null);
        }
        if (currentDialogType instanceof InterfaceC12043a.d) {
            return new C15854d(null, new C15854d.b(C33205o0.f138451a.m105291e(), new InterfaceC15852b.i(giftCode), null, InterfaceC15852b.d.f59874a, 4, null), null, 5, null);
        }
        return currentDialogType instanceof InterfaceC12043a.e ? new C15854d(null, new C15854d.b(C33205o0.f138451a.m105293g(), null, null, null, 14, null), null, 5, null) : new C15854d(null, new C15854d.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX INFO: renamed from: c */
    private final C15854d m48965c(C12045c c12045c, C15854d.c cVar) {
        InterfaceC22974l interfaceC22974l;
        Map mapM48971e;
        TextResource textResourceM21267a;
        ?? arrayList;
        List<GiftedSectionModel> sections;
        Iterator it;
        GiftedSectionSpacingType giftedSectionSpacingType;
        String toolBarTitle;
        GiftedModels response = c12045c.getResponse();
        String alignment = response != null ? response.getAlignment() : null;
        if (alignment == null) {
            alignment = "";
        }
        Locale locale = Locale.ROOT;
        String upperCase = alignment.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("BOTTOM")) {
            interfaceC22974l = AbstractC22977m.f90653d;
        } else {
            interfaceC22974l = upperCase.equals("CENTER") ? AbstractC22977m.f90654e : AbstractC22977m.f90652c;
        }
        InterfaceC22974l interfaceC22974l2 = interfaceC22974l;
        GiftedModels response2 = c12045c.getResponse();
        String style = response2 != null ? response2.getStyle() : null;
        if (style == null) {
            style = "";
        }
        EnumC15851a enumC15851a = AbstractC17176i.m48520v(style, locale, "toUpperCase(...)", "ADVANCED_LABS") ? EnumC15851a.ADVANCED_LABS : EnumC15851a.DEFAULT;
        GiftedModels response3 = c12045c.getResponse();
        GiftedStickyModel bottomStickyItems = response3 != null ? response3.getBottomStickyItems() : null;
        C15854d.e eVar = bottomStickyItems != null ? new C15854d.e(bottomStickyItems.getText(), this.reducer.m60540g(bottomStickyItems.getItems())) : null;
        GiftedModels response4 = c12045c.getResponse();
        if (response4 == null || (mapM48971e = AbstractC17289b.m48971e(response4)) == null) {
            mapM48971e = C25272z.f99163w;
        }
        Map map = mapM48971e;
        GiftedModels response5 = c12045c.getResponse();
        if (response5 == null || (toolBarTitle = response5.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        GiftedModels response6 = c12045c.getResponse();
        if (response6 == null || (sections = response6.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<GiftedSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                GiftedSectionModel giftedSectionModel = (GiftedSectionModel) it3.next();
                String sectionType = giftedSectionModel.getSectionType();
                if (sectionType == null) {
                    sectionType = "";
                }
                String upperCase2 = sectionType.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                GiftedSectionSpacingType giftedSectionSpacingType2 = GiftedSectionSpacingType.COMPACT;
                GiftedSectionSpacingType[] giftedSectionSpacingTypeArrValues = GiftedSectionSpacingType.values();
                int length = giftedSectionSpacingTypeArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        it = it3;
                        giftedSectionSpacingType = null;
                        break;
                    }
                    giftedSectionSpacingType = giftedSectionSpacingTypeArrValues[i13];
                    it = it3;
                    if (AbstractC22676k.m65745e(giftedSectionSpacingType.name(), upperCase2)) {
                        break;
                    }
                    i13++;
                    it3 = it;
                }
                if (giftedSectionSpacingType != null) {
                    giftedSectionSpacingType2 = giftedSectionSpacingType;
                }
                arrayList.add(new C15854d.a(this.reducer.m60540g(giftedSectionModel.getItems()), giftedSectionSpacingType2));
                it3 = it;
            }
        }
        return new C15854d(cVar, null, new C15854d.d(textResource, arrayList, !c12045c.getManualRefresh() && c12045c.getDisplayRefreshingSpinner(), interfaceC22974l2, enumC15851a, eVar, map), 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final C15854d m48966a(C12045c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC12043a.a ? m48964b(domainResult) : m48965c(domainResult, null);
    }

    public /* synthetic */ C17288a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC17289b.f66457a : c21535a);
    }
}
