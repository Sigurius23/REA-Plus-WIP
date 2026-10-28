.class public final enum Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "DEFAULT",
        "NUMBER",
        "PHONE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

.field public static final enum DEFAULT:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

.field public static final enum NUMBER:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

.field public static final enum PHONE:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

.field public static final enum UNKNOWN:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    sget-object v1, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->NUMBER:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    sget-object v2, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->PHONE:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    sget-object v3, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->UNKNOWN:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    new-instance v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    const-string v1, "NUMBER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->NUMBER:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    new-instance v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    const-string v1, "PHONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->PHONE:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    new-instance v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->UNKNOWN:Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    invoke-static {}, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->$values()[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->$VALUES:[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;->$VALUES:[Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/form/FormTextFieldKeyboardType;

    return-object v0
.end method
