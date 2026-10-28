package sj;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.NudgeStep;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p478s3.AbstractC32098d;
import p715kotlin.jvm.internal.AbstractC22680m;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: sj.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32553d extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134869w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ NudgeStep f134870x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C32561l f134871y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f134872z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C32553d(NudgeStep nudgeStep, C32561l c32561l, Modifier modifier, int i13, int i14) {
        super(2);
        this.f134869w = i14;
        this.f134870x = nudgeStep;
        this.f134871y = c32561l;
        this.f134872z = modifier;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f134869w;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i13) {
            case 0:
                AbstractC32098d.m99835a(this.f134870x, this.f134871y, this.f134872z, composer, AbstractC28683x.m87244L(73));
                break;
            default:
                AbstractC32103e.m99881c(this.f134870x, this.f134871y, this.f134872z, composer, AbstractC28683x.m87244L(73));
                break;
        }
        return C23454a0.f92919a;
    }
}
