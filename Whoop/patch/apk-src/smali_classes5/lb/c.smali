.class public final synthetic Llb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/internal/debugmeta/c;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Llb/c;->w:I

    iput-object p1, p0, Llb/c;->x:Lio/sentry/internal/debugmeta/c;

    iput-object p2, p0, Llb/c;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llb/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llb/c;->x:Lio/sentry/internal/debugmeta/c;

    iget-object v1, p0, Llb/c;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/sentry/internal/debugmeta/c;->h(Ljava/lang/String;)Ltb/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llb/c;->x:Lio/sentry/internal/debugmeta/c;

    iget-object v1, p0, Llb/c;->y:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/sentry/internal/debugmeta/c;->h(Ljava/lang/String;)Ltb/a;

    move-result-object v0

    const-string v1, "PRAGMA query_only = 1"

    invoke-static {v1, v0}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
