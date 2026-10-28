.class public final synthetic Lwr0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm91/u;


# direct methods
.method public synthetic constructor <init>(ILm91/u;)V
    .locals 0

    iput p1, p0, Lwr0/e;->w:I

    iput-object p2, p0, Lwr0/e;->x:Lm91/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwr0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwr0/e;->x:Lm91/u;

    check-cast v0, Lwr0/t;

    invoke-static {v0}, Lwr0/s;->g(Lwr0/t;)Lp1/c1;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwr0/e;->x:Lm91/u;

    check-cast v0, Lwr0/h;

    invoke-static {v0}, Lwr0/g;->a(Lwr0/h;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
