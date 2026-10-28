.class public final synthetic Lf0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf0/x0;


# direct methods
.method public synthetic constructor <init>(Lf0/x0;I)V
    .locals 0

    iput p2, p0, Lf0/w0;->w:I

    iput-object p1, p0, Lf0/w0;->x:Lf0/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf0/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf0/w0;->x:Lf0/x0;

    iget-object v0, v0, Lf0/x0;->U:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Ly2/y;->Z(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    :goto_0
    new-instance v2, Lh2/b;

    invoke-direct {v2, v0, v1}, Lh2/b;-><init>(J)V

    return-object v2

    :pswitch_0
    iget-object v0, p0, Lf0/w0;->x:Lf0/x0;

    iget-wide v0, v0, Lf0/x0;->W:J

    new-instance v2, Lh2/b;

    invoke-direct {v2, v0, v1}, Lh2/b;-><init>(J)V

    return-object v2

    :pswitch_1
    iget-object v0, p0, Lf0/w0;->x:Lf0/x0;

    invoke-virtual {v0}, Lf0/x0;->Z0()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
