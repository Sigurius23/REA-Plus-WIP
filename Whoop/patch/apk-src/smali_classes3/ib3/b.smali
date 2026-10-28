.class public final Lib3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo93/c;


# instance fields
.field public final b:Lib3/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lib3/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lib3/b;->b:Lib3/d;

    return-void
.end method


# virtual methods
.method public final a(Lkb3/k;Lr93/b0;Ljava/lang/Iterable;Lt93/d;Lt93/b;Z)Lr93/i0;
    .locals 18

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v0, "builtInsModule"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classDescriptorFactories"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "platformDependentDeclarationFilter"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalClassPartsProvider"

    move-object/from16 v8, p5

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/n;->q:Ljava/util/Set;

    new-instance v10, Lg40/f4;

    const/16 v16, 0x0

    const/16 v17, 0xc

    const/4 v11, 0x1

    move-object/from16 v3, p0

    iget-object v12, v3, Lib3/b;->b:Lib3/d;

    const-class v13, Lib3/d;

    const-string v14, "loadResource"

    const-string v15, "loadResource(Ljava/lang/String;)Ljava/io/InputStream;"

    invoke-direct/range {v10 .. v17}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const-string v4, "packageFqNames"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lva3/e;

    sget-object v5, Lib3/a;->m:Lib3/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lib3/a;->a(Lva3/e;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Lg40/f4;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/io/InputStream;

    if-eqz v5, :cond_1

    invoke-static {v4, v1, v2, v5}, Lj93/l0;->t(Lva3/e;Lkb3/k;Lr93/b0;Ljava/io/InputStream;)Lib3/c;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_0

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v5, Lr93/i0;

    invoke-direct {v5, v14}, Lr93/i0;-><init>(Ljava/util/ArrayList;)V

    new-instance v7, Lzt/q;

    invoke-direct {v7, v1, v2}, Lzt/q;-><init>(Lkb3/k;Lr93/b0;)V

    new-instance v0, Lhb3/i;

    new-instance v3, Laj/c;

    const/16 v4, 0xc

    invoke-direct {v3, v5, v4}, Laj/c;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Lcom/google/crypto/tink/internal/l0;

    sget-object v10, Lib3/a;->m:Lib3/a;

    invoke-direct {v4, v2, v7, v10}, Lcom/google/crypto/tink/internal/l0;-><init>(Lr93/b0;Lzt/q;Lgb3/a;)V

    iget-object v10, v10, Lgb3/a;->a:Lwa3/i;

    new-instance v12, Lqt/e;

    invoke-direct {v12, v1}, Lqt/e;-><init>(Lkb3/k;)V

    const/high16 v13, 0xd0000

    const/4 v11, 0x0

    invoke-direct/range {v0 .. v13}, Lhb3/i;-><init>(Lkb3/k;Lr93/b0;Laj/c;Lcom/google/crypto/tink/internal/l0;Lr93/j0;Ljava/lang/Iterable;Lzt/q;Lt93/b;Lt93/d;Lwa3/i;Lmb3/k;Lqt/e;I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lib3/c;

    invoke-virtual {v2, v0}, Lib3/c;->K0(Lhb3/i;)V

    goto :goto_2

    :cond_3
    return-object v5
.end method
