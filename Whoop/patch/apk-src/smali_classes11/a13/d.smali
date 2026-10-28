.class public final La13/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La13/i;

.field public final b:Lc93/a;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public d:Z


# direct methods
.method public constructor <init>(La13/i;Lc93/a;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La13/d;->a:La13/i;

    iput-object p2, p0, La13/d;->b:Lc93/a;

    iput-object p3, p0, La13/d;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    const-string v0, "Push:Notifications-PM"

    const-string v1, "[onAppLaunched] no args"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, La13/d;->b:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La13/d;->c()V

    :cond_0
    return-void
.end method

.method public final b(La13/e;)V
    .locals 1

    iget-object v0, p0, La13/d;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c()V
    .locals 5

    iget-boolean v0, p0, La13/d;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, La13/d;->a:La13/i;

    iget-object v1, v0, La13/i;->z:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    new-instance v2, La13/h;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v2, v0, v4, v3}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v0, 0x3

    invoke-static {v1, v4, v4, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La13/d;->d:Z

    return-void
.end method
