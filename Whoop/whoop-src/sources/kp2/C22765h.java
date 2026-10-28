package kp2;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lkp2/h;", "", "", "value", "text", "id", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "()Z", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22765h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isSelected;

    public C22765h(String value, String text, String id4, boolean z4) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(id4, "id");
        this.value = value;
        this.text = text;
        this.id = id4;
        this.isSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22765h)) {
            return false;
        }
        C22765h c22765h = (C22765h) other;
        return AbstractC22676k.m65745e(this.value, c22765h.value) && AbstractC22676k.m65745e(this.text, c22765h.text) && AbstractC22676k.m65745e(this.id, c22765h.id) && this.isSelected == c22765h.isSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.value.hashCode() * 31, 31, this.text), 31, this.id);
    }

    public String toString() {
        String str = this.value;
        String str2 = this.text;
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("ShippingAddressSelectionOption(value=", str, ", text=", str2, ", id="), this.id, ", isSelected=", this.isSelected, ")");
    }
}
