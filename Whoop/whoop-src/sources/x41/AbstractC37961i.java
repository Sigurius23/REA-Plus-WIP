package x41;

import com.google.android.gms.common.util.VisibleForTesting;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w41.AbstractC36824x;
import w41.AbstractC36826z;

/* JADX INFO: renamed from: x41.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lw41/z;", "mapState", "", "isStartActivityRevampEnabled", "hasExternalControls", "Lw41/x;", "a", "(Lw41/z;ZZ)Lw41/x;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37961i {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final AbstractC36824x m121585a(AbstractC36826z mapState, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(mapState, "mapState");
        if (!z4 || !(mapState instanceof AbstractC36826z.a)) {
            return null;
        }
        AbstractC36824x.a mapContentPadding = ((AbstractC36826z.a) mapState).getMapContentPadding();
        if (mapContentPadding != null) {
            return mapContentPadding;
        }
        if (!z13) {
            return new AbstractC36824x.a(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }
        float f13 = 8;
        float f14 = 2 * f13;
        return new AbstractC36824x.a(f14, f14, 0 * f13, 16 * f13, null);
    }
}
