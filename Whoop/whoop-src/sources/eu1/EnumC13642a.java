package eu1;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: eu1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Leu1/a;", "", "", "action", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW", "ACTION_FORCE_UPLOAD_TRIGGERED", "ACTION_BACKGROUND_UPLOAD_TRIGGERED", "ACTION_FORCE_UPLOAD_COMPLETE", "ACTION_BACKGROUND_UPLOAD_COMPLETE", "ACTION_FORCE_UPLOAD_FAILURE", "ACTION_BACKGROUND_UPLOAD_FAILURE", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC13642a {
    ACTION_BEGIN_SYNC_AND_UPLOAD_FLOW("Force sync & upload flow triggered"),
    ACTION_FORCE_UPLOAD_TRIGGERED("Force upload triggered"),
    ACTION_BACKGROUND_UPLOAD_TRIGGERED("Background upload triggered"),
    ACTION_FORCE_UPLOAD_COMPLETE("Force upload complete"),
    ACTION_BACKGROUND_UPLOAD_COMPLETE("Background upload complete"),
    ACTION_FORCE_UPLOAD_FAILURE("Force upload failed"),
    ACTION_BACKGROUND_UPLOAD_FAILURE("Background Upload failed");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String action;

    EnumC13642a(String str) {
        this.action = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getAction() {
        return this.action;
    }
}
