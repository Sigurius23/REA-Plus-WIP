package sc2;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.p069ui.drawer.strapsettings.advancedsettings.AdvancedStrapFragment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sm2.AbstractC32720e;

/* JADX INFO: renamed from: sc2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lsc2/p;", "Lsm2/e;", "Landroidx/fragment/app/m0;", "fragment", "<init>", "(Landroidx/fragment/app/m0;)V", "", "position", "d", "(I)Landroidx/fragment/app/m0;", "getItemCount", "()I", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32377p extends AbstractC32720e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32377p(AbstractComponentCallbacksC1320m0 fragment) {
        super(fragment);
        AbstractC22676k.m65750j(fragment, "fragment");
    }

    @Override // sm2.AbstractC32720e
    /* JADX INFO: renamed from: d */
    public AbstractComponentCallbacksC1320m0 mo100815d(int position) {
        if (position == 0) {
            return new C32386y();
        }
        if (position == 1) {
            return new AdvancedStrapFragment();
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public int getDisplayCount() {
        return 2;
    }
}
