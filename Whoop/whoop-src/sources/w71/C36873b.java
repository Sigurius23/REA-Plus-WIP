package w71;

import d13.AbstractC11478a;
import hy0.C17736e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m83.AbstractC25265s;
import n91.InterfaceC26476a;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: w71.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, m65681d2 = {"Lw71/b;", "Ln91/a;", "", "Lw71/t;", "questionSections", "", "title", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Lm91/u;", "b", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "Ljava/lang/String;", "items", "c", "getTitle", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36873b implements InterfaceC26476a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C36901t> questionSections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    public C36873b(List<C36901t> questionSections, String title) {
        AbstractC22676k.m65750j(questionSections, "questionSections");
        AbstractC22676k.m65750j(title, "title");
        this.questionSections = questionSections;
        this.title = title;
    }

    /* JADX INFO: renamed from: b */
    private final List<InterfaceC25312u> m118260b() {
        C17736e c17736e = new C17736e(null, null, AbstractC11478a.m30853e(Locale.ROOT, this.title, "toUpperCase(...)"), 3, null);
        List<C36901t> list = this.questionSections;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C36901t) it.next()).mo78412a());
        }
        return AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c17736e), arrayList);
    }

    @Override // n91.InterfaceC26476a
    /* JADX INFO: renamed from: a */
    public List<InterfaceC25312u> mo78412a() {
        return m118260b();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36873b)) {
            return false;
        }
        C36873b c36873b = (C36873b) other;
        return AbstractC22676k.m65745e(this.questionSections, c36873b.questionSections) && AbstractC22676k.m65745e(this.title, c36873b.title);
    }

    public int hashCode() {
        return this.title.hashCode() + (this.questionSections.hashCode() * 31);
    }

    public String toString() {
        return AbstractC30802r.m94761j("JournalGroupSection(questionSections=", ", title=", this.title, ")", this.questionSections);
    }
}
