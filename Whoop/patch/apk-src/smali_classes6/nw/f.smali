.class public final Lnw/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lnw/f;

.field public static final c:Lnw/f;

.field public static final d:Lnw/f;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnw/f;

    const-string v1, "unspecified"

    invoke-direct {v0, v1}, Lnw/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/f;->b:Lnw/f;

    new-instance v0, Lnw/f;

    const-string v1, "compromised"

    invoke-direct {v0, v1}, Lnw/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/f;->c:Lnw/f;

    new-instance v0, Lnw/f;

    const-string v1, "superseded"

    invoke-direct {v0, v1}, Lnw/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnw/f;->d:Lnw/f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnw/f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lnw/f;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lnw/f;

    iget-object v0, p0, Lnw/f;->a:Ljava/lang/String;

    iget-object p1, p1, Lnw/f;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lnw/f;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnw/f;->a:Ljava/lang/String;

    return-object v0
.end method
