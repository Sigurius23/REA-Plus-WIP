.class public final synthetic Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/serialization/internal/GeneratedSerializer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlinx/serialization/internal/GeneratedSerializer<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00100\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "com/stripe/android/financialconnections/model/FinancialConnectionsAccount.$serializer",
        "Lkotlinx/serialization/internal/GeneratedSerializer;",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        "<init>",
        "()V",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;)V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;",
        "",
        "Lwc3/c;",
        "childSerializers",
        "()[Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;

    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    const-string v2, "com.stripe.android.financialconnections.model.FinancialConnectionsAccount"

    const/16 v3, 0x10

    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V

    const-string v0, "category"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "created"

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "id"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "institution_name"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "livemode"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "status"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "subcategory"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "supported_payment_method_types"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "balance"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "balance_refresh"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "display_name"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "last4"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "ownership"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "ownership_refresh"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "permissions"

    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    const-string v0, "object"

    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->addElement(Ljava/lang/String;Z)V

    sput-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final childSerializers()[Lwc3/c;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lwc3/c;"
        }
    .end annotation

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v0

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/4 v2, 0x7

    aget-object v3, v0, v2

    sget-object v4, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    sget-object v5, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;

    invoke-static {v5}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v5

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v6

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v7

    invoke-static {v1}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v8

    sget-object v9, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;

    invoke-static {v9}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v9

    const/16 v10, 0xe

    aget-object v0, v0, v10

    invoke-static {v0}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v0

    const/16 v11, 0x10

    new-array v11, v11, [Lwc3/c;

    sget-object v12, Lcom/stripe/android/financialconnections/model/k;->e:Lcom/stripe/android/financialconnections/model/k;

    const/4 v13, 0x0

    aput-object v12, v11, v13

    sget-object v12, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    const/4 v13, 0x1

    aput-object v12, v11, v13

    const/4 v12, 0x2

    aput-object v1, v11, v12

    const/4 v12, 0x3

    aput-object v1, v11, v12

    sget-object v12, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    const/4 v13, 0x4

    aput-object v12, v11, v13

    sget-object v12, Lcom/stripe/android/financialconnections/model/q;->e:Lcom/stripe/android/financialconnections/model/q;

    const/4 v13, 0x5

    aput-object v12, v11, v13

    sget-object v12, Lcom/stripe/android/financialconnections/model/s;->e:Lcom/stripe/android/financialconnections/model/s;

    const/4 v13, 0x6

    aput-object v12, v11, v13

    aput-object v3, v11, v2

    const/16 v2, 0x8

    aput-object v4, v11, v2

    const/16 v2, 0x9

    aput-object v5, v11, v2

    const/16 v2, 0xa

    aput-object v6, v11, v2

    const/16 v2, 0xb

    aput-object v7, v11, v2

    const/16 v2, 0xc

    aput-object v8, v11, v2

    const/16 v2, 0xd

    aput-object v9, v11, v2

    aput-object v0, v11, v10

    const/16 v0, 0xf

    aput-object v1, v11, v0

    return-object v11
.end method

.method public final deserialize(Lzc3/d;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
    .locals 49

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->descriptor:Lyc3/g;

    invoke-interface {v0, v1}, Lzc3/d;->beginStructure(Lyc3/g;)Lzc3/b;

    move-result-object v0

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->access$get$childSerializers$cp()[Lwc3/c;

    move-result-object v2

    invoke-interface {v0}, Lzc3/b;->decodeSequentially()Z

    move-result v3

    const/16 v8, 0xa

    const/16 v9, 0x9

    const/4 v10, 0x6

    const/4 v11, 0x5

    const/4 v12, 0x3

    const/16 v13, 0x8

    const/4 v14, 0x4

    const/4 v15, 0x2

    const/16 v16, 0xe

    const/4 v4, 0x7

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_0

    sget-object v3, Lcom/stripe/android/financialconnections/model/k;->e:Lcom/stripe/android/financialconnections/model/k;

    invoke-interface {v0, v1, v6, v3, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    invoke-interface {v0, v1, v5}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v5

    invoke-interface {v0, v1, v15}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v1, v12}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v14}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v14

    sget-object v15, Lcom/stripe/android/financialconnections/model/q;->e:Lcom/stripe/android/financialconnections/model/q;

    invoke-interface {v0, v1, v11, v15, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    sget-object v15, Lcom/stripe/android/financialconnections/model/s;->e:Lcom/stripe/android/financialconnections/model/s;

    invoke-interface {v0, v1, v10, v15, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    aget-object v15, v2, v4

    check-cast v15, Lwc3/b;

    invoke-interface {v0, v1, v4, v15, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v15, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    invoke-interface {v0, v1, v13, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/stripe/android/financialconnections/model/Balance;

    sget-object v15, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;

    invoke-interface {v0, v1, v9, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    sget-object v15, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-interface {v0, v1, v8, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v20, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    move-object/from16 v19, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v15, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;

    move-object/from16 v18, v2

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    aget-object v15, v20, v16

    check-cast v15, Lwc3/b;

    move-object/from16 v17, v2

    move/from16 v2, v16

    invoke-interface {v0, v1, v2, v15, v7}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/16 v7, 0xf

    invoke-interface {v0, v1, v7}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v7

    const v15, 0xffff

    move-object/from16 v46, v2

    move-object/from16 v32, v3

    move-object/from16 v39, v4

    move/from16 v33, v5

    move-object/from16 v34, v6

    move-object/from16 v47, v7

    move-object/from16 v42, v8

    move-object/from16 v41, v9

    move-object/from16 v38, v10

    move-object/from16 v37, v11

    move-object/from16 v35, v12

    move-object/from16 v40, v13

    move/from16 v36, v14

    move/from16 v31, v15

    move-object/from16 v45, v17

    move-object/from16 v44, v18

    move-object/from16 v43, v19

    goto/16 :goto_4

    :cond_0
    move-object/from16 v20, v2

    const/16 v2, 0xf

    move/from16 v24, v4

    move/from16 v27, v5

    move v3, v6

    move v8, v3

    move/from16 v26, v8

    move-object v4, v7

    move-object v5, v4

    move-object v6, v5

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v21, v15

    move-object/from16 v22, v21

    move-object/from16 v25, v22

    :goto_0
    if-eqz v27, :cond_1

    invoke-interface {v0, v1}, Lzc3/b;->decodeElementIndex(Lyc3/g;)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/UnknownFieldException;

    invoke-direct {v0, v2}, Lkotlinx/serialization/UnknownFieldException;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v2, 0xf

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v25

    const v28, 0x8000

    or-int v8, v8, v28

    goto :goto_0

    :pswitch_1
    const/16 v2, 0xe

    aget-object v16, v20, v2

    move/from16 v29, v3

    move-object/from16 v3, v16

    check-cast v3, Lwc3/b;

    invoke-interface {v0, v1, v2, v3, v9}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/util/List;

    or-int/lit16 v8, v8, 0x4000

    :goto_1
    move/from16 v3, v29

    const/16 v2, 0xf

    goto :goto_0

    :pswitch_2
    move/from16 v29, v3

    const/16 v2, 0xe

    sget-object v3, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v3, v13}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    or-int/lit16 v8, v8, 0x2000

    goto :goto_1

    :pswitch_3
    move/from16 v29, v3

    const/16 v2, 0xd

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v3, v4}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x1000

    goto :goto_1

    :pswitch_4
    move/from16 v29, v3

    const/16 v2, 0xc

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v3, v10}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x800

    goto :goto_1

    :pswitch_5
    move/from16 v29, v3

    const/16 v2, 0xb

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v3, v11}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    or-int/lit16 v8, v8, 0x400

    goto :goto_1

    :pswitch_6
    move/from16 v29, v3

    const/16 v2, 0xa

    sget-object v3, Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/BalanceRefresh$$serializer;

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v3, v14}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Lcom/stripe/android/financialconnections/model/BalanceRefresh;

    or-int/lit16 v8, v8, 0x200

    goto :goto_1

    :pswitch_7
    move/from16 v29, v3

    const/16 v2, 0x9

    sget-object v3, Lcom/stripe/android/financialconnections/model/Balance$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Balance$$serializer;

    const/16 v2, 0x8

    invoke-interface {v0, v1, v2, v3, v12}, Lzc3/b;->decodeNullableSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lcom/stripe/android/financialconnections/model/Balance;

    or-int/lit16 v8, v8, 0x100

    goto :goto_1

    :pswitch_8
    move/from16 v29, v3

    const/16 v2, 0x8

    aget-object v3, v20, v24

    check-cast v3, Lwc3/b;

    move/from16 v2, v24

    invoke-interface {v0, v1, v2, v3, v15}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    check-cast v15, Ljava/util/List;

    or-int/lit16 v8, v8, 0x80

    goto/16 :goto_1

    :pswitch_9
    move/from16 v29, v3

    move/from16 v2, v24

    sget-object v3, Lcom/stripe/android/financialconnections/model/s;->e:Lcom/stripe/android/financialconnections/model/s;

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, v3, v5}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    or-int/lit8 v8, v8, 0x40

    :goto_2
    move/from16 v3, v29

    :goto_3
    const/16 v2, 0xf

    const/16 v24, 0x7

    goto/16 :goto_0

    :pswitch_a
    move/from16 v29, v3

    const/4 v2, 0x6

    sget-object v3, Lcom/stripe/android/financialconnections/model/q;->e:Lcom/stripe/android/financialconnections/model/q;

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v3, v6}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;

    or-int/lit8 v8, v8, 0x20

    goto :goto_2

    :pswitch_b
    move/from16 v29, v3

    const/4 v2, 0x5

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3}, Lzc3/b;->decodeBooleanElement(Lyc3/g;I)Z

    move-result v26

    or-int/lit8 v8, v8, 0x10

    goto :goto_2

    :pswitch_c
    move/from16 v29, v3

    const/4 v2, 0x3

    const/4 v3, 0x4

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v22

    or-int/lit8 v8, v8, 0x8

    goto :goto_2

    :pswitch_d
    move/from16 v29, v3

    const/4 v2, 0x2

    const/4 v3, 0x4

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeStringElement(Lyc3/g;I)Ljava/lang/String;

    move-result-object v21

    or-int/lit8 v8, v8, 0x4

    goto :goto_2

    :pswitch_e
    const/4 v2, 0x1

    const/4 v3, 0x4

    invoke-interface {v0, v1, v2}, Lzc3/b;->decodeIntElement(Lyc3/g;I)I

    move-result v23

    or-int/lit8 v8, v8, 0x2

    move/from16 v3, v23

    goto :goto_3

    :pswitch_f
    move/from16 v29, v3

    const/4 v3, 0x4

    sget-object v2, Lcom/stripe/android/financialconnections/model/k;->e:Lcom/stripe/android/financialconnections/model/k;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2, v7}, Lzc3/b;->decodeSerializableElement(Lyc3/g;ILwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    or-int/lit8 v8, v8, 0x1

    goto :goto_2

    :pswitch_10
    move/from16 v29, v3

    const/4 v3, 0x0

    move/from16 v27, v3

    goto :goto_2

    :cond_1
    move/from16 v29, v3

    move-object/from16 v44, v4

    move-object/from16 v38, v5

    move-object/from16 v37, v6

    move-object/from16 v32, v7

    move/from16 v31, v8

    move-object/from16 v46, v9

    move-object/from16 v43, v10

    move-object/from16 v42, v11

    move-object/from16 v40, v12

    move-object/from16 v45, v13

    move-object/from16 v41, v14

    move-object/from16 v39, v15

    move-object/from16 v34, v21

    move-object/from16 v35, v22

    move-object/from16 v47, v25

    move/from16 v36, v26

    move/from16 v33, v29

    :goto_4
    invoke-interface {v0, v1}, Lzc3/b;->endStructure(Lyc3/g;)V

    new-instance v30, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    const/16 v48, 0x0

    invoke-direct/range {v30 .. v48}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;-><init>(ILcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;ILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Lcom/stripe/android/financialconnections/model/Balance;Lcom/stripe/android/financialconnections/model/BalanceRefresh;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v30

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->deserialize(Lzc3/d;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->descriptor:Lyc3/g;

    invoke-interface {p1, v0}, Lzc3/e;->beginStructure(Lyc3/g;)Lzc3/c;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;Lzc3/c;Lyc3/g;)V

    invoke-interface {p1, v0}, Lzc3/c;->endStructure(Lyc3/g;)V

    return-void
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$$serializer;->serialize(Lzc3/e;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;)V

    return-void
.end method
