package ot2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ot2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, m65681d2 = {"Lot2/b;", "", "Lcom/whoop/design/util/TextResource;", "titleDisplay", "Lcom/whoop/navigation/e;", "action", "", "enabled", "", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;ZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lcom/whoop/navigation/e;", "getAction", "()Lcom/whoop/navigation/e;", "c", "Z", "getEnabled", "()Z", "d", "I", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C28333b {

    /* JADX INFO: renamed from: e */
    public static final int f114263e = C9598e.f28134d | TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource titleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e action;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int icon;

    public C28333b(TextResource titleDisplay, C9598e action, boolean z4, int i13) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(action, "action");
        this.titleDisplay = titleDisplay;
        this.action = action;
        this.enabled = z4;
        this.icon = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTitleDisplay() {
        return this.titleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C28333b)) {
            return false;
        }
        C28333b c28333b = (C28333b) other;
        return AbstractC22676k.m65745e(this.titleDisplay, c28333b.titleDisplay) && AbstractC22676k.m65745e(this.action, c28333b.action) && this.enabled == c28333b.enabled && this.icon == c28333b.icon;
    }

    public int hashCode() {
        return Integer.hashCode(this.icon) + AbstractC2875y.m8289b(AbstractC36095b.m114673a(this.action, this.titleDisplay.hashCode() * 31, 31), 31, this.enabled);
    }

    public String toString() {
        return "AddButtonInfo(titleDisplay=" + this.titleDisplay + ", action=" + this.action + ", enabled=" + this.enabled + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ C28333b(TextResource textResource, C9598e c9598e, boolean z4, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, (i14 & 2) != 0 ? new C9598e(null, null, null, 7, null) : c9598e, (i14 & 4) != 0 ? true : z4, i13);
    }
}
