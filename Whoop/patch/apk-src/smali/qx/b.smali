.class public final Lqx/b;
.super Lqx/d;
.source "SourceFile"


# instance fields
.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZI)V
    .locals 0

    iput p8, p0, Lqx/b;->h:I

    invoke-direct/range {p0 .. p7}, Lqx/d;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZ)V

    return-void
.end method


# virtual methods
.method public b(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqx/b;->h:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Lqx/d;->b(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
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
    .locals 4

    iget v0, p0, Lqx/b;->h:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lqx/d;->d(Lqx/c0;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqx/d;->f:[Lcom/squareup/moshi/JsonAdapter;

    array-length v1, v0

    const/4 v2, 0x2

    add-int/2addr v1, v2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v1, v3

    const/4 p1, 0x1

    aput-object p2, v1, p1

    array-length p1, v0

    invoke-static {v0, v3, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :try_start_0
    iget-object p1, p0, Lqx/d;->d:Ljava/lang/reflect/Method;

    iget-object p2, p0, Lqx/d;->c:Ljava/lang/Object;

    invoke-virtual {p1, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
