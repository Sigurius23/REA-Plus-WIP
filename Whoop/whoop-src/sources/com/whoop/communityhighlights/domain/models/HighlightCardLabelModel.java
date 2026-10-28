package com.whoop.communityhighlights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lr0.EnumC24695b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.C24676h;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;", "", "", "text", "Llr0/b;", "style", "<init>", "(Ljava/lang/String;Llr0/b;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Llr0/b;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_highlights_release", "(Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Llr0/b;", "copy", "(Ljava/lang/String;Llr0/b;)Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Llr0/b;", "getStyle", "Companion", "$serializer", "a", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HighlightCardLabelModel {
    public static final int $stable = 0;
    private final EnumC24695b style;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24676h(20))};

    /* JADX INFO: renamed from: com.whoop.communityhighlights.domain.models.HighlightCardLabelModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityhighlights/domain/models/HighlightCardLabelModel;", "serializer", "()Lwc3/c;", "community-highlights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HighlightCardLabelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HighlightCardLabelModel(int i13, String str, EnumC24695b enumC24695b, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, HighlightCardLabelModel$$serializer.INSTANCE.getDescriptor());
        }
        this.text = str;
        if ((i13 & 2) == 0) {
            this.style = EnumC24695b.DARK;
        } else {
            this.style = enumC24695b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.communityhighlights.domain.models.HighlightCardLabelStyle", EnumC24695b.values());
    }

    public static /* synthetic */ HighlightCardLabelModel copy$default(HighlightCardLabelModel highlightCardLabelModel, String str, EnumC24695b enumC24695b, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = highlightCardLabelModel.text;
        }
        if ((i13 & 2) != 0) {
            enumC24695b = highlightCardLabelModel.style;
        }
        return highlightCardLabelModel.copy(str, enumC24695b);
    }

    public static final /* synthetic */ void write$Self$community_highlights_release(HighlightCardLabelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.text);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.style == EnumC24695b.DARK) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC24695b getStyle() {
        return this.style;
    }

    public final HighlightCardLabelModel copy(String text, EnumC24695b style) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        return new HighlightCardLabelModel(text, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighlightCardLabelModel)) {
            return false;
        }
        HighlightCardLabelModel highlightCardLabelModel = (HighlightCardLabelModel) other;
        return AbstractC22676k.m65745e(this.text, highlightCardLabelModel.text) && this.style == highlightCardLabelModel.style;
    }

    public final EnumC24695b getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.style.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return "HighlightCardLabelModel(text=" + this.text + ", style=" + this.style + ")";
    }

    public HighlightCardLabelModel(String text, EnumC24695b style) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(style, "style");
        this.text = text;
        this.style = style;
    }

    public /* synthetic */ HighlightCardLabelModel(String str, EnumC24695b enumC24695b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? EnumC24695b.DARK : enumC24695b);
    }
}
