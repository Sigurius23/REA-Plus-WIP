.class public final Le73/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz63/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Le73/a;->a:I

    iput-object p1, p0, Le73/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/f;Laf3/t;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Le73/a;->a:I

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p2

    check-cast v2, Laf3/a0;

    iget-object v2, v2, Laf3/a0;->g:Ljava/lang/String;

    iget-object v3, v1, Lq/f;->z:Ljava/lang/Object;

    check-cast v3, Lz63/h;

    iget-object v4, v1, Lq/f;->x:Ljava/lang/Object;

    check-cast v4, Lb30/m;

    iget-object v5, v3, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Le73/a;->b:Ljava/lang/Object;

    check-cast v5, La73/b;

    iget-object v5, v5, La73/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v1}, Lq/f;->w0()I

    move-result v6

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li73/a;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v4, Lb30/m;->F:Ljava/lang/Object;

    check-cast v8, Lo20/a;

    const-class v9, Laf3/p;

    iget-object v8, v8, Lo20/a;->a:Ljava/util/Map;

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz63/e;

    if-nez v8, :cond_1

    :cond_0
    move-object/from16 p2, v2

    goto :goto_2

    :cond_1
    new-instance v9, Landroid/text/SpannableStringBuilder;

    invoke-direct {v9, v2}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    invoke-static {v9, v7}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v9}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v7

    const-class v10, Landroid/text/style/URLSpan;

    const/4 v11, 0x0

    invoke-virtual {v9, v11, v7, v10}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [Landroid/text/style/URLSpan;

    if-eqz v7, :cond_0

    array-length v10, v7

    if-lez v10, :cond_0

    iget-object v10, v1, Lq/f;->y:Ljava/lang/Object;

    check-cast v10, Lg9/k;

    array-length v12, v7

    :goto_1
    if-ge v11, v12, :cond_0

    aget-object v13, v7, v11

    sget-object v14, La73/d;->e:Lz63/c;

    invoke-virtual {v13}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v10, v15}, Lz63/c;->b(Lg9/k;Ljava/lang/Object;)V

    invoke-interface {v8, v4, v10}, Lz63/e;->a(Lb30/m;Lg9/k;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v9, v13}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v6

    invoke-virtual {v9, v13}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v6

    move-object/from16 p2, v2

    iget-object v2, v3, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-le v13, v15, :cond_2

    if-ltz v15, :cond_2

    if-gt v13, v2, :cond_2

    invoke-static {v3, v14, v15, v13}, Lz63/h;->c(Lz63/h;Ljava/lang/Object;II)V

    :cond_2
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, p2

    goto :goto_1

    :goto_2
    move-object/from16 v2, p2

    goto :goto_0

    :cond_3
    return-void

    :pswitch_0
    move-object/from16 v2, p2

    check-cast v2, Lve3/b;

    invoke-virtual {v1, v2}, Lq/f;->V0(Laf3/t;)V

    iget-object v1, v0, Le73/a;->b:Ljava/lang/Object;

    check-cast v1, Le73/b;

    const/4 v2, 0x0

    iput v2, v1, Le73/b;->d:I

    return-void

    :pswitch_1
    move-object/from16 v2, p2

    check-cast v2, Lve3/f;

    iget-object v3, v0, Le73/a;->b:Ljava/lang/Object;

    check-cast v3, Le73/b;

    invoke-static {v3, v1, v2}, Le73/b;->e(Le73/b;Lq/f;Laf3/f;)V

    return-void

    :pswitch_2
    move-object/from16 v2, p2

    check-cast v2, Lve3/e;

    iget-object v3, v0, Le73/a;->b:Ljava/lang/Object;

    check-cast v3, Le73/b;

    invoke-static {v3, v1, v2}, Le73/b;->e(Le73/b;Lq/f;Laf3/f;)V

    return-void

    :pswitch_3
    move-object/from16 v2, p2

    check-cast v2, Lve3/d;

    invoke-virtual {v1}, Lq/f;->w0()I

    move-result v3

    invoke-virtual {v1, v2}, Lq/f;->V0(Laf3/t;)V

    iget-object v4, v0, Le73/a;->b:Ljava/lang/Object;

    check-cast v4, Le73/b;

    iget-object v5, v4, Le73/b;->c:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    const/4 v6, 0x2

    if-nez v5, :cond_4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v5, v4, Le73/b;->c:Ljava/lang/Object;

    :cond_4
    iget-object v5, v4, Le73/b;->c:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    new-instance v7, Le73/d;

    iget-object v8, v2, Lve3/d;->h:Lve3/c;

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    const/4 v9, 0x1

    if-eq v8, v9, :cond_5

    if-eq v8, v6, :cond_7

    goto :goto_3

    :cond_5
    move v6, v9

    goto :goto_4

    :cond_6
    :goto_3
    const/4 v6, 0x0

    :cond_7
    :goto_4
    iget-object v1, v1, Lq/f;->z:Ljava/lang/Object;

    check-cast v1, Lz63/h;

    iget-object v8, v1, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v9

    new-instance v10, Lz63/g;

    invoke-virtual {v8, v3, v9}, Ljava/lang/StringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v11

    invoke-direct {v10, v11}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    iget-object v1, v1, Lz63/h;->x:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lz63/f;

    if-eqz v11, :cond_9

    iget v12, v11, Lz63/f;->b:I

    if-lt v12, v3, :cond_8

    iget v13, v11, Lz63/f;->c:I

    if-gt v13, v9, :cond_8

    iget-object v11, v11, Lz63/f;->a:Ljava/lang/Object;

    sub-int/2addr v12, v3

    sub-int/2addr v13, v3

    const/16 v14, 0x21

    invoke-virtual {v10, v11, v12, v13, v14}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    :cond_9
    const-string v1, ""

    invoke-virtual {v8, v3, v9, v1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {v7, v6, v10}, Le73/d;-><init>(ILz63/g;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v1, v2, Lve3/d;->g:Z

    iput-boolean v1, v4, Le73/b;->b:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
