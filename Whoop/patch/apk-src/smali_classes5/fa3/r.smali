.class public abstract Lfa3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lva3/e;

.field public static final b:[Lva3/e;

.field public static final c:Lwe/o;

.field public static final d:Lfa3/s;


# direct methods
.method static constructor <clinit>()V
    .locals 27

    new-instance v0, Lva3/e;

    const-string v1, "org.jspecify.nullness"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v1, Lva3/e;

    const-string v2, "org.jspecify.annotations"

    invoke-direct {v1, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    sput-object v1, Lfa3/r;->a:Lva3/e;

    new-instance v2, Lva3/e;

    const-string v3, "io.reactivex.rxjava3.annotations"

    invoke-direct {v2, v3}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v3, Lva3/e;

    const-string v4, "org.checkerframework.checker.nullness.compatqual"

    invoke-direct {v3, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    iget-object v4, v2, Lva3/e;->a:Lva3/f;

    iget-object v4, v4, Lva3/f;->a:Ljava/lang/String;

    new-instance v5, Lva3/e;

    const-string v6, ".Nullable"

    invoke-static {v4, v6}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v6, Lva3/e;

    const-string v7, ".NonNull"

    invoke-static {v4, v7}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v6, v4}, Lva3/e;-><init>(Ljava/lang/String;)V

    filled-new-array {v5, v6}, [Lva3/e;

    move-result-object v4

    sput-object v4, Lfa3/r;->b:[Lva3/e;

    new-instance v4, Lwe/o;

    new-instance v5, Lva3/e;

    const-string v6, "org.jetbrains.annotations"

    invoke-direct {v5, v6}, Lva3/e;-><init>(Ljava/lang/String;)V

    sget-object v6, Lfa3/s;->d:Lfa3/s;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lva3/e;

    const-string v8, "androidx.annotation"

    invoke-direct {v5, v8}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lva3/e;

    const-string v9, "android.support.annotation"

    invoke-direct {v5, v9}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lva3/e;

    const-string v10, "android.annotation"

    invoke-direct {v5, v10}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lva3/e;

    const-string v11, "com.android.annotations"

    invoke-direct {v5, v11}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lva3/e;

    const-string v12, "org.eclipse.jdt.annotation"

    invoke-direct {v5, v12}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Lva3/e;

    const-string v13, "org.checkerframework.checker.nullness.qual"

    invoke-direct {v5, v13}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v13, Ll83/k;

    invoke-direct {v13, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v14, Ll83/k;

    invoke-direct {v14, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lva3/e;

    const-string v5, "javax.annotation"

    invoke-direct {v3, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v15, Ll83/k;

    invoke-direct {v15, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lva3/e;

    const-string v5, "edu.umd.cs.findbugs.annotations"

    invoke-direct {v3, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lva3/e;

    move-object/from16 v16, v5

    const-string v5, "io.reactivex.annotations"

    invoke-direct {v3, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lva3/e;

    move-object/from16 v17, v5

    const-string v5, "androidx.annotation.RecentlyNullable"

    invoke-direct {v3, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Lfa3/s;

    move-object/from16 v25, v4

    sget-object v4, Lfa3/b0;->y:Lfa3/b0;

    move-object/from16 v18, v7

    const/4 v7, 0x4

    invoke-direct {v5, v4, v7}, Lfa3/s;-><init>(Lfa3/b0;I)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lva3/e;

    const-string v5, "androidx.annotation.RecentlyNonNull"

    invoke-direct {v3, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Lfa3/s;

    move-object/from16 v20, v7

    const/4 v7, 0x4

    invoke-direct {v5, v4, v7}, Lfa3/s;-><init>(Lfa3/b0;I)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v3, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lva3/e;

    const-string v5, "lombok"

    invoke-direct {v3, v5}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Lfa3/s;

    new-instance v6, Ll83/g;

    move-object/from16 v21, v5

    const/4 v5, 0x2

    move-object/from16 v22, v7

    const/4 v7, 0x1

    move-object/from16 v23, v8

    const/4 v8, 0x0

    invoke-direct {v6, v5, v7, v8}, Ll83/g;-><init>(III)V

    sget-object v5, Lfa3/b0;->z:Lfa3/b0;

    invoke-direct {v3, v4, v6, v5}, Lfa3/s;-><init>(Lfa3/b0;Ll83/g;Lfa3/b0;)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lfa3/s;

    new-instance v3, Ll83/g;

    move-object/from16 v26, v6

    const/4 v6, 0x2

    invoke-direct {v3, v6, v7, v8}, Ll83/g;-><init>(III)V

    invoke-direct {v0, v4, v3, v5}, Lfa3/s;-><init>(Lfa3/b0;Ll83/g;Lfa3/b0;)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lfa3/s;

    new-instance v1, Ll83/g;

    const/16 v6, 0x8

    invoke-direct {v1, v7, v6, v8}, Ll83/g;-><init>(III)V

    invoke-direct {v0, v4, v1, v5}, Lfa3/s;-><init>(Lfa3/b0;Ll83/g;Lfa3/b0;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lva3/e;

    const-string v2, "jakarta.annotation"

    invoke-direct {v0, v2}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v2, Lfa3/s;

    new-instance v6, Ll83/g;

    move-object/from16 v19, v1

    const/4 v1, 0x2

    const/4 v7, 0x4

    invoke-direct {v6, v1, v7, v8}, Ll83/g;-><init>(III)V

    invoke-direct {v2, v4, v6, v5}, Lfa3/s;-><init>(Lfa3/b0;Ll83/g;Lfa3/b0;)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v24, v1

    move v0, v7

    move-object/from16 v7, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v21

    move-object/from16 v8, v23

    move-object/from16 v21, v26

    move-object/from16 v23, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v3

    filled-new-array/range {v7 .. v24}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v1

    move-object/from16 v2, v25

    invoke-direct {v2, v1}, Lwe/o;-><init>(Ljava/util/Map;)V

    sput-object v2, Lfa3/r;->c:Lwe/o;

    new-instance v1, Lfa3/s;

    invoke-direct {v1, v4, v0}, Lfa3/s;-><init>(Lfa3/b0;I)V

    sput-object v1, Lfa3/r;->d:Lfa3/s;

    return-void
.end method
