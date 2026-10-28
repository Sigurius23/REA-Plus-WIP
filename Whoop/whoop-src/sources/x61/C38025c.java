package x61;

import android.content.Context;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u61.C34555d;
import y61.C39260a;

/* JADX INFO: renamed from: x61.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lx61/c;", "", "Landroid/content/Context;", "context", "Lx61/e;", "textResourceCharacterCounter", "<init>", "(Landroid/content/Context;Lx61/e;)V", "Ly61/a;", "firstLabel", "secondLabel", "", "parentWidth", "fontScale", "", "b", "(Ly61/a;Ly61/a;FF)Z", "", "a", "(Ly61/a;Ly61/a;F)D", "previousGroup", "nextGroup", "c", "Landroid/content/Context;", "Lx61/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38025c {

    /* JADX INFO: renamed from: d */
    public static final int f162925d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38027e textResourceCharacterCounter;

    public C38025c(Context context, C38027e textResourceCharacterCounter) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(textResourceCharacterCounter, "textResourceCharacterCounter");
        this.context = context;
        this.textResourceCharacterCounter = textResourceCharacterCounter;
    }

    /* JADX INFO: renamed from: a */
    private final double m121752a(C39260a firstLabel, C39260a secondLabel, float fontScale) {
        C38027e c38027e = this.textResourceCharacterCounter;
        C34555d topText = firstLabel.getTopText();
        int iM121760a = c38027e.m121760a(topText != null ? topText.getLabel() : null);
        C38027e c38027e2 = this.textResourceCharacterCounter;
        C34555d topText2 = secondLabel.getTopText();
        return ((((double) (c38027e2.m121760a(topText2 != null ? topText2.getLabel() : null) + iM121760a)) / 2.0d) * ((double) 10) * ((double) fontScale)) + ((double) 100);
    }

    /* JADX INFO: renamed from: b */
    private final boolean m121753b(C39260a firstLabel, C39260a secondLabel, float parentWidth, float fontScale) {
        return ((double) (Math.abs(firstLabel.getTopXPercent() - secondLabel.getTopXPercent()) * parentWidth)) <= m121752a(firstLabel, secondLabel, fontScale);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m121754c(C39260a previousGroup, C39260a nextGroup, float parentWidth, float fontScale) {
        AbstractC22676k.m65750j(previousGroup, "previousGroup");
        AbstractC22676k.m65750j(nextGroup, "nextGroup");
        return m121753b(previousGroup, nextGroup, parentWidth, fontScale);
    }

    public /* synthetic */ C38025c(Context context, C38027e c38027e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? new C38027e(context) : c38027e);
    }
}
