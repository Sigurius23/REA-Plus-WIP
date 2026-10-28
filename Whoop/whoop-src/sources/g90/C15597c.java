package g90;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import y31.AbstractC39195d;

/* JADX INFO: renamed from: g90.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C15597c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f58551E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58552w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f58553x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f58554y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f58555z;

    public /* synthetic */ C15597c(TextResource textResource, TextResource textResource2, String str, int i13, int i14) {
        this.f58552w = i14;
        this.f58553x = textResource;
        this.f58554y = textResource2;
        this.f58555z = str;
        this.f58551E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58552w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC15600f.m43905g(this.f58553x, this.f58554y, this.f58555z, this.f58551E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39195d.m124840A(this.f58553x, this.f58554y, this.f58555z, this.f58551E, (Composer) obj, iIntValue2);
        }
    }
}
