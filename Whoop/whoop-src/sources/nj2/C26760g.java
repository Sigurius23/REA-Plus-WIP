package nj2;

import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: nj2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lnj2/g;", "", "Lcom/whoop/design/util/TextResource;", "instructionTitle", "instructionDescription", "", "additionalInstructions", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "()Ljava/util/List;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26760g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource instructionTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource instructionDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C26760g> additionalInstructions;

    public C26760g(TextResource instructionTitle, TextResource instructionDescription, List<C26760g> list) {
        AbstractC22676k.m65750j(instructionTitle, "instructionTitle");
        AbstractC22676k.m65750j(instructionDescription, "instructionDescription");
        this.instructionTitle = instructionTitle;
        this.instructionDescription = instructionDescription;
        this.additionalInstructions = list;
    }

    /* JADX INFO: renamed from: a */
    public final List<C26760g> m79667a() {
        return this.additionalInstructions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getInstructionDescription() {
        return this.instructionDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getInstructionTitle() {
        return this.instructionTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26760g)) {
            return false;
        }
        C26760g c26760g = (C26760g) other;
        return AbstractC22676k.m65745e(this.instructionTitle, c26760g.instructionTitle) && AbstractC22676k.m65745e(this.instructionDescription, c26760g.instructionDescription) && AbstractC22676k.m65745e(this.additionalInstructions, c26760g.additionalInstructions);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.instructionTitle.hashCode() * 31, this.instructionDescription, 31);
        List<C26760g> list = this.additionalInstructions;
        return iM95625a + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        TextResource textResource = this.instructionTitle;
        TextResource textResource2 = this.instructionDescription;
        return AbstractC3855a.m11829m(AbstractC33745d.m106658q("StressInstructionViewState(instructionTitle=", textResource, ", instructionDescription=", textResource2, ", additionalInstructions="), this.additionalInstructions, ")");
    }

    public /* synthetic */ C26760g(TextResource textResource, TextResource textResource2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? null : list);
    }
}
