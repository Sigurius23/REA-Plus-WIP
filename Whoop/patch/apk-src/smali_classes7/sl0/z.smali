.class public final synthetic Lsl0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lql0/c;Lh/i;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lsl0/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/z;->x:Lbc3/c0;

    iput-object p2, p0, Lsl0/z;->G:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/z;->H:Ljava/lang/Object;

    iput-object p4, p0, Lsl0/z;->y:Lp1/c1;

    iput-object p5, p0, Lsl0/z;->z:Lp1/c1;

    iput-object p6, p0, Lsl0/z;->E:Lp1/c1;

    iput-object p7, p0, Lsl0/z;->F:Lp1/c1;

    iput-object p8, p0, Lsl0/z;->I:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lsl0/q;Lnl0/f;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lsl0/z;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/z;->x:Lbc3/c0;

    iput-object p2, p0, Lsl0/z;->G:Ljava/lang/Object;

    iput-object p3, p0, Lsl0/z;->H:Ljava/lang/Object;

    iput-object p4, p0, Lsl0/z;->I:Ljava/lang/Object;

    iput-object p5, p0, Lsl0/z;->y:Lp1/c1;

    iput-object p6, p0, Lsl0/z;->z:Lp1/c1;

    iput-object p7, p0, Lsl0/z;->E:Lp1/c1;

    iput-object p8, p0, Lsl0/z;->F:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lsl0/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/z;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lql0/c;

    iget-object v0, p0, Lsl0/z;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lh/i;

    iget-object v0, p0, Lsl0/z;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lp1/c1;

    iget-object v1, p0, Lsl0/z;->x:Lbc3/c0;

    iget-object v4, p0, Lsl0/z;->y:Lp1/c1;

    iget-object v5, p0, Lsl0/z;->z:Lp1/c1;

    iget-object v6, p0, Lsl0/z;->E:Lp1/c1;

    iget-object v7, p0, Lsl0/z;->F:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lsl0/p3;->i(Lbc3/c0;Lql0/c;Lh/i;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/z;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsl0/q;

    iget-object v0, p0, Lsl0/z;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lnl0/f;

    iget-object v0, p0, Lsl0/z;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lg1/y3;

    iget-object v7, p0, Lsl0/z;->E:Lp1/c1;

    iget-object v8, p0, Lsl0/z;->F:Lp1/c1;

    iget-object v1, p0, Lsl0/z;->x:Lbc3/c0;

    iget-object v5, p0, Lsl0/z;->y:Lp1/c1;

    iget-object v6, p0, Lsl0/z;->z:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lsl0/w$l;->i(Lbc3/c0;Lsl0/q;Lnl0/f;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
