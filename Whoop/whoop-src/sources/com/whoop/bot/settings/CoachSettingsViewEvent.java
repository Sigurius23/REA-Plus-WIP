package com.whoop.bot.settings;

import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "", "<init>", "()V", "None", "Load", "Retry", "Toggle", "DismissError", "Lcom/whoop/bot/settings/CoachSettingsViewEvent$DismissError;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent$Load;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent$None;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent$Retry;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class CoachSettingsViewEvent {
    public static final int $stable = 0;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005H\u0096\u0080\u0004¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewEvent$DismissError;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "<init>", "()V", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DismissError extends CoachSettingsViewEvent {
        public static final int $stable = 0;
        public static final DismissError INSTANCE = new DismissError();

        private DismissError() {
            super(null);
        }

        public String toString() {
            return "DismissError";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005H\u0096\u0080\u0004¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewEvent$Load;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "<init>", "()V", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Load extends CoachSettingsViewEvent {
        public static final int $stable = 0;
        public static final Load INSTANCE = new Load();

        private Load() {
            super(null);
        }

        public String toString() {
            return "Load";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005H\u0096\u0080\u0004¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewEvent$None;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "<init>", "()V", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class None extends CoachSettingsViewEvent {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u00020\u0005H\u0096\u0080\u0004¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewEvent$Retry;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "<init>", "()V", "toString", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Retry extends CoachSettingsViewEvent {
        public static final int $stable = 0;
        public static final Retry INSTANCE = new Retry();

        private Retry() {
            super(null);
        }

        public String toString() {
            return "Retry";
        }
    }

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;", "Lcom/whoop/bot/settings/CoachSettingsViewEvent;", "key", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Toggle extends CoachSettingsViewEvent {
        public static final int $stable = 0;
        private final boolean enabled;
        private final String key;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toggle(String key, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            this.key = key;
            this.enabled = z4;
        }

        public static /* synthetic */ Toggle copy$default(Toggle toggle, String str, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = toggle.key;
            }
            if ((i13 & 2) != 0) {
                z4 = toggle.enabled;
            }
            return toggle.copy(str, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Toggle copy(String key, boolean enabled) {
            AbstractC22676k.m65750j(key, "key");
            return new Toggle(key, enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toggle)) {
                return false;
            }
            Toggle toggle = (Toggle) other;
            return AbstractC22676k.m65745e(this.key, toggle.key) && this.enabled == toggle.enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enabled) + (this.key.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("Toggle(key=", this.key, ", enabled=", ")", this.enabled);
        }
    }

    public /* synthetic */ CoachSettingsViewEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CoachSettingsViewEvent() {
    }
}
