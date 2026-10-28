package com.whoop.weightlifting.data.domain;

import androidx.annotation.Keep;
import cu2.AbstractC11128h;
import ge3.AbstractC15751g;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/StrapPlacements;", "", "nameResourceId", "", "laterality", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "<init>", "(Ljava/lang/String;IILcom/whoop/weightlifting/data/domain/StrapLaterality;)V", "getNameResourceId", "()I", "getLaterality", "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "RIGHT_WRIST", "LEFT_WRIST", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public enum StrapPlacements {
    RIGHT_WRIST(AbstractC11128h.f35400K, StrapLaterality.Right),
    LEFT_WRIST(AbstractC11128h.f35397J, StrapLaterality.Left);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final StrapLaterality laterality;
    private final int nameResourceId;

    StrapPlacements(int i13, StrapLaterality strapLaterality) {
        this.nameResourceId = i13;
        this.laterality = strapLaterality;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final StrapLaterality getLaterality() {
        return this.laterality;
    }

    public final int getNameResourceId() {
        return this.nameResourceId;
    }
}
