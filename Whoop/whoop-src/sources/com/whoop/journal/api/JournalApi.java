package com.whoop.journal.api;

import com.mapbox.common.HttpHeaders;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import java.util.List;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0013\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/journal/api/JournalApi;", "", "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;", "getJournalBehaviors", "(Lq83/d;)Ljava/lang/Object;", "", "", "list", "Lpg3/v0;", "Lcom/whoop/journal/api/SaveJournalBehaviorsResponse;", "updateUserSelectedJournalBehaviors", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "searchTerm", "getRelatedBehaviorTrackerIds", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", HttpHeaders.DATE, "", "isIntraday", "autopop", "Lcom/whoop/journal/api/TalkTextWidgetResponse;", "getTalkTextWidget", "(Ljava/lang/String;ZZLq83/d;)Ljava/lang/Object;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface JournalApi {
    @InterfaceC37275f("journal-service/v3/journals/behaviors")
    Object getJournalBehaviors(InterfaceC30057d<? super CustomizeBottomSheetSelectorModel> interfaceC30057d);

    @InterfaceC37275f("ai-conversation-service/v1/fuzzy-match/behavior-trackers/{searchTerm}?limit=3")
    Object getRelatedBehaviorTrackerIds(@InterfaceC37288s("searchTerm") String str, InterfaceC30057d<? super List<Integer>> interfaceC30057d);

    @InterfaceC37275f("journal-service/v1/widget/talk-text/{date}")
    Object getTalkTextWidget(@InterfaceC37288s(HttpHeaders.DATE) String str, @InterfaceC37289t("isIntraday") boolean z4, @InterfaceC37289t("autopop") boolean z13, InterfaceC30057d<? super TalkTextWidgetResponse> interfaceC30057d);

    @InterfaceC37285p("journal-service/v1/journals/behaviors/user")
    Object updateUserSelectedJournalBehaviors(@InterfaceC37270a List<Integer> list, InterfaceC30057d<? super C29218v0<SaveJournalBehaviorsResponse>> interfaceC30057d);
}
