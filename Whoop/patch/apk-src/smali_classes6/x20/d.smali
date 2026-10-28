.class public final Lx20/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lx20/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx20/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lx20/d;->w:Lx20/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v1, Lx20/p;

    sget-object p2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 p2, 0x53

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p2, v0}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    sget-object v5, Lx20/o;->y:Lx20/o;

    const/4 v6, 0x0

    const v4, 0x7f1410ff

    invoke-direct/range {v1 .. v6}, Lx20/p;-><init>(JILx20/o;Z)V

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, 0x4e47af8a    # 8.375425E8f

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_2

    new-instance p1, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lou1/a;-><init>(I)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p1

    check-cast v2, Lc93/a;

    const/4 p1, 0x0

    invoke-virtual {v4, p1}, Lp1/q;->q(Z)V

    const/16 v5, 0x30

    const/4 v6, 0x4

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ls9/f;->j(Lx20/p;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
