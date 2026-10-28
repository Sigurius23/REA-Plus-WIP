.class public final Ll1/w3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Z

.field public d:Ld0/l;

.field public final e:Lm1/g;

.field public f:Ld0/c0;

.field public g:Ld0/c0;


# direct methods
.method public constructor <init>(ZLc93/a;Lc93/a;Ll1/x3;Lkotlin/jvm/functions/Function1;Z)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ll1/w3;->a:Z

    iput-object p5, p0, Ll1/w3;->b:Lkotlin/jvm/functions/Function1;

    iput-boolean p6, p0, Ll1/w3;->c:Z

    if-eqz p1, :cond_1

    sget-object p1, Ll1/x3;->y:Ll1/x3;

    if-eq p4, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p6, :cond_3

    sget-object p1, Ll1/x3;->w:Ll1/x3;

    if-eq p4, p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The initial value must not be set to Hidden if skipHiddenState is set to true."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    sget-object p1, Ll1/t3;->b:Ld0/e2;

    iput-object p1, p0, Ll1/w3;->d:Ld0/l;

    new-instance v0, Lm1/g;

    new-instance v2, Lh0/l0;

    const/16 p1, 0xf

    invoke-direct {v2, p2, p1}, Lh0/l0;-><init>(Lc93/a;I)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 p1, 0x13

    invoke-direct {v4, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    move-object v3, p3

    move-object v1, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lm1/g;-><init>(Ll1/x3;Lh0/l0;Lc93/a;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Ll1/w3;->e:Lm1/g;

    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object p1

    iput-object p1, p0, Ll1/w3;->f:Ld0/c0;

    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object p1

    iput-object p1, p0, Ll1/w3;->g:Ld0/c0;

    return-void
.end method

.method public static a(Ll1/w3;Ll1/x3;Ld0/c0;Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ll1/w3;->e:Lm1/g;

    iget-object v0, v0, Lm1/g;->k:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    iget-object v1, p0, Ll1/w3;->e:Lm1/g;

    new-instance v2, Ll1/v3;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, p2, v3}, Ll1/v3;-><init>(Ll1/w3;FLd0/c0;Lq83/d;)V

    sget-object p0, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {v1, p1, p0, v2, p3}, Lm1/g;->b(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Ls83/i;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Ll1/x3;->x:Ll1/x3;

    iget-object v1, p0, Ll1/w3;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll1/w3;->f:Ld0/c0;

    invoke-static {p0, v0, v1, p1}, Ll1/w3;->a(Ll1/w3;Ll1/x3;Ld0/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c()Ll1/x3;
    .locals 1

    iget-object v0, p0, Ll1/w3;->e:Lm1/g;

    iget-object v0, v0, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/x3;

    return-object v0
.end method

.method public final d(Lq83/d;)Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Ll1/w3;->c:Z

    if-nez v0, :cond_1

    sget-object v0, Ll1/x3;->w:Ll1/x3;

    iget-object v1, p0, Ll1/w3;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll1/w3;->g:Ld0/c0;

    invoke-static {p0, v0, v1, p1}, Ll1/w3;->a(Ll1/w3;Ll1/x3;Ld0/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Ll1/w3;->e:Lm1/g;

    iget-object v0, v0, Lm1/g;->g:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ll1/x3;->w:Ll1/x3;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Ls83/i;)Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, Ll1/w3;->a:Z

    if-nez v0, :cond_1

    sget-object v0, Ll1/x3;->y:Ll1/x3;

    iget-object v1, p0, Ll1/w3;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll1/w3;->g:Ld0/c0;

    invoke-static {p0, v0, v1, p1}, Ll1/w3;->a(Ll1/w3;Ll1/x3;Ld0/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Ls83/i;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll1/w3;->e:Lm1/g;

    invoke-virtual {v0}, Lm1/g;->d()Lm1/b0;

    move-result-object v0

    sget-object v1, Ll1/x3;->y:Ll1/x3;

    iget-object v0, v0, Lm1/b0;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ll1/x3;->x:Ll1/x3;

    :goto_0
    iget-object v0, p0, Ll1/w3;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll1/w3;->f:Ld0/c0;

    invoke-static {p0, v1, v0, p1}, Ll1/w3;->a(Ll1/w3;Ll1/x3;Ld0/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
