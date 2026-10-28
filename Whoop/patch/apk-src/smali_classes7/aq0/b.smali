.class public final synthetic Laq0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Laq0/q;


# direct methods
.method public synthetic constructor <init>(Laq0/q;I)V
    .locals 0

    iput p2, p0, Laq0/b;->w:I

    iput-object p1, p0, Laq0/b;->x:Laq0/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laq0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq0/b;->x:Laq0/q;

    invoke-static {v0}, Laq0/q;->l0(Laq0/q;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Laq0/b;->x:Laq0/q;

    invoke-static {v0}, Laq0/q;->h0(Laq0/q;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
