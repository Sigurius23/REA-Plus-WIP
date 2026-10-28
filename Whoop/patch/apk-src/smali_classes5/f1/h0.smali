.class public final synthetic Lf1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/d1;


# direct methods
.method public synthetic constructor <init>(Lu0/d1;I)V
    .locals 0

    iput p2, p0, Lf1/h0;->w:I

    iput-object p1, p0, Lf1/h0;->x:Lu0/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lf1/h0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh2/b;

    iget-wide v0, p1, Lh2/b;->a:J

    iget-object p1, p0, Lf1/h0;->x:Lu0/d1;

    invoke-interface {p1, v0, v1}, Lu0/d1;->b(J)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lu2/r;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lu2/d0;->k(Lu2/r;Z)J

    move-result-wide v0

    iget-object v2, p0, Lf1/h0;->x:Lu0/d1;

    invoke-interface {v2, v0, v1}, Lu0/d1;->d(J)V

    invoke-virtual {p1}, Lu2/r;->a()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
