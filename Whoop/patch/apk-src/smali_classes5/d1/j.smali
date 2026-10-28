.class public Ld1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx43/e;
.implements Lai/k;
.implements Lorg/webrtc/RTCStatsCollectorCallback;
.implements Lwm/d;
.implements Lg40/z;
.implements Lhg/n;
.implements Lhg/h;
.implements Lko/k;
.implements Ly2/x1;
.implements Lq1/k0;
.implements Lko/d0;
.implements Lcq/h;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Ld1/j;->w:I

    packed-switch p1, :pswitch_data_0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, La53/a;

    const/4 v0, 0x0

    .line 24
    invoke-direct {p1, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    .line 25
    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 26
    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "getValue(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lqx/l0;

    .line 27
    const-class v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance p1, Lej/b;

    .line 30
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 32
    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ld1/j;->w:I

    iput-object p2, p0, Ld1/j;->x:Ljava/lang/Object;

    iput-object p3, p0, Ld1/j;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Ld1/j;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JLai/j;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Ld1/j;->w:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p3, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 38
    new-instance p3, Lai/h;

    invoke-direct {p3, p1, p2, p0}, Lai/h;-><init>(JLd1/j;)V

    iput-object p3, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Ld1/j;->w:I

    packed-switch p2, :pswitch_data_0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x0

    .line 72
    iput-object p2, p0, Ld1/j;->y:Ljava/lang/Object;

    .line 73
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    return-void

    .line 74
    :pswitch_0
    new-instance p2, Lcom/google/android/material/datepicker/n;

    invoke-direct {p2}, Lcom/google/android/material/datepicker/n;-><init>()V

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 77
    iput-object p2, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void

    .line 78
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p2, 0x7f130000

    .line 79
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lse/h;->v(Landroid/content/Context;Ljava/lang/Integer;)Landroid/net/Uri;

    move-result-object p2

    iput-object p2, p0, Ld1/j;->x:Ljava/lang/Object;

    const p2, 0x7f130001

    .line 80
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2}, Lse/h;->v(Landroid/content/Context;Ljava/lang/Integer;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ld1/j;->w:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 40
    sget-object p1, Ll83/i;->y:Ll83/i;

    new-instance v0, Ld1/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/core/app/NotificationManagerCompat;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Ld1/j;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 8
    const-string p1, "DefaultNotificationDispatcher"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lc93/a;Lp1/c1;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Ld1/j;->w:I

    const-string v0, "dismissKeyboard"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isKeyboardVisible"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li20/y0;Lf1/p1;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Ld1/j;->w:I

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lig/d;Lhg/j;Ljava/lang/String;)V
    .locals 7

    const/16 v0, 0x11

    iput v0, p0, Ld1/j;->w:I

    const-string v0, "prefix"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 46
    iput-object p3, p0, Ld1/j;->y:Ljava/lang/Object;

    .line 47
    iget-object p1, p2, Lhg/i;->c:Ljava/util/Set;

    .line 48
    check-cast p1, Ljava/lang/Iterable;

    .line 49
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 51
    check-cast p3, Lhg/d;

    .line 52
    instance-of v0, p3, Lig/e;

    if-eqz v0, :cond_1

    check-cast p3, Lig/e;

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    if-eqz p3, :cond_0

    .line 53
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lig/e;

    .line 55
    new-instance p3, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Lig/c;

    .line 56
    iget-object v2, p2, Lig/e;->a:Ljava/lang/String;

    .line 57
    invoke-direct {v1, v2}, Lig/c;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v3, v2, [Lhg/d;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    .line 58
    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p3, v0, v1, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    .line 59
    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lig/d;

    .line 60
    iget-object v1, v1, Lig/d;->w:Lyf/k;

    .line 61
    iget-object v3, v1, Lyf/k;->w:Lne3/h;

    .line 62
    iget-wide v3, v3, Lne3/h;->x:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_3

    .line 63
    const-string v3, "&"

    .line 64
    invoke-virtual {v1, v2, v3}, Lyf/k;->z(ILjava/lang/String;)V

    .line 65
    :cond_3
    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {v1, v0}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    .line 66
    :cond_4
    invoke-static {p3}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    .line 67
    const-string p3, "="

    .line 68
    invoke-virtual {v1, v2, p3}, Lyf/k;->z(ILjava/lang/String;)V

    .line 69
    iget-object p2, p2, Lig/e;->b:Ljava/lang/String;

    .line 70
    invoke-virtual {p0, p2}, Ld1/j;->F(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Ld1/j;->w:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lej/b;

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 21
    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ld1/j;->w:I

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 111
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    .line 112
    sget-object p1, Lca3/l;->a:Lca3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lca3/k;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 114
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 115
    check-cast v0, Lca3/l;

    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 10

    const/16 v0, 0x14

    iput v0, p0, Ld1/j;->w:I

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 96
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 97
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llg3/w;

    .line 98
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 99
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 100
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    sget-object v9, Llg3/v;->a:Lb2/d;

    .line 101
    new-instance v9, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v9, v8, v6}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    invoke-virtual {v4, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 103
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 104
    sget-object v4, Llg3/v;->a:Lb2/d;

    invoke-static {v5, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 105
    invoke-virtual {v0, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 v3, 0x0

    .line 107
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 108
    :cond_1
    sget-object p1, Llg3/v;->a:Lb2/d;

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 109
    iput-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llo/x;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Ld1/j;->w:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 43
    new-instance p1, Led3/a;

    invoke-direct {p1}, Led3/a;-><init>()V

    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln53/e;Le10/r0;Ln8/a;Lb20/f;Ls00/a;Lwz/r0;Lxz/f0;Lp20/i;La1/b;)V
    .locals 0

    const/4 p4, 0x5

    iput p4, p0, Ld1/j;->w:I

    const-string p4, "confirmationHandler"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "linkInlineInteractor"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "linkAccountHolder"

    invoke-static {p7, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "analyticsCallbackProvider"

    invoke-static {p8, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 83
    iput-object p5, p0, Ld1/j;->y:Ljava/lang/Object;

    .line 84
    new-instance p4, La20/b;

    const/4 p6, 0x7

    const/4 p8, 0x0

    invoke-direct {p4, p0, p8, p6}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p6, 0x3

    invoke-static {p3, p8, p8, p4, p6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    .line 85
    iget-object p2, p2, Le10/r0;->k:Lec3/r1;

    .line 86
    iget-object p3, p5, Ls00/a;->e:Lec3/r1;

    .line 87
    iget-object p4, p7, Lxz/f0;->b:Lec3/r1;

    .line 88
    new-instance p5, Las1/j;

    const/4 p6, 0x1

    invoke-direct {p5, p0, p6}, Las1/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2, p3, p4, p5}, Lbi/g;->q(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/n;)Ln53/e;

    return-void
.end method

.method public constructor <init>(Lo30/f;Ln30/c;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Ld1/j;->w:I

    .line 13
    new-instance v0, Lo30/e;

    invoke-direct {v0, p2}, Lo30/e;-><init>(Ln30/d;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 16
    iput-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lp0/a0;)V
    .locals 1

    const/16 v0, 0x19

    iput v0, p0, Ld1/j;->w:I

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 90
    sget-object p1, La0/z0;->a:La0/m0;

    .line 91
    new-instance p1, La0/m0;

    invoke-direct {p1}, La0/m0;-><init>()V

    .line 92
    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq83/j;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Ld1/j;->w:I

    const-string v0, "ioDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lbs1/n;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lbs1/n;-><init>(I)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    .line 12
    iput-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(FFLjava/lang/Object;Ljava/lang/Object;FFF)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lej/b;

    iput p1, v0, Lej/b;->a:F

    iput p2, v0, Lej/b;->b:F

    iput-object p3, v0, Lej/b;->c:Ljava/lang/Object;

    iput-object p4, v0, Lej/b;->d:Ljava/lang/Object;

    iput p5, v0, Lej/b;->e:F

    iput p6, v0, Lej/b;->f:F

    iput p7, v0, Lej/b;->g:F

    invoke-virtual {p0, v0}, Ld1/j;->z(Lej/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public B(Lhg/i;Lkotlin/jvm/functions/Function1;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lhg/i;->c:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lhg/d;

    instance-of v4, v4, Lig/c;

    if-nez v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    new-instance v2, Lig/c;

    invoke-direct {v2, v0}, Lig/c;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Lhg/i;

    iget-object p1, p1, Lhg/i;->a:Lds/q;

    invoke-direct {v0, p1, v1}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;)V

    new-instance p1, Lig/b;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lig/d;

    invoke-direct {p1, v1, v0}, Lig/b;-><init>(Lig/d;Lhg/i;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p1, Lig/b;->x:Lyf/k;

    iget-object v0, p2, Lyf/k;->w:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    iget-wide v2, p1, Lig/b;->y:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_3

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_2

    const-string v0, "&"

    invoke-virtual {p2, v1, v0}, Lyf/k;->z(ILjava/lang/String;)V

    :cond_2
    iget-object p1, p1, Lig/b;->w:Lhg/i;

    invoke-static {p1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const-string p1, "="

    invoke-virtual {p2, v1, p1}, Lyf/k;->z(ILjava/lang/String;)V

    :cond_3
    return-void
.end method

.method public C(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V
    .locals 6

    const-string v0, "streamCallId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notification"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-virtual {p3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[notify] callId: "

    const-string v5, ", notificationId: "

    invoke-static {p1, v4, v3, v5}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v1, v2, v0, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lio/getstream/video/android/model/StreamCallId;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lio/getstream/video/android/model/StreamCallId;->getId()Ljava/lang/String;

    move-result-object p3

    check-cast v0, Lt23/b4;

    invoke-virtual {v0, v1, p3}, Lt23/b4;->n(Ljava/lang/String;Ljava/lang/String;)Lt23/c0;

    move-result-object p3

    iget-object p3, p3, Lt23/c0;->p:Lt23/s0;

    if-eqz p3, :cond_1

    invoke-virtual {p3, p1, p2}, Lt23/s0;->i(ILandroid/app/Notification;)V

    :cond_1
    iget-object p3, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast p3, Landroidx/core/app/NotificationManagerCompat;

    invoke-virtual {p3, p1, p2}, Landroidx/core/app/NotificationManagerCompat;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public D(II)V
    .locals 3

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Ld1/j;->u(I)V

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/u2;

    iget v2, v1, Landroidx/recyclerview/widget/u2;->w:I

    if-ge v2, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, p2

    iput v2, v1, Landroidx/recyclerview/widget/u2;->w:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public E(II)V
    .locals 5

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Ld1/j;->u(I)V

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p2

    array-length v3, v1

    const/4 v4, -0x1

    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    iget-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/u2;

    iget v3, v2, Landroidx/recyclerview/widget/u2;->w:I

    if-ge v3, p1, :cond_2

    goto :goto_1

    :cond_2
    if-ge v3, v0, :cond_3

    iget-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sub-int/2addr v3, p2

    iput v3, v2, Landroidx/recyclerview/widget/u2;->w:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public F(Ljava/lang/String;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lig/d;

    iget-object v0, v0, Lig/d;->w:Lyf/k;

    sget-object v1, Ltg/g;->l:Ltg/g;

    invoke-virtual {v1, p1}, Ltg/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    return-void
.end method

.method public G(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    const-string v0, "any"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    const-string v1, "toJson(...)"

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lcom/squareup/moshi/JsonAdapter;

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "getValue(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lqx/l0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public H(Lhg/i;Lc93/a;)V
    .locals 6

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lig/d;

    iget-object v1, v1, Lig/d;->w:Lyf/k;

    iget-object v2, v1, Lyf/k;->w:Lne3/h;

    iget-wide v2, v2, Lne3/h;->x:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    if-lez v2, :cond_0

    const-string v2, "&"

    invoke-virtual {v1, v3, v2}, Lyf/k;->z(ILjava/lang/String;)V

    :cond_0
    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1, v0}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    :cond_1
    invoke-static {p1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const-string p1, "="

    invoke-virtual {v1, v3, p1}, Lyf/k;->z(ILjava/lang/String;)V

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public a(Lhg/i;Ljava/lang/String;)V
    .locals 6

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lig/d;

    iget-object v1, v1, Lig/d;->w:Lyf/k;

    iget-object v2, v1, Lyf/k;->w:Lne3/h;

    iget-wide v2, v2, Lne3/h;->x:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    if-lez v2, :cond_0

    const-string v2, "&"

    invoke-virtual {v1, v3, v2}, Lyf/k;->z(ILjava/lang/String;)V

    :cond_0
    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1, v0}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    :cond_1
    invoke-static {p1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const-string p1, "="

    invoke-virtual {v1, v3, p1}, Lyf/k;->z(ILjava/lang/String;)V

    invoke-virtual {p0, p2}, Ld1/j;->F(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ly2/w1;)V
    .locals 8

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, La0/m0;

    invoke-virtual {v0}, La0/m0;->a()V

    iget-object v1, p1, Ly2/w1;->w:La0/r0;

    iget-object v2, v1, La0/r0;->b:[Ljava/lang/Object;

    iget-object v3, v1, La0/r0;->c:[J

    iget v1, v1, La0/r0;->e:I

    :goto_0
    const v4, 0x7fffffff

    if-eq v1, v4, :cond_2

    aget-wide v4, v3, v1

    const/16 v6, 0x1f

    shr-long/2addr v4, v6

    const-wide/32 v6, 0x7fffffff

    and-long/2addr v4, v6

    long-to-int v4, v4

    aget-object v1, v2, v1

    iget-object v5, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v5, Lp0/a0;

    invoke-virtual {v5, v1}, Lp0/a0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, La0/m0;->d(Ljava/lang/Object;)I

    move-result v6

    if-ltz v6, :cond_0

    iget-object v7, v0, La0/m0;->c:[I

    aget v6, v7, v6

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x7

    if-ne v6, v7, :cond_1

    invoke-virtual {p1, v1}, Ly2/w1;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v0, v5, v6}, La0/m0;->h(Ljava/lang/Object;I)V

    :goto_2
    move v1, v4

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c(Landroid/net/Uri;Lko/m;)Lwn/n;
    .locals 1

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lko/d0;

    invoke-interface {v0, p1, p2}, Lko/d0;->c(Landroid/net/Uri;Lko/m;)Lwn/n;

    move-result-object p1

    iget-object p2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Lwn/n;->a(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwn/n;

    :cond_1
    :goto_0
    return-object p1
.end method

.method public clear()V
    .locals 3

    iget v0, p0, Ld1/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lai/h;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lai/h;->u(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public create()Lg40/a0;
    .locals 3

    new-instance v0, Li20/n1;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Li20/y0;

    iget-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Lf1/p1;

    invoke-direct {v0, v1, v2}, Li20/n1;-><init>(Li20/y0;Lf1/p1;)V

    return-object v0
.end method

.method public createDataSource()Lko/l;
    .locals 3

    new-instance v0, Lko/r;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/material/datepicker/n;

    invoke-virtual {v2}, Lcom/google/android/material/datepicker/n;->createDataSource()Lko/l;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lko/r;-><init>(Landroid/content/Context;Lko/l;)V

    return-object v0
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Led3/a;

    sget-object v1, Llo/y;->f:[B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v1

    invoke-virtual {v0, v2, v1}, Led3/a;->I(I[B)V

    return-void
.end method

.method public f(Ljava/lang/Integer;)Ljava/util/List;
    .locals 4

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lq1/k0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lq1/k0;->f(Ljava/lang/Integer;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Lp1/i2;

    iget v2, v1, Lp1/i2;->v:I

    if-gez v2, :cond_0

    return-object v0

    :cond_0
    iget-object v3, v1, Lp1/i2;->b:[I

    invoke-virtual {v1, v3, v2}, Lp1/i2;->D([II)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, p1, v2, v3}, Lce/w;->t(Lp1/i2;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public g(Lai/b;Lrh/j;Ljava/util/Map;J)V
    .locals 7

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lai/h;

    iget-wide v1, v0, Lai/h;->x:J

    iget-object v3, v0, Lai/h;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    cmp-long v1, p4, v1

    if-gtz v1, :cond_1

    new-instance v1, Lai/g;

    invoke-direct {v1, p2, p3, p4, p5}, Lai/g;-><init>(Lrh/j;Ljava/util/Map;J)V

    invoke-interface {v3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0}, Lai/h;->p()J

    move-result-wide p3

    invoke-virtual {v0, p1, v1}, Lai/h;->s(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v2

    add-long/2addr v2, p3

    iput-wide v2, v0, Lai/h;->y:J

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Lai/h;->p()J

    move-result-wide p3

    invoke-virtual {v0, p1, p2}, Lai/h;->s(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v2

    sub-long/2addr p3, v2

    iput-wide p3, v0, Lai/h;->y:J

    invoke-virtual {v0, p1, p2, v1}, Lai/h;->o(Ljava/lang/Object;Ljava/lang/Object;Lai/g;)V

    :cond_0
    iget-wide p1, v0, Lai/h;->x:J

    invoke-virtual {v0, p1, p2}, Lai/h;->u(J)V

    return-void

    :cond_1
    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lai/h;->p()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1}, Lai/h;->s(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lai/h;->y:J

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lai/h;->o(Ljava/lang/Object;Ljava/lang/Object;Lai/g;)V

    :cond_2
    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lai/j;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lai/j;->o(Lai/b;Lrh/j;Ljava/util/Map;J)V

    return-void
.end method

.method public getSize()J
    .locals 2

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lai/h;

    invoke-virtual {v0}, Lai/h;->p()J

    move-result-wide v0

    return-wide v0
.end method

.method public h(Lwm/j;J)Lwm/c;
    .locals 16

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lwm/j;->getPosition()J

    move-result-wide v5

    invoke-interface/range {p1 .. p1}, Lwm/j;->getLength()J

    move-result-wide v1

    sub-long/2addr v1, v5

    const-wide/16 v3, 0x4e20

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, v0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Led3/a;

    invoke-virtual {v2, v1}, Led3/a;->H(I)V

    iget-object v3, v2, Led3/a;->a:[B

    const/4 v4, 0x0

    move-object/from16 v7, p1

    invoke-interface {v7, v3, v4, v1}, Lwm/j;->p([BII)V

    const/4 v1, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move v7, v1

    move-wide v10, v3

    :goto_0
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v8

    const/4 v9, 0x4

    if-lt v8, v9, :cond_e

    iget-object v8, v2, Led3/a;->a:[B

    iget v12, v2, Led3/a;->b:I

    invoke-static {v12, v8}, Lfn/q;->f(I[B)I

    move-result v8

    const/4 v12, 0x1

    const/16 v13, 0x1ba

    if-eq v8, v13, :cond_0

    invoke-virtual {v2, v12}, Led3/a;->L(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v9}, Led3/a;->L(I)V

    invoke-static {v2}, Lfn/r;->c(Led3/a;)J

    move-result-wide v14

    cmp-long v1, v14, v3

    if-eqz v1, :cond_4

    iget-object v1, v0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Llo/x;

    invoke-virtual {v1, v14, v15}, Llo/x;->b(J)J

    move-result-wide v14

    cmp-long v1, v14, p2

    if-lez v1, :cond_2

    cmp-long v1, v10, v3

    if-nez v1, :cond_1

    new-instance v1, Lwm/c;

    const/4 v2, -0x1

    move-wide v3, v14

    invoke-direct/range {v1 .. v6}, Lwm/c;-><init>(IJJ)V

    return-object v1

    :cond_1
    int-to-long v1, v7

    add-long v11, v5, v1

    new-instance v7, Lwm/c;

    const/4 v8, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v7 .. v12}, Lwm/c;-><init>(IJJ)V

    return-object v7

    :cond_2
    move-wide v7, v14

    const-wide/32 v10, 0x186a0

    add-long v14, v7, v10

    cmp-long v1, v14, p2

    if-lez v1, :cond_3

    iget v1, v2, Led3/a;->b:I

    int-to-long v1, v1

    add-long v11, v5, v1

    new-instance v7, Lwm/c;

    const/4 v8, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v7 .. v12}, Lwm/c;-><init>(IJJ)V

    return-object v7

    :cond_3
    iget v1, v2, Led3/a;->b:I

    move-wide v10, v7

    move v7, v1

    :cond_4
    iget v1, v2, Led3/a;->c:I

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v8

    const/16 v14, 0xa

    if-ge v8, v14, :cond_5

    invoke-virtual {v2, v1}, Led3/a;->K(I)V

    goto/16 :goto_2

    :cond_5
    const/16 v8, 0x9

    invoke-virtual {v2, v8}, Led3/a;->L(I)V

    invoke-virtual {v2}, Led3/a;->y()I

    move-result v8

    and-int/lit8 v8, v8, 0x7

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v14

    if-ge v14, v8, :cond_6

    invoke-virtual {v2, v1}, Led3/a;->K(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v8}, Led3/a;->L(I)V

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v8

    if-ge v8, v9, :cond_7

    invoke-virtual {v2, v1}, Led3/a;->K(I)V

    goto :goto_2

    :cond_7
    iget-object v8, v2, Led3/a;->a:[B

    iget v14, v2, Led3/a;->b:I

    invoke-static {v14, v8}, Lfn/q;->f(I[B)I

    move-result v8

    const/16 v14, 0x1bb

    if-ne v8, v14, :cond_9

    invoke-virtual {v2, v9}, Led3/a;->L(I)V

    invoke-virtual {v2}, Led3/a;->D()I

    move-result v8

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v14

    if-ge v14, v8, :cond_8

    invoke-virtual {v2, v1}, Led3/a;->K(I)V

    goto :goto_2

    :cond_8
    invoke-virtual {v2, v8}, Led3/a;->L(I)V

    :cond_9
    :goto_1
    invoke-virtual {v2}, Led3/a;->a()I

    move-result v8

    if-lt v8, v9, :cond_d

    iget-object v8, v2, Led3/a;->a:[B

    iget v14, v2, Led3/a;->b:I

    invoke-static {v14, v8}, Lfn/q;->f(I[B)I

    move-result v8

    if-eq v8, v13, :cond_d

    const/16 v14, 0x1b9

    if-ne v8, v14, :cond_a

    goto :goto_2

    :cond_a
    ushr-int/lit8 v8, v8, 0x8

    if-eq v8, v12, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v2, v9}, Led3/a;->L(I)V

    invoke-virtual {v2}, Led3/a;->a()I

    move-result v8

    const/4 v14, 0x2

    if-ge v8, v14, :cond_c

    invoke-virtual {v2, v1}, Led3/a;->K(I)V

    goto :goto_2

    :cond_c
    invoke-virtual {v2}, Led3/a;->D()I

    move-result v8

    iget v14, v2, Led3/a;->c:I

    iget v15, v2, Led3/a;->b:I

    add-int/2addr v15, v8

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual {v2, v8}, Led3/a;->K(I)V

    goto :goto_1

    :cond_d
    :goto_2
    iget v1, v2, Led3/a;->b:I

    goto/16 :goto_0

    :cond_e
    cmp-long v2, v10, v3

    if-eqz v2, :cond_f

    int-to-long v1, v1

    add-long v12, v5, v1

    new-instance v8, Lwm/c;

    const/4 v9, -0x2

    invoke-direct/range {v8 .. v13}, Lwm/c;-><init>(IJJ)V

    return-object v8

    :cond_f
    sget-object v1, Lwm/c;->d:Lwm/c;

    return-object v1
.end method

.method public i(Ljava/lang/Object;)Lcq/u;
    .locals 8

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lsr/b;

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Lsr/n;

    check-cast p1, Ljava/lang/Long;

    iget-wide v4, v1, Lsr/n;->a:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    new-instance v2, Lsr/k;

    iget-object v3, v0, Lsr/b;->b:Lsr/l;

    invoke-direct/range {v2 .. v7}, Lsr/k;-><init>(Lsr/l;JJ)V

    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public k(Lai/b;)Lai/c;
    .locals 2

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lai/h;

    iget-object v0, v0, Lai/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lai/g;

    if-eqz p1, :cond_0

    new-instance v0, Lai/c;

    iget-object v1, p1, Lai/g;->a:Lrh/j;

    iget-object p1, p1, Lai/g;->b:Ljava/util/Map;

    invoke-direct {v0, v1, p1}, Lai/c;-><init>(Lrh/j;Ljava/util/Map;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Lhg/i;Lhg/k;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lig/d;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lig/d;

    iget-object v1, v1, Lig/d;->w:Lyf/k;

    invoke-direct {v0, v1, p1}, Lig/d;-><init>(Lyf/k;Ljava/lang/String;)V

    iget-object p1, p2, Lhg/k;->b:Lkotlin/jvm/internal/i;

    iget-object p2, p2, Lhg/k;->a:Ljava/lang/Object;

    invoke-interface {p1, v0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public m(J)V
    .locals 1

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lai/h;

    invoke-virtual {v0, p1, p2}, Lai/h;->u(J)V

    return-void
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Lp0/a0;

    invoke-virtual {v0, p1}, Lp0/a0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p2}, Lp0/a0;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public onStatsDelivered(Lorg/webrtc/RTCStatsReport;)V
    .locals 8

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Le33/u;

    iget-object v1, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Lq83/l;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v3, Ln33/q;

    invoke-static {p1}, Lds/p;->e0(Lorg/webrtc/RTCStatsReport;)Ljava/util/HashMap;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ln33/q;-><init>(Lorg/webrtc/RTCStatsReport;Ljava/util/HashMap;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {v1, v3}, Lq83/l;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    invoke-virtual {v0}, Le33/u;->f()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Le33/u;->q:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "[getStats] #sfu; #"

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; failed: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v6, v5, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {v1, v2}, Lq83/l;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public q(Ljava/lang/Object;)Lne3/l;
    .locals 1

    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ld1/j;->G(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lne3/l;->z:Lne3/k;

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    const v0, -0x499602d2

    invoke-static {v0, p1}, Lne3/k;->c(I[B)Lne3/l;

    move-result-object p1

    return-object p1
.end method

.method public r(Lhg/i;Z)V
    .locals 7

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Lig/d;

    iget-object v2, v1, Lig/d;->w:Lyf/k;

    iget-object v3, v2, Lyf/k;->w:Lne3/h;

    iget-wide v3, v3, Lne3/h;->x:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    if-lez v3, :cond_0

    const-string v3, "&"

    invoke-virtual {v2, v4, v3}, Lyf/k;->z(ILjava/lang/String;)V

    :cond_0
    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2, v0}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    :cond_1
    invoke-static {p1}, Lds/q;->l(Lhg/i;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const-string p1, "="

    invoke-virtual {v2, v4, p1}, Lyf/k;->z(ILjava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    iget-object p2, v1, Lig/d;->w:Lyf/k;

    sget-object v0, Ltg/g;->l:Ltg/g;

    invoke-virtual {v0, p1}, Ltg/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    return-void
.end method

.method public s([B)Ln23/h;
    .locals 6

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/String;

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object v2, Lb23/i;->a:Lb23/i;

    sget-object v2, Lb23/i;->d:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    const-string v4, "Video:VideoParser"

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lb23/i;->c:Lb23/j;

    new-instance v5, Ljava/lang/String;

    invoke-direct {v5, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string p1, "[decode] raw: "

    invoke-virtual {p1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v2, v3, v4, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const-class p1, Lio/getstream/android/video/generated/models/VideoEvent;

    invoke-virtual {p0, v0, p1}, Ld1/j;->v(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;

    move-result-object p1

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_1

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;

    new-instance v1, Lx43/o;

    invoke-direct {v1, p1}, Lx43/o;-><init>(Lio/getstream/android/video/generated/models/VideoEvent;)V

    new-instance p1, Ln23/g;

    invoke-direct {p1, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_4

    :goto_0
    new-instance v1, Lb2/z;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p0, v0}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_2

    check-cast p1, Ln23/g;

    goto :goto_1

    :cond_2
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_3

    new-instance v0, Ln23/g;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object p1, v0

    :goto_1
    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lx43/p;

    new-instance v0, Ln23/g;

    invoke-direct {v0, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public t(Lai/b;)Z
    .locals 6

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Lai/h;

    iget-object v1, v0, Lai/h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lai/h;->p()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1}, Lai/h;->s(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lai/h;->y:J

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lai/h;->o(Ljava/lang/Object;Ljava/lang/Object;Lai/g;)V

    :cond_0
    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ld1/j;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public u(I)V
    .locals 4

    iget-object v0, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    return-void

    :cond_0
    array-length v2, v0

    if-lt p1, v2, :cond_2

    array-length v2, v0

    :goto_0
    if-gt v2, p1, :cond_1

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_1
    new-array p1, v2, [I

    iput-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast p1, [I

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2
    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;
    .locals 5

    :try_start_0
    new-instance v0, Ln23/g;

    iget-object v1, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v1, Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "getValue(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lqx/l0;

    invoke-virtual {v1, p2}, Lqx/l0;->a(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/squareup/moshi/JsonAdapter;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    new-instance v1, Ln23/f;

    new-instance v2, Ln23/d;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "fromJsonOrError error parsing of "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " into "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Ln23/f;-><init>(Ln23/e;)V

    return-object v1
.end method

.method public w(Ljava/lang/String;)Lcom/google/android/datatransport/cct/CctBackendFactory;
    .locals 13

    const-string v0, "."

    const-string v1, "Could not instantiate "

    iget-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const/4 v3, 0x0

    const-string v4, "BackendRegistry"

    if-nez v2, :cond_6

    iget-object v2, p0, Ld1/j;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v2, "Context has no PackageManager."

    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    move-object v2, v3

    goto :goto_1

    :cond_0
    new-instance v6, Landroid/content/ComponentName;

    const-class v7, Lcom/google/android/datatransport/runtime/backends/TransportBackendDiscovery;

    invoke-direct {v6, v2, v7}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/16 v2, 0x80

    invoke-virtual {v5, v6, v2}, Landroid/content/pm/PackageManager;->getServiceInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, "TransportBackendDiscovery has no service info."

    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    iget-object v2, v2, Landroid/content/pm/ServiceInfo;->metaData:Landroid/os/Bundle;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v2, "Application info not found."

    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :goto_1
    if-nez v2, :cond_2

    const-string v2, "Could not retrieve metadata, returning empty list of transport backends."

    invoke-static {v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_4

    :cond_2
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v2, v7}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_3

    const-string v9, "backend:"

    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    check-cast v8, Ljava/lang/String;

    const-string v9, ","

    const/4 v10, -0x1

    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_3

    :cond_4
    const/16 v12, 0x8

    invoke-virtual {v7, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    move-object v2, v5

    :goto_4
    iput-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    :cond_6
    iget-object v2, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_7

    return-object v3

    :cond_7
    :try_start_1
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-class v5, Lcom/google/android/datatransport/cct/CctBackendFactory;

    invoke-virtual {v2, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/datatransport/cct/CctBackendFactory;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v2

    goto :goto_7

    :catch_4
    move-exception v2

    goto :goto_8

    :catch_5
    move-exception v0

    goto :goto_9

    :goto_5
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_a

    :goto_6
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_a

    :goto_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_a

    :goto_8
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_a

    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Class "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not found."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_a
    return-object v3
.end method

.method public x()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public y()Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    iget-object v0, p0, Ld1/j;->y:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method public z(Lej/b;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Ld1/j;->y:Ljava/lang/Object;

    return-object p1
.end method
