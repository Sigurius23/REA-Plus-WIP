.class public final Landroidx/health/platform/client/proto/p2;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field public static final CHANGES_FIELD_NUMBER:I = 0x1

.field public static final CHANGES_TOKEN_EXPIRED_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/p2;

.field public static final HAS_MORE_FIELD_NUMBER:I = 0x2

.field public static final NEXT_CHANGES_TOKEN_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private changesTokenExpired_:Z

.field private changes_:Landroidx/health/platform/client/proto/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/w0;"
        }
    .end annotation
.end field

.field private hasMore_:Z

.field private nextChangesToken_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/p2;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/p2;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/p2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/p2;

    const-class v1, Landroidx/health/platform/client/proto/p2;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    sget-object v0, Landroidx/health/platform/client/proto/z1;->z:Landroidx/health/platform/client/proto/z1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/p2;->changes_:Landroidx/health/platform/client/proto/w0;

    const-string v0, ""

    iput-object v0, p0, Landroidx/health/platform/client/proto/p2;->nextChangesToken_:Ljava/lang/String;

    return-void
.end method

.method public static t([B)Landroidx/health/platform/client/proto/p2;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/p2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/p2;

    invoke-static {v0, p0}, Landroidx/health/platform/client/proto/u0;->m(Landroidx/health/platform/client/proto/u0;[B)Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/p2;

    return-object p0
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 6

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Landroidx/health/platform/client/proto/p2;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v1, Landroidx/health/platform/client/proto/p2;

    monitor-enter v1

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/p2;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/p2;->PARSER:Landroidx/health/platform/client/proto/s1;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-object p1

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-object p1

    :pswitch_1
    sget-object p1, Landroidx/health/platform/client/proto/p2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/p2;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/i;

    sget-object v0, Landroidx/health/platform/client/proto/p2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/p2;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/p2;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/p2;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "bitField0_"

    const-string v1, "changes_"

    const-class v2, Landroidx/health/platform/client/proto/j;

    const-string v3, "hasMore_"

    const-string v4, "nextChangesToken_"

    const-string v5, "changesTokenExpired_"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000\u0003\u1008\u0001\u0004\u1007\u0002"

    sget-object v1, Landroidx/health/platform/client/proto/p2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/p2;

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

    nop

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

.method public final p()Landroidx/health/platform/client/proto/w0;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/p2;->changes_:Landroidx/health/platform/client/proto/w0;

    return-object v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/health/platform/client/proto/p2;->changesTokenExpired_:Z

    return v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/health/platform/client/proto/p2;->hasMore_:Z

    return v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/p2;->nextChangesToken_:Ljava/lang/String;

    return-object v0
.end method
