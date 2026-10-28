.class public final Landroidx/recyclerview/widget/c3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La0/f1;

.field public final b:La0/y;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    new-instance v0, La0/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/c3;->b:La0/y;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/o2;Landroidx/recyclerview/widget/o1;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    invoke-virtual {v0, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/a3;

    if-nez v1, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/a3;->a()Landroidx/recyclerview/widget/a3;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v1, Landroidx/recyclerview/widget/a3;->c:Landroidx/recyclerview/widget/o1;

    iget p1, v1, Landroidx/recyclerview/widget/a3;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v1, Landroidx/recyclerview/widget/a3;->a:I

    return-void
.end method

.method public final b(Landroidx/recyclerview/widget/o2;I)Landroidx/recyclerview/widget/o1;
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    invoke-virtual {v0, p1}, La0/f1;->d(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, La0/f1;->k(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/a3;

    if-eqz v2, :cond_4

    iget v3, v2, Landroidx/recyclerview/widget/a3;->a:I

    and-int v4, v3, p2

    if-eqz v4, :cond_4

    not-int v4, p2

    and-int/2addr v3, v4

    iput v3, v2, Landroidx/recyclerview/widget/a3;->a:I

    const/4 v4, 0x4

    if-ne p2, v4, :cond_1

    iget-object p2, v2, Landroidx/recyclerview/widget/a3;->b:Landroidx/recyclerview/widget/o1;

    goto :goto_0

    :cond_1
    const/16 v4, 0x8

    if-ne p2, v4, :cond_3

    iget-object p2, v2, Landroidx/recyclerview/widget/a3;->c:Landroidx/recyclerview/widget/o1;

    :goto_0
    and-int/lit8 v3, v3, 0xc

    if-nez v3, :cond_2

    invoke-virtual {v0, p1}, La0/f1;->i(I)Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v2, Landroidx/recyclerview/widget/a3;->a:I

    iput-object v1, v2, Landroidx/recyclerview/widget/a3;->b:Landroidx/recyclerview/widget/o1;

    iput-object v1, v2, Landroidx/recyclerview/widget/a3;->c:Landroidx/recyclerview/widget/o1;

    sget-object p1, Landroidx/recyclerview/widget/a3;->d:Lg5/e;

    invoke-virtual {p1, v2}, Lg5/e;->a(Ljava/lang/Object;)Z

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    return-object v1
.end method

.method public final c(Landroidx/recyclerview/widget/o2;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    invoke-virtual {v0, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/a3;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroidx/recyclerview/widget/a3;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Landroidx/recyclerview/widget/a3;->a:I

    return-void
.end method

.method public final d(Landroidx/recyclerview/widget/o2;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/c3;->b:La0/y;

    invoke-virtual {v0}, La0/y;->i()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v3

    if-ne p1, v3, :cond_0

    iget-object v3, v0, La0/y;->y:[Ljava/lang/Object;

    aget-object v4, v3, v1

    sget-object v5, La0/z;->a:Ljava/lang/Object;

    if-eq v4, v5, :cond_1

    aput-object v5, v3, v1

    iput-boolean v2, v0, La0/y;->w:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    invoke-virtual {v0, p1}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/a3;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    iput v0, p1, Landroidx/recyclerview/widget/a3;->a:I

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/recyclerview/widget/a3;->b:Landroidx/recyclerview/widget/o1;

    iput-object v0, p1, Landroidx/recyclerview/widget/a3;->c:Landroidx/recyclerview/widget/o1;

    sget-object v0, Landroidx/recyclerview/widget/a3;->d:Lg5/e;

    invoke-virtual {v0, p1}, Lg5/e;->a(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
