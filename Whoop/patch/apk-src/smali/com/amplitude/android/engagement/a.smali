.class public final Lcom/amplitude/android/engagement/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final n:Ll83/p;

.field public static final o:Lcom/google/crypto/tink/internal/l0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/amplitude/android/engagement/AmplitudeInitOptions;

.field public c:La3/m0;

.field public final d:Lij/m;

.field public final e:Lcom/google/android/gms/common/f;

.field public final f:Ljava/util/LinkedHashMap;

.field public final g:Ljava/util/LinkedHashMap;

.field public final h:Ll83/p;

.field public final i:Lec3/h2;

.field public final j:Lec3/r1;

.field public k:Ljava/lang/ref/WeakReference;

.field public final l:Ll83/p;

.field public final m:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lhj/h;->x:Lhj/h;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/amplitude/android/engagement/a;->n:Ll83/p;

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const-string v1, "AmplitudeEngagement"

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Ljava/lang/String;Lcom/amplitude/android/engagement/AmplitudeInitOptions;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/amplitude/android/engagement/a;->b:Lcom/amplitude/android/engagement/AmplitudeInitOptions;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->g:Ljava/util/LinkedHashMap;

    new-instance p2, Lhj/g;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lhj/g;-><init>(Lcom/amplitude/android/engagement/a;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->h:Ll83/p;

    const/4 p2, 0x0

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->i:Lec3/h2;

    invoke-static {p2}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->j:Lec3/r1;

    sget-object p2, Lhj/h;->z:Lhj/h;

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->l:Ll83/p;

    sget-object p2, Lhj/h;->y:Lhj/h;

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->m:Ll83/p;

    invoke-virtual {p3}, Lcom/amplitude/android/engagement/AmplitudeInitOptions;->getOptions()Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;

    move-result-object p2

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;->getLogLevel()Lhj/v;

    move-result-object p2

    sget-object p3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "logLevel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p3, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    new-instance p2, Lcom/google/android/gms/common/f;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context.applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {p2, v0, v2}, Lcom/google/android/gms/common/f;-><init>(Landroid/content/Context;I)V

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->e:Lcom/google/android/gms/common/f;

    new-instance p2, Lhj/g;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lhj/g;-><init>(Lcom/amplitude/android/engagement/a;I)V

    invoke-virtual {p3, p2}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    new-instance p2, Lij/m;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1, p0}, Lij/m;-><init>(Landroid/content/Context;Lcom/amplitude/android/engagement/a;)V

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/a;->g()V

    new-instance p1, Lhj/k;

    invoke-direct {p1, p0}, Lhj/k;-><init>(Lcom/amplitude/android/engagement/a;)V

    sget-object p2, Lhj/u;->w:Lhj/u;

    sget-object p3, Lhj/u;->y:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/amplitude/android/engagement/a;->f(Landroid/app/Activity;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Lhj/d;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lhj/d;-><init>(Lcom/amplitude/android/engagement/a;I)V

    const-wide/16 v0, 0x64

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public final a(Lhj/b;)V
    .locals 10

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lhj/b;->a:Lhj/c;

    iget-object v1, v0, Lhj/c;->b:Ljava/lang/String;

    iget-object v2, v0, Lhj/c;->a:Ljava/lang/String;

    sget-object v3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    const-string v4, "User ID or Device ID must be set for targeting to work"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    :cond_0
    const-string v4, "undefined"

    if-nez v2, :cond_1

    move-object v2, v4

    :cond_1
    if-nez v1, :cond_2

    move-object v1, v4

    :cond_2
    new-instance v4, Lorg/json/JSONObject;

    iget-object v0, v0, Lhj/c;->c:Ljava/util/Map;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "JSONObject(options.user.userProperties).toString()"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    iget-object v5, v4, Lij/m;->i:Lij/n;

    const/4 v6, 0x0

    const-string v7, "integrationsBridge"

    if-eqz v5, :cond_5

    iget-object v5, v5, Lij/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, Lhj/b;->b:[Lkotlin/jvm/functions/Function1;

    iget-object v5, v4, Lij/m;->i:Lij/n;

    if-eqz v5, :cond_4

    array-length v6, p1

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, p1, v7

    const-string v9, "track"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v5, Lij/n;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    new-instance p1, Lb3/f3;

    const/4 v5, 0x2

    invoke-direct {p1, v2, v1, v0, v5}, Lb3/f3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, p1}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v3, "\n            window.engagement.boot({\n                user: {\n                    user_id: \""

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "\",\n                    device_id: \""

    const-string v5, "\",\n                    user_properties: "

    invoke-static {p1, v2, v3, v1, v5}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n                },\n                integrations: [\n                  {\n                    track: (event) => {\n                        IntegrationsBridge.track(JSON.stringify(event));\n                    },\n                  },\n                ]\n            })\n            "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lhj/i;->x:Lhj/i;

    invoke-virtual {v4, p1, v0}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void

    :cond_4
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6

    :cond_5
    invoke-static {v7}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v6
