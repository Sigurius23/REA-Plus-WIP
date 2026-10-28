package qq0;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1717o2;
import as2.AbstractC1953c;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.domain.model.teams.share.SelectTeam;
import eq0.AbstractC13460e3;
import l83.C23454a0;
import p684zk.C40786k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;
import vu1.AbstractC36512c;

/* JADX INFO: renamed from: qq0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lqq0/c;", "Landroidx/recyclerview/widget/o2;", "Leq0/e3;", "selectTeamItemViewBinding", "<init>", "(Leq0/e3;)V", "Lcom/whoop/domain/model/teams/share/SelectTeam;", "selectTeam", "Lkotlin/Function1;", "Ll83/a0;", "onTeamClick", "b", "(Lcom/whoop/domain/model/teams/share/SelectTeam;Lkotlin/jvm/functions/Function1;)V", "a", "Leq0/e3;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30547c extends AbstractC1717o2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC13460e3 selectTeamItemViewBinding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30547c(AbstractC13460e3 selectTeamItemViewBinding) {
        super(selectTeamItemViewBinding.getRoot());
        AbstractC22676k.m65750j(selectTeamItemViewBinding, "selectTeamItemViewBinding");
        this.selectTeamItemViewBinding = selectTeamItemViewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m93639c(Function1 function1, SelectTeam selectTeam, View it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(selectTeam);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m93640b(SelectTeam selectTeam, Function1 onTeamClick) {
        AbstractC22676k.m65750j(selectTeam, "selectTeam");
        AbstractC22676k.m65750j(onTeamClick, "onTeamClick");
        AbstractC13460e3 abstractC13460e3 = this.selectTeamItemViewBinding;
        ((C4964f) ((C4964f) ComponentCallbacks2C4960b.m15529e(this.itemView.getContext()).m15549m(selectTeam.getAvatarUrl()).m89314d(C40786k.f175891b)).m89319j(AbstractC36512c.f156071n)).m15537y(abstractC13460e3.f47231a);
        abstractC13460e3.f47232b.setText(selectTeam.getName());
        View root = abstractC13460e3.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        AbstractC1953c.m5963a(root, new C29793c(10, onTeamClick, selectTeam));
    }
}
