package io.getstream.chat.android.models;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/models/ReactionSortingBySumScore;", "Lio/getstream/chat/android/models/ReactionSorting;", "<init>", "()V", "compare", "", "o1", "Lio/getstream/chat/android/models/ReactionGroup;", "o2", "equals", "", "other", "", "hashCode", "toString", "", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionSortingBySumScore implements ReactionSorting {
    public static final ReactionSortingBySumScore INSTANCE = new ReactionSortingBySumScore();

    private ReactionSortingBySumScore() {
    }

    @Override // java.util.Comparator
    public boolean equals(Object other) {
        return this == other || (other instanceof ReactionSortingBySumScore);
    }

    public int hashCode() {
        return 1589170794;
    }

    public String toString() {
        return "ReactionSortingBySumScore";
    }

    @Override // java.util.Comparator
    public int compare(ReactionGroup o5, ReactionGroup o13) {
        AbstractC22676k.m65750j(o5, "o1");
        AbstractC22676k.m65750j(o13, "o2");
        return AbstractC22676k.m65751k(o5.getSumScore(), o13.getSumScore());
    }
}
