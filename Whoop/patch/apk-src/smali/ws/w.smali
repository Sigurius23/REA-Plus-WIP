.class public final Lws/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lws/w;

.field public static final c:Lws/w;

.field public static final d:Lws/w;

.field public static final e:Lws/w;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lws/w;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lws/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/w;->b:Lws/w;

    new-instance v0, Lws/w;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lws/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/w;->c:Lws/w;

    new-instance v0, Lws/w;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lws/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/w;->d:Lws/w;

    new-instance v0, Lws/w;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lws/w;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/w;->e:Lws/w;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws/w;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lws/w;->a:Ljava/lang/String;

    return-object v0
.end method
