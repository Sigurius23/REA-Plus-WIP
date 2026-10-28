.class public final Ljc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmb/a;
.implements Lbh3/g;
.implements Lwk/k;
.implements Lq83/i;
.implements Lp3/w;
.implements Lqa/j;
.implements Lp73/b;
.implements Lto/o;
.implements Lub/d;


# static fields
.field public static x:Ljc/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ljc/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljc/a;)V
    .locals 0

    const/16 p1, 0xb

    iput p1, p0, Ljc/b;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final j(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p0, p0, 0x40

    :cond_0
    return p0
.end method

.method public static k(Lr93/x0;Lka3/a;Lcom/google/crypto/tink/internal/l0;Llb3/y;)Llb3/u0;
    .locals 1

    const-string v0, "typeAttr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterUpperBoundEraser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lka3/a;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lka3/b;->w:Lka3/b;

    invoke-virtual {p1, p2}, Lka3/a;->i(Lka3/b;)Lka3/a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lka3/a;->c()Lka3/b;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 p0, 0x2

    if-ne p2, p0, :cond_1

    new-instance p0, Llb3/v0;

    sget-object p1, Llb3/g1;->y:Llb3/g1;

    invoke-direct {p0, p3, p1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    invoke-interface {p0}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object p2

    iget-boolean p2, p2, Llb3/g1;->x:Z

    if-nez p2, :cond_3

    new-instance p1, Llb3/v0;

    sget-object p2, Llb3/g1;->y:Llb3/g1;

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object p0

    invoke-virtual {p0}, Lo93/h;->o()Llb3/c0;

    move-result-object p0

    invoke-direct {p1, p0, p2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object p1

    :cond_3
    invoke-virtual {p3}, Llb3/y;->i0()Llb3/q0;

    move-result-object p2

    invoke-interface {p2}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object p2

    const-string v0, "getParameters(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    new-instance p0, Llb3/v0;

    sget-object p1, Llb3/g1;->E:Llb3/g1;

    invoke-direct {p0, p3, p1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object p0

    :cond_4
    invoke-static {p0, p1}, Llb3/d1;->k(Lr93/x0;Lka3/a;)Llb3/u0;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ljava/lang/String;Z)Lne3/e0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Loe3/c;->a:Lne3/l;

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p0}, Lne3/h;->u1(Ljava/lang/String;)V

    invoke-static {v0, p1}, Loe3/c;->d(Lne3/h;Z)Lne3/e0;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/io/File;)Lne3/e0;
    .locals 1

    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object p0

    return-object p0
.end method

.method private final r(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public a(Lub/c;)Lub/e;
    .locals 6

    new-instance v0, Lvb/i;

    iget-object v1, p1, Lub/c;->a:Landroid/content/Context;

    iget-object v2, p1, Lub/c;->b:Ljava/lang/String;

    iget-object v3, p1, Lub/c;->c:Lub/b;

    iget-boolean v4, p1, Lub/c;->d:Z

    iget-boolean v5, p1, Lub/c;->e:Z

    invoke-direct/range {v0 .. v5}, Lvb/i;-><init>(Landroid/content/Context;Ljava/lang/String;Lub/b;ZZ)V

    return-object v0
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ljc/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->c()Ljh3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_0
    check-cast p1, Lxg3/t;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->f()Ljh3/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_1
    check-cast p1, Lxg3/t;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->c()Ljh3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_2
    check-cast p1, Lxg3/c;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->a()Ljh3/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_3
    check-cast p1, Lxg3/e;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->c()Ljh3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lwk/h;)Z
    .locals 0

    check-cast p1, Lzk/z;

    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkl/b;

    :try_start_0
    iget-object p1, p1, Lkl/b;->w:Lar/a;

    iget-object p1, p1, Lar/a;->b:Ljava/lang/Object;

    check-cast p1, Lkl/g;

    invoke-virtual {p1}, Lkl/g;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1, p2}, Ltl/a;->c(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    const/4 p2, 0x5

    const-string p3, "GifEncoder"

    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Failed to encode GIF drawable data"

    invoke-static {p3, p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d(Lub/a;)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    return-void
.end method

.method public e(Lwk/h;)I
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public g(Lu8/p;)Z
    .locals 1

    iget-object p1, p1, Lu8/p;->n:Ljava/lang/String;

    const-string v0, "text/x-ssa"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "text/vtt"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/x-mp4-vtt"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/x-subrip"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/x-quicktime-tx3g"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/pgs"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/vobsub"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/dvbsubs"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "application/ttml+xml"

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public h(Lu8/p;)Lqa/l;
    .locals 4

    iget-object v0, p1, Lu8/p;->n:Ljava/lang/String;

    iget-object p1, p1, Lu8/p;->q:Ljava/util/List;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "application/ttml+xml"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "application/x-subrip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_2
    const-string v1, "application/vobsub"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_3
    const-string v1, "text/x-ssa"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "application/x-quicktime-tx3g"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "text/vtt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_6
    const-string v1, "application/x-mp4-vtt"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_7
    const-string v1, "application/pgs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    move v3, v2

    goto :goto_0

    :sswitch_8
    const-string v1, "application/dvbsubs"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x0

    :goto_0
    const/16 v1, 0xb

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    new-instance p1, Lwa/d;

    invoke-direct {p1}, Lwa/d;-><init>()V

    return-object p1

    :pswitch_1
    new-instance p1, Lva/a;

    invoke-direct {p1}, Lva/a;-><init>()V

    return-object p1

    :pswitch_2
    new-instance v0, Lq/f;

    invoke-direct {v0, p1}, Lq/f;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lua/a;

    invoke-direct {v0, p1}, Lua/a;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lxa/a;

    invoke-direct {v0, p1}, Lxa/a;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_5
    new-instance p1, Lt9/u;

    invoke-direct {p1, v1}, Lt9/u;-><init>(I)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt9/z;

    invoke-direct {p1, v2}, Lt9/z;-><init>(I)V

    return-object p1

    :pswitch_7
    new-instance p1, Lq/f;

    invoke-direct {p1, v1}, Lq/f;-><init>(I)V

    return-object p1

    :pswitch_8
    new-instance v0, Lsa/i;

    invoke-direct {v0, p1}, Lsa/i;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_9
    :goto_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported MIME type: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_8
        -0x4a6813e3 -> :sswitch_7
        -0x3d28a9ba -> :sswitch_6
        -0x3be2f26c -> :sswitch_5
        0x2935f49f -> :sswitch_4
        0x310bebca -> :sswitch_3
        0x45059676 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public i(Lu8/p;)I
    .locals 4

    iget-object p1, p1, Lu8/p;->n:Ljava/lang/String;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "application/ttml+xml"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "application/x-subrip"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_2
    const-string v0, "application/vobsub"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_3
    const-string v0, "text/x-ssa"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_4
    const-string v0, "application/x-quicktime-tx3g"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "text/vtt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_6
    const-string v0, "application/x-mp4-vtt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    move v3, v2

    goto :goto_0

    :sswitch_7
    const-string v0, "application/pgs"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    move v3, v1

    goto :goto_0

    :sswitch_8
    const-string v0, "application/dvbsubs"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    return v1

    :pswitch_1
    return v2

    :pswitch_2
    return v1

    :pswitch_3
    return v2

    :pswitch_4
    return v1

    :pswitch_5
    return v2

    :cond_9
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported MIME type: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5091057c -> :sswitch_8
        -0x4a6813e3 -> :sswitch_7
        -0x3d28a9ba -> :sswitch_6
        -0x3be2f26c -> :sswitch_5
        0x2935f49f -> :sswitch_4
        0x310bebca -> :sswitch_3
        0x45059676 -> :sswitch_2
        0x63771bad -> :sswitch_1
        0x64f8068a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lha3/a;Lr93/b;ZLzt/q;Lfa3/a;Lna3/q;ZLkotlin/jvm/functions/Function1;)Llb3/y;
    .locals 1

    move-object v0, p2

    new-instance p2, Llg3/q;

    invoke-direct {p2, v0, p3, p4, p5}, Llg3/q;-><init>(Ls93/a;ZLzt/q;Lfa3/a;)V

    invoke-interface {p8, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Llb3/y;

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p1

    const-string p4, "getOverriddenDescriptors(...)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p4, Ljava/util/ArrayList;

    const/16 p5, 0xa

    invoke-static {p1, p5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p5

    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/c;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p8, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/y;

    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object p1, p0

    move-object p5, p6

    move p6, p7

    invoke-virtual/range {p1 .. p6}, Ljc/b;->m(Llg3/q;Llb3/y;Ljava/util/List;Lna3/q;Z)Llb3/y;

    move-result-object p2

    return-object p2
.end method

.method public m(Llg3/q;Llb3/y;Ljava/util/List;Lna3/q;Z)Llb3/y;
    .locals 0

    check-cast p3, Ljava/lang/Iterable;

    invoke-virtual {p1, p2, p3, p4, p5}, Llg3/q;->b(Llb3/y;Ljava/lang/Iterable;Lna3/q;Z)Landroidx/room/d;

    move-result-object p3

    invoke-virtual {p1}, Llg3/q;->i()Z

    move-result p1

    const-string p4, "<this>"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Llb3/y;->p0()Llb3/f1;

    move-result-object p2

    const/4 p4, 0x0

    invoke-static {p2, p3, p4, p1}, Ljc/a;->k(Llb3/f1;Landroidx/room/d;IZ)Lai/j;

    move-result-object p1

    invoke-virtual {p1}, Lai/j;->j()Llb3/y;

    move-result-object p1

    return-object p1
.end method

.method public n(Lzt/q;Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 25

    move-object/from16 v0, p1

    sget-object v1, Lna3/n;->E:Lna3/n;

    const-string v2, "c"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_30

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/c;

    instance-of v6, v5, Lha3/a;

    if-nez v6, :cond_0

    move v9, v4

    goto/16 :goto_22

    :cond_0
    invoke-interface {v5}, Lr93/c;->getKind()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-ne v6, v7, :cond_1

    invoke-interface {v5}, Lr93/c;->a()Lr93/c;

    move-result-object v6

    invoke-interface {v6}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    if-ne v6, v8, :cond_1

    goto/16 :goto_1e

    :cond_1
    invoke-static {v5}, Lr93/y;->a(Lr93/k;)Lr93/h;

    move-result-object v6

    if-nez v6, :cond_2

    move-object v6, v5

    check-cast v6, Lal/a;

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    goto :goto_5

    :cond_2
    instance-of v9, v6, Lja3/i;

    if-eqz v9, :cond_3

    check-cast v6, Lja3/i;

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_4

    iget-object v6, v6, Lja3/i;->K:Ll83/p;

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    move-object v9, v6

    check-cast v9, Ljava/util/Collection;

    if-eqz v9, :cond_8

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_4

    :cond_5
    check-cast v6, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v6, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lx93/d;

    new-instance v11, Lja3/f;

    invoke-direct {v11, v10, v0, v8}, Lja3/f;-><init>(Lx93/d;Lzt/q;Z)V

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    move-object v6, v5

    check-cast v6, Lal/a;

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-static {v6, v9}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_7

    sget-object v6, Ls93/g;->a:Ls93/f;

    goto :goto_5

    :cond_7
    new-instance v9, Ls93/j;

    const/4 v10, 0x0

    invoke-direct {v9, v6, v10}, Ls93/j;-><init>(Ljava/util/List;I)V

    move-object v6, v9

    goto :goto_5

    :cond_8
    :goto_4
    move-object v6, v5

    check-cast v6, Lal/a;

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    :goto_5
    invoke-static {v0, v6}, Lge3/g;->o(Lzt/q;Ls93/i;)Lzt/q;

    move-result-object v13

    instance-of v6, v5, Lha3/f;

    if-eqz v6, :cond_9

    move-object v6, v5

    check-cast v6, Lu93/m0;

    iget-object v6, v6, Lu93/m0;->X:Lu93/n0;

    if-eqz v6, :cond_9

    iget-boolean v9, v6, Lu93/k0;->F:Z

    if-nez v9, :cond_9

    move-object v11, v6

    goto :goto_6

    :cond_9
    move-object v11, v5

    :goto_6
    invoke-interface {v5}, Lr93/b;->B()Lr93/q0;

    move-result-object v6

    if-eqz v6, :cond_d

    instance-of v6, v11, Lr93/w;

    if-eqz v6, :cond_a

    move-object v6, v11

    check-cast v6, Lr93/w;

    goto :goto_7

    :cond_a
    const/4 v6, 0x0

    :goto_7
    if-eqz v6, :cond_b

    sget-object v9, Lha3/e;->g0:Lbb3/b;

    invoke-interface {v6, v9}, Lr93/b;->h0(Lr93/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/a1;

    move-object/from16 v16, v6

    goto :goto_8

    :cond_b
    const/16 v16, 0x0

    :goto_8
    sget-object v22, Lna3/n;->x:Lna3/n;

    move-object v15, v5

    check-cast v15, Lha3/a;

    if-eqz v16, :cond_c

    move-object/from16 v6, v16

    check-cast v6, Lal/a;

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-static {v13, v6}, Lge3/g;->o(Lzt/q;Ls93/i;)Lzt/q;

    move-result-object v6

    move-object/from16 v18, v6

    goto :goto_9

    :cond_c
    move-object/from16 v18, v13

    :goto_9
    sget-object v19, Lfa3/a;->y:Lfa3/a;

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v14, p0

    invoke-virtual/range {v14 .. v22}, Ljc/b;->l(Lha3/a;Lr93/b;ZLzt/q;Lfa3/a;Lna3/q;ZLkotlin/jvm/functions/Function1;)Llb3/y;

    move-result-object v6

    goto :goto_a

    :cond_d
    const/4 v6, 0x0

    :goto_a
    instance-of v9, v5, Lha3/e;

    if-eqz v9, :cond_e

    move-object v9, v5

    check-cast v9, Lha3/e;

    goto :goto_b

    :cond_e
    const/4 v9, 0x0

    :goto_b
    const/4 v10, 0x0

    if-eqz v9, :cond_12

    invoke-virtual {v9}, Lu93/o;->g()Lr93/k;

    move-result-object v12

    const-string v14, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lr93/e;

    const/4 v14, 0x3

    invoke-static {v9, v14}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v12, v9}, Le4/a;->R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_12

    invoke-static {}, Lna3/l;->a()Ljava/util/LinkedHashMap;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lna3/m;

    if-eqz v9, :cond_12

    invoke-virtual {v9}, Lna3/m;->a()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v9}, Lna3/m;->a()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_f

    const-string v14, "2."

    invoke-static {v12, v14, v10}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-ne v12, v8, :cond_f

    goto :goto_c

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_c
    invoke-virtual {v9}, Lna3/m;->a()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v9}, Lna3/m;->d()Lna3/m;

    move-result-object v9

    goto :goto_d

    :cond_12
    const/4 v9, 0x0

    :goto_d
    if-eqz v9, :cond_13

    invoke-virtual {v9}, Lna3/m;->b()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-object v12, v5

    check-cast v12, Lha3/e;

    invoke-virtual {v12}, Lu93/x;->v()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    :cond_13
    iget-object v12, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v12, Lia3/a;

    iget-object v12, v12, Lia3/a;->v:Lch3/h;

    invoke-static {v12}, Lse/h;->M(Lch3/h;)Z

    move-result v12

    if-nez v12, :cond_14

    iget-object v12, v13, Lzt/q;->x:Ljava/lang/Object;

    check-cast v12, Lia3/a;

    iget-object v12, v12, Lia3/a;->t:Lia3/b;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_e

    :cond_14
    move-object v12, v5

    check-cast v12, Lha3/a;

    invoke-static {v12}, Lse/h;->I(Lha3/a;)Z

    move-result v12

    if-eqz v12, :cond_15

    move/from16 v21, v8

    goto :goto_f

    :cond_15
    :goto_e
    move/from16 v21, v10

    :goto_f
    invoke-interface {v11}, Lr93/b;->v()Ljava/util/List;

    move-result-object v12

    const-string v14, "getValueParameters(...)"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v12, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lr93/a1;

    if-eqz v9, :cond_16

    invoke-virtual {v9}, Lna3/m;->b()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_16

    move-object v7, v12

    check-cast v7, Lu93/w0;

    iget v7, v7, Lu93/w0;->G:I

    invoke-static {v7, v4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lna3/q;

    move-object/from16 v20, v4

    goto :goto_11

    :cond_16
    const/16 v20, 0x0

    :goto_11
    new-instance v4, Ls;

    const/16 v7, 0xf

    invoke-direct {v4, v12, v7}, Ls;-><init>(Ljava/lang/Object;I)V

    move-object v7, v15

    move-object v15, v5

    check-cast v15, Lha3/a;

    if-eqz v12, :cond_17

    move-object/from16 v16, v12

    check-cast v16, Lal/a;

    invoke-virtual/range {v16 .. v16}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v8

    invoke-static {v13, v8}, Lge3/g;->o(Lzt/q;Ls93/i;)Lzt/q;

    move-result-object v8

    move-object/from16 v18, v8

    goto :goto_12

    :cond_17
    move-object/from16 v18, v13

    :goto_12
    sget-object v19, Lfa3/a;->y:Lfa3/a;

    const/16 v17, 0x0

    move-object/from16 v22, v4

    move-object/from16 v16, v12

    move-object v4, v14

    move-object/from16 v14, p0

    invoke-virtual/range {v14 .. v22}, Ljc/b;->l(Lha3/a;Lr93/b;ZLzt/q;Lfa3/a;Lna3/q;ZLkotlin/jvm/functions/Function1;)Llb3/y;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v14, v4

    move-object v15, v7

    const/16 v4, 0xa

    const/4 v8, 0x1

    goto :goto_10

    :cond_18
    move-object v4, v14

    move-object v7, v15

    instance-of v8, v5, Lr93/n0;

    if-eqz v8, :cond_19

    move-object v8, v5

    check-cast v8, Lr93/n0;

    goto :goto_13

    :cond_19
    const/4 v8, 0x0

    :goto_13
    if-eqz v8, :cond_1a

    invoke-static {v8}, Lo73/a;->P(Lr93/n0;)Z

    move-result v8

    const/4 v10, 0x1

    if-ne v8, v10, :cond_1b

    sget-object v8, Lfa3/a;->z:Lfa3/a;

    :goto_14
    move-object v14, v8

    goto :goto_15

    :cond_1a
    const/4 v10, 0x1

    :cond_1b
    sget-object v8, Lfa3/a;->x:Lfa3/a;

    goto :goto_14

    :goto_15
    if-eqz v9, :cond_1c

    invoke-virtual {v9}, Lna3/m;->c()Lna3/q;

    move-result-object v8

    move-object v15, v8

    goto :goto_16

    :cond_1c
    const/4 v15, 0x0

    :goto_16
    sget-object v17, Lna3/n;->y:Lna3/n;

    move/from16 v24, v10

    move-object v10, v5

    check-cast v10, Lha3/a;

    const/4 v12, 0x1

    const/16 v16, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p0

    invoke-virtual/range {v9 .. v17}, Ljc/b;->l(Lha3/a;Lr93/b;ZLzt/q;Lfa3/a;Lna3/q;ZLkotlin/jvm/functions/Function1;)Llb3/y;

    move-result-object v11

    invoke-interface {v5}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-static {v9, v1, v12}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v9

    const-string v13, "getType(...)"

    if-nez v9, :cond_22

    invoke-interface {v5}, Lr93/b;->B()Lr93/q0;

    move-result-object v9

    if-eqz v9, :cond_1d

    check-cast v9, Lu93/d;

    invoke-virtual {v9}, Lu93/d;->getType()Llb3/y;

    move-result-object v9

    invoke-static {v9, v1, v12}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v9

    goto :goto_17

    :cond_1d
    move v9, v8

    :goto_17
    if-nez v9, :cond_22

    invoke-interface {v5}, Lr93/b;->v()Ljava/util/List;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/Iterable;

    instance-of v4, v9, Ljava/util/Collection;

    if-eqz v4, :cond_1f

    move-object v4, v9

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1f

    :cond_1e
    move v4, v8

    goto :goto_18

    :cond_1f
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr93/a1;

    check-cast v9, Lu93/x0;

    invoke-virtual {v9}, Lu93/x0;->getType()Llb3/y;

    move-result-object v9

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v12, 0x0

    invoke-static {v9, v1, v12}, Llb3/d1;->c(Llb3/y;Lkotlin/jvm/functions/Function1;Lub3/h;)Z

    move-result v9

    if-eqz v9, :cond_20

    move/from16 v4, v24

    :goto_18
    if-eqz v4, :cond_21

    goto :goto_19

    :cond_21
    move v4, v8

    goto :goto_1a

    :cond_22
    :goto_19
    move/from16 v4, v24

    :goto_1a
    if-eqz v4, :cond_23

    new-instance v4, Lfa3/g;

    invoke-direct {v4, v10}, Lfa3/g;-><init>(Lha3/a;)V

    new-instance v12, Ll83/k;

    sget-object v9, Lbb3/c;->a:Lbb3/b;

    invoke-direct {v12, v9, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1b

    :cond_23
    const/4 v12, 0x0

    :goto_1b
    if-nez v6, :cond_29

    if-nez v11, :cond_29

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_25

    :cond_24
    move/from16 v24, v8

    goto :goto_1d

    :cond_25
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_26
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Llb3/y;

    if-eqz v9, :cond_27

    move/from16 v9, v24

    goto :goto_1c

    :cond_27
    move v9, v8

    :goto_1c
    if-eqz v9, :cond_26

    :goto_1d
    if-nez v24, :cond_29

    if-eqz v12, :cond_28

    goto :goto_1f

    :cond_28
    :goto_1e
    const/16 v9, 0xa

    goto :goto_22

    :cond_29
    :goto_1f
    if-nez v6, :cond_2b

    invoke-interface {v5}, Lr93/b;->B()Lr93/q0;

    move-result-object v4

    if-eqz v4, :cond_2a

    check-cast v4, Lu93/d;

    invoke-virtual {v4}, Lu93/d;->getType()Llb3/y;

    move-result-object v6

    goto :goto_20

    :cond_2a
    const/4 v6, 0x0

    :cond_2b
    :goto_20
    new-instance v4, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v7, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_21
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v15, v8, 0x1

    if-ltz v8, :cond_2d

    check-cast v14, Llb3/y;

    if-nez v14, :cond_2c

    invoke-interface {v5}, Lr93/b;->v()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lr93/a1;

    check-cast v8, Lu93/x0;

    invoke-virtual {v8}, Lu93/x0;->getType()Llb3/y;

    move-result-object v14

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2c
    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v8, v15

    goto :goto_21

    :cond_2d
    invoke-static {}, Lwb3/f;->d0()V

    const/16 v23, 0x0

    throw v23

    :cond_2e
    if-nez v11, :cond_2f

    invoke-interface {v5}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_2f
    invoke-interface {v10, v6, v4, v11, v12}, Lha3/a;->J(Llb3/y;Ljava/util/ArrayList;Llb3/y;Ll83/k;)Lha3/a;

    move-result-object v5

    :goto_22
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v9

    goto/16 :goto_0

    :cond_30
    return-object v3
.end method

.method public q(I)I
    .locals 1

    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    const/4 p1, 0x6

    return p1

    :cond_0
    const/4 p1, 0x3

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ljc/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "EmptyConsumer"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method
