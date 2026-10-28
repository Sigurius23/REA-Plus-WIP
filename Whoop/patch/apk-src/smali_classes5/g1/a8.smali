.class public final synthetic Lg1/a8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ly3/a;

.field public final synthetic F:I

.field public final synthetic G:Lx1/b;

.field public final synthetic H:Ljava/util/ArrayList;

.field public final synthetic I:I

.field public final synthetic w:Ljava/util/ArrayList;

.field public final synthetic x:Ly2/v1;

.field public final synthetic y:Lc93/m;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ly2/v1;Lc93/m;ILy3/a;ILx1/b;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/a8;->w:Ljava/util/ArrayList;

    iput-object p2, p0, Lg1/a8;->x:Ly2/v1;

    iput-object p3, p0, Lg1/a8;->y:Lc93/m;

    iput p4, p0, Lg1/a8;->z:I

    iput-object p5, p0, Lg1/a8;->E:Ly3/a;

    iput p6, p0, Lg1/a8;->F:I

    iput-object p7, p0, Lg1/a8;->G:Lx1/b;

    iput-object p8, p0, Lg1/a8;->H:Ljava/util/ArrayList;

    iput p9, p0, Lg1/a8;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    iget-object v2, v0, Lg1/a8;->w:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/j1;

    iget v7, v0, Lg1/a8;->z:I

    mul-int/2addr v7, v5

    invoke-static {v6, v7, v4, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lg1/d8;->x:Lg1/d8;

    iget-object v3, v0, Lg1/a8;->x:Ly2/v1;

    iget-object v5, v0, Lg1/a8;->y:Lc93/m;

    invoke-interface {v3, v2, v5}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    move v6, v4

    :goto_1
    iget v7, v0, Lg1/a8;->F:I

    if-ge v6, v5, :cond_1

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly2/q0;

    iget-object v9, v0, Lg1/a8;->E:Ly3/a;

    iget-wide v10, v9, Ly3/a;->a:J

    const/4 v15, 0x0

    const/16 v16, 0xb

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Ly3/a;->b(JIIIII)J

    move-result-wide v9

    invoke-interface {v8, v9, v10}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v8

    iget v9, v8, Ly2/j1;->x:I

    sub-int/2addr v7, v9

    invoke-static {v8, v4, v7, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    sget-object v2, Lg1/d8;->y:Lg1/d8;

    new-instance v5, Lg1/y7;

    const/4 v6, 0x1

    iget-object v8, v0, Lg1/a8;->G:Lx1/b;

    iget-object v9, v0, Lg1/a8;->H:Ljava/util/ArrayList;

    invoke-direct {v5, v8, v9, v6}, Lg1/y7;-><init>(Lx1/b;Ljava/util/ArrayList;I)V

    new-instance v6, Lx1/b;

    const/4 v8, 0x1

    const v9, -0xd271620

    invoke-direct {v6, v5, v8, v9}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-interface {v3, v2, v6}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    move v5, v4

    :goto_2
    if-ge v5, v3, :cond_5

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/q0;

    iget v9, v0, Lg1/a8;->I:I

    if-ltz v9, :cond_2

    move v10, v8

    goto :goto_3

    :cond_2
    move v10, v4

    :goto_3
    if-ltz v7, :cond_3

    move v11, v8

    goto :goto_4

    :cond_3
    move v11, v4

    :goto_4
    and-int/2addr v10, v11

    if-nez v10, :cond_4

    const-string v10, "width and height must be >= 0"

    invoke-static {v10}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_4
    invoke-static {v9, v9, v7, v7}, Ly3/b;->h(IIII)J

    move-result-wide v9

    invoke-interface {v6, v9, v10}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    invoke-static {v6, v4, v4, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
