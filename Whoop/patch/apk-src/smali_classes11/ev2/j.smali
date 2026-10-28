.class public final synthetic Lev2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lg1/y3;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILbc3/c0;Lg1/y3;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lev2/j;->w:I

    iput-object p2, p0, Lev2/j;->x:Lbc3/c0;

    iput-object p3, p0, Lev2/j;->y:Lg1/y3;

    iput-object p4, p0, Lev2/j;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lev2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lev2/j;->y:Lg1/y3;

    iget-object v1, p0, Lev2/j;->z:Lp1/c1;

    iget-object v2, p0, Lev2/j;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lev2/u;->p(Lbc3/c0;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lev2/j;->y:Lg1/y3;

    iget-object v1, p0, Lev2/j;->z:Lp1/c1;

    iget-object v2, p0, Lev2/j;->x:Lbc3/c0;

    invoke-static {v2, v0, v1}, Lev2/n;->e(Lbc3/c0;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
