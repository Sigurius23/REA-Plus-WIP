.class public final Lod1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J!\u0010\u000c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lod1/y;",
        "",
        "Lbc3/c0;",
        "scope",
        "Lpd1/a;",
        "bootstrapUserSignIn",
        "<init>",
        "(Lbc3/c0;Lpd1/a;)V",
        "Lxg3/g;",
        "Ll83/k;",
        "Lcom/whoop/domain/model/User;",
        "",
        "d",
        "()Lxg3/g;",
        "a",
        "Lbc3/c0;",
        "b",
        "Lpd1/a;",
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


# instance fields
.field private final a:Lbc3/c0;

.field private final b:Lpd1/a;


# direct methods
.method public constructor <init>(Lbc3/c0;Lpd1/a;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bootstrapUserSignIn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lod1/y;->a:Lbc3/c0;

    iput-object p2, p0, Lod1/y;->b:Lpd1/a;

    return-void
.end method

.method public static synthetic a(Lbc3/c2;)V
    .locals 0

    invoke-static {p0}, Lod1/y;->f(Lbc3/k1;)V

    return-void
.end method

.method public static synthetic b(Lod1/y;Lxg3/q;)V
    .locals 0

    invoke-static {p0, p1}, Lod1/y;->e(Lod1/y;Lxg3/q;)V

    return-void
.end method

.method public static final synthetic c(Lod1/y;)Lpd1/a;
    .locals 0

    iget-object p0, p0, Lod1/y;->b:Lpd1/a;

    return-object p0
.end method

.method private static final e(Lod1/y;Lxg3/q;)V
    .locals 3

    iget-object v0, p0, Lod1/y;->a:Lbc3/c0;

    new-instance v1, Lod1/y$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lod1/y$a;-><init>(Lxg3/q;Lod1/y;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    new-instance v0, Lcom/whoop/data/repositories/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/d;-><init>(Lbc3/c2;I)V

    check-cast p1, Lch3/w0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lfh3/a;

    invoke-direct {p0, v0}, Lfh3/a;-><init>(Ljava/lang/Object;)V

    iget-object p1, p1, Lch3/w0;->x:Lfh3/a;

    invoke-virtual {p1, p0}, Lfh3/a;->c(Lxg3/t;)V

    return-void
.end method

.method private static final f(Lbc3/k1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method


# virtual methods
.method public final d()Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/onboarding/c;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lxg3/p;->b(Lbh3/b;)Lxg3/p;

    move-result-object v0

    invoke-static {v0}, Lxg3/p;->a(Lxg3/p;)Lxg3/g;

    move-result-object v0

    const-string v1, "toObservable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
