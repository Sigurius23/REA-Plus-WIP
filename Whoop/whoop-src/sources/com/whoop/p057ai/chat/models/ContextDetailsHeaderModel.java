package com.whoop.p057ai.chat.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.MarkdownTextModel;
import com.whoop.design.models.MarkdownTextModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00065"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "Lcom/whoop/design/models/MarkdownTextModel;", "description", "", "Lcom/whoop/ai/chat/models/ContextDetailsHeaderTagModel;", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/MarkdownTextModel;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/MarkdownTextModel;Ljava/util/List;)Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/design/models/MarkdownTextModel;", "getDescription", "Ljava/util/List;", "getTags", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContextDetailsHeaderModel implements DesignSystemModel {
    private final MarkdownTextModel description;
    private final String subtitle;
    private final List<ContextDetailsHeaderTagModel> tags;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38138a(23))};

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.ContextDetailsHeaderModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/ContextDetailsHeaderModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContextDetailsHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContextDetailsHeaderModel(int i13, String str, String str2, MarkdownTextModel markdownTextModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, ContextDetailsHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        if ((i13 & 4) == 0) {
            this.description = null;
        } else {
            this.description = markdownTextModel;
        }
        this.tags = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ContextDetailsHeaderTagModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContextDetailsHeaderModel copy$default(ContextDetailsHeaderModel contextDetailsHeaderModel, String str, String str2, MarkdownTextModel markdownTextModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contextDetailsHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = contextDetailsHeaderModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            markdownTextModel = contextDetailsHeaderModel.description;
        }
        if ((i13 & 8) != 0) {
            list = contextDetailsHeaderModel.tags;
        }
        return contextDetailsHeaderModel.copy(str, str2, markdownTextModel, list);
    }

    public static final /* synthetic */ void write$Self$bot_release(ContextDetailsHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.description != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, MarkdownTextModel$$serializer.INSTANCE, self.description);
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.tags);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MarkdownTextModel getDescription() {
        return this.description;
    }

    public final List<ContextDetailsHeaderTagModel> component4() {
        return this.tags;
    }

    public final ContextDetailsHeaderModel copy(String title, String subtitle, MarkdownTextModel description, List<ContextDetailsHeaderTagModel> tags) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tags, "tags");
        return new ContextDetailsHeaderModel(title, subtitle, description, tags);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextDetailsHeaderModel)) {
            return false;
        }
        ContextDetailsHeaderModel contextDetailsHeaderModel = (ContextDetailsHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, contextDetailsHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, contextDetailsHeaderModel.subtitle) && AbstractC22676k.m65745e(this.description, contextDetailsHeaderModel.description) && AbstractC22676k.m65745e(this.tags, contextDetailsHeaderModel.tags);
    }

    public final MarkdownTextModel getDescription() {
        return this.description;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ContextDetailsHeaderTagModel> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle);
        MarkdownTextModel markdownTextModel = this.description;
        return this.tags.hashCode() + ((iM30450d + (markdownTextModel == null ? 0 : markdownTextModel.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        MarkdownTextModel markdownTextModel = this.description;
        List<ContextDetailsHeaderTagModel> list = this.tags;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContextDetailsHeaderModel(title=", str, ", subtitle=", str2, ", description=");
        sbM32001t.append(markdownTextModel);
        sbM32001t.append(", tags=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ContextDetailsHeaderModel(String title, String subtitle, MarkdownTextModel markdownTextModel, List<ContextDetailsHeaderTagModel> tags) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tags, "tags");
        this.title = title;
        this.subtitle = subtitle;
        this.description = markdownTextModel;
        this.tags = tags;
    }

    public /* synthetic */ ContextDetailsHeaderModel(String str, String str2, MarkdownTextModel markdownTextModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : markdownTextModel, list);
    }
}
