package tk2;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: tk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ltk2/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "currentValue", "targetSuffix", "label", "Ltk2/n;", "progressBar", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ltk2/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "e", "c", "d", "Ltk2/n;", "()Ltk2/n;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33885c implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f141962e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource currentValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource targetSuffix;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C33896n progressBar;

    public C33885c(TextResource currentValue, TextResource targetSuffix, TextResource label, C33896n c33896n) {
        AbstractC22676k.m65750j(currentValue, "currentValue");
        AbstractC22676k.m65750j(targetSuffix, "targetSuffix");
        AbstractC22676k.m65750j(label, "label");
        this.currentValue = currentValue;
        this.targetSuffix = targetSuffix;
        this.label = label;
        this.progressBar = c33896n;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33896n getProgressBar() {
        return this.progressBar;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTargetSuffix() {
        return this.targetSuffix;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33885c)) {
            return false;
        }
        C33885c c33885c = (C33885c) other;
        return AbstractC22676k.m65745e(this.currentValue, c33885c.currentValue) && AbstractC22676k.m65745e(this.targetSuffix, c33885c.targetSuffix) && AbstractC22676k.m65745e(this.label, c33885c.label) && AbstractC22676k.m65745e(this.progressBar, c33885c.progressBar);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.currentValue.hashCode() * 31, this.targetSuffix, 31), this.label, 31);
        C33896n c33896n = this.progressBar;
        return iM95625a + (c33896n == null ? 0 : c33896n.hashCode());
    }

    public String toString() {
        TextResource textResource = this.currentValue;
        TextResource textResource2 = this.targetSuffix;
        TextResource textResource3 = this.label;
        C33896n c33896n = this.progressBar;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("TrackSessionDistanceProgressItemViewState(currentValue=", textResource, ", targetSuffix=", textResource2, ", label=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", progressBar=");
        sbM106658q.append(c33896n);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
