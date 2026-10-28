package k03;

import androidx.compose.runtime.Composer;
import p545v6.InterfaceC35718g;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: k03.l */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22107l implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ String f85776E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f85777w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f85778x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f85779y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f85780z;

    public /* synthetic */ C22107l(int i13, String str, long j7, String str2) {
        this.f85778x = i13;
        this.f85779y = str;
        this.f85780z = j7;
        this.f85776E = str2;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f85777w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                int i13 = this.f85778x;
                String str = this.f85779y;
                return AbstractC22109n.m63283T(this.f85780z, i13, str, this.f85776E, (InterfaceC35718g) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC22109n.m63270G(this.f85778x, this.f85779y, this.f85780z, this.f85776E, (InterfaceC35718g) obj, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ C22107l(long j7, int i13, String str, String str2) {
        this.f85780z = j7;
        this.f85778x = i13;
        this.f85779y = str;
        this.f85776E = str2;
    }
}
