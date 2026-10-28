.class public final Lws/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lws/v;

.field public static final c:Lws/v;

.field public static final d:Lws/v;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lws/v;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lws/v;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/v;->b:Lws/v;

    new-instance v0, Lws/v;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lws/v;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/v;->c:Lws/v;

    new-instance v0, Lws/v;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lws/v;-><init>(Ljava/lang/String;)V

    sput-object v0, Lws/v;->d:Lws/v;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lws/v;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lws/v;->a:Ljava/lang/String;

    return-object v0
.end method
