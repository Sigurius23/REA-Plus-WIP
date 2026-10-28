package fs0;

import ds0.InterfaceC12323b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fs0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0012"}, m65681d2 = {"Lfs0/c;", "", "<init>", "()V", "", "text", "Lds0/b$a;", "a", "(Ljava/lang/String;)Lds0/b$a;", "", "c", "()J", "Lds0/b$b;", "b", "()Lds0/b$b;", "J", "nextSubmission", "nextModalAction", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14743c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long nextSubmission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long nextModalAction;

    /* JADX INFO: renamed from: a */
    public final InterfaceC12323b.a m42275a(String text) {
        AbstractC22676k.m65750j(text, "text");
        long j7 = this.nextSubmission;
        this.nextSubmission = 1 + j7;
        return new InterfaceC12323b.a(j7, text);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC12323b.b m42276b() {
        long j7 = this.nextModalAction;
        this.nextModalAction = 1 + j7;
        return new InterfaceC12323b.b(j7);
    }

    /* JADX INFO: renamed from: c */
    public final long m42277c() {
        long j7 = this.nextSubmission;
        this.nextSubmission = 1 + j7;
        return j7;
    }
}
