package com.whoop.profile.view.edit.form;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011¨\u0006 "}, m65681d2 = {"Lcom/whoop/profile/view/edit/form/FieldState;", "", "value", "", "error", "Lcom/whoop/design/util/TextResource;", "isFocused", "", "hasBeenValidated", "hasBeenInteractedWith", "isValidating", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZ)V", "getValue", "()Ljava/lang/String;", "getError", "()Lcom/whoop/design/util/TextResource;", "()Z", "getHasBeenValidated", "getHasBeenInteractedWith", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class FieldState {
    public static final int $stable = TextResource.$stable;
    private final TextResource error;
    private final boolean hasBeenInteractedWith;
    private final boolean hasBeenValidated;
    private final boolean isFocused;
    private final boolean isValidating;
    private final String value;

    public FieldState(String value, TextResource error, boolean z4, boolean z13, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(error, "error");
        this.value = value;
        this.error = error;
        this.isFocused = z4;
        this.hasBeenValidated = z13;
        this.hasBeenInteractedWith = z14;
        this.isValidating = z15;
    }

    public static /* synthetic */ FieldState copy$default(FieldState fieldState, String str, TextResource textResource, boolean z4, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fieldState.value;
        }
        if ((i13 & 2) != 0) {
            textResource = fieldState.error;
        }
        if ((i13 & 4) != 0) {
            z4 = fieldState.isFocused;
        }
        if ((i13 & 8) != 0) {
            z13 = fieldState.hasBeenValidated;
        }
        if ((i13 & 16) != 0) {
            z14 = fieldState.hasBeenInteractedWith;
        }
        if ((i13 & 32) != 0) {
            z15 = fieldState.isValidating;
        }
        boolean z16 = z14;
        boolean z17 = z15;
        return fieldState.copy(str, textResource, z4, z13, z16, z17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsFocused() {
        return this.isFocused;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasBeenValidated() {
        return this.hasBeenValidated;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasBeenInteractedWith() {
        return this.hasBeenInteractedWith;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsValidating() {
        return this.isValidating;
    }

    public final FieldState copy(String value, TextResource error, boolean isFocused, boolean hasBeenValidated, boolean hasBeenInteractedWith, boolean isValidating) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(error, "error");
        return new FieldState(value, error, isFocused, hasBeenValidated, hasBeenInteractedWith, isValidating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldState)) {
            return false;
        }
        FieldState fieldState = (FieldState) other;
        return AbstractC22676k.m65745e(this.value, fieldState.value) && AbstractC22676k.m65745e(this.error, fieldState.error) && this.isFocused == fieldState.isFocused && this.hasBeenValidated == fieldState.hasBeenValidated && this.hasBeenInteractedWith == fieldState.hasBeenInteractedWith && this.isValidating == fieldState.isValidating;
    }

    public final TextResource getError() {
        return this.error;
    }

    public final boolean getHasBeenInteractedWith() {
        return this.hasBeenInteractedWith;
    }

    public final boolean getHasBeenValidated() {
        return this.hasBeenValidated;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isValidating) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC31061c.m95625a(this.value.hashCode() * 31, this.error, 31), 31, this.isFocused), 31, this.hasBeenValidated), 31, this.hasBeenInteractedWith);
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    public final boolean isValidating() {
        return this.isValidating;
    }

    public String toString() {
        String str = this.value;
        TextResource textResource = this.error;
        boolean z4 = this.isFocused;
        boolean z13 = this.hasBeenValidated;
        boolean z14 = this.hasBeenInteractedWith;
        boolean z15 = this.isValidating;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("FieldState(value=", str, ", error=", textResource, ", isFocused=");
        AbstractC38963t7.m124392v(sbM91847q, z4, ", hasBeenValidated=", z13, ", hasBeenInteractedWith=");
        return AbstractC36095b.m114682j(sbM91847q, z14, ", isValidating=", z15, ")");
    }

    public /* synthetic */ FieldState(String str, TextResource textResource, boolean z4, boolean z13, boolean z14, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? false : z15);
    }
}
