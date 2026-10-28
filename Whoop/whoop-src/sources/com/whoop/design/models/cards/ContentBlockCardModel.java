package com.whoop.design.models.cards;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b\u0006\u0010\u001b¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/cards/ContentBlockCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "contentDisplay", "", "isMarkdown", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/ContentBlockCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/design/models/cards/ContentBlockCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getContentDisplay", "Ljava/lang/Boolean;", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContentBlockCardModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String contentDisplay;
    private final Boolean isMarkdown;
    private final String titleDisplay;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/ContentBlockCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/ContentBlockCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContentBlockCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContentBlockCardModel(int i13, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ContentBlockCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.contentDisplay = str2;
        this.isMarkdown = bool;
    }

    public static /* synthetic */ ContentBlockCardModel copy$default(ContentBlockCardModel contentBlockCardModel, String str, String str2, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contentBlockCardModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = contentBlockCardModel.contentDisplay;
        }
        if ((i13 & 4) != 0) {
            bool = contentBlockCardModel.isMarkdown;
        }
        return contentBlockCardModel.copy(str, str2, bool);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ContentBlockCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.contentDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.isMarkdown);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentDisplay() {
        return this.contentDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsMarkdown() {
        return this.isMarkdown;
    }

    public final ContentBlockCardModel copy(String titleDisplay, String contentDisplay, Boolean isMarkdown) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(contentDisplay, "contentDisplay");
        return new ContentBlockCardModel(titleDisplay, contentDisplay, isMarkdown);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentBlockCardModel)) {
            return false;
        }
        ContentBlockCardModel contentBlockCardModel = (ContentBlockCardModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, contentBlockCardModel.titleDisplay) && AbstractC22676k.m65745e(this.contentDisplay, contentBlockCardModel.contentDisplay) && AbstractC22676k.m65745e(this.isMarkdown, contentBlockCardModel.isMarkdown);
    }

    public final String getContentDisplay() {
        return this.contentDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.contentDisplay);
        Boolean bool = this.isMarkdown;
        return iM30450d + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isMarkdown() {
        return this.isMarkdown;
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.contentDisplay;
        return AbstractC11478a.m30858j(AbstractC11895b.m32001t("ContentBlockCardModel(titleDisplay=", str, ", contentDisplay=", str2, ", isMarkdown="), this.isMarkdown, ")");
    }

    public ContentBlockCardModel(String titleDisplay, String contentDisplay, Boolean bool) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(contentDisplay, "contentDisplay");
        this.titleDisplay = titleDisplay;
        this.contentDisplay = contentDisplay;
        this.isMarkdown = bool;
    }
}
