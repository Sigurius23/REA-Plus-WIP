.class public final enum Lcom/whoop/domain/model/Gender;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/Gender$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/Gender;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/domain/model/Gender;",
        "",
        "value",
        "",
        "displayResId",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;I)V",
        "getValue",
        "()Ljava/lang/String;",
        "getDisplayResId",
        "()I",
        "MALE",
        "FEMALE",
        "NON_BINARY",
        "PREFER_NOT_TO_SAY",
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

.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/Gender;

.field public static final Companion:Lcom/whoop/domain/model/Gender$Companion;

.field public static final enum FEMALE:Lcom/whoop/domain/model/Gender;

.field public static final enum MALE:Lcom/whoop/domain/model/Gender;

.field public static final enum NON_BINARY:Lcom/whoop/domain/model/Gender;

.field public static final enum PREFER_NOT_TO_SAY:Lcom/whoop/domain/model/Gender;


# instance fields
.field private final displayResId:I

.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/domain/model/Gender;
    .locals 4

    sget-object v0, Lcom/whoop/domain/model/Gender;->MALE:Lcom/whoop/domain/model/Gender;

    sget-object v1, Lcom/whoop/domain/model/Gender;->FEMALE:Lcom/whoop/domain/model/Gender;

    sget-object v2, Lcom/whoop/domain/model/Gender;->NON_BINARY:Lcom/whoop/domain/model/Gender;

    sget-object v3, Lcom/whoop/domain/model/Gender;->PREFER_NOT_TO_SAY:Lcom/whoop/domain/model/Gender;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/domain/model/Gender;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/domain/model/Gender;

    const-string v1, "male"

    sget v2, Luv0/c;->Q:I

    const-string v3, "MALE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/Gender;->MALE:Lcom/whoop/domain/model/Gender;

    new-instance v0, Lcom/whoop/domain/model/Gender;

    const-string v1, "female"

    sget v2, Luv0/c;->O:I

    const-string v3, "FEMALE"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/Gender;->FEMALE:Lcom/whoop/domain/model/Gender;

    new-instance v0, Lcom/whoop/domain/model/Gender;

    const-string v1, "non-binary"

    sget v2, Luv0/c;->S:I

    const-string v3, "NON_BINARY"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/Gender;->NON_BINARY:Lcom/whoop/domain/model/Gender;

    new-instance v0, Lcom/whoop/domain/model/Gender;

    const-string v1, "i prefer not to choose"

    sget v2, Luv0/c;->T:I

    const-string v3, "PREFER_NOT_TO_SAY"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/Gender;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/Gender;->PREFER_NOT_TO_SAY:Lcom/whoop/domain/model/Gender;

    invoke-static {}, Lcom/whoop/domain/model/Gender;->$values()[Lcom/whoop/domain/model/Gender;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/Gender;->$VALUES:[Lcom/whoop/domain/model/Gender;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/Gender;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/domain/model/Gender$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/Gender$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/Gender;->Companion:Lcom/whoop/domain/model/Gender$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/domain/model/Gender;->value:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/domain/model/Gender;->displayResId:I

    return-void
.end method

.method public static final fromName(Ljava/lang/String;)Lcom/whoop/domain/model/Gender;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/Gender;->Companion:Lcom/whoop/domain/model/Gender$Companion;

    invoke-virtual {v0, p0}, Lcom/whoop/domain/model/Gender$Companion;->fromName(Ljava/lang/String;)Lcom/whoop/domain/model/Gender;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/domain/model/Gender;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/Gender;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/Gender;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/Gender;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/Gender;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/Gender;->$VALUES:[Lcom/whoop/domain/model/Gender;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/Gender;

    return-object v0
.end method


# virtual methods
.method public final getDisplayResId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/Gender;->displayResId:I

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/Gender;->value:Ljava/lang/String;

    return-object v0
.end method