.end method

.method public final b(Lcom/amplitude/android/engagement/types/Nudge;)V
    .locals 4

    new-instance v0, Lhj/j;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lhj/j;-><init>(Lcom/amplitude/android/engagement/types/Nudge;I)V

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    const/4 v0, 0x0

    :try_start_0
    sget-object v2, Lwj/b;->a:Lad3/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/q0;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/j;

    invoke-virtual {v2, v3, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to serialize to JSON string: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "globalThis.nudgeActions.dismissNudge("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    invoke-virtual {v1, p1, v0}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void
.end method

.method public final c(ILcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonMeta;)V
    .locals 5

    const-string v0, "Failed to serialize to JSON string: "

    const-string v1, "meta"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhj/l;

    invoke-direct {v1, p1, p2, p3}, Lhj/l;-><init>(ILcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonMeta;)V

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v2, v1}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    const/4 v1, 0x0

    :try_start_0
    sget-object v3, Lwj/b;->a:Lad3/r;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/amplitude/android/engagement/types/ButtonMeta;->Companion:Lcom/amplitude/android/engagement/types/h;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/h;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v3, v4, p3}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3, v3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v2, p3}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p3, v1

    :goto_0
    if-nez p3, :cond_0

    goto :goto_2

    :cond_0
    :try_start_1
    sget-object v3, Lwj/b;->a:Lad3/r;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/amplitude/android/engagement/types/Action;->Companion:Llj/a;

    invoke-virtual {v4}, Llj/a;->serializer()Lwc3/c;

    move-result-object v4

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v3, v4, p2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v3}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v2, p2}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    :goto_1
    if-nez v1, :cond_1

    :goto_2
    return-void

    :cond_1
    const-string p2, "globalThis.nudgeActions.execNudgeAction("

    const-string v0, ", "

    invoke-static {p1, p2, v0, v1, v0}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/16 p2, 0x29

    invoke-static {p1, p3, p2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lhj/m;->x:Lhj/m;

    iget-object p3, p0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    invoke-virtual {p3, p1, p2}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void
.end method

.method public final d(IILjava/lang/String;)V
    .locals 4

    new-instance v0, Lhj/p;

    invoke-direct {v0, p1, p2, p3}, Lhj/p;-><init>(IILjava/lang/String;)V

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    :try_start_0
    sget-object v2, Lwj/b;->a:Lad3/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-virtual {v2, v3, p3}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to serialize to JSON string: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p3, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v1, p3}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p3, v0

    :goto_0
    if-nez p3, :cond_1

    :cond_0
    const-string p3, "undefined"

    :cond_1
    const-string v1, "globalThis.nudgeActions.handleLinkTap("

    const-string v2, ", "

    invoke-static {p1, p2, v1, v2, v2}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    invoke-virtual {p2, p1, v0}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void
.end method

