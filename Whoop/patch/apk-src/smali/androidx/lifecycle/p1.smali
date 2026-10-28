.class public final synthetic Landroidx/lifecycle/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/lifecycle/f2;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/f2;I)V
    .locals 0

    iput p2, p0, Landroidx/lifecycle/p1;->w:I

    iput-object p1, p0, Landroidx/lifecycle/p1;->x:Landroidx/lifecycle/f2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Landroidx/lifecycle/p1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/p1;->x:Landroidx/lifecycle/f2;

    invoke-static {v0}, Lld1/d;->a(Landroidx/lifecycle/f2;)Ljf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/p1;->x:Landroidx/lifecycle/f2;

    invoke-static {v0}, Landroidx/lifecycle/o1;->k(Landroidx/lifecycle/f2;)Landroidx/lifecycle/r1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
