package nh1;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nh1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u0011¨\u0006\""}, m65681d2 = {"Lnh1/d;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "description", "", "minValue", "maxValue", "startingValue", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;III)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;III)Lnh1/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "I", "f", "d", "e", "g", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26723d implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f106315f = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int minValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int maxValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int startingValue;

    public C26723d(String str, TextResource textResource, int i13, int i14, int i15) {
        this.id = str;
        this.description = textResource;
        this.minValue = i13;
        this.maxValue = i14;
        this.startingValue = i15;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C26723d m79490b(C26723d c26723d, String str, TextResource textResource, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = c26723d.id;
        }
        if ((i16 & 2) != 0) {
            textResource = c26723d.description;
        }
        if ((i16 & 4) != 0) {
            i13 = c26723d.minValue;
        }
        if ((i16 & 8) != 0) {
            i14 = c26723d.maxValue;
        }
        if ((i16 & 16) != 0) {
            i15 = c26723d.startingValue;
        }
        int i17 = i15;
        int i18 = i13;
        return c26723d.m79491a(str, textResource, i18, i14, i17);
    }

    /* JADX INFO: renamed from: a */
    public final C26723d m79491a(String id4, TextResource description, int minValue, int maxValue, int startingValue) {
        return new C26723d(id4, description, minValue, maxValue, startingValue);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26723d)) {
            return false;
        }
        C26723d c26723d = (C26723d) other;
        return AbstractC22676k.m65745e(this.id, c26723d.id) && AbstractC22676k.m65745e(this.description, c26723d.description) && this.minValue == c26723d.minValue && this.maxValue == c26723d.maxValue && this.startingValue == c26723d.startingValue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getStartingValue() {
        return this.startingValue;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextResource textResource = this.description;
        return Integer.hashCode(this.startingValue) + AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, (iHashCode + (textResource != null ? textResource.hashCode() : 0)) * 31, 31), 31);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.description;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        int i15 = this.startingValue;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("QuantitySelectorViewState(id=", str, ", description=", textResource, ", minValue=");
        AbstractC30802r.m94773v(sbM91847q, i13, ", maxValue=", i14, ", startingValue=");
        return AbstractC18489d0.m53371l(sbM91847q, i15, ")");
    }
}
