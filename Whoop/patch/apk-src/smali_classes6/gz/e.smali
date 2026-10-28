.class public final Lgz/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv30/b;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Lbz/i;

.field public final c:Lbz/a;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lbz/i;)V
    .locals 1

    const-string v0, "viewActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userFacingLogger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lgz/e;->b:Lbz/i;

    sget-object p1, Lbz/a;->b:Lbz/a;

    sget-object p1, Lbz/a;->b:Lbz/a;

    iput-object p1, p0, Lgz/e;->c:Lbz/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lgz/e;->c:Lbz/a;

    sget-object v1, Lbz/b;->E:Lbz/b;

    invoke-virtual {v0, v1}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lcz/q;

    new-instance v2, Ldz/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Ldz/e;-><init>(Lkotlin/time/Duration;I)V

    invoke-direct {v1, v2}, Lcz/q;-><init>(Lv30/a;)V

    iget-object v0, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lgz/e;->c:Lbz/a;

    sget-object v1, Lbz/b;->E:Lbz/b;

    invoke-static {v0, v1}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    new-instance v0, Lcz/q;

    new-instance v1, Ldz/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ldz/c;-><init>(I)V

    invoke-direct {v0, v1}, Lcz/q;-><init>(Lv30/a;)V

    iget-object v1, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Lcz/q;

    new-instance v1, Ldz/b;

    invoke-direct {v1, p1}, Ldz/b;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Lcz/q;-><init>(Lv30/a;)V

    iget-object p1, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lgz/e;->c:Lbz/a;

    sget-object v1, Lbz/b;->E:Lbz/b;

    invoke-virtual {v0, v1}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lcz/q;

    new-instance v2, Ldz/e;

    invoke-direct {v2, v0, p1}, Ldz/e;-><init>(Lkotlin/time/Duration;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Lcz/q;-><init>(Lv30/a;)V

    iget-object v0, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "Card scan check failed: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lgz/e;->b:Lbz/i;

    invoke-virtual {v0, p1}, Lbz/i;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 3

    new-instance v0, Lcz/q;

    new-instance v1, Ldz/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ldz/c;-><init>(I)V

    invoke-direct {v0, v1}, Lcz/q;-><init>(Lv30/a;)V

    iget-object v1, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f()V
    .locals 4

    iget-object v0, p0, Lgz/e;->c:Lbz/a;

    sget-object v1, Lbz/b;->E:Lbz/b;

    invoke-virtual {v0, v1}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lcz/q;

    new-instance v2, Ldz/e;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Ldz/e;-><init>(Lkotlin/time/Duration;I)V

    invoke-direct {v1, v2}, Lcz/q;-><init>(Lv30/a;)V

    iget-object v0, p0, Lgz/e;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
