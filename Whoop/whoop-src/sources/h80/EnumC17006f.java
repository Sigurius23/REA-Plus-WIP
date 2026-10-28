package h80;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;
import y82.EnumC39339b;

/* JADX INFO: renamed from: h80.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lh80/f;", "", "", "analyticsValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAnalyticsValue$activation_release", "()Ljava/lang/String;", EnumC39339b.RESULT_SUCCESS, "Failure", "Cancel", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC17006f {
    Success("success"),
    Failure("failure"),
    Cancel("cancel");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String analyticsValue;

    EnumC17006f(String str) {
        this.analyticsValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getAnalyticsValue$activation_release, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
