package hg0;

import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.AdvanceLabsUpdateTestsStickyModel;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsModels;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsSectionModel;
import com.whoop.advancedlabsjoin.feature.updatetests.domain.models.UpdateTestsSectionSpacingType;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import dg0.C12005c;
import dg0.InterfaceC12003a;
import gg0.C15824c;
import gg0.InterfaceC15822a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import q31.C29943a;
import q31.C29948f;

/* JADX INFO: renamed from: hg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\n*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015*\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"¨\u0006#"}, m65681d2 = {"Lhg0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Ldg0/a$b;", "", "source", "testCount", "Lgg0/c;", "e", "(Ldg0/a$b;Ljava/lang/String;Ljava/lang/String;)Lgg0/c;", "Ldg0/a$e;", "Lgg0/c$e;", "d", "(Ldg0/a$e;)Lgg0/c$e;", "Ldg0/c;", "dialog", "f", "(Ldg0/c;Lgg0/c$e;)Lgg0/c;", "", "Lcom/whoop/design/models/DesignSystemModel;", "models", "Lm91/u;", "a", "(Ldg0/c;Ljava/util/List;)Ljava/util/List;", "spacing", "Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;", "b", "(Ljava/lang/String;)Lcom/whoop/advancedlabsjoin/feature/updatetests/domain/models/UpdateTestsSectionSpacingType;", "domainResult", "c", "(Ldg0/c;)Lgg0/c;", "Ljb1/a;", "advanced-labs-join_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17254a {

    /* JADX INFO: renamed from: b */
    public static final int f66281b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C17254a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC25312u> m48824a(C12005c c12005c, List<? extends DesignSystemModel> list) {
        List<InterfaceC25312u> listM60540g = this.reducer.m60540g(list);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
        for (Object objM91609b : listM60540g) {
            if (objM91609b instanceof C29948f) {
                C29948f c29948f = (C29948f) objM91609b;
                Iterator<C29943a> it = c29948f.m91612e().iterator();
                int initiallySelectedSegmentIndex = 0;
                while (true) {
                    if (!it.hasNext()) {
                        initiallySelectedSegmentIndex = -1;
                        break;
                    }
                    if (AbstractC22676k.m65745e(it.next().getId(), c12005c.getSelectedSegmentId())) {
                        break;
                    }
                    initiallySelectedSegmentIndex++;
                }
                if (initiallySelectedSegmentIndex < 0) {
                    initiallySelectedSegmentIndex = c29948f.getInitiallySelectedSegmentIndex();
                }
                objM91609b = C29948f.m91609b(c29948f, null, null, initiallySelectedSegmentIndex, null, false, 27, null);
            }
            arrayList.add(objM91609b);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    private final UpdateTestsSectionSpacingType m48825b(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return UpdateTestsSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? UpdateTestsSectionSpacingType.COMPACT : UpdateTestsSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: d */
    private final C15824c.e m48826d(InterfaceC12003a.e eVar) {
        UpdateTestsSectionSpacingType updateTestsSectionSpacingTypeM48825b;
        if (!(eVar instanceof InterfaceC12003a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC12003a.a aVar = (InterfaceC12003a.a) eVar;
        String id4 = aVar.getDialogData().getId();
        TextResource title = aVar.getDialogData().getTitle();
        List<UpdateTestsSectionModel> sections = aVar.getDialogData().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (UpdateTestsSectionModel updateTestsSectionModel : sections) {
            String sectionType = updateTestsSectionModel.getSectionType();
            if (sectionType == null || (updateTestsSectionSpacingTypeM48825b = m48825b(sectionType)) == null) {
                updateTestsSectionSpacingTypeM48825b = UpdateTestsSectionSpacingType.COMPACT;
            }
            arrayList.add(new C15824c.a(this.reducer.m60540g(updateTestsSectionModel.getItems()), updateTestsSectionSpacingTypeM48825b));
        }
        return new C15824c.e(id4, title, arrayList);
    }

    /* JADX INFO: renamed from: e */
    private final C15824c m48827e(InterfaceC12003a.b bVar, String str, String str2) {
        if (bVar instanceof InterfaceC12003a.c) {
            return new C15824c(null, new C15824c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC12003a.d) {
            return new C15824c(null, new C15824c.b(C33205o0.f138451a.m105289c(), new InterfaceC15822a.i(str, str2), null, InterfaceC15822a.f.f59725a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC12003a.f) {
            return new C15824c(null, new C15824c.b(C33205o0.f138451a.m105291e(), new InterfaceC15822a.i(str, str2), null, InterfaceC15822a.f.f59725a, 4, null), null, 5, null);
        }
        if (bVar instanceof InterfaceC12003a.g) {
            return new C15824c(null, new C15824c.b(C33205o0.f138451a.m105292f(), InterfaceC15822a.f.f59725a, null, null, 12, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX INFO: renamed from: f */
    private final C15824c m48828f(C12005c c12005c, C15824c.e eVar) {
        TextResource textResourceM21267a;
        ?? arrayList;
        List<UpdateTestsSectionModel> sections;
        UpdateTestsSectionSpacingType updateTestsSectionSpacingTypeM48825b;
        String toolBarTitle;
        Map<String, AdvanceLabsUpdateTestsStickyModel> bottomStickyItems;
        UpdateTestsModels response = c12005c.getResponse();
        AdvanceLabsUpdateTestsStickyModel advanceLabsUpdateTestsStickyModel = (response == null || (bottomStickyItems = response.getBottomStickyItems()) == null) ? null : bottomStickyItems.get(c12005c.getSelectedSegmentId());
        C15824c.d dVar = advanceLabsUpdateTestsStickyModel != null ? new C15824c.d(advanceLabsUpdateTestsStickyModel.getText(), m48824a(c12005c, advanceLabsUpdateTestsStickyModel.getItems())) : null;
        UpdateTestsModels response2 = c12005c.getResponse();
        if (response2 == null || (toolBarTitle = response2.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        UpdateTestsModels response3 = c12005c.getResponse();
        if (response3 == null || (sections = response3.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<UpdateTestsSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (UpdateTestsSectionModel updateTestsSectionModel : list) {
                String sectionType = updateTestsSectionModel.getSectionType();
                if (sectionType == null || (updateTestsSectionSpacingTypeM48825b = m48825b(sectionType)) == null) {
                    updateTestsSectionSpacingTypeM48825b = UpdateTestsSectionSpacingType.COMPACT;
                }
                arrayList.add(new C15824c.a(m48824a(c12005c, updateTestsSectionModel.getItems()), updateTestsSectionSpacingTypeM48825b));
            }
        }
        return new C15824c(eVar, null, new C15824c.c(textResource, arrayList, !c12005c.getManualRefresh() && c12005c.getDisplayRefreshingSpinner(), dVar, c12005c.getSelectedSegmentId(), c12005c.getSource(), c12005c.getInitialSelectedSegmentId()), 2, null);
    }

    /* JADX INFO: renamed from: c */
    public final C15824c m48829c(C12005c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        InterfaceC12003a currentDialogType = domainResult.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC12003a.b) {
            return m48827e((InterfaceC12003a.b) domainResult.getCurrentDialogType(), domainResult.getSource(), domainResult.getSelectedSegmentId());
        }
        return currentDialogType instanceof InterfaceC12003a.e ? m48828f(domainResult, m48826d((InterfaceC12003a.e) domainResult.getCurrentDialogType())) : m48828f(domainResult, null);
    }

    public /* synthetic */ C17254a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC17255b.f66283a : c21535a);
    }
}
