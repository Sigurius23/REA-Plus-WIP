.class public abstract Lpl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public E:Landroid/graphics/drawable/Drawable;

.field public F:I

.field public G:Z

.field public H:I

.field public I:I

.field public J:Lwk/e;

.field public K:Z

.field public L:Z

.field public M:Lwk/h;

.field public N:Ltl/b;

.field public O:Ljava/lang/Class;

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Z

.field public w:I

.field public x:Lzk/k;

.field public y:Lcom/bumptech/glide/d;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lzk/k;->e:Lzk/k;

    iput-object v0, p0, Lpl/a;->x:Lzk/k;

    sget-object v0, Lcom/bumptech/glide/d;->w:Lcom/bumptech/glide/d;

    iput-object v0, p0, Lpl/a;->y:Lcom/bumptech/glide/d;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpl/a;->G:Z

    const/4 v1, -0x1

    iput v1, p0, Lpl/a;->H:I

    iput v1, p0, Lpl/a;->I:I

    sget-object v1, Lsl/c;->b:Lsl/c;

    iput-object v1, p0, Lpl/a;->J:Lwk/e;

    iput-boolean v0, p0, Lpl/a;->L:Z

    new-instance v1, Lwk/h;

    invoke-direct {v1}, Lwk/h;-><init>()V

    iput-object v1, p0, Lpl/a;->M:Lwk/h;

    new-instance v1, Ltl/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, La0/f1;-><init>(I)V

    iput-object v1, p0, Lpl/a;->N:Ltl/b;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, Lpl/a;->O:Ljava/lang/Class;

    iput-boolean v0, p0, Lpl/a;->R:Z

    return-void
.end method

