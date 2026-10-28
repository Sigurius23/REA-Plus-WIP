.class public final synthetic Lw41/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/q;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw41/z;

    check-cast p2, Landroidx/compose/ui/Modifier;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Lw41/f;

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    check-cast p6, Landroidx/compose/runtime/Composer;

    check-cast p7, Ljava/lang/Integer;

    invoke-virtual {p7}, Ljava/lang/Integer;->intValue()I

    move-result p7

    check-cast p6, Lp1/q;

    invoke-static/range {p1 .. p7}, Lw41/v;->a(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZLp1/q;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
