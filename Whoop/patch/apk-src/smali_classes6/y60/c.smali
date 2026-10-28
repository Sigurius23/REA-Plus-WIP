.class public final Ly60/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ly60/a;",
        "Ly60/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Ly60/c;",
        "Lod1/g;",
        "Ly60/a;",
        "Ly60/b;",
        "Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;Ltr2/n;)V",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;",
        "b",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly60/c;->a:Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    .line 3
    iput-object p2, p0, Ly60/c;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "DayZeroSplashInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ly60/c;-><init>(Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Ly60/c;)Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;
    .locals 0

    iget-object p0, p0, Ly60/c;->a:Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    return-object p0
.end method

.method public static final synthetic d(Ly60/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ly60/c;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ly60/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ly60/c$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ly60/c$c;

    iget v1, v0, Ly60/c$c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ly60/c$c;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ly60/c$c;

    invoke-direct {v0, p0, p1}, Ly60/c$c;-><init>(Ly60/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Ly60/c$c;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ly60/c$c;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Ly60/c;->b:Ltr2/n;

    new-instance v5, Ly60/c$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Ly60/c$d;-><init>(Ly60/c;Lq83/d;)V

    iput p1, v6, Ly60/c$c;->y:I

    const-string v4, "Failed to load Day-0 splash"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    new-instance v0, Ly60/b;

    invoke-static {p1}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;

    const/4 v2, 0x0

    instance-of p1, p1, Lu02/a$b;

    invoke-direct {v0, v1, v2, p1}, Ly60/b;-><init>(Lcom/whoop/activation/dayzero/model/DayZeroSplashResponse;ZZ)V

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

    new-instance v0, Ly60/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ly60/c$a;-><init>(Lq83/d;Ly60/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
