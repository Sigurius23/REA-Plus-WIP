.class public final enum Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lxr2/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;",
        ">;",
        "Lxr2/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;",
        "Lxr2/a;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getSerializedValue",
        "()Ljava/lang/String;",
        "US",
        "EU",
        "AU",
        "UK",
        "UAE",
        "IN",
        "QA",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum AU:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum EU:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum IN:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum QA:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum UAE:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum UK:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

.field public static final enum US:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;


# instance fields
.field private final serializedValue:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;
    .locals 7

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->US:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->EU:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->AU:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    sget-object v3, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->UK:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    sget-object v4, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->UAE:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    sget-object v5, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->IN:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    sget-object v6, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->QA:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    filled-new-array/range {v0 .. v6}, [Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x0

    const-string v2, "domestic"

    const-string v3, "US"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->US:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x1

    const-string v2, "international"

    const-string v3, "EU"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->EU:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x2

    const-string v2, "australia"

    const-string v3, "AU"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->AU:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x3

    const-string v2, "uk"

    const-string v3, "UK"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->UK:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x4

    const-string v2, "uae"

    const-string v3, "UAE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->UAE:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x5

    const-string v2, "in"

    const-string v3, "IN"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->IN:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    const/4 v1, 0x6

    const-string v2, "qa"

    const-string v3, "QA"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->QA:Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    invoke-static {}, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->$values()[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->$VALUES:[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->serializedValue:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;
    .locals 1

    const-class v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    return-object p0
.end method

.method public static values()[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->$VALUES:[Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;

    return-object v0
.end method


# virtual methods
.method public getSerializedValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/growth/CheckoutOrigin;->serializedValue:Ljava/lang/String;

    return-object v0
.end method
