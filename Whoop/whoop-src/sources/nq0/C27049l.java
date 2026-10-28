package nq0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import com.whoop.domain.model.teams.TeamInviteDto;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nq0.l */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lnq0/l;", "Landroidx/recyclerview/widget/i1;", "Lnq0/n;", "", "Lcom/whoop/domain/model/teams/TeamInviteDto;", "pendingInvitesList", "", "displayCount", "Lkotlin/Function1;", "Ll83/a0;", "onClick", "<init>", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "b", "(Landroid/view/ViewGroup;I)Lnq0/n;", "getItemCount", "()I", "holder", "position", "a", "(Lnq0/n;I)V", "Ljava/util/List;", "I", "c", "Lkotlin/jvm/functions/Function1;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27049l extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<TeamInviteDto> pendingInvitesList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int displayCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Function1 onClick;

    public C27049l(List<TeamInviteDto> pendingInvitesList, int i13, Function1 onClick) {
        AbstractC22676k.m65750j(pendingInvitesList, "pendingInvitesList");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.pendingInvitesList = pendingInvitesList;
        this.displayCount = i13;
        this.onClick = onClick;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C27051n holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.m81270b(this.pendingInvitesList.get(position), this.onClick);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C27051n onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return new C27051n(layoutInflaterFrom, parent, false, 4, null);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount, reason: from getter */
    public int getDisplayCount() {
        return this.displayCount;
    }
}
