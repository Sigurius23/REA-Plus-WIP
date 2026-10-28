package cz1;

import com.whoop.design.models.celebration.DynamicLottieModel;
import com.whoop.design.models.colortheme.ColorThemeModel;
import com.whoop.milestonepill.domain.model.MilestonePillResponse;
import com.whoop.navigation.C9598e;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: cz1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006\u001e"}, m65681d2 = {"Lcz1/c;", "", "", "isLoading", "isError", "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "data", "hasAnimationFinishedForThisValue", "<init>", "(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)V", "a", "(ZZLcom/whoop/milestonepill/domain/model/MilestonePillResponse;Z)Lcz1/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "e", "c", "Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "()Lcom/whoop/milestonepill/domain/model/MilestonePillResponse;", "d", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11262c {

    /* JADX INFO: renamed from: e */
    public static final int f36137e = (C9598e.f28134d | ColorThemeModel.$stable) | DynamicLottieModel.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final MilestonePillResponse data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean hasAnimationFinishedForThisValue;

    public C11262c(boolean z4, boolean z13, MilestonePillResponse milestonePillResponse, boolean z14) {
        this.isLoading = z4;
        this.isError = z13;
        this.data = milestonePillResponse;
        this.hasAnimationFinishedForThisValue = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C11262c m30427b(C11262c c11262c, boolean z4, boolean z13, MilestonePillResponse milestonePillResponse, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = c11262c.isLoading;
        }
        if ((i13 & 2) != 0) {
            z13 = c11262c.isError;
        }
        if ((i13 & 4) != 0) {
            milestonePillResponse = c11262c.data;
        }
        if ((i13 & 8) != 0) {
            z14 = c11262c.hasAnimationFinishedForThisValue;
        }
        return c11262c.m30428a(z4, z13, milestonePillResponse, z14);
    }

    /* JADX INFO: renamed from: a */
    public final C11262c m30428a(boolean isLoading, boolean isError, MilestonePillResponse data, boolean hasAnimationFinishedForThisValue) {
        return new C11262c(isLoading, isError, data, hasAnimationFinishedForThisValue);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final MilestonePillResponse getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasAnimationFinishedForThisValue() {
        return this.hasAnimationFinishedForThisValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11262c)) {
            return false;
        }
        C11262c c11262c = (C11262c) other;
        return this.isLoading == c11262c.isLoading && this.isError == c11262c.isError && AbstractC22676k.m65745e(this.data, c11262c.data) && this.hasAnimationFinishedForThisValue == c11262c.hasAnimationFinishedForThisValue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        MilestonePillResponse milestonePillResponse = this.data;
        return Boolean.hashCode(this.hasAnimationFinishedForThisValue) + ((iM8289b + (milestonePillResponse == null ? 0 : milestonePillResponse.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        MilestonePillResponse milestonePillResponse = this.data;
        boolean z14 = this.hasAnimationFinishedForThisValue;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("MilestonePillDomainState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(milestonePillResponse);
        sbM32002u.append(", hasAnimationFinishedForThisValue=");
        sbM32002u.append(z14);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C11262c(boolean z4, boolean z13, MilestonePillResponse milestonePillResponse, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : milestonePillResponse, (i13 & 8) != 0 ? true : z14);
    }
}
