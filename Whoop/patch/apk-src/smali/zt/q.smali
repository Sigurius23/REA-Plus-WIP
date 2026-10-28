.class public Lzt/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/j2;
.implements Lhb3/e;
.implements Lne3/o0;


# static fields
.field public static F:Lzt/q;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lzt/q;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 95
    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 96
    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 97
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void

    .line 98
    :sswitch_0
    new-instance p1, Lgh3/h;

    const/4 v0, 0x1

    .line 99
    invoke-direct {p1, v0}, Lgh3/h;-><init>(I)V

    .line 100
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 103
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 104
    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    iput-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 105
    new-instance v0, Landroidx/databinding/s;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Landroidx/databinding/s;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 106
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    sget-object p1, Lpf/l;->w:Lpf/l;

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 108
    new-instance p1, Lpf/j;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lpf/j;-><init>(Lzt/q;I)V

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 109
    sget-object p1, Lpf/n;->w:Lpf/n;

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void

    .line 110
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 111
    new-instance p1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 112
    new-instance p1, Lfj/b;

    const/4 v0, 0x0

    const/4 v1, 0x7

    invoke-direct {p1, v0, v0, v1}, Lfj/b;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 113
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 114
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void

    .line 115
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 117
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 118
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 119
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_3
        0x7 -> :sswitch_2
        0x11 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lzt/q;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La6/i0;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lzt/q;->w:I

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    .line 133
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 134
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 135
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lzt/q;->w:I

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 122
    sget-object p1, Lqh/b;->a:Lmh/c;

    .line 123
    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 124
    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 125
    new-instance p1, Lqh/e;

    invoke-direct {p1}, Lqh/e;-><init>()V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Li6/b;)V
    .locals 7

    const/16 v0, 0xa

    iput v0, p0, Lzt/q;->w:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    .line 60
    iput-object p2, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 61
    new-instance p1, Lh6/u;

    const/16 v0, 0x400

    invoke-direct {p1, v0}, Lh6/u;-><init>(I)V

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    const/4 p1, 0x6

    .line 62
    invoke-virtual {p2, p1}, Li6/c;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 63
    iget v2, p2, Li6/c;->w:I

    add-int/2addr v0, v2

    .line 64
    iget-object v2, p2, Li6/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 65
    iget-object v0, p2, Li6/c;->z:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 66
    new-array v0, v0, [C

    iput-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 67
    invoke-virtual {p2, p1}, Li6/c;->a(I)I

    move-result p1

    if-eqz p1, :cond_1

    .line 68
    iget v0, p2, Li6/c;->w:I

    add-int/2addr p1, v0

    .line 69
    iget-object v0, p2, Li6/c;->z:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    .line 70
    iget-object p1, p2, Li6/c;->z:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_6

    .line 71
    new-instance v0, Lh6/x;

    invoke-direct {v0, p0, p2}, Lh6/x;-><init>(Lzt/q;I)V

    .line 72
    invoke-virtual {v0}, Lh6/x;->b()Li6/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 73
    invoke-virtual {v2, v3}, Li6/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Li6/c;->z:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Li6/c;->w:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    .line 74
    :goto_3
    iget-object v3, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 75
    invoke-virtual {v0}, Lh6/x;->b()Li6/a;

    move-result-object v2

    const/16 v3, 0x10

    .line 76
    invoke-virtual {v2, v3}, Li6/c;->a(I)I

    move-result v4

    if-eqz v4, :cond_3

    .line 77
    iget v5, v2, Li6/c;->w:I

    add-int/2addr v4, v5

    .line 78
    iget-object v5, v2, Li6/c;->z:Ljava/lang/Object;

    check-cast v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v5

    add-int/2addr v5, v4

    .line 79
    iget-object v2, v2, Li6/c;->z:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const/4 v4, 0x1

    if-lez v2, :cond_4

    move v2, v4

    goto :goto_5

    :cond_4
    move v2, v1

    .line 80
    :goto_5
    const-string v5, "invalid metadata codepoint length"

    invoke-static {v2, v5}, Lwb3/f;->m(ZLjava/lang/String;)V

    .line 81
    iget-object v2, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v2, Lh6/u;

    .line 82
    invoke-virtual {v0}, Lh6/x;->b()Li6/a;

    move-result-object v5

    .line 83
    invoke-virtual {v5, v3}, Li6/c;->a(I)I

    move-result v3

    if-eqz v3, :cond_5

    .line 84
    iget v6, v5, Li6/c;->w:I

    add-int/2addr v3, v6

    .line 85
    iget-object v6, v5, Li6/c;->z:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v6

    add-int/2addr v6, v3

    .line 86
    iget-object v3, v5, Li6/c;->z:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v1

    :goto_6
    sub-int/2addr v3, v4

    .line 87
    invoke-virtual {v2, v0, v1, v3}, Lh6/u;->a(Lh6/x;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lzt/q;->w:I

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 37
    iput-object p3, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 38
    new-instance p1, Ljc/a;

    const/16 p2, 0xa

    .line 39
    invoke-direct {p1, p2}, Ljc/a;-><init>(I)V

    .line 40
    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;La6/i;La6/j;La6/c;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lzt/q;->w:I

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 30
    iput-object p4, p0, Lzt/q;->y:Ljava/lang/Object;

    const/4 p4, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    .line 31
    invoke-static {v1, v0, p4}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p4

    iput-object p4, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 32
    new-instance p4, Laj/d;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p4, v0, v1}, Laj/d;-><init>(IZ)V

    iput-object p4, p0, Lzt/q;->E:Ljava/lang/Object;

    .line 33
    invoke-interface {p1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    sget-object p4, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p1, p4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_0

    new-instance p4, La6/z0;

    const/4 v0, 0x0

    invoke-direct {p4, p2, p0, p3, v0}, La6/z0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {p1, p4}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/internal/q0;)V
    .locals 2

    const/4 v0, 0x5

    iput v0, p0, Lzt/q;->w:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/HashMap;

    .line 47
    iget-object v1, p1, Lcom/google/crypto/tink/internal/q0;->a:Ljava/util/HashMap;

    .line 48
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 49
    new-instance v0, Ljava/util/HashMap;

    .line 50
    iget-object v1, p1, Lcom/google/crypto/tink/internal/q0;->b:Ljava/util/HashMap;

    .line 51
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    iget-object v1, p1, Lcom/google/crypto/tink/internal/q0;->c:Ljava/util/HashMap;

    .line 54
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 55
    new-instance v0, Ljava/util/HashMap;

    .line 56
    iget-object p1, p1, Lcom/google/crypto/tink/internal/q0;->d:Ljava/util/HashMap;

    .line 57
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ld0/d0;)V
    .locals 2

    const/4 v0, 0x6

    iput v0, p0, Lzt/q;->w:I

    .line 137
    new-instance v0, Lad3/z;

    const/4 v1, 0x7

    invoke-direct {v0, p1, v1}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    .line 138
    invoke-direct {p0, v0}, Lzt/q;-><init>(Ld0/s;)V

    return-void