.method public final e(Landroid/app/Activity;Z)V
    .locals 4

    if-nez p1, :cond_0

    sget-object p1, Lhj/u;->w:Lhj/u;

    invoke-virtual {p1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object p1

    :cond_0
    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    if-nez p1, :cond_1

    const-string p1, "No activity available for smart interactions injection"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return-void

    :cond_1
    if-nez p2, :cond_2

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lhj/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lhj/f;-><init>(Lcom/amplitude/android/engagement/a;Landroid/app/Activity;I)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_3

    const-string p1, "Failed to find window for smart interactions injection"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    instance-of p2, p2, Lkj/f;

    if-eqz p2, :cond_4

    goto :goto_0

    :cond_4
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/amplitude/android/engagement/a;->k:Ljava/lang/ref/WeakReference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/Window$Callback;

    if-eqz p2, :cond_5

    new-instance v1, Lkj/f;

    new-instance v2, Lhj/q;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lhj/q;-><init>(Lcom/amplitude/android/engagement/a;I)V

    invoke-direct {v1, p2, v2}, Lkj/f;-><init>(Landroid/view/Window$Callback;Lhj/q;)V

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    const-string p1, "Injected smart interactions window callback successfully"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final f(Landroid/app/Activity;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/amplitude/android/engagement/a;->c:La3/m0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, La3/m0;->invoke()Ljava/lang/Object;

    :cond_1
    iput-object v0, p0, Lcom/amplitude/android/engagement/a;->c:La3/m0;

    new-instance v0, Lb3/k;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lb3/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    new-instance v1, La3/m0;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p1, v0}, La3/m0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/amplitude/android/engagement/a;->c:La3/m0;

    :cond_2
    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lcom/amplitude/android/engagement/a;->l:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/e;

    new-instance v1, Lhj/q;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lhj/q;-><init>(Lcom/amplitude/android/engagement/a;I)V

    iput-object v1, v0, Lkj/e;->a:Lhj/q;

    iget-object v0, p0, Lcom/amplitude/android/engagement/a;->m:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/d;

    new-instance v1, Lhj/g;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lhj/g;-><init>(Lcom/amplitude/android/engagement/a;I)V

    iput-object v1, v0, Lkj/d;->a:Lhj/g;

    sget-object v0, Lcom/amplitude/android/engagement/a;->n:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/c;

    new-instance v1, Lhj/q;

    invoke-direct {v1, p0, v2}, Lhj/q;-><init>(Lcom/amplitude/android/engagement/a;I)V

    iput-object v1, v0, Lkj/c;->a:Lhj/q;

    return-void
.end method

.method public final h()V
    .locals 9

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v1, Lhj/v;

    iget v1, v1, Lhj/v;->w:I

    sget-object v2, Lhj/v;->E:Lhj/v;

    const/4 v3, 0x4

    if-le v3, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "AmplitudeEngagement.sdk#shutdown()"

    invoke-virtual {v0, v2, v1}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v4, "window.engagement.shutdown()"

    const/4 v5, 0x0

    invoke-virtual {v1, v4, v5}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    sget-object v1, Lhj/u;->w:Lhj/u;

    invoke-virtual {v1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v6, Lhj/d;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Lhj/d;-><init>(Lcom/amplitude/android/engagement/a;I)V

    invoke-virtual {v4, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    iget-object v4, p0, Lcom/amplitude/android/engagement/a;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    iget-object v4, p0, Lcom/amplitude/android/engagement/a;->h:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lmj/g;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v6

    if-eqz v6, :cond_2

    new-instance v7, Landroidx/lifecycle/z0;

    const/16 v8, 0x11

    invoke-direct {v7, v4, v8}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v7}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_2
    iget-object v4, p0, Lcom/amplitude/android/engagement/a;->i:Lec3/h2;

    invoke-virtual {v4, v5}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v4, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v4, Lhj/v;

    iget v4, v4, Lhj/v;->w:I

    if-le v3, v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "AmplitudeEngagement.sdk[internal]#resetSmartInteractions()"

    invoke-virtual {v0, v2, v3}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/amplitude/android/engagement/a;->k:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Window$Callback;

    if-eqz v0, :cond_6

    invoke-virtual {v1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    goto :goto_2

    :cond_4
    move-object v1, v5

    :goto_2
    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    :goto_3
    iput-object v5, p0, Lcom/amplitude/android/engagement/a;->k:Ljava/lang/ref/WeakReference;

    :cond_6
    iget-object v0, p0, Lcom/amplitude/android/engagement/a;->l:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkj/e;

    invoke-virtual {v1}, Lkj/e;->a()V

    iget-object v1, p0, Lcom/amplitude/android/engagement/a;->m:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkj/d;

    const/4 v3, 0x0

    iput-boolean v3, v2, Lkj/d;->b:Z

    iget-object v4, v2, Lkj/d;->d:Lio/sentry/c7;

    if-eqz v4, :cond_7

    iget-object v6, v2, Lkj/d;->c:Landroid/os/Handler;

    if-eqz v6, :cond_7

    invoke-virtual {v6, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_7
    iput-object v5, v2, Lkj/d;->c:Landroid/os/Handler;

    iput-object v5, v2, Lkj/d;->d:Lio/sentry/c7;

    iget-object v4, v2, Lkj/d;->f:Landroidx/lifecycle/z0;

    if-eqz v4, :cond_8

    iget-object v6, v2, Lkj/d;->e:Landroid/os/Handler;

    if-eqz v6, :cond_8

    invoke-virtual {v6, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_8
    iput-object v5, v2, Lkj/d;->e:Landroid/os/Handler;

    iput-object v5, v2, Lkj/d;->f:Landroidx/lifecycle/z0;

    sget-object v2, Lcom/amplitude/android/engagement/a;->n:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkj/c;

    iput-object v5, v2, Lkj/c;->a:Lhj/q;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/e;

    invoke-virtual {v0}, Lkj/e;->a()V

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/d;

    iput-boolean v3, v0, Lkj/d;->b:Z

    iget-object v1, v0, Lkj/d;->d:Lio/sentry/c7;

    if-eqz v1, :cond_9

    iget-object v2, v0, Lkj/d;->c:Landroid/os/Handler;

    if-eqz v2, :cond_9

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_9
    iput-object v5, v0, Lkj/d;->c:Landroid/os/Handler;

    iput-object v5, v0, Lkj/d;->d:Lio/sentry/c7;

    iget-object v1, v0, Lkj/d;->f:Landroidx/lifecycle/z0;

    if-eqz v1, :cond_a

    iget-object v2, v0, Lkj/d;->e:Landroid/os/Handler;

    if-eqz v2, :cond_a

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_a
    iput-object v5, v0, Lkj/d;->e:Landroid/os/Handler;

    iput-object v5, v0, Lkj/d;->f:Landroidx/lifecycle/z0;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/a;->g()V

    return-void
.end method
