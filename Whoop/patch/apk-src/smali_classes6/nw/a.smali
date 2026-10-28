.class public final Lnw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final E:Lnw/a;

.field public static final F:Lnw/a;

.field public static final G:Lnw/a;

.field public static final H:Lnw/a;

.field public static final I:Lnw/a;

.field public static final J:Lnw/a;

.field public static final K:Lnw/a;

.field public static final y:Lnw/a;

.field public static final z:Lnw/a;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnw/a;

    const-string v1, "P-256"

    const-string v2, "secp256r1"

    invoke-direct {v0, v1, v2}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->y:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "secp256k1"

    invoke-direct {v0, v1, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->z:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v2, "P-256K"

    invoke-direct {v0, v2, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->E:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "P-384"

    const-string v2, "secp384r1"

    invoke-direct {v0, v1, v2}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->F:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "P-521"

    const-string v2, "secp521r1"

    invoke-direct {v0, v1, v2}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->G:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "Ed25519"

    invoke-direct {v0, v1, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->H:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "Ed448"

    invoke-direct {v0, v1, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->I:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "X25519"

    invoke-direct {v0, v1, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->J:Lnw/a;

    new-instance v0, Lnw/a;

    const-string v1, "X448"

    invoke-direct {v0, v1, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lnw/a;->K:Lnw/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnw/a;->w:Ljava/lang/String;

    iput-object p2, p0, Lnw/a;->x:Ljava/lang/String;

    return-void
.end method

.method public static a(Lgw/m;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lgw/m;->I:Lgw/m;

    invoke-virtual {v0, p0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lnw/a;->y:Lnw/a;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Lgw/m;->J:Lgw/m;

    invoke-virtual {v0, p0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lnw/a;->z:Lnw/a;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object v0, Lgw/m;->K:Lgw/m;

    invoke-virtual {v0, p0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lnw/a;->F:Lnw/a;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Lgw/m;->L:Lgw/m;

    invoke-virtual {v0, p0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lnw/a;->G:Lnw/a;

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object v0, Lgw/m;->P:Lgw/m;

    invoke-virtual {v0, p0}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    new-instance p0, Ljava/util/HashSet;

    sget-object v0, Lnw/a;->H:Lnw/a;

    sget-object v1, Lnw/a;->I:Lnw/a;

    filled-new-array {v0, v1}, [Lnw/a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)Lnw/a;
    .locals 2

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Lnw/a;->y:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lnw/a;->E:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lnw/a;->z:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lnw/a;->F:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, Lnw/a;->G:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, Lnw/a;->H:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, Lnw/a;->I:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, Lnw/a;->J:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, Lnw/a;->K:Lnw/a;

    iget-object v1, v0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    return-object v0

    :cond_8
    new-instance v0, Lnw/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lnw/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "The cryptographic curve string must not be null or empty"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lnw/a;

    if-eqz v0, :cond_0

    check-cast p1, Lnw/a;

    iget-object p1, p1, Lnw/a;->w:Ljava/lang/String;

    iget-object v0, p0, Lnw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lnw/a;->w:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnw/a;->w:Ljava/lang/String;

    return-object v0
.end method
