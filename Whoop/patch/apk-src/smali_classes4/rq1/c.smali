.class public final Lrq1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lrq1/a;",
        "Lrq1/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lrq1/c;",
        "Lod1/g;",
        "Lrq1/a;",
        "Lrq1/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Ltr2/n;)V",
        "Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/impacts/impacts/domain/requests/BehaviorImpactResponse;",
        "e",
        "()Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Ltr2/n;",
        "behavior-impact_release"
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
.field private final a:Lnm0/e;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq1/c;->a:Lnm0/e;

    iput-object p2, p0, Lrq1/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lrq1/c;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lrq1/c;->e()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lrq1/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lrq1/c;->b:Ltr2/n;

    return-object p0
.end method

.method private final e()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/impacts/api/BehaviorImpactGetRequest;->INSTANCE:Lcom/whoop/impacts/api/BehaviorImpactGetRequest;

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lrq1/c;->a:Lnm0/e;

    new-instance v3, Lrq1/c$a;

    invoke-direct {v3, v2, v1}, Lrq1/c$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    new-instance v0, Lrq1/c$b;

    invoke-direct {v0, p1}, Lrq1/c$b;-><init>(Lec3/l;)V

    new-instance p1, Lrq1/c$c;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Lrq1/c$c;-><init>(Lq83/d;Lrq1/c;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lrq1/c$d;

    invoke-direct {v0, p1, p0}, Lrq1/c$d;-><init>(Lec3/l;Lrq1/c;)V

    return-object v0
.end method
