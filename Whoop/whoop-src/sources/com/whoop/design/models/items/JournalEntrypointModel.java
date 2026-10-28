package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36960g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,Jl\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010,¨\u0006F"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalEntrypointModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "icon", "title", "Lcom/whoop/design/models/items/JournalEntrypointState;", "state", "cta", "bodyText", "Lcom/whoop/design/models/items/JournalEntrypointTagModel;", "actionTag", "", "Lcom/whoop/design/models/items/JournalEntrypointBehaviorTagModel;", "behaviorTags", "Lcom/whoop/design/models/items/JournalEntrypointNoteModel;", "note", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/JournalEntrypointModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/JournalEntrypointState;", "component4", "component5", "component6", "()Lcom/whoop/design/models/items/JournalEntrypointTagModel;", "component7", "()Ljava/util/List;", "component8", "()Lcom/whoop/design/models/items/JournalEntrypointNoteModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointState;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntrypointTagModel;Ljava/util/List;Lcom/whoop/design/models/items/JournalEntrypointNoteModel;)Lcom/whoop/design/models/items/JournalEntrypointModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "Lcom/whoop/design/models/items/JournalEntrypointState;", "getState", "getCta", "getBodyText", "Lcom/whoop/design/models/items/JournalEntrypointTagModel;", "getActionTag", "Ljava/util/List;", "getBehaviorTags", "Lcom/whoop/design/models/items/JournalEntrypointNoteModel;", "getNote", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalEntrypointModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final JournalEntrypointTagModel actionTag;
    private final List<JournalEntrypointBehaviorTagModel> behaviorTags;
    private final String bodyText;
    private final String cta;
    private final String icon;
    private final JournalEntrypointNoteModel note;
    private final JournalEntrypointState state;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalEntrypointModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/JournalEntrypointModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalEntrypointModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36960g(2)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36960g(3)), null};
    }

    public /* synthetic */ JournalEntrypointModel(int i13, String str, String str2, JournalEntrypointState journalEntrypointState, String str3, String str4, JournalEntrypointTagModel journalEntrypointTagModel, List list, JournalEntrypointNoteModel journalEntrypointNoteModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, JournalEntrypointModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.state = journalEntrypointState;
        this.cta = str3;
        this.bodyText = str4;
        this.actionTag = journalEntrypointTagModel;
        this.behaviorTags = list;
        this.note = journalEntrypointNoteModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.JournalEntrypointState", JournalEntrypointState.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(JournalEntrypointBehaviorTagModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalEntrypointModel copy$default(JournalEntrypointModel journalEntrypointModel, String str, String str2, JournalEntrypointState journalEntrypointState, String str3, String str4, JournalEntrypointTagModel journalEntrypointTagModel, List list, JournalEntrypointNoteModel journalEntrypointNoteModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalEntrypointModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = journalEntrypointModel.title;
        }
        if ((i13 & 4) != 0) {
            journalEntrypointState = journalEntrypointModel.state;
        }
        if ((i13 & 8) != 0) {
            str3 = journalEntrypointModel.cta;
        }
        if ((i13 & 16) != 0) {
            str4 = journalEntrypointModel.bodyText;
        }
        if ((i13 & 32) != 0) {
            journalEntrypointTagModel = journalEntrypointModel.actionTag;
        }
        if ((i13 & 64) != 0) {
            list = journalEntrypointModel.behaviorTags;
        }
        if ((i13 & 128) != 0) {
            journalEntrypointNoteModel = journalEntrypointModel.note;
        }
        List list2 = list;
        JournalEntrypointNoteModel journalEntrypointNoteModel2 = journalEntrypointNoteModel;
        String str5 = str4;
        JournalEntrypointTagModel journalEntrypointTagModel2 = journalEntrypointTagModel;
        return journalEntrypointModel.copy(str, str2, journalEntrypointState, str3, str5, journalEntrypointTagModel2, list2, journalEntrypointNoteModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(JournalEntrypointModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.state);
        output.encodeStringElement(serialDesc, 3, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.bodyText);
        output.encodeNullableSerializableElement(serialDesc, 5, JournalEntrypointTagModel$$serializer.INSTANCE, self.actionTag);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.behaviorTags);
        output.encodeNullableSerializableElement(serialDesc, 7, JournalEntrypointNoteModel$$serializer.INSTANCE, self.note);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final JournalEntrypointState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final JournalEntrypointTagModel getActionTag() {
        return this.actionTag;
    }

    public final List<JournalEntrypointBehaviorTagModel> component7() {
        return this.behaviorTags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final JournalEntrypointNoteModel getNote() {
        return this.note;
    }

    public final JournalEntrypointModel copy(String icon, String title, JournalEntrypointState state, String cta, String bodyText, JournalEntrypointTagModel actionTag, List<JournalEntrypointBehaviorTagModel> behaviorTags, JournalEntrypointNoteModel note) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(behaviorTags, "behaviorTags");
        return new JournalEntrypointModel(icon, title, state, cta, bodyText, actionTag, behaviorTags, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntrypointModel)) {
            return false;
        }
        JournalEntrypointModel journalEntrypointModel = (JournalEntrypointModel) other;
        return AbstractC22676k.m65745e(this.icon, journalEntrypointModel.icon) && AbstractC22676k.m65745e(this.title, journalEntrypointModel.title) && this.state == journalEntrypointModel.state && AbstractC22676k.m65745e(this.cta, journalEntrypointModel.cta) && AbstractC22676k.m65745e(this.bodyText, journalEntrypointModel.bodyText) && AbstractC22676k.m65745e(this.actionTag, journalEntrypointModel.actionTag) && AbstractC22676k.m65745e(this.behaviorTags, journalEntrypointModel.behaviorTags) && AbstractC22676k.m65745e(this.note, journalEntrypointModel.note);
    }

    public final JournalEntrypointTagModel getActionTag() {
        return this.actionTag;
    }

    public final List<JournalEntrypointBehaviorTagModel> getBehaviorTags() {
        return this.behaviorTags;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final JournalEntrypointNoteModel getNote() {
        return this.note;
    }

    public final JournalEntrypointState getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.state.hashCode() + AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title)) * 31, 31, this.cta);
        String str = this.bodyText;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        JournalEntrypointTagModel journalEntrypointTagModel = this.actionTag;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (journalEntrypointTagModel == null ? 0 : journalEntrypointTagModel.hashCode())) * 31, 31, this.behaviorTags);
        JournalEntrypointNoteModel journalEntrypointNoteModel = this.note;
        return iM31983b + (journalEntrypointNoteModel != null ? journalEntrypointNoteModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        JournalEntrypointState journalEntrypointState = this.state;
        String str3 = this.cta;
        String str4 = this.bodyText;
        JournalEntrypointTagModel journalEntrypointTagModel = this.actionTag;
        List<JournalEntrypointBehaviorTagModel> list = this.behaviorTags;
        JournalEntrypointNoteModel journalEntrypointNoteModel = this.note;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalEntrypointModel(icon=", str, ", title=", str2, ", state=");
        sbM32001t.append(journalEntrypointState);
        sbM32001t.append(", cta=");
        sbM32001t.append(str3);
        sbM32001t.append(", bodyText=");
        sbM32001t.append(str4);
        sbM32001t.append(", actionTag=");
        sbM32001t.append(journalEntrypointTagModel);
        sbM32001t.append(", behaviorTags=");
        sbM32001t.append(list);
        sbM32001t.append(", note=");
        sbM32001t.append(journalEntrypointNoteModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public JournalEntrypointModel(String icon, String title, JournalEntrypointState state, String cta, String str, JournalEntrypointTagModel journalEntrypointTagModel, List<JournalEntrypointBehaviorTagModel> behaviorTags, JournalEntrypointNoteModel journalEntrypointNoteModel) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(behaviorTags, "behaviorTags");
        this.icon = icon;
        this.title = title;
        this.state = state;
        this.cta = cta;
        this.bodyText = str;
        this.actionTag = journalEntrypointTagModel;
        this.behaviorTags = behaviorTags;
        this.note = journalEntrypointNoteModel;
    }
}
