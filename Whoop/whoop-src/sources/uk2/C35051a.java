package uk2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.cache.persistence.C6101a;
import com.whoop.hormonalinsights.fertility.FertilitySettingsToggleModel;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.DateSelectedTileModel;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsMenuItemModel;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsPrivacy;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsToggle;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsUpsell;
import com.whoop.trackactivity.domain.models.TrackSessionMiniArchModel;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.util.ArrayList;
import java.util.List;
import jb1.C21536b;
import mh.C25540h;
import p134f2.C14015d;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;
import p720m91.C25308q;
import ul0.AbstractC35061c;
import up1.AbstractC35153c;
import us1.C35219b;
import us2.AbstractC35222c;
import uu2.AbstractC35267r;
import uu2.AbstractC35272w;
import uv2.C35287d;
import uw0.AbstractC35296f;
import uw0.AbstractC35302l;
import uw1.AbstractC35312e;
import uz1.AbstractC35427e;
import uz1.AbstractC35439q;
import uz1.AbstractC35442t;
import v01.AbstractC35501c;
import v01.AbstractC35510l;

/* JADX INFO: renamed from: uk2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C35051a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148539w;

    public /* synthetic */ C35051a(int i13) {
        this.f148539w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f148539w) {
            case 0:
                return AbstractC35052b.m110799i((TrackSessionMiniArchModel) obj);
            case 1:
                return AbstractC35061c.m110850n((InterfaceC22129c) obj);
            case 2:
                return AbstractC35061c.m110849m((C14015d) obj);
            case 3:
                return Integer.valueOf(C6101a.m18303A("SELECT COALESCE(SUM(LENGTH(data)), 0) FROM cache_entries", (InterfaceC33687a) obj));
            case 4:
                return Integer.valueOf(C6101a.m18309G("SELECT COUNT(*) FROM cache_entries", (InterfaceC33687a) obj));
            case 5:
                return AbstractC35153c.m111213j((C21536b) obj);
            case 6:
                return AbstractC35153c.m111214k((C23749z0) obj);
            case 7:
                return AbstractC35153c.m111215l((HormonalInsightsToggle) obj);
            case 8:
                return AbstractC35153c.m111216m((HormonalInsightsMenuItemModel) obj);
            case 9:
                return AbstractC35153c.m111217n((HormonalInsightsUpsell) obj);
            case 10:
                return AbstractC35153c.m111218o((HormonalInsightsPrivacy) obj);
            case 11:
                return AbstractC35153c.m111219p((FertilitySettingsToggleModel) obj);
            case 12:
                return AbstractC35153c.m111220q((DateSelectedTileModel) obj);
            case 13:
                return C35219b.m111578q((InterfaceC33687a) obj);
            case 14:
                return AbstractC35222c.m111593b((C25308q) obj);
            case 15:
                return AbstractC35267r.m111854c((C21536b) obj);
            case 16:
                return AbstractC35272w.m111901e0((C25308q) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C35287d.m111968c((C21536b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC35296f.m111997t((InterfaceC17886g0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35302l.m112031p(((Boolean) obj).booleanValue());
            case 20:
                return AbstractC35312e.m112149b((C25308q) obj);
            case 21:
                return AbstractC35427e.m112412c((C25308q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC35439q.m112501f((C25540h) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC35442t.m112518f((C25540h) obj);
            case 24:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(MimeType.MIME_TYPE_TXT), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i13);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 25:
                return AbstractC35501c.m112568C((String) obj);
            case 26:
                return AbstractC35501c.m112569D((String) obj);
            case 27:
                return AbstractC35501c.m112570E(obj);
            case 28:
                return AbstractC35501c.m112596r(obj);
            default:
                return AbstractC35510l.m112625A(obj);
        }
    }
}
