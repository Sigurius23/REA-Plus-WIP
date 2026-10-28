.class public final Lje2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lje2/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001d\u001a\u0004\u0008 \u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0017\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lje2/c$b;",
        "Lje2/c;",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "pageTitle",
        "Lje2/f;",
        "shepherdDetectionToggleViewState",
        "shepherdNotificationToggleViewState",
        "Lm91/u;",
        "aboutCtaTile",
        "<init>",
        "(ILcom/whoop/design/util/TextResource;Lje2/f;Lje2/f;Lm91/u;)V",
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
        "Lcom/whoop/design/util/TextResource;",
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "Lje2/f;",
        "d",
        "()Lje2/f;",
        "e",
        "Lm91/u;",
        "()Lm91/u;",
        "shepherd_release"
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

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lje2/f;

.field private final d:Lje2/f;

.field private final e:Lm91/u;


# direct methods
.method public constructor <init>(ILcom/whoop/design/util/TextResource;Lje2/f;Lje2/f;Lm91/u;)V
    .locals 1

    const-string v0, "pageTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shepherdDetectionToggleViewState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shepherdNotificationToggleViewState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboutCtaTile"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lje2/c$b;->a:I

    iput-object p2, p0, Lje2/c$b;->b:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lje2/c$b;->c:Lje2/f;

    iput-object p4, p0, Lje2/c$b;->d:Lje2/f;

    iput-object p5, p0, Lje2/c$b;->e:Lm91/u;

    return-void
.end method


# virtual methods
.method public final a()Lm91/u;
    .locals 1

    iget-object v0, p0, Lje2/c$b;->e:Lm91/u;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lje2/c$b;->a:I

    return v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lje2/c$b;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Lje2/f;
    .locals 1

    iget-object v0, p0, Lje2/c$b;->c:Lje2/f;

    return-object v0
.end method

.method public final e()Lje2/f;
    .locals 1

    iget-object v0, p0, Lje2/c$b;->d:Lje2/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lje2/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lje2/c$b;

    iget v1, p0, Lje2/c$b;->a:I

    iget v3, p1, Lje2/c$b;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lje2/c$b;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lje2/c$b;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lje2/c$b;->c:Lje2/f;

    iget-object v3, p1, Lje2/c$b;->c:Lje2/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lje2/c$b;->d:Lje2/f;

    iget-object v3, p1, Lje2/c$b;->d:Lje2/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lje2/c$b;->e:Lm91/u;

    iget-object p1, p1, Lje2/c$b;->e:Lm91/u;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lje2/c$b;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lje2/c$b;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lje2/c$b;->c:Lje2/f;

    invoke-virtual {v2}, Lje2/f;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lje2/c$b;->d:Lje2/f;

    invoke-virtual {v0}, Lje2/f;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lje2/c$b;->e:Lm91/u;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lje2/c$b;->a:I

    iget-object v1, p0, Lje2/c$b;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lje2/c$b;->c:Lje2/f;

    iget-object v3, p0, Lje2/c$b;->d:Lje2/f;

    iget-object v4, p0, Lje2/c$b;->e:Lm91/u;

    const-string v5, ", pageTitle="

    const-string v6, ", shepherdDetectionToggleViewState="

    const-string v7, "Loaded(icon="

    invoke-static {v7, v0, v5, v1, v6}, Lq63/c;->n(Ljava/lang/String;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shepherdNotificationToggleViewState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", aboutCtaTile="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
