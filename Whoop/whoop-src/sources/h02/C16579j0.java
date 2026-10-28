package h02;

import com.whoop.nativestore.pdp.domain.model.SelectorLevel;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h02.j0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, m65681d2 = {"Lh02/j0;", "", "", "optionKey", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "level", "", "variantSelectorIndex", "packItemId", "packItemProductKey", "<init>", "(Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;", "c", "I", "e", "d", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16579j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optionKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SelectorLevel level;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int variantSelectorIndex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String packItemId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String packItemProductKey;

    public C16579j0(String optionKey, SelectorLevel level, int i13, String str, String str2) {
        AbstractC22676k.m65750j(optionKey, "optionKey");
        AbstractC22676k.m65750j(level, "level");
        this.optionKey = optionKey;
        this.level = level;
        this.variantSelectorIndex = i13;
        this.packItemId = str;
        this.packItemProductKey = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SelectorLevel getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOptionKey() {
        return this.optionKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackItemId() {
        return this.packItemId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPackItemProductKey() {
        return this.packItemProductKey;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getVariantSelectorIndex() {
        return this.variantSelectorIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16579j0)) {
            return false;
        }
        C16579j0 c16579j0 = (C16579j0) other;
        return AbstractC22676k.m65745e(this.optionKey, c16579j0.optionKey) && this.level == c16579j0.level && this.variantSelectorIndex == c16579j0.variantSelectorIndex && AbstractC22676k.m65745e(this.packItemId, c16579j0.packItemId) && AbstractC22676k.m65745e(this.packItemProductKey, c16579j0.packItemProductKey);
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.variantSelectorIndex, (this.level.hashCode() + (this.optionKey.hashCode() * 31)) * 31, 31);
        String str = this.packItemId;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packItemProductKey;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.optionKey;
        SelectorLevel selectorLevel = this.level;
        int i13 = this.variantSelectorIndex;
        String str2 = this.packItemId;
        String str3 = this.packItemProductKey;
        StringBuilder sb4 = new StringBuilder("TapOption(optionKey=");
        sb4.append(str);
        sb4.append(", level=");
        sb4.append(selectorLevel);
        sb4.append(", variantSelectorIndex=");
        AbstractC11895b.m31979B(i13, ", packItemId=", str2, ", packItemProductKey=", sb4);
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }
}
