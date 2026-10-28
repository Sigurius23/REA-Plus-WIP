.class public final Lcom/whoop/puffin/sync/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/puffin/sync/e$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/puffin/sync/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001c\u001a\u0004\u0008\u0018\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/e$d;",
        "Lcom/whoop/puffin/sync/e$c;",
        "Lf52/g;",
        "burstData",
        "Lf52/b;",
        "metadata",
        "La52/d;",
        "successPacket",
        "<init>",
        "(Lf52/g;Lf52/b;La52/d;)V",
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
        "Lf52/g;",
        "()Lf52/g;",
        "b",
        "Lf52/b;",
        "c",
        "()Lf52/b;",
        "La52/d;",
        "()La52/d;",
        "puffin_release"
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
.field private final a:Lf52/g;

.field private final b:Lf52/b;

.field private final c:La52/d;


# direct methods
.method public constructor <init>(Lf52/g;Lf52/b;La52/d;)V
    .locals 1

    const-string v0, "burstData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "successPacket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/puffin/sync/e$d;->a:Lf52/g;

    iput-object p2, p0, Lcom/whoop/puffin/sync/e$d;->b:Lf52/b;

    iput-object p3, p0, Lcom/whoop/puffin/sync/e$d;->c:La52/d;

    return-void
.end method


# virtual methods
.method public a()Lf52/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/e$d;->a:Lf52/g;

    return-object v0
.end method

.method public final b()La52/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/e$d;->c:La52/d;

    return-object v0
.end method

.method public c()Lf52/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/e$d;->b:Lf52/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/puffin/sync/e$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/puffin/sync/e$d;

    iget-object v1, p0, Lcom/whoop/puffin/sync/e$d;->a:Lf52/g;

    iget-object v3, p1, Lcom/whoop/puffin/sync/e$d;->a:Lf52/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/puffin/sync/e$d;->b:Lf52/b;

    iget-object v3, p1, Lcom/whoop/puffin/sync/e$d;->b:Lf52/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/puffin/sync/e$d;->c:La52/d;

    iget-object p1, p1, Lcom/whoop/puffin/sync/e$d;->c:La52/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/puffin/sync/e$d;->a:Lf52/g;

    invoke-virtual {v0}, Lf52/g;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/puffin/sync/e$d;->b:Lf52/b;

    invoke-virtual {v1}, Lf52/b;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/puffin/sync/e$d;->c:La52/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/e$d;->a()Lf52/g;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/e$d;->c()Lf52/b;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BurstState.Validated("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metadata="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
