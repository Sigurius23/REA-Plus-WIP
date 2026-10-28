.class public final Lp93/e;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lkb3/k;Lp93/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;-><init>(Lkb3/n;Lu93/b;)V

    return-void
.end method


# virtual methods
.method public final computeDeclaredFunctions()Ljava/util/List;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lp93/c;

    iget-object v0, v0, Lp93/c;->G:Lp93/k;

    sget-object v1, Lp93/g;->c:Lp93/g;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v0

    check-cast v0, Lp93/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lds/p;->z(Lp93/c;Z)Lp93/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v1, Lp93/j;->c:Lp93/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v0

    check-cast v0, Lp93/c;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lds/p;->z(Lp93/c;Z)Lp93/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
