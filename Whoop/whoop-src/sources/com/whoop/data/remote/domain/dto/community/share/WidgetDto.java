package com.whoop.data.remote.domain.dto.community.share;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J4\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;", "", "", "collection", "", "collectionDisplayIndex", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCollection", "Ljava/lang/Integer;", "getCollectionDisplayIndex", "getImageUrl", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WidgetDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String collection;
    private final Integer collectionDisplayIndex;
    private final String imageUrl;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/community/share/WidgetDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WidgetDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WidgetDto(int i13, String str, Integer num, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, WidgetDto$$serializer.INSTANCE.getDescriptor());
        }
        this.collection = str;
        this.collectionDisplayIndex = num;
        this.imageUrl = str2;
    }

    public static /* synthetic */ WidgetDto copy$default(WidgetDto widgetDto, String str, Integer num, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = widgetDto.collection;
        }
        if ((i13 & 2) != 0) {
            num = widgetDto.collectionDisplayIndex;
        }
        if ((i13 & 4) != 0) {
            str2 = widgetDto.imageUrl;
        }
        return widgetDto.copy(str, num, str2);
    }

    public static final /* synthetic */ void write$Self$core_release(WidgetDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.collection);
        output.encodeNullableSerializableElement(serialDesc, 1, IntSerializer.INSTANCE, self.collectionDisplayIndex);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.imageUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCollection() {
        return this.collection;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCollectionDisplayIndex() {
        return this.collectionDisplayIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final WidgetDto copy(String collection, Integer collectionDisplayIndex, String imageUrl) {
        return new WidgetDto(collection, collectionDisplayIndex, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetDto)) {
            return false;
        }
        WidgetDto widgetDto = (WidgetDto) other;
        return AbstractC22676k.m65745e(this.collection, widgetDto.collection) && AbstractC22676k.m65745e(this.collectionDisplayIndex, widgetDto.collectionDisplayIndex) && AbstractC22676k.m65745e(this.imageUrl, widgetDto.imageUrl);
    }

    public final String getCollection() {
        return this.collection;
    }

    public final Integer getCollectionDisplayIndex() {
        return this.collectionDisplayIndex;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        String str = this.collection;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.collectionDisplayIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.imageUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.collection;
        Integer num = this.collectionDisplayIndex;
        String str2 = this.imageUrl;
        StringBuilder sb4 = new StringBuilder("WidgetDto(collection=");
        sb4.append(str);
        sb4.append(", collectionDisplayIndex=");
        sb4.append(num);
        sb4.append(", imageUrl=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }

    public WidgetDto(String str, Integer num, String str2) {
        this.collection = str;
        this.collectionDisplayIndex = num;
        this.imageUrl = str2;
    }
}
