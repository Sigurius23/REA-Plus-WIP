.class public final enum Lcom/whoop/design/models/items/TextInputKeyboardType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/TextInputKeyboardType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/TextInputKeyboardType;",
        "",
        "Lq3/n;",
        "type",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getType-PjHm6EE",
        "()I",
        "EMAIL",
        "NUMBER",
        "PHONE",
        "DEFAULT",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/TextInputKeyboardType;

.field public static final enum DEFAULT:Lcom/whoop/design/models/items/TextInputKeyboardType;

.field public static final enum EMAIL:Lcom/whoop/design/models/items/TextInputKeyboardType;

.field public static final enum NUMBER:Lcom/whoop/design/models/items/TextInputKeyboardType;

.field public static final enum PHONE:Lcom/whoop/design/models/items/TextInputKeyboardType;


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/TextInputKeyboardType;
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->EMAIL:Lcom/whoop/design/models/items/TextInputKeyboardType;

    sget-object v1, Lcom/whoop/design/models/items/TextInputKeyboardType;->NUMBER:Lcom/whoop/design/models/items/TextInputKeyboardType;

    sget-object v2, Lcom/whoop/design/models/items/TextInputKeyboardType;->PHONE:Lcom/whoop/design/models/items/TextInputKeyboardType;

    sget-object v3, Lcom/whoop/design/models/items/TextInputKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/TextInputKeyboardType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/design/models/items/TextInputKeyboardType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/TextInputKeyboardType;

    const/4 v1, 0x0

    const/4 v2, 0x6

    const-string v3, "EMAIL"

    invoke-direct {v0, v3, v1, v2}, Lcom/whoop/design/models/items/TextInputKeyboardType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->EMAIL:Lcom/whoop/design/models/items/TextInputKeyboardType;

    new-instance v0, Lcom/whoop/design/models/items/TextInputKeyboardType;

    const-string v1, "NUMBER"

    const/4 v2, 0x1

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/design/models/items/TextInputKeyboardType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->NUMBER:Lcom/whoop/design/models/items/TextInputKeyboardType;

    new-instance v0, Lcom/whoop/design/models/items/TextInputKeyboardType;

    const/4 v1, 0x2

    const/4 v4, 0x4

    const-string v5, "PHONE"

    invoke-direct {v0, v5, v1, v4}, Lcom/whoop/design/models/items/TextInputKeyboardType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->PHONE:Lcom/whoop/design/models/items/TextInputKeyboardType;

    new-instance v0, Lcom/whoop/design/models/items/TextInputKeyboardType;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v3, v2}, Lcom/whoop/design/models/items/TextInputKeyboardType;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->DEFAULT:Lcom/whoop/design/models/items/TextInputKeyboardType;

    invoke-static {}, Lcom/whoop/design/models/items/TextInputKeyboardType;->$values()[Lcom/whoop/design/models/items/TextInputKeyboardType;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->$VALUES:[Lcom/whoop/design/models/items/TextInputKeyboardType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/design/models/items/TextInputKeyboardType;->type:I

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

    sget-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/TextInputKeyboardType;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/TextInputKeyboardType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/TextInputKeyboardType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/TextInputKeyboardType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/TextInputKeyboardType;->$VALUES:[Lcom/whoop/design/models/items/TextInputKeyboardType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/TextInputKeyboardType;

    return-object v0
.end method


# virtual methods
.method public final getType-PjHm6EE()I
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/TextInputKeyboardType;->type:I

    return v0
.end method
