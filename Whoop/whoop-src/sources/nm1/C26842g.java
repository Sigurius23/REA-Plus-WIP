package nm1;

import ad3.C0764g;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import com.whoop.bot.models.conversation.BedtimeRecommendationTileModel;
import com.whoop.design.models.items.HorizontalScrollContainerModel;
import com.whoop.design.models.items.behaviordetails.BehaviorDetailsTileModel;
import com.whoop.design.models.items.behaviordetails.ImpactCalloutModel;
import com.whoop.design.models.items.behaviordetails.ImpactMagnitudeQuestionsModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileButtonModel;
import com.whoop.design.models.items.recommendationtile.RecommendationTileModel;
import com.whoop.p057ai.chat.models.ChatAttachmentCarouselModel;
import j02.InterfaceC21134c;
import java.io.File;
import l83.C23454a0;
import ny0.AbstractC27282u;
import ny0.C27246d;
import ny0.EnumC27272p;
import ny1.C27298e;
import o02.C27350a;
import o02.C27352c;
import od1.C27858u;
import ou0.C28373d;
import ou0.C28375f;
import p31.AbstractC28793d;
import p31.AbstractC28795f;
import p31.AbstractC28799j;
import p31.AbstractC28803n;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p745y81.C39336i;
import pb1.AbstractC29055b;
import pb1.AbstractC29056c;
import pb1.AbstractC29057d;
import pc1.AbstractC29067a;
import pc1.AbstractC29069c;
import pf.InterfaceC29129g;
import pl0.AbstractC29345c;

/* JADX INFO: renamed from: nm1.g */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C26842g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107115w;

    public /* synthetic */ C26842g(int i13) {
        this.f107115w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f107115w) {
            case 0:
                return AbstractC26843h.m80110j((Modifier) obj);
            case 1:
                return C27246d.m82104f((Modifier) obj);
            case 2:
                return C27246d.m82105g((Modifier) obj);
            case 3:
                return EnumC27272p._init_$lambda$0((C39336i) obj);
            case 4:
                return AbstractC27282u.m82297m(((Float) obj).floatValue());
            case 5:
                return Boolean.valueOf(C27298e.Companion.m82364d((File) obj));
            case 6:
                return C27350a.m82524d((C0764g) obj);
            case 7:
                return C27352c.m82529d((InterfaceC21134c) obj);
            case 8:
                return C27858u.m84052o((C27858u.a) obj);
            case 9:
                return C27858u.m84050l((C27858u.a) obj);
            case 10:
                return C28373d.m86052n((InterfaceC33687a) obj);
            case 11:
                return C28375f.m86069n((InterfaceC33687a) obj);
            case 12:
                return AbstractC28795f.m87578z(((Boolean) obj).booleanValue());
            case 13:
                return AbstractC28795f.m87545A((AbstractC28793d) obj);
            case 14:
                return AbstractC28803n.m87622q((AbstractC28799j) obj);
            case 15:
                return AbstractC28803n.m87628w(obj);
            case 16:
                return AbstractC29055b.m88316c((C23749z0) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC29055b.m88317d((BehaviorDetailsTileModel) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC29056c.m88324d((C23749z0) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC29056c.m88325e((ImpactCalloutModel) obj);
            case 20:
                return AbstractC29057d.m88331d((C23749z0) obj);
            case 21:
                return AbstractC29057d.m88332e((ImpactMagnitudeQuestionsModel) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC29067a.m88353d((C23749z0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC29067a.m88354e((RecommendationTileButtonModel) obj);
            case 24:
                return AbstractC29069c.m88370f((C23749z0) obj);
            case 25:
                return AbstractC29069c.m88371g((RecommendationTileModel) obj);
            case 26:
                AbstractC22676k.m65750j((InterfaceC29129g) obj, "<this>");
                return C23454a0.f92919a;
            case 27:
                return AbstractC29345c.m89354L((BedtimeRecommendationTileModel) obj);
            case 28:
                return AbstractC29345c.m89344B((HorizontalScrollContainerModel) obj);
            default:
                return AbstractC29345c.m89345C((ChatAttachmentCarouselModel) obj);
        }
    }
}
