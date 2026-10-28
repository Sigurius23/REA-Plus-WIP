.class public final Le4/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le4/m;


# direct methods
.method public synthetic constructor <init>(Le4/m;I)V
    .locals 0

    iput p2, p0, Le4/l;->w:I

    iput-object p1, p0, Le4/l;->x:Le4/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Le4/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll83/a0;

    iget-object p1, p0, Le4/l;->x:Le4/m;

    const/4 v0, 0x1

    iput-boolean v0, p1, Le4/m;->z:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lc93/a;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le4/l;->x:Le4/m;

    iget-object v1, v0, Le4/m;->x:Landroid/os/Handler;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, v0, Le4/m;->x:Landroid/os/Handler;

    :cond_1
    new-instance v0, Lb4/a;

    const/4 v2, 0x6

    invoke-direct {v0, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
