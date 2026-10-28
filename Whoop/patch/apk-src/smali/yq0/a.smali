.class public final synthetic Lyq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lyq0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyq0/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/whoop/home/domain/models/dailyoutlook/DailyOutlookTileModel;->a()Lwc3/c;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {}, Lyq0/b;->i()Ljb1/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
