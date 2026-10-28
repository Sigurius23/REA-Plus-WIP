.class public final Lcom/whoop/coaching/sleepcoach/wizard/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001d\u0010\u0018R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/wizard/c;",
        "",
        "",
        "isPopUpVisible",
        "Lorg/joda/time/LocalTime;",
        "alarmTime",
        "isInToggleMode",
        "Lmp0/n;",
        "popUpDismissedState",
        "<init>",
        "(ZLorg/joda/time/LocalTime;ZLmp0/n;)V",
        "a",
        "(ZLorg/joda/time/LocalTime;ZLmp0/n;)Lcom/whoop/coaching/sleepcoach/wizard/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "f",
        "()Z",
        "b",
        "Lorg/joda/time/LocalTime;",
        "c",
        "()Lorg/joda/time/LocalTime;",
        "e",
        "d",
        "Lmp0/n;",
        "()Lmp0/n;",
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
.field private final a:Z

.field private final b:Lorg/joda/time/LocalTime;

.field private final c:Z

.field private final d:Lmp0/n;


# direct methods
.method public constructor <init>(ZLorg/joda/time/LocalTime;ZLmp0/n;)V
    .locals 1

    const-string v0, "alarmTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "popUpDismissedState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    .line 3
    iput-object p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    .line 4
    iput-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    .line 5
    iput-object p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    return-void
.end method

.method public synthetic constructor <init>(ZLorg/joda/time/LocalTime;ZLmp0/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    .line 6
    sget-object p2, Lcom/whoop/coaching/sleepcoach/wizard/b;->q:Lcom/whoop/coaching/sleepcoach/wizard/b$a;

    invoke-virtual {p2}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;->a()Lorg/joda/time/LocalTime;

    move-result-object p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 7
    sget-object p4, Lmp0/n;->NOT_DISMISS_ACTION:Lmp0/n;

    .line 8
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/coaching/sleepcoach/wizard/c;-><init>(ZLorg/joda/time/LocalTime;ZLmp0/n;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/coaching/sleepcoach/wizard/c;ZLorg/joda/time/LocalTime;ZLmp0/n;ILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/c;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/coaching/sleepcoach/wizard/c;->a(ZLorg/joda/time/LocalTime;ZLmp0/n;)Lcom/whoop/coaching/sleepcoach/wizard/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZLorg/joda/time/LocalTime;ZLmp0/n;)Lcom/whoop/coaching/sleepcoach/wizard/c;
    .locals 1

    const-string v0, "alarmTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "popUpDismissedState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/coaching/sleepcoach/wizard/c;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/coaching/sleepcoach/wizard/c;-><init>(ZLorg/joda/time/LocalTime;ZLmp0/n;)V

    return-object v0
.end method

.method public final c()Lorg/joda/time/LocalTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    return-object v0
.end method

.method public final d()Lmp0/n;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/coaching/sleepcoach/wizard/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/c;

    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    iget-object p1, p1, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    invoke-virtual {v2}, Lorg/joda/time/LocalTime;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->a:Z

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->b:Lorg/joda/time/LocalTime;

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->c:Z

    iget-object v3, p0, Lcom/whoop/coaching/sleepcoach/wizard/c;->d:Lmp0/n;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "LowBatteryPopState(isPopUpVisible="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", alarmTime="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isInToggleMode="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", popUpDismissedState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
