.class public final Lec3/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/a2;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lec3/b2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lfc3/y;)Lec3/l;
    .locals 3

    iget v0, p0, Lec3/b2;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld30/o;

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-direct {v0, p1, v1, v2}, Ld30/o;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1

    :pswitch_0
    sget-object p1, Lec3/y1;->w:Lec3/y1;

    new-instance v0, La6/u;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, La6/u;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lec3/b2;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "SharingStarted.Lazily"

    return-object v0

    :pswitch_0
    const-string v0, "SharingStarted.Eagerly"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
