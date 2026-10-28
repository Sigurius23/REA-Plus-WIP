package tp1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tp1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ltp1/e;", "", "", "value", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "", "isSelected", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "Z", "()Z", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34065e {

    /* JADX INFO: renamed from: d */
    public static final int f142761d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    public C34065e(String value, TextResource titleDisplay, boolean z4) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        this.value = value;
        this.titleDisplay = titleDisplay;
        this.isSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34065e)) {
            return false;
        }
        C34065e c34065e = (C34065e) other;
        return AbstractC22676k.m65745e(this.value, c34065e.value) && AbstractC22676k.m65745e(this.titleDisplay, c34065e.titleDisplay) && this.isSelected == c34065e.isSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + AbstractC31061c.m95625a(this.value.hashCode() * 31, this.titleDisplay, 31);
    }

    public String toString() {
        String str = this.value;
        TextResource textResource = this.titleDisplay;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91847q("HormonalInsightsGoalsDrawerOptionState(value=", str, ", titleDisplay=", textResource, ", isSelected="), this.isSelected, ")");
    }
}
