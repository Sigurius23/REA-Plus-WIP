.class public final Lkotlinx/datetime/DateTimeUnit$MonthBased;
.super Lkotlinx/datetime/DateTimeUnit$DateBased;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/datetime/DateTimeUnit;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MonthBased"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001a\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "Lkotlinx/datetime/DateTimeUnit$MonthBased;",
        "Lkotlinx/datetime/DateTimeUnit$DateBased;",
        "",
        "months",
        "<init>",
        "(I)V",
        "scalar",
        "times",
        "(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "I",
        "getMonths",
        "Companion",
        "kotlinx/datetime/d",
        "kotlinx-datetime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lvc3/l;
.end annotation


# static fields
.field public static final Companion:Lkotlinx/datetime/d;


# instance fields
.field private final months:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/datetime/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->Companion:Lkotlinx/datetime/d;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlinx/datetime/DateTimeUnit$DateBased;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    if-lez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "Unit duration must be positive, but was "

    const-string v1, " months."

    invoke-static {p1, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lkotlinx/datetime/DateTimeUnit$MonthBased;

    if-eqz v0, :cond_0

    iget v0, p0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    check-cast p1, Lkotlinx/datetime/DateTimeUnit$MonthBased;

    iget p1, p1, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getMonths()I
    .locals 1

    iget v0, p0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    const/high16 v1, 0x20000

    xor-int/2addr v0, v1

    return v0
.end method

.method public times(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;
    .locals 2

    .line 2
    new-instance v0, Lkotlinx/datetime/DateTimeUnit$MonthBased;

    iget v1, p0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    .line 3
    invoke-static {v1, p1}, Ljava/lang/Math;->multiplyExact(II)I

    move-result p1

    .line 4
    invoke-direct {v0, p1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic times(I)Lkotlinx/datetime/DateTimeUnit;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lkotlinx/datetime/DateTimeUnit$MonthBased;->times(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lkotlinx/datetime/DateTimeUnit$MonthBased;->months:I

    rem-int/lit16 v1, v0, 0x4b0

    if-nez v1, :cond_0

    div-int/lit16 v0, v0, 0x4b0

    const-string v1, "CENTURY"

    invoke-virtual {p0, v0, v1}, Lkotlinx/datetime/DateTimeUnit;->formatToString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    rem-int/lit8 v1, v0, 0xc

    if-nez v1, :cond_1

    div-int/lit8 v0, v0, 0xc

    const-string v1, "YEAR"

    invoke-virtual {p0, v0, v1}, Lkotlinx/datetime/DateTimeUnit;->formatToString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    rem-int/lit8 v1, v0, 0x3

    if-nez v1, :cond_2

    div-int/lit8 v0, v0, 0x3

    const-string v1, "QUARTER"

    invoke-virtual {p0, v0, v1}, Lkotlinx/datetime/DateTimeUnit;->formatToString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v1, "MONTH"

    invoke-virtual {p0, v0, v1}, Lkotlinx/datetime/DateTimeUnit;->formatToString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
