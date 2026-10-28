.class public abstract Lfa3/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/e;

.field public static final b:Lva3/e;

.field public static final c:Lva3/e;

.field public static final d:Lva3/e;

.field public static final e:Lva3/e;

.field public static final f:Lva3/e;

.field public static final g:Lva3/e;

.field public static final h:Lva3/e;

.field public static final i:Lva3/e;

.field public static final j:Ljava/util/Set;

.field public static final k:Ljava/util/Set;

.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/util/Set;

.field public static final n:Ljava/util/Set;

.field public static final o:Ljava/util/Set;

.field public static final p:Lva3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    new-instance v2, Lva3/e;

    const-string v0, "org.jspecify.nullness.Nullable"

    invoke-direct {v2, v0}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v0, Lva3/e;

    const-string v1, "org.jspecify.nullness.NullMarked"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lfa3/y;->a:Lva3/e;

    new-instance v1, Lva3/e;

    const-string v3, "org.jspecify.nullness.NullnessUnspecified"

    invoke-direct {v1, v3}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Lva3/e;

    const-string v3, "org.jspecify.annotations.NonNull"

    invoke-direct {v5, v3}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v3, Lva3/e;

    const-string v4, "org.jspecify.annotations.Nullable"

    invoke-direct {v3, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v4, Lva3/e;

    const-string v6, "org.jspecify.annotations.NullMarked"

    invoke-direct {v4, v6}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v4, Lfa3/y;->b:Lva3/e;

    new-instance v6, Lva3/e;

    const-string v7, "org.jspecify.annotations.NullnessUnspecified"

    invoke-direct {v6, v7}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v7, Lva3/e;

    const-string v8, "org.jspecify.annotations.NullUnmarked"

    invoke-direct {v7, v8}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v7, Lfa3/y;->c:Lva3/e;

    new-instance v8, Lva3/e;

    const-string v9, "javax.annotation.meta.TypeQualifier"

    invoke-direct {v8, v9}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v8, Lfa3/y;->d:Lva3/e;

    new-instance v8, Lva3/e;

    const-string v9, "javax.annotation.meta.TypeQualifierNickname"

    invoke-direct {v8, v9}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v8, Lfa3/y;->e:Lva3/e;

    new-instance v8, Lva3/e;

    const-string v9, "javax.annotation.meta.TypeQualifierDefault"

    invoke-direct {v8, v9}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v8, Lfa3/y;->f:Lva3/e;

    new-instance v8, Lva3/e;

    const-string v9, "javax.annotation.Nonnull"

    invoke-direct {v8, v9}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v8, Lfa3/y;->g:Lva3/e;

    new-instance v9, Lva3/e;

    const-string v10, "javax.annotation.Nullable"

    invoke-direct {v9, v10}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v10, Lva3/e;

    const-string v11, "javax.annotation.CheckForNull"

    invoke-direct {v10, v11}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v11, Lva3/e;

    const-string v12, "javax.annotation.ParametersAreNonnullByDefault"

    invoke-direct {v11, v12}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v11, Lfa3/y;->h:Lva3/e;

    new-instance v11, Lva3/e;

    const-string v12, "javax.annotation.ParametersAreNullableByDefault"

    invoke-direct {v11, v12}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v11, Lfa3/y;->i:Lva3/e;

    filled-new-array {v8, v10}, [Lva3/e;

    move-result-object v11

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    sput-object v11, Lfa3/y;->j:Ljava/util/Set;

    move-object v11, v4

    sget-object v4, Lfa3/x;->h:Lva3/e;

    const-string v12, "JETBRAINS_NOT_NULL_ANNOTATION"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v6

    new-instance v6, Lva3/e;

    const-string v13, "android.annotation.NonNull"

    invoke-direct {v6, v13}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v13, v7

    new-instance v7, Lva3/e;

    const-string v14, "androidx.annotation.NonNull"

    invoke-direct {v7, v14}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v15, v8

    new-instance v8, Lva3/e;

    move-object/from16 v19, v1

    const-string v1, "androidx.annotation.RecentlyNonNull"

    invoke-direct {v8, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v9

    new-instance v9, Lva3/e;

    invoke-direct {v9, v14}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v14, v10

    new-instance v10, Lva3/e;

    move-object/from16 v16, v1

    const-string v1, "com.android.annotations.NonNull"

    invoke-direct {v10, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v11

    new-instance v11, Lva3/e;

    move-object/from16 v17, v1

    const-string v1, "org.checkerframework.checker.nullness.compatqual.NonNullDecl"

    invoke-direct {v11, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v12

    new-instance v12, Lva3/e;

    move-object/from16 v18, v1

    const-string v1, "org.checkerframework.checker.nullness.qual.NonNull"

    invoke-direct {v12, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v13

    new-instance v13, Lva3/e;

    move-object/from16 v20, v1

    const-string v1, "edu.umd.cs.findbugs.annotations.NonNull"

    invoke-direct {v13, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v14

    new-instance v14, Lva3/e;

    move-object/from16 v21, v1

    const-string v1, "io.reactivex.annotations.NonNull"

    invoke-direct {v14, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object v1, v15

    new-instance v15, Lva3/e;

    move-object/from16 v22, v1

    const-string v1, "io.reactivex.rxjava3.annotations.NonNull"

    invoke-direct {v15, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v1, Lva3/e;

    move-object/from16 v23, v2

    const-string v2, "org.eclipse.jdt.annotation.NonNull"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v2, Lva3/e;

    move-object/from16 v24, v1

    const-string v1, "lombok.NonNull"

    invoke-direct {v2, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v1, Lva3/e;

    move-object/from16 v25, v2

    const-string v2, "jakarta.annotation.Nonnull"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v18

    move-object/from16 v26, v20

    move-object/from16 v20, v0

    move-object/from16 v18, v1

    move-object/from16 v1, v17

    move-object/from16 v0, v22

    move-object/from16 v17, v25

    move-object/from16 v22, v21

    move-object/from16 v21, v16

    move-object/from16 v16, v24

    filled-new-array/range {v4 .. v18}, [Lva3/e;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v24

    sput-object v24, Lfa3/y;->k:Ljava/util/Set;

    move-object/from16 v17, v1

    sget-object v1, Lfa3/x;->i:Lva3/e;

    const-string v4, "JETBRAINS_NULLABLE_ANNOTATION"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lva3/e;

    const-string v4, "android.annotation.Nullable"

    invoke-direct {v6, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v7, Lva3/e;

    const-string v4, "androidx.annotation.Nullable"

    invoke-direct {v7, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v8, Lva3/e;

    const-string v5, "androidx.annotation.RecentlyNullable"

    invoke-direct {v8, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v9, Lva3/e;

    invoke-direct {v9, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v10, Lva3/e;

    const-string v4, "com.android.annotations.Nullable"

    invoke-direct {v10, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v11, Lva3/e;

    const-string v4, "org.checkerframework.checker.nullness.compatqual.NullableDecl"

    invoke-direct {v11, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v12, Lva3/e;

    const-string v4, "org.checkerframework.checker.nullness.qual.Nullable"

    invoke-direct {v12, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v13, Lva3/e;

    const-string v4, "edu.umd.cs.findbugs.annotations.Nullable"

    invoke-direct {v13, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v14, Lva3/e;

    const-string v4, "edu.umd.cs.findbugs.annotations.PossiblyNull"

    invoke-direct {v14, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v15, Lva3/e;

    const-string v4, "edu.umd.cs.findbugs.annotations.CheckForNull"

    invoke-direct {v15, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v4, Lva3/e;

    const-string v5, "io.reactivex.annotations.Nullable"

    invoke-direct {v4, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Lva3/e;

    move-object/from16 v16, v1

    const-string v1, "io.reactivex.rxjava3.annotations.Nullable"

    invoke-direct {v5, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v1, Lva3/e;

    move-object/from16 v18, v2

    const-string v2, "org.eclipse.jdt.annotation.Nullable"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v2, Lva3/e;

    move-object/from16 v25, v1

    const-string v1, "jakarta.annotation.Nullable"

    invoke-direct {v2, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    move-object/from16 v27, v0

    move-object/from16 v1, v16

    move-object/from16 v28, v17

    move-object/from16 v29, v18

    move-object/from16 v0, v19

    move-object/from16 v18, v25

    move-object/from16 v19, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object/from16 v4, v21

    move-object/from16 v5, v22

    move-object/from16 v2, v23

    filled-new-array/range {v1 .. v19}, [Lva3/e;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Lfa3/y;->l:Ljava/util/Set;

    move-object/from16 v2, v29

    filled-new-array {v0, v2}, [Lva3/e;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lfa3/y;->m:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    move-object/from16 v2, v24

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    move-object/from16 v1, v27

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    move-object/from16 v1, v28

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v0

    move-object/from16 v1, v26

    invoke-static {v1, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    sget-object v0, Lfa3/x;->k:Lva3/e;

    sget-object v1, Lfa3/x;->l:Lva3/e;

    filled-new-array {v0, v1}, [Lva3/e;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lfa3/y;->n:Ljava/util/Set;

    sget-object v0, Lfa3/x;->j:Lva3/e;

    sget-object v1, Lfa3/x;->m:Lva3/e;

    filled-new-array {v0, v1}, [Lva3/e;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lfa3/y;->o:Ljava/util/Set;

    sget-object v0, Lfa3/x;->c:Lva3/e;

    sget-object v1, Lo93/m;->t:Lva3/e;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lfa3/x;->d:Lva3/e;

    sget-object v1, Lo93/m;->w:Lva3/e;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lfa3/x;->e:Lva3/e;

    sget-object v1, Lo93/m;->m:Lva3/e;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lfa3/x;->f:Lva3/e;

    sget-object v1, Lo93/m;->x:Lva3/e;

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    new-instance v0, Lva3/e;

    const-string v1, "kotlin.annotations.jvm.UnderMigration"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lfa3/y;->p:Lva3/e;

    return-void
.end method

.method public static final a()Ljava/util/Set;
    .locals 1

    sget-object v0, Lfa3/y;->j:Ljava/util/Set;

    return-object v0
.end method

.method public static final b()Ljava/util/Set;
    .locals 1

    sget-object v0, Lfa3/y;->m:Ljava/util/Set;

    return-object v0
.end method

.method public static final c()Lva3/e;
    .locals 1

    sget-object v0, Lfa3/y;->g:Lva3/e;

    return-object v0
.end method

.method public static final d()Lva3/e;
    .locals 1

    sget-object v0, Lfa3/y;->d:Lva3/e;

    return-object v0
.end method

.method public static final e()Lva3/e;
    .locals 1

    sget-object v0, Lfa3/y;->f:Lva3/e;

    return-object v0
.end method

.method public static final f()Lva3/e;
    .locals 1

    sget-object v0, Lfa3/y;->e:Lva3/e;

    return-object v0
.end method

.method public static final g()Ljava/util/Set;
    .locals 1

    sget-object v0, Lfa3/y;->k:Ljava/util/Set;

    return-object v0
.end method

.method public static final h()Ljava/util/Set;
    .locals 1

    sget-object v0, Lfa3/y;->l:Ljava/util/Set;

    return-object v0
.end method

.method public static final i()Lva3/e;
    .locals 1

    sget-object v0, Lfa3/y;->p:Lva3/e;

    return-object v0
.end method
