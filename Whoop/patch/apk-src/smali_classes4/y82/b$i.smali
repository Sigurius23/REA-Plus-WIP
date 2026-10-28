.class final enum Ly82/b$i;
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
    const/16 v0, 0x11

    const-string v1, "Get API access token"

    const-string v2, "GET_ACCESS_TOKEN"

    invoke-direct {p0, v2, v0, v1}, Ly82/b$i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public perform(Landroid/content/Context;)Ly82/b$t;
    .locals 2

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p1

    invoke-virtual {p1}, Le50/b;->g()Lod1/u;

    move-result-object p1

    invoke-virtual {p1}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getAuthToken()Lcom/whoop/domain/model/AuthToken;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/domain/model/AuthToken;->getAccessToken()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Access token: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ly82/b$t;->d(Ljava/lang/String;)Ly82/b$t;

    move-result-object p1

    return-object p1
.end method

.method public performFromUi(Landroid/content/Context;)Ly82/b$t;
    .locals 4

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->g()Lod1/u;

    move-result-object v0

    invoke-virtual {v0}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/Session;->getAuthToken()Lcom/whoop/domain/model/AuthToken;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/domain/model/AuthToken;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v3, "Access Token"

    invoke-static {v3, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Copied access token to clipboard: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-static {}, Ly82/b$t;->c()Ly82/b$t;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "Failed to copy access token to clipboard"

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-static {}, Ly82/b$t;->a()Ly82/b$t;

    move-result-object p1

    return-object p1
.end method
