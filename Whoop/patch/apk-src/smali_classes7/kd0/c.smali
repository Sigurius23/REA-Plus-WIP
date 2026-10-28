.class public final Lkd0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkd0/c$a;,
        Lkd0/c$b;,
        Lkd0/c$c;,
        Lkd0/c$d;,
        Lkd0/c$e;,
        Lkd0/c$f;,
        Lkd0/c$g;,
        Lkd0/c$h;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0008\u001b\"\u0015#$%&\u0017B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\'"
    }
    d2 = {
        "Lkd0/c;",
        "Lfy1/k;",
        "Lkd0/c$a;",
        "popUpDialog",
        "Lkd0/c$d;",
        "fullScreenModal",
        "Lkd0/c$g;",
        "screenContent",
        "<init>",
        "(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;)V",
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
        "Lkd0/c$a;",
        "c",
        "()Lkd0/c$a;",
        "Lkd0/c$d;",
        "()Lkd0/c$d;",
        "d",
        "Lkd0/c$g;",
        "()Lkd0/c$g;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "a",
        "g",
        "h",
        "e",
        "f",
        "advanced-labs_release"
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
.field private final b:Lkd0/c$a;

.field private final c:Lkd0/c$d;

.field private final d:Lkd0/c$g;


# direct methods
.method public constructor <init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lkd0/c;->b:Lkd0/c$a;

    .line 3
    iput-object p2, p0, Lkd0/c;->c:Lkd0/c$d;

    .line 4
    iput-object p3, p0, Lkd0/c;->d:Lkd0/c$g;

    return-void
.end method

.method public synthetic constructor <init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lkd0/c;-><init>(Lkd0/c$a;Lkd0/c$d;Lkd0/c$g;)V

    return-void
.end method


# virtual methods
.method public final b()Lkd0/c$d;
    .locals 1

    iget-object v0, p0, Lkd0/c;->c:Lkd0/c$d;

    return-object v0
.end method

.method public final c()Lkd0/c$a;
    .locals 1

    iget-object v0, p0, Lkd0/c;->b:Lkd0/c$a;

    return-object v0
.end method

.method public final d()Lkd0/c$g;
    .locals 1

    iget-object v0, p0, Lkd0/c;->d:Lkd0/c$g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkd0/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lkd0/c;

    iget-object v1, p0, Lkd0/c;->b:Lkd0/c$a;

    iget-object v3, p1, Lkd0/c;->b:Lkd0/c$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lkd0/c;->c:Lkd0/c$d;

    iget-object v3, p1, Lkd0/c;->c:Lkd0/c$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lkd0/c;->d:Lkd0/c$g;

    iget-object p1, p1, Lkd0/c;->d:Lkd0/c$g;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 2

    iget-object v0, p0, Lkd0/c;->c:Lkd0/c$d;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lkd0/c$d;->d()Lsz0/q0;

    move-result-object v0

    invoke-virtual {v0}, Lsz0/q0;->n()Lsz0/p0;

    move-result-object v0

    sget-object v1, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->LOADING:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_0
    instance-of v1, v0, Lsz0/p0$b;

    if-eqz v1, :cond_1

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->ERROR:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_1
    instance-of v0, v0, Lsz0/p0$h;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_2
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->OTHER:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    iget-object v0, p0, Lkd0/c;->d:Lkd0/c$g;

    if-eqz v0, :cond_4

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_4
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->UNKNOWN:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lkd0/c;->c:Lkd0/c$d;

    if-nez v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lkd0/c$d;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lkd0/c;->d:Lkd0/c$g;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lkd0/c$g;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lkd0/c;->b:Lkd0/c$a;

    iget-object v1, p0, Lkd0/c;->c:Lkd0/c$d;

    iget-object v2, p0, Lkd0/c;->d:Lkd0/c$g;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "AdvancedLabsViewState(popUpDialog="

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
