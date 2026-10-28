.class public final Lb30/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/h;->w:Z

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
    iget-boolean p1, p0, Lb30/h;->w:Z

    if-eqz p1, :cond_2

    const p2, 0x7f080807

    goto :goto_1

    :cond_2
    const p2, 0x7f0807e7

    :goto_1
    const/4 v0, 0x0

    invoke-static {p2, v5, v0}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v0

    if-eqz p1, :cond_3

    const p1, 0x7f14107b

    goto :goto_2

    :cond_3
    const p1, 0x7f140fb6

    :goto_2
    invoke-static {v5, p1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object p1

    iget-wide v3, p1, Ld40/n;->h:J

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v2, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
