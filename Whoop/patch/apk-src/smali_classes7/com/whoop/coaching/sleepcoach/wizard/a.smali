.class public final Lcom/whoop/coaching/sleepcoach/wizard/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B9\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJB\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001a\u001a\u0004\u0008 \u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/wizard/a;",
        "",
        "Lkp0/a;",
        "alarmType",
        "",
        "enabled",
        "isStrapHasLowBattery",
        "",
        "nextScheduleDayLabel",
        "isScheduleEnabled",
        "<init>",
        "(Lkp0/a;ZZLjava/lang/String;Z)V",
        "a",
        "(Lkp0/a;ZZLjava/lang/String;Z)Lcom/whoop/coaching/sleepcoach/wizard/a;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lkp0/a;",
        "c",
        "()Lkp0/a;",
        "b",
        "Z",
        "d",
        "()Z",
        "g",
        "Ljava/lang/String;",
        "e",
        "f",
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
.field private final a:Lkp0/a;

.field private final b:Z

.field private final c:Z

.field private final d:Ljava/lang/String;

.field private final e:Z


# direct methods
.method public constructor <init>(Lkp0/a;ZZLjava/lang/String;Z)V
    .locals 1

    const-string v0, "alarmType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextScheduleDayLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    .line 3
    iput-boolean p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    .line 4
    iput-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    .line 5
    iput-object p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    .line 6
    iput-boolean p5, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkp0/a;ZZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    sget-object p1, Lcom/whoop/coaching/sleepcoach/wizard/b;->q:Lcom/whoop/coaching/sleepcoach/wizard/b$a;

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;->b()Lkp0/a;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 8
    const-string p4, ""

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p7, v0

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move p7, p5

    move-object p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 9
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/whoop/coaching/sleepcoach/wizard/a;-><init>(Lkp0/a;ZZLjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/coaching/sleepcoach/wizard/a;Lkp0/a;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/a;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/coaching/sleepcoach/wizard/a;->a(Lkp0/a;ZZLjava/lang/String;Z)Lcom/whoop/coaching/sleepcoach/wizard/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lkp0/a;ZZLjava/lang/String;Z)Lcom/whoop/coaching/sleepcoach/wizard/a;
    .locals 7

    const-string v0, "alarmType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextScheduleDayLabel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/coaching/sleepcoach/wizard/a;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/coaching/sleepcoach/wizard/a;-><init>(Lkp0/a;ZZLjava/lang/String;Z)V

    return-object v1
.end method

.method public final c()Lkp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/coaching/sleepcoach/wizard/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/a;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    iget-boolean p1, p1, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->a:Lkp0/a;

    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->b:Z

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->c:Z

    iget-object v3, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->d:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/coaching/sleepcoach/wizard/a;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "CollapsedDataViewState(alarmType="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isStrapHasLowBattery="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", nextScheduleDayLabel="

    const-string v1, ", isScheduleEnabled="

    invoke-static {v5, v2, v0, v3, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
