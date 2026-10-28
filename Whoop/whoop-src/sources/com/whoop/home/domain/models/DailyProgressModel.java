package com.whoop.home.domain.models;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/home/domain/models/DailyProgressModel;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "filledCount", "totalCount", "<init>", "(Lcom/whoop/design/util/TextResource;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/DailyProgressModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()I", "component3", "copy", "(Lcom/whoop/design/util/TextResource;II)Lcom/whoop/home/domain/models/DailyProgressModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "I", "getFilledCount", "getTotalCount", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DailyProgressModel {
    private final int filledCount;
    private final TextResource title;
    private final int totalCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/DailyProgressModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/DailyProgressModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DailyProgressModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DailyProgressModel(int i13, TextResource textResource, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, DailyProgressModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.filledCount = i14;
        this.totalCount = i15;
    }

    public static /* synthetic */ DailyProgressModel copy$default(DailyProgressModel dailyProgressModel, TextResource textResource, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textResource = dailyProgressModel.title;
        }
        if ((i15 & 2) != 0) {
            i13 = dailyProgressModel.filledCount;
        }
        if ((i15 & 4) != 0) {
            i14 = dailyProgressModel.totalCount;
        }
        return dailyProgressModel.copy(textResource, i13, i14);
    }

    public static final /* synthetic */ void write$Self$home_release(DailyProgressModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        output.encodeIntElement(serialDesc, 1, self.filledCount);
        output.encodeIntElement(serialDesc, 2, self.totalCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFilledCount() {
        return this.filledCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    public final DailyProgressModel copy(TextResource title, int filledCount, int totalCount) {
        AbstractC22676k.m65750j(title, "title");
        return new DailyProgressModel(title, filledCount, totalCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyProgressModel)) {
            return false;
        }
        DailyProgressModel dailyProgressModel = (DailyProgressModel) other;
        return AbstractC22676k.m65745e(this.title, dailyProgressModel.title) && this.filledCount == dailyProgressModel.filledCount && this.totalCount == dailyProgressModel.totalCount;
    }

    public final int getFilledCount() {
        return this.filledCount;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalCount) + AbstractC11266d.m30448b(this.filledCount, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        int i13 = this.filledCount;
        int i14 = this.totalCount;
        StringBuilder sb4 = new StringBuilder("DailyProgressModel(title=");
        sb4.append(textResource);
        sb4.append(", filledCount=");
        sb4.append(i13);
        sb4.append(", totalCount=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }

    public DailyProgressModel(TextResource title, int i13, int i14) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.filledCount = i13;
        this.totalCount = i14;
    }
}
