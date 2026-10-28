.class public final synthetic Li;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Li;->w:I

    iput-object p2, p0, Li;->x:Ljava/lang/Object;

    iput-object p3, p0, Li;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    iget v0, p0, Li;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lds1/k;

    invoke-static {v0, v1}, Lbs1/c0;->D(Lkotlin/jvm/functions/Function1;Lds1/k;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lc93/o;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lds1/f;

    invoke-static {v0, v1}, Lbs1/c0;->a(Lc93/o;Lds1/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lhv1/a;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lbm2/z0;->w(Lhv1/a;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-static {v0, v1}, Lbm2/e0;->i(Lorg/joda/time/DateTime;Lp1/c1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lbm2/i0;

    invoke-static {v0, v1}, Lbm2/e;->b(Lkotlin/jvm/functions/Function1;Lbm2/i0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lbm0/m;

    invoke-static {v0, v1}, Lbm0/l;->a(Lkotlin/jvm/functions/Function1;Lbm0/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/straphistorysync/sync/e;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/whoop/straphistorysync/sync/e;->c(Lcom/whoop/straphistorysync/sync/e;Ljava/lang/String;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lze0/a;

    invoke-static {v0, v1}, Lbf0/k;->m(Lkotlin/jvm/functions/Function1;Lze0/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lmf/t;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IMDS error: statusCode="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast v1, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    invoke-virtual {v1}, Laws/smithy/kotlin/runtime/ServiceException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lb90/g;

    invoke-static {v0, v1}, Lb90/f;->j(Lkotlin/jvm/functions/Function1;Lb90/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lb31/c;

    invoke-static {v0, v1}, Lb31/b;->c(Lkotlin/jvm/functions/Function1;Lb31/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lb30/y0;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v2}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Lb30/f6;->a:Lb30/f6;

    invoke-virtual {v1, v0}, Lb30/y0;->c(Ltx/f;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_b
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lt20/n;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v0, v0, Lt20/n;->t:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_c
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Le30/c;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lv00/c0;

    invoke-static {v0, v1}, Lug/m;->r(Le30/c;Lv00/c0;)Lb30/j0;

    move-result-object v1

    iget-object v0, v0, Le30/c;->M:Lr20/d;

    new-instance v2, Lr20/f;

    invoke-direct {v2, v1}, Lr20/f;-><init>(Lb30/j0;)V

    invoke-virtual {v0, v2}, Lr20/d;->e(Lr20/s;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lb30/j0;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    new-instance v2, Lb30/e;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb30/b;

    iget-object v1, v1, Lb30/b;->a:Ljava/lang/String;

    invoke-direct {v2, v1}, Lb30/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lb30/j0;->a(Ls2/e;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_e
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lb11/h;

    invoke-static {v0, v1}, Lb11/a;->c(Lkotlin/jvm/functions/Function1;Lb11/h;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lb01/j;

    invoke-static {v0, v1}, Lb01/p;->m(Lkotlin/jvm/functions/Function1;Lb01/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lb01/c;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lb01/b;->a(Lb01/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    invoke-static {v0, v1}, Laz1/n;->p(Lkotlin/jvm/functions/Function1;Leb/u0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lzt1/b;

    invoke-static {v0, v1}, Lau1/h;->a(Lkotlin/jvm/functions/Function1;Lzt1/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lcm2/a0;

    invoke-static {v0, v1}, Lam2/o0;->s(Lkotlin/jvm/functions/Function1;Lcm2/a0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lcm2/l;

    invoke-static {v0, v1}, Lam2/w;->s(Lkotlin/jvm/functions/Function1;Lcm2/l;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/design/models/modal/ToastActionButton;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, La81/r;->e(Lcom/whoop/design/models/modal/ToastActionButton;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, La61/e;

    invoke-static {v0, v1}, La61/c;->g(Lkotlin/jvm/functions/Function1;La61/e;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    return-object v0

    :pswitch_18
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoMemberViewModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;

    return-object v0

    :pswitch_19
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewController;

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, La2/c;

    iget-object v0, v0, La2/c;->w:Lp1/q;

    iget-object v1, v0, Lp1/q;->c:Lp1/f2;

    iget-boolean v2, v0, Lp1/q;->C:Z

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-nez v2, :cond_1

    goto/16 :goto_d

    :cond_1
    invoke-virtual {v1}, Lp1/f2;->d()Lp1/e2;

    move-result-object v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    :try_start_0
    iget v6, v1, Lp1/f2;->x:I

    const/4 v7, 0x0

    if-ge v5, v6, :cond_c

    invoke-virtual {v2, v5}, Lp1/e2;->l(I)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v8, 0x1

    iget-object v9, p0, Li;->y:Ljava/lang/Object;

    if-eqz v6, :cond_6

    :try_start_1
    invoke-virtual {v2, v5}, Lp1/e2;->n(I)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v9, :cond_5

    instance-of v10, v6, Lp1/a2;

    if-eqz v10, :cond_2

    check-cast v6, Lp1/a2;

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    if-eqz v6, :cond_3

    iget-object v6, v6, Lp1/a2;->a:Lp1/z1;

    goto :goto_2

    :cond_3
    move-object v6, v7

    :goto_2
    if-ne v6, v9, :cond_4

    goto :goto_3

    :cond_4
    move v6, v4

    goto :goto_4

    :cond_5
    :goto_3
    move v6, v8

    :goto_4
    if-eqz v6, :cond_6

    new-instance v4, La2/h;

    invoke-direct {v4, v5, v7}, La2/h;-><init>(ILjava/lang/Integer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Lp1/e2;->c()V

    move-object v7, v4

    goto :goto_b

    :catchall_0
    move-exception v0

    goto/16 :goto_e

    :cond_6
    :try_start_2
    iget-object v6, v2, Lp1/e2;->b:[I

    invoke-static {v6, v5}, Lp1/h2;->c([II)I

    move-result v10

    add-int/lit8 v11, v5, 0x1

    iget v12, v2, Lp1/e2;->c:I

    if-ge v11, v12, :cond_7

    mul-int/lit8 v12, v11, 0x5

    add-int/lit8 v12, v12, 0x4

    aget v6, v6, v12

    goto :goto_5

    :cond_7
    iget v6, v2, Lp1/e2;->e:I

    :goto_5
    sub-int/2addr v6, v10

    move v10, v4

    :goto_6
    if-ge v10, v6, :cond_e

    invoke-virtual {v2, v5, v10}, Lp1/e2;->h(II)Ljava/lang/Object;

    move-result-object v12

    if-eq v12, v9, :cond_b

    instance-of v13, v12, Lp1/a2;

    if-eqz v13, :cond_8

    check-cast v12, Lp1/a2;

    goto :goto_7

    :cond_8
    move-object v12, v7

    :goto_7
    if-eqz v12, :cond_9

    iget-object v12, v12, Lp1/a2;->a:Lp1/z1;

    goto :goto_8

    :cond_9
    move-object v12, v7

    :goto_8
    if-ne v12, v9, :cond_a

    goto :goto_9

    :cond_a
    move v12, v4

    goto :goto_a

    :cond_b
    :goto_9
    move v12, v8

    :goto_a
    if-eqz v12, :cond_d

    new-instance v7, La2/h;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v7, v5, v4}, La2/h;-><init>(ILjava/lang/Integer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_c
    invoke-virtual {v2}, Lp1/e2;->c()V

    goto :goto_b

    :cond_d
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_e
    move v5, v11

    goto :goto_0

    :goto_b
    if-eqz v7, :cond_10

    iget v2, v7, La2/h;->a:I

    iget-object v4, v7, La2/h;->b:Ljava/lang/Integer;

    iget-boolean v5, v0, Lp1/q;->C:Z

    if-nez v5, :cond_f

    goto :goto_c

    :cond_f
    invoke-virtual {v1}, Lp1/f2;->d()Lp1/e2;

    move-result-object v1

    :try_start_3
    invoke-static {v1, v2, v4}, Lce/w;->j0(Lp1/e2;ILjava/lang/Integer;)Ljava/util/ArrayList;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v1}, Lp1/e2;->c()V

    :goto_c
    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v0}, Lp1/q;->K()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v3, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    goto :goto_d

    :catchall_1
    move-exception v0

    invoke-virtual {v1}, Lp1/e2;->c()V

    throw v0

    :cond_10
    :goto_d
    return-object v3

    :goto_e
    invoke-virtual {v2}, Lp1/e2;->c()V

    throw v0

    :pswitch_1b
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/util/TextResource;

    new-instance v2, Lpv0/b$c;

    invoke-static {v1}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lpv0/b$c;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Li;->x:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget-object v1, p0, Li;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v2

    iget-object v2, v2, Ln0/n;->k:Ljava/lang/Object;

    invoke-static {v2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/g;

    if-eqz v2, :cond_11

    if-eqz v1, :cond_11

    check-cast v2, Ln0/o;

    iget v1, v2, Ln0/o;->a:I

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v2

    iget v2, v2, Ln0/n;->n:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    if-lt v1, v2, :cond_11

    invoke-virtual {v0}, Ln0/u;->h()Ln0/n;

    move-result-object v0

    iget v0, v0, Ln0/n;->n:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_11

    goto :goto_f

    :cond_11
    const/4 v3, 0x0

    :goto_f
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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
