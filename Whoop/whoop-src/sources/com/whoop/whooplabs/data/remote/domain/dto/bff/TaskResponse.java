package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fB}\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010 J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0084\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010 J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b5\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b6\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b7\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b8\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b9\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b:\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b;\u0010 R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b<\u0010 ¨\u0006?"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;", "", "", "sessionId", "", "title", "subtitle", "suffixTitle", "suffixSubtitle", "suffixType", "leftIcon", "rightIcon", "menuItemState", "style", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSessionId", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSuffixTitle", "getSuffixSubtitle", "getSuffixType", "getLeftIcon", "getRightIcon", "getMenuItemState", "getStyle", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TaskResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String leftIcon;
    private final String menuItemState;
    private final String rightIcon;
    private final int sessionId;
    private final String style;
    private final String subtitle;
    private final String suffixSubtitle;
    private final String suffixTitle;
    private final String suffixType;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/TaskResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TaskResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TaskResponse(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, TaskResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = i14;
        this.title = str;
        this.subtitle = str2;
        this.suffixTitle = str3;
        this.suffixSubtitle = str4;
        this.suffixType = str5;
        this.leftIcon = str6;
        this.rightIcon = str7;
        this.menuItemState = str8;
        this.style = str9;
    }

    public static /* synthetic */ TaskResponse copy$default(TaskResponse taskResponse, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = taskResponse.sessionId;
        }
        if ((i14 & 2) != 0) {
            str = taskResponse.title;
        }
        if ((i14 & 4) != 0) {
            str2 = taskResponse.subtitle;
        }
        if ((i14 & 8) != 0) {
            str3 = taskResponse.suffixTitle;
        }
        if ((i14 & 16) != 0) {
            str4 = taskResponse.suffixSubtitle;
        }
        if ((i14 & 32) != 0) {
            str5 = taskResponse.suffixType;
        }
        if ((i14 & 64) != 0) {
            str6 = taskResponse.leftIcon;
        }
        if ((i14 & 128) != 0) {
            str7 = taskResponse.rightIcon;
        }
        if ((i14 & 256) != 0) {
            str8 = taskResponse.menuItemState;
        }
        if ((i14 & 512) != 0) {
            str9 = taskResponse.style;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str4;
        String str15 = str5;
        return taskResponse.copy(i13, str, str2, str3, str14, str15, str12, str13, str10, str11);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(TaskResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.sessionId);
        output.encodeStringElement(serialDesc, 1, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.suffixTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.suffixSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.suffixType);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.rightIcon);
        output.encodeNullableSerializableElement(serialDesc, 8, stringSerializer, self.menuItemState);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSuffixType() {
        return this.suffixType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMenuItemState() {
        return this.menuItemState;
    }

    public final TaskResponse copy(int sessionId, String title, String subtitle, String suffixTitle, String suffixSubtitle, String suffixType, String leftIcon, String rightIcon, String menuItemState, String style) {
        AbstractC22676k.m65750j(title, "title");
        return new TaskResponse(sessionId, title, subtitle, suffixTitle, suffixSubtitle, suffixType, leftIcon, rightIcon, menuItemState, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskResponse)) {
            return false;
        }
        TaskResponse taskResponse = (TaskResponse) other;
        return this.sessionId == taskResponse.sessionId && AbstractC22676k.m65745e(this.title, taskResponse.title) && AbstractC22676k.m65745e(this.subtitle, taskResponse.subtitle) && AbstractC22676k.m65745e(this.suffixTitle, taskResponse.suffixTitle) && AbstractC22676k.m65745e(this.suffixSubtitle, taskResponse.suffixSubtitle) && AbstractC22676k.m65745e(this.suffixType, taskResponse.suffixType) && AbstractC22676k.m65745e(this.leftIcon, taskResponse.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, taskResponse.rightIcon) && AbstractC22676k.m65745e(this.menuItemState, taskResponse.menuItemState) && AbstractC22676k.m65745e(this.style, taskResponse.style);
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getMenuItemState() {
        return this.menuItemState;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    public final String getSuffixType() {
        return this.suffixType;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.sessionId) * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suffixTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffixSubtitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.suffixType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.leftIcon;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rightIcon;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.menuItemState;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.style;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.sessionId;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.suffixTitle;
        String str4 = this.suffixSubtitle;
        String str5 = this.suffixType;
        String str6 = this.leftIcon;
        String str7 = this.rightIcon;
        String str8 = this.menuItemState;
        String str9 = this.style;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TaskResponse(sessionId=", ", title=", str, ", subtitle=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", suffixTitle=", str3, ", suffixSubtitle=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", suffixType=", str5, ", leftIcon=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", rightIcon=", str7, ", menuItemState=");
        return AbstractC11266d.m30464r(sbM53373n, str8, ", style=", str9, ")");
    }

    public TaskResponse(int i13, String title, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC22676k.m65750j(title, "title");
        this.sessionId = i13;
        this.title = title;
        this.subtitle = str;
        this.suffixTitle = str2;
        this.suffixSubtitle = str3;
        this.suffixType = str4;
        this.leftIcon = str5;
        this.rightIcon = str6;
        this.menuItemState = str7;
        this.style = str8;
    }
}
