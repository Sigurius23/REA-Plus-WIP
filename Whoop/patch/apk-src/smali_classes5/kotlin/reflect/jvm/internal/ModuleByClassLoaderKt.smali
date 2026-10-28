.class public final Lkotlin/reflect/jvm/internal/ModuleByClassLoaderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\u0008\u00030\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u000f\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\t0\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ljava/lang/Class;",
        "Lw93/e;",
        "getOrCreateModule",
        "(Ljava/lang/Class;)Lw93/e;",
        "Ll83/a0;",
        "clearModuleByClassLoaderCache",
        "()V",
        "Ljava/util/concurrent/ConcurrentMap;",
        "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;",
        "Ljava/lang/ref/WeakReference;",
        "moduleByClassLoader",
        "Ljava/util/concurrent/ConcurrentMap;",
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


# static fields
.field private static final moduleByClassLoader:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;",
            "Ljava/lang/ref/WeakReference<",
            "Lw93/e;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/ModuleByClassLoaderKt;->moduleByClassLoader:Ljava/util/concurrent/ConcurrentMap;

    return-void
.end method

.method public static final clearModuleByClassLoaderCache()V
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/ModuleByClassLoaderKt;->moduleByClassLoader:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public static final getOrCreateModule(Ljava/lang/Class;)Lw93/e;
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lw93/e;"
        }
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lx93/c;->d(Ljava/lang/Class;)Ljava/lang/ClassLoader;

    move-result-object v0

    new-instance v1, Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;

    invoke-direct {v1, v0}, Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;-><init>(Ljava/lang/ClassLoader;)V

    sget-object v2, Lkotlin/reflect/jvm/internal/ModuleByClassLoaderKt;->moduleByClassLoader:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lw93/e;

    if-eqz v4, :cond_0

    return-object v4

    :cond_0
    invoke-interface {v2, v1, v3}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_1
    sget-object v21, Lhb3/j;->d:Lhb3/j;

    new-instance v2, Laj/d;

    invoke-direct {v2, v0}, Laj/d;-><init>(Ljava/lang/Object;)V

    new-instance v3, Laj/d;

    const-class v4, Ll83/a0;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    const-string v5, "getClassLoader(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v4}, Laj/d;-><init>(Ljava/lang/Object;)V

    new-instance v4, Laj/c;

    const/16 v5, 0x1a

    invoke-direct {v4, v0, v5}, Laj/c;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "runtime module for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v11, Lw93/d;->b:Lw93/d;

    sget-object v31, Lw93/d;->c:Lw93/d;

    const-string v5, "moduleName"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lkb3/k;

    const-string v5, "DeserializationComponentsForJava.ModuleData"

    invoke-direct {v6, v5}, Lkb3/k;-><init>(Ljava/lang/String;)V

    new-instance v5, Lq93/j;

    sget-object v7, Lq93/h;->w:[Lq93/h;

    invoke-direct {v5, v6}, Lq93/j;-><init>(Lkb3/k;)V

    new-instance v7, Lu93/e0;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "<"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3e

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->g(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    const/16 v8, 0x38

    invoke-direct {v7, v0, v6, v5, v8}, Lu93/e0;-><init>(Lva3/h;Lkb3/k;Lo93/h;I)V

    iget-object v8, v6, Lkb3/k;->a:Lkb3/m;

    invoke-interface {v8}, Lkb3/m;->lock()V

    :try_start_0
    iget-object v0, v5, Lo93/h;->a:Lu93/e0;

    if-nez v0, :cond_9

    iput-object v7, v5, Lo93/h;->a:Lu93/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    invoke-interface {v8}, Lkb3/m;->unlock()V

    new-instance v0, Lo93/k;

    const/4 v8, 0x1

    invoke-direct {v0, v7, v8}, Lo93/k;-><init>(Lu93/e0;I)V

    iput-object v0, v5, Lq93/j;->f:Lo93/k;

    new-instance v26, Loa3/f;

    invoke-direct/range {v26 .. v26}, Ljava/lang/Object;-><init>()V

    new-instance v32, Laj/d;

    invoke-direct/range {v32 .. v32}, Ljava/lang/Object;-><init>()V

    new-instance v14, Lzt/q;

    invoke-direct {v14, v6, v7}, Lzt/q;-><init>(Lkb3/k;Lr93/b0;)V

    sget-object v33, Loa3/g;->c:Loa3/g;

    new-instance v0, Ll83/g;

    const/16 v9, 0x9

    const/4 v10, 0x0

    invoke-direct {v0, v8, v9, v10}, Ll83/g;-><init>(III)V

    new-instance v9, Lch3/h;

    sget-object v12, Lfa3/r;->d:Lfa3/s;

    iget-object v13, v12, Lfa3/s;->b:Ll83/g;

    if-eqz v13, :cond_2

    iget v13, v13, Ll83/g;->y:I

    iget v15, v0, Ll83/g;->y:I

    sub-int/2addr v13, v15

    if-gtz v13, :cond_2

    iget-object v12, v12, Lfa3/s;->c:Lfa3/b0;

    goto :goto_0

    :cond_2
    iget-object v12, v12, Lfa3/s;->a:Lfa3/b0;

    :goto_0
    const-string v13, "globalReportLevel"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v13, Lfa3/b0;->y:Lfa3/b0;

    if-ne v12, v13, :cond_3

    const/4 v13, 0x0

    goto :goto_1

    :cond_3
    move-object v13, v12

    :goto_1
    new-instance v15, Lfa3/v;

    invoke-direct {v15, v12, v13}, Lfa3/v;-><init>(Lfa3/b0;Lfa3/b0;)V

    new-instance v12, Ldc3/s;

    invoke-direct {v12, v0, v8}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v9, v15, v12}, Lch3/h;-><init>(Lfa3/v;Ldc3/s;)V

    new-instance v22, Lia3/a;

    sget-object v27, Lga3/h;->c:Lga3/h;

    sget-object v29, Lga3/h;->a:Lga3/h;

    new-instance v0, Lqt/e;

    invoke-direct {v0, v6}, Lqt/e;-><init>(Lkb3/k;)V

    new-instance v12, Lo93/l;

    invoke-direct {v12, v7, v14}, Lo93/l;-><init>(Lu93/e0;Lzt/q;)V

    new-instance v13, Lfa3/b;

    invoke-direct {v13, v9}, Lfa3/b;-><init>(Lch3/h;)V

    new-instance v15, Ljc/b;

    new-instance v8, Ljc/a;

    sget-object v41, Lia3/b;->a:Lia3/b;

    const/16 v10, 0xb

    invoke-direct {v8, v10}, Ljc/a;-><init>(I)V

    invoke-direct {v15, v8}, Ljc/b;-><init>(Ljc/a;)V

    sget-object v8, Lmb3/k;->b:Lmb3/j;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v18, Lmb3/j;->b:Lmb3/l;

    new-instance v44, Loa3/g;

    invoke-direct/range {v44 .. v44}, Ljava/lang/Object;-><init>()V

    sget-object v34, Lr93/v0;->x:Lr93/v0;

    sget-object v35, Lz93/b;->a:Lz93/b;

    sget-object v40, Lfa3/l;->a:Lfa3/l;

    move-object/from16 v30, v0

    move-object/from16 v25, v2

    move-object/from16 v24, v4

    move-object/from16 v23, v6

    move-object/from16 v36, v7

    move-object/from16 v43, v9

    move-object/from16 v28, v11

    move-object/from16 v37, v12

    move-object/from16 v38, v13

    move-object/from16 v39, v15

    move-object/from16 v42, v18

    invoke-direct/range {v22 .. v44}, Lia3/a;-><init>(Lkb3/n;Laj/c;Laj/d;Loa3/f;Lga3/h;Lhb3/o;Lga3/h;Lqt/e;Lw93/d;Laj/d;Loa3/g;Lr93/v0;Lz93/b;Lr93/b0;Lo93/l;Lfa3/b;Ljc/b;Lfa3/l;Lia3/b;Lmb3/k;Lch3/h;Loa3/g;)V

    move-object/from16 v8, v22

    move-object/from16 v0, v25

    move-object/from16 v2, v26

    move-object/from16 v4, v32

    new-instance v10, Lia3/d;

    invoke-direct {v10, v8}, Lia3/d;-><init>(Lia3/a;)V

    sget-object v8, Lsa3/e;->g:Lsa3/e;

    const-string v9, "metadataVersion"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Lcom/google/crypto/tink/internal/l0;

    const/16 v12, 0x1b

    const/4 v13, 0x0

    invoke-direct {v9, v0, v2, v13, v12}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    move-object v12, v9

    new-instance v9, Lcom/google/crypto/tink/internal/k0;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    iput-object v0, v9, Lcom/google/crypto/tink/internal/k0;->x:Ljava/lang/Object;

    new-instance v15, Ldc3/s;

    move-object/from16 v22, v1

    const/16 v1, 0xc

    invoke-direct {v15, v9, v1}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v15}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object v15

    iput-object v15, v9, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    iput-object v7, v9, Lcom/google/crypto/tink/internal/k0;->z:Ljava/lang/Object;

    iput-object v14, v9, Lcom/google/crypto/tink/internal/k0;->E:Ljava/lang/Object;

    new-instance v15, Lwe/o;

    invoke-direct {v15, v7, v14}, Lwe/o;-><init>(Lr93/b0;Lzt/q;)V

    iput-object v15, v9, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    sget-object v15, Lsa3/e;->g:Lsa3/e;

    iput-object v15, v9, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iput-object v8, v9, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    sget-object v8, Llb3/k;->a:Llb3/k;

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    iget-object v8, v7, Lu93/e0;->E:Lo93/h;

    instance-of v15, v8, Lq93/j;

    if-eqz v15, :cond_4

    check-cast v8, Lq93/j;

    :goto_2
    move-object v15, v5

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    goto :goto_2

    :goto_3
    new-instance v5, Lhb3/i;

    move-object/from16 v17, v8

    move-object v8, v12

    sget-object v12, Loa3/g;->b:Loa3/g;

    if-eqz v17, :cond_5

    invoke-virtual/range {v17 .. v17}, Lq93/j;->K()Lq93/p;

    move-result-object v19

    if-eqz v19, :cond_5

    goto :goto_4

    :cond_5
    sget-object v19, Lt93/a;->b:Lt93/a;

    :goto_4
    if-eqz v17, :cond_6

    invoke-virtual/range {v17 .. v17}, Lq93/j;->K()Lq93/p;

    move-result-object v17

    if-eqz v17, :cond_6

    goto :goto_5

    :cond_6
    sget-object v17, Lt93/a;->d:Lt93/a;

    :goto_5
    sget-object v23, Lua3/g;->a:Lwa3/i;

    new-instance v13, Lqt/e;

    invoke-direct {v13, v6}, Lqt/e;-><init>(Lkb3/k;)V

    move-object/from16 v25, v15

    move-object/from16 v15, v19

    move-object/from16 v19, v13

    sget-object v13, Lm83/y;->w:Lm83/y;

    move-object/from16 v16, v17

    move-object/from16 v17, v23

    move-object/from16 v26, v25

    const/16 v23, 0x1

    const/16 v24, 0x0

    invoke-direct/range {v5 .. v21}, Lhb3/i;-><init>(Lkb3/k;Lr93/b0;Lhb3/e;Lhb3/a;Lr93/j0;Lhb3/o;Lhb3/p;Ljava/lang/Iterable;Lzt/q;Lt93/b;Lt93/d;Lwa3/i;Lmb3/k;Lqt/e;Ljava/util/List;Lhb3/n;)V

    iput-object v5, v2, Loa3/f;->a:Lhb3/i;

    new-instance v8, Lbu/c;

    invoke-direct {v8, v10}, Lbu/c;-><init>(Ljava/lang/Object;)V

    iput-object v8, v4, Laj/d;->w:Ljava/lang/Object;

    new-instance v4, Lq93/r;

    invoke-virtual/range {v26 .. v26}, Lq93/j;->K()Lq93/p;

    move-result-object v8

    invoke-virtual/range {v26 .. v26}, Lq93/j;->K()Lq93/p;

    move-result-object v9

    new-instance v11, Lqt/e;

    invoke-direct {v11, v6}, Lqt/e;-><init>(Lkb3/k;)V

    const-string v12, "additionalClassPartsProvider"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "platformDependentDeclarationFilter"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v6, v3, v7}, Lq93/r;-><init>(Lkb3/k;Laj/d;Lu93/e0;)V

    new-instance v32, Lhb3/i;

    new-instance v3, Laj/c;

    invoke-direct {v3, v4, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lcom/google/crypto/tink/internal/l0;

    sget-object v12, Lib3/a;->m:Lib3/a;

    invoke-direct {v1, v7, v14, v12}, Lcom/google/crypto/tink/internal/l0;-><init>(Lr93/b0;Lzt/q;Lgb3/a;)V

    new-instance v13, Lp93/a;

    invoke-direct {v13, v6, v7}, Lp93/a;-><init>(Lkb3/k;Lu93/e0;)V

    new-instance v15, Lq93/g;

    invoke-direct {v15, v6, v7}, Lq93/g;-><init>(Lkb3/k;Lu93/e0;)V

    move-object/from16 v36, v1

    const/4 v1, 0x2

    move-object/from16 v35, v3

    new-array v3, v1, [Lt93/c;

    aput-object v13, v3, v24

    aput-object v15, v3, v23

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v38, v3

    check-cast v38, Ljava/lang/Iterable;

    iget-object v3, v12, Lgb3/a;->a:Lwa3/i;

    const/high16 v45, 0x40000

    move-object/from16 v42, v3

    move-object/from16 v37, v4

    move-object/from16 v33, v6

    move-object/from16 v34, v7

    move-object/from16 v40, v8

    move-object/from16 v41, v9

    move-object/from16 v44, v11

    move-object/from16 v39, v14

    move-object/from16 v43, v18

    invoke-direct/range {v32 .. v45}, Lhb3/i;-><init>(Lkb3/k;Lr93/b0;Laj/c;Lcom/google/crypto/tink/internal/l0;Lr93/j0;Ljava/lang/Iterable;Lzt/q;Lt93/b;Lt93/d;Lwa3/i;Lmb3/k;Lqt/e;I)V

    move-object/from16 v4, v32

    move-object/from16 v3, v37

    iput-object v4, v3, Lq93/r;->c:Lhb3/i;

    filled-new-array {v7}, [Lu93/e0;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Lu93/d0;

    invoke-direct {v6, v4}, Lu93/d0;-><init>(Ljava/lang/Object;)V

    iput-object v6, v7, Lu93/e0;->H:Lu93/d0;

    new-instance v4, Lu93/m;

    new-array v1, v1, [Lr93/j0;

    aput-object v10, v1, v24

    aput-object v3, v1, v23

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "CompositeProvider@RuntimeModuleData for "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v1, v3}, Lu93/m;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iput-object v4, v7, Lu93/e0;->I:Lr93/j0;

    new-instance v1, Lw93/e;

    new-instance v3, Ls/m2;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v2, v3, Ls/m2;->w:Ljava/lang/Object;

    iput-object v0, v3, Ls/m2;->x:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, v3, Ls/m2;->y:Ljava/lang/Object;

    invoke-direct {v1, v5, v3}, Lw93/e;-><init>(Lhb3/i;Ls/m2;)V

    :goto_6
    :try_start_1
    sget-object v0, Lkotlin/reflect/jvm/internal/ModuleByClassLoaderKt;->moduleByClassLoader:Ljava/util/concurrent/ConcurrentMap;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v3, v22

    :try_start_2
    invoke-interface {v0, v3, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v2, :cond_7

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;->setTemporaryStrongRef(Ljava/lang/ClassLoader;)V

    return-object v1

    :cond_7
    const/4 v4, 0x0

    :try_start_3
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw93/e;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v5, :cond_8

    invoke-virtual {v3, v4}, Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;->setTemporaryStrongRef(Ljava/lang/ClassLoader;)V

    return-object v5

    :cond_8
    :try_start_4
    invoke-interface {v0, v3, v2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v22, v3

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_8

    :catchall_1
    move-exception v0

    :goto_7
    const/4 v4, 0x0

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object/from16 v3, v22

    goto :goto_7

    :goto_8
    invoke-virtual {v3, v4}, Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;->setTemporaryStrongRef(Ljava/lang/ClassLoader;)V

    throw v0

    :cond_9
    move-object/from16 v26, v5

    :try_start_5
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Built-ins module is already set: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v15, v26

    iget-object v2, v15, Lo93/h;->a:Lu93/e0;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (attempting to reset to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_6
    iget-object v1, v6, Lkb3/k;->b:Lkb3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    invoke-interface {v8}, Lkb3/m;->unlock()V

    throw v0
.end method
