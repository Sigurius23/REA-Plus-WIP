.class public final Lc0/d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lc0/d;

.field public static final F:Lc0/d;

.field public static final G:Lc0/d;

.field public static final H:Lc0/d;

.field public static final I:Lc0/d;

.field public static final J:Lc0/d;

.field public static final K:Lc0/d;

.field public static final x:Lc0/d;

.field public static final y:Lc0/d;

.field public static final z:Lc0/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lc0/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->x:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->y:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->z:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->E:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->F:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->G:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->H:Lc0/d;

    new-instance v0, Lc0/d;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->I:Lc0/d;

    new-instance v0, Lc0/d;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->J:Lc0/d;

    new-instance v0, Lc0/d;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lc0/d;-><init>(II)V

    sput-object v0, Lc0/d;->K:Lc0/d;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lc0/d;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc0/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    const/4 v0, 0x0

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    int-to-long v4, p1

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_0
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    const/4 v0, 0x0

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    int-to-long v4, p1

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    neg-int p1, p1

    div-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    neg-int p1, p1

    div-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ld0/o;

    iget v0, p1, Ld0/o;->a:F

    iget p1, p1, Ld0/o;->b:F

    invoke-static {v0, p1}, Li2/w0;->l(FF)J

    move-result-wide v0

    new-instance p1, Li2/e1;

    invoke-direct {p1, v0, v1}, Li2/e1;-><init>(J)V

    return-object p1

    :pswitch_6
    check-cast p1, Li2/e1;

    iget-wide v0, p1, Li2/e1;->a:J

    new-instance p1, Ld0/o;

    invoke-static {v0, v1}, Li2/e1;->b(J)F

    move-result v2

    invoke-static {v0, v1}, Li2/e1;->c(J)F

    move-result v0

    invoke-direct {p1, v2, v0}, Ld0/o;-><init>(FF)V

    :pswitch_7
    return-object p1

    :pswitch_8
    check-cast p1, Li2/x;

    iget-wide v0, p1, Li2/x;->a:J

    sget-object p1, Lj2/d;->x:Lj2/l;

    invoke-static {v0, v1, p1}, Li2/x;->b(JLj2/c;)J

    move-result-wide v0

    invoke-static {v0, v1}, Li2/x;->i(J)F

    move-result p1

    invoke-static {v0, v1}, Li2/x;->h(J)F

    move-result v2

    invoke-static {v0, v1}, Li2/x;->f(J)F

    move-result v3

    invoke-static {v0, v1}, Li2/x;->e(J)F

    move-result v0

    new-instance v1, Ld0/q;

    invoke-direct {v1, v0, p1, v2, v3}, Ld0/q;-><init>(FFFF)V

    return-object v1

    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    :pswitch_a
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
