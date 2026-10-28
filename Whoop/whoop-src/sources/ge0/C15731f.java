package ge0;

import de0.C11980a;
import i11.C17863f;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ge0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ@\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lge0/f;", "Lm91/u;", "", "id", "", "Lge0/a;", "schedulingDatePickerItems", "Li11/f;", "dateSelectorState", "Lde0/a;", "selectedAppointment", "<init>", "(Ljava/lang/String;Ljava/util/List;Li11/f;Lde0/a;)V", "a", "(Ljava/lang/String;Ljava/util/List;Li11/f;Lde0/a;)Lge0/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Li11/f;", "()Li11/f;", "d", "Lde0/a;", "getSelectedAppointment", "()Lde0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15731f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C15726a> schedulingDatePickerItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17863f dateSelectorState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C11980a selectedAppointment;

    public C15731f(String id4, List<C15726a> schedulingDatePickerItems, C17863f dateSelectorState, C11980a c11980a) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(schedulingDatePickerItems, "schedulingDatePickerItems");
        AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
        this.id = id4;
        this.schedulingDatePickerItems = schedulingDatePickerItems;
        this.dateSelectorState = dateSelectorState;
        this.selectedAppointment = c11980a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C15731f m44337b(C15731f c15731f, String str, List list, C17863f c17863f, C11980a c11980a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c15731f.id;
        }
        if ((i13 & 2) != 0) {
            list = c15731f.schedulingDatePickerItems;
        }
        if ((i13 & 4) != 0) {
            c17863f = c15731f.dateSelectorState;
        }
        if ((i13 & 8) != 0) {
            c11980a = c15731f.selectedAppointment;
        }
        return c15731f.m44338a(str, list, c17863f, c11980a);
    }

    /* JADX INFO: renamed from: a */
    public final C15731f m44338a(String id4, List<C15726a> schedulingDatePickerItems, C17863f dateSelectorState, C11980a selectedAppointment) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(schedulingDatePickerItems, "schedulingDatePickerItems");
        AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
        return new C15731f(id4, schedulingDatePickerItems, dateSelectorState, selectedAppointment);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17863f getDateSelectorState() {
        return this.dateSelectorState;
    }

    /* JADX INFO: renamed from: e */
    public final List<C15726a> m44340e() {
        return this.schedulingDatePickerItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15731f)) {
            return false;
        }
        C15731f c15731f = (C15731f) other;
        return AbstractC22676k.m65745e(this.id, c15731f.id) && AbstractC22676k.m65745e(this.schedulingDatePickerItems, c15731f.schedulingDatePickerItems) && AbstractC22676k.m65745e(this.dateSelectorState, c15731f.dateSelectorState) && AbstractC22676k.m65745e(this.selectedAppointment, c15731f.selectedAppointment);
    }

    public int hashCode() {
        int iHashCode = (this.dateSelectorState.hashCode() + AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.schedulingDatePickerItems)) * 31;
        C11980a c11980a = this.selectedAppointment;
        return iHashCode + (c11980a == null ? 0 : c11980a.hashCode());
    }

    public String toString() {
        String str = this.id;
        List<C15726a> list = this.schedulingDatePickerItems;
        C17863f c17863f = this.dateSelectorState;
        C11980a c11980a = this.selectedAppointment;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SchedulingDatePickerViewState(id=", str, ", schedulingDatePickerItems=", ", dateSelectorState=", list);
        sbM94766o.append(c17863f);
        sbM94766o.append(", selectedAppointment=");
        sbM94766o.append(c11980a);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ C15731f(String str, List list, C17863f c17863f, C11980a c11980a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, c17863f, (i13 & 8) != 0 ? null : c11980a);
    }
}
