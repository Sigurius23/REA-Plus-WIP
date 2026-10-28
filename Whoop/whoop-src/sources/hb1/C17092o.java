package hb1;

import p636y3.C39169a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hb1.o */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010R(\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0018"}, m65681d2 = {"Lhb1/o;", "", "<init>", "()V", "Ly3/a;", "constraints", "", "c", "(J)Z", "", "detected", "Ll83/a0;", "b", "(JLjava/lang/String;)V", "", "a", "I", "detectedAtWidth", "detectedAtHeight", "value", "Ljava/lang/String;", "()Ljava/lang/String;", "direction", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C17092o {

    /* JADX INFO: renamed from: d */
    private static final a f65667d = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int detectedAtWidth = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int detectedAtHeight = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private String direction;

    /* JADX INFO: renamed from: hb1.o$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lhb1/o$a;", "", "<init>", "()V", "", "UNSET", "I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: b */
    public final void m48260b(long constraints, String detected) {
        this.detectedAtWidth = C39169a.m124765i(constraints);
        this.detectedAtHeight = C39169a.m124764h(constraints);
        this.direction = detected;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m48261c(long constraints) {
        if (this.direction == null) {
            return (C39169a.m124765i(constraints) == this.detectedAtWidth && C39169a.m124764h(constraints) == this.detectedAtHeight) ? false : true;
        }
        return false;
    }
}
