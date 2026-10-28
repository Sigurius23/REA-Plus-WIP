.class public final Llp0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llp0/l$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0012\u001a\u0004\u0008\u001b\u0010\u0014\u00a8\u0006\u001d"
    }
    d2 = {
        "Llp0/l;",
        "",
        "Lorg/joda/time/Instant;",
        "startTime",
        "endTime",
        "<init>",
        "(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lorg/joda/time/Instant;",
        "e",
        "()Lorg/joda/time/Instant;",
        "b",
        "c",
        "Lorg/joda/time/Duration;",
        "Lorg/joda/time/Duration;",
        "()Lorg/joda/time/Duration;",
        "duration",
        "d",
        "middle",
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
.field public static final e:Llp0/l$a;

.field public static final f:I

.field private static final g:Llp0/l;


# instance fields
.field private final a:Lorg/joda/time/Instant;

.field private final b:Lorg/joda/time/Instant;

.field private final c:Lorg/joda/time/Duration;

.field private final d:Lorg/joda/time/Instant;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llp0/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llp0/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llp0/l;->e:Llp0/l$a;

    const/16 v0, 0x8

    sput v0, Llp0/l;->f:I

    new-instance v0, Llp0/l;

    sget-object v1, Lorg/joda/time/Instant;->EPOCH:Lorg/joda/time/Instant;

    const-string v2, "EPOCH"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v1}, Llp0/l;-><init>(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)V

    sput-object v0, Llp0/l;->g:Llp0/l;

    return-void
.end method

.method public constructor <init>(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)V
    .locals 3

    const-string v0, "startTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp0/l;->a:Lorg/joda/time/Instant;

    iput-object p2, p0, Llp0/l;->b:Lorg/joda/time/Instant;

    new-instance v0, Lorg/joda/time/Duration;

    invoke-direct {v0, p1, p2}, Lorg/joda/time/Duration;-><init>(Lorg/joda/time/ReadableInstant;Lorg/joda/time/ReadableInstant;)V

    iput-object v0, p0, Llp0/l;->c:Lorg/joda/time/Duration;

    new-instance v0, Lorg/joda/time/Instant;

    invoke-virtual {p1}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v1

    invoke-virtual {p2}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide p1

    add-long/2addr p1, v1

    const/4 v1, 0x2

    int-to-long v1, v1

    div-long/2addr p1, v1

    invoke-direct {v0, p1, p2}, Lorg/joda/time/Instant;-><init>(J)V

    iput-object v0, p0, Llp0/l;->d:Lorg/joda/time/Instant;

    return-void
.end method

.method public static final synthetic a()Llp0/l;
    .locals 1

    sget-object v0, Llp0/l;->g:Llp0/l;

    return-object v0
.end method


# virtual methods
.method public final b()Lorg/joda/time/Duration;
    .locals 1

    iget-object v0, p0, Llp0/l;->c:Lorg/joda/time/Duration;

    return-object v0
.end method

.method public final c()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Llp0/l;->b:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public final d()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Llp0/l;->d:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public final e()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Llp0/l;->a:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llp0/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llp0/l;

    iget-object v1, p0, Llp0/l;->a:Lorg/joda/time/Instant;

    iget-object v3, p1, Llp0/l;->a:Lorg/joda/time/Instant;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llp0/l;->b:Lorg/joda/time/Instant;

    iget-object p1, p1, Llp0/l;->b:Lorg/joda/time/Instant;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Llp0/l;->a:Lorg/joda/time/Instant;

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llp0/l;->b:Lorg/joda/time/Instant;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Llp0/l;->a:Lorg/joda/time/Instant;

    iget-object v1, p0, Llp0/l;->b:Lorg/joda/time/Instant;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Window(startTime="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", middle="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
