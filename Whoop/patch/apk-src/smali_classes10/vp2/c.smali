.class public final Lvp2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfy1/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvp2/c$a;,
        Lvp2/c$b;,
        Lvp2/c$c;,
        Lvp2/c$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0004\u0015\u001b\u0017\"B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lvp2/c;",
        "Lfy1/k;",
        "Lvp2/c$d;",
        "popUpDialog",
        "Lvp2/c$b;",
        "fullScreenModal",
        "Lvp2/c$c;",
        "screenContent",
        "<init>",
        "(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;)V",
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
        "Lvp2/c$d;",
        "c",
        "()Lvp2/c$d;",
        "Lvp2/c$b;",
        "()Lvp2/c$b;",
        "d",
        "Lvp2/c$c;",
        "()Lvp2/c$c;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "getState",
        "()Lcom/whoop/metrics/common/ScreenState;",
        "state",
        "a",
        "universal-checkout_release"
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
.field private final b:Lvp2/c$d;

.field private final c:Lvp2/c$b;

.field private final d:Lvp2/c$c;


# direct methods
.method public constructor <init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvp2/c;->b:Lvp2/c$d;

    .line 3
    iput-object p2, p0, Lvp2/c;->c:Lvp2/c$b;

    .line 4
    iput-object p3, p0, Lvp2/c;->d:Lvp2/c$c;

    return-void
.end method

.method public synthetic constructor <init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lvp2/c;-><init>(Lvp2/c$d;Lvp2/c$b;Lvp2/c$c;)V

    return-void
.end method


# virtual methods
.method public final b()Lvp2/c$b;
    .locals 1

    iget-object v0, p0, Lvp2/c;->c:Lvp2/c$b;

    return-object v0
.end method

.method public final c()Lvp2/c$d;
    .locals 1

    iget-object v0, p0, Lvp2/c;->b:Lvp2/c$d;

    return-object v0
.end method

.method public final d()Lvp2/c$c;
    .locals 1

    iget-object v0, p0, Lvp2/c;->d:Lvp2/c$c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvp2/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvp2/c;

    iget-object v1, p0, Lvp2/c;->b:Lvp2/c$d;

    iget-object v3, p1, Lvp2/c;->b:Lvp2/c$d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvp2/c;->c:Lvp2/c$b;

    iget-object v3, p1, Lvp2/c;->c:Lvp2/c$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvp2/c;->d:Lvp2/c$c;

    iget-object p1, p1, Lvp2/c;->d:Lvp2/c$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getState()Lcom/whoop/metrics/common/ScreenState;
    .locals 2

    iget-object v0, p0, Lvp2/c;->c:Lvp2/c$b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lvp2/c$b;->d()Lsz0/q0;

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
    iget-object v0, p0, Lvp2/c;->d:Lvp2/c$c;

    if-eqz v0, :cond_3

    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    return-object v0

    :cond_3
    sget-object v0, Lcom/whoop/metrics/common/ScreenState;->UNKNOWN:Lcom/whoop/metrics/common/ScreenState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lvp2/c;->c:Lvp2/c$b;

    if-nez v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lvp2/c$b;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lvp2/c;->d:Lvp2/c$c;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lvp2/c$c;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lvp2/c;->b:Lvp2/c$d;

    iget-object v1, p0, Lvp2/c;->c:Lvp2/c$b;

    iget-object v2, p0, Lvp2/c;->d:Lvp2/c$c;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ShippingMethodViewState(popUpDialog="

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
