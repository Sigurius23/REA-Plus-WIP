.class public final synthetic Lis0/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lis0/m0;


# direct methods
.method public synthetic constructor <init>(Lis0/m0;I)V
    .locals 0

    iput p2, p0, Lis0/k0;->w:I

    iput-object p1, p0, Lis0/k0;->x:Lis0/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lis0/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lis0/k0;->x:Lis0/m0;

    invoke-static {v0}, Lis0/j0;->s(Lis0/m0;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lis0/k0;->x:Lis0/m0;

    invoke-static {v0}, Lis0/j0$b;->f(Lis0/m0;)Lis0/b0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
