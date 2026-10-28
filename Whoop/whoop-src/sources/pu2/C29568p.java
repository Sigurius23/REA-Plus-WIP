package pu2;

import com.whoop.design.util.TextResource;
import cu2.AbstractC11123c;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: pu2.p */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001a"}, m65681d2 = {"Lpu2/p;", "", "Lcom/whoop/design/util/TextResource;", "statText", "labelText", "", "statColor", "labelColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "c", "I", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C29568p {

    /* JADX INFO: renamed from: e */
    public static final int f120628e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource statText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource labelText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int statColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int labelColor;

    public C29568p(TextResource statText, TextResource labelText, int i13, int i14) {
        AbstractC22676k.m65750j(statText, "statText");
        AbstractC22676k.m65750j(labelText, "labelText");
        this.statText = statText;
        this.labelText = labelText;
        this.statColor = i13;
        this.labelColor = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabelText() {
        return this.labelText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getStatColor() {
        return this.statColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getStatText() {
        return this.statText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C29568p)) {
            return false;
        }
        C29568p c29568p = (C29568p) other;
        return AbstractC22676k.m65745e(this.statText, c29568p.statText) && AbstractC22676k.m65745e(this.labelText, c29568p.labelText) && this.statColor == c29568p.statColor && this.labelColor == c29568p.labelColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.labelColor) + AbstractC11266d.m30448b(this.statColor, AbstractC31061c.m95625a(this.statText.hashCode() * 31, this.labelText, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.statText;
        TextResource textResource2 = this.labelText;
        return AbstractC26725a.m79505i(AbstractC33745d.m106658q("NotificationExerciseStatState(statText=", textResource, ", labelText=", textResource2, ", statColor="), this.statColor, ", labelColor=", this.labelColor, ")");
    }

    public /* synthetic */ C29568p(TextResource textResource, TextResource textResource2, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, (i15 & 4) != 0 ? AbstractC11123c.f35347d : i13, (i15 & 8) != 0 ? AbstractC11123c.f35353j : i14);
    }
}
