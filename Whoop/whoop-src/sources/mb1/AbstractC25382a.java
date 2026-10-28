package mb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationButtonModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.activityrecommendation.TargetZonesModel;
import com.whoop.design.models.items.activityrecommendation.ZoneInfoModel;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jb1.AbstractC21537c;
import jb1.C21536b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import m01.C24875c;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p716lb1.C23753z4;
import p716lb1.Function1;
import p720m91.InterfaceC25312u;
import uz0.C35415i;
import uz0.C35418l;
import uz0.C35421o;
import uz0.C35422p;
import uz0.EnumC35408b;
import uz0.EnumC35417k;

/* JADX INFO: renamed from: mb1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "Luz0/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;", "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;", "Luz0/o;", "j", "(Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;)Luz0/o;", "Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;", "Luz0/p;", "k", "(Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;)Luz0/p;", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;", "Luz0/l;", "i", "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Luz0/l;", "", "Luz0/b;", "g", "(Ljava/lang/String;)Luz0/b;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "activityRecommendationTileMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25382a {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f99465a = Function1.m68251a(new C23753z4(26));

    /* JADX INFO: renamed from: mb1.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f99466w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f99466w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f99466w.invoke((ActivityRecommendationTileModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m74427d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ActivityRecommendationTileModel.class), new a(new C23753z4(27)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C35415i m74428e(ActivityRecommendationTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m74431h(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m74429f() {
        return f99465a;
    }

    /* JADX INFO: renamed from: g */
    private static final EnumC35408b m74430g(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int iHashCode = upperCase.hashCode();
        if (iHashCode != -2024701067) {
            if (iHashCode != 75572) {
                if (iHashCode == 2217378 && upperCase.equals("HIGH")) {
                    return EnumC35408b.HIGH;
                }
            } else if (upperCase.equals("LOW")) {
                return EnumC35408b.LOW;
            }
        } else if (upperCase.equals("MEDIUM")) {
            return EnumC35408b.MEDIUM;
        }
        return EnumC35408b.UNKNOWN;
    }

    /* JADX INFO: renamed from: h */
    public static final C35415i m74431h(ActivityRecommendationTileModel activityRecommendationTileModel) {
        AbstractC22676k.m65750j(activityRecommendationTileModel, "<this>");
        String id4 = activityRecommendationTileModel.getId();
        boolean zIsSelected = activityRecommendationTileModel.isSelected();
        String iconUrl = activityRecommendationTileModel.getIconUrl();
        AbstractC22403o cVar = iconUrl != null ? new AbstractC22403o.c(iconUrl, 0, 0, 0, 14, null) : new AbstractC22403o.a(EnumC16313m0.ACTIVITY.toWhoopIcon());
        String activityTitle = activityRecommendationTileModel.getActivityTitle();
        String activityStrain = activityRecommendationTileModel.getActivityStrain();
        String activityDuration = activityRecommendationTileModel.getActivityDuration();
        String activityDurationUnit = activityRecommendationTileModel.getActivityDurationUnit();
        String activityDurationLabel = activityRecommendationTileModel.getActivityDurationLabel();
        TargetZonesModel targetZones = activityRecommendationTileModel.getTargetZones();
        C35421o c35421oM74433j = targetZones != null ? m74433j(targetZones) : null;
        String intensityStyle = activityRecommendationTileModel.getIntensityStyle();
        EnumC35408b enumC35408bM74430g = intensityStyle != null ? m74430g(intensityStyle) : null;
        String intensityTitle = activityRecommendationTileModel.getIntensityTitle();
        String intensitySubtitle = activityRecommendationTileModel.getIntensitySubtitle();
        ActivityRecommendationButtonModel buttonViewState = activityRecommendationTileModel.getButtonViewState();
        C35418l c35418lM74432i = buttonViewState != null ? m74432i(buttonViewState) : null;
        DesignSystemModel content = activityRecommendationTileModel.getContent();
        return new C35415i(id4, zIsSelected, cVar, activityTitle, activityStrain, activityDuration, activityDurationUnit, activityDurationLabel, c35421oM74433j, enumC35408bM74430g, intensityTitle, intensitySubtitle, c35418lM74432i, content != null ? AbstractC21537c.m60554d(new C24875c(20)).m60541h(content) : null);
    }

    /* JADX INFO: renamed from: i */
    private static final C35418l m74432i(ActivityRecommendationButtonModel activityRecommendationButtonModel) {
        return new C35418l(activityRecommendationButtonModel.isSelectedCtaTitle(), activityRecommendationButtonModel.getNotSelectedCtaTitle());
    }

    /* JADX INFO: renamed from: j */
    private static final C35421o m74433j(TargetZonesModel targetZonesModel) {
        Float indicatorPosition = targetZonesModel.getIndicatorPosition();
        float fFloatValue = indicatorPosition != null ? indicatorPosition.floatValue() : 0.0f;
        String targetZoneStyle = targetZonesModel.getTargetZoneStyle();
        String targetZoneTitle = targetZonesModel.getTargetZoneTitle();
        if (targetZoneTitle == null) {
            targetZoneTitle = "";
        }
        List<ZoneInfoModel> targetZones = targetZonesModel.getTargetZones();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(targetZones, 10));
        Iterator<T> it = targetZones.iterator();
        while (it.hasNext()) {
            arrayList.add(m74434k((ZoneInfoModel) it.next()));
        }
        return new C35421o(fFloatValue, targetZoneStyle, targetZoneTitle, arrayList);
    }

    /* JADX INFO: renamed from: k */
    private static final C35422p m74434k(ZoneInfoModel zoneInfoModel) {
        EnumC35417k enumC35417k;
        float size = zoneInfoModel.getSize();
        String style = zoneInfoModel.getStyle();
        EnumC35417k enumC35417k2 = EnumC35417k.STRAIN_ZONE_2;
        EnumC35417k[] enumC35417kArrValues = EnumC35417k.values();
        int length = enumC35417kArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC35417k = null;
                break;
            }
            enumC35417k = enumC35417kArrValues[i13];
            if (AbstractC22676k.m65745e(enumC35417k.name(), style)) {
                break;
            }
            i13++;
        }
        if (enumC35417k != null) {
            enumC35417k2 = enumC35417k;
        }
        return new C35422p(size, enumC35417k2, zoneInfoModel.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m74435l(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }
}
