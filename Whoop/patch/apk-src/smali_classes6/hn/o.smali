.class public final synthetic Lhn/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhn/t;


# static fields
.field public static final x:Lhn/o;


# instance fields
.field public final synthetic w:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhn/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhn/o;-><init>(I)V

    sput-object v0, Lhn/o;->x:Lhn/o;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lhn/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, Lhn/o;->w:I

    check-cast p1, Lhn/l;

    packed-switch v0, :pswitch_data_0

    iget-object p1, p1, Lhn/l;->a:Ljava/lang/String;

    const-string v0, "OMX.google"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object p1, p1, Lhn/l;->a:Ljava/lang/String;

    const-string v0, "OMX.google"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "c2.android"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget v0, Llo/y;->a:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.MTK.AUDIO.DECODER.RAW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, -0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
