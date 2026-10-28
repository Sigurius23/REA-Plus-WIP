package eo2;

import com.whoop.universalcheckout.features.cart.domain.AbstractC10659b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: eo2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0003\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010\u000f¨\u0006#"}, m65681d2 = {"Leo2/g;", "", "", "isLoading", "isError", "Leo2/a;", "data", "isUpdating", "Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "errorKind", "", "errorSupportText", "<init>", "(ZZLeo2/a;ZLcom/whoop/universalcheckout/features/cart/domain/b$a$a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "d", "c", "Leo2/a;", "()Leo2/a;", "e", "Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "()Lcom/whoop/universalcheckout/features/cart/domain/b$a$a;", "f", "Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13387g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C13381a data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isUpdating;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC10659b.a.EnumC41432a errorKind;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String errorSupportText;

    public C13387g(boolean z4, boolean z13, C13381a c13381a, boolean z14, AbstractC10659b.a.EnumC41432a enumC41432a, String str) {
        this.isLoading = z4;
        this.isError = z13;
        this.data = c13381a;
        this.isUpdating = z14;
        this.errorKind = enumC41432a;
        this.errorSupportText = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C13381a getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC10659b.a.EnumC41432a getErrorKind() {
        return this.errorKind;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getErrorSupportText() {
        return this.errorSupportText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13387g)) {
            return false;
        }
        C13387g c13387g = (C13387g) other;
        return this.isLoading == c13387g.isLoading && this.isError == c13387g.isError && AbstractC22676k.m65745e(this.data, c13387g.data) && this.isUpdating == c13387g.isUpdating && this.errorKind == c13387g.errorKind && AbstractC22676k.m65745e(this.errorSupportText, c13387g.errorSupportText);
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(Boolean.hashCode(this.isLoading) * 31, 31, this.isError);
        C13381a c13381a = this.data;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (c13381a == null ? 0 : c13381a.hashCode())) * 31, 31, this.isUpdating);
        AbstractC10659b.a.EnumC41432a enumC41432a = this.errorKind;
        int iHashCode = (iM8289b2 + (enumC41432a == null ? 0 : enumC41432a.hashCode())) * 31;
        String str = this.errorSupportText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.isLoading;
        boolean z13 = this.isError;
        C13381a c13381a = this.data;
        boolean z14 = this.isUpdating;
        AbstractC10659b.a.EnumC41432a enumC41432a = this.errorKind;
        String str = this.errorSupportText;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("CartViewState(isLoading=", ", isError=", ", data=", z4, z13);
        sbM32002u.append(c13381a);
        sbM32002u.append(", isUpdating=");
        sbM32002u.append(z14);
        sbM32002u.append(", errorKind=");
        sbM32002u.append(enumC41432a);
        sbM32002u.append(", errorSupportText=");
        sbM32002u.append(str);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    public /* synthetic */ C13387g(boolean z4, boolean z13, C13381a c13381a, boolean z14, AbstractC10659b.a.EnumC41432a enumC41432a, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? null : c13381a, (i13 & 8) != 0 ? false : z14, (i13 & 16) != 0 ? null : enumC41432a, (i13 & 32) != 0 ? null : str);
    }
}
