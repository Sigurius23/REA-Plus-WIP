package p716lb1;

import a61.C0472e;
import a61.C0473f;
import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CheckmarkStyle;
import com.whoop.design.models.items.GoalProgressCardModel;
import com.whoop.design.models.items.LabeledProgressBarModel;
import com.whoop.design.models.items.LabeledProgressBarStyle;
import com.whoop.design.models.items.ProgressBreakdownModel;
import com.whoop.design.models.items.ProgressMetaDataModel;
import com.whoop.design.models.items.ProgressSubtaskModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.util.TrendKey;
import e93.AbstractC12889b;
import hz0.C17814c;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import k71.C22259p;
import k71.EnumC22244c;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25267u;
import p01.C28582b;
import p01.EnumC28588h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import x11.C37829c;
import y01.C39023f;
import y01.C39024g;

/* JADX INFO: renamed from: lb1.u3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001f\u0010 \"\u001a\u0010&\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, m65681d2 = {"Lcom/whoop/design/models/items/LabeledProgressBarModel;", "Lhz0/c;", "m", "(Lcom/whoop/design/models/items/LabeledProgressBarModel;)Lhz0/c;", "Lcom/whoop/design/models/items/LabeledProgressBarStyle;", "style", "Ly81/f;", "f", "(Lcom/whoop/design/models/items/LabeledProgressBarStyle;)Ly81/f;", "Lcom/whoop/design/models/items/ProgressBreakdownModel;", "Ly01/f;", "o", "(Lcom/whoop/design/models/items/ProgressBreakdownModel;)Ly01/f;", "Lcom/whoop/design/models/items/GoalProgressCardModel;", "La61/e;", "p", "(Lcom/whoop/design/models/items/GoalProgressCardModel;)La61/e;", "model", "Ljb1/a;", "reducer", "Lk71/p;", "n", "(Lcom/whoop/design/models/items/GoalProgressCardModel;Ljb1/a;)Lk71/p;", "", "La61/f;", "q", "(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/util/List;", "Lx11/c;", "k", "(Lcom/whoop/design/models/items/GoalProgressCardModel;)Lx11/c;", "", "l", "(Lcom/whoop/design/models/items/GoalProgressCardModel;)Ljava/lang/Object;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "progressCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23722u3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f94008a = Function1.m68251a(new C23654j3(21));

    /* JADX INFO: renamed from: lb1.u3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94009a;

        static {
            int[] iArr = new int[LabeledProgressBarStyle.values().length];
            try {
                iArr[LabeledProgressBarStyle.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f94009a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.u3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94010w;

        public b(Function1 function1) {
            this.f94010w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94010w.invoke((LabeledProgressBarModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u3$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94011w;

        public c(Function1 function1) {
            this.f94011w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94011w.invoke((ProgressBreakdownModel) it);
        }
    }

    /* JADX INFO: renamed from: lb1.u3$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f94012w;

        public d(Function1 function1) {
            this.f94012w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f94012w.invoke((GoalProgressCardModel) it);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m69535e() {
        return f94008a;
    }

    /* JADX INFO: renamed from: f */
    public static final EnumC39333f m69536f(LabeledProgressBarStyle style) {
        AbstractC22676k.m65750j(style, "style");
        if (a.f94009a[style.ordinal()] == 1) {
            return EnumC39333f.ACCENT_POSITIVE_TREND;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m69537g(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        C23654j3 c23654j3 = new C23654j3(22);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(LabeledProgressBarModel.class), new b(c23654j3));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(ProgressBreakdownModel.class), new c(new C23654j3(23)));
        designModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GoalProgressCardModel.class), new d(new C23654j3(24)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C17814c m69538h(LabeledProgressBarModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69543m(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C39023f m69539i(ProgressBreakdownModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69545o(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C0472e m69540j(GoalProgressCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m69546p(model);
    }

    /* JADX INFO: renamed from: k */
    private static final C37829c m69541k(GoalProgressCardModel goalProgressCardModel) {
        String ctaText;
        Object obj = null;
        if (goalProgressCardModel == null || (ctaText = goalProgressCardModel.getCtaText()) == null) {
            return null;
        }
        Object destination = goalProgressCardModel.getDestination();
        if (destination == null) {
            destination = TrendKey.NONE;
            for (TrendKey trendKey : TrendKey.values()) {
                if (AbstractC22676k.m65745e(trendKey.name(), ctaText)) {
                    obj = trendKey;
                    break;
                }
            }
            if (obj != null) {
                destination = obj;
            }
        }
        return new C37829c(destination, AbstractC8693b.m21267a(), AbstractC8693b.m21278l(ctaText));
    }

    /* JADX INFO: renamed from: l */
    private static final Object m69542l(GoalProgressCardModel goalProgressCardModel) {
        TrendKey trendKey;
        if (goalProgressCardModel != null) {
            return (goalProgressCardModel.getCtaText() == null || (trendKey = TrendKey.NONE) == null) ? goalProgressCardModel.getDestination() : trendKey;
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final C17814c m69543m(LabeledProgressBarModel labeledProgressBarModel) {
        AbstractC22676k.m65750j(labeledProgressBarModel, "<this>");
        return new C17814c(labeledProgressBarModel.getLeftLabel(), labeledProgressBarModel.getLeftSublabel(), labeledProgressBarModel.getRightLabel(), labeledProgressBarModel.getRightSublabel(), AbstractC12889b.m36283m(labeledProgressBarModel.getProgress(), 0.0f, 1.0f), m69536f(labeledProgressBarModel.getStyle()));
    }

    /* JADX INFO: renamed from: n */
    private static final C22259p m69544n(GoalProgressCardModel goalProgressCardModel, C21535a c21535a) {
        ProgressBreakdownModel progressBreakdown = goalProgressCardModel.getProgressBreakdown();
        if (progressBreakdown != null) {
            return new C22259p(AbstractC8693b.m21278l(progressBreakdown.getUpperLeftDisplay()), AbstractC8693b.m21278l(progressBreakdown.getUpperRightDisplay()), c21535a.m60541h(ProgressBreakdownModel.copy$default(progressBreakdown, 0, 0, null, null, null, null, null, 127, null)));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    /* JADX INFO: renamed from: o */
    public static final C39023f m69545o(ProgressBreakdownModel progressBreakdownModel) {
        C39024g c39024g;
        AbstractC22676k.m65750j(progressBreakdownModel, "<this>");
        int totalProgressSteps = progressBreakdownModel.getTotalProgressSteps();
        int currentProgressSteps = progressBreakdownModel.getCurrentProgressSteps();
        EnumC39333f enumC39333fM69405b = AbstractC23710s3.m69405b(progressBreakdownModel.getProgressStyle());
        EnumC39333f enumC39333fM69404a = AbstractC23710s3.m69404a(progressBreakdownModel.getProgressStyle());
        String upperLeftDisplay = progressBreakdownModel.getUpperLeftDisplay();
        C39024g c39024g2 = null;
        if (upperLeftDisplay == null) {
            c39024g = null;
        } else {
            if (upperLeftDisplay.length() <= 0) {
                upperLeftDisplay = null;
            }
            if (upperLeftDisplay != null) {
                c39024g = new C39024g(AbstractC8693b.m21278l(upperLeftDisplay), AbstractC23710s3.m69406c(progressBreakdownModel.getProgressStyle()));
            } else {
                c39024g = null;
            }
        }
        String upperRightDisplay = progressBreakdownModel.getUpperRightDisplay();
        C39024g c39024g3 = (upperRightDisplay == null || upperRightDisplay.length() == 0) ? null : new C39024g(AbstractC8693b.m21278l(progressBreakdownModel.getUpperRightDisplay()), EnumC39333f.BRAND_WHITE);
        String lowerLeftDisplay = progressBreakdownModel.getLowerLeftDisplay();
        if (lowerLeftDisplay != null) {
            if (lowerLeftDisplay.length() <= 0) {
                lowerLeftDisplay = null;
            }
            if (lowerLeftDisplay != null) {
                c39024g2 = new C39024g(AbstractC8693b.m21278l(lowerLeftDisplay), AbstractC23710s3.m69406c(progressBreakdownModel.getProgressStyle()));
            }
        }
        return new C39023f(totalProgressSteps, currentProgressSteps, enumC39333fM69405b, enumC39333fM69404a, c39024g, c39024g3, c39024g2);
    }

    /* JADX INFO: renamed from: p */
    public static final C0472e m69546p(GoalProgressCardModel goalProgressCardModel) {
        EnumC22244c enumC22244c;
        C28582b c28582b;
        String strName;
        EnumC22244c enumC22244c2;
        AbstractC22676k.m65750j(goalProgressCardModel, "<this>");
        C28582b c28582b2 = null;
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        Object objM69542l = m69542l(goalProgressCardModel);
        if (objM69542l == null) {
            objM69542l = TrendKey.NONE;
        }
        Object obj = objM69542l;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(goalProgressCardModel.getTitle());
        String progressDisplay = goalProgressCardModel.getProgressDisplay();
        TextResource textResourceM21278l2 = progressDisplay != null ? AbstractC8693b.m21278l(progressDisplay) : null;
        String sevenDayVow = goalProgressCardModel.getSevenDayVow();
        TextResource textResourceM21278l3 = sevenDayVow != null ? AbstractC8693b.m21278l(sevenDayVow) : null;
        C22259p c22259pM69544n = m69544n(goalProgressCardModel, c21535aM60555e);
        List<C0473f> listM69547q = m69547q(goalProgressCardModel);
        CheckmarkStyle checkmarkStyle = goalProgressCardModel.getCheckmarkStyle();
        if (checkmarkStyle == null || (strName = checkmarkStyle.name()) == null) {
            enumC22244c = null;
        } else {
            EnumC22244c[] enumC22244cArrValues = EnumC22244c.values();
            int length = enumC22244cArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC22244c2 = null;
                    break;
                }
                enumC22244c2 = enumC22244cArrValues[i13];
                if (AbstractC22676k.m65745e(enumC22244c2.name(), strName)) {
                    break;
                }
                i13++;
            }
            enumC22244c = enumC22244c2;
        }
        C37829c c37829cM69541k = m69541k(goalProgressCardModel);
        CircularProgressIndicator circularProgressIndicator = goalProgressCardModel.getCircularProgressIndicator();
        if (circularProgressIndicator != null) {
            CurrentProgressSteps currentProgressSteps = circularProgressIndicator.getCurrentProgressSteps();
            if (currentProgressSteps != null) {
                c28582b = new C28582b(currentProgressSteps.getTotalSteps(), currentProgressSteps.getCurrentStep(), 0.0f, currentProgressSteps.getTextDisplay(), null, null, Boolean.valueOf(currentProgressSteps.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.STEPS, null, 786356, null);
            } else {
                CurrentProgressPercentage currentProgressPercentage = circularProgressIndicator.getCurrentProgressPercentage();
                if (currentProgressPercentage != null) {
                    c28582b = new C28582b(0, 0, (float) (currentProgressPercentage.getPercentage() / ((double) 100)), currentProgressPercentage.getTextDisplay(), null, null, Boolean.valueOf(currentProgressPercentage.getStyle() == CircularProgressStyle.WEEKLY_PLAN_COMPLETE), null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, EnumC28588h.PERCENTAGE, null, 786355, null);
                }
            }
            c28582b2 = c28582b;
        }
        return new C0472e(obj, null, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, enumC22244c, c22259pM69544n, listM69547q, c37829cM69541k, c28582b2, 2, null);
    }

    /* JADX INFO: renamed from: q */
    private static final List<C0473f> m69547q(GoalProgressCardModel goalProgressCardModel) {
        ProgressMetaDataModel progressMetadata;
        List<ProgressSubtaskModel> progressSubtasks;
        ProgressBreakdownModel progressBreakdown = goalProgressCardModel.getProgressBreakdown();
        if (progressBreakdown == null || (progressMetadata = progressBreakdown.getProgressMetadata()) == null || (progressSubtasks = progressMetadata.getProgressSubtasks()) == null) {
            return null;
        }
        List<ProgressSubtaskModel> list = progressSubtasks;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (ProgressSubtaskModel progressSubtaskModel : list) {
            arrayList.add(new C0473f(AbstractC8693b.m21278l(progressSubtaskModel.getTaskValue()), AbstractC22404p.m64503l(progressSubtaskModel.getTaskIcon()), AbstractC8693b.m21278l(progressSubtaskModel.getTaskName()), AbstractC23710s3.m69407d(goalProgressCardModel.getProgressBreakdown().getProgressStyle())));
        }
        return arrayList;
    }
}
