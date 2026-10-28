.class public final synthetic Lat2/n0;
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

    iput p1, p0, Lat2/n0;->w:I

    iput-object p2, p0, Lat2/n0;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lat2/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/n0;->x:Lp1/c1;

    invoke-static {v0}, Lat2/d1;->j(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/n0;->x:Lp1/c1;

    invoke-static {v0}, Lat2/s0;->h(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lat2/n0;->x:Lp1/c1;

    invoke-static {v0}, Lat2/o0;->d(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
