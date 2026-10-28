.class public final Lmh/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:Lmh/n;

.field public final B:Ljava/lang/Integer;

.field public final C:Ljava/lang/Integer;

.field public final D:Ljava/lang/Integer;

.field public final E:Lmh/d;

.field public final F:Lmh/c;

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Object;

.field public final c:Loh/a;

.field public final d:Lmh/i;

.field public final e:Lkh/a;

.field public final f:Landroid/graphics/Bitmap$Config;

.field public final g:Lnh/d;

.field public final h:Ldh/i;

.field public final i:Ljava/util/List;

.field public final j:Lph/e;

.field public final k:Lud3/d0;

.field public final l:Lmh/p;

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:Lmh/b;

.field public final r:Lmh/b;

.field public final s:Lmh/b;

.field public final t:Lbc3/z;

.field public final u:Lbc3/z;

.field public final v:Lbc3/z;

.field public final w:Lbc3/z;

.field public final x:Landroidx/lifecycle/x;

.field public final y:Lnh/i;

.field public final z:Lnh/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Object;Loh/a;Lmh/i;Lkh/a;Landroid/graphics/Bitmap$Config;Lnh/d;Ldh/i;Ljava/util/List;Lph/e;Lud3/d0;Lmh/p;ZZZZLmh/b;Lmh/b;Lmh/b;Lbc3/z;Lbc3/z;Lbc3/z;Lbc3/z;Landroidx/lifecycle/x;Lnh/i;Lnh/g;Lmh/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lmh/d;Lmh/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lmh/j;->b:Ljava/lang/Object;

    iput-object p3, p0, Lmh/j;->c:Loh/a;

    iput-object p4, p0, Lmh/j;->d:Lmh/i;

    iput-object p5, p0, Lmh/j;->e:Lkh/a;

    iput-object p6, p0, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    iput-object p7, p0, Lmh/j;->g:Lnh/d;

    iput-object p8, p0, Lmh/j;->h:Ldh/i;

    iput-object p9, p0, Lmh/j;->i:Ljava/util/List;

    iput-object p10, p0, Lmh/j;->j:Lph/e;

    iput-object p11, p0, Lmh/j;->k:Lud3/d0;

    iput-object p12, p0, Lmh/j;->l:Lmh/p;

    iput-boolean p13, p0, Lmh/j;->m:Z

    iput-boolean p14, p0, Lmh/j;->n:Z

    iput-boolean p15, p0, Lmh/j;->o:Z

    move/from16 p1, p16

    iput-boolean p1, p0, Lmh/j;->p:Z

    move-object/from16 p1, p17

    iput-object p1, p0, Lmh/j;->q:Lmh/b;

    move-object/from16 p1, p18

    iput-object p1, p0, Lmh/j;->r:Lmh/b;

    move-object/from16 p1, p19

    iput-object p1, p0, Lmh/j;->s:Lmh/b;

    move-object/from16 p1, p20

    iput-object p1, p0, Lmh/j;->t:Lbc3/z;

    move-object/from16 p1, p21

    iput-object p1, p0, Lmh/j;->u:Lbc3/z;

    move-object/from16 p1, p22

    iput-object p1, p0, Lmh/j;->v:Lbc3/z;

    move-object/from16 p1, p23

    iput-object p1, p0, Lmh/j;->w:Lbc3/z;

    move-object/from16 p1, p24

    iput-object p1, p0, Lmh/j;->x:Landroidx/lifecycle/x;

    move-object/from16 p1, p25

    iput-object p1, p0, Lmh/j;->y:Lnh/i;

    move-object/from16 p1, p26

    iput-object p1, p0, Lmh/j;->z:Lnh/g;

    move-object/from16 p1, p27

    iput-object p1, p0, Lmh/j;->A:Lmh/n;

    move-object/from16 p1, p28

    iput-object p1, p0, Lmh/j;->B:Ljava/lang/Integer;

    move-object/from16 p1, p29

    iput-object p1, p0, Lmh/j;->C:Ljava/lang/Integer;

    move-object/from16 p1, p30

    iput-object p1, p0, Lmh/j;->D:Ljava/lang/Integer;

    move-object/from16 p1, p31

    iput-object p1, p0, Lmh/j;->E:Lmh/d;

    move-object/from16 p1, p32

    iput-object p1, p0, Lmh/j;->F:Lmh/c;

    return-void
.end method

