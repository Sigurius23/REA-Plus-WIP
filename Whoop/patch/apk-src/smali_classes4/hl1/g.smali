.class public final synthetic Lhl1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Luf3/a;


# direct methods
.method public synthetic constructor <init>(Luf3/a;I)V
    .locals 0

    iput p2, p0, Lhl1/g;->w:I

    iput-object p1, p0, Lhl1/g;->x:Luf3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhl1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhl1/g;->x:Luf3/a;

    invoke-static {v0}, Lhl1/h;->n(Luf3/a;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhl1/g;->x:Luf3/a;

    invoke-static {v0}, Lhl1/h;->s(Luf3/a;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
