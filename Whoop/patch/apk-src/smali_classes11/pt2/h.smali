.class public final synthetic Lpt2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lpt2/h;->w:I

    iput-object p1, p0, Lpt2/h;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpt2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/h;->x:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-static {v0}, Lpt2/v;->e(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpt2/h;->x:Ljava/lang/Object;

    check-cast v0, Lg1/y3;

    invoke-static {v0}, Lpt2/l$a;->f(Lg1/y3;)Lg1/z3;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpt2/h;->x:Ljava/lang/Object;

    check-cast v0, Lg1/y3;

    invoke-static {v0}, Lpt2/i$a;->f(Lg1/y3;)Lg1/z3;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
