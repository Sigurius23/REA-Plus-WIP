.class public final Lmp/q;
.super Lmp/n;
.source "SourceFile"


# instance fields
.field public final synthetic y:Lmp/r;


# direct methods
.method public constructor <init>(Lmp/r;)V
    .locals 0

    iput-object p1, p0, Lmp/q;->y:Lmp/r;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic get(I)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/util/AbstractMap$SimpleImmutableEntry;

    iget-object v1, p0, Lmp/q;->y:Lmp/r;

    iget-object v2, v1, Lmp/r;->z:Lmp/s;

    iget-object v2, v2, Lmp/s;->y:Lmp/a0;

    iget-object v2, v2, Lmp/a0;->F:Lmp/n;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    iget-object v1, v1, Lmp/r;->z:Lmp/s;

    iget-object v1, v1, Lmp/s;->z:Lmp/n;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lmp/q;->y:Lmp/r;

    iget-object v0, v0, Lmp/r;->z:Lmp/s;

    iget-object v0, v0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
