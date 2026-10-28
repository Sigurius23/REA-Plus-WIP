package rq0;

import androidx.lifecycle.C1630u0;
import com.squareup.wire.AbstractC5583n;
import p217ib.AbstractC18313j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rq0.x0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lrq0/x0;", "Lcom/squareup/wire/n;", "", "Lcom/whoop/domain/model/teams/TeamUser;", "Lrq0/h1;", "viewModel", "<init>", "(Lrq0/h1;)V", "Lib/j;", "s", "()Lib/j;", "c", "Lrq0/h1;", "getViewModel", "()Lrq0/h1;", "Landroidx/lifecycle/u0;", "Lrq0/w0;", "d", "Landroidx/lifecycle/u0;", "liveData", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31704x0 extends AbstractC5583n {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C31671h1 viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C1630u0 liveData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31704x0(C31671h1 viewModel) {
        super(16);
        AbstractC22676k.m65750j(viewModel, "viewModel");
        this.viewModel = viewModel;
        this.liveData = new C1630u0();
    }

    @Override // com.squareup.wire.AbstractC5583n
    /* JADX INFO: renamed from: s */
    public AbstractC18313j mo16801s() {
        C31702w0 c31702w0 = new C31702w0(this.viewModel);
        this.liveData.postValue(c31702w0);
        return c31702w0;
    }
}
