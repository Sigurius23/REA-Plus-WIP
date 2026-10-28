package jm2;

import com.whoop.trendsminiarch.domain.models.TrendsMiniArchModels;
import com.whoop.trendsminiarch.domain.models.TrendsMiniArchSectionModel;
import com.whoop.trendsminiarch.domain.models.TrendsMiniArchSectionSpacingType;
import e31.C12612d;
import fm2.C14611c;
import fm2.InterfaceC14609a;
import im2.C18712c;
import im2.InterfaceC18710a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jb1.C21535a;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: jm2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ljm2/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lfm2/a$b;", "Lim2/c;", "c", "(Lfm2/a$b;)Lim2/c;", "Lfm2/c;", "d", "(Lfm2/c;)Lim2/c;", "", "spacing", "Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;", "a", "(Ljava/lang/String;)Lcom/whoop/trendsminiarch/domain/models/TrendsMiniArchSectionSpacingType;", "domainResult", "b", "Ljb1/a;", "trends-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21794a {

    /* JADX INFO: renamed from: b */
    public static final int f83947b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C21794a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: a */
    private final TrendsMiniArchSectionSpacingType m61670a(String spacing) {
        String upperCase = spacing.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.equals("NORMAL")) {
            return TrendsMiniArchSectionSpacingType.NORMAL;
        }
        return upperCase.equals("COMPACT") ? TrendsMiniArchSectionSpacingType.COMPACT : TrendsMiniArchSectionSpacingType.COMPACT;
    }

    /* JADX INFO: renamed from: c */
    private final C18712c m61671c(InterfaceC14609a.b bVar) {
        if (bVar instanceof InterfaceC14609a.a) {
            return new C18712c(new C18712c.a(C12612d.f43056a.m35366a(), null, null, 6, null), null, 2, null);
        }
        if (bVar instanceof InterfaceC14609a.c) {
            return new C18712c(C18712c.a.m54406b(new C18712c.a(C12612d.f43056a.m35368c(), null, null, 6, null), null, null, new InterfaceC18710a.e(((InterfaceC14609a.c) bVar).getPath()), 3, null), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    private final C18712c m61672d(C14611c c14611c) {
        ?? arrayList;
        List<TrendsMiniArchSectionModel> sections;
        TrendsMiniArchSectionSpacingType trendsMiniArchSectionSpacingTypeM61670a;
        TrendsMiniArchModels response = c14611c.getResponse();
        if (response == null || (sections = response.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<TrendsMiniArchSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (TrendsMiniArchSectionModel trendsMiniArchSectionModel : list) {
                List<InterfaceC25312u> listM60540g = this.reducer.m60540g(trendsMiniArchSectionModel.getItems());
                String sectionType = trendsMiniArchSectionModel.getSectionType();
                if (sectionType == null || (trendsMiniArchSectionSpacingTypeM61670a = m61670a(sectionType)) == null) {
                    trendsMiniArchSectionSpacingTypeM61670a = TrendsMiniArchSectionSpacingType.COMPACT;
                }
                arrayList.add(new C18712c.c(listM60540g, trendsMiniArchSectionSpacingTypeM61670a));
            }
        }
        return new C18712c(null, new C18712c.b(arrayList), 1, null);
    }

    /* JADX INFO: renamed from: b */
    public final C18712c m61673b(C14611c domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        return domainResult.getCurrentDialogType() instanceof InterfaceC14609a.b ? m61671c((InterfaceC14609a.b) domainResult.getCurrentDialogType()) : m61672d(domainResult);
    }

    public /* synthetic */ C21794a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC21795b.f83949a : c21535a);
    }
}
