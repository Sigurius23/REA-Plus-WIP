.class public abstract Ljc/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "Schedulers"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ljc/k;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Lqc/u;Lic/y;Ljava/util/List;)V
    .locals 2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqc/q;

    iget-object p2, p2, Lqc/q;->a:Ljava/lang/String;

    invoke-virtual {p0, v0, v1, p2}, Lqc/u;->g(JLjava/lang/String;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 8

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/room/z0;->beginTransaction()V

    :try_start_0
    iget-object v1, v0, Lqc/u;->a:Landroidx/room/z0;

    new-instance v2, Lpl0/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lpl0/a;-><init>(I)V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v4, v3, v2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Lic/b;->d:Lic/y;

    invoke-static {v0, v2, v1}, Ljc/k;->a(Lqc/u;Lic/y;Ljava/util/List;)V

    iget v2, p0, Lic/b;->k:I

    iget-object v5, v0, Lqc/u;->a:Landroidx/room/z0;

    new-instance v6, Lcom/whoop/data/local/room/dao/wipeable/e;

    const/4 v7, 0x6

    invoke-direct {v6, v2, v7}, Lcom/whoop/data/local/room/dao/wipeable/e;-><init>(II)V

    invoke-static {v5, v4, v3, v6}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    iget-object p0, p0, Lic/b;->d:Lic/y;

    invoke-static {v0, p0, v2}, Ljc/k;->a(Lqc/u;Lic/y;Ljava/util/List;)V

    invoke-interface {v2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p0, v0, Lqc/u;->a:Landroidx/room/z0;

    new-instance v0, Lpl0/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lpl0/a;-><init>(I)V

    invoke-static {p0, v4, v3, v0}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-virtual {p1}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroidx/room/z0;->endTransaction()V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lqc/q;

    invoke-interface {v2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lqc/q;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljc/i;

    invoke-interface {v1}, Ljc/i;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1, p1}, Ljc/i;->e([Lqc/q;)V

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lqc/q;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lqc/q;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljc/i;

    invoke-interface {p2}, Ljc/i;->c()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2, p0}, Ljc/i;->e([Lqc/q;)V

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Landroidx/room/z0;->endTransaction()V

    throw p0

    :cond_4
    :goto_2
    return-void
.end method
