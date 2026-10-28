.class public abstract Liy/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh20/h1;

.field public static final b:Lh20/i1;

.field public static final c:Lh20/l1;

.field public static final d:Lh20/w2;

.field public static final e:Lm83/y;

.field public static final f:Lm83/y;

.field public static final g:Lm83/y;

.field public static final h:Lh20/x2;

.field public static final i:Lh20/p1;

.field public static final j:Lt83/b;

.field public static final k:Lm83/y;

.field public static final l:Lh20/q3;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lh20/h1;

    sget-object v1, Lh20/v1;->L:Lh20/v1;

    sget-object v2, Lh20/v1;->M:Lh20/v1;

    sget-object v3, Lh20/c3;->z:Lh20/c3;

    sget-object v4, Lh20/l3;->z:Lh20/l3;

    new-instance v5, Lh20/y2;

    sget-object v6, Lh20/z2;->F:Lh20/z2;

    sget-object v7, Lh20/z2;->G:Lh20/z2;

    new-instance v8, Lh20/a3;

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-direct {v8, v9, v10}, Lh20/a3;-><init>(ILjava/lang/Float;)V

    new-instance v9, Lh20/b3;

    invoke-direct {v9, v10, v10}, Lh20/b3;-><init>(Ljava/lang/Integer;Ljava/lang/Float;)V

    invoke-direct {v5, v6, v7, v8, v9}, Lh20/y2;-><init>(Lh20/z2;Lh20/z2;Lh20/a3;Lh20/b3;)V

    invoke-direct/range {v0 .. v5}, Lh20/h1;-><init>(Lh20/v1;Lh20/v1;Lh20/c3;Lh20/l3;Lh20/y2;)V

    sput-object v0, Liy/a;->a:Lh20/h1;

    new-instance v0, Lh20/i1;

    invoke-direct {v0, v10, v10, v10, v10}, Lh20/i1;-><init>(Lh20/x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Liy/a;->b:Lh20/i1;

    new-instance v1, Lh20/l1;

    sget-object v2, Lh20/k1;->w:Lh20/k1;

    sget-object v5, Lh20/j1;->w:Lh20/j1;

    const/4 v6, 0x0

    sget-object v7, Lm83/a0;->w:Lm83/a0;

    move-object v3, v2

    move-object v4, v2

    invoke-direct/range {v1 .. v7}, Lh20/l1;-><init>(Lh20/k1;Lh20/k1;Lh20/k1;Lh20/j1;ZLjava/util/Set;)V

    sput-object v1, Liy/a;->c:Lh20/l1;

    move-object v12, v7

    new-instance v7, Lh20/w2;

    sget-object v8, Lh20/v2;->w:Lh20/v2;

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v9, 0x1

    invoke-direct/range {v7 .. v12}, Lh20/w2;-><init>(Lh20/v2;ZZZLjava/util/Set;)V

    sput-object v7, Liy/a;->d:Lh20/w2;

    sget-object v0, Lm83/y;->w:Lm83/y;

    sput-object v0, Liy/a;->e:Lm83/y;

    sput-object v0, Liy/a;->f:Lm83/y;

    sput-object v0, Liy/a;->g:Lm83/y;

    sget-object v1, Lh20/x2;->y:Lh20/x2;

    sput-object v1, Liy/a;->h:Lh20/x2;

    sget-object v1, Lh20/p1;->w:Lh20/p1;

    sput-object v1, Liy/a;->i:Lh20/p1;

    sget-object v1, Lh20/u1;->x:Lt83/b;

    sput-object v1, Liy/a;->j:Lt83/b;

    sput-object v0, Liy/a;->k:Lm83/y;

    new-instance v0, Lh20/q3;

    new-instance v1, Lh20/n3;

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-direct {v1, v2, v2}, Lh20/n3;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    new-instance v2, Lh20/o1;

    sget-object v3, Lh20/n1;->x:Lh20/n1;

    invoke-direct {v2, v3}, Lh20/o1;-><init>(Lh20/n1;)V

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lh20/q3;-><init>(ZLh20/n3;Lh20/o1;)V

    sput-object v0, Liy/a;->l:Lh20/q3;

    return-void
.end method
