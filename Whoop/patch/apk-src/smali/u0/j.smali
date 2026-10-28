.class public final synthetic Lu0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/a1;


# direct methods
.method public synthetic constructor <init>(Lf1/a1;I)V
    .locals 0

    iput p2, p0, Lu0/j;->w:I

    iput-object p1, p0, Lu0/j;->x:Lf1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu0/j;->x:Lf1/a1;

    check-cast v0, Lf1/b1;

    invoke-virtual {v0}, Lf1/b1;->b()J

    move-result-wide v0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu0/j;->x:Lf1/a1;

    check-cast v0, Lf1/b1;

    invoke-virtual {v0}, Lf1/b1;->b()J

    move-result-wide v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
