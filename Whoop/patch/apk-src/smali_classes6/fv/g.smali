.class public final Lfv/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lfv/g;->w:I

    iput-object p1, p0, Lfv/g;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Lfv/g;->x:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lfv/g;->w:I

    iput-boolean p1, p0, Lfv/g;->x:Z

    iput-object p2, p0, Lfv/g;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lfv/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfv/g;->y:Ljava/lang/Object;

    check-cast v0, Lt23/h3;

    iget-object v1, v0, Lt23/h3;->h:Lec3/h2;

    iget-object v2, v0, Lt23/h3;->a:Lt23/a2;

    iget-object v3, v0, Lt23/h3;->i:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-boolean v4, p0, Lfv/g;->x:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lc33/j;

    if-eqz v8, :cond_0

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc33/j;

    iget-object v6, v0, Lt23/h3;->g:Lec3/h2;

    invoke-virtual {v6}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lc33/l;

    instance-of v7, v7, Lc33/j;

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move-object v6, v5

    :goto_1
    check-cast v6, Lc33/l;

    if-nez v6, :cond_5

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lc33/l;

    instance-of v7, v7, Lc33/j;

    if-nez v7, :cond_3

    goto :goto_2

    :cond_4
    move-object v6, v5

    :goto_2
    check-cast v6, Lc33/l;

    :cond_5
    iput-object v6, v0, Lt23/h3;->j:Lc33/l;

    iget-object v1, v0, Lt23/h3;->c:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb23/k;

    iget-object v6, v1, Lb23/k;->c:Lb23/e;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v6, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lt23/h3;->j:Lc33/l;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "#deviceDebug; selectedBeforeSpeaker: "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v8, v7, v0, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v2, v4}, Lt23/a2;->d(Lc33/l;)V

    goto :goto_3

    :cond_7
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v5, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lc33/l;

    instance-of v6, v6, Lc33/j;

    if-nez v6, :cond_8

    move-object v5, v4

    :cond_9
    check-cast v5, Lc33/l;

    iget-object v3, v0, Lt23/h3;->j:Lc33/l;

    if-eqz v3, :cond_a

    instance-of v4, v3, Lc33/j;

    if-nez v4, :cond_a

    invoke-static {v1, v3}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v5, v0, Lt23/h3;->j:Lc33/l;

    :cond_a
    invoke-virtual {v2, v5}, Lt23/a2;->d(Lc33/l;)V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfv/g;->y:Ljava/lang/Object;

    check-cast v0, Lt23/a2;

    iget-boolean v1, p0, Lfv/g;->x:Z

    if-eqz v1, :cond_b

    iget-object v1, v0, Lt23/a2;->j:Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    sget-object v3, Lt23/o1;->a:Lt23/o1;

    invoke-virtual {v1, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_b
    iget-object v0, v0, Lt23/a2;->a:Lt23/x1;

    sget-object v1, Lt23/l0;->P:Lt23/l0;

    invoke-virtual {v0, v1}, Lt23/x1;->d(Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lfv/g;->y:Ljava/lang/Object;

    check-cast v0, Lh/e;

    iget-boolean v1, p0, Lfv/g;->x:Z

    invoke-virtual {v0, v1}, Lg/t;->j(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lfv/g;->y:Ljava/lang/Object;

    check-cast v0, Lgv/d;

    iget-boolean v1, p0, Lfv/g;->x:Z

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Lgv/d;->cancel()V

    :cond_c
    invoke-virtual {v0}, Lgv/d;->l()V

    invoke-virtual {v0}, Lgv/d;->n()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
