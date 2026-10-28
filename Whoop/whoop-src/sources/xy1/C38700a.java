package xy1;

import androidx.core.app.NotificationCompat;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: xy1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Lxy1/a;", "", "Lxy1/c;", "inputMode", "", "inputValue", "", NotificationCompat.CATEGORY_PROGRESS, "Lxy1/f;", "submissionState", "<init>", "(Lxy1/c;Ljava/lang/String;FLxy1/f;)V", "a", "(Lxy1/c;Ljava/lang/String;FLxy1/f;)Lxy1/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxy1/c;", "c", "()Lxy1/c;", "b", "Ljava/lang/String;", "d", "F", "e", "()F", "Lxy1/f;", "f", "()Lxy1/f;", "mfa_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38700a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC38702c inputMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String inputValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38705f submissionState;

    public C38700a(EnumC38702c inputMode, String inputValue, float f13, EnumC38705f submissionState) {
        AbstractC22676k.m65750j(inputMode, "inputMode");
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(submissionState, "submissionState");
        this.inputMode = inputMode;
        this.inputValue = inputValue;
        this.progress = f13;
        this.submissionState = submissionState;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C38700a m124112b(C38700a c38700a, EnumC38702c enumC38702c, String str, float f13, EnumC38705f enumC38705f, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC38702c = c38700a.inputMode;
        }
        if ((i13 & 2) != 0) {
            str = c38700a.inputValue;
        }
        if ((i13 & 4) != 0) {
            f13 = c38700a.progress;
        }
        if ((i13 & 8) != 0) {
            enumC38705f = c38700a.submissionState;
        }
        return c38700a.m124113a(enumC38702c, str, f13, enumC38705f);
    }

    /* JADX INFO: renamed from: a */
    public final C38700a m124113a(EnumC38702c inputMode, String inputValue, float progress, EnumC38705f submissionState) {
        AbstractC22676k.m65750j(inputMode, "inputMode");
        AbstractC22676k.m65750j(inputValue, "inputValue");
        AbstractC22676k.m65750j(submissionState, "submissionState");
        return new C38700a(inputMode, inputValue, progress, submissionState);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC38702c getInputMode() {
        return this.inputMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38700a)) {
            return false;
        }
        C38700a c38700a = (C38700a) other;
        return this.inputMode == c38700a.inputMode && AbstractC22676k.m65745e(this.inputValue, c38700a.inputValue) && Float.compare(this.progress, c38700a.progress) == 0 && this.submissionState == c38700a.submissionState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC38705f getSubmissionState() {
        return this.submissionState;
    }

    public int hashCode() {
        return this.submissionState.hashCode() + AbstractC11266d.m30447a(this.progress, AbstractC11266d.m30450d(this.inputMode.hashCode() * 31, 31, this.inputValue), 31);
    }

    public String toString() {
        return "MfaInputDomainState(inputMode=" + this.inputMode + ", inputValue=" + this.inputValue + ", progress=" + this.progress + ", submissionState=" + this.submissionState + ")";
    }

    public /* synthetic */ C38700a(EnumC38702c enumC38702c, String str, float f13, EnumC38705f enumC38705f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC38702c.PHONE : enumC38702c, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? EnumC38705f.IDLE : enumC38705f);
    }
}
