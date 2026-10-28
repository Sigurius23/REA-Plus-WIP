package p401pj;

import android.graphics.Rect;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.NudgeStep;
import com.amplitude.android.engagement.types.PinPointerType;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p040c0.AbstractC3736e1;
import p040c0.C3733d1;
import p077d0.C11393q0;
import p390p1.AbstractC28683x;
import p558vp.AbstractC36259c;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: pj.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C29283q extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Modifier f118498E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f118499F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f118500G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f118501H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f118502I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118503w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f118504x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f118505y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f118506z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29283q(Nudge nudge, NudgeStep nudgeStep, PinPointerType pinPointerType, Modifier modifier, Rect rect, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        super(2);
        this.f118503w = i15;
        this.f118504x = nudge;
        this.f118505y = nudgeStep;
        this.f118506z = pinPointerType;
        this.f118498E = modifier;
        this.f118499F = rect;
        this.f118500G = interfaceC4339a;
        this.f118501H = i13;
        this.f118502I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f118503w) {
            case 0:
                ((Number) obj2).intValue();
                Nudge nudge = (Nudge) this.f118504x;
                NudgeStep nudgeStep = (NudgeStep) this.f118505y;
                PinPointerType pinPointerType = (PinPointerType) this.f118506z;
                Rect rect = (Rect) this.f118499F;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f118500G;
                AbstractC36259c.m115683c(nudge, nudgeStep, pinPointerType, this.f118498E, rect, interfaceC4339a, (Composer) obj, AbstractC28683x.m87244L(this.f118501H | 1), this.f118502I);
                break;
            case 1:
                ((Number) obj2).intValue();
                Nudge nudge2 = (Nudge) this.f118504x;
                NudgeStep nudgeStep2 = (NudgeStep) this.f118505y;
                PinPointerType pinPointerType2 = (PinPointerType) this.f118506z;
                Rect rect2 = (Rect) this.f118499F;
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) this.f118500G;
                AbstractC36259c.m115683c(nudge2, nudgeStep2, pinPointerType2, this.f118498E, rect2, interfaceC4339a2, (Composer) obj, AbstractC28683x.m87244L(this.f118501H | 1), this.f118502I);
                break;
            case 2:
                ((Number) obj2).intValue();
                Nudge nudge3 = (Nudge) this.f118504x;
                NudgeStep nudgeStep3 = (NudgeStep) this.f118505y;
                PinPointerType pinPointerType3 = (PinPointerType) this.f118506z;
                Rect rect3 = (Rect) this.f118499F;
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) this.f118500G;
                AbstractC36259c.m115683c(nudge3, nudgeStep3, pinPointerType3, this.f118498E, rect3, interfaceC4339a3, (Composer) obj, AbstractC28683x.m87244L(this.f118501H | 1), this.f118502I);
                break;
            default:
                ((Number) obj2).intValue();
                C11393q0 c11393q0 = (C11393q0) this.f118504x;
                C3733d1 c3733d1 = (C3733d1) this.f118505y;
                AbstractC3736e1 abstractC3736e1 = (AbstractC3736e1) this.f118506z;
                String str = (String) this.f118499F;
                C37816b c37816b = (C37816b) this.f118500G;
                AbstractC1090b.m3347b(c11393q0, this.f118498E, c3733d1, abstractC3736e1, str, c37816b, (Composer) obj, AbstractC28683x.m87244L(this.f118501H | 1), this.f118502I);
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29283q(C11393q0 c11393q0, Modifier modifier, C3733d1 c3733d1, AbstractC3736e1 abstractC3736e1, String str, C37816b c37816b, int i13, int i14) {
        super(2);
        this.f118503w = 3;
        this.f118504x = c11393q0;
        this.f118498E = modifier;
        this.f118505y = c3733d1;
        this.f118506z = abstractC3736e1;
        this.f118499F = str;
        this.f118500G = c37816b;
        this.f118501H = i13;
        this.f118502I = i14;
    }
}
