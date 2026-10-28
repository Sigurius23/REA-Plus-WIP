.class public final synthetic Lbm2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p6, p0, Lbm2/t;->w:I

    iput-object p1, p0, Lbm2/t;->x:Lp1/c1;

    iput-object p2, p0, Lbm2/t;->y:Lp1/c1;

    iput-object p3, p0, Lbm2/t;->z:Lp1/c1;

    iput-object p4, p0, Lbm2/t;->E:Lp1/c1;

    iput-object p5, p0, Lbm2/t;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lbm2/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm2/t;->E:Lp1/c1;

    iget-object v1, p0, Lbm2/t;->F:Lp1/c1;

    iget-object v2, p0, Lbm2/t;->x:Lp1/c1;

    iget-object v3, p0, Lbm2/t;->y:Lp1/c1;

    iget-object v4, p0, Lbm2/t;->z:Lp1/c1;

    invoke-static {v2, v3, v4, v0, v1}, Llf0/t;->d(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbm2/t;->E:Lp1/c1;

    iget-object v1, p0, Lbm2/t;->F:Lp1/c1;

    iget-object v2, p0, Lbm2/t;->x:Lp1/c1;

    iget-object v3, p0, Lbm2/t;->y:Lp1/c1;

    iget-object v4, p0, Lbm2/t;->z:Lp1/c1;

    invoke-static {v2, v3, v4, v0, v1}, Lbm2/e0;->g(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Lbm2/f0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
