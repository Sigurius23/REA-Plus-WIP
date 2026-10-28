.class public final Ldm1/a$s;
.super Ldm1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldm1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "s"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0013\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u001a\u001a\u0004\u0008\u0017\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ldm1/a$s;",
        "Ldm1/a;",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "",
        "actionArgument",
        "",
        "fromMyDay",
        "<init>",
        "(Lcom/whoop/navigation/e;Ljava/lang/Object;Z)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/navigation/e;",
        "c",
        "()Lcom/whoop/navigation/e;",
        "b",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
        "Z",
        "()Z",
        "home_release"
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
.field private final a:Lcom/whoop/navigation/e;

.field private final b:Ljava/lang/Object;

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/whoop/navigation/e;Ljava/lang/Object;Z)V
    .locals 1

    const-string v0, "navigationAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ldm1/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Ldm1/a$s;->a:Lcom/whoop/navigation/e;

    .line 3
    iput-object p2, p0, Ldm1/a$s;->b:Ljava/lang/Object;

    .line 4
    iput-boolean p3, p0, Ldm1/a$s;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/e;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ldm1/a$s;-><init>(Lcom/whoop/navigation/e;Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldm1/a$s;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Ldm1/a$s;->c:Z

    return v0
.end method

.method public final c()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Ldm1/a$s;->a:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldm1/a$s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldm1/a$s;

    iget-object v1, p0, Ldm1/a$s;->a:Lcom/whoop/navigation/e;

    iget-object v3, p1, Ldm1/a$s;->a:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ldm1/a$s;->b:Ljava/lang/Object;

    iget-object v3, p1, Ldm1/a$s;->b:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ldm1/a$s;->c:Z

    iget-boolean p1, p1, Ldm1/a$s;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Ldm1/a$s;->a:Lcom/whoop/navigation/e;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ldm1/a$s;->b:Ljava/lang/Object;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ldm1/a$s;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Ldm1/a$s;->a:Lcom/whoop/navigation/e;

    iget-object v1, p0, Ldm1/a$s;->b:Ljava/lang/Object;

    iget-boolean v2, p0, Ldm1/a$s;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "NavigationActionEvent(navigationAction="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionArgument="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fromMyDay="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
