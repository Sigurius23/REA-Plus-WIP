package u71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: u71.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34567a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f145575E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f145576w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34576j f145577x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f145578y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f145579z;

    public /* synthetic */ C34567a(C34576j c34576j, Function1 function1, int i13, int i14, int i15) {
        this.f145576w = i15;
        this.f145577x = c34576j;
        this.f145578y = function1;
        this.f145579z = i13;
        this.f145575E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f145576w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC34568b.m109301e(this.f145577x, this.f145578y, this.f145579z, this.f145575E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC34570d.m109306e(this.f145577x, this.f145578y, this.f145579z, this.f145575E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC34573g.m109342y(this.f145577x, this.f145578y, this.f145579z, this.f145575E, (Composer) obj, iIntValue3);
        }
    }
}
