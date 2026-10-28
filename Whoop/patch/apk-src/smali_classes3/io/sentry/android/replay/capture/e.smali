.class public final Lio/sentry/android/replay/capture/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/android/replay/capture/f;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/f;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/replay/capture/e;->w:I

    iput-object p1, p0, Lio/sentry/android/replay/capture/e;->x:Lio/sentry/android/replay/capture/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/android/replay/capture/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/sentry/android/replay/capture/k;

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/sentry/android/replay/capture/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->x:Lio/sentry/android/replay/capture/f;

    iget-object v1, v0, Lio/sentry/android/replay/capture/f;->v:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->h()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/c;->k(I)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lio/sentry/android/replay/capture/k;

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/sentry/android/replay/capture/i;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/replay/capture/e;->x:Lio/sentry/android/replay/capture/f;

    iget-object v1, v0, Lio/sentry/android/replay/capture/f;->v:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->h()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/capture/c;->k(I)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
