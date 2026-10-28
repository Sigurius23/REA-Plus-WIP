package com.whoop.sanguine.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;", "Lcom/whoop/design/models/DesignSystemModel;", "", "headerText", "bodyText", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sanguine_release", "(Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeaderText", "getBodyText", "Ljava/util/List;", "getContent", "Companion", "$serializer", "a", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SanguineWaitlistSection implements DesignSystemModel {
    private final String bodyText;
    private final List<DesignSystemModel> content;
    private final String headerText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34260e(12))};

    /* JADX INFO: renamed from: com.whoop.sanguine.domain.models.SanguineWaitlistSection$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sanguine/domain/models/SanguineWaitlistSection;", "serializer", "()Lwc3/c;", "sanguine_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SanguineWaitlistSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SanguineWaitlistSection() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SanguineWaitlistSection copy$default(SanguineWaitlistSection sanguineWaitlistSection, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sanguineWaitlistSection.headerText;
        }
        if ((i13 & 2) != 0) {
            str2 = sanguineWaitlistSection.bodyText;
        }
        if ((i13 & 4) != 0) {
            list = sanguineWaitlistSection.content;
        }
        return sanguineWaitlistSection.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$sanguine_release(SanguineWaitlistSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.headerText != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.headerText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.bodyText != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.bodyText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.content, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.content);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    public final List<DesignSystemModel> component3() {
        return this.content;
    }

    public final SanguineWaitlistSection copy(String headerText, String bodyText, List<? extends DesignSystemModel> content) {
        AbstractC22676k.m65750j(content, "content");
        return new SanguineWaitlistSection(headerText, bodyText, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SanguineWaitlistSection)) {
            return false;
        }
        SanguineWaitlistSection sanguineWaitlistSection = (SanguineWaitlistSection) other;
        return AbstractC22676k.m65745e(this.headerText, sanguineWaitlistSection.headerText) && AbstractC22676k.m65745e(this.bodyText, sanguineWaitlistSection.bodyText) && AbstractC22676k.m65745e(this.content, sanguineWaitlistSection.content);
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final List<DesignSystemModel> getContent() {
        return this.content;
    }

    public final String getHeaderText() {
        return this.headerText;
    }

    public int hashCode() {
        String str = this.headerText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyText;
        return this.content.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.headerText;
        String str2 = this.bodyText;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("SanguineWaitlistSection(headerText=", str, ", bodyText=", str2, ", content="), this.content, ")");
    }

    public /* synthetic */ SanguineWaitlistSection(int i13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.headerText = null;
        } else {
            this.headerText = str;
        }
        if ((i13 & 2) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str2;
        }
        if ((i13 & 4) == 0) {
            this.content = C25271y.f99162w;
        } else {
            this.content = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SanguineWaitlistSection(String str, String str2, List<? extends DesignSystemModel> content) {
        AbstractC22676k.m65750j(content, "content");
        this.headerText = str;
        this.bodyText = str2;
        this.content = content;
    }

    public /* synthetic */ SanguineWaitlistSection(String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
