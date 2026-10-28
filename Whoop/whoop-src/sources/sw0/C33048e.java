package sw0;

import c13.AbstractC3855a;
import hc3.AbstractC17176i;
import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: sw0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b%\u0010\u0012R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#¨\u0006'"}, m65681d2 = {"Lsw0/e;", "", "Lsw0/c;", "currentDialogType", "Lsw0/g;", "bottomSheetDomainState", "", "", "selectedCustomBehaviors", "performFuzzySearch", "", "Lsw0/j;", "removedWeeklyPlanBehaviors", "<init>", "(Lsw0/c;Lsw0/g;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "a", "(Lsw0/c;Lsw0/g;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lsw0/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsw0/c;", "d", "()Lsw0/c;", "b", "Lsw0/g;", "c", "()Lsw0/g;", "Ljava/util/List;", "g", "()Ljava/util/List;", "Ljava/lang/String;", "e", "f", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33048e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33046c currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C33050g bottomSheetDomainState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<String> selectedCustomBehaviors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String performFuzzySearch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C33053j> removedWeeklyPlanBehaviors;

    public C33048e(InterfaceC33046c interfaceC33046c, C33050g c33050g, List<String> selectedCustomBehaviors, String str, List<C33053j> removedWeeklyPlanBehaviors) {
        AbstractC22676k.m65750j(selectedCustomBehaviors, "selectedCustomBehaviors");
        AbstractC22676k.m65750j(removedWeeklyPlanBehaviors, "removedWeeklyPlanBehaviors");
        this.currentDialogType = interfaceC33046c;
        this.bottomSheetDomainState = c33050g;
        this.selectedCustomBehaviors = selectedCustomBehaviors;
        this.performFuzzySearch = str;
        this.removedWeeklyPlanBehaviors = removedWeeklyPlanBehaviors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C33048e m104599b(C33048e c33048e, InterfaceC33046c interfaceC33046c, C33050g c33050g, List list, String str, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            interfaceC33046c = c33048e.currentDialogType;
        }
        if ((i13 & 2) != 0) {
            c33050g = c33048e.bottomSheetDomainState;
        }
        if ((i13 & 4) != 0) {
            list = c33048e.selectedCustomBehaviors;
        }
        if ((i13 & 8) != 0) {
            str = c33048e.performFuzzySearch;
        }
        if ((i13 & 16) != 0) {
            list2 = c33048e.removedWeeklyPlanBehaviors;
        }
        List list3 = list2;
        List list4 = list;
        return c33048e.m104600a(interfaceC33046c, c33050g, list4, str, list3);
    }

    /* JADX INFO: renamed from: a */
    public final C33048e m104600a(InterfaceC33046c currentDialogType, C33050g bottomSheetDomainState, List<String> selectedCustomBehaviors, String performFuzzySearch, List<C33053j> removedWeeklyPlanBehaviors) {
        AbstractC22676k.m65750j(selectedCustomBehaviors, "selectedCustomBehaviors");
        AbstractC22676k.m65750j(removedWeeklyPlanBehaviors, "removedWeeklyPlanBehaviors");
        return new C33048e(currentDialogType, bottomSheetDomainState, selectedCustomBehaviors, performFuzzySearch, removedWeeklyPlanBehaviors);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33050g getBottomSheetDomainState() {
        return this.bottomSheetDomainState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC33046c getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPerformFuzzySearch() {
        return this.performFuzzySearch;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33048e)) {
            return false;
        }
        C33048e c33048e = (C33048e) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c33048e.currentDialogType) && AbstractC22676k.m65745e(this.bottomSheetDomainState, c33048e.bottomSheetDomainState) && AbstractC22676k.m65745e(this.selectedCustomBehaviors, c33048e.selectedCustomBehaviors) && AbstractC22676k.m65745e(this.performFuzzySearch, c33048e.performFuzzySearch) && AbstractC22676k.m65745e(this.removedWeeklyPlanBehaviors, c33048e.removedWeeklyPlanBehaviors);
    }

    /* JADX INFO: renamed from: f */
    public final List<C33053j> m104604f() {
        return this.removedWeeklyPlanBehaviors;
    }

    /* JADX INFO: renamed from: g */
    public final List<String> m104605g() {
        return this.selectedCustomBehaviors;
    }

    public int hashCode() {
        InterfaceC33046c interfaceC33046c = this.currentDialogType;
        int iHashCode = (interfaceC33046c == null ? 0 : interfaceC33046c.hashCode()) * 31;
        C33050g c33050g = this.bottomSheetDomainState;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (c33050g == null ? 0 : c33050g.hashCode())) * 31, 31, this.selectedCustomBehaviors);
        String str = this.performFuzzySearch;
        return this.removedWeeklyPlanBehaviors.hashCode() + ((iM31983b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        InterfaceC33046c interfaceC33046c = this.currentDialogType;
        C33050g c33050g = this.bottomSheetDomainState;
        List<String> list = this.selectedCustomBehaviors;
        String str = this.performFuzzySearch;
        List<C33053j> list2 = this.removedWeeklyPlanBehaviors;
        StringBuilder sb4 = new StringBuilder("CustomBottomSheetDomainState(currentDialogType=");
        sb4.append(interfaceC33046c);
        sb4.append(", bottomSheetDomainState=");
        sb4.append(c33050g);
        sb4.append(", selectedCustomBehaviors=");
        AbstractC17176i.m48511m(", performFuzzySearch=", str, ", removedWeeklyPlanBehaviors=", sb4, list);
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    public /* synthetic */ C33048e(InterfaceC33046c interfaceC33046c, C33050g c33050g, List list, String str, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC33046c, (i13 & 2) != 0 ? null : c33050g, (i13 & 4) != 0 ? new ArrayList() : list, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? C25271y.f99162w : list2);
    }
}
