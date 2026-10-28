package i81;

import androidx.compose.foundation.layout.AbstractC1099a;
import b91.EnumC2888c;
import com.mapbox.common.HttpHeaders;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import gy0.AbstractC16272a;
import hy0.C17736e;
import hy0.C17749h0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n51.C26301h;
import p000.AbstractC11266d;
import p01.C28582b;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.InterfaceC2300f;
import p088dc.AbstractC11895b;
import p291l0.C22976l1;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import p736sz0.C33169c0;
import p736sz0.C33194k1;
import p745y81.EnumC39333f;
import s81.C32261d;
import s81.C32265h;
import s81.EnumC32258a;
import s81.EnumC32259b;
import s81.InterfaceC32262e;
import uy0.C35375b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJO\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010 \u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010(\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010+\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u0017\u0010,\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b)\u0010\u001f¨\u0006-"}, m65681d2 = {"Li81/b;", "", "<init>", "()V", "", "id", "glyph", "Luy0/b;", "c", "(Ljava/lang/String;Ljava/lang/String;)Luy0/b;", "", "Ls81/d;", "k", "(Ljava/lang/String;)Ljava/util/List;", "day", HttpHeaders.DATE, "", "isToday", "isPast", "lines", "Lm91/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)Ljava/util/List;", "Lb2/f;", "alignment", "Ls81/h;", "j", "(Lb2/f;Ljava/lang/String;)Ls81/h;", "b", "Ls81/h;", "g", "()Ls81/h;", "header", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "sleepGoal", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "dayRows", "crossAxisFill", "f", "i", "spacerDistribution", "equalFill", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18216b {

    /* JADX INFO: renamed from: a */
    public static final C18216b f70794a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C32265h header;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C32265h sleepGoal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final List<InterfaceC25312u> dayRows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C32265h crossAxisFill;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C32265h spacerDistribution;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C32265h equalFill;

    /* JADX INFO: renamed from: h */
    public static final int f70801h;

    static {
        C18216b c18216b = new C18216b();
        f70794a = c18216b;
        float f13 = 8;
        float f14 = 2 * f13;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Steady Sleep Rhythm");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Week 8/16 · Phase 2: build");
        EnumC2888c enumC2888c = EnumC2888c.H2;
        EnumC2888c enumC2888c2 = EnumC2888c.B1;
        C32261d c32261d = new C32261d(new C33194k1("row_header_title_subtitle", textResourceM21278l, textResourceM21278l2, null, null, enumC2888c, enumC2888c2, 0, 0, 0, null, 1944, null), null, 2, null);
        C17749h0 c17749h0 = new C17749h0(new AbstractC22403o.a(AbstractC16272a.f61976O4), null, null, 80, 80, null, true, 38, null);
        InterfaceC32262e.b bVar = InterfaceC32262e.b.f133522a;
        header = new C32265h("row_header", AbstractC37056f.m118959K(c32261d, new C32261d(c17749h0, bVar)), f14, null, null, null, null, null, 248, null);
        sleepGoal = new C32265h("row_sleep_goal", AbstractC37056f.m118959K(new C32261d(c18216b.m52403c("row_sleep_goal_emoji", "🛏️"), bVar), new C32261d(new C33194k1("row_sleep_goal_title_subtitle", AbstractC8693b.m21278l("Sleep by 10:45 pm"), AbstractC8693b.m21278l("For at least 6 of 7 days"), null, null, EnumC2888c.T2, enumC2888c2, 0, 0, 0, null, 1944, null), null, 2, null), new C32261d(new C28582b(6, 1, 0.0f, "1/6", null, null, Boolean.FALSE, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, "row_sleep_goal_progress", 425908, null), bVar)), f14, null, null, null, null, null, 248, null);
        int i13 = 0;
        dayRows = AbstractC25265s.m74128f1(new C17736e(null, null, null, 7, null), AbstractC25267u.m74164j0(AbstractC37056f.m118959K(m52402b(c18216b, "2026-09-27", "Su", "27", false, true, AbstractC37056f.m118958J("✅ **Tennis** · 87 min"), 8, null), m52402b(c18216b, "2026-09-28", "Mo", "28", true, false, AbstractC37056f.m118959K("✅ **Functional Fitness** · 41 min", "🧘 **Stretching** · gentle and pain-free"), 16, null), m52402b(c18216b, "2026-09-29", "Tu", "29", false, false, AbstractC37056f.m118958J("🚶\u200d♀️ **Incline walking** · pain-free cardio"), 24, null), m52402b(c18216b, "2026-09-30", "We", "30", false, false, AbstractC37056f.m118958J("🏋️\u200d♀️ **SI-safe legs** · controlled loading"), 24, null), m52402b(c18216b, "2026-10-01", "Th", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, false, false, AbstractC37056f.m118958J("🏋️\u200d♀️ **Optional arms** · when schedule and Recovery allow"), 24, null))));
        float f15 = 1 * f13;
        crossAxisFill = new C32265h("row_cross_axis_fill", c18216b.m52404k("row_cross_axis_fill"), f15, null, null, EnumC32258a.FILL, EnumC32259b.END, null, 152, null);
        C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(f14, 0.0f, 2);
        List<C32261d> listM52404k = c18216b.m52404k("row_spacer_distribution");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM52404k) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C32261d c32261d2 = (C32261d) obj;
            AbstractC25265s.m74141p0(arrayList, i13 == 0 ? AbstractC37056f.m118958J(c32261d2) : AbstractC37056f.m118959K(new C32261d(new C25292c0(0.0f, 0.0f, 3, null), null, 2, null), c32261d2));
            i13 = i14;
        }
        spacerDistribution = new C32265h("row_spacer_distribution", arrayList, 0.0f, null, null, null, null, c22976l1M3379a, 124, null);
        List<String> listM118959K = AbstractC37056f.m118959K("Strain", "Recovery", "Sleep");
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        for (String str : listM118959K) {
            arrayList2.add(new C32261d(new C33194k1(AbstractC11266d.m30461o("row_equal_fill_", str), AbstractC8693b.m21278l(str), AbstractC8693b.m21278l("Fill"), null, null, EnumC2888c.B1, EnumC2888c.B2, 3, 0, 0, null, 1816, null), null, 2, null));
        }
        equalFill = new C32265h("row_equal_fill", arrayList2, f15, null, null, null, null, null, 248, null);
        f70801h = 8;
    }

    private C18216b() {
    }

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC25312u> m52401a(String id4, String day, String date, boolean isToday, boolean isPast, List<String> lines) {
        C17736e c17736e = new C17736e(null, null, null, 7, null);
        float f13 = 8;
        float f14 = 2 * f13;
        C25292c0 c25292c0 = new C25292c0(0.0f, f14, 1, null);
        String strM30461o = AbstractC11266d.m30461o("row_day_", id4);
        C32261d c32261d = new C32261d(new C33194k1(AbstractC11895b.m31996o("row_day_", id4, "_date"), AbstractC8693b.m21278l(day), AbstractC8693b.m21278l(date), isToday ? EnumC39333f.STRAIN : EnumC39333f.WHITE_70, (isToday || isPast) ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_70, EnumC2888c.B3, EnumC2888c.N7, 3, 0, 0, null, 1792, null), null, 2, null);
        String strM31996o = AbstractC11895b.m31996o("row_day_", id4, "_column");
        float f15 = 1 * f13;
        C2305k c2305k = C2299e.f9110M;
        List<String> list = lines;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C33169c0((String) it.next(), EnumC2888c.B1, EnumC39333f.WHITE_70, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null));
        }
        return AbstractC37056f.m118959K(c17736e, c25292c0, new C32265h(strM30461o, AbstractC37056f.m118959K(c32261d, new C32261d(new C26301h(strM31996o, arrayList, f15, c2305k, null, 16, null), new InterfaceC32262e.a(9.0f))), f14, null, null, null, null, null, 248, null), new C25292c0(0.0f, f14, 1, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m52402b(C18216b c18216b, String str, String str2, String str3, boolean z4, boolean z13, List list, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        if ((i13 & 16) != 0) {
            z13 = false;
        }
        return c18216b.m52401a(str, str2, str3, z4, z13, list);
    }

    /* JADX INFO: renamed from: c */
    private final C35375b m52403c(String id4, String glyph) {
        float f13 = 4;
        return new C35375b(id4, glyph, f13 * f13, 13, null);
    }

    /* JADX INFO: renamed from: k */
    private final List<C32261d> m52404k(String id4) {
        List listM118959K = AbstractC37056f.m118959K("🏃", "🚴", "🏊");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        int i13 = 0;
        for (Object obj : listM118959K) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C32261d(f70794a.m52403c(AbstractC25012a.m73373f(i13, id4, "_"), (String) obj), InterfaceC32262e.b.f133522a));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final C32265h m52405d() {
        return crossAxisFill;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m52406e() {
        return dayRows;
    }

    /* JADX INFO: renamed from: f */
    public final C32265h m52407f() {
        return equalFill;
    }

    /* JADX INFO: renamed from: g */
    public final C32265h m52408g() {
        return header;
    }

    /* JADX INFO: renamed from: h */
    public final C32265h m52409h() {
        return sleepGoal;
    }

    /* JADX INFO: renamed from: i */
    public final C32265h m52410i() {
        return spacerDistribution;
    }

    /* JADX INFO: renamed from: j */
    public final C32265h m52411j(InterfaceC2300f alignment, String id4) {
        AbstractC22676k.m65750j(alignment, "alignment");
        AbstractC22676k.m65750j(id4, "id");
        return new C32265h("row_main_axis_alignment_".concat(id4), m52404k("row_main_axis_alignment_".concat(id4)), 1 * 8, null, alignment, null, null, null, 232, null);
    }
}
