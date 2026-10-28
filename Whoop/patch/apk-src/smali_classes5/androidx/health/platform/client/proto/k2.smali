.class public final Landroidx/health/platform/client/proto/k2;
.super Landroidx/health/platform/client/proto/u0;
.source "SourceFile"


# static fields
.field public static final ASC_ORDERING_FIELD_NUMBER:I = 0x7

.field public static final DATA_ORIGIN_FILTERS_FIELD_NUMBER:I = 0x3

.field public static final DATA_TYPE_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

.field public static final LIMIT_FIELD_NUMBER:I = 0x4

.field public static final PAGE_SIZE_FIELD_NUMBER:I = 0x5

.field public static final PAGE_TOKEN_FIELD_NUMBER:I = 0x6

.field private static volatile PARSER:Landroidx/health/platform/client/proto/s1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/s1;"
        }
    .end annotation
.end field

.field public static final TIME_SPEC_FIELD_NUMBER:I = 0x1


# instance fields
.field private ascOrdering_:Z

.field private bitField0_:I

.field private dataOriginFilters_:Landroidx/health/platform/client/proto/w0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/health/platform/client/proto/w0;"
        }
    .end annotation
.end field

.field private dataType_:Landroidx/health/platform/client/proto/w;

.field private limit_:I

.field private pageSize_:I

.field private pageToken_:Ljava/lang/String;

.field private timeSpec_:Landroidx/health/platform/client/proto/c3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/health/platform/client/proto/k2;

    invoke-direct {v0}, Landroidx/health/platform/client/proto/k2;-><init>()V

    sput-object v0, Landroidx/health/platform/client/proto/k2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

    const-class v1, Landroidx/health/platform/client/proto/k2;

    invoke-static {v1, v0}, Landroidx/health/platform/client/proto/u0;->n(Ljava/lang/Class;Landroidx/health/platform/client/proto/u0;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/health/platform/client/proto/u0;-><init>()V

    sget-object v0, Landroidx/health/platform/client/proto/z1;->z:Landroidx/health/platform/client/proto/z1;

    iput-object v0, p0, Landroidx/health/platform/client/proto/k2;->dataOriginFilters_:Landroidx/health/platform/client/proto/w0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/health/platform/client/proto/k2;->ascOrdering_:Z

    const-string v0, ""

    iput-object v0, p0, Landroidx/health/platform/client/proto/k2;->pageToken_:Ljava/lang/String;

    return-void
.end method

.method public static p(Landroidx/health/platform/client/proto/k2;Landroidx/health/platform/client/proto/c3;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/health/platform/client/proto/k2;->timeSpec_:Landroidx/health/platform/client/proto/c3;

    iget p1, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    return-void
.end method

.method public static q(Landroidx/health/platform/client/proto/k2;Landroidx/health/platform/client/proto/w;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Landroidx/health/platform/client/proto/k2;->dataType_:Landroidx/health/platform/client/proto/w;

    iget p1, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    return-void
.end method

.method public static r(Landroidx/health/platform/client/proto/k2;Ljava/util/ArrayList;)V
    .locals 2

    iget-object v0, p0, Landroidx/health/platform/client/proto/k2;->dataOriginFilters_:Landroidx/health/platform/client/proto/w0;

    move-object v1, v0

    check-cast v1, Landroidx/health/platform/client/proto/b;

    iget-boolean v1, v1, Landroidx/health/platform/client/proto/b;->w:Z

    if-nez v1, :cond_0

    invoke-static {v0}, Landroidx/health/platform/client/proto/u0;->k(Landroidx/health/platform/client/proto/w0;)Landroidx/health/platform/client/proto/w0;

    move-result-object v0

    iput-object v0, p0, Landroidx/health/platform/client/proto/k2;->dataOriginFilters_:Landroidx/health/platform/client/proto/w0;

    :cond_0
    iget-object p0, p0, Landroidx/health/platform/client/proto/k2;->dataOriginFilters_:Landroidx/health/platform/client/proto/w0;

    invoke-static {p1, p0}, Landroidx/health/platform/client/proto/a;->a(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static s(Landroidx/health/platform/client/proto/k2;)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/health/platform/client/proto/k2;->ascOrdering_:Z

    return-void
.end method

.method public static t(Landroidx/health/platform/client/proto/k2;)V
    .locals 1

    iget v0, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroidx/health/platform/client/proto/k2;->bitField0_:I

    const/16 v0, 0x3e8

    iput v0, p0, Landroidx/health/platform/client/proto/k2;->pageSize_:I

    return-void
.end method

.method public static u()Landroidx/health/platform/client/proto/j2;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/k2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->d()Landroidx/health/platform/client/proto/s0;

    move-result-object v0

    check-cast v0, Landroidx/health/platform/client/proto/j2;

    return-object v0
.end method

.method public static v([B)Landroidx/health/platform/client/proto/k2;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/k2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

    invoke-static {v0, p0}, Landroidx/health/platform/client/proto/u0;->m(Landroidx/health/platform/client/proto/u0;[B)Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/k2;

    return-object p0
.end method


# virtual methods
.method public final e(I)Ljava/lang/Object;
    .locals 9

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Landroidx/health/platform/client/proto/k2;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_1

    const-class v1, Landroidx/health/platform/client/proto/k2;

    monitor-enter v1

    :try_start_0
    sget-object p1, Landroidx/health/platform/client/proto/k2;->PARSER:Landroidx/health/platform/client/proto/s1;

    if-nez p1, :cond_0

    new-instance p1, Landroidx/health/platform/client/proto/t0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sput-object p1, Landroidx/health/platform/client/proto/k2;->PARSER:Landroidx/health/platform/client/proto/s1;

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
    sget-object p1, Landroidx/health/platform/client/proto/k2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

    return-object p1

    :pswitch_2
    new-instance p1, Landroidx/health/platform/client/proto/j2;

    sget-object v0, Landroidx/health/platform/client/proto/k2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

    invoke-direct {p1, v0}, Landroidx/health/platform/client/proto/s0;-><init>(Landroidx/health/platform/client/proto/u0;)V

    return-object p1

    :pswitch_3
    new-instance p1, Landroidx/health/platform/client/proto/k2;

    invoke-direct {p1}, Landroidx/health/platform/client/proto/k2;-><init>()V

    return-object p1

    :pswitch_4
    const-string v0, "bitField0_"

    const-string v1, "timeSpec_"

    const-string v2, "dataType_"

    const-string v3, "dataOriginFilters_"

    const-class v4, Landroidx/health/platform/client/proto/o;

    const-string v5, "limit_"

    const-string v6, "pageSize_"

    const-string v7, "pageToken_"

    const-string v8, "ascOrdering_"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1007\u0002"

    sget-object v1, Landroidx/health/platform/client/proto/k2;->DEFAULT_INSTANCE:Landroidx/health/platform/client/proto/k2;

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
