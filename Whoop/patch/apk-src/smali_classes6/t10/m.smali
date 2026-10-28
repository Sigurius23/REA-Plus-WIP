.class public final Lt10/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:Lc93/a;

.field public final synthetic w:Lf0/r1;

.field public final synthetic x:Ld30/v;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lt10/j;


# direct methods
.method public constructor <init>(Lf0/r1;Ld30/v;Lc93/a;Lt10/j;Lc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt10/m;->w:Lf0/r1;

    iput-object p2, p0, Lt10/m;->x:Ld30/v;

    iput-object p3, p0, Lt10/m;->y:Lc93/a;

    iput-object p4, p0, Lt10/m;->z:Lt10/j;

    iput-object p5, p0, Lt10/m;->E:Lc93/a;

    iput-object p6, p0, Lt10/m;->F:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p1, Lb30/w2;

    iget-object p2, p0, Lt10/m;->y:Lc93/a;

    const/16 v0, 0x1d

    iget-object v6, p0, Lt10/m;->x:Ld30/v;

    invoke-direct {p1, v0, v6, p2}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p2, -0x19a6dcd7

    invoke-static {p2, v4, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    new-instance v5, Lb1/d;

    iget-object v9, p0, Lt10/m;->F:Lc93/a;

    const/4 v10, 0x6

    iget-object v7, p0, Lt10/m;->z:Lt10/j;

    iget-object v8, p0, Lt10/m;->E:Lc93/a;

    invoke-direct/range {v5 .. v10}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p1, 0x56607008

    invoke-static {p1, v4, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v5, 0x36

    const/4 v6, 0x4

    const/4 v2, 0x0

    iget-object v3, p0, Lt10/m;->w:Lf0/r1;

    invoke-static/range {v0 .. v6}, Ldp/d;->a(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
