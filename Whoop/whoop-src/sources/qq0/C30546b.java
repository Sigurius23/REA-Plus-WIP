package qq0;

import android.view.View;
import com.whoop.community.presentation.share.selectteam.SelectTeamFragment;
import com.whoop.domain.model.teams.share.SelectTeam;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: qq0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C30546b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125707w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SelectTeamFragment f125708x;

    public /* synthetic */ C30546b(SelectTeamFragment selectTeamFragment, int i13) {
        this.f125707w = i13;
        this.f125708x = selectTeamFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f125707w) {
            case 0:
                return SelectTeamFragment.m19405V(this.f125708x, (C30549e) obj);
            case 1:
                return SelectTeamFragment.m19401R(this.f125708x, (View) obj);
            case 2:
                return SelectTeamFragment.m19402S(this.f125708x, (View) obj);
            default:
                return SelectTeamFragment.m19407X(this.f125708x, (SelectTeam) obj);
        }
    }
}
