package dy0;

import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.deepdive.domain.models.DeepDiveHeaderModel;
import com.whoop.deepdive.domain.models.DeepDiveModels;
import com.whoop.deepdive.domain.models.DeepDiveSectionModel;
import com.whoop.deepdive.domain.models.DeepDiveSectionSpacingType;
import com.whoop.deepdive.domain.models.MetaData;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import cy0.C11184c;
import cy0.InterfaceC11182a;
import ep0.C13404j;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import tu1.C34188a;
import wb3.AbstractC37056f;
import wx0.AbstractC37682a;
import zx0.C41205c;
import zx0.InterfaceC41203a;

/* JADX INFO: renamed from: dy0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Ldy0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lzx0/a$c;", "Lcy0/c;", "f", "(Lzx0/a$c;)Lcy0/c;", "Lzx0/a$a;", "Ltu1/a;", "e", "(Lzx0/a$a;)Ltu1/a;", "Lzx0/c;", "bottomSheet", "g", "(Lzx0/c;Ltu1/a;)Lcy0/c;", "Lcy0/c$b;", "d", "(Lzx0/c;)Lcy0/c$b;", "", "spacing", "Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;", "b", "(Ljava/lang/String;)Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;", "Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;", "", "sections", "", "index", "", "a", "(Lcom/whoop/deepdive/domain/models/DeepDiveSectionModel;Ljava/util/List;I)Z", "domainResult", "c", "(Lzx0/c;)Lcy0/c;", "Ljb1/a;", "getReducer$deep_dive_release", "()Ljb1/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12442a {

    /* JADX INFO: renamed from: b */
    public static final int f42384b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C12442a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[EDGE_INSN: B:17:0x0041->B:18:0x0042 BREAK  A[LOOP:0: B:12:0x002f->B:25:?]] */
    /* JADX INFO: renamed from: a */
    private final boolean m34997a(DeepDiveSectionModel deepDiveSectionModel, List<DeepDiveSectionModel> list, int i13) {
        boolean z4;
        List<DesignSystemModel> items;
        boolean z13 = AbstractC25265s.m74114R0(deepDiveSectionModel.getItems()) instanceof InfoCalloutTileModel;
        DeepDiveSectionModel deepDiveSectionModel2 = (DeepDiveSectionModel) AbstractC25265s.m74102I0(i13 + 1, list);
        if (deepDiveSectionModel2 != null && (items = deepDiveSectionModel2.getItems()) != null) {
            List<DesignSystemModel> list2 = items;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    }
                    if (((DesignSystemModel) it.next()) instanceof InfoCalloutTileModel) {
                        z4 = true;
                        break;
                    }
                }
            } else {
                z4 = false;
                break;
            }
        } else {
            z4 = false;
            break;
        }
        return z13 || z4;
    }

    /* JADX INFO: renamed from: b */
    private final DeepDiveSectionSpacingType m34998b(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -1986416409) {
            if (iHashCode != 2402104) {
                if (iHashCode == 1668466435 && upperCase.equals("COMPACT")) {
                    return DeepDiveSectionSpacingType.COMPACT;
                }
            } else if (upperCase.equals("NONE")) {
                return DeepDiveSectionSpacingType.NONE;
            }
        } else if (upperCase.equals("NORMAL")) {
            return DeepDiveSectionSpacingType.NORMAL;
        }
        return DeepDiveSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: d */
    private final C11184c.b m34999d(C41205c c41205c) {
        C9598e c9598e;
        String deepDiveScoreType;
        DeepDiveHeaderModel header;
        DeepDiveHeaderModel header2;
        DeepDiveHeaderModel header3;
        DesignSystemModel endItem;
        DeepDiveHeaderModel header4;
        DeepDiveHeaderModel header5;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_BACKWARD;
        DeepDiveModels response = c41205c.getResponse();
        TextResource textResourceM21278l = AbstractC8693b.m21278l((response == null || (header5 = response.getHeader()) == null) ? null : header5.getTitle());
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37682a.f161445a);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC37682a.f161446b);
        DeepDiveModels response2 = c41205c.getResponse();
        EnumC16313m0 enumC16313m0M46378c = AbstractC16315n0.m46378c((response2 == null || (header4 = response2.getHeader()) == null) ? null : header4.getEndIcon(), EnumC16313m0.EDUCATION);
        DeepDiveModels response3 = c41205c.getResponse();
        InterfaceC25312u interfaceC25312uM60544l = (response3 == null || (header3 = response3.getHeader()) == null || (endItem = header3.getEndItem()) == null) ? null : this.reducer.m60544l(endItem);
        InterfaceC11182a.e eVar = InterfaceC11182a.e.f35808a;
        DeepDiveModels response4 = c41205c.getResponse();
        if (response4 == null || (header2 = response4.getHeader()) == null || (c9598e = header2.getDestination()) == null) {
            c9598e = new C9598e(null, null, null, 7, null);
        }
        DeepDiveModels response5 = c41205c.getResponse();
        if (response5 == null || (header = response5.getHeader()) == null || (deepDiveScoreType = header.getDeepDiveScoreType()) == null) {
            deepDiveScoreType = "";
        }
        return new C11184c.b(enumC16313m0, textResourceM21278l, c8688bM21277k, c8688bM21277k2, enumC16313m0M46378c, interfaceC25312uM60544l, eVar, new InterfaceC11182a.c(c9598e, deepDiveScoreType, null));
    }

    /* JADX INFO: renamed from: e */
    private final C34188a m35000e(InterfaceC41203a.a aVar) {
        if (aVar instanceof InterfaceC41203a.b) {
            return ((InterfaceC41203a.b) aVar).getState();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    private final C11184c m35001f(InterfaceC41203a.c cVar) {
        if (cVar instanceof InterfaceC41203a.d) {
            return new C11184c(null, new C11184c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (cVar instanceof InterfaceC41203a.e) {
            InterfaceC41203a.e eVar = (InterfaceC41203a.e) cVar;
            return new C11184c(null, new C11184c.c(C33205o0.f138451a.m105289c(), new InterfaceC11182a.h(eVar.getPillar(), eVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, 4, null), null, InterfaceC11182a.e.f35808a, 4, null), null, 5, null);
        }
        if (!(cVar instanceof InterfaceC41203a.f)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC41203a.f fVar = (InterfaceC41203a.f) cVar;
        return new C11184c(null, new C11184c.c(C33205o0.f138451a.m105291e(), new InterfaceC11182a.h(fVar.getPillar(), fVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, 4, null), null, InterfaceC11182a.e.f35808a, 4, null), null, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    private final C11184c m35002g(C41205c c41205c, C34188a c34188a) {
        String deepDiveScoreType;
        ?? arrayList;
        MetaData metadata;
        AiContextMetadata aiContextMetadata;
        List<DeepDiveSectionModel> sections;
        DeepDiveSectionSpacingType deepDiveSectionSpacingTypeM34998b;
        DeepDiveHeaderModel header;
        DeepDiveModels response = c41205c.getResponse();
        if (response == null || (header = response.getHeader()) == null || (deepDiveScoreType = header.getDeepDiveScoreType()) == null) {
            deepDiveScoreType = "";
        }
        String str = deepDiveScoreType;
        C11184c.b bVarM34999d = m34999d(c41205c);
        boolean isInHomeCalibrationExperimentTestGroup = c41205c.getIsInHomeCalibrationExperimentTestGroup();
        DeepDiveModels response2 = c41205c.getResponse();
        C13404j c13404jM18523a = null;
        if (response2 == null || (sections = response2.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<DeepDiveSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                DeepDiveSectionModel deepDiveSectionModel = (DeepDiveSectionModel) obj;
                String sectionType = deepDiveSectionModel.getSectionType();
                if (sectionType == null || (deepDiveSectionSpacingTypeM34998b = m34998b(sectionType)) == null) {
                    deepDiveSectionSpacingTypeM34998b = DeepDiveSectionSpacingType.COMPACT;
                }
                boolean zM34997a = m34997a(deepDiveSectionModel, c41205c.getResponse().getSections(), i13);
                if (zM34997a) {
                    deepDiveSectionSpacingTypeM34998b = DeepDiveSectionSpacingType.NONE;
                }
                arrayList.add(new C11184c.a(this.reducer.m60540g(deepDiveSectionModel.getItems()), deepDiveSectionSpacingTypeM34998b, zM34997a));
                i13 = i14;
            }
        }
        DeepDiveModels response3 = c41205c.getResponse();
        if (response3 != null && (metadata = response3.getMetadata()) != null && (aiContextMetadata = metadata.getAiContextMetadata()) != null) {
            c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
        }
        return new C11184c(c34188a, null, new C11184c.d(str, bVarM34999d, arrayList, isInHomeCalibrationExperimentTestGroup, c13404jM18523a), 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final C11184c m35003c(C41205c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC41203a currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC41203a.c) {
            return m35001f((InterfaceC41203a.c) domainResult.getCurrentDialogType());
        }
        return currentDialogType instanceof InterfaceC41203a.a ? m35002g(domainResult, m35000e((InterfaceC41203a.a) domainResult.getCurrentDialogType())) : m35002g(domainResult, null);
    }

    public /* synthetic */ C12442a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC12444c.m35010g() : c21535a);
    }
}
