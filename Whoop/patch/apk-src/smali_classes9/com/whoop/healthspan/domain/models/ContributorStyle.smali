.class public final enum Lcom/whoop/healthspan/domain/models/ContributorStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/healthspan/domain/models/ContributorStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/healthspan/domain/models/ContributorStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "YOUNGER_4",
        "YOUNGER_3",
        "YOUNGER_2",
        "YOUNGER_1",
        "NEUTRAL",
        "OLDER_1",
        "OLDER_2",
        "OLDER_3",
        "OLDER_4",
        "DISABLED_0",
        "DISABLED_1",
        "DISABLED_2",
        "DISABLED_3",
        "DISABLED_4",
        "healthspan_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum DISABLED_0:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum DISABLED_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum DISABLED_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum DISABLED_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum DISABLED_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum NEUTRAL:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum OLDER_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum OLDER_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum OLDER_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum OLDER_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum YOUNGER_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum YOUNGER_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum YOUNGER_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

.field public static final enum YOUNGER_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/healthspan/domain/models/ContributorStyle;
    .locals 14

    sget-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v1, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v2, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v3, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v4, Lcom/whoop/healthspan/domain/models/ContributorStyle;->NEUTRAL:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v5, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v6, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v7, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v8, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v9, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_0:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v10, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v11, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v12, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    sget-object v13, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    filled-new-array/range {v0 .. v13}, [Lcom/whoop/healthspan/domain/models/ContributorStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "YOUNGER_4"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "YOUNGER_3"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "YOUNGER_2"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "YOUNGER_1"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->YOUNGER_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "NEUTRAL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->NEUTRAL:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "OLDER_1"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "OLDER_2"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "OLDER_3"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "OLDER_4"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->OLDER_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "DISABLED_0"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_0:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "DISABLED_1"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_1:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "DISABLED_2"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_2:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "DISABLED_3"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_3:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    new-instance v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    const-string v1, "DISABLED_4"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/whoop/healthspan/domain/models/ContributorStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->DISABLED_4:Lcom/whoop/healthspan/domain/models/ContributorStyle;

    invoke-static {}, Lcom/whoop/healthspan/domain/models/ContributorStyle;->$values()[Lcom/whoop/healthspan/domain/models/ContributorStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->$VALUES:[Lcom/whoop/healthspan/domain/models/ContributorStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/healthspan/domain/models/ContributorStyle;
    .locals 1

    const-class v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/healthspan/domain/models/ContributorStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/healthspan/domain/models/ContributorStyle;
    .locals 1

    sget-object v0, Lcom/whoop/healthspan/domain/models/ContributorStyle;->$VALUES:[Lcom/whoop/healthspan/domain/models/ContributorStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/healthspan/domain/models/ContributorStyle;

    return-object v0
.end method
