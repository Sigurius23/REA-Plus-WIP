.class public final Lz0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# static fields
.field public static final x:Lz0/g;

.field public static final y:Lz0/g;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lz0/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz0/g;-><init>(I)V

    sput-object v0, Lz0/g;->x:Lz0/g;

    new-instance v0, Lz0/g;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lz0/g;-><init>(I)V

    sput-object v0, Lz0/g;->y:Lz0/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lz0/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lz0/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lx0/g;

    check-cast p2, Lb1/f;

    check-cast p3, Lc93/a;

    check-cast p4, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result p5

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p5, 0x8

    if-nez v0, :cond_0

    move-object v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    move-object v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p5

    goto :goto_2

    :cond_2
    move v0, p5

    :goto_2
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_5

    and-int/lit8 v1, p5, 0x40

    if-nez v1, :cond_3

    move-object v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_3

    :cond_3
    move-object v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_3
    if-eqz v1, :cond_4

    const/16 v1, 0x20

    goto :goto_4

    :cond_4
    const/16 v1, 0x10

    :goto_4
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 p5, p5, 0x180

    if-nez p5, :cond_7

    move-object p5, p4

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_6

    const/16 p5, 0x100

    goto :goto_5

    :cond_6
    const/16 p5, 0x80

    :goto_5
    or-int/2addr v0, p5

    :cond_7
    and-int/lit16 p5, v0, 0x493

    const/16 v1, 0x492

    if-eq p5, v1, :cond_8

    const/4 p5, 0x1

    goto :goto_6

    :cond_8
    const/4 p5, 0x0

    :goto_6
    and-int/lit8 v1, v0, 0x1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, v1, p5}, Lp1/q;->U(IZ)Z

    move-result p5

    if-eqz p5, :cond_9

    and-int/lit16 p5, v0, 0x3fe

    invoke-static {p1, p2, p3, p4, p5}, Lz0/i;->c(Lx0/g;Lb1/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_9
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lx0/g;

    check-cast p2, Lb1/f;

    check-cast p3, Lc93/a;

    check-cast p4, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result p5

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_c

    and-int/lit8 v0, p5, 0x8

    if-nez v0, :cond_a

    move-object v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_8

    :cond_a
    move-object v0, p4

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_8
    if-eqz v0, :cond_b

    const/4 v0, 0x4

    goto :goto_9

    :cond_b
    const/4 v0, 0x2

    :goto_9
    or-int/2addr v0, p5

    goto :goto_a

    :cond_c
    move v0, p5

    :goto_a
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_f

    and-int/lit8 v1, p5, 0x40

    if-nez v1, :cond_d

    move-object v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_b

    :cond_d
    move-object v1, p4

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_b
    if-eqz v1, :cond_e

    const/16 v1, 0x20

    goto :goto_c

    :cond_e
    const/16 v1, 0x10

    :goto_c
    or-int/2addr v0, v1

    :cond_f
    and-int/lit16 p5, p5, 0x180

    if-nez p5, :cond_11

    move-object p5, p4

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_10

    const/16 p5, 0x100

    goto :goto_d

    :cond_10
    const/16 p5, 0x80

    :goto_d
    or-int/2addr v0, p5

    :cond_11
    and-int/lit16 p5, v0, 0x493

    const/16 v1, 0x492

    if-eq p5, v1, :cond_12

    const/4 p5, 0x1

    goto :goto_e

    :cond_12
    const/4 p5, 0x0

    :goto_e
    and-int/lit8 v1, v0, 0x1

    check-cast p4, Lp1/q;

    invoke-virtual {p4, v1, p5}, Lp1/q;->U(IZ)Z

    move-result p5

    if-eqz p5, :cond_13

    and-int/lit16 p5, v0, 0x3fe

    invoke-static {p1, p2, p3, p4, p5}, Lz0/i;->c(Lx0/g;Lb1/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_f

    :cond_13
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_f
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
