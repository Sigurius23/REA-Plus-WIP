.class public final La41/l$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La41/l;->E(Landroidx/compose/runtime/Composer;I)V
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
    .locals 14

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

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, -0x308481e1

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    new-instance v4, La41/m;

    new-instance v8, La41/a;

    new-instance v13, Lkd1/o$a;

    sget p1, Lgy0/a;->c:I

    invoke-direct {v13, p1}, Lkd1/o$a;-><init>(I)V

    const-string v9, "1"

    const-string v10, "My Advanced Labs test helped me find out I was pre-diabetic. Without Advanced Labs, it would have totally flown under the radar."

    const-string v11, "Katherine Johnson, 28"

    const-string v12, "Member since 2017"

    invoke-direct/range {v8 .. v13}, La41/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;)V

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v13}, La41/m;-><init>(Ljava/util/List;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p1, v0, :cond_1

    sget-object p1, La41/l$g;->w:La41/l$g;

    invoke-virtual {v7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v6, p1

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

    invoke-virtual {p0, p1, p2}, La41/l$f;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
