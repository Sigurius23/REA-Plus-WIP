.class public final synthetic Lsl0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lsl0/q;

.field public final synthetic z:Lsl0/n0;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lsl0/v;->w:I

    iput-object p1, p0, Lsl0/v;->x:Lbc3/c0;

    iput-object p2, p0, Lsl0/v;->y:Lsl0/q;

    iput-object p3, p0, Lsl0/v;->z:Lsl0/n0;

    iput-object p4, p0, Lsl0/v;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lsl0/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/v;->z:Lsl0/n0;

    iget-object v1, p0, Lsl0/v;->E:Lp1/c1;

    iget-object v2, p0, Lsl0/v;->x:Lbc3/c0;

    iget-object v3, p0, Lsl0/v;->y:Lsl0/q;

    invoke-static {v2, v3, v0, v1}, Lsl0/w;->o(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/v;->z:Lsl0/n0;

    iget-object v1, p0, Lsl0/v;->E:Lp1/c1;

    iget-object v2, p0, Lsl0/v;->x:Lbc3/c0;

    iget-object v3, p0, Lsl0/v;->y:Lsl0/q;

    invoke-static {v2, v3, v0, v1}, Lsl0/w;->e(Lbc3/c0;Lsl0/q;Lsl0/n0;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
