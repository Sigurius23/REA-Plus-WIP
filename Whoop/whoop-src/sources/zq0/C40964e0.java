package zq0;

import p043c4.InterfaceC3964i0;
import p636y3.C39179k;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zq0.e0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lzq0/e0;", "Lc4/i0;", "<init>", "()V", "Ly3/k;", "anchorBounds", "Ly3/l;", "windowSize", "Ly3/m;", "layoutDirection", "popupContentSize", "Ly3/j;", "i", "(Ly3/k;JLy3/m;J)J", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C40964e0 implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: w */
    public static final C40964e0 f176770w = new C40964e0();

    private C40964e0() {
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public long mo11994i(C39179k anchorBounds, long windowSize, EnumC39181m layoutDirection, long popupContentSize) {
        AbstractC22676k.m65750j(anchorBounds, "anchorBounds");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        int i13 = anchorBounds.f168420c - ((int) (popupContentSize >> 32));
        int i14 = anchorBounds.f168421d;
        int i15 = (int) (popupContentSize & 4294967295L);
        if (i14 + i15 > ((int) (windowSize & 4294967295L))) {
            i14 = anchorBounds.f168419b - i15;
        }
        return (((long) i13) << 32) | (((long) i14) & 4294967295L);
    }
}
