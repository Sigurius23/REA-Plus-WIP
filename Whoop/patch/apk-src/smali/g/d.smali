.class public final synthetic Lg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg/l;


# direct methods
.method public synthetic constructor <init>(Lg/l;I)V
    .locals 0

    iput p2, p0, Lg/d;->w:I

    iput-object p1, p0, Lg/d;->x:Lg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    iget v0, p0, Lg/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg/d;->x:Lg/l;

    invoke-static {v0, p1, p2}, Lg/l;->k(Lg/l;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_0
    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_STOP:Landroidx/lifecycle/v;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, Lg/d;->x:Lg/l;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
