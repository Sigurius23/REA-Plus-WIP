.class public final Lmh/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lmh/c;

.field public c:Ljava/lang/Object;

.field public d:Loh/a;

.field public e:Lmh/i;

.field public f:Lkh/a;

.field public g:Lnh/d;

.field public h:Ldh/i;

.field public final i:Ljava/util/List;

.field public j:Lph/e;

.field public k:Lkotlin/jvm/internal/k0;

.field public final l:Ljava/util/LinkedHashMap;

.field public final m:Z

.field public n:Ljava/lang/Boolean;

.field public final o:Z

.field public p:Lmh/b;

.field public final q:Landroidx/room/t0;

.field public r:Ljava/lang/Integer;

.field public s:Ljava/lang/Integer;

.field public t:Ljava/lang/Integer;

.field public u:Lnh/i;

.field public v:Lnh/g;

.field public w:Landroidx/lifecycle/x;

.field public x:Lnh/i;

.field public y:Lnh/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmh/h;->a:Landroid/content/Context;

    .line 3
    sget-object p1, Lqh/b;->a:Lmh/c;

    .line 4
    iput-object p1, p0, Lmh/h;->b:Lmh/c;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lmh/h;->c:Ljava/lang/Object;

    .line 6
    iput-object p1, p0, Lmh/h;->d:Loh/a;

    .line 7
    iput-object p1, p0, Lmh/h;->e:Lmh/i;

    .line 8
    iput-object p1, p0, Lmh/h;->f:Lkh/a;

    .line 9
    iput-object p1, p0, Lmh/h;->g:Lnh/d;

    .line 10
    iput-object p1, p0, Lmh/h;->h:Ldh/i;

    .line 11
    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lmh/h;->i:Ljava/util/List;

    .line 12
    iput-object p1, p0, Lmh/h;->j:Lph/e;

    .line 13
    iput-object p1, p0, Lmh/h;->k:Lkotlin/jvm/internal/k0;

    .line 14
    iput-object p1, p0, Lmh/h;->l:Ljava/util/LinkedHashMap;

    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, Lmh/h;->m:Z

    .line 16
    iput-object p1, p0, Lmh/h;->n:Ljava/lang/Boolean;

    .line 17
    iput-boolean v0, p0, Lmh/h;->o:Z

    .line 18
    iput-object p1, p0, Lmh/h;->p:Lmh/b;

    .line 19
    iput-object p1, p0, Lmh/h;->q:Landroidx/room/t0;

    .line 20
    iput-object p1, p0, Lmh/h;->r:Ljava/lang/Integer;

    .line 21
    iput-object p1, p0, Lmh/h;->s:Ljava/lang/Integer;

    .line 22
    iput-object p1, p0, Lmh/h;->t:Ljava/lang/Integer;

    .line 23
    iput-object p1, p0, Lmh/h;->u:Lnh/i;

    .line 24
    iput-object p1, p0, Lmh/h;->v:Lnh/g;

    .line 25
    iput-object p1, p0, Lmh/h;->w:Landroidx/lifecycle/x;

    .line 26
    iput-object p1, p0, Lmh/h;->x:Lnh/i;

    .line 27
    iput-object p1, p0, Lmh/h;->y:Lnh/g;

    return-void
.end method

