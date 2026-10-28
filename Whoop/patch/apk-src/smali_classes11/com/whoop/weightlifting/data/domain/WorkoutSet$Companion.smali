.class public final Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/weightlifting/data/domain/WorkoutSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000c\u001a\u0004\u0018\u00010\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0005*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0008*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u0008*\u00020\u0004\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u00020\u0005*\u00020\u0008\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0011\u0010!\u001a\u00020\u0005*\u00020\u0008\u00a2\u0006\u0004\u0008!\u0010 J\u0011\u0010\"\u001a\u00020\u0005*\u00020\u0008\u00a2\u0006\u0004\u0008\"\u0010 J\u0013\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\u0004\u0008$\u0010%R\u0011\u0010\u001b\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010*\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010)R\u0014\u0010+\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010)R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00040,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u0010/\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "isWholeNumber",
        "(F)Z",
        "",
        "",
        "toNumberOfRepsAsIntOrNull",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "toTimeAsIntSecondsOrNull",
        "toWeightAsFloatOrNull",
        "(Ljava/lang/String;)Ljava/lang/Float;",
        "Landroid/icu/text/DecimalFormat;",
        "text",
        "",
        "parseOrNullAnyLocale",
        "(Landroid/icu/text/DecimalFormat;Ljava/lang/String;)Ljava/lang/Number;",
        "hasOneDecimalPlaceMax",
        "(Ljava/lang/Number;)Z",
        "fromSecondsToTimeString",
        "(I)Ljava/lang/String;",
        "Ljava/util/UUID;",
        "id",
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "default",
        "(Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "toRoundedString",
        "(F)Ljava/lang/String;",
        "isValidNumberOfReps",
        "(Ljava/lang/String;)Z",
        "isValidTime",
        "isValidWeight",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "getDefault",
        "()Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "repsFormat",
        "Landroid/icu/text/DecimalFormat;",
        "timeFormat",
        "weightFormat",
        "Li93/f;",
        "validWeightRange",
        "Li93/f;",
        "MAX_DIGITS_IN_TIME",
        "I",
        "Li93/j;",
        "validTimeInSecondsRange",
        "Li93/j;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$fromSecondsToTimeString(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;I)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->fromSecondsToTimeString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toNumberOfRepsAsIntOrNull(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toNumberOfRepsAsIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toTimeAsIntSecondsOrNull(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toTimeAsIntSecondsOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toWeightAsFloatOrNull(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;Ljava/lang/String;)Ljava/lang/Float;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toWeightAsFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method private final fromSecondsToTimeString(I)Ljava/lang/String;
    .locals 4

    div-int/lit8 v0, p1, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v1, "%02d"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method private final hasOneDecimalPlaceMax(Ljava/lang/Number;)Z
    .locals 1

    new-instance v0, Ljava/math/BigDecimal;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/math/BigDecimal;->scale()I

    move-result p1

    const/4 v0, 0x1

    if-gt p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isWholeNumber(F)Z
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    rem-float/2addr p1, v0

    const/4 v0, 0x0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final parseOrNullAnyLocale(Landroid/icu/text/DecimalFormat;Ljava/lang/String;)Ljava/lang/Number;
    .locals 3

    invoke-static {p1, p2}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    if-nez v0, :cond_1

    const/16 v0, 0x2e

    const/16 v1, 0x2c

    invoke-static {p2, v0, v1}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-static {p2, v1, v0}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    return-object v0
.end method

.method private final toNumberOfRepsAsIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->access$getRepsFormat$cp()Landroid/icu/text/DecimalFormat;

    move-result-object v0

    invoke-static {v0, p1}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method

.method private final toTimeAsIntSecondsOrNull(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x5

    const/4 v3, 0x0

    if-le v0, v2, :cond_1

    return-object v3

    :cond_1
    const/4 v0, 0x2

    invoke-static {v0, p1}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v0, :cond_2

    const-string p1, "0"

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v0

    invoke-static {v1, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    invoke-static {p1, v0}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->access$getTimeFormat$cp()Landroid/icu/text/DecimalFormat;

    move-result-object v0

    invoke-static {v0, v2}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, v3

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->access$getTimeFormat$cp()Landroid/icu/text/DecimalFormat;

    move-result-object v1

    invoke-static {v1, p1}, Lor2/g1;->a(Landroid/icu/text/NumberFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, v3

    :goto_2
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    mul-int/lit8 p1, p1, 0x3c

    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->access$getValidTimeInSecondsRange$cp()Li93/j;

    move-result-object v1

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v0, v1, :cond_5

    if-gt v2, v0, :cond_5

    return-object p1

    :cond_5
    return-object v3
.end method

.method private final toWeightAsFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;
    .locals 3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->access$getWeightFormat$cp()Landroid/icu/text/DecimalFormat;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->parseOrNullAnyLocale(Landroid/icu/text/DecimalFormat;Ljava/lang/String;)Ljava/lang/Number;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    invoke-direct {v1, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->hasOneDecimalPlaceMax(Ljava/lang/Number;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->access$getValidWeightRange$cp()Li93/f;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v2, v1}, Li93/f;->c(Ljava/lang/Comparable;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final default(Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 4

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;FLjava/util/UUID;)V

    return-object v0
.end method

.method public final getDefault()Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 4

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;F)V

    return-object v0
.end method

.method public final isValidNumberOfReps(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toNumberOfRepsAsIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isValidTime(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toTimeAsIntSecondsOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isValidWeight(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toWeightAsFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;

    return-object v0
.end method

.method public final toRoundedString(F)Ljava/lang/String;
    .locals 1

    invoke-direct {p0, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isWholeNumber(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "%.1f"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
