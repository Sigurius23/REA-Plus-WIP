.class final Lrn2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb1/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrn2/b;",
        "Ljb1/d;",
        "<init>",
        "()V",
        "Llb1/y0;",
        "a",
        "()Llb1/y0;",
        "universal-checkout_release"
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

.method public static synthetic b(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;
    .locals 0

    invoke-static {p0}, Lrn2/b;->d(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;
    .locals 0

    invoke-static {p0}, Lrn2/b;->e(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwn2/d;->m(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;)Lxn2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lwn2/d;->l(Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;)Lxn2/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Llb1/y0;
    .locals 5

    new-instance v0, Llb1/z0;

    invoke-direct {v0}, Llb1/z0;-><init>()V

    new-instance v1, Lrn2/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lrn2/a;-><init>(I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowItemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lrn2/b$a;

    invoke-direct {v4, v1}, Lrn2/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v3, v4}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lrn2/a;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Lrn2/a;-><init>(I)V

    const-class v3, Lcom/whoop/universalcheckout/features/buynow/domain/models/items/BuyNowCheckoutInfoModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lrn2/b$b;

    invoke-direct {v3, v1}, Lrn2/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Llb1/z0;->b()Llb1/y0;

    move-result-object v0

    return-object v0
.end method
