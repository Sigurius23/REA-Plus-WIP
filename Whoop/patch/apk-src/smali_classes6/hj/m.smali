.class public final Lhj/m;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final x:Lhj/m;

.field public static final y:Lhj/m;

.field public static final z:Lhj/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lhj/m;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhj/m;-><init>(II)V

    sput-object v0, Lhj/m;->x:Lhj/m;

    new-instance v0, Lhj/m;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhj/m;-><init>(II)V

    sput-object v0, Lhj/m;->y:Lhj/m;

    new-instance v0, Lhj/m;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhj/m;-><init>(II)V

    sput-object v0, Lhj/m;->z:Lhj/m;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lhj/m;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget p1, p0, Lhj/m;->w:I

    packed-switch p1, :pswitch_data_0

    check-cast p2, Ljava/lang/Exception;

    if-eqz p2, :cond_0

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to start nudge debug session: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p2, Ljava/lang/Exception;

    if-eqz p2, :cond_1

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to set location: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p2, Ljava/lang/Exception;

    if-eqz p2, :cond_2

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to execute nudge action: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
