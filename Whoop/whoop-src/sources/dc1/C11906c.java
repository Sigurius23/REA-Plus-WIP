package dc1;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.proto.C1533u;
import d61.InterfaceC11732a;
import dq1.C12291d;
import e61.AbstractC12765h;
import ec1.AbstractC13009a;
import eg.C13161j;
import eg.C13162k;
import ej0.C13227a;
import em1.C13347u;
import jb1.C21536b;
import l83.C23454a0;
import m83.C25271y;
import p027b3.AbstractC2453v1;
import p132f0.AbstractC13785f1;
import p132f0.AbstractC13804m;
import p132f0.C13782e1;
import p132f0.C13801l;
import p148fg.C14441k;
import p148fg.C14451u;
import p148fg.InterfaceC14444n;
import p209i3.AbstractC18041w;
import p209i3.C18026h;
import p209i3.InterfaceC18044z;
import p390p1.AbstractC28683x;
import p390p1.C28674u2;
import p390p1.InterfaceC28653p1;
import p437qt.C30582e;
import p500tb.InterfaceC33687a;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import sl1.C32702a;

/* JADX INFO: renamed from: dc1.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11906c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38908w;

    public /* synthetic */ C11906c(int i13) {
        this.f38908w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f38908w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC11907d.m32063R((C39336i) obj);
            case 1:
                return AbstractC11907d.m32064S((C39336i) obj);
            case 2:
                return AbstractC11907d.m32047B((C39336i) obj);
            case 3:
                return AbstractC11907d.m32065T((C39336i) obj);
            case 4:
                return AbstractC11907d.m32066U((C39336i) obj);
            case 5:
                return AbstractC11907d.m32067V((C39336i) obj);
            case 6:
                return AbstractC11907d.m32068W((C39336i) obj);
            case 7:
                return AbstractC11907d.m32048C((C39336i) obj);
            case 8:
                return AbstractC11907d.m32049D((C39336i) obj);
            case 9:
                return AbstractC11907d.m32050E((C39336i) obj);
            case 10:
                return AbstractC11907d.m32051F((C39336i) obj);
            case 11:
                return AbstractC11907d.m32052G((C39336i) obj);
            case 12:
                return AbstractC11907d.m32053H((C39336i) obj);
            case 13:
                return AbstractC11907d.m32054I((C39336i) obj);
            case 14:
                return AbstractC11907d.m32055J((C39336i) obj);
            case 15:
                return AbstractC11910g.m32111e((C39336i) obj);
            case 16:
                return AbstractC11910g.m32112f((C39336i) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C12291d.m34216l((InterfaceC33687a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                Context it = (Context) obj;
                AbstractC22676k.m65750j(it, "it");
                return C25271y.f99162w;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC12765h.m35714C((InterfaceC18044z) obj);
            case 20:
                return AbstractC12765h.m35715D((InterfaceC18044z) obj);
            case 21:
                return AbstractC12765h.m35735q((InterfaceC11732a) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13009a.m36542d((C21536b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C14441k DslBuilderProperty = (C14441k) obj;
                AbstractC22676k.m65750j(DslBuilderProperty, "$this$DslBuilderProperty");
                return new C13161j(DslBuilderProperty.f52721a, 8);
            case 24:
                InterfaceC14444n DslBuilderProperty2 = (InterfaceC14444n) obj;
                AbstractC22676k.m65750j(DslBuilderProperty2, "$this$DslBuilderProperty");
                C30582e c30582e = ((C14451u) DslBuilderProperty2).f52743a;
                c30582e.getClass();
                return new C13161j(c30582e, 9);
            case 25:
                return C13227a.m37133h((C13162k) obj);
            case 26:
                return C13347u.m37548q0((C32702a) obj);
            case 27:
                return c23454a0;
            case 28:
                int i14 = AbstractC13804m.f49253a;
                C28674u2 c28674u2 = AndroidCompositionLocals_androidKt.f4976b;
                InterfaceC28653p1 interfaceC28653p1 = (InterfaceC28653p1) obj;
                interfaceC28653p1.getClass();
                Context context = (Context) AbstractC28683x.m87236D(interfaceC28653p1, c28674u2);
                InterfaceC39171c interfaceC39171c = (InterfaceC39171c) AbstractC28683x.m87236D(interfaceC28653p1, AbstractC2453v1.f9569h);
                C13782e1 c13782e1 = (C13782e1) AbstractC28683x.m87236D(interfaceC28653p1, AbstractC13785f1.f49180a);
                if (c13782e1 == null) {
                    return null;
                }
                return new C13801l(context, interfaceC39171c, c13782e1.f49171a, c13782e1.f49172b);
            default:
                AbstractC18041w.m51809h((InterfaceC18044z) obj, C18026h.f69945d);
                return c23454a0;
        }
    }
}
