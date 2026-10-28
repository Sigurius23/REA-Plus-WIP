.class public final Lu93/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu93/b;


# direct methods
.method public synthetic constructor <init>(Lu93/b;I)V
    .locals 0

    iput p2, p0, Lu93/a;->w:I

    iput-object p1, p0, Lu93/a;->x:Lu93/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lu93/a;->w:I

    iget-object v1, p0, Lu93/a;->x:Lu93/b;

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lu93/y;

    invoke-direct {v0, v1}, Lu93/y;-><init>(Lr93/e;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;

    invoke-virtual {v1}, Lu93/b;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V

    return-object v0

    :pswitch_1
    invoke-virtual {v1}, Lu93/b;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v6

    new-instance v7, Ldc3/s;

    const/16 v0, 0xe

    invoke-direct {v7, p0, v0}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    sget-object v0, Llb3/d1;->a:Lnb3/i;

    invoke-static {v1}, Lnb3/l;->f(Lr93/k;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lnb3/k;->K:Lnb3/k;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lr93/h;->e()Llb3/q0;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz v3, :cond_2

    if-eqz v6, :cond_1

    invoke-interface {v3}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Llb3/d1;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Llb3/k0;->y:Llb3/k0;

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Llb3/o;->l(Llb3/k0;Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)Llb3/c0;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/16 v1, 0xd

    invoke-static {v1}, Llb3/d1;->a(I)V

    throw v0

    :cond_2
    const/16 v1, 0xc

    invoke-static {v1}, Llb3/d1;->a(I)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
