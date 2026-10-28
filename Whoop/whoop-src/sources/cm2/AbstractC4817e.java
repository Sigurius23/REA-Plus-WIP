package cm2;

import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import l61.C23378c;
import l61.C23379d;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.EnumC28166h0;
import p181h2.C16618c;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.C34552a;
import u61.C34556e;
import vl2.EnumC36106a;

/* JADX INFO: renamed from: cm2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lj71/c;", "graphState", "", "isScrubbing", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "a", "(Lj71/c;ZLor2/h0;Lvl2/a;)Lj71/c;", "Lj61/h;", "plane", "b", "(Lj61/h;)Lj61/h;", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4817e {
    /* JADX INFO: renamed from: a */
    public static final C21395c m15204a(C21395c graphState, boolean z4, EnumC28166h0 graphKey, EnumC36106a duration) {
        boolean z13;
        C22228a c22228aM63727b;
        C22230c c22230cM63731b;
        AbstractC18247a abstractC18247aM52577o;
        C22228a c22228aM63727b2;
        C22230c c22230cM63731b2;
        float width;
        AbstractC18247a abstractC18247aM52577o2;
        AbstractC22676k.m65750j(graphState, "graphState");
        AbstractC22676k.m65750j(graphKey, "graphKey");
        AbstractC22676k.m65750j(duration, "duration");
        List<AbstractC21394b> listM60096f = graphState.m60096f();
        int i13 = 1;
        boolean z14 = false;
        if (!(listM60096f instanceof Collection) || !listM60096f.isEmpty()) {
            Iterator<T> it = listM60096f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z13 = false;
                    break;
                }
                if (((AbstractC21394b) it.next()) instanceof AbstractC21394b.k) {
                    z13 = true;
                    break;
                }
            }
        } else {
            z13 = false;
            break;
        }
        List<AbstractC21394b> listM60096f2 = graphState.m60096f();
        if (!(listM60096f2 instanceof Collection) || !listM60096f2.isEmpty()) {
            for (AbstractC21394b abstractC21394b : listM60096f2) {
                if ((abstractC21394b instanceof AbstractC21394b.g) || (abstractC21394b instanceof AbstractC21394b.a) || (abstractC21394b instanceof AbstractC21394b.b)) {
                    z14 = true;
                    break;
                }
            }
        }
        if ((!z13 || !z14 || z4) && graphKey != EnumC28166h0.RECOVERY && duration != EnumC36106a.WEEKLY) {
            List<AbstractC21394b> listM60096f3 = graphState.m60096f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM60096f3) {
                if (!(((AbstractC21394b) obj) instanceof AbstractC21394b.k)) {
                    arrayList.add(obj);
                }
            }
            return C21395c.m60092b(graphState, m15205b(graphState.getPlane()), arrayList, null, null, 12, null);
        }
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC21394b abstractC21394b2 : graphState.m60096f()) {
            if (abstractC21394b2 instanceof AbstractC21394b.g) {
                AbstractC21394b.g gVar = (AbstractC21394b.g) abstractC21394b2;
                List<C34552a> listM60076g = gVar.m60076g();
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM60076g, 10));
                for (C34552a c34552a : listM60076g) {
                    List<C34556e> listM109234d = c34552a.m109234d();
                    C22228a fillState = c34552a.getFillState();
                    if (fillState != null) {
                        C22228a fillState2 = c34552a.getFillState();
                        if (fillState2 == null || (abstractC18247aM52577o2 = fillState2.getBackground()) == null) {
                            abstractC18247aM52577o2 = AbstractC18249c.m52577o(C17919x.f69629f);
                        }
                        c22228aM63727b2 = C22228a.m63727b(fillState, abstractC18247aM52577o2, null, 2, null);
                    } else {
                        c22228aM63727b2 = null;
                    }
                    C22230c strokeState = c34552a.getStrokeState();
                    if (strokeState != null) {
                        if (graphKey == EnumC28166h0.RECOVERY) {
                            width = i13;
                        } else {
                            C22230c strokeState2 = c34552a.getStrokeState();
                            width = strokeState2 != null ? strokeState2.getWidth() : 2;
                        }
                        float f13 = width;
                        C22230c strokeState3 = c34552a.getStrokeState();
                        c22230cM63731b2 = C22230c.m63731b(strokeState, f13, 0, 0, AbstractC18249c.m52577o(strokeState3 != null ? C17919x.m51541c(0.3f, strokeState3.getScrubbedBackground()) : C17919x.f69629f), 0L, false, 54, null);
                    } else {
                        c22230cM63731b2 = null;
                    }
                    arrayList3.add(new C34552a(listM109234d, c22228aM63727b2, c22230cM63731b2, null, 8, null));
                    i13 = 1;
                }
                arrayList2.add(new AbstractC21394b.g(arrayList3, gVar.getId(), gVar.getSkipScrubbing(), null, null, false, 56, null));
            } else if (abstractC21394b2 instanceof AbstractC21394b.a) {
                AbstractC21394b.a aVar = (AbstractC21394b.a) abstractC21394b2;
                List<C23379d> listM60060f = aVar.m60060f();
                ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(listM60060f, 10));
                for (C23379d c23379d : listM60060f) {
                    List<C23378c> listM67671b = c23379d.m67671b();
                    C22228a fillState3 = c23379d.getFillState();
                    if (fillState3 != null) {
                        C22228a fillState4 = c23379d.getFillState();
                        if (fillState4 == null || (abstractC18247aM52577o = fillState4.getBackground()) == null) {
                            abstractC18247aM52577o = AbstractC18249c.m52577o(C17919x.f69629f);
                        }
                        c22228aM63727b = C22228a.m63727b(fillState3, abstractC18247aM52577o, null, 2, null);
                    } else {
                        c22228aM63727b = null;
                    }
                    C22230c strokeState4 = c23379d.getStrokeState();
                    if (strokeState4 != null) {
                        C22230c strokeState5 = c23379d.getStrokeState();
                        c22230cM63731b = C22230c.m63731b(strokeState4, 0.0f, 0, 0, AbstractC18249c.m52577o(strokeState5 != null ? strokeState5.getScrubbedBackground() : C17919x.f69629f), 0L, false, 55, null);
                    } else {
                        c22230cM63731b = null;
                    }
                    arrayList4.add(new C23379d(listM67671b, c22228aM63727b, c22230cM63731b));
                }
                arrayList2.add(new AbstractC21394b.a(arrayList4, aVar.getScrubberShape(), aVar.getId(), aVar.getSkipScrubbing(), false, 16, null));
            } else {
                arrayList2.add(abstractC21394b2);
            }
            i13 = 1;
        }
        return C21395c.m60092b(graphState, m15205b(graphState.getPlane()), arrayList2, null, null, 12, null);
    }

    /* JADX INFO: renamed from: b */
    private static final C21374h m15205b(C21374h c21374h) {
        return c21374h.m59985a((8187 & 1) != 0 ? c21374h.startVerticalAxis : null, (8187 & 2) != 0 ? c21374h.endVerticalAxis : null, (8187 & 4) != 0 ? c21374h.bottomHorizontalAxis : null, (8187 & 8) != 0 ? c21374h.topHorizontalAxis : null, (8187 & 16) != 0 ? c21374h.insets : new C16618c(0.0f, 0.025f, 0.025f, 0.04f), (8187 & 32) != 0 ? c21374h.lines : null, (8187 & 64) != 0 ? c21374h.graphAnnotations : null, (8187 & 128) != 0 ? c21374h.accessibilityState : null, (8187 & 256) != 0 ? c21374h.scrubberEnabled : false, (8187 & 512) != 0 ? c21374h.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21374h.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21374h.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? c21374h.horizontalGridLinePadding : 0.0f);
    }
}
