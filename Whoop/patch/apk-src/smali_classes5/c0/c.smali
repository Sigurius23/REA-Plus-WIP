.class public final Lc0/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lc0/c;

.field public static final F:Lc0/c;

.field public static final G:Lc0/c;

.field public static final H:Lc0/c;

.field public static final I:Lc0/c;

.field public static final J:Lc0/c;

.field public static final K:Lc0/c;

.field public static final L:Lc0/c;

.field public static final x:Lc0/c;

.field public static final y:Lc0/c;

.field public static final z:Lc0/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lc0/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->x:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->y:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->z:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->E:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->F:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->G:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->H:Lc0/c;

    new-instance v0, Lc0/c;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->I:Lc0/c;

    new-instance v0, Lc0/c;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->J:Lc0/c;

    new-instance v0, Lc0/c;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->K:Lc0/c;

    new-instance v0, Lc0/c;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lc0/c;-><init>(II)V

    sput-object v0, Lc0/c;->L:Lc0/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lc0/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc0/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld0/t1;

    sget-object p1, Lc0/w0;->c:Ld0/i1;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    neg-int p1, p1

    div-int/lit8 p1, p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    const/4 p1, 0x0

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long v2, v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_2
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    const/4 p1, 0x0

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long v2, v0, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/l;

    invoke-direct {p1, v0, v1}, Ly3/l;-><init>(J)V

    return-object p1

    :pswitch_3
    check-cast p1, Ld0/t1;

    const/4 p1, 0x0

    const/4 v0, 0x7

    const/4 v1, 0x0

    invoke-static {v1, v1, v0, p1}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    return-object p1

    :pswitch_8
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lc0/q;

    const/16 p1, 0xdc

    const/16 v0, 0x5a

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v4}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v3

    invoke-static {p1, v0, v1, v2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    const v5, 0x3f6b851f    # 0.92f

    invoke-static {p1, v5, v2}, Lc0/w0;->g(Ld0/e2;FI)Lc0/d1;

    move-result-object p1

    invoke-virtual {v3, p1}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v2, v1, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    invoke-static {v0, v4}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
