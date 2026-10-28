.class public final Lu33/d;
.super Ls40/e0;
.source "SourceFile"


# static fields
.field public static final x:Lu33/d;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu33/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu33/d;-><init>(I)V

    sput-object v0, Lu33/d;->x:Lu33/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lu33/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lu33/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "WebSocketNotAvailable"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
