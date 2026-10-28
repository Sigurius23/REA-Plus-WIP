package vz0;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: vz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lvz0/b;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "text", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lgz0/m0;", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lgz0/m0;", "()Lgz0/m0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36613b implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f156835d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e navigation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 icon;

    public C36613b(TextResource text, C9598e c9598e, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.navigation = c9598e;
        this.icon = enumC16313m0;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36613b)) {
            return false;
        }
        C36613b c36613b = (C36613b) other;
        return AbstractC22676k.m65745e(this.text, c36613b.text) && AbstractC22676k.m65745e(this.navigation, c36613b.navigation) && this.icon == c36613b.icon;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        C9598e c9598e = this.navigation;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return iHashCode2 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        return "AdditionalInfoTextState(text=" + this.text + ", navigation=" + this.navigation + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ C36613b(TextResource textResource, C9598e c9598e, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, c9598e, (i13 & 4) != 0 ? null : enumC16313m0);
    }
}
