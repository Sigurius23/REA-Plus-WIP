.class public final Lc02/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lc02/a;",
        "Lc02/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lc02/c;",
        "Lod1/g;",
        "Lc02/a;",
        "Lc02/b;",
        "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Ltr2/n;)V",
        "",
        "key",
        "e",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/nativestore/pdp/domain/api/PdpApi;",
        "b",
        "Ltr2/n;",
        "native-store_release"
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
.field private final a:Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc02/c;->a:Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

    .line 3
    iput-object p2, p0, Lc02/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "SizeGuideInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lc02/c;-><init>(Lcom/whoop/nativestore/pdp/domain/api/PdpApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lc02/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lc02/c;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lc02/c;)Lcom/whoop/nativestore/pdp/domain/api/PdpApi;
    .locals 0

    iget-object p0, p0, Lc02/c;->a:Lcom/whoop/nativestore/pdp/domain/api/PdpApi;

    return-object p0
.end method

.method private final e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lc02/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lc02/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lc02/c$a;

    iget v1, v0, Lc02/c$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lc02/c$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lc02/c$a;

    invoke-direct {v0, p0, p2}, Lc02/c$a;-><init>(Lc02/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lc02/c$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lc02/c$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lc02/c$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lc02/c;->b:Ltr2/n;

    new-instance v5, Lc02/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lc02/c$b;-><init>(Lc02/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lc02/c$a;->w:Ljava/lang/Object;

    iput p2, v6, Lc02/c$a;->z:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    invoke-static {p2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;

    if-nez p1, :cond_4

    sget-object p1, Lc02/b$a;->a:Lc02/b$a;

    return-object p1

    :cond_4
    new-instance p2, Lc02/b$b;

    invoke-direct {p2, p1}, Lc02/b$b;-><init>(Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;)V

    return-object p2
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

    new-instance v0, Lc02/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lc02/c$c;-><init>(Lq83/d;Lc02/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
