package p730qt2;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: qt2.y */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0010R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, m65681d2 = {"Lqt2/y;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "title", "description", "", "currentBar", "weeklyIncrease", "targetBar", "", "isOptimal", "Ly81/f;", "color", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLy81/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "b", "c", "Ljava/lang/String;", "d", "g", "e", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "Ly81/f;", "()Ly81/f;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30619y implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f125893h = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource description;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentBar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String weeklyIncrease;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String targetBar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isOptimal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC39333f color;

    public C30619y(TextResource title, TextResource description, String currentBar, String weeklyIncrease, String targetBar, boolean z4, EnumC39333f color) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(currentBar, "currentBar");
        AbstractC22676k.m65750j(weeklyIncrease, "weeklyIncrease");
        AbstractC22676k.m65750j(targetBar, "targetBar");
        AbstractC22676k.m65750j(color, "color");
        this.title = title;
        this.description = description;
        this.currentBar = currentBar;
        this.weeklyIncrease = weeklyIncrease;
        this.targetBar = targetBar;
        this.isOptimal = z4;
        this.color = color;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrentBar() {
        return this.currentBar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTargetBar() {
        return this.targetBar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30619y)) {
            return false;
        }
        C30619y c30619y = (C30619y) other;
        return AbstractC22676k.m65745e(this.title, c30619y.title) && AbstractC22676k.m65745e(this.description, c30619y.description) && AbstractC22676k.m65745e(this.currentBar, c30619y.currentBar) && AbstractC22676k.m65745e(this.weeklyIncrease, c30619y.weeklyIncrease) && AbstractC22676k.m65745e(this.targetBar, c30619y.targetBar) && this.isOptimal == c30619y.isOptimal && this.color == c30619y.color;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWeeklyIncrease() {
        return this.weeklyIncrease;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsOptimal() {
        return this.isOptimal;
    }

    public int hashCode() {
        return this.color.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31), 31, this.currentBar), 31, this.weeklyIncrease), 31, this.targetBar), 31, this.isOptimal);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.description;
        String str = this.currentBar;
        String str2 = this.weeklyIncrease;
        String str3 = this.targetBar;
        boolean z4 = this.isOptimal;
        EnumC39333f enumC39333f = this.color;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ProgressionToolTipItemState(title=", textResource, ", description=", textResource2, ", currentBar=");
        AbstractC11266d.m30444B(sbM106658q, str, ", weeklyIncrease=", str2, ", targetBar=");
        AbstractC38963t7.m124390t(sbM106658q, str3, ", isOptimal=", z4, ", color=");
        return AbstractC21702c.m61138i(sbM106658q, enumC39333f, ")");
    }
}
