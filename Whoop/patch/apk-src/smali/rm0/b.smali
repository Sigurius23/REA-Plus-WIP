.class public final synthetic Lrm0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu82/a;


# direct methods
.method public synthetic constructor <init>(Lu82/a;I)V
    .locals 0

    iput p2, p0, Lrm0/b;->w:I

    iput-object p1, p0, Lrm0/b;->x:Lu82/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrm0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm0/b;->x:Lu82/a;

    invoke-static {v0}, Lrm0/c;->w(Lu82/a;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrm0/b;->x:Lu82/a;

    invoke-static {v0}, Lrm0/c;->v(Lu82/a;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lrm0/b;->x:Lu82/a;

    invoke-static {v0}, Lrm0/c;->d(Lu82/a;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
