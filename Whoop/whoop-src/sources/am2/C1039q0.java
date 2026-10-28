package am2;

import a71.C0520a;
import cm2.AbstractC4837y;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import e93.AbstractC12889b;
import gy0.AbstractC16277f;
import hy0.C17750h1;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25249h0;
import m83.C25253j0;
import m83.C25271y;
import or2.EnumC28166h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import sl2.AbstractC32706a;
import vl2.C36133z;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: am2.q0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lam2/q0;", "", "<init>", "()V", "", "", "listOfId", "Ld61/a;", "scrubEvent", "Lvl2/z;", "g", "(Ljava/util/List;Ld61/a;)Ljava/util/List;", "", "isHoursVsNeededTrendEnabled", "f", "(Ljava/util/List;Ld61/a;Z)Ljava/util/List;", "e", "", "a", "(Ld61/a;)I", "La71/a;", "dataScrubberDetailsState", "Lcom/whoop/design/util/TextResource;", "valueDisplay", "Ly81/e;", "zoneScrubberColorDisplay", "b", "(La71/a;Lcom/whoop/design/util/TextResource;Ly81/e;)Lvl2/z;", "Lam2/p0;", "state", "sendAnalytics", "Lcm2/y;", "d", "(Lam2/p0;Ld61/a;ZZ)Lcm2/y;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1039q0 {

    /* JADX INFO: renamed from: a */
    public static final C1039q0 f4005a = new C1039q0();

    /* JADX INFO: renamed from: am2.q0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4006a;

        static {
            int[] iArr = new int[EnumC28166h0.values().length];
            try {
                iArr[EnumC28166h0.HR_ZONES_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28166h0.HOURS_V_NEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4006a = iArr;
        }
    }

    private C1039q0() {
    }

    /* JADX INFO: renamed from: a */
    private final int m2980a(InterfaceC11732a scrubEvent) {
        List<C0520a> listMo30408a;
        C0520a c0520a;
        List<C0520a> listMo30408a2;
        C0520a c0520a2;
        AbstractC11258s abstractC11258s = scrubEvent.mo31360b().get("HOURS_OF_SLEEP");
        Float value = null;
        Float value2 = (abstractC11258s == null || (listMo30408a2 = abstractC11258s.mo30408a()) == null || (c0520a2 = (C0520a) AbstractC25265s.m74100H0(listMo30408a2)) == null) ? null : c0520a2.getValue();
        AbstractC11258s abstractC11258s2 = scrubEvent.mo31360b().get("SLEEP_NEED");
        if (abstractC11258s2 != null && (listMo30408a = abstractC11258s2.mo30408a()) != null && (c0520a = (C0520a) AbstractC25265s.m74100H0(listMo30408a)) != null) {
            value = c0520a.getValue();
        }
        if (value2 == null || value == null || AbstractC22676k.m65743c(value, 0.0f)) {
            return 0;
        }
        int iM36258X = AbstractC12889b.m36258X((value2.floatValue() / value.floatValue()) * 100);
        if (100 > iM36258X) {
            return iM36258X;
        }
        return 100;
    }

    /* JADX INFO: renamed from: b */
    private final C36133z m2981b(C0520a dataScrubberDetailsState, TextResource valueDisplay, InterfaceC39332e zoneScrubberColorDisplay) {
        InterfaceC39332e tagTextColor;
        if (zoneScrubberColorDisplay == null) {
            zoneScrubberColorDisplay = dataScrubberDetailsState.getScrubberColor();
        }
        InterfaceC39332e interfaceC39332e = zoneScrubberColorDisplay;
        C17750h1 phaseTag = dataScrubberDetailsState.getPhaseTag();
        TextResource tagText = phaseTag != null ? phaseTag.getTagText() : null;
        C17750h1 phaseTag2 = dataScrubberDetailsState.getPhaseTag();
        if (phaseTag2 == null || (tagTextColor = phaseTag2.getTagTextColor()) == null) {
            tagTextColor = EnumC39333f.BRAND_WHITE;
        }
        return new C36133z(valueDisplay, interfaceC39332e, tagText, tagTextColor, dataScrubberDetailsState.getPrimaryContextualDisplay(), dataScrubberDetailsState.getSecondaryContextualDisplay(), dataScrubberDetailsState.getUnitDisplay());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C36133z m2982c(C1039q0 c1039q0, C0520a c0520a, TextResource textResource, InterfaceC39332e interfaceC39332e, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            textResource = c0520a.getValueDisplay();
        }
        if ((i13 & 4) != 0) {
            interfaceC39332e = c0520a.getScrubberColor();
        }
        return c1039q0.m2981b(c0520a, textResource, interfaceC39332e);
    }

    /* JADX INFO: renamed from: e */
    private final List<C36133z> m2983e(List<String> listOfId, InterfaceC11732a scrubEvent) {
        List<C0520a> listMo30408a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOfId.iterator();
        while (it.hasNext()) {
            AbstractC11258s abstractC11258s = scrubEvent.mo31360b().get((String) it.next());
            if (abstractC11258s != null && (listMo30408a = abstractC11258s.mo30408a()) != null) {
                Iterator<T> it3 = listMo30408a.iterator();
                while (it3.hasNext()) {
                    arrayList.add(m2982c(f4005a, (C0520a) it3.next(), null, null, 6, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private final List<C36133z> m2984f(List<String> listOfId, InterfaceC11732a scrubEvent, boolean isHoursVsNeededTrendEnabled) {
        List<C0520a> listMo30408a;
        List<C0520a> listMo30408a2;
        C0520a c0520a;
        ArrayList arrayList = new ArrayList();
        if (!isHoursVsNeededTrendEnabled) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(String.valueOf(m2980a(scrubEvent)));
            EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
            AbstractC11258s abstractC11258s = scrubEvent.mo31360b().get("SLEEP_NEED");
            arrayList.add(new C36133z(textResourceM21278l, enumC39333f, null, enumC39333f, (abstractC11258s == null || (listMo30408a2 = abstractC11258s.mo30408a()) == null || (c0520a = (C0520a) AbstractC25265s.m74100H0(listMo30408a2)) == null) ? null : c0520a.getPrimaryContextualDisplay(), AbstractC8693b.m21277k(AbstractC32706a.f135965s), AbstractC8693b.m21277k(AbstractC16277f.f62235F1)));
        }
        Iterator<T> it = listOfId.iterator();
        while (it.hasNext()) {
            AbstractC11258s abstractC11258s2 = scrubEvent.mo31360b().get((String) it.next());
            if (abstractC11258s2 != null && (listMo30408a = abstractC11258s2.mo30408a()) != null) {
                Iterator<T> it3 = listMo30408a.iterator();
                while (it3.hasNext()) {
                    arrayList.add(m2982c(f4005a, (C0520a) it3.next(), null, null, 6, null));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private final List<C36133z> m2985g(List<String> listOfId, InterfaceC11732a scrubEvent) {
        List<C0520a> listMo30408a;
        InterfaceC39332e scrubberColor;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listOfId.iterator();
        while (it.hasNext()) {
            AbstractC11258s abstractC11258s = scrubEvent.mo31360b().get((String) it.next());
            if (abstractC11258s != null && (listMo30408a = abstractC11258s.mo30408a()) != null) {
                C25253j0 c25253j0M74143q0 = AbstractC25265s.m74143q0(listMo30408a);
                Iterator it3 = c25253j0M74143q0.iterator();
                int i13 = 0;
                float fFloatValue = 0.0f;
                float fFloatValue2 = 0.0f;
                float fFloatValue3 = 0.0f;
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C25249h0) it3).f99126x;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object objPrevious = listIterator.previous();
                    int i14 = i13 + 1;
                    String strM2988b = null;
                    if (i13 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C0520a c0520a = (C0520a) objPrevious;
                    if (i13 == 0) {
                        Float value = c0520a.getValue();
                        fFloatValue3 = value != null ? value.floatValue() : 0.0f;
                    } else if (1 <= i13 && i13 < 4) {
                        Float value2 = c0520a.getValue();
                        fFloatValue += value2 != null ? value2.floatValue() : 0.0f;
                    } else if (4 <= i13 && i13 < 6) {
                        Float value3 = c0520a.getValue();
                        fFloatValue2 += value3 != null ? value3.floatValue() : 0.0f;
                    }
                    if (i13 == 0) {
                        strM2988b = AbstractC1041r0.m2988b(fFloatValue3);
                    } else if (i13 == 3) {
                        strM2988b = AbstractC1041r0.m2988b(fFloatValue);
                    } else if (i13 == 5) {
                        strM2988b = AbstractC1041r0.m2988b(fFloatValue2);
                    }
                    if (1 > i13 || i13 >= 4) {
                        scrubberColor = i13 == 5 ? ((C0520a) c25253j0M74143q0.get(4)).getScrubberColor() : ((C0520a) c25253j0M74143q0.get(0)).getScrubberColor();
                    } else {
                        scrubberColor = ((C0520a) c25253j0M74143q0.get(2)).getScrubberColor();
                    }
                    if (strM2988b != null) {
                        arrayList.add(f4005a.m2981b(c0520a, AbstractC8693b.m21278l(strM2988b), scrubberColor));
                    }
                    i13 = i14;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [am2.q0] */
    /* JADX INFO: renamed from: d */
    public final AbstractC4837y m2986d(C1037p0 state, InterfaceC11732a scrubEvent, boolean sendAnalytics, boolean isHoursVsNeededTrendEnabled) {
        ?? arrayList;
        List<AbstractC21394b> listM60096f;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(scrubEvent, "scrubEvent");
        C21395c graphState = state.getGraphState();
        if (graphState == null || (listM60096f = graphState.m60096f()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listM60096f) {
                if (!(((AbstractC21394b) obj) instanceof AbstractC21394b.k)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC21394b) it.next()).getId());
            }
        }
        int i13 = a.f4006a[state.getMetaData().getGraphKey().ordinal()];
        List<C36133z> listM2983e = i13 != 1 ? i13 != 2 ? m2983e(arrayList, scrubEvent) : m2984f(arrayList, scrubEvent, isHoursVsNeededTrendEnabled) : m2985g(arrayList, scrubEvent);
        if (state.getMetaData().getGraphKey() == EnumC28166h0.HR_ZONES_ALL) {
            listM2983e = AbstractC25265s.m74143q0(listM2983e);
        }
        return new AbstractC4837y.l(listM2983e, state.getMetaData().getGraphKey(), state.getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), state.getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), sendAnalytics);
    }
}
