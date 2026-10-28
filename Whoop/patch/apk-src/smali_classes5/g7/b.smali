.class public final Lg7/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lg7/b;

.field public static final F:Lg7/b;

.field public static final x:Lg7/b;

.field public static final y:Lg7/b;

.field public static final z:Lg7/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lg7/b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg7/b;-><init>(II)V

    sput-object v0, Lg7/b;->x:Lg7/b;

    new-instance v0, Lg7/b;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg7/b;-><init>(II)V

    sput-object v0, Lg7/b;->y:Lg7/b;

    new-instance v0, Lg7/b;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg7/b;-><init>(II)V

    sput-object v0, Lg7/b;->z:Lg7/b;

    new-instance v0, Lg7/b;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lg7/b;-><init>(II)V

    sput-object v0, Lg7/b;->E:Lg7/b;

    new-instance v0, Lg7/b;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lg7/b;-><init>(II)V

    sput-object v0, Lg7/b;->F:Lg7/b;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lg7/b;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg7/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm7/b1;

    const-string v0, "sample"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/b0;->t()Landroidx/health/platform/client/proto/z;

    move-result-object v0

    iget-wide v1, p1, Lm7/b1;->b:D

    invoke-static {v1, v2}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v2, "rate"

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object p1, p1, Lm7/b1;->a:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->e(J)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/b0;

    return-object p1

    :pswitch_0
    check-cast p1, Lm7/z0;

    const-string v0, "sample"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/b0;->t()Landroidx/health/platform/client/proto/z;

    move-result-object v0

    iget-object v1, p1, Lm7/z0;->b:Lr7/q0;

    invoke-virtual {v1}, Lr7/q0;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v2, "speed"

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object p1, p1, Lm7/z0;->a:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->e(J)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/b0;

    return-object p1

    :pswitch_1
    check-cast p1, Lm7/p0;

    const-string v0, "sample"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/b0;->t()Landroidx/health/platform/client/proto/z;

    move-result-object v0

    iget-object v1, p1, Lm7/p0;->b:Lr7/h0;

    invoke-virtual {v1}, Lr7/h0;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v2, "power"

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object p1, p1, Lm7/p0;->a:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->e(J)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/b0;

    return-object p1

    :pswitch_2
    check-cast p1, Lm7/y;

    const-string v0, "sample"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/b0;->t()Landroidx/health/platform/client/proto/z;

    move-result-object v0

    iget-wide v1, p1, Lm7/y;->b:J

    invoke-static {v1, v2}, Lvp/c;->h0(J)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v2, "bpm"

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object p1, p1, Lm7/y;->a:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->e(J)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/b0;

    return-object p1

    :pswitch_3
    check-cast p1, Lm7/l;

    const-string v0, "sample"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/b0;->t()Landroidx/health/platform/client/proto/z;

    move-result-object v0

    iget-wide v1, p1, Lm7/l;->b:D

    invoke-static {v1, v2}, Lvp/c;->D(D)Landroidx/health/platform/client/proto/g0;

    move-result-object v1

    const-string v2, "rpm"

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->d(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V

    iget-object p1, p1, Lm7/l;->a:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/health/platform/client/proto/z;->e(J)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    check-cast p1, Landroidx/health/platform/client/proto/b0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
