.class public final Leb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll83/h;


# instance fields
.field public final w:Lj93/d;

.field public final x:Lkotlin/jvm/internal/m;

.field public y:Leb/h;


# direct methods
.method public constructor <init>(Lj93/d;Lc93/a;)V
    .locals 1

    const-string v0, "navArgsClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/i;->w:Lj93/d;

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Leb/i;->x:Lkotlin/jvm/internal/m;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Leb/i;->y:Leb/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Leb/i;->y:Leb/h;

    if-nez v0, :cond_1

    iget-object v0, p0, Leb/i;->x:Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    sget-object v1, Leb/j;->b:La0/g;

    iget-object v2, p0, Leb/i;->w:Lj93/d;

    invoke-virtual {v1, v2}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/reflect/Method;

    if-nez v3, :cond_0

    invoke-static {v2}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Leb/j;->a:[Ljava/lang/Class;

    const/4 v5, 0x1

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Class;

    const-string v5, "fromBundle"

    invoke-virtual {v3, v5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "navArgsClass.java.getMet\u2026                        }"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Leb/h;

    iput-object v0, p0, Leb/i;->y:Leb/h;

    :cond_1
    return-object v0
.end method
