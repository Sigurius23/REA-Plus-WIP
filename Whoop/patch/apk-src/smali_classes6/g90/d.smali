.class public final synthetic Lg90/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lg90/d;->w:I

    iput-object p1, p0, Lg90/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    iget v0, p0, Lg90/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg90/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/management/navigation/a;->j(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lg90/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lcom/whoop/membership/management/navigation/a;->i(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lg90/d;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1, p2}, Lg90/f;->a(Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
