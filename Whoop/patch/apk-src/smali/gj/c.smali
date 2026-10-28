.class public final Lgj/c;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lgj/c;->w:I

    iput-object p1, p0, Lgj/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lgj/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgj/c;->x:Ljava/lang/Object;

    check-cast v0, Lkk/b;

    iget-object v1, v0, Lkk/b;->h:Ldc3/l;

    invoke-static {v1}, Lvp/c;->w(Ldc3/w;)V

    iget-object v1, v0, Lkk/b;->g:Ldc3/l;

    invoke-static {v1}, Lvp/c;->w(Ldc3/w;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lkk/b;->i:Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lgj/c;->x:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v0, v0, Lgj/d;->g:Lgj/m;

    const-string v1, "null cannot be cast to non-null type com.amplitude.android.Timeline"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lgj/m;->y:Ldc3/h;

    invoke-static {v0}, Lvp/c;->w(Ldc3/w;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
