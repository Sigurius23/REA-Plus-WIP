package yz1;

import ad3.C0764g;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.nativestore.pdp.domain.model.WhoopYourWayPriceBreakdownAccordionModel;
import jb1.C21536b;
import l83.C23454a0;
import m83.C25271y;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import p745y81.C39336i;
import r72.AbstractC31054a;
import v72.AbstractC35771b;
import v72.AbstractC35773d;
import w72.InterfaceC36912e;
import x22.InterfaceC37862a;
import x50.InterfaceC37986a;
import z22.AbstractC40025d;
import z22.AbstractC40028g;
import z22.AbstractC40029h;
import z22.AbstractC40030i;
import z50.AbstractC40087c;
import z50.AbstractC40088d;
import z50.AbstractC40089e;
import z51.AbstractC40097h;
import z51.AbstractC40104o;
import z70.AbstractC40141b;
import z71.AbstractC40142a;
import z71.AbstractC40153l;
import z72.AbstractC40155a;
import z72.AbstractC40161g;

/* JADX INFO: renamed from: yz1.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39913g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172315w;

    public /* synthetic */ C39913g(int i13) {
        this.f172315w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f172315w) {
            case 0:
                return AbstractC39914h.m128077h((C23749z0) obj);
            case 1:
                return AbstractC39914h.m128078i((WhoopYourWayPriceBreakdownAccordionModel) obj);
            case 2:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                Json.f2775b = false;
                return C23454a0.f92919a;
            case 3:
                C0764g Json2 = (C0764g) obj;
                AbstractC22676k.m65750j(Json2, "$this$Json");
                Json2.f2776c = true;
                Json2.f2775b = false;
                return C23454a0.f92919a;
            case 4:
                return AbstractC40025d.m128307m((InterfaceC37862a) obj);
            case 5:
                return AbstractC40028g.m128319g((InterfaceC37862a) obj);
            case 6:
                return AbstractC40029h.m128335l((InterfaceC37862a) obj);
            case 7:
                return AbstractC40029h.m128343t(obj);
            case 8:
                return AbstractC40029h.m128344u((C25308q) obj);
            case 9:
                return AbstractC40030i.m128357l((InterfaceC37862a) obj);
            case 10:
                Context it = (Context) obj;
                AbstractC22676k.m65750j(it, "it");
                return C25271y.f99162w;
            case 11:
                return AbstractC40087c.m128474f((InterfaceC37986a) obj);
            case 12:
                return AbstractC40088d.m128505x(obj);
            case 13:
                return AbstractC40088d.m128500s((InterfaceC37986a) obj);
            case 14:
                return AbstractC40089e.m128517j((InterfaceC37986a) obj);
            case 15:
                return AbstractC40097h.m128551A((InterfaceC22131e) obj);
            case 16:
                return AbstractC40104o.m128647l(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40104o.m128643h(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40141b.m128715c((C21536b) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40142a.m128722g((C39336i) obj);
            case 20:
                return AbstractC40142a.m128720e((C39336i) obj);
            case 21:
                return AbstractC40153l.m128737B(((Float) obj).floatValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40155a.m128783l((AbstractC35771b) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC40155a.m128779h((AbstractC35771b) obj);
            case 24:
                return AbstractC40161g.m128836l0((AbstractC31054a) obj);
            case 25:
                return AbstractC40161g.m128803Q((InterfaceC36912e) obj);
            case 26:
                return AbstractC40161g.m128804R((AbstractC35773d) obj);
            case 27:
                return AbstractC40161g.m128806T((Modifier) obj);
            case 28:
                return AbstractC40161g.m128838m0((AbstractC35773d) obj);
            default:
                return AbstractC40161g.m128808V((Modifier) obj);
        }
    }
}
