package com.whoop.feedbacksurvey.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "", "insetBottom", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$feedback_survey_release", "(Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getInsetBottom", "getInsetBottom$annotations", "()V", "Companion", "$serializer", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeedbackSurveySectionModel {
    private final String insetBottom;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(13)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;", "serializer", "()Lwc3/c;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeedbackSurveySectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FeedbackSurveySectionModel(int i13, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, FeedbackSurveySectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        this.insetBottom = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackSurveySectionModel copy$default(FeedbackSurveySectionModel feedbackSurveySectionModel, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = feedbackSurveySectionModel.items;
        }
        if ((i13 & 2) != 0) {
            str = feedbackSurveySectionModel.insetBottom;
        }
        return feedbackSurveySectionModel.copy(list, str);
    }

    @InterfaceC37143h("section_type")
    public static /* synthetic */ void getInsetBottom$annotations() {
    }

    public static final /* synthetic */ void write$Self$feedback_survey_release(FeedbackSurveySectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.insetBottom);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInsetBottom() {
        return this.insetBottom;
    }

    public final FeedbackSurveySectionModel copy(List<? extends DesignSystemModel> items, String insetBottom) {
        AbstractC22676k.m65750j(items, "items");
        return new FeedbackSurveySectionModel(items, insetBottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackSurveySectionModel)) {
            return false;
        }
        FeedbackSurveySectionModel feedbackSurveySectionModel = (FeedbackSurveySectionModel) other;
        return AbstractC22676k.m65745e(this.items, feedbackSurveySectionModel.items) && AbstractC22676k.m65745e(this.insetBottom, feedbackSurveySectionModel.insetBottom);
    }

    public final String getInsetBottom() {
        return this.insetBottom;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.insetBottom;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("FeedbackSurveySectionModel(items=", ", insetBottom=", this.insetBottom, ")", this.items);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackSurveySectionModel(List<? extends DesignSystemModel> items, String str) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.insetBottom = str;
    }
}
