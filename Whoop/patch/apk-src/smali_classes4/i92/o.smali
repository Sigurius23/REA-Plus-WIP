.class public final Li92/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li92/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0010\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Li92/o;",
        "",
        "Lbc3/c0;",
        "applicationScope",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "usersPreferenceApi",
        "Lkotlin/Function0;",
        "",
        "clockPreference",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lbc3/c0;Lcom/whoop/service/network/UsersPreferenceApi;Lc93/a;Ltr2/n;)V",
        "Lxg3/g;",
        "Lpg3/v0;",
        "Lcom/whoop/service/network/model/ProfileDto;",
        "f",
        "()Lxg3/g;",
        "a",
        "Lbc3/c0;",
        "b",
        "Lcom/whoop/service/network/UsersPreferenceApi;",
        "c",
        "Lc93/a;",
        "d",
        "Ltr2/n;",
        "e",
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
.field public static final e:Li92/o$a;


# instance fields
.field private final a:Lbc3/c0;

.field private final b:Lcom/whoop/service/network/UsersPreferenceApi;

.field private final c:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final d:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li92/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li92/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li92/o;->e:Li92/o$a;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lcom/whoop/service/network/UsersPreferenceApi;Lc93/a;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lcom/whoop/service/network/UsersPreferenceApi;",
            "Lc93/a;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "applicationScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usersPreferenceApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockPreference"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li92/o;->a:Lbc3/c0;

    iput-object p2, p0, Li92/o;->b:Lcom/whoop/service/network/UsersPreferenceApi;

    iput-object p3, p0, Li92/o;->c:Lc93/a;

    iput-object p4, p0, Li92/o;->d:Ltr2/n;

    return-void
.end method

.method public static synthetic a(Li92/o;Lxg3/q;)V
    .locals 0

    invoke-static {p0, p1}, Li92/o;->g(Li92/o;Lxg3/q;)V

    return-void
.end method

.method public static synthetic b(Lbc3/c2;)V
    .locals 0

    invoke-static {p0}, Li92/o;->h(Lbc3/k1;)V

    return-void
.end method

.method public static final synthetic c(Li92/o;)Lc93/a;
    .locals 0

    iget-object p0, p0, Li92/o;->c:Lc93/a;

    return-object p0
.end method

.method public static final synthetic d(Li92/o;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Li92/o;->d:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Li92/o;)Lcom/whoop/service/network/UsersPreferenceApi;
    .locals 0

    iget-object p0, p0, Li92/o;->b:Lcom/whoop/service/network/UsersPreferenceApi;

    return-object p0
.end method

.method private static final g(Li92/o;Lxg3/q;)V
    .locals 3

    iget-object v0, p0, Li92/o;->a:Lbc3/c0;

    new-instance v1, Li92/o$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Li92/o$b;-><init>(Li92/o;Lxg3/q;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    new-instance v0, Li92/n;

    invoke-direct {v0, p0}, Li92/n;-><init>(Lbc3/c2;)V

    check-cast p1, Lch3/w0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Lfh3/a;

    invoke-direct {p0, v0}, Lfh3/a;-><init>(Ljava/lang/Object;)V

    iget-object p1, p1, Lch3/w0;->x:Lfh3/a;

    invoke-virtual {p1, p0}, Lfh3/a;->c(Lxg3/t;)V

    return-void
.end method

.method private static final h(Lbc3/k1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method


# virtual methods
.method public final f()Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/ProfileDto;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Li92/m;

    invoke-direct {v0, p0}, Li92/m;-><init>(Li92/o;)V

    invoke-static {v0}, Lxg3/p;->b(Lbh3/b;)Lxg3/p;

    move-result-object v0

    invoke-static {v0}, Lxg3/p;->a(Lxg3/p;)Lxg3/g;

    move-result-object v0

    const-string v1, "toObservable(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
