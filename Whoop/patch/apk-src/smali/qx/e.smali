.class public final Lqx/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqx/s;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lqx/e;->a:I

    iput-object p2, p0, Lqx/e;->b:Ljava/lang/Object;

    iput-object p3, p0, Lqx/e;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lqx/d;
    .locals 4

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqx/d;

    iget-object v3, v2, Lqx/d;->a:Ljava/lang/reflect/Type;

    invoke-static {v3, p1}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v2, Lqx/d;->b:Ljava/util/Set;

    invoke-interface {v3, p2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;
    .locals 11

    iget v0, p0, Lqx/e;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lqx/e;->c:Ljava/lang/Object;

    iget-object v3, p0, Lqx/e;->b:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    check-cast v3, Ljava/lang/reflect/Type;

    sget-object p2, Lrx/f;->a:Ljava/util/Set;

    invoke-static {v3, p1}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object v1, v2

    check-cast v1, Lcom/squareup/moshi/JsonAdapter;

    :cond_0
    return-object v1

    :pswitch_0
    check-cast v3, Ljava/util/ArrayList;

    invoke-static {v3, p1, p2}, Lqx/e;->a(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lqx/d;

    move-result-object v5

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v2, p1, p2}, Lqx/e;->a(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lqx/d;

    move-result-object v8

    if-nez v5, :cond_1

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    if-eqz v5, :cond_3

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v6, v1

    goto :goto_2

    :cond_3
    :goto_1
    :try_start_0
    invoke-virtual {p3, p0, p1, p2}, Lqx/l0;->d(Lqx/e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_2
    if-eqz v5, :cond_4

    invoke-virtual {v5, p3, p0}, Lqx/d;->a(Lqx/l0;Lqx/e;)V

    :cond_4
    if-eqz v8, :cond_5

    invoke-virtual {v8, p3, p0}, Lqx/d;->a(Lqx/l0;Lqx/e;)V

    :cond_5
    new-instance v4, Lqx/a;

    move-object v10, p1

    move-object v9, p2

    move-object v7, p3

    invoke-direct/range {v4 .. v10}, Lqx/a;-><init>(Lqx/d;Lcom/squareup/moshi/JsonAdapter;Lqx/l0;Lqx/d;Ljava/util/Set;Ljava/lang/reflect/Type;)V

    move-object v1, v4

    :goto_3
    return-object v1

    :catch_0
    move-exception v0

    move-object v10, p1

    move-object v9, p2

    move-object p1, v0

    if-nez v5, :cond_6

    const-string p2, "@ToJson"

    goto :goto_4

    :cond_6
    const-string p2, "@FromJson"

    :goto_4
    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string v0, "No "

    const-string v1, " adapter for "

    invoke-static {v0, p2, v1}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {v10, v9}, Lrx/f;->k(Ljava/lang/reflect/Type;Ljava/util/Set;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
