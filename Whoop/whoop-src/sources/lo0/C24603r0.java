package lo0;

import c13.AbstractC3855a;
import com.whoop.design.models.AppointmentButtonModel;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: lo0.r0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Llo0/r0;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "", "Lcom/whoop/design/models/AppointmentButtonModel;", "appointmentButtons", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "()Ljava/util/List;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24603r0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<AppointmentButtonModel> appointmentButtons;

    public C24603r0(String id4, TextResource title, List<AppointmentButtonModel> appointmentButtons) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(appointmentButtons, "appointmentButtons");
        this.id = id4;
        this.title = title;
        this.appointmentButtons = appointmentButtons;
    }

    /* JADX INFO: renamed from: a */
    public final List<AppointmentButtonModel> m71840a() {
        return this.appointmentButtons;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24603r0)) {
            return false;
        }
        C24603r0 c24603r0 = (C24603r0) other;
        return AbstractC22676k.m65745e(this.id, c24603r0.id) && AbstractC22676k.m65745e(this.title, c24603r0.title) && AbstractC22676k.m65745e(this.appointmentButtons, c24603r0.appointmentButtons);
    }

    public int hashCode() {
        return this.appointmentButtons.hashCode() + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        return AbstractC3855a.m11829m(AbstractC30007c.m91847q("VideoScheduleSectionState(id=", str, ", title=", textResource, ", appointmentButtons="), this.appointmentButtons, ")");
    }
}
