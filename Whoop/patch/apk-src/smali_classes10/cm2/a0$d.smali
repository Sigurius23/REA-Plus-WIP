.class public final Lcm2/a0$d;
.super Lcm2/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcm2/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0008\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcm2/a0$d;",
        "Lcm2/a0;",
        "Lam2/p0;",
        "viewState",
        "<init>",
        "(Lam2/p0;)V",
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
        "c",
        "Lam2/p0;",
        "()Lam2/p0;",
        "Lor2/h0;",
        "b",
        "()Lor2/h0;",
        "graphKey",
        "a",
        "screenTag",
        "trends_release"
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
.field private final c:Lam2/p0;


# direct methods
.method public constructor <init>(Lam2/p0;)V
    .locals 1

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcm2/a0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcm2/a0$d;->c:Lam2/p0;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcm2/a0;->b:Lcm2/a0$a;

    invoke-virtual {p0}, Lcm2/a0$d;->b()Lor2/h0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcm2/a0$a;->a(Lor2/h0;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lor2/h0;
    .locals 1

    iget-object v0, p0, Lcm2/a0$d;->c:Lam2/p0;

    invoke-virtual {v0}, Lam2/p0;->t()Lam2/d0;

    move-result-object v0

    invoke-virtual {v0}, Lam2/d0;->c()Lor2/h0;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lam2/p0;
    .locals 1

    iget-object v0, p0, Lcm2/a0$d;->c:Lam2/p0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcm2/a0$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcm2/a0$d;

    iget-object v1, p0, Lcm2/a0$d;->c:Lam2/p0;

    iget-object p1, p1, Lcm2/a0$d;->c:Lam2/p0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcm2/a0$d;->c:Lam2/p0;

    invoke-virtual {v0}, Lam2/p0;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcm2/a0$d;->c:Lam2/p0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SuccessV3(viewState="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
