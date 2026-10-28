.class public final Lo0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/m1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh0/x2;


# direct methods
.method public synthetic constructor <init>(Lh0/x2;I)V
    .locals 0

    iput p2, p0, Lo0/w;->w:I

    iput-object p1, p0, Lo0/w;->x:Lh0/x2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(La3/n0;)V
    .locals 1

    iget v0, p0, Lo0/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo0/w;->x:Lh0/x2;

    check-cast v0, Lq0/y;

    iget-object v0, v0, Lq0/y;->z:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo0/w;->x:Lh0/x2;

    check-cast v0, Lo0/y;

    iput-object p1, v0, Lo0/y;->j:La3/n0;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
