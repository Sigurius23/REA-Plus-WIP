package wk2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yg2.AbstractC39529d;

/* JADX INFO: renamed from: wk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lwk2/a;", "", "<init>", "()V", "Lwk2/b;", "previous", "Lyg2/d;", "liveHrState", "a", "(Lwk2/b;Lyg2/d;)Lwk2/b;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37340a {
    /* JADX INFO: renamed from: a */
    public final C37341b m119578a(C37341b previous, AbstractC39529d liveHrState) {
        AbstractC22676k.m65750j(previous, "previous");
        AbstractC22676k.m65750j(liveHrState, "liveHrState");
        AbstractC39529d.a aVar = liveHrState instanceof AbstractC39529d.a ? (AbstractC39529d.a) liveHrState : null;
        if (aVar == null) {
            return previous;
        }
        return new C37341b(previous.getSum() + ((long) aVar.getHeartRate()), previous.getSampleCount() + 1);
    }
}
