.class public final synthetic Lbt2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lit2/a;


# direct methods
.method public synthetic constructor <init>(Lit2/a;I)V
    .locals 0

    iput p2, p0, Lbt2/c;->w:I

    iput-object p1, p0, Lbt2/c;->x:Lit2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbt2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbt2/c;->x:Lit2/a;

    invoke-static {v0}, Lbt2/d;->k0(Lit2/a;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbt2/c;->x:Lit2/a;

    invoke-static {v0}, Lbt2/d;->g(Lit2/a;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
