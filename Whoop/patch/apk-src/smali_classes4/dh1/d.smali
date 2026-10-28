.class public final Ldh1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ldh1/b;",
        "Ldh1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\u000e2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0015\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J%\u0010\u001d\u001a\u00020\u00032\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ#\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00112\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Ldh1/d;",
        "Lod1/g;",
        "Ldh1/b;",
        "Ldh1/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lqw2/c;",
        "actionInteractor",
        "<init>",
        "(Lnm0/e;Lqw2/c;)V",
        "previousState",
        "action",
        "h",
        "(Ldh1/c;Ldh1/b;)Ldh1/c;",
        "Ldh1/b$a;",
        "",
        "giftCode",
        "Lec3/l;",
        "Ldh1/e;",
        "l",
        "(Ldh1/b$a;Ljava/lang/String;)Lec3/l;",
        "code",
        "",
        "manualRefresh",
        "j",
        "(Ljava/lang/String;Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;",
        "cacheResult",
        "i",
        "(Lpm0/a$c;Ljava/lang/String;)Ldh1/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lqw2/c;",
        "c",
        "Ljava/lang/String;",
        "currentGiftCode",
        "gifting_release"
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

.field private final b:Lqw2/c;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnm0/e;Lqw2/c;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh1/d;->a:Lnm0/e;

    iput-object p2, p0, Ldh1/d;->b:Lqw2/c;

    return-void
.end method

.method public static final synthetic c(Ldh1/d;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ldh1/d;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic d(Ldh1/d;Ldh1/c;Ldh1/b;)Ldh1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldh1/d;->h(Ldh1/c;Ldh1/b;)Ldh1/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ldh1/d;Lpm0/a$c;Ljava/lang/String;)Ldh1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldh1/d;->i(Lpm0/a$c;Ljava/lang/String;)Ldh1/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ldh1/d;Ldh1/b$a;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldh1/d;->l(Ldh1/b$a;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ldh1/d;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldh1/d;->c:Ljava/lang/String;

    return-void
.end method

.method private final h(Ldh1/c;Ldh1/b;)Ldh1/c;
    .locals 0

    return-object p1
.end method

.method private final i(Lpm0/a$c;Ljava/lang/String;)Ldh1/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ldh1/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Ldh1/c;

    sget-object v1, Ldh1/a$d;->a:Ldh1/a$d;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-direct/range {v0 .. v8}, Ldh1/c;-><init>(Ldh1/a;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;ZZLgh1/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    move-object v6, p2

    new-instance v1, Ldh1/c;

    sget-object v2, Ldh1/a$c;->a:Ldh1/a$c;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Ldh1/c;-><init>(Ldh1/a;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;ZZLgh1/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final j(Ljava/lang/String;Z)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/gifting/feature/gifted/domain/GetGiftedRequest;

    invoke-direct {v0, p1}, Lcom/whoop/gifting/feature/gifted/domain/GetGiftedRequest;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Ldh1/d;->a:Lnm0/e;

    new-instance v3, Ldh1/d$f;

    invoke-direct {v3, v2, v1}, Ldh1/d$f;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Ldh1/d$g;

    invoke-direct {v1, v0, p1, p2, p0}, Ldh1/d$g;-><init>(Lec3/l;Ljava/lang/String;ZLdh1/d;)V

    return-object v1
.end method

.method public static synthetic k(Ldh1/d;Ljava/lang/String;ZILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Ldh1/d;->j(Ljava/lang/String;Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final l(Ldh1/b$a;Ljava/lang/String;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldh1/b$a;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Ldh1/d;->b:Lqw2/c;

    new-instance v1, Lqw2/f;

    invoke-virtual {p1}, Ldh1/b$a;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v1, p1}, Lqw2/f;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    new-instance p1, La6/u;

    const/4 v2, 0x1

    invoke-direct {p1, v1, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Lqw2/c;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Ldh1/d$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2, p0}, Ldh1/d$h;-><init>(Lq83/d;Ljava/lang/String;Ldh1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 11
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

    new-instance v0, Ldh1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ldh1/d$a;-><init>(Lq83/d;Ldh1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Ldh1/c;

    sget-object v3, Ldh1/a$b;->a:Ldh1/a$b;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Ldh1/c;-><init>(Ldh1/a;Lcom/whoop/gifting/feature/gifted/domain/models/GiftedModels;ZZLgh1/b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ldh1/d$d;

    invoke-direct {v0, p0, v1}, Ldh1/d$d;-><init>(Ldh1/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