.method public static a(Lmh/j;)Lmh/h;
    .locals 2

    iget-object v0, p0, Lmh/j;->a:Landroid/content/Context;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lmh/h;

    invoke-direct {v1, p0, v0}, Lmh/h;-><init>(Lmh/j;Landroid/content/Context;)V

    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lmh/j;

    if-eqz v0, :cond_1

    check-cast p1, Lmh/j;

    iget-object v0, p1, Lmh/j;->a:Landroid/content/Context;

    iget-object v1, p0, Lmh/j;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->b:Ljava/lang/Object;

    iget-object v1, p1, Lmh/j;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->c:Loh/a;

    iget-object v1, p1, Lmh/j;->c:Loh/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->d:Lmh/i;

    iget-object v1, p1, Lmh/j;->d:Lmh/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->e:Lkh/a;

    iget-object v1, p1, Lmh/j;->e:Lkh/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    iget-object v1, p1, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->g:Lnh/d;

    iget-object v1, p1, Lmh/j;->g:Lnh/d;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->h:Ldh/i;

    iget-object v1, p1, Lmh/j;->h:Ldh/i;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->i:Ljava/util/List;

    iget-object v1, p1, Lmh/j;->i:Ljava/util/List;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->j:Lph/e;

    iget-object v1, p1, Lmh/j;->j:Lph/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->k:Lud3/d0;

    iget-object v1, p1, Lmh/j;->k:Lud3/d0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->l:Lmh/p;

    iget-object v1, p1, Lmh/j;->l:Lmh/p;

    invoke-virtual {v0, v1}, Lmh/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lmh/j;->m:Z

    iget-boolean v1, p1, Lmh/j;->m:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lmh/j;->n:Z

    iget-boolean v1, p1, Lmh/j;->n:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lmh/j;->o:Z

    iget-boolean v1, p1, Lmh/j;->o:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lmh/j;->p:Z

    iget-boolean v1, p1, Lmh/j;->p:Z

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->q:Lmh/b;

    iget-object v1, p1, Lmh/j;->q:Lmh/b;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->r:Lmh/b;

    iget-object v1, p1, Lmh/j;->r:Lmh/b;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->s:Lmh/b;

    iget-object v1, p1, Lmh/j;->s:Lmh/b;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->t:Lbc3/z;

    iget-object v1, p1, Lmh/j;->t:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->u:Lbc3/z;

    iget-object v1, p1, Lmh/j;->u:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->v:Lbc3/z;

    iget-object v1, p1, Lmh/j;->v:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->w:Lbc3/z;

    iget-object v1, p1, Lmh/j;->w:Lbc3/z;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->B:Ljava/lang/Integer;

    iget-object v1, p1, Lmh/j;->B:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->C:Ljava/lang/Integer;

    iget-object v1, p1, Lmh/j;->C:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->D:Ljava/lang/Integer;

    iget-object v1, p1, Lmh/j;->D:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->x:Landroidx/lifecycle/x;

    iget-object v1, p1, Lmh/j;->x:Landroidx/lifecycle/x;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->y:Lnh/i;

    iget-object v1, p1, Lmh/j;->y:Lnh/i;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->z:Lnh/g;

    iget-object v1, p1, Lmh/j;->z:Lnh/g;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lmh/j;->A:Lmh/n;

    iget-object v1, p1, Lmh/j;->A:Lmh/n;

    invoke-virtual {v0, v1}, Lmh/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->E:Lmh/d;

    iget-object v1, p1, Lmh/j;->E:Lmh/d;

    invoke-virtual {v0, v1}, Lmh/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmh/j;->F:Lmh/c;

    iget-object p1, p1, Lmh/j;->F:Lmh/c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lmh/j;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lmh/j;->b:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lmh/j;->c:Loh/a;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lmh/j;->d:Lmh/i;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lmh/j;->e:Lkh/a;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lkh/a;->hashCode()I

    move-result v3

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    add-int/2addr v0, v3

    const/16 v3, 0x3c1

    mul-int/2addr v0, v3

    iget-object v4, p0, Lmh/j;->f:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v3

    iget-object v0, p0, Lmh/j;->g:Lnh/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v4

    mul-int/2addr v0, v3

    iget-object v4, p0, Lmh/j;->h:Ldh/i;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_3

    :cond_3
    move v4, v2

    :goto_3
    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lmh/j;->i:Ljava/util/List;

    invoke-static {v0, v1, v4}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v4, p0, Lmh/j;->j:Lph/e;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->k:Lud3/d0;

    iget-object v0, v0, Lud3/d0;->w:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->l:Lmh/p;

    iget-object v0, v0, Lmh/p;->a:Ljava/util/Map;

    invoke-static {v0, v4, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-boolean v4, p0, Lmh/j;->m:Z

    invoke-static {v0, v1, v4}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v4, p0, Lmh/j;->n:Z

    invoke-static {v0, v1, v4}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v4, p0, Lmh/j;->o:Z

    invoke-static {v0, v1, v4}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v4, p0, Lmh/j;->p:Z

    invoke-static {v0, v1, v4}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v4, p0, Lmh/j;->q:Lmh/b;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->r:Lmh/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lmh/j;->s:Lmh/b;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->t:Lbc3/z;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lmh/j;->u:Lbc3/z;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->v:Lbc3/z;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lmh/j;->w:Lbc3/z;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->x:Landroidx/lifecycle/x;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lmh/j;->y:Lnh/i;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    add-int/2addr v4, v0

    mul-int/2addr v4, v1

    iget-object v0, p0, Lmh/j;->z:Lnh/g;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v4

    mul-int/2addr v0, v1

    iget-object v4, p0, Lmh/j;->A:Lmh/n;

    iget-object v4, v4, Lmh/n;->w:Ljava/util/Map;

    invoke-static {v4, v0, v3}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v4, p0, Lmh/j;->B:Ljava/lang/Integer;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_4

    :cond_4
    move v4, v2

    :goto_4
    add-int/2addr v0, v4

    mul-int/2addr v0, v3

    iget-object v4, p0, Lmh/j;->C:Ljava/lang/Integer;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_5

    :cond_5
    move v4, v2

    :goto_5
    add-int/2addr v0, v4

    mul-int/2addr v0, v3

    iget-object v4, p0, Lmh/j;->D:Ljava/lang/Integer;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v3

    iget-object v2, p0, Lmh/j;->E:Lmh/d;

    invoke-virtual {v2}, Lmh/d;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lmh/j;->F:Lmh/c;

    invoke-virtual {v0}, Lmh/c;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method
