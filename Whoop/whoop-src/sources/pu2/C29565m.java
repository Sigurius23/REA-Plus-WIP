package pu2;

import n71.C26423d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q81.InterfaceC30052j;

/* JADX INFO: renamed from: pu2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lpu2/m;", "", "Lq81/j;", "setTimerState", "Ln71/d;", "heartRateMonitorState", "Lpu2/l;", "bottomSlotState", "<init>", "(Lq81/j;Ln71/d;Lpu2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq81/j;", "c", "()Lq81/j;", "b", "Ln71/d;", "()Ln71/d;", "Lpu2/l;", "()Lpu2/l;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29565m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC30052j setTimerState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26423d heartRateMonitorState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29564l bottomSlotState;

    public C29565m(InterfaceC30052j setTimerState, C26423d heartRateMonitorState, C29564l bottomSlotState) {
        AbstractC22676k.m65750j(setTimerState, "setTimerState");
        AbstractC22676k.m65750j(heartRateMonitorState, "heartRateMonitorState");
        AbstractC22676k.m65750j(bottomSlotState, "bottomSlotState");
        this.setTimerState = setTimerState;
        this.heartRateMonitorState = heartRateMonitorState;
        this.bottomSlotState = bottomSlotState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C29564l getBottomSlotState() {
        return this.bottomSlotState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C26423d getHeartRateMonitorState() {
        return this.heartRateMonitorState;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC30052j getSetTimerState() {
        return this.setTimerState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29565m)) {
            return false;
        }
        C29565m c29565m = (C29565m) other;
        return AbstractC22676k.m65745e(this.setTimerState, c29565m.setTimerState) && AbstractC22676k.m65745e(this.heartRateMonitorState, c29565m.heartRateMonitorState) && AbstractC22676k.m65745e(this.bottomSlotState, c29565m.bottomSlotState);
    }

    public int hashCode() {
        return this.bottomSlotState.hashCode() + ((this.heartRateMonitorState.hashCode() + (this.setTimerState.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "LiveSessionTabState(setTimerState=" + this.setTimerState + ", heartRateMonitorState=" + this.heartRateMonitorState + ", bottomSlotState=" + this.bottomSlotState + ")";
    }
}
