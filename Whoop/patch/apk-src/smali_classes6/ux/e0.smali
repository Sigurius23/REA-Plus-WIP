.class public final Lux/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls40/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lux/e0;->a:I

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lux/e0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls40/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lux/e0;->a:I

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lux/e0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lux/e0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lux/d0;

    iget-object v0, p0, Lux/e0;->b:Ljava/lang/Object;

    check-cast v0, Lj/d;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :pswitch_0
    check-cast p1, Lux/d0;

    iget-object v0, p0, Lux/e0;->b:Ljava/lang/Object;

    check-cast v0, Ls40/a;

    invoke-virtual {p1}, Lux/d0;->f()Lv10/b;

    move-result-object v1

    invoke-virtual {v1}, Lv10/b;->b()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1}, Lux/d0;->b()I

    move-result p1

    const-class v2, Lcom/stripe/android/view/PaymentRelayActivity;

    invoke-virtual {v0, v2, v1, p1}, Ls40/a;->a(Ljava/lang/Class;Landroid/os/Bundle;I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
