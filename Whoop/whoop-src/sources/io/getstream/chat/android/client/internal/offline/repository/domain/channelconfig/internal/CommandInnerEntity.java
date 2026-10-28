package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0011HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;", "", "name", "", "description", "args", "set", "channelType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDescription", "getArgs", "getSet", "getChannelType", "id", "", "getId", "()I", "setId", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class CommandInnerEntity {
    private final String args;
    private final String channelType;
    private final String description;
    private int id;
    private final String name;
    private final String set;

    public CommandInnerEntity(String name, String description, String args, String set, String channelType) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(channelType, "channelType");
        this.name = name;
        this.description = description;
        this.args = args;
        this.set = set;
        this.channelType = channelType;
        this.id = hashCode();
    }

    public static /* synthetic */ CommandInnerEntity copy$default(CommandInnerEntity commandInnerEntity, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = commandInnerEntity.name;
        }
        if ((i13 & 2) != 0) {
            str2 = commandInnerEntity.description;
        }
        if ((i13 & 4) != 0) {
            str3 = commandInnerEntity.args;
        }
        if ((i13 & 8) != 0) {
            str4 = commandInnerEntity.set;
        }
        if ((i13 & 16) != 0) {
            str5 = commandInnerEntity.channelType;
        }
        String str6 = str5;
        String str7 = str3;
        return commandInnerEntity.copy(str, str2, str7, str4, str6);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getChannelType() {
        return this.channelType;
    }

    public final CommandInnerEntity copy(String name, String description, String args, String set, String channelType) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(set, "set");
        AbstractC22676k.m65750j(channelType, "channelType");
        return new CommandInnerEntity(name, description, args, set, channelType);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandInnerEntity)) {
            return false;
        }
        CommandInnerEntity commandInnerEntity = (CommandInnerEntity) other;
        return AbstractC22676k.m65745e(this.name, commandInnerEntity.name) && AbstractC22676k.m65745e(this.description, commandInnerEntity.description) && AbstractC22676k.m65745e(this.args, commandInnerEntity.args) && AbstractC22676k.m65745e(this.set, commandInnerEntity.set) && AbstractC22676k.m65745e(this.channelType, commandInnerEntity.channelType);
    }

    public final String getArgs() {
        return this.args;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSet() {
        return this.set;
    }

    public final int hashCode() {
        return this.channelType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.name.hashCode() * 31, 31, this.description), 31, this.args), 31, this.set);
    }

    public final void setId(int i13) {
        this.id = i13;
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.description;
        String str3 = this.args;
        String str4 = this.set;
        String str5 = this.channelType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CommandInnerEntity(name=", str, ", description=", str2, ", args=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", set=", str4, ", channelType=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }
}
