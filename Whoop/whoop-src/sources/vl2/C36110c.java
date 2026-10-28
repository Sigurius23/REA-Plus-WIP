package vl2;

import com.whoop.design.models.DesignSystemModel;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vl2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b\"\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b \u0010$¨\u0006%"}, m65681d2 = {"Lvl2/c;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lgz0/m0;", "icon", "iconUrl", "", "measurementValue", "unit", "subtitle", "Lvl2/i;", "menuSheet", "<init>", "(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lvl2/i;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lgz0/m0;", "()Lgz0/m0;", "d", "I", "e", "g", "f", "Lvl2/i;", "()Lvl2/i;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36110c implements DesignSystemModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String iconUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int measurementValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String unit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String subtitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC36116i menuSheet;

    public C36110c(String id4, EnumC16313m0 icon, String str, int i13, String unit, String subtitle, InterfaceC36116i interfaceC36116i) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(unit, "unit");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.id = id4;
        this.icon = icon;
        this.iconUrl = str;
        this.measurementValue = i13;
        this.unit = unit;
        this.subtitle = subtitle;
        this.menuSheet = interfaceC36116i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMeasurementValue() {
        return this.measurementValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC36116i getMenuSheet() {
        return this.menuSheet;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36110c)) {
            return false;
        }
        C36110c c36110c = (C36110c) other;
        return AbstractC22676k.m65745e(this.id, c36110c.id) && this.icon == c36110c.icon && AbstractC22676k.m65745e(this.iconUrl, c36110c.iconUrl) && this.measurementValue == c36110c.measurementValue && AbstractC22676k.m65745e(this.unit, c36110c.unit) && AbstractC22676k.m65745e(this.subtitle, c36110c.subtitle) && AbstractC22676k.m65745e(this.menuSheet, c36110c.menuSheet);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.icon, this.id.hashCode() * 31, 31);
        String str = this.iconUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.measurementValue, (iM48500b + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.unit), 31, this.subtitle);
        InterfaceC36116i interfaceC36116i = this.menuSheet;
        return iM30450d + (interfaceC36116i != null ? interfaceC36116i.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.icon;
        String str2 = this.iconUrl;
        int i13 = this.measurementValue;
        String str3 = this.unit;
        String str4 = this.subtitle;
        InterfaceC36116i interfaceC36116i = this.menuSheet;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("MeasurementContentDomainState(id=", str, ", icon=", enumC16313m0, ", iconUrl=");
        AbstractC11266d.m30470x(i13, str2, ", measurementValue=", ", unit=", sbM61141l);
        AbstractC11266d.m30444B(sbM61141l, str3, ", subtitle=", str4, ", menuSheet=");
        sbM61141l.append(interfaceC36116i);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }
}
