.class public final synthetic Lvn1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/o;

    check-cast p2, Lm91/n;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {p1, p2, p3, p4}, Lvn1/e;->a(Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
