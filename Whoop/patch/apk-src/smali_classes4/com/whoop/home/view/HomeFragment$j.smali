.class public final Lcom/whoop/home/view/HomeFragment$j;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment;->x2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/home/view/HomeFragment$j",
        "Landroid/database/ContentObserver;",
        "",
        "selfChange",
        "Ll83/a0;",
        "onChange",
        "(Z)V",
        "home_release"
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
.field final synthetic a:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$j;->a:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 0

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$j;->a:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p1}, Lcom/whoop/home/view/HomeFragment;->J0(Lcom/whoop/home/view/HomeFragment;)V

    return-void
.end method
