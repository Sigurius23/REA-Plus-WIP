package c41;

import androidx.compose.p018ui.Modifier;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c41.g4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, m65681d2 = {"Lc41/g4;", "Lm91/u;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "", "currentProgress", "totalSteps", "<init>", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/Modifier;", "b", "()Landroidx/compose/ui/Modifier;", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "d", "I", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4031g4 implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f16371f = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Modifier modifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int currentProgress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int totalSteps;

    public C4031g4(Modifier modifier, TextResource title, TextResource subtitle, int i13, int i14) {
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.modifier = modifier;
        this.title = title;
        this.subtitle = subtitle;
        this.currentProgress = i13;
        this.totalSteps = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTotalSteps() {
        return this.totalSteps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4031g4)) {
            return false;
        }
        C4031g4 c4031g4 = (C4031g4) other;
        return AbstractC22676k.m65745e(this.modifier, c4031g4.modifier) && AbstractC22676k.m65745e(this.title, c4031g4.title) && AbstractC22676k.m65745e(this.subtitle, c4031g4.subtitle) && this.currentProgress == c4031g4.currentProgress && this.totalSteps == c4031g4.totalSteps;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalSteps) + AbstractC11266d.m30448b(this.currentProgress, AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.modifier.hashCode() * 31, this.title, 31), this.subtitle, 31), 31);
    }

    public String toString() {
        Modifier modifier = this.modifier;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        int i13 = this.currentProgress;
        int i14 = this.totalSteps;
        StringBuilder sb4 = new StringBuilder("OnboardingTileState(modifier=");
        sb4.append(modifier);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", subtitle=");
        sb4.append(textResource2);
        sb4.append(", currentProgress=");
        sb4.append(i13);
        sb4.append(", totalSteps=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }

    public /* synthetic */ C4031g4(Modifier modifier, TextResource textResource, TextResource textResource2, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? C2314t.f9131w : modifier, textResource, textResource2, i13, i14);
    }
}
