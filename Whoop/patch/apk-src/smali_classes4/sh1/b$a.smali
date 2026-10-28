.class public final Lsh1/b$a;
.super Landroid/app/AppOpsManager$OnOpNotedCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh1/b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "sh1/b$a",
        "Landroid/app/AppOpsManager$OnOpNotedCallback;",
        "",
        "op",
        "tag",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Landroid/app/SyncNotedAppOp;",
        "onNoted",
        "(Landroid/app/SyncNotedAppOp;)V",
        "onSelfNoted",
        "Landroid/app/AsyncNotedAppOp;",
        "asyncOp",
        "onAsyncNoted",
        "(Landroid/app/AsyncNotedAppOp;)V",
        "gps-tracking_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lsh1/b;


# direct methods
.method public constructor <init>(Lsh1/b;)V
    .locals 0

    iput-object p1, p0, Lsh1/b$a;->a:Lsh1/b;

    invoke-direct {p0}, Landroid/app/AppOpsManager$OnOpNotedCallback;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "android:fine_location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android:coarse_location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lsh1/b$a;->a:Lsh1/b;

    invoke-static {p1}, Lsh1/b;->a(Lsh1/b;)Lsh1/a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lsh1/a;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onAsyncNoted(Landroid/app/AsyncNotedAppOp;)V
    .locals 2

    const-string v0, "asyncOp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/AsyncNotedAppOp;->getOp()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getOp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/AsyncNotedAppOp;->getAttributionTag()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lsh1/b$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onNoted(Landroid/app/SyncNotedAppOp;)V
    .locals 2

    const-string v0, "op"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/SyncNotedAppOp;->getOp()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getOp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/SyncNotedAppOp;->getAttributionTag()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lsh1/b$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSelfNoted(Landroid/app/SyncNotedAppOp;)V
    .locals 2

    const-string v0, "op"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/SyncNotedAppOp;->getOp()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getOp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/SyncNotedAppOp;->getAttributionTag()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lsh1/b$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
