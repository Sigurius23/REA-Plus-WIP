.class public Laj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd3/h;
.implements Lxg3/i;
.implements Lcq/f;
.implements Lcq/e;
.implements Lcq/c;
.implements Ld0/j2;
.implements Lhb3/e;
.implements Lo63/n;
.implements Lll/a;
.implements Lxf/f;
.implements Lpg3/h;
.implements Lwe/l;
.implements Lul/a;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FFLd0/r;)V
    .locals 2

    const/16 v0, 0x8

    iput v0, p0, Laj/c;->w:I

    .line 45
    sget-object v0, Ld0/h2;->a:[I

    if-eqz p3, :cond_0

    .line 46
    new-instance v0, Lro/i;

    invoke-direct {v0, p1, p2, p3}, Lro/i;-><init>(FFLd0/r;)V

    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Lbu/c;

    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance p3, Ld0/g0;

    const v1, 0x3c23d70a    # 0.01f

    .line 50
    invoke-direct {p3, p1, p2, v1}, Ld0/g0;-><init>(FFF)V

    .line 51
    iput-object p3, v0, Lbu/c;->w:Ljava/lang/Object;

    .line 52
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance p1, Lzt/q;

    invoke-direct {p1, v0}, Lzt/q;-><init>(Ld0/s;)V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Laj/c;->w:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-array p1, p1, [I

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    iput p1, p0, Laj/c;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance p1, La3/k2;

    sget-object p2, La3/g;->b:La3/y1;

    .line 22
    invoke-direct {p1, p2}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 23
    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_0
    sget-object p1, Lwe/q;->w:Lwe/q;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 26
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    sget-object p1, Ltl/l;->a:[C

    .line 28
    new-instance p1, Ljava/util/ArrayDeque;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 29
    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 30
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 32
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance p1, Lio/sentry/transport/r;

    invoke-direct {p1}, Lio/sentry/transport/r;-><init>()V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 34
    :sswitch_4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    const-string p2, "getMainLooper(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 37
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    .line 39
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_6
        0x9 -> :sswitch_5
        0x10 -> :sswitch_4
        0x11 -> :sswitch_3
        0x12 -> :sswitch_2
        0x13 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, Laj/c;->w:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x19

    iput v0, p0, Laj/c;->w:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FirebaseHeartBeat"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 42
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lij/m;Lcom/amplitude/android/engagement/a;)V
    .locals 2

    const/16 v0, 0xe

    iput v0, p0, Laj/c;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    .line 4
    new-instance p2, Lzt/q;

    .line 5
    invoke-direct {p2, p1}, Lzt/q;-><init>(Lij/m;)V

    .line 6
    const-string p1, "localStorage"

    iput-object p1, p2, Lzt/q;->x:Ljava/lang/Object;

    .line 7
    new-instance p1, Lij/o;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lij/o;-><init>(Laj/c;I)V

    .line 8
    new-instance v0, Lij/p;

    const-string v1, "getItem"

    invoke-direct {v0, v1, p1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lzt/q;->A(Lij/p;)V

    .line 9
    new-instance p1, Lij/o;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lij/o;-><init>(Laj/c;I)V

    .line 10
    new-instance v0, Lij/p;

    const-string v1, "setItem"

    invoke-direct {v0, v1, p1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lzt/q;->A(Lij/p;)V

    .line 11
    new-instance p1, Lij/o;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lij/o;-><init>(Laj/c;I)V

    .line 12
    new-instance v0, Lij/p;

    const-string v1, "removeItem"

    invoke-direct {v0, v1, p1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lzt/q;->A(Lij/p;)V

    .line 13
    new-instance p1, Lij/o;

    const/4 v0, 0x3

    invoke-direct {p1, p0, v0}, Lij/o;-><init>(Laj/c;I)V

    .line 14
    new-instance v0, Lij/p;

    const-string v1, "key"

    invoke-direct {v0, v1, p1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lzt/q;->A(Lij/p;)V

    .line 15
    new-instance p1, Lij/o;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lij/o;-><init>(Laj/c;I)V

    .line 16
    new-instance v0, Lij/p;

    const-string v1, "clear"

    invoke-direct {v0, v1, p1}, Lij/p;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2, v0}, Lzt/q;->A(Lij/p;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Laj/c;->w:I

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lne/b;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Laj/c;->w:I

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    return-void
.end method

.method public static F(Ljava/lang/String;Laj/b;Z)Ljava/lang/String;
    .locals 3

    iget-object p1, p1, Laj/b;->w:Ljava/lang/String;

    if-eqz p2, :cond_0

    const-string p2, ".temp"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    const-string p2, "\\W+"

    const-string v0, ""

    invoke-virtual {p0, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    rsub-int p2, p2, 0xf2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, p2, :cond_2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "MD5"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_1

    aget-byte v1, p0, v0

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "%02x"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :catch_0
    invoke-virtual {p0, v0, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_2
    :goto_1
    const-string p2, "lottie_cache_"

    invoke-static {p2, p0, p1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static J(Ljava/lang/Throwable;Lio/sentry/protocol/n;Ljava/lang/Long;Ljava/util/List;Z)Lio/sentry/protocol/u;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lio/sentry/protocol/u;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz v0, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz p3, :cond_3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, Lio/sentry/protocol/b0;

    invoke-direct {v3, p3}, Lio/sentry/protocol/b0;-><init>(Ljava/util/List;)V

    if-eqz p4, :cond_2

    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object p3, v3, Lio/sentry/protocol/b0;->y:Ljava/lang/Boolean;

    :cond_2
    iput-object v3, v2, Lio/sentry/protocol/u;->E:Lio/sentry/protocol/b0;

    :cond_3
    iput-object p2, v2, Lio/sentry/protocol/u;->z:Ljava/lang/Long;

    iput-object v1, v2, Lio/sentry/protocol/u;->w:Ljava/lang/String;

    iput-object p1, v2, Lio/sentry/protocol/u;->F:Lio/sentry/protocol/n;

    iput-object v0, v2, Lio/sentry/protocol/u;->y:Ljava/lang/String;

    iput-object p0, v2, Lio/sentry/protocol/u;->x:Ljava/lang/String;

    return-object v2
.end method

.method public static final w(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 1

    if-eqz p4, :cond_4

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lwe/g;->h()Lwe/c;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    if-eqz p4, :cond_2

    const/4 v0, 0x1

    if-ne p4, v0, :cond_1

    invoke-virtual {p1}, Lvf/b;->g()Lcg/j;

    move-result-object p0

    iget-object p0, p0, Lcg/j;->E:Lcg/g;

    if-nez p5, :cond_0

    iget-object p1, p0, Lcg/g;->y:Lhf/h;

    invoke-virtual {p1, p2}, Lhf/h;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :cond_0
    iget-object p1, p0, Lcg/g;->y:Lhf/h;

    invoke-virtual {p1, p2}, Lhf/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ltg/g;->n:Ltg/g;

    invoke-interface {p1, p2}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p2

    invoke-interface {p1, p3}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object p1

    iget-object p0, p0, Lcg/g;->w:Lgf/m;

    invoke-interface {p0, p2, p1}, Lgf/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Support for "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lwe/g;->h()Lwe/c;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not yet implemented"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ll83/j;

    const-string p2, "An operation is not implemented: "

    invoke-static {p2, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ll83/j;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    if-nez p5, :cond_3

    invoke-virtual {p1}, Lvf/b;->d()Lmf/c;

    move-result-object p0

    invoke-virtual {p0, p2}, La2/a;->o(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_4

    :cond_3
    invoke-virtual {p1}, Lvf/b;->d()Lmf/c;

    move-result-object p0

    invoke-virtual {p0, p3, p2}, La2/a;->N(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static synthetic y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 6

    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v5}, Laj/c;->w(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method


# virtual methods
.method public A(Landroidx/room/b2;Ls83/c;)V
    .locals 4

    instance-of v0, p2, Landroidx/room/h0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/room/h0;

    iget v1, v0, Landroidx/room/h0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/room/h0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/room/h0;

    invoke-direct {v0, p0, p2}, Landroidx/room/h0;-><init>(Laj/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Landroidx/room/h0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Landroidx/room/h0;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Lec3/h2;

    iput v2, v0, Landroidx/room/h0;->y:I

    invoke-virtual {p2, p1, v0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-void
.end method

.method public B()Leh/g;
    .locals 3

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Leh/a;

    iget-object v1, v0, Leh/a;->d:Ljava/lang/Object;

    check-cast v1, Leh/e;

    monitor-enter v1

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0, v2}, Leh/a;->a(Z)V

    iget-object v0, v0, Leh/a;->b:Ljava/lang/Object;

    check-cast v0, Leh/b;

    iget-object v0, v0, Leh/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Leh/e;->i(Ljava/lang/String;)Leh/c;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    if-eqz v0, :cond_0

    new-instance v1, Leh/g;

    invoke-direct {v1, v0}, Leh/g;-><init>(Leh/c;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public declared-synchronized C()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    instance-of v4, v4, Ljava/util/Set;

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p0, v5, v6}, Laj/c;->I(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    const-string v1, "fire-count"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_3
    const-string v1, "fire-count"

    int-to-long v2, v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    :goto_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public D(Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/HashSet;Ljava/util/ArrayDeque;Ljava/lang/String;)V
    .locals 12

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    move v1, v0

    move-object/from16 v0, p5

    :goto_0
    if-eqz p1, :cond_6

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    if-nez v0, :cond_0

    const-string v0, "chained"

    :cond_0
    instance-of v2, p1, Lio/sentry/exception/ExceptionMechanismException;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast p1, Lio/sentry/exception/ExceptionMechanismException;

    invoke-virtual {p1}, Lio/sentry/exception/ExceptionMechanismException;->a()Lio/sentry/protocol/n;

    move-result-object v2

    invoke-virtual {p1}, Lio/sentry/exception/ExceptionMechanismException;->c()Ljava/lang/Throwable;

    move-result-object v4

    invoke-virtual {p1}, Lio/sentry/exception/ExceptionMechanismException;->b()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {p1}, Lio/sentry/exception/ExceptionMechanismException;->d()Z

    move-result p1

    move-object v11, v2

    move v2, p1

    move-object p1, v4

    move-object v4, v11

    goto :goto_1

    :cond_1
    new-instance v2, Lio/sentry/protocol/n;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    move-object v4, v2

    move v2, v3

    :goto_1
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v8, v4, Lio/sentry/protocol/n;->z:Ljava/lang/Boolean;

    invoke-virtual {v7, v8}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v7

    iget-object v8, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v8, Laj/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, Laj/d;->n([Ljava/lang/StackTraceElement;Z)Ljava/util/ArrayList;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_2

    :cond_2
    move-object v6, v8

    :goto_2
    invoke-static {p1, v4, v6, v7, v2}, Laj/c;->J(Ljava/lang/Throwable;Lio/sentry/protocol/n;Ljava/lang/Long;Ljava/util/List;Z)Lio/sentry/protocol/u;

    move-result-object v2

    move-object/from16 v6, p4

    invoke-virtual {v6, v2}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    iget-object v2, v4, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    if-nez v2, :cond_3

    iput-object v0, v4, Lio/sentry/protocol/n;->w:Ljava/lang/String;

    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-ltz v0, :cond_4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lio/sentry/protocol/n;->I:Ljava/lang/Integer;

    :cond_4
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Lio/sentry/protocol/n;->H:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    array-length v2, v0

    if-lez v2, :cond_5

    array-length v9, v0

    move v10, v3

    :goto_3
    if-ge v10, v9, :cond_5

    aget-object v3, v0, v10

    const-string v7, "suppressed"

    move-object v2, p0

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v2 .. v7}, Laj/c;->D(Ljava/lang/Throwable;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/HashSet;Ljava/util/ArrayDeque;Ljava/lang/String;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, p4

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    move-object v0, v8

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public E(Ljava/lang/String;Ljava/lang/Iterable;)V
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Li63/x;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-static {v2, v3}, Li63/a;->f(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, v1}, Lal/a;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    return-void
.end method

.method public declared-synchronized G()Ljava/util/ArrayList;
    .locals 6

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

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

    instance-of v3, v3, Ljava/util/Set;

    if-eqz v3, :cond_0

    new-instance v3, Ljava/util/HashSet;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p0, v4, v5}, Laj/c;->I(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2, v4}, Lqt/a;->a(Ljava/lang/String;Ljava/util/ArrayList;)Lqt/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v3, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "fire-global"

    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :goto_1
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public H(Ljava/lang/String;)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Laj/c;->O()Ljava/io/File;

    move-result-object v1

    sget-object v2, Laj/b;->x:Laj/b;

    const/4 v3, 0x0

    invoke-static {p1, v2, v3}, Laj/c;->F(Ljava/lang/String;Laj/b;Z)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Laj/c;->O()Ljava/io/File;

    move-result-object v1

    sget-object v2, Laj/b;->y:Laj/b;

    invoke-static {p1, v2, v3}, Laj/c;->F(Ljava/lang/String;Laj/b;Z)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Laj/c;->O()Ljava/io/File;

    move-result-object v1

    sget-object v2, Laj/b;->z:Laj/b;

    invoke-static {p1, v2, v3}, Laj/c;->F(Ljava/lang/String;Laj/b;Z)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public declared-synchronized I(J)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    move-result-object p1

    sget-object p2, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p1, p2}, Ljava/time/Instant;->atOffset(Ljava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    move-result-object p1

    sget-object p2, Ljava/time/format/DateTimeFormatter;->ISO_LOCAL_DATE:Ljava/time/format/DateTimeFormatter;

    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized K(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Ljava/util/Set;

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public L()V
    .locals 3

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_0
    return-void
.end method

.method public M(Ljava/util/Set;)V
    .locals 7

    const-string v0, "tableIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    :cond_1
    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, [I

    array-length v3, v2

    new-array v4, v3, [I

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    aget v6, v2, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    aget v6, v2, v5

    :goto_1
    aput v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v1, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_2
    return-void
.end method

.method public N(Lp3/x;)Landroid/graphics/Typeface;
    .locals 5

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    instance-of v1, p1, Lp3/x;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget v1, p1, Lp3/x;->a:I

    invoke-static {v0, v1}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p1, p1, Lp3/x;->c:Lp3/q;

    sget-object v3, Lp3/z;->a:Ljava/lang/ThreadLocal;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p1, Lp3/q;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v2, v1

    goto :goto_0

    :cond_1
    sget-object v3, Lp3/z;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Paint;

    if-nez v4, :cond_2

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setFontVariationSettings(Ljava/lang/String;)Z

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-static {p1, v0}, Ld2/b;->u(Lp3/q;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/graphics/Paint;->setFontVariationSettings(Ljava/lang/String;)Z

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    :cond_3
    :goto_0
    return-object v2
.end method

.method public O()Ljava/io/File;
    .locals 3

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljc/p;

    iget-object v0, v0, Ljc/p;->w:Landroid/content/Context;

    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const-string v2, "lottie_network_cache"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    return-object v1
.end method

.method public P(Ljava/lang/String;)Ljava/util/List;
    .locals 5

    const-string v0, "workSpecId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqc/j;

    iget-object v4, v4, Lqc/j;->a:Ljava/lang/String;

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqc/j;

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public Q(Lqc/j;)Ljc/l;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljc/l;

    return-object p1
.end method

.method public R(La3/n0;)Z
    .locals 1

    invoke-virtual {p1}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DepthSortedSet.remove called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public declared-synchronized S(Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1}, Laj/c;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/SharedPreferences;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public T(Lyf/o;Ls83/c;)Ljava/io/Serializable;
    .locals 4

    instance-of v0, p2, Lwe/t;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe/t;

    iget v1, v0, Lwe/t;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe/t;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe/t;

    invoke-direct {v0, p0, p2}, Lwe/t;-><init>(Laj/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwe/t;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe/t;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwe/t;->w:Llf/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llf/a;

    new-instance v2, Lyf/f;

    invoke-direct {v2, p2}, Lyf/f;-><init>(Llf/a;)V

    iput-object p2, v0, Lwe/t;->w:Llf/a;

    iput v3, v0, Lwe/t;->z:I

    invoke-static {p1, v2, v0}, Lyf/j;->c(Lyf/o;Lyf/t;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    :goto_1
    invoke-interface {p1}, Llf/a;->a()[B

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized U(J)Z
    .locals 5

    const-string v0, "fire-global"

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v0, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, v3, v4}, Laj/c;->I(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, p2}, Laj/c;->I(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p0

    if-nez v1, :cond_0

    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :cond_1
    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return v2

    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public V()V
    .locals 3

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->onCheckIsTextEditor()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-object v1, v0

    :goto_1
    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lcr/n;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcr/n;-><init>(Landroid/view/View;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_2
    return-void
.end method

.method public declared-synchronized W(JLjava/lang/String;)V
    .locals 11

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Laj/c;->I(J)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/SharedPreferences;

    const-string v0, "last-used-date"

    const-string v1, ""

    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Laj/c;->K(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p0, p3, p1}, Laj/c;->Y(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    :try_start_3
    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/SharedPreferences;

    const-string v0, "fire-count"

    const-wide/16 v1, 0x0

    invoke-interface {p2, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-wide/16 v5, 0x1

    add-long v7, v3, v5

    const-wide/16 v9, 0x1e

    cmp-long p2, v7, v9

    if-nez p2, :cond_3

    invoke-virtual {p0}, Laj/c;->z()V

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/SharedPreferences;

    const-string v0, "fire-count"

    invoke-interface {p2, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v3

    :cond_3
    new-instance p2, Ljava/util/HashSet;

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v0, p3, v1}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-long/2addr v3, v5

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p3, p2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string p3, "fire-count"

    invoke-interface {p2, p3, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string p3, "last-used-date"

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public X(Lqc/j;)Ljc/l;
    .locals 2

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljc/l;

    invoke-direct {v1, p1}, Ljc/l;-><init>(Lqc/j;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v1, Ljc/l;

    return-object v1
.end method

.method public declared-synchronized Y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0, p2}, Laj/c;->S(Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1, p1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/SharedPreferences;

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public Z(Ljava/lang/String;Ljava/io/InputStream;Laj/b;)Ljava/io/File;
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, p3, v0}, Laj/c;->F(Ljava/lang/String;Laj/b;Z)Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/io/File;

    invoke-virtual {p0}, Laj/c;->O()Ljava/io/File;

    move-result-object v0

    invoke-direct {p3, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v0, 0x400

    :try_start_1
    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p2, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception p3

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    return-object p3

    :catchall_1
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_3
    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    throw p1
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public a0()Lnp/e;
    .locals 1

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lnp/i;

    invoke-virtual {v0}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lnp/e;

    return-object v0
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Li63/x;

    invoke-static {v0}, Ldt/b;->o(Li63/x;)Li63/w;

    move-result-object v0

    check-cast v0, Lo63/o;

    invoke-virtual {v0}, Lo63/o;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Ld0/r;Ld0/r;Ld0/r;)J
    .locals 1

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    invoke-virtual {v0, p1, p2, p3}, Lzt/q;->c(Ld0/r;Ld0/r;Ld0/r;)J

    move-result-wide p1

    return-wide p1
.end method

.method public create()Ljava/lang/Object;
    .locals 9

    new-instance v0, Lzk/p;

    iget-object v1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/d;

    iget-object v2, v1, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    check-cast v2, Lcl/b;

    iget-object v3, v1, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    check-cast v3, Lcl/b;

    iget-object v4, v1, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    check-cast v4, Lcl/b;

    iget-object v5, v1, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    check-cast v5, Lcl/b;

    iget-object v6, v1, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    check-cast v6, Lzk/l;

    iget-object v7, v1, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    check-cast v7, Lzk/l;

    iget-object v1, v1, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    check-cast v1, Ls/m2;

    move-object v8, v7

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {v0 .. v7}, Lzk/p;-><init>(Lcl/b;Lcl/b;Lcl/b;Lcl/b;Lzk/l;Lzk/l;Ls/m2;)V

    return-object v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public e(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lcd3/g;->E(Lj93/d;Lkotlin/jvm/functions/Function1;Z)V

    return-void
.end method

.method public f(Ld0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 1

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    invoke-virtual {v0, p1, p2, p3}, Lzt/q;->f(Ld0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public g(Lpg3/e;Lpg3/v0;)V
    .locals 4

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/m;

    iget-object v1, p2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v1, v1, Lud3/x0;->Q:Z

    if-eqz v1, :cond_1

    iget-object p2, p2, Lpg3/v0;->b:Ljava/lang/Object;

    if-nez p2, :cond_0

    invoke-interface {p1}, Lpg3/e;->m()Lud3/o0;

    move-result-object p1

    const-class p2, Lpg3/w;

    invoke-virtual {p1, p2}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Lpg3/w;

    iget-object p2, p1, Lpg3/w;->a:Ljava/lang/Class;

    iget-object p1, p1, Lpg3/w;->c:Ljava/lang/reflect/Method;

    new-instance v1, Lkotlin/KotlinNullPointerException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Response from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " was null but response body type was declared as non-null"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lkotlin/KotlinNullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {v0, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Lretrofit2/HttpException;

    invoke-direct {p1, p2}, Lretrofit2/HttpException;-><init>(Lpg3/v0;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 7

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzt/q;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lzt/q;->h(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Lxf/c;
    .locals 3

    const-string v0, "schemeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aws.auth#sigv4"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Lne/b;

    iget-object p1, p1, Lne/b;->F:Lve/c;

    return-object p1

    :cond_0
    const-string v0, "smithy.api#noAuth"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lnf/d;->w:Lnf/d;

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "auth scheme "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lue/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not configured for client"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public k(Lj93/d;Lwc3/c;)V
    .locals 2

    const-string v0, "serializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    new-instance v1, Lcd3/a;

    invoke-direct {v1, p2}, Lcd3/a;-><init>(Lwc3/c;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lcd3/g;->G(Lj93/d;Lcd3/c;Z)V

    return-void
.end method

.method public m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;
    .locals 7

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzt/q;

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lzt/q;->m(JLd0/r;Ld0/r;Ld0/r;)Ld0/r;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 0

    iget-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public o(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    const-string v0, "kClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    new-instance v1, Lcd3/b;

    invoke-direct {v1, p2}, Lcd3/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    const/4 p2, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lcd3/g;->G(Lj93/d;Lcd3/c;Z)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public p(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lcd3/g;->D(Lj93/d;Lkotlin/jvm/functions/Function1;Z)V

    return-void
.end method

.method public q(La3/n0;)V
    .locals 1

    invoke-virtual {p1}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DepthSortedSet.add called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(Lpg3/e;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public request(J)V
    .locals 3

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lch3/j;

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    iget-object v0, v0, Lch3/j;->G:Ldh3/a;

    invoke-virtual {v0, p1, p2}, Ldh3/a;->request(J)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz v1, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= 0 required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public s(Lj93/d;Lj93/d;Lwc3/c;)V
    .locals 2

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcd3/g;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, p3, v1}, Lcd3/g;->F(Lj93/d;Lj93/d;Lwc3/c;Z)V

    return-void
.end method

.method public t(Lzk/z;Lwk/h;)Lzk/z;
    .locals 0

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Landroid/content/res/Resources;

    invoke-static {p2, p1}, Lgl/c;->d(Landroid/content/res/Resources;Lzk/z;)Lgl/c;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Laj/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lmf/l;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lwe/r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwe/r;

    iget v1, v0, Lwe/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe/r;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe/r;

    invoke-direct {v0, p0, p2}, Lwe/r;-><init>(Laj/c;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwe/r;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe/r;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lmf/l;->c()Z

    move-result p2

    if-nez p2, :cond_a

    instance-of p2, p1, Lmf/j;

    if-eqz p2, :cond_4

    sget-object p1, Lwe/w;->b:Lwe/w;

    invoke-virtual {p1}, Lwe/x;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p2, p1, Lof/a;

    if-eqz p2, :cond_5

    check-cast p1, Lof/a;

    invoke-virtual {p1}, Lof/a;->d()[B

    move-result-object p1

    iget-object p2, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast p2, Lc93/a;

    invoke-static {p1, p2}, Lse/h;->K([BLc93/a;)[B

    move-result-object p1

    invoke-static {p1}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p2, p1, Lmf/n;

    if-eqz p2, :cond_7

    check-cast p1, Lmf/n;

    invoke-virtual {p1}, Lmf/n;->d()Lyf/o;

    move-result-object p1

    iput v4, v0, Lwe/r;->y:I

    invoke-virtual {p0, p1, v0}, Laj/c;->T(Lyf/o;Ls83/c;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    check-cast p2, [B

    invoke-static {p2}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p2, p1, Lmf/k;

    if-eqz p2, :cond_9

    check-cast p1, Lmf/k;

    invoke-virtual {p1}, Lmf/k;->d()Lyf/u;

    move-result-object p1

    invoke-static {}, Lzf/i;->a()Lkc3/d;

    move-result-object p2

    new-instance v2, Lo23/p;

    const/16 v4, 0xd

    const/4 v5, 0x0

    invoke-direct {v2, p0, p1, v5, v4}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lwe/r;->y:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream must be replayable to calculate a body hash"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(Lvf/a;Lwe/g;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, Lwe/s;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lwe/s;

    iget v1, v0, Lwe/s;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwe/s;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwe/s;

    invoke-direct {v0, p0, p3}, Lwe/s;-><init>(Laj/c;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lwe/s;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwe/s;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p2, v0, Lwe/s;->x:Lwe/g;

    iget-object p1, v0, Lwe/s;->w:Lvf/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lwe/g;->d()Lwe/b0;

    move-result-object p3

    instance-of v2, p3, Lwe/v;

    if-eqz v2, :cond_4

    invoke-interface {p1}, Lvf/a;->getBody()Lmf/l;

    move-result-object p3

    iput-object p1, v0, Lwe/s;->w:Lvf/a;

    iput-object p2, v0, Lwe/s;->x:Lwe/g;

    iput v3, v0, Lwe/s;->E:I

    invoke-virtual {p0, p3, v0}, Laj/c;->u(Lmf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/String;

    :goto_2
    move-object v4, p2

    goto :goto_3

    :cond_4
    instance-of v0, p3, Lwe/x;

    if-eqz v0, :cond_9

    check-cast p3, Lwe/x;

    invoke-virtual {p3}, Lwe/x;->a()Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    :goto_3
    invoke-virtual {v4}, Lwe/g;->h()Lwe/c;

    move-result-object p2

    sget-object v0, Lwe/c;->x:Lwe/c;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_5

    move p2, v3

    goto :goto_4

    :cond_5
    move p2, v1

    :goto_4
    if-nez p2, :cond_6

    invoke-virtual {v4}, Lwe/g;->i()Lwe/d;

    move-result-object v0

    sget-object v2, Lwe/d;->x:Lwe/d;

    if-ne v0, v2, :cond_6

    move v0, v3

    goto :goto_5

    :cond_6
    move v0, v1

    :goto_5
    invoke-virtual {v4}, Lwe/g;->c()Lve/e;

    move-result-object v2

    invoke-virtual {v2}, Lve/e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ls93/k;->i(Lvf/a;)Lvf/b;

    move-result-object v5

    invoke-virtual {v5}, Lvf/b;->g()Lcg/j;

    move-result-object p1

    invoke-virtual {p1}, Lcg/j;->d()Ljava/lang/String;

    move-result-object v7

    xor-int/lit8 v8, p2, 0x1

    const/4 v9, 0x0

    const-string v6, "Host"

    invoke-static/range {v4 .. v9}, Laj/c;->w(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZZ)V

    invoke-virtual {v4}, Lwe/g;->b()Lwe/e;

    move-result-object p1

    iget-object v7, p1, Lwe/e;->w:Ljava/lang/String;

    const/16 v9, 0x20

    const-string v6, "X-Amz-Algorithm"

    move v8, p2

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-static {v4}, Ls3/d;->e(Lwe/g;)Ljava/lang/String;

    move-result-object v7

    const-string v6, "X-Amz-Credential"

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    move p1, v8

    const-string v6, "X-Amz-Content-Sha256"

    move-object v7, p3

    move v8, v0

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v4}, Lwe/g;->j()Lug/b;

    move-result-object p2

    sget-object v0, Lug/t;->x:Lug/t;

    invoke-virtual {p2, v0}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/16 v9, 0x30

    const-string v6, "X-Amz-Date"

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    const-string v6, "X-Amz-Expires"

    const/16 v9, 0x20

    const/4 v7, 0x0

    move v8, p1

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v4}, Lwe/g;->f()Z

    move-result p2

    xor-int/lit8 v8, p2, 0x1

    const-string v6, "X-Amz-Security-Token"

    move-object v7, v2

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    move-object p2, v7

    invoke-virtual {v4}, Lwe/g;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lwe/g;->b()Lwe/e;

    move-result-object v0

    sget-object v2, Lwe/e;->y:Lwe/e;

    if-ne v0, v2, :cond_7

    move v8, v3

    goto :goto_6

    :cond_7
    move v8, v1

    :goto_6
    const/16 v9, 0x20

    const-string v6, "X-Amz-Region-Set"

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    invoke-virtual {v5}, Lvf/b;->d()Lmf/c;

    move-result-object v0

    invoke-virtual {v0}, La2/a;->r()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    new-instance v1, Luo1/b;

    const/16 v2, 0x12

    invoke-direct {v1, v4, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    new-instance v1, Lwd3/b;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lwd3/b;-><init>(I)V

    invoke-static {v0, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    new-instance v1, Lqx/d0;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lqx/d0;-><init>(I)V

    invoke-static {v0, v1}, Lxb3/k;->C(Lxb3/i;Ljava/util/Comparator;)Lxb3/o;

    move-result-object v0

    new-instance v1, Lwd3/b;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lwd3/b;-><init>(I)V

    const/16 v2, 0x1e

    const-string v3, ";"

    const/4 v6, 0x0

    invoke-static {v0, v3, v6, v1, v2}, Lxb3/k;->y(Lxb3/i;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v7

    const-string v6, "X-Amz-SignedHeaders"

    move v8, p1

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    move-object p1, v7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lvf/b;->e()Lmf/r;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lvf/b;->g()Lcg/j;

    move-result-object v3

    invoke-static {v3, v4}, Lwe/m;->a(Lcg/j;Lwe/g;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lvf/b;->g()Lcg/j;

    move-result-object v3

    invoke-static {v3}, Lwe/m;->b(Lcg/j;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v3, Lwd3/b;

    const/16 v6, 0x8

    invoke-direct {v3, v6}, Lwd3/b;-><init>(I)V

    invoke-static {v0, v3}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    iget-object v3, v0, Lxb3/s;->a:Lxb3/i;

    invoke-interface {v3}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object v6, v0, Lxb3/s;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_8
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lwe/g;->f()Z

    move-result v8

    const/16 v9, 0x20

    const-string v6, "X-Amz-Security-Token"

    move-object v7, p2

    invoke-static/range {v4 .. v9}, Laj/c;->y(Lwe/g;Lvf/b;Ljava/lang/String;Ljava/lang/String;ZI)V

    new-instance p2, Lwe/j;

    invoke-direct {p2, v5, v0, p1, p3}, Lwe/j;-><init>(Lvf/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public x(Lva3/c;)Lhb3/d;
    .locals 3

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lr93/j0;

    iget-object v1, p1, Lva3/c;->a:Lva3/e;

    invoke-static {v0, v1}, Lj93/l0;->R(Lr93/j0;Lva3/e;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/g0;

    instance-of v2, v1, Lib3/c;

    if-eqz v2, :cond_0

    check-cast v1, Lib3/c;

    iget-object v1, v1, Lib3/c;->J:Lzt/q;

    invoke-virtual {v1, p1}, Lzt/q;->x(Lva3/c;)Lhb3/d;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public declared-synchronized z()V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    const-string v1, "fire-count"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-string v2, ""

    iget-object v3, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    instance-of v6, v6, Ljava/util/Set;

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Set;

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v7}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v8

    if-lez v8, :cond_1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object v4, v7

    goto :goto_0

    :cond_3
    new-instance v3, Ljava/util/HashSet;

    iget-object v5, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v5, Landroid/content/SharedPreferences;

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v5, v2, v6}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v4, p0, Laj/c;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/SharedPreferences;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "fire-count"

    const-wide/16 v4, 0x1

    sub-long/2addr v0, v4

    invoke-interface {v2, v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
