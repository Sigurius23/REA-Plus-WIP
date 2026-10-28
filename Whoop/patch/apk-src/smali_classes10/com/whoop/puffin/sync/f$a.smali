.class public final Lcom/whoop/puffin/sync/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/puffin/sync/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/puffin/sync/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ8\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u0010\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/f$a;",
        "Lcom/whoop/puffin/sync/f;",
        "Lcom/whoop/puffin/sync/e;",
        "openBurst",
        "",
        "savedConsoleLogPacketsCount",
        "savedFirmwareEventPacketsCount",
        "burstCount",
        "<init>",
        "(Lcom/whoop/puffin/sync/e;III)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "d",
        "(Lcom/whoop/puffin/sync/e;III)Lcom/whoop/puffin/sync/f$a;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/puffin/sync/e;",
        "f",
        "()Lcom/whoop/puffin/sync/e;",
        "b",
        "I",
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
.field private final a:Lcom/whoop/puffin/sync/e;

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(Lcom/whoop/puffin/sync/e;III)V
    .locals 1

    const-string v0, "openBurst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    .line 3
    iput p2, p0, Lcom/whoop/puffin/sync/f$a;->b:I

    .line 4
    iput p3, p0, Lcom/whoop/puffin/sync/f$a;->c:I

    .line 5
    iput p4, p0, Lcom/whoop/puffin/sync/f$a;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/puffin/sync/e;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 6
    new-instance p1, Lcom/whoop/puffin/sync/e$b;

    const/4 p6, 0x3

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0, p6, v0}, Lcom/whoop/puffin/sync/e$b;-><init>(Lf52/g;Lf52/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/puffin/sync/f$a;-><init>(Lcom/whoop/puffin/sync/e;III)V

    return-void
.end method

.method public static synthetic e(Lcom/whoop/puffin/sync/f$a;Lcom/whoop/puffin/sync/e;IIIILjava/lang/Object;)Lcom/whoop/puffin/sync/f$a;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/whoop/puffin/sync/f$a;->b:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lcom/whoop/puffin/sync/f$a;->c:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lcom/whoop/puffin/sync/f$a;->d:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/puffin/sync/f$a;->d(Lcom/whoop/puffin/sync/e;III)Lcom/whoop/puffin/sync/f$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/whoop/puffin/sync/f$a;->c:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/whoop/puffin/sync/f$a;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/whoop/puffin/sync/f$a;->d:I

    return v0
.end method

.method public final d(Lcom/whoop/puffin/sync/e;III)Lcom/whoop/puffin/sync/f$a;
    .locals 1

    const-string v0, "openBurst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/puffin/sync/f$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/puffin/sync/f$a;-><init>(Lcom/whoop/puffin/sync/e;III)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/puffin/sync/f$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/puffin/sync/f$a;

    iget-object v1, p0, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    iget-object v3, p1, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/puffin/sync/f$a;->b:I

    iget v3, p1, Lcom/whoop/puffin/sync/f$a;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/puffin/sync/f$a;->c:I

    iget v3, p1, Lcom/whoop/puffin/sync/f$a;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/puffin/sync/f$a;->d:I

    iget p1, p1, Lcom/whoop/puffin/sync/f$a;->d:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Lcom/whoop/puffin/sync/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/puffin/sync/f$a;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/puffin/sync/f$a;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/puffin/sync/f$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/puffin/sync/f$a;->a:Lcom/whoop/puffin/sync/e;

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/f$a;->c()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/f$a;->b()I

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/puffin/sync/f$a;->a()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "HPS.Running(openBurst="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", burstCount="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", consoleCount="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", firmwareCount="

    const-string v1, ")"

    invoke-static {v4, v2, v0, v3, v1}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