.method public constructor <init>(Lmh/j;Landroid/content/Context;)V
    .locals 3

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p2, p0, Lmh/h;->a:Landroid/content/Context;

    .line 30
    iget-object v0, p1, Lmh/j;->F:Lmh/c;

    .line 31
    iput-object v0, p0, Lmh/h;->b:Lmh/c;

    .line 32
    iget-object v0, p1, Lmh/j;->b:Ljava/lang/Object;

    .line 33
    iput-object v0, p0, Lmh/h;->c:Ljava/lang/Object;

    .line 34
    iget-object v0, p1, Lmh/j;->c:Loh/a;

    .line 35
    iput-object v0, p0, Lmh/h;->d:Loh/a;

    .line 36
    iget-object v0, p1, Lmh/j;->d:Lmh/i;

    .line 37
    iput-object v0, p0, Lmh/h;->e:Lmh/i;

    .line 38
    iget-object v0, p1, Lmh/j;->e:Lkh/a;

    .line 39
    iput-object v0, p0, Lmh/h;->f:Lkh/a;

    .line 40
    iget-object v0, p1, Lmh/j;->E:Lmh/d;

    .line 41
    iget-object v1, v0, Lmh/d;->d:Lnh/d;

    .line 42
    iput-object v1, p0, Lmh/h;->g:Lnh/d;

    .line 43
    iget-object v1, p1, Lmh/j;->h:Ldh/i;

    .line 44
    iput-object v1, p0, Lmh/h;->h:Ldh/i;

    .line 45
    iget-object v1, p1, Lmh/j;->i:Ljava/util/List;

    .line 46
    iput-object v1, p0, Lmh/h;->i:Ljava/util/List;

    .line 47
    iget-object v1, v0, Lmh/d;->c:Lph/e;

    .line 48
    iput-object v1, p0, Lmh/h;->j:Lph/e;

    .line 49
    iget-object v1, p1, Lmh/j;->k:Lud3/d0;

    .line 50
    invoke-virtual {v1}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object v1

    iput-object v1, p0, Lmh/h;->k:Lkotlin/jvm/internal/k0;

    .line 51
    iget-object v1, p1, Lmh/j;->l:Lmh/p;

    .line 52
    iget-object v1, v1, Lmh/p;->a:Ljava/util/Map;

    .line 53
    invoke-static {v1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    iput-object v1, p0, Lmh/h;->l:Ljava/util/LinkedHashMap;

    .line 54
    iget-boolean v1, p1, Lmh/j;->m:Z

    .line 55
    iput-boolean v1, p0, Lmh/h;->m:Z

    .line 56
    iget-object v1, v0, Lmh/d;->e:Ljava/lang/Boolean;

    .line 57
    iput-object v1, p0, Lmh/h;->n:Ljava/lang/Boolean;

    .line 58
    iget-boolean v1, p1, Lmh/j;->p:Z

    .line 59
    iput-boolean v1, p0, Lmh/h;->o:Z

    .line 60
    iget-object v1, v0, Lmh/d;->f:Lmh/b;

    .line 61
    iput-object v1, p0, Lmh/h;->p:Lmh/b;

    .line 62
    iget-object v1, p1, Lmh/j;->A:Lmh/n;

    .line 63
    new-instance v2, Landroidx/room/t0;

    invoke-direct {v2, v1}, Landroidx/room/t0;-><init>(Lmh/n;)V

    .line 64
    iput-object v2, p0, Lmh/h;->q:Landroidx/room/t0;

    .line 65
    iget-object v1, p1, Lmh/j;->B:Ljava/lang/Integer;

    .line 66
    iput-object v1, p0, Lmh/h;->r:Ljava/lang/Integer;

    .line 67
    iget-object v1, p1, Lmh/j;->C:Ljava/lang/Integer;

    .line 68
    iput-object v1, p0, Lmh/h;->s:Ljava/lang/Integer;

    .line 69
    iget-object v1, p1, Lmh/j;->D:Ljava/lang/Integer;

    .line 70
    iput-object v1, p0, Lmh/h;->t:Ljava/lang/Integer;

    .line 71
    iget-object v1, v0, Lmh/d;->a:Lnh/i;

    .line 72
    iput-object v1, p0, Lmh/h;->u:Lnh/i;

    .line 73
    iget-object v0, v0, Lmh/d;->b:Lnh/g;

    .line 74
    iput-object v0, p0, Lmh/h;->v:Lnh/g;

    .line 75
    iget-object v0, p1, Lmh/j;->a:Landroid/content/Context;

    if-ne v0, p2, :cond_0

    .line 76
    iget-object p2, p1, Lmh/j;->x:Landroidx/lifecycle/x;

    .line 77
    iput-object p2, p0, Lmh/h;->w:Landroidx/lifecycle/x;

    .line 78
    iget-object p2, p1, Lmh/j;->y:Lnh/i;

    .line 79
    iput-object p2, p0, Lmh/h;->x:Lnh/i;

    .line 80
    iget-object p1, p1, Lmh/j;->z:Lnh/g;

    .line 81
    iput-object p1, p0, Lmh/h;->y:Lnh/g;

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 82
    iput-object p1, p0, Lmh/h;->w:Landroidx/lifecycle/x;

    .line 83
    iput-object p1, p0, Lmh/h;->x:Lnh/i;

    .line 84
    iput-object p1, p0, Lmh/h;->y:Lnh/g;

    return-void
.end method


# virtual methods
.method public final a()Lmh/j;
    .locals 38

    move-object/from16 v0, p0

    iget-object v1, v0, Lmh/h;->c:Ljava/lang/Object;

    if-nez v1, :cond_0

    sget-object v1, Lmh/l;->a:Lmh/l;

    :cond_0
    move-object v4, v1

    iget-object v5, v0, Lmh/h;->d:Loh/a;

    iget-object v6, v0, Lmh/h;->e:Lmh/i;

    iget-object v7, v0, Lmh/h;->f:Lkh/a;

    iget-object v1, v0, Lmh/h;->b:Lmh/c;

    iget-object v8, v1, Lmh/c;->g:Landroid/graphics/Bitmap$Config;

    iget-object v2, v0, Lmh/h;->g:Lnh/d;

    if-nez v2, :cond_1

    iget-object v2, v1, Lmh/c;->f:Lnh/d;

    :cond_1
    move-object v9, v2

    iget-object v10, v0, Lmh/h;->h:Ldh/i;

    iget-object v2, v0, Lmh/h;->j:Lph/e;

    if-nez v2, :cond_2

    iget-object v2, v1, Lmh/c;->e:Lph/c;

    :cond_2
    move-object v12, v2

    iget-object v1, v0, Lmh/h;->k:Lkotlin/jvm/internal/k0;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_4

    sget-object v1, Lqh/d;->c:Lud3/d0;

    :goto_1
    move-object v13, v1

    goto :goto_2

    :cond_4
    sget-object v3, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    goto :goto_1

    :goto_2
    iget-object v1, v0, Lmh/h;->l:Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_5

    new-instance v3, Lmh/p;

    invoke-static {v1}, Lq83/g;->c0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v3, v1}, Lmh/p;-><init>(Ljava/util/Map;)V

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    if-nez v3, :cond_6

    sget-object v3, Lmh/p;->b:Lmh/p;

    :cond_6
    move-object v14, v3

    iget-object v1, v0, Lmh/h;->n:Ljava/lang/Boolean;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_4
    move/from16 v16, v1

    goto :goto_5

    :cond_7
    iget-object v1, v0, Lmh/h;->b:Lmh/c;

    iget-boolean v1, v1, Lmh/c;->h:Z

    goto :goto_4

    :goto_5
    iget-object v1, v0, Lmh/h;->b:Lmh/c;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lmh/h;->p:Lmh/b;

    if-nez v1, :cond_8

    iget-object v1, v0, Lmh/h;->b:Lmh/c;

    iget-object v1, v1, Lmh/c;->i:Lmh/b;

    :cond_8
    move-object/from16 v19, v1

    iget-object v1, v0, Lmh/h;->b:Lmh/c;

    iget-object v3, v1, Lmh/c;->j:Lmh/b;

    iget-object v11, v1, Lmh/c;->k:Lmh/b;

    iget-object v15, v1, Lmh/c;->a:Lbc3/w1;

    iget-object v2, v1, Lmh/c;->b:Lbc3/z;

    move-object/from16 v23, v2

    iget-object v2, v1, Lmh/c;->c:Lbc3/z;

    iget-object v1, v1, Lmh/c;->d:Lbc3/z;

    move-object/from16 v25, v1

    iget-object v1, v0, Lmh/h;->w:Landroidx/lifecycle/x;

    move-object/from16 v20, v3

    iget-object v3, v0, Lmh/h;->a:Landroid/content/Context;

    move-object/from16 v24, v2

    if-nez v1, :cond_a

    move-object v1, v3

    :goto_6
    instance-of v2, v1, Landroidx/lifecycle/g0;

    if-eqz v2, :cond_9

    check-cast v1, Landroidx/lifecycle/g0;

    invoke-interface {v1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v1

    goto :goto_7

    :cond_9
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-nez v2, :cond_b

    const/4 v1, 0x0

    :goto_7
    if-nez v1, :cond_a

    sget-object v1, Lmh/g;->b:Lmh/g;

    :cond_a
    move-object/from16 v26, v1

    goto :goto_8

    :cond_b
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_6

    :goto_8
    iget-object v1, v0, Lmh/h;->u:Lnh/i;

    if-nez v1, :cond_d

    iget-object v2, v0, Lmh/h;->x:Lnh/i;

    if-nez v2, :cond_c

    new-instance v2, Lnh/c;

    invoke-direct {v2, v3}, Lnh/c;-><init>(Landroid/content/Context;)V

    :cond_c
    move-object/from16 v27, v2

    goto :goto_9

    :cond_d
    move-object/from16 v27, v1

    :goto_9
    iget-object v2, v0, Lmh/h;->v:Lnh/g;

    if-nez v2, :cond_14

    iget-object v2, v0, Lmh/h;->y:Lnh/g;

    if-nez v2, :cond_14

    instance-of v2, v1, Lnh/j;

    if-eqz v2, :cond_e

    check-cast v1, Lnh/j;

    goto :goto_a

    :cond_e
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_f

    check-cast v1, Lnh/f;

    invoke-virtual {v1}, Lnh/f;->a()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_10

    :cond_f
    const/4 v1, 0x0

    :cond_10
    instance-of v2, v1, Landroid/widget/ImageView;

    if-eqz v2, :cond_13

    check-cast v1, Landroid/widget/ImageView;

    sget-object v2, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    if-nez v1, :cond_11

    const/4 v1, -0x1

    goto :goto_b

    :cond_11
    sget-object v2, Lqh/c;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_b
    const/4 v2, 0x1

    if-eq v1, v2, :cond_12

    const/4 v2, 0x2

    if-eq v1, v2, :cond_12

    const/4 v2, 0x3

    if-eq v1, v2, :cond_12

    const/4 v2, 0x4

    if-eq v1, v2, :cond_12

    sget-object v1, Lnh/g;->w:Lnh/g;

    :goto_c
    move-object v2, v1

    goto :goto_d

    :cond_12
    sget-object v1, Lnh/g;->x:Lnh/g;

    goto :goto_c

    :cond_13
    sget-object v1, Lnh/g;->x:Lnh/g;

    goto :goto_c

    :cond_14
    :goto_d
    move-object/from16 v28, v2

    iget-object v1, v0, Lmh/h;->q:Landroidx/room/t0;

    if-eqz v1, :cond_15

    new-instance v2, Lmh/n;

    iget-object v1, v1, Landroidx/room/t0;->a:Ljava/util/LinkedHashMap;

    invoke-static {v1}, Lq83/g;->c0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v2, v1}, Lmh/n;-><init>(Ljava/util/Map;)V

    goto :goto_e

    :cond_15
    const/4 v2, 0x0

    :goto_e
    if-nez v2, :cond_16

    sget-object v2, Lmh/n;->x:Lmh/n;

    :cond_16
    move-object/from16 v29, v2

    iget-object v1, v0, Lmh/h;->r:Ljava/lang/Integer;

    iget-object v2, v0, Lmh/h;->s:Ljava/lang/Integer;

    move-object/from16 v30, v1

    iget-object v1, v0, Lmh/h;->t:Ljava/lang/Integer;

    new-instance v31, Lmh/d;

    move-object/from16 v17, v1

    iget-object v1, v0, Lmh/h;->u:Lnh/i;

    move-object/from16 v32, v1

    iget-object v1, v0, Lmh/h;->v:Lnh/g;

    move-object/from16 v33, v1

    iget-object v1, v0, Lmh/h;->j:Lph/e;

    move-object/from16 v34, v1

    iget-object v1, v0, Lmh/h;->g:Lnh/d;

    move-object/from16 v35, v1

    iget-object v1, v0, Lmh/h;->n:Ljava/lang/Boolean;

    move-object/from16 v36, v1

    iget-object v1, v0, Lmh/h;->p:Lmh/b;

    move-object/from16 v37, v1

    invoke-direct/range {v31 .. v37}, Lmh/d;-><init>(Lnh/i;Lnh/g;Lph/e;Lnh/d;Ljava/lang/Boolean;Lmh/b;)V

    iget-object v1, v0, Lmh/h;->b:Lmh/c;

    move-object/from16 v33, v31

    move-object/from16 v31, v2

    new-instance v2, Lmh/j;

    move-object/from16 v21, v11

    iget-object v11, v0, Lmh/h;->i:Ljava/util/List;

    move-object/from16 v22, v15

    iget-boolean v15, v0, Lmh/h;->m:Z

    move-object/from16 v32, v17

    const/16 v17, 0x0

    move-object/from16 v34, v1

    iget-boolean v1, v0, Lmh/h;->o:Z

    move/from16 v18, v1

    invoke-direct/range {v2 .. v34}, Lmh/j;-><init>(Landroid/content/Context;Ljava/lang/Object;Loh/a;Lmh/i;Lkh/a;Landroid/graphics/Bitmap$Config;Lnh/d;Ldh/i;Ljava/util/List;Lph/e;Lud3/d0;Lmh/p;ZZZZLmh/b;Lmh/b;Lmh/b;Lbc3/z;Lbc3/z;Lbc3/z;Lbc3/z;Landroidx/lifecycle/x;Lnh/i;Lnh/g;Lmh/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lmh/d;Lmh/c;)V

    return-object v2
