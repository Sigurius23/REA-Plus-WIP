.class public final Ldb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldb/s0;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    iput p2, p0, Ldb/g;->a:I

    packed-switch p2, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ldb/g;->b:Landroid/content/res/Resources;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ldb/g;->b:Landroid/content/res/Resources;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lrm/c0;)Ljava/lang/String;
    .locals 6

    iget-object v0, p1, Lrm/c0;->y:Ljava/lang/String;

    iget-object v1, p1, Lrm/c0;->x:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, ""

    if-nez v2, :cond_3

    const-string v2, "und"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    sget v2, Llo/y;->a:I

    const/16 v4, 0x15

    if-lt v2, v4, :cond_1

    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/util/Locale;

    invoke-direct {v4, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    move-object v0, v4

    :goto_0
    const/16 v4, 0x18

    if-lt v2, v4, :cond_2

    sget-object v2, Ljava/util/Locale$Category;->DISPLAY:Ljava/util/Locale$Category;

    invoke-static {v2}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    move-result-object v2

    goto :goto_1

    :cond_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    :goto_2
    move-object v0, v3

    goto :goto_3

    :cond_4
    const/4 v4, 0x1

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v4

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_5
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v4

    :catch_0
    :goto_3
    invoke-virtual {p0, p1}, Ldb/g;->c(Lrm/c0;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    move-object v1, v3

    :cond_6
    move-object p1, v1

    :cond_7
    return-object p1
.end method

.method public b(Lu8/p;)Ljava/lang/String;
    .locals 7

    iget-object v0, p1, Lu8/p;->d:Ljava/lang/String;

    iget-object v1, p1, Lu8/p;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, ""

    if-nez v2, :cond_2

    const-string v2, "und"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v0

    sget v2, Lx8/t;->a:I

    const/16 v4, 0x18

    if-lt v2, v4, :cond_1

    sget-object v2, Ljava/util/Locale$Category;->DISPLAY:Ljava/util/Locale$Category;

    invoke-static {v2}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    :goto_1
    move-object v0, v3

    goto :goto_2

    :cond_3
    const/4 v4, 0x1

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_2
    invoke-virtual {p0, p1}, Ldb/g;->d(Lu8/p;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_4

    move-object v1, v3

    :cond_4
    move-object p1, v1

    :cond_5
    return-object p1
.end method

.method public c(Lrm/c0;)Ljava/lang/String;
    .locals 3

    iget p1, p1, Lrm/c0;->E:I

    and-int/lit8 v0, p1, 0x2

    iget-object v1, p0, Ldb/g;->b:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    const v0, 0x7f1404cc

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    and-int/lit8 v2, p1, 0x4

    if-eqz v2, :cond_1

    const v2, 0x7f1404cf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    and-int/lit8 v2, p1, 0x8

    if-eqz v2, :cond_2

    const v2, 0x7f1404ce

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    and-int/lit16 p1, p1, 0x440

    if-eqz p1, :cond_3

    const p1, 0x7f1404cd

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0
.end method

.method public d(Lu8/p;)Ljava/lang/String;
    .locals 3

    iget v0, p1, Lu8/p;->f:I

    iget p1, p1, Lu8/p;->f:I

    and-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Ldb/g;->b:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    const v0, 0x7f1404cc

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    and-int/lit8 v2, p1, 0x4

    if-eqz v2, :cond_1

    const v2, 0x7f1404cf

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    and-int/lit8 v2, p1, 0x8

    if-eqz v2, :cond_2

    const v2, 0x7f1404ce

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v0, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    and-int/lit16 p1, p1, 0x440

    if-eqz p1, :cond_3

    const p1, 0x7f1404cd

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0
.end method

.method public e(Lu8/p;)Ljava/lang/String;
    .locals 12

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    iget v1, p1, Lu8/p;->j:I

    iget v2, p1, Lu8/p;->D:I

    iget v3, p1, Lu8/p;->v:I

    iget v4, p1, Lu8/p;->u:I

    iget-object v5, p1, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v0}, Lu8/d0;->i(Ljava/lang/String;)I

    move-result v0

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, -0x1

    if-eq v0, v8, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {v5}, Lu8/d0;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    :cond_1
    :goto_0
    move v0, v7

    goto :goto_2

    :cond_2
    invoke-static {v5}, Lu8/d0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_3
    :goto_1
    move v0, v6

    goto :goto_2

    :cond_4
    if-ne v4, v8, :cond_1

    if-eq v3, v8, :cond_5

    goto :goto_0

    :cond_5
    if-ne v2, v8, :cond_3

    iget v0, p1, Lu8/p;->E:I

    if-eq v0, v8, :cond_6

    goto :goto_1

    :cond_6
    move v0, v8

    :goto_2
    const v5, 0x49742400    # 1000000.0f

    const v9, 0x7f1404c9

    const-string v10, ""

    iget-object v11, p0, Ldb/g;->b:Landroid/content/res/Resources;

    if-ne v0, v7, :cond_a

    invoke-virtual {p0, p1}, Ldb/g;->d(Lu8/p;)Ljava/lang/String;

    move-result-object v0

    if-eq v4, v8, :cond_8

    if-ne v3, v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f1404cb

    invoke-virtual {v11, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_8
    :goto_3
    move-object v2, v10

    :goto_4
    if-ne v1, v8, :cond_9

    goto :goto_5

    :cond_9
    int-to-float v1, v1

    div-float/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v11, v9, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    :goto_5
    filled-new-array {v0, v2, v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_a
    if-ne v0, v6, :cond_12

    invoke-virtual {p0, p1}, Ldb/g;->b(Lu8/p;)Ljava/lang/String;

    move-result-object v0

    if-eq v2, v8, :cond_10

    if-ge v2, v6, :cond_b

    goto :goto_6

    :cond_b
    if-eq v2, v6, :cond_f

    if-eq v2, v7, :cond_e

    const/4 v3, 0x6

    if-eq v2, v3, :cond_d

    const/4 v3, 0x7

    if-eq v2, v3, :cond_d

    const/16 v3, 0x8

    if-eq v2, v3, :cond_c

    const v2, 0x7f1404d6

    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_c
    const v2, 0x7f1404d8

    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_d
    const v2, 0x7f1404d7

    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_e
    const v2, 0x7f1404d5

    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_f
    const v2, 0x7f1404ca

    invoke-virtual {v11, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_7

    :cond_10
    :goto_6
    move-object v2, v10

    :goto_7
    if-ne v1, v8, :cond_11

    goto :goto_8

    :cond_11
    int-to-float v1, v1

    div-float/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v11, v9, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    :goto_8
    filled-new-array {v0, v2, v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldb/g;->f([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_12
    invoke-virtual {p0, p1}, Ldb/g;->b(Lu8/p;)Ljava/lang/String;

    move-result-object v0

    :goto_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_13

    return-object v0

    :cond_13
    iget-object p1, p1, Lu8/p;->d:Ljava/lang/String;

    if-eqz p1, :cond_15

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_a

    :cond_14
    const v0, 0x7f1404da

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v11, v0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_15
    :goto_a
    const p1, 0x7f1404d9

    invoke-virtual {v11, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs f([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    iget v0, p0, Ldb/g;->a:I

    packed-switch v0, :pswitch_data_0

    array-length v0, p1

    const-string v1, ""

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v1, v3

    goto :goto_1

    :cond_0
    const v4, 0x7f1404c8

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Ldb/g;->b:Landroid/content/res/Resources;

    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :pswitch_0
    array-length v0, p1

    const-string v1, ""

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_5

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_4

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object v1, v3

    goto :goto_3

    :cond_3
    const v4, 0x7f1404c8

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Ldb/g;->b:Landroid/content/res/Resources;

    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
