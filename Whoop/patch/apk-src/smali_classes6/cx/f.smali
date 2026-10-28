.class public final Lcx/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Lcx/j;


# direct methods
.method public synthetic constructor <init>(ZLcx/j;I)V
    .locals 0

    iput p3, p0, Lcx/f;->w:I

    iput-boolean p1, p0, Lcx/f;->x:Z

    iput-object p2, p0, Lcx/f;->y:Lcx/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcx/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lcx/f;->x:Z

    const/4 v1, 0x0

    const-string v2, "task"

    const-string v3, "android.permission.BODY_SENSORS_BACKGROUND"

    const-string v4, "pb"

    iget-object v5, p0, Lcx/f;->y:Lcx/j;

    if-eqz v0, :cond_4

    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, v5, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_0

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto/16 :goto_3

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-virtual {v5, v3}, Landroidx/fragment/app/m0;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    iget-object v6, v5, Lcx/j;->x:Lcx/k;

    if-eqz v6, :cond_e

    iget-object v7, v6, Lcx/k;->m:Lax/a;

    if-nez v7, :cond_5

    goto :goto_0

    :cond_5
    if-eqz v0, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v5, Lcx/j;->x:Lcx/k;

    if-eqz v3, :cond_7

    iget-object v3, v3, Lcx/k;->m:Lax/a;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v5, Lcx/j;->y:Lcx/b;

    if-eqz v6, :cond_6

    check-cast v6, Lcx/a;

    iget-object v6, v6, Lcx/a;->c:Lcx/c;

    invoke-interface {v3, v6, v0}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_0
    iget-object v6, v6, Lcx/k;->n:Lax/b;

    if-eqz v6, :cond_c

    if-nez v0, :cond_c

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v5, Lcx/j;->x:Lcx/k;

    if-eqz v3, :cond_b

    iget-object v3, v3, Lcx/k;->n:Lax/b;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v5, Lcx/j;->y:Lcx/b;

    if-eqz v6, :cond_a

    check-cast v6, Lcx/a;

    iget-object v6, v6, Lcx/a;->d:Lcx/d;

    invoke-interface {v3, v6, v0}, Lax/b;->e(Lcx/d;Ljava/util/ArrayList;)V

    :goto_1
    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_b
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_c
    :goto_2
    iget-object v0, v5, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_d

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-boolean v0, p0, Lcx/f;->x:Z

    const/4 v1, 0x0

    const-string v2, "task"

    const-string v3, "android.permission.ACCESS_BACKGROUND_LOCATION"

    const-string v4, "pb"

    iget-object v5, p0, Lcx/f;->y:Lcx/j;

    if-eqz v0, :cond_13

    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_12

    iget-object v0, v0, Lcx/k;->f:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_11

    iget-object v0, v0, Lcx/k;->g:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_10

    iget-object v0, v0, Lcx/k;->h:Ljava/util/LinkedHashSet;

    invoke-interface {v0, v3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, v5, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_f

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    goto/16 :goto_7

    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_12
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_13
    invoke-virtual {v5, v3}, Landroidx/fragment/app/m0;->shouldShowRequestPermissionRationale(Ljava/lang/String;)Z

    move-result v0

    iget-object v6, v5, Lcx/j;->x:Lcx/k;

    if-eqz v6, :cond_1d

    iget-object v7, v6, Lcx/k;->m:Lax/a;

    if-nez v7, :cond_14

    goto :goto_4

    :cond_14
    if-eqz v0, :cond_17

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v5, Lcx/j;->x:Lcx/k;

    if-eqz v3, :cond_16

    iget-object v3, v3, Lcx/k;->m:Lax/a;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v5, Lcx/j;->y:Lcx/b;

    if-eqz v6, :cond_15

    check-cast v6, Lcx/a;

    iget-object v6, v6, Lcx/a;->c:Lcx/c;

    invoke-interface {v3, v6, v0}, Lax/a;->a(Lcx/c;Ljava/util/List;)V

    goto :goto_5

    :cond_15
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_16
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_17
    :goto_4
    iget-object v6, v6, Lcx/k;->n:Lax/b;

    if-eqz v6, :cond_1b

    if-nez v0, :cond_1b

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v5, Lcx/j;->x:Lcx/k;

    if-eqz v3, :cond_1a

    iget-object v3, v3, Lcx/k;->n:Lax/b;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v6, v5, Lcx/j;->y:Lcx/b;

    if-eqz v6, :cond_19

    check-cast v6, Lcx/a;

    iget-object v6, v6, Lcx/a;->d:Lcx/d;

    invoke-interface {v3, v6, v0}, Lax/b;->e(Lcx/d;Ljava/util/ArrayList;)V

    :goto_5
    iget-object v0, v5, Lcx/j;->x:Lcx/k;

    if-eqz v0, :cond_18

    goto :goto_6

    :cond_18
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_19
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1a
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1b
    :goto_6
    iget-object v0, v5, Lcx/j;->y:Lcx/b;

    if-eqz v0, :cond_1c

    check-cast v0, Lcx/a;

    invoke-virtual {v0}, Lcx/a;->a()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_1c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1d
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
