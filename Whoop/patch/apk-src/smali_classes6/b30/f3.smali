.class public final Lb30/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb30/j3;ZJ)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/f3;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/f3;->z:Ljava/lang/Object;

    iput-boolean p2, p0, Lb30/f3;->x:Z

    iput-wide p3, p0, Lb30/f3;->y:J

    return-void
.end method

.method public constructor <init>(ZJLn1/o;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb30/f3;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/f3;->x:Z

    iput-wide p2, p0, Lb30/f3;->y:J

    iput-object p4, p0, Lb30/f3;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lb30/f3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll0/u;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p3, p1, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p3, v0, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    and-int/2addr p1, v1

    move-object v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p1, p3}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lb30/f3;->x:Z

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    sget-object p1, Lo1/n;->y:Lo1/n;

    invoke-static {p1, v5}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v2

    new-instance p1, Lj00/z;

    iget-object p2, p0, Lb30/f3;->z:Ljava/lang/Object;

    check-cast p2, Ln1/o;

    const/4 p3, 0x2

    iget-wide v3, p0, Lb30/f3;->y:J

    invoke-direct {p1, v3, v4, p2, p3}, Lj00/z;-><init>(JLjava/lang/Object;I)V

    const p2, -0x7b07a338

    invoke-static {p2, v5, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6000

    const/16 v7, 0xa

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ll0/s1;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    const-string p3, "$this$TopAppBar"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p2, 0x11

    const/16 p2, 0x10

    if-ne p1, p2, :cond_3

    move-object p1, v5

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_5

    :cond_3
    :goto_2
    iget-object p1, p0, Lb30/f3;->z:Ljava/lang/Object;

    check-cast p1, Lb30/j3;

    iget-boolean p2, p1, Lb30/j3;->b:Z

    if-eqz p2, :cond_5

    iget-boolean p2, p1, Lb30/j3;->c:Z

    if-eqz p2, :cond_4

    const p2, 0x7f140ff3

    :goto_3
    move v0, p2

    goto :goto_4

    :cond_4
    const p2, 0x7f140ff4

    goto :goto_3

    :goto_4
    iget-object v4, p1, Lb30/j3;->d:Lc93/a;

    const/4 v6, 0x0

    iget-boolean v1, p0, Lb30/f3;->x:Z

    iget-wide v2, p0, Lb30/f3;->y:J

    invoke-static/range {v0 .. v6}, Lb30/g3;->a(IZJLc93/a;Landroidx/compose/runtime/Composer;I)V

    :cond_5
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
