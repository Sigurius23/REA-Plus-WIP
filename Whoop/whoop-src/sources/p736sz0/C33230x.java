package p736sz0;

import com.whoop.design.atomic.molecule.InformationItemStyle;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: sz0.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, m65681d2 = {"Lsz0/x;", "Lm91/u;", "", "label", "value", "", "icon", "Lcom/whoop/design/atomic/molecule/InformationItemStyle;", "style", "id", "Ly81/f;", "valueColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/atomic/molecule/InformationItemStyle;Ljava/lang/String;Ly81/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "e", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "d", "Lcom/whoop/design/atomic/molecule/InformationItemStyle;", "()Lcom/whoop/design/atomic/molecule/InformationItemStyle;", "getId", "f", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33230x implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InformationItemStyle style;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC39333f valueColor;

    public C33230x(String label, String value, Integer num, InformationItemStyle style, String id4, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        this.label = label;
        this.value = value;
        this.icon = num;
        this.style = style;
        this.id = id4;
        this.valueColor = enumC39333f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InformationItemStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33230x)) {
            return false;
        }
        C33230x c33230x = (C33230x) other;
        return AbstractC22676k.m65745e(this.label, c33230x.label) && AbstractC22676k.m65745e(this.value, c33230x.value) && AbstractC22676k.m65745e(this.icon, c33230x.icon) && this.style == c33230x.style && AbstractC22676k.m65745e(this.id, c33230x.id) && this.valueColor == c33230x.valueColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC39333f getValueColor() {
        return this.valueColor;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.value);
        Integer num = this.icon;
        int iM30450d2 = AbstractC11266d.m30450d((this.style.hashCode() + ((iM30450d + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.id);
        EnumC39333f enumC39333f = this.valueColor;
        return iM30450d2 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.value;
        Integer num = this.icon;
        InformationItemStyle informationItemStyle = this.style;
        String str3 = this.id;
        EnumC39333f enumC39333f = this.valueColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InformationItemState(label=", str, ", value=", str2, ", icon=");
        sbM32001t.append(num);
        sbM32001t.append(", style=");
        sbM32001t.append(informationItemStyle);
        sbM32001t.append(", id=");
        sbM32001t.append(str3);
        sbM32001t.append(", valueColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
