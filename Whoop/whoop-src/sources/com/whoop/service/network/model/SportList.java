package com.whoop.service.network.model;

import java.util.ArrayList;
import java.util.List;
import p002a0.C0024g1;
import p087db.C11858k0;

/* JADX INFO: loaded from: classes10.dex */
public class SportList {
    private List<Sport> currentSports;
    private C0024g1 sportsById;

    public SportList(List<Sport> list) {
        loadSports(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$loadSports$0(Sport sport, Sport sport2) {
        return String.CASE_INSENSITIVE_ORDER.compare(sport.getName(), sport2.getName());
    }

    private void loadSports(List<Sport> list) {
        this.sportsById = new C0024g1(list.size());
        ArrayList<Sport> arrayList = new ArrayList(list);
        arrayList.sort(new C11858k0(26));
        this.currentSports = new ArrayList(list.size());
        for (Sport sport : arrayList) {
            this.sportsById.m57f(sport.getId(), sport);
            if (sport.isCurrent()) {
                this.currentSports.add(sport);
            }
        }
    }

    public List<Sport> getCurrentSports() {
        return this.currentSports;
    }

    public Sport getSportForId(int i13) {
        return (Sport) this.sportsById.m55d(i13);
    }
}
