.class public final Lkotlin/reflect/jvm/internal/BuiltinsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "arity",
        "Laa3/n0;",
        "createFunctionKmClass",
        "(I)Laa3/n0;",
        "kotlin-reflection"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final createFunctionKmClass(I)Laa3/n0;
    .locals 8

    new-instance v0, Laa3/n0;

    invoke-direct {v0}, Laa3/n0;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "kotlin/Function"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "<set-?>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Laa3/n0;->x:Ljava/lang/String;

    sget-object v1, Laa3/q;->y:Laa3/q;

    sget-object v4, Laa3/p;->a:[Lj93/z;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Laa3/p;->d:Lzt/q;

    sget-object v5, Laa3/p;->a:[Lj93/z;

    const/16 v6, 0x9

    aget-object v6, v5, v6

    invoke-virtual {v4, v0, v6, v1}, Lzt/q;->M(Laa3/n0;Lj93/z;Ljava/lang/Enum;)V

    sget-object v1, Laa3/m1;->z:Laa3/m1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Laa3/p;->b:Lzt/q;

    const/4 v6, 0x7

    aget-object v6, v5, v6

    invoke-virtual {v4, v0, v6, v1}, Lzt/q;->M(Laa3/n0;Lj93/z;Ljava/lang/Enum;)V

    sget-object v1, Laa3/n1;->x:Laa3/n1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Laa3/p;->c:Lzt/q;

    const/16 v4, 0x8

    aget-object v4, v5, v4

    invoke-virtual {v3, v0, v4, v1}, Lzt/q;->M(Laa3/n0;Lj93/z;Ljava/lang/Enum;)V

    iget-object v1, v0, Laa3/n0;->y:Ljava/util/ArrayList;

    const/4 v3, 0x1

    if-gt v3, p0, :cond_0

    move v4, v3

    :goto_0
    new-instance v5, Laa3/d1;

    const-string v6, "P"

    invoke-static {v4, v6}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Laa3/g1;->x:Laa3/g1;

    invoke-direct {v5, v6, v4, v7}, Laa3/d1;-><init>(Ljava/lang/String;ILaa3/g1;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v4, p0, :cond_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr p0, v3

    new-instance v3, Laa3/d1;

    const-string v4, "R"

    sget-object v5, Laa3/g1;->y:Laa3/g1;

    invoke-direct {v3, v4, p0, v5}, Laa3/d1;-><init>(Ljava/lang/String;ILaa3/g1;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Laa3/b1;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Laa3/b1;-><init>(I)V

    new-instance v4, Laa3/o0;

    invoke-direct {v4, v2}, Laa3/o0;-><init>(Ljava/lang/String;)V

    iput-object v4, v1, Laa3/b1;->b:Laa3/r0;

    sget-object v2, Laa3/g1;->w:Laa3/g1;

    new-instance v4, Laa3/b1;

    invoke-direct {v4, v3}, Laa3/b1;-><init>(I)V

    new-instance v3, Laa3/q0;

    invoke-direct {v3, p0}, Laa3/q0;-><init>(I)V

    iput-object v3, v4, Laa3/b1;->b:Laa3/r0;

    new-instance p0, Laa3/e1;

    invoke-direct {p0, v2, v4}, Laa3/e1;-><init>(Laa3/g1;Laa3/b1;)V

    iget-object v2, v1, Laa3/b1;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p0, v0, Laa3/n0;->z:Ljava/util/ArrayList;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
