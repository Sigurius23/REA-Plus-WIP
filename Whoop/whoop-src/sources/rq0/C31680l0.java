package rq0;

import androidx.lifecycle.C1630u0;
import com.squareup.wire.AbstractC5583n;
import com.whoop.community.domain.model.teams.TimePeriod;
import com.whoop.p069ui.ScoreContext;
import p217ib.AbstractC18313j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.l0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Lrq0/l0;", "Lcom/squareup/wire/n;", "", "Lcom/whoop/domain/model/teams/LeadersEntry;", "Lcom/whoop/ui/ScoreContext;", "scoreContext", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "timePeriod", "Lrq0/h1;", "viewModel", "<init>", "(Lcom/whoop/ui/ScoreContext;Lcom/whoop/community/domain/model/teams/TimePeriod;Lrq0/h1;)V", "Lib/j;", "s", "()Lib/j;", "c", "Lcom/whoop/ui/ScoreContext;", "getScoreContext", "()Lcom/whoop/ui/ScoreContext;", "d", "Lcom/whoop/community/domain/model/teams/TimePeriod;", "getTimePeriod", "()Lcom/whoop/community/domain/model/teams/TimePeriod;", "e", "Lrq0/h1;", "getViewModel", "()Lrq0/h1;", "Landroidx/lifecycle/u0;", "Lrq0/k0;", "f", "Landroidx/lifecycle/u0;", "liveData", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31680l0 extends AbstractC5583n {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ScoreContext scoreContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TimePeriod timePeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C31671h1 viewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C1630u0 liveData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31680l0(ScoreContext scoreContext, TimePeriod timePeriod, C31671h1 viewModel) {
        super(16);
        AbstractC22676k.m65750j(scoreContext, "scoreContext");
        AbstractC22676k.m65750j(timePeriod, "timePeriod");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.scoreContext = scoreContext;
        this.timePeriod = timePeriod;
        this.viewModel = viewModel;
        this.liveData = new C1630u0();
    }

    @Override // com.squareup.wire.AbstractC5583n
    /* JADX INFO: renamed from: s */
    public AbstractC18313j mo16801s() {
        C31678k0 c31678k0 = new C31678k0(this.scoreContext, this.timePeriod, this.viewModel);
        this.liveData.postValue(c31678k0);
        return c31678k0;
    }
}
