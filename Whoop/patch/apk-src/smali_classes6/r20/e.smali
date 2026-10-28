.class public final synthetic Lr20/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(IZZ)V
    .locals 0

    iput p1, p0, Lr20/e;->w:I

    iput-boolean p2, p0, Lr20/e;->x:Z

    iput-boolean p3, p0, Lr20/e;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lr20/e;->w:I

    const v1, 0x7f14107a

    const v2, 0x7f1410f4

    const-string v3, "card"

    const-string v4, "state"

    const/4 v5, 0x0

    iget-boolean v6, p0, Lr20/e;->y:Z

    iget-boolean v7, p0, Lr20/e;->x:Z

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc0/q;

    invoke-static {v7, v6, p1}, Lyi0/d;->c(ZZLc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lc0/q;

    invoke-static {v7, v6, p1}, Lyi0/d;->j(ZZLc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1, v7, v6}, Lyi0/d;->a(IZZ)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1, v7, v6}, Lyi0/d;->f(IZZ)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lb30/b;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lb30/b;->b:Ljava/util/List;

    if-nez v7, :cond_4

    invoke-static {p1}, Lse/a;->P(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v6, :cond_1

    const p1, 0x7f14105a

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu00/f;

    if-eqz p1, :cond_2

    iget-object v5, p1, Lu00/f;->a:Ljava/lang/String;

    :cond_2
    sget-object p1, Ly00/f4;->G:Lt9/c0;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v2}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    goto :goto_0

    :cond_3
    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    :cond_4
    :goto_0
    return-object v5

    :pswitch_4
    check-cast p1, Lb30/b;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v7, :cond_8

    if-eqz v6, :cond_5

    goto :goto_1

    :cond_5
    iget-object p1, p1, Lb30/b;->b:Ljava/util/List;

    invoke-static {p1}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu00/f;

    if-eqz p1, :cond_6

    iget-object v5, p1, Lu00/f;->a:Ljava/lang/String;

    :cond_6
    sget-object p1, Ly00/f4;->G:Lt9/c0;

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {v2}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    goto :goto_1

    :cond_7
    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object v5

    :cond_8
    :goto_1
    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
