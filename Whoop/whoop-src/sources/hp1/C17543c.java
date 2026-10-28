package hp1;

import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: hp1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006&"}, m65681d2 = {"Lhp1/c;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "value", "subtitle", "Lgz0/m0;", "icon", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "", "nextCount", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "f", "c", "d", "Lgz0/m0;", "()Lgz0/m0;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17543c {

    /* JADX INFO: renamed from: g */
    public static final int f67845g = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final HormonalScreenId nextId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Integer nextCount;

    public C17543c(TextResource title, String value, TextResource textResource, EnumC16313m0 enumC16313m0, HormonalScreenId hormonalScreenId, Integer num) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        this.title = title;
        this.value = value;
        this.subtitle = textResource;
        this.icon = enumC16313m0;
        this.nextId = hormonalScreenId;
        this.nextCount = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getNextCount() {
        return this.nextCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17543c)) {
            return false;
        }
        C17543c c17543c = (C17543c) other;
        return AbstractC22676k.m65745e(this.title, c17543c.title) && AbstractC22676k.m65745e(this.value, c17543c.value) && AbstractC22676k.m65745e(this.subtitle, c17543c.subtitle) && this.icon == c17543c.icon && this.nextId == c17543c.nextId && AbstractC22676k.m65745e(this.nextCount, c17543c.nextCount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.value);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode2 = (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        HormonalScreenId hormonalScreenId = this.nextId;
        int iHashCode3 = (iHashCode2 + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        Integer num = this.nextCount;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.value;
        TextResource textResource2 = this.subtitle;
        EnumC16313m0 enumC16313m0 = this.icon;
        HormonalScreenId hormonalScreenId = this.nextId;
        Integer num = this.nextCount;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("MultiSelectOptionState(title=", textResource, ", value=", str, ", subtitle=");
        sbM91845o.append(textResource2);
        sbM91845o.append(", icon=");
        sbM91845o.append(enumC16313m0);
        sbM91845o.append(", nextId=");
        sbM91845o.append(hormonalScreenId);
        sbM91845o.append(", nextCount=");
        sbM91845o.append(num);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    public /* synthetic */ C17543c(TextResource textResource, String str, TextResource textResource2, EnumC16313m0 enumC16313m0, HormonalScreenId hormonalScreenId, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, (i13 & 4) != 0 ? null : textResource2, (i13 & 8) != 0 ? null : enumC16313m0, (i13 & 16) != 0 ? null : hormonalScreenId, (i13 & 32) != 0 ? null : num);
    }
}
