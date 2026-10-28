.class public final Le20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Lv03/h;


# direct methods
.method public constructor <init>(Lb20/g;Lb20/g;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Le20/a;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Le20/a;->y:Lv03/h;

    .line 4
    iput-object p2, p0, Le20/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lv03/h;I)V
    .locals 0

    .line 1
    iput p3, p0, Le20/a;->w:I

    iput-object p1, p0, Le20/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Le20/a;->y:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Le20/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le20/a;->y:Lv03/h;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/NativeLinkActivityContract;

    iget-object v1, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v1, Lb20/g;

    invoke-virtual {v1}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/WebLinkActivityContract;

    new-instance v2, Lu00/e;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lu00/e;-><init>(I)V

    new-instance v3, Lcom/stripe/android/link/LinkActivityContract;

    invoke-direct {v3, v0, v1, v2}, Lcom/stripe/android/link/LinkActivityContract;-><init>(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lu00/e;)V

    return-object v3

    :pswitch_0
    iget-object v0, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v0, Lt9/p;

    iget-object v1, p0, Le20/a;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_0

    sget-object v0, Lqy/e;->a:Lqy/d;

    goto :goto_0

    :cond_0
    sget-object v0, Lqy/e;->b:Lqy/d;

    :goto_0
    return-object v0

    :pswitch_1
    iget-object v0, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v0, Lb20/g;

    invoke-virtual {v0}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq20/l;

    iget-object v1, p0, Le20/a;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    new-instance v2, Lpg3/p;

    invoke-direct {v2, v0, v1}, Lpg3/p;-><init>(Lq20/l;Landroid/content/Context;)V

    return-object v2

    :pswitch_2
    iget-object v0, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v0, Lng3/o;

    iget-object v1, p0, Le20/a;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/w3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "starterArgs"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lh20/w3;->z:Ljava/lang/Integer;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v0, Lng3/n;

    iget-object v1, p0, Le20/a;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj20/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "defaultAddressLauncherEventReporter"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    :pswitch_4
    iget-object v0, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v0, Lv03/e;

    iget-object v0, v0, Lv03/e;->w:Ljava/lang/Object;

    check-cast v0, Ln10/o0;

    iget-object v1, p0, Le20/a;->y:Lv03/h;

    check-cast v1, Lcy/b;

    invoke-virtual {v1}, Lcy/b;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqy/d;

    new-instance v2, Lqg3/d;

    invoke-direct {v2, v0, v1}, Lqg3/d;-><init>(Ln10/o0;Lqy/d;)V

    return-object v2

    :pswitch_5
    iget-object v0, p0, Le20/a;->x:Ljava/lang/Object;

    check-cast v0, Lv03/b;

    invoke-static {v0}, Lv03/c;->a(Lv03/h;)Lu03/a;

    move-result-object v0

    iget-object v1, p0, Le20/a;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv10/a;

    const-string v2, "lazyRegistry"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "defaultReturnUrl"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/profile/view/edit/n;

    const/16 v3, 0xf

    invoke-direct {v2, v3, v0, v1}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
