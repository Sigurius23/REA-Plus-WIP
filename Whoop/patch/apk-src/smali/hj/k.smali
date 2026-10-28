.class public final Lhj/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/a;


# instance fields
.field public final synthetic a:Lcom/amplitude/android/engagement/a;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhj/k;->a:Lcom/amplitude/android/engagement/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 6

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lhj/f;

    const/4 v2, 0x1

    iget-object v3, p0, Lhj/k;->a:Lcom/amplitude/android/engagement/a;

    invoke-direct {v1, v3, p1, v2}, Lhj/f;-><init>(Lcom/amplitude/android/engagement/a;Landroid/app/Activity;I)V

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-virtual {v3, p1}, Lcom/amplitude/android/engagement/a;->f(Landroid/app/Activity;)V

    return-void
.end method
