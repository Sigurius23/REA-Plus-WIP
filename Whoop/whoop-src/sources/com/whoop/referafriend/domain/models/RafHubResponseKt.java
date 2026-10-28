package com.whoop.referafriend.domain.models;

import j62.C21382g;
import j62.C21383h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubResponse;", "Lcom/whoop/referafriend/domain/models/RafHubDomainState;", "toRafHubDomainState", "(Lcom/whoop/referafriend/domain/models/RafHubResponse;)Lcom/whoop/referafriend/domain/models/RafHubDomainState;", "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "Lj62/h;", "toTrialsRafHubDomainState", "(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;)Lj62/h;", "Lcom/whoop/referafriend/domain/models/TrialsItemModel;", "", "isShared", "Lj62/g;", "toTrialsItemDomainState", "(Lcom/whoop/referafriend/domain/models/TrialsItemModel;Z)Lj62/g;", "refer-a-friend_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RafHubResponseKt {
    public static final RafHubDomainState toRafHubDomainState(RafHubResponse rafHubResponse) {
        AbstractC22676k.m65750j(rafHubResponse, "<this>");
        RafHubType.Basic basic = rafHubResponse.getBasic();
        RafHubType.Full full = rafHubResponse.getFull();
        RafHubType.Trials trials = rafHubResponse.getTrials();
        return new RafHubDomainState(basic, full, trials != null ? toTrialsRafHubDomainState(trials) : null);
    }

    private static final C21382g toTrialsItemDomainState(TrialsItemModel trialsItemModel, boolean z4) {
        return new C21382g(trialsItemModel.getCode(), trialsItemModel.getShareCtaText(), trialsItemModel.getSharedText(), trialsItemModel.getShareMessage(), trialsItemModel.getBottomCtaText(), z4);
    }

    public static /* synthetic */ C21382g toTrialsItemDomainState$default(TrialsItemModel trialsItemModel, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return toTrialsItemDomainState(trialsItemModel, z4);
    }

    private static final C21383h toTrialsRafHubDomainState(RafHubType.Trials trials) {
        String title = trials.getTitle();
        List<TrialsItemModel> trialItems = trials.getTrialItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(trialItems, 10));
        Iterator<T> it = trialItems.iterator();
        while (it.hasNext()) {
            arrayList.add(toTrialsItemDomainState$default((TrialsItemModel) it.next(), false, 1, null));
        }
        return new C21383h(title, arrayList, trials.getTutorialContent(), trials.getSkipCtaText(), trials.getContinueCtaText());
    }
}
