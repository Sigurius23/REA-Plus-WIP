.class public final synthetic Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "coach-everywhere_release"
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

.field public static final INSTANCE:Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;

    invoke-direct {v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;-><init>()V

    sput-object v0, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->INSTANCE:Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;

    const/16 v1, 0x8

    sput v1, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->$stable:I

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.whoop.coacheverywhere.onboarding.model.CoachOnboardingResponse"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "featureId"

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "featureName"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "featureEducationName"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "steps"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v0

    const/4 v1, 0x4

    new-array v1, v1, [Lwc3/c;

    const/4 v2, 0x0

    sget-object v3, Lkotlinx/serialization/internal/LongSerializer;->INSTANCE:Lkotlinx/serialization/internal/LongSerializer;

    aput-object v3, v1, v2

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v2

    return-object v1
.end method

.method public final deserialize(Lzc3/d;)Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;
    .locals 22

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;->access$get$childSerializers$cp()[Ll83/h;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v9

    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v4

    aget-object v2, v2, v5

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-interface {v0, v1, v5, v2, v8}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v5, 0xf

    move-object/from16 v20, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move v15, v5

    move-wide/from16 v16, v9

    goto :goto_1

    :cond_0
    const-wide/16 v9, 0x0

    move v13, v6

    move v3, v7

    move-wide v11, v9

    move-object v9, v8

    move-object v10, v9

    :goto_0
    if-eqz v13, :cond_6

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v14

    const/4 v15, -0x1

    if-eq v14, v15, :cond_5

    if-eqz v14, :cond_4

    if-eq v14, v6, :cond_3

    if-eq v14, v4, :cond_2

    if-ne v14, v5, :cond_1

    aget-object v14, v2, v5

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lwc3/b;

    invoke-interface {v0, v1, v5, v14, v10}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    or-int/lit8 v3, v3, 0x8

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v14}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :cond_2
    invoke-interface {v0, v1, v4}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v9

    or-int/lit8 v3, v3, 0x4

    goto :goto_0

    :cond_3
    invoke-interface {v0, v1, v6}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v8

    or-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_4
    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeLongElement(Lyc3/g;I)J

    move-result-wide v11

    or-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    move v13, v7

    goto :goto_0

    :cond_6
    move v15, v3

    move-object/from16 v18, v8

    move-object/from16 v19, v9

    move-object/from16 v20, v10

    move-wide/from16 v16, v11

    :goto_1
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v14, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;

    const/16 v21, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;-><init>(IJLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v14
.end method

.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->deserialize(Lzc3/d;)Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;->write$Self$coach_everywhere_release(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse$$serializer;->serialize(Lzc3/e;Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;)V

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
