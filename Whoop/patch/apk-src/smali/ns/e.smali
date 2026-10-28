.class public final Lns/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lns/e;

.field public static final c:Lns/e;

.field public static final d:Lns/e;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lns/e;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lns/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/e;->b:Lns/e;

    new-instance v0, Lns/e;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lns/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/e;->c:Lns/e;

    new-instance v0, Lns/e;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lns/e;-><init>(Ljava/lang/String;)V

    sput-object v0, Lns/e;->d:Lns/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lns/e;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lns/e;->a:Ljava/lang/String;

    return-object v0
.end method
