package ur1;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr1.C32911c;
import tr1.C34098b;

/* JADX INFO: renamed from: ur1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lur1/a;", "", "Lsr1/c;", "defaultAnswers", "", "Ltr1/b;", "behaviors", "<init>", "(Lsr1/c;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsr1/c;", "b", "()Lsr1/c;", "Ljava/util/List;", "()Ljava/util/List;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35184a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C32911c defaultAnswers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C34098b> behaviors;

    public C35184a(C32911c defaultAnswers, List<C34098b> behaviors) {
        AbstractC22676k.m65750j(defaultAnswers, "defaultAnswers");
        AbstractC22676k.m65750j(behaviors, "behaviors");
        this.defaultAnswers = defaultAnswers;
        this.behaviors = behaviors;
    }

    /* JADX INFO: renamed from: a */
    public final List<C34098b> m111385a() {
        return this.behaviors;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C32911c getDefaultAnswers() {
        return this.defaultAnswers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35184a)) {
            return false;
        }
        C35184a c35184a = (C35184a) other;
        return AbstractC22676k.m65745e(this.defaultAnswers, c35184a.defaultAnswers) && AbstractC22676k.m65745e(this.behaviors, c35184a.behaviors);
    }

    public int hashCode() {
        return this.behaviors.hashCode() + (this.defaultAnswers.hashCode() * 31);
    }

    public String toString() {
        return "BehaviorListAndDefaultAnswer(defaultAnswers=" + this.defaultAnswers + ", behaviors=" + this.behaviors + ")";
    }
}
