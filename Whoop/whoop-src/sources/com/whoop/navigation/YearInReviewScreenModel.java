package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, m65681d2 = {"Lcom/whoop/navigation/YearInReviewScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "year", "<init>", "(I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/YearInReviewScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/whoop/navigation/YearInReviewScreenModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getYear", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class YearInReviewScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int year;

    /* JADX INFO: renamed from: com.whoop.navigation.YearInReviewScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/YearInReviewScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/YearInReviewScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return YearInReviewScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public YearInReviewScreenModel() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ YearInReviewScreenModel copy$default(YearInReviewScreenModel yearInReviewScreenModel, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = yearInReviewScreenModel.year;
        }
        return yearInReviewScreenModel.copy(i13);
    }

    public static final /* synthetic */ void write$Self$navigation_release(YearInReviewScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.year == 2025) {
            return;
        }
        output.encodeIntElement(serialDesc, 0, self.year);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    public final YearInReviewScreenModel copy(int year) {
        return new YearInReviewScreenModel(year);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof YearInReviewScreenModel) && this.year == ((YearInReviewScreenModel) other).year;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Integer.hashCode(this.year);
    }

    public String toString() {
        return AbstractC2875y.m8296i(this.year, "YearInReviewScreenModel(year=", ")");
    }

    public YearInReviewScreenModel(int i13) {
        this.year = i13;
    }

    public /* synthetic */ YearInReviewScreenModel(int i13, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.year = 2025;
        } else {
            this.year = i14;
        }
    }

    public /* synthetic */ YearInReviewScreenModel(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 2025 : i13);
    }
}
