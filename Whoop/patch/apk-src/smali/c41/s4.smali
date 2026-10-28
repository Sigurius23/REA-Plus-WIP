.class public final Lc41/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001a\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001e\u001a\u0004\u0008\u0017\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010!\u001a\u0004\u0008\u001c\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lc41/s4;",
        "Lm91/u;",
        "",
        "filledCount",
        "totalCount",
        "fillIcon",
        "Ly81/f;",
        "iconColor",
        "backgroundColor",
        "",
        "showCount",
        "fillMaxWidth",
        "<init>",
        "(IIILy81/f;Ly81/f;ZZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "e",
        "b",
        "h",
        "c",
        "d",
        "Ly81/f;",
        "f",
        "()Ly81/f;",
        "Z",
        "g",
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


# static fields
.field public static final h:I


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Ly81/f;

.field private final e:Ly81/f;

.field private final f:Z

.field private final g:Z


# direct methods
.method public constructor <init>(IIILy81/f;Ly81/f;ZZ)V
    .locals 1

    const-string v0, "iconColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lc41/s4;->a:I

    .line 3
    iput p2, p0, Lc41/s4;->b:I

    .line 4
    iput p3, p0, Lc41/s4;->c:I

    .line 5
    iput-object p4, p0, Lc41/s4;->d:Ly81/f;

    .line 6
    iput-object p5, p0, Lc41/s4;->e:Ly81/f;

    .line 7
    iput-boolean p6, p0, Lc41/s4;->f:Z

    .line 8
    iput-boolean p7, p0, Lc41/s4;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(IIILy81/f;Ly81/f;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v8, v0

    :goto_0
    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v1 .. v8}, Lc41/s4;-><init>(IIILy81/f;Ly81/f;ZZ)V

    return-void
.end method


# virtual methods
.method public final a()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/s4;->e:Ly81/f;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lc41/s4;->c:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lc41/s4;->g:Z

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lc41/s4;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc41/s4;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc41/s4;

    iget v1, p0, Lc41/s4;->a:I

    iget v3, p1, Lc41/s4;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lc41/s4;->b:I

    iget v3, p1, Lc41/s4;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lc41/s4;->c:I

    iget v3, p1, Lc41/s4;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc41/s4;->d:Ly81/f;

    iget-object v3, p1, Lc41/s4;->d:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lc41/s4;->e:Ly81/f;

    iget-object v3, p1, Lc41/s4;->e:Ly81/f;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lc41/s4;->f:Z

    iget-boolean v3, p1, Lc41/s4;->f:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lc41/s4;->g:Z

    iget-boolean p1, p1, Lc41/s4;->g:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final f()Ly81/f;
    .locals 1

    iget-object v0, p0, Lc41/s4;->d:Ly81/f;

    return-object v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lc41/s4;->f:Z

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lc41/s4;->b:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lc41/s4;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lc41/s4;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lc41/s4;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lc41/s4;->d:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v2, p0, Lc41/s4;->e:Ly81/f;

    invoke-static {v2, v0, v1}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-boolean v2, p0, Lc41/s4;->f:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lc41/s4;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget v0, p0, Lc41/s4;->a:I

    iget v1, p0, Lc41/s4;->b:I

    iget v2, p0, Lc41/s4;->c:I

    iget-object v3, p0, Lc41/s4;->d:Ly81/f;

    iget-object v4, p0, Lc41/s4;->e:Ly81/f;

    iget-boolean v5, p0, Lc41/s4;->f:Z

    iget-boolean v6, p0, Lc41/s4;->g:Z

    const-string v7, ", totalCount="

    const-string v8, ", fillIcon="

    const-string v9, "RecoveryImpactEmptyState(filledCount="

    invoke-static {v0, v1, v9, v7, v8}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", iconColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", showCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", fillMaxWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
