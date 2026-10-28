package androidx.compose.p018ui.graphics.painter;

import p208i2.AbstractC17921y;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p331n2.AbstractC26165a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Ln2/a;", "ui-graphics_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ColorPainter extends AbstractC26165a {

    /* JADX INFO: renamed from: E */
    public final long f4819E;

    /* JADX INFO: renamed from: G */
    public AbstractC17921y f4821G;

    /* JADX INFO: renamed from: F */
    public float f4820F = 1.0f;

    /* JADX INFO: renamed from: H */
    public final long f4822H = 9205357640488583168L;

    public ColorPainter(long j7) {
        this.f4819E = j7;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: b */
    public final void mo3489b(float f13) {
        this.f4820F = f13;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: e */
    public final void mo3490e(AbstractC17921y abstractC17921y) {
        this.f4821G = abstractC17921y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColorPainter) {
            return C17919x.m51542d(this.f4819E, ((ColorPainter) obj).f4819E);
        }
        return false;
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getF4822H() {
        return this.f4822H;
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f4819E);
    }

    @Override // p331n2.AbstractC26165a
    /* JADX INFO: renamed from: i */
    public final void mo3492i(InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e.m63383i0(interfaceC22131e, this.f4819E, 0L, 0L, this.f4820F, this.f4821G, 0, 86);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) C17919x.m51548j(this.f4819E)) + ')';
    }
}
