package tx2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignExtendedDetailsResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ContentBlockResponse;
import com.whoop.whooplabs.data.remote.domain.dto.bff.LegalDocumentResponse;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lz2.AbstractC24825a;
import m83.AbstractC25267u;
import nx2.AbstractC27228b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ux2.InterfaceC35372b;

/* JADX INFO: renamed from: tx2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;", "Lux2/b$b;", "b", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignExtendedDetailsResponse;)Lux2/b$b;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34246b {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final InterfaceC35372b.b m108288b(CampaignExtendedDetailsResponse campaignExtendedDetailsResponse) {
        ArrayList arrayList;
        EnumC16313m0 enumC16313m0;
        int campaignId = campaignExtendedDetailsResponse.getCampaignId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(campaignExtendedDetailsResponse.getToolbarTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(campaignExtendedDetailsResponse.getTitle());
        String headerSubtitle = campaignExtendedDetailsResponse.getHeaderSubtitle();
        if (headerSubtitle == null) {
            headerSubtitle = "";
        }
        String strValueOf = String.valueOf(campaignExtendedDetailsResponse.getHeaderIcon());
        EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            arrayList = null;
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), strValueOf)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        int whoopIcon = enumC16313m1.toWhoopIcon();
        List<ContentBlockResponse> contentBlocks = campaignExtendedDetailsResponse.getContentBlocks();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(contentBlocks, 10));
        Iterator<T> it = contentBlocks.iterator();
        while (it.hasNext()) {
            arrayList2.add(AbstractC27228b.m82055n((ContentBlockResponse) it.next()));
        }
        String description = campaignExtendedDetailsResponse.getDescription();
        if (description == null) {
            description = "";
        }
        List<LegalDocumentResponse> documents = campaignExtendedDetailsResponse.getDocuments();
        if (documents != null) {
            List<LegalDocumentResponse> list = documents;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(AbstractC24825a.m72772a((LegalDocumentResponse) it3.next()));
            }
        }
        return new InterfaceC35372b.b(campaignId, textResourceM21278l, textResourceM21278l2, headerSubtitle, whoopIcon, arrayList2, description, arrayList, AbstractC8693b.m21278l(campaignExtendedDetailsResponse.getAlertTitle()), AbstractC8693b.m21278l(campaignExtendedDetailsResponse.getAlertDisplay()), campaignExtendedDetailsResponse.getDocumentDisplay());
    }
}
