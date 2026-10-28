.class public final Lnp0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnp0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010#R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Lnp0/b;",
        "",
        "Lnp0/a;",
        "type",
        "Lkp0/o;",
        "sleepPercent",
        "Lorg/joda/time/LocalTime;",
        "latestWakeTime",
        "",
        "isAlarmEnabled",
        "<init>",
        "(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)V",
        "Lkp0/a;",
        "g",
        "()Lkp0/a;",
        "a",
        "(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)Lnp0/b;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lnp0/a;",
        "e",
        "()Lnp0/a;",
        "b",
        "Lkp0/o;",
        "d",
        "()Lkp0/o;",
        "c",
        "Lorg/joda/time/LocalTime;",
        "()Lorg/joda/time/LocalTime;",
        "Z",
        "f",
        "()Z",
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


# instance fields
.field private final a:Lnp0/a;

.field private final b:Lkp0/o;

.field private final c:Lorg/joda/time/LocalTime;

.field private final d:Z


# direct methods
.method public constructor <init>(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepPercent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestWakeTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lnp0/b;->a:Lnp0/a;

    .line 3
    iput-object p2, p0, Lnp0/b;->b:Lkp0/o;

    .line 4
    iput-object p3, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    .line 5
    iput-boolean p4, p0, Lnp0/b;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    sget-object p1, Lnp0/a;->EXACT_TIME:Lnp0/a;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 7
    sget-object p2, Lkp0/l;->z:Lkp0/l;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    .line 8
    new-instance p3, Lorg/joda/time/LocalTime;

    const/4 p6, 0x7

    const/16 v0, 0x1e

    invoke-direct {p3, p6, v0}, Lorg/joda/time/LocalTime;-><init>(II)V

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    .line 9
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lnp0/b;-><init>(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)V

    return-void
.end method

.method public static synthetic b(Lnp0/b;Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;ZILjava/lang/Object;)Lnp0/b;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lnp0/b;->a:Lnp0/a;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lnp0/b;->b:Lkp0/o;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lnp0/b;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lnp0/b;->a(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)Lnp0/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)Lnp0/b;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepPercent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestWakeTime"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnp0/b;

    invoke-direct {v0, p1, p2, p3, p4}, Lnp0/b;-><init>(Lnp0/a;Lkp0/o;Lorg/joda/time/LocalTime;Z)V

    return-object v0
.end method

.method public final c()Lorg/joda/time/LocalTime;
    .locals 1

    iget-object v0, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    return-object v0
.end method

.method public final d()Lkp0/o;
    .locals 1

    iget-object v0, p0, Lnp0/b;->b:Lkp0/o;

    return-object v0
.end method

.method public final e()Lnp0/a;
    .locals 1

    iget-object v0, p0, Lnp0/b;->a:Lnp0/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnp0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lnp0/b;

    iget-object v1, p0, Lnp0/b;->a:Lnp0/a;

    iget-object v3, p1, Lnp0/b;->a:Lnp0/a;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lnp0/b;->b:Lkp0/o;

    iget-object v3, p1, Lnp0/b;->b:Lkp0/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    iget-object v3, p1, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lnp0/b;->d:Z

    iget-boolean p1, p1, Lnp0/b;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lnp0/b;->d:Z

    return v0
.end method

.method public final g()Lkp0/a;
    .locals 3

    iget-object v0, p0, Lnp0/b;->a:Lnp0/a;

    sget-object v1, Lnp0/b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, Lkp0/f;

    iget-object v1, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    invoke-direct {v0, v1}, Lkp0/f;-><init>(Lorg/joda/time/LocalTime;)V

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Lkp0/n;

    iget-object v1, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    iget-object v2, p0, Lnp0/b;->b:Lkp0/o;

    invoke-direct {v0, v1, v2}, Lkp0/n;-><init>(Lorg/joda/time/LocalTime;Lkp0/o;)V

    return-object v0

    :cond_2
    new-instance v0, Lkp0/c;

    iget-object v1, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    iget-object v2, p0, Lnp0/b;->b:Lkp0/o;

    invoke-direct {v0, v1, v2}, Lkp0/c;-><init>(Lorg/joda/time/LocalTime;Lkp0/o;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lnp0/b;->a:Lnp0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnp0/b;->b:Lkp0/o;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    invoke-virtual {v0}, Lorg/joda/time/LocalTime;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lnp0/b;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lnp0/b;->a:Lnp0/a;

    iget-object v1, p0, Lnp0/b;->b:Lkp0/o;

    iget-object v2, p0, Lnp0/b;->c:Lorg/joda/time/LocalTime;

    iget-boolean v3, p0, Lnp0/b;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AlarmViewState(type="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sleepPercent="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latestWakeTime="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isAlarmEnabled="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
