package gm1;

import g61.C15529b;
import i91.AbstractC18249c;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import k71.C22256m;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import u61.C34552a;
import u61.C34556e;

/* JADX INFO: renamed from: gm1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lk71/m;", "c", "(Lk71/m;)Lk71/m;", "Lj71/c;", "b", "(Lj71/c;)Lj71/c;", "Lj61/h;", "a", "(Lj61/h;)Lj61/h;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15994d {
    /* JADX INFO: renamed from: a */
    private static final C21374h m45255a(C21374h c21374h) {
        C15529b bottomHorizontalAxis = c21374h.getBottomHorizontalAxis();
        return c21374h.m59985a((8187 & 1) != 0 ? c21374h.startVerticalAxis : null, (8187 & 2) != 0 ? c21374h.endVerticalAxis : null, (8187 & 4) != 0 ? c21374h.bottomHorizontalAxis : bottomHorizontalAxis != null ? C15529b.m43718b(bottomHorizontalAxis, 0.2f, null, 0.0f, null, null, false, null, null, 254, null) : null, (8187 & 8) != 0 ? c21374h.topHorizontalAxis : null, (8187 & 16) != 0 ? c21374h.insets : null, (8187 & 32) != 0 ? c21374h.lines : null, (8187 & 64) != 0 ? c21374h.graphAnnotations : null, (8187 & 128) != 0 ? c21374h.accessibilityState : null, (8187 & 256) != 0 ? c21374h.scrubberEnabled : false, (8187 & 512) != 0 ? c21374h.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21374h.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21374h.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? c21374h.horizontalGridLinePadding : 0.0f);
    }

    /* JADX INFO: renamed from: b */
    private static final C21395c m45256b(C21395c c21395c) {
        C22230c c22230cM63731b;
        C21374h c21374hM45255a = m45255a(c21395c.getPlane());
        List<AbstractC21394b> listM60096f = c21395c.m60096f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM60096f, 10));
        for (AbstractC21394b gVar : listM60096f) {
            if (gVar instanceof AbstractC21394b.g) {
                AbstractC21394b.g gVar2 = (AbstractC21394b.g) gVar;
                List<C34552a> listM60076g = gVar2.m60076g();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM60076g, 10));
                for (C34552a c34552a : listM60076g) {
                    List<C34556e> listM109234d = c34552a.m109234d();
                    C22228a fillState = c34552a.getFillState();
                    C22230c strokeState = c34552a.getStrokeState();
                    if (strokeState != null) {
                        C22230c strokeState2 = c34552a.getStrokeState();
                        c22230cM63731b = C22230c.m63731b(strokeState, 0.0f, 0, 0, AbstractC18249c.m52577o(strokeState2 != null ? C17919x.m51541c(0.5f, strokeState2.getScrubbedBackground()) : C17919x.f69629f), 0L, false, 55, null);
                    } else {
                        c22230cM63731b = null;
                    }
                    arrayList2.add(new C34552a(listM109234d, fillState, c22230cM63731b, null, 8, null));
                }
                gVar = new AbstractC21394b.g(arrayList2, gVar2.getId(), gVar2.getSkipScrubbing(), null, null, false, 56, null);
            }
            arrayList.add(gVar);
        }
        return C21395c.m60092b(c21395c, c21374hM45255a, arrayList, null, null, 12, null);
    }

    /* JADX INFO: renamed from: c */
    public static final C22256m m45257c(C22256m c22256m) {
        InterfaceC25312u graphItem;
        AbstractC22676k.m65750j(c22256m, "<this>");
        InterfaceC25312u graphItem2 = c22256m.getGraphItem();
        C21395c c21395c = graphItem2 instanceof C21395c ? (C21395c) graphItem2 : null;
        if (c21395c == null || (graphItem = m45256b(c21395c)) == null) {
            graphItem = c22256m.getGraphItem();
        }
        return C22256m.m63894b(c22256m, null, null, null, null, null, null, null, graphItem, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, 8388479, null);
    }
}
