.class public final Lj02/j0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/j0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj02/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lj02/j0$c;",
        "Lj02/j0;",
        "Leb/k0;",
        "link",
        "Leb/x0;",
        "options",
        "Lj02/p0;",
        "result",
        "<init>",
        "(Leb/k0;Leb/x0;Lj02/p0;)V",
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
        "a",
        "Leb/k0;",
        "()Leb/k0;",
        "b",
        "Leb/x0;",
        "()Leb/x0;",
        "c",
        "Lj02/p0;",
        "()Lj02/p0;",
        "navigation_release"
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
.field private final a:Leb/k0;

.field private final b:Leb/x0;

.field private final c:Lj02/p0;


# direct methods
.method public constructor <init>(Leb/k0;Leb/x0;Lj02/p0;)V
    .locals 1

    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj02/j0$c;->a:Leb/k0;

    .line 3
    iput-object p2, p0, Lj02/j0$c;->b:Leb/x0;

    .line 4
    iput-object p3, p0, Lj02/j0$c;->c:Lj02/p0;

    return-void
.end method

.method public synthetic constructor <init>(Leb/k0;Leb/x0;Lj02/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 5
    sget-object p3, Lj02/p0$d;->a:Lj02/p0$d;

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lj02/j0$c;-><init>(Leb/k0;Leb/x0;Lj02/p0;)V

    return-void
.end method


# virtual methods
.method public final a()Leb/k0;
    .locals 1

    iget-object v0, p0, Lj02/j0$c;->a:Leb/k0;

    return-object v0
.end method

.method public final b()Leb/x0;
    .locals 1

    iget-object v0, p0, Lj02/j0$c;->b:Leb/x0;

    return-object v0
.end method

.method public final c()Lj02/p0;
    .locals 1

    iget-object v0, p0, Lj02/j0$c;->c:Lj02/p0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj02/j0$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj02/j0$c;

    iget-object v1, p0, Lj02/j0$c;->a:Leb/k0;

    iget-object v3, p1, Lj02/j0$c;->a:Leb/k0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj02/j0$c;->b:Leb/x0;

    iget-object v3, p1, Lj02/j0$c;->b:Leb/x0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj02/j0$c;->c:Lj02/p0;

    iget-object p1, p1, Lj02/j0$c;->c:Lj02/p0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lj02/j0$c;->a:Leb/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj02/j0$c;->b:Leb/x0;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Leb/x0;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lj02/j0$c;->c:Lj02/p0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lj02/j0$c;->a:Leb/k0;

    iget-object v1, p0, Lj02/j0$c;->b:Leb/x0;

    iget-object v2, p0, Lj02/j0$c;->c:Lj02/p0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Route(link="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
