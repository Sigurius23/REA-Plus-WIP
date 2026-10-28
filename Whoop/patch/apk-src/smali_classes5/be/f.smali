.class public final Lbe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/h;


# instance fields
.field public final synthetic a:Lgm/r;


# direct methods
.method public constructor <init>(Lgm/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe/f;->a:Lgm/r;

    return-void
.end method


# virtual methods
.method public final a(Ldg/a;Lrf/l;[B)Ljava/lang/Object;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "call"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lrf/l;->x:Lwf/a;

    new-instance v0, Lbe/e;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lbe/e;-><init>(Lrf/l;I)V

    const/4 p2, 0x0

    iget-object v1, p0, Lbe/f;->a:Lgm/r;

    invoke-virtual {v1, p2, v0}, Lgm/r;->s(Ljava/lang/Throwable;Lc93/a;)V

    iget-object p1, p1, Lwf/a;->a:Lmf/t;

    invoke-static {p1}, Lbi/g;->L(Lmf/t;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p3}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    iget-object p3, p1, Lmf/t;->b:Ljava/lang/String;

    const-string v0, "error retrieving instance metadata: "

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;-><init>(Lmf/t;Ljava/lang/String;)V

    throw p2
.end method
