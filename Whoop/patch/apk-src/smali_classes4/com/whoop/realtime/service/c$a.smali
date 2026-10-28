.class Lcom/whoop/realtime/service/c$a;
.super Lhj0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/service/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    const-string v0, "com.whoop.realTimeActivityFinished"

    invoke-direct {p0, p1, v0}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lhj0/q;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/Intent;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/service/c$a;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public static bridge synthetic q(Lcom/whoop/realtime/service/c$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/service/c$a;->u(J)Lcom/whoop/realtime/service/c$a;

    return-void
.end method

.method public static bridge synthetic r(Lcom/whoop/realtime/service/c$a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/service/c$a;->v(J)Lcom/whoop/realtime/service/c$a;

    return-void
.end method

.method private u(J)Lcom/whoop/realtime/service/c$a;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "endTime"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p0
.end method

.method private v(J)Lcom/whoop/realtime/service/c$a;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "startTime"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    return-object p0
.end method


# virtual methods
.method public f()Landroid/content/Intent;
    .locals 2

    invoke-super {p0}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0}, Lhj0/q;->h()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public s()Ljava/lang/Long;
    .locals 4

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "endTime"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public t()Ljava/lang/Long;
    .locals 4

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "startTime"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
