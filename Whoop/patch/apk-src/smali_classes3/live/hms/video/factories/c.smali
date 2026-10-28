.class public final synthetic Llive/hms/video/factories/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/Loggable;
.implements Lh5/u;
.implements Lha/g;
.implements Lrm/e;
.implements Lyr/e;
.implements Lt9/r;
.implements Lnm/g;
.implements Lnn/g;
.implements Lo23/a;
.implements Lbh3/g;
.implements Lorg/webrtc/EglThread$ReleaseMonitor;
.implements Lx8/d;
.implements Lpf/t;
.implements Lor/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/factories/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bridge synthetic g(Ljava/lang/Object;)Landroid/os/VibratorManager;
    .locals 0

    check-cast p0, Landroid/os/VibratorManager;

    return-object p0
.end method

.method public static bridge synthetic h(Ljava/lang/Object;)Landroid/window/OnBackInvokedCallback;
    .locals 0

    check-cast p0, Landroid/window/OnBackInvokedCallback;

    return-object p0
.end method

.method public static bridge synthetic i(Ljava/lang/Object;)Landroid/window/OnBackInvokedDispatcher;
    .locals 0

    check-cast p0, Landroid/window/OnBackInvokedDispatcher;

    return-object p0
.end method

.method public static bridge synthetic j(Ljava/lang/Object;)Z
    .locals 0

    instance-of p0, p0, Landroid/os/VibratorManager;

    return p0
.end method


