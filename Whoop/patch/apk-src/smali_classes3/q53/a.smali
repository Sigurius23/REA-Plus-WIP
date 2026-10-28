.class public final synthetic Lq53/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq53/b;


# direct methods
.method public synthetic constructor <init>(Lq53/b;I)V
    .locals 0

    iput p2, p0, Lq53/a;->w:I

    iput-object p1, p0, Lq53/a;->x:Lq53/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lq53/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq53/a;->x:Lq53/b;

    const-string v1, "this$0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_0
    const-string v0, "this$0"

    iget-object v1, p0, Lq53/a;->x:Lq53/b;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
