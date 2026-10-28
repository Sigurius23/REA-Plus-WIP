.class public final Landroidx/health/platform/client/proto/m;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/m;

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field

.field public static final VALUES_FIELD_NUMBER:I = 0x1


# instance fields
.field private values_:Landroidx/health/platform/client/proto/j1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/j1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/m;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/m;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/m;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/m;

    const-class v1, Landroidx/health/platform/client/proto/m;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    sget-object v0, Landroidx/health/platform/client/proto/j1;->x:Landroidx/health/platform/client/proto/j1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/m;->values_:Landroidx/health/platform/client/proto/j1;

    return-void
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
    sget-object p1, Landroidx/health/platform/client/proto/m;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v0, Landroidx/health/platform/client/proto/m;

    monitor-enter v0

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/m;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/m;->PARSER:Landroidx/health/platform/client/proto/s1;

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
    sget-object p1, Landroidx/health/platform/client/proto/m;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/m;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/i;

    sget-object v0, Landroidx/health/platform/client/proto/m;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/m;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/m;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/m;-><init>()V

    return-object p1

    :pswitch_4
    const-string p1, "values_"

    sget-object v0, Landroidx/health/platform/client/proto/l;->a:Landroidx/health/platform/client/proto/i1;

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object v1, Landroidx/health/platform/client/proto/m;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/m;

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
