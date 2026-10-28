.class public final Lo63/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/Iterator;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo63/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo63/h;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo63/h;->y:Ljava/lang/Object;

    .line 3
    iget-object p1, p1, Lo63/i;->w:Ljava/util/Set;

    .line 4
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lo63/h;->x:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Lxb3/s;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo63/h;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lo63/h;->y:Ljava/lang/Object;

    .line 7
    iget-object p1, p1, Lxb3/s;->a:Lxb3/i;

    .line 8
    invoke-interface {p1}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lo63/h;->x:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    iget v0, p0, Lo63/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo63/h;->x:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lo63/h;->x:Ljava/util/Iterator;

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
    .locals 2

    iget v0, p0, Lo63/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo63/h;->y:Ljava/lang/Object;

    check-cast v0, Lxb3/s;

    iget-object v0, v0, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lo63/h;->x:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo63/h;->y:Ljava/lang/Object;

    check-cast v0, Lo63/i;

    iget-object v0, v0, Lo63/i;->x:Lkotlin/jvm/internal/m;

    iget-object v1, p0, Lo63/h;->x:Ljava/util/Iterator;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    iget v0, p0, Lo63/h;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lo63/h;->x:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
