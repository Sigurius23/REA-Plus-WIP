.class public interface abstract Lm5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lm5/n;Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance v5, Landroid/os/CancellationSignal;

    invoke-direct {v5}, Landroid/os/CancellationSignal;-><init>()V

    new-instance p2, Lh3/d;

    const/4 v1, 0x2

    invoke-direct {p2, v5, v1}, Lh3/d;-><init>(Landroid/os/CancellationSignal;I)V

    invoke-virtual {v0, p2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    new-instance v7, Leu/f;

    invoke-direct {v7, v0, v1}, Leu/f;-><init>(Lbc3/m;I)V

    new-instance v6, Lm5/e;

    const/4 p2, 0x0

    invoke-direct {v6, p2}, Lm5/e;-><init>(I)V

    const-string p2, "context"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lgm/j;

    invoke-direct {p2, p0, v1}, Lgm/j;-><init>(Landroid/content/Context;I)V

    invoke-static {p2}, Lgm/j;->d(Lgm/j;)Lm5/i;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance p0, Landroidx/credentials/exceptions/GetCredentialProviderConfigurationException;

    const-string p1, "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"

    invoke-direct {p0, p1}, Landroidx/credentials/exceptions/GetCredentialProviderConfigurationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p0}, Leu/f;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v3, p0

    move-object v4, p1

    invoke-interface/range {v2 .. v7}, Lm5/i;->onGetCredential(Landroid/content/Context;Lm5/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V

    :goto_0
    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method


# virtual methods
.method public b(Landroid/content/Context;Lm5/d;Lq83/d;)Ljava/lang/Object;
    .locals 8

    new-instance v0, Lbc3/m;

    invoke-static {p3}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 v1, 0x1

    invoke-direct {v0, v1, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    new-instance v5, Landroid/os/CancellationSignal;

    invoke-direct {v5}, Landroid/os/CancellationSignal;-><init>()V

    new-instance p3, Lh3/d;

    invoke-direct {p3, v5, v1}, Lh3/d;-><init>(Landroid/os/CancellationSignal;I)V

    invoke-virtual {v0, p3}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    new-instance v7, Leu/f;

    invoke-direct {v7, v0, v1}, Leu/f;-><init>(Lbc3/m;I)V

    new-instance v6, Lm5/e;

    const/4 p3, 0x0

    invoke-direct {v6, p3}, Lm5/e;-><init>(I)V

    move-object p3, p0

    check-cast p3, Lm5/h;

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lgm/j;

    iget-object p3, p3, Lm5/h;->a:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-direct {v1, p3, v2}, Lgm/j;-><init>(Landroid/content/Context;I)V

    invoke-static {v1}, Lgm/j;->d(Lgm/j;)Lm5/i;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance p1, Landroidx/credentials/exceptions/CreateCredentialProviderConfigurationException;

    const-string p2, "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"

    invoke-direct {p1, p2}, Landroidx/credentials/exceptions/CreateCredentialProviderConfigurationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Leu/f;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v3, p1

    move-object v4, p2

    invoke-interface/range {v2 .. v7}, Lm5/i;->onCreateCredential(Landroid/content/Context;Lm5/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V

    :goto_0
    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
