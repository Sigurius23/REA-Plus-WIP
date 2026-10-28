.class public final Ld1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ld1/j;

.field public c:Lkotlin/jvm/functions/Function1;

.field public d:Lkotlin/jvm/functions/Function1;

.field public e:Lu0/s0;

.field public f:Lf1/s1;

.field public g:Lb3/j3;

.field public h:Lq3/y;

.field public i:Lq3/l;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/lang/Object;

.field public l:Landroid/graphics/Rect;

.field public final m:Ld1/l;


# direct methods
.method public constructor <init>(Landroid/view/View;Ld1/a;Ld1/j;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/o;->a:Landroid/view/View;

    iput-object p3, p0, Ld1/o;->b:Ld1/j;

    new-instance p1, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0x1b

    invoke-direct {p1, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    iput-object p1, p0, Ld1/o;->c:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lcom/whoop/profile/view/edit/form/c;

    const/16 v0, 0x1c

    invoke-direct {p1, v0}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    iput-object p1, p0, Ld1/o;->d:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lq3/y;

    sget-wide v0, Ll3/u0;->b:J

    const/4 v2, 0x4

    const-string v3, ""

    invoke-direct {p1, v2, v3, v0, v1}, Lq3/y;-><init>(ILjava/lang/String;J)V

    iput-object p1, p0, Ld1/o;->h:Lq3/y;

    sget-object p1, Lq3/l;->g:Lq3/l;

    iput-object p1, p0, Ld1/o;->i:Lq3/l;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ld1/o;->j:Ljava/util/ArrayList;

    sget-object p1, Ll83/i;->y:Ll83/i;

    new-instance v0, Ld1/i;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Ld1/o;->k:Ljava/lang/Object;

    new-instance p1, Ld1/l;

    invoke-direct {p1, p2, p3}, Ld1/l;-><init>(Ld1/a;Ld1/j;)V

    iput-object p1, p0, Ld1/o;->m:Ld1/l;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/inputmethod/EditorInfo;)Ld1/p;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Ld1/o;->h:Lq3/y;

    iget-object v3, v2, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    iget-wide v4, v2, Lq3/y;->b:J

    iget-object v2, v0, Ld1/o;->i:Lq3/l;

    iget v6, v2, Lq3/l;->e:I

    iget v7, v2, Lq3/l;->d:I

    iget-boolean v8, v2, Lq3/l;->a:Z

    const/4 v9, 0x4

    const/4 v10, 0x5

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x3

    const/4 v15, 0x2

    const/4 v11, 0x1

    if-ne v6, v11, :cond_1

    if-eqz v8, :cond_0

    :goto_0
    move v6, v13

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    if-nez v6, :cond_2

    move v6, v11

    goto :goto_1

    :cond_2
    if-ne v6, v15, :cond_3

    move v6, v15

    goto :goto_1

    :cond_3
    if-ne v6, v13, :cond_4

    move v6, v10

    goto :goto_1

    :cond_4
    if-ne v6, v10, :cond_5

    move v6, v12

    goto :goto_1

    :cond_5
    if-ne v6, v14, :cond_6

    move v6, v14

    goto :goto_1

    :cond_6
    if-ne v6, v9, :cond_7

    move v6, v9

    goto :goto_1

    :cond_7
    if-ne v6, v12, :cond_20

    goto :goto_0

    :goto_1
    iput v6, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    iget-object v6, v2, Lq3/l;->f:Ls3/b;

    sget-object v12, Ls3/b;->y:Ls3/b;

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/4 v6, 0x0

    iput-object v6, v1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    goto :goto_3

    :cond_8
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v6, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v6, v6, Ls3/b;->w:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ls3/a;

    iget-object v13, v13, Ls3/a;->a:Ljava/util/Locale;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    const/4 v13, 0x0

    new-array v6, v13, [Ljava/util/Locale;

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/util/Locale;

    array-length v12, v6

    invoke-static {v6, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/util/Locale;

    new-instance v12, Landroid/os/LocaleList;

    invoke-direct {v12, v6}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    iput-object v12, v1, Landroid/view/inputmethod/EditorInfo;->hintLocales:Landroid/os/LocaleList;

    :goto_3
    const/16 v6, 0x8

    if-ne v7, v11, :cond_a

    :goto_4
    move v9, v11

    goto :goto_5

    :cond_a
    if-ne v7, v15, :cond_b

    iget v9, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v10, -0x80000000

    or-int/2addr v9, v10

    iput v9, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_4

    :cond_b
    if-ne v7, v14, :cond_c

    move v9, v15

    goto :goto_5

    :cond_c
    if-ne v7, v9, :cond_d

    move v9, v14

    goto :goto_5

    :cond_d
    if-ne v7, v10, :cond_e

    const/16 v9, 0x11

    goto :goto_5

    :cond_e
    const/4 v9, 0x6

    if-ne v7, v9, :cond_f

    const/16 v9, 0x21

    goto :goto_5

    :cond_f
    const/4 v9, 0x7

    if-ne v7, v9, :cond_10

    const/16 v9, 0x81

    goto :goto_5

    :cond_10
    if-ne v7, v6, :cond_11

    const/16 v9, 0x12

    goto :goto_5

    :cond_11
    const/16 v9, 0x9

    if-ne v7, v9, :cond_1f

    const/16 v9, 0x2002

    :goto_5
    iput v9, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    if-nez v8, :cond_12

    and-int/lit8 v8, v9, 0x1

    if-ne v8, v11, :cond_12

    const/high16 v8, 0x20000

    or-int/2addr v8, v9

    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    iget v8, v2, Lq3/l;->e:I

    if-ne v8, v11, :cond_12

    iget v8, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v9, 0x40000000    # 2.0f

    or-int/2addr v8, v9

    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_12
    iget v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit8 v9, v8, 0x1

    if-ne v9, v11, :cond_16

    iget v9, v2, Lq3/l;->b:I

    if-ne v9, v11, :cond_13

    or-int/lit16 v8, v8, 0x1000

    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_6

    :cond_13
    if-ne v9, v15, :cond_14

    or-int/lit16 v8, v8, 0x2000

    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_6

    :cond_14
    if-ne v9, v14, :cond_15

    or-int/lit16 v8, v8, 0x4000

    iput v8, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_15
    :goto_6
    iget-boolean v2, v2, Lq3/l;->c:Z

    if-eqz v2, :cond_16

    iget v2, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const v8, 0x8000

    or-int/2addr v2, v8

    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_16
    sget v2, Ll3/u0;->c:I

    const/16 v2, 0x20

    shr-long v8, v4, v2

    long-to-int v2, v8

    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    const-wide v8, 0xffffffffL

    and-long/2addr v4, v8

    long-to-int v2, v4

    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    invoke-static {v1, v3}, Lvd/e;->a0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    iget v2, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v3, 0x2000000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    sget-boolean v2, Lc1/b;->a:Z

    const-string v3, "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"

    if-eqz v2, :cond_1b

    const/4 v9, 0x7

    if-ne v7, v9, :cond_17

    goto :goto_7

    :cond_17
    if-ne v7, v6, :cond_18

    goto :goto_7

    :cond_18
    invoke-static {}, Lb5/b;->a()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-static {v1, v11}, Lj5/a;->b(Landroid/view/inputmethod/EditorInfo;Z)V

    :cond_19
    iget-object v2, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v2, :cond_1a

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    :cond_1a
    iget-object v2, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v11}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {v1}, Lb3/g1;->s(Landroid/view/inputmethod/EditorInfo;)V

    goto :goto_8

    :cond_1b
    :goto_7
    invoke-static {}, Lb5/b;->a()Z

    move-result v2

    const/4 v13, 0x0

    if-eqz v2, :cond_1c

    invoke-static {v1, v13}, Lj5/a;->b(Landroid/view/inputmethod/EditorInfo;Z)V

    :cond_1c
    iget-object v2, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    if-nez v2, :cond_1d

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iput-object v2, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    :cond_1d
    iget-object v2, v1, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    invoke-virtual {v2, v3, v13}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :goto_8
    sget-object v2, Ld1/n;->a:Ld1/m;

    invoke-static {}, Lh6/j;->d()Z

    move-result v2

    if-nez v2, :cond_1e

    goto :goto_9

    :cond_1e
    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v2

    invoke-virtual {v2, v1}, Lh6/j;->i(Landroid/view/inputmethod/EditorInfo;)V

    :goto_9
    iget-object v4, v0, Ld1/o;->h:Lq3/y;

    iget-object v1, v0, Ld1/o;->i:Lq3/l;

    iget-boolean v6, v1, Lq3/l;->c:Z

    new-instance v5, Lro/i;

    const/16 v1, 0x15

    invoke-direct {v5, v0, v1}, Lro/i;-><init>(Ljava/lang/Object;I)V

    iget-object v7, v0, Ld1/o;->e:Lu0/s0;

    iget-object v8, v0, Ld1/o;->f:Lf1/s1;

    iget-object v9, v0, Ld1/o;->g:Lb3/j3;

    new-instance v3, Ld1/p;

    invoke-direct/range {v3 .. v9}, Ld1/p;-><init>(Lq3/y;Lro/i;ZLu0/s0;Lf1/s1;Lb3/j3;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v2, v0, Ld1/o;->j:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3

    :cond_1f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Invalid Keyboard Type"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "invalid ImeAction"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
