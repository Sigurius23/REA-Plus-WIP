.class public final Le1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# instance fields
.field public E:Lf1/l;

.field public final F:Landroidx/compose/ui/Modifier;

.field public final w:J

.field public final x:Lf1/a1;

.field public final y:J

.field public z:Le1/l;


# direct methods
.method public constructor <init>(JLf1/a1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le1/j;->w:J

    iput-object p3, p0, Le1/j;->x:Lf1/a1;

    iput-wide p4, p0, Le1/j;->y:J

    sget-object p4, Le1/l;->c:Le1/l;

    iput-object p4, p0, Le1/j;->z:Le1/l;

    new-instance p4, Le1/i;

    const/4 p5, 0x2

    invoke-direct {p4, p0, p5}, Le1/i;-><init>(Le1/j;I)V

    invoke-static {p1, p2, p4, p3}, Ldp/d;->l(JLe1/i;Lf1/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lu2/o;->a:Lu2/n;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p2, Lu2/q;->b:Lu2/a;

    invoke-static {p1, p2}, Lu2/d0;->i(Landroidx/compose/ui/Modifier;Lu2/a;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    iput-object p1, p0, Le1/j;->F:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    new-instance v0, Lf1/l;

    new-instance v1, Le1/i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Le1/i;-><init>(Le1/j;I)V

    new-instance v2, Le1/i;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Le1/i;-><init>(Le1/j;I)V

    iget-wide v3, p0, Le1/j;->w:J

    invoke-direct {v0, v3, v4, v1, v2}, Lf1/l;-><init>(JLe1/i;Le1/i;)V

    iget-object v1, p0, Le1/j;->x:Lf1/a1;

    check-cast v1, Lf1/b1;

    invoke-virtual {v1, v0}, Lf1/b1;->f(Lf1/l;)Lf1/l;

    iput-object v0, p0, Le1/j;->E:Lf1/l;

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Le1/j;->E:Lf1/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le1/j;->x:Lf1/a1;

    check-cast v1, Lf1/b1;

    invoke-virtual {v1, v0}, Lf1/b1;->g(Lf1/l;)V

    const/4 v0, 0x0

    iput-object v0, p0, Le1/j;->E:Lf1/l;

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Le1/j;->E:Lf1/l;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le1/j;->x:Lf1/a1;

    check-cast v1, Lf1/b1;

    invoke-virtual {v1, v0}, Lf1/b1;->g(Lf1/l;)V

    const/4 v0, 0x0

    iput-object v0, p0, Le1/j;->E:Lf1/l;

    :cond_0
    return-void
.end method
