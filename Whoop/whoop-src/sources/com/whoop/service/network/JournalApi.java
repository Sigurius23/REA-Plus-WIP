package com.whoop.service.network;

import com.mapbox.common.HttpHeaders;
import com.whoop.data.remote.domain.dto.BehaviourTrackerHistoryResponseDto;
import com.whoop.data.remote.domain.dto.JournalBehaviorTrackerDto;
import com.whoop.data.remote.domain.dto.JournalEntryWrapperDto;
import com.whoop.data.remote.domain.dto.JournalPreferencesDto;
import com.whoop.data.remote.domain.dto.JournalsBehaviorsListResponseDto;
import com.whoop.data.remote.domain.dto.UserSelectedJournalBehaviorResponseDto;
import com.whoop.data.remote.domain.request.JournalTrackerRequest;
import com.whoop.data.remote.domain.request.PartialJournalEntryRequest;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0004J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\u0004J0\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\b\u0001\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$H§@¢\u0006\u0004\b&\u0010'J \u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010(\u001a\u00020\rH§@¢\u0006\u0004\b)\u0010\u0012J*\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020,2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b-\u0010\u0012J \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u001d\u001a\u00020.H§@¢\u0006\u0004\b/\u00100¨\u00061À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/JournalApi;", "", "Lcom/whoop/data/remote/domain/dto/JournalPreferencesDto;", "getJournalPreferences", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/service/network/JournalEnabled;", "journalEnabled", "Lpg3/v0;", "Ll83/a0;", "upsertJournalPreferences", "(Lcom/whoop/service/network/JournalEnabled;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;", "getUserSelectedJournalBehaviors", "", HttpHeaders.DATE, "", "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;", "getUserSelectedJournalBehaviorsV2", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "cycleId", "", "hasAutoPopped", "setAutoPop", "(JZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;", "getUserJournalHistory", "(JLq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;", "request", "saveUserJournalBehaviorAnswers", "(JLcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;", "getJournalBehaviorsList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "list", "updateUserSelectedJournalBehaviors", "(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;", "behaviorId", "addBehaviorTrackerForUser", "saveUserJournalBehaviorAnswersIntraday", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;", "getJournalEntryForDate", "Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;", "savePartialJournalEntry", "(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface JournalApi {
    @InterfaceC37285p("journal-service/v1/journals/behaviors/{behaviorId}/user")
    Object addBehaviorTrackerForUser(@InterfaceC37288s("behaviorId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("journal-service/v1/journals/behaviors")
    Object getJournalBehaviorsList(InterfaceC30057d<? super JournalsBehaviorsListResponseDto> interfaceC30057d);

    @InterfaceC37275f("journal-service/v3/journals/drafts/mobile/{date}")
    Object getJournalEntryForDate(@InterfaceC37288s(HttpHeaders.DATE) String str, InterfaceC30057d<? super JournalEntryWrapperDto> interfaceC30057d);

    @InterfaceC37275f("journal-service/v1/journals/preferences")
    Object getJournalPreferences(InterfaceC30057d<? super JournalPreferencesDto> interfaceC30057d);

    @InterfaceC37275f("journal-service/v1/journals/stats/user/{cycleId}")
    Object getUserJournalHistory(@InterfaceC37288s("cycleId") long j7, InterfaceC30057d<? super BehaviourTrackerHistoryResponseDto> interfaceC30057d);

    @InterfaceC37275f("journal-service/v1/journals/behaviors/user")
    Object getUserSelectedJournalBehaviors(InterfaceC30057d<? super UserSelectedJournalBehaviorResponseDto> interfaceC30057d);

    @InterfaceC37275f("journal-service/v2/journals/behaviors/user/{date}")
    Object getUserSelectedJournalBehaviorsV2(@InterfaceC37288s(HttpHeaders.DATE) String str, InterfaceC30057d<? super List<JournalBehaviorTrackerDto>> interfaceC30057d);

    @InterfaceC37285p("journal-service/v2/journal/entry/partial")
    Object savePartialJournalEntry(@InterfaceC37270a PartialJournalEntryRequest partialJournalEntryRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("journal-service/v1/journals/entries/user/cycle/{cycleId}")
    Object saveUserJournalBehaviorAnswers(@InterfaceC37288s("cycleId") long j7, @InterfaceC37270a JournalTrackerRequest journalTrackerRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("journal-service/v2/journals/entries/user/date/{date}")
    Object saveUserJournalBehaviorAnswersIntraday(@InterfaceC37288s(HttpHeaders.DATE) String str, @InterfaceC37270a JournalTrackerRequest journalTrackerRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("journal-service/v2/autopop/upsert/cycleId/{cycleId}/hasAutoPopped/{hasAutoPopped}")
    Object setAutoPop(@InterfaceC37288s("cycleId") long j7, @InterfaceC37288s("hasAutoPopped") boolean z4, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("journal-service/v1/journals/behaviors/user")
    Object updateUserSelectedJournalBehaviors(@InterfaceC37270a ArrayList<Integer> arrayList, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("journal-service/v1/journals/preferences")
    Object upsertJournalPreferences(@InterfaceC37270a JournalEnabled journalEnabled, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
