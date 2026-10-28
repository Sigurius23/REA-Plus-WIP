.class public final Ldq/y;
.super Lcom/google/android/gms/common/api/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ldq/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;
    .locals 11

    iget v0, p0, Ldq/y;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super/range {p0 .. p6}, Lcom/google/android/gms/common/api/a;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p4}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1

    :pswitch_2
    check-cast p4, Lzp/a;

    new-instance v2, Laq/a;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, p3, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    check-cast p4, Ljava/lang/Integer;

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "com.google.android.gms.signin.internal.clientRequestedAccount"

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    if-eqz p4, :cond_0

    const-string v0, "com.google.android.gms.common.internal.ClientSettings.sessionId"

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-virtual {v6, v0, p4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    const-string p4, "com.google.android.gms.signin.internal.offlineAccessRequested"

    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.idTokenRequested"

    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.serverClientId"

    invoke-virtual {v6, p4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "com.google.android.gms.signin.internal.usePromptModeForAuthCode"

    const/4 v0, 0x1

    invoke-virtual {v6, p4, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.forceCodeForRefreshToken"

    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p4, "com.google.android.gms.signin.internal.hostedDomain"

    invoke-virtual {v6, p4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "com.google.android.gms.signin.internal.logSessionId"

    invoke-virtual {v6, p4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p4, "com.google.android.gms.signin.internal.waitForAccessTokenRefresh"

    invoke-virtual {v6, p4, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v2 .. v8}, Laq/a;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Landroid/os/Bundle;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V

    return-object v2

    :pswitch_3
    check-cast p4, Lcom/google/android/gms/common/api/b;

    new-instance v3, Lyp/e;

    const/16 v6, 0xb9

    const/4 v10, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v3 .. v10}, Luo/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    return-object v3

    :pswitch_4
    check-cast p4, Lcom/google/android/gms/common/api/b;

    new-instance v3, Lnp/i;

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    new-instance p3, Ljava/util/HashSet;

    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    new-instance v6, La0/g;

    invoke-direct {v6, v1}, La0/f1;-><init>(I)V

    new-instance p3, La0/g;

    invoke-direct {p3, v1}, La0/f1;-><init>(I)V

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    sget-object p4, Lzp/b;->a:Ldq/y;

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    sget-object p4, Lzp/b;->b:Lcom/google/android/gms/common/api/f;

    invoke-virtual {p3, p4}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3, p4}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lzp/a;

    :goto_0
    move-object v9, p3

    goto :goto_1

    :cond_1
    sget-object p3, Lzp/a;->w:Lzp/a;

    goto :goto_0

    :goto_1
    new-instance v4, Lcom/google/crypto/tink/internal/k0;

    invoke-direct/range {v4 .. v9}, Lcom/google/crypto/tink/internal/k0;-><init>(Ljava/util/Set;La0/g;Ljava/lang/String;Ljava/lang/String;Lzp/a;)V

    move-object v9, v4

    const-string v8, "activity_recognition"

    move-object v4, p1

    move-object v5, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v3 .. v9}, Lnp/i;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;Ljava/lang/String;Lcom/google/crypto/tink/internal/k0;)V

    return-object v3

    :pswitch_5
    move-object v7, p4

    check-cast v7, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    new-instance v3, Lro/e;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v3 .. v9}, Lro/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V

    return-object v3

    :pswitch_6
    move-object v7, p4

    check-cast v7, Loo/b;

    new-instance v3, Lip/j;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v3 .. v9}, Lip/j;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Loo/b;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V

    return-object v3

    :pswitch_7
    check-cast p4, Lcom/google/android/gms/common/api/b;

    new-instance v3, Lmp/k1;

    const/16 v6, 0x94

    const/4 v10, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object v7, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v3 .. v10}, Luo/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    return-object v3

    :pswitch_8
    check-cast p4, Ldq/t;

    if-nez p4, :cond_2

    new-instance p4, Ldq/t;

    new-instance v0, Ld0/o2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ld0/o2;-><init>(I)V

    invoke-direct {p4, v0}, Ldq/t;-><init>(Ld0/o2;)V

    :cond_2
    iget v9, p4, Ldq/t;->w:I

    new-instance v3, Lsp/k;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v3 .. v9}, Lsp/k;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;I)V

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic b(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;
    .locals 7

    iget v0, p0, Ldq/y;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super/range {p0 .. p6}, Lcom/google/android/gms/common/api/a;->b(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;

    move-result-object p1

    return-object p1

    :sswitch_0
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    check-cast p4, Luo/n;

    new-instance v0, Lwo/c;

    move-object v6, v5

    move-object v5, v4

    move-object v4, p4

    invoke-direct/range {v0 .. v6}, Lwo/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Luo/n;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V

    return-object v0

    :sswitch_1
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    check-cast p4, Lpo/m;

    new-instance v0, Lip/e;

    invoke-direct/range {v0 .. v5}, Lip/e;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V

    return-object v0

    :sswitch_2
    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    check-cast p4, Lpo/l;

    new-instance v0, Lip/l;

    invoke-direct/range {v0 .. v5}, Lip/l;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x2 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method
