.class public abstract Ldq/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/f;

.field public static final b:Lcom/google/android/gms/common/c;

.field public static final c:Lcom/google/android/gms/common/c;

.field public static final d:[Lcom/google/android/gms/common/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/google/android/gms/common/api/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldq/y;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ldq/y;-><init>(I)V

    new-instance v2, Lcom/google/android/gms/common/api/f;

    const-string v3, "Wallet.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/google/android/gms/common/api/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/e;)V

    sput-object v2, Ldq/u;->a:Lcom/google/android/gms/common/api/f;

    new-instance v4, Lcom/google/android/gms/common/c;

    const-string v0, "wallet"

    const-wide/16 v1, 0x1

    invoke-direct {v4, v0, v1, v2}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v5, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_biometric_auth_keys"

    invoke-direct {v5, v0, v1, v2}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v6, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_payment_dynamic_update"

    const-wide/16 v7, 0x2

    invoke-direct {v6, v0, v7, v8}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v6, Ldq/u;->b:Lcom/google/android/gms/common/c;

    new-instance v7, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_1p_initialize_buyflow"

    invoke-direct {v7, v0, v1, v2}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v8, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_warm_up_ui_process"

    invoke-direct {v8, v0, v1, v2}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v9, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_get_setup_wizard_intent"

    const-wide/16 v10, 0x4

    invoke-direct {v9, v0, v10, v11}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    new-instance v10, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_get_payment_card_recognition_intent"

    invoke-direct {v10, v0, v1, v2}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    sput-object v10, Ldq/u;->c:Lcom/google/android/gms/common/c;

    new-instance v11, Lcom/google/android/gms/common/c;

    const-string v0, "wallet_save_instrument"

    invoke-direct {v11, v0, v1, v2}, Lcom/google/android/gms/common/c;-><init>(Ljava/lang/String;J)V

    filled-new-array/range {v4 .. v11}, [Lcom/google/android/gms/common/c;

    move-result-object v0

    sput-object v0, Ldq/u;->d:[Lcom/google/android/gms/common/c;

    return-void
.end method
