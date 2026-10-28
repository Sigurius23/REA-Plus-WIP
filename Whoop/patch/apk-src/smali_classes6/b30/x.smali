.class public final Lb30/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Z

.field public final synthetic x:Lb30/q;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(ZLb30/q;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/x;->w:Z

    iput-object p2, p0, Lb30/x;->x:Lb30/q;

    iput-object p3, p0, Lb30/x;->y:Ljava/lang/Object;

    iput-object p4, p0, Lb30/x;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lb30/x;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

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
    iget-boolean p2, p0, Lb30/x;->w:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    check-cast p1, Lp1/q;

    const p2, 0x216134e9

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    iget-object p2, p0, Lb30/x;->y:Ljava/lang/Object;

    iget-object v1, p0, Lb30/x;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lb30/x;->x:Lb30/q;

    invoke-static {v2, p2, v1, p1, v0}, Lse/h;->d(Lb30/q;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, 0x2164f4f1

    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    sget-object v5, Lb2/e;->E:Lb2/m;

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/16 v8, 0xdb0

    iget v3, p0, Lb30/x;->E:I

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Ldc/a;->j(ILi2/y;Lb2/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
