.class public final Lgh3/l;
.super Lxg3/g;
.source "SourceFile"


# static fields
.field public static final y:Z


# instance fields
.field public final x:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "rx.just.strong-mode"

    const-string v1, "false"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sput-boolean v0, Lgh3/l;->y:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Lch3/n;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v1}, Ljh3/f;->c()Ljh3/b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0, v0}, Lxg3/g;-><init>(Lxg3/e;)V

    iput-object p1, p0, Lgh3/l;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final X(Lxg3/k;)Lxg3/g;
    .locals 3

    instance-of v0, p1, Leh3/i;

    if-eqz v0, :cond_0

    check-cast p1, Leh3/i;

    new-instance v0, Le10/k0;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_0
    new-instance v0, Le10/k0;

    const/16 v1, 0x18

    invoke-direct {v0, p1, v1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    :goto_0
    new-instance p1, Lgh3/j;

    iget-object v1, p0, Lgh3/l;->x:Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-direct {p1, v1, v0, v2}, Lgh3/j;-><init>(Ljava/lang/Object;Lbh3/g;I)V

    invoke-static {p1}, Lxg3/g;->V(Lxg3/e;)Lxg3/g;

    move-result-object p1

    return-object p1
.end method
