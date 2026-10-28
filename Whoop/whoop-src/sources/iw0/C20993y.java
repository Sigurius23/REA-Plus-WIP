package iw0;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw0.y */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Liw0/y;", "", "", "Liw0/b;", "cards", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "isSuperset", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20993y {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C20959b> cards;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSuperset;

    public C20993y(List<C20959b> cards) {
        AbstractC22676k.m65750j(cards, "cards");
        this.cards = cards;
        this.isSuperset = cards.size() > 1;
    }

    /* JADX INFO: renamed from: a */
    public final List<C20959b> m58483a() {
        return this.cards;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSuperset() {
        return this.isSuperset;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C20993y) && AbstractC22676k.m65745e(this.cards, ((C20993y) other).cards);
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("ExerciseCardGroup(cards=", ")", this.cards);
    }
}
