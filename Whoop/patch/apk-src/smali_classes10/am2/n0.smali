.class public final synthetic Lam2/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ly71/o;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ly71/o;I)V
    .locals 0

    .line 1
    iput p3, p0, Lam2/n0;->w:I

    iput-object p1, p0, Lam2/n0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lam2/n0;->y:Ly71/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly71/o;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lam2/n0;->w:I

    iput-object p1, p0, Lam2/n0;->y:Ly71/o;

    iput-object p2, p0, Lam2/n0;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lam2/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/n0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lam2/n0;->y:Ly71/o;

    invoke-static {v0, v1}, Ly71/k;->c(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lam2/n0;->y:Ly71/o;

    iget-object v1, p0, Lam2/n0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Ly71/k;->b(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lam2/n0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lam2/n0;->y:Ly71/o;

    invoke-static {v0, v1}, Ly71/k;->a(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lam2/n0;->y:Ly71/o;

    iget-object v1, p0, Lam2/n0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lam2/o0;->R(Lkotlin/jvm/functions/Function1;Ly71/o;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
