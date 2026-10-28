package p328mj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.BannerFormFactor;
import com.amplitude.android.engagement.types.FormFactor;
import com.amplitude.android.engagement.types.ModalFormFactor;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.PinFormFactor;
import com.amplitude.android.engagement.types.PopoverFormFactor;
import com.amplitude.android.engagement.types.TooltipFormFactor;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22680m;
import x30.AbstractC37926s0;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: mj.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C25604k extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f100448E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f100449w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f100450x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ NudgeStep f100451y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C25607n f100452z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25604k(Nudge nudge, NudgeStep nudgeStep, C25607n c25607n, int i13, int i14) {
        super(2);
        this.f100449w = i14;
        switch (i14) {
            case 2:
                this.f100450x = nudge;
                this.f100451y = nudgeStep;
                this.f100452z = c25607n;
                this.f100448E = i13;
                super(2);
                break;
            default:
                this.f100450x = nudge;
                this.f100451y = nudgeStep;
                this.f100452z = c25607n;
                this.f100448E = i13;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        NudgeStep nudgeStep;
        FormFactor formFactor;
        boolean z4;
        C25607n c25607n;
        Nudge nudge;
        switch (this.f100449w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        nudgeStep = this.f100451y;
                        if (nudgeStep != null) {
                            formFactor = nudgeStep.getFormFactor();
                            z4 = formFactor instanceof ModalFormFactor;
                            c25607n = this.f100452z;
                            nudge = this.f100450x;
                            if (z4) {
                                C28655q c28655q2 = (C28655q) composer;
                                c28655q2.m87152f0(1213106941);
                                AbstractC35903f.m114007b(nudge, this.f100451y, this.f100448E, c25607n, c28655q2, 72);
                                c28655q2.m87173q(false);
                            } else if (formFactor instanceof PopoverFormFactor) {
                                C28655q c28655q3 = (C28655q) composer;
                                c28655q3.m87152f0(1213107102);
                                AbstractC37926s0.m121469g(nudge, this.f100451y, this.f100448E, c25607n, c28655q3, 72);
                                c28655q3.m87173q(false);
                            } else if (formFactor instanceof BannerFormFactor) {
                                C28655q c28655q4 = (C28655q) composer;
                                c28655q4.m87152f0(1213107264);
                                AbstractC35785b.m113408c(nudge, nudgeStep, c25607n, c28655q4, 72);
                                c28655q4.m87173q(false);
                            } else if (formFactor instanceof PinFormFactor) {
                                C28655q c28655q5 = (C28655q) composer;
                                c28655q5.m87152f0(1213107399);
                                AbstractC36259c.m115707s(nudge, nudgeStep, c25607n, c28655q5, 72);
                                c28655q5.m87173q(false);
                            } else if (formFactor instanceof TooltipFormFactor) {
                                C28655q c28655q6 = (C28655q) composer;
                                c28655q6.m87152f0(1213107535);
                                AbstractC37978j.m121648i(nudge, nudgeStep, c28655q6, 72);
                                c28655q6.m87173q(false);
                            } else {
                                C28655q c28655q7 = (C28655q) composer;
                                c28655q7.m87152f0(1213107628);
                                c28655q7.m87173q(false);
                            }
                        }
                    }
                } else {
                    nudgeStep = this.f100451y;
                    if (nudgeStep != null) {
                        formFactor = nudgeStep.getFormFactor();
                        z4 = formFactor instanceof ModalFormFactor;
                        c25607n = this.f100452z;
                        nudge = this.f100450x;
                        if (z4) {
                            C28655q c28655q8 = (C28655q) composer;
                            c28655q8.m87152f0(1213106941);
                            AbstractC35903f.m114007b(nudge, this.f100451y, this.f100448E, c25607n, c28655q8, 72);
                            c28655q8.m87173q(false);
                        } else if (formFactor instanceof PopoverFormFactor) {
                            C28655q c28655q9 = (C28655q) composer;
                            c28655q9.m87152f0(1213107102);
                            AbstractC37926s0.m121469g(nudge, this.f100451y, this.f100448E, c25607n, c28655q9, 72);
                            c28655q9.m87173q(false);
                        } else if (formFactor instanceof BannerFormFactor) {
                            C28655q c28655q10 = (C28655q) composer;
                            c28655q10.m87152f0(1213107264);
                            AbstractC35785b.m113408c(nudge, nudgeStep, c25607n, c28655q10, 72);
                            c28655q10.m87173q(false);
                        } else if (formFactor instanceof PinFormFactor) {
                            C28655q c28655q11 = (C28655q) composer;
                            c28655q11.m87152f0(1213107399);
                            AbstractC36259c.m115707s(nudge, nudgeStep, c25607n, c28655q11, 72);
                            c28655q11.m87173q(false);
                        } else if (formFactor instanceof TooltipFormFactor) {
                            C28655q c28655q12 = (C28655q) composer;
                            c28655q12.m87152f0(1213107535);
                            AbstractC37978j.m121648i(nudge, nudgeStep, c28655q12, 72);
                            c28655q12.m87173q(false);
                        } else {
                            C28655q c28655q13 = (C28655q) composer;
                            c28655q13.m87152f0(1213107628);
                            c28655q13.m87173q(false);
                        }
                    }
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM87244L = AbstractC28683x.m87244L(this.f100448E | 1);
                AbstractC36259c.m115707s(this.f100450x, this.f100451y, this.f100452z, (Composer) obj, iM87244L);
                break;
            default:
                ((Number) obj2).intValue();
                int iM87244L2 = AbstractC28683x.m87244L(this.f100448E | 1);
                AbstractC36259c.m115707s(this.f100450x, this.f100451y, this.f100452z, (Composer) obj, iM87244L2);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25604k(NudgeStep nudgeStep, Nudge nudge, int i13, C25607n c25607n, int i14) {
        super(2);
        this.f100449w = 0;
        this.f100451y = nudgeStep;
        this.f100450x = nudge;
        this.f100448E = i13;
        this.f100452z = c25607n;
    }
}
