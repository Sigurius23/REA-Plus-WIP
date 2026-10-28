.class public final Lfb3/b;
.super La2/a;
.source "SourceFile"


# instance fields
.field public final y:Lu93/o;


# direct methods
.method public constructor <init>(Lr93/b;Llb3/y;)V
    .locals 5

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, La2/a;-><init>(Llb3/y;)V

    check-cast p1, Lu93/o;

    iput-object p1, p0, Lfb3/b;->y:Lu93/o;

    return-void

    :cond_0
    const/4 p1, 0x2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver"

    const/4 v2, 0x1

    const/4 v3, 0x0

    const-string v4, "receiverType"

    aput-object v4, v0, v3

    aput-object v1, v0, v2

    const-string v1, "<init>"

    aput-object v1, v0, p1

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, La2/a;->getType()Llb3/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": Ext {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lfb3/b;->y:Lu93/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
