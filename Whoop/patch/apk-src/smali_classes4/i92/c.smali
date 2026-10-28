.class public final Li92/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li92/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u000c2\u00020\u0001:\u0001\rB\u001f\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Li92/c;",
        "",
        "Lor2/x1;",
        "uuidGenerator",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "<init>",
        "(Lor2/x1;La6/g;)V",
        "",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "f",
        "a",
        "Lor2/x1;",
        "b",
        "La6/g;",
        "Lmc3/a;",
        "Lmc3/a;",
        "mutex",
        "d",
        "Ljava/lang/String;",
        "uuidCache",
        "Ltr2/n;",
        "e",
        "Ll83/h;",
        "()Ltr2/n;",
        "logger",
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
.field public static final f:Li92/c$a;

.field private static final g:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lor2/x1;

.field private final b:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final c:Lmc3/a;

.field private d:Ljava/lang/String;

.field private final e:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li92/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li92/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li92/c;->f:Li92/c$a;

    const-string v0, "appInstallationUuid"

    invoke-static {v0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Li92/c;->g:Lf6/d;

    return-void
.end method

.method public constructor <init>(Lor2/x1;La6/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor2/x1;",
            "La6/g;",
            ")V"
        }
    .end annotation

    const-string v0, "uuidGenerator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li92/c;->a:Lor2/x1;

    .line 3
    iput-object p2, p0, Li92/c;->b:La6/g;

    .line 4
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Li92/c;->c:Lmc3/a;

    .line 5
    new-instance p1, Lga1/b;

    const/16 p2, 0x12

    invoke-direct {p1, p2}, Lga1/b;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Li92/c;->e:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lor2/x1;La6/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 6
    new-instance p1, Lor2/y1;

    invoke-direct {p1}, Lor2/y1;-><init>()V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Li92/c;-><init>(Lor2/x1;La6/g;)V

    return-void
.end method

.method public static synthetic a()Ltr2/n;
    .locals 1

    invoke-static {}, Li92/c;->e()Ltr2/n;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Li92/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Li92/c;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Li92/c$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li92/c$b;

    iget v1, v0, Li92/c$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li92/c$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Li92/c$b;

    invoke-direct {v0, p0, p1}, Li92/c$b;-><init>(Li92/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Li92/c$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Li92/c$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Li92/c$b;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li92/c;->a:Lor2/x1;

    invoke-interface {p1}, Lor2/x1;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "toString(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Li92/c;->b:La6/g;

    sget-object v4, Li92/c;->g:Lf6/d;

    const/4 v5, 0x0

    iput-object v5, v0, Li92/c$b;->w:Ljava/lang/Object;

    iput v3, v0, Li92/c$b;->z:I

    invoke-static {v2, v4, p1, v0}, Lkh2/a;->c(La6/g;Lf6/d;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Li92/c;->d:Ljava/lang/String;

    invoke-direct {p0}, Li92/c;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "generated "

    const-string v3, " into datastore"

    invoke-static {v2, v0, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object p1
.end method

.method private final d()Ltr2/n;
    .locals 1

    iget-object v0, p0, Li92/c;->e:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltr2/n;

    return-object v0
.end method

.method private static final e()Ltr2/n;
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "InstallationUuidProvider"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final f(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Li92/c$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Li92/c$c;

    iget v1, v0, Li92/c$c;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Li92/c$c;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Li92/c$c;

    invoke-direct {v0, p0, p1}, Li92/c$c;-><init>(Li92/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Li92/c$c;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Li92/c$c;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Li92/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v3, v0, Li92/c$c;->y:I

    iget v2, v0, Li92/c$c;->x:I

    iget-object v5, v0, Li92/c$c;->w:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object v0, v5

    goto/16 :goto_6

    :cond_3
    iget v2, v0, Li92/c$c;->x:I

    iget-object v6, v0, Li92/c$c;->w:Ljava/lang/Object;

    check-cast v6, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v6

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Li92/c;->d:Ljava/lang/String;

    if-eqz p1, :cond_5

    return-object p1

    :cond_5
    iget-object p1, p0, Li92/c;->c:Lmc3/a;

    iput-object p1, v0, Li92/c$c;->w:Ljava/lang/Object;

    iput v3, v0, Li92/c$c;->x:I

    iput v6, v0, Li92/c$c;->F:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    move v2, v3

    :goto_1
    :try_start_2
    iget-object v6, p0, Li92/c;->b:La6/g;

    invoke-interface {v6}, La6/g;->getData()Lec3/l;

    move-result-object v6

    iput-object p1, v0, Li92/c$c;->w:Ljava/lang/Object;

    iput v2, v0, Li92/c$c;->x:I

    iput v3, v0, Li92/c$c;->y:I

    iput v5, v0, Li92/c$c;->F:I

    invoke-static {v6, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v5, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object v8, v5

    move-object v5, p1

    move-object p1, v8

    :goto_2
    :try_start_3
    check-cast p1, Lf6/f;

    sget-object v6, Li92/c;->g:Lf6/d;

    invoke-virtual {p1, v6}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    iput-object p1, p0, Li92/c;->d:Ljava/lang/String;

    goto :goto_5

    :cond_8
    iput-object v5, v0, Li92/c$c;->w:Ljava/lang/Object;

    iput v2, v0, Li92/c$c;->x:I

    iput v3, v0, Li92/c$c;->y:I

    iput v4, v0, Li92/c$c;->F:I

    invoke-direct {p0, v0}, Li92/c;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    move-object v0, v5

    :goto_4
    :try_start_4
    check-cast p1, Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v5, v0

    :goto_5
    invoke-interface {v5, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :catchall_2
    move-exception v0

    move-object v8, v0

    move-object v0, p1

    move-object p1, v8

    :goto_6
    invoke-interface {v0, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
