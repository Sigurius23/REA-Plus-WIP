.class public final synthetic Ll80/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ll80/m;->w:I

    iput-object p1, p0, Ll80/m;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll80/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll80/m;->x:Ljava/lang/Object;

    check-cast v0, Lub/g;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    check-cast p2, Landroid/database/sqlite/SQLiteCursorDriver;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Landroid/database/sqlite/SQLiteQuery;

    new-instance p1, Landroidx/room/m1;

    invoke-static {p4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p1, p4}, Landroidx/room/m1;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    invoke-interface {v0, p1}, Lub/g;->i(Lub/f;)V

    new-instance p1, Landroid/database/sqlite/SQLiteCursor;

    invoke-direct {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll80/m;->x:Ljava/lang/Object;

    check-cast v0, Lt3/c;

    check-cast p1, Lp3/i;

    check-cast p2, Lp3/r;

    check-cast p3, Lp3/n;

    check-cast p4, Lp3/o;

    iget-object v1, v0, Lt3/c;->e:Lp3/h;

    iget p3, p3, Lp3/n;->a:I

    iget p4, p4, Lp3/o;->a:I

    check-cast v1, Lp3/j;

    invoke-virtual {v1, p1, p2, p3, p4}, Lp3/j;->b(Lp3/i;Lp3/r;II)Lp3/e0;

    move-result-object p1

    instance-of p2, p1, Lp3/d0;

    if-nez p2, :cond_0

    new-instance p2, Lq30/w0;

    iget-object p3, v0, Lt3/c;->j:Lq30/w0;

    invoke-direct {p2, p1, p3}, Lq30/w0;-><init>(Lp3/e0;Lq30/w0;)V

    iput-object p2, v0, Lt3/c;->j:Lq30/w0;

    invoke-virtual {p2}, Lq30/w0;->v()Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lp3/d0;

    iget-object p1, p1, Lp3/d0;->w:Ljava/lang/Object;

    const-string p2, "null cannot be cast to non-null type android.graphics.Typeface"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/graphics/Typeface;

    :goto_0
    return-object p1

    :pswitch_1
    iget-object v0, p0, Ll80/m;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    invoke-static {v0, p1, p2, p3, p4}, Ll80/n;->w(Lkotlin/jvm/functions/Function1;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
