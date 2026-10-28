package bj0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.profile.view.ProfileScreenContentKt;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25306o;
import p739ui0.AbstractC35005g;
import zi0.AbstractC40662a;

/* JADX INFO: renamed from: bj0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3328a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f12914E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12915w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25306o f12916x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f12917y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f12918z;

    public /* synthetic */ C3328a(C25306o c25306o, Function1 function1, int i13, int i14, int i15) {
        this.f12915w = i15;
        this.f12916x = c25306o;
        this.f12917y = function1;
        this.f12918z = i13;
        this.f12914E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12915w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3329b.m9629g(this.f12916x, this.f12917y, this.f12918z, this.f12914E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return ProfileScreenContentKt.ProfileScreenItem$lambda$2(this.f12916x, this.f12917y, this.f12918z, this.f12914E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC35005g.m110530g(this.f12916x, this.f12917y, this.f12918z, this.f12914E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC40662a.m131973q(this.f12916x, this.f12917y, this.f12918z, this.f12914E, (Composer) obj, iIntValue4);
        }
    }
}
