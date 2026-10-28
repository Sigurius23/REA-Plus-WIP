package p217ib;

import androidx.recyclerview.widget.AbstractC1670d;
import androidx.recyclerview.widget.AbstractC1738u;

/* JADX INFO: renamed from: ib.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C18322s extends AbstractC1670d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C18321r f71326d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f71327e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C18321r f71328f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC1738u f71329g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f71330h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f71331i;

    public C18322s(C18321r c18321r, int i13, C18321r c18321r2, AbstractC1738u abstractC1738u, int i14, int i15) {
        this.f71326d = c18321r;
        this.f71327e = i13;
        this.f71328f = c18321r2;
        this.f71329g = abstractC1738u;
        this.f71330h = i14;
        this.f71331i = i15;
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: a */
    public final boolean mo5216a(int i13, int i14) {
        Object obj = this.f71326d.get(i13 + this.f71327e);
        C18321r c18321r = this.f71328f;
        Object obj2 = c18321r.get(i14 + c18321r.f71322w);
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return this.f71329g.areContentsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: b */
    public final boolean mo5217b(int i13, int i14) {
        Object obj = this.f71326d.get(i13 + this.f71327e);
        C18321r c18321r = this.f71328f;
        Object obj2 = c18321r.get(i14 + c18321r.f71322w);
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return this.f71329g.areItemsTheSame(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: g */
    public final Object mo5218g(int i13, int i14) {
        Object obj = this.f71326d.get(i13 + this.f71327e);
        C18321r c18321r = this.f71328f;
        Object obj2 = c18321r.get(i14 + c18321r.f71322w);
        if (obj == null || obj2 == null) {
            return null;
        }
        return this.f71329g.getChangePayload(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: h */
    public final int mo5219h() {
        return this.f71331i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1670d
    /* JADX INFO: renamed from: i */
    public final int mo5220i() {
        return this.f71330h;
    }
}
