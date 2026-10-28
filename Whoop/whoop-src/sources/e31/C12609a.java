package e31;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: e31.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Le31/a;", "", "Lcom/whoop/design/util/TextResource;", "text", "", "icon", "endIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12609a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer endIcon;

    public C12609a(TextResource text, Integer num, Integer num2) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.icon = num;
        this.endIcon = num2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12609a)) {
            return false;
        }
        C12609a c12609a = (C12609a) other;
        return AbstractC22676k.m65745e(this.text, c12609a.text) && AbstractC22676k.m65745e(this.icon, c12609a.icon) && AbstractC22676k.m65745e(this.endIcon, c12609a.endIcon);
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.icon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endIcon;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.text;
        Integer num = this.icon;
        Integer num2 = this.endIcon;
        StringBuilder sb4 = new StringBuilder("ActionButtonState(text=");
        sb4.append(textResource);
        sb4.append(", icon=");
        sb4.append(num);
        sb4.append(", endIcon=");
        return AbstractC11478a.m30859k(sb4, num2, ")");
    }

    public /* synthetic */ C12609a(TextResource textResource, Integer num, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? null : num2);
    }
}
