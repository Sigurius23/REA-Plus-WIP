.class final enum Ly82/b$j;
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
    const/16 v0, 0x12

    const-string v1, "Toggle verbose network logging"

    const-string v2, "ENABLE_VERBOSE_NETWORK_LOG"

    invoke-direct {p0, v2, v0, v1}, Ly82/b$j;-><init>(Ljava/lang/String;ILjava/lang/String;)V

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
    .locals 3

    invoke-static {}, Li92/i;->b()V

    invoke-static {}, Li92/i;->a()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Verbose network logging "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz v0, :cond_0

    const-string v2, "enabled"

    goto :goto_0

    :cond_0
    const-string v2, "disabled"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for all requests, including passwords and sensitive information"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_1

    const-string v0, ", until next app restart."

    goto :goto_1

    :cond_1
    const-string v0, "."

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-static {}, Ly82/b$t;->c()Ly82/b$t;

    move-result-object p1

    return-object p1
.end method
