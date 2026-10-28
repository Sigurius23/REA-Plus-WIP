.class public final synthetic Lrq0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrq0/t0;


# direct methods
.method public synthetic constructor <init>(Lrq0/t0;I)V
    .locals 0

    iput p2, p0, Lrq0/m0;->w:I

    iput-object p1, p0, Lrq0/m0;->x:Lrq0/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrq0/m0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/m0;->x:Lrq0/t0;

    invoke-static {v0}, Lrq0/t0;->U(Lrq0/t0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrq0/m0;->x:Lrq0/t0;

    invoke-static {v0}, Lrq0/t0;->F(Lrq0/t0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lrq0/m0;->x:Lrq0/t0;

    invoke-static {v0}, Lrq0/t0;->G(Lrq0/t0;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
