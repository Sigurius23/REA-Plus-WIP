.class public final Llb3/e0;
.super Llb3/n;
.source "SourceFile"


# instance fields
.field public final y:Llb3/k0;


# direct methods
.method public constructor <init>(Llb3/c0;Llb3/k0;)V
    .locals 1

    const-string v0, "attributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llb3/n;-><init>(Llb3/c0;)V

    iput-object p2, p0, Llb3/e0;->y:Llb3/k0;

    return-void
.end method


# virtual methods
.method public final Y()Llb3/k0;
    .locals 1

    iget-object v0, p0, Llb3/e0;->y:Llb3/k0;

    return-object v0
.end method

.method public final y0(Llb3/c0;)Llb3/m;
    .locals 2

    new-instance v0, Llb3/e0;

    iget-object v1, p0, Llb3/e0;->y:Llb3/k0;

    invoke-direct {v0, p1, v1}, Llb3/e0;-><init>(Llb3/c0;Llb3/k0;)V

    return-object v0
.end method
