.class public final synthetic Lbe/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrf/l;


# direct methods
.method public synthetic constructor <init>(Lrf/l;I)V
    .locals 0

    iput p2, p0, Lbe/e;->w:I

    iput-object p1, p0, Lbe/e;->x:Lrf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbe/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbe/e;->x:Lrf/l;

    invoke-static {v0}, Le4/a;->T(Lrf/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbe/e;->x:Lrf/l;

    invoke-static {v0}, Le4/a;->T(Lrf/l;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
