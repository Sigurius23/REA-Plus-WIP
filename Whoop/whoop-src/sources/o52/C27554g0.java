package o52;

import android.view.View;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.realtime.presentation.AbstractC9879c;
import com.whoop.realtime.presentation.C9886j;
import com.whoop.realtime.presentation.StartActivityActivity;
import java.util.List;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o52.g0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C27554g0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110936w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C9886j f110937x;

    public /* synthetic */ C27554g0(C9886j c9886j, int i13) {
        this.f110936w = i13;
        this.f110937x = c9886j;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f110936w) {
            case 0:
                return C9886j.m24065l0(this.f110937x, (List) obj);
            case 1:
                return C9886j.m24066m0(this.f110937x, (AbstractC9879c.a) obj);
            case 2:
                return C9886j.m24068o0(this.f110937x, (AbstractC9879c.a) obj);
            case 3:
                return C9886j.m24069p0(this.f110937x, ((Boolean) obj).booleanValue());
            case 4:
                return C9886j.m24063j0(this.f110937x, (InterfaceC1585g0) obj);
            default:
                return StartActivityActivity.m23981s1(this.f110937x, (View) obj);
        }
    }
}
