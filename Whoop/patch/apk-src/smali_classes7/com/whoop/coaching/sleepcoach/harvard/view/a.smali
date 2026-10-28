.class public final Lcom/whoop/coaching/sleepcoach/harvard/view/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0016\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/harvard/view/a;",
        "",
        "",
        "pixelsPerMilli",
        "",
        "totalTimeDurationOnScreen",
        "Lorg/joda/time/Instant;",
        "timeStampAtLeftmostPixelOnScreen",
        "<init>",
        "(DILorg/joda/time/Instant;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "D",
        "()D",
        "b",
        "I",
        "c",
        "Lorg/joda/time/Instant;",
        "()Lorg/joda/time/Instant;",
        "d",
        "sleep-coach_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;

.field public static final e:I


# instance fields
.field private final a:D

.field private final b:I

.field private final c:Lorg/joda/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->d:Lcom/whoop/coaching/sleepcoach/harvard/view/a$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->e:I

    return-void
.end method

.method public constructor <init>(DILorg/joda/time/Instant;)V
    .locals 1

    const-string v0, "timeStampAtLeftmostPixelOnScreen"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a:D

    iput p3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b:I

    iput-object p4, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c:Lorg/joda/time/Instant;

    return-void
.end method


# virtual methods
.method public final a()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a:D

    return-wide v0
.end method

.method public final b()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/coaching/sleepcoach/harvard/view/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/coaching/sleepcoach/harvard/view/a;

    iget-wide v3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a:D

    iget-wide v5, p1, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b:I

    iget v3, p1, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c:Lorg/joda/time/Instant;

    iget-object p1, p1, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c:Lorg/joda/time/Instant;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c:Lorg/joda/time/Instant;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-wide v0, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->a:D

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->b:I

    iget-object v3, p0, Lcom/whoop/coaching/sleepcoach/harvard/view/a;->c:Lorg/joda/time/Instant;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Scale(pixelsPerMilli="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", totalTimeDurationOnScreen="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", timeStampAtLeftmostPixelOnScreen="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
