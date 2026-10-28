package r80;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: r80.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lr80/e;", "", "Lcom/whoop/design/util/TextResource;", "text", "subtext", "upsellText", "Lr80/a;", "billingFrequency", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr80/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "d", "Lr80/a;", "()Lr80/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31063e {

    /* JADX INFO: renamed from: e */
    public static final int f128071e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource subtext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource upsellText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC31059a billingFrequency;

    public C31063e(TextResource text, TextResource subtext, TextResource textResource, EnumC31059a enumC31059a) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subtext, "subtext");
        this.text = text;
        this.subtext = subtext;
        this.upsellText = textResource;
        this.billingFrequency = enumC31059a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC31059a getBillingFrequency() {
        return this.billingFrequency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getSubtext() {
        return this.subtext;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getUpsellText() {
        return this.upsellText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31063e)) {
            return false;
        }
        C31063e c31063e = (C31063e) other;
        return AbstractC22676k.m65745e(this.text, c31063e.text) && AbstractC22676k.m65745e(this.subtext, c31063e.subtext) && AbstractC22676k.m65745e(this.upsellText, c31063e.upsellText) && this.billingFrequency == c31063e.billingFrequency;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.text.hashCode() * 31, this.subtext, 31);
        TextResource textResource = this.upsellText;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC31059a enumC31059a = this.billingFrequency;
        return iHashCode + (enumC31059a != null ? enumC31059a.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.text;
        TextResource textResource2 = this.subtext;
        TextResource textResource3 = this.upsellText;
        EnumC31059a enumC31059a = this.billingFrequency;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BillingFrequencyTileState(text=", textResource, ", subtext=", textResource2, ", upsellText=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", billingFrequency=");
        sbM106658q.append(enumC31059a);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }
}
