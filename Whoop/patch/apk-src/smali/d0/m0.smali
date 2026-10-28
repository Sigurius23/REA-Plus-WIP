.class public final synthetic Ld0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Number;Ld0/j0;Ljava/lang/Number;Ld0/i0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ld0/m0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/m0;->x:Ljava/lang/Object;

    iput-object p2, p0, Ld0/m0;->z:Ljava/lang/Object;

    iput-object p3, p0, Ld0/m0;->y:Ljava/lang/Object;

    iput-object p4, p0, Ld0/m0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, Ld0/m0;->w:I

    iput-object p1, p0, Ld0/m0;->x:Ljava/lang/Object;

    iput-object p2, p0, Ld0/m0;->y:Ljava/lang/Object;

    iput-object p3, p0, Ld0/m0;->z:Ljava/lang/Object;

    iput-object p4, p0, Ld0/m0;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ld0/m0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld0/m0;->x:Ljava/lang/Object;

    check-cast v0, Lvn1/g$c;

    iget-object v1, p0, Ld0/m0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Ld0/m0;->z:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-object v3, p0, Ld0/m0;->E:Ljava/lang/Object;

    check-cast v3, Lq2/a;

    invoke-static {v0, v1, v2, v3}, Lun1/g;->d(Lvn1/g$c;Lkotlin/jvm/functions/Function1;Lc93/m;Lq2/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld0/m0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/m0;->y:Ljava/lang/Object;

    check-cast v1, Lh01/a0;

    iget-object v2, p0, Ld0/m0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ld0/m0;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static {v0, v1, v2, v3}, Lh01/z;->e(Lkotlin/jvm/functions/Function1;Lh01/a0;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ld0/m0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ld0/m0;->y:Ljava/lang/Object;

    check-cast v1, Lh01/q;

    iget-object v2, p0, Ld0/m0;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ld0/m0;->E:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static {v0, v1, v2, v3}, Lh01/p;->k(Lkotlin/jvm/functions/Function1;Lh01/q;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ld0/m0;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Number;

    iget-object v0, p0, Ld0/m0;->z:Ljava/lang/Object;

    check-cast v0, Ld0/j0;

    iget-object v1, p0, Ld0/m0;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/Number;

    iget-object v1, p0, Ld0/m0;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ld0/i0;

    iget-object v1, v0, Ld0/j0;->w:Ljava/lang/Number;

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ld0/j0;->x:Ljava/lang/Number;

    invoke-virtual {v5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iput-object v4, v0, Ld0/j0;->w:Ljava/lang/Number;

    iput-object v5, v0, Ld0/j0;->x:Ljava/lang/Number;

    new-instance v1, Ld0/p1;

    iget-object v3, v0, Ld0/j0;->y:Ld0/f2;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Ld0/p1;-><init>(Ld0/l;Ld0/f2;Ljava/lang/Object;Ljava/lang/Object;Ld0/r;)V

    iput-object v1, v0, Ld0/j0;->E:Ld0/p1;

    iget-object v1, v0, Ld0/j0;->I:Ld0/l0;

    iget-object v1, v1, Ld0/l0;->b:Lp1/k1;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Ld0/j0;->F:Z

    const/4 v1, 0x1

    iput-boolean v1, v0, Ld0/j0;->G:Z

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
