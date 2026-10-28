.class public final Lb81/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJB\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lb81/j;",
        "Lm91/u;",
        "",
        "selectionId",
        "",
        "title",
        "",
        "selected",
        "enabled",
        "",
        "radius",
        "<init>",
        "(ILjava/lang/String;ZZD)V",
        "a",
        "(ILjava/lang/String;ZZD)Lb81/j;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "g",
        "b",
        "Ljava/lang/String;",
        "h",
        "c",
        "Z",
        "f",
        "()Z",
        "d",
        "e",
        "D",
        "()D",
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
.field public static final f:I


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Z

.field private final d:Z

.field private final e:D


# direct methods
.method public constructor <init>(ILjava/lang/String;ZZD)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lb81/j;->a:I

    .line 3
    iput-object p2, p0, Lb81/j;->b:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lb81/j;->c:Z

    .line 5
    iput-boolean p4, p0, Lb81/j;->d:Z

    .line 6
    iput-wide p5, p0, Lb81/j;->e:D

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    const-wide/high16 p5, 0x4000000000000000L    # 2.0

    :cond_1
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v5, p5

    .line 7
    invoke-direct/range {v0 .. v6}, Lb81/j;-><init>(ILjava/lang/String;ZZD)V

    return-void
.end method

.method public static synthetic b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget p1, p0, Lb81/j;->a:I

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lb81/j;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lb81/j;->c:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lb81/j;->d:Z

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-wide p5, p0, Lb81/j;->e:D

    :cond_4
    move-wide p7, p5

    move p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lb81/j;->a(ILjava/lang/String;ZZD)Lb81/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ILjava/lang/String;ZZD)Lb81/j;
    .locals 8

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb81/j;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-wide v6, p5

    invoke-direct/range {v1 .. v7}, Lb81/j;-><init>(ILjava/lang/String;ZZD)V

    return-object v1
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lb81/j;->d:Z

    return v0
.end method

.method public final e()D
    .locals 2

    iget-wide v0, p0, Lb81/j;->e:D

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lb81/j;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lb81/j;

    iget v1, p0, Lb81/j;->a:I

    iget v3, p1, Lb81/j;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lb81/j;->b:Ljava/lang/String;

    iget-object v3, p1, Lb81/j;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lb81/j;->c:Z

    iget-boolean v3, p1, Lb81/j;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lb81/j;->d:Z

    iget-boolean v3, p1, Lb81/j;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lb81/j;->e:D

    iget-wide v5, p1, Lb81/j;->e:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lb81/j;->c:Z

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lb81/j;->a:I

    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb81/j;->b:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lb81/j;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lb81/j;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lb81/j;->c:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lb81/j;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v1, p0, Lb81/j;->e:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget v0, p0, Lb81/j;->a:I

    iget-object v1, p0, Lb81/j;->b:Ljava/lang/String;

    iget-boolean v2, p0, Lb81/j;->c:Z

    iget-boolean v3, p0, Lb81/j;->d:Z

    iget-wide v4, p0, Lb81/j;->e:D

    const-string v6, ", title="

    const-string v7, ", selected="

    const-string v8, "SelectableChipViewState(selectionId="

    invoke-static {v0, v8, v6, v1, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    const-string v6, ", radius="

    invoke-static {v0, v2, v1, v3, v6}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v4, v5, v1, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
