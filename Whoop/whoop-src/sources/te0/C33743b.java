package te0;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: te0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u0018\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b\u001f\u0010&¨\u0006'"}, m65681d2 = {"Lte0/b;", "", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "", "title", "Lgz0/m0;", "icon", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "description", "Lte0/e;", "dialog", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Lgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lte0/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "e", "()Lcom/whoop/navigation/e;", "b", "Ljava/lang/String;", "f", "c", "Lgz0/m0;", "d", "()Lgz0/m0;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "Lte0/e;", "()Lte0/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33743b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Action action;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C33746e dialog;

    public C33743b(C9598e c9598e, String title, EnumC16313m0 enumC16313m0, Action action, String str, C33746e c33746e) {
        AbstractC22676k.m65750j(title, "title");
        this.navigation = c9598e;
        this.title = title;
        this.icon = enumC16313m0;
        this.action = action;
        this.description = str;
        this.dialog = c33746e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C33746e getDialog() {
        return this.dialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33743b)) {
            return false;
        }
        C33743b c33743b = (C33743b) other;
        return AbstractC22676k.m65745e(this.navigation, c33743b.navigation) && AbstractC22676k.m65745e(this.title, c33743b.title) && this.icon == c33743b.icon && AbstractC22676k.m65745e(this.action, c33743b.action) && AbstractC22676k.m65745e(this.description, c33743b.description) && AbstractC22676k.m65745e(this.dialog, c33743b.dialog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        C9598e c9598e = this.navigation;
        int iM30450d = AbstractC11266d.m30450d((c9598e == null ? 0 : c9598e.hashCode()) * 31, 31, this.title);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        String str = this.description;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C33746e c33746e = this.dialog;
        return iHashCode3 + (c33746e != null ? c33746e.hashCode() : 0);
    }

    public String toString() {
        return "TestResultBottomSheetItemViewState(navigation=" + this.navigation + ", title=" + this.title + ", icon=" + this.icon + ", action=" + this.action + ", description=" + this.description + ", dialog=" + this.dialog + ")";
    }
}
