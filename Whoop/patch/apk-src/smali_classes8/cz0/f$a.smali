.class final Lcz0/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcz0/f;->d(Lh2/c;Lh2/c;Ld61/a;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLc93/m;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Ldz0/c;

.field final synthetic x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcz0/r;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic y:Z


# direct methods
.method public constructor <init>(Ldz0/c;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldz0/c;",
            "Ljava/util/List<",
            "+",
            "Lcz0/r;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lcz0/f$a;->w:Ldz0/c;

    iput-object p2, p0, Lcz0/f$a;->x:Ljava/util/List;

    iput-boolean p3, p0, Lcz0/f$a;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ldz0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcz0/f$a;->e(Ldz0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ldz0/c;Ljava/util/List;Lu2/v;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcz0/f$a;->d(Ldz0/c;Ljava/util/List;Lu2/v;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ldz0/c;Ljava/util/List;Lu2/v;ZLu2/r;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcz0/f$a;->f(Ldz0/c;Ljava/util/List;Lu2/v;ZLu2/r;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ldz0/c;Ljava/util/List;Lu2/v;Lh2/b;)Ll83/a0;
    .locals 2

    iget-wide v0, p3, Lh2/b;->a:J

    invoke-virtual {p0, v0, v1, p1, p2}, Ldz0/c;->d(JLjava/util/List;Lu2/v;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ldz0/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ldz0/c;->c()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ldz0/c;Ljava/util/List;Lu2/v;ZLu2/r;Lh2/b;)Ll83/a0;
    .locals 8

    const-string v0, "change"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ldz0/b;

    invoke-direct {v2, p4}, Ldz0/b;-><init>(Lu2/r;)V

    iget-wide v3, p5, Lh2/b;->a:J

    move-object v1, p0

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    invoke-virtual/range {v1 .. v7}, Ldz0/c;->b(Ldz0/b;JLjava/util/List;Lu2/v;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    iget-object v0, p0, Lcz0/f$a;->w:Ldz0/c;

    iget-object v1, p0, Lcz0/f$a;->x:Ljava/util/List;

    new-instance v3, Lcz0/c;

    invoke-direct {v3, v0, v1, p1}, Lcz0/c;-><init>(Ldz0/c;Ljava/util/List;Lu2/v;)V

    new-instance v4, Lcz0/d;

    invoke-direct {v4, v0}, Lcz0/d;-><init>(Ldz0/c;)V

    iget-boolean v2, p0, Lcz0/f$a;->y:Z

    new-instance v6, Lcz0/e;

    invoke-direct {v6, v0, v1, p1, v2}, Lcz0/e;-><init>(Ldz0/c;Ljava/util/List;Lu2/v;Z)V

    sget v0, Lh0/z0;->a:F

    new-instance v5, Lgw1/a;

    const/16 v0, 0x1b

    invoke-direct {v5, v0}, Lgw1/a;-><init>(I)V

    new-instance v2, Lh0/t0;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Lh0/t0;-><init>(Lcz0/c;Lcz0/d;Lgw1/a;Lcz0/e;Lq83/d;)V

    invoke-static {p1, v2, p2}, Lh0/q3;->g(Lu2/v;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v0
.end method
