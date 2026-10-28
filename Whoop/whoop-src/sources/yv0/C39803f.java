package yv0;

import ih0.AbstractC18489d0;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: yv0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lyv0/f;", "", "", "label", "value", "target", "Ly81/f;", "color", "", "isCompleted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ly81/f;", "()Ly81/f;", "e", "Z", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39803f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f color;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isCompleted;

    public C39803f(String label, String value, String target, EnumC39333f color, boolean z4) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(target, "target");
        AbstractC22676k.m65750j(color, "color");
        this.label = label;
        this.value = value;
        this.target = target;
        this.color = color;
        this.isCompleted = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39803f)) {
            return false;
        }
        C39803f c39803f = (C39803f) other;
        return AbstractC22676k.m65745e(this.label, c39803f.label) && AbstractC22676k.m65745e(this.value, c39803f.value) && AbstractC22676k.m65745e(this.target, c39803f.target) && this.color == c39803f.color && this.isCompleted == c39803f.isCompleted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isCompleted) + AbstractC21702c.m61132c(this.color, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.label.hashCode() * 31, 31, this.value), 31, this.target), 31);
    }

    public String toString() {
        String str = this.label;
        String str2 = this.value;
        String str3 = this.target;
        EnumC39333f enumC39333f = this.color;
        boolean z4 = this.isCompleted;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivityTargetZoneRow(label=", str, ", value=", str2, ", target=");
        sbM32001t.append(str3);
        sbM32001t.append(", color=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", isCompleted=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }
}
