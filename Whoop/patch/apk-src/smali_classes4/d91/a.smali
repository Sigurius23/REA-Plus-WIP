.class public final synthetic Ld91/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/m;


# direct methods
.method public synthetic constructor <init>(ILc93/m;)V
    .locals 0

    iput p1, p0, Ld91/a;->w:I

    iput-object p2, p0, Ld91/a;->x:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Ld91/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly1/b;

    iget-object v0, p0, Ld91/a;->x:Lc93/m;

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v4, p1, Ly1/b;->x:Ly1/f;

    if-eqz v4, :cond_1

    invoke-interface {v4, v3}, Ly1/f;->d(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "item at index "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " can\'t be saved: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Ld91/a;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lkd1/b0;->a(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Ld91/a;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Lkd1/b0;->b(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Ld91/a;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Ld91/b;->a(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Ld91/a;->x:Lc93/m;

    invoke-static {v0, p1, p2}, Ld91/b;->b(Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
