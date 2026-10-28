package e80;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: e80.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Le80/b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PROFILE_TO_PERMISSION", "PERMISSION_TO_PLAN_PICKER", "HW_ONLY_AFTER_ACTIVATION_TO_HOME", "MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION", "MEDICARE_AFTER_ACTIVATION_TO_HOME", "AL_PROFILE_TO_PERMISSIONS", "AL_PERMISSIONS_TO_AFTER_ACTIVATION", "AL_AFTER_ACTIVATION_TO_HOME", "ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION", "AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC12815b {
    PROFILE_TO_PERMISSION("profile_to_permission"),
    PERMISSION_TO_PLAN_PICKER("permission_to_plan_picker"),
    HW_ONLY_AFTER_ACTIVATION_TO_HOME("hw_only_after_activation_to_home"),
    MEDICARE_PERMISSIONS_TO_AFTER_ACTIVATION("medicare_permissions_to_after_activation"),
    MEDICARE_AFTER_ACTIVATION_TO_HOME("medicare_after_activation_to_home"),
    AL_PROFILE_TO_PERMISSIONS("al_profile_to_permissions"),
    AL_PERMISSIONS_TO_AFTER_ACTIVATION("al_permissions_to_after_activation"),
    AL_AFTER_ACTIVATION_TO_HOME("al_after_activation_to_home"),
    ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION_TO_AFTER_ACTIVATION("account_transition_legacy_after_activation_to_after_activation"),
    AFTER_ACTIVATION_FINAL_SCREENS_TO_HOME("after_activation_final_screens_to_home");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String value;

    EnumC12815b(String str) {
        this.value = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
