.class public final La41/l$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La41/l;->C(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x61bf9d87

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    new-instance v4, La41/m;

    new-instance v8, La41/a;

    new-instance v13, Lkd1/o$a;

    sget v0, Lgy0/a;->c:I

    invoke-direct {v13, v0}, Lkd1/o$a;-><init>(I)V

    const-string v9, "1"

    const-string v10, "\"**Advanced Labs helped me finally understand myself at a deeper level.** It changed how I train, how I rest, and how I show up every day.\""

    const-string v11, "Katherine Johnson, 28"

    const-string v12, "Member since 2017"

    invoke-direct/range {v8 .. v13}, La41/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V

    new-instance v9, La41/a;

    new-instance v14, Lkd1/o$a;

    sget v0, Lgy0/a;->b:I

    invoke-direct {v14, v0}, Lkd1/o$a;-><init>(I)V

    const-string v10, "2"

    const-string v11, "WHOOP has transformed how I approach my training and recovery. The insights are invaluable."

    const-string v12, "John Smith, 35"

    const-string v13, "Member since 2019"

    invoke-direct/range {v9 .. v14}, La41/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V

    new-instance v10, La41/a;

    new-instance v15, Lkd1/o$a;

    sget v0, Lgy0/a;->c:I

    invoke-direct {v15, v0}, Lkd1/o$a;-><init>(I)V

    const-string v11, "3"

    const-string v12, "The sleep tracking features helped me optimize my rest and improve my performance dramatically."

    const-string v13, "Sarah Williams, 42"

    const-string v14, "Member since 2018"

    invoke-direct/range {v10 .. v15}, La41/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V

    filled-new-array {v8, v9, v10}, [La41/a;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v10, "1"

    const/4 v11, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, La41/m;-><init>(Ljava/util/List;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    sget-object v0, La41/l$e;->w:La41/l$e;

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0xc06

    const/4 v9, 0x4

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    invoke-static/range {v3 .. v9}, La41/l;->s(Landroidx/compose/ui/Modifier;La41/m;Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    return-void

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, La41/l$d;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
