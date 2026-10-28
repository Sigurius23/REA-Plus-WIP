package mp0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: mp0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lmp0/q;", "", "Lcom/whoop/design/util/TextResource;", "tagLabel", "Ly81/f;", "backGroundColor", "textColor", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "()Ly81/f;", "c", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25848q {

    /* JADX INFO: renamed from: d */
    public static final int f101831d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource tagLabel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC39333f backGroundColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC39333f textColor;

    public C25848q(TextResource tagLabel, EnumC39333f backGroundColor, EnumC39333f textColor) {
        AbstractC22676k.m65750j(tagLabel, "tagLabel");
        AbstractC22676k.m65750j(backGroundColor, "backGroundColor");
        AbstractC22676k.m65750j(textColor, "textColor");
        this.tagLabel = tagLabel;
        this.backGroundColor = backGroundColor;
        this.textColor = textColor;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getBackGroundColor() {
        return this.backGroundColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTagLabel() {
        return this.tagLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getTextColor() {
        return this.textColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25848q)) {
            return false;
        }
        C25848q c25848q = (C25848q) other;
        return AbstractC22676k.m65745e(this.tagLabel, c25848q.tagLabel) && this.backGroundColor == c25848q.backGroundColor && this.textColor == c25848q.textColor;
    }

    public int hashCode() {
        return this.textColor.hashCode() + AbstractC21702c.m61132c(this.backGroundColor, this.tagLabel.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.tagLabel;
        EnumC39333f enumC39333f = this.backGroundColor;
        EnumC39333f enumC39333f2 = this.textColor;
        StringBuilder sb4 = new StringBuilder("ScheduleStatusChipViewState(tagLabel=");
        sb4.append(textResource);
        sb4.append(", backGroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", textColor=");
        return AbstractC21702c.m61138i(sb4, enumC39333f2, ")");
    }

    public /* synthetic */ C25848q(TextResource textResource, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? EnumC39333f.TRANSPARENT : enumC39333f, (i13 & 4) != 0 ? EnumC39333f.TRANSPARENT : enumC39333f2);
    }
}
