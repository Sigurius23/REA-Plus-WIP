.class public final La00/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Laa3/t0;
.implements Lim/b;
.implements Loa3/n;
.implements Loa3/o;


# static fields
.field public static F:La00/g;

.field public static G:La00/g;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, La00/g;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 43
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    .line 45
    sget-object p1, Lca3/l;->a:Lca3/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lca3/k;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 48
    check-cast v1, Lca3/l;

    .line 49
    check-cast v1, Lea3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    new-instance v1, Lea3/e;

    invoke-direct {v1}, Lea3/e;-><init>()V

    .line 51
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 52
    :cond_0
    iput-object v0, p0, La00/g;->E:Ljava/lang/Object;

    return-void

    .line 53
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 55
    new-instance p1, Landroid/os/Handler;

    .line 56
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lkl/f;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lkl/f;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    return-void

    .line 57
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void

    .line 58
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 59
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 60
    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 61
    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    .line 62
    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void

    .line 63
    :sswitch_3
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La00/g;->z:Ljava/lang/Object;

    .line 66
    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    .line 67
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 68
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    return-void

    .line 69
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    new-instance p1, La0/g;

    const/4 v0, 0x0

    .line 71
    invoke-direct {p1, v0}, La0/f1;-><init>(I)V

    .line 72
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 73
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 74
    new-instance p1, La0/y;

    const/4 v1, 0x0

    .line 75
    invoke-direct {p1, v1}, La0/y;-><init>(Ljava/lang/Object;)V

    .line 76
    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    .line 77
    new-instance p1, La0/g;

    .line 78
    invoke-direct {p1, v0}, La0/f1;-><init>(I)V

    .line 79
    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void

    .line 80
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 81
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 82
    new-instance p1, Landroid/support/v4/media/session/i;

    invoke-direct {p1, p0}, Landroid/support/v4/media/session/i;-><init>(La00/g;)V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 83
    new-instance p1, Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_5
        0x5 -> :sswitch_4
        0x9 -> :sswitch_3
        0xa -> :sswitch_2
        0x10 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, La00/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La00/g;Lxz/x;Lwz/m1;Lwz/n0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La00/g;->w:I

    const-string v0, "linkAccountManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissalCoordinator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLaunchMode"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 38
    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    .line 39
    iput-object p3, p0, La00/g;->z:Ljava/lang/Object;

    .line 40
    iput-object p4, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lq83/j;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, La00/g;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    .line 13
    iput-object p3, p0, La00/g;->z:Ljava/lang/Object;

    .line 14
    new-instance p1, Lh02/n0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, La00/g;->w:I

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    .line 134
    new-instance p1, Lhc/i;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lhc/i;-><init>(La00/g;I)V

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 135
    new-instance p1, Lhc/i;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lhc/i;-><init>(La00/g;I)V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/internal/k0;Lva3/h;Lm63/d;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, La00/g;->w:I

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    iput-object p2, p0, La00/g;->z:Ljava/lang/Object;

    iput-object p3, p0, La00/g;->E:Ljava/lang/Object;

    .line 86
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld/h1;)V
    .locals 4

    const/16 v0, 0x11

    iput v0, p0, La00/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p1}, Ld/h1;->o()I

    move-result v2

    if-ge v1, v2, :cond_4

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {p1, v2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/x0;

    .line 2
    iget-object v2, v2, Ld/x0;->a:[B

    .line 3
    invoke-static {v2, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, La00/g;->E:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/v;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    new-instance v3, Ljava/math/BigInteger;

    iget-object v2, v2, Ld/v;->a:[B

    invoke-direct {v3, v2}, Ljava/math/BigInteger;-><init>([B)V

    .line 5
    iput-object v3, p0, La00/g;->x:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p1, v2}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/n;

    invoke-virtual {v2}, Ld/n;->l()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, p0, La00/g;->z:Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v0}, Ld/h1;->l(I)Ld/q;

    move-result-object v2

    check-cast v2, Ld/x0;

    .line 6
    iget-object v2, v2, Ld/x0;->a:[B

    .line 7
    invoke-static {v2, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, La00/g;->y:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/z;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, La00/g;->w:I

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 92
    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 93
    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    .line 94
    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    .line 8
    iput p3, p0, La00/g;->w:I

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 9
    iput p5, p0, La00/g;->w:I

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    iput-object p3, p0, La00/g;->z:Ljava/lang/Object;

    iput-object p4, p0, La00/g;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, La00/g;->w:I

    const-string v0, "sourceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 124
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 125
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    .line 126
    const-string p1, ""

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljb3/h;)V
    .locals 5

    const/16 v0, 0x12

    iput v0, p0, La00/g;->w:I

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    .line 96
    iget-object v0, p1, Ljb3/h;->E:Lqa3/k;

    .line 97
    iget-object v0, v0, Lqa3/k;->T:Ljava/util/List;

    .line 98
    const-string v1, "getEnumEntryList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    .line 99
    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    .line 100
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 101
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 102
    move-object v3, v1

    check-cast v3, Lqa3/x;

    .line 103
    iget-object v4, p1, Ljb3/h;->L:Lhb3/k;

    .line 104
    iget-object v4, v4, Lhb3/k;->b:Lsa3/f;

    .line 105
    iget v3, v3, Lqa3/x;->z:I

    .line 106
    invoke-static {v4, v3}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v3

    .line 107
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 108
    :cond_1
    iput-object v2, p0, La00/g;->x:Ljava/lang/Object;

    .line 109
    iget-object p1, p0, La00/g;->E:Ljava/lang/Object;

    check-cast p1, Ljb3/h;

    .line 110
    iget-object v0, p1, Ljb3/h;->L:Lhb3/k;

    .line 111
    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    .line 112
    iget-object v0, v0, Lhb3/i;->a:Lkb3/k;

    .line 113
    new-instance v1, Landroidx/room/d;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, p1}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    .line 114
    iget-object p1, p0, La00/g;->E:Ljava/lang/Object;

    check-cast p1, Ljb3/h;

    .line 115
    iget-object p1, p1, Ljb3/h;->L:Lhb3/k;

    .line 116
    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    .line 117
    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    .line 118
    new-instance v0, Lbg/j;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    new-instance v1, Lkb3/i;

    .line 120
    invoke-direct {v1, p1, v0}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    .line 121
    iput-object v1, p0, La00/g;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll20/a;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lk83/a;Lu00/e;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La00/g;->w:I

    const-string v0, "cvcRecollectionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticEventCallbackProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkGateFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 28
    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    .line 29
    iput-object p3, p0, La00/g;->z:Ljava/lang/Object;

    .line 30
    iput-object p4, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll9/g1;[Z)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, La00/g;->w:I

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 129
    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    .line 130
    iget p1, p1, Ll9/g1;->a:I

    new-array p2, p1, [Z

    iput-object p2, p0, La00/g;->z:Ljava/lang/Object;

    .line 131
    new-array p1, p1, [Z

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm63/d;La00/g;Ljava/util/ArrayList;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, La00/g;->w:I

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    iput-object p2, p0, La00/g;->z:Ljava/lang/Object;

    iput-object p3, p0, La00/g;->E:Ljava/lang/Object;

    .line 89
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt23/c0;La30/w0;Lt23/b4;Lhc3/d;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, La00/g;->w:I

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, La00/g;->z:Ljava/lang/Object;

    .line 25
    const-string p1, "RingingStateObserver"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt23/l;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, La00/g;->w:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 33
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 34
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    .line 35
    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lwz/g0;Lv00/c0;Lqy/d;Le10/r0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La00/g;->w:I

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, La00/g;->y:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, La00/g;->z:Ljava/lang/Object;

    .line 19
    iput-object p4, p0, La00/g;->E:Ljava/lang/Object;

    .line 20
    invoke-virtual {p4, p2}, Le10/r0;->c(Lv00/c0;)V

    return-void
.end method

.method public static o()La00/g;
    .locals 2

    sget-object v0, La00/g;->G:La00/g;

    if-nez v0, :cond_0

    new-instance v0, La00/g;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, La00/g;-><init>(I)V

    sput-object v0, La00/g;->G:La00/g;

    :cond_0
    sget-object v0, La00/g;->G:La00/g;

    return-object v0
.end method

.method public static z(JLjava/util/HashMap;)V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v3, v3, p0

    if-gtz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge p0, p1, :cond_2

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public A(Lmr/g;)V
    .locals 2

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, La00/g;->r(Lmr/g;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La00/g;->z:Ljava/lang/Object;

    check-cast p1, Lmr/o;

    iget-boolean v1, p1, Lmr/o;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p1, Lmr/o;->c:Z

    invoke-virtual {p0, p1}, La00/g;->B(Lmr/o;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public B(Lmr/o;)V
    .locals 3

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    iget v1, p1, Lmr/o;->b:I

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    const/16 v1, 0x5dc

    goto :goto_0

    :cond_2
    const/16 v1, 0xabe

    :goto_0
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    int-to-long v1, v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public C(Ljava/util/List;)Lf9/b;
    .locals 8

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {p0, p1}, La00/g;->e(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lzr/q;->h(Ljava/lang/String;Ljava/util/AbstractCollection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/b;

    return-object p1

    :cond_0
    new-instance v1, Ldb/k0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ldb/k0;-><init>(I)V

    invoke-static {p1, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf9/b;

    iget v3, v3, Lf9/b;->c:I

    move v4, v2

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/b;

    iget v6, v5, Lf9/b;->c:I

    if-eq v3, v6, :cond_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf9/b;

    return-object p1

    :cond_1
    new-instance v6, Landroid/util/Pair;

    iget-object v7, v5, Lf9/b;->b:Ljava/lang/String;

    iget v5, v5, Lf9/b;->d:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf9/b;

    if-nez v3, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    move v3, v2

    move v4, v3

    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/b;

    iget v5, v5, Lf9/b;->d:I

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object v3, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v3, Ljava/util/Random;

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    move v4, v2

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_5

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf9/b;

    iget v6, v5, Lf9/b;->d:I

    add-int/2addr v4, v6

    if-ge v3, v4, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lf9/b;

    :goto_3
    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    :cond_6
    return-object v3
.end method

.method public D(Lro/i;)V
    .locals 0

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    return-void
.end method

.method public E(Lgs/d;)V
    .locals 0

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public F(Lgs/b0;)V
    .locals 0

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    return-void
.end method

.method public G(Lva3/c;Lva3/h;)V
    .locals 2

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lab3/i;

    invoke-direct {v1, p1, p2}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public H(Lro/i;)V
    .locals 0

    iput-object p1, p0, La00/g;->z:Ljava/lang/Object;

    return-void
.end method

.method public I(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, La00/g;->E:Ljava/lang/Object;

    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La00/g;->y:Ljava/lang/Object;

    return-void
.end method

.method public K(Lgs/k;)V
    .locals 0

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    return-void
.end method

.method public L(Landroid/support/v4/media/session/j;Landroid/os/Handler;)V
    .locals 3

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, La00/g;->z:Ljava/lang/Object;

    iget-object v1, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Landroid/support/v4/media/session/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Landroid/support/v4/media/session/h;

    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v2, p0, p1, p2}, Landroid/support/v4/media/session/h;-><init>(Ljava/lang/Object;Landroid/os/Looper;I)V

    :cond_2
    :goto_1
    iput-object v2, p0, La00/g;->E:Ljava/lang/Object;

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public M(Lgs/b0;)V
    .locals 0

    iput-object p1, p0, La00/g;->x:Ljava/lang/Object;

    return-void
.end method

.method public N()V
    .locals 3

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Lmr/o;

    if-eqz v0, :cond_1

    iput-object v0, p0, La00/g;->z:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, La00/g;->E:Ljava/lang/Object;

    iget-object v0, v0, Lmr/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmr/g;

    if-eqz v0, :cond_0

    sget-object v1, Lmr/l;->A:Landroid/os/Handler;

    const/4 v2, 0x0

    iget-object v0, v0, Lmr/g;->a:Lmr/l;

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :cond_0
    iput-object v1, p0, La00/g;->z:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public O(Le10/x;)La00/o;
    .locals 3

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lqy/d;

    instance-of v1, p1, Le10/n;

    if-eqz v1, :cond_0

    sget-object p1, La00/l;->a:La00/l;

    return-object p1

    :cond_0
    instance-of v1, p1, Le10/v;

    if-eqz v1, :cond_1

    check-cast p1, Le10/v;

    iget-object v1, p1, Le10/v;->a:Ljava/lang/Throwable;

    const-string v2, "DefaultLinkConfirmationHandler: Failed to confirm payment"

    invoke-virtual {v0, v2, v1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, La00/m;

    iget-object p1, p1, Le10/v;->b:Lzy/c;

    invoke-direct {v0, p1}, La00/m;-><init>(Lzy/c;)V

    return-object v0

    :cond_1
    instance-of v1, p1, Le10/w;

    if-eqz v1, :cond_2

    sget-object p1, La00/n;->a:La00/n;

    return-object p1

    :cond_2
    if-nez p1, :cond_3

    const-string p1, "DefaultLinkConfirmationHandler: Payment confirmation returned null"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, La00/m;

    const v0, 0x7f1410f2

    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    invoke-direct {p1, v0}, La00/m;-><init>(Lzy/c;)V

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public P()V
    .locals 12

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Lhc/i;

    iget-object v1, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Lhc/i;

    iget-object v2, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Landroidx/viewpager2/widget/ViewPager2;

    const v3, 0x1020048

    invoke-static {v2, v3}, Lh5/p0;->k(Landroid/view/View;I)V

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lh5/p0;->h(Landroid/view/View;I)V

    const v5, 0x1020049

    invoke-static {v2, v5}, Lh5/p0;->k(Landroid/view/View;I)V

    invoke-static {v2, v4}, Lh5/p0;->h(Landroid/view/View;I)V

    const v6, 0x1020046

    invoke-static {v2, v6}, Lh5/p0;->k(Landroid/view/View;I)V

    invoke-static {v2, v4}, Lh5/p0;->h(Landroid/view/View;I)V

    const v7, 0x1020047

    invoke-static {v2, v7}, Lh5/p0;->k(Landroid/view/View;I)V

    invoke-static {v2, v4}, Lh5/p0;->h(Landroid/view/View;I)V

    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v8

    if-nez v8, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    iget-boolean v9, v2, Landroidx/viewpager2/widget/ViewPager2;->R:Z

    if-nez v9, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-nez v9, :cond_7

    iget-object v6, v2, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/u1;->getLayoutDirection()I

    move-result v6

    if-ne v6, v10, :cond_3

    move v4, v10

    :cond_3
    if-eqz v4, :cond_4

    move v6, v3

    goto :goto_0

    :cond_4
    move v6, v5

    :goto_0
    if-eqz v4, :cond_5

    move v3, v5

    :cond_5
    iget v4, v2, Landroidx/viewpager2/widget/ViewPager2;->z:I

    sub-int/2addr v8, v10

    if-ge v4, v8, :cond_6

    new-instance v4, Li5/d;

    invoke-direct {v4, v6, v11}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-static {v2, v4, v1}, Lh5/p0;->l(Landroid/view/View;Li5/d;Li5/o;)V

    :cond_6
    iget v1, v2, Landroidx/viewpager2/widget/ViewPager2;->z:I

    if-lez v1, :cond_9

    new-instance v1, Li5/d;

    invoke-direct {v1, v3, v11}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-static {v2, v1, v0}, Lh5/p0;->l(Landroid/view/View;Li5/d;Li5/o;)V

    return-void

    :cond_7
    iget v3, v2, Landroidx/viewpager2/widget/ViewPager2;->z:I

    sub-int/2addr v8, v10

    if-ge v3, v8, :cond_8

    new-instance v3, Li5/d;

    invoke-direct {v3, v7, v11}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-static {v2, v3, v1}, Lh5/p0;->l(Landroid/view/View;Li5/d;Li5/o;)V

    :cond_8
    iget v1, v2, Landroidx/viewpager2/widget/ViewPager2;->z:I

    if-lez v1, :cond_9

    new-instance v1, Li5/d;

    invoke-direct {v1, v6, v11}, Li5/d;-><init>(ILjava/lang/String;)V

    invoke-static {v2, v1, v0}, Lh5/p0;->l(Landroid/view/View;Li5/d;Li5/o;)V

    :cond_9
    :goto_1
    return-void
.end method

.method public X(Lab3/f;)V
    .locals 3

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lab3/t;

    new-instance v2, Lab3/r;

    invoke-direct {v2, p1}, Lab3/r;-><init>(Lab3/f;)V

    invoke-direct {v1, v2}, Lab3/g;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public Y(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/k0;

    iget-object v2, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Lva3/h;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    check-cast v1, Lu93/e0;

    invoke-static {p1, v1}, Lab3/h;->c(Ljava/lang/Object;Lu93/e0;)Lab3/g;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported annotation argument: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lup/d;->s(Ljava/lang/String;)Lab3/j;

    move-result-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 3

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lva3/h;

    invoke-virtual {p0, v2}, La00/g;->k(Lva3/h;)Lr93/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public e(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-static {v0, v1, v2}, La00/g;->z(JLjava/util/HashMap;)V

    iget-object v3, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-static {v0, v1, v3}, La00/g;->z(JLjava/util/HashMap;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf9/b;

    iget-object v5, v4, Lf9/b;->b:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    iget v5, v4, Lf9/b;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public f()Lgs/g;
    .locals 7

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lgs/k;

    if-eqz v0, :cond_a

    iget-object v1, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lro/i;

    if-eqz v1, :cond_9

    iget-object v2, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Lro/i;

    if-eqz v2, :cond_9

    iget v3, v0, Lgs/k;->a:I

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lct/a;

    iget-object v1, v1, Lct/a;->a:[B

    array-length v1, v1

    if-ne v3, v1, :cond_8

    iget v1, v0, Lgs/k;->b:I

    iget-object v2, v2, Lro/i;->x:Ljava/lang/Object;

    check-cast v2, Lct/a;

    iget-object v2, v2, Lct/a;->a:[B

    array-length v2, v2

    if-ne v1, v2, :cond_7

    invoke-virtual {v0}, Lgs/k;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lgs/k;

    invoke-virtual {v0}, Lgs/k;->a()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lgs/k;

    iget-object v0, v0, Lgs/k;->e:Lgs/j;

    sget-object v1, Lgs/j;->j:Lgs/j;

    if-ne v0, v1, :cond_4

    sget-object v0, Lcom/google/crypto/tink/internal/a0;->a:Lct/a;

    :goto_2
    move-object v5, v0

    goto :goto_3

    :cond_4
    sget-object v1, Lgs/j;->i:Lgs/j;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->a(I)Lct/a;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v1, Lgs/j;->h:Lgs/j;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/google/crypto/tink/internal/a0;->b(I)Lct/a;

    move-result-object v0

    goto :goto_2

    :goto_3
    new-instance v1, Lgs/g;

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lgs/k;

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lro/i;

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lro/i;

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    invoke-direct/range {v1 .. v6}, Lgs/g;-><init>(Lgs/k;Lro/i;Lro/i;Lct/a;Ljava/lang/Integer;)V

    return-object v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown AesCtrHmacAeadParameters.Variant: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v2, Lgs/k;

    iget-object v2, v2, Lgs/k;->e:Lgs/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HMAC key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "AES key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Lgs/f0;
    .locals 5

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lgs/b0;

    if-nez v0, :cond_0

    sget-object v0, Lgs/b0;->l:Lgs/b0;

    iput-object v0, p0, La00/g;->x:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_a

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lgs/b0;

    if-eqz v0, :cond_9

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Lgs/d;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lfs/k;->a()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lgs/b0;

    iget-object v1, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v1, Lgs/d;

    sget-object v2, Lgs/b0;->e:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    instance-of v2, v1, Lgs/q;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lgs/b0;->g:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v2, v1, Lgs/w;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    sget-object v2, Lgs/b0;->f:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Lgs/k0;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    sget-object v2, Lgs/b0;->h:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    instance-of v2, v1, Lgs/k;

    if-eqz v2, :cond_4

    goto :goto_0

    :cond_4
    sget-object v2, Lgs/b0;->i:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    instance-of v2, v1, Lgs/n;

    if-eqz v2, :cond_5

    goto :goto_0

    :cond_5
    sget-object v2, Lgs/b0;->j:Lgs/b0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    instance-of v0, v1, Lgs/t;

    if-eqz v0, :cond_6

    :goto_0
    new-instance v0, Lgs/f0;

    iget-object v1, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Lgs/b0;

    iget-object v2, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v3, Lgs/b0;

    iget-object v4, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v4, Lgs/d;

    invoke-direct {v0, v1, v2, v3, v4}, Lgs/f0;-><init>(Lgs/b0;Ljava/lang/String;Lgs/b0;Lgs/d;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot use parsing strategy "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v2, Lgs/b0;

    iget-object v2, v2, Lgs/b0;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " when new keys are picked according to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Lgs/d;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParametersForNewKeys must not have ID Requirements"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParametersForNewKeys must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParsingStrategy must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "kekUri must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public get()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/concurrent/Executor;

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lnm/d;

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    invoke-virtual {v0}, Lgm/r;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lgm/r;

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lom/b;

    new-instance v1, La00/g;

    const/16 v6, 0x17

    invoke-direct/range {v1 .. v6}, La00/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v1
.end method

.method public h(Lmr/o;I)Z
    .locals 3

    iget-object v0, p1, Lmr/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmr/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    invoke-virtual {v2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sget-object p1, Lmr/l;->A:Landroid/os/Handler;

    iget-object v0, v0, Lmr/g;->a:Lmr/l;

    const/4 v2, 0x1

    invoke-virtual {p1, v2, p2, v1, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return v2

    :cond_0
    return v1
.end method

.method public i(Lwz/n0;La00/f;Lwz/u0;Ls83/c;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Lxz/x;

    instance-of v1, p4, La00/e;

    if-eqz v1, :cond_0

    move-object v1, p4

    check-cast v1, La00/e;

    iget v2, v1, La00/e;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, La00/e;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, La00/e;

    invoke-direct {v1, p0, p4}, La00/e;-><init>(La00/g;Ls83/c;)V

    :goto_0
    iget-object p4, v1, La00/e;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La00/e;->F:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v5, :cond_3

    if-ne v3, v4, :cond_2

    iget-object p3, v1, La00/e;->x:Lwz/u0;

    iget-object p1, v1, La00/e;->w:Ljava/lang/Object;

    check-cast p1, Lwz/e;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v4, p1

    move-object v5, p3

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-boolean p1, v1, La00/e;->y:Z

    iget-object p2, v1, La00/e;->w:Ljava/lang/Object;

    check-cast p2, Lwz/m1;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object p3, v0

    goto/16 :goto_6

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p4, p1, Lwz/l0;

    if-nez p4, :cond_9

    instance-of p4, p1, Lwz/k0;

    if-eqz p4, :cond_5

    goto :goto_3

    :cond_5
    instance-of p2, p1, Lwz/m0;

    if-eqz p2, :cond_6

    invoke-static {v0}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object p1

    iput-object p1, v1, La00/e;->w:Ljava/lang/Object;

    iput-object p3, v1, La00/e;->x:Lwz/u0;

    iput v4, v1, La00/e;->F:I

    invoke-static {v0, v1}, Ls3/d;->o(Lxz/x;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v2, :cond_1

    goto :goto_4

    :goto_1
    move-object v6, p4

    check-cast v6, Ly00/j0;

    new-instance v3, Lwz/n;

    const/4 v7, 0x0

    const/16 v8, 0x8

    invoke-direct/range {v3 .. v8}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    new-instance p1, La00/b;

    invoke-direct {p1, v3}, La00/b;-><init>(Lwz/n;)V

    return-object p1

    :cond_6
    instance-of p2, p1, Lwz/i0;

    if-nez p2, :cond_8

    instance-of p1, p1, Lwz/j0;

    if-eqz p1, :cond_7

    goto :goto_2

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_2
    new-instance p1, La00/b;

    new-instance v1, Lwz/n;

    invoke-static {v0}, Ls3/d;->j(Lxz/x;)Lwz/e;

    move-result-object v2

    const/4 v5, 0x0

    const/16 v6, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-direct {p1, v1}, La00/b;-><init>(Lwz/n;)V

    return-object p1

    :cond_9
    :goto_3
    iget-object p1, p0, La00/g;->z:Ljava/lang/Object;

    check-cast p1, Lwz/m1;

    iget-boolean p3, p1, Lwz/m1;->a:Z

    const/4 p4, 0x0

    iput-boolean p4, p1, Lwz/m1;->a:Z

    :try_start_1
    iput-object p1, v1, La00/e;->w:Ljava/lang/Object;

    iput-boolean p3, v1, La00/e;->y:Z

    iput v5, v1, La00/e;->F:I

    invoke-virtual {p2, v1}, La00/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p4, v2, :cond_a

    :goto_4
    return-object v2

    :cond_a
    move-object p2, p1

    move p1, p3

    :goto_5
    :try_start_2
    check-cast p4, La00/o;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput-boolean p1, p2, Lwz/m1;->a:Z

    sget-object p1, La00/l;->a:La00/l;

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, La00/a;->a:La00/a;

    return-object p1

    :cond_b
    instance-of p1, p4, La00/m;

    if-eqz p1, :cond_c

    new-instance p1, La00/c;

    check-cast p4, La00/m;

    iget-object p2, p4, La00/m;->a:Lzy/c;

    invoke-direct {p1, p2}, La00/c;-><init>(Lzy/c;)V

    return-object p1

    :cond_c
    sget-object p1, La00/n;->a:La00/n;

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, La00/b;

    new-instance v0, Lwz/n;

    new-instance v1, Lwz/d;

    const/4 p2, 0x0

    sget-object p3, Lwz/c;->x:Lwz/c;

    invoke-direct {v1, p2, p3}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-direct {p1, v0}, La00/b;-><init>(Lwz/n;)V

    return-object p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object v9, p2

    move-object p2, p1

    move p1, p3

    move-object p3, v9

    :goto_6
    iput-boolean p1, p2, Lwz/m1;->a:Z

    throw p3
.end method

.method public i0(Lva3/c;)Loa3/n;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lcom/google/crypto/tink/internal/k0;

    sget-object v2, Lr93/s0;->q:Lr93/v0;

    invoke-virtual {v1, p1, v2, v0}, Lcom/google/crypto/tink/internal/k0;->F(Lva3/c;Lr93/s0;Ljava/util/List;)Lm63/d;

    move-result-object p1

    new-instance v1, La00/g;

    invoke-direct {v1, p1, p0, v0}, La00/g;-><init>(Lm63/d;La00/g;Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public j(Lc93/a;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, La00/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La00/j;

    iget v1, v0, La00/j;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La00/j;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, La00/j;

    invoke-direct {v0, p0, p2}, La00/j;-><init>(La00/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La00/j;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La00/j;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, La00/j;->x:La00/g;

    iget-object v0, v0, La00/j;->w:La00/g;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, La00/j;->x:La00/g;

    iget-object v2, v0, La00/j;->w:La00/g;

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v0, v2

    goto :goto_4

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le10/k;

    iget-object p2, p0, La00/g;->E:Ljava/lang/Object;

    check-cast p2, Le10/r0;

    iput-object p0, v0, La00/j;->w:La00/g;

    iput-object p0, v0, La00/j;->x:La00/g;

    iput v4, v0, La00/j;->E:I

    invoke-virtual {p2, p1, v0}, Le10/r0;->g(Le10/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object p1, p0

    move-object v2, p1

    :goto_1
    :try_start_3
    iget-object p2, p1, La00/g;->E:Ljava/lang/Object;

    check-cast p2, Le10/r0;

    iput-object v2, v0, La00/j;->w:La00/g;

    iput-object p1, v0, La00/j;->x:La00/g;

    iput v3, v0, La00/j;->E:I

    invoke-virtual {p2, v0}, Le10/r0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, v2

    :goto_3
    :try_start_4
    check-cast p2, Le10/x;

    invoke-virtual {p1, p2}, La00/g;->O(Le10/x;)La00/o;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_5

    :catchall_2
    move-exception p1

    move-object v0, p0

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_6

    goto :goto_6

    :cond_6
    iget-object p1, v0, La00/g;->z:Ljava/lang/Object;

    check-cast p1, Lqy/d;

    const-string v0, "DefaultLinkConfirmationHandler: Failed to confirm payment"

    invoke-virtual {p1, v0, p2}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, La00/m;

    const p2, 0x7f1410f2

    invoke-static {p2}, Ls4/i;->h(I)Lzy/b;

    move-result-object p2

    invoke-direct {p1, p2}, La00/m;-><init>(Lzy/c;)V

    :goto_6
    return-object p1
.end method

.method public k(Lva3/h;)Lr93/e;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/h2;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/e;

    return-object p1
.end method

.method public l()V
    .locals 5

    iget v0, p0, La00/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    iget-object v1, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v1, Lva3/h;

    iget-object v2, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "elements"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v3, v0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v3, Lr93/e;

    invoke-static {v1, v3}, Lbi/g;->C(Lva3/h;Lr93/e;)Lr93/a1;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v0, v0, Lm63/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-static {v2}, Lub3/j;->b(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v2

    check-cast v3, Lu93/x0;

    invoke-virtual {v3}, Lu93/x0;->getType()Llb3/y;

    move-result-object v3

    const-string v4, "getType(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lab3/y;

    invoke-direct {v4, v2, v3}, Lab3/y;-><init>(Ljava/util/List;Llb3/y;)V

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    iget-object v3, v0, Lm63/d;->z:Ljava/lang/Object;

    check-cast v3, Lcom/google/crypto/tink/internal/k0;

    iget-object v4, v0, Lm63/d;->F:Ljava/lang/Object;

    check-cast v4, Lva3/c;

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/k0;->D(Lva3/c;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v1

    const-string v3, "value"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lab3/a;

    if-eqz v4, :cond_2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object v0, v0, Lm63/d;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lab3/a;

    iget-object v2, v2, Lab3/g;->a:Ljava/lang/Object;

    check-cast v2, Ls93/b;

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    return-void

    :pswitch_0
    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0}, Lm63/d;->l()V

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, La00/g;

    iget-object v0, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Lab3/a;

    iget-object v2, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-static {v2}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls93/b;

    invoke-direct {v1, v2}, Lab3/a;-><init>(Ls93/b;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public m(Lva3/h;)Loa3/o;
    .locals 1

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1}, Lm63/d;->m(Lva3/h;)Loa3/o;

    move-result-object p1

    return-object p1
.end method

.method public n(Lva3/h;Lab3/f;)V
    .locals 1

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2}, Lm63/d;->n(Lva3/h;Lab3/f;)V

    return-void
.end method

.method public p(Lva3/h;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2}, Lm63/d;->p(Lva3/h;Ljava/lang/Object;)V

    return-void
.end method

.method public q(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 1

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2, p3}, Lm63/d;->q(Lva3/h;Lva3/c;Lva3/h;)V

    return-void
.end method

.method public r(Lmr/g;)Z
    .locals 1

    iget-object v0, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lmr/o;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, v0, Lmr/o;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public s(Lva3/c;Lva3/h;)Loa3/n;
    .locals 1

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Lm63/d;

    invoke-virtual {v0, p1, p2}, Lm63/d;->s(Lva3/c;Lva3/h;)Loa3/n;

    move-result-object p1

    return-object p1
.end method

.method public t()Z
    .locals 2

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/iterable/iterableapi/e2;

    invoke-direct {v1, p0}, Lcom/iterable/iterableapi/e2;-><init>(La00/g;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-string v0, "IterableTaskStorage"

    const-string v1, "Database not initialized or is closed"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, La00/g;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, ";"

    :try_start_0
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    iget-object v1, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, La00/g;->z:Ljava/lang/Object;

    check-cast v3, Lio/seon/androidsdk/service/d0;

    iget-object v4, p0, La00/g;->E:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string v0, ""

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lr93/w0;)Z
    .locals 2

    iget-object v0, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v0, Lr93/w0;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    check-cast v0, La00/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La00/g;->u(Lr93/w0;)Z

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    return v1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public v(Ly00/c0;Ld00/l;Ljava/lang/String;Ljava/lang/String;Lv00/c0;)Le10/k;
    .locals 23

    move-object/from16 v0, p1

    move-object/from16 v6, p0

    iget-object v1, v6, La00/g;->x:Ljava/lang/Object;

    check-cast v1, Lwz/g0;

    iget-boolean v2, v1, Lwz/g0;->H:Z

    iget-object v3, v1, Lwz/g0;->w:Ly00/c8;

    const-string v4, "card"

    if-eqz v2, :cond_4

    const-string v2, "paymentDetails"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Ly00/x;

    if-eqz v2, :cond_1

    invoke-interface {v3}, Ly00/c8;->p()Ljava/util/List;

    move-result-object v2

    sget-object v5, Ly00/f4;->G:Lt9/c0;

    const-string v5, "us_bank_account"

    invoke-interface {v2, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    iget-object v5, v1, Lwz/g0;->T:Ly00/p2;

    sget-object v7, Ly00/p2;->x:Ly00/p2;

    if-ne v5, v7, :cond_0

    if-nez v2, :cond_0

    :goto_0
    move-object v2, v4

    goto :goto_1

    :cond_0
    const-string v2, "bank_account"

    goto :goto_1

    :cond_1
    instance-of v2, v0, Ly00/a0;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    instance-of v2, v0, Ly00/b0;

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    sget-object v2, Ly00/f4;->G:Lt9/c0;

    const-string v2, "link"

    :goto_1
    instance-of v5, v3, Ly00/l3;

    if-eqz v5, :cond_5

    check-cast v3, Ly00/l3;

    invoke-virtual {v3, v2}, Ly00/l3;->b(Ljava/lang/String;)Z

    move-result v3

    goto :goto_2

    :cond_5
    instance-of v3, v3, Ly00/g6;

    if-eqz v3, :cond_12

    const/4 v3, 0x1

    :goto_2
    const/4 v5, 0x0

    if-nez v3, :cond_8

    iget-boolean v3, v1, Lwz/g0;->g0:Z

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    sget-object v3, Ly00/r3;->x:Ly00/r3;

    :cond_7
    :goto_3
    move-object v14, v3

    goto :goto_7

    :cond_8
    :goto_4
    iget-object v3, v1, Lwz/g0;->f0:Lv00/i0;

    instance-of v7, v3, Lv00/e0;

    if-eqz v7, :cond_9

    check-cast v3, Lv00/e0;

    iget-object v3, v3, Lv00/e0;->w:Ly00/r3;

    goto :goto_6

    :cond_9
    instance-of v7, v3, Lv00/f0;

    if-nez v7, :cond_b

    sget-object v7, Lv00/h0;->w:Lv00/h0;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    :goto_5
    move-object v3, v5

    :goto_6
    if-nez v3, :cond_7

    sget-object v3, Ly00/r3;->y:Ly00/r3;

    goto :goto_3

    :goto_7
    iget-boolean v3, v1, Lwz/g0;->H:Z

    if-eqz v3, :cond_c

    new-instance v1, Lo10/g;

    move-object v3, v0

    move-object v0, v1

    invoke-virtual {v3}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object v5, v14

    invoke-direct/range {v0 .. v5}, Lo10/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/r3;)V

    move-object v1, v0

    goto/16 :goto_c

    :cond_c
    move-object/from16 v2, p3

    move-object v3, v0

    move-object/from16 v0, p2

    iget-object v0, v0, Ld00/l;->G:Ljava/lang/String;

    iget-object v15, v1, Lwz/g0;->i0:Ly00/n;

    const-string v1, "selectedPaymentDetails"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "consumerSessionClientSecret"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "clientAttributionMetadata"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ly00/c0;->b()Ly00/y;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v10, v1, Ly00/y;->x:Ljava/lang/String;

    iget-object v11, v1, Ly00/y;->y:Ljava/lang/String;

    iget-object v12, v1, Ly00/y;->F:Ljava/lang/String;

    iget-object v8, v1, Ly00/y;->E:Ljava/lang/String;

    iget-object v13, v1, Ly00/y;->z:Ljava/lang/String;

    iget-object v1, v1, Ly00/y;->G:Lcom/stripe/android/core/model/CountryCode;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_8

    :cond_d
    move-object v9, v5

    :goto_8
    new-instance v7, Ly00/c;

    invoke-direct/range {v7 .. v13}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_e
    move-object v7, v5

    :goto_9
    invoke-virtual {v3}, Ly00/c0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ly00/c0;->b()Ly00/y;

    move-result-object v8

    if-eqz v8, :cond_f

    iget-object v8, v8, Ly00/y;->w:Ljava/lang/String;

    goto :goto_a

    :cond_f
    move-object v8, v5

    :goto_a
    new-instance v9, Ly00/v3;

    move-object/from16 v10, p4

    invoke-direct {v9, v7, v1, v8, v10}, Ly00/v3;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ly00/c0;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ly00/v3;

    const/16 v7, 0xf

    invoke-direct {v3, v5, v5, v7}, Ly00/v3;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v9, v3}, Ly00/v3;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    move-object v13, v9

    goto :goto_b

    :cond_10
    move-object v13, v5

    :goto_b
    if-eqz v2, :cond_11

    const-string v3, "cvc"

    invoke-static {v3, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v4, v2}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    :cond_11
    const-string v2, "paymentDetailsId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Ly00/f4;->H:Ly00/f4;

    new-instance v11, Ly00/w4;

    invoke-direct {v11, v1, v0, v5}, Ly00/w4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v17, Ly00/d5;

    const/4 v12, 0x0

    const v16, 0x173bfe

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v7, v17

    invoke-direct/range {v7 .. v16}, Ly00/d5;-><init>(Ly00/f4;Ly00/s4;Ly00/b5;Ly00/w4;Ly00/z4;Ly00/v3;Ly00/r3;Ly00/n;I)V

    new-instance v16, Le10/t0;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Le10/t0;-><init>(Ly00/d5;Ly00/u5;Ly00/j5;ZZZ)V

    move-object/from16 v1, v16

    :goto_c
    new-instance v0, Le10/k;

    move-object/from16 v2, p5

    invoke-direct {v0, v1, v2}, Le10/k;-><init>(Le10/l;Lv00/c0;)V

    return-object v0

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public w()V
    .locals 0

    return-void
.end method

.method public x()V
    .locals 0

    return-void
.end method

.method public y(Lmr/g;)V
    .locals 2

    iget-object v0, p0, La00/g;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0, p1}, La00/g;->r(Lmr/g;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, La00/g;->z:Ljava/lang/Object;

    check-cast p1, Lmr/o;

    iget-boolean v1, p1, Lmr/o;->c:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p1, Lmr/o;->c:Z

    iget-object v1, p0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
