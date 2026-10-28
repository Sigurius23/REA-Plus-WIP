package w81;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import e91.C12886a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lw81/a;", "Landroidx/recyclerview/widget/i1;", "Lw81/e;", "", "pageCount", "Lkotlin/Function1;", "Ll83/a0;", "pageContents", "<init>", "(ILkotlin/jvm/functions/Function3;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "b", "(Landroid/view/ViewGroup;I)Lw81/e;", "holder", "position", "a", "(Lw81/e;I)V", "getItemCount", "()I", "c", "(Lw81/e;)V", "I", "Lkotlin/jvm/functions/Function3;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36943a extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int pageCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function3 pageContents;

    public C36943a(int i13, Function3 pageContents) {
        AbstractC22676k.m65750j(pageContents, "pageContents");
        this.pageCount = i13;
        this.pageContents = pageContents;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C36947e holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m118633b(position, this.pageContents);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C36947e onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        C12886a c12886aM36232c = C12886a.m36232c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(c12886aM36232c, "inflate(...)");
        return new C36947e(c12886aM36232c);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(C36947e holder) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m118634d();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount, reason: from getter */
    public int getPageCount() {
        return this.pageCount;
    }
}
