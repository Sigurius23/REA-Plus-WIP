package xk1;

import com.whoop.whoopaction.domain.models.Action;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xk1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lxk1/b;", "", "", "buttonTitle", "caption", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38428b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String buttonTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String caption;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Action action;

    public C38428b(String buttonTitle, String str, Action action) {
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(action, "action");
        this.buttonTitle = buttonTitle;
        this.caption = str;
        this.action = action;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38428b)) {
            return false;
        }
        C38428b c38428b = (C38428b) other;
        return AbstractC22676k.m65745e(this.buttonTitle, c38428b.buttonTitle) && AbstractC22676k.m65745e(this.caption, c38428b.caption) && AbstractC22676k.m65745e(this.action, c38428b.action);
    }

    public int hashCode() {
        int iHashCode = this.buttonTitle.hashCode() * 31;
        String str = this.caption;
        return this.action.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.buttonTitle;
        String str2 = this.caption;
        Action action = this.action;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CallSection(buttonTitle=", str, ", caption=", str2, ", action=");
        sbM32001t.append(action);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
