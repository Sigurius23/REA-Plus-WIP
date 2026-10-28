.class public final Lwc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;


# instance fields
.field public final w:Lkotlin/jvm/internal/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkotlin/jvm/internal/i;

    iput-object p1, p0, Lwc/l;->w:Lkotlin/jvm/internal/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lwc/l;->w:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v1, "Missing value for environment variable `"

    const/16 v2, 0x60

    invoke-static {v2, v1, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 6

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance p2, Lw91/l;

    const/16 v0, 0xe

    invoke-direct {p2, v0}, Lw91/l;-><init>(I)V

    sget-object v0, Log/b;->E:Log/b;

    const-class v1, Lwc/l;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2, p2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    invoke-static {}, Lwc/m;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwc/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lwc/m;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lwc/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lwc/m;->d()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lwc/l;->w:Lkotlin/jvm/internal/i;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {}, Lwc/m;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    const/16 v5, 0x8

    const-string v3, "Environment"

    invoke-static/range {v0 .. v5}, Ls93/h;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lve/e;

    move-result-object p1

    sget-object p2, Lie/a;->z:Lie/a;

    invoke-static {p1, p2}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
