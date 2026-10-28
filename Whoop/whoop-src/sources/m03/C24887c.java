package m03;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p390p1.InterfaceC28601c1;
import p545v6.InterfaceC35718g;
import p715kotlin.jvm.functions.Function3;
import t11.AbstractC33305e;

/* JADX INFO: renamed from: m03.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C24887c implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97504w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f97505x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f97506y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f97507z;

    public /* synthetic */ C24887c(TextResource textResource, long j7, InterfaceC28601c1 interfaceC28601c1) {
        this.f97506y = textResource;
        this.f97505x = j7;
        this.f97507z = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f97504w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC24888d.m72985d((String) this.f97506y, (String) this.f97507z, this.f97505x, (InterfaceC35718g) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC33305e.m105621I((TextResource) this.f97506y, this.f97505x, (InterfaceC28601c1) this.f97507z, (InterfaceC4351m) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C24887c(String str, String str2, long j7) {
        this.f97506y = str;
        this.f97507z = str2;
        this.f97505x = j7;
    }
}
