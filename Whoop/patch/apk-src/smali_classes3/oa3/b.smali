.class public final Loa3/b;
.super Lgm/r;
.source "SourceFile"


# instance fields
.field public final synthetic F:Lxl/a;


# direct methods
.method public constructor <init>(Lxl/a;Loa3/r;)V
    .locals 0

    iput-object p1, p0, Loa3/b;->F:Lxl/a;

    invoke-direct {p0, p1, p2}, Lgm/r;-><init>(Lxl/a;Loa3/r;)V

    return-void
.end method


# virtual methods
.method public final X(ILva3/c;Lw93/a;)Lm63/d;
    .locals 3

    iget-object v0, p0, Lgm/r;->x:Ljava/lang/Object;

    check-cast v0, Loa3/r;

    new-instance v1, Loa3/r;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, v0, Loa3/r;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x40

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Loa3/r;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Loa3/b;->F:Lxl/a;

    iget-object v0, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p1, p1, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/crypto/tink/internal/k0;

    invoke-virtual {p1, p2, p3, v2}, Lcom/google/crypto/tink/internal/k0;->G(Lva3/c;Lw93/a;Ljava/util/List;)Lm63/d;

    move-result-object p1

    return-object p1
.end method
