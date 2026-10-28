.class public final La02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "La02/a;",
        "",
        "<init>",
        "()V",
        "Lb02/c$f;",
        "event",
        "Lb02/c;",
        "a",
        "(Lb02/c$f;)Lb02/c;",
        "Lb02/c$h;",
        "b",
        "(Lb02/c$h;)Lb02/c;",
        "c",
        "(Ljava/lang/Object;)Lb02/c;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lb02/c$f;)Lb02/c;
    .locals 4

    invoke-virtual {p1}, Lb02/c$f;->b()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$c6;->w:Lcom/whoop/navigation/AppScreen$c6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lb02/c$f;->a()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object p1

    if-eqz p1, :cond_4

    new-instance v0, Lb02/c$a;

    invoke-direct {v0, p1}, Lb02/c$a;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)V

    return-object v0

    :cond_0
    sget-object v1, Lcom/whoop/navigation/AppScreen$b6;->w:Lcom/whoop/navigation/AppScreen$b6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lb02/c$f;->a()Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lb02/c$d;

    invoke-virtual {p1}, Lb02/c$f;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    instance-of v3, p1, Lcom/whoop/navigation/UniversalBuyNowScreenModel;

    if-eqz v3, :cond_1

    check-cast p1, Lcom/whoop/navigation/UniversalBuyNowScreenModel;

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getStoreDomain()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-direct {v1, v0, v2}, Lb02/c$d;-><init>(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;Ljava/lang/String;)V

    return-object v1

    :cond_3
    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    return-object v2

    :cond_5
    new-instance v0, Lb02/c$c;

    invoke-virtual {p1}, Lb02/c$f;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lb02/c$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private final b(Lb02/c$h;)Lb02/c;
    .locals 2

    invoke-virtual {p1}, Lb02/c$h;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lh02/k0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lh02/k0;

    invoke-virtual {p1}, Lh02/k0;->a()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/nativestore/pdp/domain/model/SizeChart;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lb02/c$c;

    invoke-direct {v0, p1}, Lb02/c$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Lb02/c;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lb02/c$h;

    if-eqz v0, :cond_0

    check-cast p1, Lb02/c$h;

    invoke-direct {p0, p1}, La02/a;->b(Lb02/c$h;)Lb02/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lb02/c$f;

    if-eqz v0, :cond_1

    check-cast p1, Lb02/c$f;

    invoke-direct {p0, p1}, La02/a;->a(Lb02/c$f;)Lb02/c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lb02/c;

    if-eqz v0, :cond_2

    check-cast p1, Lb02/c;

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_3

    new-instance v0, Lb02/c$c;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {v0, p1}, Lb02/c$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method
