.class public final Ld0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p6, p0, Ld0;->w:I

    iput-object p1, p0, Ld0;->x:Ljava/lang/Object;

    iput-object p2, p0, Ld0;->y:Ljava/lang/Object;

    iput-object p3, p0, Ld0;->z:Ljava/lang/Object;

    iput-object p4, p0, Ld0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p5, p0, Ld0;->w:I

    iput-object p1, p0, Ld0;->y:Ljava/lang/Object;

    iput-object p2, p0, Ld0;->z:Ljava/lang/Object;

    iput-object p3, p0, Ld0;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Ld0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ll83/k;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/util/List;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lfk/a;

    const/16 v7, 0xa

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v1

    :pswitch_0
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lqi/i;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/content/Context;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    const/16 v8, 0x9

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_1
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p2, p0, Ld0;->y:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lu2/v;

    iget-object p2, p0, Ld0;->z:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lu0/d1;

    iget-object p2, p0, Ld0;->E:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lf1/s1;

    move-object v6, v7

    const/16 v7, 0x8

    invoke-direct/range {v2 .. v7}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Ld0;->x:Ljava/lang/Object;

    return-object v2

    :pswitch_2
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lt20/w;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lt20/n;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lp1/c1;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lp1/c1;

    const/4 v8, 0x7

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_3
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p2, p0, Ld0;->y:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lq30/w0;

    iget-object p2, p0, Ld0;->z:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    iget-object p2, p0, Ld0;->E:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    move-object v6, v7

    const/4 v7, 0x6

    invoke-direct/range {v2 .. v7}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Ld0;->x:Ljava/lang/Object;

    return-object v2

    :pswitch_4
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lbc3/c0;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lmj/p;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lp1/c1;

    const/4 v8, 0x5

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_5
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lnk/m;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/util/ArrayList;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ljava/util/ArrayList;

    const/4 v8, 0x4

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_6
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lq0/b;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lp1/a1;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lcom/amplitude/android/engagement/a;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lcom/amplitude/android/engagement/types/Nudge;

    const/4 v8, 0x3

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_7
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lmj/a;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lbc3/c0;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lq0/b;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lp1/a1;

    const/4 v8, 0x2

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_8
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p1, p0, Ld0;->x:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lio/ktor/utils/io/q;

    iget-object p1, p0, Ld0;->y:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/nio/charset/Charset;

    iget-object p1, p0, Ld0;->z:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ll63/b;

    iget-object p1, p0, Ld0;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ls63/a;

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    return-object v2

    :pswitch_9
    move-object v7, p2

    new-instance v2, Ld0;

    iget-object p2, p0, Ld0;->y:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Le0;

    iget-object p2, p0, Ld0;->z:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lp1/z0;

    iget-object p2, p0, Ld0;->E:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lp1/z0;

    move-object v6, v7

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v2, Ld0;->x:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ld0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_5
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_6
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_7
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_8
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0, p1, p2}, Ld0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ld0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, Ld0;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    iget-object v8, v1, Ld0;->E:Ljava/lang/Object;

    iget-object v9, v1, Ld0;->z:Ljava/lang/Object;

    iget-object v10, v1, Ld0;->y:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    check-cast v10, Ll83/k;

    check-cast v9, Ljava/util/List;

    check-cast v8, Lfk/a;

    invoke-static {v0, v10, v9, v8}, Lxj/a;->a(Landroid/view/View;Ll83/k;Ljava/util/List;Lfk/a;)Lxj/b;

    move-result-object v0

    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lqi/i;

    iget-object v0, v0, Lqi/i;->f:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwi/c;

    move-object v11, v10

    check-cast v11, Landroid/content/Context;

    const-string v12, "font"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v9

    check-cast v12, Ljava/lang/String;

    move-object v13, v8

    check-cast v13, Ljava/lang/String;

    invoke-static {v12}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    iget-object v14, v4, Lwi/c;->a:Ljava/lang/String;

    invoke-static {v14, v13, v12}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v12

    :try_start_0
    invoke-virtual {v11}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v11

    invoke-static {v11, v12}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v12, "typefaceWithDefaultStyle"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v4, Lwi/c;->c:Ljava/lang/String;

    const-string v13, "font.style"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "Italic"

    invoke-static {v12, v13, v6}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v13

    const-string v14, "Bold"

    invoke-static {v12, v14, v6}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v12

    if-eqz v13, :cond_0

    if-eqz v12, :cond_0

    move v12, v3

    goto :goto_1

    :cond_0
    if-eqz v13, :cond_1

    move v12, v2

    goto :goto_1

    :cond_1
    if-eqz v12, :cond_2

    move v12, v5

    goto :goto_1

    :cond_2
    move v12, v6

    :goto_1
    invoke-virtual {v11}, Landroid/graphics/Typeface;->getStyle()I

    move-result v13

    if-ne v13, v12, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v11, v12}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v11

    :goto_2
    iput-object v11, v4, Lwi/c;->d:Landroid/graphics/Typeface;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    sget-object v4, Ldj/c;->a:Ldj/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :catch_1
    sget-object v4, Ldj/c;->a:Ldj/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_4
    return-object v7

    :pswitch_1
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v2, Lbc3/d0;->z:Lbc3/d0;

    new-instance v3, Lu0/c0;

    check-cast v10, Lu2/v;

    check-cast v9, Lu0/d1;

    invoke-direct {v3, v10, v9, v4, v6}, Lu0/c0;-><init>(Lu2/v;Lu0/d1;Lq83/d;I)V

    invoke-static {v0, v4, v2, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v3, Ls40/c0;

    check-cast v8, Lf1/s1;

    const/16 v6, 0xd

    invoke-direct {v3, v10, v8, v4, v6}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v4, v2, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v7

    :pswitch_2
    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Lt20/w;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v9, Lp1/c1;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt20/g;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt20/g;

    iget-boolean v3, v2, Lt20/g;->y:Z

    if-eqz v3, :cond_5

    iget-object v2, v2, Lt20/g;->z:Lt20/b;

    if-nez v2, :cond_5

    move v2, v5

    goto :goto_3

    :cond_5
    move v2, v6

    :goto_3
    xor-int/2addr v2, v5

    check-cast v8, Lp1/c1;

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lt20/g;

    iget-boolean v8, v3, Lt20/g;->y:Z

    if-eqz v8, :cond_7

    iget-object v3, v3, Lt20/g;->z:Lt20/b;

    if-nez v3, :cond_7

    :cond_6
    move v5, v6

    :cond_7
    new-instance v21, Lp00/j;

    const/16 v17, 0x0

    const/16 v18, 0x12

    const/4 v12, 0x0

    const-class v14, Lt20/w;

    const-string v15, "handlePrimaryButtonClick"

    const-string v16, "handlePrimaryButtonClick()V"

    move-object/from16 v11, v21

    invoke-direct/range {v11 .. v18}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v17, Lp00/j;

    move-object/from16 v11, v17

    const/16 v17, 0x0

    const/16 v18, 0x13

    const-class v14, Lt20/w;

    const-string v15, "validate"

    const-string v16, "validate()V"

    invoke-direct/range {v11 .. v18}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    check-cast v10, Lt20/n;

    const-string v3, "<this>"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v10, Lt20/n;->q:Lkotlin/jvm/functions/Function1;

    const-string v8, "screenState"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v0, Lt20/g;->z:Lt20/b;

    iget-object v0, v0, Lt20/g;->E:Lzy/c;

    if-eqz v0, :cond_8

    iget-object v9, v10, Lt20/n;->s:Lkotlin/jvm/functions/Function1;

    invoke-interface {v9, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    if-nez v8, :cond_9

    new-array v0, v6, [Ljava/lang/Object;

    sget-object v6, Lm83/y;->w:Lm83/y;

    const v9, 0x7f140feb

    invoke-static {v9, v0, v6}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v15

    iget-boolean v0, v10, Lt20/n;->f:Z

    new-instance v14, Lbs2/b;

    move/from16 v20, v0

    move/from16 v16, v2

    move/from16 v18, v5

    move-object/from16 v19, v10

    move-object/from16 v17, v11

    invoke-direct/range {v14 .. v21}, Lbs2/b;-><init>(Lzy/b;ZLp00/j;ZLt20/n;ZLp00/j;)V

    invoke-interface {v3, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_9
    new-instance v0, Lsz0/k;

    const/16 v2, 0x12

    invoke-direct {v0, v2}, Lsz0/k;-><init>(I)V

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    iget-object v0, v10, Lt20/n;->o:Lc93/m;

    if-eqz v8, :cond_a

    iget-object v4, v8, Lt20/b;->F:Lzy/c;

    :cond_a
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v4, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v7

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v10, Lq30/w0;

    check-cast v9, Ljava/lang/String;

    check-cast v8, Ljava/lang/String;

    :try_start_2
    invoke-static {v10, v9, v8}, Lq30/w0;->a(Lq30/w0;Ljava/lang/String;Ljava/lang/String;)Lq30/h0;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v3, v10, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v3, Ln30/d;

    check-cast v3, Ln30/c;

    invoke-virtual {v3, v2}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_b
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_c

    return-object v0

    :cond_c
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {v0, v2}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    move-object v12, v10

    check-cast v12, Ljava/lang/String;

    move-object v13, v9

    check-cast v13, Lmj/p;

    move-object v14, v8

    check-cast v14, Lp1/c1;

    new-instance v11, Lp33/m;

    const/16 v16, 0x3

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v16}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v15, v15, v11, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v7

    :pswitch_5
    check-cast v10, Ljava/lang/String;

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lnk/m;

    iget-object v3, v0, Lnk/m;->e:Lfk/a;

    if-eqz v3, :cond_d

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "--> remove file: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v5, "-"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x6

    invoke-static {v10, v5, v6}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v5

    invoke-static {v2, v5}, Lm83/s;->x1(ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", dropped events: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", retry events: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_d
    iget-object v0, v0, Lnk/m;->a:Ldk/f;

    invoke-virtual {v0, v10}, Ldk/f;->i(Ljava/lang/String;)V

    return-object v7

    :pswitch_6
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lq0/b;

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v2

    check-cast v10, Lp1/a1;

    check-cast v10, Lp1/h1;

    invoke-virtual {v10}, Lp1/h1;->x()I

    move-result v3

    if-eq v2, v3, :cond_e

    check-cast v9, Lcom/amplitude/android/engagement/a;

    check-cast v8, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v2

    new-instance v3, Lcom/amplitude/android/engagement/types/GoToNudgeStepAction;

    invoke-direct {v3, v2}, Lcom/amplitude/android/engagement/types/GoToNudgeStepAction;-><init>(I)V

    invoke-virtual {v8}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    new-instance v11, Lcom/amplitude/android/engagement/types/ButtonMeta;

    const/16 v17, 0x1f

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Lcom/amplitude/android/engagement/types/ButtonMeta;-><init>(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v2, v3, v11}, Lcom/amplitude/android/engagement/a;->c(ILcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonMeta;)V

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v0

    invoke-virtual {v10, v0}, Lp1/h1;->y(I)V

    :cond_e
    return-object v7

    :pswitch_7
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lmj/a;

    new-instance v2, Lb4/g;

    check-cast v10, Lbc3/c0;

    check-cast v9, Lq0/b;

    check-cast v8, Lp1/a1;

    const/4 v3, 0x7

    invoke-direct {v2, v10, v9, v8, v3}, Lb4/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v2, v0, Lmj/a;->a:Lb4/g;

    return-object v7

    :pswitch_8
    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v2, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/q;

    invoke-static {v4, v2}, Lio/ktor/utils/io/jvm/javaio/d;->a(Lbc3/k1;Lio/ktor/utils/io/q;)Lio/ktor/utils/io/jvm/javaio/h;

    move-result-object v2

    check-cast v10, Ljava/nio/charset/Charset;

    invoke-direct {v0, v2, v10}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast v9, Ll63/b;

    iget-object v2, v9, Ll63/b;->a:Lcom/google/gson/Gson;

    check-cast v8, Ls63/a;

    iget-object v3, v8, Ls63/a;->b:Ljava/lang/reflect/Type;

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_9
    check-cast v8, Lp1/z0;

    check-cast v9, Lp1/z0;

    iget-object v0, v1, Ld0;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v10, Le0;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lc0;

    invoke-direct {v2, v10, v9, v4, v6}, Lc0;-><init>(Le0;Lp1/z0;Lq83/d;I)V

    invoke-static {v0, v4, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v2, Lc0;

    invoke-direct {v2, v10, v8, v4, v5}, Lc0;-><init>(Le0;Lp1/z0;Lq83/d;I)V

    invoke-static {v0, v4, v4, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v7

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
