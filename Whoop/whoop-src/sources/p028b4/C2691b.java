package p028b4;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.node.C1134a;
import androidx.datastore.preferences.protobuf.AbstractC1230l;
import io.sentry.internal.debugmeta.C20378c;
import java.util.List;
import p043c4.C3983z;
import p184h5.C16866d1;
import p184h5.C16905q1;
import p543v4.C35643b;
import p557vo.AbstractC36220b;
import p635y2.AbstractC39125q1;

/* JADX INFO: renamed from: b4.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C2691b extends AbstractC1230l {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ViewGroup f10589E;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f10590z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2691b(ViewGroup viewGroup, int i13) {
        super(1);
        this.f10590z = i13;
        this.f10589E = viewGroup;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: i */
    public final C16905q1 mo3874i(C16905q1 c16905q1, List list) {
        switch (this.f10590z) {
            case 0:
                return ((AbstractC2701l) this.f10589E).m7581m(c16905q1);
            default:
                C3983z c3983z = (C3983z) this.f10589E;
                if (c3983z.f16209M) {
                    return c16905q1;
                }
                View childAt = c3983z.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c3983z.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c3983z.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? c16905q1 : c16905q1.f64864a.mo47533n(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: j */
    public final C20378c mo3875j(C16866d1 c16866d1, C20378c c20378c) {
        switch (this.f10590z) {
            case 0:
                C1134a c1134a = (C1134a) ((AbstractC2701l) this.f10589E).f10641b0.f783e0.f740d;
                if (!c1134a.f4881p0.f9141N) {
                    return c20378c;
                }
                long jM115291C = AbstractC36220b.m115291C(c1134a.mo3523Z(0L));
                int i13 = (int) (jM115291C >> 32);
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = (int) (jM115291C & 4294967295L);
                if (i14 < 0) {
                    i14 = 0;
                }
                long jMo3541n = AbstractC39125q1.m124662h(c1134a).mo3541n();
                int i15 = (int) (jMo3541n >> 32);
                int i16 = (int) (jMo3541n & 4294967295L);
                long j7 = c1134a.f168213y;
                long jM115291C2 = AbstractC36220b.m115291C(c1134a.mo3523Z((((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L)));
                int i17 = i15 - ((int) (jM115291C2 >> 32));
                if (i17 < 0) {
                    i17 = 0;
                }
                int i18 = i16 - ((int) (4294967295L & jM115291C2));
                int i19 = i18 >= 0 ? i18 : 0;
                if (i13 == 0 && i14 == 0 && i17 == 0 && i19 == 0) {
                    return c20378c;
                }
                return new C20378c(17, AbstractC2701l.m7580l((C35643b) c20378c.f76422x, i13, i14, i17, i19), AbstractC2701l.m7580l((C35643b) c20378c.f76423y, i13, i14, i17, i19));
            default:
                C3983z c3983z = (C3983z) this.f10589E;
                if (c3983z.f16209M) {
                    return c20378c;
                }
                View childAt = c3983z.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c3983z.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c3983z.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return c20378c;
                }
                C35643b c35643bM112840b = C35643b.m112840b(iMax, iMax2, iMax3, iMax4);
                int i24 = c35643bM112840b.f151449a;
                C35643b c35643b = (C35643b) c20378c.f76422x;
                int i25 = c35643bM112840b.f151450b;
                int i26 = c35643bM112840b.f151451c;
                int i27 = c35643bM112840b.f151452d;
                return new C20378c(17, C16905q1.m47595e(c35643b, i24, i25, i26, i27), C16905q1.m47595e((C35643b) c20378c.f76423y, i24, i25, i26, i27));
        }
    }
}
