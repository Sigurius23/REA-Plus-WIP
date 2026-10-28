package m61;

import java.util.ArrayList;
import java.util.List;
import k61.C22230c;
import l61.C23378c;
import l61.C23379d;
import l83.C23465k;
import m83.AbstractC25267u;
import p181h2.C16617b;
import p270k2.C22135i;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m61.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lm61/a;", "", "Lk61/c;", "strokeState", "Ly3/c;", "density", "<init>", "(Lk61/c;Ly3/c;)V", "Ll61/d;", "segment", "Lh2/e;", "size", "", "Ll83/k;", "Lh2/b;", "b", "(Ll61/d;J)Ljava/util/List;", "a", "Lk61/c;", "Lk2/i;", "Lk2/i;", "()Lk2/i;", "stroke", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25108a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22230c strokeState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22135i stroke;

    public C25108a(C22230c c22230c, InterfaceC39171c density) {
        AbstractC22676k.m65750j(density, "density");
        this.strokeState = c22230c;
        this.stroke = c22230c != null ? new C22135i(density.mo743q0(c22230c.getWidth()), 0.0f, c22230c.getCap(), c22230c.getJoin(), null, 18) : null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22135i getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23465k> m73615b(C23379d segment, long size) {
        AbstractC22676k.m65750j(segment, "segment");
        List<C23378c> listM67671b = segment.m67671b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM67671b, 10));
        for (C23378c c23378c : listM67671b) {
            int i13 = (int) (size >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i13) * c23378c.getXPercent();
            int i14 = (int) (size & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i14) - (Float.intBitsToFloat(i14) * c23378c.getYPercentTop());
            C16617b c16617b = new C16617b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
            float fIntBitsToFloat3 = Float.intBitsToFloat(i13) * c23378c.getXPercent();
            float fIntBitsToFloat4 = Float.intBitsToFloat(i14) - (Float.intBitsToFloat(i14) * c23378c.getYPercentBot());
            arrayList.add(new C23465k(c16617b, new C16617b((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L))));
        }
        return arrayList;
    }
}
