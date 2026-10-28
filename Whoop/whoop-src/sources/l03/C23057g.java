package l03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.widget.p071ui.healthspan.HealthspanWidgetViewState;

/* JADX INFO: renamed from: l03.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C23057g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90922w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HealthspanWidgetViewState f90923x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Context f90924y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23058h f90925z;

    public /* synthetic */ C23057g(Context context, HealthspanWidgetViewState healthspanWidgetViewState, C23058h c23058h) {
        this.f90924y = context;
        this.f90923x = healthspanWidgetViewState;
        this.f90925z = c23058h;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f90922w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return C23058h.m67012D(this.f90924y, this.f90923x, this.f90925z, composer, iIntValue);
            default:
                return C23058h.m67013E(this.f90923x, this.f90924y, this.f90925z, composer, iIntValue);
        }
    }

    public /* synthetic */ C23057g(HealthspanWidgetViewState healthspanWidgetViewState, Context context, C23058h c23058h) {
        this.f90923x = healthspanWidgetViewState;
        this.f90924y = context;
        this.f90925z = c23058h;
    }
}
