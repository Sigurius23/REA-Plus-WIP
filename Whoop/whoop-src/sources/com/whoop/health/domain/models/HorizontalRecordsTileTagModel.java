package com.whoop.health.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006#"}, m65681d2 = {"Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;", "", "", "title", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalRecordsTileTagModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalRecordsTileTagModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalRecordsTileTagModel() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ HorizontalRecordsTileTagModel copy$default(HorizontalRecordsTileTagModel horizontalRecordsTileTagModel, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalRecordsTileTagModel.title;
        }
        return horizontalRecordsTileTagModel.copy(str);
    }

    public static final /* synthetic */ void write$Self$health_release(HorizontalRecordsTileTagModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.title == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final HorizontalRecordsTileTagModel copy(String title) {
        return new HorizontalRecordsTileTagModel(title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HorizontalRecordsTileTagModel) && AbstractC22676k.m65745e(this.title, ((HorizontalRecordsTileTagModel) other).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC11895b.m31996o("HorizontalRecordsTileTagModel(title=", this.title, ")");
    }

    public /* synthetic */ HorizontalRecordsTileTagModel(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
    }

    public HorizontalRecordsTileTagModel(String str) {
        this.title = str;
    }

    public /* synthetic */ HorizontalRecordsTileTagModel(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str);
    }
}
