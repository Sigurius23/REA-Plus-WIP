.class public final Lrw2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR(\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000f0\u000e8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0011\u001a\u0004\u0008\u000c\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lrw2/e;",
        "Lrw2/a;",
        "Lwm0/a;",
        "scopeCoordinator",
        "<init>",
        "(Lwm0/a;)V",
        "Lec3/l;",
        "Lqw2/a;",
        "upstream",
        "Lqw2/b;",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lwm0/a;",
        "",
        "Lj93/d;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "actionTypes",
        "whoop-action_release"
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
.field private final a:Lwm0/a;

.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lwm0/a;)V
    .locals 1

    const-string v0, "scopeCoordinator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrw2/e;->a:Lwm0/a;

    const-class p1, Lcom/whoop/whoopaction/domain/models/RefreshScopeAction;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lrw2/e;->b:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic c(Lrw2/e;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lrw2/e;->a:Lwm0/a;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrw2/e;->b:Ljava/util/Set;

    return-object v0
.end method

.method public b(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrw2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrw2/e$a;-><init>(Lrw2/e;Lq83/d;)V

    invoke-static {v0, p1}, Lec3/v;->D(Lc93/m;Lec3/l;)Lch/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge interact(Lec3/l;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-super {p0, p1}, Lrw2/a;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
