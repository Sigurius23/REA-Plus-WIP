.class public final enum Lcom/whoop/weightlifting/data/domain/WeightUnits;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/weightlifting/data/domain/WeightUnits;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WeightUnits;",
        "",
        "nameResourceId",
        "",
        "unit",
        "Lcom/whoop/domain/model/UnitSystem;",
        "<init>",
        "(Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V",
        "getNameResourceId",
        "()I",
        "getUnit",
        "()Lcom/whoop/domain/model/UnitSystem;",
        "LBS",
        "KG",
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


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/whoop/weightlifting/data/domain/WeightUnits;

.field public static final enum KG:Lcom/whoop/weightlifting/data/domain/WeightUnits;

.field public static final enum LBS:Lcom/whoop/weightlifting/data/domain/WeightUnits;


# instance fields
.field private final nameResourceId:I

.field private final unit:Lcom/whoop/domain/model/UnitSystem;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/weightlifting/data/domain/WeightUnits;
    .locals 2

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->LBS:Lcom/whoop/weightlifting/data/domain/WeightUnits;

    sget-object v1, Lcom/whoop/weightlifting/data/domain/WeightUnits;->KG:Lcom/whoop/weightlifting/data/domain/WeightUnits;

    filled-new-array {v0, v1}, [Lcom/whoop/weightlifting/data/domain/WeightUnits;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;

    sget v1, Lcu2/h;->b:I

    sget-object v2, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    const-string v3, "LBS"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/weightlifting/data/domain/WeightUnits;-><init>(Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->LBS:Lcom/whoop/weightlifting/data/domain/WeightUnits;

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;

    sget v1, Lcu2/h;->a:I

    sget-object v2, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    const-string v3, "KG"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/whoop/weightlifting/data/domain/WeightUnits;-><init>(Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->KG:Lcom/whoop/weightlifting/data/domain/WeightUnits;

    invoke-static {}, Lcom/whoop/weightlifting/data/domain/WeightUnits;->$values()[Lcom/whoop/weightlifting/data/domain/WeightUnits;

    move-result-object v0

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->$VALUES:[Lcom/whoop/weightlifting/data/domain/WeightUnits;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILcom/whoop/domain/model/UnitSystem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/domain/model/UnitSystem;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->nameResourceId:I

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->unit:Lcom/whoop/domain/model/UnitSystem;

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

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WeightUnits;
    .locals 1

    const-class v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/weightlifting/data/domain/WeightUnits;

    return-object p0
.end method

.method public static values()[Lcom/whoop/weightlifting/data/domain/WeightUnits;
    .locals 1

    sget-object v0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->$VALUES:[Lcom/whoop/weightlifting/data/domain/WeightUnits;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/weightlifting/data/domain/WeightUnits;

    return-object v0
.end method


# virtual methods
.method public final getNameResourceId()I
    .locals 1

    iget v0, p0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->nameResourceId:I

    return v0
.end method

.method public final getUnit()Lcom/whoop/domain/model/UnitSystem;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightUnits;->unit:Lcom/whoop/domain/model/UnitSystem;

    return-object v0
.end method
