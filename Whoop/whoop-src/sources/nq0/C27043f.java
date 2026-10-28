package nq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import com.whoop.domain.model.teams.Team;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nq0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lnq0/f;", "Landroidx/recyclerview/widget/i1;", "Lnq0/g;", "", "Lcom/whoop/domain/model/teams/Team;", "teamList", "Lkotlin/Function1;", "Ll83/a0;", "onClick", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "(Landroid/view/ViewGroup;I)Lnq0/g;", "getItemCount", "()I", "holder", "position", "a", "(Lnq0/g;I)V", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27043f extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private List<Team> teamList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 onClick;

    public C27043f(List<Team> teamList, Function1 onClick) {
        AbstractC22676k.m65750j(teamList, "teamList");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.teamList = teamList;
        this.onClick = onClick;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C27044g holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m81168b(this.teamList.get(position), this.onClick);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C27044g onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return new C27044g(layoutInflaterFrom, parent, false, 4, null);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getPageCount() {
        return this.teamList.size();
    }
}
