.class public final Lxb3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic E:Lxb3/i;

.field public final synthetic w:I

.field public final x:Ljava/util/Iterator;

.field public y:I

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxb3/f;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lxb3/e;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxb3/e;->E:Lxb3/i;

    .line 3
    iget-object p1, p1, Lxb3/f;->a:Lxb3/i;

    .line 4
    invoke-interface {p1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lxb3/e;->x:Ljava/util/Iterator;

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lxb3/e;->y:I

    return-void
.end method

.method public constructor <init>(Lxb3/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxb3/e;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lxb3/e;->E:Lxb3/i;

    .line 8
    iget-object p1, p1, Lxb3/g;->a:Lxb3/i;

    .line 9
    invoke-interface {p1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lxb3/e;->x:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lxb3/e;->E:Lxb3/i;

    check-cast v0, Lxb3/f;

    :cond_0
    iget-object v1, p0, Lxb3/e;->x:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v0, Lxb3/f;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-boolean v3, v0, Lxb3/f;->b:Z

    if-ne v2, v3, :cond_0

    iput-object v1, p0, Lxb3/e;->z:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lxb3/e;->y:I

    return-void

    :cond_1
    const/4 v0, 0x0

    iput v0, p0, Lxb3/e;->y:I

    return-void
.end method

.method public b()Z
    .locals 4

    iget-object v0, p0, Lxb3/e;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iput v1, p0, Lxb3/e;->y:I

    return v1

    :cond_0
    iget-object v0, p0, Lxb3/e;->x:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lxb3/e;->E:Lxb3/i;

    check-cast v2, Lxb3/g;

    iget-object v3, v2, Lxb3/g;->c:Lkotlin/jvm/functions/Function1;

    iget-object v2, v2, Lxb3/g;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object v0, p0, Lxb3/e;->z:Ljava/lang/Object;

    iput v1, p0, Lxb3/e;->y:I

    return v1

    :cond_1
    const/4 v0, 0x2

    iput v0, p0, Lxb3/e;->y:I

    const/4 v0, 0x0

    iput-object v0, p0, Lxb3/e;->z:Ljava/lang/Object;

    const/4 v0, 0x0

    return v0
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lxb3/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lxb3/e;->y:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lxb3/e;->b()Z

    move-result v1

    :goto_0
    return v1

    :pswitch_0
    iget v0, p0, Lxb3/e;->y:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lxb3/e;->a()V

    :cond_2
    iget v0, p0, Lxb3/e;->y:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxb3/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lxb3/e;->y:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lxb3/e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lxb3/e;->y:I

    iget-object v0, p0, Lxb3/e;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_0
    iget v0, p0, Lxb3/e;->y:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lxb3/e;->a()V

    :cond_3
    iget v0, p0, Lxb3/e;->y:I

    if-eqz v0, :cond_4

    iget-object v0, p0, Lxb3/e;->z:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lxb3/e;->z:Ljava/lang/Object;

    iput v1, p0, Lxb3/e;->y:I

    return-object v0

    :cond_4
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lxb3/e;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
