.class public final Lf1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lf1/w0;

.field public final synthetic y:Lf1/b1;

.field public final synthetic z:Lx1/b;


# direct methods
.method public constructor <init>(Lf1/b1;Lx1/b;Lf1/w0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf1/f0;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/f0;->y:Lf1/b1;

    iput-object p2, p0, Lf1/f0;->z:Lx1/b;

    iput-object p3, p0, Lf1/f0;->x:Lf1/w0;

    return-void
.end method

.method public constructor <init>(Lf1/w0;Lf1/b1;Lx1/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf1/f0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/f0;->x:Lf1/w0;

    iput-object p2, p0, Lf1/f0;->y:Lf1/b1;

    iput-object p3, p0, Lf1/f0;->z:Lx1/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lf1/f0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lf1/f0;

    iget-object v0, p0, Lf1/f0;->y:Lf1/b1;

    iget-object v1, p0, Lf1/f0;->z:Lx1/b;

    iget-object v2, p0, Lf1/f0;->x:Lf1/w0;

    invoke-direct {p2, v0, v1, v2}, Lf1/f0;-><init>(Lf1/b1;Lx1/b;Lf1/w0;)V

    const v0, -0x10fa1909

    invoke-static {v0, p1, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/16 v0, 0x30

    invoke-static {v2, p2, p1, v0}, Lu0/n0;->b(Lf1/w0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lf1/c1;->a:Lp1/b0;

    iget-object v0, p0, Lf1/f0;->y:Lf1/b1;

    invoke-virtual {p2, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v0, Lb30/w2;

    iget-object v1, p0, Lf1/f0;->x:Lf1/w0;

    const/4 v2, 0x6

    iget-object v3, p0, Lf1/f0;->z:Lx1/b;

    invoke-direct {v0, v2, v3, v1}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, 0x24633bb7

    invoke-static {v1, p1, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
