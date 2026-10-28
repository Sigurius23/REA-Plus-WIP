.class public final Lo0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/b0;


# instance fields
.field public final a:Lo0/y;

.field public final b:Lo0/g;

.field public final c:Lab/h0;


# direct methods
.method public constructor <init>(Lo0/y;Lo0/g;Lab/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/h;->a:Lo0/y;

    iput-object p2, p0, Lo0/h;->b:Lo0/g;

    iput-object p3, p0, Lo0/h;->c:Lab/h0;

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo0/h;->b:Lo0/g;

    invoke-virtual {v0, p1}, Lp0/y;->l(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lo0/h;->c:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->n(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo0/h;->c:Lab/h0;

    invoke-virtual {v0, p1}, Lab/h0;->o(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo0/h;->b:Lo0/g;

    invoke-virtual {v0, p1}, Lp0/y;->n(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final d(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v6, p3

    check-cast v6, Lp1/q;

    const v0, 0x5905c824

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    and-int/lit16 v4, v0, 0x93

    const/16 v5, 0x92

    if-eq v4, v5, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v6, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lo0/h;->a:Lo0/y;

    iget-object v4, v4, Lo0/y;->q:Lp0/h0;

    new-instance v5, Ln0/h;

    const/4 v7, 0x1

    invoke-direct {v5, p0, p1, v7}, Ln0/h;-><init>(Lp0/b0;II)V

    const v7, 0x2b48c518

    invoke-static {v7, v6, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 v7, v0, 0x3

    and-int/lit8 v7, v7, 0xe

    or-int/lit16 v7, v7, 0xc00

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v7, v0

    move v3, p1

    move-object v2, p2

    invoke-static/range {v2 .. v7}, Lp0/y;->d(Ljava/lang/Object;ILp0/h0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_5

    new-instance v0, Lmx1/i;

    const/16 v5, 0x14

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lmx1/i;-><init>(Lp0/b0;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lo0/h;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lo0/h;

    iget-object p1, p1, Lo0/h;->b:Lo0/g;

    iget-object v0, p0, Lo0/h;->b:Lo0/g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Lo0/h;->b:Lo0/g;

    invoke-virtual {v0}, Lo0/g;->m()Lab/h0;

    move-result-object v0

    iget v0, v0, Lab/h0;->x:I

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lo0/h;->b:Lo0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
