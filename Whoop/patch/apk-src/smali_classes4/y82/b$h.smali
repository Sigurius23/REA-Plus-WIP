.class final enum Ly82/b$h;
.super Ly82/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly82/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public synthetic constructor <init>()V
    .locals 3

    .line 1
    const/16 v0, 0x10

    const-string v1, "Lenient Strap Sync"

    const-string v2, "LENIENT_STRAP_SYNC"

    invoke-direct {p0, v2, v0, v1}, Ly82/b$h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Ly82/b;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public perform(Landroid/content/Context;)Ly82/b$t;
    .locals 1

    const-class p1, Lc92/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc92/g;

    invoke-virtual {p1}, Lc92/g;->Z()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Ly82/b$t;->c()Ly82/b$t;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ly82/b$t;->a()Ly82/b$t;

    move-result-object p1

    return-object p1
.end method
