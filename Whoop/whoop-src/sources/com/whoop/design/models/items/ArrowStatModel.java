package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/items/ArrowStatModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "currentStatText", "historicStatText", "historicStatAlignment", "trendState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ArrowStatModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/ArrowStatModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrentStatText", "getHistoricStatText", "getHistoricStatAlignment", "getTrendState", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ArrowStatModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currentStatText;
    private final String historicStatAlignment;
    private final String historicStatText;
    private final String trendState;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ArrowStatModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ArrowStatModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ArrowStatModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ArrowStatModel(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ArrowStatModel$$serializer.INSTANCE.getDescriptor());
        }
        this.currentStatText = str;
        this.historicStatText = str2;
        this.historicStatAlignment = str3;
        this.trendState = str4;
    }

    public static /* synthetic */ ArrowStatModel copy$default(ArrowStatModel arrowStatModel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = arrowStatModel.currentStatText;
        }
        if ((i13 & 2) != 0) {
            str2 = arrowStatModel.historicStatText;
        }
        if ((i13 & 4) != 0) {
            str3 = arrowStatModel.historicStatAlignment;
        }
        if ((i13 & 8) != 0) {
            str4 = arrowStatModel.trendState;
        }
        return arrowStatModel.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ArrowStatModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.currentStatText);
        output.encodeStringElement(serialDesc, 1, self.historicStatText);
        output.encodeStringElement(serialDesc, 2, self.historicStatAlignment);
        output.encodeStringElement(serialDesc, 3, self.trendState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentStatText() {
        return this.currentStatText;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHistoricStatText() {
        return this.historicStatText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHistoricStatAlignment() {
        return this.historicStatAlignment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrendState() {
        return this.trendState;
    }

    public final ArrowStatModel copy(String currentStatText, String historicStatText, String historicStatAlignment, String trendState) {
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(historicStatText, "historicStatText");
        AbstractC22676k.m65750j(historicStatAlignment, "historicStatAlignment");
        AbstractC22676k.m65750j(trendState, "trendState");
        return new ArrowStatModel(currentStatText, historicStatText, historicStatAlignment, trendState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArrowStatModel)) {
            return false;
        }
        ArrowStatModel arrowStatModel = (ArrowStatModel) other;
        return AbstractC22676k.m65745e(this.currentStatText, arrowStatModel.currentStatText) && AbstractC22676k.m65745e(this.historicStatText, arrowStatModel.historicStatText) && AbstractC22676k.m65745e(this.historicStatAlignment, arrowStatModel.historicStatAlignment) && AbstractC22676k.m65745e(this.trendState, arrowStatModel.trendState);
    }

    public final String getCurrentStatText() {
        return this.currentStatText;
    }

    public final String getHistoricStatAlignment() {
        return this.historicStatAlignment;
    }

    public final String getHistoricStatText() {
        return this.historicStatText;
    }

    public final String getTrendState() {
        return this.trendState;
    }

    public int hashCode() {
        return this.trendState.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.currentStatText.hashCode() * 31, 31, this.historicStatText), 31, this.historicStatAlignment);
    }

    public String toString() {
        String str = this.currentStatText;
        String str2 = this.historicStatText;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("ArrowStatModel(currentStatText=", str, ", historicStatText=", str2, ", historicStatAlignment="), this.historicStatAlignment, ", trendState=", this.trendState, ")");
    }

    public ArrowStatModel(String currentStatText, String historicStatText, String historicStatAlignment, String trendState) {
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(historicStatText, "historicStatText");
        AbstractC22676k.m65750j(historicStatAlignment, "historicStatAlignment");
        AbstractC22676k.m65750j(trendState, "trendState");
        this.currentStatText = currentStatText;
        this.historicStatText = historicStatText;
        this.historicStatAlignment = historicStatAlignment;
        this.trendState = trendState;
    }
}
