.class public final enum Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "PENDING",
        "TRIALING",
        "ACTIVE",
        "PAST_DUE",
        "INVALID",
        "CANCELED",
        "ELITE",
        "LEGACY",
        "needsSubscription",
        "",
        "getNeedsSubscription",
        "()Z",
        "doesNotExpire",
        "getDoesNotExpire",
        "isInSubscriptionPeriod",
        "isPayingMember",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum ACTIVE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum CANCELED:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final Companion:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;

.field public static final enum ELITE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum INVALID:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum LEGACY:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum PAST_DUE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum PENDING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

.field public static final enum TRIALING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;
    .locals 8

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->PENDING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->TRIALING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v2, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ACTIVE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v3, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->PAST_DUE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v4, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->INVALID:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v5, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->CANCELED:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v6, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ELITE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    sget-object v7, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->LEGACY:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    filled-new-array/range {v0 .. v7}, [Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x0

    const-string v2, "whoop-pending"

    const-string v3, "PENDING"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->PENDING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x1

    const-string v2, "trialing"

    const-string v3, "TRIALING"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->TRIALING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x2

    const-string v2, "active"

    const-string v3, "ACTIVE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ACTIVE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x3

    const-string v2, "past_due"

    const-string v3, "PAST_DUE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->PAST_DUE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x4

    const-string v2, "invalid"

    const-string v3, "INVALID"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->INVALID:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x5

    const-string v2, "canceled"

    const-string v3, "CANCELED"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->CANCELED:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x6

    const-string v2, "elite"

    const-string v3, "ELITE"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ELITE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    const/4 v1, 0x7

    const-string v2, "legacy"

    const-string v3, "LEGACY"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->LEGACY:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->$values()[Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->$VALUES:[Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->Companion:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus$Companion;

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

    iput-object p3, p0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->value:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;
    .locals 1

    const-class v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    return-object p0
.end method

.method public static values()[Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->$VALUES:[Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    return-object v0
.end method


# virtual methods
.method public final getDoesNotExpire()Z
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ELITE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->LEGACY:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getNeedsSubscription()Z
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->INVALID:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->CANCELED:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->value:Ljava/lang/String;

    return-object v0
.end method

.method public final isInSubscriptionPeriod()Z
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->TRIALING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ACTIVE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isPayingMember()Z
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->ACTIVE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->TRIALING:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;->PAST_DUE:Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
