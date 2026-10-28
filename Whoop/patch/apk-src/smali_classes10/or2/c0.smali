.class public final synthetic Lor2/c0;
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

    iput p2, p0, Lor2/c0;->w:I

    iput-object p1, p0, Lor2/c0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lor2/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lor2/c0;->x:Ljava/lang/Object;

    check-cast v0, Ltr2/n;

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-static {v0, p1}, Lor2/g0$a;->a(Ltr2/n;Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lor2/c0;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    invoke-static {v0, p1}, Lor2/d0$a;->f(Ldc3/u;Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
