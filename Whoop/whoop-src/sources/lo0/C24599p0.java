package lo0;

import com.whoop.design.models.modal.AnyModal;
import gz0.EnumC16313m0;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lo0.p0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Llo0/p0;", "", "Lgz0/m0;", "icon", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "", "contentDescription", "<init>", "(Lgz0/m0;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "b", "()Lgz0/m0;", "Lcom/whoop/design/models/modal/AnyModal;", "c", "()Lcom/whoop/design/models/modal/AnyModal;", "Ljava/lang/String;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24599p0 {

    /* JADX INFO: renamed from: d */
    public static final int f96139d = AnyModal.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AnyModal modal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String contentDescription;

    public C24599p0(EnumC16313m0 icon, AnyModal anyModal, String str) {
        AbstractC22676k.m65750j(icon, "icon");
        this.icon = icon;
        this.modal = anyModal;
        this.contentDescription = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24599p0)) {
            return false;
        }
        C24599p0 c24599p0 = (C24599p0) other;
        return this.icon == c24599p0.icon && AbstractC22676k.m65745e(this.modal, c24599p0.modal) && AbstractC22676k.m65745e(this.contentDescription, c24599p0.contentDescription);
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        AnyModal anyModal = this.modal;
        int iHashCode2 = (iHashCode + (anyModal == null ? 0 : anyModal.hashCode())) * 31;
        String str = this.contentDescription;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        AnyModal anyModal = this.modal;
        String str = this.contentDescription;
        StringBuilder sb4 = new StringBuilder("TappableIconViewState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", modal=");
        sb4.append(anyModal);
        sb4.append(", contentDescription=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C24599p0(EnumC16313m0 enumC16313m0, AnyModal anyModal, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, (i13 & 2) != 0 ? null : anyModal, (i13 & 4) != 0 ? null : str);
    }
}