.method public static g(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a(Lpl/a;)Lpl/a;
    .locals 3

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->a(Lpl/a;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, Lpl/a;->w:I

    iget v0, p1, Lpl/a;->w:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lpl/a;->S:Z

    iput-boolean v0, p0, Lpl/a;->S:Z

    :cond_1
    iget v0, p1, Lpl/a;->w:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lpl/a;->x:Lzk/k;

    iput-object v0, p0, Lpl/a;->x:Lzk/k;

    :cond_2
    iget v0, p1, Lpl/a;->w:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p1, Lpl/a;->y:Lcom/bumptech/glide/d;

    iput-object v0, p0, Lpl/a;->y:Lcom/bumptech/glide/d;

    :cond_3
    iget v0, p1, Lpl/a;->w:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lpl/a;->g(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iput v1, p0, Lpl/a;->z:I

    iget v0, p0, Lpl/a;->w:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lpl/a;->w:I

    :cond_4
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p1, Lpl/a;->z:I

    iput v0, p0, Lpl/a;->z:I

    iget v0, p0, Lpl/a;->w:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lpl/a;->w:I

    :cond_5
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x40

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p1, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    iput v1, p0, Lpl/a;->F:I

    iget v0, p0, Lpl/a;->w:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, Lpl/a;->w:I

    :cond_6
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x80

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p1, Lpl/a;->F:I

    iput v0, p0, Lpl/a;->F:I

    const/4 v0, 0x0

    iput-object v0, p0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    iget v0, p0, Lpl/a;->w:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, Lpl/a;->w:I

    :cond_7
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x100

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p1, Lpl/a;->G:Z

    iput-boolean v0, p0, Lpl/a;->G:Z

    :cond_8
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x200

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, Lpl/a;->I:I

    iput v0, p0, Lpl/a;->I:I

    iget v0, p1, Lpl/a;->H:I

    iput v0, p0, Lpl/a;->H:I

    :cond_9
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x400

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Lpl/a;->J:Lwk/e;

    iput-object v0, p0, Lpl/a;->J:Lwk/e;

    :cond_a
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x1000

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p1, Lpl/a;->O:Ljava/lang/Class;

    iput-object v0, p0, Lpl/a;->O:Ljava/lang/Class;

    :cond_b
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x2000

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget v0, p0, Lpl/a;->w:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lpl/a;->w:I

    :cond_c
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x4000

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget v0, p0, Lpl/a;->w:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, Lpl/a;->w:I

    :cond_d
    iget v0, p1, Lpl/a;->w:I

    const/high16 v2, 0x10000

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-boolean v0, p1, Lpl/a;->L:Z

    iput-boolean v0, p0, Lpl/a;->L:Z

    :cond_e
    iget v0, p1, Lpl/a;->w:I

    const/high16 v2, 0x20000

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-boolean v0, p1, Lpl/a;->K:Z

    iput-boolean v0, p0, Lpl/a;->K:Z

    :cond_f
    iget v0, p1, Lpl/a;->w:I

    const/16 v2, 0x800

    invoke-static {v0, v2}, Lpl/a;->g(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lpl/a;->N:Ltl/b;

    iget-object v2, p1, Lpl/a;->N:Ltl/b;

    invoke-virtual {v0, v2}, La0/g;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, Lpl/a;->R:Z

    iput-boolean v0, p0, Lpl/a;->R:Z

    :cond_10
    iget-boolean v0, p0, Lpl/a;->L:Z

    if-nez v0, :cond_11

    iget-object v0, p0, Lpl/a;->N:Ltl/b;

    invoke-virtual {v0}, Ltl/b;->clear()V

    iget v0, p0, Lpl/a;->w:I

    iput-boolean v1, p0, Lpl/a;->K:Z

    const v1, -0x20801

    and-int/2addr v0, v1

    iput v0, p0, Lpl/a;->w:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpl/a;->R:Z

    :cond_11
    iget v0, p0, Lpl/a;->w:I

    iget v1, p1, Lpl/a;->w:I

    or-int/2addr v0, v1

    iput v0, p0, Lpl/a;->w:I

    iget-object v0, p0, Lpl/a;->M:Lwk/h;

    iget-object p1, p1, Lpl/a;->M:Lwk/h;

    iget-object v0, v0, Lwk/h;->b:Ltl/b;

    iget-object p1, p1, Lwk/h;->b:Ltl/b;

    invoke-virtual {v0, p1}, Ltl/b;->h(La0/g;)V

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public b()Lpl/a;
    .locals 4

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpl/a;

    new-instance v1, Lwk/h;

    invoke-direct {v1}, Lwk/h;-><init>()V

    iput-object v1, v0, Lpl/a;->M:Lwk/h;

    iget-object v2, p0, Lpl/a;->M:Lwk/h;

    iget-object v1, v1, Lwk/h;->b:Ltl/b;

    iget-object v2, v2, Lwk/h;->b:Ltl/b;

    invoke-virtual {v1, v2}, Ltl/b;->h(La0/g;)V

    new-instance v1, Ltl/b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, La0/f1;-><init>(I)V

    iput-object v1, v0, Lpl/a;->N:Ltl/b;

    iget-object v3, p0, Lpl/a;->N:Ltl/b;

    invoke-virtual {v1, v3}, La0/g;->putAll(Ljava/util/Map;)V

    iput-boolean v2, v0, Lpl/a;->P:Z

    iput-boolean v2, v0, Lpl/a;->Q:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Ljava/lang/Class;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->c(Ljava/lang/Class;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lpl/a;->O:Ljava/lang/Class;

    iget p1, p0, Lpl/a;->w:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lzk/k;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lpl/a;->x:Lzk/k;

    iget p1, p0, Lpl/a;->w:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final e()Lpl/a;
    .locals 3

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0}, Lpl/a;->e()Lpl/a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lpl/a;->N:Ltl/b;

    invoke-virtual {v0}, Ltl/b;->clear()V

    iget v0, p0, Lpl/a;->w:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Lpl/a;->K:Z

    const v2, -0x20801

    and-int/2addr v0, v2

    iput-boolean v1, p0, Lpl/a;->L:Z

    const/high16 v1, 0x10000

    or-int/2addr v0, v1

    iput v0, p0, Lpl/a;->w:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpl/a;->R:Z

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lpl/a;

    if-eqz v0, :cond_0

    check-cast p1, Lpl/a;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v0}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lpl/a;->z:I

    iget v1, p1, Lpl/a;->z:I

    if-ne v0, v1, :cond_0

    sget-object v0, Ltl/l;->a:[C

    iget v0, p0, Lpl/a;->F:I

    iget v1, p1, Lpl/a;->F:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, Ltl/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lpl/a;->G:Z

    iget-boolean v1, p1, Lpl/a;->G:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Lpl/a;->H:I

    iget v1, p1, Lpl/a;->H:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Lpl/a;->I:I

    iget v1, p1, Lpl/a;->I:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lpl/a;->K:Z

    iget-boolean v1, p1, Lpl/a;->K:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lpl/a;->L:Z

    iget-boolean v1, p1, Lpl/a;->L:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lpl/a;->x:Lzk/k;

    iget-object v1, p1, Lpl/a;->x:Lzk/k;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/a;->y:Lcom/bumptech/glide/d;

    iget-object v1, p1, Lpl/a;->y:Lcom/bumptech/glide/d;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lpl/a;->M:Lwk/h;

    iget-object v1, p1, Lpl/a;->M:Lwk/h;

    invoke-virtual {v0, v1}, Lwk/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/a;->N:Ltl/b;

    iget-object v1, p1, Lpl/a;->N:Ltl/b;

    invoke-virtual {v0, v1}, La0/f1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/a;->O:Ljava/lang/Class;

    iget-object v1, p1, Lpl/a;->O:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpl/a;->J:Lwk/e;

    iget-object p1, p1, Lpl/a;->J:Lwk/e;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(I)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->f(I)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Lpl/a;->z:I

    iget p1, p0, Lpl/a;->w:I

    or-int/lit8 p1, p1, 0x20

    and-int/lit8 p1, p1, -0x11

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final h(Lgl/k;Lgl/d;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpl/a;->h(Lgl/k;Lgl/d;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lgl/k;->g:Lwk/g;

    invoke-virtual {p0, v0, p1}, Lpl/a;->p(Lwk/g;Ljava/lang/Object;)Lpl/a;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, Lpl/a;->u(Lwk/l;Z)Lpl/a;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 4

    sget-object v0, Ltl/l;->a:[C

    const/16 v0, 0x11

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-static {v1, v0}, Ltl/l;->e(II)I

    move-result v0

    iget v1, p0, Lpl/a;->z:I

    invoke-static {v1, v0}, Ltl/l;->e(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget v2, p0, Lpl/a;->F:I

    invoke-static {v2, v0}, Ltl/l;->e(II)I

    move-result v0

    iget-object v2, p0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ltl/l;->e(II)I

    move-result v0

    invoke-static {v0, v1}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget-boolean v3, p0, Lpl/a;->G:Z

    invoke-static {v3, v0}, Ltl/l;->e(II)I

    move-result v0

    iget v3, p0, Lpl/a;->H:I

    invoke-static {v3, v0}, Ltl/l;->e(II)I

    move-result v0

    iget v3, p0, Lpl/a;->I:I

    invoke-static {v3, v0}, Ltl/l;->e(II)I

    move-result v0

    iget-boolean v3, p0, Lpl/a;->K:Z

    invoke-static {v3, v0}, Ltl/l;->e(II)I

    move-result v0

    iget-boolean v3, p0, Lpl/a;->L:Z

    invoke-static {v3, v0}, Ltl/l;->e(II)I

    move-result v0

    invoke-static {v2, v0}, Ltl/l;->e(II)I

    move-result v0

    invoke-static {v2, v0}, Ltl/l;->e(II)I

    move-result v0

    iget-object v2, p0, Lpl/a;->x:Lzk/k;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lpl/a;->y:Lcom/bumptech/glide/d;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lpl/a;->M:Lwk/h;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lpl/a;->N:Ltl/b;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lpl/a;->O:Ljava/lang/Class;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    iget-object v2, p0, Lpl/a;->J:Lwk/e;

    invoke-static {v0, v2}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    invoke-static {v0, v1}, Ltl/l;->f(ILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i(II)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpl/a;->i(II)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Lpl/a;->I:I

    iput p2, p0, Lpl/a;->H:I

    iget p1, p0, Lpl/a;->w:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final j(I)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->j(I)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, Lpl/a;->F:I

    iget p1, p0, Lpl/a;->w:I

    or-int/lit16 p1, p1, 0x80

    const/4 v0, 0x0

    iput-object v0, p0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    and-int/lit8 p1, p1, -0x41

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final k(Landroid/graphics/drawable/Drawable;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->k(Landroid/graphics/drawable/Drawable;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lpl/a;->E:Landroid/graphics/drawable/Drawable;

    iget p1, p0, Lpl/a;->w:I

    or-int/lit8 p1, p1, 0x40

    const/4 v0, 0x0

    iput v0, p0, Lpl/a;->F:I

    and-int/lit16 p1, p1, -0x81

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final l()Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0}, Lpl/a;->l()Lpl/a;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lcom/bumptech/glide/d;->x:Lcom/bumptech/glide/d;

    iput-object v0, p0, Lpl/a;->y:Lcom/bumptech/glide/d;

    iget v0, p0, Lpl/a;->w:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final n(Lgl/k;Lgl/d;Z)Lpl/a;
    .locals 0

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1, p2}, Lpl/a;->s(Lgl/k;Lgl/d;)Lpl/a;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lpl/a;->h(Lgl/k;Lgl/d;)Lpl/a;

    move-result-object p1

    :goto_0
    const/4 p2, 0x1

    iput-boolean p2, p1, Lpl/a;->R:Z

    return-object p1
.end method

.method public final o()V
    .locals 2

    iget-boolean v0, p0, Lpl/a;->P:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final p(Lwk/g;Ljava/lang/Object;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpl/a;->p(Lwk/g;Ljava/lang/Object;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lpf/c;->o(Ljava/lang/Object;)V

    iget-object v0, p0, Lpl/a;->M:Lwk/h;

    iget-object v0, v0, Lwk/h;->b:Ltl/b;

    invoke-virtual {v0, p1, p2}, Ltl/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final q(Lwk/e;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lpl/a;->q(Lwk/e;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lpl/a;->J:Lwk/e;

    iget p1, p0, Lpl/a;->w:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final r(Z)Lpl/a;
    .locals 2

    iget-boolean v0, p0, Lpl/a;->Q:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lpl/a;->r(Z)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    xor-int/2addr p1, v1

    iput-boolean p1, p0, Lpl/a;->G:Z

    iget p1, p0, Lpl/a;->w:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final s(Lgl/k;Lgl/d;)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpl/a;->s(Lgl/k;Lgl/d;)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lgl/k;->g:Lwk/g;

    invoke-virtual {p0, v0, p1}, Lpl/a;->p(Lwk/g;Ljava/lang/Object;)Lpl/a;

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p1}, Lpl/a;->u(Lwk/l;Z)Lpl/a;

    move-result-object p1

    return-object p1
.end method

.method public final t(Ljava/lang/Class;Lwk/l;Z)Lpl/a;
    .locals 1

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lpl/a;->t(Ljava/lang/Class;Lwk/l;Z)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2}, Lpf/c;->o(Ljava/lang/Object;)V

    iget-object v0, p0, Lpl/a;->N:Ltl/b;

    invoke-virtual {v0, p1, p2}, Ltl/b;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lpl/a;->w:I

    const/4 p2, 0x1

    iput-boolean p2, p0, Lpl/a;->L:Z

    const v0, 0x10800

    or-int/2addr v0, p1

    iput v0, p0, Lpl/a;->w:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpl/a;->R:Z

    if-eqz p3, :cond_1

    const p3, 0x30800

    or-int/2addr p1, p3

    iput p1, p0, Lpl/a;->w:I

    iput-boolean p2, p0, Lpl/a;->K:Z

    :cond_1
    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final u(Lwk/l;Z)Lpl/a;
    .locals 2

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lpl/a;->u(Lwk/l;Z)Lpl/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lgl/p;

    invoke-direct {v0, p1, p2}, Lgl/p;-><init>(Lwk/l;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, Lpl/a;->t(Ljava/lang/Class;Lwk/l;Z)Lpl/a;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, Lpl/a;->t(Ljava/lang/Class;Lwk/l;Z)Lpl/a;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0, v1, v0, p2}, Lpl/a;->t(Ljava/lang/Class;Lwk/l;Z)Lpl/a;

    new-instance v0, Lkl/c;

    invoke-direct {v0, p1}, Lkl/c;-><init>(Lwk/l;)V

    const-class p1, Lkl/b;

    invoke-virtual {p0, p1, v0, p2}, Lpl/a;->t(Ljava/lang/Class;Lwk/l;Z)Lpl/a;

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method

.method public final v()Lpl/a;
    .locals 2

    iget-boolean v0, p0, Lpl/a;->Q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpl/a;->b()Lpl/a;

    move-result-object v0

    invoke-virtual {v0}, Lpl/a;->v()Lpl/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpl/a;->S:Z

    iget v0, p0, Lpl/a;->w:I

    const/high16 v1, 0x100000

    or-int/2addr v0, v1

    iput v0, p0, Lpl/a;->w:I

    invoke-virtual {p0}, Lpl/a;->o()V

    return-object p0
.end method
