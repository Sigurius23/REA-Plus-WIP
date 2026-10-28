.class public final Lns/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lns/c;

.field public static final c:Lns/c;

.field public static final d:Lns/c;

.field public static final e:Lns/c;

.field public static final f:Lns/c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lns/c;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lns/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/c;->b:Lns/c;

    new-instance v0, Lns/c;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lns/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/c;->c:Lns/c;

    new-instance v0, Lns/c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lns/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/c;->d:Lns/c;

    new-instance v0, Lns/c;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lns/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/c;->e:Lns/c;

    new-instance v0, Lns/c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lns/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/c;->f:Lns/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns/c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lns/c;->a:Ljava/lang/String;

    return-object v0
.end method