.end method

.method public constructor <init>(Ld0/s;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lzt/q;->w:I

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lia3/a;Lia3/f;Ll83/h;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lzt/q;->w:I

    const-string v0, "typeParameterResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 90
    iput-object p2, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 91
    iput-object p3, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 92
    new-instance p1, La3/p;

    invoke-direct {p1, p0, p2}, La3/p;-><init>(Lzt/q;Lia3/f;)V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lij/m;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lzt/q;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lzt/q;->w:I

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 128
    iput-object p2, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 129
    iput-object p3, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 130
    iput-object p4, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/net/Socket;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lzt/q;->w:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 42
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 43
    new-instance p1, Loe3/e;

    invoke-direct {p1, p0}, Loe3/e;-><init>(Lzt/q;)V

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 44
    new-instance p1, Loe3/d;

    invoke-direct {p1, p0}, Loe3/d;-><init>(Lzt/q;)V

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkb3/k;Lr93/b0;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lzt/q;->w:I

    const-string v0, "module"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 8
    new-instance p2, Lr93/d0;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lr93/d0;-><init>(Lzt/q;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p2

    iput-object p2, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 9
    new-instance p2, Lr93/d0;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lr93/d0;-><init>(Lzt/q;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/q;Lq1/j0;Lt83/a;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lzt/q;->w:I

    const-string v0, "protoSet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entries"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqa3/i0;Lsa3/g;Lra3/a;Lhb3/l;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lzt/q;->w:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p2, p0, Lzt/q;->x:Ljava/lang/Object;

    .line 15
    iput-object p3, p0, Lzt/q;->y:Ljava/lang/Object;

    .line 16
    iput-object p4, p0, Lzt/q;->z:Ljava/lang/Object;

    .line 17
    iget-object p1, p1, Lqa3/i0;->G:Ljava/util/List;

    .line 18
    const-string p2, "getClass_List(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 p2, 0xa

    .line 19
    invoke-static {p1, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 p3, 0x10

    if-ge p2, p3, :cond_0

    move p2, p3

    .line 20
    :cond_0
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 21
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    .line 22
    move-object p4, p2

    check-cast p4, Lqa3/k;

    .line 23
    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lsa3/g;

    .line 24
    iget p4, p4, Lqa3/k;->E:I

    .line 25
    invoke-static {v0, p4}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object p4

    .line 26
    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 27
    :cond_1
    iput-object p3, p0, Lzt/q;->E:Ljava/lang/Object;

    return-void
.end method

.method public static declared-synchronized u()Lzt/q;
    .locals 3

    const-class v0, Lzt/q;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lzt/q;->F:Lzt/q;

    if-nez v1, :cond_0

    new-instance v1, Lzt/q;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lzt/q;-><init>(I)V

    sput-object v1, Lzt/q;->F:Lzt/q;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lzt/q;->F:Lzt/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public A(Lij/p;)V
    .locals 8

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lij/p;

    iget-object v2, v2, Lij/p;->b:Lkotlin/jvm/internal/m;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, Lij/m;

    invoke-virtual {v3}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getGlobalObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    iget-object v6, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_3

    move-object v5, v4

    goto :goto_3

    :cond_3
    invoke-interface {v4, v6}, Lcom/amplitude/quickjs/wrapper/JSObject;->getJSObject(Ljava/lang/String;)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v7

    if-eqz v7, :cond_4

    move-object v5, v7

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lij/m;->b()Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->createNewJSObject()Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object v3

    goto :goto_2

    :cond_5
    move-object v3, v5

    :goto_2
    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v4, v6, v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSObject;)V

    invoke-interface {v4, v6}, Lcom/amplitude/quickjs/wrapper/JSObject;->getProperty(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.JSObject"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v3

    check-cast v5, Lcom/amplitude/quickjs/wrapper/JSObject;

    :goto_3
    if-nez v5, :cond_7

    goto :goto_0

    :cond_7
    new-instance v3, Lcom/amplitude/quickjs/wrapper/a;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lcom/amplitude/quickjs/wrapper/a;-><init>(Ljava/lang/Object;I)V

    iget-object v2, p1, Lij/p;->a:Ljava/lang/String;

    invoke-interface {v5, v2, v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->setProperty(Ljava/lang/String;Lcom/amplitude/quickjs/wrapper/JSCallFunction;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_8
    return-void
.end method

.method public B(Lcom/google/crypto/tink/internal/k;)V
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/o0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v1, Lcom/google/crypto/tink/internal/k0;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/k;->a:Lct/a;

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/internal/o0;-><init>(Ljava/lang/Class;Lct/a;)V

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/k;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal parser for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public C(Lcom/google/crypto/tink/internal/m;)V
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/p0;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/m;->a:Ljava/lang/Class;

    const-class v2, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/internal/p0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/m;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal serializer for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public D(Lcom/google/crypto/tink/internal/b0;)V
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/o0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v1, Lcom/google/crypto/tink/internal/l0;

    iget-object v2, p1, Lcom/google/crypto/tink/internal/b0;->a:Lct/a;

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/internal/o0;-><init>(Ljava/lang/Class;Lct/a;)V

    iget-object v1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/b0;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal parser for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public E(Lcom/google/crypto/tink/internal/d0;)V
    .locals 3

    new-instance v0, Lcom/google/crypto/tink/internal/p0;

    iget-object v1, p1, Lcom/google/crypto/tink/internal/d0;->a:Ljava/lang/Class;

    const-class v2, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/internal/p0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/internal/d0;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal serializer for already existing object of type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public F(Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/t;

    instance-of v1, p1, La6/x0;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, La6/x0;

    iget v2, v1, La6/x0;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, La6/x0;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, La6/x0;

    invoke-direct {v1, p0, p1}, La6/x0;-><init>(Lzt/q;Ls83/c;)V

    :goto_0
    iget-object p1, v1, La6/x0;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/x0;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v1, v1, La6/x0;->w:Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v3, v1, La6/x0;->w:Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v3

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbc3/t1;->isCompleted()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v6

    :cond_4
    iget-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/c;

    iput-object p1, v1, La6/x0;->w:Lmc3/a;

    iput v5, v1, La6/x0;->z:I

    invoke-virtual {p1, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lbc3/t1;->isCompleted()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_6

    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v6

    :cond_6
    :try_start_2
    iput-object p1, v1, La6/x0;->w:Lmc3/a;

    iput v4, v1, La6/x0;->z:I

    invoke-virtual {p0, v1}, Lzt/q;->s(Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    move-object v1, p1

    :goto_3
    :try_start_3
    invoke-virtual {v0, v6}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v6

    :catchall_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    :goto_4
    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public G(Lpf/a;)V
    .locals 2

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Lpf/n;

    sget-object v1, Lpf/k;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lpf/n;->x:Lpf/n;

    goto :goto_0

    :cond_0
    sget-object v0, Lpf/n;->y:Lpf/n;

    :goto_0
    iput-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    if-nez p1, :cond_1

    sget-object v0, Lpf/m;->w:Lpf/m;

    iput-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    new-instance v0, Lpf/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lpf/j;-><init>(Lzt/q;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Lm83/p;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    :goto_1
    iput-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lpf/a;->getConfig()Lpf/i;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Lrf/r;

    new-instance v0, Lrf/p;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    goto :goto_2

    :cond_2
    new-instance v0, Lnm1/g;

    const/16 p1, 0x1a

    invoke-direct {v0, p1}, Lnm1/g;-><init>(I)V

    :goto_2
    iput-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    return-void
.end method

.method public H(Lfj/b;)V
    .locals 6

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Lfj/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getWriteHoldCount()I

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->getReadHoldCount()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_1

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->lock()V

    :try_start_1
    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_2
    if-ge v4, v3, :cond_2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    invoke-virtual {p1, v1}, Lfj/b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    monitor-enter v0

    :try_start_2
    iget-object v1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashSet;

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    return-void

    :catchall_1
    move-exception p1

    :goto_4
    if-ge v4, v3, :cond_4

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;->unlock()V

    throw p1

    :catchall_2
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw p1
.end method

.method public I()V
    .locals 1

    const/16 v0, 0xc

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    return-void
.end method

.method public J(I)V
    .locals 2

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    return-void
.end method

.method public K(I)V
    .locals 2

    iget v0, p0, Lzt/q;->w:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x18

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    return-void

    :pswitch_0
    const/16 v0, 0x10

    if-eq p1, v0, :cond_3

    const/16 v0, 0x18

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

    const-string v1, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public L()V
    .locals 1

    iget v0, p0, Lzt/q;->w:I

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    return-void

    :pswitch_0
    const/16 v0, 0x10

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public M(Laa3/n0;Lj93/z;Ljava/lang/Enum;)V
    .locals 3

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "value"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/q;

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lba3/h;

    invoke-interface {p2, p1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v1, p3, Lba3/h;->b:I

    const/4 v2, 0x1

    shl-int v1, v2, v1

    sub-int/2addr v1, v2

    iget v2, p3, Lba3/h;->a:I

    shl-int/2addr v1, v2

    not-int v1, v1

    and-int/2addr v0, v1

    iget p3, p3, Lba3/h;->c:I

    shl-int/2addr p3, v2

    add-int/2addr v0, p3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lj93/l;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized b(Lwk/e;Lzk/t;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lzk/a;

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p1, p2, v1}, Lzk/a;-><init>(Lwk/e;Lzk/t;Ljava/lang/ref/ReferenceQueue;)V

    iget-object p2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzk/a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lzk/a;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public c(Ld0/r;Ld0/r;Ld0/r;)J
    .locals 8

    invoke-virtual {p1}, Ld0/r;->b()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v4, Ld0/s;

    invoke-interface {v4, v3}, Ld0/s;->get(I)Ld0/d0;

    move-result-object v4

    invoke-virtual {p1, v3}, Ld0/r;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Ld0/r;->a(I)F

    move-result v6

    invoke-virtual {p3, v3}, Ld0/r;->a(I)F

    move-result v7

    invoke-interface {v4, v5, v6, v7}, Ld0/d0;->d(FFF)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V

    return-void
.end method

.method public d()Lne3/n0;
    .locals 1

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Loe3/d;

    return-object v0
.end method

.method public e()Lbh/j;
    .locals 13

    new-instance v0, Lbh/j;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Lmh/c;

    new-instance v3, Lbh/d;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lbh/d;-><init>(Lzt/q;I)V

    invoke-static {v3}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v3

    new-instance v4, Lbh/d;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lbh/d;-><init>(Lzt/q;I)V

    invoke-static {v4}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v4

    new-instance v5, La13/f;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, La13/f;-><init>(I)V

    invoke-static {v5}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v5

    iget-object v6, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v6, Lbh/b;

    if-nez v6, :cond_0

    new-instance v7, Lbh/b;

    sget-object v8, Lm83/y;->w:Lm83/y;

    move-object v9, v8

    move-object v10, v8

    move-object v11, v8

    move-object v12, v8

    invoke-direct/range {v7 .. v12}, Lbh/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object v6, v7

    :cond_0
    iget-object v7, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v7, Lqh/e;

    invoke-direct/range {v0 .. v7}, Lbh/j;-><init>(Landroid/content/Context;Lmh/c;Ll83/p;Ll83/p;Ll83/p;Lbh/b;Lqh/e;)V

    return-object v0
.end method

.method public f(Ld0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 9

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ld0/r;->c()Ld0/r;

    move-result-object v0

    iput-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    const/4 v1, 0x0

    const-string v2, "endVelocityVector"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v4, Ld0/r;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Ld0/s;

    invoke-interface {v5, v3}, Ld0/s;->get(I)Ld0/d0;

    move-result-object v5

    invoke-virtual {p1, v3}, Ld0/r;->a(I)F

    move-result v6

    invoke-virtual {p2, v3}, Ld0/r;->a(I)F

    move-result v7

    invoke-virtual {p3, v3}, Ld0/r;->a(I)F

    move-result v8

    invoke-interface {v5, v6, v7, v8}, Ld0/d0;->c(FFF)F

    move-result v5

    invoke-virtual {v4, v5, v3}, Ld0/r;->e(FI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object p1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast p1, Ld0/r;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public g()Lgs/n;
    .locals 5

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Lgs/j;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    new-instance v1, Lgs/n;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v4, Lgs/j;

    invoke-direct {v1, v0, v2, v3, v4}, Lgs/n;-><init>(IIILgs/j;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "IV size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getSource()Lne3/p0;
    .locals 1

    iget-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v0, Loe3/e;

    return-object v0
.end method

.method public h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 14

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    if-nez v0, :cond_0

    invoke-virtual/range {p3 .. p3}, Ld0/r;->c()Ld0/r;

    move-result-object v0

    iput-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    const/4 v1, 0x0

    const-string v2, "valueVector"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v4, Ld0/r;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Ld0/s;

    invoke-interface {v5, v3}, Ld0/s;->get(I)Ld0/d0;

    move-result-object v6

    move-object/from16 v5, p3

    invoke-virtual {v5, v3}, Ld0/r;->a(I)F

    move-result v7

    move-object/from16 v12, p4

    invoke-virtual {v12, v3}, Ld0/r;->a(I)F

    move-result v8

    move-object/from16 v13, p5

    invoke-virtual {v13, v3}, Ld0/r;->a(I)F

    move-result v9

    move-wide v10, p1

    invoke-interface/range {v6 .. v11}, Ld0/d0;->e(FFFJ)F

    move-result v6

    invoke-virtual {v4, v6, v3}, Ld0/r;->e(FI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public j()Lgs/q;
    .locals 5

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Lgs/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    new-instance v1, Lgs/q;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v4, Lgs/j;

    invoke-direct {v1, v0, v2, v3, v4}, Lgs/q;-><init>(IIILgs/j;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "IV size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k()Lns/m;
    .locals 5

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lns/k;

    if-eqz v0, :cond_3

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Lns/j;

    if-eqz v1, :cond_2

    iget-object v2, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v2, Lns/i;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v3, Lns/l;

    if-eqz v3, :cond_0

    new-instance v4, Lns/m;

    invoke-direct {v4, v0, v1, v2, v3}, Lns/m;-><init>(Lns/k;Lns/j;Lns/i;Lns/l;)V

    return-object v4

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HPKE variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HPKE AEAD parameter is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HPKE KDF parameter is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "HPKE KEM parameter is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 14

    iget-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    if-nez v0, :cond_0

    invoke-virtual/range {p5 .. p5}, Ld0/r;->c()Ld0/r;

    move-result-object v0

    iput-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    const/4 v1, 0x0

    const-string v2, "velocityVector"

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ld0/r;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v4, Ld0/r;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v5, Ld0/s;

    invoke-interface {v5, v3}, Ld0/s;->get(I)Ld0/d0;

    move-result-object v6

    move-object/from16 v5, p3

    invoke-virtual {v5, v3}, Ld0/r;->a(I)F

    move-result v7

    move-object/from16 v12, p4

    invoke-virtual {v12, v3}, Ld0/r;->a(I)F

    move-result v8

    move-object/from16 v13, p5

    invoke-virtual {v13, v3}, Ld0/r;->a(I)F

    move-result v9

    move-wide v10, p1

    invoke-interface/range {v6 .. v11}, Ld0/d0;->b(FFFJ)F

    move-result v6

    invoke-virtual {v4, v6, v3}, Ld0/r;->e(FI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v0, Ld0/r;

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public n()Lqs/l;
    .locals 5

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_f

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_e

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Lqs/j;

    if-eqz v1, :cond_d

    iget-object v1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Lqs/k;

    if-eqz v1, :cond_c

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_b

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v2, Lqs/j;

    const/16 v3, 0xa

    if-lt v1, v3, :cond_a

    sget-object v3, Lqs/j;->b:Lqs/j;

    if-ne v2, v3, :cond_1

    const/16 v2, 0x14

    if-gt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v3, Lqs/j;->c:Lqs/j;

    if-ne v2, v3, :cond_3

    const/16 v2, 0x1c

    if-gt v1, v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    sget-object v3, Lqs/j;->d:Lqs/j;

    if-ne v2, v3, :cond_5

    const/16 v2, 0x20

    if-gt v1, v2, :cond_4

    goto :goto_0

    :cond_4
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    sget-object v3, Lqs/j;->e:Lqs/j;

    if-ne v2, v3, :cond_7

    const/16 v2, 0x30

    if-gt v1, v2, :cond_6

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    sget-object v3, Lqs/j;->f:Lqs/j;

    if-ne v2, v3, :cond_9

    const/16 v2, 0x40

    if-gt v1, v2, :cond_8

    :goto_0
    new-instance v0, Lqs/l;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v3, Lqs/k;

    iget-object v4, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v4, Lqs/j;

    invoke-direct {v0, v1, v2, v3, v4}, Lqs/l;-><init>(IILqs/k;Lqs/j;)V

    return-object v0

    :cond_8
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "unknown hash type; must be SHA256, SHA384 or SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "Invalid tag size in bytes %d; must be at least 10 bytes"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Invalid key size in bytes %d; must be at least 16 bytes"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o()Lws/c;
    .locals 6

    sget-object v0, Lws/b;->e:Lws/b;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lws/b;

    if-eqz v1, :cond_9

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Lws/a;

    if-eqz v2, :cond_8

    iget-object v3, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v3, Lws/b;

    if-eqz v3, :cond_7

    iget-object v4, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v4, Lws/b;

    if-eqz v4, :cond_6

    sget-object v5, Lws/a;->c:Lws/a;

    if-ne v2, v5, :cond_1

    sget-object v5, Lws/b;->c:Lws/b;

    if-ne v3, v5, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P256 requires SHA256"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    sget-object v5, Lws/a;->d:Lws/a;

    if-ne v2, v5, :cond_3

    sget-object v5, Lws/b;->d:Lws/b;

    if-eq v3, v5, :cond_3

    if-ne v3, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P384 requires SHA384 or SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v5, Lws/a;->e:Lws/a;

    if-ne v2, v5, :cond_5

    if-ne v3, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "NIST_P521 requires SHA512"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_2
    new-instance v0, Lws/c;

    invoke-direct {v0, v1, v2, v3, v4}, Lws/c;-><init>(Lws/b;Lws/a;Lws/b;Lws/b;)V

    return-object v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "EC curve type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "signature encoding is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p()Lys/g;
    .locals 5

    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Lys/c;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "derivedAesGcmKeySizeBytes needs to be 16 or 32, not "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x18

    if-le v0, v1, :cond_2

    new-instance v0, Lys/g;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v3, Lys/c;

    iget-object v4, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3, v4}, Lys/g;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lys/c;Ljava/lang/Integer;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ciphertextSegmentSizeBytes needs to be at least derivedAesGcmKeySizeBytes + 25, i.e., "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x19

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "keySizeBytes needs to be at least derivedAesGcmKeySizeBytes, i.e., "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "ciphertextSegmentSizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hkdfHashType needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "derivedAesGcmKeySizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "keySizeBytes needs to be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public q()Lad3/z;
    .locals 3

    new-instance v0, Lad3/z;

    iget-object v1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpf/a;

    const/16 v2, 0x1a

    invoke-direct {v0, v1, v2}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public r(Lzk/a;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    iget-object v1, p1, Lzk/a;->a:Lwk/e;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p1, Lzk/a;->b:Z

    if-eqz v0, :cond_1

    iget-object v2, p1, Lzk/a;->c:Lzk/z;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lzk/t;

    iget-object v5, p1, Lzk/a;->a:Lwk/e;

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lzk/l;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lzk/t;-><init>(Lzk/z;ZZLwk/e;Lzk/s;)V

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Lzk/l;

    iget-object p1, p1, Lzk/a;->a:Lwk/e;

    invoke-virtual {v0, p1, v1}, Lzk/l;->e(Lwk/e;Lzk/t;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public s(Ls83/c;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, La6/i0;

    instance-of v1, p1, La6/k;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, La6/k;

    iget v2, v1, La6/k;->y:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, La6/k;->y:I

    goto :goto_0

    :cond_0
    new-instance v1, La6/k;

    invoke-direct {v1, p0, p1}, La6/k;-><init>(Lzt/q;Ls83/c;)V

    :goto_0
    iget-object p1, v1, La6/k;->w:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/k;->y:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, La6/i0;->h()La6/d1;

    move-result-object p1

    new-instance v3, La6/n;

    const/4 v5, 0x0

    invoke-direct {v3, v0, p0, v5}, La6/n;-><init>(La6/i0;Lzt/q;Lq83/d;)V

    iput v4, v1, La6/k;->y:I

    invoke-virtual {p1, v3, v1}, La6/d1;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p1, La6/b;

    goto :goto_5

    :cond_6
    :goto_2
    iput v5, v1, La6/k;->y:I

    const/4 p1, 0x0

    invoke-static {v0, p1, v1}, La6/i0;->g(La6/i0;ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    :goto_4
    check-cast p1, La6/b;

    :goto_5
    iget-object v0, v0, La6/i0;->g:Lbu/c;

    invoke-virtual {v0, p1}, Lbu/c;->J(La6/e1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public t(Lva3/c;Ljava/util/List;)Lr93/e;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Lkb3/e;

    new-instance v1, Lr93/e0;

    invoke-direct {v1, p1, p2}, Lr93/e0;-><init>(Lva3/c;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lzt/q;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public v(Laa3/n0;Lj93/z;)Ljava/lang/Enum;
    .locals 2

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast p2, Lt83/a;

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Lq1/j0;

    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/q;

    invoke-interface {v1, p1}, Lj93/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lq1/j0;->e(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwa3/q;

    invoke-interface {p1}, Lwa3/q;->a()I

    move-result p1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Enum;

    return-object p1
.end method

.method public w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;
    .locals 4

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ljc/a;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Landroidx/lifecycle/e2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Landroidx/lifecycle/e2;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/w1;

    invoke-interface {p2, v1}, Lj93/d;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/a2;

    instance-of p2, p1, Landroidx/lifecycle/c2;

    if-eqz p2, :cond_0

    check-cast p1, Landroidx/lifecycle/c2;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Landroidx/lifecycle/c2;->a(Landroidx/lifecycle/w1;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    :goto_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    new-instance v1, Ll8/e;

    iget-object v2, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v2, Ll8/c;

    invoke-direct {v1, v2}, Ll8/e;-><init>(Ll8/c;)V

    sget-object v2, Landroidx/lifecycle/d2;->b:Lio/sentry/hints/j;

    iget-object v3, v1, Ll8/c;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v2, Landroidx/lifecycle/a2;

    const-string v3, "factory"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v2, p2, v1}, Landroidx/lifecycle/a2;->create(Lj93/d;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    move-object v1, p2

    goto :goto_2

    :catch_0
    :try_start_2
    invoke-static {p2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;Ll8/c;)Landroidx/lifecycle/w1;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_1
    :try_start_3
    invoke-static {p2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p2

    invoke-interface {v2, p2}, Landroidx/lifecycle/a2;->create(Ljava/lang/Class;)Landroidx/lifecycle/w1;

    move-result-object p2

    goto :goto_1

    :goto_2
    iget-object p2, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast p2, Landroidx/lifecycle/e2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "viewModel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Landroidx/lifecycle/e2;->a:Ljava/util/LinkedHashMap;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/w1;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/lifecycle/w1;->clear$lifecycle_viewmodel_release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    :goto_3
    monitor-exit v0

    return-object v1

    :goto_4
    monitor-exit v0

    throw p1
.end method

.method public x(Lva3/c;)Lhb3/d;
    .locals 5

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzt/q;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa3/k;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v1, Lhb3/d;

    iget-object v2, p0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lsa3/g;

    iget-object v3, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, Lra3/a;

    iget-object v4, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v4, Lhb3/l;

    invoke-virtual {v4, p1}, Lhb3/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr93/s0;->q:Lr93/v0;

    invoke-direct {v1, v2, v0, v3, p1}, Lhb3/d;-><init>(Lsa3/f;Lqa3/k;Lsa3/a;Lr93/s0;)V

    return-object v1
.end method

.method public y(Landroid/content/Context;)Z
    .locals 1

    iget-object v0, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_1

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x3

    const-string v0, "FirebaseMessaging"

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object p1, p0, Lzt/q;->z:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public z(Landroid/content/Context;)Z
    .locals 1

    iget-object v0, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_1

    const-string v0, "android.permission.WAKE_LOCK"

    invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x3

    const-string v0, "FirebaseMessaging"

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object p1, p0, Lzt/q;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
