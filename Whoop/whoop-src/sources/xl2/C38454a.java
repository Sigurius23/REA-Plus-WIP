package xl2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import java.util.Map;
import p002a0.C0057v0;
import p634y1.C39031d;
import p634y1.InterfaceC39033f;
import uf3.C34911a;
import xf3.C38266c;
import xv1.C38669a;
import yf2.C39521b;

/* JADX INFO: renamed from: xl2.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C38454a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f164654w;

    public /* synthetic */ C38454a(int i13) {
        this.f164654w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[LOOP:0: B:21:0x0073->B:34:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bd A[SYNTHETIC] */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f164654w) {
            case 0:
                return C38455b.m123233r((C38266c) obj, (C34911a) obj2);
            case 1:
                return C38455b.m123210B((C38266c) obj, (C34911a) obj2);
            case 2:
                return C38455b.m123211C((C38266c) obj, (C34911a) obj2);
            case 3:
                return C38455b.m123212D((C38266c) obj, (C34911a) obj2);
            case 4:
                return C38455b.m123213E((C38266c) obj, (C34911a) obj2);
            case 5:
                return C38455b.m123214F((C38266c) obj, (C34911a) obj2);
            case 6:
                return C38455b.m123215G((C38266c) obj, (C34911a) obj2);
            case 7:
                return C38455b.m123235t((C38266c) obj, (C34911a) obj2);
            case 8:
                return C38455b.m123236u((C38266c) obj, (C34911a) obj2);
            case 9:
                return C38455b.m123237v((C38266c) obj, (C34911a) obj2);
            case 10:
                return C38455b.m123238w((C38266c) obj, (C34911a) obj2);
            case 11:
                return C38455b.m123239x((C38266c) obj, (C34911a) obj2);
            case 12:
                return C38455b.m123240y((C38266c) obj, (C34911a) obj2);
            case 13:
                return C38455b.m123234s((C38266c) obj, (C34911a) obj2);
            case 14:
                return C38455b.m123241z((C38266c) obj, (C34911a) obj2);
            case 15:
                return C38455b.m123209A((C38266c) obj, (C34911a) obj2);
            case 16:
                return C38669a.m124011i((C38266c) obj, (C34911a) obj2);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C38669a.m124012j((C38266c) obj, (C34911a) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C38669a.m124013k((C38266c) obj, (C34911a) obj2);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C38669a.m124014l((C38266c) obj, (C34911a) obj2);
            case 20:
                return C38669a.m124015m((C38266c) obj, (C34911a) obj2);
            case 21:
                return C38669a.m124017o((C38266c) obj, (C34911a) obj2);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C39031d c39031d = (C39031d) obj2;
                Map map = c39031d.f167997w;
                C0057v0 c0057v0 = c39031d.f167998x;
                Object[] objArr = c0057v0.f171b;
                Object[] objArr2 = c0057v0.f172c;
                long[] jArr = c0057v0.f170a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j7 = jArr[i13];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j7) < 128) {
                                    int i16 = (i13 << 3) + i15;
                                    Object obj3 = objArr[i16];
                                    Map mapMo7447e = ((InterfaceC39033f) objArr2[i16]).mo7447e();
                                    if (mapMo7447e.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapMo7447e);
                                    }
                                }
                                j7 >>= 8;
                            }
                            if (i14 == 8) {
                                if (i13 != length) {
                                    i13++;
                                }
                            }
                        } else if (i13 != length) {
                            i13++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return obj2;
            case 24:
                return C39521b.m126240j((C38266c) obj, (C34911a) obj2);
            case 25:
                return C39521b.m126241k((C38266c) obj, (C34911a) obj2);
            case 26:
                return C39521b.m126242l((C38266c) obj, (C34911a) obj2);
            case 27:
                return C39521b.m126243m((C38266c) obj, (C34911a) obj2);
            case 28:
                return C39521b.m126245o((C38266c) obj, (C34911a) obj2);
            default:
                return C39521b.m126246p((C38266c) obj, (C34911a) obj2);
        }
    }
}
