.class public final Lcom/whoop/puffin/sync/f$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/puffin/sync/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/puffin/sync/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u000cR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u000cR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0013\u001a\u0004\u0008\u0015\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/f$b$b;",
        "Lcom/whoop/puffin/sync/f$b;",
        "",
        "savedConsoleLogPacketsCount",
        "savedFirmwareEventPacketsCount",
        "burstCount",
        "<init>",
        "(III)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "b",
        "c",
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
.field private final a:I

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/puffin/sync/f$b$b;->a:I

    iput p2, p0, Lcom/whoop/puffin/sync/f$b$b;->b:I

    iput p3, p0, Lcom/whoop/puffin/sync/f$b$b;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/whoop/puffin/sync/f$b$b;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/whoop/puffin/sync/f$b$b;->a:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/whoop/puffin/sync/f$b$b;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/puffin/sync/f$b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/puffin/sync/f$b$b;

    iget v1, p0, Lcom/whoop/puffin/sync/f$b$b;->a:I

    iget v3, p1, Lcom/whoop/puffin/sync/f$b$b;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/puffin/sync/f$b$b;->b:I

    iget v3, p1, Lcom/whoop/puffin/sync/f$b$b;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/puffin/sync/f$b$b;->c:I

    iget p1, p1, Lcom/whoop/puffin/sync/f$b$b;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/puffin/sync/f$b$b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/puffin/sync/f$b$b;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/puffin/sync/f$b$b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/f$b$b;->c()I

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/f$b$b;->b()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/f$b$b;->a()I

    move-result v2

    const-string v3, ", consoleCount="

    const-string v4, ", firmwareCount="

    const-string v5, "HPS.MetadataEventWhileNotSyncing(burstCount="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
