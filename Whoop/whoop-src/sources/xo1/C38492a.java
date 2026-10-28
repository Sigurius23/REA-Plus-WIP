package xo1;

import ad3.C0775r;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.model.MobileFallbackWebviewParams;
import com.whoop.communityeverydaystats.domain.models.CommunitySnapshotContainerModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotExerciseTileModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotHeaderModel;
import com.whoop.communityeverydaystats.domain.models.SnapshotMetricCardModel;
import com.whoop.design.models.items.aiactiontile.AiActionTileModel;
import com.whoop.design.models.items.ratingpicker.RatingPickerModel;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxConfirmDialog;
import com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxMeasurementModel;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.ViewReactionsViewStyle;
import java.io.IOException;
import java.util.HashMap;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import w40.AbstractC36799b;
import xc3.AbstractC38195a;
import xp2.C38533b;
import xq2.AbstractC38559e0;
import xw1.AbstractC38682f;
import y21.AbstractC39162i;
import y31.AbstractC39195d;
import y40.C39204a;
import y71.AbstractC39281n;
import yb0.AbstractC39384g;
import yb0.AbstractC39388k;
import yc2.AbstractC39436c;

/* JADX INFO: renamed from: xo1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C38492a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f164937w;

    public /* synthetic */ C38492a(int i13) {
        this.f164937w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f164937w) {
            case 0:
                return AbstractC38493b.m123356s();
            case 1:
                return AbstractC38493b.m123359v();
            case 2:
                return C38533b.m123436e();
            case 3:
                return CommunitySnapshotContainerModel._childSerializers$_anonymous_();
            case 4:
                return CommunitySnapshotContainerModel._childSerializers$_anonymous_$0();
            case 5:
                return CommunitySnapshotContainerModel._childSerializers$_anonymous_$1();
            case 6:
                return CommunitySnapshotContainerModel._childSerializers$_anonymous_$2();
            case 7:
                return SnapshotExerciseTileModel._childSerializers$_anonymous_();
            case 8:
                return SnapshotHeaderModel._childSerializers$_anonymous_();
            case 9:
                return SnapshotMetricCardModel._childSerializers$_anonymous_();
            case 10:
                return SnapshotMetricCardModel._childSerializers$_anonymous_$0();
            case 11:
                return AbstractC38559e0.m123624c();
            case 12:
                return AbstractC38559e0.m123625d();
            case 13:
                return OneRepMaxConfirmDialog._childSerializers$_anonymous_();
            case 14:
                return OneRepMaxMeasurementModel._childSerializers$_anonymous_();
            case 15:
                return AbstractC38682f.m124081f();
            case 16:
                return MobileFallbackWebviewParams.WebviewRequirementType._init_$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Float.valueOf(ViewReactionsViewStyle.DEFAULT_BUBBLE_BORDER_WIDTH_MINE_delegate$lambda$0());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC39162i.m124726q();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC39195d.m124861p();
            case 20:
                try {
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    LinkedHashMapSerializer linkedHashMapSerializerM122335c = AbstractC38195a.m122335c(stringSerializer, stringSerializer);
                    HashMap mapM124888b = C39204a.m124888b();
                    C0775r c0775r = AbstractC36799b.f157426a;
                    return AbstractC36799b.f157426a.m1833d(linkedHashMapSerializerM122335c, mapM124888b);
                } catch (IOException unused) {
                    Log.d("JSDI", "Cannot build sysDebug");
                    return "{}";
                }
            case 21:
                return AbstractC39281n.m125208d();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AiActionTileModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AiActionTileModel._childSerializers$_anonymous_$0();
            case 24:
                return AiActionTileModel._childSerializers$_anonymous_$1();
            case 25:
                return RatingPickerModel._childSerializers$_anonymous_();
            case 26:
                return AbstractC39384g.m125609M();
            case 27:
                return AbstractC39384g.m125610N();
            case 28:
                return AbstractC39388k.m125690Y();
            default:
                return AbstractC39436c.m125988v();
        }
    }
}
