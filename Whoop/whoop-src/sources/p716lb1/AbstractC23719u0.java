package p716lb1;

import com.whoop.design.atomic.organism.datahighlight.StreaksBadgeStyle;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DataHighlightModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.InfoModel;
import com.whoop.design.models.items.NotableStatsModel;
import com.whoop.design.models.items.ScoreGaugeDialModel;
import com.whoop.design.models.items.ScoreGaugeRowModel;
import com.whoop.design.models.items.StreakBadgeModel;
import com.whoop.design.models.items.StreaksContainer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import s51.C32207d;
import s51.C32208e;
import s51.C32211h;
import s51.C32212i;
import s51.C32216m;
import s51.C32218o;

/* JADX INFO: renamed from: lb1.u0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/design/models/items/DataHighlightModel;", "model", "Ls51/d;", "c", "(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;", "Lcom/whoop/design/models/items/StreakBadgeModel;", "Ls51/o;", "k", "(Lcom/whoop/design/models/items/StreakBadgeModel;)Ls51/o;", "Lcom/whoop/design/models/items/NotableStatsModel;", "Ls51/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/NotableStatsModel;)Ls51/h;", "Lcom/whoop/design/models/items/InfoModel;", "Ls51/e;", "g", "(Lcom/whoop/design/models/items/InfoModel;)Ls51/e;", "Lcom/whoop/design/models/items/ScoreGaugeRowModel;", "Ls51/m;", "j", "(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;", "Lcom/whoop/design/models/items/ScoreGaugeDialModel;", "Ls51/i;", "i", "(Lcom/whoop/design/models/items/ScoreGaugeDialModel;)Ls51/i;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "dataHighlightMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23719u0 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93981a = Function1.m68251a(new C23644i0(19));

    /* JADX INFO: renamed from: lb1.u0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93982w;

        public a(Function1 function1) {
            this.f93982w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93982w.invoke((DataHighlightModel) it);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX INFO: renamed from: c */
    public static final C32207d m69451c(DataHighlightModel model) {
        C32216m c32216m;
        C17736e c17736e;
        ArrayList arrayList;
        C17736e c17736e2;
        List<StreakBadgeModel> streakList;
        AbstractC22676k.m65750j(model, "model");
        ArrayList arrayList2 = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        String string = model.toString();
        ScoreGaugeRowModel pillarGauges = model.getPillarGauges();
        if (pillarGauges == null || (c32216m = m69458j(pillarGauges)) == null) {
            c32216m = new C32216m("empty_pillar_gauges", C25271y.f99162w);
        }
        C32216m c32216m2 = c32216m;
        DividerModel streaksDivider = model.getStreaksDivider();
        if (streaksDivider != null) {
            InterfaceC25312u interfaceC25312uM60541h = c21535aM60555e.m60541h(streaksDivider);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.DividerState");
            c17736e = (C17736e) interfaceC25312uM60541h;
        } else {
            c17736e = null;
        }
        StreaksContainer streaks = model.getStreaks();
        if (streaks == null || (streakList = streaks.getStreakList()) == null) {
            arrayList = null;
        } else {
            if (streakList.isEmpty()) {
                streakList = null;
            }
            if (streakList != null) {
                List<StreakBadgeModel> list = streakList;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(m69459k((StreakBadgeModel) it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
        }
        DividerModel notableStatsDivider = model.getNotableStatsDivider();
        if (notableStatsDivider != null) {
            InterfaceC25312u interfaceC25312uM60541h2 = c21535aM60555e.m60541h(notableStatsDivider);
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.atom.DividerState");
            c17736e2 = (C17736e) interfaceC25312uM60541h2;
        } else {
            c17736e2 = null;
        }
        List<NotableStatsModel> notableStats = model.getNotableStats();
        if (notableStats != null) {
            List<NotableStatsModel> list2 = notableStats;
            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(m69456h((NotableStatsModel) it3.next()));
            }
        }
        return new C32207d(string, c32216m2, c17736e, arrayList, c17736e2, arrayList2, model.getFooter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m69452d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DataHighlightModel.class), new a(new C23644i0(20)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C32207d m69453e(DataHighlightModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69451c(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m69454f() {
        return f93981a;
    }

    /* JADX INFO: renamed from: g */
    private static final C32208e m69455g(InfoModel infoModel) {
        EnumC16313m0 enumC16313m0;
        String infoIcon = infoModel.getInfoIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.EDUCATION;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), infoIcon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        return new C32208e(enumC16313m1, infoModel.getInfoTitle(), infoModel.getInfoDescription());
    }

    /* JADX INFO: renamed from: h */
    private static final C32211h m69456h(NotableStatsModel notableStatsModel) {
        EnumC16313m0 enumC16313m0;
        EnumC16313m0 enumC16313m1;
        String id4 = notableStatsModel.getId();
        if (id4 == null) {
            id4 = notableStatsModel.getTitle();
        }
        String str = id4;
        String icon = notableStatsModel.getIcon();
        if (icon == null || icon.length() == 0) {
            enumC16313m0 = null;
        } else {
            String icon2 = notableStatsModel.getIcon();
            enumC16313m0 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC16313m1 = null;
                    break;
                }
                enumC16313m1 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m1.name(), icon2)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m1 != null) {
                enumC16313m0 = enumC16313m1;
            }
        }
        String title = notableStatsModel.getTitle();
        String subtitle = notableStatsModel.getSubtitle();
        InfoModel info = notableStatsModel.getInfo();
        return new C32211h(str, enumC16313m0, title, subtitle, info != null ? m69455g(info) : null, notableStatsModel.getCurrentValueDisplay().getText(), notableStatsModel.getCurrentValueDisplay().getUnit(), notableStatsModel.getDestination());
    }

    /* JADX INFO: renamed from: i */
    private static final C32212i m69457i(ScoreGaugeDialModel scoreGaugeDialModel) {
        String id4 = scoreGaugeDialModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(scoreGaugeDialModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(scoreGaugeDialModel.getScoreDisplay());
        String scoreDisplaySuffix = scoreGaugeDialModel.getScoreDisplaySuffix();
        EnumC16313m0 enumC16313m0 = null;
        TextResource textResourceM21278l3 = scoreDisplaySuffix != null ? AbstractC8693b.m21278l(scoreDisplaySuffix) : null;
        String titleEndIcon = scoreGaugeDialModel.getTitleEndIcon();
        if (titleEndIcon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), titleEndIcon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 == null) {
                enumC16313m0 = enumC16313m1;
            }
        }
        return new C32212i(id4, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, enumC16313m0, AbstractC23720u1.m69480t(scoreGaugeDialModel.getProgressFillStyle()), scoreGaugeDialModel.getGaugeFillPercentage(), scoreGaugeDialModel.getScoreTarget(), scoreGaugeDialModel.getLowerOptimalPercentage(), scoreGaugeDialModel.getHigherOptimalPercentage(), scoreGaugeDialModel.getDestination());
    }

    /* JADX INFO: renamed from: j */
    private static final C32216m m69458j(ScoreGaugeRowModel scoreGaugeRowModel) {
        String id4 = scoreGaugeRowModel.getId();
        List<ScoreGaugeDialModel> gauges = scoreGaugeRowModel.getGauges();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(gauges, 10));
        Iterator<T> it = gauges.iterator();
        while (it.hasNext()) {
            arrayList.add(m69457i((ScoreGaugeDialModel) it.next()));
        }
        return new C32216m(id4, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[ADDED_TO_REGION, REMOVE] */
    /* JADX INFO: renamed from: k */
    private static final C32218o m69459k(StreakBadgeModel streakBadgeModel) {
        EnumC16313m0 enumC16313m0;
        StreaksBadgeStyle streaksBadgeStyle;
        String id4 = streakBadgeModel.getId();
        String icon = streakBadgeModel.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(streakBadgeModel.getTitle());
        String subtitle = streakBadgeModel.getSubtitle();
        TextResource textResourceM21278l2 = subtitle != null ? AbstractC8693b.m21278l(subtitle) : null;
        String style = streakBadgeModel.getStyle();
        int iHashCode = style.hashCode();
        if (iHashCode != -1838664331) {
            if (iHashCode != -16486507) {
                if (iHashCode == 78984887 && !style.equals("SLEEP")) {
                    streaksBadgeStyle = StreaksBadgeStyle.SLEEP;
                } else {
                    streaksBadgeStyle = StreaksBadgeStyle.SLEEP;
                }
            } else if (style.equals("RECOVERY")) {
                streaksBadgeStyle = StreaksBadgeStyle.RECOVERY;
            } else {
                streaksBadgeStyle = StreaksBadgeStyle.SLEEP;
            }
        } else if (style.equals("STRAIN")) {
            streaksBadgeStyle = StreaksBadgeStyle.STRAIN;
        } else {
            streaksBadgeStyle = StreaksBadgeStyle.SLEEP;
        }
        return new C32218o(id4, enumC16313m1, textResourceM21278l, textResourceM21278l2, streaksBadgeStyle);
    }
}
