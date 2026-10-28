package p736sz0;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sz0.u1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lsz0/u1;", "Lm91/u;", "", "value", "Lcom/whoop/design/util/TextResource;", "textValue", "", "isEditable", "<init>", "(ILcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33224u1 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource textValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isEditable;

    public C33224u1(int i13, TextResource textValue, boolean z4) {
        AbstractC22676k.m65750j(textValue, "textValue");
        this.value = i13;
        this.textValue = textValue;
        this.isEditable = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTextValue() {
        return this.textValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEditable() {
        return this.isEditable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33224u1)) {
            return false;
        }
        C33224u1 c33224u1 = (C33224u1) other;
        return this.value == c33224u1.value && AbstractC22676k.m65745e(this.textValue, c33224u1.textValue) && this.isEditable == c33224u1.isEditable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEditable) + AbstractC31061c.m95625a(Integer.hashCode(this.value) * 31, this.textValue, 31);
    }

    public String toString() {
        int i13 = this.value;
        TextResource textResource = this.textValue;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91844n("ZoneValueState(value=", i13, ", textValue=", textResource, ", isEditable="), this.isEditable, ")");
    }
}
