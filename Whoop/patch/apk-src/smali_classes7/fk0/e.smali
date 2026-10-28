.class public final synthetic Lfk0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfk0/f;


# direct methods
.method public synthetic constructor <init>(Lfk0/f;I)V
    .locals 0

    iput p2, p0, Lfk0/e;->w:I

    iput-object p1, p0, Lfk0/e;->x:Lfk0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfk0/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfk0/e;->x:Lfk0/f;

    invoke-static {v0}, Lfk0/f;->T(Lfk0/f;)Loh2/e;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfk0/e;->x:Lfk0/f;

    invoke-static {v0}, Lfk0/f;->R(Lfk0/f;)Loh2/b$b;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lfk0/e;->x:Lfk0/f;

    invoke-static {v0}, Lfk0/f;->S(Lfk0/f;)Loh2/c;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
