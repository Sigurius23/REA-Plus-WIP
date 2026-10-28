.class public final La3/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llh/e;
.implements Llk/c;
.implements Lll/a;
.implements Lp1/c;
.implements Lpf/t;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    iput p1, p0, La3/p;->w:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    sparse-switch p1, :sswitch_data_0

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 175
    new-instance p1, Laj/c;

    invoke-direct {p1, v0, v1}, Laj/c;-><init>(IB)V

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 176
    new-instance p1, Laj/c;

    invoke-direct {p1, v0, v1}, Laj/c;-><init>(IB)V

    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    .line 177
    new-instance p1, Laj/c;

    invoke-direct {p1, v0, v1}, Laj/c;-><init>(IB)V

    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void

    .line 178
    :sswitch_0
    sget-object p1, Lvg/n;->a:Lvg/m;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    sget-object p1, Lvg/m;->b:Lvg/r;

    .line 180
    const-string v2, "provider"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 182
    new-instance v2, Lpf/e;

    invoke-direct {v2, p1, v1}, Lpf/e;-><init>(Lvg/l;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, La3/p;->x:Ljava/lang/Object;

    .line 183
    new-instance v1, Lpf/e;

    invoke-direct {v1, p1, v0}, Lpf/e;-><init>(Lvg/l;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, La3/p;->y:Ljava/lang/Object;

    .line 184
    new-instance v0, Lpf/e;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lpf/e;-><init>(Lvg/l;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void

    .line 185
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    new-instance p1, La0/a0;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, La0/a0;-><init>(I)V

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 187
    sget-object p1, La0/d1;->a:[J

    .line 188
    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    .line 189
    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    .line 190
    new-instance p1, Ljc/b;

    const/16 v0, 0x17

    .line 191
    invoke-direct {p1, v0}, Ljc/b;-><init>(I)V

    .line 192
    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void

    .line 193
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 194
    sget-object p1, La0/d1;->a:[J

    .line 195
    new-instance p1, La0/v0;

    invoke-direct {p1}, La0/v0;-><init>()V

    .line 196
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    return-void

    .line 197
    :sswitch_3
    new-instance p1, Lio/sentry/protocol/v;

    invoke-direct {p1}, Lio/sentry/protocol/v;-><init>()V

    new-instance v0, Lio/sentry/h7;

    invoke-direct {v0}, Lio/sentry/h7;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, La3/p;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/c;)V

    return-void

    .line 198
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 199
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void

    .line 200
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 201
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 202
    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    return-void

    .line 203
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 204
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 205
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    .line 206
    sget-object p1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_6
        0x7 -> :sswitch_5
        0x8 -> :sswitch_4
        0x9 -> :sswitch_3
        0x16 -> :sswitch_2
        0x18 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, La3/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La3/p;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, La3/p;->w:I

    .line 170
    iget-object v0, p1, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/protocol/v;

    .line 171
    iget-object v1, p1, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/h7;

    .line 172
    iget-object p1, p1, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Lio/sentry/c;

    .line 173
    invoke-direct {p0, v0, v1, p1}, La3/p;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/c;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/4 v0, 0x3

    iput v0, p0, La3/p;->w:I

    .line 117
    const-string v0, "IterableInAppFileStorage"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 119
    invoke-static {v1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, La3/p;->y:Ljava/lang/Object;

    .line 120
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "FileOperationThread"

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 121
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 122
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 123
    new-instance v2, Lcom/iterable/iterableapi/p0;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, p0, v1}, Lcom/iterable/iterableapi/p0;-><init>(La3/p;Landroid/os/Looper;)V

    iput-object v2, p0, La3/p;->z:Ljava/lang/Object;

    .line 124
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 125
    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    const-string v3, "com.iterable.sdk"

    invoke-direct {v2, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 126
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 127
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 128
    :cond_0
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 130
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 131
    :cond_1
    const-string v2, "itbl_inapp.json"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 132
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 133
    new-instance p1, Lorg/json/JSONObject;

    invoke-static {v1}, Lge3/g;->P(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 134
    invoke-virtual {p0, p1}, La3/p;->E(Lorg/json/JSONObject;)V

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    .line 135
    :cond_2
    invoke-virtual {p0}, La3/p;->x()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 136
    new-instance p1, Lorg/json/JSONObject;

    invoke-virtual {p0}, La3/p;->x()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lge3/g;->P(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p0, p1}, La3/p;->E(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 138
    :goto_0
    const-string v1, "Error while loading in-app messages from file"

    invoke-static {v0, v1, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/net/ConnectivityManager;Lqh/g;)V
    .locals 2

    const/16 v0, 0x11

    iput v0, p0, La3/p;->w:I

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 154
    iput-object p2, p0, La3/p;->y:Ljava/lang/Object;

    .line 155
    new-instance p2, Lio/sentry/android/core/internal/util/b;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lio/sentry/android/core/internal/util/b;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, La3/p;->z:Ljava/lang/Object;

    .line 156
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    const/16 v1, 0xc

    .line 157
    invoke-virtual {v0, v1}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    move-result-object v0

    .line 158
    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    .line 159
    invoke-virtual {p1, v0, p2}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    const/16 v0, 0x1a

    iput v0, p0, La3/p;->w:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 146
    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, La3/l0;

    const/16 v2, 0x11

    invoke-direct {v1, p0, v2}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, La3/p;->y:Ljava/lang/Object;

    .line 147
    new-instance v0, Laj/d;

    invoke-direct {v0, p1}, Laj/d;-><init>(Landroid/view/View;)V

    iput-object v0, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldk/f;Lfk/a;Lgj/d;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, La3/p;->w:I

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 111
    iput-object p2, p0, La3/p;->y:Ljava/lang/Object;

    .line 112
    iput-object p3, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/v;Lio/sentry/h7;Lio/sentry/c;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, La3/p;->w:I

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 168
    iput-object p2, p0, La3/p;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 169
    invoke-static {p3, p1, p1, p1}, Lwb3/f;->y(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;

    move-result-object p1

    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;Lfk/a;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, La3/p;->w:I

    const-string v0, "fileNameWithoutExtension"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p3, p0, La3/p;->x:Ljava/lang/Object;

    .line 5
    new-instance p3, Ljava/util/Properties;

    invoke-direct {p3}, Ljava/util/Properties;-><init>()V

    iput-object p3, p0, La3/p;->y:Ljava/lang/Object;

    .line 6
    const-string p3, ".properties"

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 7
    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object p3, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, La3/p;->w:I

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    new-instance v0, La0/f0;

    invoke-direct {v0}, La0/f0;-><init>()V

    .line 218
    iput-object v0, p0, La3/p;->x:Ljava/lang/Object;

    .line 219
    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    .line 220
    iput-object v0, p0, La3/p;->y:Ljava/lang/Object;

    .line 221
    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, La3/p;->w:I

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    iput-object p2, p0, La3/p;->y:Ljava/lang/Object;

    iput-object p3, p0, La3/p;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La3/p;->w:I

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 223
    iput-object v0, p0, La3/p;->x:Ljava/lang/Object;

    .line 224
    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    .line 225
    iput-object p2, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 35

    move-object/from16 v0, p0

    const/16 v1, 0x15

    iput v1, v0, La3/p;->w:I

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, La3/p;->x:Ljava/lang/Object;

    .line 9
    const-string v1, "smithy.api#noAuth"

    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 10
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 11
    new-instance v3, Ll83/k;

    const-string v4, "AssociateSoftwareToken"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 13
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 14
    new-instance v4, Ll83/k;

    const-string v5, "ChangePassword"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 16
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 17
    new-instance v5, Ll83/k;

    const-string v6, "CompleteWebAuthnRegistration"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 19
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 20
    new-instance v6, Ll83/k;

    const-string v7, "ConfirmDevice"

    invoke-direct {v6, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 22
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 23
    new-instance v7, Ll83/k;

    const-string v8, "ConfirmForgotPassword"

    invoke-direct {v7, v8, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 25
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 26
    new-instance v8, Ll83/k;

    const-string v9, "ConfirmSignUp"

    invoke-direct {v8, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 28
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 29
    new-instance v9, Ll83/k;

    const-string v10, "DeleteUser"

    invoke-direct {v9, v10, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 31
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 32
    new-instance v10, Ll83/k;

    const-string v11, "DeleteUserAttributes"

    invoke-direct {v10, v11, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 34
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 35
    new-instance v11, Ll83/k;

    const-string v12, "DeleteWebAuthnCredential"

    invoke-direct {v11, v12, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 37
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 38
    new-instance v12, Ll83/k;

    const-string v13, "ForgetDevice"

    invoke-direct {v12, v13, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 40
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 41
    new-instance v13, Ll83/k;

    const-string v14, "ForgotPassword"

    invoke-direct {v13, v14, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 43
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 44
    new-instance v14, Ll83/k;

    const-string v15, "GetDevice"

    invoke-direct {v14, v15, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    invoke-static {v1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v2

    .line 46
    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 47
    new-instance v15, Ll83/k;

    move-object/from16 p1, v1

    const-string v1, "GetTokensFromRefreshToken"

    invoke-direct {v15, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 49
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 50
    new-instance v2, Ll83/k;

    move-object/from16 v16, v3

    const-string v3, "GetUser"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 52
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 53
    new-instance v3, Ll83/k;

    move-object/from16 v17, v2

    const-string v2, "GetUserAttributeVerificationCode"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 55
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 56
    new-instance v2, Ll83/k;

    move-object/from16 v18, v3

    const-string v3, "GetUserAuthFactors"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 58
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 59
    new-instance v3, Ll83/k;

    move-object/from16 v19, v2

    const-string v2, "GlobalSignOut"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 61
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 62
    new-instance v2, Ll83/k;

    move-object/from16 v20, v3

    const-string v3, "InitiateAuth"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 64
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 65
    new-instance v3, Ll83/k;

    move-object/from16 v21, v2

    const-string v2, "ListDevices"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 67
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 68
    new-instance v2, Ll83/k;

    move-object/from16 v22, v3

    const-string v3, "ListWebAuthnCredentials"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 70
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 71
    new-instance v3, Ll83/k;

    move-object/from16 v23, v2

    const-string v2, "ResendConfirmationCode"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 73
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 74
    new-instance v2, Ll83/k;

    move-object/from16 v24, v3

    const-string v3, "RespondToAuthChallenge"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 76
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 77
    new-instance v3, Ll83/k;

    move-object/from16 v25, v2

    const-string v2, "RevokeToken"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 79
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 80
    new-instance v2, Ll83/k;

    move-object/from16 v26, v3

    const-string v3, "SetUserMFAPreference"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 82
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 83
    new-instance v3, Ll83/k;

    move-object/from16 v27, v2

    const-string v2, "SetUserSettings"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 85
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 86
    new-instance v2, Ll83/k;

    move-object/from16 v28, v3

    const-string v3, "SignUp"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 88
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 89
    new-instance v3, Ll83/k;

    move-object/from16 v29, v2

    const-string v2, "StartWebAuthnRegistration"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 91
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 92
    new-instance v2, Ll83/k;

    move-object/from16 v30, v3

    const-string v3, "UpdateAuthEventFeedback"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 94
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 95
    new-instance v3, Ll83/k;

    move-object/from16 v31, v2

    const-string v2, "UpdateDeviceStatus"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 97
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 98
    new-instance v2, Ll83/k;

    move-object/from16 v32, v3

    const-string v3, "UpdateUserAttributes"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 100
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 101
    new-instance v3, Ll83/k;

    move-object/from16 v33, v2

    const-string v2, "VerifySoftwareToken"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    invoke-static/range {p1 .. p1}, Le93/b;->a(Ljava/lang/String;)Lue/a;

    move-result-object v1

    .line 103
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 104
    new-instance v2, Ll83/k;

    move-object/from16 p1, v3

    const-string v3, "VerifyUserAttribute"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v34, v2

    move-object/from16 v3, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v26

    move-object/from16 v26, v27

    move-object/from16 v27, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v30

    move-object/from16 v30, v31

    move-object/from16 v31, v32

    move-object/from16 v32, v33

    move-object/from16 v33, p1

    .line 105
    filled-new-array/range {v3 .. v34}, [Ll83/k;

    move-result-object v1

    .line 106
    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, La3/p;->y:Ljava/lang/Object;

    const/4 v1, 0x0

    const/16 v2, 0x1f

    .line 107
    invoke-static {v2, v1}, Landroidx/room/c1;->Q(ILjava/lang/String;)Lue/a;

    move-result-object v1

    .line 108
    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk2/b;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, La3/p;->w:I

    .line 148
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 149
    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    .line 150
    new-instance p1, Laj/d;

    invoke-direct {p1, p0}, Laj/d;-><init>(Ljava/lang/Object;)V

    .line 151
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm4/f;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, La3/p;->w:I

    .line 160
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La3/p;->x:Ljava/lang/Object;

    .line 162
    new-instance v0, Ln4/b;

    .line 163
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 164
    iput-object v0, p0, La3/p;->y:Ljava/lang/Object;

    .line 165
    iput-object p1, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lnf3/a;Lxf3/c;Luf3/a;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, La3/p;->w:I

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 115
    iput-object p2, p0, La3/p;->y:Ljava/lang/Object;

    .line 116
    iput-object p3, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lia3/f;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, La3/p;->w:I

    const-string v0, "typeParameterResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 140
    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    .line 141
    iput-object p2, p0, La3/p;->y:Ljava/lang/Object;

    .line 142
    new-instance p1, Ljc/b;

    const/4 p2, 0x6

    .line 143
    invoke-direct {p1, p2}, Ljc/b;-><init>(I)V

    .line 144
    new-instance p2, Lcom/google/crypto/tink/internal/l0;

    invoke-direct {p2, p1}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljc/b;)V

    iput-object p2, p0, La3/p;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzt/q;Lio/sentry/hints/j;Lh6/c;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x6

    iput v0, p0, La3/p;->w:I

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 208
    iput-object p2, p0, La3/p;->x:Ljava/lang/Object;

    .line 209
    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    .line 210
    iput-object p3, p0, La3/p;->z:Ljava/lang/Object;

    .line 211
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 212
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 213
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 214
    new-instance v6, Ldb/j0;

    const/4 p2, 0x4

    invoke-direct {v6, v1, p2, p3}, Ldb/j0;-><init>(Ljava/lang/String;IZ)V

    .line 215
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, La3/p;->H(Ljava/lang/CharSequence;IIIZLh6/p;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static final a(La3/p;Landroid/net/Network;Z)V
    .locals 7

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    move v4, p2

    goto :goto_1

    :cond_0
    iget-object v5, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v5, Landroid/net/ConnectivityManager;

    invoke-virtual {v5, v4}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v4

    if-eqz v4, :cond_1

    const/16 v5, 0xc

    invoke-virtual {v4, v5}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v6

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    if-eqz v4, :cond_2

    move v2, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    iget-object p0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast p0, Lqh/g;

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lqh/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbh/j;

    if-eqz p1, :cond_4

    iput-boolean v2, p0, Lqh/g;->E:Z

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_4
    invoke-virtual {p0}, Lqh/g;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    monitor-exit p0

    return-void

    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static u(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_6

    if-eq v1, v2, :cond_6

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const-class v2, Lh6/y;

    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lh6/y;

    if-eqz v1, :cond_6

    array-length v2, v1

    if-lez v2, :cond_6

    array-length v2, v1

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_6

    aget-object v4, v1, v3

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v4

    if-eqz p2, :cond_2

    if-eq v5, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v4, p1, :cond_4

    :cond_3
    if-le p1, v5, :cond_5

    if-ge p1, v4, :cond_5

    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    const/4 p0, 0x1

    return p0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v0
.end method


# virtual methods
.method public A()J
    .locals 2

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iget-wide v0, v0, Lk2/a;->d:J

    return-wide v0
.end method

.method public B()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "01"

    goto :goto_0

    :cond_0
    const-string v0, "00"

    :goto_0
    iget-object v1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/v;

    iget-object v2, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/h7;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "00-"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public C(Ljava/lang/CharSequence;IILh6/x;)Z
    .locals 7

    iget v0, p4, Lh6/x;->c:I

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lh6/f;

    invoke-virtual {p4}, Lh6/x;->b()Li6/a;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Li6/c;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, Li6/c;->z:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    iget v4, v4, Li6/c;->w:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    check-cast v0, Lh6/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lh6/c;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, v0, Lh6/c;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, Lv4/c;->a:I

    invoke-static {p1, p2}, Lrj/j;->u(Landroid/text/TextPaint;Ljava/lang/String;)Z

    move-result p1

    iget p2, p4, Lh6/x;->c:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p1, :cond_3

    or-int/lit8 p1, p2, 0x2

    goto :goto_1

    :cond_3
    or-int/lit8 p1, p2, 0x1

    :goto_1
    iput p1, p4, Lh6/x;->c:I

    :cond_4
    iget p1, p4, Lh6/x;->c:I

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v1, :cond_5

    return v3

    :cond_5
    return v2
.end method

.method public D()Z
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, La3/k2;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public E(Lorg/json/JSONObject;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/iterable/iterableapi/j1;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/iterable/iterableapi/j1;->u(La3/p;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const-string v0, "inAppMessages"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1, p0}, Lcom/iterable/iterableapi/j1;->d(Lorg/json/JSONObject;La3/p;)Lcom/iterable/iterableapi/j1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, p0}, Lcom/iterable/iterableapi/j1;->u(La3/p;)V

    iget-object v2, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public F(ILm4/e;Ln4/c;)Z
    .locals 6

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ln4/b;

    iget-object v1, p2, Lm4/e;->q0:[I

    iget-object v2, p2, Lm4/e;->u:[I

    const/4 v3, 0x0

    aget v4, v1, v3

    iput v4, v0, Ln4/b;->a:I

    const/4 v4, 0x1

    aget v1, v1, v4

    iput v1, v0, Ln4/b;->b:I

    invoke-virtual {p2}, Lm4/e;->r()I

    move-result v1

    iput v1, v0, Ln4/b;->c:I

    invoke-virtual {p2}, Lm4/e;->l()I

    move-result v1

    iput v1, v0, Ln4/b;->d:I

    iput-boolean v3, v0, Ln4/b;->i:Z

    iput p1, v0, Ln4/b;->j:I

    iget p1, v0, Ln4/b;->a:I

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    move p1, v4

    goto :goto_0

    :cond_0
    move p1, v3

    :goto_0
    iget v5, v0, Ln4/b;->b:I

    if-ne v5, v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    const/4 v5, 0x0

    if-eqz p1, :cond_2

    iget p1, p2, Lm4/e;->X:F

    cmpl-float p1, p1, v5

    if-lez p1, :cond_2

    move p1, v4

    goto :goto_2

    :cond_2
    move p1, v3

    :goto_2
    if-eqz v1, :cond_3

    iget v1, p2, Lm4/e;->X:F

    cmpl-float v1, v1, v5

    if-lez v1, :cond_3

    move v1, v4

    goto :goto_3

    :cond_3
    move v1, v3

    :goto_3
    const/4 v5, 0x4

    if-eqz p1, :cond_4

    aget p1, v2, v3

    if-ne p1, v5, :cond_4

    iput v4, v0, Ln4/b;->a:I

    :cond_4
    if-eqz v1, :cond_5

    aget p1, v2, v4

    if-ne p1, v5, :cond_5

    iput v4, v0, Ln4/b;->b:I

    :cond_5
    invoke-interface {p3, p2, v0}, Ln4/c;->a(Lm4/e;Ln4/b;)V

    iget p1, v0, Ln4/b;->e:I

    invoke-virtual {p2, p1}, Lm4/e;->S(I)V

    iget p1, v0, Ln4/b;->f:I

    invoke-virtual {p2, p1}, Lm4/e;->N(I)V

    iget-boolean p1, v0, Ln4/b;->h:Z

    iput-boolean p1, p2, Lm4/e;->F:Z

    iget p1, v0, Ln4/b;->g:I

    invoke-virtual {p2, p1}, Lm4/e;->J(I)V

    iput v3, v0, Ln4/b;->j:I

    iget-boolean p1, v0, Ln4/b;->i:Z

    return p1
.end method

.method public G(Lhb3/a0;Lx1/h;)V
    .locals 10

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, La0/f0;

    iget v0, v4, La0/f0;->b:I

    iget-object v1, p0, La3/p;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, La0/q0;

    new-instance v3, La0/q0;

    invoke-direct {v3}, La0/q0;-><init>()V

    const/4 v1, 0x0

    move v5, v1

    move v6, v5

    :goto_0
    if-ge v5, v0, :cond_1

    add-int/lit8 v7, v5, 0x1

    :try_start_0
    invoke-virtual {v4, v5}, La0/f0;->c(I)I

    move-result v8

    packed-switch v8, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    iget-object v5, p1, Lhb3/a0;->z:Ljava/lang/Object;

    instance-of v8, v5, Lp1/i;

    if-eqz v8, :cond_0

    move-object v8, v5

    check-cast v8, Lp1/i;

    iget-object v9, p2, Lx1/h;->f:Lr1/c;

    invoke-virtual {v9, v8}, Lr1/c;->k(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Lp1/i;->a()V

    goto :goto_2

    :goto_1
    move-object v6, p2

    move v5, v7

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_1

    :cond_0
    :goto_2
    invoke-virtual {v3, v5}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-interface {p1}, Lp1/c;->m()V

    goto :goto_3

    :pswitch_1
    add-int/lit8 v5, v6, 0x1

    invoke-virtual {v2, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x2

    invoke-static {v9, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v8, Lc93/m;

    add-int/lit8 v6, v6, 0x2

    invoke-virtual {v2, v5}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {p1, v5, v8}, Lp1/c;->d(Ljava/lang/Object;Lc93/m;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    move v5, v7

    goto :goto_0

    :pswitch_2
    add-int/lit8 v5, v5, 0x2

    :try_start_1
    invoke-virtual {v4, v7}, La0/f0;->c(I)I

    move-result v7

    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v2, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p1, v7, v6}, Lp1/c;->g(ILjava/lang/Object;)V

    :goto_4
    move v6, v8

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p2, v0

    move-object v6, p2

    goto/16 :goto_6

    :pswitch_3
    add-int/lit8 v5, v5, 0x2

    invoke-virtual {v4, v7}, La0/f0;->c(I)I

    move-result v7

    add-int/lit8 v8, v6, 0x1

    invoke-virtual {v2, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p1, v7, v6}, Lp1/c;->k(ILjava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :pswitch_4
    :try_start_2
    invoke-virtual {p1}, Lhb3/a0;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :pswitch_5
    add-int/lit8 v8, v5, 0x2

    :try_start_3
    invoke-virtual {v4, v7}, La0/f0;->c(I)I

    move-result v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v9, v5, 0x3

    :try_start_4
    invoke-virtual {v4, v8}, La0/f0;->c(I)I

    move-result v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    add-int/lit8 v5, v5, 0x4

    :try_start_5
    invoke-virtual {v4, v9}, La0/f0;->c(I)I

    move-result v9

    invoke-interface {p1, v7, v8, v9}, Lp1/c;->e(III)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    :catch_2
    move-exception v0

    move-object p2, v0

    move-object v6, p2

    move v5, v9

    goto :goto_6

    :catch_3
    move-exception v0

    move-object p2, v0

    move-object v6, p2

    move v5, v8

    goto :goto_6

    :pswitch_6
    add-int/lit8 v8, v5, 0x2

    :try_start_6
    invoke-virtual {v4, v7}, La0/f0;->c(I)I

    move-result v7
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    add-int/lit8 v5, v5, 0x3

    :try_start_7
    invoke-virtual {v4, v8}, La0/f0;->c(I)I

    move-result v8

    invoke-interface {p1, v7, v8}, Lp1/c;->f(II)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_0

    :pswitch_7
    add-int/lit8 v5, v6, 0x1

    :try_start_8
    invoke-virtual {v2, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p1, v6}, Lhb3/a0;->l(Ljava/lang/Object;)V

    move v6, v5

    goto :goto_3

    :pswitch_8
    invoke-virtual {p1}, Lhb3/a0;->p()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_3

    :cond_1
    :try_start_9
    iget p2, v2, La0/q0;->b:I

    if-ne v6, p2, :cond_2

    goto :goto_5

    :cond_2
    const-string p2, "Applier operation size mismatch"

    invoke-static {p2}, Lp1/r;->c(Ljava/lang/String;)V

    :goto_5
    invoke-virtual {v2}, La0/q0;->c()V

    iput v1, v4, La0/f0;->b:I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-interface {p1}, Lp1/c;->h()V

    return-void

    :goto_6
    :try_start_a
    new-instance v1, Lp1/k;

    invoke-direct/range {v1 .. v6}, Lp1/k;-><init>(La0/q0;La0/q0;La0/f0;ILjava/lang/Exception;)V

    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_7
    invoke-interface {p1}, Lp1/c;->h()V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public H(Ljava/lang/CharSequence;IIIZLh6/p;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    new-instance v5, Lh6/r;

    iget-object v6, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v6, Lzt/q;

    iget-object v6, v6, Lzt/q;->z:Ljava/lang/Object;

    check-cast v6, Lh6/u;

    invoke-direct {v5, v6}, Lh6/r;-><init>(Lh6/u;)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    move v9, v6

    move v10, v7

    move v11, v8

    move/from16 v6, p2

    :cond_0
    :goto_0
    move v7, v6

    :goto_1
    const/4 v12, 0x2

    if-ge v6, v2, :cond_f

    if-ge v10, v3, :cond_f

    if-eqz v11, :cond_f

    iget-object v13, v5, Lh6/r;->c:Lh6/u;

    iget-object v13, v13, Lh6/u;->a:Landroid/util/SparseArray;

    if-nez v13, :cond_1

    const/4 v13, 0x0

    goto :goto_2

    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lh6/u;

    :goto_2
    iget v14, v5, Lh6/r;->a:I

    const/4 v15, 0x3

    if-eq v14, v12, :cond_3

    if-nez v13, :cond_2

    invoke-virtual {v5}, Lh6/r;->a()V

    :goto_3
    move v13, v8

    goto :goto_6

    :cond_2
    iput v12, v5, Lh6/r;->a:I

    iput-object v13, v5, Lh6/r;->c:Lh6/u;

    iput v8, v5, Lh6/r;->f:I

    :goto_4
    move v13, v12

    goto :goto_6

    :cond_3
    if-eqz v13, :cond_4

    iput-object v13, v5, Lh6/r;->c:Lh6/u;

    iget v13, v5, Lh6/r;->f:I

    add-int/2addr v13, v8

    iput v13, v5, Lh6/r;->f:I

    goto :goto_4

    :cond_4
    const v13, 0xfe0e

    if-ne v9, v13, :cond_5

    invoke-virtual {v5}, Lh6/r;->a()V

    goto :goto_3

    :cond_5
    const v13, 0xfe0f

    if-ne v9, v13, :cond_6

    goto :goto_4

    :cond_6
    iget-object v13, v5, Lh6/r;->c:Lh6/u;

    iget-object v14, v13, Lh6/u;->b:Lh6/x;

    if-eqz v14, :cond_9

    iget v14, v5, Lh6/r;->f:I

    if-ne v14, v8, :cond_8

    invoke-virtual {v5}, Lh6/r;->b()Z

    move-result v13

    if-eqz v13, :cond_7

    iget-object v13, v5, Lh6/r;->c:Lh6/u;

    iput-object v13, v5, Lh6/r;->d:Lh6/u;

    invoke-virtual {v5}, Lh6/r;->a()V

    :goto_5
    move v13, v15

    goto :goto_6

    :cond_7
    invoke-virtual {v5}, Lh6/r;->a()V

    goto :goto_3

    :cond_8
    iput-object v13, v5, Lh6/r;->d:Lh6/u;

    invoke-virtual {v5}, Lh6/r;->a()V

    goto :goto_5

    :cond_9
    invoke-virtual {v5}, Lh6/r;->a()V

    goto :goto_3

    :goto_6
    iput v9, v5, Lh6/r;->e:I

    if-eq v13, v8, :cond_e

    if-eq v13, v12, :cond_c

    if-eq v13, v15, :cond_a

    goto :goto_1

    :cond_a
    if-nez p5, :cond_b

    iget-object v12, v5, Lh6/r;->d:Lh6/u;

    iget-object v12, v12, Lh6/u;->b:Lh6/x;

    invoke-virtual {v0, v1, v7, v6, v12}, La3/p;->C(Ljava/lang/CharSequence;IILh6/x;)Z

    move-result v12

    if-nez v12, :cond_0

    :cond_b
    iget-object v11, v5, Lh6/r;->d:Lh6/u;

    iget-object v11, v11, Lh6/u;->b:Lh6/x;

    invoke-interface {v4, v1, v7, v6, v11}, Lh6/p;->a(Ljava/lang/CharSequence;IILh6/x;)Z

    move-result v11

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    move-result v12

    add-int/2addr v12, v6

    if-ge v12, v2, :cond_d

    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    move v9, v6

    :cond_d
    move v6, v12

    goto/16 :goto_1

    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v6, v7

    if-ge v6, v2, :cond_0

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v7

    move v9, v7

    goto/16 :goto_0

    :cond_f
    iget v2, v5, Lh6/r;->a:I

    if-ne v2, v12, :cond_12

    iget-object v2, v5, Lh6/r;->c:Lh6/u;

    iget-object v2, v2, Lh6/u;->b:Lh6/x;

    if-eqz v2, :cond_12

    iget v2, v5, Lh6/r;->f:I

    if-gt v2, v8, :cond_10

    invoke-virtual {v5}, Lh6/r;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_10
    if-ge v10, v3, :cond_12

    if-eqz v11, :cond_12

    if-nez p5, :cond_11

    iget-object v2, v5, Lh6/r;->c:Lh6/u;

    iget-object v2, v2, Lh6/u;->b:Lh6/x;

    invoke-virtual {v0, v1, v7, v6, v2}, La3/p;->C(Ljava/lang/CharSequence;IILh6/x;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    iget-object v2, v5, Lh6/r;->c:Lh6/u;

    iget-object v2, v2, Lh6/u;->b:Lh6/x;

    invoke-interface {v4, v1, v7, v6, v2}, Lh6/p;->a(Ljava/lang/CharSequence;IILh6/x;)Z

    :cond_12
    invoke-interface {v4}, Lh6/p;->d()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Properties;

    invoke-virtual {v0, p1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, La3/p;->L()V

    return-void
.end method

.method public J(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v1, v0, Lgj/d;->c:Lbc3/c0;

    iget-object v0, v0, Lgj/d;->f:Lbc3/z;

    new-instance v2, La6/q;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4, v3}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    invoke-static {v1, v0, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public declared-synchronized K(Lcom/iterable/iterableapi/j1;)V
    .locals 5

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Lcom/iterable/iterableapi/j1;->u(La3/p;)V

    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    new-instance v3, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v4, "com.iterable.sdk"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const-string v2, "IterableInAppFileStorage"

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v3, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-direct {v1, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :goto_1
    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Lcom/iterable/iterableapi/p0;

    const/16 v0, 0x64

    invoke-virtual {p1, v0}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    if-nez v1, :cond_4

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public L()V
    .locals 5

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Properties;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v3

    :try_start_4
    invoke-static {v1, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    iget-object v2, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Lfk/a;

    if-eqz v2, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to save property file with path "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", error stacktrace: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lfk/a;->error(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public M(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v3, "com.iterable.sdk"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v1, Ljava/io/File;

    const-string v3, "IterableInAppFileStorage"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result p1

    const-string v1, "index.html"

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "Directory with file already exists. No need to store again"

    invoke-static {v3, p1}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    move-object v0, v2

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    if-nez v0, :cond_4

    const-string p1, "Failed to create folder for HTML content"

    invoke-static {v3, p1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lge3/g;->a0(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "Failed to store HTML content"

    invoke-static {v3, p1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public declared-synchronized N()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/j1;->j()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/iterable/iterableapi/j1;->e()Lcom/iterable/iterableapi/e1;

    move-result-object v3

    iget-object v3, v3, Lcom/iterable/iterableapi/e1;->a:Ljava/lang/String;

    invoke-virtual {p0, v2, v3}, La3/p;->M(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/iterable/iterableapi/j1;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public O()Lorg/json/JSONObject;
    .locals 4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    iget-object v2, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/iterable/iterableapi/j1;

    invoke-virtual {v3}, Lcom/iterable/iterableapi/j1;->x()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    const-string v2, "inAppMessages"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_1
    const-string v2, "IterableInAppFileStorage"

    const-string v3, "Error while serializing messages"

    invoke-static {v2, v3, v1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-object v0
.end method

.method public P(Li2/v;)V
    .locals 1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iput-object p1, v0, Lk2/a;->c:Li2/v;

    return-void
.end method

.method public Q(Ly3/c;)V
    .locals 1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iput-object p1, v0, Lk2/a;->a:Ly3/c;

    return-void
.end method

.method public R(Ljava/lang/String;)V
    .locals 5

    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lck/a;

    iget-object v1, v1, Lck/a;->w:Lfj/a;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lfj/a;->a:Lzt/q;

    iget-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-object v3, v1, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, Lfj/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    iget-object v2, v3, Lfj/b;->a:Ljava/lang/String;

    iget-object v3, v3, Lfj/b;->c:Ljava/util/Map;

    new-instance v4, Lfj/b;

    invoke-direct {v4, v2, p1, v3}, Lfj/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v1, v4}, Lzt/q;->H(Lfj/b;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw p1

    :cond_0
    const-string p1, "connector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public S(I)V
    .locals 2

    const/16 v0, 0x10

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    mul-int/lit8 p1, p1, 0x8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    return-void
.end method

.method public T(Ly3/m;)V
    .locals 1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iput-object p1, v0, Lk2/a;->b:Ly3/m;

    return-void
.end method

.method public U(J)V
    .locals 1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iput-wide p1, v0, Lk2/a;->d:J

    return-void
.end method

.method public V(I)V
    .locals 2

    const/16 v0, 0xa

    if-lt p1, v0, :cond_0

    const/16 v0, 0x10

    if-lt v0, p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, La3/p;->y:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Invalid tag size for AesCmacParameters: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public W(Ljava/lang/String;)V
    .locals 5

    iput-object p1, p0, La3/p;->x:Ljava/lang/Object;

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lck/a;

    iget-object v1, v1, Lck/a;->w:Lfj/a;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lfj/a;->a:Lzt/q;

    iget-object v2, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->lock()V

    :try_start_0
    iget-object v3, v1, Lzt/q;->y:Ljava/lang/Object;

    check-cast v3, Lfj/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    iget-object v2, v3, Lfj/b;->a:Ljava/lang/String;

    iget-object v2, v3, Lfj/b;->b:Ljava/lang/String;

    iget-object v3, v3, Lfj/b;->c:Ljava/util/Map;

    new-instance v4, Lfj/b;

    invoke-direct {v4, p1, v2, v3}, Lfj/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v1, v4}, Lzt/q;->H(Lfj/b;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;->unlock()V

    throw p1

    :cond_0
    const-string p1, "connector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public X(Lm4/f;III)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p1, Lm4/e;->c0:I

    iget v1, p1, Lm4/e;->d0:I

    const/4 v2, 0x0

    iput v2, p1, Lm4/e;->c0:I

    iput v2, p1, Lm4/e;->d0:I

    invoke-virtual {p1, p3}, Lm4/e;->S(I)V

    invoke-virtual {p1, p4}, Lm4/e;->N(I)V

    if-gez v0, :cond_0

    iput v2, p1, Lm4/e;->c0:I

    goto :goto_0

    :cond_0
    iput v0, p1, Lm4/e;->c0:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, Lm4/e;->d0:I

    goto :goto_1

    :cond_1
    iput v1, p1, Lm4/e;->d0:I

    :goto_1
    iget-object p1, p0, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Lm4/f;

    iput p2, p1, Lm4/f;->u0:I

    invoke-virtual {p1}, Lm4/f;->Z()V

    return-void
.end method

.method public Y(Lx93/h;Lka3/a;Z)Llb3/f1;
    .locals 7

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    iget-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    const-string v2, "arrayType"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lx93/h;->c()Lx93/a0;

    move-result-object v2

    instance-of v3, v2, Lx93/y;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lx93/y;

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lx93/y;->c()Lo93/j;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    new-instance v5, Lia3/c;

    const/4 v6, 0x1

    invoke-direct {v5, v0, p1, v6}, Lia3/c;-><init>(Lzt/q;Lma3/b;Z)V

    if-eqz v3, :cond_3

    iget-object p1, v1, Lia3/a;->o:Lr93/b0;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1, v3}, Lo93/h;->r(Lo93/j;)Llb3/c0;

    move-result-object p1

    new-instance p3, Ls93/j;

    invoke-virtual {p1}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ls93/i;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    aput-object v5, v1, v6

    invoke-direct {p3, v1}, Ls93/j;-><init>([Ls93/i;)V

    invoke-static {p1, p3}, Lio/sentry/config/a;->S(Llb3/y;Ls93/i;)Llb3/y;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb3/c0;

    invoke-virtual {p2}, Lka3/a;->f()Z

    move-result p2

    if-eqz p2, :cond_2

    return-object p1

    :cond_2
    invoke-virtual {p1, v6}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p2

    invoke-static {p1, p2}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Llb3/b1;->x:Llb3/b1;

    invoke-virtual {p2}, Lka3/a;->f()Z

    move-result v0

    const/4 v3, 0x6

    invoke-static {p1, v0, v4, v3}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object p1

    invoke-virtual {p2}, Lka3/a;->f()Z

    move-result p2

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    sget-object p2, Llb3/g1;->E:Llb3/g1;

    goto :goto_2

    :cond_4
    sget-object p2, Llb3/g1;->y:Llb3/g1;

    :goto_2
    iget-object p3, v1, Lia3/a;->o:Lr93/b0;

    invoke-interface {p3}, Lr93/b0;->c()Lo93/h;

    move-result-object p3

    invoke-virtual {p3, p2, p1, v5}, Lo93/h;->i(Llb3/g1;Llb3/y;Ls93/i;)Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object p2, v1, Lia3/a;->o:Lr93/b0;

    invoke-interface {p2}, Lr93/b0;->c()Lo93/h;

    move-result-object p2

    sget-object p3, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {p2, p3, p1, v5}, Lo93/h;->i(Llb3/g1;Llb3/y;Ls93/i;)Llb3/c0;

    move-result-object p2

    iget-object p3, v1, Lia3/a;->o:Lr93/b0;

    invoke-interface {p3}, Lr93/b0;->c()Lo93/h;

    move-result-object p3

    sget-object v0, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {p3, v0, p1, v5}, Lo93/h;->i(Llb3/g1;Llb3/y;Ls93/i;)Llb3/c0;

    move-result-object p1

    invoke-virtual {p1, v6}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    invoke-static {p2, p1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public Z(Lma3/e;Lka3/a;)Llb3/y;
    .locals 3

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    instance-of v1, p1, Lx93/y;

    if-eqz v1, :cond_1

    check-cast p1, Lx93/y;

    invoke-virtual {p1}, Lx93/y;->c()Lo93/j;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {p2}, Lr93/b0;->c()Lo93/h;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo93/h;->t(Lo93/j;)Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Lo93/h;->x()Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, p1, Lx93/p;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    check-cast p1, Lx93/p;

    invoke-virtual {p2}, Lka3/a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lka3/a;->d()Llb3/b1;

    move-result-object v0

    sget-object v1, Llb3/b1;->w:Llb3/b1;

    if-eq v0, v1, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {p1}, Lx93/p;->g()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    if-nez v2, :cond_4

    invoke-virtual {p0, p1, p2, v1}, La3/p;->r(Lx93/p;Lka3/a;Llb3/c0;)Llb3/c0;

    move-result-object p2

    if-eqz p2, :cond_3

    return-object p2

    :cond_3
    sget-object p2, Lnb3/k;->y:Lnb3/k;

    invoke-virtual {p1}, Lx93/p;->e()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object v2, Lka3/b;->y:Lka3/b;

    invoke-virtual {p2, v2}, Lka3/a;->i(Lka3/b;)Lka3/a;

    move-result-object v2

    invoke-virtual {p0, p1, v2, v1}, La3/p;->r(Lx93/p;Lka3/a;Llb3/c0;)Llb3/c0;

    move-result-object v1

    if-nez v1, :cond_5

    sget-object p2, Lnb3/k;->y:Lnb3/k;

    invoke-virtual {p1}, Lx93/p;->e()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object v2, Lka3/b;->x:Lka3/b;

    invoke-virtual {p2, v2}, Lka3/a;->i(Lka3/b;)Lka3/a;

    move-result-object p2

    invoke-virtual {p0, p1, p2, v1}, La3/p;->r(Lx93/p;Lka3/a;Llb3/c0;)Llb3/c0;

    move-result-object p2

    if-nez p2, :cond_6

    sget-object p2, Lnb3/k;->y:Lnb3/k;

    invoke-virtual {p1}, Lx93/p;->e()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1

    :cond_6
    if-eqz v0, :cond_7

    new-instance p1, Lka3/h;

    invoke-direct {p1, v1, p2}, Lka3/h;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1

    :cond_7
    invoke-static {v1, p2}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v1, p1, Lx93/h;

    if-eqz v1, :cond_9

    check-cast p1, Lx93/h;

    invoke-virtual {p0, p1, p2, v2}, La3/p;->Y(Lx93/h;Lka3/a;Z)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of v1, p1, Lx93/d0;

    if-eqz v1, :cond_b

    check-cast p1, Lx93/d0;

    invoke-virtual {p1}, Lx93/d0;->c()Lx93/a0;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p0, p1, p2}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object p1

    return-object p1

    :cond_a
    iget-object p1, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Lo93/h;->n()Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_b
    if-nez p1, :cond_c

    iget-object p1, v0, Lia3/a;->o:Lr93/b0;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Lo93/h;->n()Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_c
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public a0(Lm4/f;)V
    .locals 9

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2

    iget-object v5, p1, Lm4/f;->r0:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm4/e;

    iget-object v6, v5, Lm4/e;->q0:[I

    aget v7, v6, v2

    const/4 v8, 0x3

    if-eq v7, v8, :cond_0

    aget v4, v6, v4

    if-ne v4, v8, :cond_1

    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lm4/f;->t0:Ln4/f;

    iput-boolean v4, p1, Ln4/f;->b:Z

    return-void
.end method

.method public b(La3/n0;La3/y;)V
    .locals 4

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Laj/c;

    iget-object v2, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v2, Laj/c;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    if-eqz p2, :cond_5

    const/4 v3, 0x1

    if-eq p2, v3, :cond_4

    const/4 v3, 0x2

    if-eq p2, v3, :cond_2

    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    iget-object p2, p1, La3/n0;->G:La3/n0;

    if-eqz p2, :cond_0

    invoke-virtual {v2, p1}, Laj/c;->q(La3/n0;)V

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Laj/c;->q(La3/n0;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    iget-object p2, p1, La3/n0;->G:La3/n0;

    if-eqz p2, :cond_3

    invoke-virtual {v2, p1}, Laj/c;->q(La3/n0;)V

    return-void

    :cond_3
    invoke-virtual {v0, p1}, Laj/c;->q(La3/n0;)V

    return-void

    :cond_4
    invoke-virtual {v1, p1}, Laj/c;->q(La3/n0;)V

    invoke-virtual {v2, p1}, Laj/c;->q(La3/n0;)V

    return-void

    :cond_5
    invoke-virtual {v0, p1}, Laj/c;->q(La3/n0;)V

    invoke-virtual {v2, p1}, Laj/c;->q(La3/n0;)V

    return-void
.end method

.method public c()Li4/c;
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ly3/f;

    if-eqz v0, :cond_0

    iget v0, v0, Ly3/f;->w:F

    new-instance v1, Li4/e;

    invoke-direct {v1, v0}, Li4/e;-><init>(F)V

    return-object v1

    :cond_0
    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DimensionDescription: Null value & symbol for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". Using WrapContent."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CCL"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "wrap"

    invoke-static {v0}, Li4/h;->j(Ljava/lang/String;)Li4/h;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;Lc93/m;)V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, La0/q0;

    invoke-virtual {v0, p2}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, La0/q0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public e(III)V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    invoke-virtual {v0, p1}, La0/f0;->a(I)V

    invoke-virtual {v0, p2}, La0/f0;->a(I)V

    invoke-virtual {v0, p3}, La0/f0;->a(I)V

    return-void
.end method

.method public f(II)V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    invoke-virtual {v0, p1}, La0/f0;->a(I)V

    invoke-virtual {v0, p2}, La0/f0;->a(I)V

    return-void
.end method

.method public g(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    invoke-virtual {v0, p1}, La0/f0;->a(I)V

    iget-object p1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast p1, La0/q0;

    invoke-virtual {p1, p2}, La0/q0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public isOnline()Z
    .locals 7

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    invoke-virtual {v0, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v5

    if-eqz v5, :cond_0

    const/16 v6, 0xc

    invoke-virtual {v5, v6}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Llk/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llk/a;

    iget v1, v0, Llk/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llk/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llk/a;

    check-cast p1, Ls83/c;

    invoke-direct {v0, p0, p1}, Llk/a;-><init>(La3/p;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Llk/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llk/a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Llk/a;->w:La3/p;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Ldk/f;

    iput-object p0, v0, Llk/a;->w:La3/p;

    iput v3, v0, Llk/a;->z:I

    invoke-virtual {p1, v0}, Ldk/f;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, La3/p;->x:Ljava/lang/Object;

    check-cast p1, Ldk/f;

    invoke-virtual {p1}, Ldk/f;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, La3/p;->J(Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception p1

    move-object v0, p0

    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Lfk/a;

    const-string v1, "Event storage file not found: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfk/a;->warn(Ljava/lang/String;)V

    :cond_5
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public k(ILjava/lang/Object;)V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    invoke-virtual {v0, p1}, La0/f0;->a(I)V

    iget-object p1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast p1, La0/q0;

    invoke-virtual {p1, p2}, La0/q0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public l(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, La0/q0;

    invoke-virtual {v0, p1}, La0/q0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    return-void
.end method

.method public n(Lq83/d;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Llk/b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Llk/b;

    iget v3, v2, Llk/b;->H:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llk/b;->H:I

    goto :goto_0

    :cond_0
    new-instance v2, Llk/b;

    check-cast v0, Ls83/c;

    invoke-direct {v2, v1, v0}, Llk/b;-><init>(La3/p;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Llk/b;->F:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Llk/b;->H:I

    const/4 v5, 0x2

    const-string v6, "$set"

    const/4 v7, 0x1

    const-string v8, "null cannot be cast to non-null type kotlin.String"

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v4, v2, Llk/b;->E:Ljava/lang/Object;

    iget-object v10, v2, Llk/b;->z:Ljava/util/Iterator;

    iget-object v11, v2, Llk/b;->y:Ljava/util/Map;

    check-cast v11, Ljava/util/Map;

    iget-object v12, v2, Llk/b;->x:Ljk/a;

    iget-object v13, v2, Llk/b;->w:La3/p;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception v0

    :goto_1
    const/16 v17, 0x0

    goto/16 :goto_f

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Llk/b;->w:La3/p;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    const/16 v17, 0x0

    goto/16 :goto_10

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    iput-object v1, v2, Llk/b;->w:La3/p;

    iput v7, v2, Llk/b;->H:I

    invoke-virtual {v0, v2}, Ldk/f;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_9

    if-ne v0, v3, :cond_4

    goto :goto_4

    :cond_4
    move-object v4, v1

    :goto_2
    iget-object v0, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    invoke-virtual {v0}, Ldk/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v17, 0x0

    goto/16 :goto_11

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v10, v0

    move-object v13, v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    :try_start_3
    iget-object v0, v13, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ldk/f;

    iput-object v13, v2, Llk/b;->w:La3/p;

    iput-object v12, v2, Llk/b;->x:Ljk/a;

    move-object v14, v11

    check-cast v14, Ljava/util/Map;

    iput-object v14, v2, Llk/b;->y:Ljava/util/Map;

    iput-object v10, v2, Llk/b;->z:Ljava/util/Iterator;

    iput-object v4, v2, Llk/b;->E:Ljava/lang/Object;

    iput v5, v2, Llk/b;->H:I

    invoke-virtual {v0, v4, v2}, Ldk/f;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_6

    :goto_4
    return-object v3

    :cond_6
    :goto_5
    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v14

    if-nez v14, :cond_7

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v13, v0}, La3/p;->J(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    new-instance v14, Lorg/json/JSONArray;

    invoke-direct {v14, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v14}, Lhg3/i;->n0(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v13, v0}, La3/p;->J(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :cond_8
    const-string v14, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"

    if-nez v12, :cond_c

    const/4 v15, 0x0

    :try_start_4
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljk/a;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    iget-object v12, v15, Ljk/a;->O:Ljava/util/LinkedHashMap;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    if-eqz v12, :cond_9

    :try_start_6
    invoke-interface {v12, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    move-object v12, v15

    goto/16 :goto_1

    :cond_9
    const/4 v12, 0x0

    :goto_6
    :try_start_7
    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v12

    const-string v5, "map"

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_a
    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v16
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    if-eqz v16, :cond_b

    :try_start_8
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v17
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    if-eqz v17, :cond_a

    const/16 v17, 0x0

    :try_start_9
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v9, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v7, 0x1

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_9

    :catch_4
    move-exception v0

    const/16 v17, 0x0

    goto :goto_9

    :cond_b
    const/16 v17, 0x0

    invoke-static {v5}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v11
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    :try_start_a
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    const/4 v7, 0x1

    :try_start_b
    invoke-virtual {v0, v7, v5}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_5

    move-object v12, v15

    goto :goto_a

    :catch_5
    move-exception v0

    :goto_8
    move-object v12, v15

    goto/16 :goto_f

    :catch_6
    move-exception v0

    :goto_9
    const/4 v7, 0x1

    goto :goto_8

    :catch_7
    move-exception v0

    const/16 v17, 0x0

    goto :goto_8

    :cond_c
    const/16 v17, 0x0

    :goto_a
    :try_start_c
    const-string v5, "events"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljk/a;

    iget-object v9, v9, Ljk/a;->O:Ljava/util/LinkedHashMap;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    const-string v15, "map"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_d
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/Map$Entry;

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v18

    if-eqz v18, :cond_d

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v19, v0

    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v15, v7, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v19

    const/4 v7, 0x1

    goto :goto_c

    :cond_e
    move-object/from16 v19, v0

    invoke-static {v15}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    move-object/from16 v0, v19

    const/4 v7, 0x1

    goto :goto_b

    :cond_f
    if-eqz v11, :cond_10

    invoke-interface {v11, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_d

    :catch_8
    move-exception v0

    goto :goto_f

    :cond_10
    :goto_d
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v4

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v13, v0}, La3/p;->J(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8

    :goto_e
    const/4 v5, 0x2

    const/4 v7, 0x1

    goto/16 :goto_3

    :goto_f
    iget-object v5, v13, La3/p;->y:Ljava/lang/Object;

    check-cast v5, Lfk/a;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "Identify Merge error: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, v0}, Lfk/a;->warn(Ljava/lang/String;)V

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v13, v4}, La3/p;->J(Ljava/lang/String;)V

    goto :goto_e

    :cond_11
    if-eqz v12, :cond_12

    iget-object v0, v12, Ljk/a;->O:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_12

    invoke-interface {v0, v6, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    return-object v12

    :catch_9
    move-exception v0

    const/16 v17, 0x0

    move-object v4, v1

    :goto_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object v2, v4, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Lfk/a;

    const-string v3, "Event storage file not found: "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lfk/a;->warn(Ljava/lang/String;)V

    :cond_13
    :goto_11
    return-object v17
.end method

.method public o()Lqs/d;
    .locals 4

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    iget-object v1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_1

    iget-object v1, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v1, Lqs/c;

    if-eqz v1, :cond_0

    new-instance v1, Lqs/d;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v3, Lqs/c;

    invoke-direct {v1, v0, v2, v3}, Lqs/d;-><init>(IILqs/c;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "tag size not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, La0/f0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    return-void
.end method

.method public q(Lcg/o;)Lpf/r;
    .locals 4

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    iget-object v1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpf/r;

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpf/r;

    if-eqz v2, :cond_6

    :cond_0
    iget-object v2, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v2, Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpf/o;

    invoke-virtual {v3, p1}, Lpf/o;->a(Lcg/o;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_3
    :goto_0
    iget-object p1, p1, Lcg/o;->a:Lbg/l;

    sget-object v2, Lbg/l;->d:Lbg/l;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpf/r;

    goto :goto_1

    :cond_4
    sget-object v1, Lbg/l;->c:Lbg/l;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpf/r;

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_7

    :cond_6
    :goto_2
    sget-object p1, Lpf/p;->a:Lpf/p;

    :cond_7
    return-object p1
.end method

.method public r(Lx93/p;Lka3/a;Llb3/c0;)Llb3/c0;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    iget-object v2, v1, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Lzt/q;

    iget-object v4, v2, Lzt/q;->x:Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, Lia3/a;

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v7, p1

    :goto_0
    move-object v8, v5

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v5, Lia3/c;

    move-object/from16 v7, p1

    invoke-direct {v5, v2, v7, v4}, Lia3/c;-><init>(Lzt/q;Lma3/b;Z)V

    invoke-static {v5}, Lio/sentry/config/a;->a0(Ls93/i;)Llb3/k0;

    move-result-object v5

    goto :goto_0

    :goto_2
    invoke-virtual {v7}, Lx93/p;->c()Lma3/c;

    move-result-object v5

    const/4 v9, 0x0

    if-eqz v5, :cond_24

    instance-of v10, v5, Lx93/n;

    const-string v11, "getParameters(...)"

    const/4 v12, 0x1

    if-eqz v10, :cond_d

    move-object v10, v5

    check-cast v10, Lx93/n;

    invoke-virtual {v10}, Lx93/n;->c()Lva3/e;

    move-result-object v13

    if-eqz v13, :cond_c

    invoke-virtual {v3}, Lka3/a;->f()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-static {}, Lka3/d;->a()Lva3/e;

    move-result-object v5

    invoke-virtual {v13, v5}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, v6, Lia3/a;->p:Lo93/l;

    iget-object v13, v5, Lo93/l;->c:Ljc/a;

    sget-object v14, Lo93/l;->e:[Lj93/z;

    aget-object v14, v14, v4

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v13, "property"

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v14}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lsb3/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v13

    iget-object v14, v5, Lo93/l;->b:Ljava/lang/Object;

    invoke-interface {v14}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    sget-object v15, Lz93/c;->x:Lz93/c;

    invoke-interface {v14, v13, v15}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v14

    instance-of v15, v14, Lr93/e;

    if-eqz v15, :cond_2

    check-cast v14, Lr93/e;

    goto :goto_3

    :cond_2
    move-object v14, v9

    :goto_3
    if-nez v14, :cond_8

    iget-object v5, v5, Lo93/l;->a:Lzt/q;

    new-instance v14, Lva3/c;

    sget-object v15, Lo93/n;->i:Lva3/e;

    invoke-direct {v14, v15, v13}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v13}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    invoke-virtual {v5, v14, v13}, Lzt/q;->t(Lva3/c;Ljava/util/List;)Lr93/e;

    move-result-object v14

    goto/16 :goto_5

    :cond_3
    iget-object v5, v6, Lia3/a;->o:Lr93/b0;

    invoke-interface {v5}, Lr93/b0;->c()Lo93/h;

    move-result-object v5

    invoke-static {v13, v5}, Lq93/e;->b(Lva3/e;Lo93/h;)Lr93/e;

    move-result-object v14

    if-nez v14, :cond_4

    move-object v14, v9

    goto/16 :goto_5

    :cond_4
    sget-object v5, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v14}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v5

    sget-object v13, Lq93/d;->k:Ljava/util/HashMap;

    invoke-virtual {v13, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {v3}, Lka3/a;->c()Lka3/b;

    move-result-object v5

    sget-object v13, Lka3/b;->y:Lka3/b;

    if-eq v5, v13, :cond_7

    invoke-virtual {v3}, Lka3/a;->d()Llb3/b1;

    move-result-object v5

    sget-object v13, Llb3/b1;->w:Llb3/b1;

    if-eq v5, v13, :cond_7

    invoke-virtual {v7}, Lx93/p;->f()Ljava/util/ArrayList;

    move-result-object v5

    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lma3/e;

    invoke-static {v5}, Lse/g;->F(Lma3/e;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_5

    :cond_5
    invoke-static {v14}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v5

    sget-object v13, Lq93/d;->a:Ljava/lang/String;

    invoke-static {v5}, Lq93/d;->h(Lva3/f;)Lva3/e;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-static {v14}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v13

    invoke-virtual {v13, v5}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v5

    invoke-interface {v5}, Lr93/h;->e()Llb3/q0;

    move-result-object v5

    invoke-interface {v5}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/x0;

    if-eqz v5, :cond_8

    invoke-interface {v5}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v5

    if-eqz v5, :cond_8

    sget-object v13, Llb3/g1;->E:Llb3/g1;

    if-eq v5, v13, :cond_8

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Given class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is not a read-only collection"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_4
    invoke-static {v14}, Lq93/e;->a(Lr93/e;)Lr93/e;

    move-result-object v14

    :cond_8
    :goto_5
    if-nez v14, :cond_a

    iget-object v5, v6, Lia3/a;->k:Laj/d;

    iget-object v5, v5, Laj/d;->w:Ljava/lang/Object;

    check-cast v5, Lbu/c;

    if-eqz v5, :cond_9

    invoke-virtual {v5, v10}, Lbu/c;->I(Lx93/n;)Lr93/e;

    move-result-object v14

    goto :goto_6

    :cond_9
    const-string v0, "resolver"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_a
    :goto_6
    if-eqz v14, :cond_b

    invoke-interface {v14}, Lr93/h;->e()Llb3/q0;

    move-result-object v5

    if-eqz v5, :cond_b

    goto :goto_7

    :cond_b
    new-instance v0, Lva3/e;

    invoke-virtual {v7}, Lx93/p;->d()Ljava/lang/String;

    throw v9

    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Class type should have a FQ name: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    :cond_d
    instance-of v10, v5, Lx93/b0;

    if-eqz v10, :cond_23

    iget-object v10, v1, La3/p;->y:Ljava/lang/Object;

    check-cast v10, Lia3/f;

    check-cast v5, Lx93/b0;

    invoke-interface {v10, v5}, Lia3/f;->a(Lx93/b0;)Lr93/x0;

    move-result-object v5

    if-eqz v5, :cond_e

    invoke-interface {v5}, Lr93/x0;->e()Llb3/q0;

    move-result-object v5

    goto :goto_7

    :cond_e
    move-object v5, v9

    :goto_7
    if-nez v5, :cond_f

    return-object v9

    :cond_f
    invoke-virtual {v3}, Lka3/a;->c()Lka3/b;

    move-result-object v10

    sget-object v13, Lka3/b;->y:Lka3/b;

    if-ne v10, v13, :cond_11

    :cond_10
    move v10, v4

    goto :goto_8

    :cond_11
    invoke-virtual {v3}, Lka3/a;->f()Z

    move-result v10

    if-nez v10, :cond_10

    invoke-virtual {v3}, Lka3/a;->d()Llb3/b1;

    move-result-object v10

    sget-object v13, Llb3/b1;->w:Llb3/b1;

    if-eq v10, v13, :cond_10

    move v10, v12

    :goto_8
    if-eqz v0, :cond_12

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v13

    goto :goto_9

    :cond_12
    move-object v13, v9

    :goto_9
    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-virtual {v7}, Lx93/p;->g()Z

    move-result v13

    if-nez v13, :cond_13

    if-eqz v10, :cond_13

    invoke-virtual {v0, v12}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v0

    return-object v0

    :cond_13
    invoke-virtual {v7}, Lx93/p;->g()Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v7}, Lx93/p;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v5}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_a

    :cond_14
    move v12, v4

    :cond_15
    :goto_a
    invoke-interface {v5}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0xa

    if-eqz v12, :cond_17

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v0, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lr93/x0;

    invoke-virtual {v3}, Lka3/a;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {v2, v9, v0}, Lio/sentry/config/a;->I(Lr93/x0;Llb3/q0;Ljava/util/Set;)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {v2, v3}, Llb3/d1;->k(Lr93/x0;Lka3/a;)Llb3/u0;

    move-result-object v0

    goto :goto_c

    :cond_16
    new-instance v13, Llb3/z;

    iget-object v14, v6, Lia3/a;->a:Lkb3/n;

    new-instance v0, Lka3/c;

    move-object v4, v5

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lka3/c;-><init>(La3/p;Lr93/x0;Lka3/a;Llb3/q0;Lx93/p;)V

    move-object v5, v4

    invoke-direct {v13, v14, v0}, Llb3/z;-><init>(Lkb3/n;Lc93/a;)V

    invoke-virtual/range {p1 .. p1}, Lx93/p;->g()Z

    move-result v0

    invoke-virtual {v3, v0}, Lka3/a;->h(Z)Lka3/a;

    move-result-object v0

    iget-object v4, v1, La3/p;->z:Ljava/lang/Object;

    check-cast v4, Lcom/google/crypto/tink/internal/l0;

    invoke-static {v2, v0, v4, v13}, Ljc/b;->k(Lr93/x0;Lka3/a;Lcom/google/crypto/tink/internal/l0;Llb3/y;)Llb3/u0;

    move-result-object v0

    :goto_c
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v7, p1

    goto :goto_b

    :cond_17
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lx93/p;->f()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-eq v3, v6, :cond_19

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/x0;

    new-instance v4, Llb3/v0;

    sget-object v6, Lnb3/k;->S:Lnb3/k;

    invoke-interface {v3}, Lr93/k;->getName()Lva3/h;

    move-result-object v3

    invoke-virtual {v3}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v3

    const-string v7, "asString(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v3

    invoke-direct {v4, v3}, Llb3/v0;-><init>(Llb3/y;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_18
    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v12

    goto/16 :goto_15

    :cond_19
    invoke-virtual/range {p1 .. p1}, Lx93/p;->f()Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v3

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Lm83/q;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    move-object v7, v3

    check-cast v7, Lm83/d0;

    iget-object v11, v7, Lm83/d0;->x:Ljava/util/Iterator;

    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-virtual {v7}, Lm83/d0;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm83/c0;

    iget v11, v7, Lm83/c0;->a:I

    iget-object v7, v7, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v7, Lma3/e;

    invoke-interface {v0}, Ljava/util/List;->size()I

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lr93/x0;

    sget-object v12, Llb3/b1;->x:Llb3/b1;

    const/4 v13, 0x7

    invoke-static {v12, v4, v9, v13}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v14

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    instance-of v15, v7, Lx93/d0;

    if-eqz v15, :cond_20

    check-cast v7, Lx93/d0;

    invoke-virtual {v7}, Lx93/d0;->c()Lx93/a0;

    move-result-object v15

    invoke-virtual {v7}, Lx93/d0;->d()Z

    move-result v16

    if-eqz v16, :cond_1a

    sget-object v16, Llb3/g1;->E:Llb3/g1;

    :goto_f
    move-object/from16 v4, v16

    goto :goto_10

    :cond_1a
    sget-object v16, Llb3/g1;->z:Llb3/g1;

    goto :goto_f

    :goto_10
    if-eqz v15, :cond_1c

    invoke-interface {v11}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v9

    sget-object v13, Llb3/g1;->y:Llb3/g1;

    if-ne v9, v13, :cond_1b

    goto :goto_11

    :cond_1b
    invoke-interface {v11}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v9

    if-eq v4, v9, :cond_1d

    :cond_1c
    const/4 v13, 0x0

    goto :goto_13

    :cond_1d
    :goto_11
    invoke-static {v2, v7}, Lse/h;->C(Lzt/q;Lx93/d0;)Ls93/b;

    move-result-object v7

    const/4 v9, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static {v12, v13, v14, v9}, Lv8/b;->W(Llb3/b1;ZLja3/f0;I)Lka3/a;

    move-result-object v9

    invoke-virtual {v1, v15, v9}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v9

    if-eqz v7, :cond_1f

    invoke-virtual {v9}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v12

    invoke-static {v12, v7}, Lm83/s;->e1(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_1e

    sget-object v7, Ls93/g;->a:Ls93/f;

    goto :goto_12

    :cond_1e
    new-instance v12, Ls93/j;

    invoke-direct {v12, v7, v13}, Ls93/j;-><init>(Ljava/util/List;I)V

    move-object v7, v12

    :goto_12
    invoke-static {v9, v7}, Lio/sentry/config/a;->S(Llb3/y;Ls93/i;)Llb3/y;

    move-result-object v9

    :cond_1f
    invoke-static {v9, v4, v11}, Lio/sentry/config/a;->r(Llb3/y;Llb3/g1;Lr93/x0;)Llb3/v0;

    move-result-object v4

    goto :goto_14

    :goto_13
    invoke-static {v11, v14}, Llb3/d1;->k(Lr93/x0;Lka3/a;)Llb3/u0;

    move-result-object v4

    goto :goto_14

    :cond_20
    move v13, v4

    new-instance v4, Llb3/v0;

    sget-object v9, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v1, v7, v14}, La3/p;->Z(Lma3/e;Lka3/a;)Llb3/y;

    move-result-object v7

    invoke-direct {v4, v7, v9}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    :goto_14
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v13

    const/4 v9, 0x0

    goto/16 :goto_e

    :cond_21
    invoke-static {v6}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v12

    :cond_22
    :goto_15
    invoke-static {v12, v8, v5, v10}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v0

    return-object v0

    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown classifier kind: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Lva3/e;

    invoke-virtual/range {p1 .. p1}, Lx93/p;->d()Ljava/lang/String;

    const/16 v16, 0x0

    throw v16
.end method

.method public s(La3/n0;)Z
    .locals 4

    iget-object v0, p1, La3/n0;->G:La3/n0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Laj/c;

    iget-object v3, v3, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, La3/k2;

    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v3, Laj/c;

    iget-object v3, v3, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, La3/k2;

    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move p1, v1

    goto :goto_2

    :cond_2
    :goto_1
    move p1, v2

    :goto_2
    if-nez v0, :cond_3

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v1
.end method

.method public shutdown()V
    .locals 2

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Landroid/net/ConnectivityManager;

    iget-object v1, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/internal/util/b;

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    return-void
.end method

.method public t(Lzk/z;Lwk/h;)Lzk/z;
    .locals 2

    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    iget-object p1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast p1, Lbd3/v;

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Lal/b;

    invoke-static {v1, v0}, Lgl/c;->b(Lal/b;Landroid/graphics/Bitmap;)Lgl/c;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lbd3/v;->t(Lzk/z;Lwk/h;)Lzk/z;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lkl/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lll/c;

    invoke-virtual {v0, p1, p2}, Lll/c;->t(Lzk/z;Lwk/h;)Lzk/z;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, La3/p;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ReplayNetworkRequestOrResponse{size="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Lxl/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
    .end packed-switch
.end method

.method public v(Li4/c;)F
    .locals 3

    iget-object v0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    iget-object v1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    instance-of v2, p1, Li4/h;

    if-eqz v2, :cond_1

    check-cast p1, Li4/h;

    invoke-virtual {p1}, Li4/c;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj4/d;

    invoke-interface {p1}, Lj4/d;->value()F

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->floatValue()F

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, Li4/e;

    if-eqz v0, :cond_2

    check-cast p1, Li4/e;

    invoke-virtual {p1}, Li4/e;->d()F

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public w()Li2/v;
    .locals 1

    iget-object v0, p0, La3/p;->z:Ljava/lang/Object;

    check-cast v0, Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->c:Li2/v;

    return-object v0
.end method

.method public x()Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    new-instance v2, Ljava/io/File;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const-string v3, "com.iterable.sdk"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const-string v1, "itbl_inapp.json"

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public declared-synchronized y(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/iterable/iterableapi/j1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized z()Ljava/util/ArrayList;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
