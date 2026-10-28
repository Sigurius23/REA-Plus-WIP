.class public final Lmj/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lmj/g;

.field public final synthetic x:Lp1/c1;


# direct methods
.method public constructor <init>(Lmj/g;Lp1/c1;)V
    .locals 0

    iput-object p1, p0, Lmj/f;->w:Lmj/g;

    iput-object p2, p0, Lmj/f;->x:Lp1/c1;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ll0/y;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$ModalBottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lmj/f;->w:Lmj/g;

    iget-object p3, p1, Lmj/g;->a:Lcom/amplitude/android/engagement/a;

    new-instance v0, Lb2/z;

    const/16 v1, 0x11

    iget-object v2, p0, Lmj/f;->x:Lp1/c1;

    invoke-direct {v0, v1, p1, v2}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast p2, Lp1/q;

    invoke-virtual {p2, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_2

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne v1, p1, :cond_3

    :cond_2
    new-instance v1, Lmj/e;

    const/4 p1, 0x2

    invoke-direct {v1, p1, v2}, Lmj/e;-><init>(ILp1/c1;)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lc93/a;

    const/16 p1, 0x8

    invoke-static {p3, v0, v1, p2, p1}, Lx43/j;->f(Lcom/amplitude/android/engagement/a;Lb2/z;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
