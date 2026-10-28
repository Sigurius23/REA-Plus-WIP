package h21;

import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h21.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lh21/d;", "Lm91/u;", "", "Lh21/e;", "cards", "", "selectedCardId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16780d implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C16781e> cards;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String selectedCardId;

    public C16780d(List<C16781e> cards, String str) {
        AbstractC22676k.m65750j(cards, "cards");
        this.cards = cards;
        this.selectedCardId = str;
    }

    /* JADX INFO: renamed from: a */
    public final List<C16781e> m47327a() {
        return this.cards;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSelectedCardId() {
        return this.selectedCardId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16780d)) {
            return false;
        }
        C16780d c16780d = (C16780d) other;
        return AbstractC22676k.m65745e(this.cards, c16780d.cards) && AbstractC22676k.m65745e(this.selectedCardId, c16780d.selectedCardId);
    }

    public int hashCode() {
        int iHashCode = this.cards.hashCode() * 31;
        String str = this.selectedCardId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("ImageCardPickerState(cards=", ", selectedCardId=", this.selectedCardId, ")", this.cards);
    }
}
