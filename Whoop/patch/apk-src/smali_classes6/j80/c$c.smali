.class public final Lj80/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj80/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj80/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00072\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001c\u0010\u000eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001d\u001a\u0004\u0008 \u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001a\u001a\u0004\u0008\u001f\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lj80/c$c;",
        "Lj80/c;",
        "Lp90/e;",
        "card",
        "",
        "payload",
        "promoCode",
        "",
        "orderDetailsReplaced",
        "isSavedPaymentMethod",
        "userCountryCode",
        "<init>",
        "(Lp90/e;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lp90/e;",
        "()Lp90/e;",
        "b",
        "Ljava/lang/String;",
        "c",
        "d",
        "Z",
        "()Z",
        "e",
        "f",
        "activation_release"
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
.field private final a:Lp90/e;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Z

.field private final e:Z

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lp90/e;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 1

    const-string v0, "card"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj80/c$c;->a:Lp90/e;

    iput-object p2, p0, Lj80/c$c;->b:Ljava/lang/String;

    iput-object p3, p0, Lj80/c$c;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lj80/c$c;->d:Z

    iput-boolean p5, p0, Lj80/c$c;->e:Z

    iput-object p6, p0, Lj80/c$c;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lp90/e;
    .locals 1

    iget-object v0, p0, Lj80/c$c;->a:Lp90/e;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lj80/c$c;->d:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj80/c$c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj80/c$c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj80/c$c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj80/c$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj80/c$c;

    iget-object v1, p0, Lj80/c$c;->a:Lp90/e;

    iget-object v3, p1, Lj80/c$c;->a:Lp90/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj80/c$c;->b:Ljava/lang/String;

    iget-object v3, p1, Lj80/c$c;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj80/c$c;->c:Ljava/lang/String;

    iget-object v3, p1, Lj80/c$c;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lj80/c$c;->d:Z

    iget-boolean v3, p1, Lj80/c$c;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lj80/c$c;->e:Z

    iget-boolean v3, p1, Lj80/c$c;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lj80/c$c;->f:Ljava/lang/String;

    iget-object p1, p1, Lj80/c$c;->f:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lj80/c$c;->e:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lj80/c$c;->a:Lp90/e;

    invoke-virtual {v0}, Lp90/e;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj80/c$c;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lj80/c$c;->c:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lj80/c$c;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lj80/c$c;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lj80/c$c;->f:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lj80/c$c;->a:Lp90/e;

    iget-object v1, p0, Lj80/c$c;->b:Ljava/lang/String;

    iget-object v2, p0, Lj80/c$c;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lj80/c$c;->d:Z

    iget-boolean v4, p0, Lj80/c$c;->e:Z

    iget-object v5, p0, Lj80/c$c;->f:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "OnUpcyclePaymentInfoSubmitted(card="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", payload="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", promoCode="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", orderDetailsReplaced="

    const-string v1, ", isSavedPaymentMethod="

    invoke-static {v6, v2, v0, v3, v1}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", userCountryCode="

    const-string v1, ")"

    invoke-static {v6, v4, v0, v5, v1}, Ljh3/c;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
