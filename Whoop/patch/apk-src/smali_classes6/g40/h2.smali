.class public final synthetic Lg40/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/g0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg40/h2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll3/g;)Lq3/e0;
    .locals 6

    iget v0, p0, Lg40/h2;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 v3, v2, 0x4

    const/4 v5, 0x3

    if-ne v3, v5, :cond_0

    const/16 v3, 0x21

    if-ge v2, v3, :cond_0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_0

    :cond_1
    new-instance p1, Lq3/e0;

    new-instance v1, Ll3/g;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v1, v3, v0, v2}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v0, Lx30/f;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Lx30/f;-><init>(I)V

    invoke-direct {p1, v1, v0}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object p1

    :pswitch_0
    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v2, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    const-string v2, " - "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_1

    :cond_3
    new-instance p1, Lq3/e0;

    new-instance v1, Ll3/g;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v1, v3, v0, v2}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v0, Lx30/f;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Lx30/f;-><init>(I)V

    invoke-direct {p1, v1, v0}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object p1

    :pswitch_1
    invoke-static {p1}, Lr41/h;->a(Ll3/g;)Lq3/e0;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lq3/e0;

    sget-object v1, Lq3/q;->a:Lq3/f0;

    invoke-direct {v0, p1, v1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0

    :pswitch_3
    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    const-string v0, "+"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lq3/e0;

    new-instance v1, Ll3/g;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v1, v3, p1, v2}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance p1, Lg40/l0;

    const/4 v2, 0x3

    invoke-direct {p1, v2}, Lg40/l0;-><init>(I)V

    invoke-direct {v0, v1, p1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
