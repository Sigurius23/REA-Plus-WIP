.class public abstract Lbc3/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbc3/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    sget v1, Lhc3/y;->a:I

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_1

    sget-object v0, Lbc3/g0;->H:Lbc3/g0;

    goto :goto_3

    :cond_1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v1

    instance-of v1, v1, Lhc3/p;

    if-nez v1, :cond_3

    instance-of v1, v0, Lbc3/k0;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    check-cast v0, Lbc3/k0;

    goto :goto_3

    :cond_3
    :goto_2
    sget-object v0, Lbc3/g0;->H:Lbc3/g0;

    :goto_3
    sput-object v0, Lbc3/h0;->a:Lbc3/k0;

    return-void
.end method
