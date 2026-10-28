.class public final Lki/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/m;


# direct methods
.method public synthetic constructor <init>(Lbc3/m;I)V
    .locals 0

    iput p2, p0, Lki/f;->w:I

    iput-object p1, p0, Lki/f;->x:Lbc3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStart(Landroidx/lifecycle/g0;)V
    .locals 1

    iget p1, p0, Lki/f;->w:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lki/f;->x:Lbc3/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lki/f;->x:Lbc3/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
