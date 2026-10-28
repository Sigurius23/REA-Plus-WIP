.class public final Lz40/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lkr/e;

.field public final c:Landroid/media/AudioManager;

.field public final d:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Landroid/media/AudioFocusRequest;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lkr/e;Landroid/media/AudioManager;Landroid/media/AudioManager$OnAudioFocusChangeListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz40/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lz40/f;->b:Lkr/e;

    iput-object p3, p0, Lz40/f;->c:Landroid/media/AudioManager;

    iput-object p4, p0, Lz40/f;->d:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 6

    iget-object v0, p0, Lz40/f;->c:Landroid/media/AudioManager;

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "^SM-G(960|99)"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string v1, "compile(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "MODEL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object p1

    const-string v1, "devices"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v4

    const/16 v5, 0x16

    if-ne v4, v5, :cond_0

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->setMode(I)V

    return-void

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
