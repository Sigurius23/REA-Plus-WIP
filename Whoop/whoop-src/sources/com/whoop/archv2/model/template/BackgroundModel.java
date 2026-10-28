package com.whoop.archv2.model.template;

import cb1.C4387a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/archv2/model/template/BackgroundModel;", "", "", QueryParams.URL, "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "theme", "<init>", "(Ljava/lang/String;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/BackgroundModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "copy", "(Ljava/lang/String;Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lcom/whoop/archv2/model/template/BackgroundModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "getTheme", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BackgroundModel {
    public static final int $stable = 0;
    private final TemplateBackgroundTheme theme;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4387a(12))};

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.BackgroundModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/BackgroundModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/BackgroundModel;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BackgroundModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundModel() {
        this((String) null, (TemplateBackgroundTheme) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return TemplateBackgroundTheme.INSTANCE.serializer();
    }

    public static /* synthetic */ BackgroundModel copy$default(BackgroundModel backgroundModel, String str, TemplateBackgroundTheme templateBackgroundTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = backgroundModel.url;
        }
        if ((i13 & 2) != 0) {
            templateBackgroundTheme = backgroundModel.theme;
        }
        return backgroundModel.copy(str, templateBackgroundTheme);
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(BackgroundModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.url != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.url);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TemplateBackgroundTheme getTheme() {
        return this.theme;
    }

    public final BackgroundModel copy(String url, TemplateBackgroundTheme theme) {
        return new BackgroundModel(url, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundModel)) {
            return false;
        }
        BackgroundModel backgroundModel = (BackgroundModel) other;
        return AbstractC22676k.m65745e(this.url, backgroundModel.url) && this.theme == backgroundModel.theme;
    }

    public final TemplateBackgroundTheme getTheme() {
        return this.theme;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TemplateBackgroundTheme templateBackgroundTheme = this.theme;
        return iHashCode + (templateBackgroundTheme != null ? templateBackgroundTheme.hashCode() : 0);
    }

    public String toString() {
        return "BackgroundModel(url=" + this.url + ", theme=" + this.theme + ")";
    }

    public /* synthetic */ BackgroundModel(int i13, String str, TemplateBackgroundTheme templateBackgroundTheme, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i13 & 2) == 0) {
            this.theme = null;
        } else {
            this.theme = templateBackgroundTheme;
        }
    }

    public BackgroundModel(String str, TemplateBackgroundTheme templateBackgroundTheme) {
        this.url = str;
        this.theme = templateBackgroundTheme;
    }

    public /* synthetic */ BackgroundModel(String str, TemplateBackgroundTheme templateBackgroundTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : templateBackgroundTheme);
    }
}
