package f11;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: f11.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u009c\u0001\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b3\u0010*R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b%\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00106\u001a\u0004\b9\u00108R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b1\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b4\u0010=¨\u0006>"}, m65681d2 = {"Lf11/e;", "Lm91/u;", "Lf11/b;", "header", "", "isHomeTile", "fillFullSpace", "", "Lf11/h;", "tickMarkStates", "Lf11/g;", "labels", "isFadeIn", "useEdgeFade", "", "tickMarkWidth", "tickMarkHeight", "belowLabelClearsTicks", "Lf11/f;", "expectedAnnotation", "Lf11/a;", "footer", "<init>", "(Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;)V", "a", "(Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;)Lf11/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lf11/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lf11/b;", "b", "Z", "o", "()Z", "c", "f", "d", "Ljava/util/List;", "k", "()Ljava/util/List;", "e", "i", "n", "g", "m", "F", "l", "()F", "j", "Lf11/f;", "()Lf11/f;", "Lf11/a;", "()Lf11/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14005e implements InterfaceC25312u {

    /* JADX INFO: renamed from: m */
    public static final int f49972m = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C14002b header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isHomeTile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean fillFullSpace;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C14008h> tickMarkStates;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C14007g> labels;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean isFadeIn;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean useEdgeFade;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float tickMarkWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float tickMarkHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean belowLabelClearsTicks;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C14006f expectedAnnotation;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C14001a footer;

    public C14005e(C14002b c14002b, boolean z4, boolean z13, List<C14008h> tickMarkStates, List<C14007g> list, boolean z14, boolean z15, float f13, float f14, boolean z16, C14006f c14006f, C14001a c14001a) {
        AbstractC22676k.m65750j(tickMarkStates, "tickMarkStates");
        this.header = c14002b;
        this.isHomeTile = z4;
        this.fillFullSpace = z13;
        this.tickMarkStates = tickMarkStates;
        this.labels = list;
        this.isFadeIn = z14;
        this.useEdgeFade = z15;
        this.tickMarkWidth = f13;
        this.tickMarkHeight = f14;
        this.belowLabelClearsTicks = z16;
        this.expectedAnnotation = c14006f;
        this.footer = c14001a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14005e m39876b(C14005e c14005e, C14002b c14002b, boolean z4, boolean z13, List list, List list2, boolean z14, boolean z15, float f13, float f14, boolean z16, C14006f c14006f, C14001a c14001a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c14002b = c14005e.header;
        }
        if ((i13 & 2) != 0) {
            z4 = c14005e.isHomeTile;
        }
        if ((i13 & 4) != 0) {
            z13 = c14005e.fillFullSpace;
        }
        if ((i13 & 8) != 0) {
            list = c14005e.tickMarkStates;
        }
        if ((i13 & 16) != 0) {
            list2 = c14005e.labels;
        }
        if ((i13 & 32) != 0) {
            z14 = c14005e.isFadeIn;
        }
        if ((i13 & 64) != 0) {
            z15 = c14005e.useEdgeFade;
        }
        if ((i13 & 128) != 0) {
            f13 = c14005e.tickMarkWidth;
        }
        if ((i13 & 256) != 0) {
            f14 = c14005e.tickMarkHeight;
        }
        if ((i13 & 512) != 0) {
            z16 = c14005e.belowLabelClearsTicks;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c14006f = c14005e.expectedAnnotation;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c14001a = c14005e.footer;
        }
        C14006f c14006f2 = c14006f;
        C14001a c14001a2 = c14001a;
        float f15 = f14;
        boolean z17 = z16;
        boolean z18 = z15;
        float f16 = f13;
        List list3 = list2;
        boolean z19 = z14;
        return c14005e.m39877a(c14002b, z4, z13, list, list3, z19, z18, f16, f15, z17, c14006f2, c14001a2);
    }

    /* JADX INFO: renamed from: a */
    public final C14005e m39877a(C14002b header, boolean isHomeTile, boolean fillFullSpace, List<C14008h> tickMarkStates, List<C14007g> labels, boolean isFadeIn, boolean useEdgeFade, float tickMarkWidth, float tickMarkHeight, boolean belowLabelClearsTicks, C14006f expectedAnnotation, C14001a footer) {
        AbstractC22676k.m65750j(tickMarkStates, "tickMarkStates");
        return new C14005e(header, isHomeTile, fillFullSpace, tickMarkStates, labels, isFadeIn, useEdgeFade, tickMarkWidth, tickMarkHeight, belowLabelClearsTicks, expectedAnnotation, footer);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getBelowLabelClearsTicks() {
        return this.belowLabelClearsTicks;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C14006f getExpectedAnnotation() {
        return this.expectedAnnotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14005e)) {
            return false;
        }
        C14005e c14005e = (C14005e) other;
        return AbstractC22676k.m65745e(this.header, c14005e.header) && this.isHomeTile == c14005e.isHomeTile && this.fillFullSpace == c14005e.fillFullSpace && AbstractC22676k.m65745e(this.tickMarkStates, c14005e.tickMarkStates) && AbstractC22676k.m65745e(this.labels, c14005e.labels) && this.isFadeIn == c14005e.isFadeIn && this.useEdgeFade == c14005e.useEdgeFade && Float.compare(this.tickMarkWidth, c14005e.tickMarkWidth) == 0 && Float.compare(this.tickMarkHeight, c14005e.tickMarkHeight) == 0 && this.belowLabelClearsTicks == c14005e.belowLabelClearsTicks && AbstractC22676k.m65745e(this.expectedAnnotation, c14005e.expectedAnnotation) && AbstractC22676k.m65745e(this.footer, c14005e.footer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getFillFullSpace() {
        return this.fillFullSpace;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C14001a getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C14002b getHeader() {
        return this.header;
    }

    public int hashCode() {
        C14002b c14002b = this.header;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((c14002b == null ? 0 : c14002b.hashCode()) * 31, 31, this.isHomeTile), 31, this.fillFullSpace), 31, this.tickMarkStates);
        List<C14007g> list = this.labels;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.tickMarkHeight, AbstractC11266d.m30447a(this.tickMarkWidth, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (list == null ? 0 : list.hashCode())) * 31, 31, this.isFadeIn), 31, this.useEdgeFade), 31), 31), 31, this.belowLabelClearsTicks);
        C14006f c14006f = this.expectedAnnotation;
        int iHashCode = (iM8289b + (c14006f == null ? 0 : c14006f.hashCode())) * 31;
        C14001a c14001a = this.footer;
        return iHashCode + (c14001a != null ? c14001a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List<C14007g> m39883i() {
        return this.labels;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getTickMarkHeight() {
        return this.tickMarkHeight;
    }

    /* JADX INFO: renamed from: k */
    public final List<C14008h> m39885k() {
        return this.tickMarkStates;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getTickMarkWidth() {
        return this.tickMarkWidth;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getUseEdgeFade() {
        return this.useEdgeFade;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsFadeIn() {
        return this.isFadeIn;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsHomeTile() {
        return this.isHomeTile;
    }

    public String toString() {
        C14002b c14002b = this.header;
        boolean z4 = this.isHomeTile;
        boolean z13 = this.fillFullSpace;
        List<C14008h> list = this.tickMarkStates;
        List<C14007g> list2 = this.labels;
        boolean z14 = this.isFadeIn;
        boolean z15 = this.useEdgeFade;
        float f13 = this.tickMarkWidth;
        float f14 = this.tickMarkHeight;
        boolean z16 = this.belowLabelClearsTicks;
        C14006f c14006f = this.expectedAnnotation;
        C14001a c14001a = this.footer;
        StringBuilder sb4 = new StringBuilder("DailyTickMarkState(header=");
        sb4.append(c14002b);
        sb4.append(", isHomeTile=");
        sb4.append(z4);
        sb4.append(", fillFullSpace=");
        AbstractC25012a.m73391x(", tickMarkStates=", ", labels=", sb4, list, z13);
        AbstractC26725a.m79512p(", isFadeIn=", ", useEdgeFade=", sb4, list2, z14);
        sb4.append(z15);
        sb4.append(", tickMarkWidth=");
        sb4.append(f13);
        sb4.append(", tickMarkHeight=");
        sb4.append(f14);
        sb4.append(", belowLabelClearsTicks=");
        sb4.append(z16);
        sb4.append(", expectedAnnotation=");
        sb4.append(c14006f);
        sb4.append(", footer=");
        sb4.append(c14001a);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C14005e(C14002b c14002b, boolean z4, boolean z13, List list, List list2, boolean z14, boolean z15, float f13, float f14, boolean z16, C14006f c14006f, C14001a c14001a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c14002b, (i13 & 2) != 0 ? false : z4, z13, list, list2, z14, (i13 & 64) != 0 ? false : z15, (i13 & 128) != 0 ? 4.0f : f13, (i13 & 256) != 0 ? 8.0f : f14, (i13 & 512) != 0 ? false : z16, c14006f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c14001a);
    }
}
