.class public final Lcom/whoop/weightlifting/data/domain/WorkoutSet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;,
        Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u00029:B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tB-\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0005\u001a\u00020\u000c\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\rB%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0005\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0008\u0010\u000eBC\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0008\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J8\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0010\u0010%\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010)\u001a\u00020(2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010+\u001a\u0004\u0008,\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010+\u001a\u0004\u0008-\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00080\u0010!R\u0011\u00102\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u00081\u0010&R\u0013\u00105\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R\u0011\u00108\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "",
        "",
        "numberOfReps",
        "time",
        "weight",
        "Ljava/util/UUID;",
        "id",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V",
        "",
        "timeInSeconds",
        "",
        "(ILjava/lang/Integer;FLjava/util/UUID;)V",
        "(ILjava/lang/Integer;F)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weightlifting_release",
        "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/UUID;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getNumberOfReps",
        "getTime",
        "getWeight",
        "Ljava/util/UUID;",
        "getId",
        "getNumberOfRepsAsInt",
        "numberOfRepsAsInt",
        "getTimeAsIntSeconds",
        "()Ljava/lang/Integer;",
        "timeAsIntSeconds",
        "getWeightAsFloat",
        "()F",
        "weightAsFloat",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

.field private static final MAX_DIGITS_IN_TIME:I = 0x5

.field private static final repsFormat:Landroid/icu/text/DecimalFormat;

.field private static final timeFormat:Landroid/icu/text/DecimalFormat;

.field private static final validTimeInSecondsRange:Li93/j;

.field private static final validWeightRange:Li93/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li93/f;"
        }
    .end annotation
.end field

.field private static final weightFormat:Landroid/icu/text/DecimalFormat;


# instance fields
.field private final id:Ljava/util/UUID;

.field private final numberOfReps:Ljava/lang/String;

.field private final time:Ljava/lang/String;