# virtual methods
.method public a(IIIII)Z
    .locals 3

    iget v0, p0, Llive/hms/video/factories/c;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    const/16 v0, 0x43

    const/4 v1, 0x2

    const/16 v2, 0x4d

    if-ne p2, v0, :cond_0

    const/16 v0, 0x4f

    if-ne p3, v0, :cond_0

    if-ne p4, v2, :cond_0

    if-eq p5, v2, :cond_1

    if-eq p1, v1, :cond_1

    :cond_0
    if-ne p2, v2, :cond_2

    const/16 p2, 0x4c

    if-ne p3, p2, :cond_2

    if-ne p4, p2, :cond_2

    const/16 p2, 0x54

    if-eq p5, p2, :cond_1

    if-ne p1, v1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    move-object/from16 v1, p0

    iget v0, v1, Llive/hms/video/factories/c;->w:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    sparse-switch v0, :sswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Lw8/b;

    iget-object v8, v0, Lw8/b;->d:Landroid/graphics/Bitmap;

    new-instance v9, Landroid/os/Bundle;

    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    iget-object v10, v0, Lw8/b;->a:Ljava/lang/CharSequence;

    if-eqz v10, :cond_4

    sget-object v11, Lw8/b;->r:Ljava/lang/String;

    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    instance-of v11, v10, Landroid/text/Spanned;

    if-eqz v11, :cond_4

    check-cast v10, Landroid/text/Spanned;

    sget-object v11, Lw8/d;->a:Ljava/lang/String;

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v12

    const-class v13, Lw8/g;

    invoke-interface {v10, v7, v12, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Lw8/g;

    array-length v13, v12

    move v14, v7

    :goto_0
    if-ge v14, v13, :cond_0

    aget-object v15, v12, v14

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    sget-object v3, Lw8/g;->c:Ljava/lang/String;

    iget-object v4, v15, Lw8/g;->a:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v3, Lw8/g;->d:Ljava/lang/String;

    iget v4, v15, Lw8/g;->b:I

    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {v10, v15, v6, v2}, Lw8/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, Lw8/h;

    invoke-interface {v10, v7, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lw8/h;

    array-length v3, v2

    move v4, v7

    :goto_1
    if-ge v4, v3, :cond_1

    aget-object v6, v2, v4

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    sget-object v13, Lw8/h;->d:Ljava/lang/String;

    iget v14, v6, Lw8/h;->a:I

    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v13, Lw8/h;->e:Ljava/lang/String;

    iget v14, v6, Lw8/h;->b:I

    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v13, Lw8/h;->f:Ljava/lang/String;

    iget v14, v6, Lw8/h;->c:I

    invoke-virtual {v12, v13, v14}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-static {v10, v6, v5, v12}, Lw8/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, Lw8/e;

    invoke-interface {v10, v7, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lw8/e;

    array-length v3, v2

    move v4, v7

    :goto_2
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    const/4 v6, 0x3

    const/4 v12, 0x0

    invoke-static {v10, v5, v6, v12}, Lw8/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, Lw8/i;

    invoke-interface {v10, v7, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lw8/i;

    array-length v3, v2

    move v4, v7

    :goto_3
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    sget-object v12, Lw8/i;->b:Ljava/lang/String;

    iget-object v13, v5, Lw8/i;->a:Ljava/lang/String;

    invoke-virtual {v6, v12, v13}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v12, 0x4

    invoke-static {v10, v5, v12, v6}, Lw8/d;->a(Landroid/text/Spanned;Ljava/lang/Object;ILandroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Lw8/b;->s:Ljava/lang/String;

    invoke-virtual {v9, v2, v11}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_4
    sget-object v2, Lw8/b;->t:Ljava/lang/String;

    iget-object v3, v0, Lw8/b;->b:Landroid/text/Layout$Alignment;

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    sget-object v2, Lw8/b;->u:Ljava/lang/String;

    iget-object v3, v0, Lw8/b;->c:Landroid/text/Layout$Alignment;

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    sget-object v2, Lw8/b;->x:Ljava/lang/String;

    iget v3, v0, Lw8/b;->e:F

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v2, Lw8/b;->y:Ljava/lang/String;

    iget v3, v0, Lw8/b;->f:I

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v2, Lw8/b;->z:Ljava/lang/String;

    iget v3, v0, Lw8/b;->g:I

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v2, Lw8/b;->A:Ljava/lang/String;

    iget v3, v0, Lw8/b;->h:F

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v2, Lw8/b;->B:Ljava/lang/String;

    iget v3, v0, Lw8/b;->i:I

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v2, Lw8/b;->C:Ljava/lang/String;

    iget v3, v0, Lw8/b;->n:I

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v2, Lw8/b;->D:Ljava/lang/String;

    iget v3, v0, Lw8/b;->o:F

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v2, Lw8/b;->E:Ljava/lang/String;

    iget v3, v0, Lw8/b;->j:F

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v2, Lw8/b;->F:Ljava/lang/String;

    iget v3, v0, Lw8/b;->k:F

    invoke-virtual {v9, v2, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    sget-object v2, Lw8/b;->H:Ljava/lang/String;

    iget-boolean v3, v0, Lw8/b;->l:Z

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    sget-object v2, Lw8/b;->G:Ljava/lang/String;

    iget v3, v0, Lw8/b;->m:I

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v2, Lw8/b;->I:Ljava/lang/String;

    iget v3, v0, Lw8/b;->p:I

    invoke-virtual {v9, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object v2, Lw8/b;->J:Ljava/lang/String;

    iget v0, v0, Lw8/b;->q:F

    invoke-virtual {v9, v2, v0}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    if-eqz v8, :cond_5

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v8, v2, v7, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v2

    invoke-static {v2}, Lva3/g;->i(Z)V

    sget-object v2, Lw8/b;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v9, v2, v0}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_5
    return-object v9

    :sswitch_0
    const/4 v12, 0x0

    move-object/from16 v0, p1

    check-cast v0, Landroid/os/Bundle;

    sget-object v2, Lw8/b;->r:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_b

    sget-object v3, Lw8/b;->s:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v2}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v2

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/Bundle;

    sget-object v8, Lw8/d;->a:Ljava/lang/String;

    invoke-virtual {v4, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v8

    sget-object v9, Lw8/d;->b:Ljava/lang/String;

    invoke-virtual {v4, v9}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v9

    sget-object v10, Lw8/d;->c:Ljava/lang/String;

    invoke-virtual {v4, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v10

    sget-object v11, Lw8/d;->d:Ljava/lang/String;

    const/4 v13, -0x1

    invoke-virtual {v4, v11, v13}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v11

    sget-object v13, Lw8/d;->e:Ljava/lang/String;

    invoke-virtual {v4, v13}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eq v11, v6, :cond_9

    if-eq v11, v5, :cond_8

    const/4 v13, 0x3

    if-eq v11, v13, :cond_7

    const/4 v13, 0x4

    if-eq v11, v13, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lw8/i;

    sget-object v14, Lw8/i;->b:Ljava/lang/String;

    invoke-virtual {v4, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v11, v4}, Lw8/i;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v11, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    :cond_7
    const/4 v13, 0x4

    new-instance v4, Lw8/e;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-interface {v2, v4, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    :cond_8
    const/4 v13, 0x4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lw8/h;

    sget-object v14, Lw8/h;->d:Ljava/lang/String;

    invoke-virtual {v4, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v14

    sget-object v15, Lw8/h;->e:Ljava/lang/String;

    invoke-virtual {v4, v15}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v15

    sget-object v12, Lw8/h;->f:Ljava/lang/String;

    invoke-virtual {v4, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v11, v14, v15, v4}, Lw8/h;-><init>(III)V

    invoke-interface {v2, v11, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    goto :goto_5

    :cond_9
    const/4 v13, 0x4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v11, Lw8/g;

    sget-object v12, Lw8/g;->c:Ljava/lang/String;

    invoke-virtual {v4, v12}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Lw8/g;->d:Ljava/lang/String;

    invoke-virtual {v4, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-direct {v11, v12, v4}, Lw8/g;-><init>(Ljava/lang/String;I)V

    invoke-interface {v2, v11, v8, v9, v10}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    :goto_5
    const/4 v12, 0x0

    goto/16 :goto_4

    :cond_a
    move-object/from16 v17, v2

    goto :goto_6

    :cond_b
    const/16 v17, 0x0

    :goto_6
    sget-object v2, Lw8/b;->t:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Landroid/text/Layout$Alignment;

    if-eqz v2, :cond_c

    move-object/from16 v18, v2

    goto :goto_7

    :cond_c
    const/16 v18, 0x0

    :goto_7
    sget-object v2, Lw8/b;->u:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    check-cast v2, Landroid/text/Layout$Alignment;

    if-eqz v2, :cond_d

    move-object/from16 v19, v2

    goto :goto_8

    :cond_d
    const/16 v19, 0x0

    :goto_8
    sget-object v2, Lw8/b;->v:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    if-eqz v2, :cond_e

    move-object/from16 v20, v2

    goto :goto_9

    :cond_e
    sget-object v2, Lw8/b;->w:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v2

    if-eqz v2, :cond_f

    array-length v3, v2

    invoke-static {v2, v7, v3}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v3

    move-object/from16 v20, v3

    goto :goto_9

    :cond_f
    const/16 v20, 0x0

    :goto_9
    sget-object v2, Lw8/b;->x:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    const v4, -0x800001

    const/high16 v5, -0x80000000

    if-eqz v3, :cond_10

    sget-object v3, Lw8/b;->y:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v2

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    move/from16 v21, v2

    move/from16 v22, v3

    goto :goto_a

    :cond_10
    move/from16 v21, v4

    move/from16 v22, v5

    :goto_a
    sget-object v2, Lw8/b;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    move/from16 v23, v2

    goto :goto_b

    :cond_11
    move/from16 v23, v5

    :goto_b
    sget-object v2, Lw8/b;->A:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v2

    move/from16 v24, v2

    goto :goto_c

    :cond_12
    move/from16 v24, v4

    :goto_c
    sget-object v2, Lw8/b;->B:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    move/from16 v25, v2

    goto :goto_d

    :cond_13
    move/from16 v25, v5

    :goto_d
    sget-object v2, Lw8/b;->D:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_14

    sget-object v3, Lw8/b;->C:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v2

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v3

    move/from16 v27, v2

    move/from16 v26, v3

    goto :goto_e

    :cond_14
    move/from16 v27, v4

    move/from16 v26, v5

    :goto_e
    sget-object v2, Lw8/b;->E:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v2

    move/from16 v28, v2

    goto :goto_f

    :cond_15
    move/from16 v28, v4

    :goto_f
    sget-object v2, Lw8/b;->F:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v4

    :cond_16
    move/from16 v29, v4

    sget-object v2, Lw8/b;->G:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    :goto_10
    move/from16 v31, v2

    goto :goto_11

    :cond_17
    const/high16 v2, -0x1000000

    move v6, v7

    goto :goto_10

    :goto_11
    sget-object v2, Lw8/b;->H:Ljava/lang/String;

    invoke-virtual {v0, v2, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_18

    move/from16 v30, v7

    goto :goto_12

    :cond_18
    move/from16 v30, v6

    :goto_12
    sget-object v2, Lw8/b;->I:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    :cond_19
    move/from16 v32, v5

    sget-object v2, Lw8/b;->J:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    :goto_13
    move/from16 v33, v0

    goto :goto_14

    :cond_1a
    const/4 v0, 0x0

    goto :goto_13

    :goto_14
    new-instance v16, Lw8/b;

    invoke-direct/range {v16 .. v33}, Lw8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    return-object v16

    :sswitch_1
    move-object/from16 v0, p1

    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"

    new-array v3, v7, [Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_15
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-static {}, Lgm/i;->a()La33/d;

    move-result-object v3

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, La33/d;->Q(Ljava/lang/String;)V

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Lqm/a;->b(I)Ldm/d;

    move-result-object v4

    iput-object v4, v3, La33/d;->z:Ljava/lang/Object;

    const/4 v13, 0x3

    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1b

    const/4 v4, 0x0

    goto :goto_16

    :cond_1b
    invoke-static {v4, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    :goto_16
    iput-object v4, v3, La33/d;->y:Ljava/lang/Object;

    invoke-virtual {v3}, La33/d;->d()Lgm/i;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_15

    :cond_1c
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0

    :sswitch_2
    move-object/from16 v0, p1

    check-cast v0, Lna/o;

    return-object v0

    :sswitch_3
    move-object/from16 v0, p1

    check-cast v0, Lqa/a;

    iget-wide v2, v0, Lqa/a;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :sswitch_4
    move-object/from16 v0, p1

    check-cast v0, Lqa/a;

    iget-wide v2, v0, Lqa/a;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_4
        0xf -> :sswitch_3
        0x10 -> :sswitch_2
        0x12 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Llive/hms/video/factories/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/whoop/service/network/model/SportList;

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Lcom/whoop/service/network/model/SportList;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_0
    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
    .end packed-switch
.end method

.method public d()[Lt9/n;
    .locals 5

    iget v0, p0, Llive/hms/video/factories/c;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Loa/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-array v2, v2, [Lt9/n;

    aput-object v0, v2, v1

    return-object v2

    :pswitch_0
    new-instance v0, Lna/k;

    sget-object v3, Lqa/j;->p:Lng3/o;

    const/16 v4, 0x10

    invoke-direct {v0, v3, v4}, Lna/k;-><init>(Lqa/j;I)V

    new-array v2, v2, [Lt9/n;

    aput-object v0, v2, v1

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public e(Landroid/os/Bundle;)Lrm/f;
    .locals 6

    new-instance v0, Lmo/b;

    const/4 v1, 0x0

    const/16 v2, 0x24

    invoke-static {v1, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v1

    const/4 v3, -0x1

    invoke-virtual {p1, v1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v4, 0x1

    invoke-static {v4, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, 0x2

    invoke-static {v5, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    const/4 v5, 0x3

    invoke-static {v5, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v0, v1, v4, v3, p1}, Lmo/b;-><init>(III[B)V

    return-object v0
.end method

.method public f(Lor/h;I)V
    .locals 0

    invoke-static {p1, p2}, Lpq0/e;->M(Lor/h;I)V

    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 4

    sget v0, Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;->z:I

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x87

    iget-object v1, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v1, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    const-string v1, "getInsets(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, v0, Lv4/b;->a:I

    iget v2, v0, Lv4/b;->b:I

    iget v3, v0, Lv4/b;->c:I

    iget v0, v0, Lv4/b;->d:I

    invoke-virtual {p1, v1, v2, v3, v0}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method public onLogMessage(Ljava/lang/String;Lhms/webrtc/Logging$Severity;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2, p3}, Llive/hms/video/factories/HMSPeerConnectionFactory;->a(Ljava/lang/String;Lhms/webrtc/Logging$Severity;Ljava/lang/String;)V

    return-void
.end method

.method public onRelease(Lorg/webrtc/EglThread;)Z
    .locals 0

    invoke-static {p1}, Lorg/webrtc/EglThread;->b(Lorg/webrtc/EglThread;)Z

    move-result p1

    return p1
.end method

.method public onResult(Ln23/h;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public q(Lcg/o;)Lpf/r;
    .locals 0

    sget-object p1, Lpf/p;->a:Lpf/p;

    return-object p1
.end method
