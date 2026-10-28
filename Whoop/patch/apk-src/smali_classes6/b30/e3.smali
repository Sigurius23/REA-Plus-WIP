.class public final Lb30/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic w:Lb3/x2;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lb3/x2;Lc93/a;ZZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb30/e3;->w:Lb3/x2;

    iput-object p2, p0, Lb30/e3;->x:Lc93/a;

    iput-boolean p3, p0, Lb30/e3;->y:Z

    iput-boolean p4, p0, Lb30/e3;->z:Z

    iput-wide p5, p0, Lb30/e3;->E:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p2, Lb2/t;->w:Lb2/t;

    const-string v0, "SHEET_NAVIGATION_BUTTON_TAG"

    invoke-static {p2, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x64f7fbe2

    invoke-virtual {v5, p1}, Lp1/q;->e0(I)V

    iget-object p1, p0, Lb30/e3;->w:Lb3/x2;

    invoke-virtual {v5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, Lb30/e3;->x:Lc93/a;

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_2

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v1, p2, :cond_3

    :cond_2
    new-instance v1, Lb30/c3;

    invoke-direct {v1, p1, v0}, Lb30/c3;-><init>(Lb3/x2;Lc93/a;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lc93/a;

    const/4 p1, 0x0

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    new-instance p1, Lb30/d3;

    iget-boolean p2, p0, Lb30/e3;->z:Z

    iget-wide v3, p0, Lb30/e3;->E:J

    invoke-direct {p1, p2, v3, v4}, Lb30/d3;-><init>(ZJ)V

    const p2, 0x38b83cd2

    invoke-static {p2, v5, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6030

    const/16 v7, 0x8

    iget-boolean v3, p0, Lb30/e3;->y:Z

    invoke-static/range {v1 .. v7}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
