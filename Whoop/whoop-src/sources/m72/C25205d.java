package m72;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, m65681d2 = {"Lm72/d;", "", "Lgz0/m0;", "icon", "", "title", "description", "Lhy0/h1;", "tag", "buttonText", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Lhy0/h1;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "c", "()Lgz0/m0;", "b", "Ljava/lang/String;", "f", "d", "Lhy0/h1;", "e", "()Lhy0/h1;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25205d {

    /* JADX INFO: renamed from: g */
    public static final int f98972g = C9598e.f28134d | C17750h1.f69012w;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String buttonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C9598e navigationAction;

    public C25205d(EnumC16313m0 icon, String title, String description, C17750h1 c17750h1, String buttonText, C9598e c9598e) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.tag = c17750h1;
        this.buttonText = buttonText;
        this.navigationAction = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25205d)) {
            return false;
        }
        C25205d c25205d = (C25205d) other;
        return this.icon == c25205d.icon && AbstractC22676k.m65745e(this.title, c25205d.title) && AbstractC22676k.m65745e(this.description, c25205d.description) && AbstractC22676k.m65745e(this.tag, c25205d.tag) && AbstractC22676k.m65745e(this.buttonText, c25205d.buttonText) && AbstractC22676k.m65745e(this.navigationAction, c25205d.navigationAction);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.description);
        C17750h1 c17750h1 = this.tag;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31, 31, this.buttonText);
        C9598e c9598e = this.navigationAction;
        return iM30450d2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.title;
        String str2 = this.description;
        C17750h1 c17750h1 = this.tag;
        String str3 = this.buttonText;
        C9598e c9598e = this.navigationAction;
        StringBuilder sb4 = new StringBuilder("SageBottomSheetState(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", description=");
        sb4.append(str2);
        sb4.append(", tag=");
        sb4.append(c17750h1);
        sb4.append(", buttonText=");
        return AbstractC13673n.m38563j(sb4, str3, ", navigationAction=", c9598e, ")");
    }
}
