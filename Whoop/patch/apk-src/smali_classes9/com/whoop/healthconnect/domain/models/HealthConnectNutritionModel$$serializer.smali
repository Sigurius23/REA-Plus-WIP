.class public final synthetic Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/healthconnect/domain/models/HealthConnectNutritionModel.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "health-connect_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;

    invoke-direct {v0}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.healthconnect.domain.models.HealthConnectNutritionModel"

    const/16 v3, 0x32

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "startTime"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "startZoneOffset"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endTime"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "endZoneOffset"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "biotin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "caffeine"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "calcium"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "energy"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "energyFromFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "chloride"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "cholesterol"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "chromium"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "copper"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "dietaryFiber"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "folate"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "folicAcid"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "iodine"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "iron"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "magnesium"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "manganese"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "molybdenum"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "monounsaturatedFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "niacin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "pantothenicAcid"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "phosphorus"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "polyunsaturatedFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "potassium"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "protein"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "riboflavin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "saturatedFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "selenium"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sodium"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "sugar"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "thiamin"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "totalCarbohydrate"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "totalFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "transFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "unsaturatedFat"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminA"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminB12"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminB6"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminC"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminD"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminE"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "vitaminK"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "zinc"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "mealType"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "metadata"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "deviceZoneId"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v2

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v10

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v11

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v12

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v13

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v14

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v15

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v16

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v17

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v18

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v19

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v20

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v21

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v22

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v23

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v24

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v25

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v26

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v27

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v28

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v29

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v30

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v31

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v32

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v33

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v34

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v35

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v36

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v37

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v38

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v39

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v40

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v41

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v42

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v43

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v44

    invoke-static {v3}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v3

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v45

    move-object/from16 v46, v0

    const/16 v0, 0x32

    new-array v0, v0, [Lwc3/c;

    const/16 v47, 0x0

    aput-object v46, v0, v47

    const/16 v47, 0x1

    aput-object v1, v0, v47

    const/4 v1, 0x2

    aput-object v46, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v4, v0, v1

    const/4 v1, 0x5

    aput-object v5, v0, v1

    const/4 v1, 0x6

    aput-object v6, v0, v1

    const/4 v1, 0x7

    aput-object v7, v0, v1

    const/16 v1, 0x8

    aput-object v8, v0, v1

    const/16 v1, 0x9

    aput-object v9, v0, v1

    const/16 v1, 0xa

    aput-object v10, v0, v1

    const/16 v1, 0xb

    aput-object v11, v0, v1

    const/16 v1, 0xc

    aput-object v12, v0, v1

    const/16 v1, 0xd

    aput-object v13, v0, v1

    const/16 v1, 0xe

    aput-object v14, v0, v1

    const/16 v1, 0xf

    aput-object v15, v0, v1

    const/16 v1, 0x10

    aput-object v16, v0, v1

    const/16 v1, 0x11

    aput-object v17, v0, v1

    const/16 v1, 0x12

    aput-object v18, v0, v1

    const/16 v1, 0x13

    aput-object v19, v0, v1

    const/16 v1, 0x14

    aput-object v20, v0, v1

    const/16 v1, 0x15

    aput-object v21, v0, v1

    const/16 v1, 0x16

    aput-object v22, v0, v1

    const/16 v1, 0x17

    aput-object v23, v0, v1

    const/16 v1, 0x18

    aput-object v24, v0, v1

    const/16 v1, 0x19

    aput-object v25, v0, v1

    const/16 v1, 0x1a

    aput-object v26, v0, v1

    const/16 v1, 0x1b

    aput-object v27, v0, v1

    const/16 v1, 0x1c

    aput-object v28, v0, v1

    const/16 v1, 0x1d

    aput-object v29, v0, v1

    const/16 v1, 0x1e

    aput-object v30, v0, v1

    const/16 v1, 0x1f

    aput-object v31, v0, v1

    const/16 v1, 0x20

    aput-object v32, v0, v1

    const/16 v1, 0x21

    aput-object v33, v0, v1

    const/16 v1, 0x22

    aput-object v34, v0, v1

    const/16 v1, 0x23

    aput-object v35, v0, v1

    const/16 v1, 0x24

    aput-object v36, v0, v1

    const/16 v1, 0x25

    aput-object v37, v0, v1

    const/16 v1, 0x26

    aput-object v38, v0, v1

    const/16 v1, 0x27

    aput-object v39, v0, v1

    const/16 v1, 0x28

    aput-object v40, v0, v1

    const/16 v1, 0x29

    aput-object v41, v0, v1

    const/16 v1, 0x2a

    aput-object v42, v0, v1

    const/16 v1, 0x2b

    aput-object v43, v0, v1

    const/16 v1, 0x2c

    aput-object v44, v0, v1

    const/16 v1, 0x2d

    aput-object v3, v0, v1

    const/16 v1, 0x2e

    aput-object v45, v0, v1

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    const/16 v1, 0x31

    aput-object v46, v0, v1

    return-object v0
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;
    .locals 132

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v2

    const/16 v11, 0xa

    const/16 v12, 0x9

    const/4 v13, 0x7

    const/4 v14, 0x6

    const/4 v15, 0x5

    const/4 v3, 0x3

    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v8}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v2

    sget-object v8, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v7, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v3, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    sget-object v10, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v4, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-interface {v0, v1, v15, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Double;

    invoke-interface {v0, v1, v14, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Double;

    invoke-interface {v0, v1, v13, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Double;

    invoke-interface {v0, v1, v5, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    invoke-interface {v0, v1, v12, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Double;

    invoke-interface {v0, v1, v11, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Double;

    move-object/from16 v25, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v24, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v23, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v22, v2

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v21, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v20, v2

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v19, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v18, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v16, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 p1, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v26, v2

    const/16 v2, 0x15

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v27, v2

    const/16 v2, 0x16

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v28, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v29, v2

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v30, v2

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v31, v2

    const/16 v2, 0x1a

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v32, v2

    const/16 v2, 0x1b

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v33, v2

    const/16 v2, 0x1c

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v34, v2

    const/16 v2, 0x1d

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v35, v2

    const/16 v2, 0x1e

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v36, v2

    const/16 v2, 0x1f

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v37, v2

    const/16 v2, 0x20

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v17, v2

    const/16 v2, 0x21

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v38, v2

    const/16 v2, 0x22

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v39, v2

    const/16 v2, 0x23

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v40, v2

    const/16 v2, 0x24

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v41, v2

    const/16 v2, 0x25

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v42, v2

    const/16 v2, 0x26

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v43, v2

    const/16 v2, 0x27

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v44, v2

    const/16 v2, 0x28

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v45, v2

    const/16 v2, 0x29

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v46, v2

    const/16 v2, 0x2a

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v47, v2

    const/16 v2, 0x2b

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v48, v2

    const/16 v2, 0x2c

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    move-object/from16 v49, v2

    const/16 v2, 0x2d

    invoke-interface {v0, v1, v2, v10, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/16 v10, 0x2e

    invoke-interface {v0, v1, v10, v8, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    const/16 v10, 0x2f

    invoke-interface {v0, v1, v10}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v10

    move-object/from16 v50, v2

    const/16 v2, 0x30

    move-object/from16 v51, v3

    sget-object v3, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/16 v3, 0x31

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    const v9, 0x3ffff

    const/16 v52, -0x1

    move-object/from16 v100, p1

    move-object/from16 v129, v2

    move-object/from16 v130, v3

    move-object/from16 v85, v4

    move-object/from16 v89, v5

    move-object/from16 v83, v6

    move-object/from16 v82, v7

    move-object/from16 v127, v8

    move/from16 v128, v10

    move-object/from16 v91, v11

    move-object/from16 v90, v12

    move-object/from16 v88, v13

    move-object/from16 v87, v14

    move-object/from16 v86, v15

    move-object/from16 v99, v16

    move-object/from16 v113, v17

    move-object/from16 v98, v18

    move-object/from16 v97, v19

    move-object/from16 v96, v20

    move-object/from16 v95, v21

    move-object/from16 v94, v22

    move-object/from16 v93, v23

    move-object/from16 v92, v24

    move-object/from16 v81, v25

    move-object/from16 v101, v26

    move-object/from16 v102, v27

    move-object/from16 v103, v28

    move-object/from16 v104, v29

    move-object/from16 v105, v30

    move-object/from16 v106, v31

    move-object/from16 v107, v32

    move-object/from16 v108, v33

    move-object/from16 v109, v34

    move-object/from16 v110, v35

    move-object/from16 v111, v36

    move-object/from16 v112, v37

    move-object/from16 v114, v38

    move-object/from16 v115, v39

    move-object/from16 v116, v40

    move-object/from16 v117, v41

    move-object/from16 v118, v42

    move-object/from16 v119, v43

    move-object/from16 v120, v44

    move-object/from16 v121, v45

    move-object/from16 v122, v46

    move-object/from16 v123, v47

    move-object/from16 v124, v48

    move-object/from16 v125, v49

    move-object/from16 v126, v50

    move-object/from16 v84, v51

    move/from16 v79, v52

    :goto_0
    move/from16 v80, v9

    goto/16 :goto_13

    :cond_0
    move/from16 v74, v7

    move/from16 v72, v8

    move/from16 v73, v72

    move-object v2, v9

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v10, v7

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v25, v15

    move-object/from16 v37, v25

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v53, v52

    move-object/from16 v54, v53

    move-object/from16 v55, v54

    move-object/from16 v56, v55

    move-object/from16 v57, v56

    move-object/from16 v58, v57

    move-object/from16 v59, v58

    move-object/from16 v60, v59

    move-object/from16 v61, v60

    move-object/from16 v62, v61

    move-object/from16 v63, v62

    move-object/from16 v64, v63

    move-object/from16 v65, v64

    move-object/from16 v66, v65

    move-object/from16 v67, v66

    move-object/from16 v68, v67

    move-object/from16 v69, v68

    move-object/from16 v70, v69

    move-object/from16 v71, v70

    move/from16 v9, v73

    move-object/from16 v8, v71

    :goto_1
    if-eqz v74, :cond_1

    move-object/from16 v75, v14

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v14, 0x31

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v14

    const/high16 v71, 0x20000

    or-int v9, v9, v71

    move-object/from16 v77, v2

    move-object/from16 v71, v14

    :goto_2
    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v68

    move-object/from16 v17, v69

    move-object/from16 v14, v75

    :goto_3
    const/4 v2, 0x0

    move-object/from16 v69, v3

    :goto_4
    const/4 v3, 0x1

    goto/16 :goto_12

    :pswitch_1
    const/16 v14, 0x30

    move-object/from16 v76, v13

    sget-object v13, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;->INSTANCE:Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel$$serializer;

    invoke-interface {v0, v1, v14, v13, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;

    const/high16 v14, 0x10000

    or-int/2addr v9, v14

    move-object/from16 v77, v2

    move-object v15, v13

    :goto_5
    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v68

    move-object/from16 v17, v69

    move-object/from16 v14, v75

    :goto_6
    move-object/from16 v13, v76

    goto :goto_3

    :pswitch_2
    move-object/from16 v76, v13

    const/16 v13, 0x2f

    invoke-interface {v0, v1, v13}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v72

    const v13, 0x8000

    or-int/2addr v9, v13

    :goto_7
    move-object/from16 v77, v2

    goto :goto_5

    :pswitch_3
    move-object/from16 v76, v13

    const/16 v13, 0x2e

    sget-object v14, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v13, v14, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v9, v9, 0x4000

    goto :goto_7

    :pswitch_4
    move-object/from16 v76, v13

    const/16 v13, 0x2d

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x2000

    goto :goto_7

    :pswitch_5
    move-object/from16 v76, v13

    const/16 v13, 0x2c

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v6}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x1000

    goto :goto_7

    :pswitch_6
    move-object/from16 v76, v13

    const/16 v13, 0x2b

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x800

    goto :goto_7

    :pswitch_7
    move-object/from16 v76, v13

    const/16 v13, 0x2a

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v8}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x400

    goto :goto_7

    :pswitch_8
    move-object/from16 v76, v13

    const/16 v13, 0x29

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x200

    goto :goto_7

    :pswitch_9
    move-object/from16 v76, v13

    const/16 v13, 0x28

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x100

    goto :goto_7

    :pswitch_a
    move-object/from16 v76, v13

    const/16 v13, 0x27

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Double;

    or-int/lit16 v9, v9, 0x80

    goto :goto_7

    :pswitch_b
    move-object/from16 v76, v13

    const/16 v13, 0x26

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x40

    goto/16 :goto_7

    :pswitch_c
    move-object/from16 v76, v13

    const/16 v13, 0x25

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    invoke-interface {v0, v1, v13, v14, v5}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x20

    goto/16 :goto_7

    :pswitch_d
    move-object/from16 v76, v13

    const/16 v13, 0x24

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v77, v2

    move-object/from16 v2, v76

    invoke-interface {v0, v1, v13, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x10

    move-object v13, v2

    goto/16 :goto_2

    :pswitch_e
    move-object/from16 v77, v2

    move-object v2, v13

    const/16 v13, 0x23

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v76, v2

    move-object/from16 v2, v75

    invoke-interface {v0, v1, v13, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x8

    move-object v14, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v68

    move-object/from16 v17, v69

    goto/16 :goto_6

    :pswitch_f
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v2, v75

    const/16 v13, 0x22

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v2, v70

    invoke-interface {v0, v1, v13, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x4

    move-object/from16 v70, v2

    goto/16 :goto_5

    :pswitch_10
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v2, v70

    const/16 v13, 0x21

    sget-object v14, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v2, v69

    invoke-interface {v0, v1, v13, v14, v2}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x2

    move-object/from16 v17, v2

    move-object/from16 v69, v3

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v68

    :goto_8
    move-object/from16 v14, v75

    move-object/from16 v13, v76

    :goto_9
    const/4 v2, 0x0

    goto/16 :goto_4

    :pswitch_11
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v2, v69

    sget-object v13, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v17, v2

    move-object/from16 v14, v68

    const/16 v2, 0x20

    invoke-interface {v0, v1, v2, v13, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Double;

    or-int/lit8 v9, v9, 0x1

    move-object/from16 v69, v3

    move-object/from16 v16, v13

    :goto_a
    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    goto :goto_8

    :pswitch_12
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    const/16 v2, 0x20

    const/16 v13, 0x1f

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v69, v3

    move-object/from16 v3, v67

    invoke-interface {v0, v1, v13, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, -0x80000000

    move/from16 v13, v73

    or-int v73, v13, v3

    move-object/from16 v67, v2

    move-object/from16 v16, v14

    goto :goto_a

    :pswitch_13
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v3, v67

    const/16 v2, 0x1e

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v73, v4

    move-object/from16 v4, v66

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x40000000    # 2.0f

    or-int/2addr v3, v13

    move-object/from16 v66, v2

    :goto_b
    move-object/from16 v16, v14

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v4, v73

    move-object/from16 v14, v75

    move-object/from16 v13, v76

    const/4 v2, 0x0

    move/from16 v73, v3

    goto/16 :goto_4

    :pswitch_14
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v66

    const/16 v2, 0x1d

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v65

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x20000000

    or-int/2addr v3, v13

    move-object/from16 v65, v2

    goto :goto_b

    :pswitch_15
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v65

    const/16 v2, 0x1c

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v64

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x10000000

    or-int/2addr v3, v13

    move-object/from16 v64, v2

    goto :goto_b

    :pswitch_16
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v64

    const/16 v2, 0x1b

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v63

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x8000000

    or-int/2addr v3, v13

    move-object/from16 v63, v2

    goto/16 :goto_b

    :pswitch_17
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v63

    const/16 v2, 0x1a

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v62

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x4000000

    or-int/2addr v3, v13

    move-object/from16 v62, v2

    goto/16 :goto_b

    :pswitch_18
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v62

    const/16 v2, 0x19

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v61

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x2000000

    or-int/2addr v3, v13

    move-object/from16 v61, v2

    goto/16 :goto_b

    :pswitch_19
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v61

    const/16 v2, 0x18

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v60

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x1000000

    or-int/2addr v3, v13

    move-object/from16 v60, v2

    goto/16 :goto_b

    :pswitch_1a
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v60

    const/16 v2, 0x17

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v59

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x800000

    or-int/2addr v3, v13

    move-object/from16 v59, v2

    goto/16 :goto_b

    :pswitch_1b
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v59

    const/16 v2, 0x16

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v58

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x400000

    or-int/2addr v3, v13

    move-object/from16 v58, v2

    goto/16 :goto_b

    :pswitch_1c
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v58

    const/16 v2, 0x15

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v57

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x200000

    or-int/2addr v3, v13

    move-object/from16 v57, v2

    goto/16 :goto_b

    :pswitch_1d
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v57

    const/16 v2, 0x14

    sget-object v3, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v4, v56

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x100000

    or-int/2addr v3, v13

    move-object/from16 v56, v2

    goto/16 :goto_b

    :pswitch_1e
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v56

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v3, v55

    move-object/from16 v55, v4

    const/16 v4, 0x13

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x80000

    or-int/2addr v3, v13

    move-object/from16 v16, v14

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v56, v55

    move-object/from16 v4, v73

    move-object/from16 v14, v75

    move-object/from16 v13, v76

    move-object/from16 v55, v2

    move/from16 v73, v3

    goto/16 :goto_9

    :pswitch_1f
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v55

    move-object/from16 v55, v56

    const/16 v4, 0x13

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v16, v3

    move-object/from16 v4, v54

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v4, 0x40000

    or-int/2addr v4, v13

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v18, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    :goto_c
    move-object/from16 v13, v76

    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_d
    move-object/from16 v55, v16

    :goto_e
    move-object/from16 v16, v14

    move-object/from16 v14, v75

    goto/16 :goto_12

    :pswitch_20
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v54

    const/16 v3, 0x12

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v18, v4

    move-object/from16 v3, v53

    const/16 v4, 0x11

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v3, 0x20000

    or-int/2addr v3, v13

    move-object/from16 v19, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    :goto_f
    move-object/from16 v4, v73

    move-object/from16 v13, v76

    const/4 v2, 0x0

    move/from16 v73, v3

    move-object/from16 v55, v16

    const/4 v3, 0x1

    goto :goto_e

    :pswitch_21
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v53

    const/16 v4, 0x11

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v19, v3

    move-object/from16 v4, v52

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const/high16 v4, 0x10000

    or-int/2addr v4, v13

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v20, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    goto/16 :goto_c

    :pswitch_22
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v52

    const/16 v3, 0x10

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v20, v4

    move-object/from16 v3, v51

    const/16 v4, 0xf

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    const v3, 0x8000

    or-int/2addr v3, v13

    move-object/from16 v21, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    goto/16 :goto_f

    :pswitch_23
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v51

    const/16 v4, 0xf

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v21, v3

    move-object/from16 v4, v50

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v4, v13, 0x4000

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v22, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    goto/16 :goto_c

    :pswitch_24
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v50

    const/16 v3, 0xe

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v22, v4

    move-object/from16 v3, v49

    const/16 v4, 0xd

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v3, v13, 0x2000

    move-object/from16 v23, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    goto/16 :goto_f

    :pswitch_25
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v49

    const/16 v4, 0xd

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v23, v3

    move-object/from16 v4, v48

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v4, v13, 0x1000

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v24, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    goto/16 :goto_c

    :pswitch_26
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v48

    const/16 v3, 0xc

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v24, v4

    move-object/from16 v3, v47

    const/16 v4, 0xb

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v3, v13, 0x800

    move-object/from16 v36, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    goto/16 :goto_f

    :pswitch_27
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v47

    const/16 v4, 0xb

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v36, v3

    move-object/from16 v4, v46

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v4, v13, 0x400

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v35, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    goto/16 :goto_c

    :pswitch_28
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v46

    const/16 v3, 0xa

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v35, v4

    move-object/from16 v3, v45

    const/16 v4, 0x9

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v3, v13, 0x200

    move-object/from16 v34, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    goto/16 :goto_f

    :pswitch_29
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v45

    const/16 v4, 0x9

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v34, v3

    move-object/from16 v4, v44

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v4, v13, 0x100

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v33, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    goto/16 :goto_c

    :pswitch_2a
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v44

    const/16 v3, 0x8

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v33, v4

    move-object/from16 v3, v43

    const/4 v4, 0x7

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit16 v3, v13, 0x80

    move-object/from16 v32, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    goto/16 :goto_f

    :pswitch_2b
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v43

    const/4 v4, 0x7

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v32, v3

    move-object/from16 v4, v42

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v4, v13, 0x40

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v31, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    goto/16 :goto_c

    :pswitch_2c
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v42

    const/4 v3, 0x6

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v31, v4

    move-object/from16 v3, v41

    const/4 v4, 0x5

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v3, v13, 0x20

    move-object/from16 v30, v2

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    goto/16 :goto_f

    :pswitch_2d
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v41

    const/4 v4, 0x5

    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    move-object/from16 v30, v3

    move-object/from16 v4, v40

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Double;

    or-int/lit8 v4, v13, 0x10

    move-object/from16 v3, v73

    move/from16 v73, v4

    move-object v4, v3

    move-object/from16 v29, v2

    move-object/from16 v27, v39

    goto/16 :goto_c

    :pswitch_2e
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v40

    const/4 v3, 0x4

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v29, v4

    move-object/from16 v3, v39

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v2, v3}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v3, v13, 0x8

    move-object/from16 v27, v2

    goto/16 :goto_f

    :pswitch_2f
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    const/4 v2, 0x2

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v39

    const/4 v4, 0x3

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    or-int/lit8 v13, v13, 0x4

    move-object/from16 v27, v3

    move-object/from16 v4, v73

    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_10
    move/from16 v73, v13

    move-object/from16 v55, v16

    move-object/from16 v13, v76

    goto/16 :goto_e

    :pswitch_30
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v3, v39

    const/4 v4, 0x3

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    move-object/from16 v27, v3

    move-object/from16 v4, v38

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    or-int/lit8 v4, v13, 0x2

    move-object/from16 v13, v73

    move/from16 v73, v4

    move-object v4, v13

    move-object/from16 v38, v2

    move-object/from16 v13, v76

    const/4 v2, 0x0

    goto/16 :goto_d

    :pswitch_31
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    const/4 v2, 0x0

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v38

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v13, v13, 0x1

    move-object/from16 v37, v26

    :goto_11
    move-object/from16 v4, v73

    goto/16 :goto_10

    :pswitch_32
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    const/4 v2, 0x0

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v38

    const/4 v3, 0x1

    move/from16 v74, v2

    goto :goto_11

    :goto_12
    move-object/from16 v68, v16

    move-object/from16 v54, v18

    move-object/from16 v53, v19

    move-object/from16 v52, v20

    move-object/from16 v51, v21

    move-object/from16 v50, v22

    move-object/from16 v49, v23

    move-object/from16 v48, v24

    move-object/from16 v39, v27

    move-object/from16 v40, v29

    move-object/from16 v41, v30

    move-object/from16 v42, v31

    move-object/from16 v43, v32

    move-object/from16 v44, v33

    move-object/from16 v45, v34

    move-object/from16 v46, v35

    move-object/from16 v47, v36

    move-object/from16 v3, v69

    move-object/from16 v2, v77

    move-object/from16 v69, v17

    goto/16 :goto_1

    :cond_1
    move-object/from16 v77, v2

    move-object/from16 v76, v13

    move-object/from16 v75, v14

    move-object/from16 v27, v39

    move-object/from16 v29, v40

    move-object/from16 v30, v41

    move-object/from16 v31, v42

    move-object/from16 v32, v43

    move-object/from16 v33, v44

    move-object/from16 v34, v45

    move-object/from16 v35, v46

    move-object/from16 v36, v47

    move-object/from16 v24, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v18, v54

    move-object/from16 v16, v55

    move-object/from16 v55, v56

    move-object/from16 v14, v68

    move-object/from16 v17, v69

    move/from16 v13, v73

    move-object/from16 v69, v3

    move-object/from16 v73, v4

    move-object/from16 v4, v38

    move-object/from16 v82, v4

    move-object/from16 v118, v5

    move-object/from16 v125, v6

    move-object/from16 v124, v7

    move-object/from16 v123, v8

    move-object/from16 v122, v10

    move-object/from16 v120, v11

    move-object/from16 v119, v12

    move/from16 v79, v13

    move-object/from16 v113, v14

    move-object/from16 v129, v15

    move-object/from16 v100, v16

    move-object/from16 v114, v17

    move-object/from16 v99, v18

    move-object/from16 v98, v19

    move-object/from16 v97, v20

    move-object/from16 v96, v21

    move-object/from16 v95, v22

    move-object/from16 v94, v23

    move-object/from16 v93, v24

    move-object/from16 v83, v25

    move-object/from16 v84, v27

    move-object/from16 v85, v29

    move-object/from16 v86, v30

    move-object/from16 v87, v31

    move-object/from16 v88, v32

    move-object/from16 v89, v33

    move-object/from16 v90, v34

    move-object/from16 v91, v35

    move-object/from16 v92, v36

    move-object/from16 v81, v37

    move-object/from16 v101, v55

    move-object/from16 v102, v57

    move-object/from16 v103, v58

    move-object/from16 v104, v59

    move-object/from16 v105, v60

    move-object/from16 v106, v61

    move-object/from16 v107, v62

    move-object/from16 v108, v63

    move-object/from16 v109, v64

    move-object/from16 v110, v65

    move-object/from16 v111, v66

    move-object/from16 v112, v67

    move-object/from16 v126, v69

    move-object/from16 v115, v70

    move-object/from16 v130, v71

    move/from16 v128, v72

    move-object/from16 v127, v73

    move-object/from16 v116, v75

    move-object/from16 v117, v76

    move-object/from16 v121, v77

    goto/16 :goto_0

    :goto_13
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v78, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    const/16 v131, 0x0

    invoke-direct/range {v78 .. v131}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ILcom/whoop/healthconnect/domain/models/HealthConnectMetadataModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v78

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;->write$Self$health_connect_release(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel$$serializer;->serialize(Lzc3/e;Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionModel;)V

    return-void
.end method

.method public bridge typeParametersSerializers()[Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-super {p0}, Lkotlinx/serialization/internal/GeneratedSerializer;->typeParametersSerializers()[Lwc3/c;

    move-result-object v0

    return-object v0
.end method
