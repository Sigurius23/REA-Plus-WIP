package q81;

import com.whoop.design.util.TextResource;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: q81.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, m65681d2 = {"Lq81/h;", "Lq81/j;", "Lq81/i;", "style", "Lcom/whoop/design/util/TextResource;", "title", "Lq81/b;", "baseTimerState", "", "targetTimeInSeconds", "<init>", "(Lq81/i;Lcom/whoop/design/util/TextResource;Lq81/b;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq81/i;", "b", "()Lq81/i;", "Lcom/whoop/design/util/TextResource;", "d", "()Lcom/whoop/design/util/TextResource;", "c", "Lq81/b;", "()Lq81/b;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final /* data */ class C30050h implements InterfaceC30052j {

    /* JADX INFO: renamed from: e */
    public static final int f122662e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC30051i style;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C30044b baseTimerState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Integer targetTimeInSeconds;

    public C30050h(EnumC30051i style, TextResource title, C30044b baseTimerState, Integer num) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(baseTimerState, "baseTimerState");
        this.style = style;
        this.title = title;
        this.baseTimerState = baseTimerState;
        this.targetTimeInSeconds = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C30044b getBaseTimerState() {
        return this.baseTimerState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC30051i getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getTargetTimeInSeconds() {
        return this.targetTimeInSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30050h)) {
            return false;
        }
        C30050h c30050h = (C30050h) other;
        return this.style == c30050h.style && AbstractC22676k.m65745e(this.title, c30050h.title) && AbstractC22676k.m65745e(this.baseTimerState, c30050h.baseTimerState) && AbstractC22676k.m65745e(this.targetTimeInSeconds, c30050h.targetTimeInSeconds);
    }

    public int hashCode() {
        int iHashCode = (this.baseTimerState.hashCode() + AbstractC31061c.m95625a(this.style.hashCode() * 31, this.title, 31)) * 31;
        Integer num = this.targetTimeInSeconds;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "WeightliftingTimerState(style=" + this.style + ", title=" + this.title + ", baseTimerState=" + this.baseTimerState + ", targetTimeInSeconds=" + this.targetTimeInSeconds + ")";
    }

    public /* synthetic */ C30050h(EnumC30051i enumC30051i, TextResource textResource, C30044b c30044b, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC30051i, textResource, c30044b, (i13 & 8) != 0 ? null : num);
    }
}
