.class public final enum Lhy0/z;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhy0/z;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lhy0/z;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NO_DATA",
        "ACTIVITY_COMPLETE",
        "BEHAVIOR_COMPLETE",
        "INCOMPLETE",
        "PENDING",
        "CURRENT",
        "CURRENT_PENDING",
        "design_release"
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

.field private static final synthetic $VALUES:[Lhy0/z;

.field public static final enum ACTIVITY_COMPLETE:Lhy0/z;

.field public static final enum BEHAVIOR_COMPLETE:Lhy0/z;

.field public static final enum CURRENT:Lhy0/z;

.field public static final enum CURRENT_PENDING:Lhy0/z;

.field public static final enum INCOMPLETE:Lhy0/z;

.field public static final enum NO_DATA:Lhy0/z;

.field public static final enum PENDING:Lhy0/z;


# direct methods
.method private static final synthetic $values()[Lhy0/z;
    .locals 7

    sget-object v0, Lhy0/z;->NO_DATA:Lhy0/z;

    sget-object v1, Lhy0/z;->ACTIVITY_COMPLETE:Lhy0/z;

    sget-object v2, Lhy0/z;->BEHAVIOR_COMPLETE:Lhy0/z;

    sget-object v3, Lhy0/z;->INCOMPLETE:Lhy0/z;

    sget-object v4, Lhy0/z;->PENDING:Lhy0/z;

    sget-object v5, Lhy0/z;->CURRENT:Lhy0/z;

    sget-object v6, Lhy0/z;->CURRENT_PENDING:Lhy0/z;

    filled-new-array/range {v0 .. v6}, [Lhy0/z;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhy0/z;

    const-string v1, "NO_DATA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->NO_DATA:Lhy0/z;

    new-instance v0, Lhy0/z;

    const-string v1, "ACTIVITY_COMPLETE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->ACTIVITY_COMPLETE:Lhy0/z;

    new-instance v0, Lhy0/z;

    const-string v1, "BEHAVIOR_COMPLETE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->BEHAVIOR_COMPLETE:Lhy0/z;

    new-instance v0, Lhy0/z;

    const-string v1, "INCOMPLETE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->INCOMPLETE:Lhy0/z;

    new-instance v0, Lhy0/z;

    const-string v1, "PENDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->PENDING:Lhy0/z;

    new-instance v0, Lhy0/z;

    const-string v1, "CURRENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->CURRENT:Lhy0/z;

    new-instance v0, Lhy0/z;

    const-string v1, "CURRENT_PENDING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lhy0/z;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhy0/z;->CURRENT_PENDING:Lhy0/z;

    invoke-static {}, Lhy0/z;->$values()[Lhy0/z;

    move-result-object v0

    sput-object v0, Lhy0/z;->$VALUES:[Lhy0/z;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lhy0/z;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lhy0/z;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhy0/z;
    .locals 1

    const-class v0, Lhy0/z;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhy0/z;

    return-object p0
.end method

.method public static values()[Lhy0/z;
    .locals 1

    sget-object v0, Lhy0/z;->$VALUES:[Lhy0/z;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhy0/z;

    return-object v0
.end method
