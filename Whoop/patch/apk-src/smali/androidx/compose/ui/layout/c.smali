.class public abstract Landroidx/compose/ui/layout/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/g0;

.field public static final b:[Ly2/b2;

.field public static final c:La0/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, La0/g0;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, La0/g0;-><init>(I)V

    sget-object v2, Ly2/b2;->a:Ly2/a2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ly2/a2;->g:Ly2/c2;

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, La0/g0;->h(ILjava/lang/Object;)V

    sget-object v4, Ly2/a2;->f:Ly2/c2;

    const/4 v5, 0x2

    invoke-virtual {v0, v5, v4}, La0/g0;->h(ILjava/lang/Object;)V

    sget-object v6, Ly2/a2;->b:Ly2/c2;

    const/4 v7, 0x4

    invoke-virtual {v0, v7, v6}, La0/g0;->h(ILjava/lang/Object;)V

    sget-object v8, Ly2/a2;->d:Ly2/c2;

    invoke-virtual {v0, v1, v8}, La0/g0;->h(ILjava/lang/Object;)V

    sget-object v9, Ly2/a2;->h:Ly2/c2;

    const/16 v10, 0x10

    invoke-virtual {v0, v10, v9}, La0/g0;->h(ILjava/lang/Object;)V

    sget-object v11, Ly2/a2;->e:Ly2/c2;

    const/16 v12, 0x20

    invoke-virtual {v0, v12, v11}, La0/g0;->h(ILjava/lang/Object;)V

    sget-object v13, Ly2/a2;->i:Ly2/c2;

    const/16 v14, 0x40

    invoke-virtual {v0, v14, v13}, La0/g0;->h(ILjava/lang/Object;)V

    sput-object v0, Landroidx/compose/ui/layout/c;->a:La0/g0;

    const/16 v0, 0x9

    new-array v0, v0, [Ly2/b2;

    const/4 v15, 0x0

    aput-object v2, v0, v15

    aput-object v4, v0, v3

    aput-object v6, v0, v5

    const/4 v15, 0x3

    aput-object v13, v0, v15

    aput-object v9, v0, v7

    const/4 v15, 0x5

    aput-object v11, v0, v15

    const/4 v15, 0x6

    aput-object v8, v0, v15

    sget-object v15, Ly2/a2;->j:Ly2/c2;

    move/from16 v16, v1

    const/4 v1, 0x7

    aput-object v15, v0, v1

    sget-object v15, Ly2/a2;->c:Ly2/c2;

    aput-object v15, v0, v16

    sput-object v0, Landroidx/compose/ui/layout/c;->b:[Ly2/b2;

    new-instance v0, La0/g0;

    invoke-direct {v0, v1}, La0/g0;-><init>(I)V

    invoke-virtual {v0, v3, v2}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v5, v4}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v7, v6}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v10, v9}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v14, v13}, La0/g0;->h(ILjava/lang/Object;)V

    invoke-virtual {v0, v12, v11}, La0/g0;->h(ILjava/lang/Object;)V

    move/from16 v1, v16

    invoke-virtual {v0, v1, v8}, La0/g0;->h(ILjava/lang/Object;)V

    sput-object v0, Landroidx/compose/ui/layout/c;->c:La0/g0;

    return-void
.end method

.method public static final a(La3/t0;Ly2/p;JII)V
    .locals 6

    const-wide/16 v0, -0x1

    invoke-static {p2, p3, v0, v1}, Ly2/q1;->g(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x30

    ushr-long v0, p2, v0

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    long-to-int v0, v0

    int-to-float v0, v0

    const/16 v1, 0x20

    ushr-long v4, p2, v1

    and-long/2addr v4, v2

    long-to-int v1, v4

    int-to-float v1, v1

    const/16 v4, 0x10

    ushr-long v4, p2, v4

    and-long/2addr v4, v2

    long-to-int v4, v4

    sub-int/2addr p4, v4

    int-to-float p4, p4

    and-long/2addr p2, v2

    long-to-int p2, p2

    sub-int/2addr p5, p2

    int-to-float p2, p5

    invoke-virtual {p1}, Ly2/p;->b()Ly2/o;

    move-result-object p3

    invoke-virtual {p0, p3, v0}, La3/t0;->a(Ly2/o;F)V

    invoke-virtual {p1}, Ly2/p;->d()Ly2/o;

    move-result-object p3

    invoke-virtual {p0, p3, v1}, La3/t0;->a(Ly2/o;F)V

    invoke-virtual {p1}, Ly2/p;->c()Ly2/o;

    move-result-object p3

    invoke-virtual {p0, p3, p4}, La3/t0;->a(Ly2/o;F)V

    invoke-virtual {p1}, Ly2/p;->a()Ly2/o;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, La3/t0;->a(Ly2/o;F)V

    :cond_0
    return-void
.end method

.method public static final b(Ly2/q;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Landroidx/compose/ui/layout/RulerProviderModifierElement;

    invoke-direct {v0, p0}, Landroidx/compose/ui/layout/RulerProviderModifierElement;-><init>(Ly2/q;)V

    return-object v0
.end method
