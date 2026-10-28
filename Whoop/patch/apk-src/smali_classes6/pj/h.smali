.class public final Lpj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Landroid/content/Context;

.field public final synthetic x:J

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;JLkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lpj/h;->w:Landroid/content/Context;

    iput-wide p2, p0, Lpj/h;->x:J

    iput-object p4, p0, Lpj/h;->y:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lpj/h;->z:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    iget-object v1, p0, Lpj/h;->w:Landroid/content/Context;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v2, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    new-instance v2, La73/b;

    invoke-direct {v2}, La73/b;-><init>()V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, La73/b;

    invoke-direct {v2}, La73/b;-><init>()V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Le73/c;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    new-instance v4, Lc9/k;

    invoke-direct {v4}, Lc9/k;-><init>()V

    const/4 v5, -0x1

    iput v5, v4, Lc9/k;->y:I

    const/4 v6, 0x4

    int-to-float v7, v6

    mul-float/2addr v7, v3

    const/high16 v8, 0x3f000000    # 0.5f

    add-float/2addr v7, v8

    float-to-int v7, v7

    iput v7, v4, Lc9/k;->x:I

    const/4 v7, 0x1

    int-to-float v9, v7

    mul-float/2addr v9, v3

    add-float/2addr v9, v8

    float-to-int v3, v9

    iput v3, v4, Lc9/k;->y:I

    new-instance v3, Lc9/k;

    invoke-direct {v3, v4}, Lc9/k;-><init>(Lc9/k;)V

    invoke-direct {v2, v3}, Le73/c;-><init>(Lc9/k;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    const v3, 0x101009b

    filled-new-array {v3}, [I

    move-result-object v3

    iget v2, v2, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v2, v3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    const v9, 0x1010031

    filled-new-array {v9}, [I

    move-result-object v9

    iget v2, v2, Landroid/util/TypedValue;->data:I

    invoke-virtual {v1, v2, v9}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v2

    :try_start_1
    invoke-virtual {v2, v3, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v2, Le73/c;

    new-instance v9, Lf73/a;

    invoke-direct {v9, v4, v4, v3}, Lf73/a;-><init>(III)V

    invoke-direct {v2, v9}, Le73/c;-><init>(Lf73/a;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ld73/a;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ld73/a;-><init>(I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ld73/a;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ld73/a;-><init>(I)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lpj/l;

    iget-wide v3, p0, Lpj/h;->x:J

    iget-object v9, p0, Lpj/h;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v3, v4, v9}, Lpj/l;-><init>(JLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_b

    new-instance v2, Lz63/d;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v0, v2, Lz63/d;->w:Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v3, v2, Lz63/d;->x:Ljava/lang/Object;

    new-instance v3, Ljava/util/HashSet;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    iput-object v3, v2, Lz63/d;->y:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz63/a;

    invoke-virtual {v2, v3}, Lz63/d;->a(Lz63/a;)V

    goto :goto_0

    :cond_0
    iget-object v0, v2, Lz63/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v2, Lab/i0;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lab/i0;-><init>(I)V

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    new-instance v3, La73/e;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput v5, v3, La73/e;->e:I

    iput v5, v3, La73/e;->f:I

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v4, v1

    add-float/2addr v4, v8

    float-to-int v4, v4

    iput v4, v3, La73/e;->d:I

    const/16 v4, 0x18

    int-to-float v4, v4

    mul-float/2addr v4, v1

    add-float/2addr v4, v8

    float-to-int v4, v4

    iput v4, v3, La73/e;->a:I

    int-to-float v4, v6

    mul-float/2addr v4, v1

    add-float/2addr v4, v8

    float-to-int v4, v4

    iput v4, v3, La73/e;->b:I

    int-to-float v4, v7

    mul-float/2addr v4, v1

    add-float/2addr v4, v8

    float-to-int v4, v4

    iput v4, v3, La73/e;->c:I

    int-to-float v4, v7

    mul-float/2addr v4, v1

    add-float/2addr v4, v8

    float-to-int v4, v4

    iput v4, v3, La73/e;->e:I

    int-to-float v4, v6

    mul-float/2addr v4, v1

    add-float/2addr v4, v8

    float-to-int v1, v4

    iput v1, v3, La73/e;->f:I

    new-instance v1, Lm63/d;

    const/16 v4, 0xd

    invoke-direct {v1, v4}, Lm63/d;-><init>(I)V

    new-instance v4, Lg9/k;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lg9/k;-><init>(I)V

    new-instance v5, Lg9/k;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lg9/k;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lz63/a;

    invoke-virtual {v7, v2}, Lz63/a;->c(Lab/i0;)V

    invoke-virtual {v7, v4}, Lz63/a;->e(Lg9/k;)V

    invoke-virtual {v7, v5}, Lz63/a;->d(Lg9/k;)V

    goto :goto_1

    :cond_1
    new-instance v6, La73/e;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget v7, v3, La73/e;->a:I

    iput v7, v6, La73/e;->a:I

    iget v7, v3, La73/e;->b:I

    iput v7, v6, La73/e;->b:I

    iget v7, v3, La73/e;->c:I

    iput v7, v6, La73/e;->c:I

    iget v7, v3, La73/e;->d:I

    iput v7, v6, La73/e;->d:I

    iget v7, v3, La73/e;->e:I

    iput v7, v6, La73/e;->e:I

    iget v3, v3, La73/e;->f:I

    iput v3, v6, La73/e;->f:I

    new-instance v3, Lo20/a;

    iget-object v5, v5, Lg9/k;->a:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    invoke-direct {v3, v5}, Lo20/a;-><init>(Ljava/util/Map;)V

    iput-object v6, v1, Lm63/d;->x:Ljava/lang/Object;

    iput-object v3, v1, Lm63/d;->H:Ljava/lang/Object;

    iget-object v3, v1, Lm63/d;->y:Ljava/lang/Object;

    check-cast v3, Lg73/a;

    if-nez v3, :cond_2

    new-instance v3, Lg73/a;

    const/4 v5, 0x0

    invoke-direct {v3, v5}, Lg73/a;-><init>(I)V

    iput-object v3, v1, Lm63/d;->y:Ljava/lang/Object;

    :cond_2
    iget-object v3, v1, Lm63/d;->z:Ljava/lang/Object;

    check-cast v3, Lg73/a;

    if-nez v3, :cond_3

    new-instance v3, Lg73/a;

    const/16 v5, 0xc

    invoke-direct {v3, v5}, Lg73/a;-><init>(I)V

    iput-object v3, v1, Lm63/d;->z:Ljava/lang/Object;

    :cond_3
    iget-object v3, v1, Lm63/d;->E:Ljava/lang/Object;

    check-cast v3, Lz5/b;

    if-nez v3, :cond_4

    new-instance v3, Lz5/b;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, v1, Lm63/d;->E:Ljava/lang/Object;

    :cond_4
    iget-object v3, v1, Lm63/d;->F:Ljava/lang/Object;

    check-cast v3, Lg73/a;

    if-nez v3, :cond_5

    new-instance v3, Lg73/a;

    const/4 v5, 0x4

    invoke-direct {v3, v5}, Lg73/a;-><init>(I)V

    iput-object v3, v1, Lm63/d;->F:Ljava/lang/Object;

    :cond_5
    iget-object v3, v1, Lm63/d;->G:Ljava/lang/Object;

    check-cast v3, Lg73/d;

    if-nez v3, :cond_6

    new-instance v3, Lg73/d;

    const/4 v5, 0x0

    invoke-direct {v3, v5}, Lg73/d;-><init>(I)V

    iput-object v3, v1, Lm63/d;->G:Ljava/lang/Object;

    :cond_6
    new-instance v7, Lb30/m;

    invoke-direct {v7, v1}, Lb30/m;-><init>(Lm63/d;)V

    new-instance v1, Lbf3/b;

    invoke-direct {v1, v2}, Lbf3/b;-><init>(Lab/i0;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz63/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_2

    :cond_7
    iget-object v2, p0, Lpj/h;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lbf3/b;->a(Ljava/lang/String;)Laf3/t;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz63/a;

    invoke-virtual {v3}, Lz63/a;->a()V

    goto :goto_3

    :cond_8
    new-instance v8, Lg9/k;

    const/4 v2, 0x3

    invoke-direct {v8, v2}, Lg9/k;-><init>(I)V

    new-instance v11, Lz40/i;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lq/f;

    new-instance v9, Lz63/h;

    invoke-direct {v9}, Lz63/h;-><init>()V

    iget-object v2, v4, Lg9/k;->a:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    invoke-direct/range {v6 .. v11}, Lq/f;-><init>(Lb30/m;Lg9/k;Lz63/h;Ljava/util/Map;Lz40/i;)V

    invoke-virtual {v1, v6}, Laf3/t;->a(Laf3/c0;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz63/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_4

    :cond_9
    iget-object v0, v6, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lz63/h;

    new-instance v1, Lz63/g;

    iget-object v2, v0, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    iget-object v0, v0, Lz63/h;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz63/f;

    iget-object v3, v2, Lz63/f;->a:Ljava/lang/Object;

    iget v4, v2, Lz63/f;->b:I

    iget v5, v2, Lz63/f;->c:I

    iget v2, v2, Lz63/f;->d:I

    invoke-virtual {v1, v3, v4, v5, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    :cond_a
    sget-object v0, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {p1, v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No plugins were added to this builder. Use #usePlugin method to add them"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method
