package j72;

import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: j72.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006&"}, m65681d2 = {"Lj72/m;", "", "Lj72/g;", "screenId", "Lcom/whoop/design/util/TextResource;", "title", "buttonTitle", "", "Lj72/l;", "options", "", "optionLimit", "nextScreenId", "<init>", "(Lj72/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/Integer;Lj72/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj72/g;", "e", "()Lj72/g;", "b", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21408m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC21402g screenId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource buttonTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C21407l> options;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Integer optionLimit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC21402g nextScreenId;

    public C21408m(EnumC21402g screenId, TextResource title, TextResource buttonTitle, List<C21407l> options, Integer num, EnumC21402g enumC21402g) {
        AbstractC22676k.m65750j(screenId, "screenId");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(options, "options");
        this.screenId = screenId;
        this.title = title;
        this.buttonTitle = buttonTitle;
        this.options = options;
        this.optionLimit = num;
        this.nextScreenId = enumC21402g;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC21402g getNextScreenId() {
        return this.nextScreenId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getOptionLimit() {
        return this.optionLimit;
    }

    /* JADX INFO: renamed from: d */
    public final List<C21407l> m60163d() {
        return this.options;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC21402g getScreenId() {
        return this.screenId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21408m)) {
            return false;
        }
        C21408m c21408m = (C21408m) other;
        return this.screenId == c21408m.screenId && AbstractC22676k.m65745e(this.title, c21408m.title) && AbstractC22676k.m65745e(this.buttonTitle, c21408m.buttonTitle) && AbstractC22676k.m65745e(this.options, c21408m.options) && AbstractC22676k.m65745e(this.optionLimit, c21408m.optionLimit) && this.nextScreenId == c21408m.nextScreenId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.screenId.hashCode() * 31, this.title, 31), this.buttonTitle, 31), 31, this.options);
        Integer num = this.optionLimit;
        int iHashCode = (iM31983b + (num == null ? 0 : num.hashCode())) * 31;
        EnumC21402g enumC21402g = this.nextScreenId;
        return iHashCode + (enumC21402g != null ? enumC21402g.hashCode() : 0);
    }

    public String toString() {
        EnumC21402g enumC21402g = this.screenId;
        TextResource textResource = this.title;
        TextResource textResource2 = this.buttonTitle;
        List<C21407l> list = this.options;
        Integer num = this.optionLimit;
        EnumC21402g enumC21402g2 = this.nextScreenId;
        StringBuilder sb4 = new StringBuilder("SelectionState(screenId=");
        sb4.append(enumC21402g);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", buttonTitle=");
        AbstractC21702c.m61143n(textResource2, ", options=", ", optionLimit=", sb4, list);
        sb4.append(num);
        sb4.append(", nextScreenId=");
        sb4.append(enumC21402g2);
        sb4.append(")");
        return sb4.toString();
    }
}
