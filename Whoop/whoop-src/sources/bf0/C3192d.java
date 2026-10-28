package bf0;

import com.whoop.advancedlabs.testupload.view.TestUploadFragment;
import java.util.List;
import kd0.InterfaceC22381a;
import p236j.C21062a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bf0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3192d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12508w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TestUploadFragment f12509x;

    public /* synthetic */ C3192d(TestUploadFragment testUploadFragment, int i13) {
        this.f12508w = i13;
        this.f12509x = testUploadFragment;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f12508w) {
            case 0:
                return TestUploadFragment.m17641G(this.f12509x, (C21062a) obj);
            case 1:
                return TestUploadFragment.m17642H(this.f12509x, (List) obj);
            default:
                return TestUploadFragment.m17651Q(this.f12509x, (InterfaceC22381a.c) obj);
        }
    }
}
