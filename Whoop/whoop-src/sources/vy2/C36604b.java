package vy2;

import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: vy2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lvy2/b;", "", "", "Lvy2/e;", "questions", "", "sessionId", "Lvy2/c;", "config", "<init>", "(Ljava/util/List;ILvy2/c;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "c", "Lvy2/c;", "()Lvy2/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36604b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C36607e> questions;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sessionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36605c config;

    public C36604b(List<C36607e> questions, int i13, C36605c config) {
        AbstractC22676k.m65750j(questions, "questions");
        AbstractC22676k.m65750j(config, "config");
        this.questions = questions;
        this.sessionId = i13;
        this.config = config;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C36605c getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: b */
    public final List<C36607e> m117581b() {
        return this.questions;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36604b)) {
            return false;
        }
        C36604b c36604b = (C36604b) other;
        return AbstractC22676k.m65745e(this.questions, c36604b.questions) && this.sessionId == c36604b.sessionId && AbstractC22676k.m65745e(this.config, c36604b.config);
    }

    public int hashCode() {
        return this.config.hashCode() + AbstractC11266d.m30448b(this.sessionId, this.questions.hashCode() * 31, 31);
    }

    public String toString() {
        return "CampaignScreeningInfo(questions=" + this.questions + ", sessionId=" + this.sessionId + ", config=" + this.config + ")";
    }
}
