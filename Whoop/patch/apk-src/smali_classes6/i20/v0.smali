.class public final Li20/v0;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# instance fields
.field public final E:Lec3/h2;

.field public final F:Lec3/w1;

.field public final G:Lec3/q1;

.field public final H:Lg40/d3;

.field public final I:Lg40/f3;

.field public final J:Lec3/r1;

.field public final x:Ly30/e;

.field public final y:Li20/p0;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Ly30/e;Li20/p0;Lj20/c;Landroid/app/Application;)V
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    const-string v2, "autocompleteArgs"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "eventReporter"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p4

    invoke-direct {p0, v2}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    iput-object p1, p0, Li20/v0;->x:Ly30/e;

    iput-object v0, p0, Li20/v0;->y:Li20/p0;

    const/4 v6, 0x0

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Li20/v0;->z:Lec3/h2;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Li20/v0;->E:Lec3/h2;

    const/4 p1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v6, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Li20/v0;->F:Lec3/w1;

    invoke-static {p1}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Li20/v0;->G:Lec3/q1;

    new-instance v7, Lg40/d3;

    new-array p1, v2, [Ljava/lang/Object;

    sget-object v2, Lm83/y;->w:Lm83/y;

    const v3, 0x7f140f6d

    invoke-static {v3, p1, v2}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v8

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v11

    const/4 v12, 0x0

    const/16 v13, 0x16

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v13}, Lg40/d3;-><init>(Lzy/b;IILec3/h2;ZI)V

    iput-object v7, p0, Li20/v0;->H:Lg40/d3;

    new-instance p1, Lg40/f3;

    const/4 v2, 0x6

    invoke-direct {p1, v7, v6, v6, v2}, Lg40/f3;-><init>(Lg40/l3;Ljava/lang/String;Ldo0/c;I)V

    iput-object p1, p0, Li20/v0;->I:Lg40/f3;

    iget-object v3, p1, Lg40/f3;->n:Lec3/r1;

    iput-object v3, p0, Li20/v0;->J:Lec3/r1;

    new-instance v4, Li20/q0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v5, Lhb2/c;

    invoke-direct {v5, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    const-string v2, "queryFlow"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lb2/y;

    const/16 v7, 0xf

    invoke-direct/range {v2 .. v7}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {p1, v6, v6, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance v2, Li20/o0;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v6, v4}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    invoke-static {p1, v6, v6, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, v0, Li20/p0;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    new-instance v0, Lj20/b;

    invoke-direct {v0, p1}, Lj20/b;-><init>(Ljava/lang/String;)V

    iget-object p1, v1, Lj20/c;->c:Lq83/j;

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v2, Landroidx/room/e;

    const/16 v4, 0x10

    invoke-direct {v2, v1, v0, v6, v4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, v6, v6, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Li20/o0;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3, v2}, Li20/o0;-><init>(Li20/v0;Lq83/d;I)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
