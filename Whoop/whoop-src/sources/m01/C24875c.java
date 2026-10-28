package m01;

import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.navigation.C9598e;
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import jb1.C21536b;
import l80.AbstractC23438o;
import m12.AbstractC24936d;
import m31.AbstractC24999e;
import m50.AbstractC25077c;
import m71.AbstractC25199b;
import m80.AbstractC25219a;
import m80.AbstractC25222d;
import m80.AbstractC25224f;
import m81.AbstractC25230e;
import m90.AbstractC25285b;
import mb1.AbstractC25382a;
import mc1.AbstractC25416a;
import mc1.AbstractC25421f;
import mc2.AbstractC25433l;
import mf0.AbstractC25502a;
import mf0.AbstractC25506e;
import mf2.AbstractC25511b;
import mf2.AbstractC25515f;
import mk1.AbstractC25631c;
import mm1.AbstractC25688b;
import mm1.AbstractC25691e;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0240p2;
import p208i2.InterfaceC17886g0;
import p209i3.InterfaceC18044z;
import p316m1.C24895c0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.AbstractC24949d;
import p745y81.C39336i;
import qt0.C30586b;

/* JADX INFO: renamed from: m01.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C24875c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97452w;

    public /* synthetic */ C24875c(int i13) {
        this.f97452w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97452w) {
            case 0:
                return AbstractC24876d.m72940q(obj);
            case 1:
                InterfaceC0240p2 interfaceC0240p2 = (InterfaceC0240p2) obj;
                AbstractC22676k.m65748h(interfaceC0240p2, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                C24895c0 c24895c0 = (C24895c0) interfaceC0240p2;
                c24895c0.f97521P = false;
                AbstractC0201g.m510j(c24895c0);
                return Boolean.FALSE;
            case 2:
                return AbstractC24936d.m73039A(((Boolean) obj).booleanValue());
            case 3:
                return AbstractC24936d.m73046H(((Boolean) obj).booleanValue());
            case 4:
                return AbstractC24949d.m73133v((C30586b) obj);
            case 5:
                return AbstractC24949d.m73126o((C30586b) obj);
            case 6:
                return AbstractC24999e.m73334d(obj);
            case 7:
                return AbstractC25077c.m73549g(obj);
            case 8:
                return AbstractC25199b.m73784g(obj);
            case 9:
                return AbstractC25199b.m73786i((Modifier) obj);
            case 10:
                return AbstractC25219a.m73852h((InterfaceC21413a) obj);
            case 11:
                return AbstractC25219a.m73853i((AbstractC23438o) obj);
            case 12:
                return AbstractC25219a.m73854j((InterfaceC17002b) obj);
            case 13:
                return AbstractC25222d.m73889n(obj);
            case 14:
                return AbstractC25222d.m73897v((InterfaceC18044z) obj);
            case 15:
                return AbstractC25224f.m73924l((InterfaceC21413a) obj);
            case 16:
                return AbstractC25224f.m73925m((AbstractC23438o) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25224f.m73932t((InterfaceC17002b) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC25230e.m73962r((InterfaceC17886g0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC25285b.m74201m(obj);
            case 20:
                return AbstractC25382a.m74435l((C21536b) obj);
            case 21:
                return AbstractC25416a.m74606c((C39336i) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC25421f.m74627g((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25433l.m74662n((C9598e) obj);
            case 24:
                return AbstractC25506e.m74912C((AbstractC25502a) obj);
            case 25:
                return AbstractC25511b.m75009l(obj);
            case 26:
                return AbstractC25515f.m75054h0(((Boolean) obj).booleanValue());
            case 27:
                return AbstractC25631c.m75413i((C9598e) obj);
            case 28:
                return AbstractC25688b.m75643g(obj);
            default:
                return AbstractC25691e.m75661f(obj);
        }
    }
}
