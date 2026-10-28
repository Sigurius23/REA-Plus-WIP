package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DialogInfo;
import com.whoop.design.models.items.MilestoneAnalytics;
import com.whoop.design.models.items.MilestoneCardModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import jb1.AbstractC21537c;
import jb1.C21535a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import s21.C32078a;
import s21.C32079b;
import s21.C32085h;
import s21.EnumC32086i;
import s21.EnumC32087j;

/* JADX INFO: renamed from: lb1.b3 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/design/models/items/MilestoneCardModel;", "model", "Ls21/h;", "d", "(Lcom/whoop/design/models/items/MilestoneCardModel;)Ls21/h;", "Llb1/y0;", "a", "Llb1/y0;", "c", "()Llb1/y0;", "milestoneCardMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23598b3 {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93682a = Function1.m68251a(new C23715t2(18));

    /* JADX INFO: renamed from: lb1.b3$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93683a;

        static {
            int[] iArr = new int[EnumC32087j.values().length];
            try {
                iArr[EnumC32087j.RESTORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32087j.DISCOVER_HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f93683a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.b3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93684w;

        public b(Function1 function1) {
            this.f93684w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93684w.invoke((MilestoneCardModel) it);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C23743y0 m68535c() {
        return f93682a;
    }

    /* JADX INFO: renamed from: d */
    public static final C32085h m68536d(MilestoneCardModel model) {
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        EnumC39333f enumC39333f3;
        EnumC32086i enumC32086i;
        EnumC32086i enumC32086i2;
        EnumC39333f enumC39333f4;
        EnumC32087j enumC32087j;
        EnumC32087j enumC32087j2;
        AbstractC22676k.m65750j(model, "model");
        C21535a c21535aM60555e = AbstractC21537c.m60555e(null, 1, null);
        TextResource title = model.getTitle();
        TextResource subtitle = model.getSubtitle();
        String id4 = model.getId();
        if (id4 == null) {
            id4 = "";
        }
        String str = id4;
        AbstractC22403o.c cVar = new AbstractC22403o.c(model.getImageUrl(), 0, 0, 0, 14, null);
        TextResource cta = model.getCta();
        if (cta == null) {
            cta = AbstractC8693b.m21267a();
        }
        TextResource textResource = cta;
        C9598e navigation = model.getNavigation();
        Integer filledCount = model.getFilledCount();
        int iIntValue = filledCount != null ? filledCount.intValue() : 0;
        Integer totalCount = model.getTotalCount();
        int iIntValue2 = totalCount != null ? totalCount.intValue() : 0;
        String progressStyle = model.getProgressStyle();
        if (progressStyle != null) {
            EnumC32087j[] enumC32087jArrValues = EnumC32087j.values();
            int length = enumC32087jArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC32087j2 = null;
                    break;
                }
                enumC32087j2 = enumC32087jArrValues[i13];
                if (AbstractC22676k.m65745e(enumC32087j2.name(), progressStyle)) {
                    break;
                }
                i13++;
            }
            enumC39333f = (enumC32087j2 == null ? -1 : a.f93683a[enumC32087j2.ordinal()]) == 1 ? EnumC39333f.STRAIN_ZONE_2 : null;
        } else {
            enumC39333f = null;
        }
        String progressStyle2 = model.getProgressStyle();
        if (progressStyle2 != null) {
            EnumC32087j[] enumC32087jArrValues2 = EnumC32087j.values();
            int length2 = enumC32087jArrValues2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length2) {
                    enumC32087j = null;
                    break;
                }
                enumC32087j = enumC32087jArrValues2[i14];
                if (AbstractC22676k.m65745e(enumC32087j.name(), progressStyle2)) {
                    break;
                }
                i14++;
            }
            enumC39333f2 = (enumC32087j == null ? -1 : a.f93683a[enumC32087j.ordinal()]) == 2 ? EnumC39333f.RECOVERY : null;
        } else {
            enumC39333f2 = null;
        }
        boolean zIsUnlocked = model.isUnlocked();
        if (model.getColor() != null) {
            String color = model.getColor();
            EnumC39333f enumC39333f5 = EnumC39333f.WHITE_10;
            EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
            int length3 = enumC39333fArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length3) {
                    enumC39333f4 = null;
                    break;
                }
                enumC39333f4 = enumC39333fArrValues[i15];
                int i16 = i15;
                if (AbstractC22676k.m65745e(enumC39333f4.name(), color)) {
                    break;
                }
                i15 = i16 + 1;
            }
            enumC39333f3 = enumC39333f4 == null ? enumC39333f5 : enumC39333f4;
        } else {
            enumC39333f3 = null;
        }
        String type = model.getType();
        if (type != null) {
            EnumC32086i enumC32086i3 = EnumC32086i.STEP_BAR;
            EnumC32086i[] enumC32086iArrValues = EnumC32086i.values();
            int length4 = enumC32086iArrValues.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length4) {
                    enumC32086i2 = null;
                    break;
                }
                enumC32086i2 = enumC32086iArrValues[i17];
                int i18 = length4;
                if (AbstractC22676k.m65745e(enumC32086i2.name(), type)) {
                    break;
                }
                i17++;
                length4 = i18;
            }
            enumC32086i = enumC32086i2 == null ? enumC32086i3 : enumC32086i2;
        } else {
            enumC32086i = null;
        }
        DialogInfo dialogInfo = model.getDialogInfo();
        C32078a c32078a = dialogInfo != null ? new C32078a(dialogInfo.getTitle(), dialogInfo.getSubtitle(), c21535aM60555e.m60540g(dialogInfo.getItems())) : null;
        TagModel navigationTag = model.getNavigationTag();
        InterfaceC25312u interfaceC25312uM60541h = navigationTag != null ? c21535aM60555e.m60541h(navigationTag) : null;
        MilestoneAnalytics analytics = model.getAnalytics();
        return new C32085h(title, subtitle, str, cVar, textResource, enumC39333f2, navigation, iIntValue, iIntValue2, enumC39333f, zIsUnlocked, enumC39333f3, enumC32086i, interfaceC25312uM60541h, c32078a, analytics != null ? new C32079b(analytics.getEventName(), analytics.getCategory(), analytics.getLabel(), analytics.getValue()) : null, model.getInteraction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68537e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MilestoneCardModel.class), new b(new C23715t2(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C32085h m68538f(MilestoneCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68536d(model);
    }
}
