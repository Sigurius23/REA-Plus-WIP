.class public final Lcom/google/crypto/tink/internal/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/internal/n0;
.implements Lxg3/i;
.implements Lhb3/a;
.implements Lhb3/c;
.implements Lio/sentry/v0;
.implements Lio/sentry/internal/debugmeta/a;
.implements Lio/sentry/clientreport/g;
.implements Lkh/g;
.implements Lhb3/e;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v0, v0, [La3/n0;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 21
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 25
    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 29
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    .line 30
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 32
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    .line 33
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 35
    new-instance p1, Ljava/util/concurrent/ArrayBlockingQueue;

    const/16 v0, 0x200

    invoke-direct {p1, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    .line 36
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance p1, Ltl/h;

    const-wide/16 v0, 0x3e8

    invoke-direct {p1, v0, v1}, Ltl/h;-><init>(J)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 38
    new-instance p1, Lio/sentry/hints/j;

    const/16 v0, 0xb

    .line 39
    invoke-direct {p1, v0}, Lio/sentry/hints/j;-><init>(I)V

    const/16 v0, 0xa

    .line 40
    invoke-static {v0, p1}, Lul/c;->a(ILul/a;)Ls/m2;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    .line 41
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance p1, Lal/d;

    const/4 v0, 0x0

    .line 43
    invoke-direct {p1, v0}, Lal/d;-><init>(Lal/i;)V

    .line 44
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 45
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_5
        0x6 -> :sswitch_4
        0xc -> :sswitch_3
        0x16 -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(ILbd3/v;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 83
    new-instance p2, Lkh/e;

    invoke-direct {p2, p1, p0}, Lkh/e;-><init>(ILcom/google/crypto/tink/internal/l0;)V

    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILi4/g;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 86
    const-string p2, "top"

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    .line 87
    const-string p1, "CCL"

    const-string v0, "horizontalAnchorIndexToAnchorName: Unknown horizontal index"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 88
    :cond_0
    const-string p2, "bottom"

    .line 89
    :cond_1
    :goto_0
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    iput-object p3, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La3/n0;Ly2/r0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 51
    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Laj/c;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfk/a;Lad3/z;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "logger"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/v0;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 48
    :cond_0
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 49
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 58
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    const-string v0, "newSetFromMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf4/e;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/c5;)V
    .locals 2

    const/16 v0, 0x12

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Lio/sentry/w4;

    const/4 v1, 0x0

    .line 76
    invoke-direct {v0, p1, p2, v1}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    .line 77
    iput-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 78
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    .line 54
    new-instance p1, Lbu/c;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Lbu/c;-><init>(I)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/w4;Ljava/util/List;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const-string v0, "SentryEnvelopeHeader is required."

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 67
    const-string p1, "SentryEnvelope items are required."

    invoke-static {p2, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 3
    iput p4, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 56
    sget-object p1, Lhj/v;->E:Lhj/v;

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, "url is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    :try_start_0
    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    :catch_0
    move-exception p1

    .line 15
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to compose the Sentry\'s server URL."

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public constructor <init>(Ljc/b;)V
    .locals 2

    const/16 p1, 0x19

    iput p1, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Lkb3/k;

    const-string v0, "Type parameter upper bound erasure results"

    invoke-direct {p1, v0}, Lkb3/k;-><init>(Ljava/lang/String;)V

    .line 9
    new-instance v0, Lfa3/u;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 10
    new-instance v0, Ldc3/s;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljc/g;Lsc/a;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    const-string v0, "processor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workTaskExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 73
    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/q;Lba3/h;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    .line 60
    iget p1, p2, Lba3/h;->b:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 61
    iget p1, p2, Lba3/h;->c:I

    if-ne p1, v0, :cond_0

    return-void

    .line 62
    :cond_0
    const-string p1, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    const-string v0, " was passed"

    .line 63
    invoke-static {p1, p2, v0}, Ld;->n(Ljava/lang/String;Lba3/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 64
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(Lr93/b0;Lzt/q;Lgb3/a;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p3, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    .line 6
    new-instance p3, Lwe/o;

    invoke-direct {p3, p1, p2}, Lwe/o;-><init>(Lr93/b0;Lzt/q;)V

    iput-object p3, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public static E(Lio/sentry/m5;)Lio/sentry/m;
    .locals 1

    sget-object v0, Lio/sentry/m5;->Event:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/sentry/m;->Error:Lio/sentry/m;

    return-object p0

    :cond_0
    sget-object v0, Lio/sentry/m5;->Session:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lio/sentry/m;->Session:Lio/sentry/m;

    return-object p0

    :cond_1
    sget-object v0, Lio/sentry/m5;->Transaction:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lio/sentry/m;->Transaction:Lio/sentry/m;

    return-object p0

    :cond_2
    sget-object v0, Lio/sentry/m5;->UserFeedback:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lio/sentry/m;->UserReport:Lio/sentry/m;

    return-object p0

    :cond_3
    sget-object v0, Lio/sentry/m5;->Feedback:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lio/sentry/m;->Feedback:Lio/sentry/m;

    return-object p0

    :cond_4
    sget-object v0, Lio/sentry/m5;->Profile:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p0, Lio/sentry/m;->Profile:Lio/sentry/m;

    return-object p0

    :cond_5
    sget-object v0, Lio/sentry/m5;->ProfileChunk:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object p0, Lio/sentry/m;->ProfileChunkUi:Lio/sentry/m;

    return-object p0

    :cond_6
    sget-object v0, Lio/sentry/m5;->Attachment:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object p0, Lio/sentry/m;->Attachment:Lio/sentry/m;

    return-object p0

    :cond_7
    sget-object v0, Lio/sentry/m5;->CheckIn:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Lio/sentry/m;->Monitor:Lio/sentry/m;

    return-object p0

    :cond_8
    sget-object v0, Lio/sentry/m5;->ReplayVideo:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lio/sentry/m;->Replay:Lio/sentry/m;

    return-object p0

    :cond_9
    sget-object v0, Lio/sentry/m5;->Log:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p0, Lio/sentry/m;->LogItem:Lio/sentry/m;

    return-object p0

    :cond_a
    sget-object v0, Lio/sentry/m5;->Span:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object p0, Lio/sentry/m;->Span:Lio/sentry/m;

    return-object p0

    :cond_b
    sget-object v0, Lio/sentry/m5;->TraceMetric:Lio/sentry/m5;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_c

    sget-object p0, Lio/sentry/m;->TraceMetric:Lio/sentry/m;

    return-object p0

    :cond_c
    sget-object p0, Lio/sentry/m;->Default:Lio/sentry/m;

    return-object p0
.end method

.method public static F(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;
    .locals 7

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {p0}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/crypto/tink/internal/r0;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    new-array v2, v2, [B

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x21

    if-lt v5, v6, :cond_0

    const/16 v6, 0x7e

    if-gt v5, v6, :cond_0

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a printable ASCII character: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {v2}, Lct/a;->a([B)Lct/a;

    move-result-object v1

    invoke-direct {v0, v3, p0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static G(Lvs/p3;)Lcom/google/crypto/tink/internal/l0;
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {p0}, Lvs/p3;->E()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/internal/r0;->c(Ljava/lang/String;)Lct/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static J(La3/n0;)V
    .locals 3

    iget v0, p0, La3/n0;->n0:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, La3/n0;->j()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La3/n0;->m0:Z

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object p0

    iget-object v1, p0, Lr1/c;->w:[Ljava/lang/Object;

    iget p0, p0, Lr1/c;->y:I

    :goto_0
    if-ge v0, p0, :cond_0

    aget-object v2, v1, v0

    check-cast v2, La3/n0;

    invoke-static {v2}, Lcom/google/crypto/tink/internal/l0;->J(La3/n0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static Q(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/a1;)Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {p0}, Lcom/iterable/iterableapi/j1;->q()Z

    move-result v1

    const-string v2, "saveToInbox"

    invoke-virtual {p0}, Lcom/iterable/iterableapi/j1;->l()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "silentInbox"

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p1, :cond_0

    const-string p0, "location"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_0

    :cond_0
    return-object v0

    :goto_0
    const-string p1, "IterableApiClient"

    const-string v1, "Could not populate messageContext JSON"

    invoke-static {p1, v1, p0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static X(Lcom/google/crypto/tink/internal/l0;Le4/g;FI)V
    .locals 4

    and-int/lit8 p3, p3, 0x2

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    int-to-float p2, v0

    :cond_0
    int-to-float p3, v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p1, Le4/g;->b:I

    const-string v2, "top"

    if-eqz v1, :cond_2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    const-string v1, "CCL"

    const-string v3, "horizontalAnchorIndexToAnchorName: Unknown horizontal index"

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v2, "bottom"

    :cond_2
    :goto_0
    new-instance v1, Li4/a;

    new-array v0, v0, [C

    invoke-direct {v1, v0}, Li4/b;-><init>([C)V

    iget-object p1, p1, Le4/g;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    invoke-static {v2}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    new-instance p1, Li4/e;

    invoke-direct {p1, p2}, Li4/e;-><init>(F)V

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    new-instance p1, Li4/e;

    invoke-direct {p1, p3}, Li4/e;-><init>(F)V

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Li4/g;

    iget-object p0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p1, p0, v1}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    return-void
.end method


# virtual methods
.method public A(Lqa3/w0;Lsa3/f;)Ljava/util/ArrayList;
    .locals 2

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lgb3/a;

    iget-object v0, v0, Lgb3/a;->k:Lwa3/o;

    invoke-virtual {p1, v0}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    invoke-virtual {p0, v1, p2}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public B(Lorg/json/JSONObject;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/k;

    iget-object v1, v0, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v0, "email"

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "userId"

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void

    :cond_1
    iget-object v0, v0, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public C()Lgs/t;
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lgs/j;

    if-eqz v1, :cond_0

    new-instance v1, Lgs/t;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Lgs/j;

    invoke-direct {v1, v0, v2}, Lgs/t;-><init>(ILgs/j;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public D()Lls/d;
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lls/c;

    if-eqz v1, :cond_0

    new-instance v1, Lls/d;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Lls/c;

    invoke-direct {v1, v0, v2}, Lls/d;-><init>(ILls/c;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public H(Lc93/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lhj/v;

    iget v0, v0, Lhj/v;->w:I

    const/4 v1, 0x4

    if-le v1, v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    sget-object v0, Lhj/v;->E:Lhj/v;

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    return-void
.end method

.method public varargs I([Ljava/lang/Object;)V
    .locals 6

    sget-object v4, Lhj/x;->x:Lhj/x;

    const/16 v5, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lhj/v;->E:Lhj/v;

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    return-void
.end method

.method public varargs K([Ljava/lang/Object;)V
    .locals 6

    sget-object v4, Lhj/x;->y:Lhj/x;

    const/16 v5, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lhj/v;->x:Lhj/v;

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    return-void
.end method

.method public L()V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getOnDiscard()Lio/sentry/k6;

    return-void
.end method

.method public M(Lal/i;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lal/d;

    if-nez v1, :cond_0

    new-instance v1, Lal/d;

    invoke-direct {v1, p1}, Lal/d;-><init>(Lal/i;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lal/i;->a()V

    :goto_0
    iget-object p1, v1, Lal/d;->d:Lal/d;

    iget-object v0, v1, Lal/d;->c:Lal/d;

    iput-object v0, p1, Lal/d;->c:Lal/d;

    iget-object v0, v1, Lal/d;->c:Lal/d;

    iput-object p1, v0, Lal/d;->d:Lal/d;

    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lal/d;

    iput-object p1, v1, Lal/d;->d:Lal/d;

    iget-object p1, p1, Lal/d;->c:Lal/d;

    iput-object p1, v1, Lal/d;->c:Lal/d;

    iput-object v1, p1, Lal/d;->d:Lal/d;

    iget-object p1, v1, Lal/d;->d:Lal/d;

    iput-object v1, p1, Lal/d;->c:Lal/d;

    iget-object p1, v1, Lal/d;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-lez p1, :cond_2

    iget-object v0, v1, Lal/d;->b:Ljava/util/ArrayList;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public N(Lka3/a;)Llb3/f1;
    .locals 0

    invoke-virtual {p1}, Lka3/a;->b()Llb3/c0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lio/sentry/config/a;->U(Llb3/y;)Llb3/f1;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb3/i;

    return-object p1
.end method

.method public O()Lorg/json/JSONObject;
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/k;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "deviceId"

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "platform"

    const-string v3, "Android"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "appPackageName"

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    const-string v2, "IterableApiClient"

    const-string v3, "Could not populate deviceInfo JSON"

    invoke-static {v2, v3, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object v1
.end method

.method public P(Lr93/x0;Lka3/a;)Llb3/y;
    .locals 2

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lkb3/e;

    new-instance v1, Llb3/t0;

    invoke-direct {v1, p1, p2}, Llb3/t0;-><init>(Lr93/x0;Lka3/a;)V

    invoke-virtual {v0, v1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    return-object p1
.end method

.method public R()Ly2/r0;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/r0;

    return-object v0
.end method

.method public declared-synchronized S(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public T()Lcom/iterable/iterableapi/l2;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/l2;

    if-nez v0, :cond_0

    new-instance v0, Lcom/iterable/iterableapi/k2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/l2;

    return-object v0
.end method

.method public declared-synchronized U(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 5

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lol/d;

    iget-object v4, v3, Lol/d;->a:Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Lol/d;->b:Ljava/lang/Class;

    invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_2

    iget-object v4, v3, Lol/d;->b:Ljava/lang/Class;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v3, v3, Lol/d;->b:Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public V(Lwk/e;)Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ltl/h;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Ltl/h;

    invoke-virtual {v1, p1}, Ltl/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v1, :cond_1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ls/m2;

    invoke-virtual {v0}, Ls/m2;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbl/h;

    :try_start_1
    iget-object v1, v0, Lbl/h;->w:Ljava/security/MessageDigest;

    invoke-interface {p1, v1}, Lwk/e;->a(Ljava/security/MessageDigest;)V

    iget-object v1, v0, Lbl/h;->w:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    sget-object v2, Ltl/l;->b:[C

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x0

    :goto_0
    :try_start_2
    array-length v4, v1

    if-ge v3, v4, :cond_0

    aget-byte v4, v1, v3

    and-int/lit16 v5, v4, 0xff

    mul-int/lit8 v6, v3, 0x2

    sget-object v7, Ltl/l;->a:[C

    ushr-int/lit8 v5, v5, 0x4

    aget-char v5, v7, v5

    aput-char v5, v2, v6

    add-int/lit8 v6, v6, 0x1

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v7, v4

    aput-char v4, v2, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Ls/m2;

    invoke-virtual {v2, v0}, Ls/m2;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Ls/m2;

    invoke-virtual {v1, v0}, Ls/m2;->a(Ljava/lang/Object;)Z

    throw p1

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltl/h;

    monitor-enter v2

    :try_start_5
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ltl/h;

    invoke-virtual {v0, p1, v1}, Ltl/h;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2

    return-object v1

    :catchall_2
    move-exception p1

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw p1
.end method

.method public W(Ljava/lang/Object;Lj93/z;)Z
    .locals 2

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p2, Lba3/h;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/q;

    invoke-interface {v0, p1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget v0, p2, Lba3/h;->a:I

    ushr-int/2addr p1, v0

    iget v0, p2, Lba3/h;->b:I

    const/4 v1, 0x1

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    and-int/2addr p1, v0

    iget p2, p2, Lba3/h;->c:I

    if-ne p1, p2, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public Y(Lqa3/h;Lsa3/f;)Ls93/c;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lwe/o;

    invoke-virtual {v0, p1, p2}, Lwe/o;->m(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object p1

    return-object p1
.end method

.method public Z(Lhj/v;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v1, p1, Lhj/v;->w:I

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Lhj/v;

    iget v2, v2, Lhj/v;->w:I

    if-le v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "[Debug]: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "[Log]: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "[Warn]: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "[Error]: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(I)V
    .locals 2

    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->b()V

    return-void

    :cond_0
    const/16 v0, 0xa

    if-gt v0, p1, :cond_1

    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lkh/e;

    iget-object v0, p1, La0/a0;->c:Lqt/e;

    monitor-enter v0

    :try_start_0
    iget v1, p1, La0/a0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    div-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v1}, La0/a0;->i(I)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_1
    return-void
.end method

.method public varargs a0([Ljava/lang/Object;)V
    .locals 6

    sget-object v4, Lhj/x;->z:Lhj/x;

    const/16 v5, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lhj/v;->z:Lhj/v;

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lkh/e;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, La0/a0;->i(I)V

    return-void
.end method

.method public b0(Lal/i;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lal/d;

    if-nez v1, :cond_0

    new-instance v1, Lal/d;

    invoke-direct {v1, p1}, Lal/d;-><init>(Lal/i;)V

    iput-object v1, v1, Lal/d;->d:Lal/d;

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Lal/d;

    iget-object v3, v2, Lal/d;->d:Lal/d;

    iput-object v3, v1, Lal/d;->d:Lal/d;

    iput-object v2, v1, Lal/d;->c:Lal/d;

    iput-object v1, v2, Lal/d;->d:Lal/d;

    iget-object v2, v1, Lal/d;->d:Lal/d;

    iput-object v1, v2, Lal/d;->c:Lal/d;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lal/i;->a()V

    :goto_0
    iget-object p1, v1, Lal/d;->b:Ljava/util/ArrayList;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v1, Lal/d;->b:Ljava/util/ArrayList;

    :cond_1
    iget-object p1, v1, Lal/d;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lhb3/a0;Lqa3/k0;)Ljava/util/List;
    .locals 3

    iget-object p2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p2, Lgb3/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lm83/y;->w:Lm83/y;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    iget-object v2, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v2, Lsa3/f;

    invoke-virtual {p0, v1, v2}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V
    .locals 1

    new-instance v0, Lio/sentry/clientreport/c;

    invoke-direct {v0, p1, p2}, Lio/sentry/clientreport/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p1, Lbu/c;

    iget-object p1, p1, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, Lio/sentry/util/f;

    invoke-virtual {p1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    :cond_0
    return-void
.end method

.method public d(Lio/sentry/clientreport/d;Lio/sentry/m;)V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/crypto/tink/internal/l0;->k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V

    return-void
.end method

.method public d0()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lal/d;

    iget-object v1, v0, Lal/d;->d:Lal/d;

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v1, Lal/d;->a:Ljava/lang/Object;

    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, v1, Lal/d;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-lez v2, :cond_1

    iget-object v4, v1, Lal/d;->b:Ljava/util/ArrayList;

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    :cond_1
    if-eqz v4, :cond_2

    return-object v4

    :cond_2
    iget-object v2, v1, Lal/d;->d:Lal/d;

    iget-object v4, v1, Lal/d;->c:Lal/d;

    iput-object v4, v2, Lal/d;->c:Lal/d;

    iget-object v4, v1, Lal/d;->c:Lal/d;

    iput-object v2, v4, Lal/d;->d:Lal/d;

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Lal/i;

    invoke-interface {v3}, Lal/i;->a()V

    iget-object v1, v1, Lal/d;->d:Lal/d;

    goto :goto_0

    :cond_3
    return-object v4
.end method

.method public e(Lhb3/a0;Lqa3/k0;)Ljava/util/List;
    .locals 3

    iget-object p2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p2, Lgb3/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lm83/y;->w:Lm83/y;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    iget-object v2, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v2, Lsa3/f;

    invoke-virtual {p0, v1, v2}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public e0(Lio/sentry/clientreport/b;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p1, Lio/sentry/clientreport/b;->x:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/clientreport/f;

    invoke-virtual {v0}, Lio/sentry/clientreport/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/sentry/clientreport/f;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/sentry/clientreport/f;->b()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public f(Lkh/a;Landroid/graphics/Bitmap;Ljava/util/Map;)V
    .locals 3

    invoke-static {p2}, Lpf/c;->w(Landroid/graphics/Bitmap;)I

    move-result v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lkh/e;

    iget-object v2, v1, La0/a0;->c:Lqt/e;

    monitor-enter v2

    :try_start_0
    iget v1, v1, La0/a0;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    if-gt v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lkh/e;

    new-instance v2, Lkh/d;

    invoke-direct {v2, p2, p3, v0}, Lkh/d;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    invoke-virtual {v1, p1, v2}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lkh/e;

    invoke-virtual {v1, p1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lbd3/v;

    invoke-virtual {v1, p1, p2, p3, v0}, Lbd3/v;->o(Lkh/a;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1
.end method

.method public f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 7

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/k;

    iget-object v4, v0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Lcom/google/crypto/tink/internal/l0;->g0(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V

    return-void
.end method

.method public g(Lhb3/y;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lhb3/y;->E:Lqa3/k;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lgb3/a;

    iget-object v1, v1, Lgb3/a;->c:Lwa3/o;

    invoke-virtual {v0, v1}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/h;

    iget-object v3, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v3, Lsa3/f;

    invoke-virtual {p0, v2, v3}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public g0(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->T()Lcom/iterable/iterableapi/l2;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Laj/c;

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/k;

    iget-object v1, v1, Lcom/iterable/iterableapi/k;->c:Ljava/lang/String;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/iterable/iterableapi/l2;->b(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V

    return-void
.end method

.method public h(Lhb3/a0;Lwa3/v;I)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lgb3/a;

    const-string v1, "proto"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "kind"

    invoke-static {p3, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    instance-of v1, p2, Lqa3/c0;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :cond_0
    instance-of v1, p2, Lqa3/k0;

    if-eqz v1, :cond_4

    invoke-static {p3}, Le4/p;->e(I)I

    move-result p2

    const/4 v1, 0x1

    if-eq p2, v1, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_2

    const/4 v1, 0x3

    if-ne p2, v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {p3}, Lev/n;->E(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Unsupported callable kind with property proto for receiver annotations: "

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    sget-object p2, Lm83/y;->w:Lm83/y;

    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa3/h;

    iget-object v1, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v1, Lsa3/f;

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    return-object p3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unknown message: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h0(I)V
    .locals 2

    iget v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x30

    if-eq p1, v0, :cond_1

    const/16 v0, 0x40

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    return-void

    :pswitch_0
    const/16 v0, 0x10

    if-eq p1, v0, :cond_3

    const/16 v0, 0x20

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 16-byte and 32-byte AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public varargs i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v0;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->o(Lio/sentry/n5;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1, p2, p3, p4}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public i0(Z)V
    .locals 1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/l2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Lcom/iterable/iterableapi/j2;

    if-eq p1, v0, :cond_2

    :cond_0
    new-instance p1, Lcom/iterable/iterableapi/j2;

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-direct {p1, v0}, Lcom/iterable/iterableapi/j2;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/l2;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Lcom/iterable/iterableapi/k2;

    if-eq p1, v0, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    new-instance p1, Lcom/iterable/iterableapi/k2;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    return-void
.end method

.method public j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v0;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->o(Lio/sentry/n5;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public j0(Ljc/l;I)V
    .locals 4

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lsc/a;

    new-instance v1, Lrc/i;

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Ljc/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3, p2}, Lrc/i;-><init>(Ljc/g;Ljc/l;ZI)V

    invoke-interface {v0, v1}, Lsc/a;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public k(Lio/sentry/clientreport/d;Lio/sentry/m;J)V
    .locals 1

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->L()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p2, Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 p4, 0x0

    new-array p4, p4, [Ljava/lang/Object;

    const-string v0, "Unable to record lost event."

    invoke-interface {p2, p3, p1, v0, p4}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public k0(Llb3/a1;Ljava/util/List;Lka3/a;)Ln83/i;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    new-instance v3, Ln83/i;

    invoke-direct {v3}, Ln83/i;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llb3/y;

    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->d()Lr93/h;

    move-result-object v5

    instance-of v6, v5, Lr93/e;

    if-eqz v6, :cond_14

    invoke-virtual {v2}, Lka3/a;->e()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v4}, Llb3/y;->p0()Llb3/f1;

    move-result-object v5

    instance-of v6, v5, Llb3/r;

    const-string v9, "getType(...)"

    const/16 v11, 0xa

    const-string v12, "getParameters(...)"

    if-eqz v6, :cond_c

    move-object v6, v5

    check-cast v6, Llb3/r;

    iget-object v14, v6, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v14}, Llb3/y;->i0()Llb3/q0;

    move-result-object v15

    invoke-interface {v15}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_5

    invoke-virtual {v14}, Llb3/y;->i0()Llb3/q0;

    move-result-object v15

    invoke-interface {v15}, Llb3/q0;->d()Lr93/h;

    move-result-object v15

    if-nez v15, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v14}, Llb3/y;->i0()Llb3/q0;

    move-result-object v15

    invoke-interface {v15}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v15

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v15, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lr93/x0;

    invoke-virtual {v4}, Llb3/y;->X()Ljava/util/List;

    move-result-object v11

    invoke-interface {v15}, Lr93/x0;->getIndex()I

    move-result v8

    invoke-static {v8, v11}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Llb3/u0;

    if-eqz v2, :cond_1

    invoke-interface {v2, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    const/4 v11, 0x1

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    :goto_1
    if-eqz v8, :cond_2

    if-nez v11, :cond_2

    invoke-virtual {v1}, Llb3/a1;->f()Llb3/y0;

    move-result-object v11

    invoke-virtual {v8}, Llb3/u0;->b()Llb3/y;

    move-result-object v13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11, v13}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object v11

    if-nez v11, :cond_3

    :cond_2
    new-instance v8, Llb3/h0;

    invoke-direct {v8, v15}, Llb3/h0;-><init>(Lr93/x0;)V

    :cond_3
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v11, 0xa

    goto :goto_0

    :cond_4
    const/4 v8, 0x2

    const/4 v11, 0x0

    invoke-static {v14, v10, v11, v8}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v14

    :cond_5
    :goto_2
    iget-object v6, v6, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_b

    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->d()Lr93/h;

    move-result-object v7

    if-nez v7, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v7, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr93/x0;

    invoke-virtual {v4}, Llb3/y;->X()Ljava/util/List;

    move-result-object v11

    invoke-interface {v10}, Lr93/x0;->getIndex()I

    move-result v12

    invoke-static {v12, v11}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Llb3/u0;

    if-eqz v2, :cond_7

    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/4 v12, 0x1

    goto :goto_4

    :cond_7
    const/4 v12, 0x0

    :goto_4
    if-eqz v11, :cond_8

    if-nez v12, :cond_8

    invoke-virtual {v1}, Llb3/a1;->f()Llb3/y0;

    move-result-object v12

    invoke-virtual {v11}, Llb3/u0;->b()Llb3/y;

    move-result-object v13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object v12

    if-nez v12, :cond_9

    :cond_8
    new-instance v11, Llb3/h0;

    invoke-direct {v11, v10}, Llb3/h0;-><init>(Lr93/x0;)V

    :cond_9
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static {v6, v8, v11, v10}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v6

    :cond_b
    :goto_5
    invoke-static {v14, v6}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v2

    goto/16 :goto_9

    :cond_c
    instance-of v6, v5, Llb3/c0;

    if-eqz v6, :cond_13

    move-object v6, v5

    check-cast v6, Llb3/c0;

    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_12

    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->d()Lr93/h;

    move-result-object v7

    if-nez v7, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v6}, Llb3/y;->i0()Llb3/q0;

    move-result-object v7

    invoke-interface {v7}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v7

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v7, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr93/x0;

    invoke-virtual {v4}, Llb3/y;->X()Ljava/util/List;

    move-result-object v11

    invoke-interface {v10}, Lr93/x0;->getIndex()I

    move-result v12

    invoke-static {v12, v11}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Llb3/u0;

    if-eqz v2, :cond_e

    invoke-interface {v2, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/4 v12, 0x1

    goto :goto_7

    :cond_e
    const/4 v12, 0x0

    :goto_7
    if-eqz v11, :cond_f

    if-nez v12, :cond_f

    invoke-virtual {v1}, Llb3/a1;->f()Llb3/y0;

    move-result-object v12

    invoke-virtual {v11}, Llb3/u0;->b()Llb3/y;

    move-result-object v13

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v13}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object v12

    if-nez v12, :cond_10

    :cond_f
    new-instance v11, Llb3/h0;

    invoke-direct {v11, v10}, Llb3/h0;-><init>(Lr93/x0;)V

    :cond_10
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_11
    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static {v6, v8, v11, v10}, Lse/a;->X(Llb3/c0;Ljava/util/List;Llb3/k0;I)Llb3/c0;

    move-result-object v2

    goto :goto_9

    :cond_12
    :goto_8
    move-object v2, v6

    :goto_9
    invoke-static {v2, v5}, Llb3/o;->d(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object v2

    sget-object v4, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {v1, v2, v4}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v1

    invoke-virtual {v3, v1}, Ln83/i;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_14
    instance-of v4, v5, Lr93/x0;

    if-eqz v4, :cond_16

    invoke-virtual {v2}, Lka3/a;->e()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_15

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x1

    if-ne v4, v6, :cond_15

    invoke-virtual {v0, v2}, Lcom/google/crypto/tink/internal/l0;->N(Lka3/a;)Llb3/f1;

    move-result-object v1

    invoke-virtual {v3, v1}, Ln83/i;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_15
    check-cast v5, Lr93/x0;

    invoke-interface {v5}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v4

    const-string v5, "getUpperBounds(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v4, v2}, Lcom/google/crypto/tink/internal/l0;->k0(Llb3/a1;Ljava/util/List;Lka3/a;)Ln83/i;

    move-result-object v1

    invoke-virtual {v3, v1}, Ln83/i;->addAll(Ljava/util/Collection;)Z

    :cond_16
    :goto_a
    invoke-static {v3}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v1

    return-object v1
.end method

.method public l()Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v0;

    const-string v1, "sentry-debug-meta.properties"

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-virtual {v2, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v2, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catchall_0
    move-exception v2

    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "%s file is malformed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v3, v2, v4, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :goto_2
    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error getting Proguard UUIDs."

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_2
    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "%s file was not found."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public l0(Lorg/json/JSONObject;)V
    .locals 4

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Laj/c;

    iget-object v2, v2, Laj/c;->x:Ljava/lang/Object;

    check-cast v2, Lcom/iterable/iterableapi/k;

    iget-object v3, v2, Lcom/iterable/iterableapi/k;->d:Ljava/lang/String;

    if-nez v3, :cond_1

    iget-object v3, v2, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    if-nez v3, :cond_0

    iget-object v2, v2, Lcom/iterable/iterableapi/k;->e:Ljava/lang/String;

    if-eqz v2, :cond_1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const-string v2, "preferUserId"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_1
    const-string v2, "dataFields"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "mergeNestedObjects"

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "users/update"

    invoke-virtual {p0, p1, v1}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public varargs m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v0;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->o(Lio/sentry/n5;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public varargs m0([Ljava/lang/Object;)V
    .locals 6

    sget-object v4, Lhj/x;->E:Lhj/x;

    const/16 v5, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lhj/v;->y:Lhj/v;

    invoke-virtual {p0, v0, p1}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    return-void
.end method

.method public n(Lio/sentry/clientreport/d;Lio/sentry/c5;)V
    .locals 10

    const-wide/16 v0, 0x1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v3, Lio/sentry/q6;

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p2, Lio/sentry/c5;->a:Lio/sentry/d5;

    iget-object v5, v5, Lio/sentry/d5;->E:Lio/sentry/m5;

    sget-object v6, Lio/sentry/m5;->ClientReport:Lio/sentry/m5;

    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_1

    :try_start_1
    invoke-virtual {v3}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/sentry/c5;->e(Lio/sentry/j1;)Lio/sentry/clientreport/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->e0(Lio/sentry/clientreport/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_0

    :catch_0
    :try_start_2
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Unable to restore counts from previous client report."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    invoke-static {v5}, Lcom/google/crypto/tink/internal/l0;->E(Lio/sentry/m5;)Lio/sentry/m;

    move-result-object v5

    sget-object v6, Lio/sentry/m;->Transaction:Lio/sentry/m;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v3}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v6

    invoke-virtual {p2, v6}, Lio/sentry/c5;->i(Lio/sentry/j1;)Lio/sentry/protocol/d0;

    move-result-object p2

    if-eqz p2, :cond_2

    iget-object p2, p2, Lio/sentry/protocol/d0;->S:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lio/sentry/m;->Span:Lio/sentry/m;

    invoke-virtual {v7}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v8

    int-to-long v8, v8

    add-long/2addr v8, v0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v6, v7, v0}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->L()V

    :cond_2
    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v2}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->L()V

    goto/16 :goto_1

    :cond_3
    sget-object v0, Lio/sentry/m;->LogItem:Lio/sentry/m;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v3}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/sentry/c5;->g(Lio/sentry/j1;)Lio/sentry/s5;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, v0, Lio/sentry/s5;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v2, v5, v0}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p2}, Lio/sentry/c5;->f()[B

    move-result-object p2

    array-length p2, p2

    int-to-long v0, p2

    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lio/sentry/m;->LogByte:Lio/sentry/m;

    invoke-virtual {p2}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->L()V

    goto :goto_1

    :cond_4
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Unable to parse lost logs envelope item."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    sget-object v0, Lio/sentry/m;->TraceMetric:Lio/sentry/m;

    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v3}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/sentry/c5;->h(Lio/sentry/j1;)Lio/sentry/w5;

    move-result-object p2

    if-eqz p2, :cond_6

    iget-object p2, p2, Lio/sentry/w5;->w:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->L()V

    goto :goto_1

    :cond_6
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Unable to parse lost metrics envelope item."

    new-array v1, v4, [Ljava/lang/Object;

    invoke-interface {p1, p2, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lio/sentry/clientreport/d;->getReason()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5}, Lio/sentry/m;->getCategory()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v2}, Lcom/google/crypto/tink/internal/l0;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/l0;->L()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_0
    invoke-virtual {v3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Unable to record lost envelope item."

    new-array v2, v4, [Ljava/lang/Object;

    invoke-interface {p2, v0, p1, v1, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public o(Lio/sentry/n5;)Z
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getDiagnosticLevel()Lio/sentry/n5;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Lio/sentry/q6;->isDebug()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-lt p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public p(Lkh/a;)Lkh/b;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lkh/e;

    invoke-virtual {v0, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkh/d;

    if-eqz p1, :cond_0

    new-instance v0, Lkh/b;

    iget-object v1, p1, Lkh/d;->a:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lkh/d;->b:Ljava/util/Map;

    invoke-direct {v0, v1, p1}, Lkh/b;-><init>(Landroid/graphics/Bitmap;Ljava/util/Map;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public q(Lhb3/a0;Lwa3/v;I)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lgb3/a;

    const-string v1, "proto"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "kind"

    invoke-static {p3, v1}, Lih0/d0;->w(ILjava/lang/String;)V

    instance-of v1, p2, Lqa3/o;

    if-eqz v1, :cond_0

    check-cast p2, Lqa3/o;

    iget-object p3, v0, Lgb3/a;->b:Lwa3/o;

    invoke-virtual {p2, p3}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_0

    :cond_0
    instance-of v1, p2, Lqa3/c0;

    if-eqz v1, :cond_1

    check-cast p2, Lqa3/c0;

    iget-object p3, v0, Lgb3/a;->d:Lwa3/o;

    invoke-virtual {p2, p3}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_0

    :cond_1
    instance-of v1, p2, Lqa3/k0;

    if-eqz v1, :cond_7

    invoke-static {p3}, Le4/p;->e(I)I

    move-result p3

    const/4 v1, 0x1

    if-eq p3, v1, :cond_4

    const/4 v1, 0x2

    if-eq p3, v1, :cond_3

    const/4 v1, 0x3

    if-ne p3, v1, :cond_2

    check-cast p2, Lqa3/k0;

    iget-object p3, v0, Lgb3/a;->g:Lwa3/o;

    invoke-virtual {p2, p3}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unsupported callable kind with property proto"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    check-cast p2, Lqa3/k0;

    iget-object p3, v0, Lgb3/a;->f:Lwa3/o;

    invoke-virtual {p2, p3}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    goto :goto_0

    :cond_4
    check-cast p2, Lqa3/k0;

    iget-object p3, v0, Lgb3/a;->e:Lwa3/o;

    invoke-virtual {p2, p3}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    :goto_0
    if-nez p2, :cond_5

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_5
    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa3/h;

    iget-object v1, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v1, Lsa3/f;

    invoke-virtual {p0, v0, v1}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object p3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Unknown message: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public r(Lqa3/b1;Lsa3/f;)Ljava/util/ArrayList;
    .locals 2

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lgb3/a;

    iget-object v0, v0, Lgb3/a;->l:Lwa3/o;

    invoke-virtual {p1, v0}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    invoke-virtual {p0, v1, p2}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public request(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lch3/s0;

    iget-object v1, v0, Lch3/s0;->I:Ljava/lang/Thread;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    if-eq v1, v2, :cond_1

    iget-boolean v1, v0, Lch3/s0;->F:Z

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lch3/s0;->G:Lxg3/j;

    new-instance v1, Lch3/r0;

    invoke-direct {v1, p0, p1, p2}, Lch3/r0;-><init>(Lcom/google/crypto/tink/internal/l0;J)V

    invoke-virtual {v0, v1}, Lxg3/j;->c(Lbh3/a;)Lxg3/t;

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lxg3/i;

    invoke-interface {v0, p1, p2}, Lxg3/i;->request(J)V

    return-void
.end method

.method public s(Lhb3/a0;Lqa3/x;)Ljava/util/List;
    .locals 3

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lgb3/a;

    iget-object v0, v0, Lgb3/a;->h:Lwa3/o;

    invoke-virtual {p2, v0}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_0

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/h;

    iget-object v2, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast v2, Lsa3/f;

    invoke-virtual {p0, v1, v2}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public t(Lhb3/a0;Lqa3/k0;Llb3/y;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lgb3/a;

    iget-object v0, v0, Lgb3/a;->i:Lwa3/o;

    invoke-static {p2, v0}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqa3/e;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lwe/o;

    iget-object p1, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast p1, Lsa3/f;

    invoke-virtual {v0, p3, p2, p1}, Lwe/o;->R(Llb3/y;Lqa3/e;Lsa3/f;)Lab3/g;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/google/crypto/tink/internal/l0;->w:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Lf4/f;

    const-string v1, "[ "

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    invoke-static {v1}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Lf4/f;

    iget-object v2, v2, Lf4/f;->H:[F

    aget v2, v2, v0

    const-string v3, " "

    invoke-static {v2, v3, v1}, Lq63/c;->g(FLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "] "

    invoke-static {v1, v0}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lf4/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GroupedLinkedMap( "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lal/d;

    iget-object v2, v1, Lal/d;->c:Lal/d;

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const/16 v4, 0x7b

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lal/d;->a:Ljava/lang/Object;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lal/d;->b:Ljava/util/ArrayList;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    goto :goto_2

    :cond_1
    move v4, v3

    :goto_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "}, "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lal/d;->c:Lal/d;

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0xb -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Lio/sentry/clientreport/d;Lcom/google/crypto/tink/internal/l0;)V
    .locals 3

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object p2, p2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/c5;

    invoke-virtual {p0, p1, v0}, Lcom/google/crypto/tink/internal/l0;->n(Lio/sentry/clientreport/d;Lio/sentry/c5;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    return-void

    :goto_2
    iget-object p2, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast p2, Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unable to record lost envelope."

    invoke-interface {p2, v0, p1, v2, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public v(Lhb3/a0;Lwa3/v;IILqa3/e1;)Ljava/util/List;
    .locals 1

    const-string v0, "callableProto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lih0/d0;->w(ILjava/lang/String;)V

    if-eqz p5, :cond_0

    invoke-virtual/range {p0 .. p5}, Lcom/google/crypto/tink/internal/l0;->w(Lhb3/a0;Lwa3/v;IILqa3/e1;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_1
    return-object p1
.end method

.method public w(Lhb3/a0;Lwa3/v;IILqa3/e1;)Ljava/util/List;
    .locals 0

    const-string p4, "callableProto"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "kind"

    invoke-static {p3, p2}, Lih0/d0;->w(ILjava/lang/String;)V

    const-string p2, "proto"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast p2, Lgb3/a;

    iget-object p2, p2, Lgb3/a;->j:Lwa3/o;

    invoke-virtual {p5, p2}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_0

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 p4, 0xa

    invoke-static {p2, p4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p4

    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lqa3/h;

    iget-object p5, p1, Lhb3/a0;->x:Ljava/lang/Object;

    check-cast p5, Lsa3/f;

    invoke-virtual {p0, p4, p5}, Lcom/google/crypto/tink/internal/l0;->Y(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p3
.end method

.method public x(Lva3/c;)Lhb3/d;
    .locals 3

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    iget-object v1, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Loa3/f;

    invoke-virtual {v1}, Loa3/f;->c()Lhb3/i;

    move-result-object v2

    iget-object v2, v2, Lhb3/i;->c:Lhb3/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lsa3/e;->g:Lsa3/e;

    invoke-static {v0, p1, v2}, Lds/p;->D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v2, v0, Lw93/b;->a:Ljava/lang/Class;

    invoke-static {v2}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object v2

    invoke-virtual {v2, p1}, Lva3/c;->equals(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0}, Loa3/f;->g(Lw93/b;)Lhb3/d;

    move-result-object p1

    return-object p1
.end method

.method public y(Lcom/google/crypto/tink/internal/l0;)Lcom/google/crypto/tink/internal/l0;
    .locals 10

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v2, Lbu/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v2, Lbu/c;->w:Ljava/lang/Object;

    check-cast v2, Lio/sentry/util/f;

    invoke-virtual {v2}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v6, 0x0

    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    cmp-long v6, v8, v6

    if-lez v6, :cond_0

    new-instance v6, Lio/sentry/clientreport/f;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/sentry/clientreport/c;

    iget-object v7, v7, Lio/sentry/clientreport/c;->a:Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/clientreport/c;

    iget-object v4, v4, Lio/sentry/clientreport/c;->b:Ljava/lang/String;

    invoke-direct {v6, v7, v4, v5}, Lio/sentry/clientreport/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    new-instance v2, Lio/sentry/clientreport/b;

    invoke-direct {v2, v1, v3}, Lio/sentry/clientreport/b;-><init>(Ljava/util/Date;Ljava/util/ArrayList;)V

    move-object v1, v2

    :goto_1
    if-nez v1, :cond_3

    return-object p1

    :cond_3
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "Attaching client report to envelope."

    new-array v6, v2, [Ljava/lang/Object;

    invoke-interface {v3, v4, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p1, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/c5;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v4

    invoke-static {v4, v1}, Lio/sentry/c5;->b(Lio/sentry/j1;Lio/sentry/clientreport/b;)Lio/sentry/c5;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    iget-object v4, p1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v4, Lio/sentry/w4;

    invoke-direct {v1, v4, v3}, Lcom/google/crypto/tink/internal/l0;-><init>(Lio/sentry/w4;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :goto_3
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Unable to attach client report to envelope."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v3, v1, v4, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public z(Lhb3/a0;Lqa3/k0;Llb3/y;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
