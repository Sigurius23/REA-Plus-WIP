package y41;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y41.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Ly41/i;", "", "Lcom/whoop/design/util/TextResource;", "text", "Lgz0/m0;", "icon", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lgz0/m0;", "getIcon", "()Lgz0/m0;", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39218i {

    /* JADX INFO: renamed from: d */
    public static final int f168521d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e action;

    public C39218i(TextResource text, EnumC16313m0 icon, C9598e action) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(action, "action");
        this.text = text;
        this.icon = icon;
        this.action = action;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39218i)) {
            return false;
        }
        C39218i c39218i = (C39218i) other;
        return AbstractC22676k.m65745e(this.text, c39218i.text) && this.icon == c39218i.icon && AbstractC22676k.m65745e(this.action, c39218i.action);
    }

    public int hashCode() {
        return this.action.hashCode() + AbstractC17176i.m48500b(this.icon, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.text;
        EnumC16313m0 enumC16313m0 = this.icon;
        return AbstractC33745d.m106656o(AbstractC21702c.m61140k("SecondaryActionButtonViewState(text=", textResource, ", icon=", enumC16313m0, ", action="), this.action, ")");
    }
}
