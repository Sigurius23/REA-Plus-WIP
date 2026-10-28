package t02;

import com.whoop.design.models.items.nestedbff.NestedBFFSection;
import hb1.AbstractC17084g;
import hb1.C17081d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q02.AbstractC29748b;

/* JADX INFO: renamed from: t02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lt02/a;", "", "Ljb1/a;", "designItemReducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;", "Lhb1/d;", "b", "(Lcom/whoop/design/models/items/nestedbff/NestedBFFSection;)Lhb1/d;", "Lq02/b;", "state", "Lhb1/g;", "a", "(Lq02/b;)Lhb1/g;", "Ljb1/a;", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33266a {

    /* JADX INFO: renamed from: b */
    public static final int f138687b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    public C33266a(C21535a designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "designItemReducer");
        this.designItemReducer = designItemReducer;
    }

    /* JADX INFO: renamed from: b */
    private final C17081d m105535b(NestedBFFSection nestedBFFSection) {
        return new C17081d(nestedBFFSection.getId(), nestedBFFSection.getTitle(), nestedBFFSection.getSubtitle(), C21535a.m60536k(this.designItemReducer, nestedBFFSection.getItems(), null, 2, null));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC17084g m105536a(AbstractC29748b state) {
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof AbstractC29748b.b) {
            return AbstractC17084g.c.f65647a;
        }
        if (!(state instanceof AbstractC29748b.c)) {
            if (state instanceof AbstractC29748b.a.C42203a) {
                return new AbstractC17084g.a(true);
            }
            if (state instanceof AbstractC29748b.a.b) {
                return new AbstractC17084g.a(false);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<NestedBFFSection> listM91205a = ((AbstractC29748b.c) state).m91205a();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM91205a, 10));
        Iterator<T> it = listM91205a.iterator();
        while (it.hasNext()) {
            arrayList.add(m105535b((NestedBFFSection) it.next()));
        }
        return new AbstractC17084g.d(arrayList);
    }

    public /* synthetic */ C33266a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21535a(null, null, 3, null) : c21535a);
    }
}
