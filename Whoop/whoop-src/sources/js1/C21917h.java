package js1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import h11.C16613h;
import java.util.List;
import ny0.C27256h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: js1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b!\u0010(¨\u0006)"}, m65681d2 = {"Ljs1/h;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "", "rightIcon", "Lny0/h;", "cardButton", "", "Lh11/h;", "datePickerItems", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lny0/h;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "c", "Lny0/h;", "()Lny0/h;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "journal-home-tile-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21917h implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer rightIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27256h cardButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C16613h> datePickerItems;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C9598e destination;

    public C21917h(TextResource title, Integer num, C27256h c27256h, List<C16613h> datePickerItems, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(datePickerItems, "datePickerItems");
        this.title = title;
        this.rightIcon = num;
        this.cardButton = c27256h;
        this.datePickerItems = datePickerItems;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C27256h getCardButton() {
        return this.cardButton;
    }

    /* JADX INFO: renamed from: b */
    public final List<C16613h> m62367b() {
        return this.datePickerItems;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getRightIcon() {
        return this.rightIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21917h)) {
            return false;
        }
        C21917h c21917h = (C21917h) other;
        return AbstractC22676k.m65745e(this.title, c21917h.title) && AbstractC22676k.m65745e(this.rightIcon, c21917h.rightIcon) && AbstractC22676k.m65745e(this.cardButton, c21917h.cardButton) && AbstractC22676k.m65745e(this.datePickerItems, c21917h.datePickerItems) && AbstractC22676k.m65745e(this.destination, c21917h.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Integer num = this.rightIcon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C27256h c27256h = this.cardButton;
        int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (c27256h == null ? 0 : c27256h.hashCode())) * 31, 31, this.datePickerItems);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        Integer num = this.rightIcon;
        C27256h c27256h = this.cardButton;
        List<C16613h> list = this.datePickerItems;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("JournalHomeTileItemState(title=");
        sb4.append(textResource);
        sb4.append(", rightIcon=");
        sb4.append(num);
        sb4.append(", cardButton=");
        sb4.append(c27256h);
        sb4.append(", datePickerItems=");
        sb4.append(list);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }
}
