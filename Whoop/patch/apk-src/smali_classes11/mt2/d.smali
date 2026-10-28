.class public final synthetic Lmt2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lot2/m;

.field public final synthetic y:Lnt2/c;

.field public final synthetic z:Lmt2/f;


# direct methods
.method public synthetic constructor <init>(Lot2/m;Lnt2/c;Lmt2/f;I)V
    .locals 0

    iput p4, p0, Lmt2/d;->w:I

    iput-object p1, p0, Lmt2/d;->x:Lot2/m;

    iput-object p2, p0, Lmt2/d;->y:Lnt2/c;

    iput-object p3, p0, Lmt2/d;->z:Lmt2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lmt2/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Leb/q;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lmt2/d;->x:Lot2/m;

    iget-object v2, p0, Lmt2/d;->y:Lnt2/c;

    iget-object v3, p0, Lmt2/d;->z:Lmt2/f;

    invoke-static/range {v1 .. v6}, Lmt2/e;->h(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Leb/q;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lmt2/d;->x:Lot2/m;

    iget-object v1, p0, Lmt2/d;->y:Lnt2/c;

    iget-object v2, p0, Lmt2/d;->z:Lmt2/f;

    invoke-static/range {v0 .. v5}, Lmt2/e;->a(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v3, p1

    check-cast v3, Leb/q;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lmt2/d;->x:Lot2/m;

    iget-object v1, p0, Lmt2/d;->y:Lnt2/c;

    iget-object v2, p0, Lmt2/d;->z:Lmt2/f;

    invoke-static/range {v0 .. v5}, Lmt2/e;->k(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
