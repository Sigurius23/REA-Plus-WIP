.class public final synthetic Lrh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lph0/b;


# direct methods
.method public synthetic constructor <init>(Lph0/b;I)V
    .locals 0

    iput p2, p0, Lrh0/a;->w:I

    iput-object p1, p0, Lrh0/a;->x:Lph0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrh0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrh0/a;->x:Lph0/b;

    invoke-static {v0}, Lrh0/b;->d(Lph0/b;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lrh0/a;->x:Lph0/b;

    invoke-static {v0}, Lrh0/b;->i(Lph0/b;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
