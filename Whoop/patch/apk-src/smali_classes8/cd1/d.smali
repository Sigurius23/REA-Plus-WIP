.class public final synthetic Lcd1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg1/s0;

.field public final synthetic y:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/s0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcd1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd1/d;->y:Lbc3/c0;

    iput-object p2, p0, Lcd1/d;->x:Lg1/s0;

    return-void
.end method

.method public synthetic constructor <init>(Lg1/s0;Lbc3/c0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcd1/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd1/d;->x:Lg1/s0;

    iput-object p2, p0, Lcd1/d;->y:Lbc3/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lcd1/d;->w:I

    iget-object v1, p0, Lcd1/d;->y:Lbc3/c0;

    iget-object v2, p0, Lcd1/d;->x:Lg1/s0;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lg1/t0;->w:Lg1/t0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lg1/t0;->w:Lg1/t0;

    iget-object v3, v2, Lg1/s0;->a:Lg1/a0;

    iget-object v3, v3, Lg1/a0;->d:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lg1/j2;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v3}, Lg1/j2;-><init>(Lg1/s0;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v1, v4, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    invoke-static {v1, v2}, Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;->h0(Lbc3/c0;Lg1/s0;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
