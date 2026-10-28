.class final Lt81/l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt81/l;->q(Lt81/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic H:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic w:Lt81/r;

.field final synthetic x:Lf0/r1;

.field final synthetic y:Lp1/z0;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt81/r;",
            "Lf0/r1;",
            "Lp1/z0;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lt81/l$c;->w:Lt81/r;

    iput-object p2, p0, Lt81/l$c;->x:Lf0/r1;

    iput-object p3, p0, Lt81/l$c;->y:Lp1/z0;

    iput-object p4, p0, Lt81/l$c;->z:Lp1/c1;

    iput-object p5, p0, Lt81/l$c;->E:Lp1/c1;

    iput-object p6, p0, Lt81/l$c;->F:Lp1/c1;

    iput-object p7, p0, Lt81/l$c;->G:Lp1/c1;

    iput-object p8, p0, Lt81/l$c;->H:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lu81/d;Lu81/b;ZZ)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lt81/l$c;->d(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lu81/d;Lu81/b;ZZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lt81/l$c;->c(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 9

    invoke-static {p2}, Lt81/l;->V(Lp1/z0;)F

    move-result p2

    iget-object p1, p1, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {p1}, Lp1/h1;->x()I

    move-result p1

    move-object/from16 v0, p8

    iget-wide v0, v0, Lh2/b;->a:J

    new-instance v2, Lt81/o;

    const/4 v8, 0x0

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v2 .. v8}, Lt81/o;-><init>(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;I)V

    move p3, p1

    move-wide p4, v0

    move-object p6, v2

    move-object p1, p0

    invoke-static/range {p1 .. p6}, Lu81/a;->a(Lt81/r;FIJLc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lu81/d;Lu81/b;ZZ)Ll83/a0;
    .locals 1

    const-string v0, "newZoomTargets"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newScrollTargets"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p5}, Lt81/l;->Z(Lp1/c1;Lu81/d;)V

    invoke-static {p1, p6}, Lt81/l;->b0(Lp1/c1;Lu81/b;)V

    invoke-static {p2, p7}, Lt81/l;->U(Lp1/c1;Z)V

    invoke-static {p3, p8}, Lt81/l;->T(Lp1/c1;Z)V

    const/4 p0, 0x1

    invoke-static {p4, p0}, Lt81/l;->W(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v2, v0, Lt81/l$c;->w:Lt81/r;

    iget-object v3, v0, Lt81/l$c;->x:Lf0/r1;

    iget-object v4, v0, Lt81/l$c;->y:Lp1/z0;

    iget-object v5, v0, Lt81/l$c;->z:Lp1/c1;

    iget-object v6, v0, Lt81/l$c;->E:Lp1/c1;

    iget-object v7, v0, Lt81/l$c;->F:Lp1/c1;

    iget-object v8, v0, Lt81/l$c;->G:Lp1/c1;

    iget-object v9, v0, Lt81/l$c;->H:Lp1/c1;

    new-instance v1, Lt81/n;

    invoke-direct/range {v1 .. v9}, Lt81/n;-><init>(Lt81/r;Lf0/r1;Lp1/z0;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    const/4 v14, 0x0

    const/16 v16, 0xe

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, p1

    move-object/from16 v15, p2

    move-object v11, v1

    invoke-static/range {v10 .. v16}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lr83/a;->w:Lr83/a;

    if-ne v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
