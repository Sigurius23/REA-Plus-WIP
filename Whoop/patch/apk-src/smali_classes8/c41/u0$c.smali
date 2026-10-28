.class public final Lc41/u0$c;
.super Lc41/u0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc41/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001b\u001a\u0004\u0008\u0017\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001f\u001a\u0004\u0008!\u0010 R\u0017\u0010\n\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u001f\u001a\u0004\u0008\u001a\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lc41/u0$c;",
        "Lc41/u0;",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "description",
        "Ly81/f;",
        "iconTint",
        "titleTint",
        "descriptionTint",
        "<init>",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;)V",
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
        "c",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "d",
        "Ly81/f;",
        "()Ly81/f;",
        "f",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:I


# instance fields
.field private final a:I

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Ly81/f;

.field private final e:Ly81/f;

.field private final f:Ly81/f;


# direct methods
.method public constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Ly81/f;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iconTint"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleTint"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionTint"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lc41/u0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lc41/u0$c;->a:I

    iput-object p2, p0, Lc41/u0$c;->b:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lc41/u0$c;->c:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lc41/u0$c;->d:Ly81/f;

    iput-object p5, p0, Lc41/u0$c;->e:Ly81/f;

    iput-object p6, p0, Lc41/u0$c;->f:Ly81/f;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lc41/u0$c;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/u0$c;->f:Ly81/f;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lc41/u0$c;->a:I

    return v0
.end method

.method public final d()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/u0$c;->d:Ly81/f;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lc41/u0$c;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc41/u0$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc41/u0$c;

    iget v1, p0, Lc41/u0$c;->a:I

    iget v3, p1, Lc41/u0$c;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc41/u0$c;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lc41/u0$c;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc41/u0$c;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lc41/u0$c;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc41/u0$c;->d:Ly81/f;

    iget-object v3, p1, Lc41/u0$c;->d:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lc41/u0$c;->e:Ly81/f;

    iget-object v3, p1, Lc41/u0$c;->e:Ly81/f;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lc41/u0$c;->f:Ly81/f;

    iget-object p1, p1, Lc41/u0$c;->f:Ly81/f;

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/u0$c;->e:Ly81/f;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lc41/u0$c;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc41/u0$c;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lc41/u0$c;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lc41/u0$c;->d:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Lc41/u0$c;->e:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v1, p0, Lc41/u0$c;->f:Ly81/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lc41/u0$c;->a:I

    iget-object v1, p0, Lc41/u0$c;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lc41/u0$c;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lc41/u0$c;->d:Ly81/f;

    iget-object v4, p0, Lc41/u0$c;->e:Ly81/f;

    iget-object v5, p0, Lc41/u0$c;->f:Ly81/f;

    const-string v6, ", title="

    const-string v7, ", description="

    const-string v8, "GenericInformational(icon="

    invoke-static {v8, v0, v6, v1, v7}, Lq63/c;->n(Ljava/lang/String;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", iconTint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleTint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionTint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
