.class public final Lg1/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final E:Lg1/g1;

.field public static final F:Lg1/g1;

.field public static final G:Lg1/g1;

.field public static final x:Lg1/g1;

.field public static final y:Lg1/g1;

.field public static final z:Lg1/g1;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lg1/g1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg1/g1;-><init>(I)V

    sput-object v0, Lg1/g1;->x:Lg1/g1;

    new-instance v0, Lg1/g1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg1/g1;-><init>(I)V

    sput-object v0, Lg1/g1;->y:Lg1/g1;

    new-instance v0, Lg1/g1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lg1/g1;-><init>(I)V

    sput-object v0, Lg1/g1;->z:Lg1/g1;

    new-instance v0, Lg1/g1;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lg1/g1;-><init>(I)V

    sput-object v0, Lg1/g1;->E:Lg1/g1;

    new-instance v0, Lg1/g1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lg1/g1;-><init>(I)V

    sput-object v0, Lg1/g1;->F:Lg1/g1;

    new-instance v0, Lg1/g1;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lg1/g1;-><init>(I)V

    sput-object v0, Lg1/g1;->G:Lg1/g1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg1/g1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg1/g1;->w:I

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

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_6

    move v0, v2

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_8

    move v0, v2

    goto :goto_8

    :cond_8
    const/4 v0, 0x0

    :goto_8
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_a

    move v0, v2

    goto :goto_a

    :cond_a
    const/4 v0, 0x0

    :goto_a
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
