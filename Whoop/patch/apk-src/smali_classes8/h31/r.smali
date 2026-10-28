.class public final synthetic Lh31/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lld1/c;


# direct methods
.method public synthetic constructor <init>(Lld1/c;I)V
    .locals 0

    iput p2, p0, Lh31/r;->w:I

    iput-object p1, p0, Lh31/r;->x:Lld1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh31/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Lyo0/e;->k(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Lyl0/n;->b(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Lt21/g;->p(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Lrm1/i;->k(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Ljm0/b;->b(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Li31/h;->e(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lh31/r;->x:Lld1/c;

    invoke-static {v0}, Lh31/s;->e(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
