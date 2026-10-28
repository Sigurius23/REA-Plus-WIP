package za2;

import com.whoop.design.models.items.UpsellCardFeaturesModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.settings.banner.models.SettingsBannerDtoV2;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vc2.AbstractC35881d;
import xc2.InterfaceC38193d;

/* JADX INFO: renamed from: za2.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lza2/r;", "", "<init>", "()V", "Lza2/f$c;", "domainState", "", "Lza2/l;", "a", "(Lza2/f$c;)Ljava/util/List;", "Lza2/f;", "Lza2/q;", "b", "(Lza2/f;)Lza2/q;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40242r {
    /* JADX INFO: renamed from: a */
    private final List<C40236l> m129243a(AbstractC40230f.c domainState) {
        List<SettingsBannerDtoV2> listM129182c = domainState.m129182c();
        ArrayList<SettingsBannerDtoV2> arrayList = new ArrayList();
        for (Object obj : listM129182c) {
            if (!AbstractC22676k.m65745e(((SettingsBannerDtoV2) obj).getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (SettingsBannerDtoV2 settingsBannerDtoV2 : arrayList) {
            String category = settingsBannerDtoV2.getCategory();
            String trackingValue = settingsBannerDtoV2.getTrackingValue();
            AbstractC22403o.c cVar = new AbstractC22403o.c(settingsBannerDtoV2.getBackgroundImageUrlV2(), 0, 0, 0, 14, null);
            AbstractC40237m bVar = (AbstractC22676k.m65745e(settingsBannerDtoV2.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9300e4.f27577w) || AbstractC22676k.m65745e(settingsBannerDtoV2.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9448x0.f28033w)) ? new AbstractC40237m.b(settingsBannerDtoV2.getDestination()) : new AbstractC40237m.a(settingsBannerDtoV2.getDestination());
            TextResource.C8691e c8691e = new TextResource.C8691e(settingsBannerDtoV2.getCtaText());
            TextResource.C8691e c8691e2 = new TextResource.C8691e(settingsBannerDtoV2.getDescription());
            TextResource.C8691e c8691e3 = new TextResource.C8691e(settingsBannerDtoV2.getTitle());
            String tag = settingsBannerDtoV2.getTag();
            arrayList2.add(new C40236l(category, trackingValue, cVar, bVar, c8691e, c8691e2, c8691e3, tag != null ? AbstractC8693b.m21278l(tag) : null));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public final C40241q m129244b(AbstractC40230f domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.equals(AbstractC40230f.b.f173883a)) {
            return new C40241q(true, false, null, null, null, null, 62, null);
        }
        if (domainState instanceof AbstractC40230f.a) {
            return new C40241q(false, true, null, null, null, null, 61, null);
        }
        if (!(domainState instanceof AbstractC40230f.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC40230f.c cVar = (AbstractC40230f.c) domainState;
        if (cVar.m129182c().isEmpty()) {
            return cVar.getUpsellCard() != null ? new C40241q(false, false, null, null, AbstractC40243s.m129245a(cVar.getUpsellCard()), cVar.getPresentedModal(), 14, null) : new C40241q(false, true, null, null, null, null, 61, null);
        }
        List<C40236l> listM129243a = m129243a(cVar);
        InterfaceC38193d interfaceC38193dM113935a = AbstractC35881d.m113935a(cVar.getSwitchPlanModalResult());
        UpsellCardFeaturesModel upsellCard = cVar.getUpsellCard();
        return new C40241q(false, false, listM129243a, interfaceC38193dM113935a, upsellCard != null ? AbstractC40243s.m129245a(upsellCard) : null, cVar.getPresentedModal(), 2, null);
    }
}
