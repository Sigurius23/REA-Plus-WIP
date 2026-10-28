package io.getstream.chat.android.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/models/Command;", "", "name", "", "description", "args", "set", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDescription", "getArgs", "getSet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class Command {
    private final String args;
    private final String description;
    private final String name;
    private final String set;

    public Command(String name, String description, String args, String set) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(set, "set");
        this.name = name;
        this.description = description;
        this.args = args;
        this.set = set;
    }

    public static /* synthetic */ Command copy$default(Command command, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = command.name;
        }
        if ((i13 & 2) != 0) {
            str2 = command.description;
        }
        if ((i13 & 4) != 0) {
            str3 = command.args;
        }
        if ((i13 & 8) != 0) {
            str4 = command.set;
        }
        return command.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSet() {
        return this.set;
    }

    public final Command copy(String name, String description, String args, String set) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(set, "set");
        return new Command(name, description, args, set);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Command)) {
            return false;
        }
        Command command = (Command) other;
        return AbstractC22676k.m65745e(this.name, command.name) && AbstractC22676k.m65745e(this.description, command.description) && AbstractC22676k.m65745e(this.args, command.args) && AbstractC22676k.m65745e(this.set, command.set);
    }

    public final String getArgs() {
        return this.args;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSet() {
        return this.set;
    }

    public int hashCode() {
        return this.set.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.description), 31, this.args);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("Command(name=", str, ", description=", str2, ", args="), this.args, ", set=", this.set, ")");
    }
}
