.class public final Lq00/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lq00/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq00/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq00/i;->w:Lq00/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v5

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
    const p1, 0x7f0807e4

    const/4 p2, 0x0

    invoke-static {p1, v5, p2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    const p1, 0x7f140ff4

    invoke-static {v5, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object p1, v5

    check-cast p1, Lp1/q;

    const v2, -0x1a6f7841

    invoke-virtual {p1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lg00/g;->c:Lp1/u2;

    invoke-virtual {p1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/b;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    iget-wide v3, v2, Lg00/b;->w:J

    const/16 p1, 0x18

    int-to-float p1, p1

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x180

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
