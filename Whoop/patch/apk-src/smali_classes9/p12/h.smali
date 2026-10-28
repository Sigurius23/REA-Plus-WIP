.class public final synthetic Lp12/h;
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

    iput p2, p0, Lp12/h;->w:I

    iput-object p1, p0, Lp12/h;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp12/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/x;->u(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/x;->k(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/x;->C(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/x;->n(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/x;->d(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/l;->a(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lp12/h;->x:Lc93/a;

    invoke-static {v0}, Lp12/l;->d(Lc93/a;)Ll83/a0;

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
