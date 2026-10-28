.class public final Lrw/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Low/a0;


# instance fields
.field public final synthetic w:I

.field public final x:Lf1/p1;


# direct methods
.method public synthetic constructor <init>(Lf1/p1;I)V
    .locals 0

    iput p2, p0, Lrw/c;->w:I

    iput-object p1, p0, Lrw/c;->x:Lf1/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Low/m;Lvw/a;)Low/z;
    .locals 9

    iget v0, p0, Lrw/c;->w:I

    iget-object v1, p0, Lrw/c;->x:Lf1/p1;

    const-class v2, Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, p2, Lvw/a;->b:Ljava/lang/reflect/Type;

    iget-object v6, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class v7, Ljava/util/Map;

    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_0

    goto/16 :goto_3

    :cond_0
    const-class v3, Ljava/util/Properties;

    invoke-virtual {v3, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    const/4 v8, 0x1

    if-eqz v3, :cond_1

    new-array v0, v4, [Ljava/lang/reflect/Type;

    const-class v2, Ljava/lang/String;

    aput-object v2, v0, v5

    aput-object v2, v0, v8

    goto :goto_0

    :cond_1
    instance-of v3, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v3, :cond_2

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v5

    :cond_2
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    invoke-static {v3}, Lqw/g;->b(Z)V

    invoke-static {v0, v6, v7}, Lqw/g;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v3

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v6, v3, v7}, Lqw/g;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_3

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_0

    :cond_3
    new-array v0, v4, [Ljava/lang/reflect/Type;

    aput-object v2, v0, v5

    aput-object v2, v0, v8

    :goto_0
    aget-object v2, v0, v5

    aget-object v0, v0, v8

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v2, v3, :cond_5

    const-class v3, Ljava/lang/Boolean;

    if-ne v2, v3, :cond_4

    goto :goto_1

    :cond_4
    new-instance v3, Lvw/a;

    invoke-direct {v3, v2}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v3}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v3

    goto :goto_2

    :cond_5
    :goto_1
    sget-object v3, Lrw/s;->c:Lrw/g;

    :goto_2
    new-instance v4, Lrw/f;

    invoke-direct {v4, p1, v3, v2}, Lrw/f;-><init>(Low/m;Low/z;Ljava/lang/reflect/Type;)V

    new-instance v2, Lvw/a;

    invoke-direct {v2, v0}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v2}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v2

    new-instance v3, Lrw/f;

    invoke-direct {v3, p1, v2, v0}, Lrw/f;-><init>(Low/m;Low/z;Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, p2, v5}, Lf1/p1;->j(Lvw/a;Z)Lqw/o;

    move-result-object p1

    new-instance p2, Lrw/f;

    invoke-direct {p2, p0, v4, v3, p1}, Lrw/f;-><init>(Lrw/c;Lrw/f;Lrw/f;Lqw/o;)V

    move-object v3, p2

    :goto_3
    return-object v3

    :pswitch_0
    iget-object v0, p2, Lvw/a;->b:Ljava/lang/reflect/Type;

    iget-object v6, p2, Lvw/a;->a:Ljava/lang/Class;

    const-class v7, Ljava/util/Collection;

    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    instance-of v3, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v3, :cond_7

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v5

    :cond_7
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    invoke-static {v3}, Lqw/g;->b(Z)V

    invoke-static {v0, v6, v7}, Lqw/g;->g(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Type;

    move-result-object v3

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0, v6, v3, v7}, Lqw/g;->j(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_8

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v2, v0, v5

    :cond_8
    new-instance v0, Lvw/a;

    invoke-direct {v0, v2}, Lvw/a;-><init>(Ljava/lang/reflect/Type;)V

    invoke-virtual {p1, v0}, Low/m;->c(Lvw/a;)Low/z;

    move-result-object v0

    new-instance v3, Lrw/f;

    invoke-direct {v3, p1, v0, v2}, Lrw/f;-><init>(Low/m;Low/z;Ljava/lang/reflect/Type;)V

    invoke-virtual {v1, p2, v5}, Lf1/p1;->j(Lvw/a;Z)Lqw/o;

    move-result-object p1

    new-instance p2, Lrw/b;

    invoke-direct {p2, v4, v3, p1}, Lrw/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v3, p2

    :goto_4
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
