.class public La30/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/p0;
.implements Lio/sentry/logger/a;
.implements Lto/n;
.implements Luu/a;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x13

    iput v0, p0, La30/w0;->w:I

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    const-string v0, ""

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 50
    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 51
    sget-object v1, Lx23/f;->w:Lx23/f;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, La30/w0;->z:Ljava/lang/Object;

    .line 52
    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    .line 53
    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    .line 54
    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, La30/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, La30/w0;->w:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 105
    const-string p1, "ServiceTriggers"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 106
    new-instance p1, Lj43/g;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lj43/g;-><init>(I)V

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    .line 107
    new-instance p2, Lqg3/d;

    invoke-direct {p2, p1}, Lqg3/d;-><init>(Lj43/g;)V

    iput-object p2, p0, La30/w0;->E:Ljava/lang/Object;

    .line 108
    new-instance p1, Lng3/o;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lng3/o;-><init>(I)V

    iput-object p1, p0, La30/w0;->F:Ljava/lang/Object;

    .line 109
    new-instance p1, Lg43/e;

    invoke-direct {p1}, Lg43/e;-><init>()V

    iput-object p1, p0, La30/w0;->G:Ljava/lang/Object;

    return-void

    .line 110
    :pswitch_0
    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 112
    const-string p1, "CallSoundPlayer"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 113
    sget-object p1, Lk53/a;->w:Lk53/a;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    .line 114
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La30/w0;->G:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroidx/lifecycle/j;Lc93/m;Lhc3/d;La1/j;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La30/w0;->w:I

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 120
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 121
    check-cast p2, Ls83/i;

    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 122
    iput-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    .line 123
    iput-object p4, p0, La30/w0;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldg/a;Ljava/util/ArrayList;Luf/v;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, La30/w0;->w:I

    const-string v0, "execContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 117
    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 118
    iput-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lev/i;Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lq30/q0;Ljava/security/KeyPair;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, La30/w0;->w:I

    const-string v0, "directoryServerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directoryServerPublicKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransactionId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, La30/w0;->z:Ljava/lang/Object;

    .line 6
    iput-object p3, p0, La30/w0;->y:Ljava/lang/Object;

    .line 7
    iput-object p4, p0, La30/w0;->E:Ljava/lang/Object;

    .line 8
    iput-object p5, p0, La30/w0;->F:Ljava/lang/Object;

    .line 9
    iput-object p6, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh/i;Landroid/app/Activity;Landroidx/lifecycle/g0;Landroid/app/Application;Lg32/n;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, La30/w0;->w:I

    const-string v0, "activityResultLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 57
    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 58
    iput-object p3, p0, La30/w0;->E:Ljava/lang/Object;

    .line 59
    iput-object p4, p0, La30/w0;->F:Ljava/lang/Object;

    .line 60
    iput-object p5, p0, La30/w0;->G:Ljava/lang/Object;

    .line 61
    iput-object p6, p0, La30/w0;->z:Ljava/lang/Object;

    .line 62
    invoke-interface {p3}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    .line 63
    new-instance p2, Le10/q0;

    const/4 p3, 0x2

    invoke-direct {p2, p0, p3}, Le10/q0;-><init>(Ljava/lang/Object;I)V

    .line 64
    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public constructor <init>(Lh20/l1;Lv00/p;Ljava/lang/String;Lv00/j0;Lux/b;Lbc3/i0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La30/w0;->w:I

    const-string v0, "billingDetailsCollectionConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localSavedSelection"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 43
    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 44
    iput-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    .line 45
    iput-object p4, p0, La30/w0;->E:Ljava/lang/Object;

    .line 46
    iput-object p5, p0, La30/w0;->F:Ljava/lang/Object;

    .line 47
    iput-object p6, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;Lcd3/g;)V
    .locals 4

    const/4 v0, 0x7

    iput v0, p0, La30/w0;->w:I

    .line 94
    new-instance v0, Lio/sentry/h5;

    invoke-direct {v0, p1}, Lio/sentry/h5;-><init>(Lio/sentry/q6;)V

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v1, Lio/sentry/util/a;

    .line 97
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 98
    iput-object v1, p0, La30/w0;->F:Ljava/lang/Object;

    .line 99
    new-instance v1, Laj/c;

    const/16 v2, 0x11

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Laj/c;-><init>(IB)V

    iput-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    .line 100
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 101
    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 102
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    .line 103
    iput-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p7, p0, La30/w0;->w:I

    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    iput-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    iput-object p4, p0, La30/w0;->E:Ljava/lang/Object;

    iput-object p5, p0, La30/w0;->F:Ljava/lang/Object;

    iput-object p6, p0, La30/w0;->G:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lrm/m1;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, La30/w0;->w:I

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 126
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 127
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    .line 128
    iput-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 129
    sget-object p1, Lzr/b1;->G:Lzr/b1;

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt23/c0;Lt23/b4;Lhc3/d;Lio/sentry/internal/debugmeta/c;Lc2/q;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, La30/w0;->w:I

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 89
    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 90
    iput-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    .line 91
    iput-object p4, p0, La30/w0;->E:Ljava/lang/Object;

    .line 92
    iput-object p5, p0, La30/w0;->F:Ljava/lang/Object;

    .line 93
    const-string p1, "NotificationUpdateObserver"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt23/n0;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, La30/w0;->w:I

    .line 78
    new-instance v0, Lt9/c0;

    .line 79
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    .line 82
    iput-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 83
    sget-object p1, Lm83/z;->w:Lm83/z;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    .line 84
    iput-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    .line 85
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, La30/w0;->F:Ljava/lang/Object;

    .line 86
    iput-object p1, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu8/m0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La30/w0;->w:I

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 132
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 133
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    .line 134
    iput-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 135
    sget-object p1, Lzr/b1;->G:Lzr/b1;

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Luu/b;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, La30/w0;->w:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iget-object v0, p1, Luu/b;->a:Ljava/lang/String;

    .line 67
    iput-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    .line 68
    iget-object v0, p1, Luu/b;->c:Ljava/util/ArrayList;

    .line 69
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    .line 70
    iget-object v0, p1, Luu/b;->d:Ljava/util/ArrayList;

    .line 71
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    .line 72
    iget-object v0, p1, Luu/b;->e:Ljava/util/ArrayList;

    .line 73
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    .line 74
    iget-object v0, p1, Luu/b;->b:Ljava/util/ArrayList;

    .line 75
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    .line 76
    iget-object p1, p1, Luu/b;->f:Lcom/mapbox/maps/TransitionOptions;

    .line 77
    iput-object p1, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lv00/c0;Lh20/f;Ls10/f;Lh20/z4;Lk20/a;Lk83/a;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, La30/w0;->w:I

    const-string v0, "paymentMethodMetadata"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerStateHolder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionHolder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedPaymentMethodMutator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageNavigatorProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    .line 37
    iput-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    .line 38
    iput-object p4, p0, La30/w0;->E:Ljava/lang/Object;

    .line 39
    iput-object p5, p0, La30/w0;->F:Ljava/lang/Object;

    .line 40
    iput-object p6, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvd/f;)V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, La30/w0;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Lvd/f;->r()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 14
    check-cast v3, Ll83/k;

    .line 15
    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    .line 16
    check-cast v3, Ljava/lang/String;

    .line 17
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_0
    iput-object v1, p0, La30/w0;->x:Ljava/lang/Object;

    .line 19
    invoke-virtual {p1}, Lvd/f;->r()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 22
    check-cast v2, Ll83/k;

    .line 23
    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    .line 24
    check-cast v2, Ljava/lang/String;

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 26
    :cond_1
    iput-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    .line 27
    new-instance v0, Lg40/n0;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lg40/n0;-><init>(Z)V

    iput-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    .line 28
    invoke-virtual {p1}, Lvd/f;->t()I

    move-result p1

    new-array v0, v2, [Ljava/lang/Object;

    .line 29
    sget-object v2, Lm83/y;->w:Lm83/y;

    .line 30
    invoke-static {p1, v0, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    .line 31
    iput-object p1, p0, La30/w0;->E:Ljava/lang/Object;

    .line 32
    iget-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    iput-object p1, p0, La30/w0;->F:Ljava/lang/Object;

    .line 33
    iput-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    return-void
.end method

.method public static K(Lvf/a;Lvf/a;Lsf/e;)V
    .locals 2

    invoke-interface {p1}, Lvf/a;->getUrl()Lcg/o;

    move-result-object v0

    invoke-interface {p0}, Lvf/a;->getUrl()Lcg/o;

    move-result-object p0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    iget-object p0, p2, Lsf/e;->c:Ldg/a;

    sget-object p2, Lbf/c;->E:Lbf/c;

    invoke-static {p0, p2}, Lbf/b;->a(Ldg/a;Lbf/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lvf/a;->getUrl()Lcg/o;

    move-result-object p1

    iget-object p1, p1, Lcg/o;->h:Ljava/lang/String;

    iget-object v0, p0, Ldg/a;->y:Lgf/c;

    sget-object v1, Lbf/b;->b:Lgf/a;

    invoke-static {v0, v1}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p0, p2}, Lbf/b;->f(Ldg/a;Lbf/c;)V

    :cond_0
    sget-object p1, Lbf/c;->z:Lbf/c;

    invoke-static {p0, p1}, Lbf/b;->a(Ldg/a;Lbf/c;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1}, Lbf/b;->f(Ldg/a;Lbf/c;)V

    :cond_1
    return-void
.end method

.method public static final c(La30/w0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Lt23/c0;

    instance-of v3, v1, Ln43/d;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ln43/d;

    iget v4, v3, Ln43/d;->F:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ln43/d;->F:I

    goto :goto_0

    :cond_0
    new-instance v3, Ln43/d;

    invoke-direct {v3, v0, v1}, Ln43/d;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object v1, v3, Ln43/d;->z:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ln43/d;->F:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Ln43/d;->y:Lt23/d3;

    iget-object v2, v3, Ln43/d;->x:Landroid/content/Context;

    iget-object v3, v3, Ln43/d;->w:La30/w0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v1

    move-object v1, v0

    move-object v0, v3

    move-object/from16 v3, v18

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v2, Lt23/c0;->p:Lt23/s0;

    iget-object v1, v1, Lt23/s0;->G:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt23/d3;

    iget-object v5, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v5, Lt23/b4;

    iput-object v0, v3, Ln43/d;->w:La30/w0;

    move-object/from16 v7, p1

    iput-object v7, v3, Ln43/d;->x:Landroid/content/Context;

    iput-object v1, v3, Ln43/d;->y:Lt23/d3;

    iput v6, v3, Ln43/d;->F:I

    invoke-virtual {v5, v2, v3}, Lt23/b4;->e(Lt23/c0;Ln43/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3

    return-object v4

    :cond_3
    move-object v3, v2

    move-object v2, v7

    :goto_1
    check-cast v3, Landroid/app/Notification;

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v4

    iget-object v5, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v5, Lc2/q;

    iget-object v7, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    const/4 v10, 0x0

    if-eqz v7, :cond_5

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v11, "[updateNotification] ringingState: "

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", notification: "

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v9, v8, v6, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    if-eqz v3, :cond_f

    iget-object v4, v0, La30/w0;->E:Ljava/lang/Object;

    check-cast v4, Lio/sentry/internal/debugmeta/c;

    new-instance v11, Lio/getstream/video/android/model/StreamCallId;

    iget-object v6, v0, La30/w0;->x:Ljava/lang/Object;

    check-cast v6, Lt23/c0;

    iget-object v12, v6, Lt23/c0;->b:Ljava/lang/String;

    iget-object v7, v6, Lt23/c0;->p:Lt23/s0;

    iget-object v13, v6, Lt23/c0;->c:Ljava/lang/String;

    const/16 v16, 0xc

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lio/getstream/video/android/model/StreamCallId;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    instance-of v6, v1, Lt23/x2;

    if-eqz v6, :cond_8

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v9, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[showActiveCallNotification] Showing active call notification"

    invoke-interface {v1, v9, v4, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    iget-object v1, v7, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_7
    sget-object v1, Le43/k;->b:Le43/k;

    invoke-virtual {v11, v1}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v1

    :goto_3
    iget-object v0, v0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lt23/b4;

    invoke-virtual {v0}, Lt23/b4;->c()Ld1/j;

    move-result-object v0

    invoke-virtual {v0, v1, v3, v11}, Ld1/j;->C(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    goto/16 :goto_6

    :cond_8
    instance-of v6, v1, Lt23/a3;

    if-eqz v6, :cond_b

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v9, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[showOutgoingCallNotification] Showing outgoing call notification"

    invoke-interface {v0, v9, v6, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iget-object v0, v7, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    :cond_a
    sget-object v0, Le43/l;->b:Le43/l;

    invoke-virtual {v11, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    :goto_4
    const-string v1, "outgoing_call"

    invoke-virtual {v4, v2, v1}, Lio/sentry/internal/debugmeta/c;->u(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v0, v3, v1, v2}, Lc2/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    :cond_b
    instance-of v6, v1, Lt23/z2;

    if-eqz v6, :cond_e

    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v9, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[showIncomingCallNotification] Showing incoming call notification"

    invoke-interface {v0, v9, v6, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iget-object v0, v7, Lt23/s0;->y0:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_5

    :cond_d
    sget-object v0, Le43/i;->b:Le43/i;

    invoke-virtual {v11, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    :goto_5
    const-string v1, "incoming_call"

    invoke-virtual {v4, v2, v1}, Lio/sentry/internal/debugmeta/c;->u(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v0, v3, v1, v2}, Lc2/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_e
    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v9, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "[updateNotification] Unhandled ringing state: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v9, v3, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :cond_f
    invoke-virtual {v0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->E:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[updateNotification] No notification generated"

    invoke-interface {v0, v3, v2, v1, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static h(Ljava/util/LinkedHashMap;Lstream/video/sfu/models/Participant;ZLjava/util/Map;Lt9/c0;)Z
    .locals 5

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getSession_id()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_2
    new-instance p3, Lv43/a;

    new-instance p4, Lv33/s;

    invoke-virtual {p1}, Lstream/video/sfu/models/Participant;->getUser_id()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1, p2}, Lv33/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljg3/p;->F:Ljg3/p;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Ljg3/c;->H:Ljg3/c;

    const-wide/16 v2, 0x3e8

    invoke-static {v0, v1, v2, v3}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v2

    const/16 v4, 0x3e8

    invoke-static {v4, v0, v1}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v0

    const v1, 0xf4240

    mul-int/2addr v0, v1

    invoke-static {v0, v2, v3}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v0

    invoke-virtual {p1}, Ljg3/o;->k()Log3/h;

    move-result-object p1

    invoke-virtual {p1, v0}, Log3/h;->a(Ljg3/c;)Ljg3/p;

    move-result-object p1

    invoke-static {v0, p1}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object p1

    sget-object v0, Lv43/b;->w:Lv43/b;

    invoke-direct {p3, p4, p1}, Lv43/a;-><init>(Lv33/s;Ljg3/i;)V

    invoke-interface {p0, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method public static n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V
    .locals 1

    invoke-interface {p1, p2}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, " invalid type conversion: found "

    invoke-static {p0, v0}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; expected "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static o(Lu8/j0;Lzr/g0;Ll9/c0;Lu8/m0;)Ll9/c0;
    .locals 11

    check-cast p0, Lb9/f0;

    invoke-virtual {p0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v0

    invoke-virtual {p0}, Lb9/f0;->L0()V

    iget-object v1, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->a:Lu8/o0;

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lb9/f0;->I0:Lb9/c1;

    iget-object v3, v1, Lb9/c1;->a:Lu8/o0;

    iget-object v1, v1, Lb9/c1;->b:Ll9/c0;

    iget-object v1, v1, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {v3, v1}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move-object v6, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lu8/o0;->l(I)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    :goto_1
    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lu8/o0;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v1, p3, v2}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-result-object v0

    invoke-virtual {p0}, Lb9/f0;->a0()J

    move-result-wide v7

    invoke-static {v7, v8}, Lx8/t;->J(J)J

    move-result-wide v7

    iget-wide v9, p3, Lu8/m0;->e:J

    sub-long/2addr v7, v9

    invoke-virtual {v0, v7, v8}, Lu8/m0;->b(J)I

    move-result p3

    :goto_2
    move v10, p3

    goto :goto_4

    :cond_3
    :goto_3
    const/4 p3, -0x1

    goto :goto_2

    :goto_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Ll9/c0;

    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v7

    invoke-virtual {p0}, Lb9/f0;->X()I

    move-result v8

    invoke-virtual {p0}, Lb9/f0;->Y()I

    move-result v9

    invoke-static/range {v5 .. v10}, La30/w0;->s(Ll9/c0;Ljava/lang/Object;ZIII)Z

    move-result p3

    if-eqz p3, :cond_4

    return-object v5

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lb9/f0;->l0()Z

    move-result v7

    invoke-virtual {p0}, Lb9/f0;->X()I

    move-result v8

    invoke-virtual {p0}, Lb9/f0;->Y()I

    move-result v9

    move-object v5, p2

    invoke-static/range {v5 .. v10}, La30/w0;->s(Ll9/c0;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_6

    return-object v5

    :cond_6
    return-object v4
.end method

.method public static p(Lrm/b1;Lzr/g0;Lsn/v;Lrm/m1;)Lsn/v;
    .locals 11

    check-cast p0, Lrm/u;

    invoke-virtual {p0}, Lrm/u;->b0()Lrm/o1;

    move-result-object v0

    invoke-virtual {p0}, Lrm/u;->B0()V

    iget-object v1, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v1, v1, Lrm/v0;->a:Lrm/o1;

    invoke-virtual {v1}, Lrm/o1;->p()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lrm/u;->K0:Lrm/v0;

    iget-object v3, v1, Lrm/v0;->a:Lrm/o1;

    iget-object v1, v1, Lrm/v0;->b:Lsn/v;

    iget-object v1, v1, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {v3, v1}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v1

    :goto_0
    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move-object v6, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lrm/o1;->l(I)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    :goto_1
    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lrm/o1;->p()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v1, p3, v2}, Lrm/o1;->f(ILrm/m1;Z)Lrm/m1;

    move-result-object v0

    invoke-virtual {p0}, Lrm/u;->Z()J

    move-result-wide v7

    invoke-static {v7, v8}, Llo/y;->z(J)J

    move-result-wide v7

    iget-wide v9, p3, Lrm/m1;->E:J

    sub-long/2addr v7, v9

    invoke-virtual {v0, v7, v8}, Lrm/m1;->b(J)I

    move-result p3

    :goto_2
    move v10, p3

    goto :goto_4

    :cond_3
    :goto_3
    const/4 p3, -0x1

    goto :goto_2

    :goto_4
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge v2, p3, :cond_5

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Lsn/v;

    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v7

    invoke-virtual {p0}, Lrm/u;->W()I

    move-result v8

    invoke-virtual {p0}, Lrm/u;->X()I

    move-result v9

    invoke-static/range {v5 .. v10}, La30/w0;->t(Lsn/v;Ljava/lang/Object;ZIII)Z

    move-result p3

    if-eqz p3, :cond_4

    return-object v5

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lrm/u;->i0()Z

    move-result v7

    invoke-virtual {p0}, Lrm/u;->W()I

    move-result v8

    invoke-virtual {p0}, Lrm/u;->X()I

    move-result v9

    move-object v5, p2

    invoke-static/range {v5 .. v10}, La30/w0;->t(Lsn/v;Ljava/lang/Object;ZIII)Z

    move-result p0

    if-eqz p0, :cond_6

    return-object v5

    :cond_6
    return-object v4
.end method

.method public static s(Ll9/c0;Ljava/lang/Object;ZIII)Z
    .locals 2

    iget-object v0, p0, Ll9/c0;->a:Ljava/lang/Object;

    iget v1, p0, Ll9/c0;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    if-ne v1, p3, :cond_1

    iget p1, p0, Ll9/c0;->c:I

    if-eq p1, p4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    const/4 p1, -0x1

    if-ne v1, p1, :cond_3

    iget p0, p0, Ll9/c0;->e:I

    if-ne p0, p5, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    return v0
.end method

.method public static t(Lsn/v;Ljava/lang/Object;ZIII)Z
    .locals 2

    iget-object v0, p0, Lsn/t;->a:Ljava/lang/Object;

    iget v1, p0, Lsn/t;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    if-ne v1, p3, :cond_1

    iget p1, p0, Lsn/t;->c:I

    if-eq p1, p4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    const/4 p1, -0x1

    if-ne v1, p1, :cond_3

    iget p0, p0, Lsn/t;->e:I

    if-ne p0, p5, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    return v0
.end method


# virtual methods
.method public A(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lsf/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsf/k;

    iget v1, v0, Lsf/k;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/k;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/k;

    invoke-direct {v0, p0, p2}, Lsf/k;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsf/k;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/k;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lsf/k;->z:I

    iget-object v2, v0, Lsf/k;->y:Lsf/c;

    iget-object v4, v0, Lsf/k;->x:Ljava/util/Iterator;

    iget-object v5, v0, Lsf/k;->w:Lsf/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lsf/c;

    const-string v2, "null cannot be cast to non-null type kotlin.Any"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Ldg/a;

    invoke-direct {p2, v2, p1}, Lsf/c;-><init>(Ldg/a;Ljava/lang/Object;)V

    iget-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v2, 0x0

    move-object v4, p1

    move-object v5, p2

    move p1, v2

    move-object v2, v5

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcf/a;

    iput-object v5, v0, Lsf/k;->w:Lsf/c;

    iput-object v4, v0, Lsf/k;->x:Ljava/util/Iterator;

    iput-object v2, v0, Lsf/k;->y:Lsf/c;

    iput p1, v0, Lsf/k;->z:I

    iput v3, v0, Lsf/k;->G:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v2, Lsf/c;->a:Ljava/lang/Object;

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    iget-object v6, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast v6, Luf/v;

    iget-object v6, v6, Luf/v;->a:Lj93/d;

    const-string v7, "modifyBeforeSerialization"

    invoke-static {v7, v6, p2}, La30/w0;->n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V

    iput-object p2, v5, Lsf/c;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_4
    iget-object p1, v2, Lsf/c;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public B(Lvf/g;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lsf/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsf/l;

    iget v1, v0, Lsf/l;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/l;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/l;

    invoke-direct {v0, p0, p2}, Lsf/l;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsf/l;->J:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/l;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lsf/l;->I:I

    iget v2, v0, Lsf/l;->H:I

    iget v4, v0, Lsf/l;->G:I

    iget-object v5, v0, Lsf/l;->F:Lsf/e;

    iget-object v6, v0, Lsf/l;->E:Lsf/e;

    iget-object v7, v0, Lsf/l;->z:Lsf/e;

    iget-object v8, v0, Lsf/l;->y:Ljava/util/Iterator;

    iget-object v9, v0, Lsf/l;->x:Lsf/e;

    iget-object v10, v0, Lsf/l;->w:Lvf/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v5

    move v5, p1

    move-object p1, v10

    move-object v10, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v12

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La30/w0;->E:Ljava/lang/Object;

    if-eqz p2, :cond_5

    new-instance v2, Lsf/e;

    iget-object v4, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Ldg/a;

    invoke-direct {v2, p2, p1, v4}, Lsf/e;-><init>(Ljava/lang/Object;Lvf/a;Ldg/a;)V

    :try_start_1
    iget-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v4, 0x0

    move-object v8, p2

    move-object v5, v2

    move-object v7, v5

    move p2, v4

    move v2, p2

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcf/a;

    iput-object p1, v0, Lsf/l;->w:Lvf/a;

    iput-object v5, v0, Lsf/l;->x:Lsf/e;

    iput-object v8, v0, Lsf/l;->y:Ljava/util/Iterator;

    iput-object v7, v0, Lsf/l;->z:Lsf/e;

    iput-object v5, v0, Lsf/l;->E:Lsf/e;

    iput-object v5, v0, Lsf/l;->F:Lsf/e;

    iput p2, v0, Lsf/l;->G:I

    iput v2, v0, Lsf/l;->H:I

    iput v4, v0, Lsf/l;->I:I

    iput v3, v0, Lsf/l;->L:I

    invoke-interface {v6, v5, v0}, Lcf/a;->a(Lsf/e;Lsf/l;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_3

    return-object v1

    :cond_3
    move-object v9, v5

    move-object v10, v8

    move v5, v4

    move-object v8, v7

    move v4, p2

    move-object v7, v9

    move-object p2, v6

    move-object v6, v7

    :goto_2
    move-object v11, p2

    check-cast v11, Lvf/a;

    invoke-static {p1, v11, v7}, La30/w0;->K(Lvf/a;Lvf/a;Lsf/e;)V

    check-cast p2, Lvf/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "<set-?>"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v6, Lsf/e;->b:Lvf/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move p2, v4

    move v4, v5

    move-object v7, v8

    move-object v5, v9

    move-object v8, v10

    goto :goto_1

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v7

    :cond_4
    invoke-static {v7}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v7, Lsf/e;

    iget-object p1, v7, Lsf/e;->b:Lvf/a;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public C(Lvf/g;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lsf/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsf/m;

    iget v1, v0, Lsf/m;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/m;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/m;

    invoke-direct {v0, p0, p2}, Lsf/m;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsf/m;->J:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/m;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lsf/m;->I:I

    iget v2, v0, Lsf/m;->H:I

    iget v4, v0, Lsf/m;->G:I

    iget-object v5, v0, Lsf/m;->F:Lsf/e;

    iget-object v6, v0, Lsf/m;->E:Lsf/e;

    iget-object v7, v0, Lsf/m;->z:Lsf/e;

    iget-object v8, v0, Lsf/m;->y:Ljava/util/Iterator;

    iget-object v9, v0, Lsf/m;->x:Lsf/e;

    iget-object v10, v0, Lsf/m;->w:Lvf/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v5

    move v5, p1

    move-object p1, v10

    move-object v10, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v12

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La30/w0;->E:Ljava/lang/Object;

    if-eqz p2, :cond_5

    new-instance v2, Lsf/e;

    iget-object v4, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Ldg/a;

    invoke-direct {v2, p2, p1, v4}, Lsf/e;-><init>(Ljava/lang/Object;Lvf/a;Ldg/a;)V

    :try_start_1
    iget-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v4, 0x0

    move-object v8, p2

    move-object v5, v2

    move-object v7, v5

    move p2, v4

    move v2, p2

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcf/a;

    iput-object p1, v0, Lsf/m;->w:Lvf/a;

    iput-object v5, v0, Lsf/m;->x:Lsf/e;

    iput-object v8, v0, Lsf/m;->y:Ljava/util/Iterator;

    iput-object v7, v0, Lsf/m;->z:Lsf/e;

    iput-object v5, v0, Lsf/m;->E:Lsf/e;

    iput-object v5, v0, Lsf/m;->F:Lsf/e;

    iput p2, v0, Lsf/m;->G:I

    iput v2, v0, Lsf/m;->H:I

    iput v4, v0, Lsf/m;->I:I

    iput v3, v0, Lsf/m;->L:I

    invoke-interface {v6, v5, v0}, Lcf/a;->c(Lsf/e;Lsf/m;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_3

    return-object v1

    :cond_3
    move-object v9, v5

    move-object v10, v8

    move v5, v4

    move-object v8, v7

    move v4, p2

    move-object v7, v9

    move-object p2, v6

    move-object v6, v7

    :goto_2
    move-object v11, p2

    check-cast v11, Lvf/a;

    invoke-static {p1, v11, v7}, La30/w0;->K(Lvf/a;Lvf/a;Lsf/e;)V

    check-cast p2, Lvf/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "<set-?>"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v6, Lsf/e;->b:Lvf/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move p2, v4

    move v4, v5

    move-object v7, v8

    move-object v5, v9

    move-object v8, v10

    goto :goto_1

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v7

    :cond_4
    invoke-static {v7}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v7, Lsf/e;

    iget-object p1, v7, Lsf/e;->b:Lvf/a;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public D(Lv33/p;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    iget-object v1, p1, Lv33/p;->a:Lstream/video/sfu/models/Participant;

    iget-boolean p1, p1, Lv33/p;->c:Z

    iget-object v2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lt23/n0;

    iget-object v2, v2, Lt23/n0;->x:Lt23/s0;

    iget-object v2, v2, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v3, Lt9/c0;

    invoke-static {v0, v1, p1, v2, v3}, La30/w0;->h(Ljava/util/LinkedHashMap;Lstream/video/sfu/models/Participant;ZLjava/util/Map;Lt9/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public E(Landroid/net/Uri;)V
    .locals 5

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v0, La3/z0;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0, p1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, La30/w0;->F(La3/z0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    invoke-virtual {p0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[playCallSound] Error playing call sound: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v0, v3, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public F(La3/z0;)V
    .locals 4

    iget-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioManager;

    if-nez v0, :cond_3

    iget-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/media/AudioManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Landroid/media/AudioManager;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    iput-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_3

    invoke-virtual {p0}, La30/w0;->r()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[requestAudioFocus] Error getting AudioManager system service"

    invoke-interface {p1, v3, v1, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p1}, La3/z0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public G(Ljava/util/List;)V
    .locals 14

    const-string v0, "pins"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v10, v7, 0x1

    if-ltz v7, :cond_1

    check-cast v8, Lv33/s;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v11

    sub-int/2addr v11, v7

    int-to-long v11, v11

    add-long/2addr v11, v1

    iget-object v7, v8, Lv33/s;->a:Ljava/lang/String;

    invoke-interface {v4, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    :goto_1
    invoke-interface {v4, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v8, Lv33/s;->b:Ljava/lang/String;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v3, v7, v8}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v7, v10

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    throw v9

    :cond_2
    iget-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p1, Lt23/n0;

    iget-object p1, p1, Lt23/n0;->x:Lt23/s0;

    iget-object p1, p1, Lt23/s0;->i:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt23/g2;

    iget-object v7, v2, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {v7}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v8, "sessionId"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "userId"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    if-nez v8, :cond_4

    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/Long;

    :cond_4
    if-eqz v8, :cond_9

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lv33/s;

    iget-object v12, v12, Lv33/s;->b:Ljava/lang/String;

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_3

    :cond_6
    move-object v11, v9

    :goto_3
    check-cast v11, Lv33/s;

    if-nez v11, :cond_a

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lv33/s;

    iget-object v12, v12, Lv33/s;->a:Ljava/lang/String;

    iget-object v13, v2, Lt23/g2;->y:Lec3/h2;

    invoke-virtual {v13}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_4

    :cond_8
    move-object v11, v9

    :goto_4
    check-cast v11, Lv33/s;

    if-nez v11, :cond_a

    :cond_9
    move-object v2, v9

    goto :goto_6

    :cond_a
    iget-object v2, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv43/a;

    if-eqz v2, :cond_b

    iget-object v2, v2, Lv43/a;->b:Ljg3/i;

    goto :goto_5

    :cond_b
    move-object v2, v9

    :goto_5
    if-nez v2, :cond_c

    sget-object v2, Ljg3/c;->H:Ljg3/c;

    const-wide/16 v12, 0x3e8

    invoke-static {v7, v8, v12, v13}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v12

    const/16 v2, 0x3e8

    invoke-static {v2, v7, v8}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v2

    const v7, 0xf4240

    mul-int/2addr v2, v7

    invoke-static {v2, v12, v13}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v2

    sget-object v7, Ljg3/p;->F:Ljg3/p;

    invoke-static {v2, v7}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object v2

    :cond_c
    new-instance v7, Lv43/a;

    sget-object v8, Lv43/b;->w:Lv43/b;

    invoke-direct {v7, v11, v2}, Lv43/a;-><init>(Lv33/s;Ljg3/i;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_6
    if-eqz v2, :cond_3

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_d
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v9, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I()V
    .locals 7

    const-string v0, "[stopCallSound] Error stopping call sound: "

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, La30/w0;->J()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, La30/w0;->r()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "[stopCallSound] Stopping RingtoneManager sound"

    const/4 v5, 0x0

    invoke-interface {v2, v3, v1, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Landroid/media/Ringtone;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/Ringtone;->isPlaying()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget-object v1, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Landroid/media/Ringtone;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/media/Ringtone;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_2
    invoke-virtual {p0}, La30/w0;->r()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    iget-object v5, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v4, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public J()V
    .locals 6

    :try_start_0
    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "[stopVibration] Vibration not started"

    invoke-interface {v2, v3, v0, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La30/w0;->r()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v4, "[stopVibration] Stopping vibration"

    invoke-interface {v2, v3, v0, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_0
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    const-string v3, "SafeCall"

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Exception occurred: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public L(Lrm/o1;)V
    .locals 3

    new-instance v0, Lab/h0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lab/h0;-><init>(I)V

    iget-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->l(Lab/h0;Lsn/v;Lrm/o1;)V

    iget-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    iget-object v2, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    invoke-static {v1, v2}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->l(Lab/h0;Lsn/v;Lrm/o1;)V

    :cond_0
    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    iget-object v2, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    invoke-static {v1, v2}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    iget-object v2, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    invoke-static {v1, v2}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->l(Lab/h0;Lsn/v;Lrm/o1;)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsn/v;

    invoke-virtual {p0, v0, v2, p1}, La30/w0;->l(Lab/h0;Lsn/v;Lrm/o1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    iget-object v2, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v2, Lsn/v;

    invoke-virtual {v1, v2}, Lzr/g0;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lsn/v;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->l(Lab/h0;Lsn/v;Lrm/o1;)V

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lab/h0;->i()Lzr/b1;

    move-result-object p1

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public M()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public N(Lu8/o0;)V
    .locals 3

    new-instance v0, Lab/h0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lab/h0;-><init>(I)V

    iget-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->j(Lab/h0;Ll9/c0;Lu8/o0;)V

    iget-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v2, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Ll9/c0;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->j(Lab/h0;Ll9/c0;Lu8/o0;)V

    :cond_0
    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v2, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v2, Ll9/c0;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    iget-object v2, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v2, Ll9/c0;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->j(Lab/h0;Ll9/c0;Lu8/o0;)V

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v2, Lzr/g0;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll9/c0;

    invoke-virtual {p0, v0, v2, p1}, La30/w0;->j(Lab/h0;Ll9/c0;Lu8/o0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lzr/g0;

    iget-object v2, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v2, Ll9/c0;

    invoke-virtual {v1, v2}, Lzr/g0;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Ll9/c0;

    invoke-virtual {p0, v0, v1, p1}, La30/w0;->j(Lab/h0;Ll9/c0;Lu8/o0;)V

    :cond_3
    :goto_1
    invoke-virtual {v0}, Lab/h0;->i()Lzr/b1;

    move-result-object p1

    iput-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    return-void
.end method

.method public O(Ljava/lang/String;)V
    .locals 2

    const-string v0, "sfuId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Z)V
    .locals 3

    iget-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h5;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, La30/w0;->u(Z)V

    new-instance p1, Lio/sentry/c7;

    const/16 v1, 0xd

    invoke-direct {p1, p0, v1}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lio/sentry/h5;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    :cond_0
    iget-object p1, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getShutdownTimeoutMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lio/sentry/h5;->a(J)V

    :goto_0
    iget-object p1, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, La30/w0;->q()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    iget-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/location/FusedLocationProviderClient;

    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltp/r;

    iget-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ltp/g;

    iget-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ltp/u;

    iget-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lnp/j;

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lto/k;

    move-object v7, p1

    check-cast v7, Lnp/i;

    move-object v8, p2

    check-cast v8, Lcq/i;

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/location/FusedLocationProviderClient;->zzb(Ltp/v;Ltp/g;Ltp/u;Lnp/j;Lto/k;Lnp/i;Lcq/i;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const-string v1, "rawValue"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public d(J)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, La30/w0;->u(Z)V

    :try_start_0
    iget-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Laj/c;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/transport/r;

    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-virtual {v1, v0, p1, p2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->tryAcquireSharedNanos(IJ)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast p2, Lio/sentry/q6;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed to flush log events"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Property \"autoMetadata\" has not been set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public g()Lg40/o0;
    .locals 1

    iget-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast v0, Lg40/n0;

    return-object v0
.end method

.method public getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Lzy/b;

    return-object v0
.end method

.method public j(Lab/h0;Ll9/c0;Lu8/o0;)V
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p2, Ll9/c0;->a:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1, p2, p3}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast p3, Lzr/b1;

    invoke-virtual {p3, p2}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lu8/o0;

    if-eqz p3, :cond_2

    invoke-virtual {p1, p2, p3}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public l(Lab/h0;Lsn/v;Lrm/o1;)V
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p2, Lsn/t;->a:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Lrm/o1;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p1, p2, p3}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p3, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast p3, Lzr/b1;

    invoke-virtual {p3, p2}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lrm/o1;

    if-eqz p3, :cond_2

    invoke-virtual {p1, p2, p3}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public m()Lgm/h;
    .locals 11

    iget-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, " transportName"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    iget-object v1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lgm/m;

    if-nez v1, :cond_1

    const-string v1, " encodedPayload"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    if-nez v1, :cond_2

    const-string v1, " eventMillis"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    iget-object v1, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    if-nez v1, :cond_3

    const-string v1, " uptimeMillis"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_3
    iget-object v1, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    if-nez v1, :cond_4

    const-string v1, " autoMetadata"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v2, Lgm/h;

    iget-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lgm/m;

    iget-object v0, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Ljava/util/HashMap;

    invoke-direct/range {v2 .. v10}, Lgm/h;-><init>(Ljava/lang/String;Ljava/lang/Integer;Lgm/m;JJLjava/util/HashMap;)V

    return-object v2

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public q()V
    .locals 7

    iget-object v0, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/q5;

    if-eqz v3, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lt v3, v2, :cond_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    new-instance v2, Lio/sentry/s5;

    invoke-direct {v2, v1}, Lio/sentry/s5;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v0, v2}, Lcd3/g;->u(Lio/sentry/s5;)Lcom/google/crypto/tink/internal/l0;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v4}, Lcd3/g;->H(Lcom/google/crypto/tink/internal/l0;Lio/sentry/g0;)Lio/sentry/protocol/v;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    iget-object v0, v0, Lcd3/g;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v5, "Capturing logs failed."

    new-array v6, v3, [Ljava/lang/Object;

    invoke-interface {v0, v4, v2, v5, v6}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/transport/r;

    sget v2, Lio/sentry/transport/r;->w:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/concurrent/locks/AbstractQueuedSynchronizer;->releaseShared(I)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public r()Lb23/k;
    .locals 1

    iget v0, p0, La30/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La30/w0;->G:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    :pswitch_1
    iget-object v0, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u(Z)V
    .locals 5

    iget-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x1388

    :goto_0
    :try_start_0
    iget-object v1, p0, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Lio/sentry/h5;

    new-instance v2, Lbq/b;

    const/16 v3, 0xd

    invoke-direct {v2, p0, v3}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    int-to-long v3, p1

    invoke-virtual {v1, v2, v3, v4}, Lio/sentry/h5;->c(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    iget-object v1, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Logs batch processor flush task rejected"

    invoke-interface {v1, v2, v3, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
.end method

.method public v(Ljava/lang/Object;Lvf/g;Lwf/a;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p4, Lsf/g;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lsf/g;

    iget v1, v0, Lsf/g;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/g;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/g;

    invoke-direct {v0, p0, p4}, Lsf/g;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lsf/g;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/g;->H:I

    const-string v3, "modifyBeforeAttemptCompletion"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lsf/g;->E:I

    iget p2, v0, Lsf/g;->z:I

    iget-object p3, v0, Lsf/g;->y:Lsf/a;

    iget-object v2, v0, Lsf/g;->x:Ljava/util/Iterator;

    iget-object v5, v0, Lsf/g;->w:La30/w0;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p4, Ll83/n;

    iget-object p4, p4, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v6, p0, La30/w0;->E:Ljava/lang/Object;

    if-eqz v6, :cond_8

    new-instance v5, Lsf/a;

    iget-object p4, p0, La30/w0;->x:Ljava/lang/Object;

    move-object v10, p4

    check-cast v10, Ldg/a;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    invoke-direct/range {v5 .. v10}, Lsf/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvf/a;Lwf/a;Ldg/a;)V

    :try_start_1
    iget-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move-object v2, p1

    move p1, p2

    move-object p3, v5

    move-object v5, p0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lcf/a;

    iput-object v5, v0, Lsf/g;->w:La30/w0;

    iput-object v2, v0, Lsf/g;->x:Ljava/util/Iterator;

    iput-object p3, v0, Lsf/g;->y:Lsf/a;

    iput p2, v0, Lsf/g;->z:I

    iput p1, v0, Lsf/g;->E:I

    iput v4, v0, Lsf/g;->H:I

    invoke-interface {p4, p3, v0}, Lcf/a;->g(Lsf/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    iget-object v6, v5, La30/w0;->z:Ljava/lang/Object;

    check-cast v6, Luf/v;

    iget-object v6, v6, Luf/v;->b:Lj93/d;

    instance-of v7, p4, Ll83/m;

    if-nez v7, :cond_4

    invoke-static {v3, v6, p4}, La30/w0;->n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V

    :cond_4
    iput-object p4, p3, Lsf/a;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_5
    iget-object p1, p3, Lsf/a;->b:Ljava/lang/Object;

    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_4
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_6

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    iget-object p2, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast p2, Luf/v;

    iget-object p2, p2, Luf/v;->b:Lj93/d;

    instance-of p3, p1, Ll83/m;

    if-nez p3, :cond_7

    invoke-static {v3, p2, p1}, La30/w0;->n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_7
    :goto_5
    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La30/w0;->F:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public x(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lsf/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsf/h;

    iget v1, v0, Lsf/h;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/h;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/h;

    invoke-direct {v0, p0, p2}, Lsf/h;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsf/h;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/h;->H:I

    const-string v3, "modifyBeforeCompletion"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lsf/h;->E:I

    iget v2, v0, Lsf/h;->z:I

    iget-object v5, v0, Lsf/h;->y:Lsf/b;

    iget-object v6, v0, Lsf/h;->x:Ljava/util/Iterator;

    iget-object v7, v0, Lsf/h;->w:La30/w0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p2, p2, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v6, p0, La30/w0;->E:Ljava/lang/Object;

    if-eqz v6, :cond_8

    new-instance v5, Lsf/b;

    iget-object p2, p0, La30/w0;->F:Ljava/lang/Object;

    move-object v8, p2

    check-cast v8, Lvf/g;

    iget-object p2, p0, La30/w0;->G:Ljava/lang/Object;

    move-object v9, p2

    check-cast v9, Lwf/a;

    iget-object p2, p0, La30/w0;->x:Ljava/lang/Object;

    move-object v10, p2

    check-cast v10, Ldg/a;

    move-object v7, p1

    invoke-direct/range {v5 .. v10}, Lsf/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lvf/g;Lwf/a;Ldg/a;)V

    :try_start_1
    iget-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move-object v7, p0

    move-object v6, p1

    move p1, p2

    move v2, p1

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcf/a;

    iput-object v7, v0, Lsf/h;->w:La30/w0;

    iput-object v6, v0, Lsf/h;->x:Ljava/util/Iterator;

    iput-object v5, v0, Lsf/h;->y:Lsf/b;

    iput v2, v0, Lsf/h;->z:I

    iput p1, v0, Lsf/h;->E:I

    iput v4, v0, Lsf/h;->H:I

    invoke-interface {p2, v5, v0}, Lcf/a;->e(Lsf/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    iget-object v8, v7, La30/w0;->z:Ljava/lang/Object;

    check-cast v8, Luf/v;

    iget-object v8, v8, Luf/v;->b:Lj93/d;

    instance-of v9, p2, Ll83/m;

    if-nez v9, :cond_4

    invoke-static {v3, v8, p2}, La30/w0;->n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V

    :cond_4
    iput-object p2, v5, Lsf/b;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_5
    iget-object p1, v5, Lsf/b;->b:Ljava/lang/Object;

    new-instance p2, Ll83/n;

    invoke-direct {p2, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_4
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_6

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    iget-object p2, p0, La30/w0;->z:Ljava/lang/Object;

    check-cast p2, Luf/v;

    iget-object p2, p2, Luf/v;->b:Lj93/d;

    instance-of v0, p1, Ll83/m;

    if-nez v0, :cond_7

    invoke-static {v3, p2, p1}, La30/w0;->n(Ljava/lang/String;Lj93/d;Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :cond_7
    :goto_5
    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public y(Lrf/l;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lsf/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsf/i;

    iget v1, v0, Lsf/i;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/i;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/i;

    invoke-direct {v0, p0, p2}, Lsf/i;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsf/i;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/i;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lsf/i;->F:I

    iget v2, v0, Lsf/i;->E:I

    iget-object v4, v0, Lsf/i;->z:Lsf/f;

    iget-object v5, v0, Lsf/i;->y:Lsf/f;

    iget-object v6, v0, Lsf/i;->x:Ljava/util/Iterator;

    iget-object v7, v0, Lsf/i;->w:Lsf/f;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La30/w0;->E:Ljava/lang/Object;

    if-eqz p2, :cond_5

    new-instance v2, Lsf/f;

    iget-object v4, p1, Lrf/l;->w:Lvf/a;

    iget-object p1, p1, Lrf/l;->x:Lwf/a;

    iget-object v5, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v5, Ldg/a;

    invoke-direct {v2, p2, v4, p1, v5}, Lsf/f;-><init>(Ljava/lang/Object;Lvf/a;Lwf/a;Ldg/a;)V

    :try_start_1
    iget-object p1, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    move-object v6, p1

    move p1, p2

    move-object v4, v2

    move-object v5, v4

    move v2, p1

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcf/a;

    iput-object v4, v0, Lsf/i;->w:Lsf/f;

    iput-object v6, v0, Lsf/i;->x:Ljava/util/Iterator;

    iput-object v5, v0, Lsf/i;->y:Lsf/f;

    iput-object v4, v0, Lsf/i;->z:Lsf/f;

    iput v2, v0, Lsf/i;->E:I

    iput p1, v0, Lsf/i;->F:I

    iput v3, v0, Lsf/i;->I:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v4, Lsf/f;->c:Lwf/a;

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, v4

    :goto_2
    check-cast p2, Lwf/a;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "<set-?>"

    invoke-static {p2, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v4, Lsf/f;->c:Lwf/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v4, v7

    goto :goto_1

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v5

    :cond_4
    invoke-static {v5}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v5, Lsf/f;

    iget-object p1, v5, Lsf/f;->c:Lwf/a;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public z(Lvf/g;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lsf/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsf/j;

    iget v1, v0, Lsf/j;->L:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsf/j;->L:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsf/j;

    invoke-direct {v0, p0, p2}, Lsf/j;-><init>(La30/w0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsf/j;->J:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsf/j;->L:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lsf/j;->I:I

    iget v2, v0, Lsf/j;->H:I

    iget v4, v0, Lsf/j;->G:I

    iget-object v5, v0, Lsf/j;->F:Lsf/e;

    iget-object v6, v0, Lsf/j;->E:Lsf/e;

    iget-object v7, v0, Lsf/j;->z:Lsf/e;

    iget-object v8, v0, Lsf/j;->y:Ljava/util/Iterator;

    iget-object v9, v0, Lsf/j;->x:Lsf/e;

    iget-object v10, v0, Lsf/j;->w:Lvf/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v5

    move v5, p1

    move-object p1, v10

    move-object v10, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v12

    goto :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, La30/w0;->E:Ljava/lang/Object;

    if-eqz p2, :cond_5

    new-instance v2, Lsf/e;

    iget-object v4, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v4, Ldg/a;

    invoke-direct {v2, p2, p1, v4}, Lsf/e;-><init>(Ljava/lang/Object;Lvf/a;Ldg/a;)V

    :try_start_1
    iget-object p2, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v4, 0x0

    move-object v8, p2

    move-object v5, v2

    move-object v7, v5

    move p2, v4

    move v2, p2

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcf/a;

    iput-object p1, v0, Lsf/j;->w:Lvf/a;

    iput-object v5, v0, Lsf/j;->x:Lsf/e;

    iput-object v8, v0, Lsf/j;->y:Ljava/util/Iterator;

    iput-object v7, v0, Lsf/j;->z:Lsf/e;

    iput-object v5, v0, Lsf/j;->E:Lsf/e;

    iput-object v5, v0, Lsf/j;->F:Lsf/e;

    iput p2, v0, Lsf/j;->G:I

    iput v2, v0, Lsf/j;->H:I

    iput v4, v0, Lsf/j;->I:I

    iput v3, v0, Lsf/j;->L:I

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v5, Lsf/e;->b:Lvf/a;

    if-ne v6, v1, :cond_3

    return-object v1

    :cond_3
    move-object v9, v5

    move-object v10, v8

    move v5, v4

    move-object v8, v7

    move v4, p2

    move-object v7, v9

    move-object p2, v6

    move-object v6, v7

    :goto_2
    move-object v11, p2

    check-cast v11, Lvf/a;

    invoke-static {p1, v11, v7}, La30/w0;->K(Lvf/a;Lvf/a;Lsf/e;)V

    check-cast p2, Lvf/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "<set-?>"

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v6, Lsf/e;->b:Lvf/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move p2, v4

    move v4, v5

    move-object v7, v8

    move-object v5, v9

    move-object v8, v10

    goto :goto_1

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v7

    :cond_4
    invoke-static {v7}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v7, Lsf/e;

    iget-object p1, v7, Lsf/e;->b:Lvf/a;

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
