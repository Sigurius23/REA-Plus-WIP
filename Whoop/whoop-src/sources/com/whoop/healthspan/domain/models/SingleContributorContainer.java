package com.whoop.healthspan.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J:\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b\b\u0010 ¨\u00061"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/SingleContributorContainer;", "", "", "titleDisplay", "", "isEnabled", "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "content", "isOpen", "<init>", "(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$healthspan_release", "(Lcom/whoop/healthspan/domain/models/SingleContributorContainer;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "component4", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;ZLcom/whoop/healthspan/domain/models/SingleContributorContainerContent;Ljava/lang/Boolean;)Lcom/whoop/healthspan/domain/models/SingleContributorContainer;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Z", "Lcom/whoop/healthspan/domain/models/SingleContributorContainerContent;", "getContent", "Ljava/lang/Boolean;", "Companion", "$serializer", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SingleContributorContainer {
    private final SingleContributorContainerContent content;
    private final boolean isEnabled;
    private final Boolean isOpen;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/healthspan/domain/models/SingleContributorContainer$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/healthspan/domain/models/SingleContributorContainer;", "serializer", "()Lwc3/c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SingleContributorContainer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SingleContributorContainer(int i13, String str, boolean z4, SingleContributorContainerContent singleContributorContainerContent, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SingleContributorContainer$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.isEnabled = z4;
        this.content = singleContributorContainerContent;
        this.isOpen = bool;
    }

    public static /* synthetic */ SingleContributorContainer copy$default(SingleContributorContainer singleContributorContainer, String str, boolean z4, SingleContributorContainerContent singleContributorContainerContent, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = singleContributorContainer.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            z4 = singleContributorContainer.isEnabled;
        }
        if ((i13 & 4) != 0) {
            singleContributorContainerContent = singleContributorContainer.content;
        }
        if ((i13 & 8) != 0) {
            bool = singleContributorContainer.isOpen;
        }
        return singleContributorContainer.copy(str, z4, singleContributorContainerContent, bool);
    }

    public static final /* synthetic */ void write$Self$healthspan_release(SingleContributorContainer self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeBooleanElement(serialDesc, 1, self.isEnabled);
        output.encodeSerializableElement(serialDesc, 2, SingleContributorContainerContent$$serializer.INSTANCE, self.content);
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.isOpen);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SingleContributorContainerContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsOpen() {
        return this.isOpen;
    }

    public final SingleContributorContainer copy(String titleDisplay, boolean isEnabled, SingleContributorContainerContent content, Boolean isOpen) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(content, "content");
        return new SingleContributorContainer(titleDisplay, isEnabled, content, isOpen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleContributorContainer)) {
            return false;
        }
        SingleContributorContainer singleContributorContainer = (SingleContributorContainer) other;
        return AbstractC22676k.m65745e(this.titleDisplay, singleContributorContainer.titleDisplay) && this.isEnabled == singleContributorContainer.isEnabled && AbstractC22676k.m65745e(this.content, singleContributorContainer.content) && AbstractC22676k.m65745e(this.isOpen, singleContributorContainer.isOpen);
    }

    public final SingleContributorContainerContent getContent() {
        return this.content;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iHashCode = (this.content.hashCode() + AbstractC2875y.m8289b(this.titleDisplay.hashCode() * 31, 31, this.isEnabled)) * 31;
        Boolean bool = this.isOpen;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final Boolean isOpen() {
        return this.isOpen;
    }

    public String toString() {
        String str = this.titleDisplay;
        boolean z4 = this.isEnabled;
        SingleContributorContainerContent singleContributorContainerContent = this.content;
        Boolean bool = this.isOpen;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("SingleContributorContainer(titleDisplay=", str, ", isEnabled=", ", content=", z4);
        sbM73379l.append(singleContributorContainerContent);
        sbM73379l.append(", isOpen=");
        sbM73379l.append(bool);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    public SingleContributorContainer(String titleDisplay, boolean z4, SingleContributorContainerContent content, Boolean bool) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(content, "content");
        this.titleDisplay = titleDisplay;
        this.isEnabled = z4;
        this.content = content;
        this.isOpen = bool;
    }
}
