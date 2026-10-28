.class public final enum Lcom/whoop/domain/model/GenderBaseline;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/GenderBaseline$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/GenderBaseline;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/domain/model/GenderBaseline;",
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
        "AVERAGE_OF_BOTH",
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

.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/GenderBaseline;

.field public static final enum AVERAGE_OF_BOTH:Lcom/whoop/domain/model/GenderBaseline;

.field public static final Companion:Lcom/whoop/domain/model/GenderBaseline$Companion;

.field public static final enum FEMALE:Lcom/whoop/domain/model/GenderBaseline;

.field public static final enum MALE:Lcom/whoop/domain/model/GenderBaseline;


# instance fields
.field private final displayResId:I

.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/domain/model/GenderBaseline;
    .locals 3

    sget-object v0, Lcom/whoop/domain/model/GenderBaseline;->MALE:Lcom/whoop/domain/model/GenderBaseline;

    sget-object v1, Lcom/whoop/domain/model/GenderBaseline;->FEMALE:Lcom/whoop/domain/model/GenderBaseline;

    sget-object v2, Lcom/whoop/domain/model/GenderBaseline;->AVERAGE_OF_BOTH:Lcom/whoop/domain/model/GenderBaseline;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/domain/model/GenderBaseline;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/domain/model/GenderBaseline;

    const-string v1, "male"

    sget v2, Luv0/c;->R:I

    const-string v3, "MALE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/GenderBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/GenderBaseline;->MALE:Lcom/whoop/domain/model/GenderBaseline;

    new-instance v0, Lcom/whoop/domain/model/GenderBaseline;

    const-string v1, "female"

    sget v2, Luv0/c;->P:I

    const-string v3, "FEMALE"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/GenderBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/GenderBaseline;->FEMALE:Lcom/whoop/domain/model/GenderBaseline;

    new-instance v0, Lcom/whoop/domain/model/GenderBaseline;

    const-string v1, "average"

    sget v2, Luv0/c;->U:I

    const-string v3, "AVERAGE_OF_BOTH"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/domain/model/GenderBaseline;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    sput-object v0, Lcom/whoop/domain/model/GenderBaseline;->AVERAGE_OF_BOTH:Lcom/whoop/domain/model/GenderBaseline;

    invoke-static {}, Lcom/whoop/domain/model/GenderBaseline;->$values()[Lcom/whoop/domain/model/GenderBaseline;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/GenderBaseline;->$VALUES:[Lcom/whoop/domain/model/GenderBaseline;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/GenderBaseline;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/domain/model/GenderBaseline$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/GenderBaseline$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/GenderBaseline;->Companion:Lcom/whoop/domain/model/GenderBaseline$Companion;

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

    iput-object p3, p0, Lcom/whoop/domain/model/GenderBaseline;->value:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/domain/model/GenderBaseline;->displayResId:I

    return-void
.end method

.method public static final fromName(Ljava/lang/String;)Lcom/whoop/domain/model/GenderBaseline;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/GenderBaseline;->Companion:Lcom/whoop/domain/model/GenderBaseline$Companion;

    invoke-virtual {v0, p0}, Lcom/whoop/domain/model/GenderBaseline$Companion;->fromName(Ljava/lang/String;)Lcom/whoop/domain/model/GenderBaseline;

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

    sget-object v0, Lcom/whoop/domain/model/GenderBaseline;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/GenderBaseline;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/GenderBaseline;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/GenderBaseline;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/GenderBaseline;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/GenderBaseline;->$VALUES:[Lcom/whoop/domain/model/GenderBaseline;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/GenderBaseline;

    return-object v0
.end method


# virtual methods
.method public final getDisplayResId()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/GenderBaseline;->displayResId:I

    return v0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/GenderBaseline;->value:Ljava/lang/String;

    return-object v0
.end method
