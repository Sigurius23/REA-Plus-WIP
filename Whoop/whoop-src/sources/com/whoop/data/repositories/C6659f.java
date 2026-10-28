package com.whoop.data.repositories;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import dc1.AbstractC11907d;
import e93.AbstractC12889b;
import l83.C23454a0;
import p077d0.AbstractC11343d2;
import p077d0.C11350f1;
import p077d0.C11380n;
import p077d0.C11384o;
import p077d0.C11392q;
import p077d0.C11417y0;
import p181h2.C16617b;
import p181h2.C16618c;
import p181h2.C16620e;
import p636y3.C39174f;
import p636y3.C39175g;
import p636y3.C39178j;
import p636y3.C39180l;
import p668z1.C39973v;
import p715kotlin.jvm.functions.Function1;
import p745y81.C39336i;
import td1.EnumC33707e;

/* JADX INFO: renamed from: com.whoop.data.repositories.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6659f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25451w;

    public /* synthetic */ C6659f(int i13) {
        this.f25451w = i13;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l83.h] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25451w) {
            case 0:
                return UserStrapsRepository.observeUserAndStrapUpdates$lambda$4((EnumC33707e) obj);
            case 1:
                C11350f1 c11350f1 = (C11350f1) obj;
                long j7 = c11350f1.f36382G;
                ((C39973v) AbstractC11343d2.f36340b.getValue()).m128204d(c11350f1.f36383H, AbstractC11343d2.f36339a, c11350f1);
                long j13 = c11350f1.f36382G;
                if (j7 != j13) {
                    C11417y0 c11417y0 = c11350f1.f36390O;
                    if (c11417y0 != null) {
                        long jM30650e = c11417y0.m30650e();
                        long j14 = c11350f1.f36382G;
                        if (jM30650e > j14) {
                            c11350f1.m30583M0();
                        } else {
                            c11417y0.m30656k(j14);
                            if (c11417y0.m30646a() == null) {
                                c11417y0.m30654i(AbstractC12889b.m36259Y((1.0d - ((double) c11417y0.m30651f().mo30607a(0))) * c11350f1.f36382G));
                            }
                        }
                    } else if (j13 != 0) {
                        c11350f1.m30585P0();
                    }
                }
                return C23454a0.f92919a;
            case 2:
                ((InterfaceC4339a) obj).invoke();
                return C23454a0.f92919a;
            case 3:
                return new C11380n(((Float) obj).floatValue());
            case 4:
                return new C11380n(((Integer) obj).intValue());
            case 5:
                return Integer.valueOf((int) ((C11380n) obj).f36483a);
            case 6:
                return new C11380n(((C39174f) obj).f168413w);
            case 7:
                return new C39174f(((C11380n) obj).f36483a);
            case 8:
                C39175g c39175g = (C39175g) obj;
                return new C11384o(Float.intBitsToFloat((int) (c39175g.f168414a >> 32)), Float.intBitsToFloat((int) (c39175g.f168414a & 4294967295L)));
            case 9:
                C11384o c11384o = (C11384o) obj;
                return new C39175g((((long) Float.floatToRawIntBits(c11384o.f36504a)) << 32) | (((long) Float.floatToRawIntBits(c11384o.f36505b)) & 4294967295L));
            case 10:
                C16620e c16620e = (C16620e) obj;
                return new C11384o(Float.intBitsToFloat((int) (c16620e.f63951a >> 32)), Float.intBitsToFloat((int) (c16620e.f63951a & 4294967295L)));
            case 11:
                C11384o c11384o2 = (C11384o) obj;
                return new C16620e((((long) Float.floatToRawIntBits(c11384o2.f36504a)) << 32) | (((long) Float.floatToRawIntBits(c11384o2.f36505b)) & 4294967295L));
            case 12:
                C16617b c16617b = (C16617b) obj;
                return new C11384o(Float.intBitsToFloat((int) (c16617b.f63937a >> 32)), Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L)));
            case 13:
                C11384o c11384o3 = (C11384o) obj;
                return new C16617b((((long) Float.floatToRawIntBits(c11384o3.f36504a)) << 32) | (((long) Float.floatToRawIntBits(c11384o3.f36505b)) & 4294967295L));
            case 14:
                long j15 = ((C39178j) obj).f168416a;
                return new C11384o((int) (j15 >> 32), (int) (j15 & 4294967295L));
            case 15:
                C11384o c11384o4 = (C11384o) obj;
                return new C39178j((((long) Math.round(c11384o4.f36504a)) << 32) | (((long) Math.round(c11384o4.f36505b)) & 4294967295L));
            case 16:
                long j16 = ((C39180l) obj).f168422a;
                return new C11384o((int) (j16 >> 32), (int) (j16 & 4294967295L));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C11384o c11384o5 = (C11384o) obj;
                int iRound = Math.round(c11384o5.f36504a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c11384o5.f36505b);
                return new C39180l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C16618c c16618c = (C16618c) obj;
                return new C11392q(c16618c.f63939a, c16618c.f63940b, c16618c.f63941c, c16618c.f63942d);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C11392q c11392q = (C11392q) obj;
                return new C16618c(c11392q.f36530a, c11392q.f36531b, c11392q.f36532c, c11392q.f36533d);
            case 20:
                return Float.valueOf(((C11380n) obj).f36483a);
            case 21:
                return AbstractC11907d.m32095z((C39336i) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC11907d.m32056K((C39336i) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC11907d.m32046A((C39336i) obj);
            case 24:
                return AbstractC11907d.m32058M((C39336i) obj);
            case 25:
                return AbstractC11907d.m32059N((C39336i) obj);
            case 26:
                return AbstractC11907d.m32060O((C39336i) obj);
            case 27:
                return AbstractC11907d.m32061P((C39336i) obj);
            case 28:
                return AbstractC11907d.m32057L((C39336i) obj);
            default:
                return AbstractC11907d.m32062Q((C39336i) obj);
        }
    }
}
