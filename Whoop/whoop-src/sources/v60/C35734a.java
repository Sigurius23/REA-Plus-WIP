package v60;

import com.whoop.achievements.domain.models.AchievementsResponse;
import com.whoop.achievements.domain.models.AchievementsSectionModel;
import com.whoop.achievements.domain.models.AchievementsSectionSpacingType;
import com.whoop.design.models.AchievementsBackgroundStyle;
import com.whoop.design.models.colortheme.ColorBackgroundModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gv1.C16234h;
import gz0.AbstractC16315n0;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jb1.C21535a;
import m51.InterfaceC25079a;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23623f0;
import p720m91.InterfaceC25312u;
import p736sz0.C33205o0;
import r60.C30975c;
import r60.InterfaceC30973a;
import u60.C34551c;
import u60.InterfaceC34549a;

/* JADX INFO: renamed from: v60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u0007*\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lv60/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lr60/c;", "Lu60/c;", "c", "(Lr60/c;)Lu60/c;", "Lu60/c$a;", "dialog", "Lgv1/h;", "lottieTesterConfig", "d", "(Lr60/c;Lu60/c$a;Lgv1/h;)Lu60/c;", "Lcom/whoop/achievements/domain/models/AchievementsResponse;", "response", "", "Lu60/c$b;", "a", "(Lcom/whoop/achievements/domain/models/AchievementsResponse;Lgv1/h;)Ljava/util/List;", "domainResult", "b", "(Lr60/c;Lgv1/h;)Lu60/c;", "Ljb1/a;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35734a {

    /* JADX INFO: renamed from: b */
    public static final int f151985b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    public C35734a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<u60.c$b>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    private final List<C34551c.b> m113191a(AchievementsResponse response, C16234h lottieTesterConfig) {
        ?? arrayList;
        List<AchievementsSectionModel> sections;
        AchievementsSectionSpacingType achievementsSectionSpacingType;
        if (response == null || (sections = response.getSections()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            List<AchievementsSectionModel> list = sections;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (AchievementsSectionModel achievementsSectionModel : list) {
                String sectionType = achievementsSectionModel.getSectionType();
                if (sectionType == null) {
                    sectionType = "";
                }
                String upperCase = sectionType.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                AchievementsSectionSpacingType achievementsSectionSpacingType2 = AchievementsSectionSpacingType.COMPACT;
                AchievementsSectionSpacingType[] achievementsSectionSpacingTypeArrValues = AchievementsSectionSpacingType.values();
                int length = achievementsSectionSpacingTypeArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        achievementsSectionSpacingType = null;
                        break;
                    }
                    achievementsSectionSpacingType = achievementsSectionSpacingTypeArrValues[i13];
                    if (AbstractC22676k.m65745e(achievementsSectionSpacingType.name(), upperCase)) {
                        break;
                    }
                    i13++;
                }
                if (achievementsSectionSpacingType != null) {
                    achievementsSectionSpacingType2 = achievementsSectionSpacingType;
                }
                List<InterfaceC25312u> listM60540g = this.reducer.m60540g(achievementsSectionModel.getItems());
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM60540g, 10));
                Iterator it = listM60540g.iterator();
                while (it.hasNext()) {
                    arrayList2.add(AbstractC35735b.m113199e((InterfaceC25312u) it.next()));
                }
                arrayList.add(new C34551c.b(arrayList2, achievementsSectionSpacingType2));
            }
        }
        lottieTesterConfig.getLottieSource();
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private final C34551c m113192c(C30975c c30975c) {
        String achievementType = c30975c.getAchievementType();
        if (achievementType == null) {
            achievementType = "";
        }
        String source = c30975c.getSource();
        InterfaceC30973a currentDialogType = c30975c.getCurrentDialogType();
        if (currentDialogType instanceof InterfaceC30973a.b) {
            return new C34551c(null, new C34551c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, null, 13, null);
        }
        if (currentDialogType instanceof InterfaceC30973a.c) {
            return new C34551c(null, new C34551c.c(C33205o0.f138451a.m105289c(), new InterfaceC34549a.i(achievementType, source), null, InterfaceC34549a.d.f145342a, 4, null), null, null, 13, null);
        }
        return currentDialogType instanceof InterfaceC30973a.d ? new C34551c(null, new C34551c.c(C33205o0.f138451a.m105291e(), new InterfaceC34549a.i(achievementType, source), null, InterfaceC34549a.d.f145342a, 4, null), null, null, 13, null) : new C34551c(null, new C34551c.c(C33205o0.f138451a.m105288b(), null, null, null, 14, null), null, null, 13, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [m83.z] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX INFO: renamed from: d */
    private final C34551c m113193d(C30975c c30975c, C34551c.a aVar, C16234h c16234h) {
        ?? linkedHashMap;
        AchievementsBackgroundStyle achievementsBackgroundStyle;
        TextResource textResourceM21267a;
        ColorThemeModel colors;
        ColorBackgroundModel background;
        String navigationTitle;
        String navigationIcon;
        Map<String, String> analyticProperties;
        AchievementsResponse response = c30975c.getResponse();
        if (response == null || (analyticProperties = response.getAnalyticProperties()) == null) {
            linkedHashMap = C25272z.f99163w;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : analyticProperties.entrySet()) {
                if (entry.getValue().length() > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        ?? r10 = linkedHashMap;
        AchievementsResponse response2 = c30975c.getResponse();
        String backgroundStyle = response2 != null ? response2.getBackgroundStyle() : null;
        if (backgroundStyle == null) {
            backgroundStyle = "";
        }
        String upperCase = backgroundStyle.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        AchievementsBackgroundStyle achievementsBackgroundStyle2 = AchievementsBackgroundStyle.DEFAULT;
        AchievementsBackgroundStyle[] achievementsBackgroundStyleArrValues = AchievementsBackgroundStyle.values();
        int length = achievementsBackgroundStyleArrValues.length;
        boolean z4 = false;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                achievementsBackgroundStyle = null;
                break;
            }
            achievementsBackgroundStyle = achievementsBackgroundStyleArrValues[i13];
            if (AbstractC22676k.m65745e(achievementsBackgroundStyle.name(), upperCase)) {
                break;
            }
            i13++;
        }
        AchievementsBackgroundStyle achievementsBackgroundStyle3 = achievementsBackgroundStyle == null ? achievementsBackgroundStyle2 : achievementsBackgroundStyle;
        AchievementsResponse response3 = c30975c.getResponse();
        EnumC16313m0 enumC16313m0M46377b = (response3 == null || (navigationIcon = response3.getNavigationIcon()) == null) ? null : AbstractC16315n0.m46377b(navigationIcon);
        AchievementsResponse response4 = c30975c.getResponse();
        if (response4 == null || (navigationTitle = response4.getNavigationTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(navigationTitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        List<C34551c.b> listM113191a = m113191a(c30975c.getResponse(), c16234h);
        if (!c30975c.getManualRefresh() && c30975c.getDisplayRefreshingSpinner()) {
            z4 = true;
        }
        AchievementsResponse response5 = c30975c.getResponse();
        InterfaceC25079a interfaceC25079aM68736a = (response5 == null || (colors = response5.getColors()) == null || (background = colors.getBackground()) == null) ? null : AbstractC23623f0.m68736a(background);
        AchievementsResponse response6 = c30975c.getResponse();
        return new C34551c(aVar, null, new C34551c.d(textResource, listM113191a, z4, achievementsBackgroundStyle3, interfaceC25079aM68736a, enumC16313m0M46377b, response6 != null ? response6.getNavigationDestination() : null, r10), null, 10, null);
    }

    /* JADX INFO: renamed from: b */
    public final C34551c m113194b(C30975c domainResult, C16234h lottieTesterConfig) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        AbstractC22676k.m65750j(lottieTesterConfig, "lottieTesterConfig");
        return C34551c.m109211c(domainResult.getCurrentDialogType() instanceof InterfaceC30973a.a ? m113192c(domainResult) : m113193d(domainResult, null, lottieTesterConfig), null, null, null, lottieTesterConfig, 7, null);
    }

    public /* synthetic */ C35734a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC35735b.f151987a : c21535a);
    }
}
