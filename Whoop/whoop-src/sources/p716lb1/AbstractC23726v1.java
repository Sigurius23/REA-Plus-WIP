package p716lb1;

import com.whoop.design.models.items.GoalSettingsTileModel;
import com.whoop.design.models.items.GoalSettingsTileStyle;
import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.Value;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f41.C14064b;
import f41.C14067e;
import f41.C14079q;
import hy0.C17731c2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: lb1.v1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/GoalSettingsTileModel;", "model", "Lf41/e;", "b", "(Lcom/whoop/design/models/items/GoalSettingsTileModel;)Lf41/e;", "Lcom/whoop/design/models/items/GoalSettingsTileStyle;", "style", "Ly81/e;", "a", "(Lcom/whoop/design/models/items/GoalSettingsTileStyle;)Ly81/e;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23726v1 {

    /* JADX INFO: renamed from: lb1.v1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94022a;

        static {
            int[] iArr = new int[GoalSettingsTileStyle.values().length];
            try {
                iArr[GoalSettingsTileStyle.RECOVERY_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoalSettingsTileStyle.NEGLIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoalSettingsTileStyle.JUST_ADDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoalSettingsTileStyle.BEHAVIOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GoalSettingsTileStyle.NEGATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GoalSettingsTileStyle.POSITIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GoalSettingsTileStyle.STRAIN_ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GoalSettingsTileStyle.SLEEP_ACTIVITY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f94022a = iArr;
        }
    }

    /* JADX INFO: renamed from: lb1.v1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f94023w = new b();

        /* JADX INFO: renamed from: a */
        public final long m69576a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69576a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.v1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f94024w = new c();

        /* JADX INFO: renamed from: a */
        public final long m69577a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69577a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.v1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f94025w = new d();

        /* JADX INFO: renamed from: a */
        public final long m69578a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69578a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.v1$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f94026w = new e();

        /* JADX INFO: renamed from: a */
        public final long m69579a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69579a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: lb1.v1$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f94027w = new f();

        /* JADX INFO: renamed from: a */
        public final long m69580a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m69580a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC39332e m69574a(GoalSettingsTileStyle style) {
        AbstractC22676k.m65750j(style, "style");
        switch (a.f94022a[style.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return p745y81.Function1.m125323a(b.f94023w);
            case 5:
                return p745y81.Function1.m125323a(c.f94024w);
            case 6:
                return p745y81.Function1.m125323a(d.f94025w);
            case 7:
                return p745y81.Function1.m125323a(e.f94026w);
            case 8:
                return p745y81.Function1.m125323a(f.f94027w);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C14067e m69575b(GoalSettingsTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String title = model.getTitle();
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        String upperCase = title.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(upperCase);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getAvoidTextDisplay());
        String icon = model.getIcon();
        AbstractC22403o.c cVar = icon != null ? new AbstractC22403o.c(icon, 0, 0, 0, 14, null) : null;
        ImpactModel trend = model.getTrend();
        C17731c2 c17731c2 = trend != null ? new C17731c2(AbstractC8693b.m21278l(trend.getTitleDisplay()), trend.getBackgroundEnabled(), trend.getTrend(), false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32752, null) : null;
        InterfaceC39332e interfaceC39332eM69574a = m69574a(model.getStyle());
        String backgroundImage = model.getBackgroundImage();
        AbstractC22403o.c cVar2 = backgroundImage != null ? new AbstractC22403o.c(backgroundImage, 0, 0, 0, 14, null) : null;
        boolean zBooleanValue = false;
        boolean z4 = true;
        if (model.getSelectedValue() != null) {
            zBooleanValue = true;
        }
        if (model.getAvoidTextDisplay() == null) {
            z4 = zBooleanValue;
        }
        Boolean boolIsAvoidChecked = model.isAvoidChecked();
        zBooleanValue = boolIsAvoidChecked != null ? boolIsAvoidChecked.booleanValue() : false;
        List<Value> values = model.getDayOptions().getValues();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(values, 10));
        for (Value value : values) {
            arrayList.add(new C14079q(value.getValue(), AbstractC8693b.m21278l(value.getTrailingDisplay()), AbstractC8693b.m21278l(value.getAvoidTrailingDisplay())));
            zBooleanValue = zBooleanValue;
        }
        boolean z13 = zBooleanValue;
        C14064b c14064b = new C14064b(arrayList, AbstractC8693b.m21278l(model.getDayOptions().getLeadingTitleDisplay()));
        Integer selectedValue = model.getSelectedValue();
        return new C14067e(id4, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, cVar, c17731c2, interfaceC39332eM69574a, cVar2, zBooleanValue, z4, z13, c14064b, selectedValue != null ? selectedValue.intValue() : 1, null, DfuBaseService.ERROR_REMOTE_MASK, null);
    }
}
