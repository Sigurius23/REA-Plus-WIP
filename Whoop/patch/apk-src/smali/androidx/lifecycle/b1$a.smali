.class public final Landroidx/lifecycle/b1$a;
.super Landroidx/lifecycle/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/b1;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/lifecycle/ProcessLifecycleOwner;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/ProcessLifecycleOwner;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/b1$a;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/b1$a;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    invoke-virtual {p1}, Landroidx/lifecycle/ProcessLifecycleOwner;->a()V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/lifecycle/b1$a;->this$0:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->w:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    sget-object v1, Landroidx/lifecycle/v;->ON_START:Landroidx/lifecycle/v;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/lifecycle/ProcessLifecycleOwner;->z:Z

    :cond_0
    return-void
.end method
