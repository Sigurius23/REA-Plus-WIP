.class public final Lgs/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lgs/b0;

.field public static final d:Lgs/b0;

.field public static final e:Lgs/b0;

.field public static final f:Lgs/b0;

.field public static final g:Lgs/b0;

.field public static final h:Lgs/b0;

.field public static final i:Lgs/b0;

.field public static final j:Lgs/b0;

.field public static final k:Lgs/b0;

.field public static final l:Lgs/b0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lgs/b0;

    const-string v1, "TINK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->c:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->d:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "ASSUME_AES_GCM"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->e:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "ASSUME_XCHACHA20POLY1305"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->f:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "ASSUME_CHACHA20POLY1305"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->g:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "ASSUME_AES_CTR_HMAC"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->h:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "ASSUME_AES_EAX"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->i:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "ASSUME_AES_GCM_SIV"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->j:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "TINK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->k:Lgs/b0;

    new-instance v0, Lgs/b0;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1, v2}, Lgs/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgs/b0;->l:Lgs/b0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lgs/b0;->a:I

    iput-object p1, p0, Lgs/b0;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lgs/b0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgs/b0;->b:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lgs/b0;->b:Ljava/lang/String;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lgs/b0;->b:Ljava/lang/String;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
