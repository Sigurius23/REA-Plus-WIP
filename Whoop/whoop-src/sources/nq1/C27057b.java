package nq1;

import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.items.TileTagModel;
import com.whoop.design.util.TextResource;
import hq1.AbstractC17563b;
import hq1.C17565d;
import hq1.C17567f;
import hq1.C17568g;
import hq1.C17569h;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import jj0.AbstractC21738a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import lq1.AbstractC24668h;
import lq1.C24661a;
import lq1.C24662b;
import lq1.C24663c;
import lq1.C24664d;
import lq1.C24665e;
import m83.AbstractC25267u;
import m83.C25271y;
import no1.C26993g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23709s2;
import uv0.AbstractC35283c;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: nq1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lnq1/b;", "", "<init>", "()V", "Lhq1/f;", "metadata", "Llq1/h$a;", "d", "(Lhq1/f;)Llq1/h$a;", "Lhq1/b$c;", "Llq1/h;", "f", "(Lhq1/b$c;)Llq1/h;", "Lhq1/h;", "Llq1/e;", "e", "(Lhq1/h;)Llq1/e;", "Lhq1/b;", "domainResult", "b", "(Lhq1/b;)Llq1/h;", "Ljb1/a;", "a", "Ljb1/a;", "getReducer", "()Ljb1/a;", "reducer", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27057b {

    /* JADX INFO: renamed from: b */
    public static final int f108168b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer = AbstractC21537c.m60554d(new C26993g(6));

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m81294c(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC24668h.a m81295d(C17567f metadata) {
        return new AbstractC24668h.a(metadata);
    }

    /* JADX INFO: renamed from: e */
    private final C24665e m81296e(C17569h c17569h) {
        List<TileTagModel> listM50013b = c17569h.m50013b();
        if (listM50013b == null) {
            listM50013b = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM50013b.iterator();
        while (it.hasNext()) {
            C17750h1 c17750h1M69401s = AbstractC23709s2.m69401s((TileTagModel) it.next());
            if (c17750h1M69401s != null) {
                arrayList.add(c17750h1M69401s);
            }
        }
        if (arrayList.isEmpty() && c17569h.getCreatedTextDisplay() == null) {
            return null;
        }
        return new C24665e(arrayList, c17569h.getCreatedTextDisplay());
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC24668h m81297f(AbstractC17563b.c cVar) {
        AbstractC6721d.a aVar = new AbstractC6721d.a(new TextResource.C8688b(AbstractC21738a.f83590b, null, 2, null), null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null)), null, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
        TextResource detailsTitleDisplay = cVar.getHeader().getDetailsTitleDisplay();
        AbstractC22403o.c cVar2 = new AbstractC22403o.c(cVar.getHeader().getDetailsImageDisplay(), 0, 0, 0, 14, null);
        C17569h subHeader = cVar.getHeader().getSubHeader();
        C24662b c24662b = new C24662b(aVar, detailsTitleDisplay, cVar2, subHeader != null ? m81296e(subHeader) : null);
        List<C17568g> listM49989f = cVar.m49989f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM49989f, 10));
        for (C17568g c17568g : listM49989f) {
            arrayList.add(new C24664d(AbstractC27056a.m81289i().m60540g(c17568g.m50010a()), c17568g.getSectionType()));
        }
        C17565d footer = cVar.getFooter();
        C24661a c24661a = footer != null ? new C24661a(footer.getImpactsTitle(), footer.getImpactsDescription(), this.reducer.m60540g(footer.m50003c())) : null;
        C17567f metadata = cVar.getMetadata();
        AiContextMetadata aiContextMetadata = cVar.getAiContextMetadata();
        return new AbstractC24668h.c(new C24663c(c24662b, arrayList, c24661a, metadata, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null));
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC24668h m81298b(AbstractC17563b domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC17563b.a) {
            return m81295d(((AbstractC17563b.a) domainResult).getMetadata());
        }
        if (domainResult instanceof AbstractC17563b.b) {
            return AbstractC24668h.b.f96481a;
        }
        if (domainResult instanceof AbstractC17563b.c) {
            return m81297f((AbstractC17563b.c) domainResult);
        }
        throw new NoWhenBranchMatchedException();
    }
}
