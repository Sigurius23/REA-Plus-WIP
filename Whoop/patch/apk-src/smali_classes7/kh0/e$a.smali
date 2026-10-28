.class final Lkh0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkh0/e;->f(Lkd1/o;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
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
.field final synthetic w:Lbc3/c0;

.field final synthetic x:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic y:Lh0/a4;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lp1/c1;",
            "Lh0/a4;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkh0/e$a;->w:Lbc3/c0;

    iput-object p2, p0, Lkh0/e$a;->x:Lp1/c1;

    iput-object p3, p0, Lkh0/e$a;->y:Lh0/a4;

    iput-object p4, p0, Lkh0/e$a;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkh0/e$a;->c(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkh0/e$a;->d(Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;Lh2/b;)Ll83/a0;
    .locals 2

    invoke-static {p1}, Lkh0/e;->r(Lp1/c1;)F

    move-result p4

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p4, p4, v0

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-lez p4, :cond_0

    new-instance p4, Lkh0/e$a$a;

    invoke-direct {p4, p2, p1, p3, v1}, Lkh0/e$a$a;-><init>(Lh0/a4;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-static {p0, v1, v1, p4, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    new-instance p1, Lkh0/e$a$b;

    invoke-direct {p1, p2, v1}, Lkh0/e$a$b;-><init>(Lh0/a4;Lq83/d;)V

    invoke-static {p0, v1, v1, p1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lh2/b;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 11
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

    iget-object v0, p0, Lkh0/e$a;->w:Lbc3/c0;

    iget-object v1, p0, Lkh0/e$a;->x:Lp1/c1;

    iget-object v2, p0, Lkh0/e$a;->y:Lh0/a4;

    iget-object v3, p0, Lkh0/e$a;->z:Lp1/c1;

    new-instance v5, Lkh0/b;

    invoke-direct {v5, v0, v1, v2, v3}, Lkh0/b;-><init>(Lbc3/c0;Lp1/c1;Lh0/a4;Lp1/c1;)V

    new-instance v8, Lkh0/c;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    const/4 v10, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    move-object v9, p2

    invoke-static/range {v4 .. v10}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
