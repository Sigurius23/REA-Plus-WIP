.class public final synthetic Lrr2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;I)V
    .locals 0

    iput p2, p0, Lrr2/n;->w:I

    iput-object p1, p0, Lrr2/n;->x:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrr2/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrr2/n;->x:Ljava/util/Map;

    check-cast p1, Lkb1/e;

    invoke-static {v0, p1}, Lvo1/d;->f(Ljava/util/Map;Lkb1/e;)Lqy0/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrr2/n;->x:Ljava/util/Map;

    check-cast p1, Lio/sentry/b1;

    invoke-static {v0, p1}, Lrr2/o;->v(Ljava/util/Map;Lio/sentry/b1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
