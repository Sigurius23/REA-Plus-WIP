.class final enum Ly82/b$f;
.super Ly82/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly82/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    .line 1
    const/16 v0, 0xe

    const-string v1, "Get Push Token"

    const-string v2, "GET_PUSH_TOKEN"

    invoke-direct {p0, v2, v0, v1}, Ly82/b$f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Ly82/b$f;->lambda$performFromUi$1(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Ltr2/n;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Ly82/b$f;->lambda$perform$3(Ltr2/n;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Ly82/b$f;->lambda$performFromUi$0(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Ltr2/n;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Ly82/b$f;->lambda$perform$2(Ltr2/n;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$perform$2(Ltr2/n;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p0, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static synthetic lambda$perform$3(Ltr2/n;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to get push token"

    invoke-interface {p0, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method private static synthetic lambda$performFromUi$0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "clipboard"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "Push Token"

    invoke-static {v2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Copied push token to clipboard: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_0
    const-string p1, "Failed to copy push token to clipboard"

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private static synthetic lambda$performFromUi$1(Landroid/content/Context;Ljava/lang/Throwable;)V
    .locals 1

    const-string p1, "Failed to get push token"

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public perform(Landroid/content/Context;)Ly82/b$t;
    .locals 4

    const-string p1, "Push Token"

    invoke-static {p1}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    const-class v0, Lm92/j;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm92/j;

    invoke-virtual {v0}, Lm92/j;->B()Lxg3/p;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ly82/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ly82/c;-><init>(ILtr2/n;)V

    new-instance v2, Ly82/c;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1}, Ly82/c;-><init>(ILtr2/n;)V

    invoke-virtual {v0, v1, v2}, Lxg3/p;->d(Lbh3/b;Lbh3/b;)V

    const-string p1, "Fetching push token"

    invoke-static {p1}, Ly82/b$t;->d(Ljava/lang/String;)Ly82/b$t;

    move-result-object p1

    return-object p1
.end method

.method public performFromUi(Landroid/content/Context;)Ly82/b$t;
    .locals 4

    const-class v0, Lm92/j;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm92/j;

    invoke-virtual {v0}, Lm92/j;->B()Lxg3/p;

    move-result-object v0

    new-instance v1, Ly82/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ly82/d;-><init>(Landroid/content/Context;I)V

    new-instance v2, Ly82/d;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v3}, Ly82/d;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1, v2}, Lxg3/p;->d(Lbh3/b;Lbh3/b;)V

    invoke-static {}, Ly82/b$t;->c()Ly82/b$t;

    move-result-object p1

    return-object p1
.end method
