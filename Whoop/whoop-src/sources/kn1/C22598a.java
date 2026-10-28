package kn1;

import an1.AbstractC1057a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.homecustomization.domain.legacy.models.CustomizeableKeyStatModel;
import e41.C12704i;
import e41.EnumC12706k;
import en1.AbstractC13366c;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn1.AbstractC21805d;
import jn1.C21802a;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kn1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lkn1/a;", "", "<init>", "()V", "Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;", "", "index", "", "isDraggable", "isOrderable", "minimumSelectedIndex", "Le41/i;", "a", "(Lcom/whoop/homecustomization/domain/legacy/models/CustomizeableKeyStatModel;IZZI)Le41/i;", "Len1/c;", "domainState", "Ljn1/d;", "b", "(Len1/c;)Ljn1/d;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22598a {
    /* JADX INFO: renamed from: a */
    private final C12704i m65530a(CustomizeableKeyStatModel customizeableKeyStatModel, int i13, boolean z4, boolean z13, int i14) {
        EnumC16313m0 enumC16313m0;
        String supportedTrendKey = customizeableKeyStatModel.getSupportedTrendKey();
        int i15 = 0;
        boolean z14 = (z4 && i13 < i14) || (!z13 && customizeableKeyStatModel.getToggledOn());
        String icon = customizeableKeyStatModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        while (true) {
            if (i15 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i15];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i15++;
        }
        return new C12704i(supportedTrendKey, null, z14, false, z4, z13, false, customizeableKeyStatModel.getToggledOn(), enumC16313m0 == null ? enumC16313m1 : enumC16313m0, null, AbstractC8693b.m21278l(customizeableKeyStatModel.getName()), EnumC12706k.NOT_EXPANDED, 586, null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C12704i m65531c(C22598a c22598a, CustomizeableKeyStatModel customizeableKeyStatModel, int i13, boolean z4, boolean z13, int i14, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z13 = true;
        }
        return c22598a.m65530a(customizeableKeyStatModel, i13, z4, z13, i14);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC21805d m65532b(AbstractC13366c domainState) {
        Object next;
        CustomizeableKeyStatModel customizeableKeyStatModel;
        TextResource textResourceM21278l;
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.equals(AbstractC13366c.b.f46728a)) {
            return AbstractC21805d.b.f84050a;
        }
        if (domainState.equals(AbstractC13366c.a.f46727a)) {
            return new AbstractC21805d.a(AbstractC8693b.m21277k(AbstractC1057a.f4130n), AbstractC8693b.m21277k(AbstractC1057a.f4132p), AbstractC8693b.m21277k(AbstractC1057a.f4120d));
        }
        if (!(domainState instanceof AbstractC13366c.c)) {
            if (domainState.equals(AbstractC13366c.d.f46739a)) {
                return AbstractC21805d.d.f84061a;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC13366c.c cVar = (AbstractC13366c.c) domainState;
        Iterator<T> it = cVar.m37644i().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((CustomizeableKeyStatModel) next).getToggledOn());
        CustomizeableKeyStatModel customizeableKeyStatModel2 = (CustomizeableKeyStatModel) next;
        if (customizeableKeyStatModel2 == null || (customizeableKeyStatModel = cVar.m37638c().get(0)) == null) {
            customizeableKeyStatModel = cVar.m37638c().get(1);
        }
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cVar.getGaugeExplainerDomainState().getDefaultStatLeftName());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(cVar.getGaugeExplainerDomainState().getDefaultStatRightName());
        if (customizeableKeyStatModel2 == null || (textResourceM21278l = AbstractC8693b.m21278l(customizeableKeyStatModel2.getShortName())) == null) {
            textResourceM21278l = AbstractC8693b.m21278l(cVar.m37638c().get(0).getShortName());
        }
        C21802a c21802a = new C21802a(textResourceM21278l2, textResourceM21278l3, textResourceM21278l, AbstractC8693b.m21278l(customizeableKeyStatModel.getShortName()));
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(cVar.getDescription());
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(cVar.getErrorMessage());
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l(cVar.getPinnedKeyStatsHeader());
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(cVar.getUnpinnedKeyStatsHeader());
        List<CustomizeableKeyStatModel> listM37644i = cVar.m37644i();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM37644i, 10));
        int i13 = 0;
        int i14 = 2;
        for (Object obj : listM37644i) {
            int i15 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            CustomizeableKeyStatModel customizeableKeyStatModel3 = (CustomizeableKeyStatModel) obj;
            if (customizeableKeyStatModel3.getToggledOn()) {
                i14--;
            }
            int i16 = i14;
            arrayList.add(m65530a(customizeableKeyStatModel3, i13, false, false, i16));
            i13 = i15;
            i14 = i16;
        }
        List<CustomizeableKeyStatModel> listM37638c = cVar.m37638c();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM37638c, 10));
        int i17 = 0;
        for (Object obj2 : listM37638c) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList2.add(m65531c(this, (CustomizeableKeyStatModel) obj2, i17, true, false, i14, 4, null));
            i17 = i18;
        }
        List<CustomizeableKeyStatModel> listM37645j = cVar.m37645j();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM37645j, 10));
        int i19 = 0;
        for (Object obj3 : listM37645j) {
            int i24 = i19 + 1;
            if (i19 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList3.add(m65531c(this, (CustomizeableKeyStatModel) obj3, i19, false, false, i14, 4, null));
            i19 = i24;
        }
        return new AbstractC21805d.c(c21802a, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, arrayList2, arrayList3, arrayList, cVar.getShouldShowError(), cVar.getIsProcessing());
    }
}
