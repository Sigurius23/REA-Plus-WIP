.class public final Lh00/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lwz/e1;

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lwz/e1;Lc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/y;->w:Lc93/a;

    iput-object p2, p0, Lh00/y;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lh00/y;->y:Lwz/e1;

    iput-object p4, p0, Lh00/y;->z:Lc93/a;

    iput-object p5, p0, Lh00/y;->E:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh00/y;->w:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld00/l;

    iget-object p2, p0, Lh00/y;->x:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_0

    invoke-static {}, Ltx/f;->p()Lwz/o;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    iget-object p4, p0, Lh00/y;->y:Lwz/e1;

    sget-object v0, Lwz/z0;->d:Lwz/z0;

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    const/high16 p4, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const/4 p4, 0x0

    :goto_0
    new-instance v0, Ld30/e1;

    iget-object v1, p0, Lh00/y;->z:Lc93/a;

    iget-object v2, p0, Lh00/y;->E:Lc93/a;

    invoke-direct {v0, p1, v1, v2, p2}, Ld30/e1;-><init>(Ld00/l;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;)V

    const p1, 0x30cf61ab

    invoke-static {p1, p3, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/16 p2, 0x30

    invoke-static {p4, p1, p3, p2}, Lvd/e;->f(FLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