.field private final weight:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->$stable:I

    new-instance v0, Landroid/icu/text/DecimalFormat;

    const-string v1, "#"

    invoke-direct {v0, v1}, Landroid/icu/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/icu/text/DecimalFormat;->setParseIntegerOnly(Z)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->repsFormat:Landroid/icu/text/DecimalFormat;

    new-instance v0, Landroid/icu/text/DecimalFormat;

    invoke-direct {v0, v1}, Landroid/icu/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/icu/text/DecimalFormat;->setParseIntegerOnly(Z)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->timeFormat:Landroid/icu/text/DecimalFormat;

    new-instance v0, Landroid/icu/text/DecimalFormat;

    const-string v1, "#.#"

    invoke-direct {v0, v1}, Landroid/icu/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weightFormat:Landroid/icu/text/DecimalFormat;

    new-instance v0, Li93/e;

    const/4 v1, 0x0

    const v2, 0x4479f99a    # 999.9f

    invoke-direct {v0, v1, v2}, Li93/e;-><init>(FF)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->validWeightRange:Li93/f;

    const/4 v0, 0x0

    const v1, 0xea60

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->validTimeInSecondsRange:Li93/j;

    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;F)V
    .locals 2

    .line 73
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    const-string v1, "randomUUID(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;FLjava/util/UUID;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 74
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;F)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/Integer;FLjava/util/UUID;)V
    .locals 2

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 70
    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->access$fromSecondsToTimeString(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    const-string p2, ""

    .line 71
    :cond_1
    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->validWeightRange:Li93/f;

    invoke-static {p3, v1}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-virtual {v0, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->toRoundedString(F)Ljava/lang/String;

    move-result-object p3

    .line 72
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;FLjava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 68
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(ILjava/lang/Integer;FLjava/util/UUID;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x5

    const/4 v0, 0x5

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;->INSTANCE:Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;

    invoke-virtual {p6}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    and-int/lit8 p6, p1, 0x2

    if-nez p6, :cond_1

    .line 2
    const-string p3, ""

    .line 3
    :cond_1
    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    .line 4
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    const-string p3, "randomUUID(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    goto :goto_0

    :cond_2
    iput-object p5, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    .line 6
    :goto_0
    sget-object p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isValidNumberOfReps(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 7
    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isValidTime(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 8
    invoke-virtual {p1, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isValidWeight(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    .line 9
    :cond_3
    const-string p1, " is an invalid weight, must be an empty string or convertible to a float in the range [0, 1000) with no more than one decimal of precision"

    .line 10
    invoke-static {p4, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 11
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 12
    :cond_4
    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    const-string p2, " is an invalid time, it must be no more than 5 characters, all digits, the last two digits must be convertible to a non-negative integer representing seconds, any preceding digits must be convertible to a non-negative integer representing minutes, and the total time must be below 60,0000 seconds"

    .line 13
    invoke-static {p1, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 14
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 15
    :cond_5
    const-string p1, " is an invalid numberOfReps, must be an empty string or convertible to a non-negative integer"

    .line 16
    invoke-static {p2, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V
    .locals 1

    const-string v0, "numberOfReps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    .line 38
    sget-object p4, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    invoke-virtual {p4, p1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isValidNumberOfReps(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    invoke-virtual {p4, p2}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isValidTime(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 40
    invoke-virtual {p4, p3}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->isValidWeight(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 41
    :cond_0
    const-string p1, " is an invalid weight, must be an empty string or convertible to a float in the range [0, 1000) with no more than one decimal of precision"

    .line 42
    invoke-static {p3, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 43
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 44
    :cond_1
    const-string p1, " is an invalid time, it must be no more than 5 characters, all digits, the last two digits must be convertible to a non-negative integer representing seconds, any preceding digits must be convertible to a non-negative integer representing minutes, and the total time must be below 60,0000 seconds"

    .line 45
    invoke-static {p2, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 46
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 47
    :cond_2
    const-string p2, " is an invalid numberOfReps, must be an empty string or convertible to a non-negative integer"

    .line 48
    invoke-static {p1, p2}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 49
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 65
    const-string p2, ""

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 66
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p4

    const-string p5, "randomUUID(...)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    return-void
.end method

.method public static final synthetic access$getRepsFormat$cp()Landroid/icu/text/DecimalFormat;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->repsFormat:Landroid/icu/text/DecimalFormat;

    return-object v0
.end method

.method public static final synthetic access$getTimeFormat$cp()Landroid/icu/text/DecimalFormat;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->timeFormat:Landroid/icu/text/DecimalFormat;

    return-object v0
.end method

.method public static final synthetic access$getValidTimeInSecondsRange$cp()Li93/j;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->validTimeInSecondsRange:Li93/j;

    return-object v0
.end method

.method public static final synthetic access$getValidWeightRange$cp()Li93/f;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->validWeightRange:Li93/f;

    return-object v0
.end method

.method public static final synthetic access$getWeightFormat$cp()Landroid/icu/text/DecimalFormat;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weightFormat:Landroid/icu/text/DecimalFormat;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weightlifting_release(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lzc3/c;Lyc3/g;)V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x2

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    const-string v3, "randomUUID(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    sget-object v1, Llu2/c;->a:Llu2/c;

    iget-object p0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)Lcom/whoop/weightlifting/data/domain/WorkoutSet;
    .locals 1

    const-string v0, "numberOfReps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/data/domain/WorkoutSet;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getNumberOfReps()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    return-object v0
.end method

.method public final getNumberOfRepsAsInt()I
    .locals 2

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->access$toNumberOfRepsAsIntOrNull(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeAsIntSeconds()Ljava/lang/Integer;
    .locals 2

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->access$toTimeAsIntSecondsOrNull(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getWeight()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeightAsFloat()F
    .locals 2

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->Companion:Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;->access$toWeightAsFloatOrNull(Lcom/whoop/weightlifting/data/domain/WorkoutSet$Companion;Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->numberOfReps:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->time:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->weight:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WorkoutSet;->id:Ljava/util/UUID;

    const-string v4, ", time="

    const-string v5, ", weight="

    const-string v6, "WorkoutSet(numberOfReps="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
