package p370oj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.types.DebugStatus;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.SimpleNudgeTriggerType;
import com.amplitude.android.engagement.types.SimulationContext;
import com.amplitude.android.engagement.types.TriggerConfig;
import com.squareup.wire.AbstractC5583n;
import l83.C23454a0;
import p005a3.C0271z0;
import p048ce.AbstractC4482w;
import p305lj.C24445o0;
import p305lj.C24447p0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: oj.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C27976w extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f112810E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112811w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Nudge f112812x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27960g f112813y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C27960g f112814z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27976w(DebugStatus debugStatus, Nudge nudge, C27960g c27960g, C27960g c27960g2) {
        super(2);
        this.f112810E = debugStatus;
        this.f112812x = nudge;
        this.f112813y = c27960g;
        this.f112814z = c27960g2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0043, please report this as an issue */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        DebugStatus debugStatus;
        Nudge nudge;
        TriggerConfig triggerConfig;
        switch (this.f112811w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                DebugStatus debugStatus2 = (DebugStatus) this.f112810E;
                if ((iIntValue & 11) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        c28655q = (C28655q) composer;
                        c28655q.m87152f0(52450122);
                        debugStatus = DebugStatus.INFO;
                        nudge = this.f112812x;
                        if (debugStatus2 == debugStatus) {
                            if (nudge != null) {
                                triggerConfig = nudge.getTriggerConfig();
                            } else {
                                triggerConfig = null;
                            }
                            if (triggerConfig instanceof C24445o0) {
                                AbstractC36259c.m115681b(new C0271z0(21, this.f112813y, nudge), AbstractC4482w.m13976L(), "Manually trigger event", null, c28655q, 384);
                            }
                        }
                        c28655q.m87173q(false);
                        if (debugStatus2 == debugStatus) {
                            if (((nudge != null ? nudge.getTriggerConfig() : null) instanceof C24447p0) && ((C24447p0) nudge.getTriggerConfig()).f95326a.getType() == SimpleNudgeTriggerType.NONE) {
                                AbstractC36259c.m115681b(new C0271z0(22, this.f112814z, nudge), AbstractC4482w.m13976L(), "Manually trigger", null, c28655q, 384);
                            }
                        }
                    }
                } else {
                    c28655q = (C28655q) composer;
                    c28655q.m87152f0(52450122);
                    debugStatus = DebugStatus.INFO;
                    nudge = this.f112812x;
                    if (debugStatus2 == debugStatus) {
                        if (nudge != null) {
                            triggerConfig = nudge.getTriggerConfig();
                        } else {
                            triggerConfig = null;
                        }
                        if (triggerConfig instanceof C24445o0) {
                            AbstractC36259c.m115681b(new C0271z0(21, this.f112813y, nudge), AbstractC4482w.m13976L(), "Manually trigger event", null, c28655q, 384);
                        }
                    }
                    c28655q.m87173q(false);
                    if (debugStatus2 == debugStatus) {
                        if ((nudge != null ? nudge.getTriggerConfig() : null) instanceof C24447p0) {
                            AbstractC36259c.m115681b(new C0271z0(22, this.f112814z, nudge), AbstractC4482w.m13976L(), "Manually trigger", null, c28655q, 384);
                        }
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC5583n.m16779g(this.f112812x, (SimulationContext) this.f112810E, this.f112813y, this.f112814z, (Composer) obj, AbstractC28683x.m87244L(73));
                break;
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27976w(Nudge nudge, SimulationContext simulationContext, C27960g c27960g, C27960g c27960g2, int i13) {
        super(2);
        this.f112812x = nudge;
        this.f112810E = simulationContext;
        this.f112813y = c27960g;
        this.f112814z = c27960g2;
    }
}
