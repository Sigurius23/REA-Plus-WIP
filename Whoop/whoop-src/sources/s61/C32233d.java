package s61;

import android.graphics.DashPathEffect;
import i71.C18204h;
import i71.C18205i;
import i71.InterfaceC18203g;
import java.util.ArrayList;
import java.util.List;
import k61.C22230c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p181h2.C16617b;
import p208i2.C17893k;
import p270k2.C22135i;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import u61.C34552a;
import u61.C34556e;

/* JADX INFO: renamed from: s61.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Ls61/d;", "", "Lk61/c;", "strokeState", "Li71/h;", "scrollPosition", "Li71/g;", "dataScroller", "Ly3/c;", "density", "<init>", "(Lk61/c;Li71/h;Li71/g;Ly3/c;)V", "Lu61/a;", "segment", "Lh2/e;", "size", "", "Lh2/b;", "c", "(Lu61/a;J)Ljava/util/List;", "a", "Lk61/c;", "b", "Li71/h;", "Li71/g;", "Lk2/i;", "d", "Lk2/i;", "()Lk2/i;", "stroke", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32233d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22230c strokeState;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18204h scrollPosition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC18203g dataScroller;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C22135i stroke;

    public C32233d(C22230c strokeState, C18204h scrollPosition, InterfaceC18203g dataScroller, InterfaceC39171c density) {
        AbstractC22676k.m65750j(strokeState, "strokeState");
        AbstractC22676k.m65750j(scrollPosition, "scrollPosition");
        AbstractC22676k.m65750j(dataScroller, "dataScroller");
        AbstractC22676k.m65750j(density, "density");
        this.strokeState = strokeState;
        this.scrollPosition = scrollPosition;
        this.dataScroller = dataScroller;
        this.stroke = new C22135i(density.mo743q0(strokeState.getWidth()), 0.0f, strokeState.getCap(), strokeState.getJoin(), strokeState.getIsDashed() ? new C17893k(new DashPathEffect(new float[]{8.0f, 12.0f}, 0.0f)) : null, 2);
    }

    /* JADX INFO: renamed from: a */
    public final List<C16617b> m100276a(C34552a segment, long size) {
        AbstractC22676k.m65750j(segment, "segment");
        List<C16617b> listM100278c = m100278c(segment, size);
        if (listM100278c.isEmpty()) {
            return listM100278c;
        }
        int i13 = (int) (size & 4294967295L);
        long jM47185a = C16617b.m47185a(0.0f, Float.intBitsToFloat(i13), ((C16617b) AbstractC25265s.m74112P0(listM100278c)).f63937a, 1);
        long jM47185a2 = C16617b.m47185a(0.0f, Float.intBitsToFloat(i13), ((C16617b) AbstractC25265s.m74096F0(listM100278c)).f63937a, 1);
        return AbstractC25265s.m74128f1(new C16617b(jM47185a2), AbstractC25265s.m74128f1(new C16617b(jM47185a), listM100278c));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C22135i getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: c */
    public final List<C16617b> m100278c(C34552a segment, long size) {
        AbstractC22676k.m65750j(segment, "segment");
        List<C34556e> listMo52257a = this.dataScroller.mo52257a(segment.m109234d(), this.scrollPosition, segment.getScrollerOffset());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listMo52257a, 10));
        for (C34556e c34556e : listMo52257a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (size >> 32)) * c34556e.getXPercent();
            int i13 = (int) (size & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i13) - (Float.intBitsToFloat(i13) * c34556e.getYPercent());
            arrayList.add(new C16617b((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
        }
        return arrayList;
    }

    public /* synthetic */ C32233d(C22230c c22230c, C18204h c18204h, InterfaceC18203g interfaceC18203g, InterfaceC39171c interfaceC39171c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C22230c(0.0f, 0, 0, null, 0L, false, 63, null) : c22230c, (i13 & 2) != 0 ? new C18204h(0L, 0L, 0L, 0.0f, 15, null) : c18204h, (i13 & 4) != 0 ? new C18205i() : interfaceC18203g, interfaceC39171c);
    }
}
