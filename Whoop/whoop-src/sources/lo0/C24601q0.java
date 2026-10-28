package lo0;

import com.whoop.design.util.TextResource;
import h11.C16613h;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lo0.q0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001b\u0010 ¨\u0006!"}, m65681d2 = {"Llo0/q0;", "", "Lcom/whoop/design/util/TextResource;", "selectionDisplay", "Lh11/h;", "dateDisplay", "", "Lm91/u;", "topItemViewStates", "Llo0/r0;", "scheduleSections", "<init>", "(Lcom/whoop/design/util/TextResource;Lh11/h;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lh11/h;", "()Lh11/h;", "Ljava/util/List;", "d", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24601q0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource selectionDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16613h dateDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> topItemViewStates;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C24603r0> scheduleSections;

    /* JADX WARN: Multi-variable type inference failed */
    public C24601q0(TextResource selectionDisplay, C16613h dateDisplay, List<? extends InterfaceC25312u> topItemViewStates, List<C24603r0> scheduleSections) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(topItemViewStates, "topItemViewStates");
        AbstractC22676k.m65750j(scheduleSections, "scheduleSections");
        this.selectionDisplay = selectionDisplay;
        this.dateDisplay = dateDisplay;
        this.topItemViewStates = topItemViewStates;
        this.scheduleSections = scheduleSections;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C16613h getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: b */
    public final List<C24603r0> m71837b() {
        return this.scheduleSections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getSelectionDisplay() {
        return this.selectionDisplay;
    }

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC25312u> m71839d() {
        return this.topItemViewStates;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24601q0)) {
            return false;
        }
        C24601q0 c24601q0 = (C24601q0) other;
        return AbstractC22676k.m65745e(this.selectionDisplay, c24601q0.selectionDisplay) && AbstractC22676k.m65745e(this.dateDisplay, c24601q0.dateDisplay) && AbstractC22676k.m65745e(this.topItemViewStates, c24601q0.topItemViewStates) && AbstractC22676k.m65745e(this.scheduleSections, c24601q0.scheduleSections);
    }

    public int hashCode() {
        return this.scheduleSections.hashCode() + AbstractC11895b.m31983b((this.dateDisplay.hashCode() + (this.selectionDisplay.hashCode() * 31)) * 31, 31, this.topItemViewStates);
    }

    public String toString() {
        TextResource textResource = this.selectionDisplay;
        C16613h c16613h = this.dateDisplay;
        List<InterfaceC25312u> list = this.topItemViewStates;
        List<C24603r0> list2 = this.scheduleSections;
        StringBuilder sb4 = new StringBuilder("VideoSchedulePillState(selectionDisplay=");
        sb4.append(textResource);
        sb4.append(", dateDisplay=");
        sb4.append(c16613h);
        sb4.append(", topItemViewStates=");
        return AbstractC30007c.m91843m(sb4, list, ", scheduleSections=", list2, ")");
    }
}
