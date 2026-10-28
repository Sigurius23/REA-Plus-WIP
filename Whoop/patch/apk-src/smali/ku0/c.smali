.class public final synthetic Lku0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    iput p3, p0, Lku0/c;->w:I

    iput-object p1, p0, Lku0/c;->y:Ljava/lang/Object;

    iput p2, p0, Lku0/c;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lku0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lku0/c;->y:Ljava/lang/Object;

    check-cast v0, Lyt0/f;

    iget v1, p0, Lku0/c;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lyt0/f;->j(Lyt0/f;ILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lku0/c;->y:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    check-cast p1, Lp0/i0;

    iget-object v0, v0, Ln0/u;->a:Ln0/a;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v1}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v3

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lp0/i0;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x2

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp0/i0;->a()I

    move-result v0

    :goto_1
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_2

    iget v2, p0, Lku0/c;->x:I

    add-int/2addr v2, v1

    invoke-virtual {p1, v2}, Lp0/i0;->b(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lku0/c;->y:Ljava/lang/Object;

    check-cast v0, Lku0/d;

    iget v1, p0, Lku0/c;->x:I

    check-cast p1, Ltb/a;

    invoke-static {v0, v1, p1}, Lku0/d;->d(Lku0/d;ILtb/a;)Llu0/c;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
