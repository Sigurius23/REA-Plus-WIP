.class public final Lcom/whoop/core/details/activitytargets/domain/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/core/details/activitytargets/domain/a;",
        "Lcom/whoop/core/details/activitytargets/domain/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/core/details/activitytargets/domain/c;",
        "Lod1/g;",
        "Lcom/whoop/core/details/activitytargets/domain/a;",
        "Lcom/whoop/core/details/activitytargets/domain/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Ltr2/n;)V",
        "",
        "path",
        "Lec3/l;",
        "f",
        "(Ljava/lang/String;)Lec3/l;",
        "Lpm0/a;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "g",
        "(Lpm0/a;)Lcom/whoop/core/details/activitytargets/domain/b;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Ltr2/n;",
        "core-details_release"
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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/core/details/activitytargets/domain/c;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Lcom/whoop/core/details/activitytargets/domain/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "ActivityDetailsTargetsMiniArchInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/core/details/activitytargets/domain/c;-><init>(Lnm0/e;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lcom/whoop/core/details/activitytargets/domain/c;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/core/details/activitytargets/domain/c;->f(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/core/details/activitytargets/domain/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/core/details/activitytargets/domain/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/core/details/activitytargets/domain/c;Lpm0/a;)Lcom/whoop/core/details/activitytargets/domain/b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/core/details/activitytargets/domain/c;->g(Lpm0/a;)Lcom/whoop/core/details/activitytargets/domain/b;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;->Companion:Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest$a;

    invoke-virtual {v0, p1}, Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest$a;->a(Ljava/lang/String;)Lcom/whoop/core/details/activitytargets/domain/ActivityDetailsTargetsMiniArchFetchRequest;

    move-result-object v0

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lxv0/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/core/details/activitytargets/domain/c;->a:Lnm0/e;

    new-instance v2, Lcom/whoop/core/details/activitytargets/domain/c$a;

    invoke-direct {v2, v3, v1}, Lcom/whoop/core/details/activitytargets/domain/c$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lcom/whoop/core/details/activitytargets/domain/c$b;

    invoke-direct {v1, v0, p0}, Lcom/whoop/core/details/activitytargets/domain/c$b;-><init>(Lec3/l;Lcom/whoop/core/details/activitytargets/domain/c;)V

    new-instance v0, Lcom/whoop/core/details/activitytargets/domain/c$c;

    invoke-direct {v0, p0, p1, v3}, Lcom/whoop/core/details/activitytargets/domain/c$c;-><init>(Lcom/whoop/core/details/activitytargets/domain/c;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/a0;

    invoke-direct {p1, v1, v0}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object p1
.end method

.method private final g(Lpm0/a;)Lcom/whoop/core/details/activitytargets/domain/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;)",
            "Lcom/whoop/core/details/activitytargets/domain/b;"
        }
    .end annotation

    instance-of v0, p1, Lpm0/a$e;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/core/details/activitytargets/domain/b$c;->a:Lcom/whoop/core/details/activitytargets/domain/b$c;

    return-object p1

    :cond_0
    instance-of v0, p1, Lpm0/a$a;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/core/details/activitytargets/domain/b$b;

    check-cast p1, Lpm0/a$a;

    invoke-interface {p1}, Lpm0/a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/activitytargets/domain/b$b;-><init>(Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lpm0/a$d;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/whoop/core/details/activitytargets/domain/b$b;

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/activitytargets/domain/b$b;-><init>(Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lpm0/a$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/core/details/activitytargets/domain/c;->b:Ltr2/n;

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->b()I

    move-result v1

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Activity details targets fetch failed ["

    const-string v3, "]: "

    invoke-static {v1, v2, v3, p1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/core/details/activitytargets/domain/b$a;->a:Lcom/whoop/core/details/activitytargets/domain/b$a;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
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

    new-instance v0, Lcom/whoop/core/details/activitytargets/domain/c$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/core/details/activitytargets/domain/c$d;-><init>(Lq83/d;Lcom/whoop/core/details/activitytargets/domain/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
