.class public final enum Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "ONE",
        "PEAK",
        "LIFE",
        "PLAIN",
        "membership_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

.field public static final enum LIFE:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

.field public static final enum ONE:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

.field public static final enum PEAK:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

.field public static final enum PLAIN:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;
    .locals 4

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->ONE:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    sget-object v1, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->PEAK:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    sget-object v2, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->LIFE:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    sget-object v3, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->PLAIN:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    const-string v1, "ONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->ONE:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    const-string v1, "PEAK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->PEAK:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    const-string v1, "LIFE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->LIFE:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    new-instance v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    const-string v1, "PLAIN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->PLAIN:Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    invoke-static {}, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->$values()[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->$VALUES:[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

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

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;
    .locals 1

    const-class v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;
    .locals 1

    sget-object v0, Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;->$VALUES:[Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/membership/management/domain/models/items/MembershipCardStyle;

    return-object v0
.end method
