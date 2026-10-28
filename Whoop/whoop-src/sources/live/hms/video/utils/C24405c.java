package live.hms.video.utils;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import com.whoop.payments.domain.models.Card;
import e41.C12704i;
import java.io.File;
import lk2.C24497d;
import ln1.AbstractC24533k;
import ln1.C24523a;
import lw1.AbstractC24769e;
import lw1.C24765a;
import p719m22.C24946a;
import q22.EnumC29858h;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: live.hms.video.utils.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24405c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95271w;

    public /* synthetic */ C24405c(int i13) {
        this.f95271w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f95271w) {
            case 0:
                return Integer.valueOf(LogUtils.checkDirSizeAndRemove$lambda$5$lambda$2((File) obj, (File) obj2));
            case 1:
                return C24497d.m71336z((C38266c) obj, (C34911a) obj2);
            case 2:
                return C24497d.m71299L((C38266c) obj, (C34911a) obj2);
            case 3:
                return C24497d.m71288A((C38266c) obj, (C34911a) obj2);
            case 4:
                return C24497d.m71301N((C38266c) obj, (C34911a) obj2);
            case 5:
                return C24497d.m71302O((C38266c) obj, (C34911a) obj2);
            case 6:
                return C24497d.m71303P((C38266c) obj, (C34911a) obj2);
            case 7:
                return C24497d.m71300M((C38266c) obj, (C34911a) obj2);
            case 8:
                return C24497d.m71304Q((C38266c) obj, (C34911a) obj2);
            case 9:
                return C24497d.m71305R((C38266c) obj, (C34911a) obj2);
            case 10:
                return C24497d.m71306S((C38266c) obj, (C34911a) obj2);
            case 11:
                return C24497d.m71307T((C38266c) obj, (C34911a) obj2);
            case 12:
                return C24497d.m71289B((C38266c) obj, (C34911a) obj2);
            case 13:
                return C24497d.m71308U((C38266c) obj, (C34911a) obj2);
            case 14:
                return C24497d.m71309V((C38266c) obj, (C34911a) obj2);
            case 15:
                return C24497d.m71310W((C38266c) obj, (C34911a) obj2);
            case 16:
                return C24497d.m71290C((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C24497d.m71291D((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C24497d.m71292E((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C24497d.m71293F((C38266c) obj, (C34911a) obj2);
            case 20:
                return C24497d.m71294G((C38266c) obj, (C34911a) obj2);
            case 21:
                return C24497d.m71296I((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C24497d.m71297J((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C24497d.m71298K((C38266c) obj, (C34911a) obj2);
            case 24:
                return C24523a.m71429c((Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC24533k.m71464r(((Integer) obj).intValue(), (C12704i) obj2);
            case 26:
                return C24765a.m72515c((Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return AbstractC24769e.m72543i(((Boolean) obj).booleanValue(), (Card) obj2);
            case 28:
                return AbstractC24769e.m72549o((EnumC29858h) obj, ((Boolean) obj2).booleanValue());
            default:
                return C24946a.m73107c((Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
