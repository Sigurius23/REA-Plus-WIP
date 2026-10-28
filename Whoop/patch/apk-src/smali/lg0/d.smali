.class public final Llg0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Llg0/b;",
        "Llg0/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00032\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Llg0/d;",
        "Lod1/g;",
        "Llg0/b;",
        "Llg0/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "<init>",
        "(Lnm0/e;)V",
        "previousState",
        "action",
        "e",
        "(Llg0/c;Llg0/b;)Llg0/c;",
        "",
        "manualRefresh",
        "Lec3/l;",
        "g",
        "(Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;",
        "cacheResult",
        "f",
        "(Lpm0/a$c;)Llg0/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "advanced-labs-management_release"
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


# direct methods
.method public constructor <init>(Lnm0/e;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg0/d;->a:Lnm0/e;

    return-void
.end method

.method public static final synthetic c(Llg0/d;Llg0/c;Llg0/b;)Llg0/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Llg0/d;->e(Llg0/c;Llg0/b;)Llg0/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Llg0/d;Lpm0/a$c;)Llg0/c;
    .locals 0

    invoke-direct {p0, p1}, Llg0/d;->f(Lpm0/a$c;)Llg0/c;

    move-result-object p0

    return-object p0
.end method

.method private final e(Llg0/c;Llg0/b;)Llg0/c;
    .locals 0

    return-object p1
.end method

.method private final f(Lpm0/a$c;)Llg0/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;",
            ">;)",
            "Llg0/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Llg0/c;

    sget-object v1, Llg0/a$d;->a:Llg0/a$d;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Llg0/c;-><init>(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Llg0/c;

    sget-object v2, Llg0/a$c;->a:Llg0/a$c;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Llg0/c;-><init>(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final g(Z)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementRequest;

    invoke-direct {v0}, Lcom/whoop/advancedlabsmanagement/domain/GetAdvancedLabsManagementRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "advancedlabsmanagement"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Llg0/d;->a:Lnm0/e;

    new-instance v2, Llg0/d$f;

    invoke-direct {v2, v3, v1}, Llg0/d$f;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Llg0/d$g;

    invoke-direct {v1, v0, p1, p0}, Llg0/d$g;-><init>(Lec3/l;ZLlg0/d;)V

    return-object v1
.end method

.method public static synthetic h(Llg0/d;ZILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Llg0/d;->g(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
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

    new-instance v0, Llg0/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Llg0/d$a;-><init>(Lq83/d;Llg0/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Llg0/c;

    sget-object v3, Llg0/a$b;->a:Llg0/a$b;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Llg0/c;-><init>(Llg0/a;Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Llg0/d$d;

    invoke-direct {v0, p0, v1}, Llg0/d$d;-><init>(Llg0/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
