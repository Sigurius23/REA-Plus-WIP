.class public final Lsh1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B+\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lsh1/b;",
        "",
        "Landroid/app/AppOpsManager;",
        "appOpsManager",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Lsh1/a;",
        "metricWriter",
        "",
        "sdkInt",
        "<init>",
        "(Landroid/app/AppOpsManager;Ljava/util/concurrent/Executor;Lsh1/a;I)V",
        "Ll83/a0;",
        "b",
        "()V",
        "a",
        "Landroid/app/AppOpsManager;",
        "Ljava/util/concurrent/Executor;",
        "c",
        "Lsh1/a;",
        "d",
        "I",
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
.field private final a:Landroid/app/AppOpsManager;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lsh1/a;

.field private final d:I


# direct methods
.method public constructor <init>(Landroid/app/AppOpsManager;Ljava/util/concurrent/Executor;Lsh1/a;I)V
    .locals 1

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh1/b;->a:Landroid/app/AppOpsManager;

    iput-object p2, p0, Lsh1/b;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lsh1/b;->c:Lsh1/a;

    iput p4, p0, Lsh1/b;->d:I

    return-void
.end method

.method public static final synthetic a(Lsh1/b;)Lsh1/a;
    .locals 0

    iget-object p0, p0, Lsh1/b;->c:Lsh1/a;

    return-object p0
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lsh1/b;->a:Landroid/app/AppOpsManager;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lsh1/b;->d:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    new-instance v0, Lsh1/b$a;

    invoke-direct {v0, p0}, Lsh1/b$a;-><init>(Lsh1/b;)V

    iget-object v1, p0, Lsh1/b;->a:Landroid/app/AppOpsManager;

    iget-object v2, p0, Lsh1/b;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2, v0}, Landroid/app/AppOpsManager;->setOnOpNotedCallback(Ljava/util/concurrent/Executor;Landroid/app/AppOpsManager$OnOpNotedCallback;)V

    :cond_1
    :goto_0
    return-void
.end method
