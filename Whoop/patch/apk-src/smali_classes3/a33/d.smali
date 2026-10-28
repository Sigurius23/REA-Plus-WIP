.class public final La33/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/e0;
.implements Lxg3/i;
.implements Lcq/d;
.implements Lfn/u;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, La33/d;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 47
    sget-object p1, Lc33/b;->x:Lc33/b;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    .line 48
    new-instance p1, Lav/b;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    return-void

    .line 49
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 50
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 52
    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    .line 53
    new-instance p1, Lar/d;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lar/d;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void

    :sswitch_2
    const/16 p1, 0xa

    .line 54
    new-array v0, p1, [J

    new-array v1, p1, [J

    new-array p1, p1, [J

    const/16 v2, 0x9

    invoke-direct {p0, v0, v1, p1, v2}, La33/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_2
        0xc -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V
    .locals 0

    const/16 p1, 0x16

    iput p1, p0, La33/d;->w:I

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p2, p0, La33/d;->x:Ljava/lang/Object;

    if-nez p3, :cond_0

    .line 101
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 102
    :cond_0
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    .line 103
    iput-object p4, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La33/d;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, La33/d;->w:I

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iget-object v0, p1, La33/d;->x:Ljava/lang/Object;

    check-cast v0, [J

    const/16 v1, 0xa

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, La33/d;->x:Ljava/lang/Object;

    .line 106
    iget-object v0, p1, La33/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v0

    iput-object v0, p0, La33/d;->y:Ljava/lang/Object;

    .line 107
    iget-object p1, p1, La33/d;->z:Ljava/lang/Object;

    check-cast p1, [J

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Lkr/e;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, La33/d;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 57
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 58
    const-string p1, "IntentResolver"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/AudioTrack;Ld30/h;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, La33/d;->w:I

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 142
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 143
    new-instance p2, Ld9/s;

    invoke-direct {p2, p0}, Ld9/s;-><init>(La33/d;)V

    iput-object p2, p0, La33/d;->z:Ljava/lang/Object;

    .line 144
    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 145
    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Ld9/s;

    invoke-virtual {p1, v0, p2}, Landroid/media/AudioTrack;->addOnRoutingChangedListener(Landroid/media/AudioRouting$OnRoutingChangedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Lal/g;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, La33/d;->w:I

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    const-string v0, "Argument must not be null"

    invoke-static {p3, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    iput-object p3, p0, La33/d;->x:Ljava/lang/Object;

    .line 96
    invoke-static {p2, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 98
    new-instance p2, Lxk/h;

    invoke-direct {p2, p1}, Lxk/h;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/j0;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La33/d;->w:I

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Landroidx/lifecycle/i0;

    invoke-direct {v0, p1}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/g0;)V

    iput-object v0, p0, La33/d;->x:Ljava/lang/Object;

    .line 44
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lch3/u0;Lxg3/i;)V
    .locals 2

    const/16 v0, 0x8

    iput v0, p0, La33/d;->w:I

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 111
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldk/f;Ldk/f;Lfk/a;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La33/d;->w:I

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le10/k0;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, La33/d;->w:I

    .line 131
    iput v0, p0, La33/d;->w:I

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 134
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    .line 135
    new-instance p1, Lg6/a;

    invoke-direct {p1, p0}, Lg6/a;-><init>(La33/d;)V

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lgm/i;Ldm/c;Lux/f0;Lgm/q;)V
    .locals 0

    const/16 p3, 0x1d

    iput p3, p0, La33/d;->w:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 61
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 62
    iput-object p4, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh20/x1;Ln53/e;Ln53/e;Lec3/f2;Lec3/r1;Lec3/h2;Lec3/h2;Lc93/a;Lc93/a;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, La33/d;->w:I

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentScreenFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "buttonsEnabledFlow"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "paymentMethodMetadataFlow"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "selectionFlow"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "customPrimaryButtonUiStateFlow"

    invoke-static {p6, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "cvcCompleteFlow"

    invoke-static {p7, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 40
    iput-object p8, p0, La33/d;->y:Ljava/lang/Object;

    .line 41
    check-cast p9, Lkotlin/jvm/internal/i;

    iput-object p9, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/getstream/android/video/generated/apis/ProductvideoApi;Lhc3/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La33/d;->w:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 65
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 66
    const-string p1, "ImmediateEventSender"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Ljava/util/ArrayList;Lal/g;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, La33/d;->w:I

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    const-string v0, "Argument must not be null"

    invoke-static {p3, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    iput-object p3, p0, La33/d;->y:Ljava/lang/Object;

    .line 70
    invoke-static {p2, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    iput-object p2, p0, La33/d;->z:Ljava/lang/Object;

    .line 72
    new-instance p2, Lty/c;

    invoke-direct {p2, p1, p3}, Lty/c;-><init>(Ljava/io/InputStream;Lal/g;)V

    iput-object p2, p0, La33/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, La33/d;->w:I

    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    iput-object p3, p0, La33/d;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    iput p2, p0, La33/d;->w:I

    packed-switch p2, :pswitch_data_0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    new-instance p2, Lu8/o;

    invoke-direct {p2}, Lu8/o;-><init>()V

    .line 79
    const-string v0, "video/mp2t"

    invoke-static {v0}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lu8/o;->l:Ljava/lang/String;

    .line 80
    invoke-static {p1}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p2, Lu8/o;->m:Ljava/lang/String;

    .line 81
    new-instance p1, Lu8/p;

    invoke-direct {p1, p2}, Lu8/p;-><init>(Lu8/o;)V

    .line 82
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    return-void

    .line 83
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance p2, Lrm/b0;

    invoke-direct {p2}, Lrm/b0;-><init>()V

    .line 85
    iput-object p1, p2, Lrm/b0;->k:Ljava/lang/String;

    .line 86
    new-instance p1, Lrm/c0;

    invoke-direct {p1, p2}, Lrm/c0;-><init>(Lrm/b0;)V

    .line 87
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, La33/d;->w:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 75
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lt9/k0;

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    .line 76
    new-instance p1, Lre/g;

    new-instance v0, Lab/g0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lab/g0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0}, Lre/g;-><init>(Ly8/r;)V

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lzy/c;)V
    .locals 2

    const/16 v0, 0x17

    iput v0, p0, La33/d;->w:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p2, p0, La33/d;->x:Ljava/lang/Object;

    .line 16
    sget-object p2, Lg40/k0;->w:Lg40/k0;

    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 17
    check-cast p1, Ljava/lang/Iterable;

    .line 18
    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 20
    check-cast v0, Lg40/z2;

    .line 21
    invoke-interface {v0}, Lg40/z2;->f()Lec3/f2;

    move-result-object v0

    .line 22
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 24
    iget-object p1, p0, La33/d;->y:Ljava/lang/Object;

    check-cast p1, Lg40/k0;

    .line 25
    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-static {v0, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg40/h1;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 26
    :goto_1
    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    goto :goto_2

    .line 27
    :cond_3
    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 28
    new-array v0, v0, [Lec3/l;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 29
    check-cast p1, [Lec3/l;

    .line 30
    new-instance v0, Landroidx/room/y;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p1, p0}, Landroidx/room/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v0

    .line 31
    :goto_2
    new-instance v0, Lce/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2, p0}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    new-instance p2, Ln53/e;

    invoke-direct {p2, p1, v0}, Ln53/e;-><init>(Lec3/l;Lc93/a;)V

    .line 33
    iput-object p2, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Lcom/google/crypto/tink/internal/j0;Lss/a;Ljava/lang/Class;)V
    .locals 0

    const/16 p4, 0xa

    iput p4, p0, La33/d;->w:I

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 138
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 139
    iput-object p3, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llb3/y;Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 2

    const/16 v0, 0x19

    iput v0, p0, La33/d;->w:I

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz p2, :cond_1

    if-eqz v0, :cond_0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 90
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 91
    iput-object p3, p0, La33/d;->z:Ljava/lang/Object;

    return-void

    :cond_0
    const/4 p1, 0x3

    .line 92
    invoke-static {p1}, La33/d;->a(I)V

    throw v1

    :cond_1
    const/4 p1, 0x1

    invoke-static {p1}, La33/d;->a(I)V

    throw v1
.end method

.method public constructor <init>(Lp0/n0;Lp0/n0;Lfk/a;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, La33/d;->w:I

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq20/c;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, La33/d;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 12
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    .line 13
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqg3/d;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, La33/d;->w:I

    .line 108
    invoke-direct {p0, v0}, La33/d;-><init>(I)V

    .line 109
    invoke-static {p0, p1}, La33/d;->n(La33/d;Lqg3/d;)V

    return-void
.end method

.method public constructor <init>(Lyy/j;Lyy/c;Lq83/j;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, La33/d;->w:I

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, La33/d;->y:Ljava/lang/Object;

    .line 37
    iput-object p3, p0, La33/d;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Lv8/e;)V
    .locals 5

    const/16 v0, 0xe

    iput v0, p0, La33/d;->w:I

    .line 112
    new-instance v0, Ld9/c0;

    invoke-direct {v0}, Ld9/c0;-><init>()V

    new-instance v1, Lv8/h;

    .line 113
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 114
    iput v2, v1, Lv8/h;->c:F

    .line 115
    iput v2, v1, Lv8/h;->d:F

    .line 116
    sget-object v2, Lv8/d;->e:Lv8/d;

    iput-object v2, v1, Lv8/h;->e:Lv8/d;

    .line 117
    iput-object v2, v1, Lv8/h;->f:Lv8/d;

    .line 118
    iput-object v2, v1, Lv8/h;->g:Lv8/d;

    .line 119
    iput-object v2, v1, Lv8/h;->h:Lv8/d;

    .line 120
    sget-object v2, Lv8/e;->a:Ljava/nio/ByteBuffer;

    iput-object v2, v1, Lv8/h;->k:Ljava/nio/ByteBuffer;

    .line 121
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v3

    iput-object v3, v1, Lv8/h;->l:Ljava/nio/ShortBuffer;

    .line 122
    iput-object v2, v1, Lv8/h;->m:Ljava/nio/ByteBuffer;

    const/4 v2, -0x1

    .line 123
    iput v2, v1, Lv8/h;->b:I

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    new-array v2, v2, [Lv8/e;

    iput-object v2, p0, La33/d;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    .line 126
    array-length v4, p1

    invoke-static {p1, v3, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 127
    iput-object v0, p0, La33/d;->y:Ljava/lang/Object;

    .line 128
    iput-object v1, p0, La33/d;->z:Ljava/lang/Object;

    .line 129
    array-length v3, p1

    aput-object v0, v2, v3

    .line 130
    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method

.method public static F(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 2

    sget-object v0, Le43/i;->b:Le43/i;

    invoke-virtual {p1, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "callId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "payload"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-string v1, "io.getstream.video.android.action.ACCEPT_CALL"

    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p2

    const-string v1, "putExtras(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1, v0}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method public static J(La33/d;Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 2

    sget-object v0, Le43/i;->b:Le43/i;

    invoke-virtual {p1, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "callId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "payload"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-string v1, "io.getstream.video.android.action.INCOMING_CALL"

    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p2, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p2

    const-string v1, "putExtras(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1, v0}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method

.method private final S()V
    .locals 0

    return-void
.end method

.method public static synthetic a(I)V
    .locals 10

    const/4 v0, 0x7

    const/4 v1, 0x6

    const/4 v2, 0x5

    const/4 v3, 0x4

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v4, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v4, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v5, 0x2

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature"

    const/4 v8, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v9, "returnType"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_0
    aput-object v7, v6, v8

    goto :goto_2

    :pswitch_1
    const-string v9, "signatureErrors"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_2
    const-string v9, "typeParameters"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_3
    const-string v9, "valueParameters"

    aput-object v9, v6, v8

    :goto_2
    const/4 v8, 0x1

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v7, v6, v8

    goto :goto_3

    :cond_2
    const-string v7, "getErrors"

    aput-object v7, v6, v8

    goto :goto_3

    :cond_3
    const-string v7, "getTypeParameters"

    aput-object v7, v6, v8

    goto :goto_3

    :cond_4
    const-string v7, "getValueParameters"

    aput-object v7, v6, v8

    goto :goto_3

    :cond_5
    const-string v7, "getReturnType"

    aput-object v7, v6, v8

    :goto_3
    if-eq p0, v3, :cond_6

    if-eq p0, v2, :cond_6

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    const-string v7, "<init>"

    aput-object v7, v6, v5

    :cond_6
    invoke-static {v4, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static n(La33/d;Lqg3/d;)V
    .locals 3

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, [J

    iget-object v1, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v2, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v2, [J

    iget-object p1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, [J

    invoke-static {v0, v2, p1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    iget-object v2, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, [J

    iget-object v1, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v1, [J

    invoke-static {v0, v2, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object p0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast p0, [J

    invoke-static {p0, v1, p1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    return-void
.end method


# virtual methods
.method public A(Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lbk/b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lbk/b;

    iget v3, v2, Lbk/b;->J:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lbk/b;->J:I

    goto :goto_0

    :cond_0
    new-instance v2, Lbk/b;

    invoke-direct {v2, v1, v0}, Lbk/b;-><init>(La33/d;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lbk/b;->H:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lbk/b;->J:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lbk/b;->w:La33/d;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v4, v2, Lbk/b;->G:I

    iget-object v9, v2, Lbk/b;->F:Ljk/a;

    iget-object v10, v2, Lbk/b;->E:Ljava/util/Iterator;

    iget-object v11, v2, Lbk/b;->z:Ljava/util/List;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lbk/b;->y:Ljava/lang/String;

    iget-object v13, v2, Lbk/b;->x:Ljava/util/Iterator;

    iget-object v14, v2, Lbk/b;->w:La33/d;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v9, v13

    move-object v13, v12

    move v12, v4

    move-object v4, v2

    move-object v2, v14

    goto/16 :goto_5

    :catch_1
    move-exception v0

    move/from16 v16, v4

    move-object v4, v2

    move-object v2, v14

    move-object v14, v12

    move/from16 v12, v16

    goto/16 :goto_6

    :cond_3
    iget-object v4, v2, Lbk/b;->y:Ljava/lang/String;

    iget-object v9, v2, Lbk/b;->x:Ljava/util/Iterator;

    iget-object v10, v2, Lbk/b;->w:La33/d;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object/from16 v16, v4

    move-object v4, v2

    move-object v2, v10

    :goto_1
    move-object v10, v9

    move-object/from16 v9, v16

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object v2, v10

    goto/16 :goto_8

    :cond_4
    iget-object v4, v2, Lbk/b;->w:La33/d;

    :try_start_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_2

    :catch_3
    move-exception v0

    move-object v2, v4

    goto/16 :goto_8

    :cond_5
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    iget-object v0, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    iput-object v1, v2, Lbk/b;->w:La33/d;

    iput v9, v2, Lbk/b;->J:I

    invoke-virtual {v0, v2}, Ldk/f;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    if-ne v0, v3, :cond_6

    goto/16 :goto_7

    :cond_6
    move-object v4, v1

    :goto_2
    :try_start_5
    iget-object v0, v4, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    invoke-virtual {v0}, Ldk/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_7

    iget-object v0, v4, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    iget-object v0, v0, Ldk/f;->c:Lnk/i;

    iget-object v2, v0, Lnk/i;->c:Laj/d;

    iget-object v3, v0, Lnk/i;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Laj/d;->f(Ljava/lang/String;)V

    iget-object v0, v0, Lnk/i;->g:Ljava/lang/String;

    invoke-virtual {v2, v0}, Laj/d;->f(Ljava/lang/String;)V

    return-object v5

    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move-object v9, v0

    move-object v0, v2

    move-object v2, v4

    :goto_3
    :try_start_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v10, 0x0

    if-eqz v4, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v11, v2, La33/d;->x:Ljava/lang/Object;

    check-cast v11, Ldk/f;

    iput-object v2, v0, Lbk/b;->w:La33/d;

    iput-object v9, v0, Lbk/b;->x:Ljava/util/Iterator;

    iput-object v4, v0, Lbk/b;->y:Ljava/lang/String;

    iput-object v10, v0, Lbk/b;->z:Ljava/util/List;

    iput-object v10, v0, Lbk/b;->E:Ljava/util/Iterator;

    iput-object v10, v0, Lbk/b;->F:Ljk/a;

    iput v8, v0, Lbk/b;->J:I

    invoke-virtual {v11, v4, v0}, Ldk/f;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_8

    goto/16 :goto_7

    :cond_8
    move-object/from16 v16, v4

    move-object v4, v0

    move-object v0, v10

    goto :goto_1

    :goto_4
    check-cast v0, Ljava/lang/String;

    new-instance v11, Lorg/json/JSONArray;

    invoke-direct {v11, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v11}, Lhg3/i;->n0(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    move-object v13, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v0

    :cond_9
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljk/a;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    add-int/lit8 v12, v12, 0x1

    :try_start_7
    iget-object v0, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    iput-object v2, v4, Lbk/b;->w:La33/d;

    iput-object v9, v4, Lbk/b;->x:Ljava/util/Iterator;

    iput-object v13, v4, Lbk/b;->y:Ljava/lang/String;

    move-object v15, v11

    check-cast v15, Ljava/util/List;

    iput-object v15, v4, Lbk/b;->z:Ljava/util/List;

    iput-object v10, v4, Lbk/b;->E:Ljava/util/Iterator;

    iput-object v14, v4, Lbk/b;->F:Ljk/a;

    iput v12, v4, Lbk/b;->G:I

    iput v7, v4, Lbk/b;->J:I

    invoke-virtual {v0, v14, v4}, Ldk/f;->e(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    if-ne v0, v3, :cond_9

    goto/16 :goto_7

    :catch_4
    move-exception v0

    move-object/from16 v16, v13

    move-object v13, v9

    move-object v9, v14

    move-object/from16 v14, v16

    :goto_6
    :try_start_8
    iget-object v15, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v15, Lfk/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "can\'t move event ("

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ") from file "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v15, v0}, Lfk/a;->error(Ljava/lang/String;)V

    move-object v9, v13

    move-object v13, v14

    const/4 v7, 0x3

    const/4 v8, 0x2

    goto :goto_5

    :cond_a
    iget-object v0, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lfk/a;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Migrated "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v8, 0x2f

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, " events from "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object v0, v2, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    invoke-virtual {v0, v13}, Ldk/f;->i(Ljava/lang/String;)V

    move-object v0, v4

    const/4 v7, 0x3

    const/4 v8, 0x2

    goto/16 :goto_3

    :cond_b
    iget-object v4, v2, La33/d;->x:Ljava/lang/Object;

    check-cast v4, Ldk/f;

    iget-object v4, v4, Ldk/f;->c:Lnk/i;

    iget-object v7, v4, Lnk/i;->c:Laj/d;

    iget-object v8, v4, Lnk/i;->f:Ljava/lang/String;

    invoke-virtual {v7, v8}, Laj/d;->f(Ljava/lang/String;)V

    iget-object v4, v4, Lnk/i;->g:Ljava/lang/String;

    invoke-virtual {v7, v4}, Laj/d;->f(Ljava/lang/String;)V

    iget-object v4, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v4, Ldk/f;

    iput-object v2, v0, Lbk/b;->w:La33/d;

    iput-object v10, v0, Lbk/b;->x:Ljava/util/Iterator;

    iput-object v10, v0, Lbk/b;->y:Ljava/lang/String;

    iput-object v10, v0, Lbk/b;->z:Ljava/util/List;

    iput-object v10, v0, Lbk/b;->E:Ljava/util/Iterator;

    iput-object v10, v0, Lbk/b;->F:Ljk/a;

    iput v6, v0, Lbk/b;->J:I

    invoke-virtual {v4, v0}, Ldk/f;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    if-ne v0, v3, :cond_c

    :goto_7
    return-object v3

    :catch_5
    move-exception v0

    move-object v2, v1

    :goto_8
    iget-object v2, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v2, Lfk/a;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "can\'t move event files: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lfk/a;->error(Ljava/lang/String;)V

    :cond_c
    :goto_9
    return-object v5
.end method

.method public B(Lik/a;Ls83/c;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    const-string v1, "can\'t write destination "

    const-string v2, "Migrating "

    instance-of v3, p2, Lbk/c;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lbk/c;

    iget v4, v3, Lbk/c;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lbk/c;->E:I

    goto :goto_0

    :cond_0
    new-instance v3, Lbk/c;

    invoke-direct {v3, p0, p2}, Lbk/c;-><init>(La33/d;Ls83/c;)V

    :goto_0
    iget-object p2, v3, Lbk/c;->y:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lbk/c;->E:I

    const-string v6, ": "

    const/4 v7, 0x2

    const/4 v8, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object p1, v3, Lbk/c;->x:Lik/a;

    iget-object v0, v3, Lbk/c;->w:La33/d;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v9

    :catch_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v3, Lbk/c;->x:Lik/a;

    iget-object v0, v3, Lbk/c;->w:La33/d;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object p2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast p2, Ldk/f;

    invoke-virtual {p2, p1}, Ldk/f;->c(Lik/a;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0, p1}, Ldk/f;->c(Lik/a;)Ljava/lang/String;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-nez v5, :cond_5

    :try_start_3
    iget-object v5, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v5, Lfk/a;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with value "

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v5, v2}, Lfk/a;->debug(Ljava/lang/String;)V

    iput-object p0, v3, Lbk/c;->w:La33/d;

    iput-object p1, v3, Lbk/c;->x:Lik/a;

    iput v8, v3, Lbk/c;->E:I

    invoke-virtual {v0, p1, p2}, Ldk/f;->b(Lik/a;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-ne v9, v4, :cond_5

    goto :goto_3

    :catch_2
    move-exception p2

    move-object v0, p0

    :goto_1
    :try_start_4
    iget-object v2, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v2, Lfk/a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v2, p2}, Lfk/a;->error(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    move-object v0, p0

    :goto_2
    iget-object p2, v0, La33/d;->x:Ljava/lang/Object;

    check-cast p2, Ldk/f;

    iput-object v0, v3, Lbk/c;->w:La33/d;

    iput-object p1, v3, Lbk/c;->x:Lik/a;

    iput v7, v3, Lbk/c;->E:I

    iget-object p2, p2, Ldk/f;->b:Landroid/content/SharedPreferences;

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    iget-object v1, p1, Lik/a;->w:Ljava/lang/String;

    invoke-interface {p2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    if-ne v9, v4, :cond_6

    :goto_3
    return-object v4

    :cond_6
    :goto_4
    return-object v9

    :catch_3
    move-exception p2

    move-object v0, p0

    :goto_5
    iget-object v0, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lfk/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "can\'t move "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfk/a;->error(Ljava/lang/String;)V

    return-object v9
.end method

.method public C(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lbk/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbk/d;

    iget v1, v0, Lbk/d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbk/d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbk/d;

    invoke-direct {v0, p0, p1}, Lbk/d;-><init>(La33/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbk/d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbk/d;->z:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget-object v2, v0, Lbk/d;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object v2, v0, Lbk/d;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :pswitch_3
    iget-object v2, v0, Lbk/d;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :pswitch_4
    iget-object v2, v0, Lbk/d;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_5
    iget-object v2, v0, Lbk/d;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_6
    iget-object v2, v0, Lbk/d;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x1

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->y:Lik/a;

    invoke-virtual {p0, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto :goto_7

    :cond_1
    move-object v2, p0

    :goto_1
    iput-object v2, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x2

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->z:Lik/a;

    invoke-virtual {v2, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_7

    :cond_2
    :goto_2
    iput-object v2, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x3

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->x:Lik/a;

    invoke-virtual {v2, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_7

    :cond_3
    :goto_3
    iput-object v2, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x4

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->E:Lik/a;

    invoke-virtual {v2, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_7

    :cond_4
    :goto_4
    iput-object v2, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x5

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->F:Lik/a;

    invoke-virtual {v2, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_7

    :cond_5
    :goto_5
    iput-object v2, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x6

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->G:Lik/a;

    invoke-virtual {v2, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_7

    :cond_6
    :goto_6
    const/4 p1, 0x0

    iput-object p1, v0, Lbk/d;->w:La33/d;

    const/4 p1, 0x7

    iput p1, v0, Lbk/d;->z:I

    sget-object p1, Lik/a;->H:Lik/a;

    invoke-virtual {v2, p1, v0}, La33/d;->B(Lik/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_7
    return-object v1

    :cond_7
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public D(Landroidx/lifecycle/v;)V
    .locals 2

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/u1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/lifecycle/u1;->run()V

    :cond_0
    new-instance v0, Landroidx/lifecycle/u1;

    iget-object v1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/i0;

    invoke-direct {v0, v1, p1}, Landroidx/lifecycle/u1;-><init>(Landroidx/lifecycle/i0;Landroidx/lifecycle/v;)V

    iput-object v0, p0, La33/d;->z:Ljava/lang/Object;

    iget-object p1, p0, La33/d;->y:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public E(ILa33/c;Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, La33/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, La33/a;

    iget v1, v0, La33/a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La33/a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, La33/a;

    invoke-direct {v0, p0, p3}, La33/a;-><init>(La33/d;Ls83/c;)V

    :goto_0
    iget-object p3, v0, La33/a;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La33/a;->I:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, La33/a;->z:I

    iget-wide v6, v0, La33/a;->F:J

    iget p2, v0, La33/a;->y:I

    iget-object v2, v0, La33/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, La33/a;->w:La33/d;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, La33/a;->E:I

    iget p2, v0, La33/a;->z:I

    iget-wide v6, v0, La33/a;->F:J

    iget v2, v0, La33/a;->y:I

    iget-object v8, v0, La33/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, La33/a;->w:La33/d;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p3

    goto :goto_3

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v6, 0x1f4

    move-object v9, p0

    move-object p3, p2

    move p2, p1

    move p1, v3

    :goto_1
    if-ge p1, p2, :cond_e

    :try_start_1
    iput-object v9, v0, La33/a;->w:La33/d;

    iput-object p3, v0, La33/a;->x:Lkotlin/jvm/functions/Function1;

    iput p2, v0, La33/a;->y:I

    iput-wide v6, v0, La33/a;->F:J

    iput p1, v0, La33/a;->z:I

    iput p1, v0, La33/a;->E:I

    iput v5, v0, La33/a;->I:I

    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v1, :cond_4

    goto/16 :goto_a

    :cond_4
    move v2, p2

    move-object v8, p3

    move p2, p1

    :goto_2
    :try_start_2
    sget-object p3, Ll83/a0;->a:Ll83/a0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_1
    move-exception v2

    move-object v8, p3

    move-object p3, v2

    move v2, p2

    move p2, p1

    :goto_3
    invoke-static {p3}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p3

    :goto_4
    instance-of v10, p3, Ll83/m;

    if-nez v10, :cond_5

    return-object p3

    :cond_5
    invoke-static {p3}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v10, p3, Lretrofit2/HttpException;

    if-eqz v10, :cond_7

    move-object v10, p3

    check-cast v10, Lretrofit2/HttpException;

    iget v10, v10, Lretrofit2/HttpException;->w:I

    const/16 v11, 0x1f4

    if-gt v11, v10, :cond_6

    const/16 v11, 0x258

    if-ge v10, v11, :cond_6

    :goto_5
    move v10, v5

    goto :goto_9

    :cond_6
    move v10, v3

    goto :goto_9

    :cond_7
    instance-of v10, p3, Ljava/net/SocketTimeoutException;

    if-eqz v10, :cond_8

    move v10, v5

    goto :goto_6

    :cond_8
    instance-of v10, p3, Ljava/net/ConnectException;

    :goto_6
    if-eqz v10, :cond_9

    move v10, v5

    goto :goto_7

    :cond_9
    instance-of v10, p3, Ljava/net/UnknownHostException;

    :goto_7
    if-eqz v10, :cond_a

    move v10, v5

    goto :goto_8

    :cond_a
    instance-of v10, p3, Ljava/io/IOException;

    :goto_8
    if-eqz v10, :cond_6

    goto :goto_5

    :goto_9
    if-nez v10, :cond_b

    new-instance p1, La33/e;

    const-string p2, "Failure is not retryable"

    invoke-direct {p1, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_b
    add-int/lit8 p3, v2, -0x1

    if-ge p1, p3, :cond_d

    const-wide/16 v10, 0x1

    shl-long/2addr v10, p1

    mul-long/2addr v10, v6

    iput-object v9, v0, La33/a;->w:La33/d;

    iput-object v8, v0, La33/a;->x:Lkotlin/jvm/functions/Function1;

    iput v2, v0, La33/a;->y:I

    iput-wide v6, v0, La33/a;->F:J

    iput p2, v0, La33/a;->z:I

    iput v4, v0, La33/a;->I:I

    invoke-static {v10, v11, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_a
    return-object v1

    :cond_c
    move p1, p2

    move p2, v2

    move-object v2, v8

    move-object v8, v9

    :goto_b
    move-object p3, v2

    move-object v9, v8

    move v2, p2

    move p2, p1

    goto :goto_c

    :cond_d
    move-object p3, v8

    :goto_c
    add-int/lit8 p1, p2, 0x1

    move p2, v2

    goto/16 :goto_1

    :cond_e
    new-instance p1, La33/e;

    const/4 p2, 0x0

    const-string p3, "Retry attempts exhausted"

    invoke-direct {p1, p3, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;
    .locals 7

    new-instance v0, Le43/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Le43/c;-><init>(La33/d;Landroid/content/Intent;I)V

    invoke-virtual {p0, v0}, La33/d;->N(Lc93/a;)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    sget-object v3, Le43/b;->w:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v4, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    iget-object p1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast p1, Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb23/k;

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v0, Lb23/g;->F:Lb23/g;

    invoke-interface {p2, v0, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "Developer error. Intent action must be set"

    invoke-interface {p1, v0, p3, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "kotlin.Unit"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget v2, Lio/getstream/video/android/core/notifications/internal/DismissNotificationActivity;->w:I

    const-string v2, "context"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/content/Intent;

    const-class v6, Lio/getstream/video/android/core/notifications/internal/DismissNotificationActivity;

    invoke-direct {v2, v4, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v6, "KEY_NOTIFICATION_ID"

    invoke-virtual {v2, v6, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {v2, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance p3, Landroid/content/Intent;

    invoke-direct {p3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    new-instance p1, Landroid/content/ComponentName;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v5, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {p1, v5, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string p1, "io.getstream.video.android.intent-extra.call_cid"

    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    filled-new-array {p3, v2}, [Landroid/content/Intent;

    move-result-object p1

    invoke-static {v4, v1, p1, v3}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "getActivities(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    return-object v2
.end method

.method public H(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/PendingIntent;
    .locals 5

    new-instance v0, Le43/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Le43/c;-><init>(La33/d;Landroid/content/Intent;I)V

    invoke-virtual {p0, v0}, La33/d;->N(Lc93/a;)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Le43/b;->w:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    new-instance p1, Landroid/content/ComponentName;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {p1, v4, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const-string p1, "io.getstream.video.android.intent-extra.call_cid"

    invoke-virtual {v3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p1, 0x0

    invoke-static {v2, p1, v3, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "getBroadcast(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public I(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-string v0, "io.getstream.video.android.action.LEAVE_CALL"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "putExtras(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, La33/d;->H(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public K(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;
    .locals 2

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroid/content/Intent;

    const-string v0, "io.getstream.video.android.action.ONGOING_CALL"

    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "io.getstream.video.android.intent-extra.call_cid"

    invoke-virtual {p1}, Lio/getstream/video/android/model/StreamCallId;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p3

    const-string v0, "putExtras(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1, p2}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public L(Lio/getstream/video/android/model/StreamCallId;ILjava/util/Map;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroid/content/Intent;

    const-string v0, "io.getstream.video.android.action.OUTGOING_CALL"

    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v0, 0x20000

    invoke-virtual {p3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p3, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p3

    const-string v0, "putExtras(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1, p2}, La33/d;->G(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public M(Lio/getstream/video/android/model/StreamCallId;Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "callId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    const-string v0, "io.getstream.video.android.action.REJECT_CALL"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "putExtras(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p1}, La33/d;->H(Landroid/content/Intent;Lio/getstream/video/android/model/StreamCallId;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public N(Lc93/a;)Landroid/content/pm/ResolveInfo;
    .locals 4

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/pm/ResolveInfo;

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v2, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v3, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    move-object p1, v0

    goto :goto_2

    :cond_3
    move-object v1, v0

    check-cast v1, Landroid/content/pm/ResolveInfo;

    iget v1, v1, Landroid/content/pm/ResolveInfo;->priority:I

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/content/pm/ResolveInfo;

    iget v3, v3, Landroid/content/pm/ResolveInfo;->priority:I

    if-ge v1, v3, :cond_5

    move-object v0, v2

    move v1, v3

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :goto_2
    check-cast p1, Landroid/content/pm/ResolveInfo;

    return-object p1
.end method

.method public O(Ldm/a;)V
    .locals 8

    new-instance v0, Lcom/mapbox/maps/l;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lcom/mapbox/maps/l;-><init>(I)V

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lgm/q;

    iget-object v2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, Lgm/i;

    iget-object v3, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v3, Ldm/c;

    iget-object v4, v1, Lgm/q;->c:Llm/b;

    invoke-static {}, Lgm/i;->a()La33/d;

    move-result-object v5

    iget-object v6, v2, Lgm/i;->a:Ljava/lang/String;

    invoke-virtual {v5, v6}, La33/d;->Q(Ljava/lang/String;)V

    sget-object v6, Ldm/d;->w:Ldm/d;

    iput-object v6, v5, La33/d;->z:Ljava/lang/Object;

    iget-object v2, v2, Lgm/i;->b:[B

    iput-object v2, v5, La33/d;->y:Ljava/lang/Object;

    invoke-virtual {v5}, La33/d;->d()Lgm/i;

    move-result-object v2

    new-instance v5, La30/w0;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, La30/w0;-><init>(I)V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iput-object v6, v5, La30/w0;->G:Ljava/lang/Object;

    iget-object v6, v1, Lgm/q;->a:Lpm/a;

    invoke-interface {v6}, Lpm/a;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iput-object v6, v5, La30/w0;->E:Ljava/lang/Object;

    iget-object v1, v1, Lgm/q;->b:Lpm/a;

    invoke-interface {v1}, Lpm/a;->getTime()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v5, La30/w0;->F:Ljava/lang/Object;

    const-string v1, "FCM_CLIENT_EVENT_LOGGING"

    iput-object v1, v5, La30/w0;->z:Ljava/lang/Object;

    new-instance v1, Lgm/m;

    iget-object p1, p1, Ldm/a;->a:Lau/f;

    sget-object v6, Lzt/n;->a:Lgm/r;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {v6, p1, v7}, Lgm/r;->A(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-direct {v1, v3, p1}, Lgm/m;-><init>(Ldm/c;[B)V

    iput-object v1, v5, La30/w0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, v5, La30/w0;->x:Ljava/lang/Object;

    invoke-virtual {v5}, La30/w0;->m()Lgm/h;

    move-result-object p1

    check-cast v4, Llm/a;

    iget-object v1, v4, Llm/a;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/fragment/app/d;

    invoke-direct {v3, v4, v2, v0, p1}, Landroidx/fragment/app/d;-><init>(Llm/a;Lgm/i;Lcom/mapbox/maps/l;Lgm/h;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public P(Lio/getstream/android/video/generated/models/ClientEvent;)V
    .locals 4

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Lhc3/d;

    new-instance v1, Le;

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public Q(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, La33/d;->x:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null backendName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public R()V
    .locals 2

    iget v0, p0, La33/d;->w:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Lty/c;

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lgl/u;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lgl/u;->w:[B

    array-length v1, v1

    iput v1, v0, Lgl/u;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public b([ILandroid/animation/ValueAnimator;)V
    .locals 1

    new-instance v0, Lkr/e;

    invoke-direct {v0, p1, p2}, Lkr/e;-><init>([ILandroid/animation/ValueAnimator;)V

    iget-object p1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast p1, Lar/d;

    invoke-virtual {p2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lx8/n;)V
    .locals 13

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Lx8/s;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    sget v0, Lx8/t;->a:I

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lx8/s;

    monitor-enter v1

    :try_start_0
    iget-wide v2, v1, Lx8/s;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-wide v6, v1, Lx8/s;->b:J

    add-long/2addr v2, v6

    :goto_0
    move-wide v7, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    invoke-virtual {v1}, Lx8/s;->d()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    monitor-exit v1

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx8/s;

    monitor-enter v2

    :try_start_1
    iget-wide v0, v2, Lx8/s;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    cmp-long v2, v7, v4

    if-eqz v2, :cond_3

    cmp-long v2, v0, v4

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object v2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, Lu8/p;

    iget-wide v3, v2, Lu8/p;->s:J

    cmp-long v3, v0, v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lu8/p;->a()Lu8/o;

    move-result-object v2

    iput-wide v0, v2, Lu8/o;->r:J

    new-instance v0, Lu8/p;

    invoke-direct {v0, v2}, Lu8/p;-><init>(Lu8/o;)V

    iput-object v0, p0, La33/d;->x:Ljava/lang/Object;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lt9/k0;

    invoke-interface {v1, v0}, Lt9/k0;->a(Lu8/p;)V

    :cond_2
    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v10

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lt9/k0;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v10, v1}, Lt9/k0;->d(Lx8/n;II)V

    iget-object p1, p0, La33/d;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lt9/k0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x1

    invoke-interface/range {v6 .. v12}, Lt9/k0;->b(JIIILt9/j0;)V

    :cond_3
    :goto_2
    return-void

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public d()Lgm/i;
    .locals 4

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, " backendName"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Ldm/d;

    if-nez v1, :cond_1

    const-string v1, " priority"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v0, Lgm/i;

    iget-object v1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v2, [B

    iget-object v3, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v3, Ldm/d;

    invoke-direct {v0, v1, v2, v3}, Lgm/i;-><init>(Ljava/lang/String;[BLdm/d;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public e(Ljava/lang/String;JJI)Ljava/lang/String;
    .locals 8

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x3

    if-ne v5, v6, :cond_2

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x4

    if-ne v5, v6, :cond_3

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public f(Led3/a;)V
    .locals 13

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Llo/x;

    invoke-static {v0}, Llo/a;->j(Ljava/lang/Object;)V

    sget v0, Llo/y;->a:I

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Llo/x;

    monitor-enter v1

    :try_start_0
    iget-wide v2, v1, Llo/x;->c:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    iget-wide v6, v1, Llo/x;->b:J

    add-long/2addr v2, v6

    :goto_0
    move-wide v7, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    invoke-virtual {v1}, Llo/x;->c()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    monitor-exit v1

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Llo/x;

    monitor-enter v2

    :try_start_1
    iget-wide v0, v2, Llo/x;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    cmp-long v2, v7, v4

    if-eqz v2, :cond_3

    cmp-long v2, v0, v4

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object v2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, Lrm/c0;

    iget-wide v3, v2, Lrm/c0;->P:J

    cmp-long v3, v0, v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lrm/c0;->a()Lrm/b0;

    move-result-object v2

    iput-wide v0, v2, Lrm/b0;->o:J

    new-instance v0, Lrm/c0;

    invoke-direct {v0, v2}, Lrm/c0;-><init>(Lrm/b0;)V

    iput-object v0, p0, La33/d;->x:Ljava/lang/Object;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lwm/s;

    invoke-interface {v1, v0}, Lwm/s;->a(Lrm/c0;)V

    :cond_2
    invoke-virtual {p1}, Led3/a;->a()I

    move-result v10

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lwm/s;

    invoke-interface {v0, v10, p1}, Lwm/s;->c(ILed3/a;)V

    iget-object p1, p0, La33/d;->z:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Lwm/s;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x1

    invoke-interface/range {v6 .. v12}, Lwm/s;->d(JIIILwm/r;)V

    :cond_3
    :goto_2
    return-void

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public g(Lx8/s;Lt9/q;Lab/l0;)V
    .locals 0

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    invoke-virtual {p3}, Lab/l0;->c()V

    invoke-virtual {p3}, Lab/l0;->h()V

    iget p1, p3, Lab/l0;->e:I

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lt9/q;->o(II)Lt9/k0;

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    iget-object p2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast p2, Lu8/p;

    invoke-interface {p1, p2}, Lt9/k0;->a(Lu8/p;)V

    return-void
.end method

.method public h(Lt9/q;Lab/l0;)V
    .locals 9

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, [Lt9/k0;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_3

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v3, p2, Lab/l0;->e:I

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v3

    iget-object v4, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/p;

    iget-object v5, v4, Lu8/p;->n:Ljava/lang/String;

    const-string v6, "application/cea-608"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "application/cea-708"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v6, 0x1

    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Invalid closed caption MIME type provided: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lva3/g;->e(ZLjava/lang/String;)V

    iget-object v6, v4, Lu8/p;->a:Ljava/lang/String;

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v6, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    :goto_3
    new-instance v7, Lu8/o;

    invoke-direct {v7}, Lu8/o;-><init>()V

    iput-object v6, v7, Lu8/o;->a:Ljava/lang/String;

    const-string v6, "video/mp2t"

    invoke-static {v6}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v7, Lu8/o;->l:Ljava/lang/String;

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v7, Lu8/o;->m:Ljava/lang/String;

    iget v5, v4, Lu8/p;->e:I

    iput v5, v7, Lu8/o;->e:I

    iget-object v5, v4, Lu8/p;->d:Ljava/lang/String;

    iput-object v5, v7, Lu8/o;->d:Ljava/lang/String;

    iget v5, v4, Lu8/p;->I:I

    iput v5, v7, Lu8/o;->H:I

    iget-object v4, v4, Lu8/p;->q:Ljava/util/List;

    iput-object v4, v7, Lu8/o;->p:Ljava/util/List;

    invoke-static {v7, v3}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public i(Llo/x;Lwm/k;Lab/l0;)V
    .locals 0

    iput-object p1, p0, La33/d;->y:Ljava/lang/Object;

    invoke-virtual {p3}, Lab/l0;->c()V

    invoke-virtual {p3}, Lab/l0;->h()V

    iget p1, p3, Lab/l0;->e:I

    const/4 p3, 0x5

    invoke-interface {p2, p1, p3}, Lwm/k;->o(II)Lwm/s;

    move-result-object p1

    iput-object p1, p0, La33/d;->z:Ljava/lang/Object;

    iget-object p2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast p2, Lrm/c0;

    invoke-interface {p1, p2}, Lwm/s;->a(Lrm/c0;)V

    return-void
.end method

.method public j(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    iget v0, p0, La33/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lxk/h;

    iget-object v0, v0, Lxk/h;->w:Ljava/lang/Object;

    check-cast v0, Lpe3/a;

    invoke-virtual {v0}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Lty/c;

    iget-object v0, v0, Lty/c;->x:Ljava/lang/Object;

    check-cast v0, Lgl/u;

    invoke-virtual {v0}, Lgl/u;->reset()V

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public k(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lbk/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbk/a;

    iget v1, v0, Lbk/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbk/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbk/a;

    invoke-direct {v0, p0, p1}, Lbk/a;-><init>(La33/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbk/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbk/a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lbk/a;->w:La33/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lbk/a;->w:La33/d;

    iput v4, v0, Lbk/a;->z:I

    invoke-virtual {p0, v0}, La33/d;->A(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Lbk/a;->w:La33/d;

    iput v3, v0, Lbk/a;->z:I

    invoke-virtual {v2, v0}, La33/d;->C(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public l()V
    .locals 5

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Lp0/n0;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lfk/a;

    const-string v2, "Loaded old identity: "

    :try_start_0
    iget-object v3, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v3, Lp0/n0;

    invoke-virtual {v3}, Lp0/n0;->g()Lqk/a;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object v2, v3, Lqk/a;->a:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Lp0/n0;->k(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, v3, Lqk/a;->b:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Lp0/n0;->j(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to migrate file identity storage: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lfk/a;->error(Ljava/lang/String;)V

    return-void
.end method

.method public m(Ldz/i;)V
    .locals 4

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Landroidx/room/e;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v3, v2}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public o()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public p(Ljava/util/Map;)Landroid/app/PendingIntent;
    .locals 3

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const/high16 v1, 0x20000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v1

    iget-object v2, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Lkr/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v1, 0x0

    const/high16 v2, 0xc000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string v0, "getActivity(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljp/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Lcq/i;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast p1, Lcq/l;

    iget-object p1, p1, Lcq/l;->a:Lcq/u;

    invoke-virtual {p1, v1}, Lcq/u;->b(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1}, Lcq/i;->c(Ljava/lang/Exception;)Z

    return-void
.end method

.method public r()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x7

    invoke-static {v0}, La33/d;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public request(J)V
    .locals 10

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lch3/u0;

    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_2

    iget-boolean v4, v1, Lch3/u0;->F:Z

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v4

    iget-object v6, v1, Lch3/u0;->H:Lch3/v0;

    iget v6, v6, Lch3/v0;->w:I

    int-to-long v6, v6

    sub-long/2addr v6, v4

    invoke-static {p1, p2, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    cmp-long v8, v6, v2

    if-nez v8, :cond_1

    goto :goto_0

    :cond_1
    add-long v8, v4, v6

    invoke-virtual {v0, v4, v5, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p1, p0, La33/d;->y:Ljava/lang/Object;

    check-cast p1, Lxg3/i;

    invoke-interface {p1, v6, v7}, Lxg3/i;->request(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method public s()I
    .locals 11

    iget v0, p0, La33/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lxk/h;

    iget-object v2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, Lal/g;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_2

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwk/d;

    const/4 v7, 0x0

    :try_start_0
    new-instance v8, Lgl/u;

    new-instance v9, Ljava/io/FileInputStream;

    iget-object v10, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v10, Lpe3/a;

    invoke-virtual {v10}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v10

    invoke-virtual {v10}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v8, v9, v2}, Lgl/u;-><init>(Ljava/io/InputStream;Lal/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v6, v8, v2}, Lwk/d;->c(Ljava/io/InputStream;Lal/g;)I

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v8}, Lgl/u;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    iget-object v7, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v7, Lpe3/a;

    invoke-virtual {v7}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    if-eq v6, v5, :cond_0

    move v5, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v7, v8

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v7, :cond_1

    :try_start_3
    invoke-virtual {v7}, Lgl/u;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_1
    iget-object v1, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v1, Lpe3/a;

    invoke-virtual {v1}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v0

    :cond_2
    :goto_2
    return v5

    :pswitch_0
    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Lty/c;

    iget-object v1, v1, Lty/c;->x:Ljava/lang/Object;

    check-cast v1, Lgl/u;

    invoke-virtual {v1}, Lgl/u;->reset()V

    iget-object v2, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Lal/g;

    invoke-static {v0, v1, v2}, Ls4/b;->j(Ljava/util/List;Ljava/io/InputStream;Lal/g;)I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public t()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 10

    iget v0, p0, La33/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v1, Lxk/h;

    iget-object v2, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, Lal/g;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwk/d;

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, Lgl/u;

    new-instance v8, Ljava/io/FileInputStream;

    iget-object v9, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v9, Lpe3/a;

    invoke-virtual {v9}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v9

    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v7, v8, v2}, Lgl/u;-><init>(Ljava/io/InputStream;Lal/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v5, v7}, Lwk/d;->b(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v7}, Lgl/u;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    iget-object v6, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v6, Lpe3/a;

    invoke-virtual {v6}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v5, v6, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v6, v7

    goto :goto_1

    :catchall_1
    move-exception v0

    :goto_1
    if-eqz v6, :cond_1

    :try_start_3
    invoke-virtual {v6}, Lgl/u;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_1
    iget-object v1, v1, Lxk/h;->w:Ljava/lang/Object;

    check-cast v1, Lpe3/a;

    invoke-virtual {v1}, Lpe3/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v0

    :cond_2
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    :goto_2
    return-object v5

    :pswitch_0
    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Lty/c;

    iget-object v1, v1, Lty/c;->x:Ljava/lang/Object;

    check-cast v1, Lgl/u;

    invoke-virtual {v1}, Lgl/u;->reset()V

    iget-object v2, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v2, Lal/g;

    invoke-static {v0, v1, v2}, Ls4/b;->n(Ljava/util/List;Ljava/io/InputStream;Lal/g;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_0
    .end packed-switch
.end method

.method public u()Lcom/google/crypto/tink/internal/j0;
    .locals 1

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/internal/j0;

    return-object v0
.end method

.method public v([B)Ljava/util/List;
    .locals 1

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {p1}, Lct/a;->a([B)Lct/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public w()Llb3/y;
    .locals 1

    iget-object v0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v0, Llb3/y;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, La33/d;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x5

    invoke-static {v0}, La33/d;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public z()Z
    .locals 1

    iget-object v0, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, Lss/a;

    iget-object v0, v0, Lss/a;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
