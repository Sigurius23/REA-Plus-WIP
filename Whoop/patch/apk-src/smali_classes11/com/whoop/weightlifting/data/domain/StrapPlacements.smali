.class public final enum Lcom/whoop/weightlifting/data/domain/StrapPlacements;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/weightlifting/data/domain/StrapPlacements;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/StrapPlacements;",
        "",
        "nameResourceId",
        "",
        "laterality",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "<init>",
        "(Ljava/lang/String;IILcom/whoop/weightlifting/data/domain/StrapLaterality;)V",
        "getNameResourceId",
        "()I",
        "getLaterality",
        "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "RIGHT_WRIST",
        "LEFT_WRIST",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/weightlifting/data/domain/StrapPlacements;

.field public static final enum LEFT_WRIST:Lcom/whoop/weightlifting/data/domain/StrapPlacements;

.field public static final enum RIGHT_WRIST:Lcom/whoop/weightlifting/data/domain/StrapPlacements;


# instance fields
.field private final laterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

.field private final nameResourceId:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/weightlifting/data/domain/StrapPlacements;
    .locals 2

    sget-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->RIGHT_WRIST:Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->LEFT_WRIST:Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    filled-new-array {v0, v1}, [Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    sget v1, Lcu2/h;->K:I

    sget-object v2, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->Right:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    const-string v3, "RIGHT_WRIST"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/weightlifting/data/domain/StrapPlacements;-><init>(Ljava/lang/String;IILcom/whoop/weightlifting/data/domain/StrapLaterality;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->RIGHT_WRIST:Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    new-instance v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    sget v1, Lcu2/h;->J:I

    sget-object v2, Lcom/whoop/weightlifting/data/domain/StrapLaterality;->Left:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    const-string v3, "LEFT_WRIST"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/weightlifting/data/domain/StrapPlacements;-><init>(Ljava/lang/String;IILcom/whoop/weightlifting/data/domain/StrapLaterality;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->LEFT_WRIST:Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->$values()[Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    move-result-object v0

    sput-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->$VALUES:[Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/whoop/weightlifting/data/domain/StrapLaterality;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->nameResourceId:I

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->laterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

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

    sget-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/StrapPlacements;
    .locals 1

    const-class v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    return-object p0
.end method

.method public static values()[Lcom/whoop/weightlifting/data/domain/StrapPlacements;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->$VALUES:[Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/weightlifting/data/domain/StrapPlacements;

    return-object v0
.end method


# virtual methods
.method public final getLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->laterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final getNameResourceId()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/domain/StrapPlacements;->nameResourceId:I

    return v0
.end method
