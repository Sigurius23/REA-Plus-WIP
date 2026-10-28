.class public final Lu0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/p0;


# instance fields
.field public final a:Lb3/x2;

.field public b:Lu0/q0;

.field public c:Lg2/i;


# direct methods
.method public constructor <init>(Lb3/x2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/o0;->a:Lb3/x2;

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 4

    const/4 v0, 0x6

    const/4 v1, 0x0

    const-string v2, "focusManager"

    const/4 v3, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lu0/o0;->c:Lg2/i;

    if-eqz p1, :cond_0

    check-cast p1, Lg2/l;

    invoke-virtual {p1, v3}, Lg2/l;->h(I)Z

    return v3

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lu0/o0;->c:Lg2/i;

    if-eqz p1, :cond_2

    const/4 v0, 0x2

    check-cast p1, Lg2/l;

    invoke-virtual {p1, v0}, Lg2/l;->h(I)Z

    return v3

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    const/4 v0, 0x7

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lu0/o0;->a:Lb3/x2;

    if-eqz p1, :cond_4

    check-cast p1, Lb3/x1;

    invoke-virtual {p1}, Lb3/x1;->a()V

    return v3

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final b()Lu0/q0;
    .locals 1

    iget-object v0, p0, Lu0/o0;->b:Lu0/q0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "keyboardActions"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final c(I)Z
    .locals 2

    const/4 v0, 0x7

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lu0/o0;->b()Lu0/q0;

    move-result-object v0

    iget-object v0, v0, Lu0/q0;->a:Lkotlin/jvm/functions/Function1;

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lu0/o0;->b()Lu0/q0;

    move-result-object v0

    iget-object v0, v0, Lu0/q0;->b:Lkotlin/jvm/functions/Function1;

    goto :goto_1

    :cond_1
    const/4 v0, 0x6

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Lu0/o0;->b()Lu0/q0;

    move-result-object v0

    iget-object v0, v0, Lu0/q0;->c:Lkotlin/jvm/functions/Function1;

    goto :goto_1

    :cond_2
    const/4 v0, 0x5

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, Lu0/o0;->b()Lu0/q0;

    move-result-object v0

    iget-object v0, v0, Lu0/q0;->d:Lkotlin/jvm/functions/Function1;

    goto :goto_1

    :cond_3
    const/4 v0, 0x3

    if-ne p1, v0, :cond_4

    invoke-virtual {p0}, Lu0/o0;->b()Lu0/q0;

    move-result-object v0

    iget-object v0, v0, Lu0/q0;->e:Lkotlin/jvm/functions/Function1;

    goto :goto_1

    :cond_4
    const/4 v0, 0x4

    if-ne p1, v0, :cond_5

    invoke-virtual {p0}, Lu0/o0;->b()Lu0/q0;

    move-result-object v0

    iget-object v0, v0, Lu0/q0;->f:Lkotlin/jvm/functions/Function1;

    goto :goto_1

    :cond_5
    if-ne p1, v1, :cond_6

    goto :goto_0

    :cond_6
    if-nez p1, :cond_8

    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_7

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_7
    invoke-virtual {p0, p1}, Lu0/o0;->a(I)Z

    move-result p1

    return p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid ImeAction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
