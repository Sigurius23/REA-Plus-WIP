.class public final Lh00/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lc93/a;

.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/z;->w:Lc93/a;

    iput-object p2, p0, Lh00/z;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lh00/z;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lh00/z;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lh00/z;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh00/z;->F:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p3, "$this$composable"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh00/z;->w:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ld00/l;

    if-nez v0, :cond_0

    iget-object p1, p0, Lh00/z;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {}, Ltx/f;->p()Lwz/o;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v5, p0, Lh00/z;->F:Lc93/a;

    const/4 v7, 0x0

    iget-object v1, p0, Lh00/z;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lh00/z;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lh00/z;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lh00/z;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v7}, Ltx/f;->o(Ld00/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
