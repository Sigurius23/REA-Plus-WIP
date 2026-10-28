package ul0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ul0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lul0/a;", "", "", "isEnabled", "Lcom/whoop/design/util/TextResource;", "label", "<init>", "(ZLcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35059a {

    /* JADX INFO: renamed from: c */
    public static final int f148550c = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource label;

    public C35059a(boolean z4, TextResource label) {
        AbstractC22676k.m65750j(label, "label");
        this.isEnabled = z4;
        this.label = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35059a)) {
            return false;
        }
        C35059a c35059a = (C35059a) other;
        return this.isEnabled == c35059a.isEnabled && AbstractC22676k.m65745e(this.label, c35059a.label);
    }

    public int hashCode() {
        return this.label.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public String toString() {
        return "AlarmState(isEnabled=" + this.isEnabled + ", label=" + this.label + ")";
    }
}
