.class public final Lv92/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv92/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lv92/d;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Ll83/a0;",
        "g",
        "()V",
        "Lfs/a;",
        "f",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lfs/h;",
        "e",
        "()Lfs/h;",
        "",
        "input",
        "",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "cipherText",
        "c",
        "([BLq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lfs/a;",
        "aead",
        "Lmc3/a;",
        "Lmc3/a;",
        "mutex",
        "Lps/a;",
        "Lps/a;",
        "keysetManager",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final e:Lv92/d$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lfs/a;

.field private final c:Lmc3/a;

.field private d:Lps/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv92/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv92/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lv92/d;->e:Lv92/d$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv92/d;->a:Landroid/content/Context;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lv92/d;->c:Lmc3/a;

    invoke-direct {p0}, Lv92/d;->g()V

    return-void
.end method

.method public static final synthetic a(Lv92/d;)Lfs/h;
    .locals 0

    invoke-direct {p0}, Lv92/d;->e()Lfs/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lv92/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lv92/d;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e()Lfs/h;
    .locals 4

    new-instance v0, Lio/sentry/android/replay/video/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lio/sentry/android/replay/video/d;-><init>(I)V

    iget-object v1, p0, Lv92/d;->a:Landroid/content/Context;

    const-string v2, "auth_material_key_set"

    const-string v3, "auth_material_prefs_name"

    invoke-virtual {v0, v1, v2, v3}, Lio/sentry/android/replay/video/d;->r(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lgs/c;->a:Lvs/p3;

    invoke-virtual {v0, v1}, Lio/sentry/android/replay/video/d;->p(Lvs/p3;)V

    const-string v1, "android-keystore://hello_world_master_key"

    invoke-virtual {v0, v1}, Lio/sentry/android/replay/video/d;->q(Ljava/lang/String;)V

    invoke-virtual {v0}, Lio/sentry/android/replay/video/d;->a()Lps/a;

    move-result-object v0

    iput-object v0, p0, Lv92/d;->d:Lps/a;

    invoke-virtual {v0}, Lps/a;->a()Lfs/h;

    move-result-object v0

    return-object v0
.end method

.method private final f(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lfs/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lv92/d$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lv92/d$d;

    iget v1, v0, Lv92/d$d;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv92/d$d;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv92/d$d;

    invoke-direct {v0, p0, p1}, Lv92/d$d;-><init>(Lv92/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lv92/d$d;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv92/d$d;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lv92/d$d;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lv92/d$d;->x:I

    iget-object v5, v0, Lv92/d$d;->w:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lv92/d;->b:Lfs/a;

    if-nez p1, :cond_7

    iget-object p1, p0, Lv92/d;->c:Lmc3/a;

    iput-object p1, v0, Lv92/d$d;->w:Ljava/lang/Object;

    iput v3, v0, Lv92/d$d;->x:I

    iput v5, v0, Lv92/d$d;->F:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_1
    :try_start_1
    iget-object v5, p0, Lv92/d;->b:Lfs/a;

    if-nez v5, :cond_6

    sget-object v5, Lbc3/q0;->a:Lkc3/e;

    new-instance v7, Lv92/d$e;

    invoke-direct {v7, p0, v6}, Lv92/d$e;-><init>(Lv92/d;Lq83/d;)V

    iput-object p1, v0, Lv92/d$d;->w:Ljava/lang/Object;

    iput v2, v0, Lv92/d$d;->x:I

    iput v3, v0, Lv92/d$d;->y:I

    iput v4, v0, Lv92/d$d;->F:I

    invoke-static {v5, v7, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_3
    :try_start_2
    move-object v1, p1

    check-cast v1, Lfs/a;

    iput-object v1, p0, Lv92/d;->b:Lfs/a;

    move-object v5, p1

    check-cast v5, Lfs/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object p1, v0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    goto :goto_5

    :cond_6
    :goto_4
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v5

    :goto_5
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_7
    return-object p1
.end method

.method private final g()V
    .locals 0

    :try_start_0
    invoke-static {}, Ljs/a;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public final c([BLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lq83/d<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lv92/d$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lv92/d$b;

    iget v1, v0, Lv92/d$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv92/d$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv92/d$b;

    invoke-direct {v0, p0, p2}, Lv92/d$b;-><init>(Lv92/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lv92/d$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv92/d$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lv92/d$b;->w:Ljava/lang/Object;

    check-cast p1, [B

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lv92/d$b;->w:Ljava/lang/Object;

    iput v3, v0, Lv92/d$b;->z:I

    invoke-direct {p0, v0}, Lv92/d;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lfs/a;

    const-string v0, ""

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, v0}, Lfs/a;->b([B[B)[B

    move-result-object p1

    const-string p2, "decrypt(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lv92/d$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lv92/d$c;

    iget v1, v0, Lv92/d$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lv92/d$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lv92/d$c;

    invoke-direct {v0, p0, p2}, Lv92/d$c;-><init>(Lv92/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lv92/d$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lv92/d$c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lv92/d$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p1, v0, Lv92/d$c;->w:Ljava/lang/Object;

    iput v3, v0, Lv92/d$c;->z:I

    invoke-direct {p0, v0}, Lv92/d;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lfs/a;

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, v0}, Lfs/a;->a([B[B)[B

    move-result-object p1

    const-string p2, "encrypt(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
