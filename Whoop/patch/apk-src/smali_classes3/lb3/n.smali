.class public abstract Llb3/n;
.super Llb3/m;
.source "SourceFile"


# instance fields
.field public final x:Llb3/c0;


# direct methods
.method public constructor <init>(Llb3/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/n;->x:Llb3/c0;

    return-void
.end method


# virtual methods
.method public final u0(Z)Llb3/c0;
    .locals 1

    invoke-virtual {p0}, Llb3/m;->k0()Z

    move-result v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Llb3/n;->x:Llb3/c0;

    invoke-virtual {v0, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    invoke-virtual {p0}, Llb3/m;->Y()Llb3/k0;

    move-result-object v0

    invoke-virtual {p1, v0}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llb3/m;->Y()Llb3/k0;

    move-result-object v0

    if-eq p1, v0, :cond_0

    new-instance v0, Llb3/e0;

    invoke-direct {v0, p0, p1}, Llb3/e0;-><init>(Llb3/c0;Llb3/k0;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public final w0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/n;->x:Llb3/c0;

    return-object v0
.end method
