package n81;

import b91.EnumC2888c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HealthMonitorScreenModel;
import java.util.List;
import l83.C23465k;
import m81.C25231f;
import m83.AbstractC25247g0;
import ny0.C27273p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n81.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, m65681d2 = {"Ln81/g;", "", "<init>", "()V", "Ln81/f;", "b", "Ln81/f;", "a", "()Ln81/f;", "successTwoTags", "c", "getCustomStyleTags", "customStyleTags", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26454g {

    /* JADX INFO: renamed from: a */
    public static final C26454g f105067a = new C26454g();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C26453f successTwoTags;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C26453f customStyleTags;

    /* JADX INFO: renamed from: d */
    public static final int f105070d;

    static {
        List listM118959K = AbstractC37056f.m118959K(new C26448a("Sleep", "SLEEP", null, 4, null), new C26448a("Performance", "PERFORMANCE", null, 4, null));
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Sleep Content");
        AppScreen.C9378o2 c9378o2 = AppScreen.C9378o2.f27821w;
        C26453f c26453f = new C26453f(listM118959K, "SLEEP", null, null, null, AbstractC25247g0.m73990Y(new C23465k("SLEEP", new C27273p0(textResourceM21278l, new C9598e(c9378o2, new HealthMonitorScreenModel((Integer) null, (String) null, (String) null, (AiAction) null, 15, (DefaultConstructorMarker) null), null, 4, null), null, null, null, null, false, null, null, null, null, false, null, false, 16380, null)), new C23465k("PERFORMANCE", new C27273p0(AbstractC8693b.m21278l("Performance Content"), new C9598e(c9378o2, new HealthMonitorScreenModel((Integer) null, (String) null, (String) null, (AiAction) null, 15, (DefaultConstructorMarker) null), null, 4, null), null, null, null, null, false, null, null, null, null, false, null, false, 16380, null))), 28, null);
        successTwoTags = c26453f;
        EnumC39333f enumC39333f = EnumC39333f.BRAND_WHITE;
        EnumC39333f enumC39333f2 = EnumC39333f.BRAND_BLACK;
        float f13 = 4;
        customStyleTags = C26453f.m78338b(c26453f, null, null, null, null, new C26451d(new C25231f(enumC39333f, enumC39333f2, EnumC39333f.ACCENT_ALERT, EnumC39333f.ACCENT_NEGATIVE_TREND, f13, 1 * f13, null), new C25231f(enumC39333f2, enumC39333f, EnumC39333f.ACCENT_FOCUS, EnumC39333f.BLACK_20, 5, 2 * f13, null), EnumC2888c.B5), null, 47, null);
        f105070d = 8;
    }

    private C26454g() {
    }

    /* JADX INFO: renamed from: a */
    public final C26453f m78346a() {
        return successTwoTags;
    }
}
