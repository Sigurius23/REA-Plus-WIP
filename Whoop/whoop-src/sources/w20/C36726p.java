package w20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32072d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: w20.p */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36726p implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f157214E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f157215F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157216w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f157217x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f157218y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C36736z f157219z;

    public /* synthetic */ C36726p(String str, boolean z4, C36736z c36736z, Function1 function1, int i13, int i14) {
        this.f157216w = i14;
        this.f157217x = str;
        this.f157218y = z4;
        this.f157219z = c36736z;
        this.f157214E = function1;
        this.f157215F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157216w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC32072d.m99695d(this.f157217x, this.f157218y, this.f157219z, this.f157214E, (Composer) obj, AbstractC28683x.m87244L(this.f157215F | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC32072d.m99693b(this.f157217x, this.f157218y, this.f157219z, this.f157214E, (Composer) obj, AbstractC28683x.m87244L(this.f157215F | 1));
                break;
        }
        return C23454a0.f92919a;
    }
}
