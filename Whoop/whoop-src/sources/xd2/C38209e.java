package xd2;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xd2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001d"}, m65681d2 = {"Lxd2/e;", "", "", "historyDate", "recordDate", "", "icon", "Lcom/whoop/design/util/TextResource;", "label", "actionIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/design/util/TextResource;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "I", "d", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38209e {

    /* JADX INFO: renamed from: f */
    public static final int f163714f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String historyDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String recordDate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int actionIcon;

    public C38209e(String historyDate, String recordDate, int i13, TextResource label, int i14) {
        AbstractC22676k.m65750j(historyDate, "historyDate");
        AbstractC22676k.m65750j(recordDate, "recordDate");
        AbstractC22676k.m65750j(label, "label");
        this.historyDate = historyDate;
        this.recordDate = recordDate;
        this.icon = i13;
        this.label = label;
        this.actionIcon = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActionIcon() {
        return this.actionIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHistoryDate() {
        return this.historyDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRecordDate() {
        return this.recordDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38209e)) {
            return false;
        }
        C38209e c38209e = (C38209e) other;
        return AbstractC22676k.m65745e(this.historyDate, c38209e.historyDate) && AbstractC22676k.m65745e(this.recordDate, c38209e.recordDate) && this.icon == c38209e.icon && AbstractC22676k.m65745e(this.label, c38209e.label) && this.actionIcon == c38209e.actionIcon;
    }

    public int hashCode() {
        return Integer.hashCode(this.actionIcon) + AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.icon, AbstractC11266d.m30450d(this.historyDate.hashCode() * 31, 31, this.recordDate), 31), this.label, 31);
    }

    public String toString() {
        String str = this.historyDate;
        String str2 = this.recordDate;
        int i13 = this.icon;
        TextResource textResource = this.label;
        int i14 = this.actionIcon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShepherdHistoryRecord(historyDate=", str, ", recordDate=", str2, ", icon=");
        sbM32001t.append(i13);
        sbM32001t.append(", label=");
        sbM32001t.append(textResource);
        sbM32001t.append(", actionIcon=");
        return AbstractC18489d0.m53371l(sbM32001t, i14, ")");
    }
}
