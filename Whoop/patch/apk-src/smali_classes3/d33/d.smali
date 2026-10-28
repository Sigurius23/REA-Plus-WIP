.class public final Ld33/d;
.super Ld33/e;
.source "SourceFile"


# static fields
.field public static final c:Ld33/d;

.field public static final d:Ld33/d;

.field public static final e:Ld33/d;

.field public static final f:Ld33/d;

.field public static final g:Ld33/d;


# instance fields
.field public final synthetic b:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Ld33/d;

    const-string v1, "ALL_CALL_TYPES"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld33/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld33/d;->c:Ld33/d;

    new-instance v0, Ld33/d;

    const-string v1, "audio_call"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ld33/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld33/d;->d:Ld33/d;

    new-instance v0, Ld33/d;

    const-string v1, "audio_room"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ld33/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld33/d;->e:Ld33/d;

    new-instance v0, Ld33/d;

    const-string v1, "default"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ld33/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld33/d;->f:Ld33/d;

    new-instance v0, Ld33/d;

    const-string v1, "livestream"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ld33/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld33/d;->g:Ld33/d;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Ld33/d;->b:I

    invoke-direct {p0, p1}, Ld33/e;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Lj53/f;
    .locals 1

    iget v0, p0, Ld33/d;->b:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0}, Ld33/e;->a()Lj53/f;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, Lj53/d;->a:Lj53/d;

    return-object v0

    :pswitch_2
    sget-object v0, Lj53/d;->a:Lj53/d;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
