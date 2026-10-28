package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/TestimonialsModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/TestimonialModel;", "testimonials", "", "selectedTestimonialId", "", "autoscroll", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TestimonialsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/TestimonialsModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTestimonials", "Ljava/lang/String;", "getSelectedTestimonialId", "Ljava/lang/Boolean;", "getAutoscroll", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TestimonialsModel implements DesignSystemModel {
    private final Boolean autoscroll;
    private final String selectedTestimonialId;
    private final List<TestimonialModel> testimonials;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(11)), null, null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TestimonialsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TestimonialsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TestimonialsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TestimonialsModel(int i13, List list, String str, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, TestimonialsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.testimonials = list;
        this.selectedTestimonialId = str;
        if ((i13 & 4) == 0) {
            this.autoscroll = null;
        } else {
            this.autoscroll = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TestimonialModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestimonialsModel copy$default(TestimonialsModel testimonialsModel, List list, String str, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = testimonialsModel.testimonials;
        }
        if ((i13 & 2) != 0) {
            str = testimonialsModel.selectedTestimonialId;
        }
        if ((i13 & 4) != 0) {
            bool = testimonialsModel.autoscroll;
        }
        return testimonialsModel.copy(list, str, bool);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TestimonialsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.testimonials);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.selectedTestimonialId);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.autoscroll == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.autoscroll);
    }

    public final List<TestimonialModel> component1() {
        return this.testimonials;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSelectedTestimonialId() {
        return this.selectedTestimonialId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAutoscroll() {
        return this.autoscroll;
    }

    public final TestimonialsModel copy(List<TestimonialModel> testimonials, String selectedTestimonialId, Boolean autoscroll) {
        AbstractC22676k.m65750j(testimonials, "testimonials");
        return new TestimonialsModel(testimonials, selectedTestimonialId, autoscroll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestimonialsModel)) {
            return false;
        }
        TestimonialsModel testimonialsModel = (TestimonialsModel) other;
        return AbstractC22676k.m65745e(this.testimonials, testimonialsModel.testimonials) && AbstractC22676k.m65745e(this.selectedTestimonialId, testimonialsModel.selectedTestimonialId) && AbstractC22676k.m65745e(this.autoscroll, testimonialsModel.autoscroll);
    }

    public final Boolean getAutoscroll() {
        return this.autoscroll;
    }

    public final String getSelectedTestimonialId() {
        return this.selectedTestimonialId;
    }

    public final List<TestimonialModel> getTestimonials() {
        return this.testimonials;
    }

    public int hashCode() {
        int iHashCode = this.testimonials.hashCode() * 31;
        String str = this.selectedTestimonialId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.autoscroll;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<TestimonialModel> list = this.testimonials;
        String str = this.selectedTestimonialId;
        return AbstractC11478a.m30858j(AbstractC26725a.m79507k("TestimonialsModel(testimonials=", ", selectedTestimonialId=", str, ", autoscroll=", list), this.autoscroll, ")");
    }

    public TestimonialsModel(List<TestimonialModel> testimonials, String str, Boolean bool) {
        AbstractC22676k.m65750j(testimonials, "testimonials");
        this.testimonials = testimonials;
        this.selectedTestimonialId = str;
        this.autoscroll = bool;
    }

    public /* synthetic */ TestimonialsModel(List list, String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i13 & 4) != 0 ? null : bool);
    }
}
