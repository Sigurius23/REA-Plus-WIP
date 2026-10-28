package wr0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p043c4.InterfaceC3964i0;
import p636y3.C39179k;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wr0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lwr0/o;", "Lc4/i0;", "", "gapPx", "<init>", "(I)V", "Ly3/k;", "anchorBounds", "Ly3/l;", "windowSize", "Ly3/m;", "layoutDirection", "popupContentSize", "Ly3/j;", "i", "(Ly3/k;JLy3/m;J)J", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "I", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C37544o implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int gapPx;

    public C37544o(int i13) {
        this.gapPx = i13;
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public long mo11994i(C39179k anchorBounds, long windowSize, EnumC39181m layoutDirection, long popupContentSize) {
        AbstractC22676k.m65750j(anchorBounds, "anchorBounds");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        int i13 = anchorBounds.f168420c - ((int) (popupContentSize >> 32));
        int i14 = anchorBounds.f168421d;
        int i15 = this.gapPx;
        int i16 = i14 + i15;
        int i17 = (int) (popupContentSize & 4294967295L);
        if (i16 + i17 > ((int) (windowSize & 4294967295L))) {
            i16 = (anchorBounds.f168419b - i17) - i15;
        }
        return (((long) i13) << 32) | (((long) i16) & 4294967295L);
    }
}
