package p714k80;

import androidx.core.app.NotificationCompat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.C39412p;

/* JADX INFO: renamed from: k80.n */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lk80/n;", "", "<init>", "()V", "", NotificationCompat.CATEGORY_EMAIL, "", "a", "(Ljava/lang/String;)Z", "Lyb3/p;", "b", "Lyb3/p;", "EMAIL_BE_PATTERN", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22285n {

    /* JADX INFO: renamed from: a */
    public static final C22285n f86963a = new C22285n();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C39412p EMAIL_BE_PATTERN = new C39412p("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

    /* JADX INFO: renamed from: c */
    public static final int f86965c = 8;

    private C22285n() {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m64020a(String email) {
        AbstractC22676k.m65750j(email, "email");
        return EMAIL_BE_PATTERN.m125851e(email);
    }
}
