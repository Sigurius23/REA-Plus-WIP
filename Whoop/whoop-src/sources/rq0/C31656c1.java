package rq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1738u;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.domain.model.teams.LeadersEntry;
import com.whoop.domain.model.teams.Team;
import com.whoop.domain.model.teams.TeamUserListing;
import com.whoop.p069ui.ScoreContext;
import jo.ViewOnClickListenerC21821j;
import p217ib.AbstractC18319p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;
import xp0.AbstractC38505d0;

/* JADX INFO: renamed from: rq0.c1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lrq0/c1;", "Lib/p;", "Lcom/whoop/domain/model/teams/LeadersEntry;", "Lrq0/d1;", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "Lrq0/h1;", "viewModel", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lkotlin/Function1;", "Lcom/whoop/domain/model/teams/TeamUserListing;", "Ll83/a0;", "onClick", "<init>", "(Lcom/whoop/ui/ScoreContext;Lrq0/h1;Lcom/whoop/data/repositories/FeatureFlagRepository;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "g", "(Landroid/view/ViewGroup;I)Lrq0/d1;", "holder", "position", "e", "(Lrq0/d1;I)V", "getItemCount", "()I", "c", "Lcom/whoop/ui/ScoreContext;", "d", "Lrq0/h1;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "f", "Lkotlin/jvm/functions/Function1;", "Ltr2/n;", "Ltr2/n;", "getLogger", "()Ltr2/n;", "logger", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31656c1 extends AbstractC18319p {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ScoreContext scoreContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31671h1 viewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Function1 onClick;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: rq0.c1$a */
    @Metadata(m65680d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"rq0/c1$a", "Landroidx/recyclerview/widget/u;", "Lcom/whoop/domain/model/teams/LeadersEntry;", "oldItem", "newItem", "", "b", "(Lcom/whoop/domain/model/teams/LeadersEntry;Lcom/whoop/domain/model/teams/LeadersEntry;)Z", "a", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC1738u {
        @Override // androidx.recyclerview.widget.AbstractC1738u
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(LeadersEntry oldItem, LeadersEntry newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.equals(newItem);
        }

        @Override // androidx.recyclerview.widget.AbstractC1738u
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(LeadersEntry oldItem, LeadersEntry newItem) {
            AbstractC22676k.m65750j(oldItem, "oldItem");
            AbstractC22676k.m65750j(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31656c1(ScoreContext scoreContext, C31671h1 viewModel, FeatureFlagRepository featureFlagRepository, Function1 onClick) {
        super(new a());
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(onClick, "onClick");
        this.scoreContext = scoreContext;
        this.viewModel = viewModel;
        this.featureFlagRepository = featureFlagRepository;
        this.onClick = onClick;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("TeamsListAdapter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m97911f(C31656c1 c31656c1, View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(8);
            return;
        }
        int iM98037g0 = c31656c1.viewModel.getTotalOriginalCompliant();
        c31656c1.viewModel.m98047w0(c31656c1.scoreContext);
        c31656c1.notifyItemRangeChanged(iM98037g0, c31656c1.viewModel.getTotalNonCompliant());
        view.setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C31659d1 holder, int position) {
        LeadersEntry leadersEntry;
        C31659d1 c31659d1;
        Team teamM98033c0;
        AbstractC22676k.m65750j(holder, "holder");
        holder.getLastNonCompliantLayout().setVisibility(8);
        if (position < 0 || position >= super.getDisplayCount() || (leadersEntry = (LeadersEntry) getItem(position)) == null) {
            return;
        }
        TeamUserListing teamUserListing = leadersEntry.toTeamUserListing();
        if (teamUserListing == null || (teamM98033c0 = this.viewModel.m98033c0()) == null) {
            c31659d1 = holder;
        } else {
            c31659d1 = holder;
            c31659d1.m97930b(this.scoreContext, this.viewModel.m98034d0(), this.viewModel.m98032Z(this.scoreContext), teamUserListing.getRank(), teamUserListing, teamM98033c0, this.viewModel.getSelectedTimePeriod(), this.viewModel.getSelectedDate(), this.featureFlagRepository, this.onClick);
        }
        if (this.viewModel.getSelectedTimePeriod() != TimePeriod.DAILY) {
            int iM98037g0 = this.viewModel.getTotalOriginalCompliant();
            Integer num = this.viewModel.m98029V().get(this.scoreContext);
            if (num != null && iM98037g0 == num.intValue() && position == this.viewModel.getTotalOriginalCompliant() - 1 && this.viewModel.getTotalNonCompliant() >= 2 && this.viewModel.getTotalListCount() >= 10) {
                c31659d1.getCompliantCount().setText(c31659d1.getCompliantCount().getContext().getResources().getString(AbstractC38505d0.f165658e0, String.valueOf(this.viewModel.getTotalNonCompliant())));
                c31659d1.getCompliantCountDescription().setText(c31659d1.getCompliantCountDescription().getContext().getResources().getString(AbstractC38505d0.f165569C, String.valueOf(this.viewModel.getTotalNonCompliant())));
                c31659d1.getLastNonCompliantLayout().setVisibility(0);
                c31659d1.getLastNonCompliantLayout().setOnClickListener(new ViewOnClickListenerC21821j(this, 15));
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C31659d1 onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        AbstractC22676k.m65749i(layoutInflaterFrom, "from(...)");
        return new C31659d1(layoutInflaterFrom, parent, false, 4, null);
    }

    @Override // p217ib.AbstractC18319p, androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        int itemCount = super.getDisplayCount();
        Integer num = this.viewModel.m98029V().get(this.scoreContext);
        int iIntValue = num != null ? num.intValue() : 0;
        return (this.viewModel.getSelectedTimePeriod() == TimePeriod.DAILY || iIntValue <= 0) ? itemCount : Math.min(iIntValue, itemCount);
    }
}
