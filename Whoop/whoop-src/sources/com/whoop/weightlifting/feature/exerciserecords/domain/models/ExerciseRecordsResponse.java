package com.whoop.weightlifting.feature.exerciserecords.domain.models;

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
import mq2.C25888a;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b2\u0010\u001b¨\u00065"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;", "", "", "id", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;", "showMore", "analyticsAction", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getItems", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;", "getShowMore", "getShowMore$annotations", "()V", "getAnalyticsAction", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseRecordsResponse {
    private final String analyticsAction;
    private final String id;
    private final List<DesignSystemModel> items;
    private final ShowMoreContent showMore;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25888a(13)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseRecordsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExerciseRecordsResponse(int i13, String str, List list, ShowMoreContent showMoreContent, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ExerciseRecordsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.items = list;
        if ((i13 & 4) == 0) {
            this.showMore = null;
        } else {
            this.showMore = showMoreContent;
        }
        if ((i13 & 8) == 0) {
            this.analyticsAction = null;
        } else {
            this.analyticsAction = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExerciseRecordsResponse copy$default(ExerciseRecordsResponse exerciseRecordsResponse, String str, List list, ShowMoreContent showMoreContent, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseRecordsResponse.id;
        }
        if ((i13 & 2) != 0) {
            list = exerciseRecordsResponse.items;
        }
        if ((i13 & 4) != 0) {
            showMoreContent = exerciseRecordsResponse.showMore;
        }
        if ((i13 & 8) != 0) {
            str2 = exerciseRecordsResponse.analyticsAction;
        }
        return exerciseRecordsResponse.copy(str, list, showMoreContent, str2);
    }

    @InterfaceC37143h("show_more")
    public static /* synthetic */ void getShowMore$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(ExerciseRecordsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.showMore != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ShowMoreContent$$serializer.INSTANCE, self.showMore);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.analyticsAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.analyticsAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ShowMoreContent getShowMore() {
        return this.showMore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    public final ExerciseRecordsResponse copy(String id4, List<? extends DesignSystemModel> items, ShowMoreContent showMore, String analyticsAction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        return new ExerciseRecordsResponse(id4, items, showMore, analyticsAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseRecordsResponse)) {
            return false;
        }
        ExerciseRecordsResponse exerciseRecordsResponse = (ExerciseRecordsResponse) other;
        return AbstractC22676k.m65745e(this.id, exerciseRecordsResponse.id) && AbstractC22676k.m65745e(this.items, exerciseRecordsResponse.items) && AbstractC22676k.m65745e(this.showMore, exerciseRecordsResponse.showMore) && AbstractC22676k.m65745e(this.analyticsAction, exerciseRecordsResponse.analyticsAction);
    }

    public final String getAnalyticsAction() {
        return this.analyticsAction;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final ShowMoreContent getShowMore() {
        return this.showMore;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.items);
        ShowMoreContent showMoreContent = this.showMore;
        int iHashCode = (iM31983b + (showMoreContent == null ? 0 : showMoreContent.hashCode())) * 31;
        String str = this.analyticsAction;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<DesignSystemModel> list = this.items;
        ShowMoreContent showMoreContent = this.showMore;
        String str2 = this.analyticsAction;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ExerciseRecordsResponse(id=", str, ", items=", ", showMore=", list);
        sbM94766o.append(showMoreContent);
        sbM94766o.append(", analyticsAction=");
        sbM94766o.append(str2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExerciseRecordsResponse(String id4, List<? extends DesignSystemModel> items, ShowMoreContent showMoreContent, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.items = items;
        this.showMore = showMoreContent;
        this.analyticsAction = str;
    }

    public /* synthetic */ ExerciseRecordsResponse(String str, List list, ShowMoreContent showMoreContent, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i13 & 4) != 0 ? null : showMoreContent, (i13 & 8) != 0 ? null : str2);
    }
}
