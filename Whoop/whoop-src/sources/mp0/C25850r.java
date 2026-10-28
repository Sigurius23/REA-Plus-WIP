package mp0;

import android.view.View;
import com.whoop.coaching.sleepcoach.wizard.C6242d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: mp0.r */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25850r implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101848w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C6242d f101849x;

    public /* synthetic */ C25850r(C6242d c6242d, int i13) {
        this.f101848w = i13;
        this.f101849x = c6242d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101848w) {
            case 0:
                return C6242d.m18668P(this.f101849x, (C25820c) obj);
            case 1:
                return C6242d.m18669Q(this.f101849x, (C25814a) obj);
            case 2:
                return C6242d.m18670R(this.f101849x, ((Boolean) obj).booleanValue());
            case 3:
                return C6242d.m18671S(this.f101849x, (EnumC25836k) obj);
            case 4:
                return C6242d.m18672T(this.f101849x, (C25846p) obj);
            case 5:
                return C6242d.m18677Y(this.f101849x, (View) obj);
            default:
                return C6242d.m18675W(this.f101849x, (View) obj);
        }
    }
}
