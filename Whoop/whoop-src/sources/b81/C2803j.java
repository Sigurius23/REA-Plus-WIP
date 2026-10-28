package b81;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: b81.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJB\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#¨\u0006$"}, m65681d2 = {"Lb81/j;", "Lm91/u;", "", "selectionId", "", "title", "", "selected", "enabled", "", "radius", "<init>", "(ILjava/lang/String;ZZD)V", "a", "(ILjava/lang/String;ZZD)Lb81/j;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "g", "b", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Z", "f", "()Z", "d", "e", "D", "()D", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2803j implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f10992f = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int selectionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean selected;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double radius;

    public C2803j(int i13, String title, boolean z4, boolean z13, double d3) {
        AbstractC22676k.m65750j(title, "title");
        this.selectionId = i13;
        this.title = title;
        this.selected = z4;
        this.enabled = z13;
        this.radius = d3;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C2803j m7983b(C2803j c2803j, int i13, String str, boolean z4, boolean z13, double d3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c2803j.selectionId;
        }
        if ((i14 & 2) != 0) {
            str = c2803j.title;
        }
        if ((i14 & 4) != 0) {
            z4 = c2803j.selected;
        }
        if ((i14 & 8) != 0) {
            z13 = c2803j.enabled;
        }
        if ((i14 & 16) != 0) {
            d3 = c2803j.radius;
        }
        double d14 = d3;
        return c2803j.m7984a(i13, str, z4, z13, d14);
    }

    /* JADX INFO: renamed from: a */
    public final C2803j m7984a(int selectionId, String title, boolean selected, boolean enabled, double radius) {
        AbstractC22676k.m65750j(title, "title");
        return new C2803j(selectionId, title, selected, enabled, radius);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getRadius() {
        return this.radius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2803j)) {
            return false;
        }
        C2803j c2803j = (C2803j) other;
        return this.selectionId == c2803j.selectionId && AbstractC22676k.m65745e(this.title, c2803j.title) && this.selected == c2803j.selected && this.enabled == c2803j.enabled && Double.compare(this.radius, c2803j.radius) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSelectionId() {
        return this.selectionId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Double.hashCode(this.radius) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(Integer.hashCode(this.selectionId) * 31, 31, this.title), 31, this.selected), 31, this.enabled);
    }

    public String toString() {
        int i13 = this.selectionId;
        String str = this.title;
        boolean z4 = this.selected;
        boolean z13 = this.enabled;
        double d3 = this.radius;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "SelectableChipViewState(selectionId=", ", title=", str, ", selected=");
        AbstractC38963t7.m124392v(sbM53373n, z4, ", enabled=", z13, ", radius=");
        return AbstractC30007c.m91836f(d3, ")", sbM53373n);
    }

    public /* synthetic */ C2803j(int i13, String str, boolean z4, boolean z13, double d3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, z4, (i14 & 8) != 0 ? true : z13, (i14 & 16) != 0 ? 2.0d : d3);
    }
}
