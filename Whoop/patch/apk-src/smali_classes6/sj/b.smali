.class public final Lsj/b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lsj/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsj/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lsj/b;->w:Lsj/b;

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

    and-int/lit8 p1, p1, 0xb

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
    invoke-static {}, Lo73/a;->C()Lo2/e;

    move-result-object v0

    move-object p1, v5

    check-cast p1, Lp1/q;

    const p2, -0x1896950d

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    sget-object p2, Luj/k;->a:Lp1/u2;

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Luj/m;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    iget-wide v3, p2, Luj/m;->p:J

    const/16 v6, 0x30

    const/4 v7, 0x4

    const-string v1, "Close"

    const/4 v2, 0x0

    invoke-static/range {v0 .. v7}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
