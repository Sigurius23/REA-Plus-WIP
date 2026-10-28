package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import jb1.C21535a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kt2.C22831a;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import rv2.C31844b;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001fR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;", "", "", "imageUrl", "ctaText", "bottomText", "", "Lcom/whoop/design/models/DesignSystemModel;", "contentItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljb1/a;", "reducer", "Lrv2/b;", "toNoWorkoutsState", "(Ljb1/a;)Lrv2/b;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getImageUrl$annotations", "()V", "getCtaText", "getCtaText$annotations", "getBottomText", "getBottomText$annotations", "Ljava/util/List;", "getContentItems", "getContentItems$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MyWorkoutsEmptyState {

    @SerializedName("bottom_text")
    private final String bottomText;

    @SerializedName("content_items")
    private final List<DesignSystemModel> contentItems;

    @SerializedName("cta_text")
    private final String ctaText;

    @SerializedName("image_url")
    private final String imageUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22831a(28))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/MyWorkoutsEmptyState;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MyWorkoutsEmptyState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MyWorkoutsEmptyState(int i13, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, MyWorkoutsEmptyState$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.ctaText = str2;
        this.bottomText = str3;
        this.contentItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyWorkoutsEmptyState copy$default(MyWorkoutsEmptyState myWorkoutsEmptyState, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = myWorkoutsEmptyState.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = myWorkoutsEmptyState.ctaText;
        }
        if ((i13 & 4) != 0) {
            str3 = myWorkoutsEmptyState.bottomText;
        }
        if ((i13 & 8) != 0) {
            list = myWorkoutsEmptyState.contentItems;
        }
        return myWorkoutsEmptyState.copy(str, str2, str3, list);
    }

    @InterfaceC37143h("bottom_text")
    public static /* synthetic */ void getBottomText$annotations() {
    }

    @InterfaceC37143h("content_items")
    public static /* synthetic */ void getContentItems$annotations() {
    }

    @InterfaceC37143h("cta_text")
    public static /* synthetic */ void getCtaText$annotations() {
    }

    @InterfaceC37143h("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(MyWorkoutsEmptyState self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.bottomText);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.contentItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    public final List<DesignSystemModel> component4() {
        return this.contentItems;
    }

    public final MyWorkoutsEmptyState copy(String imageUrl, String ctaText, String bottomText, List<? extends DesignSystemModel> contentItems) {
        return new MyWorkoutsEmptyState(imageUrl, ctaText, bottomText, contentItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyWorkoutsEmptyState)) {
            return false;
        }
        MyWorkoutsEmptyState myWorkoutsEmptyState = (MyWorkoutsEmptyState) other;
        return AbstractC22676k.m65745e(this.imageUrl, myWorkoutsEmptyState.imageUrl) && AbstractC22676k.m65745e(this.ctaText, myWorkoutsEmptyState.ctaText) && AbstractC22676k.m65745e(this.bottomText, myWorkoutsEmptyState.bottomText) && AbstractC22676k.m65745e(this.contentItems, myWorkoutsEmptyState.contentItems);
    }

    public final String getBottomText() {
        return this.bottomText;
    }

    public final List<DesignSystemModel> getContentItems() {
        return this.contentItems;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ctaText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<DesignSystemModel> list = this.contentItems;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final C31844b toNoWorkoutsState(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        String str = this.imageUrl;
        String str2 = this.ctaText;
        String str3 = this.bottomText;
        List<DesignSystemModel> list = this.contentItems;
        List<InterfaceC25312u> listM60545m = list != null ? reducer.m60545m(list) : null;
        if (listM60545m == null) {
            listM60545m = C25271y.f99162w;
        }
        return new C31844b(str, str2, str3, listM60545m);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.ctaText;
        return AbstractC30007c.m91840j(this.bottomText, ", contentItems=", ")", AbstractC11895b.m32001t("MyWorkoutsEmptyState(imageUrl=", str, ", ctaText=", str2, ", bottomText="), this.contentItems);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MyWorkoutsEmptyState(String str, String str2, String str3, List<? extends DesignSystemModel> list) {
        this.imageUrl = str;
        this.ctaText = str2;
        this.bottomText = str3;
        this.contentItems = list;
    }
}
