package ul0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ul0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010$¨\u0006%"}, m65681d2 = {"Lul0/e;", "", "Lcom/whoop/design/util/TextResource;", "label", "Lgz0/m0;", "icon", "predictedTime", "timeUnit", "typicalTitle", "typicalTime", "Lul0/a;", NotificationCompat.CATEGORY_ALARM, "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lul0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "e", "g", "f", "Lul0/a;", "()Lul0/a;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35063e {

    /* JADX INFO: renamed from: h */
    public static final int f148559h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource predictedTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource timeUnit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource typicalTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource typicalTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C35059a alarm;

    public C35063e(TextResource label, EnumC16313m0 icon, TextResource predictedTime, TextResource timeUnit, TextResource typicalTitle, TextResource typicalTime, C35059a c35059a) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(predictedTime, "predictedTime");
        AbstractC22676k.m65750j(timeUnit, "timeUnit");
        AbstractC22676k.m65750j(typicalTitle, "typicalTitle");
        AbstractC22676k.m65750j(typicalTime, "typicalTime");
        this.label = label;
        this.icon = icon;
        this.predictedTime = predictedTime;
        this.timeUnit = timeUnit;
        this.typicalTitle = typicalTitle;
        this.typicalTime = typicalTime;
        this.alarm = c35059a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C35059a getAlarm() {
        return this.alarm;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getPredictedTime() {
        return this.predictedTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTimeUnit() {
        return this.timeUnit;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35063e)) {
            return false;
        }
        C35063e c35063e = (C35063e) other;
        return AbstractC22676k.m65745e(this.label, c35063e.label) && this.icon == c35063e.icon && AbstractC22676k.m65745e(this.predictedTime, c35063e.predictedTime) && AbstractC22676k.m65745e(this.timeUnit, c35063e.timeUnit) && AbstractC22676k.m65745e(this.typicalTitle, c35063e.typicalTitle) && AbstractC22676k.m65745e(this.typicalTime, c35063e.typicalTime) && AbstractC22676k.m65745e(this.alarm, c35063e.alarm);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTypicalTime() {
        return this.typicalTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTypicalTitle() {
        return this.typicalTitle;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC17176i.m48500b(this.icon, this.label.hashCode() * 31, 31), this.predictedTime, 31), this.timeUnit, 31), this.typicalTitle, 31), this.typicalTime, 31);
        C35059a c35059a = this.alarm;
        return iM95625a + (c35059a == null ? 0 : c35059a.hashCode());
    }

    public String toString() {
        TextResource textResource = this.label;
        EnumC16313m0 enumC16313m0 = this.icon;
        TextResource textResource2 = this.predictedTime;
        TextResource textResource3 = this.timeUnit;
        TextResource textResource4 = this.typicalTitle;
        TextResource textResource5 = this.typicalTime;
        C35059a c35059a = this.alarm;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("SleepBoundState(label=", textResource, ", icon=", enumC16313m0, ", predictedTime=");
        AbstractC30007c.m91855y(sbM61140k, textResource2, ", timeUnit=", textResource3, ", typicalTitle=");
        AbstractC30007c.m91855y(sbM61140k, textResource4, ", typicalTime=", textResource5, ", alarm=");
        sbM61140k.append(c35059a);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
