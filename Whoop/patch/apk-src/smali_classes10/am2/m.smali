.class public final synthetic Lam2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lp1/t2;I)V
    .locals 0

    iput p2, p0, Lam2/m;->w:I

    iput-object p1, p0, Lam2/m;->x:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lam2/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/m;->x:Lp1/t2;

    invoke-static {v0}, Lam2/w$a;->f(Lp1/t2;)Z

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lam2/m;->x:Lp1/t2;

    invoke-static {v0}, Lam2/k$k;->f(Lp1/t2;)Z

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
