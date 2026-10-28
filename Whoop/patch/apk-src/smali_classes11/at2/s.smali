.class public final synthetic Lat2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lv41/f$a;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lv41/f$a;I)V
    .locals 0

    iput p3, p0, Lat2/s;->w:I

    iput-object p1, p0, Lat2/s;->x:Lbc3/c0;

    iput-object p2, p0, Lat2/s;->y:Lv41/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lat2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lyt2/m;->j(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Luw0/n;->g(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lpt2/v;->x(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lpt2/l;->c(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lpt2/i;->w(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lp12/x;->g(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Low2/f;->d(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lat2/c0;->g(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lat2/s;->x:Lbc3/c0;

    iget-object v1, p0, Lat2/s;->y:Lv41/f$a;

    invoke-static {v0, v1}, Lat2/w;->o(Lbc3/c0;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
