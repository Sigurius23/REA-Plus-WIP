.class public final synthetic La3/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, La3/e0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    iget v0, p0, La3/e0;->w:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/o0;

    check-cast p2, Lp1/o0;

    iget p1, p1, Lp1/o0;->b:I

    iget p2, p2, Lp1/o0;->b:I

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1

    :pswitch_0
    check-cast p1, Lio/sentry/l1;

    check-cast p2, Lio/sentry/l1;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v0

    invoke-interface {p2}, Lio/sentry/l1;->x()Lio/sentry/u4;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/u4;->a(Lio/sentry/u4;)I

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/e7;->x:Lio/sentry/h7;

    invoke-virtual {p1}, Lio/sentry/h7;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object p2

    iget-object p2, p2, Lio/sentry/e7;->x:Lio/sentry/h7;

    invoke-virtual {p2}, Lio/sentry/h7;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    :goto_0
    return v1

    :pswitch_1
    check-cast p1, [B

    check-cast p2, [B

    array-length v0, p1

    array-length v2, p2

    if-eq v0, v2, :cond_2

    array-length p1, p1

    array-length p2, p2

    sub-int v1, p1, p2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_1
    array-length v2, p1

    if-ge v0, v2, :cond_4

    aget-byte v2, p1, v0

    aget-byte v3, p2, v0

    if-eq v2, v3, :cond_3

    sub-int v1, v2, v3

    goto :goto_2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return v1

    :pswitch_2
    check-cast p1, La3/n0;

    check-cast p2, La3/n0;

    invoke-virtual {p1}, La3/n0;->K()F

    move-result v0

    invoke-virtual {p2}, La3/n0;->K()F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_5

    invoke-virtual {p1}, La3/n0;->H()I

    move-result p1

    invoke-virtual {p2}, La3/n0;->H()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, La3/n0;->K()F

    move-result p1

    invoke-virtual {p2}, La3/n0;->K()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    :goto_3
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
