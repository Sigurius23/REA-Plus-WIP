.class public final Lmr1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lmr1/b;",
        "Lmr1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ+\u0010\u0014\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J#\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lmr1/f;",
        "Lod1/g;",
        "Lmr1/b;",
        "Lmr1/c;",
        "Lu02/c;",
        "apiClient",
        "<init>",
        "(Lu02/c;)V",
        "previousState",
        "action",
        "i",
        "(Lmr1/c;Lmr1/b;)Lmr1/c;",
        "Lec3/l;",
        "h",
        "()Lec3/l;",
        "",
        "dynamicPath",
        "dynamicPayload",
        "Lu02/g;",
        "Lcom/whoop/internal/checkout/models/CreateCartResponse;",
        "g",
        "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "j",
        "()Lmr1/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu02/c;",
        "internal-tooling_release"
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
.field private final a:Lu02/c;


# direct methods
.method public constructor <init>(Lu02/c;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmr1/f;->a:Lu02/c;

    return-void
.end method

.method public static final synthetic c(Lmr1/f;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmr1/f;->g(Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lmr1/f;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lmr1/f;->h()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lmr1/f;Lmr1/c;Lmr1/b;)Lmr1/c;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmr1/f;->i(Lmr1/c;Lmr1/b;)Lmr1/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lmr1/f;)Lmr1/c;
    .locals 0

    invoke-direct {p0}, Lmr1/f;->j()Lmr1/c;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/internal/checkout/models/PostUniversalCheckoutRequest;

    invoke-direct {v0, p2, p1}, Lcom/whoop/internal/checkout/models/PostUniversalCheckoutRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, La6/u;

    const/4 p2, 0x1

    invoke-direct {p1, v0, p2}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object p2, p0, Lmr1/f;->a:Lu02/c;

    const-class v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0, v1, v2}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v0

    const-class v1, Lcom/whoop/internal/checkout/models/CreateCartResponse;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v1, v2, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Lu02/f;->b(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;

    move-result-object p1

    return-object p1
.end method

.method private final h()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lmr1/f$a;

    const/4 v1, 0x0

    const-string v2, "/commerce-service/v2/mobile/carts"

    const-string v3, "{\"cart_items\":[{\"sku\":\"810114362662\",\"quantity\":1},{\"sku\":\"ALBL1-OTP-12M-STA\",\"quantity\":1}]}"

    invoke-direct {v0, p0, v2, v3, v1}, Lmr1/f$a;-><init>(Lmr1/f;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final i(Lmr1/c;Lmr1/b;)Lmr1/c;
    .locals 9

    instance-of v0, p2, Lmr1/b$a;

    if-eqz v0, :cond_0

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lmr1/c;->b(Lmr1/c;Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILjava/lang/Object;)Lmr1/c;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v0, p1

    instance-of p1, p2, Lmr1/b$b;

    if-eqz p1, :cond_1

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v7}, Lmr1/c;->b(Lmr1/c;Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILjava/lang/Object;)Lmr1/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, p2, Lmr1/b$c;

    if-eqz p1, :cond_2

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lmr1/c;->b(Lmr1/c;Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILjava/lang/Object;)Lmr1/c;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final j()Lmr1/c;
    .locals 8

    new-instance v0, Lmr1/c;

    sget-object v4, Lmr1/a$d;->a:Lmr1/a$d;

    const/16 v6, 0x13

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "Unknown error occurred"

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lmr1/c;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 10
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

    new-instance v0, Lmr1/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lmr1/f$b;-><init>(Lq83/d;Lmr1/f;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lmr1/c;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lmr1/c;-><init>(Ljava/lang/String;ZLjava/lang/String;Lmr1/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lmr1/f$e;

    invoke-direct {v0, p0, v1}, Lmr1/f$e;-><init>(Lmr1/f;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
