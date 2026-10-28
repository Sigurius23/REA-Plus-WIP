package com.whoop.navigation;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/navigation/DeepDiveScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "pillar", HttpHeaders.DATE, "source", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/DeepDiveScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/DeepDiveScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPillar", "getDate", "getSource", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DeepDiveScreenModel implements CommonNavigationScreenModel {
    private final AiAction aiAction;
    private final String date;
    private final String pillar;
    private final String source;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.DeepDiveScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/DeepDiveScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/DeepDiveScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DeepDiveScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeepDiveScreenModel(int i13, String str, String str2, String str3, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DeepDiveScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.pillar = str;
        this.date = str2;
        this.source = str3;
        if ((i13 & 8) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public static /* synthetic */ DeepDiveScreenModel copy$default(DeepDiveScreenModel deepDiveScreenModel, String str, String str2, String str3, AiAction aiAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = deepDiveScreenModel.pillar;
        }
        if ((i13 & 2) != 0) {
            str2 = deepDiveScreenModel.date;
        }
        if ((i13 & 4) != 0) {
            str3 = deepDiveScreenModel.source;
        }
        if ((i13 & 8) != 0) {
            aiAction = deepDiveScreenModel.aiAction;
        }
        return deepDiveScreenModel.copy(str, str2, str3, aiAction);
    }

    public static final /* synthetic */ void write$Self$navigation_release(DeepDiveScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.pillar);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.date);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.source);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPillar() {
        return this.pillar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final DeepDiveScreenModel copy(String pillar, String date, String source, AiAction aiAction) {
        AbstractC22676k.m65750j(pillar, "pillar");
        return new DeepDiveScreenModel(pillar, date, source, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeepDiveScreenModel)) {
            return false;
        }
        DeepDiveScreenModel deepDiveScreenModel = (DeepDiveScreenModel) other;
        return AbstractC22676k.m65745e(this.pillar, deepDiveScreenModel.pillar) && AbstractC22676k.m65745e(this.date, deepDiveScreenModel.date) && AbstractC22676k.m65745e(this.source, deepDiveScreenModel.source) && AbstractC22676k.m65745e(this.aiAction, deepDiveScreenModel.aiAction);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getPillar() {
        return this.pillar;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iHashCode = this.pillar.hashCode() * 31;
        String str = this.date;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        return iHashCode3 + (aiAction != null ? aiAction.hashCode() : 0);
    }

    public String toString() {
        String str = this.pillar;
        String str2 = this.date;
        String str3 = this.source;
        AiAction aiAction = this.aiAction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DeepDiveScreenModel(pillar=", str, ", date=", str2, ", source=");
        sbM32001t.append(str3);
        sbM32001t.append(", aiAction=");
        sbM32001t.append(aiAction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public DeepDiveScreenModel(String pillar, String str, String str2, AiAction aiAction) {
        AbstractC22676k.m65750j(pillar, "pillar");
        this.pillar = pillar;
        this.date = str;
        this.source = str2;
        this.aiAction = aiAction;
    }

    public /* synthetic */ DeepDiveScreenModel(String str, String str2, String str3, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : aiAction);
    }
}
