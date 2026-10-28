.class public final synthetic Lbp0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh/i;


# direct methods
.method public synthetic constructor <init>(Lh/i;I)V
    .locals 0

    iput p2, p0, Lbp0/e;->w:I

    iput-object p1, p0, Lbp0/e;->x:Lh/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbp0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbp0/e;->x:Lh/i;

    invoke-static {v0}, Lbp0/s;->b(Lh/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbp0/e;->x:Lh/i;

    invoke-static {v0}, Lbp0/s;->v(Lh/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
