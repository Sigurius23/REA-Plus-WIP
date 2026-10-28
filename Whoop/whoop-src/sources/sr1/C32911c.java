package sr1;

import c13.AbstractC3855a;
import java.util.List;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tr1.C34097a;

/* JADX INFO: renamed from: sr1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lsr1/c;", "", "", "isDefaultAnswerToggleVisible", "isDefaultAnswerToggleEnabled", "", "Ltr1/a;", "defaultAnswersAndQuestions", "<init>", "(ZZLjava/util/List;)V", "a", "(ZZLjava/util/List;)Lsr1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "e", "()Z", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32911c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isDefaultAnswerToggleVisible;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isDefaultAnswerToggleEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C34097a> defaultAnswersAndQuestions;

    public C32911c(boolean z4, boolean z13, List<C34097a> defaultAnswersAndQuestions) {
        AbstractC22676k.m65750j(defaultAnswersAndQuestions, "defaultAnswersAndQuestions");
        this.isDefaultAnswerToggleVisible = z4;
        this.isDefaultAnswerToggleEnabled = z13;
        this.defaultAnswersAndQuestions = defaultAnswersAndQuestions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C32911c m103312b(C32911c c32911c, boolean z4, boolean z13, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c32911c.isDefaultAnswerToggleVisible;
        }
        if ((i13 & 2) != 0) {
            z13 = c32911c.isDefaultAnswerToggleEnabled;
        }
        if ((i13 & 4) != 0) {
            list = c32911c.defaultAnswersAndQuestions;
        }
        return c32911c.m103313a(z4, z13, list);
    }

    /* JADX INFO: renamed from: a */
    public final C32911c m103313a(boolean isDefaultAnswerToggleVisible, boolean isDefaultAnswerToggleEnabled, List<C34097a> defaultAnswersAndQuestions) {
        AbstractC22676k.m65750j(defaultAnswersAndQuestions, "defaultAnswersAndQuestions");
        return new C32911c(isDefaultAnswerToggleVisible, isDefaultAnswerToggleEnabled, defaultAnswersAndQuestions);
    }

    /* JADX INFO: renamed from: c */
    public final List<C34097a> m103314c() {
        return this.defaultAnswersAndQuestions;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsDefaultAnswerToggleEnabled() {
        return this.isDefaultAnswerToggleEnabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsDefaultAnswerToggleVisible() {
        return this.isDefaultAnswerToggleVisible;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32911c)) {
            return false;
        }
        C32911c c32911c = (C32911c) other;
        return this.isDefaultAnswerToggleVisible == c32911c.isDefaultAnswerToggleVisible && this.isDefaultAnswerToggleEnabled == c32911c.isDefaultAnswerToggleEnabled && AbstractC22676k.m65745e(this.defaultAnswersAndQuestions, c32911c.defaultAnswersAndQuestions);
    }

    public int hashCode() {
        return this.defaultAnswersAndQuestions.hashCode() + AbstractC2875y.m8289b(Boolean.hashCode(this.isDefaultAnswerToggleVisible) * 31, 31, this.isDefaultAnswerToggleEnabled);
    }

    public String toString() {
        boolean z4 = this.isDefaultAnswerToggleVisible;
        boolean z13 = this.isDefaultAnswerToggleEnabled;
        return AbstractC3855a.m11829m(AbstractC11895b.m32002u("DefaultAnswers(isDefaultAnswerToggleVisible=", ", isDefaultAnswerToggleEnabled=", ", defaultAnswersAndQuestions=", z4, z13), this.defaultAnswersAndQuestions, ")");
    }

    public /* synthetic */ C32911c(boolean z4, boolean z13, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
