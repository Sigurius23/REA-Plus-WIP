.class public final Lb30/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:J


# direct methods
.method public constructor <init>(IJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb30/s1;->w:I

    iput-boolean p4, p0, Lb30/s1;->x:Z

    iput-wide p2, p0, Lb30/s1;->y:J

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

    goto :goto_3

    :cond_1
    :goto_0
    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget p1, p0, Lb30/s1;->w:I

    const/4 p2, 0x0

    invoke-static {p1, v5, p2}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    iget-boolean p1, p0, Lb30/s1;->x:Z

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lb30/s1;->y:J

    const v1, 0x3f19999a    # 0.6f

    invoke-static {v1, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    :goto_1
    move-wide v3, p1

    goto :goto_2

    :cond_2
    sget-wide p1, Li2/x;->n:J

    goto :goto_1

    :goto_2
    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
