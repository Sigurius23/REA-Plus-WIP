.class public final Lsz0/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u0019\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0016\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010!\u001a\u0004\u0008\u001d\u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010!\u001a\u0004\u0008\u001e\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lsz0/e0;",
        "",
        "",
        "number",
        "Lcom/whoop/design/util/TextResource;",
        "headerText",
        "descriptionText",
        "Lny0/p0;",
        "cta",
        "",
        "hasBackgroundBar",
        "hasDivider",
        "<init>",
        "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/p0;ZZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "f",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "d",
        "Lny0/p0;",
        "()Lny0/p0;",
        "Z",
        "()Z",
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


# instance fields
.field private final a:I

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lny0/p0;

.field private final e:Z

.field private final f:Z


# direct methods
.method public constructor <init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lny0/p0;ZZ)V
    .locals 1

    const-string v0, "headerText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsz0/e0;->a:I

    iput-object p2, p0, Lsz0/e0;->b:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lsz0/e0;->c:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lsz0/e0;->d:Lny0/p0;

    iput-boolean p5, p0, Lsz0/e0;->e:Z

    iput-boolean p6, p0, Lsz0/e0;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Lny0/p0;
    .locals 1

    iget-object v0, p0, Lsz0/e0;->d:Lny0/p0;

    return-object v0
.end method

.method public final b()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsz0/e0;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lsz0/e0;->e:Z

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lsz0/e0;->f:Z

    return v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsz0/e0;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsz0/e0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsz0/e0;

    iget v1, p0, Lsz0/e0;->a:I

    iget v3, p1, Lsz0/e0;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsz0/e0;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lsz0/e0;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsz0/e0;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lsz0/e0;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsz0/e0;->d:Lny0/p0;

    iget-object v3, p1, Lsz0/e0;->d:Lny0/p0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lsz0/e0;->e:Z

    iget-boolean v3, p1, Lsz0/e0;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lsz0/e0;->f:Z

    iget-boolean p1, p1, Lsz0/e0;->f:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Lsz0/e0;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lsz0/e0;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lsz0/e0;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lsz0/e0;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lsz0/e0;->d:Lny0/p0;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lny0/p0;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lsz0/e0;->e:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lsz0/e0;->f:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lsz0/e0;->a:I

    iget-object v1, p0, Lsz0/e0;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lsz0/e0;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lsz0/e0;->d:Lny0/p0;

    iget-boolean v4, p0, Lsz0/e0;->e:Z

    iget-boolean v5, p0, Lsz0/e0;->f:Z

    const-string v6, ", headerText="

    const-string v7, ", descriptionText="

    const-string v8, "NumberedListItemViewState(number="

    invoke-static {v8, v0, v6, v1, v7}, Lq63/c;->n(Ljava/lang/String;ILjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasBackgroundBar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hasDivider="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
