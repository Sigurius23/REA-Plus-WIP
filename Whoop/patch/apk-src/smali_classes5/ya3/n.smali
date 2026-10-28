.class public final Lya3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;

.field public static final c:Lya3/n;

.field public static final d:Lya3/j;


# instance fields
.field public final a:Lmb3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lya3/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lya3/n;->b:Ljava/util/List;

    new-instance v0, Lya3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lya3/n;->d:Lya3/j;

    new-instance v1, Lya3/n;

    invoke-direct {v1, v0}, Lya3/n;-><init>(Lmb3/c;)V

    sput-object v1, Lya3/n;->c:Lya3/n;

    return-void
.end method

.method public constructor <init>(Lmb3/c;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya3/n;->a:Lmb3/c;

    return-void

    :cond_0
    const/4 p1, 0x5

    invoke-static {p1}, Lya3/n;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic a(I)V
    .locals 25

    move/from16 v0, p0

    const/16 v1, 0x2b

    const/16 v2, 0x2a

    const/16 v3, 0x65

    const/16 v4, 0x60

    const/16 v5, 0x5d

    const/16 v6, 0x15

    const/16 v7, 0x10

    const/16 v8, 0xc

    const/16 v9, 0xb

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    const-string v10, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v10, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v11, 0x2

    if-eq v0, v9, :cond_1

    if-eq v0, v8, :cond_1

    if-eq v0, v7, :cond_1

    if-eq v0, v6, :cond_1

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_4

    packed-switch v0, :pswitch_data_5

    packed-switch v0, :pswitch_data_6

    packed-switch v0, :pswitch_data_7

    const/4 v12, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v12, v11

    :goto_1
    new-array v12, v12, [Ljava/lang/Object;

    const-string v13, "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil"

    const/4 v14, 0x0

    packed-switch v0, :pswitch_data_8

    :pswitch_2
    const-string v15, "kotlinTypeRefiner"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_3
    const-string v15, "memberDescriptor"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_4
    const-string v15, "onConflict"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_5
    const-string v15, "extractFrom"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_6
    const-string v15, "overrider"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_7
    const-string v15, "toFilter"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_8
    const-string v15, "classModality"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_9
    const-string v15, "descriptorByHandle"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_a
    const-string v15, "overridables"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_b
    const-string v15, "bReturnType"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_c
    const-string v15, "aReturnType"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_d
    const-string v15, "descriptors"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_e
    const-string v15, "candidate"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_f
    const-string v15, "b"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_10
    const-string v15, "a"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_11
    const-string v15, "notOverridden"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_12
    const-string v15, "descriptorsFromSuper"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_13
    const-string v15, "fromCurrent"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_14
    const-string v15, "fromSuper"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_15
    const-string v15, "overriding"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_16
    const-string v15, "strategy"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_17
    const-string v15, "current"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_18
    const-string v15, "membersFromCurrent"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_19
    const-string v15, "membersFromSupertypes"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_1a
    const-string v15, "name"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_1b
    const-string v15, "subTypeParameter"

    aput-object v15, v12, v14

    goto/16 :goto_2

    :pswitch_1c
    const-string v15, "superTypeParameter"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_1d
    const-string v15, "typeCheckerState"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_1e
    const-string v15, "typeInSub"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_1f
    const-string v15, "typeInSuper"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_20
    const-string v15, "secondParameters"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_21
    const-string v15, "firstParameters"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_22
    const-string v15, "subDescriptor"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_23
    const-string v15, "superDescriptor"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_24
    const-string v15, "result"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_25
    const-string v15, "descriptor"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_26
    const-string v15, "g"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_27
    const-string v15, "f"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_28
    aput-object v13, v12, v14

    goto :goto_2

    :pswitch_29
    const-string v15, "transformFirst"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_2a
    const-string v15, "candidateSet"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_2b
    const-string v15, "axioms"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_2c
    const-string v15, "equalityAxioms"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_2d
    const-string v15, "customSubtype"

    aput-object v15, v12, v14

    goto :goto_2

    :pswitch_2e
    const-string v15, "kotlinTypePreparator"

    aput-object v15, v12, v14

    :goto_2
    const-string v14, "filterOverrides"

    const-string v15, "getOverriddenDeclarations"

    const-string v16, "isOverridableBy"

    const-string v17, "isOverridableByWithoutExternalConditions"

    const-string v18, "createTypeCheckerState"

    const-string v19, "selectMostSpecificMember"

    const-string v20, "determineModalityForFakeOverride"

    const-string v21, "getMinimalModality"

    const-string v22, "filterVisibleFakeOverrides"

    const-string v23, "extractMembersOverridableInBothWays"

    const/16 v24, 0x1

    if-eq v0, v9, :cond_8

    if-eq v0, v8, :cond_8

    if-eq v0, v7, :cond_7

    if-eq v0, v6, :cond_6

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_4

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_2

    packed-switch v0, :pswitch_data_9

    packed-switch v0, :pswitch_data_a

    packed-switch v0, :pswitch_data_b

    packed-switch v0, :pswitch_data_c

    aput-object v13, v12, v24

    goto :goto_3

    :pswitch_2f
    aput-object v20, v12, v24

    goto :goto_3

    :pswitch_30
    aput-object v19, v12, v24

    goto :goto_3

    :pswitch_31
    aput-object v17, v12, v24

    goto :goto_3

    :cond_2
    aput-object v18, v12, v24

    goto :goto_3

    :cond_3
    aput-object v23, v12, v24

    goto :goto_3

    :cond_4
    aput-object v22, v12, v24

    goto :goto_3

    :cond_5
    aput-object v21, v12, v24

    goto :goto_3

    :cond_6
    :pswitch_32
    aput-object v16, v12, v24

    goto :goto_3

    :cond_7
    aput-object v15, v12, v24

    goto :goto_3

    :cond_8
    aput-object v14, v12, v24

    :goto_3
    packed-switch v0, :pswitch_data_d

    const-string v13, "createWithTypeRefiner"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_33
    const-string v13, "findMaxVisibility"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_34
    const-string v13, "computeVisibilityToInherit"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_35
    const-string v13, "resolveUnknownVisibilityForMember"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_36
    aput-object v23, v12, v11

    goto/16 :goto_4

    :pswitch_37
    aput-object v22, v12, v11

    goto/16 :goto_4

    :pswitch_38
    aput-object v21, v12, v11

    goto/16 :goto_4

    :pswitch_39
    aput-object v20, v12, v11

    goto/16 :goto_4

    :pswitch_3a
    const-string v13, "createAndBindFakeOverride"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_3b
    aput-object v19, v12, v11

    goto/16 :goto_4

    :pswitch_3c
    const-string v13, "isReturnTypeMoreSpecific"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_3d
    const-string v13, "isMoreSpecificThenAllOf"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_3e
    const-string v13, "isVisibilityMoreSpecific"

    aput-object v13, v12, v11

    goto/16 :goto_4

    :pswitch_3f
    const-string v13, "isMoreSpecific"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_40
    const-string v13, "createAndBindFakeOverrides"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_41
    const-string v13, "allHasSameContainingDeclaration"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_42
    const-string v13, "extractAndBindOverridesForMember"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_43
    const-string v13, "isVisibleForOverride"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_44
    const-string v13, "generateOverridesInFunctionGroup"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_45
    const-string v13, "areTypeParametersEquivalent"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_46
    const-string v13, "areTypesEquivalent"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_47
    aput-object v18, v12, v11

    goto :goto_4

    :pswitch_48
    const-string v13, "getBasicOverridabilityProblem"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_49
    aput-object v17, v12, v11

    goto :goto_4

    :pswitch_4a
    aput-object v16, v12, v11

    goto :goto_4

    :pswitch_4b
    const-string v13, "collectOverriddenDeclarations"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_4c
    aput-object v15, v12, v11

    goto :goto_4

    :pswitch_4d
    const-string v13, "overrides"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_4e
    aput-object v14, v12, v11

    goto :goto_4

    :pswitch_4f
    const-string v13, "filterOutOverridden"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_50
    const-string v13, "<init>"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_51
    const-string v13, "create"

    aput-object v13, v12, v11

    goto :goto_4

    :pswitch_52
    const-string v13, "createWithTypePreparatorAndCustomSubtype"

    aput-object v13, v12, v11

    :goto_4
    :pswitch_53
    invoke-static {v10, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    if-eq v0, v9, :cond_9

    if-eq v0, v8, :cond_9

    if-eq v0, v7, :cond_9

    if-eq v0, v6, :cond_9

    if-eq v0, v5, :cond_9

    if-eq v0, v4, :cond_9

    if-eq v0, v3, :cond_9

    if-eq v0, v2, :cond_9

    if-eq v0, v1, :cond_9

    packed-switch v0, :pswitch_data_e

    packed-switch v0, :pswitch_data_f

    packed-switch v0, :pswitch_data_10

    packed-switch v0, :pswitch_data_11

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    :pswitch_54
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x4e
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x58
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x18
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1e
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x4e
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x58
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_2e
        :pswitch_2d
        :pswitch_2
        :pswitch_2c
        :pswitch_2b
        :pswitch_2
        :pswitch_2e
        :pswitch_2a
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_28
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_28
        :pswitch_23
        :pswitch_22
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_23
        :pswitch_22
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_28
        :pswitch_28
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1d
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_17
        :pswitch_16
        :pswitch_11
        :pswitch_17
        :pswitch_11
        :pswitch_16
        :pswitch_10
        :pswitch_f
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_10
        :pswitch_c
        :pswitch_f
        :pswitch_b
        :pswitch_1d
        :pswitch_a
        :pswitch_9
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_a
        :pswitch_17
        :pswitch_16
        :pswitch_d
        :pswitch_17
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_d
        :pswitch_8
        :pswitch_28
        :pswitch_17
        :pswitch_7
        :pswitch_28
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_4
        :pswitch_28
        :pswitch_6
        :pswitch_5
        :pswitch_16
        :pswitch_3
        :pswitch_3
        :pswitch_d
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0x18
        :pswitch_32
        :pswitch_32
        :pswitch_32
        :pswitch_32
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x1e
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
        :pswitch_31
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x4e
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
        :pswitch_30
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x58
        :pswitch_2f
        :pswitch_2f
        :pswitch_2f
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x1
        :pswitch_52
        :pswitch_52
        :pswitch_51
        :pswitch_51
        :pswitch_50
        :pswitch_50
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4e
        :pswitch_53
        :pswitch_53
        :pswitch_4d
        :pswitch_4d
        :pswitch_4c
        :pswitch_53
        :pswitch_4b
        :pswitch_4b
        :pswitch_4a
        :pswitch_4a
        :pswitch_53
        :pswitch_4a
        :pswitch_4a
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_49
        :pswitch_49
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_48
        :pswitch_48
        :pswitch_47
        :pswitch_47
        :pswitch_53
        :pswitch_53
        :pswitch_46
        :pswitch_46
        :pswitch_46
        :pswitch_45
        :pswitch_45
        :pswitch_45
        :pswitch_44
        :pswitch_44
        :pswitch_44
        :pswitch_44
        :pswitch_44
        :pswitch_43
        :pswitch_43
        :pswitch_42
        :pswitch_42
        :pswitch_42
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_40
        :pswitch_40
        :pswitch_3f
        :pswitch_3f
        :pswitch_3e
        :pswitch_3e
        :pswitch_3d
        :pswitch_3d
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3b
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_3a
        :pswitch_3a
        :pswitch_3a
        :pswitch_39
        :pswitch_39
        :pswitch_53
        :pswitch_53
        :pswitch_53
        :pswitch_38
        :pswitch_38
        :pswitch_53
        :pswitch_37
        :pswitch_37
        :pswitch_53
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_53
        :pswitch_36
        :pswitch_36
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0x18
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x1e
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x4e
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
        :pswitch_54
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x58
        :pswitch_54
        :pswitch_54
        :pswitch_54
    .end packed-switch
.end method

.method public static b(Llb3/y;Llb3/y;Llb3/p0;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-eqz p1, :cond_1

    invoke-static {p0}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    invoke-static {p2, p0, p1}, Llb3/d;->g(Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result p0

    return p0

    :cond_1
    const/16 p0, 0x2d

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_2
    const/16 p0, 0x2c

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static c(Lr93/c;Ljava/util/LinkedHashSet;)V
    .locals 2

    if-eqz p0, :cond_3

    invoke-interface {p0}, Lr93/c;->getKind()I

    move-result v0

    invoke-static {v0}, Lq63/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/c;

    invoke-static {v0, p1}, Lya3/n;->c(Lr93/c;Ljava/util/LinkedHashSet;)V

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No overridden descriptors found for (fake override) "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/16 p0, 0x11

    invoke-static {p0}, Lya3/n;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static d(Lr93/b;)Ljava/util/ArrayList;
    .locals 2

    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_0

    check-cast v0, Lu93/d;

    invoke-virtual {v0}, Lu93/d;->getType()Llb3/y;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/a1;

    check-cast v0, Lu93/x0;

    invoke-virtual {v0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static e(Ljava/util/Collection;Lr93/e;Lya3/p;)V
    .locals 11

    const/4 v0, 0x0

    if-eqz p0, :cond_20

    if-eqz p1, :cond_1f

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lr93/c;

    invoke-interface {v6}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v7

    invoke-static {v7}, Lr93/q;->e(Lr93/r;)Z

    move-result v7

    if-nez v7, :cond_4

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    if-eqz p1, :cond_2

    sget-object v7, Lr93/q;->l:Lr93/v0;

    invoke-static {v7, v6, p1}, Lr93/q;->c(Lfb3/d;Lr93/n;Lr93/k;)Lr93/n;

    move-result-object v6

    if-nez v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_4

    goto :goto_2

    :cond_2
    const/4 p0, 0x3

    invoke-static {p0}, Lr93/q;->a(I)V

    throw v7

    :cond_3
    const/4 p0, 0x2

    invoke-static {p0}, Lr93/q;->a(I)V

    throw v7

    :cond_4
    move v4, v5

    :goto_2
    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    move-object p0, v2

    :goto_3
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v5

    move v6, v3

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr93/c;

    invoke-interface {v7}, Lr93/z;->k()Lr93/a0;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    if-eqz v8, :cond_a

    if-eq v8, v4, :cond_9

    const/4 v7, 0x2

    if-eq v8, v7, :cond_8

    const/4 v7, 0x3

    if-eq v8, v7, :cond_7

    goto :goto_4

    :cond_7
    move v6, v4

    goto :goto_4

    :cond_8
    move v3, v4

    goto :goto_4

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Member cannot have SEALED modality: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    sget-object v0, Lr93/a0;->x:Lr93/a0;

    goto/16 :goto_c

    :cond_b
    invoke-interface {p1}, Lr93/z;->U()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v2

    sget-object v7, Lr93/a0;->E:Lr93/a0;

    if-eq v2, v7, :cond_c

    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v2

    sget-object v7, Lr93/a0;->y:Lr93/a0;

    if-eq v2, v7, :cond_c

    move v5, v4

    :cond_c
    if-eqz v3, :cond_d

    if-nez v6, :cond_d

    sget-object v0, Lr93/a0;->z:Lr93/a0;

    goto/16 :goto_c

    :cond_d
    if-nez v3, :cond_10

    if-eqz v6, :cond_10

    if-eqz v5, :cond_e

    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v2

    goto :goto_5

    :cond_e
    sget-object v2, Lr93/a0;->E:Lr93/a0;

    :goto_5
    if-eqz v2, :cond_f

    move-object v0, v2

    goto/16 :goto_c

    :cond_f
    const/16 p0, 0x5a

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_10
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/c;

    if-eqz v6, :cond_11

    new-instance v7, Ljava/util/LinkedHashSet;

    invoke-direct {v7}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v6, v7}, Lya3/n;->c(Lr93/c;Ljava/util/LinkedHashSet;)V

    invoke-interface {v2, v7}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_6

    :cond_11
    const/16 p0, 0xf

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_12
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_13

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/k;

    invoke-static {v3}, Lcb3/e;->j(Lr93/k;)Lr93/b0;

    move-result-object v3

    sget-object v6, Lmb3/g;->a:Lbd3/e0;

    invoke-interface {v3, v6}, Lr93/b0;->r(Lbd3/e0;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lr;->t(Ljava/lang/Object;)V

    :cond_13
    new-instance v3, Lya3/c;

    const/4 v6, 0x1

    invoke-direct {v3, v6}, Lya3/c;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    move-result v6

    if-gt v6, v4, :cond_14

    goto :goto_9

    :cond_14
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_15
    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v3, v6, v8}, Lya3/c;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/k;

    iget-object v9, v8, Ll83/k;->w:Ljava/lang/Object;

    check-cast v9, Lr93/b;

    iget-object v8, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Lr93/b;

    invoke-static {v9, v8}, Lya3/n;->q(Lr93/b;Lr93/b;)Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_8

    :cond_16
    invoke-static {v8, v9}, Lya3/n;->q(Lr93/b;Lr93/b;)Z

    move-result v8

    if-eqz v8, :cond_15

    goto :goto_7

    :cond_17
    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_18
    move-object v2, v4

    :goto_9
    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v3

    if-eqz v3, :cond_1e

    sget-object v4, Lr93/a0;->E:Lr93/a0;

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/c;

    if-eqz v5, :cond_1a

    invoke-interface {v6}, Lr93/z;->k()Lr93/a0;

    move-result-object v7

    sget-object v8, Lr93/a0;->E:Lr93/a0;

    if-ne v7, v8, :cond_1a

    move-object v6, v3

    goto :goto_b

    :cond_1a
    invoke-interface {v6}, Lr93/z;->k()Lr93/a0;

    move-result-object v6

    :goto_b
    invoke-virtual {v6, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v7

    if-gez v7, :cond_19

    move-object v4, v6

    goto :goto_a

    :cond_1b
    if-eqz v4, :cond_1d

    move-object v0, v4

    :goto_c
    if-eqz v1, :cond_1c

    sget-object v1, Lr93/q;->h:Lr93/p;

    goto :goto_d

    :cond_1c
    sget-object v1, Lr93/q;->g:Lr93/p;

    :goto_d
    new-instance v2, Lya3/k;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {p0, v2}, Lya3/n;->s(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/c;

    invoke-interface {v2, p1, v0, v1}, Lr93/c;->a0(Lr93/e;Lr93/a0;Lr93/o;)Lr93/c;

    move-result-object p1

    invoke-virtual {p2, p1, p0}, Lya3/p;->n(Lr93/c;Ljava/util/Collection;)V

    invoke-virtual {p2, p1}, Lya3/p;->b(Lr93/c;)V

    return-void

    :cond_1d
    const/16 p0, 0x5d

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_1e
    const/16 p0, 0x5c

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_1f
    const/16 p0, 0x54

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_20
    const/16 p0, 0x53

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static g(Ljava/lang/Object;Ljava/util/LinkedList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;
    .locals 5

    if-eqz p0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/b;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/b;

    if-ne p0, v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    invoke-static {v1, v3}, Lya3/n;->j(Lr93/b;Lr93/b;)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    const/16 p0, 0x61

    invoke-static {p0}, Lya3/n;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static i(Lr93/b;Lr93/b;)Lya3/m;
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_c

    if-eqz p1, :cond_b

    instance-of v1, p0, Lr93/w;

    if-eqz v1, :cond_0

    instance-of v2, p1, Lr93/w;

    if-eqz v2, :cond_1

    :cond_0
    instance-of v2, p0, Lr93/n0;

    if-eqz v2, :cond_2

    instance-of v3, p1, Lr93/n0;

    if-nez v3, :cond_2

    :cond_1
    const-string p0, "Member kind mismatch"

    invoke-static {p0}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object p0

    return-object p0

    :cond_2
    if-nez v1, :cond_4

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "This type of CallableDescriptor cannot be checked for overridability: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v2

    invoke-virtual {v1, v2}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string p0, "Name mismatch"

    invoke-static {p0}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-interface {p0}, Lr93/b;->B()Lr93/q0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_6

    move v1, v3

    goto :goto_1

    :cond_6
    move v1, v2

    :goto_1
    invoke-interface {p1}, Lr93/b;->B()Lr93/q0;

    move-result-object v4

    if-nez v4, :cond_7

    move v2, v3

    :cond_7
    if-eq v1, v2, :cond_8

    const-string p0, "Receiver presence mismatch"

    invoke-static {p0}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object p0

    goto :goto_2

    :cond_8
    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eq p0, p1, :cond_9

    const-string p0, "Value parameter number mismatch"

    invoke-static {p0}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object p0

    goto :goto_2

    :cond_9
    move-object p0, v0

    :goto_2
    if-eqz p0, :cond_a

    return-object p0

    :cond_a
    return-object v0

    :cond_b
    const/16 p0, 0x27

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_c
    const/16 p0, 0x26

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static j(Lr93/b;Lr93/b;)I
    .locals 4

    sget-object v0, Lya3/n;->c:Lya3/n;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p0, v1}, Lya3/n;->l(Lr93/b;Lr93/b;Lr93/e;)Lya3/m;

    move-result-object v2

    invoke-virtual {v2}, Lya3/m;->b()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, p0, p1, v1, v3}, Lya3/n;->m(Lr93/b;Lr93/b;Lr93/e;Z)Lya3/m;

    move-result-object p0

    invoke-virtual {p0}, Lya3/m;->b()I

    move-result p0

    const/4 p1, 0x1

    if-ne v2, p1, :cond_0

    if-ne p0, p1, :cond_0

    return p1

    :cond_0
    const/4 p1, 0x3

    if-eq v2, p1, :cond_2

    if-ne p0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x2

    return p0

    :cond_2
    :goto_0
    return p1
.end method

.method public static k(Lr93/b;Lr93/b;)Z
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_a

    if-eqz p1, :cond_9

    invoke-interface {p0}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v0

    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v1

    invoke-static {p0, p1}, Lya3/n;->p(Lr93/b;Lr93/b;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    invoke-interface {p1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v3

    sget-object v4, Lya3/n;->c:Lya3/n;

    invoke-virtual {v4, v2, v3}, Lya3/n;->f(Ljava/util/List;Ljava/util/List;)Llb3/p0;

    move-result-object v2

    instance-of v3, p0, Lr93/w;

    if-eqz v3, :cond_1

    invoke-static {p0, v0, p1, v1, v2}, Lya3/n;->o(Lr93/b;Llb3/y;Lr93/b;Llb3/y;Llb3/p0;)Z

    move-result p0

    return p0

    :cond_1
    instance-of v3, p0, Lr93/n0;

    if-eqz v3, :cond_8

    move-object v3, p0

    check-cast v3, Lr93/n0;

    move-object v4, p1

    check-cast v4, Lr93/n0;

    invoke-interface {v3}, Lr93/n0;->getSetter()Lr93/p0;

    move-result-object v5

    invoke-interface {v4}, Lr93/n0;->getSetter()Lr93/p0;

    move-result-object v6

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v5, v6}, Lya3/n;->p(Lr93/b;Lr93/b;)Z

    move-result v5

    goto :goto_1

    :cond_3
    :goto_0
    move v5, v7

    :goto_1
    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v3}, Lr93/b1;->A()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Lr93/b1;->A()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    invoke-static {v2, p0, p1}, Llb3/d;->g(Llb3/p0;Lob3/g;Lob3/g;)Z

    move-result p0

    return p0

    :cond_5
    invoke-interface {v3}, Lr93/b1;->A()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-interface {v4}, Lr93/b1;->A()Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    invoke-static {p0, v0, p1, v1, v2}, Lya3/n;->o(Lr93/b;Llb3/y;Lr93/b;Llb3/y;Llb3/p0;)Z

    move-result p0

    if-eqz p0, :cond_7

    return v7

    :cond_7
    :goto_2
    const/4 p0, 0x0

    return p0

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected callable: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    const/16 p0, 0x42

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_a
    const/16 p0, 0x41

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static o(Lr93/b;Llb3/y;Lr93/b;Llb3/y;Llb3/p0;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p0

    invoke-virtual {p3}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p4, p0, p1}, Llb3/p0;->b(Lob3/g;Lob3/g;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    iget-object p2, p4, Llb3/p0;->c:Lob3/o;

    sget-object p3, Llb3/d;->a:Llb3/d;

    invoke-virtual {p3, p4, p2, p0, p1}, Llb3/d;->e(Llb3/p0;Lob3/o;Lob3/g;Lob3/g;)Z

    move-result p0

    :goto_0
    return p0

    :cond_2
    const/16 p0, 0x4a

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_3
    const/16 p0, 0x49

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_4
    const/16 p0, 0x48

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_5
    const/16 p0, 0x47

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static p(Lr93/b;Lr93/b;)Z
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    invoke-interface {p0}, Lr93/n;->getVisibility()Lr93/r;

    move-result-object p0

    invoke-interface {p1}, Lr93/n;->getVisibility()Lr93/r;

    move-result-object p1

    invoke-static {p0, p1}, Lr93/q;->b(Lr93/r;Lr93/r;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/16 p0, 0x44

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_3
    const/16 p0, 0x43

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static q(Lr93/b;Lr93/b;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    sget-object v2, Lya3/d;->a:Lya3/d;

    if-nez v0, :cond_0

    invoke-interface {p0}, Lr93/b;->a()Lr93/b;

    move-result-object v0

    invoke-interface {p1}, Lr93/b;->a()Lr93/b;

    move-result-object v3

    invoke-virtual {v2, v0, v3, v1}, Lya3/d;->a(Lr93/k;Lr93/k;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr93/b;->a()Lr93/b;

    move-result-object p1

    sget v0, Lya3/f;->a:I

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Lr93/b;->a()Lr93/b;

    move-result-object p0

    invoke-static {p0, v0}, Lya3/f;->b(Lr93/b;Ljava/util/LinkedHashSet;)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/b;

    invoke-virtual {v2, p1, v0, v1}, Lya3/d;->a(Lr93/k;Lr93/k;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    return v1

    :cond_3
    const/16 p0, 0xe

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_4
    const/16 p0, 0xd

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static r(Lr93/c;Lkotlin/jvm/functions/Function1;)V
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_19

    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/c;

    invoke-interface {v2}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v3

    sget-object v4, Lr93/q;->g:Lr93/p;

    if-ne v3, v4, :cond_0

    invoke-static {v2, p1}, Lya3/n;->r(Lr93/c;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v1

    sget-object v2, Lr93/q;->g:Lr93/p;

    if-eq v1, v2, :cond_2

    goto/16 :goto_b

    :cond_2
    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lr93/q;->j:Lr93/p;

    goto :goto_5

    :cond_3
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    move-object v3, v0

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/c;

    invoke-interface {v4}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v4

    if-nez v3, :cond_5

    :goto_3
    move-object v3, v4

    goto :goto_2

    :cond_5
    invoke-static {v4, v3}, Lr93/q;->b(Lr93/r;Lr93/r;)Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-lez v5, :cond_4

    goto :goto_3

    :cond_7
    if-nez v3, :cond_9

    :cond_8
    :goto_4
    move-object v2, v0

    goto :goto_5

    :cond_9
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/c;

    invoke-interface {v4}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v4

    invoke-static {v3, v4}, Lr93/q;->b(Lr93/r;Lr93/r;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gez v4, :cond_a

    goto :goto_4

    :cond_b
    move-object v2, v3

    :goto_5
    if-nez v2, :cond_c

    :goto_6
    move-object v2, v0

    goto :goto_7

    :cond_c
    invoke-interface {p0}, Lr93/c;->getKind()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_e

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/c;

    invoke-interface {v3}, Lr93/z;->k()Lr93/a0;

    move-result-object v4

    sget-object v5, Lr93/a0;->E:Lr93/a0;

    if-eq v4, v5, :cond_d

    invoke-interface {v3}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_6

    :cond_e
    check-cast v2, Lr93/o;

    iget-object v1, v2, Lr93/o;->a:Lr93/m1;

    invoke-virtual {v1}, Lr93/m1;->c()Lr93/m1;

    move-result-object v1

    invoke-static {v1}, Lr93/q;->g(Lr93/m1;)Lr93/r;

    move-result-object v2

    :cond_f
    :goto_7
    if-nez v2, :cond_11

    if-eqz p1, :cond_10

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    sget-object v1, Lr93/q;->e:Lr93/p;

    goto :goto_8

    :cond_11
    move-object v1, v2

    :goto_8
    instance-of v3, p0, Lu93/m0;

    if-eqz v3, :cond_14

    move-object v3, p0

    check-cast v3, Lu93/m0;

    if-eqz v1, :cond_13

    iput-object v1, v3, Lu93/m0;->K:Lr93/r;

    check-cast p0, Lr93/n0;

    invoke-interface {p0}, Lr93/n0;->m()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/m0;

    if-nez v2, :cond_12

    move-object v3, v0

    goto :goto_a

    :cond_12
    move-object v3, p1

    :goto_a
    invoke-static {v1, v3}, Lya3/n;->r(Lr93/c;Lkotlin/jvm/functions/Function1;)V

    goto :goto_9

    :cond_13
    const/16 p0, 0x14

    invoke-static {p0}, Lu93/m0;->r0(I)V

    throw v0

    :cond_14
    instance-of p1, p0, Lu93/x;

    if-eqz p1, :cond_16

    check-cast p0, Lu93/x;

    if-eqz v1, :cond_15

    iput-object v1, p0, Lu93/x;->M:Lr93/r;

    return-void

    :cond_15
    const/16 p0, 0xa

    invoke-static {p0}, Lu93/x;->r0(I)V

    throw v0

    :cond_16
    check-cast p0, Lu93/k0;

    iput-object v1, p0, Lu93/k0;->L:Lr93/r;

    invoke-virtual {p0}, Lu93/k0;->J0()Lr93/n0;

    move-result-object p1

    invoke-interface {p1}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object p1

    if-eq v1, p1, :cond_17

    const/4 p1, 0x0

    iput-boolean p1, p0, Lu93/k0;->F:Z

    :cond_17
    :goto_b
    return-void

    :cond_18
    const/16 p0, 0x6b

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0

    :cond_19
    const/16 p0, 0x69

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v0
.end method

.method public static s(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 10

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const/16 p0, 0x4e

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v2

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/b;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr93/b;

    if-eqz v7, :cond_6

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lr93/b;

    invoke-static {v7, v9}, Lya3/n;->k(Lr93/b;Lr93/b;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_5
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-static {v7, v5}, Lya3/n;->k(Lr93/b;Lr93/b;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static {v5, v7}, Lya3/n;->k(Lr93/b;Lr93/b;)Z

    move-result v7

    if-nez v7, :cond_3

    move-object v4, v6

    goto :goto_1

    :cond_6
    const/16 p0, 0x45

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v2

    :cond_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_9

    if-eqz v4, :cond_8

    return-object v4

    :cond_8
    const/16 p0, 0x4f

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v2

    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-ne p0, v1, :cond_b

    invoke-static {v0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_a

    return-object p0

    :cond_a
    const/16 p0, 0x50

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v2

    :cond_b
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/b;

    invoke-interface {v3}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v3

    invoke-static {v3}, Lds/p;->J(Llb3/y;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_3

    :cond_d
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_e

    return-object v1

    :cond_e
    invoke-static {v0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_f

    return-object p0

    :cond_f
    const/16 p0, 0x52

    invoke-static {p0}, Lya3/n;->a(I)V

    throw v2
.end method


# virtual methods
.method public final f(Ljava/util/List;Ljava/util/List;)Llb3/p0;
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Lya3/n;->a:Lmb3/c;

    if-eqz v1, :cond_0

    new-instance p1, Lpg3/o;

    invoke-direct {p1, v0, v2}, Lpg3/o;-><init>(Ljava/util/HashMap;Lmb3/c;)V

    invoke-virtual {p1}, Lpg3/o;->r0()Llb3/p0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/x0;

    invoke-interface {v3}, Lr93/x0;->e()Llb3/q0;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/x0;

    invoke-interface {v4}, Lr93/x0;->e()Llb3/q0;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lpg3/o;

    invoke-direct {p1, v0, v2}, Lpg3/o;-><init>(Ljava/util/HashMap;Lmb3/c;)V

    invoke-virtual {p1}, Lpg3/o;->r0()Llb3/p0;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 p1, 0x29

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_3
    const/16 p1, 0x28

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0
.end method

.method public final h(Lva3/h;Ljava/util/Collection;Ljava/util/Collection;Lr93/e;Lya3/p;)V
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_10

    if-eqz p2, :cond_f

    if-eqz p3, :cond_e

    if-eqz p4, :cond_d

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1, p2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_7

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/c;

    if-eqz v1, :cond_6

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    sget v5, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v5

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr93/c;

    invoke-virtual {p0, v7, v1, p4}, Lya3/n;->l(Lr93/b;Lr93/b;Lr93/e;)Lya3/m;

    move-result-object v8

    invoke-virtual {v8}, Lya3/m;->b()I

    move-result v8

    invoke-interface {v7}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v9

    invoke-static {v9}, Lr93/q;->e(Lr93/r;)Z

    move-result v9

    if-nez v9, :cond_0

    sget-object v9, Lr93/q;->l:Lr93/v0;

    invoke-static {v9, v7, v1}, Lr93/q;->c(Lfb3/d;Lr93/n;Lr93/k;)Lr93/n;

    move-result-object v9

    if-nez v9, :cond_0

    move v9, v2

    goto :goto_2

    :cond_0
    const/4 v9, 0x0

    :goto_2
    invoke-static {v8}, Le4/p;->e(I)I

    move-result v8

    if-eqz v8, :cond_3

    if-eq v8, v3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v9, :cond_2

    invoke-virtual {p5, v7, v1}, Lya3/p;->c(Lr93/c;Lr93/c;)V

    :cond_2
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    if-eqz v9, :cond_4

    invoke-virtual {v5, v7}, Lub3/h;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {p5, v1, v5}, Lya3/p;->n(Lr93/c;Ljava/util/Collection;)V

    invoke-interface {p1, v4}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_6
    const/16 p1, 0x39

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_7
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    if-ge p2, v3, :cond_8

    goto :goto_4

    :cond_8
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr93/c;

    invoke-interface {p2}, Lr93/k;->g()Lr93/k;

    move-result-object p2

    new-instance p3, Lya3/o;

    invoke-direct {p3, p2, v2}, Lya3/o;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_9

    goto :goto_4

    :cond_9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, v0}, Lya3/o;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_a

    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    :goto_3
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-static {p2}, Lya3/r;->c(Ljava/util/LinkedList;)Lr93/c;

    move-result-object p1

    new-instance p3, Lya3/l;

    invoke-direct {p3}, Lya3/l;-><init>()V

    new-instance v0, Landroidx/room/d;

    const/16 v1, 0xa

    invoke-direct {v0, v1, p5, p1}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, p2, p3, v0}, Lya3/n;->g(Ljava/lang/Object;Ljava/util/LinkedList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1, p4, p5}, Lya3/n;->e(Ljava/util/Collection;Lr93/e;Lya3/p;)V

    goto :goto_3

    :cond_b
    :goto_4
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr93/c;

    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p2, p4, p5}, Lya3/n;->e(Ljava/util/Collection;Lr93/e;Lya3/p;)V

    goto :goto_5

    :cond_c
    return-void

    :cond_d
    const/16 p1, 0x35

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_e
    const/16 p1, 0x34

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_f
    const/16 p1, 0x33

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_10
    const/16 p1, 0x32

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0
.end method

.method public final l(Lr93/b;Lr93/b;Lr93/e;)Lya3/m;
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lya3/n;->m(Lr93/b;Lr93/b;Lr93/e;Z)Lya3/m;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 p1, 0x14

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_1
    const/16 p1, 0x13

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0
.end method

.method public final m(Lr93/b;Lr93/b;Lr93/e;Z)Lya3/m;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_d

    if-eqz p2, :cond_c

    invoke-virtual {p0, p1, p2, p4}, Lya3/n;->n(Lr93/b;Lr93/b;Z)Lya3/m;

    move-result-object p4

    invoke-virtual {p4}, Lya3/m;->b()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    sget-object v4, Lya3/n;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, "External condition"

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lya3/g;

    invoke-interface {v6}, Lya3/g;->a()I

    move-result v8

    if-ne v8, v3, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v6}, Lya3/g;->a()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v6, p1, p2, p3}, Lya3/g;->b(Lr93/b;Lr93/b;Lr93/e;)I

    move-result v6

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v6

    if-eqz v6, :cond_4

    if-eq v6, v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v7}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object p1

    return-object p1

    :cond_4
    move v1, v3

    goto :goto_1

    :cond_5
    if-nez v1, :cond_6

    return-object p4

    :cond_6
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lya3/g;

    invoke-interface {v1}, Lya3/g;->a()I

    move-result v4

    if-eq v4, v3, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {v1, p1, p2, p3}, Lya3/g;->b(Lr93/b;Lr93/b;Lr93/e;)I

    move-result v4

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v4

    if-eqz v4, :cond_9

    if-eq v4, v3, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {v7}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Contract violation in "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " condition. It\'s not supposed to end with success"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    sget-object p1, Lya3/m;->c:Lya3/m;

    if-eqz p1, :cond_b

    return-object p1

    :cond_b
    invoke-static {v2}, Lya3/m;->a(I)V

    throw v0

    :cond_c
    const/16 p1, 0x17

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0

    :cond_d
    const/16 p1, 0x16

    invoke-static {p1}, Lya3/n;->a(I)V

    throw v0
.end method

.method public final n(Lr93/b;Lr93/b;Z)Lya3/m;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    if-eqz v0, :cond_13

    if-eqz v1, :cond_12

    invoke-static/range {p1 .. p2}, Lya3/n;->i(Lr93/b;Lr93/b;)Lya3/m;

    move-result-object v3

    if-eqz v3, :cond_0

    return-object v3

    :cond_0
    invoke-static {v0}, Lya3/n;->d(Lr93/b;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v1}, Lya3/n;->d(Lr93/b;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-interface {v0}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v5

    invoke-interface {v1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x3

    const/4 v10, 0x0

    if-eq v7, v8, :cond_3

    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-string v1, "Type parameter number mismatch"

    if-ge v10, v0, :cond_2

    sget-object v0, Lmb3/d;->a:Lmb3/l;

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/y;

    invoke-virtual {v0, v2, v5}, Lmb3/l;->a(Llb3/y;Llb3/y;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v1}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object v0

    return-object v0

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lya3/m;

    invoke-direct {v0, v9, v1}, Lya3/m;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_3
    move-object/from16 v7, p0

    invoke-virtual {v7, v5, v6}, Lya3/n;->f(Ljava/util/List;Ljava/util/List;)Llb3/p0;

    move-result-object v8

    move v11, v10

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_a

    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lr93/x0;

    invoke-interface {v6, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr93/x0;

    if-eqz v12, :cond_9

    if-eqz v13, :cond_8

    invoke-interface {v12}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v12

    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v13}, Lr93/x0;->getUpperBounds()Ljava/util/List;

    move-result-object v13

    invoke-direct {v14, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-eq v13, v15, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Llb3/y;

    invoke-virtual {v14}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object v15

    :cond_5
    invoke-interface {v15}, Ljava/util/ListIterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_6

    invoke-interface {v15}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v16

    const/16 v17, 0x0

    move-object/from16 v2, v16

    check-cast v2, Llb3/y;

    invoke-static {v13, v2, v8}, Lya3/n;->b(Llb3/y;Llb3/y;Llb3/p0;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v15}, Ljava/util/ListIterator;->remove()V

    goto :goto_2

    :cond_6
    :goto_3
    const-string v0, "Type parameter bounds mismatch"

    invoke-static {v0}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object v0

    return-object v0

    :cond_7
    const/16 v17, 0x0

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_8
    const/16 v17, 0x0

    const/16 v0, 0x30

    invoke-static {v0}, Lya3/n;->a(I)V

    throw v17

    :cond_9
    const/16 v17, 0x0

    const/16 v0, 0x2f

    invoke-static {v0}, Lya3/n;->a(I)V

    throw v17

    :cond_a
    const/16 v17, 0x0

    move v2, v10

    :goto_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_c

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llb3/y;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/y;

    invoke-static {v5, v6, v8}, Lya3/n;->b(Llb3/y;Llb3/y;Llb3/p0;)Z

    move-result v5

    if-nez v5, :cond_b

    const-string v0, "Value parameter type mismatch"

    invoke-static {v0}, Lya3/m;->c(Ljava/lang/String;)Lya3/m;

    move-result-object v0

    return-object v0

    :cond_b
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    instance-of v2, v0, Lr93/w;

    if-eqz v2, :cond_d

    instance-of v2, v1, Lr93/w;

    if-eqz v2, :cond_d

    move-object v2, v0

    check-cast v2, Lr93/w;

    invoke-interface {v2}, Lr93/w;->isSuspend()Z

    move-result v2

    move-object v3, v1

    check-cast v3, Lr93/w;

    invoke-interface {v3}, Lr93/w;->isSuspend()Z

    move-result v3

    if-eq v2, v3, :cond_d

    new-instance v0, Lya3/m;

    const-string v1, "Incompatible suspendability"

    invoke-direct {v0, v9, v1}, Lya3/m;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_d
    if-eqz p3, :cond_10

    invoke-interface {v0}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v0

    invoke-interface {v1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v1

    if-eqz v0, :cond_10

    if-eqz v1, :cond_10

    invoke-static {v1}, Llb3/o;->e(Llb3/y;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {v0}, Llb3/o;->e(Llb3/y;)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object v1

    invoke-virtual {v0}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    if-ne v1, v0, :cond_f

    const/4 v0, 0x1

    goto :goto_5

    :cond_f
    invoke-virtual {v8, v1, v0}, Llb3/p0;->b(Lob3/g;Lob3/g;)Z

    iget-object v2, v8, Llb3/p0;->c:Lob3/o;

    sget-object v3, Llb3/d;->a:Llb3/d;

    invoke-virtual {v3, v8, v2, v1, v0}, Llb3/d;->e(Llb3/p0;Lob3/o;Lob3/g;Lob3/g;)Z

    move-result v0

    :goto_5
    if-nez v0, :cond_10

    new-instance v0, Lya3/m;

    const-string v1, "Return type mismatch"

    invoke-direct {v0, v9, v1}, Lya3/m;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_10
    :goto_6
    sget-object v0, Lya3/m;->c:Lya3/m;

    if-eqz v0, :cond_11

    return-object v0

    :cond_11
    invoke-static {v10}, Lya3/m;->a(I)V

    throw v17

    :cond_12
    move-object/from16 v7, p0

    const/16 v17, 0x0

    const/16 v0, 0x1d

    invoke-static {v0}, Lya3/n;->a(I)V

    throw v17

    :cond_13
    move-object/from16 v7, p0

    const/16 v17, 0x0

    const/16 v0, 0x1c

    invoke-static {v0}, Lya3/n;->a(I)V

    throw v17
.end method
