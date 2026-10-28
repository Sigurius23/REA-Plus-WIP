.class public final Lhh/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lhh/g;

.field public final synthetic H:Lhh/a;

.field public final synthetic I:Lmh/m;

.field public final synthetic J:Ljava/util/List;

.field public final synthetic K:Lbh/c;

.field public final synthetic L:Lmh/j;

.field public w:Ljava/util/List;

.field public x:Lmh/m;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lhh/g;Lhh/a;Lmh/m;Ljava/util/List;Lbh/c;Lmh/j;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lhh/f;->G:Lhh/g;

    iput-object p2, p0, Lhh/f;->H:Lhh/a;

    iput-object p3, p0, Lhh/f;->I:Lmh/m;

    iput-object p4, p0, Lhh/f;->J:Ljava/util/List;

    iput-object p5, p0, Lhh/f;->K:Lbh/c;

    iput-object p6, p0, Lhh/f;->L:Lmh/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    new-instance v0, Lhh/f;

    iget-object v5, p0, Lhh/f;->K:Lbh/c;

    iget-object v6, p0, Lhh/f;->L:Lmh/j;

    iget-object v1, p0, Lhh/f;->G:Lhh/g;

    iget-object v2, p0, Lhh/f;->H:Lhh/a;

    iget-object v3, p0, Lhh/f;->I:Lmh/m;

    iget-object v4, p0, Lhh/f;->J:Ljava/util/List;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lhh/f;-><init>(Lhh/g;Lhh/a;Lmh/m;Ljava/util/List;Lbh/c;Lmh/j;Lq83/d;)V

    iput-object p1, v0, Lhh/f;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lhh/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhh/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lhh/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lhh/f;->E:I

    iget-object v1, p0, Lhh/f;->K:Lbh/c;

    iget-object v2, p0, Lhh/f;->H:Lhh/a;

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v3, :cond_0

    iget v0, p0, Lhh/f;->z:I

    iget v4, p0, Lhh/f;->y:I

    iget-object v5, p0, Lhh/f;->x:Lmh/m;

    iget-object v6, p0, Lhh/f;->w:Ljava/util/List;

    check-cast v6, Ljava/util/List;

    iget-object v7, p0, Lhh/f;->F:Ljava/lang/Object;

    check-cast v7, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v7}, Lbc3/f0;->n(Lbc3/c0;)V

    add-int/2addr v4, v3

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lhh/f;->F:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Lbc3/c0;

    iget-object p1, v2, Lhh/a;->a:Landroid/graphics/drawable/Drawable;

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v5, p0, Lhh/f;->I:Lmh/m;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v4

    if-nez v4, :cond_2

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_2
    sget-object v6, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v4}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object p1, v0

    goto :goto_0

    :cond_3
    iget-object v0, v5, Lmh/m;->b:Landroid/graphics/Bitmap$Config;

    iget-object v4, v5, Lmh/m;->d:Lnh/h;

    iget-object v6, v5, Lmh/m;->e:Lnh/g;

    iget-boolean v8, v5, Lmh/m;->f:Z

    invoke-static {p1, v0, v4, v6, v8}, Ls2/e;->r(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lnh/h;Lnh/g;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, p0, Lhh/f;->J:Ljava/util/List;

    move-object v0, v6

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v4, 0x0

    :goto_1
    if-lt v4, v0, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lhh/f;->L:Lmh/j;

    iget-object v0, v0, Lmh/j;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    iget-boolean p1, v2, Lhh/a;->b:Z

    iget-object v0, v2, Lhh/a;->c:Ldh/g;

    iget-object v2, v2, Lhh/a;->d:Ljava/lang/String;

    new-instance v3, Lhh/a;

    invoke-direct {v3, v1, p1, v0, v2}, Lhh/a;-><init>(Landroid/graphics/drawable/Drawable;ZLdh/g;Ljava/lang/String;)V

    return-object v3

    :cond_4
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_5

    iget-object p1, v5, Lmh/m;->d:Lnh/h;

    iput-object v7, p0, Lhh/f;->F:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iput-object v6, p0, Lhh/f;->w:Ljava/util/List;

    iput-object v5, p0, Lhh/f;->x:Lmh/m;

    iput v4, p0, Lhh/f;->y:I

    iput v0, p0, Lhh/f;->z:I

    iput v3, p0, Lhh/f;->E:I

    const/4 p1, 0x0

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method
