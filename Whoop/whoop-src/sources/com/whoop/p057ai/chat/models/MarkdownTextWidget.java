package com.whoop.p057ai.chat.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006."}, m65681d2 = {"Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "Lcom/whoop/design/models/DesignSystemModel;", "", "text", "", "textHash", "", "fadeInReveal", "<init>", "(Ljava/lang/String;IZ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/MarkdownTextWidget;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "()Z", "copy", "(Ljava/lang/String;IZ)Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "I", "getTextHash", "Z", "getFadeInReveal", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MarkdownTextWidget implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean fadeInReveal;
    private final String text;
    private final int textHash;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.MarkdownTextWidget$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/MarkdownTextWidget$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/MarkdownTextWidget;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MarkdownTextWidget$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MarkdownTextWidget(int i13, String str, int i14, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, MarkdownTextWidget$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i13 & 2) == 0) {
            this.textHash = str.hashCode();
        } else {
            this.textHash = i14;
        }
        if ((i13 & 4) == 0) {
            this.fadeInReveal = false;
        } else {
            this.fadeInReveal = z4;
        }
    }

    public static /* synthetic */ MarkdownTextWidget copy$default(MarkdownTextWidget markdownTextWidget, String str, int i13, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = markdownTextWidget.text;
        }
        if ((i14 & 2) != 0) {
            i13 = markdownTextWidget.textHash;
        }
        if ((i14 & 4) != 0) {
            z4 = markdownTextWidget.fadeInReveal;
        }
        return markdownTextWidget.copy(str, i13, z4);
    }

    public static final /* synthetic */ void write$Self$bot_release(MarkdownTextWidget self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.textHash != self.text.hashCode()) {
            output.encodeIntElement(serialDesc, 1, self.textHash);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.fadeInReveal) {
            output.encodeBooleanElement(serialDesc, 2, self.fadeInReveal);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTextHash() {
        return this.textHash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFadeInReveal() {
        return this.fadeInReveal;
    }

    public final MarkdownTextWidget copy(String text, int textHash, boolean fadeInReveal) {
        AbstractC22676k.m65750j(text, "text");
        return new MarkdownTextWidget(text, textHash, fadeInReveal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkdownTextWidget)) {
            return false;
        }
        MarkdownTextWidget markdownTextWidget = (MarkdownTextWidget) other;
        return AbstractC22676k.m65745e(this.text, markdownTextWidget.text) && this.textHash == markdownTextWidget.textHash && this.fadeInReveal == markdownTextWidget.fadeInReveal;
    }

    public final boolean getFadeInReveal() {
        return this.fadeInReveal;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextHash() {
        return this.textHash;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fadeInReveal) + AbstractC11266d.m30448b(this.textHash, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.text;
        int i13 = this.textHash;
        return AbstractC18489d0.m53372m(AbstractC11266d.m30467u(i13, "MarkdownTextWidget(text=", str, ", textHash=", ", fadeInReveal="), this.fadeInReveal, ")");
    }

    public MarkdownTextWidget(String text, int i13, boolean z4) {
        AbstractC22676k.m65750j(text, "text");
        this.text = text;
        this.textHash = i13;
        this.fadeInReveal = z4;
    }

    public /* synthetic */ MarkdownTextWidget(String str, int i13, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? str.hashCode() : i13, (i14 & 4) != 0 ? false : z4);
    }
}
