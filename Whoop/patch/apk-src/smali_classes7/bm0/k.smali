.class public final synthetic Lbm0/k;
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

    iput p2, p0, Lbm0/k;->w:I

    iput-object p1, p0, Lbm0/k;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbm0/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm0/k;->x:Ljava/lang/Object;

    check-cast v0, Lbm0/m;

    invoke-static {v0}, Lbm0/l;->j(Lbm0/m;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm0/k;->x:Ljava/lang/Object;

    check-cast v0, Lq0/y;

    invoke-static {v0}, Lbm0/l$a;->f(Lq0/y;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
