.class public abstract Lj31/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001aV\u0010\u0010\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u000cH\u0080@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Lj31/m;",
        "state",
        "b",
        "(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;",
        "Lu2/v;",
        "Lu2/q;",
        "down",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onDragEnd",
        "onDragCancel",
        "Lkotlin/Function2;",
        "Lu2/r;",
        "Lh2/b;",
        "onDrag",
        "a",
        "(Lu2/v;JLc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lu2/v;JLc93/a;Lc93/a;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/v;",
            "J",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lj31/h$a;

    const/4 v6, 0x0

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lj31/h$a;-><init>(JLc93/a;Lc93/a;Lc93/m;Lq83/d;)V

    check-cast p0, Lu2/h0;

    invoke-virtual {p0, v0, p6}, Lu2/h0;->X0(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lj31/m;)Landroidx/compose/ui/Modifier;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lj31/m<",
            "*>;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj31/h$b;

    invoke-direct {v0, p1}, Lj31/h$b;-><init>(Lj31/m;)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {p1, v1, v0}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
