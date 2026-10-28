.class public Lwe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfa3/a0;
.implements Lwk/k;
.implements Lh6/p;
.implements Lio/sentry/k3;
.implements Lio/sentry/b6;
.implements Ll73/d;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    sget-object p1, Ltg/b;->f:Ltg/b;

    .line 55
    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 56
    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILi4/g;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lwe/o;->w:Ljava/lang/Object;

    const/4 p2, -0x2

    .line 49
    const-string v0, "start"

    if-eq p1, p2, :cond_3

    const/4 p2, -0x1

    if-eq p1, p2, :cond_2

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_0

    .line 50
    const-string p1, "CCL"

    const-string p2, "verticalAnchorIndexToAnchorName: Unknown vertical index"

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "right"

    goto :goto_0

    :cond_1
    const-string v0, "left"

    goto :goto_0

    :cond_2
    const-string v0, "end"

    .line 52
    :cond_3
    :goto_0
    iput-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 4

    sparse-switch p1, :sswitch_data_0

    .line 13
    sget-object p1, Lwe/l;->C:Lwe/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    sget-object p1, Lwe/k;->b:Laj/c;

    .line 15
    const-string p2, "canonicalizer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 18
    sget-object p1, Lwe/c0;->a:Lwe/u;

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 21
    new-instance p1, La0/g;

    const/4 p2, 0x0

    .line 22
    invoke-direct {p1, p2}, La0/f1;-><init>(I)V

    .line 23
    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 26
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Lkk/c;

    invoke-direct {p1}, Lkk/c;-><init>()V

    .line 29
    new-instance p2, Ll83/k;

    sget-object v0, Lkk/d;->w:Lkk/d;

    invoke-direct {p2, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    new-instance p1, Lkk/c;

    invoke-direct {p1}, Lkk/c;-><init>()V

    .line 31
    new-instance v0, Ll83/k;

    sget-object v1, Lkk/d;->x:Lkk/d;

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    new-instance p1, Lkk/c;

    invoke-direct {p1}, Lkk/c;-><init>()V

    .line 33
    new-instance v1, Ll83/k;

    sget-object v2, Lkk/d;->y:Lkk/d;

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    new-instance p1, Lkk/c;

    invoke-direct {p1}, Lkk/c;-><init>()V

    .line 35
    new-instance v2, Ll83/k;

    sget-object v3, Lkk/d;->z:Lkk/d;

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    filled-new-array {p2, v0, v1, v2}, [Ll83/k;

    move-result-object p1

    .line 37
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    return-void

    .line 38
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 40
    new-instance p1, Laj/d;

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Laj/d;-><init>(IZ)V

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    .line 41
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p2, p2, [Ljava/lang/ref/Reference;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 43
    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 44
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    .line 45
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance p1, Ljava/util/ArrayList;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 47
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_5
        0x4 -> :sswitch_4
        0x5 -> :sswitch_3
        0x19 -> :sswitch_2
        0x1a -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Lgj/d;)V
    .locals 1

    const-string v0, "amplitude"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 11
    new-instance p1, La3/l0;

    const/16 v0, 0x8

    invoke-direct {p1, p0, v0}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;I)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Lio/sentry/vendor/gson/stream/c;

    invoke-direct {v0, p1}, Lio/sentry/vendor/gson/stream/c;-><init>(Ljava/io/Writer;)V

    iput-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 5
    new-instance p1, Laj/d;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lbd3/v;

    const/4 v1, 0x4

    invoke-direct {v0, p2, v1}, Lbd3/v;-><init>(II)V

    iput-object v0, p1, Laj/d;->w:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    iput-object p2, p0, Lwe/o;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 2
    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    iput-object p2, p0, Lwe/o;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    .line 58
    new-instance p1, Lkb3/k;

    const-string v0, "Java nullability annotation states"

    invoke-direct {p1, v0}, Lkb3/k;-><init>(Ljava/lang/String;)V

    .line 59
    new-instance v0, Ldc3/s;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr93/b0;Lzt/q;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    iput-object p2, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public static J(Lwe/o;Le4/h;FI)V
    .locals 4

    and-int/lit8 p3, p3, 0x2

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    int-to-float p2, v0

    :cond_0
    int-to-float p3, v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, p1, Le4/h;->b:I

    const/4 v2, -0x2

    const-string v3, "start"

    if-eq v1, v2, :cond_3

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const-string v1, "CCL"

    const-string v2, "verticalAnchorIndexToAnchorName: Unknown vertical index"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    const-string v3, "right"

    goto :goto_0

    :cond_2
    const-string v3, "end"

    :cond_3
    :goto_0
    new-instance v1, Li4/a;

    new-array v0, v0, [C

    invoke-direct {v1, v0}, Li4/b;-><init>([C)V

    iget-object p1, p1, Le4/h;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    invoke-static {v3}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object p1

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    new-instance p1, Li4/e;

    invoke-direct {p1, p2}, Li4/e;-><init>(F)V

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    new-instance p1, Li4/e;

    invoke-direct {p1, p3}, Li4/e;-><init>(F)V

    invoke-virtual {v1, p1}, Li4/b;->j(Li4/c;)V

    iget-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast p1, Li4/g;

    iget-object p0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p1, p0, v1}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    return-void
.end method

.method public static varargs L([Ljava/lang/String;)Lwe/o;
    .locals 12

    :try_start_0
    array-length v0, p0

    new-array v0, v0, [Lne3/l;

    new-instance v1, Lne3/h;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p0

    if-ge v3, v4, :cond_7

    aget-object v4, p0, v3

    sget-object v5, Lcj/c;->E:[Ljava/lang/String;

    const/16 v6, 0x22

    invoke-virtual {v1, v6}, Lne3/h;->m1(I)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    move v8, v2

    move v9, v8

    :goto_1
    if-ge v8, v7, :cond_5

    invoke-virtual {v4, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v11, 0x80

    if-ge v10, v11, :cond_0

    aget-object v10, v5, v10

    if-nez v10, :cond_2

    goto :goto_3

    :cond_0
    const/16 v11, 0x2028

    if-ne v10, v11, :cond_1

    const-string v10, "\\u2028"

    goto :goto_2

    :cond_1
    const/16 v11, 0x2029

    if-ne v10, v11, :cond_4

    const-string v10, "\\u2029"

    :cond_2
    :goto_2
    if-ge v9, v8, :cond_3

    invoke-virtual {v1, v9, v8, v4}, Lne3/h;->t1(IILjava/lang/String;)V

    :cond_3
    invoke-virtual {v1, v10}, Lne3/h;->u1(Ljava/lang/String;)V

    add-int/lit8 v9, v8, 0x1

    :cond_4
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    if-ge v9, v7, :cond_6

    invoke-virtual {v1, v9, v7, v4}, Lne3/h;->t1(IILjava/lang/String;)V

    :cond_6
    invoke-virtual {v1, v6}, Lne3/h;->m1(I)V

    invoke-virtual {v1}, Lne3/h;->readByte()B

    iget-wide v4, v1, Lne3/h;->x:J

    invoke-virtual {v1, v4, v5}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v4

    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    new-instance v1, Lwe/o;

    invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    invoke-static {v0}, Lne3/b;->f([Lne3/l;)Lne3/c0;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lwe/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static j()Lcom/google/crypto/tink/internal/f;
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/internal/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/google/crypto/tink/internal/f;->a:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lcom/google/crypto/tink/internal/f;->b:Ljava/util/HashMap;

    return-object v0
.end method

.method public static l(Ljava/util/List;)Llb3/k0;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Llb3/k0;->y:Llb3/k0;

    return-object p0

    :cond_0
    new-instance v0, Llb3/k0;

    invoke-direct {v0, p0}, Llb3/k0;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public A(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->A(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->k(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public B(Lab3/g;Llb3/y;Lqa3/e;)Z
    .locals 4

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lr93/b0;

    iget-object v1, p3, Lqa3/e;->y:Lqa3/d;

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lhb3/b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    const/16 v2, 0xa

    if-eq v1, v2, :cond_6

    const/16 v2, 0xd

    if-eq v1, v2, :cond_1

    invoke-virtual {p1, v0}, Lab3/g;->a(Lr93/b0;)Llb3/y;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    instance-of v1, p1, Lab3/b;

    if-eqz v1, :cond_5

    move-object v1, p1

    check-cast v1, Lab3/b;

    invoke-virtual {v1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, p3, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v2, v3, :cond_5

    invoke-interface {v0}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lo93/h;->g(Llb3/y;)Llb3/y;

    move-result-object p1

    if-nez p1, :cond_2

    goto/16 :goto_2

    :cond_2
    invoke-virtual {v1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object p2

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    move-object v0, p2

    check-cast v0, Li93/i;

    iget-boolean v0, v0, Li93/i;->y:Z

    if-eqz v0, :cond_9

    move-object v0, p2

    check-cast v0, Lm83/e0;

    invoke-virtual {v0}, Lm83/e0;->nextInt()I

    move-result v0

    invoke-virtual {v1}, Lab3/g;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lab3/g;

    iget-object v3, p3, Lqa3/e;->K:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa3/e;

    const-string v3, "getArrayElement(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2, p1, v0}, Lwe/o;->B(Lab3/g;Llb3/y;Lqa3/e;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Deserialized ArrayValue should have the same number of elements as the original array value: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    invoke-virtual {p2}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    instance-of p2, p1, Lr93/e;

    if-eqz p2, :cond_7

    check-cast p1, Lr93/e;

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_9

    sget-object p2, Lo93/h;->e:Lva3/h;

    sget-object p2, Lo93/m;->Q:Lva3/f;

    invoke-static {p1, p2}, Lo93/h;->b(Lr93/e;Lva3/f;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    const/4 p1, 0x0

    return p1

    :cond_9
    :goto_3
    const/4 p1, 0x1

    return p1
.end method

.method public C()Lwe/o;
    .locals 4

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    const/4 v1, 0x5

    const/16 v2, 0x7d

    const/4 v3, 0x3

    invoke-virtual {v0, v3, v1, v2}, Lio/sentry/vendor/gson/stream/c;->h(IIC)V

    return-object p0
.end method

.method public D(Lio/sentry/e;Lio/sentry/g0;)Lio/sentry/e;
    .locals 4

    const-string v0, "breadcrumb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/b6;

    if-eqz v0, :cond_0

    check-cast v0, Lwe/o;

    invoke-virtual {v0, p1, p2}, Lwe/o;->D(Lio/sentry/e;Lio/sentry/g0;)Lio/sentry/e;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/d;

    iget-object v1, p1, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v2, "http"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, p1, Lio/sentry/e;->G:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "sentry:replayNetworkDetails"

    invoke-virtual {p2, v1}, Lio/sentry/g0;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    instance-of v1, p2, Lio/sentry/util/network/e;

    if-eqz v1, :cond_2

    move-object v3, p2

    check-cast v3, Lio/sentry/util/network/e;

    :cond_2
    :goto_0
    if-eqz v3, :cond_3

    iget-object p2, v0, Lio/sentry/android/replay/d;->b:Ljava/util/Map;

    const-string v0, "access$getHttpNetworkDetails$p(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object p1
.end method

.method public E()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v3, "malformed_events"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const-string v3, "error_logs"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-static {v1}, Le93/b;->f0(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_4

    invoke-interface {v2}, Ljava/util/List;->clear()V

    :cond_4
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-object v1

    :cond_5
    const/4 v0, 0x0

    return-object v0
.end method

.method public F(Ljava/lang/Enum;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to convert proto enum: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public G()Lgj/d;
    .locals 1

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "amplitude"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public H()[B
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, [B

    if-nez v0, :cond_0

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    iput-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, [B

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public I(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ls;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Ls;-><init>(Ljava/lang/Object;I)V

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    monitor-enter v0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, Ls;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public K(Ljava/lang/String;)Lwe/o;
    .locals 2

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-eqz p1, :cond_2

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->G:Ljava/lang/String;

    if-nez v1, :cond_1

    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    if-eqz v1, :cond_0

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->G:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "JsonWriter is closed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public M(Ljava/lang/String;)V
    .locals 5

    const-string v0, "encoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La1/e;

    sget-object v1, Ltg/g;->h:Ltg/g;

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, La1/e;-><init>(Ltg/g;I)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    sget-object p1, Ltg/b;->f:Ltg/b;

    iput-object p1, p0, Lwe/o;->w:Ljava/lang/Object;

    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void

    :cond_0
    const-string v1, ":"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v1, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    const/4 v3, 0x0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltg/b;

    iput-object v3, p0, Lwe/o;->w:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_2

    if-ne v3, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, La1/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltg/b;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid user info string "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, Ltg/b;->f:Ltg/b;

    :goto_0
    iput-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    return-void
.end method

.method public N(Ljk/a;)V
    .locals 1

    const-string v0, "incomingEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    sget-object v0, Lkk/d;->w:Lkk/d;

    invoke-virtual {p0, v0, p1}, Lwe/o;->h(Lkk/d;Ljk/a;)Ljk/a;

    move-result-object p1

    sget-object v0, Lkk/d;->x:Lkk/d;

    invoke-virtual {p0, v0, p1}, Lwe/o;->h(Lkk/d;Ljk/a;)Ljk/a;

    move-result-object p1

    sget-object v0, Lkk/d;->y:Lkk/d;

    invoke-virtual {p0, v0, p1}, Lwe/o;->h(Lkk/d;Ljk/a;)Ljk/a;

    return-void
.end method

.method public O()V
    .locals 4

    new-instance v0, Lzt/q;

    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lij/m;

    invoke-direct {v0, v1}, Lzt/q;-><init>(Lij/m;)V

    const-string v1, "simulationActions"

    iput-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    new-instance v1, La3/m1;

    const/16 v2, 0x15

    invoke-direct {v1, p0, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lij/p;

    const-string v3, "updateSimulationContext"

    invoke-direct {v2, v3, v1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lzt/q;->A(Lij/p;)V

    return-void
.end method

.method public P(Ljava/lang/String;)V
    .locals 5

    const-string v0, "Removed the wrong lock, expected to remove: "

    const-string v1, "Cannot release a lock that is not held, safeKey: "

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Argument must not be null"

    invoke-static {v2, v3}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lbl/b;

    iget v3, v2, Lbl/b;->b:I

    const/4 v4, 0x1

    if-lt v3, v4, :cond_3

    sub-int/2addr v3, v4

    iput v3, v2, Lbl/b;->b:I

    if-nez v3, :cond_2

    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbl/b;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Laj/d;

    iget-object v0, p1, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p1, Laj/d;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    move-result v3

    const/16 v4, 0xa

    if-ge v3, v4, :cond_0

    iget-object p1, p1, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayDeque;

    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but actually removed: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", safeKey: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p1, v2, Lbl/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", interestedThreads: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, v2, Lbl/b;->b:I

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public Q(Lqc/j;)Ljc/l;
    .locals 2

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Laj/c;

    invoke-virtual {v1, p1}, Laj/c;->Q(Lqc/j;)Ljc/l;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public R(Llb3/y;Lqa3/e;Lsa3/f;)Lab3/g;
    .locals 3

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsa3/d;->P:Lsa3/b;

    iget v1, p2, Lqa3/e;->M:I

    invoke-virtual {v0, v1}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p2, Lqa3/e;->y:Lqa3/d;

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lhb3/b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance p3, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported annotation argument type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p2, Lqa3/e;->y:Lqa3/d;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " (expected "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    :pswitch_0
    iget-object p2, p2, Lqa3/e;->K:Ljava/util/List;

    const-string v0, "getArrayElementList(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/e;

    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Lr93/b0;

    invoke-interface {v2}, Lr93/b0;->c()Lo93/h;

    move-result-object v2

    invoke-virtual {v2}, Lo93/h;->e()Llb3/c0;

    move-result-object v2

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, v2, v1, p3}, Lwe/o;->R(Llb3/y;Lqa3/e;Lsa3/f;)Lab3/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0, p1}, Lab3/h;->b(Ljava/util/ArrayList;Llb3/y;)Lab3/y;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance p1, Lab3/a;

    iget-object p2, p2, Lqa3/e;->J:Lqa3/h;

    const-string v0, "getAnnotation(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, Lwe/o;->m(Lqa3/h;Lsa3/f;)Ls93/c;

    move-result-object p2

    invoke-direct {p1, p2}, Lab3/a;-><init>(Ls93/b;)V

    return-object p1

    :pswitch_2
    new-instance p1, Lab3/i;

    iget v0, p2, Lqa3/e;->H:I

    invoke-static {p3, v0}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v0

    iget p2, p2, Lqa3/e;->I:I

    invoke-static {p3, p2}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Lab3/i;-><init>(Lva3/c;Lva3/h;)V

    return-object p1

    :pswitch_3
    new-instance p1, Lab3/t;

    iget v0, p2, Lqa3/e;->H:I

    invoke-static {p3, v0}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object p3

    iget p2, p2, Lqa3/e;->L:I

    invoke-direct {p1, p3, p2}, Lab3/t;-><init>(Lva3/c;I)V

    return-object p1

    :pswitch_4
    new-instance p1, Lab3/x;

    iget p2, p2, Lqa3/e;->G:I

    invoke-interface {p3, p2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lab3/x;-><init>(Ljava/lang/String;)V

    return-object p1

    :pswitch_5
    new-instance p1, Lab3/c;

    iget-wide p2, p2, Lqa3/e;->z:J

    const-wide/16 v0, 0x0

    cmp-long p2, p2, v0

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    invoke-direct {p1, p2}, Lab3/c;-><init>(Z)V

    return-object p1

    :pswitch_6
    new-instance p1, Lab3/c;

    iget-wide p2, p2, Lqa3/e;->F:D

    invoke-direct {p1, p2, p3}, Lab3/c;-><init>(D)V

    return-object p1

    :pswitch_7
    new-instance p1, Lab3/c;

    iget p2, p2, Lqa3/e;->E:F

    invoke-direct {p1, p2}, Lab3/c;-><init>(F)V

    return-object p1

    :pswitch_8
    iget-wide p1, p2, Lqa3/e;->z:J

    if-eqz v0, :cond_3

    new-instance p3, Lab3/z;

    invoke-direct {p3, p1, p2}, Lab3/z;-><init>(J)V

    return-object p3

    :cond_3
    new-instance p3, Lab3/u;

    invoke-direct {p3, p1, p2}, Lab3/u;-><init>(J)V

    return-object p3

    :pswitch_9
    iget-wide p1, p2, Lqa3/e;->z:J

    long-to-int p1, p1

    if-eqz v0, :cond_4

    new-instance p2, Lab3/z;

    invoke-direct {p2, p1}, Lab3/z;-><init>(I)V

    return-object p2

    :cond_4
    new-instance p2, Lab3/k;

    invoke-direct {p2, p1}, Lab3/k;-><init>(I)V

    return-object p2

    :pswitch_a
    iget-wide p1, p2, Lqa3/e;->z:J

    long-to-int p1, p1

    int-to-short p1, p1

    if-eqz v0, :cond_5

    new-instance p2, Lab3/z;

    invoke-direct {p2, p1}, Lab3/z;-><init>(S)V

    return-object p2

    :cond_5
    new-instance p2, Lab3/w;

    invoke-direct {p2, p1}, Lab3/w;-><init>(S)V

    return-object p2

    :pswitch_b
    new-instance p1, Lab3/e;

    iget-wide p2, p2, Lqa3/e;->z:J

    long-to-int p2, p2

    int-to-char p2, p2

    invoke-direct {p1, p2}, Lab3/e;-><init>(C)V

    return-object p1

    :pswitch_c
    iget-wide p1, p2, Lqa3/e;->z:J

    long-to-int p1, p1

    int-to-byte p1, p1

    if-eqz v0, :cond_6

    new-instance p2, Lab3/z;

    invoke-direct {p2, p1}, Lab3/z;-><init>(B)V

    return-object p2

    :cond_6
    new-instance p2, Lab3/d;

    invoke-direct {p2, p1}, Lab3/d;-><init>(B)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public S(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->z:Ljava/lang/String;

    const-string p1, ": "

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->E:Ljava/lang/String;

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->z:Ljava/lang/String;

    const-string p1, ":"

    iput-object p1, v0, Lio/sentry/vendor/gson/stream/c;->E:Ljava/lang/String;

    return-void
.end method

.method public T(Lvf/h;Lwe/g;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lwe/n;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lwe/n;

    iget v1, v0, Lwe/n;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe/n;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe/n;

    invoke-direct {v0, p0, p3}, Lwe/n;-><init>(Lwe/o;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lwe/n;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe/n;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwe/n;->x:Log/g;

    iget-object p2, v0, Lwe/n;->w:Lwe/g;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p3

    const-class v2, Lwe/o;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {p3, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p3

    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Lwe/l;

    iput-object p2, v0, Lwe/n;->w:Lwe/g;

    iput-object p3, v0, Lwe/n;->x:Log/g;

    iput v3, v0, Lwe/n;->E:I

    check-cast v2, Laj/c;

    invoke-virtual {v2, p1, p2, v0}, Laj/c;->v(Lvf/a;Lwe/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, p3

    move-object p3, p1

    move-object p1, v5

    :goto_1
    check-cast p3, Lwe/j;

    invoke-virtual {p2}, Lwe/g;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lvv1/c;

    const/16 v1, 0xc

    invoke-direct {v0, p3, v1}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Log/g;->p(Log/g;Lc93/a;)V

    :cond_4
    invoke-virtual {p2}, Lwe/g;->b()Lwe/e;

    move-result-object v0

    invoke-static {v0}, Lwe/p;->a(Lwe/e;)Lb3/b;

    move-result-object v0

    invoke-virtual {p3}, Lwe/j;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lb3/b;->J(Ljava/lang/String;Lwe/g;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lar0/a;

    const/16 v4, 0x10

    invoke-direct {v2, v1, v4}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-static {p1, v2}, Log/g;->p(Log/g;Lc93/a;)V

    invoke-interface {v0, p2}, Lwe/j0;->a(Lwe/g;)[B

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lwe/j0;->d(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lar0/a;

    const/16 v2, 0x11

    invoke-direct {v1, v0, v2}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-static {p1, v1}, Log/g;->m(Log/g;Lc93/a;)V

    iget-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Lwe/u;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "signatureHex"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lwe/g;->h()Lwe/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_6

    if-ne p1, v3, :cond_5

    invoke-virtual {p3}, Lwe/j;->a()Lvf/b;

    move-result-object p1

    invoke-virtual {p1}, Lvf/b;->g()Lcg/j;

    move-result-object p1

    iget-object p1, p1, Lcg/j;->E:Lcg/g;

    iget-object p1, p1, Lcg/g;->y:Lhf/h;

    const-string p2, "X-Amz-Signature"

    invoke-interface {p1, p2, v0}, Lgf/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Support for "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lwe/g;->h()Lwe/c;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not yet implemented"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/j;

    const-string p3, "An operation is not implemented: "

    invoke-static {p3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ll83/j;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Credential="

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ls3/d;->e(Lwe/g;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SignedHeaders="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lwe/j;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Signature="

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lwe/j;->a()Lvf/b;

    move-result-object v3

    invoke-virtual {v3}, Lvf/b;->d()Lmf/c;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lwe/g;->b()Lwe/e;

    move-result-object p2

    iget-object p2, p2, Lwe/e;->w:Ljava/lang/String;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v1, p1, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Authorization"

    invoke-virtual {v3, p1, p2}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p3}, Lwe/j;->a()Lvf/b;

    move-result-object p1

    invoke-virtual {p1}, Lvf/b;->b()Lvf/h;

    move-result-object p1

    new-instance p2, Lwe/h;

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lwe/h;-><init>(Ljava/lang/Object;[B)V

    return-object p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public U(Ljava/lang/Object;)Ljava/lang/Enum;
    .locals 2

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Enum;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Unable to convert object enum: "

    invoke-static {p1, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public V(Lqc/j;)Ljc/l;
    .locals 2

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Laj/c;

    invoke-virtual {v1, p1}, Laj/c;->X(Lqc/j;)Ljc/l;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public W(D)Lwe/o;
    .locals 3

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    iget-boolean v1, v0, Lio/sentry/vendor/gson/stream/c;->F:Z

    if-nez v1, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public X(J)Lwe/o;
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;
    .locals 1

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    invoke-virtual {v0, p0, p1, p2}, Laj/d;->x(Lwe/o;Lio/sentry/v0;Ljava/lang/Object;)V

    return-object p0
.end method

.method public Z(Ljava/lang/Boolean;)Lwe/o;
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->k()V

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "true"

    goto :goto_0

    :cond_1
    const-string p1, "false"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Ljava/lang/CharSequence;IILh6/x;)Z
    .locals 3

    iget v0, p4, Lh6/x;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    if-lez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lh6/z;

    if-nez v0, :cond_2

    new-instance v0, Lh6/z;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, Lh6/z;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    :cond_2
    iget-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Lio/sentry/hints/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lh6/y;

    invoke-direct {p1, p4}, Lh6/y;-><init>(Lh6/x;)V

    iget-object p4, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast p4, Lh6/z;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, Lh6/z;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method

.method public a0(Ljava/lang/Number;)Lwe/o;
    .locals 3

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->k()V

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Lio/sentry/vendor/gson/stream/c;->F:Z

    if-nez v2, :cond_2

    const-string v2, "-Infinity"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "Infinity"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "NaN"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Numeric values must be finite, but was "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget-object p1, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    invoke-virtual {p1, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    return-object p0
.end method

.method public b(Ln73/b;)V
    .locals 2

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ln73/b;->dispose()V

    return-void
.end method

.method public b0(Ljava/lang/String;)Lwe/o;
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->k()V

    return-object p0

    :cond_0
    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    invoke-virtual {v0, p1}, Lio/sentry/vendor/gson/stream/c;->s(Ljava/lang/String;)V

    return-object p0
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lwk/h;)Z
    .locals 3

    check-cast p1, Lzk/z;

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Lgl/b;

    new-instance v1, Lgl/c;

    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Lal/b;

    invoke-direct {v1, v2, p1}, Lgl/c;-><init>(Lal/b;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1, p2, p3}, Lgl/b;->c(Ljava/lang/Object;Ljava/io/File;Lwk/h;)Z

    move-result p1

    return p1
.end method

.method public c0(Z)Lwe/o;
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    if-eqz p1, :cond_0

    const-string p1, "true"

    goto :goto_0

    :cond_0
    const-string p1, "false"

    :goto_0
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    return-object p0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lh6/z;

    return-object v0
.end method

.method public e(Lwk/h;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public f(Lkk/e;)V
    .locals 2

    invoke-virtual {p0}, Lwe/o;->G()Lgj/d;

    move-result-object v0

    invoke-interface {p1, v0}, Lkk/e;->b(Lgj/d;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    invoke-interface {p1}, Lkk/e;->getType()Lkk/d;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkk/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lkk/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    const-string v0, "log"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p1

    const/16 v1, 0xa

    if-le p1, v1, :cond_0

    move-object p1, v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Lkk/d;Ljk/a;)Ljk/a;
    .locals 5

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkk/c;

    if-eqz p2, :cond_7

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    iget-object p1, p1, Lkk/c;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkk/e;

    if-eqz p2, :cond_0

    instance-of v2, v1, Lmk/a;

    if-eqz v2, :cond_3

    :try_start_0
    check-cast v1, Lmk/a;

    iget-object v2, v1, Lmk/a;->w:Lwe/o;

    iget-boolean v3, v1, Lmk/a;->y:Z

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lkk/d;->w:Lkk/d;

    invoke-virtual {v2, v3, p2}, Lwe/o;->h(Lkk/d;Ljk/a;)Ljk/a;

    move-result-object v3

    sget-object v4, Lkk/d;->x:Lkk/d;

    invoke-virtual {v2, v4, v3}, Lwe/o;->h(Lkk/d;Ljk/a;)Ljk/a;

    move-result-object v2

    if-eqz v2, :cond_0

    instance-of v3, v2, Ljk/b;

    if-eqz v3, :cond_2

    check-cast v2, Ljk/b;

    invoke-virtual {v1, v2}, Lmk/a;->c(Ljk/a;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, Lmk/a;->c(Ljk/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_3
    instance-of v2, v1, Lmk/a;

    if-eqz v2, :cond_4

    move-object p2, v0

    goto :goto_0

    :cond_4
    invoke-interface {v1, p2}, Lkk/e;->a(Ljk/a;)Ljk/a;

    move-result-object p2

    goto :goto_0

    :cond_5
    return-object p2

    :cond_6
    return-object v0

    :cond_7
    return-object p2
.end method

.method public i()Lwe/o;
    .locals 4

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    iget-object v2, v0, Lio/sentry/vendor/gson/stream/c;->x:[I

    array-length v3, v2

    if-ne v1, v3, :cond_0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/c;->x:[I

    :cond_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->x:[I

    iget v2, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    const/4 v3, 0x3

    aput v3, v1, v2

    iget-object v0, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/io/Writer;->write(I)V

    return-object p0
.end method

.method public k(Lqc/j;)Z
    .locals 2

    iget-object v0, p0, Lwe/o;->x:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Laj/c;

    iget-object v1, v1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public m(Lqa3/h;Lsa3/f;)Ls93/c;
    .locals 10

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Lqa3/h;->y:I

    invoke-static {p2, v0}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object v0

    iget-object v1, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v1, Lr93/b0;

    iget-object v2, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v2, Lzt/q;

    invoke-static {v1, v0, v2}, Lhg3/i;->O(Lr93/b0;Lva3/c;Lzt/q;)Lr93/e;

    move-result-object v0

    iget-object v1, p1, Lqa3/h;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {v0}, Lnb3/l;->f(Lr93/k;)Z

    move-result v1

    if-nez v1, :cond_7

    sget v1, Lya3/f;->a:I

    sget-object v1, Lr93/f;->E:Lr93/f;

    invoke-static {v0, v1}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Lr93/e;->getConstructors()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "getConstructors(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->q1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu93/j;

    if-eqz v1, :cond_7

    check-cast v1, Lu93/x;

    invoke-virtual {v1}, Lu93/x;->v()Ljava/util/List;

    move-result-object v1

    const-string v2, "getValueParameters(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lr93/a1;

    check-cast v4, Lu93/n;

    invoke-virtual {v4}, Lu93/n;->getName()Lva3/h;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lqa3/h;->z:Ljava/util/List;

    const-string v1, "getArgumentList(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/f;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v4, v2, Lqa3/f;->y:I

    invoke-static {p2, v4}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/a1;

    const/4 v5, 0x0

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    new-instance v6, Ll83/k;

    iget v7, v2, Lqa3/f;->y:I

    invoke-static {p2, v7}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v7

    check-cast v4, Lu93/x0;

    invoke-virtual {v4}, Lu93/x0;->getType()Llb3/y;

    move-result-object v4

    const-string v8, "getType(...)"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lqa3/f;->z:Lqa3/e;

    const-string v8, "getValue(...)"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4, v2, p2}, Lwe/o;->R(Llb3/y;Lqa3/e;Lsa3/f;)Lab3/g;

    move-result-object v8

    invoke-virtual {p0, v8, v4, v2}, Lwe/o;->B(Lab3/g;Llb3/y;Lqa3/e;)Z

    move-result v9

    if-eqz v9, :cond_4

    move-object v5, v8

    :cond_4
    if-nez v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "Unexpected argument value: actual type "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Lqa3/e;->y:Lqa3/d;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " != expected type "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lup/d;->s(Ljava/lang/String;)Lab3/j;

    move-result-object v5

    :cond_5
    invoke-direct {v6, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v5, v6

    :goto_2
    if-eqz v5, :cond_2

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    goto :goto_3

    :cond_7
    sget-object p1, Lm83/z;->w:Lm83/z;

    :goto_3
    new-instance p2, Ls93/c;

    invoke-interface {v0}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    sget-object v1, Lr93/s0;->q:Lr93/v0;

    invoke-direct {p2, v0, p1, v1}, Ls93/c;-><init>(Llb3/c0;Ljava/util/Map;Lr93/s0;)V

    return-object p2
.end method

.method public n(Landroidx/fragment/app/m0;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v0, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "parent.getParentFragmentManager()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lwe/o;->n(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/a1;->b:Z

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public o(Landroidx/fragment/app/m0;Z)V
    .locals 5

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->x:Landroidx/fragment/app/x0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/r0;

    iget-object v2, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v2

    const-string v3, "parent.getParentFragmentManager()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v3, 0x1

    invoke-virtual {v2, p1, v3}, Lwe/o;->o(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v2, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v4, v3, Landroidx/fragment/app/a1;->b:Z

    if-eqz v4, :cond_1

    :cond_2
    iget-object v3, v3, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v3, v0, p1, v1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->a(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroidx/fragment/app/r0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public onComplete()V
    .locals 2

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    const/4 v1, 0x0

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, v1}, Ldc3/t;->r(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, p1}, Ldc3/t;->r(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onNext(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    invoke-static {v0, p1}, Lvd/f;->X(Ldc3/x;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public p(Landroidx/fragment/app/m0;Landroid/os/Bundle;Z)V
    .locals 3

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, Lwe/o;->p(Landroidx/fragment/app/m0;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object p2, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/a1;

    if-eqz p3, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/a1;->b:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v1, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->b(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public q(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->q(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->c(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public r(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->r(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->d(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public s(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->s(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->e(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public t(Landroidx/fragment/app/m0;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->x:Landroidx/fragment/app/x0;

    iget-object v1, v1, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/r0;

    iget-object v0, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "parent.getParentFragmentManager()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lwe/o;->t(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/a1;->b:Z

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public u(Landroidx/fragment/app/m0;Z)V
    .locals 2

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v0, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    const-string v1, "parent.getParentFragmentManager()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lwe/o;->u(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object p1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/a1;->b:Z

    if-eqz v1, :cond_1

    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    goto :goto_0

    :cond_3
    return-void
.end method

.method public v(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->v(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->f(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public w(Landroidx/fragment/app/m0;Landroid/os/Bundle;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, Lwe/o;->w(Landroidx/fragment/app/m0;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p3, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1, p2}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public x(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->x(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->h(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public y(Landroidx/fragment/app/m0;Z)V
    .locals 4

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lwe/o;->y(Landroidx/fragment/app/m0;Z)V

    :cond_0
    iget-object v1, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/a1;

    if-eqz p2, :cond_2

    iget-boolean v3, v2, Landroidx/fragment/app/a1;->b:Z

    if-eqz v3, :cond_1

    :cond_2
    iget-object v2, v2, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v2, v0, p1}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->i(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public z(Landroidx/fragment/app/m0;Landroid/view/View;Landroid/os/Bundle;Z)V
    .locals 3

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "v"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    iget-object v1, v0, Landroidx/fragment/app/o1;->z:Landroidx/fragment/app/m0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v1

    const-string v2, "parent.getParentFragmentManager()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v1, Landroidx/fragment/app/o1;->p:Lwe/o;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, p3, v2}, Lwe/o;->z(Landroidx/fragment/app/m0;Landroid/view/View;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object p3, p0, Lwe/o;->x:Ljava/lang/Object;

    check-cast p3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/a1;

    if-eqz p4, :cond_2

    iget-boolean v2, v1, Landroidx/fragment/app/a1;->b:Z

    if-eqz v2, :cond_1

    :cond_2
    iget-object v1, v1, Landroidx/fragment/app/a1;->a:Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v1, v0, p1, p2}, Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;->j(Landroidx/fragment/app/o1;Landroidx/fragment/app/m0;Landroid/view/View;)V

    goto :goto_0

    :cond_3
    return-void
.end method
