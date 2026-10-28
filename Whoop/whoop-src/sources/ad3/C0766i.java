package ad3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ad3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C0766i {

    /* JADX INFO: renamed from: a */
    public final boolean f2789a;

    /* JADX INFO: renamed from: b */
    public final boolean f2790b;

    /* JADX INFO: renamed from: c */
    public final boolean f2791c;

    /* JADX INFO: renamed from: d */
    public final boolean f2792d;

    /* JADX INFO: renamed from: e */
    public final boolean f2793e;

    /* JADX INFO: renamed from: f */
    public final boolean f2794f;

    /* JADX INFO: renamed from: g */
    public final String f2795g;

    /* JADX INFO: renamed from: h */
    public final boolean f2796h;

    /* JADX INFO: renamed from: i */
    public final String f2797i;

    /* JADX INFO: renamed from: j */
    public final boolean f2798j;

    /* JADX INFO: renamed from: k */
    public final boolean f2799k;

    /* JADX INFO: renamed from: l */
    public final C0779v f2800l;

    /* JADX INFO: renamed from: m */
    public final boolean f2801m;

    /* JADX INFO: renamed from: n */
    public final EnumC0753a f2802n;

    public C0766i(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String prettyPrintIndent, boolean z18, String classDiscriminator, boolean z19, boolean z24, C0779v c0779v, boolean z25, EnumC0753a classDiscriminatorMode) {
        AbstractC22676k.m65750j(prettyPrintIndent, "prettyPrintIndent");
        AbstractC22676k.m65750j(classDiscriminator, "classDiscriminator");
        AbstractC22676k.m65750j(classDiscriminatorMode, "classDiscriminatorMode");
        this.f2789a = z4;
        this.f2790b = z13;
        this.f2791c = z14;
        this.f2792d = z15;
        this.f2793e = z16;
        this.f2794f = z17;
        this.f2795g = prettyPrintIndent;
        this.f2796h = z18;
        this.f2797i = classDiscriminator;
        this.f2798j = z19;
        this.f2799k = z24;
        this.f2800l = c0779v;
        this.f2801m = z25;
        this.f2802n = classDiscriminatorMode;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f2789a + ", ignoreUnknownKeys=" + this.f2790b + ", isLenient=" + this.f2791c + ", allowStructuredMapKeys=" + this.f2792d + ", prettyPrint=" + this.f2793e + ", explicitNulls=" + this.f2794f + ", prettyPrintIndent='" + this.f2795g + "', coerceInputValues=" + this.f2796h + ", useArrayPolymorphism=false, classDiscriminator='" + this.f2797i + "', allowSpecialFloatingPointValues=" + this.f2798j + ", useAlternativeNames=" + this.f2799k + ", namingStrategy=" + this.f2800l + ", decodeEnumsCaseInsensitive=" + this.f2801m + ", allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f2802n + ')';
    }
}
