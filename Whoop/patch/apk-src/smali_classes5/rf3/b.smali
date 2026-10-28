.class public abstract Lrf3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqf3/b;


# direct methods
.method public constructor <init>(Lqf3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf3/b;->a:Lqf3/b;

    return-void
.end method


# virtual methods
.method public a(La3/p;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p1, La3/p;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnf3/a;

    iget-object v0, v1, Lnf3/a;->c:Lq83/g;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lq83/g;->D(I)Z

    move-result v0

    iget-object v2, p0, Lrf3/b;->a:Lqf3/b;

    if-eqz v0, :cond_0

    iget-object v0, v1, Lnf3/a;->c:Lq83/g;

    const-string v3, "| create instance for "

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lq83/g;->r(Ljava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p1, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Luf3/a;

    if-nez v0, :cond_1

    new-instance v0, Luf3/a;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v3}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    :cond_1
    iget-object v3, v2, Lqf3/b;->d:Lc93/m;

    iget-object p1, p1, La3/p;->y:Ljava/lang/Object;

    check-cast p1, Lxf3/c;

    invoke-interface {v3, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\n\t"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    const-string v4, "e.stackTrace"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    array-length v4, v3

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v4, :cond_2

    aget-object v8, v3, v7

    invoke-virtual {v8}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v9

    const-string v10, "it.className"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "sun.reflect"

    invoke-static {v9, v10, v6}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v9, 0x0

    const/16 v10, 0x3e

    const-string v6, "\n\t"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, v1, Lnf3/a;->c:Lq83/g;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Instance creation error : could not create instance for "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "msg"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x3

    invoke-static {v4, v5}, Le4/p;->b(II)I

    move-result v4

    if-gtz v4, :cond_3

    invoke-virtual {v1, v5, v0}, Lq83/g;->I(ILjava/lang/String;)V

    :cond_3
    new-instance v0, Lorg/koin/core/error/InstanceCreationException;

    const-string v1, "Could not create instance for "

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->o(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public abstract b(La3/p;)Ljava/lang/Object;
.end method