.end method

.method public final b()V
    .locals 1

    const/16 v0, 0x64

    invoke-virtual {p0, v0}, Lmh/h;->c(I)V

    return-void
.end method

.method public final c(I)V
    .locals 2

    if-lez p1, :cond_0

    new-instance v0, Lph/a;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lph/a;-><init>(II)V

    goto :goto_0

    :cond_0
    sget-object v0, Lph/e;->a:Lph/c;

    :goto_0
    iput-object v0, p0, Lmh/h;->j:Lph/e;

    return-void
.end method

.method public final d(II)V
    .locals 2

    new-instance v0, Lnh/h;

    new-instance v1, Lnh/a;

    invoke-direct {v1, p1}, Lnh/a;-><init>(I)V

    new-instance p1, Lnh/a;

    invoke-direct {p1, p2}, Lnh/a;-><init>(I)V

    invoke-direct {v0, v1, p1}, Lnh/h;-><init>(Ldt/b;Ldt/b;)V

    invoke-virtual {p0, v0}, Lmh/h;->e(Lnh/h;)V

    return-void
.end method

.method public final e(Lnh/h;)V
    .locals 1

    new-instance v0, Lnh/e;

    invoke-direct {v0, p1}, Lnh/e;-><init>(Lnh/h;)V

    iput-object v0, p0, Lmh/h;->u:Lnh/i;

    const/4 p1, 0x0

    iput-object p1, p0, Lmh/h;->w:Landroidx/lifecycle/x;

    iput-object p1, p0, Lmh/h;->x:Lnh/i;

    iput-object p1, p0, Lmh/h;->y:Lnh/g;

    return-void
.end method
