.class public final synthetic Ll1/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Ln0/u;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Ln0/u;I)V
    .locals 0

    iput p3, p0, Ll1/g0;->w:I

    iput-object p1, p0, Ll1/g0;->x:Lbc3/c0;

    iput-object p2, p0, Ll1/g0;->y:Ln0/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ll1/g0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ll1/u0;

    const/4 v1, 0x1

    iget-object v2, p0, Ll1/g0;->y:Ln0/u;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ll1/u0;-><init>(ILn0/u;Lq83/d;)V

    const/4 v1, 0x3

    iget-object v2, p0, Ll1/g0;->x:Lbc3/c0;

    invoke-static {v2, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    new-instance v0, Ll1/u0;

    const/4 v1, 0x0

    iget-object v2, p0, Ll1/g0;->y:Ln0/u;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Ll1/u0;-><init>(ILn0/u;Lq83/d;)V

    const/4 v1, 0x3

    iget-object v2, p0, Ll1/g0;->x:Lbc3/c0;

    invoke-static {v2, v3, v3, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
