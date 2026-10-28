.class public final synthetic Lcp0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lcp0/j;->w:I

    iput-object p1, p0, Lcp0/j;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcp0/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/j;->x:Lc93/a;

    invoke-static {v0}, Lcp0/x0;->g(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcp0/j;->x:Lc93/a;

    invoke-static {v0}, Lcp0/x0;->q(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcp0/j;->x:Lc93/a;

    invoke-static {v0}, Lcp0/k;->b(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lcp0/j;->x:Lc93/a;

    invoke-static {v0}, Lcp0/k;->e(Lc93/a;)Ll83/a0;

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
