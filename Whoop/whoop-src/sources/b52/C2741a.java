package b52;

import androidx.health.platform.client.proto.C1533u;
import bf1.C3200a;
import bh1.C3251c;
import bh2.C3253b;
import c93.InterfaceC4351m;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import uf3.C34911a;
import xf3.C38266c;

/* JADX INFO: renamed from: b52.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2741a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10776w;

    public /* synthetic */ C2741a(int i13) {
        this.f10776w = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10776w) {
            case 0:
                return C2742b.m7729F((C38266c) obj, (C34911a) obj2);
            case 1:
                return C2742b.m7730G((C38266c) obj, (C34911a) obj2);
            case 2:
                return C2742b.m7731H((C38266c) obj, (C34911a) obj2);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 4:
                return ((InterfaceC30063j) obj).plus((InterfaceC30061h) obj2);
            case 5:
                return ((InterfaceC30063j) obj).plus((InterfaceC30061h) obj2);
            case 6:
                return C3200a.m9243i((C38266c) obj, (C34911a) obj2);
            case 7:
                return C3200a.m9244j((C38266c) obj, (C34911a) obj2);
            case 8:
                return C3200a.m9245k((C38266c) obj, (C34911a) obj2);
            case 9:
                return C3200a.m9247m((C38266c) obj, (C34911a) obj2);
            case 10:
                return C3200a.m9248n((C38266c) obj, (C34911a) obj2);
            case 11:
                return C3200a.m9249o((C38266c) obj, (C34911a) obj2);
            case 12:
                return C3251c.m9449u((C38266c) obj, (C34911a) obj2);
            case 13:
                return C3251c.m9423H((C38266c) obj, (C34911a) obj2);
            case 14:
                return C3251c.m9426K((C38266c) obj, (C34911a) obj2);
            case 15:
                return C3251c.m9427L((C38266c) obj, (C34911a) obj2);
            case 16:
                return C3251c.m9453y((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C3251c.m9454z((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C3251c.m9416A((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C3251c.m9450v((C38266c) obj, (C34911a) obj2);
            case 20:
                return C3251c.m9417B((C38266c) obj, (C34911a) obj2);
            case 21:
                return C3251c.m9418C((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C3251c.m9420E((C38266c) obj, (C34911a) obj2);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return C3251c.m9421F((C38266c) obj, (C34911a) obj2);
            case 24:
                return C3251c.m9422G((C38266c) obj, (C34911a) obj2);
            case 25:
                return C3253b.m9464j((C38266c) obj, (C34911a) obj2);
            case 26:
                return C3253b.m9465k((C38266c) obj, (C34911a) obj2);
            case 27:
                return C3253b.m9466l((C38266c) obj, (C34911a) obj2);
            case 28:
                return C3253b.m9467m((C38266c) obj, (C34911a) obj2);
            default:
                return C3253b.m9468n((C38266c) obj, (C34911a) obj2);
        }
    }
}
