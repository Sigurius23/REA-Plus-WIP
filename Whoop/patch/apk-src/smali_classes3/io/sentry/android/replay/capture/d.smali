.class public final synthetic Lio/sentry/android/replay/capture/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Lio/sentry/android/replay/w;

.field public final synthetic F:Lkotlin/jvm/internal/m;

.field public final synthetic G:Lio/sentry/android/replay/capture/c;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/util/Date;

.field public final synthetic z:Lio/sentry/protocol/v;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/f;JLjava/util/Date;Lio/sentry/protocol/v;Lio/sentry/android/replay/w;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/android/replay/capture/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/d;->G:Lio/sentry/android/replay/capture/c;

    iput-wide p2, p0, Lio/sentry/android/replay/capture/d;->x:J

    iput-object p4, p0, Lio/sentry/android/replay/capture/d;->y:Ljava/util/Date;

    iput-object p5, p0, Lio/sentry/android/replay/capture/d;->z:Lio/sentry/protocol/v;

    iput-object p6, p0, Lio/sentry/android/replay/capture/d;->E:Lio/sentry/android/replay/w;

    check-cast p7, Lkotlin/jvm/internal/m;

    iput-object p7, p0, Lio/sentry/android/replay/capture/d;->F:Lkotlin/jvm/internal/m;

    return-void
.end method

.method public synthetic constructor <init>(Lio/sentry/android/replay/capture/o;JLjava/util/Date;Lio/sentry/protocol/v;Lio/sentry/android/replay/w;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/sentry/android/replay/capture/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/capture/d;->G:Lio/sentry/android/replay/capture/c;

    iput-wide p2, p0, Lio/sentry/android/replay/capture/d;->x:J

    iput-object p4, p0, Lio/sentry/android/replay/capture/d;->y:Ljava/util/Date;

    iput-object p5, p0, Lio/sentry/android/replay/capture/d;->z:Lio/sentry/protocol/v;

    iput-object p6, p0, Lio/sentry/android/replay/capture/d;->E:Lio/sentry/android/replay/w;

    check-cast p7, Lkotlin/jvm/internal/m;

    iput-object p7, p0, Lio/sentry/android/replay/capture/d;->F:Lkotlin/jvm/internal/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget v0, p0, Lio/sentry/android/replay/capture/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->G:Lio/sentry/android/replay/capture/c;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/replay/capture/o;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v6

    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->E:Lio/sentry/android/replay/w;

    iget v7, v0, Lio/sentry/android/replay/w;->b:I

    iget v8, v0, Lio/sentry/android/replay/w;->a:I

    iget v9, v0, Lio/sentry/android/replay/w;->e:I

    iget v10, v0, Lio/sentry/android/replay/w;->f:I

    iget-wide v2, p0, Lio/sentry/android/replay/capture/d;->x:J

    iget-object v4, p0, Lio/sentry/android/replay/capture/d;->y:Ljava/util/Date;

    iget-object v5, p0, Lio/sentry/android/replay/capture/d;->z:Lio/sentry/protocol/v;

    invoke-static/range {v1 .. v10}, Lio/sentry/android/replay/capture/c;->f(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/v;IIIII)Lio/sentry/android/replay/capture/k;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/capture/d;->F:Lkotlin/jvm/internal/m;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->G:Lio/sentry/android/replay/capture/c;

    move-object v1, v0

    check-cast v1, Lio/sentry/android/replay/capture/f;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v6

    iget-object v0, p0, Lio/sentry/android/replay/capture/d;->E:Lio/sentry/android/replay/w;

    iget v7, v0, Lio/sentry/android/replay/w;->b:I

    iget v8, v0, Lio/sentry/android/replay/w;->a:I

    iget v9, v0, Lio/sentry/android/replay/w;->e:I

    iget v10, v0, Lio/sentry/android/replay/w;->f:I

    iget-wide v2, p0, Lio/sentry/android/replay/capture/d;->x:J

    iget-object v4, p0, Lio/sentry/android/replay/capture/d;->y:Ljava/util/Date;

    iget-object v5, p0, Lio/sentry/android/replay/capture/d;->z:Lio/sentry/protocol/v;

    invoke-static/range {v1 .. v10}, Lio/sentry/android/replay/capture/c;->f(Lio/sentry/android/replay/capture/c;JLjava/util/Date;Lio/sentry/protocol/v;IIIII)Lio/sentry/android/replay/capture/k;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/capture/d;->F:Lkotlin/jvm/internal/m;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
