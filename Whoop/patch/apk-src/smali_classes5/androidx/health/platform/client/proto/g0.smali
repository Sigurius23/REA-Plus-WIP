.class public final Landroidx/health/platform/client/proto/g0;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field public static final BOOLEAN_VAL_FIELD_NUMBER:I = 0x5

.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

.field public static final DOUBLE_VAL_FIELD_NUMBER:I = 0x2

.field public static final ENUM_VAL_FIELD_NUMBER:I = 0x4

.field public static final LONG_VAL_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field

.field public static final STRING_VAL_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private valueCase_:I

.field private value_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/g0;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/g0;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/g0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

    const-class v1, Landroidx/health/platform/client/proto/g0;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    return-void
.end method

.method public static A()Landroidx/health/platform/client/proto/f0;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/g0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->d()Landroidx/health/platform/client/proto/s0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/f0;

    return-object v0
.end method

.method public static p(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x3

    iput v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    return-void
.end method

.method public static q(Landroidx/health/platform/client/proto/g0;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    iput v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    iput-object p1, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    return-void
.end method

.method public static r(Landroidx/health/platform/client/proto/g0;Z)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    return-void
.end method

.method public static s(Landroidx/health/platform/client/proto/g0;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    return-void
.end method

.method public static t(Landroidx/health/platform/client/proto/g0;D)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    return-void
.end method

.method public static v()Landroidx/health/platform/client/proto/g0;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/g0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

    return-object v0
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Landroidx/health/platform/client/proto/g0;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v0, Landroidx/health/platform/client/proto/g0;

    monitor-enter v0

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/g0;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/g0;->PARSER:Landroidx/health/platform/client/proto/s1;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Landroidx/health/platform/client/proto/g0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/f0;

    sget-object v0, Landroidx/health/platform/client/proto/g0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/g0;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/g0;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "value_"

    const-string v0, "valueCase_"

    const-string v1, "bitField0_"

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1035\u0000\u0002\u1033\u0000\u0003\u103b\u0000\u0004\u103b\u0000\u0005\u103a\u0000"

    sget-object v1, Landroidx/health/platform/client/proto/g0;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/g0;

    new-instance v2, Landroidx/health/platform/client/proto/a2;

    invoke-direct {v2, v1, v0, p1}, Landroidx/health/platform/client/proto/a2;-><init>(Landroidx/health/platform/client/proto/a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :pswitch_5
    const/4 p1, 0x0

    return-object p1

    :pswitch_6
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u()Z
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final w()D
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final x()Ljava/lang/String;
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final y()J
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final z()Ljava/lang/String;
    .locals 2

    iget v0, p0, Landroidx/health/platform/client/proto/g0;->valueCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/health/platform/client/proto/g0;->value_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method
