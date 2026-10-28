package p704dk2;

import a61.C0468a;
import a81.C0555f;
import a81.C0563n;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2192m;
import b90.C2883e;
import bk2.AbstractC3354a;
import bk2.AbstractC3357d;
import bk2.AbstractC3360g;
import bk2.C3356c;
import bs1.C3590i;
import c93.InterfaceC4339a;
import com.whoop.design.models.calendar.CalendarDateModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.edit.avatar.C9768a;
import d30.C11558r;
import d61.InterfaceC11732a;
import df2.C12000a;
import dh0.C12040a;
import ek2.AbstractC13304a;
import ek2.AbstractC13306c;
import f61.AbstractC14150l;
import h71.C16995l;
import h91.C17027b;
import i11.C17863f;
import j71.AbstractC21394b;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Locale;
import kotlin.C2026r;
import l83.C23454a0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p181h2.C16618c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p700bd1.C3091i;
import p700bd1.C3092j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import t81.C33612r;
import t81.InterfaceC33600f;
import u81.C34638c;
import uj2.AbstractC35038a;
import uj2.EnumC35041d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: dk2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000e\u001a\u00020\u00032\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"!\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006%²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u001f8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010!8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lbk2/g$c;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "Lkotlin/Function1;", "Luj2/a;", "onAnalyticsEvent", "Lbk2/b;", "onViewEvent", "s", "(Lbk2/g$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/u;", "content", "p", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "a", "Lh91/b;", "getMockCalendarState", "()Lh91/b;", "mockCalendarState", "b", "Lbk2/g$c;", "getMockViewState", "()Lbk2/g$c;", "mockViewState", "", "showCalendar", "Lt81/r;", "tiltGraphViewState", "", "plotId", "Lh71/l;", "scrollableScrubberState", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12123j {

    /* JADX INFO: renamed from: a */
    private static final C17027b<CalendarDateModel> f40347a;

    /* JADX INFO: renamed from: b */
    private static final AbstractC3360g.c f40348b;

    static {
        C17027b.Companion companion = C17027b.INSTANCE;
        Locale US = Locale.US;
        AbstractC22676k.m65749i(US, "US");
        LocalDate localDateNow = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow, "now(...)");
        LocalDate localDateNow2 = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow2, "now(...)");
        LocalDate localDateNow3 = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow3, "now(...)");
        C17027b<CalendarDateModel> c17027bM48086b = C17027b.Companion.m48086b(companion, US, localDateNow, localDateNow2, localDateNow3, C25272z.f99163w, false, null, 0, 192, null);
        f40347a = c17027bM48086b;
        C3356c c3356c = new C3356c(c17027bM48086b, new C17863f(null, AbstractC8693b.m21278l("TODAY"), true, "2024-01-23", true, "2024-01-25", null, null, null, null, 961, null), C38072d.f163053a.m121951d().getAction().getUndo(), AbstractC8693b.m21278l("HEART RATE"), AbstractC8693b.m21278l("Data synced to 9:40pm"), false, 32, null);
        C33612r c33612rM40338b = AbstractC14150l.m40338b();
        f40348b = new AbstractC3360g.c(c3356c, c33612rM40338b.m106189a((8159 & 1) != 0 ? c33612rM40338b.planeState : null, (8159 & 2) != 0 ? c33612rM40338b.plotPadding : null, (8159 & 4) != 0 ? c33612rM40338b.plots : null, (8159 & 8) != 0 ? c33612rM40338b.initialGraphSize : (((long) Float.floatToRawIntBits(3000.0f)) << 32) | (((long) Float.floatToRawIntBits(880.0f)) & 4294967295L), (8159 & 16) != 0 ? c33612rM40338b.accessibilityLabel : null, (8159 & 32) != 0 ? c33612rM40338b.zoom : 0.0f, (8159 & 64) != 0 ? c33612rM40338b.zoomLevel : null, (8159 & 128) != 0 ? c33612rM40338b.zoomToggleState : null, (8159 & 256) != 0 ? c33612rM40338b.isAnimating : false, (8159 & 512) != 0 ? c33612rM40338b.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33612rM40338b.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33612rM40338b.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? c33612rM40338b.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null), new C16618c(0.0f, 0.2f, 0.0f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m33527A(AbstractC3360g.c cVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Function1 function1, InterfaceC28601c1 interfaceC28601c3, InterfaceC23001u TiltChartBox, Composer composer, int i13) {
        Object next;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC28601c1 interfaceC28601c5;
        AbstractC22676k.m65750j(TiltChartBox, "$this$TiltChartBox");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC12125l.m33576c(null, cVar.getPlotPadding(), c28655q, 0, 1);
            C33612r c33612rM33538L = m33538L(interfaceC28601c1);
            if (c33612rM33538L == null) {
                c28655q.m87150e0(-541636325);
                c28655q.m87173q(false);
                interfaceC28601c4 = interfaceC28601c2;
                interfaceC28601c5 = interfaceC28601c3;
            } else {
                c28655q.m87150e0(-541636324);
                Iterator<T> it = c33612rM33538L.m106196j().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((AbstractC21394b) next) instanceof AbstractC21394b.g));
                AbstractC21394b abstractC21394b = (AbstractC21394b) next;
                interfaceC28601c4 = interfaceC28601c2;
                m33562v(interfaceC28601c4, abstractC21394b != null ? abstractC21394b.getId() : null);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(0.85f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                boolean zM87153g = c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    interfaceC28601c5 = interfaceC28601c3;
                    objM87133R = new C2883e(1, function1, interfaceC28601c5, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC28601c5 = interfaceC28601c3;
                }
                int i14 = C33612r.f140283n;
                AbstractC25303l.m74291r(c33612rM33538L, null, null, (Function1) objM87133R, c28655q, i14, 6);
                c28655q.m87173q(true);
                boolean zM87157i = c28655q.m87157i(c33612rM33538L) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C11558r(c33612rM33538L, function1, interfaceC28601c1, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC12124k.m33570d(c33612rM33538L, (InterfaceC4339a) objM87133R2, c28655q, i14, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            if (m33540N(interfaceC28601c4) == null || m33563w(interfaceC28601c5) == null) {
                c28655q.m87150e0(-538209119);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-538446486);
                C16995l c16995lM33563w = m33563w(interfaceC28601c5);
                AbstractC22676k.m65747g(c16995lM33563w);
                String strM33540N = m33540N(interfaceC28601c4);
                AbstractC22676k.m65747g(strM33540N);
                AbstractC12127n.m33584f(c16995lM33563w, strM33540N, c28655q, C16995l.f65298f);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m33528B(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C16995l) {
            C16995l c16995l = (C16995l) event;
            InterfaceC11732a interfaceC11732aM47866a = c16995l.getDataScrubEvent();
            if (interfaceC11732aM47866a instanceof InterfaceC11732a.b) {
                m33564x(interfaceC28601c1, null);
            } else if (interfaceC11732aM47866a instanceof InterfaceC11732a.c) {
                function1.invoke(AbstractC35038a.b.f148478a);
                m33564x(interfaceC28601c1, c16995l);
            } else {
                m33564x(interfaceC28601c1, c16995l);
            }
        } else if (event instanceof InterfaceC33600f.a) {
            InterfaceC33600f.a aVar = (InterfaceC33600f.a) event;
            if (aVar.getIsDoubleTap()) {
                function1.invoke(new AbstractC35038a.h(aVar.getZoomingIn(), EnumC35041d.DOUBLE_TAP));
            }
            C33612r c33612rM33538L = m33538L(interfaceC28601c2);
            m33539M(interfaceC28601c2, c33612rM33538L != null ? c33612rM33538L.m106189a((8159 & 1) != 0 ? c33612rM33538L.planeState : null, (8159 & 2) != 0 ? c33612rM33538L.plotPadding : null, (8159 & 4) != 0 ? c33612rM33538L.plots : null, (8159 & 8) != 0 ? c33612rM33538L.initialGraphSize : 0L, (8159 & 16) != 0 ? c33612rM33538L.accessibilityLabel : null, (8159 & 32) != 0 ? c33612rM33538L.zoom : aVar.getZoomValue(), (8159 & 64) != 0 ? c33612rM33538L.zoomLevel : null, (8159 & 128) != 0 ? c33612rM33538L.zoomToggleState : null, (8159 & 256) != 0 ? c33612rM33538L.isAnimating : false, (8159 & 512) != 0 ? c33612rM33538L.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33612rM33538L.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33612rM33538L.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? c33612rM33538L.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null) : null);
        } else if (event instanceof InterfaceC33600f.b) {
            InterfaceC33600f.b bVar = (InterfaceC33600f.b) event;
            if (bVar.getStart()) {
                function1.invoke(new AbstractC35038a.h(bVar.getZoomingIn(), EnumC35041d.PINCH));
            }
            C33612r c33612rM33538L2 = m33538L(interfaceC28601c2);
            m33539M(interfaceC28601c2, c33612rM33538L2 != null ? c33612rM33538L2.m106189a((8159 & 1) != 0 ? c33612rM33538L2.planeState : null, (8159 & 2) != 0 ? c33612rM33538L2.plotPadding : null, (8159 & 4) != 0 ? c33612rM33538L2.plots : null, (8159 & 8) != 0 ? c33612rM33538L2.initialGraphSize : 0L, (8159 & 16) != 0 ? c33612rM33538L2.accessibilityLabel : null, (8159 & 32) != 0 ? c33612rM33538L2.zoom : bVar.getZoomValue(), (8159 & 64) != 0 ? c33612rM33538L2.zoomLevel : null, (8159 & 128) != 0 ? c33612rM33538L2.zoomToggleState : null, (8159 & 256) != 0 ? c33612rM33538L2.isAnimating : false, (8159 & 512) != 0 ? c33612rM33538L2.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33612rM33538L2.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33612rM33538L2.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? c33612rM33538L2.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null) : null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m33529C(C33612r c33612r, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        float fM109474a = C34638c.f145937a.m109474a(c33612r.getZoom(), c33612r.getZoomToggleState());
        function1.invoke(new AbstractC35038a.h(fM109474a > c33612r.getZoom(), EnumC35041d.BUTTON));
        C33612r c33612rM33538L = m33538L(interfaceC28601c1);
        m33539M(interfaceC28601c1, c33612rM33538L != null ? c33612rM33538L.m106189a((8159 & 1) != 0 ? c33612rM33538L.planeState : null, (8159 & 2) != 0 ? c33612rM33538L.plotPadding : null, (8159 & 4) != 0 ? c33612rM33538L.plots : null, (8159 & 8) != 0 ? c33612rM33538L.initialGraphSize : 0L, (8159 & 16) != 0 ? c33612rM33538L.accessibilityLabel : null, (8159 & 32) != 0 ? c33612rM33538L.zoom : fM109474a, (8159 & 64) != 0 ? c33612rM33538L.zoomLevel : null, (8159 & 128) != 0 ? c33612rM33538L.zoomToggleState : null, (8159 & 256) != 0 ? c33612rM33538L.isAnimating : true, (8159 & 512) != 0 ? c33612rM33538L.initialDataScrubState : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33612rM33538L.initialPlotId : null, (8159 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33612rM33538L.initialScrollableScrubberState : null, (8159 & 4096) != 0 ? c33612rM33538L.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null) : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final int m33530D(int i13) {
        return -i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m33531E(C17027b c17027b, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C0468a(function1, 29);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function3 = (Function1) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(function2);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C9768a(function1, function2, interfaceC28601c1, 1);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function4 = (Function1) objM87133R2;
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = new C2192m(23, interfaceC28601c1);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC13304a.m37369h(c17027b, function3, function4, (InterfaceC4339a) objM87133R3, c28655q, C17027b.f65485k | 3072, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m33532F(Function1 function1, int i13) {
        function1.invoke(new AbstractC3354a.a(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m33533G(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, LocalDate it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC3357d.a(it, null, false, 6, null));
        LocalDate localDateNow = LocalDate.now();
        AbstractC22676k.m65749i(localDateNow, "now(...)");
        function2.invoke(new AbstractC35038a.c(it, localDateNow));
        m33537K(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m33534H(InterfaceC28601c1 interfaceC28601c1) {
        m33537K(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m33535I(AbstractC3360g.c cVar, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m33559s(cVar, interfaceC4339a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final boolean m33536J(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: K */
    private static final void m33537K(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: L */
    private static final C33612r m33538L(InterfaceC28601c1 interfaceC28601c1) {
        return (C33612r) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: M */
    private static final void m33539M(InterfaceC28601c1 interfaceC28601c1, C33612r c33612r) {
        interfaceC28601c1.setValue(c33612r);
    }

    /* JADX INFO: renamed from: N */
    private static final String m33540N(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m33556p(Function3 function3, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2069865185);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function3) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(EnumC39181m.f168423w), AbstractC37817c.m121344e(1706600353, c28655q, new C3091i(2, function3)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3092j(function3, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m33557q(Function3 function3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            function3.invoke(C1100b.f4583a, c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m33558r(Function3 function3, int i13, Composer composer, int i14) {
        m33556p(function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x025b  */
    /* JADX WARN: Code duplicated, block: B:124:0x026b  */
    /* JADX WARN: Code duplicated, block: B:127:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0113  */
    /* JADX WARN: Code duplicated, block: B:80:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c2  */
    /* JADX INFO: renamed from: s */
    public static final void m33559s(AbstractC3360g.c viewState, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        Object objM87133R4;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        int i18;
        boolean z13;
        Object objM87133R5;
        Function1 function6;
        boolean z14;
        Object objM87133R6;
        C17027b<CalendarDateModel> c17027bM9688b;
        Object objM87133R7;
        C33612r c33612rM33538L;
        C16995l initialScrollableScrubberState;
        C33612r c33612rM33538L2;
        String initialPlotId;
        InterfaceC25312u interfaceC25312uM9708b;
        C33612r c33612r;
        Object objM87133R8;
        Object objM87133R9;
        int i19;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(331523319);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(onViewEvent)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C12000a(14);
                            c28655q.m87172p0(objM87133R9);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C12040a(19);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function4 = (Function1) objM87133R8;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getToolbarState().getCalendarInitialState()));
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        interfaceC25312uM9708b = viewState.getTiltGraph();
                        if (interfaceC25312uM9708b instanceof C33612r) {
                            c33612r = (C33612r) interfaceC25312uM9708b;
                        } else {
                            c33612r = null;
                        }
                        objM87133R2 = AbstractC28683x.m87272z(c33612r);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        c33612rM33538L2 = m33538L(interfaceC28601c2);
                        if (c33612rM33538L2 != null) {
                            initialPlotId = c33612rM33538L2.getInitialPlotId();
                        } else {
                            initialPlotId = null;
                        }
                        objM87133R3 = AbstractC28683x.m87272z(initialPlotId);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        c33612rM33538L = m33538L(interfaceC28601c2);
                        if (c33612rM33538L != null) {
                            initialScrollableScrubberState = c33612rM33538L.getInitialScrollableScrubberState();
                        } else {
                            initialScrollableScrubberState = null;
                        }
                        objM87133R4 = AbstractC28683x.m87272z(initialScrollableScrubberState);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM33588a = AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, c2314t));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    function5 = function4;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM33588a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66723l);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    C3356c c3356cM9709c = viewState.getToolbarState();
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (!z13 || objM87133R5 == c28676v0) {
                        function6 = function5;
                        objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function6 = function5;
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R5;
                    if (i18 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z14 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C12122i(function6, 0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    int i25 = C17027b.f65485k | C17863f.f69516k;
                    int i26 = TextResource.$stable;
                    AbstractC13306c.m37399g(c3356cM9709c, interfaceC4339a4, interfaceC4339a5, (Function1) objM87133R6, onViewEvent, c28655q, i25 | i26 | i26 | (i15 & 112) | ((i15 << 3) & 57344), 0);
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
                    m33556p(AbstractC37817c.m121344e(1878804737, c28655q, new C0563n(viewState, interfaceC28601c2, interfaceC28601c3, function6, interfaceC28601c4, 3)), c28655q, 6);
                    c28655q.m87173q(true);
                    c17027bM9688b = viewState.getToolbarState().m9688b();
                    if (c17027bM9688b == null) {
                        c28655q.m87150e0(-1854971518);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1854971517);
                        boolean zM33536J = m33536J(interfaceC28601c1);
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C12040a(20);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC1090b.m3351f(zM33536J, null, AbstractC3788w0.m11588p(null, (Function1) objM87133R7, 1), AbstractC3788w0.m11592t(3, null).m11563a(AbstractC3788w0.m11584l(null, null, null, 15)).m11563a(AbstractC3788w0.m11578f(null, 3)), null, AbstractC37817c.m121344e(1142704654, c28655q, new C2026r((Object) c17027bM9688b, onViewEvent, (Object) function6, (Object) interfaceC28601c1, 5)), c28655q, 200064, 18);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function6;
                    interfaceC4339a3 = interfaceC4339a6;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a3 = interfaceC4339a2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) interfaceC4339a3, function3, (Object) onViewEvent, i13, i14, 16);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C12000a(14);
                        c28655q.m87172p0(objM87133R9);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12040a(19);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getToolbarState().getCalendarInitialState()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    interfaceC25312uM9708b = viewState.getTiltGraph();
                    if (interfaceC25312uM9708b instanceof C33612r) {
                        c33612r = (C33612r) interfaceC25312uM9708b;
                    } else {
                        c33612r = null;
                    }
                    objM87133R2 = AbstractC28683x.m87272z(c33612r);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    c33612rM33538L2 = m33538L(interfaceC28601c2);
                    if (c33612rM33538L2 != null) {
                        initialPlotId = c33612rM33538L2.getInitialPlotId();
                    } else {
                        initialPlotId = null;
                    }
                    objM87133R3 = AbstractC28683x.m87272z(initialPlotId);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    c33612rM33538L = m33538L(interfaceC28601c2);
                    if (c33612rM33538L != null) {
                        initialScrollableScrubberState = c33612rM33538L.getInitialScrollableScrubberState();
                    } else {
                        initialScrollableScrubberState = null;
                    }
                    objM87133R4 = AbstractC28683x.m87272z(initialScrollableScrubberState);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R4;
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM33588a2 = AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, c2314t2));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM33588a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                Modifier modifierM66723l2 = AbstractC22953f.m66723l(c2314t2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66723l2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                C3356c c3356cM9709c2 = viewState.getToolbarState();
                i18 = i15 & 896;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z13) {
                    function6 = function5;
                    objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R5;
                if (i18 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z14) {
                    objM87133R6 = new C12122i(function6, 0);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C12122i(function6, 0);
                    c28655q.m87172p0(objM87133R6);
                }
                int i27 = C17027b.f65485k | C17863f.f69516k;
                int i28 = TextResource.$stable;
                AbstractC13306c.m37399g(c3356cM9709c2, interfaceC4339a4, interfaceC4339a7, (Function1) objM87133R6, onViewEvent, c28655q, i27 | i28 | i28 | (i15 & 112) | ((i15 << 3) & 57344), 0);
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                m33556p(AbstractC37817c.m121344e(1878804737, c28655q, new C0563n(viewState, interfaceC28601c2, interfaceC28601c5, function6, interfaceC28601c6, 3)), c28655q, 6);
                c28655q.m87173q(true);
                c17027bM9688b = viewState.getToolbarState().m9688b();
                if (c17027bM9688b == null) {
                    c28655q.m87150e0(-1854971518);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1854971517);
                    boolean zM33536J2 = m33536J(interfaceC28601c1);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12040a(20);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC1090b.m3351f(zM33536J2, null, AbstractC3788w0.m11588p(null, (Function1) objM87133R7, 1), AbstractC3788w0.m11592t(3, null).m11563a(AbstractC3788w0.m11584l(null, null, null, 15)).m11563a(AbstractC3788w0.m11578f(null, 3)), null, AbstractC37817c.m121344e(1142704654, c28655q, new C2026r((Object) c17027bM9688b, onViewEvent, (Object) function6, (Object) interfaceC28601c1, 5)), c28655q, 200064, 18);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function6;
                interfaceC4339a3 = interfaceC4339a8;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) interfaceC4339a3, function3, (Object) onViewEvent, i13, i14, 16);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(onViewEvent)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C12000a(14);
                        c28655q.m87172p0(objM87133R9);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C12040a(19);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function4 = (Function1) objM87133R8;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getToolbarState().getCalendarInitialState()));
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    interfaceC25312uM9708b = viewState.getTiltGraph();
                    if (interfaceC25312uM9708b instanceof C33612r) {
                        c33612r = (C33612r) interfaceC25312uM9708b;
                    } else {
                        c33612r = null;
                    }
                    objM87133R2 = AbstractC28683x.m87272z(c33612r);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    c33612rM33538L2 = m33538L(interfaceC28601c2);
                    if (c33612rM33538L2 != null) {
                        initialPlotId = c33612rM33538L2.getInitialPlotId();
                    } else {
                        initialPlotId = null;
                    }
                    objM87133R3 = AbstractC28683x.m87272z(initialPlotId);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    c33612rM33538L = m33538L(interfaceC28601c2);
                    if (c33612rM33538L != null) {
                        initialScrollableScrubberState = c33612rM33538L.getInitialScrollableScrubberState();
                    } else {
                        initialScrollableScrubberState = null;
                    }
                    objM87133R4 = AbstractC28683x.m87272z(initialScrollableScrubberState);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R4;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM33588a3 = AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, c2314t3));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM33588a3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                Modifier modifierM66723l3 = AbstractC22953f.m66723l(c2314t3);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM66723l3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                C3356c c3356cM9709c3 = viewState.getToolbarState();
                i18 = i15 & 896;
                if (i18 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z13) {
                    function6 = function5;
                    objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function6 = function5;
                    objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                    c28655q.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R5;
                if (i18 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z14) {
                    objM87133R6 = new C12122i(function6, 0);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C12122i(function6, 0);
                    c28655q.m87172p0(objM87133R6);
                }
                int i29 = C17027b.f65485k | C17863f.f69516k;
                int i210 = TextResource.$stable;
                AbstractC13306c.m37399g(c3356cM9709c3, interfaceC4339a4, interfaceC4339a9, (Function1) objM87133R6, onViewEvent, c28655q, i29 | i210 | i210 | (i15 & 112) | ((i15 << 3) & 57344), 0);
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                m33556p(AbstractC37817c.m121344e(1878804737, c28655q, new C0563n(viewState, interfaceC28601c2, interfaceC28601c7, function6, interfaceC28601c8, 3)), c28655q, 6);
                c28655q.m87173q(true);
                c17027bM9688b = viewState.getToolbarState().m9688b();
                if (c17027bM9688b == null) {
                    c28655q.m87150e0(-1854971518);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1854971517);
                    boolean zM33536J3 = m33536J(interfaceC28601c1);
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C12040a(20);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC1090b.m3351f(zM33536J3, null, AbstractC3788w0.m11588p(null, (Function1) objM87133R7, 1), AbstractC3788w0.m11592t(3, null).m11563a(AbstractC3788w0.m11584l(null, null, null, 15)).m11563a(AbstractC3788w0.m11578f(null, 3)), null, AbstractC37817c.m121344e(1142704654, c28655q, new C2026r((Object) c17027bM9688b, onViewEvent, (Object) function6, (Object) interfaceC28601c1, 5)), c28655q, 200064, 18);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function6;
                interfaceC4339a3 = interfaceC4339a10;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) interfaceC4339a3, function3, (Object) onViewEvent, i13, i14, 16);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87157i(onViewEvent)) {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i19;
        }
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C12000a(14);
                    c28655q.m87172p0(objM87133R9);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R9;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (i16 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C12040a(19);
                    c28655q.m87172p0(objM87133R8);
                }
                function4 = (Function1) objM87133R8;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getToolbarState().getCalendarInitialState()));
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                interfaceC25312uM9708b = viewState.getTiltGraph();
                if (interfaceC25312uM9708b instanceof C33612r) {
                    c33612r = (C33612r) interfaceC25312uM9708b;
                } else {
                    c33612r = null;
                }
                objM87133R2 = AbstractC28683x.m87272z(c33612r);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                c33612rM33538L2 = m33538L(interfaceC28601c2);
                if (c33612rM33538L2 != null) {
                    initialPlotId = c33612rM33538L2.getInitialPlotId();
                } else {
                    initialPlotId = null;
                }
                objM87133R3 = AbstractC28683x.m87272z(initialPlotId);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                c33612rM33538L = m33538L(interfaceC28601c2);
                if (c33612rM33538L != null) {
                    initialScrollableScrubberState = c33612rM33538L.getInitialScrollableScrubberState();
                } else {
                    initialScrollableScrubberState = null;
                }
                objM87133R4 = AbstractC28683x.m87272z(initialScrollableScrubberState);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) objM87133R4;
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM33588a4 = AbstractC12128o.m33588a(AbstractC1102d.m3407d(1.0f, c2314t4));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM33588a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            Modifier modifierM66723l4 = AbstractC22953f.m66723l(c2314t4);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM66723l4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            C3356c c3356cM9709c4 = viewState.getToolbarState();
            i18 = i15 & 896;
            if (i18 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R5 = c28655q.m87133R();
            if (z13) {
                function6 = function5;
                objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                c28655q.m87172p0(objM87133R5);
            } else {
                function6 = function5;
                objM87133R5 = new C3590i(function6, interfaceC28601c1, 8);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R5;
            if (i18 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z14) {
                objM87133R6 = new C12122i(function6, 0);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C12122i(function6, 0);
                c28655q.m87172p0(objM87133R6);
            }
            int i211 = C17027b.f65485k | C17863f.f69516k;
            int i212 = TextResource.$stable;
            AbstractC13306c.m37399g(c3356cM9709c4, interfaceC4339a4, interfaceC4339a11, (Function1) objM87133R6, onViewEvent, c28655q, i211 | i212 | i212 | (i15 & 112) | ((i15 << 3) & 57344), 0);
            InterfaceC4339a interfaceC4339a12 = interfaceC4339a4;
            m33556p(AbstractC37817c.m121344e(1878804737, c28655q, new C0563n(viewState, interfaceC28601c2, interfaceC28601c9, function6, interfaceC28601c10, 3)), c28655q, 6);
            c28655q.m87173q(true);
            c17027bM9688b = viewState.getToolbarState().m9688b();
            if (c17027bM9688b == null) {
                c28655q.m87150e0(-1854971518);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1854971517);
                boolean zM33536J4 = m33536J(interfaceC28601c1);
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C12040a(20);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC1090b.m3351f(zM33536J4, null, AbstractC3788w0.m11588p(null, (Function1) objM87133R7, 1), AbstractC3788w0.m11592t(3, null).m11563a(AbstractC3788w0.m11584l(null, null, null, 15)).m11563a(AbstractC3788w0.m11578f(null, 3)), null, AbstractC37817c.m121344e(1142704654, c28655q, new C2026r((Object) c17027bM9688b, onViewEvent, (Object) function6, (Object) interfaceC28601c1, 5)), c28655q, 200064, 18);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function6;
            interfaceC4339a3 = interfaceC4339a12;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) viewState, (Object) interfaceC4339a3, function3, (Object) onViewEvent, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m33560t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m33561u(AbstractC35038a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m33562v(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: w */
    private static final C16995l m33563w(InterfaceC28601c1 interfaceC28601c1) {
        return (C16995l) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m33564x(InterfaceC28601c1 interfaceC28601c1, C16995l c16995l) {
        interfaceC28601c1.setValue(c16995l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m33565y(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(AbstractC35038a.a.f148477a);
        m33537K(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m33566z(Function1 function1, boolean z4) {
        function1.invoke(new AbstractC35038a.d(z4));
        return C23454a0.f92919a;
    }
}
