.class public final Lij/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lij/c;

.field public static final F:Lij/c;

.field public static final G:Lij/c;

.field public static final H:Lij/c;

.field public static final I:Lij/c;

.field public static final x:Lij/c;

.field public static final y:Lij/c;

.field public static final z:Lij/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lij/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->x:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->y:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->z:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->E:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->F:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->G:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->H:Lij/c;

    new-instance v0, Lij/c;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lij/c;-><init>(II)V

    sput-object v0, Lij/c;->I:Lij/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lij/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/a;)V
    .locals 0

    const/16 p1, 0x8

    iput p1, p0, Lij/c;->w:I

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lij/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [Ljava/lang/Object;

    const-string v0, "Failed to perform linkExecutable, missing URL scheme: "

    const-string v1, "Failed to deserialize from JSON string: "

    const-string v2, "Failed to serialize to JSON string: "

    const-string v3, "args"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v3, p1

    const/4 v4, 0x2

    if-ge v3, v4, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :cond_0
    const/4 v3, 0x0

    :try_start_0
    aget-object v3, p1, v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object p1, p1, v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v4, 0x0

    :try_start_1
    sget-object v5, Lwj/b;->a:Lad3/r;

    iget-object v6, v5, Lad3/c;->b:Lcd3/f;

    const-class v7, Ljava/lang/Object;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v6, v7}, Lvb/g;->f(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/j;

    invoke-virtual {v5, v6, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    sget-object v5, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object p1, v4

    :goto_0
    const-string v2, "true"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    sget-object v2, Lwj/b;->a:Lad3/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lcom/amplitude/android/engagement/types/LinkAction;->Companion:Lcom/amplitude/android/engagement/types/i0;

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/i0;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    invoke-virtual {v2, v5, v3}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    :try_start_4
    sget-object v3, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    move-object v1, v4

    :goto_1
    check-cast v1, Lcom/amplitude/android/engagement/types/LinkAction;

    if-nez v1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :catch_2
    move-exception p1

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/LinkAction;->getOperation()Lcom/amplitude/android/engagement/types/LinkOperation;

    move-result-object v2

    sget-object v3, Lcom/amplitude/android/engagement/types/LinkOperation;->ROUTER:Lcom/amplitude/android/engagement/types/LinkOperation;

    if-ne v2, v3, :cond_4

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/LinkAction;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    move-object v4, p1

    :cond_2
    if-nez v4, :cond_3

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "Failed to perform linkExecutable, invalid router operation: empty screen identifier"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "Failed to perform linkExecutable, no router registered"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :cond_4
    sget-object v2, Lhj/u;->w:Lhj/u;

    invoke-virtual {v2}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_5

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_7

    :cond_5
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/LinkAction;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v4, "http"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {v3}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v4, "https"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_7
    if-nez p1, :cond_9

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/LinkAction;->getOperation()Lcom/amplitude/android/engagement/types/LinkOperation;

    move-result-object p1

    sget-object v0, Lcom/amplitude/android/engagement/types/LinkOperation;->BLANK:Lcom/amplitude/android/engagement/types/LinkOperation;

    if-ne p1, v0, :cond_8

    goto :goto_3

    :cond_8
    new-instance p1, Lib/i;

    invoke-direct {p1}, Lib/i;-><init>()V

    invoke-virtual {p1}, Lib/i;->e()V

    invoke-virtual {p1}, Lib/i;->a()Lq3/i;

    move-result-object p1

    invoke-virtual {p1, v2, v3}, Lq3/i;->h(Landroid/content/Context;Landroid/net/Uri;)V

    goto :goto_4

    :cond_9
    :goto_3
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p1, v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v2, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :goto_4
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_7

    :cond_a
    :goto_5
    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/LinkAction;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_7

    :goto_6
    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to perform linkExecutable, unable to decode link action: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_7
    return-object p1

    :pswitch_0
    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->c:Z

    iput-boolean v0, p1, Lad3/g;->d:Z

    iput-boolean v0, p1, Lad3/g;->g:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "Failed to deserialize from JSON string: "

    const-string v1, "args"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p1

    if-nez v1, :cond_b

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :cond_b
    const/4 v1, 0x0

    :try_start_5
    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :try_start_6
    sget-object v1, Lwj/b;->a:Lad3/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/amplitude/android/engagement/types/AppReviewAction;->Companion:Lcom/amplitude/android/engagement/types/d;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/d;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_8

    :catch_3
    move-exception p1

    :try_start_7
    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_8
    check-cast p1, Lcom/amplitude/android/engagement/types/AppReviewAction;

    if-nez p1, :cond_c

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_a

    :catch_4
    move-exception p1

    goto :goto_9

    :cond_c
    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/AppReviewAction;->getPlayStorePackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ls4/a;->g(Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_a

    :goto_9
    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to handle app review action: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_a
    return-object p1

    :pswitch_2
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lhj/u;->w:Lhj/u;

    invoke-virtual {p1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-static {p1}, Luj/k;->b(Landroid/app/Activity;)I

    move-result p1

    :goto_b
    invoke-static {p1}, Lte0/d;->a(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_c

    :cond_d
    const/4 p1, 0x1

    goto :goto_b

    :goto_c
    return-object p1

    :pswitch_3
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-nez v0, :cond_e

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_d

    :cond_e
    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lhj/u;->w:Lhj/u;

    invoke-virtual {v0}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_f

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_d

    :cond_f
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcr/n;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lcr/n;-><init>(Landroid/view/View;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_d

    :cond_10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_d
    return-object p1

    :pswitch_4
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-nez v0, :cond_11

    goto :goto_e

    :cond_11
    const/4 v0, 0x0

    :try_start_8
    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    new-array p1, p1, [B

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/4 v0, 0x2

    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_f

    :catch_5
    :goto_e
    const-string p1, ""

    :goto_f
    return-object p1

    :pswitch_5
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const-string v1, ""

    if-nez v0, :cond_12

    goto :goto_10

    :cond_12
    const/4 v0, 0x0

    :try_start_9
    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    const-string v0, "decodedBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lij/l;->x:Lij/l;

    const/16 v2, 0x1e

    invoke-static {p1, v1, v0, v2}, Lm83/n;->C0([BLjava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    :catch_6
    :goto_10
    return-object v1

    :pswitch_6
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    if-nez v0, :cond_13

    const-string p1, ""

    goto :goto_11

    :cond_13
    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "getBytes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    :goto_11
    return-object p1

    :pswitch_7
    check-cast p1, Lad3/g;

    const-string v0, "$this$Json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lad3/g;->c:Z

    iput-boolean v0, p1, Lad3/g;->d:Z

    iput-boolean v0, p1, Lad3/g;->g:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
