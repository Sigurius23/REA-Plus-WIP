package wt2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import jh3.AbstractC21702c;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wt2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, m65681d2 = {"Lwt2/a;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "icon", "Lcom/whoop/navigation/e;", "action", "", "enabled", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "b", "Lgz0/m0;", "c", "()Lgz0/m0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C37620a {

    /* JADX INFO: renamed from: e */
    public static final int f160984e = C9598e.f28134d | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e action;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enabled;

    public C37620a(TextResource title, EnumC16313m0 enumC16313m0, C9598e action, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(action, "action");
        this.title = title;
        this.icon = enumC16313m0;
        this.action = action;
        this.enabled = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C37620a)) {
            return false;
        }
        C37620a c37620a = (C37620a) other;
        return AbstractC22676k.m65745e(this.title, c37620a.title) && this.icon == c37620a.icon && AbstractC22676k.m65745e(this.action, c37620a.action) && this.enabled == c37620a.enabled;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return Boolean.hashCode(this.enabled) + AbstractC36095b.m114673a(this.action, (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.icon;
        C9598e c9598e = this.action;
        boolean z4 = this.enabled;
        StringBuilder sbM61140k = AbstractC21702c.m61140k("ButtonInfoState(title=", textResource, ", icon=", enumC16313m0, ", action=");
        sbM61140k.append(c9598e);
        sbM61140k.append(", enabled=");
        sbM61140k.append(z4);
        sbM61140k.append(")");
        return sbM61140k.toString();
    }
}
