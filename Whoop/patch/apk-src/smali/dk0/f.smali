.class public final synthetic Ldk0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ldk0/g;


# direct methods
.method public synthetic constructor <init>(Ldk0/g;I)V
    .locals 0

    iput p2, p0, Ldk0/f;->w:I

    iput-object p1, p0, Ldk0/f;->x:Ldk0/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ldk0/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldk0/f;->x:Ldk0/g;

    invoke-static {v0}, Ldk0/g;->U(Ldk0/g;)Loh2/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldk0/f;->x:Ldk0/g;

    invoke-static {v0}, Ldk0/g;->V(Ldk0/g;)Loh2/b$b;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ldk0/f;->x:Ldk0/g;

    invoke-static {v0}, Ldk0/g;->T(Ldk0/g;)Loh2/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
