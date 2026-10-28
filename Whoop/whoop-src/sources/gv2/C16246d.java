package gv2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;
import y71.C39282o;

/* JADX INFO: renamed from: gv2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lgv2/d;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "label", "", "items", "Ly71/o;", "dropDownButton", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly71/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Ly71/o;", "()Ly71/o;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16246d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39282o dropDownButton;

    /* JADX WARN: Multi-variable type inference failed */
    public C16246d(TextResource label, List<? extends InterfaceC25312u> items, C39282o dropDownButton) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(dropDownButton, "dropDownButton");
        this.label = label;
        this.items = items;
        this.dropDownButton = dropDownButton;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C39282o getDropDownButton() {
        return this.dropDownButton;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m46058b() {
        return this.items;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16246d)) {
            return false;
        }
        C16246d c16246d = (C16246d) other;
        return AbstractC22676k.m65745e(this.label, c16246d.label) && AbstractC22676k.m65745e(this.items, c16246d.items) && AbstractC22676k.m65745e(this.dropDownButton, c16246d.dropDownButton);
    }

    public int hashCode() {
        return this.dropDownButton.hashCode() + AbstractC11895b.m31983b(this.label.hashCode() * 31, 31, this.items);
    }

    public String toString() {
        TextResource textResource = this.label;
        List<InterfaceC25312u> list = this.items;
        C39282o c39282o = this.dropDownButton;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "ExerciseTagDropdown(label=", ", items=", ", dropDownButton=", list);
        sbM106657p.append(c39282o);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
