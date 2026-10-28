.class public final synthetic Lht/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lht/f;->w:I

    iput-object p1, p0, Lht/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lht/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lht/f;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lht/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lht/f;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lht/f;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lht/f;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lqi/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lqi/b0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lht/f;->x:Ljava/lang/Object;

    check-cast v0, Lht/g;

    iget-object v1, p0, Lht/f;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/Callable;

    iget-object v2, p0, Lht/f;->z:Ljava/lang/Object;

    check-cast v2, Lhm/d;

    iget-object v0, v0, Lht/g;->w:Ljava/util/concurrent/ExecutorService;

    new-instance v3, La8/c;

    const/16 v4, 0x17

    invoke-direct {v3, v4, v1, v2}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
