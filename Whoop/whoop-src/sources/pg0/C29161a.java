package pg0;

import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementModels;
import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementSectionModel;
import com.whoop.advancedlabsmanagement.domain.models.AdvancedLabsManagementSectionSpacingType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import lg0.C24030c;
import lg0.InterfaceC24028a;
import m83.AbstractC25267u;
import m83.C25271y;
import og0.C27917c;
import og0.InterfaceC27915a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.C33205o0;

/* JADX INFO: renamed from: pg0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u0007*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lpg0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Llg0/a$a;", "Log0/c;", "c", "(Llg0/a$a;)Log0/c;", "Llg0/c;", "Log0/c$a;", "dialog", "d", "(Llg0/c;Log0/c$a;)Log0/c;", "", "spacing", "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;", "a", "(Ljava/lang/String;)Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;", "domainResult", "b", "(Llg0/c;)Log0/c;", "Ljb1/a;", "advanced-labs-management_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29161a {

    /* JADX INFO: renamed from: b */
    public static final int f118022b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C29161a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final AdvancedLabsManagementSectionSpacingType m88600a(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return AdvancedLabsManagementSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? AdvancedLabsManagementSectionSpacingType.COMPACT : AdvancedLabsManagementSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: c */
    private final C27917c m88601c(InterfaceC24028a.a aVar) {
        if (aVar instanceof InterfaceC24028a.b) {
            return new C27917c(null, new C27917c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC24028a.c) {
            return new C27917c(null, new C27917c.c(C33205o0.f138451a.m105289c(), InterfaceC27915a.h.f112520a, null, InterfaceC27915a.e.f112517a, 4, null), null, 5, null);
        }
        if (aVar instanceof InterfaceC24028a.d) {
            return new C27917c(null, new C27917c.c(C33205o0.f138451a.m105291e(), InterfaceC27915a.h.f112520a, null, InterfaceC27915a.e.f112517a, 4, null), null, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    private final C27917c m88602d(C24030c c24030c, C27917c.a aVar) {
        ?? arrayList;
        TextResource textResourceM21267a;
        String toolBarTitle;
        List<AdvancedLabsManagementSectionModel> sections;
        AdvancedLabsManagementSectionSpacingType advancedLabsManagementSectionSpacingTypeM88600a;
        AdvancedLabsManagementModels response = c24030c.getResponse();
        if (response == null || (sections = response.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<AdvancedLabsManagementSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (AdvancedLabsManagementSectionModel advancedLabsManagementSectionModel : list) {
                String insetBottom = advancedLabsManagementSectionModel.getInsetBottom();
                if (insetBottom == null || (advancedLabsManagementSectionSpacingTypeM88600a = m88600a(insetBottom)) == null) {
                    advancedLabsManagementSectionSpacingTypeM88600a = AdvancedLabsManagementSectionSpacingType.COMPACT;
                }
                arrayList.add(new C27917c.b(this.reducer.m60540g(advancedLabsManagementSectionModel.getItems()), advancedLabsManagementSectionSpacingTypeM88600a));
            }
        }
        AdvancedLabsManagementModels response2 = c24030c.getResponse();
        if (response2 == null || (toolBarTitle = response2.getToolBarTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(toolBarTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        return new C27917c(aVar, null, new C27917c.d(textResourceM21267a, arrayList), 2, null);
    }

    /* JADX INFO: renamed from: b */
    public final C27917c m88603b(C24030c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC24028a.a ? m88601c((InterfaceC24028a.a) domainResult.getCurrentDialogType()) : m88602d(domainResult, null);
    }

    public /* synthetic */ C29161a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC29162b.f118024a : c21535a);
    }
}
