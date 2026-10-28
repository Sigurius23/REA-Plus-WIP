.class public final enum Lcom/whoop/design/models/items/FileViewerModel$FileType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/items/FileViewerModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FileType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/FileViewerModel$FileType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/models/items/FileViewerModel$FileType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "IMAGE",
        "PDF",
        "UNKNOWN",
        "design-models_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/FileViewerModel$FileType;

.field public static final enum IMAGE:Lcom/whoop/design/models/items/FileViewerModel$FileType;

.field public static final enum PDF:Lcom/whoop/design/models/items/FileViewerModel$FileType;

.field public static final enum UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/FileViewerModel$FileType;
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->IMAGE:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    sget-object v1, Lcom/whoop/design/models/items/FileViewerModel$FileType;->PDF:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    sget-object v2, Lcom/whoop/design/models/items/FileViewerModel$FileType;->UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/design/models/items/FileViewerModel$FileType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/FileViewerModel$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->IMAGE:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    new-instance v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;

    const-string v1, "PDF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/FileViewerModel$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->PDF:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    new-instance v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/FileViewerModel$FileType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$FileType;->$values()[Lcom/whoop/design/models/items/FileViewerModel$FileType;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->$VALUES:[Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/FileViewerModel$FileType;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/FileViewerModel$FileType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/FileViewerModel$FileType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileType;->$VALUES:[Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/FileViewerModel$FileType;

    return-object v0
.end method
