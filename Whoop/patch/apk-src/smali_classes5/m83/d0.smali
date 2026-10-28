.class public final Lm83/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/Iterator;

.field public y:I


# direct methods
.method public constructor <init>(Ljava/util/Iterator;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm83/d0;->w:I

    const-string v0, "iterator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm83/d0;->x:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Lxb3/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm83/d0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lxb3/b;->a:Lxb3/i;

    .line 4
    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lm83/d0;->x:Ljava/util/Iterator;

    .line 5
    iget p1, p1, Lxb3/b;->b:I

    .line 6
    iput p1, p0, Lm83/d0;->y:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lm83/d0;->w:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, Lm83/d0;->y:I

    iget-object v1, p0, Lm83/d0;->x:Ljava/util/Iterator;

    if-lez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, Lm83/d0;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lm83/d0;->y:I

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lm83/d0;->w:I

    packed-switch v0, :pswitch_data_0

    :goto_0
    iget v0, p0, Lm83/d0;->y:I

    iget-object v1, p0, Lm83/d0;->x:Ljava/util/Iterator;

    if-lez v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, Lm83/d0;->y:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lm83/d0;->y:I

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Lm83/c0;

    iget v1, p0, Lm83/d0;->y:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lm83/d0;->y:I

    if-ltz v1, :cond_1

    iget-object v2, p0, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lm83/c0;-><init>(ILjava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lm83/d0;->w:I

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
