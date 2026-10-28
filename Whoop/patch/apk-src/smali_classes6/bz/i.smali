.class public final Lbz/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqy/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    sget-object p1, Lqy/e;->a:Lqy/d;

    goto :goto_1

    :cond_1
    sget-object p1, Lqy/e;->b:Lqy/d;

    :goto_1
    iput-object p1, p0, Lbz/i;->a:Lqy/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbz/i;->a:Lqy/d;

    invoke-virtual {v0, p1}, Lqy/d;->d(Ljava/lang/String;)V

    return-void
.end method
