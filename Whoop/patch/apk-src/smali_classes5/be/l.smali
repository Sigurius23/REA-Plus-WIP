.class public final Lbe/l;
.super Lgg/h;
.source "SourceFile"


# instance fields
.field public final y:Lq83/j;


# direct methods
.method public constructor <init>(Lq83/j;)V
    .locals 1

    const-string v0, "callContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lgg/h;-><init>()V

    iput-object p1, p0, Lbe/l;->y:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/e;
    .locals 5

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    iget-object v0, v0, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;->z:Lmf/t;

    invoke-static {v0}, Lbi/g;->m(Lmf/t;)Lmf/s;

    move-result-object v2

    sget-object v3, Lmf/s;->z:Lmf/s;

    if-ne v2, v3, :cond_0

    new-instance p1, Lgg/b;

    sget-object v0, Lgg/f;->w:Lgg/f;

    invoke-direct {p1, v0}, Lgg/b;-><init>(Lgg/f;)V

    return-object p1

    :cond_0
    sget-object v2, Lmf/t;->d:Lmf/t;

    invoke-virtual {v0, v2}, Lmf/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p1, Lgg/b;

    sget-object v0, Lgg/f;->w:Lgg/f;

    invoke-direct {p1, v0}, Lgg/b;-><init>(Lgg/f;)V

    return-object p1

    :cond_1
    const-class v2, Lbe/l;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, p0, Lbe/l;->y:Lq83/j;

    invoke-static {v3, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v2

    new-instance v3, Li;

    const/16 v4, 0x15

    invoke-direct {v3, v4, v0, p1}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v1, v3}, Lgm/r;->u(Ljava/lang/Throwable;Lc93/a;)V

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-object v1
.end method
