package p734sl0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.bot.view.AiConversationFragment;
import com.whoop.design.util.TextResource;
import java.util.List;

/* JADX INFO: renamed from: sl0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32609g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135163w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135164x;

    public /* synthetic */ C32609g(Object obj, int i13) {
        this.f135163w = i13;
        this.f135164x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135163w) {
            case 0:
                return AbstractC32619i.m101817I((TextResource) this.f135164x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC32686w.m102513S((C32659q) this.f135164x, (List) obj, (AbstractC32662q2) obj2);
            case 2:
                return AiConversationFragment.m18285r0((AiConversationFragment) this.f135164x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC32623i3.m101880n((String) this.f135164x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
