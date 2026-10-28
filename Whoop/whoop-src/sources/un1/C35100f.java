package un1;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import com.whoop.design.models.items.ActivityModel;
import com.whoop.design.models.items.AiChatEntryModel;
import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.ItemsCardHeaderModel;
import com.whoop.design.models.items.ItemsCardModel;
import com.whoop.design.models.items.KeyStatisticModel;
import com.whoop.design.models.items.LogoNavModel;
import com.whoop.design.models.items.MiniMonitorCardBodyModel;
import com.whoop.design.models.items.MiniMonitorCardModel;
import com.whoop.design.models.items.SleepPlannerAlarmCardModel;
import com.whoop.design.models.items.SplitContainerCardModel;
import java.io.File;
import java.lang.reflect.Method;
import p549vb.C35858c;
import p741vn1.C36199c;
import v41.AbstractC35684p;

/* JADX INFO: renamed from: un1.f */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C35100f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f148951w;

    public /* synthetic */ C35100f(int i13) {
        this.f148951w = i13;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l83.h] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        Class<?> returnType;
        boolean z4 = true;
        switch (this.f148951w) {
            case 0:
                return AbstractC35101g.m111022E();
            case 1:
                return AbstractC35684p.m113052m();
            case 2:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 3:
                try {
                    Method method = (Method) C35858c.f152667z.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 4:
                try {
                    Class.forName("android.os.Build");
                    break;
                } catch (ClassNotFoundException unused3) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 5:
                return File.separator;
            case 6:
                return C36199c.m115197f();
            case 7:
                return SmartAlarmGoalType._init_$_anonymous_();
            case 8:
                return ActivityModel._childSerializers$_anonymous_();
            case 9:
                return AiChatEntryModel._childSerializers$_anonymous_();
            case 10:
                return CardButtonModel._childSerializers$_anonymous_();
            case 11:
                return CardButtonModel._childSerializers$_anonymous_$0();
            case 12:
                return CardButtonModel._childSerializers$_anonymous_$1();
            case 13:
                return CardButtonModel._childSerializers$_anonymous_$2();
            case 14:
                return HeaderModel._childSerializers$_anonymous_();
            case 15:
                return HeaderModel._childSerializers$_anonymous_$0();
            case 16:
                return ItemsCardHeaderModel._childSerializers$_anonymous_();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ItemsCardHeaderModel._childSerializers$_anonymous_$0();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ItemsCardModel._childSerializers$_anonymous_();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ItemsCardModel._childSerializers$_anonymous_$0();
            case 20:
                return ItemsCardModel._childSerializers$_anonymous_$1();
            case 21:
                return KeyStatisticModel._childSerializers$_anonymous_();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return LogoNavModel._childSerializers$_anonymous_();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MiniMonitorCardBodyModel._childSerializers$_anonymous_();
            case 24:
                return MiniMonitorCardModel._childSerializers$_anonymous_();
            case 25:
                return SleepPlannerAlarmCardModel._childSerializers$_anonymous_();
            case 26:
                return SleepPlannerAlarmCardModel._childSerializers$_anonymous_$0();
            case 27:
                return SleepPlannerAlarmCardModel._childSerializers$_anonymous_$1();
            case 28:
                return SplitContainerCardModel._childSerializers$_anonymous_();
            default:
                return SplitContainerCardModel._childSerializers$_anonymous_$0();
        }
    }
}
