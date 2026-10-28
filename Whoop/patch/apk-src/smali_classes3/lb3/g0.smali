.class public final Llb3/g0;
.super Llb3/u0;
.source "SourceFile"


# instance fields
.field public final a:Llb3/c0;


# direct methods
.method public constructor <init>(Lo93/h;)V
    .locals 1

    const-string v0, "kotlinBuiltIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lo93/h;->p()Llb3/c0;

    move-result-object p1

    const-string v0, "getNullableAnyType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llb3/g0;->a:Llb3/c0;

    return-void
.end method


# virtual methods
.method public final a()Llb3/g1;
    .locals 1

    sget-object v0, Llb3/g1;->E:Llb3/g1;

    return-object v0
.end method

.method public final b()Llb3/y;
    .locals 1

    iget-object v0, p0, Llb3/g0;->a:Llb3/c0;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(Lmb3/f;)Llb3/u0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
