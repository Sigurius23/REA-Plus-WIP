.class public final synthetic Lsl0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsl0/n2;


# direct methods
.method public synthetic constructor <init>(Lsl0/n2;I)V
    .locals 0

    iput p2, p0, Lsl0/c;->w:I

    iput-object p1, p0, Lsl0/c;->x:Lsl0/n2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsl0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/c;->x:Lsl0/n2;

    invoke-static {v0}, Lsl0/d2;->g(Lsl0/n2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/c;->x:Lsl0/n2;

    invoke-static {v0}, Lsl0/d2;->b(Lsl0/n2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsl0/c;->x:Lsl0/n2;

    invoke-static {v0}, Lsl0/i;->f(Lsl0/n2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
