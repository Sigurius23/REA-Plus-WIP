.class public final Lp00/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lp00/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp00/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp00/c;->w:Lp00/c;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v9

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
    const/16 p1, 0x10

    int-to-float p1, p1

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 p1, 0x18

    int-to-float p1, p1

    invoke-static {p1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    move-object p1, v9

    check-cast p1, Lp1/q;

    const p2, -0x1a6f7841

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg00/b;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    iget-wide v2, p2, Lg00/b;->b:J

    sget-object v8, Lp00/d;->c:Lx1/b;

    const v10, 0x180006

    const/16 v11, 0x38

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v11}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
