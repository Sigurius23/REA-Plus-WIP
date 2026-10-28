package p217ib;

import java.util.List;

/* JADX INFO: renamed from: ib.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C18325v extends AbstractC18324u {

    /* JADX INFO: renamed from: a */
    public final C18312i f71333a;

    /* JADX INFO: renamed from: b */
    public final boolean f71334b;

    /* JADX INFO: renamed from: c */
    public final int f71335c;

    public C18325v(AbstractC18302a0 abstractC18302a0, boolean z4, int i13, AbstractC18314k abstractC18314k) {
        this.f71333a = new C18312i(abstractC18302a0, 0, null, abstractC18314k);
        this.f71334b = z4;
        this.f71335c = i13;
        if (i13 < 1) {
            throw new IllegalArgumentException("Page size must be non-negative");
        }
    }

    @Override // p217ib.AbstractC18324u
    /* JADX INFO: renamed from: a */
    public final void mo52741a(int i13, int i14, List list) {
        C18312i c18312i = this.f71333a;
        if (((AbstractC18302a0) c18312i.f71288c).mo52720c()) {
            c18312i.m52715b(C18315l.f71294e);
            return;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        if (list.size() + i13 > i14) {
            throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
        }
        if (list.size() == 0 && i14 > 0) {
            throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
        }
        if (list.size() + i13 != i14) {
            int size = list.size();
            int i15 = this.f71335c;
            if (size % i15 != 0) {
                throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + list.size() + ", position " + i13 + ", totalCount " + i14 + ", pageSize " + i15);
            }
        }
        if (this.f71334b) {
            c18312i.m52715b(new C18315l(i13, (i14 - i13) - list.size(), 0, list));
        } else {
            c18312i.m52715b(new C18315l(list, i13));
        }
    }
}
