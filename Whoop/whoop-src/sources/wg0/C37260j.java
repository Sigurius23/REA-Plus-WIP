package wg0;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: wg0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lwg0/j;", "", "<init>", "()V", "", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37260j {

    /* JADX INFO: renamed from: a */
    public static final C37260j f159404a = new C37260j();

    private C37260j() {
    }

    /* JADX INFO: renamed from: a */
    public final Integer m119422a(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int length = str.length();
        boolean z4 = false;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (!AbstractC35846d.m113784i(str.charAt(i14))) {
                z4 = true;
            } else if (z4) {
                return Integer.valueOf(i13);
            }
            i13++;
        }
        return null;
    }
}
