package com.whoop.data.onboarding;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bh3.InterfaceC3255b;
import com.whoop.WhoopApplication;
import com.whoop.data.repositories.C6654a;
import com.whoop.data.repositories.C6655b;
import com.whoop.data.repositories.C6658e;
import com.whoop.data.repositories.SportsRepository;
import com.whoop.realtime.service.C9907b;
import java.util.List;
import m92.C25326i;
import m92.C25327j;
import od1.C27853p;
import od1.C27858u;
import od1.C27862y;
import p007a6.C0428i;
import p392p3.C28761b0;
import p459rf.C31345p;
import rd1.C31245d;
import rv1.C31842a;
import td1.C33705c;
import td1.C33706d;
import td1.EnumC33707e;
import u92.C34661e;
import u92.C34662f;
import vd1.C35908b;
import vd1.C35910d;
import x82.C38081h;
import x82.C38082i;
import xg3.InterfaceC38290q;
import z82.C40187a;

/* JADX INFO: renamed from: com.whoop.data.onboarding.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6529c implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f25423w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f25424x;

    public /* synthetic */ C6529c(Object obj, int i13) {
        this.f25423w = i13;
        this.f25424x = obj;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f25423w) {
            case 0:
                ((C6528b) this.f25424x).invoke(obj);
                break;
            case 1:
                ((C6528b) this.f25424x).invoke(obj);
                break;
            case 2:
                ((C6654a) this.f25424x).invoke(obj);
                break;
            case 3:
                ((C6654a) this.f25424x).invoke(obj);
                break;
            case 4:
                ((C6655b) this.f25424x).invoke(obj);
                break;
            case 5:
                ((C6655b) this.f25424x).invoke(obj);
                break;
            case 6:
                SportsRepository.getSports$lambda$0((SportsRepository) this.f25424x, (InterfaceC38290q) obj);
                break;
            case 7:
                ((C0428i) this.f25424x).invoke(obj);
                break;
            case 8:
                ((C6658e) this.f25424x).invoke(obj);
                break;
            case 9:
                ((C6658e) this.f25424x).invoke(obj);
                break;
            case 10:
                WhoopApplication.m16944p((C0428i) this.f25424x, obj);
                break;
            case 11:
                C25327j.m74402x((C25326i) this.f25424x, obj);
                break;
            case 12:
                C25327j.m74403y((C25327j) this.f25424x, (Throwable) obj);
                break;
            case 13:
                C25327j.m74395p((C25326i) this.f25424x, obj);
                break;
            case 14:
                ((C27853p) this.f25424x).m83996e((C27858u.a) obj);
                break;
            case 15:
                ((C34661e) this.f25424x).m109547d((List) obj);
                break;
            case 16:
                C27862y.m84099e((C27862y) this.f25424x, (InterfaceC38290q) obj);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((C31245d) this.f25424x).m96221O((EnumC33707e) obj);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C31842a.m98920L((C31345p) this.f25424x, obj);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((C9907b) this.f25424x).m24277q();
                break;
            case 20:
                C9907b.m24259m((Context) this.f25424x);
                break;
            case 21:
                C33706d.m106532e0((C33705c) this.f25424x, obj);
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C33706d.m106527Y((C33705c) this.f25424x, obj);
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C33706d.m106524V((C28761b0) this.f25424x, obj);
                break;
            case 24:
                ((C34662f) this.f25424x).m109551z((C27858u.a) obj);
                break;
            case 25:
                C35910d.m114052J((C35908b) this.f25424x, obj);
                break;
            case 26:
                C38082i.m122012f((C38081h) this.f25424x, obj);
                break;
            case 27:
                C38082i.m122014h((C38081h) this.f25424x, obj);
                break;
            default:
                C40187a.m128950F((C31345p) this.f25424x, obj);
                break;
        }
    }
}
