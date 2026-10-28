.class public final Lr30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lr30/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/lang/String;

.field public final G:Lr30/a;

.field public final H:Ljava/lang/String;

.field public final I:Ljava/util/List;

.field public final J:Ljava/lang/Boolean;

.field public final K:Ljava/lang/Boolean;

.field public final L:Ljava/lang/Boolean;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Lq30/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq30/j0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lq30/j0;-><init>(I)V

    sput-object v0, Lr30/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Lr30/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    const-string v0, "messageVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threeDsServerTransId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsTransId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lr30/b;->w:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lr30/b;->x:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lr30/b;->y:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lr30/b;->z:Lq30/q0;

    .line 6
    iput-object p5, p0, Lr30/b;->E:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lr30/b;->F:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lr30/b;->G:Lr30/a;

    .line 9
    iput-object p8, p0, Lr30/b;->H:Ljava/lang/String;

    .line 10
    iput-object p9, p0, Lr30/b;->I:Ljava/util/List;

    .line 11
    iput-object p10, p0, Lr30/b;->J:Ljava/lang/Boolean;

    .line 12
    iput-object p11, p0, Lr30/b;->K:Ljava/lang/Boolean;

    .line 13
    iput-object p12, p0, Lr30/b;->L:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/util/List;I)V
    .locals 14

    move/from16 v0, p7

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p6

    :goto_0
    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .line 14
    invoke-direct/range {v1 .. v13}, Lr30/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Lr30/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static b(Lr30/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;I)Lr30/b;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p4

    sget-object v2, Lr30/a;->x:Lr30/a;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v5, v0, Lr30/b;->w:Ljava/lang/String;

    iget-object v6, v0, Lr30/b;->x:Ljava/lang/String;

    iget-object v7, v0, Lr30/b;->y:Ljava/lang/String;

    iget-object v8, v0, Lr30/b;->z:Lq30/q0;

    iget-object v9, v0, Lr30/b;->E:Ljava/lang/String;

    and-int/lit8 v4, v1, 0x20

    if-eqz v4, :cond_0

    iget-object v4, v0, Lr30/b;->F:Ljava/lang/String;

    move-object v10, v4

    goto :goto_0

    :cond_0
    move-object/from16 v10, p1

    :goto_0
    and-int/lit8 v4, v1, 0x40

    if-eqz v4, :cond_1

    iget-object v2, v0, Lr30/b;->G:Lr30/a;

    :cond_1
    move-object v11, v2

    and-int/lit16 v2, v1, 0x80

    if-eqz v2, :cond_2

    iget-object v2, v0, Lr30/b;->H:Ljava/lang/String;

    move-object v12, v2

    goto :goto_1

    :cond_2
    move-object/from16 v12, p2

    :goto_1
    iget-object v13, v0, Lr30/b;->I:Ljava/util/List;

    and-int/lit16 v2, v1, 0x200

    if-eqz v2, :cond_3

    iget-object v2, v0, Lr30/b;->J:Ljava/lang/Boolean;

    move-object v14, v2

    goto :goto_2

    :cond_3
    move-object v14, v3

    :goto_2
    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_4

    iget-object v3, v0, Lr30/b;->K:Ljava/lang/Boolean;

    :cond_4
    move-object v15, v3

    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_5

    iget-object v0, v0, Lr30/b;->L:Ljava/lang/Boolean;

    move-object/from16 v16, v0

    goto :goto_3

    :cond_5
    move-object/from16 v16, p3

    :goto_3
    const-string v0, "messageVersion"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threeDsServerTransId"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "acsTransId"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransId"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lr30/b;

    invoke-direct/range {v4 .. v16}, Lr30/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Lr30/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v4
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lr30/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lr30/b;

    iget-object v1, p0, Lr30/b;->w:Ljava/lang/String;

    iget-object v3, p1, Lr30/b;->w:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lr30/b;->x:Ljava/lang/String;

    iget-object v3, p1, Lr30/b;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lr30/b;->y:Ljava/lang/String;

    iget-object v3, p1, Lr30/b;->y:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lr30/b;->z:Lq30/q0;

    iget-object v3, p1, Lr30/b;->z:Lq30/q0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lr30/b;->E:Ljava/lang/String;

    iget-object v3, p1, Lr30/b;->E:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lr30/b;->F:Ljava/lang/String;

    iget-object v3, p1, Lr30/b;->F:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lr30/b;->G:Lr30/a;

    iget-object v3, p1, Lr30/b;->G:Lr30/a;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lr30/b;->H:Ljava/lang/String;

    iget-object v3, p1, Lr30/b;->H:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lr30/b;->I:Ljava/util/List;

    iget-object v3, p1, Lr30/b;->I:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lr30/b;->J:Ljava/lang/Boolean;

    iget-object v3, p1, Lr30/b;->J:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lr30/b;->K:Ljava/lang/Boolean;

    iget-object v3, p1, Lr30/b;->K:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lr30/b;->L:Ljava/lang/Boolean;

    iget-object p1, p1, Lr30/b;->L:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f()Lorg/json/JSONObject;
    .locals 5

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "messageType"

    const-string v2, "CReq"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "messageVersion"

    iget-object v2, p0, Lr30/b;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "sdkTransID"

    iget-object v2, p0, Lr30/b;->z:Lq30/q0;

    iget-object v2, v2, Lq30/q0;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "threeDSServerTransID"

    iget-object v2, p0, Lr30/b;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "acsTransID"

    iget-object v2, p0, Lr30/b;->y:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lr30/b;->G:Lr30/a;

    if-eqz v1, :cond_0

    :try_start_1
    const-string v2, "challengeCancel"

    iget-object v3, v1, Lr30/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    :goto_0
    iget-object v2, p0, Lr30/b;->E:Ljava/lang/String;

    if-eqz v2, :cond_2

    :try_start_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "threeDSRequestorAppURL"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    :goto_1
    iget-object v2, p0, Lr30/b;->F:Ljava/lang/String;

    if-eqz v2, :cond_4

    :try_start_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "challengeDataEntry"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_4
    :goto_2
    iget-object v3, p0, Lr30/b;->H:Ljava/lang/String;

    if-eqz v3, :cond_6

    :try_start_4
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "challengeHTMLDataEntry"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_6
    :goto_3
    const-string v4, "Y"

    if-eqz v2, :cond_7

    :try_start_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_9

    :cond_7
    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    if-nez v1, :cond_9

    const-string v1, "challengeNoEntry"

    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    iget-object v1, p0, Lr30/b;->I:Ljava/util/List;

    invoke-static {v1}, Lbp/b;->K(Ljava/util/List;)Lorg/json/JSONArray;

    move-result-object v1

    if-eqz v1, :cond_a

    const-string v2, "messageExtensions"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_a
    iget-object v1, p0, Lr30/b;->J:Ljava/lang/Boolean;

    if-eqz v1, :cond_b

    const-string v2, "oobContinue"

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_b
    iget-object v1, p0, Lr30/b;->K:Ljava/lang/Boolean;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v2, "N"

    if-eqz v1, :cond_d

    :try_start_6
    const-string v3, "resendChallenge"

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_c

    move-object v1, v4

    goto :goto_4

    :cond_c
    move-object v1, v2

    :goto_4
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_d
    iget-object v1, p0, Lr30/b;->L:Ljava/lang/Boolean;

    if-eqz v1, :cond_f

    const-string v3, "whitelistingDataEntry"

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_5

    :cond_e
    move-object v4, v2

    :goto_5
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_f
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-object v0

    :goto_6
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_10

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0

    :cond_10
    new-instance v1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {v1, v0}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lr30/b;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lr30/b;->x:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lr30/b;->y:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lr30/b;->z:Lq30/q0;

    iget-object v2, v2, Lq30/q0;->w:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lr30/b;->E:Ljava/lang/String;

    if-nez v3, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_0
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/b;->F:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/b;->G:Lr30/a;

    if-nez v3, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/b;->H:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/b;->I:Ljava/util/List;

    if-nez v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/b;->J:Ljava/lang/Boolean;

    if-nez v3, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v3, p0, Lr30/b;->K:Ljava/lang/Boolean;

    if-nez v3, :cond_6

    move v3, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lr30/b;->L:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const-string v0, ", threeDsServerTransId="

    const-string v1, ", acsTransId="

    const-string v2, "ChallengeRequestData(messageVersion="

    iget-object v3, p0, Lr30/b;->w:Ljava/lang/String;

    iget-object v4, p0, Lr30/b;->x:Ljava/lang/String;

    invoke-static {v2, v3, v0, v4, v1}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lr30/b;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdkTransId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/b;->z:Lq30/q0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threeDSRequestorAppURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeDataEntry="

    const-string v2, ", cancelReason="

    iget-object v3, p0, Lr30/b;->E:Ljava/lang/String;

    iget-object v4, p0, Lr30/b;->F:Ljava/lang/String;

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lr30/b;->G:Lr30/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", challengeHtmlDataEntry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/b;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", messageExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/b;->I:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", oobContinue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/b;->J:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shouldResendChallenge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/b;->K:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", whitelistingDataEntry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr30/b;->L:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr30/b;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/b;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/b;->y:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/b;->z:Lq30/q0;

    invoke-virtual {v0, p1, p2}, Lq30/q0;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lr30/b;->E:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lr30/b;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lr30/b;->G:Lr30/a;

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_0
    iget-object v2, p0, Lr30/b;->H:Ljava/lang/String;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v2, p0, Lr30/b;->I:Ljava/util/List;

    if-nez v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr30/h;

    invoke-virtual {v3, p1, p2}, Lr30/h;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object p2, p0, Lr30/b;->J:Ljava/lang/Boolean;

    if-nez p2, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_3
    iget-object p2, p0, Lr30/b;->K:Ljava/lang/Boolean;

    if-nez p2, :cond_4

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_4

    :cond_4
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    :goto_4
    iget-object p2, p0, Lr30/b;->L:Ljava/lang/Boolean;

    if-nez p2, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_5
    invoke-static {p1, v0, p2}, Lvl/b;->s(Landroid/os/Parcel;ILjava/lang/Boolean;)V

    return-void
.end method
