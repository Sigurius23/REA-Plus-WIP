package p370oj;

import ad3.C0775r;
import c93.InterfaceC4339a;
import ch.C4582c;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.SimpleNudgeTriggerType;
import com.amplitude.android.engagement.types.Trigger;
import com.amplitude.android.engagement.types.TriggerConfig;
import com.amplitude.android.engagement.types.TriggerData;
import com.amplitude.android.engagement.types.TriggerEventOverrides;
import com.amplitude.android.engagement.types.TriggerEventPayload;
import com.amplitude.android.engagement.types.TriggerSource;
import com.amplitude.android.engagement.types.TriggerSourceProperties;
import com.amplitude.android.engagement.types.TriggerSourceType;
import com.amplitude.android.engagement.types.TriggerType;
import com.google.crypto.tink.internal.C5101l0;
import l83.C23454a0;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p197hj.C17331n;
import p305lj.C24445o0;
import p305lj.C24447p0;
import p585wj.AbstractC37316b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oj.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C27960g extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112758w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f112759x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f112760y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27960g(C4861a c4861a, InterfaceC4339a interfaceC4339a, int i13) {
        super(1);
        this.f112758w = i13;
        this.f112759x = c4861a;
        this.f112760y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strM1833d;
        String strM1833d2;
        String strM1833d3;
        String strM1833d4;
        switch (this.f112758w) {
            case 0:
                Nudge nudge = (Nudge) obj;
                C4582c c4582c = new C4582c(this.f112760y, 7);
                TriggerConfig triggerConfig = nudge != null ? nudge.getTriggerConfig() : null;
                if (nudge != null && (triggerConfig instanceof C24445o0)) {
                    TriggerType triggerType = TriggerType.ANALYTICS_EVENT;
                    TriggerEventPayload triggerEventPayload = new TriggerEventPayload((Integer) null, new Trigger(triggerType, new TriggerData(((C24445o0) triggerConfig).f95325a.getData().getEvent(), C25272z.f99163w)), new TriggerSource(TriggerSourceType.TRIGGER, new TriggerSourceProperties(triggerType)), new TriggerEventOverrides(Boolean.TRUE), 1, (DefaultConstructorMarker) null);
                    c4582c.invoke();
                    C5101l0 c5101l0 = C4861a.f20259o;
                    c5101l0.m16030H(new C17331n(nudge, triggerEventPayload, 1));
                    try {
                        C0775r c0775r = AbstractC37316b.f159546a;
                        c0775r.getClass();
                        strM1833d = c0775r.m1833d(Nudge.Companion.serializer(), nudge);
                    } catch (Exception e5) {
                        c5101l0.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to serialize to JSON string: ")));
                        strM1833d = null;
                    }
                    if (strM1833d != null) {
                        try {
                            C0775r c0775r2 = AbstractC37316b.f159546a;
                            c0775r2.getClass();
                            strM1833d2 = c0775r2.m1833d(TriggerEventPayload.Companion.serializer(), triggerEventPayload);
                        } catch (Exception e13) {
                            c5101l0.m16067m0(AbstractC2875y.m8298k(e13, new StringBuilder("Failed to serialize to JSON string: ")));
                            strM1833d2 = null;
                        }
                        if (strM1833d2 != null) {
                            this.f112759x.f20263d.m53801a("globalThis.nudgeActions.sendDirectedTrigger(" + strM1833d + ", " + strM1833d2 + ')', null);
                        }
                    }
                }
                break;
            default:
                Nudge nudge2 = (Nudge) obj;
                C4582c c4582c2 = new C4582c(this.f112760y, 8);
                C5101l0 c5101l1 = C4861a.f20259o;
                StringBuilder sb4 = new StringBuilder("triggerNone called with nudge: ");
                sb4.append(nudge2 != null ? nudge2.getTitle() : null);
                c5101l1.m16031I(sb4.toString());
                TriggerConfig triggerConfig2 = nudge2 != null ? nudge2.getTriggerConfig() : null;
                if (nudge2 != null && (triggerConfig2 instanceof C24447p0) && ((C24447p0) triggerConfig2).f95326a.getType() == SimpleNudgeTriggerType.NONE) {
                    TriggerEventPayload triggerEventPayload2 = new TriggerEventPayload(Integer.valueOf(nudge2.getVariantId()), new Trigger(TriggerType.DIRECT, (TriggerData) null, 2, (DefaultConstructorMarker) null), new TriggerSource(TriggerSourceType.DEBUG, (TriggerSourceProperties) null, 2, (DefaultConstructorMarker) null), (TriggerEventOverrides) null, 8, (DefaultConstructorMarker) null);
                    c5101l1.m16031I("triggerNone calling forceTriggerSingleNudge with payload: " + triggerEventPayload2);
                    c4582c2.invoke();
                    c5101l1.m16030H(new C17331n(nudge2, triggerEventPayload2, 0));
                    try {
                        C0775r c0775r3 = AbstractC37316b.f159546a;
                        c0775r3.getClass();
                        strM1833d3 = c0775r3.m1833d(Nudge.Companion.serializer(), nudge2);
                    } catch (Exception e14) {
                        c5101l1.m16067m0(AbstractC2875y.m8298k(e14, new StringBuilder("Failed to serialize to JSON string: ")));
                        strM1833d3 = null;
                    }
                    if (strM1833d3 != null) {
                        try {
                            C0775r c0775r4 = AbstractC37316b.f159546a;
                            c0775r4.getClass();
                            strM1833d4 = c0775r4.m1833d(TriggerEventPayload.Companion.serializer(), triggerEventPayload2);
                        } catch (Exception e15) {
                            c5101l1.m16067m0(AbstractC2875y.m8298k(e15, new StringBuilder("Failed to serialize to JSON string: ")));
                            strM1833d4 = null;
                        }
                        if (strM1833d4 != null) {
                            this.f112759x.f20263d.m53801a("globalThis.nudgeActions.forceTriggerSingleNudge(" + strM1833d3 + ", " + strM1833d4 + ')', null);
                        }
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("triggerNone validation failed - nudge: ");
                    sb5.append(nudge2);
                    sb5.append(", triggerConfig: ");
                    sb5.append(triggerConfig2);
                    sb5.append(", type: ");
                    C24447p0 c24447p0 = triggerConfig2 instanceof C24447p0 ? (C24447p0) triggerConfig2 : null;
                    sb5.append(c24447p0 != null ? c24447p0.f95326a.getType() : null);
                    c5101l1.m16031I(sb5.toString());
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
