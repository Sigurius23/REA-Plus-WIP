.class public final Lqx/c;
.super Lqx/d;
.source "SourceFile"


# instance fields
.field public final synthetic h:I

.field public i:Lcom/squareup/moshi/JsonAdapter;

.field public final synthetic j:[Ljava/lang/reflect/Type;

.field public final synthetic k:Ljava/lang/reflect/Type;

.field public final synthetic l:Ljava/util/Set;

.field public final synthetic m:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;I)V
    .locals 0

    iput p11, p0, Lqx/c;->h:I

    iput-object p7, p0, Lqx/c;->j:[Ljava/lang/reflect/Type;

    iput-object p8, p0, Lqx/c;->k:Ljava/lang/reflect/Type;

    iput-object p9, p0, Lqx/c;->l:Ljava/util/Set;

    iput-object p10, p0, Lqx/c;->m:Ljava/util/Set;

    const/4 p7, 0x1

    move p8, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lqx/d;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-void
.end method


# virtual methods
.method public final a(Lqx/l0;Lqx/e;)V
    .locals 4

    iget v0, p0, Lqx/c;->h:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lqx/d;->a(Lqx/l0;Lqx/e;)V

    iget-object v0, p0, Lqx/c;->j:[Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    iget-object v3, p0, Lqx/c;->k:Ljava/lang/reflect/Type;

    invoke-static {v2, v3}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v2

    iget-object v3, p0, Lqx/c;->l:Ljava/util/Set;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lqx/c;->m:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    aget-object v0, v0, v1

    invoke-virtual {p1, p2, v0, v3}, Lqx/l0;->d(Lqx/e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_0

    :cond_0
    aget-object p2, v0, v1

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v3, v0}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lqx/c;->i:Lcom/squareup/moshi/JsonAdapter;

    return-void

    :pswitch_0
    invoke-super {p0, p1, p2}, Lqx/d;->a(Lqx/l0;Lqx/e;)V

    iget-object v0, p0, Lqx/c;->j:[Ljava/lang/reflect/Type;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lqx/c;->k:Ljava/lang/reflect/Type;

    invoke-static {v0, v1}, Landroidx/room/c1;->p(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    move-result v0

    iget-object v2, p0, Lqx/c;->m:Ljava/util/Set;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lqx/c;->l:Ljava/util/Set;

    invoke-interface {v0, v2}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, p2, v1, v2}, Lqx/l0;->d(Lqx/e;Ljava/lang/reflect/Type;Ljava/util/Set;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    invoke-virtual {p1, v1, v2, p2}, Lqx/l0;->c(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/String;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lqx/c;->i:Lcom/squareup/moshi/JsonAdapter;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqx/c;->h:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lqx/d;->b(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqx/c;->i:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqx/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lqx/c0;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lqx/c;->h:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lqx/d;->d(Lqx/c0;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    invoke-virtual {p0, p2}, Lqx/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lqx/c;->i:Lcom/squareup/moshi/JsonAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/squareup/moshi/JsonAdapter;->toJson(Lqx/c0;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
