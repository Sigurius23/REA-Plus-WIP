package o41;

import e93.AbstractC12889b;
import n41.C26270a;
import n41.C26273d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o41.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lo41/a;", "", "<init>", "()V", "", "remainingMs", "b", "(J)J", "millis", "Ln41/a;", "c", "(J)Ln41/a;", "time", "Ln41/d;", "labels", "", "a", "(JLn41/d;)Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27520a {

    /* JADX INFO: renamed from: a */
    public static final C27520a f110811a = new C27520a();

    private C27520a() {
    }

    /* JADX INFO: renamed from: a */
    public final String m82953a(long time, C26273d labels) {
        AbstractC22676k.m65750j(labels, "labels");
        C26270a c26270aM82955c = m82955c(time);
        boolean z4 = c26270aM82955c.getHours() == 0;
        StringBuilder sb4 = new StringBuilder();
        if (z4) {
            sb4.append(c26270aM82955c.getMinutes());
            sb4.append(" ");
            sb4.append(labels.getMinutes());
            sb4.append(" ");
            sb4.append(c26270aM82955c.getSeconds());
            sb4.append(" ");
            sb4.append(labels.getSeconds());
        } else {
            sb4.append(c26270aM82955c.getHours());
            sb4.append(" ");
            sb4.append(labels.getHours());
            sb4.append(" ");
            sb4.append(c26270aM82955c.getMinutes());
            sb4.append(" ");
            sb4.append(labels.getMinutes());
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final long m82954b(long remainingMs) {
        long j7 = remainingMs >= 3600000 ? 60000L : 1000L;
        long j13 = remainingMs % j7;
        return AbstractC12889b.m36286p(j13 == 0 ? j7 : j13, 200L, j7);
    }

    /* JADX INFO: renamed from: c */
    public final C26270a m82955c(long millis) {
        if (millis <= 0) {
            return new C26270a(0, 0, 0);
        }
        long j7 = millis / 1000;
        return new C26270a((int) (j7 / 3600), (int) ((j7 % 3600) / 60), (int) (j7 % 60));
    }
}
