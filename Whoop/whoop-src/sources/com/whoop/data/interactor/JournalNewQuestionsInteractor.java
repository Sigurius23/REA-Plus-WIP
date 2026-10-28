package com.whoop.data.interactor;

import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13072o1;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/data/interactor/JournalNewQuestionsInteractor;", "", "<init>", "()V", "Lcom/whoop/data/interactor/JournalNewQuestionAction;", "action", "Ll83/a0;", "sendAction", "(Lcom/whoop/data/interactor/JournalNewQuestionAction;Lq83/d;)Ljava/lang/Object;", "Lec3/o1;", "eventFlow", "Lec3/o1;", "Lec3/l;", "Lcom/whoop/data/interactor/JournalNewQuestionState;", "journalNewQuestionFlow", "Lec3/l;", "getJournalNewQuestionFlow", "()Lec3/l;", "getJournalNewQuestionFlow$annotations", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JournalNewQuestionsInteractor {
    public static final int $stable = 8;
    private final InterfaceC13072o1 eventFlow;
    private final InterfaceC13058l journalNewQuestionFlow;

    public JournalNewQuestionsInteractor() {
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.journalNewQuestionFlow = AbstractC13091v.m36590P(c13096w1M36592b, new JournalNewQuestionsInteractor$special$$inlined$flatMapLatest$1(null));
    }

    public static /* synthetic */ void getJournalNewQuestionFlow$annotations() {
    }

    public final InterfaceC13058l getJournalNewQuestionFlow() {
        return this.journalNewQuestionFlow;
    }

    public final Object sendAction(JournalNewQuestionAction journalNewQuestionAction, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objEmit = this.eventFlow.emit(journalNewQuestionAction, interfaceC30057d);
        return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
    }
}
