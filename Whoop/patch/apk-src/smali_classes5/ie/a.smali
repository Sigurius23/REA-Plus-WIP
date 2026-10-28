.class public final enum Lie/a;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lbf/a;


# static fields
.field public static final enum E:Lie/a;

.field public static final enum F:Lie/a;

.field public static final enum G:Lie/a;

.field public static final enum H:Lie/a;

.field public static final enum I:Lie/a;

.field public static final enum J:Lie/a;

.field public static final enum K:Lie/a;

.field public static final enum L:Lie/a;

.field public static final enum M:Lie/a;

.field public static final enum N:Lie/a;

.field public static final enum O:Lie/a;

.field public static final enum P:Lie/a;

.field public static final enum Q:Lie/a;

.field public static final enum R:Lie/a;

.field public static final enum S:Lie/a;

.field public static final enum T:Lie/a;

.field public static final enum U:Lie/a;

.field public static final synthetic V:[Lie/a;

.field public static final enum x:Lie/a;

.field public static final enum y:Lie/a;

.field public static final enum z:Lie/a;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v1, Lie/a;

    const/4 v0, 0x0

    const-string v2, "e"

    const-string v3, "CREDENTIALS_CODE"

    invoke-direct {v1, v3, v0, v2}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lie/a;->x:Lie/a;

    new-instance v2, Lie/a;

    const/4 v0, 0x1

    const-string v3, "f"

    const-string v4, "CREDENTIALS_JVM_SYSTEM_PROPERTIES"

    invoke-direct {v2, v4, v0, v3}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lie/a;->y:Lie/a;

    new-instance v3, Lie/a;

    const/4 v0, 0x2

    const-string v4, "g"

    const-string v5, "CREDENTIALS_ENV_VARS"

    invoke-direct {v3, v5, v0, v4}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lie/a;->z:Lie/a;

    new-instance v4, Lie/a;

    const/4 v0, 0x3

    const-string v5, "h"

    const-string v6, "CREDENTIALS_ENV_VARS_STS_WEB_ID_TOKEN"

    invoke-direct {v4, v6, v0, v5}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lie/a;->E:Lie/a;

    new-instance v5, Lie/a;

    const/4 v0, 0x4

    const-string v6, "i"

    const-string v7, "CREDENTIALS_STS_ASSUME_ROLE"

    invoke-direct {v5, v7, v0, v6}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lie/a;->F:Lie/a;

    new-instance v6, Lie/a;

    const/4 v0, 0x5

    const-string v7, "k"

    const-string v8, "CREDENTIALS_STS_ASSUME_ROLE_WEB_ID"

    invoke-direct {v6, v8, v0, v7}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lie/a;->G:Lie/a;

    new-instance v7, Lie/a;

    const/4 v0, 0x6

    const-string v8, "n"

    const-string v9, "CREDENTIALS_PROFILE"

    invoke-direct {v7, v9, v0, v8}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lie/a;->H:Lie/a;

    new-instance v8, Lie/a;

    const/4 v0, 0x7

    const-string v9, "o"

    const-string v10, "CREDENTIALS_PROFILE_SOURCE_PROFILE"

    invoke-direct {v8, v10, v0, v9}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lie/a;->I:Lie/a;

    new-instance v9, Lie/a;

    const/16 v0, 0x8

    const-string v10, "p"

    const-string v11, "CREDENTIALS_PROFILE_NAMED_PROVIDER"

    invoke-direct {v9, v11, v0, v10}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lie/a;->J:Lie/a;

    new-instance v10, Lie/a;

    const/16 v0, 0x9

    const-string v11, "q"

    const-string v12, "CREDENTIALS_PROFILE_STS_WEB_ID_TOKEN"

    invoke-direct {v10, v12, v0, v11}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lie/a;->K:Lie/a;

    new-instance v11, Lie/a;

    const/16 v0, 0xa

    const-string v12, "r"

    const-string v13, "CREDENTIALS_PROFILE_SSO"

    invoke-direct {v11, v13, v0, v12}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lie/a;->L:Lie/a;

    new-instance v12, Lie/a;

    const/16 v0, 0xb

    const-string v13, "s"

    const-string v14, "CREDENTIALS_SSO"

    invoke-direct {v12, v14, v0, v13}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lie/a;->M:Lie/a;

    new-instance v13, Lie/a;

    const/16 v0, 0xc

    const-string v14, "t"

    const-string v15, "CREDENTIALS_PROFILE_SSO_LEGACY"

    invoke-direct {v13, v15, v0, v14}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lie/a;->N:Lie/a;

    new-instance v14, Lie/a;

    const/16 v0, 0xd

    const-string v15, "u"

    move-object/from16 v16, v1

    const-string v1, "CREDENTIALS_SSO_LEGACY"

    invoke-direct {v14, v1, v0, v15}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v14, Lie/a;->O:Lie/a;

    new-instance v15, Lie/a;

    const/16 v0, 0xe

    const-string v1, "v"

    move-object/from16 v17, v2

    const-string v2, "CREDENTIALS_PROFILE_PROCESS"

    invoke-direct {v15, v2, v0, v1}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v15, Lie/a;->P:Lie/a;

    new-instance v0, Lie/a;

    const/16 v1, 0xf

    const-string v2, "w"

    move-object/from16 v18, v3

    const-string v3, "CREDENTIALS_PROCESS"

    invoke-direct {v0, v3, v1, v2}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lie/a;->Q:Lie/a;

    new-instance v1, Lie/a;

    const/16 v2, 0x10

    const-string v3, "z"

    move-object/from16 v19, v0

    const-string v0, "CREDENTIALS_HTTP"

    invoke-direct {v1, v0, v2, v3}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lie/a;->R:Lie/a;

    new-instance v0, Lie/a;

    const/16 v2, 0x11

    const-string v3, "0"

    move-object/from16 v20, v1

    const-string v1, "CREDENTIALS_IMDS"

    invoke-direct {v0, v1, v2, v3}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lie/a;->S:Lie/a;

    new-instance v1, Lie/a;

    const/16 v2, 0x12

    const-string v3, "AC"

    move-object/from16 v21, v0

    const-string v0, "CREDENTIALS_PROFILE_LOGIN"

    invoke-direct {v1, v0, v2, v3}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lie/a;->T:Lie/a;

    new-instance v0, Lie/a;

    const/16 v2, 0x13

    const-string v3, "AD"

    move-object/from16 v22, v1

    const-string v1, "CREDENTIALS_LOGIN"

    invoke-direct {v0, v1, v2, v3}, Lie/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lie/a;->U:Lie/a;

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v16, v19

    move-object/from16 v17, v20

    move-object/from16 v18, v21

    move-object/from16 v19, v22

    move-object/from16 v20, v0

    filled-new-array/range {v1 .. v20}, [Lie/a;

    move-result-object v0

    sput-object v0, Lie/a;->V:[Lie/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lie/a;->w:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lie/a;
    .locals 1

    const-class v0, Lie/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lie/a;

    return-object p0
.end method

.method public static values()[Lie/a;
    .locals 1

    sget-object v0, Lie/a;->V:[Lie/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lie/a;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lie/a;->w:Ljava/lang/String;

    return-object v0
.end method
