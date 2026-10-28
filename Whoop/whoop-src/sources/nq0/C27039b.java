package nq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import c93.InterfaceC4339a;
import com.whoop.domain.model.teams.FeatureTeam;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lnq0/b;", "Landroidx/recyclerview/widget/i1;", "Landroidx/recyclerview/widget/o2;", "", "Lcom/whoop/domain/model/teams/FeatureTeam;", "teamList", "Lkotlin/Function1;", "Ll83/a0;", "onItemClick", "Lkotlin/Function0;", "onFooterClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc93/a;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/o2;I)V", "a", "Ljava/util/List;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lc93/a;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27039b extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<FeatureTeam> teamList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onItemClick;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4339a onFooterClick;

    public C27039b(List<FeatureTeam> teamList, Function1 onItemClick, InterfaceC4339a onFooterClick) {
        AbstractC22676k.m65750j(teamList, "teamList");
        AbstractC22676k.m65750j(onItemClick, "onItemClick");
        AbstractC22676k.m65750j(onFooterClick, "onFooterClick");
        this.teamList = teamList;
        this.onItemClick = onItemClick;
        this.onFooterClick = onFooterClick;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getPageCount() {
        return this.teamList.size() + 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public int getItemViewType(int position) {
        return position == this.teamList.size() ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public void onBindViewHolder(AbstractC1717o2 holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        if (holder instanceof C27040c) {
            ((C27040c) holder).m81155b(this.teamList.get(position), this.onItemClick);
        } else if (holder instanceof C27041d) {
            ((C27041d) holder).m81158b(this.onFooterClick);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public AbstractC1717o2 onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        if (viewType == 0) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
            AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
            return new C27041d(layoutInflaterFrom, parent);
        }
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(parent.getContext());
        AbstractC22676k.m65749i(layoutInflaterFrom2, "from(...)");
        return new C27040c(layoutInflaterFrom2, parent, false, 4, null);
    }
}
