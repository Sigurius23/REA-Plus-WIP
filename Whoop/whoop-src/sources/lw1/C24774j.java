package lw1;

import com.whoop.design.util.TextResource;
import com.whoop.payments.domain.models.Card;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: lw1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, m65681d2 = {"Llw1/j;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "options", "", "optionSelected", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "I", "Lcom/whoop/payments/domain/models/Card;", "()Lcom/whoop/payments/domain/models/Card;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24774j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<TextResource> options;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int optionSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Card card;

    /* JADX WARN: Multi-variable type inference failed */
    public C24774j(TextResource title, List<? extends TextResource> options, int i13, Card card) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(card, "card");
        this.title = title;
        this.options = options;
        this.optionSelected = i13;
        this.card = card;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Card getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getOptionSelected() {
        return this.optionSelected;
    }

    /* JADX INFO: renamed from: c */
    public final List<TextResource> m72606c() {
        return this.options;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24774j)) {
            return false;
        }
        C24774j c24774j = (C24774j) other;
        return AbstractC22676k.m65745e(this.title, c24774j.title) && AbstractC22676k.m65745e(this.options, c24774j.options) && this.optionSelected == c24774j.optionSelected && AbstractC22676k.m65745e(this.card, c24774j.card);
    }

    public int hashCode() {
        return this.card.hashCode() + AbstractC11266d.m30448b(this.optionSelected, AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.options), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        List<TextResource> list = this.options;
        int i13 = this.optionSelected;
        Card card = this.card;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "PaymentOptionsViewState(title=", ", options=", ", optionSelected=", list);
        sbM106657p.append(i13);
        sbM106657p.append(", card=");
        sbM106657p.append(card);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }
}
