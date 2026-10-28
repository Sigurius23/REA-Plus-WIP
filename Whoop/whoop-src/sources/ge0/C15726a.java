package ge0;

import h11.C16613h;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ge0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lge0/a;", "", "", "selectionDisplay", "", "Lm91/u;", "scheduleTiles", "Lh11/h;", "datePillState", "infoCalloutState", "<init>", "(Ljava/lang/String;Ljava/util/List;Lh11/h;Lm91/u;)V", "a", "(Ljava/lang/String;Ljava/util/List;Lh11/h;Lm91/u;)Lge0/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lh11/h;", "()Lh11/h;", "d", "Lm91/u;", "()Lm91/u;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15726a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String selectionDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> scheduleTiles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16613h datePillState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u infoCalloutState;

    /* JADX WARN: Multi-variable type inference failed */
    public C15726a(String selectionDisplay, List<? extends InterfaceC25312u> scheduleTiles, C16613h datePillState, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(scheduleTiles, "scheduleTiles");
        AbstractC22676k.m65750j(datePillState, "datePillState");
        this.selectionDisplay = selectionDisplay;
        this.scheduleTiles = scheduleTiles;
        this.datePillState = datePillState;
        this.infoCalloutState = interfaceC25312u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15726a m44303b(C15726a c15726a, String str, List list, C16613h c16613h, InterfaceC25312u interfaceC25312u, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c15726a.selectionDisplay;
        }
        if ((i13 & 2) != 0) {
            list = c15726a.scheduleTiles;
        }
        if ((i13 & 4) != 0) {
            c16613h = c15726a.datePillState;
        }
        if ((i13 & 8) != 0) {
            interfaceC25312u = c15726a.infoCalloutState;
        }
        return c15726a.m44304a(str, list, c16613h, interfaceC25312u);
    }

    /* JADX INFO: renamed from: a */
    public final C15726a m44304a(String selectionDisplay, List<? extends InterfaceC25312u> scheduleTiles, C16613h datePillState, InterfaceC25312u infoCalloutState) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(scheduleTiles, "scheduleTiles");
        AbstractC22676k.m65750j(datePillState, "datePillState");
        return new C15726a(selectionDisplay, scheduleTiles, datePillState, infoCalloutState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16613h getDatePillState() {
        return this.datePillState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC25312u getInfoCalloutState() {
        return this.infoCalloutState;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m44307e() {
        return this.scheduleTiles;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15726a)) {
            return false;
        }
        C15726a c15726a = (C15726a) other;
        return AbstractC22676k.m65745e(this.selectionDisplay, c15726a.selectionDisplay) && AbstractC22676k.m65745e(this.scheduleTiles, c15726a.scheduleTiles) && AbstractC22676k.m65745e(this.datePillState, c15726a.datePillState) && AbstractC22676k.m65745e(this.infoCalloutState, c15726a.infoCalloutState);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectionDisplay() {
        return this.selectionDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.datePillState.hashCode() + AbstractC11895b.m31983b(this.selectionDisplay.hashCode() * 31, 31, this.scheduleTiles)) * 31;
        InterfaceC25312u interfaceC25312u = this.infoCalloutState;
        return iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode());
    }

    public String toString() {
        String str = this.selectionDisplay;
        List<InterfaceC25312u> list = this.scheduleTiles;
        C16613h c16613h = this.datePillState;
        InterfaceC25312u interfaceC25312u = this.infoCalloutState;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SchedulePillViewState(selectionDisplay=", str, ", scheduleTiles=", ", datePillState=", list);
        sbM94766o.append(c16613h);
        sbM94766o.append(", infoCalloutState=");
        sbM94766o.append(interfaceC25312u);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
