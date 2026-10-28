.class public final Lpg3/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:[C

.field public static final m:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lud3/e0;

.field public c:Ljava/lang/String;

.field public d:Lcom/iterable/iterableapi/v;

.field public final e:Lud3/n0;

.field public final f:Lkotlin/jvm/internal/k0;

.field public g:Lud3/h0;

.field public final h:Z

.field public final i:Lq30/w0;

.field public final j:Lg40/c1;

.field public k:Lud3/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lpg3/s0;->l:[C

    const-string v0, "(.*/)?(\\.|%2e|%2E){1,2}(/.*)?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lpg3/s0;->m:Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Lud3/e0;Ljava/lang/String;Lud3/d0;Lud3/h0;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/s0;->a:Ljava/lang/String;

    iput-object p2, p0, Lpg3/s0;->b:Lud3/e0;

    iput-object p3, p0, Lpg3/s0;->c:Ljava/lang/String;

    new-instance p1, Lud3/n0;

    invoke-direct {p1}, Lud3/n0;-><init>()V

    iput-object p1, p0, Lpg3/s0;->e:Lud3/n0;

    iput-object p5, p0, Lpg3/s0;->g:Lud3/h0;

    iput-boolean p6, p0, Lpg3/s0;->h:Z

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object p1

    iput-object p1, p0, Lpg3/s0;->f:Lkotlin/jvm/internal/k0;

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/jvm/internal/k0;

    const/4 p2, 0x2

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iput-object p1, p0, Lpg3/s0;->f:Lkotlin/jvm/internal/k0;

    :goto_0
    if-eqz p7, :cond_1

    new-instance p1, Lg40/c1;

    invoke-direct {p1}, Lg40/c1;-><init>()V

    iput-object p1, p0, Lpg3/s0;->j:Lg40/c1;

    return-void

    :cond_1
    if-eqz p8, :cond_2

    new-instance p1, Lq30/w0;

    const/16 p2, 0x13

    invoke-direct {p1, p2}, Lq30/w0;-><init>(I)V

    iput-object p1, p0, Lpg3/s0;->i:Lq30/w0;

    sget-object p2, Lud3/j0;->f:Lud3/h0;

    invoke-virtual {p1, p2}, Lq30/w0;->L(Lud3/h0;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "Content-Type"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    sget-object p1, Lud3/h0;->e:Lyb3/p;

    invoke-static {p2}, Landroidx/room/c1;->u(Ljava/lang/String;)Lud3/h0;

    move-result-object p1

    iput-object p1, p0, Lpg3/s0;->g:Lud3/h0;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p3, Ljava/lang/IllegalArgumentException;

    const-string v0, "Malformed content type: "

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    :cond_0
    iget-object v0, p0, Lpg3/s0;->f:Lkotlin/jvm/internal/k0;

    if-eqz p3, :cond_1

    invoke-virtual {v0, p1, p2}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 5

    iget-object v0, p0, Lpg3/s0;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lpg3/s0;->b:Lud3/e0;

    invoke-virtual {v2, v0}, Lud3/e0;->h(Ljava/lang/String;)Lcom/iterable/iterableapi/v;

    move-result-object v0

    iput-object v0, p0, Lpg3/s0;->d:Lcom/iterable/iterableapi/v;

    if-eqz v0, :cond_0

    iput-object v1, p0, Lpg3/s0;->c:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Malformed URL. Base: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", Relative: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lpg3/s0;->c:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p3, :cond_4

    iget-object p3, p0, Lpg3/s0;->d:Lcom/iterable/iterableapi/v;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "encodedName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p3, Lcom/iterable/iterableapi/v;->h:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p3, Lcom/iterable/iterableapi/v;->h:Ljava/lang/Object;

    :cond_2
    iget-object v0, p3, Lcom/iterable/iterableapi/v;->h:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/16 v3, 0x53

    const-string v4, " \"\'<>#&="

    invoke-static {v2, p1, v2, v3, v4}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p3, Lcom/iterable/iterableapi/v;->h:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    if-eqz p2, :cond_3

    invoke-static {v2, p2, v2, v3, v4}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_4
    iget-object p3, p0, Lpg3/s0;->d:Lcom/iterable/iterableapi/v;

    invoke-virtual {p3, p1, p2}, Lcom/iterable/iterableapi/v;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
