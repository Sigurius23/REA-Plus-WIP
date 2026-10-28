.class public final synthetic Landroidx/lifecycle/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/lifecycle/p;->w:I

    iput-object p1, p0, Landroidx/lifecycle/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Landroidx/lifecycle/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/p;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/m0;

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-static {v0, p1}, Lor2/g0;->a(Landroidx/fragment/app/m0;Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/p;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, p1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
