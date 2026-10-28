.class public final Lc0/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Lc0/l;

.field public static final y:Lc0/l;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lc0/l;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc0/l;-><init>(II)V

    sput-object v0, Lc0/l;->x:Lc0/l;

    new-instance v0, Lc0/l;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc0/l;-><init>(II)V

    sput-object v0, Lc0/l;->y:Lc0/l;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lc0/l;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc0/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/q0;

    check-cast p2, Lc0/q0;

    if-ne p1, p2, :cond_0

    sget-object p1, Lc0/q0;->y:Lc0/q0;

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly3/l;

    iget-wide v0, p1, Ly3/l;->a:J

    check-cast p2, Ly3/l;

    iget-wide p1, p2, Ly3/l;->a:J

    const/4 p1, 0x1

    int-to-long v0, p1

    const/16 p2, 0x20

    shl-long v2, v0, p2

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    new-instance p2, Ly3/l;

    invoke-direct {p2, v0, v1}, Ly3/l;-><init>(J)V

    const/4 v0, 0x0

    const/high16 v1, 0x43c80000    # 400.0f

    invoke-static {v0, v1, p1, p2}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
