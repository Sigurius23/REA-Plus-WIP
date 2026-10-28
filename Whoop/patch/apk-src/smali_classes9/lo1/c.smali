.class public final Llo1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llo1/c$a;,
        Llo1/c$b;,
        Llo1/c$c;,
        Llo1/c$d;,
        Llo1/c$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0005\"\u0015#\u0017\u001bB+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Llo1/c;",
        "Lfy1/k;",
        "Llo1/c$b;",
        "popUpDialog",
        "Llo1/c$a;",
        "fullScreenModal",
        "Llo1/c$e;",
        "screenContent",
        "<init>",
        "(Llo1/c$b;Llo1/c$a;Llo1/c$e;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Llo1/c$b;",
        "c",
        "()Llo1/c$b;",
        "Llo1/c$a;",
        "()Llo1/c$a;",
        "d",
        "Llo1/c$e;",
        "()Llo1/c$e;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "a",
        "e",
        "hormonal-insights_release"
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
.field private final b:Llo1/c$b;

.field private final c:Llo1/c$a;

.field private final d:Llo1/c$e;


# direct methods
.method public constructor <init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llo1/c;->b:Llo1/c$b;

    .line 3
    iput-object p2, p0, Llo1/c;->c:Llo1/c$a;

    .line 4
    iput-object p3, p0, Llo1/c;->d:Llo1/c$e;

    return-void
.end method

.method public synthetic constructor <init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Llo1/c;-><init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;)V

    return-void
.end method


# virtual methods
.method public final b()Llo1/c$a;
    .locals 1

    iget-object v0, p0, Llo1/c;->c:Llo1/c$a;

    return-object v0
.end method

.method public final c()Llo1/c$b;
    .locals 1

    iget-object v0, p0, Llo1/c;->b:Llo1/c$b;

    return-object v0
.end method

.method public final d()Llo1/c$e;
    .locals 1

    iget-object v0, p0, Llo1/c;->d:Llo1/c$e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llo1/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llo1/c;

    iget-object v1, p0, Llo1/c;->b:Llo1/c$b;

    iget-object v3, p1, Llo1/c;->b:Llo1/c$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llo1/c;->c:Llo1/c$a;

    iget-object v3, p1, Llo1/c;->c:Llo1/c$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llo1/c;->d:Llo1/c$e;

    iget-object p1, p1, Llo1/c;->d:Llo1/c$e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 2

    iget-object v0, p0, Llo1/c;->c:Llo1/c$a;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Llo1/c$a;->d()Lsz0/q0;

    move-result-object v0

    invoke-virtual {v0}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v0

    instance-of v1, v0, Lsz0/p0$c;

    if-eqz v1, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    instance-of v0, v0, Lsz0/p0$b;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_1
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->OTHER:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_2
    iget-object v0, p0, Llo1/c;->d:Llo1/c$e;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->UNKNOWN:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llo1/c;->b:Llo1/c$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Llo1/c$b;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llo1/c;->c:Llo1/c$a;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Llo1/c$a;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llo1/c;->d:Llo1/c$e;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Llo1/c$e;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Llo1/c;->b:Llo1/c$b;

    iget-object v1, p0, Llo1/c;->c:Llo1/c$a;

    iget-object v2, p0, Llo1/c;->d:Llo1/c$e;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "LogSymptomsViewState(popUpDialog="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fullScreenModal="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", screenContent="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
