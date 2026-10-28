.class public final synthetic Lmf0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Ll1/g1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Ll1/h1;Lp1/c1;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lmf0/d;->w:I

    iput-object p1, p0, Lmf0/d;->x:Ll1/g1;

    iput-object p2, p0, Lmf0/d;->y:Lp1/c1;

    iput-object p3, p0, Lmf0/d;->z:Lp1/c1;

    iput-object p4, p0, Lmf0/d;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lmf0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf0/d;->z:Lp1/c1;

    iget-object v1, p0, Lmf0/d;->E:Lp1/c1;

    iget-object v2, p0, Lmf0/d;->x:Ll1/g1;

    iget-object v3, p0, Lmf0/d;->y:Lp1/c1;

    invoke-static {v2, v3, v0, v1}, Lmf0/e;->x(Ll1/g1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmf0/d;->z:Lp1/c1;

    iget-object v1, p0, Lmf0/d;->E:Lp1/c1;

    iget-object v2, p0, Lmf0/d;->x:Ll1/g1;

    iget-object v3, p0, Lmf0/d;->y:Lp1/c1;

    invoke-static {v2, v3, v0, v1}, Lmf0/e;->f(Ll1/g1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
