package com.whoop.custombottomsheet.api;

import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/custombottomsheet/api/CustomBottomSheetApi;", "", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "getCustomJournalBottomSheet", "(Lq83/d;)Ljava/lang/Object;", "", "searchTerm", "", "", "getRelatedBehaviorTrackerIds", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CustomBottomSheetApi {
    @InterfaceC37275f("journal-service/v3/journals/behaviors")
    Object getCustomJournalBottomSheet(InterfaceC30057d<? super CustomizeBottomSheetSelectorModel> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-service/v1/fuzzy-match/behavior-trackers/{searchTerm}?limit=3")
    Object getRelatedBehaviorTrackerIds(@InterfaceC37288s("searchTerm") String str, InterfaceC30057d<? super List<Integer>> interfaceC30057d);
}
