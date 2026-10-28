.class public abstract Lpg3/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcq/s;

.field public static final b:Lpg3/b;

.field public static final c:Lpg3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "java.vm.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "RoboVM"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-nez v1, :cond_1

    const-string v1, "Dalvik"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sput-object v4, Lpg3/o0;->a:Lcq/s;

    new-instance v0, Lpg3/q0;

    invoke-direct {v0}, Lpg3/q0;-><init>()V

    sput-object v0, Lpg3/o0;->b:Lpg3/b;

    new-instance v0, Lpg3/d;

    invoke-direct {v0, v3}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/o0;->c:Lpg3/b;

    return-void

    :cond_0
    new-instance v0, Lcq/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcq/s;-><init>(I)V

    sput-object v0, Lpg3/o0;->a:Lcq/s;

    new-instance v0, Lpg3/p0;

    invoke-direct {v0, v2}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/o0;->b:Lpg3/b;

    new-instance v0, Lpg3/d;

    invoke-direct {v0, v3}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/o0;->c:Lpg3/b;

    return-void

    :cond_1
    sput-object v4, Lpg3/o0;->a:Lcq/s;

    new-instance v0, Lpg3/b;

    invoke-direct {v0, v2}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/o0;->b:Lpg3/b;

    new-instance v0, Lpg3/b;

    invoke-direct {v0, v3}, Lpg3/b;-><init>(I)V

    sput-object v0, Lpg3/o0;->c:Lpg3/b;

    return-void
.end method
