.class final Lsl0/l2$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/l2;->W(Landroidx/compose/ui/Modifier;Ll3/g;Ll3/v0;JLandroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic x:Ll3/g;

.field final synthetic y:Lb3/b3;


# direct methods
.method public constructor <init>(Lp1/c1;Ll3/g;Lb3/b3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ll3/g;",
            "Lb3/b3;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/l2$b;->w:Lp1/c1;

    iput-object p2, p0, Lsl0/l2$b;->x:Ll3/g;

    iput-object p3, p0, Lsl0/l2$b;->y:Lb3/b3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lp1/c1;Ll3/g;Lb3/b3;Lh2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsl0/l2$b;->b(Lp1/c1;Ll3/g;Lb3/b3;Lh2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lp1/c1;Ll3/g;Lb3/b3;Lh2/b;)Ll83/a0;
    .locals 2

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll3/r0;

    if-eqz p0, :cond_0

    iget-wide v0, p3, Lh2/b;->a:J

    iget-object p0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p0, v0, v1}, Ll3/w;->g(J)I

    move-result p0

    invoke-virtual {p1, p0, p0}, Ll3/g;->b(II)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll3/e;

    if-eqz p0, :cond_0

    iget-object p1, p0, Ll3/e;->a:Ljava/lang/Object;

    iget-object p0, p0, Ll3/e;->d:Ljava/lang/String;

    const-string p3, "url"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    :try_start_0
    move-object p0, p1

    check-cast p0, Ljava/lang/String;

    check-cast p2, Lb3/e1;

    invoke-virtual {p2, p0}, Lb3/e1;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {}, Lsl0/l2;->g0()Ltr2/n;

    move-result-object p2

    invoke-static {p0}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Could not open URI: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", failed with exception "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p0, p1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final invoke(Lu2/v;Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    iget-object v0, p0, Lsl0/l2$b;->w:Lp1/c1;

    iget-object v1, p0, Lsl0/l2$b;->x:Ll3/g;

    iget-object v2, p0, Lsl0/l2$b;->y:Lb3/b3;

    new-instance v7, Lsl0/t;

    const/4 v3, 0x2

    invoke-direct {v7, v0, v1, v2, v3}, Lsl0/t;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 v9, 0x7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    move-object v8, p2

    invoke-static/range {v3 .. v9}, Lh0/o3;->e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
