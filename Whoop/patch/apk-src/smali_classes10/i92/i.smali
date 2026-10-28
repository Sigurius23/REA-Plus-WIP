.class public abstract Li92/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Z
    .locals 3

    new-instance v0, Lvf3/c;

    const-string v1, "httpLoggingInterceptor"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lme3/c;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme3/c;

    iget-object v0, v0, Lme3/c;->z:Lme3/a;

    sget-object v1, Lme3/a;->z:Lme3/a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static b()V
    .locals 3

    new-instance v0, Lvf3/c;

    const-string v1, "httpLoggingInterceptor"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    const-class v2, Lme3/c;

    invoke-static {v2, v0, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lme3/c;

    iget-object v1, v0, Lme3/c;->z:Lme3/a;

    sget-object v2, Lme3/a;->z:Lme3/a;

    if-ne v1, v2, :cond_0

    sget-object v2, Lme3/a;->x:Lme3/a;

    :cond_0
    iput-object v2, v0, Lme3/c;->z:Lme3/a;

    return-void
.end method
