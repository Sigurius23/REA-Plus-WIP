.class public final Ldk/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Lgj/d;

.field public final c:Ldk/f;

.field public final d:Lp0/n0;

.field public final e:Ldk/f;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lgj/d;Lgj/g;I)V
    .locals 11

    iput p3, p0, Ldk/b;->a:I

    packed-switch p3, :pswitch_data_0

    const-string p3, "configuration"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk/b;->b:Lgj/d;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ldk/b;->f:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "amplitude-android-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p2, Lgj/g;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "amplitude-disk-queue"

    invoke-virtual {p0, p2, v2, v0}, Ldk/b;->a(Lgj/g;Ljava/lang/String;Ljava/lang/String;)Ldk/f;

    move-result-object v0

    iput-object v0, p0, Ldk/b;->c:Ldk/f;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "amplitude-identify-intercept-"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "amplitude-identify-intercept-disk-queue"

    invoke-virtual {p0, p2, v1, v0}, Ldk/b;->a(Lgj/g;Ljava/lang/String;Ljava/lang/String;)Ldk/f;

    move-result-object v0

    iput-object v0, p0, Ldk/b;->e:Ldk/f;

    iget-object v0, p2, Lgj/g;->b:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "amplitude-kotlin-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p2, Lgj/g;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v8

    iget-object v5, p2, Lgj/g;->e:Ljava/lang/String;

    iget-object v6, p2, Lgj/g;->a:Ljava/lang/String;

    iget-object v7, p2, Lgj/g;->n:Ljc/a;

    iget-object p2, p2, Lgj/g;->g:Lbu/c;

    invoke-virtual {p2, p1}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v10

    const-string p1, "amplitude-identity-"

    invoke-static {p1, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v4, Lqk/b;

    const-string p1, "storageDirectory"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v4 .. v10}, Lqk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljc/a;Ljava/io/File;Ljava/lang/String;Lfk/a;)V

    invoke-virtual {p3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lp0/n0;

    invoke-direct {p1, v4}, Lp0/n0;-><init>(Lqk/b;)V

    iput-object p1, p0, Ldk/b;->d:Lp0/n0;

    return-void

    :pswitch_0
    const-string p3, "configuration"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldk/b;->b:Lgj/d;

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Ldk/b;->f:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "amplitude-android-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p2, Lgj/g;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "amplitude-disk-queue"

    invoke-virtual {p0, p2, v2, v0}, Ldk/b;->a(Lgj/g;Ljava/lang/String;Ljava/lang/String;)Ldk/f;

    move-result-object v0

    iput-object v0, p0, Ldk/b;->c:Ldk/f;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "amplitude-identify-intercept-"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "amplitude-identify-intercept-disk-queue"

    invoke-virtual {p0, p2, v2, v0}, Ldk/b;->a(Lgj/g;Ljava/lang/String;Ljava/lang/String;)Ldk/f;

    move-result-object v0

    iput-object v0, p0, Ldk/b;->e:Ldk/f;

    iget-object v0, p2, Lgj/g;->b:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "amplitude-kotlin-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v8

    iget-object v5, p2, Lgj/g;->e:Ljava/lang/String;

    iget-object v6, p2, Lgj/g;->a:Ljava/lang/String;

    iget-object v7, p2, Lgj/g;->n:Ljc/a;

    iget-object p2, p2, Lgj/g;->g:Lbu/c;

    invoke-virtual {p2, p1}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v10

    const-string p1, "amplitude-identity-"

    invoke-static {p1, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v4, Lqk/b;

    const-string p1, "storageDirectory"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v4 .. v10}, Lqk/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljc/a;Ljava/io/File;Ljava/lang/String;Lfk/a;)V

    invoke-virtual {p3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lp0/n0;

    invoke-direct {p1, v4}, Lp0/n0;-><init>(Lqk/b;)V

    iput-object p1, p0, Ldk/b;->d:Lp0/n0;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lgj/g;Ljava/lang/String;Ljava/lang/String;)Ldk/f;
    .locals 8

    iget v0, p0, Ldk/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lgj/g;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v6

    const-string p2, "storageDirectory"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ldk/b;->f:Ljava/util/ArrayList;

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p1, Lgj/g;->b:Landroid/content/Context;

    invoke-virtual {p2, p3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    new-instance v2, Ldk/f;

    iget-object v3, p1, Lgj/g;->e:Ljava/lang/String;

    iget-object p1, p1, Lgj/g;->g:Lbu/c;

    iget-object p2, p0, Ldk/b;->b:Lgj/d;

    invoke-virtual {p1, p2}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v4

    const-string p1, "sharedPreferences"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, p2, Lgj/d;->n:Lwe/o;

    invoke-direct/range {v2 .. v7}, Ldk/f;-><init>(Ljava/lang/String;Lfk/a;Landroid/content/SharedPreferences;Ljava/io/File;Lwe/o;)V

    return-object v2

    :pswitch_0
    iget-object v0, p1, Lgj/g;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    move-result-object v6

    const-string p2, "storageDirectory"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ldk/b;->f:Ljava/util/ArrayList;

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p1, Lgj/g;->b:Landroid/content/Context;

    invoke-virtual {p2, p3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v5

    new-instance v2, Ldk/f;

    iget-object v3, p1, Lgj/g;->a:Ljava/lang/String;

    iget-object p1, p1, Lgj/g;->g:Lbu/c;

    iget-object p2, p0, Ldk/b;->b:Lgj/d;

    invoke-virtual {p1, p2}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v4

    const-string p1, "sharedPreferences"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, p2, Lgj/d;->n:Lwe/o;

    invoke-direct/range {v2 .. v7}, Ldk/f;-><init>(Ljava/lang/String;Lfk/a;Landroid/content/SharedPreferences;Ljava/io/File;Lwe/o;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ldk/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldk/b;->b:Lgj/d;

    iget-object v1, v0, Lgj/d;->k:Lfk/a;

    instance-of v2, p1, Ldk/c;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Ldk/c;

    iget v3, v2, Ldk/c;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Ldk/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Ldk/c;

    invoke-direct {v2, p0, p1}, Ldk/c;-><init>(Ldk/b;Ls83/c;)V

    :goto_0
    iget-object p1, v2, Ldk/c;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ldk/c;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v0, v2, Ldk/c;->w:Ldk/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v2, Ldk/c;->w:Ldk/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, La33/d;

    iget-object v4, p0, Ldk/b;->d:Lp0/n0;

    invoke-virtual {v0}, Lgj/d;->e()Lp0/n0;

    move-result-object v8

    invoke-direct {p1, v4, v8, v1}, La33/d;-><init>(Lp0/n0;Lp0/n0;Lfk/a;)V

    invoke-virtual {p1}, La33/d;->l()V

    iget-object p1, v0, Lgj/d;->a:Lgj/g;

    iget-object p1, p1, Lgj/g;->e:Ljava/lang/String;

    const-string v4, "$default_instance"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {v0}, Lgj/d;->f()Lik/b;

    move-result-object p1

    instance-of v0, p1, Ldk/f;

    if-eqz v0, :cond_4

    check-cast p1, Ldk/f;

    goto :goto_1

    :cond_4
    move-object p1, v5

    :goto_1
    if-eqz p1, :cond_5

    new-instance v0, La33/d;

    iget-object v4, p0, Ldk/b;->c:Ldk/f;

    invoke-direct {v0, v4, p1, v1}, La33/d;-><init>(Ldk/f;Ldk/f;Lfk/a;)V

    iput-object p0, v2, Ldk/c;->w:Ldk/b;

    iput v7, v2, Ldk/c;->z:I

    invoke-virtual {v0, v2}, La33/d;->k(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_5

    goto :goto_5

    :cond_5
    move-object v0, p0

    :goto_2
    iget-object p1, v0, Ldk/b;->b:Lgj/d;

    invoke-virtual {p1}, Lgj/d;->d()Lik/b;

    move-result-object p1

    instance-of v1, p1, Ldk/f;

    if-eqz v1, :cond_6

    move-object v5, p1

    check-cast v5, Ldk/f;

    :cond_6
    if-eqz v5, :cond_8

    new-instance p1, La33/d;

    iget-object v1, v0, Ldk/b;->e:Ldk/f;

    iget-object v4, v0, Ldk/b;->b:Lgj/d;

    iget-object v4, v4, Lgj/d;->k:Lfk/a;

    invoke-direct {p1, v1, v5, v4}, La33/d;-><init>(Ldk/f;Ldk/f;Lfk/a;)V

    iput-object v0, v2, Ldk/c;->w:Ldk/b;

    iput v6, v2, Ldk/c;->z:I

    invoke-virtual {p1, v2}, La33/d;->k(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_8

    goto :goto_5

    :cond_7
    move-object v0, p0

    :cond_8
    :goto_3
    iget-object p1, v0, Ldk/b;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    array-length v1, v1

    if-nez v1, :cond_9

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_4

    :cond_a
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v3

    :pswitch_0
    iget-object v0, p0, Ldk/b;->b:Lgj/d;

    iget-object v1, v0, Lgj/d;->k:Lfk/a;

    instance-of v2, p1, Ldk/a;

    if-eqz v2, :cond_b

    move-object v2, p1

    check-cast v2, Ldk/a;

    iget v3, v2, Ldk/a;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_b

    sub-int/2addr v3, v4

    iput v3, v2, Ldk/a;->z:I

    goto :goto_6

    :cond_b
    new-instance v2, Ldk/a;

    invoke-direct {v2, p0, p1}, Ldk/a;-><init>(Ldk/b;Ls83/c;)V

    :goto_6
    iget-object p1, v2, Ldk/a;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Ldk/a;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_e

    if-eq v4, v7, :cond_d

    if-ne v4, v6, :cond_c

    iget-object v0, v2, Ldk/a;->w:Ldk/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_9

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    iget-object v0, v2, Ldk/a;->w:Ldk/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_8

    :cond_e
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, La33/d;

    iget-object v4, p0, Ldk/b;->d:Lp0/n0;

    invoke-virtual {v0}, Lgj/d;->e()Lp0/n0;

    move-result-object v8

    invoke-direct {p1, v4, v8, v1}, La33/d;-><init>(Lp0/n0;Lp0/n0;Lfk/a;)V

    invoke-virtual {p1}, La33/d;->l()V

    invoke-virtual {v0}, Lgj/d;->f()Lik/b;

    move-result-object p1

    instance-of v0, p1, Ldk/f;

    if-eqz v0, :cond_f

    check-cast p1, Ldk/f;

    goto :goto_7

    :cond_f
    move-object p1, v5

    :goto_7
    if-eqz p1, :cond_10

    new-instance v0, La33/d;

    iget-object v4, p0, Ldk/b;->c:Ldk/f;

    invoke-direct {v0, v4, p1, v1}, La33/d;-><init>(Ldk/f;Ldk/f;Lfk/a;)V

    iput-object p0, v2, Ldk/a;->w:Ldk/b;

    iput v7, v2, Ldk/a;->z:I

    invoke-virtual {v0, v2}, La33/d;->k(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_10

    goto :goto_b

    :cond_10
    move-object v0, p0

    :goto_8
    iget-object p1, v0, Ldk/b;->b:Lgj/d;

    invoke-virtual {p1}, Lgj/d;->d()Lik/b;

    move-result-object p1

    instance-of v1, p1, Ldk/f;

    if-eqz v1, :cond_11

    move-object v5, p1

    check-cast v5, Ldk/f;

    :cond_11
    if-eqz v5, :cond_12

    new-instance p1, La33/d;

    iget-object v1, v0, Ldk/b;->e:Ldk/f;

    iget-object v4, v0, Ldk/b;->b:Lgj/d;

    iget-object v4, v4, Lgj/d;->k:Lfk/a;

    invoke-direct {p1, v1, v5, v4}, La33/d;-><init>(Ldk/f;Ldk/f;Lfk/a;)V

    iput-object v0, v2, Ldk/a;->w:Ldk/b;

    iput v6, v2, Ldk/a;->z:I

    invoke-virtual {p1, v2}, La33/d;->k(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_12

    goto :goto_b

    :cond_12
    :goto_9
    iget-object p1, v0, Ldk/b;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_13

    array-length v1, v1

    if-nez v1, :cond_13

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_a

    :cond_14
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_b
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
