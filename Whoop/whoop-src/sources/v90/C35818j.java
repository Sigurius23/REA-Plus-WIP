package v90;

import com.whoop.design.util.TextResource;
import com.whoop.payments.domain.models.Card;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v90.j */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lv90/j;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "options", "", "optionSelected", "Lcom/whoop/payments/domain/models/Card;", "card", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;)V", "a", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;ILcom/whoop/payments/domain/models/Card;)Lv90/j;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "I", "Lcom/whoop/payments/domain/models/Card;", "getCard", "()Lcom/whoop/payments/domain/models/Card;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35818j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<TextResource> options;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int optionSelected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Card card;

    /* JADX WARN: Multi-variable type inference failed */
    public C35818j(TextResource title, List<? extends TextResource> options, int i13, Card card) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(card, "card");
        this.title = title;
        this.options = options;
        this.optionSelected = i13;
        this.card = card;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C35818j m113595b(C35818j c35818j, TextResource textResource, List list, int i13, Card card, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            textResource = c35818j.title;
        }
        if ((i14 & 2) != 0) {
            list = c35818j.options;
        }
        if ((i14 & 4) != 0) {
            i13 = c35818j.optionSelected;
        }
        if ((i14 & 8) != 0) {
            card = c35818j.card;
        }
        return c35818j.m113596a(textResource, list, i13, card);
    }

    /* JADX INFO: renamed from: a */
    public final C35818j m113596a(TextResource title, List<? extends TextResource> options, int optionSelected, Card card) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(card, "card");
        return new C35818j(title, options, optionSelected, card);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getOptionSelected() {
        return this.optionSelected;
    }

    /* JADX INFO: renamed from: d */
    public final List<TextResource> m113598d() {
        return this.options;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35818j)) {
            return false;
        }
        C35818j c35818j = (C35818j) other;
        return AbstractC22676k.m65745e(this.title, c35818j.title) && AbstractC22676k.m65745e(this.options, c35818j.options) && this.optionSelected == c35818j.optionSelected && AbstractC22676k.m65745e(this.card, c35818j.card);
    }

    public int hashCode() {
        return this.card.hashCode() + AbstractC11266d.m30448b(this.optionSelected, AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.options), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        List<TextResource> list = this.options;
        int i13 = this.optionSelected;
        Card card = this.card;
        StringBuilder sbM106657p = AbstractC33745d.m106657p(textResource, "TrialOfferPaymentMethodsViewState(title=", ", options=", ", optionSelected=", list);
        sbM106657p.append(i13);
        sbM106657p.append(", card=");
        sbM106657p.append(card);
        sbM106657p.append(")");
        return sbM106657p.toString();
    }

    public /* synthetic */ C35818j(TextResource textResource, List list, int i13, Card card, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, list, i13, (i14 & 8) != 0 ? new Card((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : card);
    }
}
