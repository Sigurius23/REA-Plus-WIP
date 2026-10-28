.class public final Lg/u;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg/z;


# direct methods
.method public synthetic constructor <init>(Lg/z;I)V
    .locals 0

    iput p2, p0, Lg/u;->w:I

    iput-object p1, p0, Lg/u;->x:Lg/z;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg/u;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg/a;

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg/u;->x:Lg/z;

    iget-object v1, v0, Lg/z;->c:Lg/t;

    if-nez v1, :cond_2

    iget-object v0, v0, Lg/z;->b:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lg/t;

    invoke-virtual {v2}, Lg/t;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lg/t;

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Lg/t;->e(Lg/a;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lg/a;

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg/u;->x:Lg/z;

    iget-object v1, v0, Lg/z;->b:Lm83/m;

    invoke-virtual {v1}, Lm83/m;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lg/t;

    invoke-virtual {v3}, Lg/t;->g()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    check-cast v2, Lg/t;

    iget-object v1, v0, Lg/z;->c:Lg/t;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lg/z;->c()V

    :cond_6
    iput-object v2, v0, Lg/z;->c:Lg/t;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p1}, Lg/t;->f(Lg/a;)V

    :cond_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
