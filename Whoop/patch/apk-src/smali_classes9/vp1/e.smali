.class public final synthetic Lvp1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;)V
    .locals 0

    iput p1, p0, Lvp1/e;->w:I

    iput-object p2, p0, Lvp1/e;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvp1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvp1/e;->x:Lp1/c1;

    invoke-static {v0}, Lvp1/h;->M(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvp1/e;->x:Lp1/c1;

    invoke-static {v0}, Lvp1/h;->h(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvp1/e;->x:Lp1/c1;

    invoke-static {v0}, Lvp1/h;->o(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lvp1/e;->x:Lp1/c1;

    invoke-static {v0}, Lvp1/h;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lvp1/e;->x:Lp1/c1;

    invoke-static {v0}, Lvp1/h;->K(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
