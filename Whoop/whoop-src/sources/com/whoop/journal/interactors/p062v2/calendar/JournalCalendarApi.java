package com.whoop.journal.interactors.p062v2.calendar;

import com.mapbox.common.HttpHeaders;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;", "", "", HttpHeaders.DATE, "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;", "getJournalCalendar", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface JournalCalendarApi {
    @InterfaceC37275f("journal-service/v2/journals/{date}/calendar")
    Object getJournalCalendar(@InterfaceC37288s(HttpHeaders.DATE) String str, InterfaceC30057d<? super JournalCalendar> interfaceC30057d);
}
