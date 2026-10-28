package h71;

import d61.InterfaceC11732a;
import i71.C18204h;
import p000.AbstractC11266d;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: h71.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#¨\u0006$"}, m65681d2 = {"Lh71/l;", "", "Ld61/a;", "dataScrubEvent", "Li71/h;", "graphScrollPosition", "Lh2/c;", "scrubberRect", "", "startVerticalAxisSize", "startGraphPadding", "<init>", "(Ld61/a;Li71/h;Lh2/c;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld61/a;", "()Ld61/a;", "b", "Li71/h;", "()Li71/h;", "c", "Lh2/c;", "()Lh2/c;", "d", "F", "e", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16995l {

    /* JADX INFO: renamed from: f */
    public static final int f65298f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC11732a dataScrubEvent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18204h graphScrollPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C16618c scrubberRect;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float startVerticalAxisSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float startGraphPadding;

    public C16995l(InterfaceC11732a dataScrubEvent, C18204h graphScrollPosition, C16618c scrubberRect, float f13, float f14) {
        AbstractC22676k.m65750j(dataScrubEvent, "dataScrubEvent");
        AbstractC22676k.m65750j(graphScrollPosition, "graphScrollPosition");
        AbstractC22676k.m65750j(scrubberRect, "scrubberRect");
        this.dataScrubEvent = dataScrubEvent;
        this.graphScrollPosition = graphScrollPosition;
        this.scrubberRect = scrubberRect;
        this.startVerticalAxisSize = f13;
        this.startGraphPadding = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC11732a getDataScrubEvent() {
        return this.dataScrubEvent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C18204h getGraphScrollPosition() {
        return this.graphScrollPosition;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16618c getScrubberRect() {
        return this.scrubberRect;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getStartGraphPadding() {
        return this.startGraphPadding;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getStartVerticalAxisSize() {
        return this.startVerticalAxisSize;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16995l)) {
            return false;
        }
        C16995l c16995l = (C16995l) other;
        return AbstractC22676k.m65745e(this.dataScrubEvent, c16995l.dataScrubEvent) && AbstractC22676k.m65745e(this.graphScrollPosition, c16995l.graphScrollPosition) && AbstractC22676k.m65745e(this.scrubberRect, c16995l.scrubberRect) && Float.compare(this.startVerticalAxisSize, c16995l.startVerticalAxisSize) == 0 && Float.compare(this.startGraphPadding, c16995l.startGraphPadding) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.startGraphPadding) + AbstractC11266d.m30447a(this.startVerticalAxisSize, (this.scrubberRect.hashCode() + ((this.graphScrollPosition.hashCode() + (this.dataScrubEvent.hashCode() * 31)) * 31)) * 31, 31);
    }

    public String toString() {
        InterfaceC11732a interfaceC11732a = this.dataScrubEvent;
        C18204h c18204h = this.graphScrollPosition;
        C16618c c16618c = this.scrubberRect;
        float f13 = this.startVerticalAxisSize;
        float f14 = this.startGraphPadding;
        StringBuilder sb4 = new StringBuilder("ScrollableScrubberState(dataScrubEvent=");
        sb4.append(interfaceC11732a);
        sb4.append(", graphScrollPosition=");
        sb4.append(c18204h);
        sb4.append(", scrubberRect=");
        sb4.append(c16618c);
        sb4.append(", startVerticalAxisSize=");
        sb4.append(f13);
        sb4.append(", startGraphPadding=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }
}
