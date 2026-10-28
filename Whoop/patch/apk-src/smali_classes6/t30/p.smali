.class public final Lt30/p;
.super Landroidx/fragment/app/w0;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Lq30/q0;

.field public final d:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lq30/q0;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "directoryServerName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkTransactionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt30/p;->b:Ljava/lang/String;

    iput-object p2, p0, Lt30/p;->c:Lq30/q0;

    iput-object p3, p0, Lt30/p;->d:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;
    .locals 2

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "className"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;

    iget-object p2, p0, Lt30/p;->c:Lq30/q0;

    iget-object v0, p0, Lt30/p;->d:Ljava/lang/Integer;

    iget-object v1, p0, Lt30/p;->b:Ljava/lang/String;

    invoke-direct {p1, v1, p2, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeProgressFragment;-><init>(Ljava/lang/String;Lq30/q0;Ljava/lang/Integer;)V

    return-object p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/w0;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
