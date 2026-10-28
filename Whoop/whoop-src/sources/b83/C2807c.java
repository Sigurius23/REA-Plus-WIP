package b83;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b83.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2807c extends Throwable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10998w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2807c(String str, int i13) {
        super(str);
        this.f10998w = i13;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f10998w) {
            case 0:
            case 2:
                return this;
            case 1:
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2807c(String message) {
        super(message);
        this.f10998w = 3;
        AbstractC22676k.m65750j(message, "message");
    }
}
