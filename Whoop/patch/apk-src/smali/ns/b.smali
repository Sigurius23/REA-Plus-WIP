.class public final Lns/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lns/b;

.field public static final c:Lns/b;

.field public static final d:Lns/b;

.field public static final e:Lns/b;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lns/b;

    const-string v1, "NIST_P256"

    invoke-direct {v0, v1}, Lns/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/b;->b:Lns/b;

    new-instance v0, Lns/b;

    const-string v1, "NIST_P384"

    invoke-direct {v0, v1}, Lns/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/b;->c:Lns/b;

    new-instance v0, Lns/b;

    const-string v1, "NIST_P521"

    invoke-direct {v0, v1}, Lns/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/b;->d:Lns/b;

    new-instance v0, Lns/b;

    const-string v1, "X25519"

    invoke-direct {v0, v1}, Lns/b;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/b;->e:Lns/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns/b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lns/b;->a:Ljava/lang/String;

    return-object v0
.end method
