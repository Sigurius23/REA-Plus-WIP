package op0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gf2.C15809r;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: op0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR(\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lop0/k;", "Landroidx/recyclerview/widget/i1;", "Lop0/m;", "Lkotlin/Function2;", "Lop0/c;", "", "Ll83/a0;", "onNextClick", "onBackClick", "Lkotlin/Function0;", "closeIconClick", "<init>", "(Lc93/m;Lc93/m;Lc93/a;)V", "", "a", "()Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "viewType", "c", "(Landroid/view/ViewGroup;I)Lop0/m;", "holder", "position", "b", "(Lop0/m;I)V", "getItemCount", "()I", "Lc93/m;", "Lc93/a;", "d", "Ljava/util/List;", "itemList", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28093k extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private InterfaceC4351m onNextClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private InterfaceC4351m onBackClick;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private InterfaceC4339a closeIconClick;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private List<? extends EnumC28085c> itemList;

    public C28093k(InterfaceC4351m onNextClick, InterfaceC4351m onBackClick, InterfaceC4339a closeIconClick) {
        AbstractC22676k.m65750j(onNextClick, "onNextClick");
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        AbstractC22676k.m65750j(closeIconClick, "closeIconClick");
        this.onNextClick = onNextClick;
        this.onBackClick = onBackClick;
        this.closeIconClick = closeIconClick;
        this.itemList = m84872a();
    }

    /* JADX INFO: renamed from: a */
    private final List<EnumC28085c> m84872a() {
        return AbstractC37056f.m118959K(EnumC28085c.ONBOARDING_SCREEN_PLANNER_ONE, EnumC28085c.ONBOARDING_SCREEN_PLANNER_TWO);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C28095m holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m84881d(this.itemList.get(position), position, this.onNextClick, this.onBackClick, this.closeIconClick);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C28095m onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        C15809r c15809rM44608c = C15809r.m44608c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(c15809rM44608c, "inflate(...)");
        return new C28095m(c15809rM44608c);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return this.itemList.size();
    }
}
