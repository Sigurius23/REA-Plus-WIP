package qq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import com.whoop.domain.model.teams.share.SelectTeam;
import eq0.AbstractC13460e3;
import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lqq0/a;", "Landroidx/recyclerview/widget/i1;", "Lqq0/c;", "Lkotlin/Function1;", "Lcom/whoop/domain/model/teams/share/SelectTeam;", "Ll83/a0;", "onTeamClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "(Landroid/view/ViewGroup;I)Lqq0/c;", "holder", "position", "a", "(Lqq0/c;I)V", "getItemCount", "()I", "", "globalWidgets", "c", "(Ljava/util/List;)V", "Lkotlin/jvm/functions/Function1;", "Ljava/util/List;", "selectTeams", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30545a extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onTeamClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<SelectTeam> selectTeams;

    public C30545a(Function1 onTeamClick) {
        AbstractC22676k.m65750j(onTeamClick, "onTeamClick");
        this.onTeamClick = onTeamClick;
        this.selectTeams = C25271y.f99162w;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C30547c holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m93640b(this.selectTeams.get(position), this.onTeamClick);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C30547c onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC13460e3 abstractC13460e3M38183c = AbstractC13460e3.m38183c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(abstractC13460e3M38183c, "inflate(...)");
        return new C30547c(abstractC13460e3M38183c);
    }

    /* JADX INFO: renamed from: c */
    public final void m93637c(List<SelectTeam> globalWidgets) {
        AbstractC22676k.m65750j(globalWidgets, "globalWidgets");
        this.selectTeams = globalWidgets;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getPageCount() {
        return this.selectTeams.size();
    }
}
